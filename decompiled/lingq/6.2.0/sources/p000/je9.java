package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class je9 {

    /* JADX INFO: renamed from: a */
    public int f45480a;

    /* JADX INFO: renamed from: b */
    public int f45481b;

    /* JADX INFO: renamed from: c */
    public int f45482c;

    /* JADX INFO: renamed from: d */
    public Integer f45483d;

    /* JADX INFO: renamed from: e */
    public final xz7 f45484e;

    /* JADX INFO: renamed from: f */
    public boolean f45485f;

    /* JADX INFO: renamed from: g */
    public boolean f45486g;

    /* JADX INFO: renamed from: h */
    public int f45487h;

    /* JADX INFO: renamed from: i */
    public final boolean f45488i;

    /* JADX INFO: renamed from: j */
    public final boolean f45489j;

    public je9(int i, int i2, int i3, Integer num, xz7 xz7Var, int i4, boolean z, boolean z2, int i5) {
        i = (i5 & 1) != 0 ? 0 : i;
        i2 = (i5 & 2) != 0 ? 0 : i2;
        i3 = (i5 & 4) != 0 ? 0 : i3;
        num = (i5 & 8) != 0 ? null : num;
        boolean z3 = (i5 & 128) == 0;
        i4 = (i5 & 256) != 0 ? -1 : i4;
        z = (i5 & 512) != 0 ? false : z;
        z2 = (i5 & 1024) != 0 ? false : z2;
        xz7Var.getClass();
        this.f45480a = i;
        this.f45481b = i2;
        this.f45482c = i3;
        this.f45483d = num;
        this.f45484e = xz7Var;
        this.f45485f = false;
        this.f45486g = z3;
        this.f45487h = i4;
        this.f45488i = z;
        this.f45489j = z2;
    }
}
