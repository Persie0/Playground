package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbn {

    /* JADX INFO: renamed from: a */
    public int f10393a;

    /* JADX INFO: renamed from: b */
    public int f10394b;

    /* JADX INFO: renamed from: c */
    public int f10395c;

    /* JADX INFO: renamed from: d */
    public kmq f10396d;

    /* JADX INFO: renamed from: e */
    public ikw f10397e;

    /* JADX INFO: renamed from: f */
    public boolean f10398f;

    /* JADX INFO: renamed from: g */
    public byte f10399g;

    /* JADX INFO: renamed from: h */
    public int f10400h;

    /* JADX INFO: renamed from: i */
    public int f10401i;

    /* JADX INFO: renamed from: a */
    public final void m5880a(boolean z) {
        this.f10398f = z;
        this.f10399g = (byte) (this.f10399g | 8);
    }

    /* JADX INFO: renamed from: b */
    public final void m5881b(kmq kmqVar) {
        if (kmqVar == null) {
            throw new NullPointerException("Null cameraFacing");
        }
        this.f10396d = kmqVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m5882c(int i) {
        this.f10393a = i;
        this.f10399g = (byte) (this.f10399g | 1);
    }

    /* JADX INFO: renamed from: d */
    public final void m5883d(ikw ikwVar) {
        if (ikwVar == null) {
            throw new NullPointerException("Null mode");
        }
        this.f10397e = ikwVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m5884e(int i) {
        this.f10395c = i;
        this.f10399g = (byte) (this.f10399g | 4);
    }

    /* JADX INFO: renamed from: f */
    public final void m5885f(int i) {
        this.f10394b = i;
        this.f10399g = (byte) (this.f10399g | 2);
    }
}
