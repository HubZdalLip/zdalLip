package weekend6.pd.course;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MixedCaseDecorator implements Decorator {
    @Override
    public void decorate(File file) {
        try {
            Path path = Paths.get(file.getAbsolutePath());
            List<String> modified = Files.lines(path)
                    .map(getMixedMapper())
                    .collect(Collectors.toList());
            Files.write(path, modified);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Function<String, String> getMixedMapper() {
        return s -> { // s w tym przypadku to np praca - work, czerwony - red
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0) {
                    result.append(String.valueOf(s.charAt(i)).toLowerCase());
                } else {
                    result.append(String.valueOf(s.charAt(i)).toUpperCase());
                }
            }
            return result.toString();
        };
    }

}
