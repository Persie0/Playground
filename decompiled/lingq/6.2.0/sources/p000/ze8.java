package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ze8 {

    /* JADX INFO: renamed from: a */
    public final int f71461a;

    /* JADX INFO: renamed from: b */
    public final int f71462b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f71463c;

    public ze8(ArrayList arrayList, int i, int i2) {
        this.f71461a = i;
        this.f71462b = i2;
        this.f71463c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze8)) {
            return false;
        }
        ze8 ze8Var = (ze8) obj;
        return this.f71461a == ze8Var.f71461a && this.f71462b == ze8Var.f71462b && this.f71463c.equals(ze8Var.f71463c);
    }

    public final int hashCode() {
        return this.f71463c.hashCode() + wq1.m24106b(this.f71462b, Integer.hashCode(this.f71461a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f71461a, this.f71462b, "ReviewSessionCompleteState(correctActivities=", ", totalActivities=", ", items=");
        sbM22994q.append(this.f71463c);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
