package com.google.android.exoplayer2;

import ga.InterfaceC5731n;
import java.io.IOException;
import p150h9.C5926m0;
import p174i9.C6215e0;
import p479xa.InterfaceC10146o;

/* JADX INFO: renamed from: com.google.android.exoplayer2.y */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2536y extends C2534w.b {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.y$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo7062a();

        /* JADX INFO: renamed from: b */
        void mo7063b();
    }

    /* JADX INFO: renamed from: a */
    String mo6875a();

    /* JADX INFO: renamed from: c */
    void mo6994c();

    /* JADX INFO: renamed from: d */
    boolean mo6877d();

    /* JADX INFO: renamed from: e */
    boolean mo6879e();

    /* JADX INFO: renamed from: f */
    void mo6995f();

    /* JADX INFO: renamed from: g */
    void mo6996g(int i10, C6215e0 c6215e0);

    int getState();

    /* JADX INFO: renamed from: h */
    boolean mo6997h();

    /* JADX INFO: renamed from: i */
    void mo6998i();

    /* JADX INFO: renamed from: k */
    AbstractC2406e mo6999k();

    /* JADX INFO: renamed from: m */
    default void mo7148m(float f3, float f10) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: n */
    void mo7000n(C5926m0 c5926m0, C2416m[] c2416mArr, InterfaceC5731n interfaceC5731n, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException;

    /* JADX INFO: renamed from: p */
    void mo7151p(long j10, long j11) throws ExoPlaybackException;

    /* JADX INFO: renamed from: r */
    InterfaceC5731n mo7002r();

    /* JADX INFO: renamed from: s */
    void mo7003s() throws IOException;

    void start() throws ExoPlaybackException;

    void stop();

    /* JADX INFO: renamed from: t */
    void mo7004t(C2416m[] c2416mArr, InterfaceC5731n interfaceC5731n, long j10, long j11) throws ExoPlaybackException;

    /* JADX INFO: renamed from: u */
    long mo7005u();

    /* JADX INFO: renamed from: v */
    void mo7006v(long j10) throws ExoPlaybackException;

    /* JADX INFO: renamed from: w */
    boolean mo7007w();

    /* JADX INFO: renamed from: x */
    InterfaceC10146o mo6892x();

    /* JADX INFO: renamed from: y */
    int mo7008y();
}
