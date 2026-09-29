package com.google.zxing;

/* JADX INFO: loaded from: classes.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: c */
    public static final FormatException f16464c;

    static {
        FormatException formatException = new FormatException();
        f16464c = formatException;
        formatException.setStackTrace(ReaderException.f16466b);
    }

    private FormatException() {
    }

    /* JADX INFO: renamed from: a */
    public static FormatException m9300a() {
        return ReaderException.f16465a ? new FormatException() : f16464c;
    }
}
