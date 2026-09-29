package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xq9 {

    /* JADX INFO: renamed from: a */
    public final String f68546a;

    /* JADX INFO: renamed from: b */
    public final boolean f68547b;

    /* JADX INFO: renamed from: c */
    public final List f68548c;

    /* JADX INFO: renamed from: d */
    public final List f68549d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public xq9(String str, boolean z, List list, List list2) {
        str.getClass();
        this.f68546a = str;
        this.f68547b = z;
        this.f68548c = list;
        this.f68549d = list2;
        List arrayList = list2;
        if (arrayList.isEmpty()) {
            int size = list.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add("ASC");
            }
        }
        this.f68549d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xq9) {
            xq9 xq9Var = (xq9) obj;
            String str = xq9Var.f68546a;
            if (this.f68547b == xq9Var.f68547b && this.f68548c.equals(xq9Var.f68548c) && fa4.m11650l(this.f68549d, xq9Var.f68549d)) {
                String str2 = this.f68546a;
                return cl9.m4842Y(str2, "index_", false) ? cl9.m4842Y(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f68546a;
        return this.f68549d.hashCode() + ux5.m22979b((((cl9.m4842Y(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f68547b ? 1 : 0)) * 31, 31, this.f68548c);
    }

    public final String toString() {
        return wk9.m24028K(wk9.m24030M("\n            |Index {\n            |   name = '" + this.f68546a + "',\n            |   unique = '" + this.f68547b + "',\n            |   columns = {" + e6d.m10899d(this.f68548c) + "\n            |   orders = {" + e6d.m10898c(this.f68549d) + "\n            |}\n        "), "    ");
    }
}
