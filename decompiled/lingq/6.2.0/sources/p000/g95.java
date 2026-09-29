package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g95 extends h95 {

    /* JADX INFO: renamed from: b */
    public final sn7 f40420b;

    /* JADX INFO: renamed from: c */
    public final boolean f40421c;

    /* JADX INFO: renamed from: d */
    public final String f40422d;

    public g95(sn7 sn7Var, boolean z) {
        super("upgrade_banner");
        this.f40420b = sn7Var;
        this.f40421c = z;
        this.f40422d = "upgrade_banner";
    }

    @Override // p000.h95
    /* JADX INFO: renamed from: a */
    public final String mo188a() {
        return this.f40422d;
    }

    /* JADX INFO: renamed from: b */
    public final sn7 m12422b() {
        return this.f40420b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12423c() {
        return this.f40421c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g95)) {
            return false;
        }
        g95 g95Var = (g95) obj;
        return this.f40420b.equals(g95Var.f40420b) && this.f40421c == g95Var.f40421c && this.f40422d.equals(g95Var.f40422d);
    }

    public final int hashCode() {
        return this.f40422d.hashCode() + g9a.m12428e(this.f40420b.hashCode() * 31, 31, this.f40421c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpgradeBanner(promoData=");
        sb.append(this.f40420b);
        sb.append(", shouldShowClose=");
        sb.append(this.f40421c);
        sb.append(", key=");
        return AbstractC3393o1.m17738m(sb, this.f40422d, ")");
    }
}
