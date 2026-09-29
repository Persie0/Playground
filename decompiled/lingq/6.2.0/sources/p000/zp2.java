package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zp2 implements vp2 {

    /* JADX INFO: renamed from: b */
    public zz3 f71932b;

    /* JADX INFO: renamed from: c */
    public j1a f71933c;

    /* JADX INFO: renamed from: d */
    public Float f71934d;

    /* JADX INFO: renamed from: a */
    public on3 f71931a = mn3.f51554a;

    /* JADX INFO: renamed from: e */
    public int f71935e = 1;

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f71931a;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f71931a = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        zp2 zp2Var = new zp2();
        zp2Var.f71931a = this.f71931a;
        zp2Var.f71932b = this.f71932b;
        zp2Var.f71933c = this.f71933c;
        zp2Var.f71934d = this.f71934d;
        zp2Var.f71935e = this.f71935e;
        return zp2Var;
    }

    public final String toString() {
        return "EmittableImage(modifier=" + this.f71931a + ", provider=" + this.f71932b + ", colorFilterParams=" + this.f71933c + ", alpha=" + this.f71934d + ", contentScale=" + ((Object) il1.m14010a(this.f71935e)) + ')';
    }
}
