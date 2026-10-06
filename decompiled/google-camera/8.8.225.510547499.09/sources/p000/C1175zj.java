package p000;

/* JADX INFO: renamed from: zj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1175zj {

    /* JADX INFO: renamed from: a */
    public final boolean f48351a;

    /* JADX INFO: renamed from: b */
    final String f48352b;

    /* JADX INFO: renamed from: c */
    public int f48353c;

    /* JADX INFO: renamed from: d */
    public float f48354d;

    /* JADX INFO: renamed from: e */
    public String f48355e;

    /* JADX INFO: renamed from: f */
    boolean f48356f;

    /* JADX INFO: renamed from: g */
    public int f48357g;

    /* JADX INFO: renamed from: h */
    public final int f48358h;

    public C1175zj(C1175zj c1175zj, Object obj) {
        this.f48351a = false;
        this.f48352b = c1175zj.f48352b;
        this.f48358h = c1175zj.f48358h;
        m19788a(obj);
    }

    /* JADX INFO: renamed from: a */
    public final void m19788a(Object obj) {
        int i = this.f48358h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 7:
                this.f48353c = ((Integer) obj).intValue();
                return;
            case 1:
                this.f48354d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f48357g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f48355e = (String) obj;
                return;
            case 5:
                this.f48356f = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f48354d = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C1175zj(String str, int i, Object obj, boolean z) {
        this.f48352b = str;
        this.f48358h = i;
        this.f48351a = z;
        m19788a(obj);
    }
}
