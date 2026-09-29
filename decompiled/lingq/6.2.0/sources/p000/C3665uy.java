package p000;

/* JADX INFO: renamed from: uy */
/* JADX INFO: loaded from: classes2.dex */
public final class C3665uy {

    /* JADX INFO: renamed from: a */
    public int f64497a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f64498b;

    /* JADX INFO: renamed from: c */
    public boolean f64499c;

    /* JADX INFO: renamed from: d */
    public boolean f64500d;

    /* JADX INFO: renamed from: a */
    public C3702vy m23004a() {
        if (this.f64498b || !(this.f64499c || this.f64500d)) {
            return new C3702vy(this);
        }
        C3386nv.m17633t("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m23005b(int i) {
        this.f64497a = i;
    }

    /* JADX INFO: renamed from: c */
    public void m23006c(boolean z) {
        this.f64498b = z;
    }

    /* JADX INFO: renamed from: d */
    public void m23007d(boolean z) {
        this.f64499c = z;
    }

    /* JADX INFO: renamed from: e */
    public void m23008e(boolean z) {
        this.f64500d = z;
    }
}
