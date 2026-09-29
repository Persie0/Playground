package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l99 {

    /* JADX INFO: renamed from: a */
    public final String f49347a;

    /* JADX INFO: renamed from: b */
    public final int f49348b;

    /* JADX INFO: renamed from: c */
    public final List f49349c;

    public l99(int i, String str, List list) {
        this.f49347a = str;
        this.f49348b = i;
        this.f49349c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l99)) {
            return false;
        }
        l99 l99Var = (l99) obj;
        return this.f49347a.equals(l99Var.f49347a) && this.f49348b == l99Var.f49348b && this.f49349c.equals(l99Var.f49349c);
    }

    public final int hashCode() {
        return this.f49349c.hashCode() + wq1.m24106b(this.f49348b, this.f49347a.hashCode() * 31, 31);
    }

    public final String toString() {
        return hn1.m13356f(AbstractC3393o1.m17741p(this.f49348b, "SizeTree(key=", this.f49347a, ", totalSize=", ", subTrees="), this.f49349c, ")");
    }
}
