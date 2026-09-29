package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f13685b = 0;

    /* JADX INFO: renamed from: a */
    public final int f13686a;

    public DataSourceException(int i10) {
        this.f13686a = i10;
    }

    public DataSourceException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.f13686a = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.f13686a = i10;
    }

    public DataSourceException(Throwable th2, int i10) {
        super(th2);
        this.f13686a = i10;
    }
}
