package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pl6 {

    /* JADX INFO: renamed from: a */
    public d16 f56407a;

    /* JADX INFO: renamed from: b */
    public int f56408b;

    /* JADX INFO: renamed from: c */
    public x66 f56409c;

    /* JADX INFO: renamed from: d */
    public x66 f56410d;

    /* JADX INFO: renamed from: e */
    public boolean f56411e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ k40 f56412f;

    public pl6(k40 k40Var, d16 d16Var, int i, x66 x66Var, x66 x66Var2, boolean z) {
        this.f56412f = k40Var;
        this.f56407a = d16Var;
        this.f56408b = i;
        this.f56409c = x66Var;
        this.f56410d = x66Var2;
        this.f56411e = z;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19385a(int i, int i2) {
        x66 x66Var = this.f56409c;
        int i3 = this.f56408b;
        c16 c16Var = (c16) x66Var.f67830a[i + i3];
        c16 c16Var2 = (c16) this.f56410d.f67830a[i3 + i2];
        return fa4.m11650l(c16Var, c16Var2) || c16Var.getClass() == c16Var2.getClass();
    }
}
