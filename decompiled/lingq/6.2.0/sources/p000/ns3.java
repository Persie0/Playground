package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ns3 {

    /* JADX INFO: renamed from: a */
    public final int f53180a;

    /* JADX INFO: renamed from: b */
    public final int f53181b;

    /* JADX INFO: renamed from: c */
    public final String f53182c;

    public ns3(int i, String str, int i2) {
        this.f53180a = i;
        this.f53181b = i2;
        this.f53182c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns3)) {
            return false;
        }
        ns3 ns3Var = (ns3) obj;
        return this.f53180a == ns3Var.f53180a && this.f53181b == ns3Var.f53181b && this.f53182c.equals(ns3Var.f53182c);
    }

    public final int hashCode() {
        return this.f53182c.hashCode() + wq1.m24106b(this.f53181b, Integer.hashCode(this.f53180a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f53180a, this.f53181b, "HelpVideoItem(titleRes=", ", messageRes=", ", url="), this.f53182c, ")");
    }
}
