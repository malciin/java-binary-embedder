# java-binary-embedder

## Usage
**Usages:** embedding fonts/images directly into your java application

Requires `python 3`

Run `py embedder.py INPUT_BINARY OUTPUT_NAME_CLASS`

#### Output:

Generates `OUTPUT_NAME_CLASS.java` file class that contains `public static InputStream Get()` method that return `INPUT_BINARY` data as `InputStream`

## Description

It's simple script that generate an java class that contains `InputStream Get()` method that returns binary data of certain file.

This script is written to avoid `Code too large` exception when we try to embedded whole binary data into single byte[] array that is larger by 64k bytes.

It creates multiple static arrays that contains portion of data and single Get method that lazy instantiate single combined byte[] array.