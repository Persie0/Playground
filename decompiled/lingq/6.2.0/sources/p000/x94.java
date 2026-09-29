package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x94 {

    /* JADX INFO: renamed from: a */
    public final int f67972a;

    /* JADX INFO: renamed from: b */
    public final int f67973b;

    /* JADX INFO: renamed from: c */
    public final qt4 f67974c;

    public x94(int i, int i2, qt4 qt4Var) {
        this.f67972a = i;
        this.f67973b = i2;
        this.f67974c = qt4Var;
        if (i < 0) {
            l54.m15814a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        l54.m15814a("size should be > 0");
    }
}
