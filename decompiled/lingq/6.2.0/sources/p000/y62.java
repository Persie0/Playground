package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class y62 {

    /* JADX INFO: renamed from: a */
    public o38 f69356a;

    /* JADX INFO: renamed from: b */
    public o38 f69357b;

    /* JADX INFO: renamed from: c */
    public final int f69358c;

    /* JADX INFO: renamed from: d */
    public final int f69359d;

    /* JADX INFO: renamed from: e */
    public final int f69360e;

    /* JADX INFO: renamed from: f */
    public final int f69361f;

    public y62(o38 o38Var, o38 o38Var2, int i, int i2, int i3, int i4) {
        this.f69356a = o38Var;
        this.f69357b = o38Var2;
        this.f69358c = i;
        this.f69359d = i2;
        this.f69360e = i3;
        this.f69361f = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.f69356a);
        sb.append(", newHolder=");
        sb.append(this.f69357b);
        sb.append(", fromX=");
        sb.append(this.f69358c);
        sb.append(", fromY=");
        sb.append(this.f69359d);
        sb.append(", toX=");
        sb.append(this.f69360e);
        sb.append(", toY=");
        return wq1.m24122r(sb, this.f69361f, '}');
    }
}
