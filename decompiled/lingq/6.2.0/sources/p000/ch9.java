package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ch9 {

    /* JADX INFO: renamed from: e */
    public static final ch9 f10094e = new ch9(b2a.f7808b, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f10095a;

    /* JADX INFO: renamed from: b */
    public final b2a f10096b;

    /* JADX INFO: renamed from: c */
    public final int f10097c;

    /* JADX INFO: renamed from: d */
    public final int f10098d;

    public ch9(b2a b2aVar, int i, int i2, int i3) {
        this.f10096b = b2aVar;
        this.f10095a = i;
        this.f10097c = i2;
        this.f10098d = i3;
    }

    /* JADX INFO: renamed from: a */
    public final ch9 m4659a(int i) {
        int i2;
        b2a p79Var = this.f10096b;
        int i3 = this.f10095a;
        int i4 = this.f10098d;
        if (i3 == 4 || i3 == 2) {
            int[] iArr = us3.f64284b[i3];
            i3 = 0;
            int i5 = iArr[0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            p79Var.getClass();
            i4 += i7;
            p79Var = new p79(p79Var, i6, i7);
        }
        int i8 = this.f10097c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        int i9 = i8 + 1;
        ch9 ch9Var = new ch9(p79Var, i3, i9, i4 + i2);
        return i9 == 2078 ? ch9Var.m4660b(i + 1) : ch9Var;
    }

    /* JADX INFO: renamed from: b */
    public final ch9 m4660b(int i) {
        int i2 = this.f10097c;
        if (i2 == 0) {
            return this;
        }
        b2a b2aVar = this.f10096b;
        b2aVar.getClass();
        return new ch9(new xc0(b2aVar, i - i2, i2), this.f10095a, 0, this.f10098d);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4661c(ch9 ch9Var) {
        int i;
        int i2 = this.f10098d + (us3.f64284b[this.f10095a][ch9Var.f10095a] >> 16);
        int i3 = ch9Var.f10097c;
        if (i3 > 0 && ((i = this.f10097c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= ch9Var.f10098d;
    }

    /* JADX INFO: renamed from: d */
    public final ch9 m4662d(int i, int i2) {
        int i3 = this.f10098d;
        b2a p79Var = this.f10096b;
        int i4 = this.f10095a;
        if (i != i4) {
            int i5 = us3.f64284b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            p79Var.getClass();
            i3 += i7;
            p79Var = new p79(p79Var, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        p79Var.getClass();
        return new ch9(new p79(p79Var, i2, i8), i, 0, i3 + i8);
    }

    /* JADX INFO: renamed from: e */
    public final ch9 m4663e(int i, int i2) {
        int i3 = this.f10095a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = us3.f64286d[i3][i];
        b2a b2aVar = this.f10096b;
        b2aVar.getClass();
        return new ch9(new p79(new p79(b2aVar, i5, i4), i2, 5), i3, 0, this.f10098d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", us3.f64283a[this.f10095a], Integer.valueOf(this.f10098d), Integer.valueOf(this.f10097c));
    }
}
