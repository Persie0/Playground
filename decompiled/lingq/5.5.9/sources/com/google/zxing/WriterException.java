package com.google.zxing;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class WriterException extends Exception {
    public WriterException() {
    }

    public WriterException(UnsupportedEncodingException unsupportedEncodingException) {
        super(unsupportedEncodingException);
    }

    public WriterException(String str) {
        super(str);
    }
}
