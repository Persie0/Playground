package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import ga.InterfaceC5731n;
import java.io.IOException;
import p150h9.C5926m0;
import p150h9.InterfaceC5924l0;
import p174i9.C6215e0;
import p290o6.C7968m;
import p479xa.C10129a;
import p479xa.InterfaceC10146o;

/* JADX INFO: renamed from: com.google.android.exoplayer2.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2406e implements InterfaceC2536y, InterfaceC5924l0 {

    /* JADX INFO: renamed from: a */
    public final int f12220a;

    /* JADX INFO: renamed from: c */
    public C5926m0 f12222c;

    /* JADX INFO: renamed from: d */
    public int f12223d;

    /* JADX INFO: renamed from: e */
    public C6215e0 f12224e;

    /* JADX INFO: renamed from: f */
    public int f12225f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5731n f12226g;

    /* JADX INFO: renamed from: h */
    public C2416m[] f12227h;

    /* JADX INFO: renamed from: i */
    public long f12228i;

    /* JADX INFO: renamed from: k */
    public boolean f12230k;

    /* JADX INFO: renamed from: l */
    public boolean f12231l;

    /* JADX INFO: renamed from: b */
    public final C7968m f12221b = new C7968m();

    /* JADX INFO: renamed from: j */
    public long f12229j = Long.MIN_VALUE;

    public AbstractC2406e(int i10) {
        this.f12220a = i10;
    }

    /* JADX INFO: renamed from: A */
    public final ExoPlaybackException m6991A(MediaCodecUtil.DecoderQueryException decoderQueryException, C2416m c2416m) {
        return m7009z(4002, c2416m, decoderQueryException, false);
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo6864B();

    /* JADX INFO: renamed from: C */
    public void mo6865C(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo6867D(boolean z10, long j10) throws ExoPlaybackException;

    /* JADX INFO: renamed from: E */
    public void mo6868E() {
    }

    /* JADX INFO: renamed from: F */
    public void mo6869F() throws ExoPlaybackException {
    }

    /* JADX INFO: renamed from: G */
    public void mo6870G() {
    }

    /* JADX INFO: renamed from: H */
    public abstract void mo6992H(C2416m[] c2416mArr, long j10, long j11) throws ExoPlaybackException;

    /* JADX INFO: renamed from: I */
    public final int m6993I(C7968m c7968m, DecoderInputBuffer decoderInputBuffer, int i10) {
        InterfaceC5731n interfaceC5731n = this.f12226g;
        interfaceC5731n.getClass();
        int iMo430h = interfaceC5731n.mo430h(c7968m, decoderInputBuffer, i10);
        if (iMo430h == -4) {
            if (decoderInputBuffer.m13269m(4)) {
                this.f12229j = Long.MIN_VALUE;
                return this.f12230k ? -4 : -3;
            }
            long j10 = decoderInputBuffer.f12118e + this.f12228i;
            decoderInputBuffer.f12118e = j10;
            this.f12229j = Math.max(this.f12229j, j10);
        } else if (iMo430h == -5) {
            C2416m c2416m = (C2416m) c7968m.f43384b;
            c2416m.getClass();
            if (c2416m.f12454K != Long.MAX_VALUE) {
                C2416m.a aVarM7125a = c2416m.m7125a();
                aVarM7125a.f12505o = c2416m.f12454K + this.f12228i;
                c7968m.f43384b = aVarM7125a.m7128a();
            }
        }
        return iMo430h;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: c */
    public final void mo6994c() {
        C10129a.m18992d(this.f12225f == 0);
        this.f12221b.m15817e();
        mo6868E();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: d */
    public boolean mo6877d() {
        return mo6997h();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: f */
    public final void mo6995f() {
        boolean z10 = true;
        if (this.f12225f != 1) {
            z10 = false;
        }
        C10129a.m18992d(z10);
        this.f12221b.m15817e();
        this.f12225f = 0;
        this.f12226g = null;
        this.f12227h = null;
        this.f12230k = false;
        mo6864B();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: g */
    public final void mo6996g(int i10, C6215e0 c6215e0) {
        this.f12223d = i10;
        this.f12224e = c6215e0;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    public final int getState() {
        return this.f12225f;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: h */
    public final boolean mo6997h() {
        return this.f12229j == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: i */
    public final void mo6998i() {
        this.f12230k = true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: k */
    public final AbstractC2406e mo6999k() {
        return this;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: n */
    public final void mo7000n(C5926m0 c5926m0, C2416m[] c2416mArr, InterfaceC5731n interfaceC5731n, long j10, boolean z10, boolean z11, long j11, long j12) throws ExoPlaybackException {
        C10129a.m18992d(this.f12225f == 0);
        this.f12222c = c5926m0;
        this.f12225f = 1;
        mo6865C(z10, z11);
        mo7004t(c2416mArr, interfaceC5731n, j11, j12);
        this.f12230k = false;
        this.f12229j = j10;
        mo6867D(z10, j10);
    }

    @Override // p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: o */
    public int mo7001o() throws ExoPlaybackException {
        return 0;
    }

    @Override // com.google.android.exoplayer2.C2534w.b
    /* JADX INFO: renamed from: q */
    public void mo6889q(int i10, Object obj) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: r */
    public final InterfaceC5731n mo7002r() {
        return this.f12226g;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: s */
    public final void mo7003s() throws IOException {
        InterfaceC5731n interfaceC5731n = this.f12226g;
        interfaceC5731n.getClass();
        interfaceC5731n.mo425c();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    public final void start() throws ExoPlaybackException {
        boolean z10 = true;
        if (this.f12225f != 1) {
            z10 = false;
        }
        C10129a.m18992d(z10);
        this.f12225f = 2;
        mo6869F();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    public final void stop() {
        C10129a.m18992d(this.f12225f == 2);
        this.f12225f = 1;
        mo6870G();
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: t */
    public final void mo7004t(C2416m[] c2416mArr, InterfaceC5731n interfaceC5731n, long j10, long j11) throws ExoPlaybackException {
        C10129a.m18992d(!this.f12230k);
        this.f12226g = interfaceC5731n;
        if (this.f12229j == Long.MIN_VALUE) {
            this.f12229j = j10;
        }
        this.f12227h = c2416mArr;
        this.f12228i = j11;
        mo6992H(c2416mArr, j10, j11);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: u */
    public final long mo7005u() {
        return this.f12229j;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: v */
    public final void mo7006v(long j10) throws ExoPlaybackException {
        this.f12230k = false;
        this.f12229j = j10;
        mo6867D(false, j10);
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: w */
    public final boolean mo7007w() {
        return this.f12230k;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: x */
    public InterfaceC10146o mo6892x() {
        return null;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: y */
    public final int mo7008y() {
        return this.f12220a;
    }

    /* JADX INFO: renamed from: z */
    public final ExoPlaybackException m7009z(int i10, C2416m c2416m, Exception exc, boolean z10) {
        int iMo7144b;
        if (c2416m == null || this.f12231l) {
            iMo7144b = 4;
        } else {
            this.f12231l = true;
            try {
                iMo7144b = mo7144b(c2416m) & 7;
                this.f12231l = false;
            } catch (ExoPlaybackException unused) {
                this.f12231l = false;
                iMo7144b = 4;
            } catch (Throwable th2) {
                this.f12231l = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, exc, i10, mo6875a(), this.f12223d, c2416m, c2416m == null ? 4 : iMo7144b, z10);
    }
}
