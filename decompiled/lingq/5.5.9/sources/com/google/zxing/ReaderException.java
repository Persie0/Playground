package com.google.zxing;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReaderException extends Exception {

    /* JADX INFO: renamed from: a */
    public static final boolean f16465a;

    /* JADX INFO: renamed from: b */
    public static final StackTraceElement[] f16466b;

    static {
        f16465a = System.getProperty("surefire.test.class.path") != null;
        f16466b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
