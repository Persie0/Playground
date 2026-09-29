package p000;

/* JADX INFO: loaded from: classes.dex */
public final class q44 {

    /* JADX INFO: renamed from: a */
    public final double f57262a;

    /* JADX INFO: renamed from: b */
    public final boolean f57263b;

    public q44(int i) {
        switch (i) {
            case 1:
                this.f57262a = 10.0d;
                this.f57263b = true;
                break;
            default:
                this.f57263b = true;
                this.f57262a = 3.0d;
                break;
        }
    }

    public q44(double d, boolean z) {
        this.f57262a = d;
        this.f57263b = z;
    }

    public q44(boolean z, double d) {
        this.f57263b = z;
        this.f57262a = d;
    }
}
