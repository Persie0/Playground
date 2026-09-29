package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.ParserException;

/* JADX INFO: loaded from: classes.dex */
public class DecoderException extends Exception {
    public DecoderException(ParserException parserException) {
        super(parserException);
    }

    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(String str, Throwable th2) {
        super(str, th2);
    }
}
