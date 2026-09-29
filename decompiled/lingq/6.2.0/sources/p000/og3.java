package p000;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class og3 {

    /* JADX INFO: renamed from: a */
    public final n8a f54305a;

    /* JADX INFO: renamed from: d */
    public o8a f54308d;

    /* JADX INFO: renamed from: e */
    public t72 f54309e;

    /* JADX INFO: renamed from: f */
    public int f54310f;

    /* JADX INFO: renamed from: g */
    public int f54311g;

    /* JADX INFO: renamed from: h */
    public int f54312h;

    /* JADX INFO: renamed from: i */
    public int f54313i;

    /* JADX INFO: renamed from: j */
    public final C0713b f54314j;

    /* JADX INFO: renamed from: m */
    public boolean f54317m;

    /* JADX INFO: renamed from: b */
    public final i8a f54306b = new i8a();

    /* JADX INFO: renamed from: c */
    public final k47 f54307c = new k47();

    /* JADX INFO: renamed from: k */
    public final k47 f54315k = new k47(1);

    /* JADX INFO: renamed from: l */
    public final k47 f54316l = new k47();

    public og3(n8a n8aVar, o8a o8aVar, t72 t72Var, C0713b c0713b) {
        this.f54305a = n8aVar;
        this.f54308d = o8aVar;
        this.f54309e = t72Var;
        this.f54314j = c0713b;
        this.f54308d = o8aVar;
        this.f54309e = t72Var;
        n8aVar.mo2537g(c0713b);
        m17976e();
    }

    /* JADX INFO: renamed from: a */
    public final int m17972a() {
        int i;
        if (this.f54317m) {
            i = this.f54306b.f43702j[this.f54310f] ? 1 : 0;
        } else {
            i = this.f54308d.f54021g[this.f54310f];
        }
        return m17973b() != null ? 1073741824 | i : i;
    }

    /* JADX INFO: renamed from: b */
    public final h8a m17973b() {
        if (!this.f54317m) {
            return null;
        }
        i8a i8aVar = this.f54306b;
        t72 t72Var = i8aVar.f43693a;
        String str = uma.f64080a;
        int i = t72Var.f61928a;
        h8a h8aVar = i8aVar.f43705m;
        if (h8aVar == null) {
            h8aVar = this.f54308d.f54015a.f40402l[i];
        }
        if (h8aVar == null || !h8aVar.f41995a) {
            return null;
        }
        return h8aVar;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17974c() {
        this.f54310f++;
        if (!this.f54317m) {
            return false;
        }
        int i = this.f54311g + 1;
        this.f54311g = i;
        int[] iArr = this.f54306b.f43699g;
        int i2 = this.f54312h;
        if (i != iArr[i2]) {
            return true;
        }
        this.f54312h = i2 + 1;
        this.f54311g = 0;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m17975d(int i, int i2) {
        k47 k47Var;
        h8a h8aVarM17973b = m17973b();
        if (h8aVarM17973b == null) {
            return 0;
        }
        int length = h8aVarM17973b.f41998d;
        i8a i8aVar = this.f54306b;
        if (length != 0) {
            k47Var = i8aVar.f43706n;
        } else {
            byte[] bArr = h8aVarM17973b.f41999e;
            String str = uma.f64080a;
            int length2 = bArr.length;
            k47 k47Var2 = this.f54316l;
            k47Var2.m14816K(length2, bArr);
            length = bArr.length;
            k47Var = k47Var2;
        }
        boolean z = i8aVar.f43703k && i8aVar.f43704l[this.f54310f];
        boolean z2 = z || i2 != 0;
        k47 k47Var3 = this.f54315k;
        k47Var3.f46700a[0] = (byte) ((z2 ? 128 : 0) | length);
        k47Var3.m14818M(0);
        n8a n8aVar = this.f54305a;
        n8aVar.mo2532b(k47Var3, 1, 1);
        n8aVar.mo2532b(k47Var, length, 1);
        if (!z2) {
            return length + 1;
        }
        k47 k47Var4 = this.f54307c;
        if (!z) {
            k47Var4.m14815J(8);
            byte[] bArr2 = k47Var4.f46700a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            n8aVar.mo2532b(k47Var4, 8, 1);
            return length + 9;
        }
        k47 k47Var5 = i8aVar.f43706n;
        int iM14812G = k47Var5.m14812G();
        k47Var5.m14819N(-2);
        int i3 = (iM14812G * 6) + 2;
        if (i2 != 0) {
            k47Var4.m14815J(i3);
            byte[] bArr3 = k47Var4.f46700a;
            k47Var5.m14827k(bArr3, 0, i3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            k47Var4 = k47Var5;
        }
        n8aVar.mo2532b(k47Var4, i3, 1);
        return length + 1 + i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m17976e() {
        i8a i8aVar = this.f54306b;
        i8aVar.f43696d = 0;
        i8aVar.f43708p = 0L;
        i8aVar.f43709q = false;
        i8aVar.f43703k = false;
        i8aVar.f43707o = false;
        i8aVar.f43705m = null;
        this.f54310f = 0;
        this.f54312h = 0;
        this.f54311g = 0;
        this.f54313i = 0;
        this.f54317m = false;
    }
}
