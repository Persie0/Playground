package p000;

/* JADX INFO: renamed from: ry */
/* JADX INFO: loaded from: classes2.dex */
public final class C3553ry {

    /* JADX INFO: renamed from: a */
    public boolean f60020a;

    /* JADX INFO: renamed from: b */
    public boolean f60021b;

    /* JADX INFO: renamed from: c */
    public boolean f60022c;

    /* JADX INFO: renamed from: a */
    public C3591sy m20983a() {
        if (this.f60020a || !(this.f60021b || this.f60022c)) {
            return new C3591sy(this);
        }
        C3386nv.m17633t("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m20984b(boolean z) {
        this.f60020a = z;
    }

    /* JADX INFO: renamed from: c */
    public void m20985c(boolean z) {
        this.f60021b = z;
    }

    /* JADX INFO: renamed from: d */
    public void m20986d(boolean z) {
        this.f60022c = z;
    }
}
