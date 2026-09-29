package com.google.android.exoplayer2.source;

import ga.C5736s;
import ga.InterfaceC5731n;
import java.io.IOException;
import p150h9.C5930o0;
import p454wa.InterfaceC9877b;
import p479xa.C10134c0;
import ua.InterfaceC9502k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2478f implements InterfaceC2480h, InterfaceC2480h.a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2492i.b f13103a;

    /* JADX INFO: renamed from: b */
    public final long f13104b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9877b f13105c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2492i f13106d;

    /* JADX INFO: renamed from: e */
    public InterfaceC2480h f13107e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2480h.a f13108f;

    /* JADX INFO: renamed from: g */
    public long f13109g = -9223372036854775807L;

    public C2478f(InterfaceC2492i.b bVar, InterfaceC9877b interfaceC9877b, long j10) {
        this.f13103a = bVar;
        this.f13105c = interfaceC9877b;
        this.f13104b = j10;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q.a
    /* JADX INFO: renamed from: a */
    public final void mo7091a(InterfaceC2500q interfaceC2500q) {
        InterfaceC2480h.a aVar = this.f13108f;
        int i10 = C10134c0.f51354a;
        aVar.mo7091a(this);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h.a
    /* JADX INFO: renamed from: b */
    public final void mo7093b(InterfaceC2480h interfaceC2480h) {
        InterfaceC2480h.a aVar = this.f13108f;
        int i10 = C10134c0.f51354a;
        aVar.mo7093b(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m7277c(InterfaceC2492i.b bVar) {
        long j10 = this.f13109g;
        if (j10 == -9223372036854775807L) {
            j10 = this.f13104b;
        }
        InterfaceC2492i interfaceC2492i = this.f13106d;
        interfaceC2492i.getClass();
        InterfaceC2480h interfaceC2480hCreatePeriod = interfaceC2492i.createPeriod(bVar, this.f13105c, j10);
        this.f13107e = interfaceC2480hCreatePeriod;
        if (this.f13108f != null) {
            interfaceC2480hCreatePeriod.mo7257l(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        return interfaceC2480h.mo7251d();
    }

    /* JADX INFO: renamed from: e */
    public final void m7278e() {
        if (this.f13107e != null) {
            InterfaceC2492i interfaceC2492i = this.f13106d;
            interfaceC2492i.getClass();
            interfaceC2492i.releasePeriod(this.f13107e);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: f */
    public final void mo7252f() throws IOException {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        if (interfaceC2480h != null) {
            interfaceC2480h.mo7252f();
            return;
        }
        InterfaceC2492i interfaceC2492i = this.f13106d;
        if (interfaceC2492i != null) {
            interfaceC2492i.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: g */
    public final long mo7253g(long j10) {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        return interfaceC2480h.mo7253g(j10);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        return interfaceC2480h != null && interfaceC2480h.mo7254h(j10);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        return interfaceC2480h != null && interfaceC2480h.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: j */
    public final void mo7255j(boolean z10, long j10) {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        interfaceC2480h.mo7255j(z10, j10);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: k */
    public final long mo7256k() {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        return interfaceC2480h.mo7256k();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: l */
    public final void mo7257l(InterfaceC2480h.a aVar, long j10) {
        this.f13108f = aVar;
        InterfaceC2480h interfaceC2480h = this.f13107e;
        if (interfaceC2480h != null) {
            long j11 = this.f13109g;
            if (j11 == -9223372036854775807L) {
                j11 = this.f13104b;
            }
            interfaceC2480h.mo7257l(this, j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: m */
    public final C5736s mo7258m() {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        return interfaceC2480h.mo7258m();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: n */
    public final long mo7259n(long j10, C5930o0 c5930o0) {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        return interfaceC2480h.mo7259n(j10, c5930o0);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2480h
    /* JADX INFO: renamed from: o */
    public final long mo7260o(InterfaceC9502k[] interfaceC9502kArr, boolean[] zArr, InterfaceC5731n[] interfaceC5731nArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f13109g;
        if (j12 == -9223372036854775807L || j10 != this.f13104b) {
            j11 = j10;
        } else {
            this.f13109g = -9223372036854775807L;
            j11 = j12;
        }
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        return interfaceC2480h.mo7260o(interfaceC9502kArr, zArr, interfaceC5731nArr, zArr2, j11);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        return interfaceC2480h.mo7261r();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
        InterfaceC2480h interfaceC2480h = this.f13107e;
        int i10 = C10134c0.f51354a;
        interfaceC2480h.mo7262t(j10);
    }
}
