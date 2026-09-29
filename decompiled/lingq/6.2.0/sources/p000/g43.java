package p000;

import com.lingq.core.settings.FilterType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g43 {

    /* JADX INFO: renamed from: a */
    public final FilterType f40164a;

    /* JADX INFO: renamed from: b */
    public final List f40165b;

    /* JADX INFO: renamed from: c */
    public final boolean f40166c;

    /* JADX INFO: renamed from: d */
    public final boolean f40167d;

    public g43(FilterType filterType, List list, boolean z, boolean z2) {
        list.getClass();
        this.f40164a = filterType;
        this.f40165b = list;
        this.f40166c = z;
        this.f40167d = z2;
    }

    /* JADX INFO: renamed from: a */
    public static g43 m12349a(g43 g43Var, ArrayList arrayList, boolean z, int i) {
        FilterType filterType = g43Var.f40164a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = g43Var.f40165b;
        }
        boolean z2 = g43Var.f40166c;
        g43Var.getClass();
        list.getClass();
        return new g43(filterType, list, z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g43)) {
            return false;
        }
        g43 g43Var = (g43) obj;
        return this.f40164a == g43Var.f40164a && fa4.m11650l(this.f40165b, g43Var.f40165b) && this.f40166c == g43Var.f40166c && this.f40167d == g43Var.f40167d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40167d) + g9a.m12428e(ux5.m22979b(this.f40164a.hashCode() * 31, 31, this.f40165b), 31, this.f40166c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterSelectionPage(filterType=");
        sb.append(this.f40164a);
        sb.append(", items=");
        sb.append(this.f40165b);
        sb.append(", showClear=");
        return e65.m10875g(sb, this.f40166c, ", isLoading=", this.f40167d, ")");
    }
}
