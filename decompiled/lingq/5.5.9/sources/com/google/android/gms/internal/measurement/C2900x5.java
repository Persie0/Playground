package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2900x5 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2887w5 f14506a;

    public C2900x5(C2874v5 c2874v5) {
        Charset charset = C2849t6.f14439a;
        this.f14506a = c2874v5;
        c2874v5.f14494P = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m8412a(int i10, int i11) throws IOException {
        this.f14506a.mo8314G1(i10, (i11 >> 31) ^ (i11 + i11));
    }

    /* JADX INFO: renamed from: b */
    public final void m8413b(int i10, long j10) throws IOException {
        this.f14506a.mo8316I1(i10, (j10 >> 63) ^ (j10 + j10));
    }

    /* JADX INFO: renamed from: c */
    public final void m8414c(int i10, int i11) throws IOException {
        this.f14506a.mo8314G1(i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m8415d(int i10, long j10) throws IOException {
        this.f14506a.mo8316I1(i10, j10);
    }

    /* JADX INFO: renamed from: e */
    public final void m8416e(int i10, boolean z10) throws IOException {
        this.f14506a.mo8321w1(i10, z10);
    }

    /* JADX INFO: renamed from: f */
    public final void m8417f(int i10, zzka zzkaVar) throws IOException {
        this.f14506a.mo8322x1(i10, zzkaVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m8418g(double d10, int i10) throws IOException {
        this.f14506a.mo8308A1(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: h */
    public final void m8419h(int i10, int i11) throws IOException {
        this.f14506a.mo8310C1(i10, i11);
    }

    /* JADX INFO: renamed from: i */
    public final void m8420i(int i10, int i11) throws IOException {
        this.f14506a.mo8323y1(i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public final void m8421j(int i10, long j10) throws IOException {
        this.f14506a.mo8308A1(i10, j10);
    }

    /* JADX INFO: renamed from: k */
    public final void m8422k(int i10, float f3) throws IOException {
        this.f14506a.mo8323y1(i10, Float.floatToRawIntBits(f3));
    }

    /* JADX INFO: renamed from: l */
    public final void m8423l(int i10, InterfaceC2876v7 interfaceC2876v7, Object obj) throws IOException {
        AbstractC2887w5 abstractC2887w5 = this.f14506a;
        abstractC2887w5.mo8313F1(i10, 3);
        interfaceC2876v7.mo8107c((InterfaceC2730k7) obj, abstractC2887w5.f14494P);
        abstractC2887w5.mo8313F1(i10, 4);
    }

    /* JADX INFO: renamed from: m */
    public final void m8424m(int i10, int i11) throws IOException {
        this.f14506a.mo8310C1(i10, i11);
    }

    /* JADX INFO: renamed from: n */
    public final void m8425n(int i10, long j10) throws IOException {
        this.f14506a.mo8316I1(i10, j10);
    }

    /* JADX INFO: renamed from: o */
    public final void m8426o(int i10, InterfaceC2876v7 interfaceC2876v7, Object obj) throws IOException {
        InterfaceC2730k7 interfaceC2730k7 = (InterfaceC2730k7) obj;
        C2874v5 c2874v5 = (C2874v5) this.f14506a;
        c2874v5.mo8315H1((i10 << 3) | 2);
        c2874v5.mo8315H1(((AbstractC2756m5) interfaceC2730k7).mo8065a(interfaceC2876v7));
        interfaceC2876v7.mo8107c(interfaceC2730k7, c2874v5.f14494P);
    }

    /* JADX INFO: renamed from: p */
    public final void m8427p(int i10, int i11) throws IOException {
        this.f14506a.mo8323y1(i10, i11);
    }

    /* JADX INFO: renamed from: q */
    public final void m8428q(int i10, long j10) throws IOException {
        this.f14506a.mo8308A1(i10, j10);
    }
}
