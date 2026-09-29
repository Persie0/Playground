package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends IOException {

    /* JADX INFO: renamed from: a */
    public final boolean f11817a;

    /* JADX INFO: renamed from: b */
    public final int f11818b;

    public ParserException(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f11817a = z10;
        this.f11818b = i10;
    }

    /* JADX INFO: renamed from: a */
    public static ParserException m6770a(String str, Exception exc) {
        return new ParserException(str, exc, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static ParserException m6771b(String str) {
        return new ParserException(str, null, true, 4);
    }

    /* JADX INFO: renamed from: c */
    public static ParserException m6772c(String str) {
        return new ParserException(str, null, false, 1);
    }
}
