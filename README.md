# Technologies used
The code provided is written in Java and uses several technologies and libraries. Here's a breakdown of the technologies used:

Java AWT (Abstract Window Toolkit): This is the primary technology used for creating the graphical user interface (GUI) components, such as JFrame, JButton, and JFileChooser.

Swing: The code utilizes Swing, a GUI widget toolkit for Java, to create the GUI components, including JFrame, JButton, and JFileChooser.

ActionListener: The class implements the ActionListener interface, which is part of the Java Swing package. It enables handling of button clicks and other action events.

JFileChooser: It is a Swing component used to display a dialog box that allows the user to choose a file or directory. In this code, it is used to select files for compression and decompression.

Java File API: The code uses the File class from the Java File API to work with files and directories. It is used to represent the selected file for compression and decompression.

JOptionPane: It is a Swing class used to display dialog boxes for showing messages or gathering user input. In this code, it is used to show error messages if an exception occurs during compression or decompression.

Java IO: The code interacts with the file system using the Java IO classes. The compressor.method(file) method, which is not shown in the provided code snippet, likely performs file compression using IO operations.

GZIPOutputStream: The code uses the GZIPOutputStream class from java.util.zip package, which provides a stream for compressing data into a GZIP file format.

File: The code uses the File class from the java.io package to represent and manipulate file objects. It is used to specify the file path for compression and to retrieve the parent directory of the file.

Overall, the code combines various Java technologies, including AWT, Swing, Java File API, and Java IO, to create a simple GUI application for file compression and decompression.




