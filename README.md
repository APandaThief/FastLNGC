compress command: java -jar -Xmx20g LNGC.jar /data/data.txt 0

decompress command: java -jar LNGC.jar /data/data.txt 1

data.txt stores the absolute path of the genome file including the reference file in first line and the file to be compressed of decompressed.

the first parameter is the absolute path.

The second parameter is 0 for compression and 1 for decompression.
