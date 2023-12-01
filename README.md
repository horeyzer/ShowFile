# TASK 1.
Please modify the first example (slide 24 or below) presented in the lecture „USING IO”, so we do not use the third try block. Closing of the stream/file should be called with a finally clause appended to the try clause responsible for reading the file (to read the file use byte streams).
![image](https://github.com/horeyzer/USING-IO_1/assets/147154747/91ea6fe3-0237-4205-b38c-60bed523ca4b)
# TASK 2.
Please modify the example from the previous task (task 1) in that waythat we no longer use the close() method explicitly.
We close the stream by using the functionality introduced in JDK7, soautomatic closing file (another name try-with-resources).
Rule: use Java IO Byte Stream system for this task, so the classes FileInputStream, FileOutputStream - more details in the lecture materials.
