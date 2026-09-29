package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Logger;
import p338qd.C8573r0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2887w5 extends C8573r0 {

    /* JADX INFO: renamed from: Q */
    public static final Logger f14492Q = Logger.getLogger(AbstractC2887w5.class.getName());

    /* JADX INFO: renamed from: R */
    public static final boolean f14493R = C2812q8.f14403e;

    /* JADX INFO: renamed from: P */
    public C2900x5 f14494P;

    public AbstractC2887w5() {
    }

    public /* synthetic */ AbstractC2887w5(int i10) {
    }

    @Deprecated
    /* JADX INFO: renamed from: K1 */
    public static int m8331K1(int i10, InterfaceC2730k7 interfaceC2730k7, InterfaceC2876v7 interfaceC2876v7) {
        int iMo8065a = ((AbstractC2756m5) interfaceC2730k7).mo8065a(interfaceC2876v7);
        int iM8334N1 = m8334N1(i10 << 3);
        return iM8334N1 + iM8334N1 + iMo8065a;
    }

    /* JADX INFO: renamed from: L1 */
    public static int m8332L1(int i10) {
        if (i10 >= 0) {
            return m8334N1(i10);
        }
        return 10;
    }

    /* JADX INFO: renamed from: M1 */
    public static int m8333M1(String str) {
        int length;
        try {
            length = C2851t8.m8263c(str);
        } catch (zzny unused) {
            length = str.getBytes(C2849t6.f14439a).length;
        }
        return m8334N1(length) + length;
    }

    /* JADX INFO: renamed from: N1 */
    public static int m8334N1(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: O1 */
    public static int m8335O1(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    /* JADX INFO: renamed from: A1 */
    public abstract void mo8308A1(int i10, long j10) throws IOException;

    /* JADX INFO: renamed from: B1 */
    public abstract void mo8309B1(long j10) throws IOException;

    /* JADX INFO: renamed from: C1 */
    public abstract void mo8310C1(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: D1 */
    public abstract void mo8311D1(int i10) throws IOException;

    /* JADX INFO: renamed from: E1 */
    public abstract void mo8312E1(String str, int i10) throws IOException;

    /* JADX INFO: renamed from: F1 */
    public abstract void mo8313F1(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: G1 */
    public abstract void mo8314G1(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: H1 */
    public abstract void mo8315H1(int i10) throws IOException;

    /* JADX INFO: renamed from: I1 */
    public abstract void mo8316I1(int i10, long j10) throws IOException;

    /* JADX INFO: renamed from: J1 */
    public abstract void mo8317J1(long j10) throws IOException;

    /* JADX INFO: renamed from: v1 */
    public abstract void mo8320v1(byte b10) throws IOException;

    /* JADX INFO: renamed from: w1 */
    public abstract void mo8321w1(int i10, boolean z10) throws IOException;

    /* JADX INFO: renamed from: x1 */
    public abstract void mo8322x1(int i10, zzka zzkaVar) throws IOException;

    /* JADX INFO: renamed from: y1 */
    public abstract void mo8323y1(int i10, int i11) throws IOException;

    /* JADX INFO: renamed from: z1 */
    public abstract void mo8324z1(int i10) throws IOException;
}
