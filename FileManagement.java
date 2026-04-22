import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManagement {
    public static void main(String[] args) throws Exception {

        // Write to a text file (try-with-resources)
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("C:\\Users\\USER\\Downloads\\madhu.txt"))) {
            bWriter.write("Hello World");
            bWriter.newLine();
            bWriter.write("Welcome to Java programming!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Read a text file line by line(try-with-resources)
        try (BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\USER\\Downloads\\madhu.txt"))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Using Files
        // Write to a text file
        try {
            java.nio.file.Files.write(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu2.txt"),
                    "Hello World using Files".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Read a text file
        try {
            String content = new String(java.nio.file.Files
                    .readAllBytes(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu2.txt")));
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // delete a file
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu2.txt"));
            System.out.println("File deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if a file exists
        try {
            boolean exists = java.nio.file.Files
                    .exists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu2.txt"));
            System.out.println("File exists: " + exists);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a directory
        try {
            java.nio.file.Files.createDirectory(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\myDirectory"));
            System.out.println("Directory created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Delete a directory
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\myDirectory"));
            System.out.println("Directory deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // List files in a directory
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads"))
                    .forEach(path -> System.out.println(path.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Copy a file
        try {
            java.nio.file.Files.copy(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu.txt"),
                    java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_copy.txt"));
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Move a file
        try {
            java.nio.file.Files.move(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_copy.txt"),
                    java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_moved.txt"));
            System.out.println("File moved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Read a file using BufferedReader and print its content
        try (BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\USER\\Downloads\\madhu.txt"))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Write to a file using BufferedWriter
        try (BufferedWriter bWriter = new BufferedWriter(new FileWriter("C:\\Users\\USER\\Downloads\\madhu3.txt"))) {
            bWriter.write("This is a new file created using BufferedWriter.");
            bWriter.newLine();
            bWriter.write("It contains multiple lines of text.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Read a file using Files and print its content
        try {
            String content = new String(java.nio.file.Files
                    .readAllBytes(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu3.txt")));
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Delete the created file
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu3.txt"));
            System.out.println("File deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the deleted file exists
        try {
            boolean exists = java.nio.file.Files
                    .exists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu3.txt"));
            System.out.println("File exists: " + exists);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create a new directory
        try {
            java.nio.file.Files.createDirectory(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\newDirectory"));
            System.out.println("Directory created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // List files in the new directory
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\newDirectory"))
                    .forEach(path -> System.out.println(path.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Delete the new directory
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\newDirectory"));
            System.out.println("Directory deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the deleted directory exists
        try {
            boolean exists = java.nio.file.Files
                    .exists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\newDirectory"));
            System.out.println("Directory exists: " + exists);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Copy a file and then delete the original
        try {
            java.nio.file.Files.copy(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu.txt"),
                    java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_copy2.txt"));
            System.out.println("File copied successfully.");
            java.nio.file.Files.delete(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu.txt"));
            System.out.println("Original file deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the original file exists after deletion
        try {
            boolean exists = java.nio.file.Files
                    .exists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu.txt"));
            System.out.println("Original file exists: " + exists);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the copied file exists
        try {
            boolean exists = java.nio.file.Files
                    .exists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_copy2.txt"));
            System.out.println("Copied file exists: " + exists);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Clean up the copied file
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_copy2.txt"));
            System.out.println("Copied file deleted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Check if the copied file exists after deletion
        try {
            boolean exists = java.nio.file.Files
                    .exists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_copy2.txt"));
            System.out.println("Copied file exists after deletion: " + exists);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final check to list all files in the Downloads directory
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads"))
                    .forEach(path -> System.out.println(path.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final check to list all directories in the Downloads directory
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads"))
                    .filter(java.nio.file.Files::isDirectory)
                    .forEach(path -> System.out.println("Directory: " + path.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final check to list all files and directories in the Downloads directory
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads"))
                    .forEach(path -> {
                        if (java.nio.file.Files.isDirectory(path)) {
                            System.out.println("Directory: " + path.getFileName());
                        } else {
                            System.out.println("File: " + path.getFileName());
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final cleanup: Delete any remaining test files
        try {
            java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu.txt"));
            java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_copy.txt"));
            java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu_moved.txt"));
            java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads\\madhu3.txt"));
            System.out.println("Cleanup completed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final check to list all files in the Downloads directory after cleanup
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads"))
                    .forEach(path -> System.out.println(path.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final check to list all directories in the Downloads directory after cleanup
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads"))
                    .filter(java.nio.file.Files::isDirectory)
                    .forEach(path -> System.out.println("Directory: " + path.getFileName()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final check to list all files and directories in the Downloads directory
        // after cleanup
        try {
            java.nio.file.Files.list(java.nio.file.Paths.get("C:\\Users\\USER\\Downloads"))
                    .forEach(path -> {
                        if (java.nio.file.Files.isDirectory(path)) {
                            System.out.println("Directory: " + path.getFileName());
                        } else {
                            System.out.println("File: " + path.getFileName());
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Final message
        System.out.println("File operations completed successfully.");

        

    }
}
