package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class AggregateException extends Exception {
    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        printStream.getClass();
        super.printStackTrace(printStream);
        throw null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        printWriter.getClass();
        super.printStackTrace(printWriter);
        throw null;
    }
}
