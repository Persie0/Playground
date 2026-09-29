package com.google.zxing;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a */
    public static final boolean f13966a;

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement[] f13967b;

    static {
        f13966a = System.getProperty("surefire.test.class.path") != null;
        f13967b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
