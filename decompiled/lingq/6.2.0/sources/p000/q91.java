package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q91 {

    /* JADX INFO: renamed from: a */
    public final String f57439a;

    /* JADX INFO: renamed from: b */
    public final List f57440b;

    /* JADX INFO: renamed from: c */
    public final boolean f57441c;

    /* JADX INFO: renamed from: d */
    public final t61 f57442d;

    /* JADX INFO: renamed from: e */
    public final z7d f57443e;

    /* JADX INFO: renamed from: f */
    public final String f57444f;

    /* JADX INFO: renamed from: g */
    public final boolean f57445g;

    /* JADX INFO: renamed from: h */
    public final boolean f57446h;

    public q91(String str, List list, boolean z, t61 t61Var, z7d z7dVar, String str2, boolean z2, boolean z3) {
        this.f57439a = str;
        this.f57440b = list;
        this.f57441c = z;
        this.f57442d = t61Var;
        this.f57443e = z7dVar;
        this.f57444f = str2;
        this.f57445g = z2;
        this.f57446h = z3;
    }

    /* JADX INFO: renamed from: a */
    public static q91 m19806a(q91 q91Var, ArrayList arrayList, boolean z, t61 t61Var, z7d z7dVar, String str, boolean z2, boolean z3, int i) {
        List list = arrayList;
        String str2 = q91Var.f57439a;
        if ((i & 2) != 0) {
            list = q91Var.f57440b;
        }
        if ((i & 4) != 0) {
            z = q91Var.f57441c;
        }
        if ((i & 8) != 0) {
            t61Var = q91Var.f57442d;
        }
        if ((i & 16) != 0) {
            z7dVar = q91Var.f57443e;
        }
        if ((i & 32) != 0) {
            str = q91Var.f57444f;
        }
        if ((i & 64) != 0) {
            z2 = q91Var.f57445g;
        }
        if ((i & 128) != 0) {
            z3 = q91Var.f57446h;
        }
        boolean z4 = z3;
        q91Var.getClass();
        str2.getClass();
        list.getClass();
        boolean z5 = z2;
        String str3 = str;
        z7d z7dVar2 = z7dVar;
        t61 t61Var2 = t61Var;
        return new q91(str2, list, z, t61Var2, z7dVar2, str3, z5, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q91)) {
            return false;
        }
        q91 q91Var = (q91) obj;
        return fa4.m11650l(this.f57439a, q91Var.f57439a) && fa4.m11650l(this.f57440b, q91Var.f57440b) && this.f57441c == q91Var.f57441c && fa4.m11650l(this.f57442d, q91Var.f57442d) && fa4.m11650l(this.f57443e, q91Var.f57443e) && fa4.m11650l(this.f57444f, q91Var.f57444f) && this.f57445g == q91Var.f57445g && this.f57446h == q91Var.f57446h;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(ux5.m22979b(this.f57439a.hashCode() * 31, 31, this.f57440b), 31, this.f57441c);
        t61 t61Var = this.f57442d;
        int iHashCode = (iM12428e + (t61Var == null ? 0 : t61Var.hashCode())) * 31;
        z7d z7dVar = this.f57443e;
        int iHashCode2 = (iHashCode + (z7dVar == null ? 0 : z7dVar.hashCode())) * 31;
        String str = this.f57444f;
        return Boolean.hashCode(this.f57446h) + g9a.m12428e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f57445g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionState(title=");
        sb.append(this.f57439a);
        sb.append(", items=");
        sb.append(this.f57440b);
        sb.append(", isRefreshing=");
        sb.append(this.f57441c);
        sb.append(", courseMenuState=");
        sb.append(this.f57442d);
        sb.append(", dialogState=");
        sb.append(this.f57443e);
        sb.append(", buyPointsUrl=");
        sb.append(this.f57444f);
        sb.append(", shouldRefreshUserOnResume=");
        return e65.m10875g(sb, this.f57445g, ", shouldRefreshCourseOnResume=", this.f57446h, ")");
    }
}
