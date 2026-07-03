package com.exemple.demo.file.hash;

import com.exemple.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
