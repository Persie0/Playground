package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vz2 {

    /* JADX INFO: renamed from: a */
    public final String f66118a;

    /* JADX INFO: renamed from: b */
    public final boolean f66119b;

    /* JADX INFO: renamed from: c */
    public final boolean f66120c;

    /* JADX INFO: renamed from: d */
    public final List f66121d;

    /* JADX INFO: renamed from: e */
    public final List f66122e;

    /* JADX INFO: renamed from: f */
    public final List f66123f;

    /* JADX INFO: renamed from: g */
    public final List f66124g;

    /* JADX INFO: renamed from: h */
    public final Map f66125h;

    /* JADX INFO: renamed from: i */
    public final Integer f66126i;

    public vz2(String str, boolean z, boolean z2, List list, List list2, List list3, List list4, Map map, Integer num) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f66118a = str;
        this.f66119b = z;
        this.f66120c = z2;
        this.f66121d = list;
        this.f66122e = list2;
        this.f66123f = list3;
        this.f66124g = list4;
        this.f66125h = map;
        this.f66126i = num;
    }

    /* JADX INFO: renamed from: a */
    public static vz2 m23657a(vz2 vz2Var, String str, boolean z, boolean z2, List list, List list2, List list3, List list4, Map map, Integer num, int i) {
        if ((i & 1) != 0) {
            str = vz2Var.f66118a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            z = vz2Var.f66119b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = vz2Var.f66120c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            list = vz2Var.f66121d;
        }
        List list5 = list;
        if ((i & 16) != 0) {
            list2 = vz2Var.f66122e;
        }
        List list6 = list2;
        List list7 = (i & 32) != 0 ? vz2Var.f66123f : list3;
        List list8 = (i & 64) != 0 ? vz2Var.f66124g : list4;
        Map map2 = (i & 128) != 0 ? vz2Var.f66125h : map;
        Integer num2 = (i & 256) != 0 ? vz2Var.f66126i : num;
        vz2Var.getClass();
        str2.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        return new vz2(str2, z3, z4, list5, list6, list7, list8, map2, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz2)) {
            return false;
        }
        vz2 vz2Var = (vz2) obj;
        return this.f66118a.equals(vz2Var.f66118a) && this.f66119b == vz2Var.f66119b && this.f66120c == vz2Var.f66120c && fa4.m11650l(this.f66121d, vz2Var.f66121d) && fa4.m11650l(this.f66122e, vz2Var.f66122e) && fa4.m11650l(this.f66123f, vz2Var.f66123f) && fa4.m11650l(this.f66124g, vz2Var.f66124g) && this.f66125h.equals(vz2Var.f66125h) && fa4.m11650l(this.f66126i, vz2Var.f66126i);
    }

    public final int hashCode() {
        int iM10869a = e65.m10869a(ux5.m22979b(ux5.m22979b(ux5.m22979b(ux5.m22979b(g9a.m12428e(g9a.m12428e(this.f66118a.hashCode() * 31, 31, this.f66119b), 31, this.f66120c), 31, this.f66121d), 31, this.f66122e), 31, this.f66123f), 31, this.f66124g), 31, this.f66125h);
        Integer num = this.f66126i;
        return iM10869a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FastSearchDataState(query=");
        sb.append(this.f66118a);
        sb.append(", isLoading=");
        sb.append(this.f66119b);
        sb.append(", isEmpty=");
        sb.append(this.f66120c);
        sb.append(", lessons=");
        sb.append(this.f66121d);
        sb.append(", lessonsCounters=");
        hn1.m13372v(sb, this.f66122e, ", courses=", this.f66123f, ", extraData=");
        sb.append(this.f66124g);
        sb.append(", shelvesByCode=");
        sb.append(this.f66125h);
        sb.append(", removeLessonWarningLessonId=");
        sb.append(this.f66126i);
        sb.append(")");
        return sb.toString();
    }
}
