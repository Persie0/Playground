package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fa5 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f38718a;

    /* JADX INFO: renamed from: b */
    public final List f38719b;

    /* JADX INFO: renamed from: c */
    public final List f38720c;

    /* JADX INFO: renamed from: d */
    public final boolean f38721d;

    public fa5(ArrayList arrayList, List list, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.f38718a = arrayList;
        this.f38719b = list;
        this.f38720c = list2;
        this.f38721d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa5)) {
            return false;
        }
        fa5 fa5Var = (fa5) obj;
        return this.f38718a.equals(fa5Var.f38718a) && fa4.m11650l(this.f38719b, fa5Var.f38719b) && fa4.m11650l(this.f38720c, fa5Var.f38720c) && this.f38721d == fa5Var.f38721d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38721d) + ux5.m22979b(ux5.m22979b(this.f38718a.hashCode() * 31, 31, this.f38719b), 31, this.f38720c);
    }

    public final String toString() {
        return "LibraryShelfContent(items=" + this.f38718a + ", blacklistedSources=" + this.f38719b + ", blacklistedCourses=" + this.f38720c + ", isEmpty=" + this.f38721d + ")";
    }
}
