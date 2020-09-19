package weekend6.pd.course;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class UpperDecorator implements Decorator {
    @Override
    public void decorate(File file) {
        try {
            Path path = Paths.get(file.getAbsolutePath());
            List<String> upperList = Files.readAllLines(path).stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            Files.write(path, upperList);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
