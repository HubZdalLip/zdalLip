package weekend6.pd.course;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class LowerDecorator implements Decorator {
    @Override
    public void decorate(File file) {
        try {
            Path path = Paths.get(file.getAbsolutePath());
            List<String> lowerList = Files.readAllLines(path).stream()
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
            Files.write(path, lowerList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
