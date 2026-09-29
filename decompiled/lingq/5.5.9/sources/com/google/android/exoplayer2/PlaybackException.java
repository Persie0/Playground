package com.google.android.exoplayer2;

import p479xa.C10134c0;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception implements InterfaceC2409f {

    /* JADX INFO: renamed from: a */
    public final int f11819a;

    /* JADX INFO: renamed from: b */
    public final long f11820b;

    static {
        C10134c0.m19021F(0);
        C10134c0.m19021F(1);
        C10134c0.m19021F(2);
        C10134c0.m19021F(3);
        C10134c0.m19021F(4);
    }

    public PlaybackException(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f11819a = i10;
        this.f11820b = j10;
    }
}
