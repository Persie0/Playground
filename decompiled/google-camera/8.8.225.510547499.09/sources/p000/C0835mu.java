package p000;

/* JADX INFO: renamed from: mu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0835mu {

    /* JADX INFO: renamed from: a */
    public int f41612a = 0;

    /* JADX INFO: renamed from: b */
    public int f41613b = 0;

    /* JADX INFO: renamed from: c */
    public int f41614c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f41615d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public int f41616e = 0;

    /* JADX INFO: renamed from: f */
    public int f41617f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f41618g = false;

    /* JADX INFO: renamed from: h */
    public boolean f41619h = false;

    /* JADX INFO: renamed from: a */
    public final void m16938a(int i, int i2) {
        this.f41614c = i;
        this.f41615d = i2;
        this.f41619h = true;
        if (this.f41618g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f41612a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f41613b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f41612a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f41613b = i2;
        }
    }
}
