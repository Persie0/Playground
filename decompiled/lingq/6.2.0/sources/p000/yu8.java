package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class yu8 {

    /* JADX INFO: renamed from: a */
    public final String f70490a;

    /* JADX INFO: renamed from: b */
    public final boolean f70491b;

    /* JADX INFO: renamed from: c */
    public final boolean f70492c;

    /* JADX INFO: renamed from: d */
    public final List f70493d;

    /* JADX INFO: renamed from: e */
    public final List f70494e;

    public yu8(String str, boolean z, boolean z2, List list, List list2) {
        this.f70490a = str;
        this.f70491b = z;
        this.f70492c = z2;
        this.f70493d = list;
        this.f70494e = list2;
    }

    /* JADX INFO: renamed from: a */
    public static yu8 m25345a(yu8 yu8Var, String str, boolean z, boolean z2, List list, List list2, int i) {
        if ((i & 1) != 0) {
            str = yu8Var.f70490a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = yu8Var.f70491b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = yu8Var.f70492c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            list = yu8Var.f70493d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = yu8Var.f70494e;
        }
        List list4 = list2;
        yu8Var.getClass();
        str2.getClass();
        list3.getClass();
        list4.getClass();
        return new yu8(str2, z3, z4, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu8)) {
            return false;
        }
        yu8 yu8Var = (yu8) obj;
        return fa4.m11650l(this.f70490a, yu8Var.f70490a) && this.f70491b == yu8Var.f70491b && this.f70492c == yu8Var.f70492c && fa4.m11650l(this.f70493d, yu8Var.f70493d) && fa4.m11650l(this.f70494e, yu8Var.f70494e);
    }

    public final int hashCode() {
        return this.f70494e.hashCode() + ux5.m22979b(g9a.m12428e(g9a.m12428e(this.f70490a.hashCode() * 31, 31, this.f70491b), 31, this.f70492c), 31, this.f70493d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionData(query=");
        sb.append(this.f70490a);
        sb.append(", isLoading=");
        sb.append(this.f70491b);
        sb.append(", isEmpty=");
        sb.append(this.f70492c);
        sb.append(", sharedByUsers=");
        sb.append(this.f70493d);
        sb.append(", lessonTags=");
        return hn1.m13356f(sb, this.f70494e, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ yu8() {
        EmptyList emptyList = EmptyList.f47638a;
        this("", false, false, emptyList, emptyList);
    }
}
