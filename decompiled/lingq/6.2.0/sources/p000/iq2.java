package p000;

/* JADX INFO: loaded from: classes.dex */
public final class iq2 implements vp2 {

    /* JADX INFO: renamed from: b */
    public ux9 f44418b;

    /* JADX INFO: renamed from: a */
    public String f44417a = "";

    /* JADX INFO: renamed from: c */
    public int f44419c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public on3 f44420d = mn3.f51554a;

    @Override // p000.vp2
    /* JADX INFO: renamed from: a */
    public final on3 mo2977a() {
        return this.f44420d;
    }

    @Override // p000.vp2
    /* JADX INFO: renamed from: b */
    public final void mo2978b(on3 on3Var) {
        this.f44420d = on3Var;
    }

    @Override // p000.vp2
    public final vp2 copy() {
        iq2 iq2Var = new iq2();
        iq2Var.f44420d = this.f44420d;
        iq2Var.f44417a = this.f44417a;
        iq2Var.f44418b = this.f44418b;
        iq2Var.f44419c = this.f44419c;
        return iq2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.f44417a);
        sb.append(", style=");
        sb.append(this.f44418b);
        sb.append(", modifier=");
        sb.append(this.f44420d);
        sb.append(", maxLines=");
        return wq1.m24122r(sb, this.f44419c, ')');
    }
}
