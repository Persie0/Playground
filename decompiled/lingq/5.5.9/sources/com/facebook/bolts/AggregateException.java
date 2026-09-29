package com.facebook.bolts;

import dm.C5207g;
import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "facebook-bolts_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class AggregateException extends Exception {
    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        C5207g.m11111f(printStream, "err");
        super.printStackTrace(printStream);
        throw null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        C5207g.m11111f(printWriter, "err");
        super.printStackTrace(printWriter);
        throw null;
    }
}
