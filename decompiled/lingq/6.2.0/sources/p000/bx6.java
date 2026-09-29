package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bx6 {

    /* JADX INFO: renamed from: a */
    public final List f9133a;

    /* JADX INFO: renamed from: b */
    public final List f9134b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f9135c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f9136d;

    public bx6(List list, List list2, ArrayList arrayList, ArrayList arrayList2) {
        this.f9133a = list;
        this.f9134b = list2;
        this.f9135c = arrayList;
        this.f9136d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx6)) {
            return false;
        }
        bx6 bx6Var = (bx6) obj;
        return this.f9133a.equals(bx6Var.f9133a) && this.f9134b.equals(bx6Var.f9134b) && this.f9135c.equals(bx6Var.f9135c) && this.f9136d.equals(bx6Var.f9136d);
    }

    public final int hashCode() {
        return this.f9136d.hashCode() + ((this.f9135c.hashCode() + ux5.m22979b(this.f9133a.hashCode() * 31, 31, this.f9134b)) * 31);
    }

    public final String toString() {
        return "OnboardingUpgradeItems(premium=" + this.f9133a + ", plus=" + this.f9134b + ", yearly=" + this.f9135c + ", monthly=" + this.f9136d + ")";
    }
}
