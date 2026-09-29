package p000;

import androidx.media3.common.C0713b;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class p63 {

    /* JADX INFO: renamed from: a */
    public final int f55632a;

    /* JADX INFO: renamed from: b */
    public final int f55633b;

    /* JADX INFO: renamed from: c */
    public final int f55634c;

    /* JADX INFO: renamed from: d */
    public final int f55635d;

    /* JADX INFO: renamed from: e */
    public final int f55636e;

    /* JADX INFO: renamed from: f */
    public final int f55637f;

    /* JADX INFO: renamed from: g */
    public final int f55638g;

    /* JADX INFO: renamed from: h */
    public final int f55639h;

    /* JADX INFO: renamed from: i */
    public final int f55640i;

    /* JADX INFO: renamed from: j */
    public final long f55641j;

    /* JADX INFO: renamed from: k */
    public final p33 f55642k;

    /* JADX INFO: renamed from: l */
    public final ey5 f55643l;

    public p63(int i, byte[] bArr) {
        so0 so0Var = new so0(bArr.length, bArr);
        so0Var.m21509m(i * 8);
        this.f55632a = so0Var.m21503g(16);
        this.f55633b = so0Var.m21503g(16);
        this.f55634c = so0Var.m21503g(24);
        this.f55635d = so0Var.m21503g(24);
        int iM21503g = so0Var.m21503g(20);
        this.f55636e = iM21503g;
        this.f55637f = m18918d(iM21503g);
        this.f55638g = so0Var.m21503g(3) + 1;
        int iM21503g2 = so0Var.m21503g(5) + 1;
        this.f55639h = iM21503g2;
        this.f55640i = m18917a(iM21503g2);
        this.f55641j = so0Var.m21505i(36);
        this.f55642k = null;
        this.f55643l = null;
    }

    /* JADX INFO: renamed from: a */
    public static int m18917a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: d */
    public static int m18918d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m18919b() {
        long j = this.f55641j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f55636e);
    }

    /* JADX INFO: renamed from: c */
    public final C0713b m18920c(byte[] bArr, ey5 ey5Var) {
        bArr[4] = -128;
        int i = this.f55635d;
        if (i <= 0) {
            i = -1;
        }
        ey5 ey5Var2 = this.f55643l;
        if (ey5Var2 != null) {
            ey5Var = ey5Var2.m11387b(ey5Var);
        }
        lc3 lc3Var = new lc3();
        lc3Var.f49453n = ez5.m11402l("audio/flac");
        lc3Var.f49454o = i;
        lc3Var.f49430F = this.f55638g;
        lc3Var.f49431G = this.f55636e;
        String str = uma.f64080a;
        lc3Var.f49432H = uma.m22825t(this.f55639h, ByteOrder.LITTLE_ENDIAN);
        lc3Var.f49456q = Collections.singletonList(bArr);
        lc3Var.f49450k = ey5Var;
        return new C0713b(lc3Var);
    }

    public p63(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, p33 p33Var, ey5 ey5Var) {
        this.f55632a = i;
        this.f55633b = i2;
        this.f55634c = i3;
        this.f55635d = i4;
        this.f55636e = i5;
        this.f55637f = m18918d(i5);
        this.f55638g = i6;
        this.f55639h = i7;
        this.f55640i = m18917a(i7);
        this.f55641j = j;
        this.f55642k = p33Var;
        this.f55643l = ey5Var;
    }
}
