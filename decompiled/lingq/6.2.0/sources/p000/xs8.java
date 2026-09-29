package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class xs8 {

    /* JADX INFO: renamed from: a */
    public final String f68652a;

    /* JADX INFO: renamed from: b */
    public final List f68653b;

    /* JADX INFO: renamed from: c */
    public final boolean f68654c;

    /* JADX INFO: renamed from: d */
    public final boolean f68655d;

    /* JADX INFO: renamed from: e */
    public final gt8 f68656e;

    /* JADX INFO: renamed from: f */
    public final ij7 f68657f;

    /* JADX INFO: renamed from: g */
    public final fm6 f68658g;

    /* JADX INFO: renamed from: h */
    public final boolean f68659h;

    /* JADX INFO: renamed from: i */
    public final boolean f68660i;

    /* JADX INFO: renamed from: j */
    public final boolean f68661j;

    /* JADX INFO: renamed from: k */
    public final String f68662k;

    /* JADX INFO: renamed from: l */
    public final boolean f68663l;

    public /* synthetic */ xs8(List list, boolean z, boolean z2, gt8 gt8Var, ij7 ij7Var, fm6 fm6Var, boolean z3, boolean z4, boolean z5, String str, boolean z6, int i) {
        this("", (i & 2) != 0 ? EmptyList.f47638a : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? new gt8() : gt8Var, (i & 32) != 0 ? null : ij7Var, (i & 64) != 0 ? null : fm6Var, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? false : z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs8)) {
            return false;
        }
        xs8 xs8Var = (xs8) obj;
        return fa4.m11650l(this.f68652a, xs8Var.f68652a) && fa4.m11650l(this.f68653b, xs8Var.f68653b) && this.f68654c == xs8Var.f68654c && this.f68655d == xs8Var.f68655d && fa4.m11650l(this.f68656e, xs8Var.f68656e) && fa4.m11650l(this.f68657f, xs8Var.f68657f) && fa4.m11650l(this.f68658g, xs8Var.f68658g) && this.f68659h == xs8Var.f68659h && this.f68660i == xs8Var.f68660i && this.f68661j == xs8Var.f68661j && fa4.m11650l(this.f68662k, xs8Var.f68662k) && this.f68663l == xs8Var.f68663l;
    }

    public final int hashCode() {
        int iHashCode = (this.f68656e.hashCode() + g9a.m12428e(g9a.m12428e(ux5.m22979b(this.f68652a.hashCode() * 31, 31, this.f68653b), 31, this.f68654c), 31, this.f68655d)) * 31;
        ij7 ij7Var = this.f68657f;
        int iHashCode2 = (iHashCode + (ij7Var == null ? 0 : ij7Var.hashCode())) * 31;
        fm6 fm6Var = this.f68658g;
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e((iHashCode2 + (fm6Var == null ? 0 : fm6Var.hashCode())) * 31, 31, this.f68659h), 31, this.f68660i), 31, this.f68661j);
        String str = this.f68662k;
        return Boolean.hashCode(this.f68663l) + ((iM12428e + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchScreenState(title=");
        sb.append(this.f68652a);
        sb.append(", items=");
        sb.append(this.f68653b);
        sb.append(", isRefreshing=");
        wq1.m24101A(sb, this.f68654c, ", isFilterBottomSheetVisible=", this.f68655d, ", filterBottomSheetState=");
        sb.append(this.f68656e);
        sb.append(", premiumLessonDialogState=");
        sb.append(this.f68657f);
        sb.append(", notEnoughBalanceDialogState=");
        sb.append(this.f68658g);
        sb.append(", showRemovePaidContentWarning=");
        sb.append(this.f68659h);
        sb.append(", showRemoveLessonWarning=");
        wq1.m24101A(sb, this.f68660i, ", showDownloadCourseDialog=", this.f68661j, ", buyPointsUrl=");
        sb.append(this.f68662k);
        sb.append(", shouldRefreshUserOnResume=");
        sb.append(this.f68663l);
        sb.append(")");
        return sb.toString();
    }

    public xs8(String str, List list, boolean z, boolean z2, gt8 gt8Var, ij7 ij7Var, fm6 fm6Var, boolean z3, boolean z4, boolean z5, String str2, boolean z6) {
        list.getClass();
        gt8Var.getClass();
        this.f68652a = str;
        this.f68653b = list;
        this.f68654c = z;
        this.f68655d = z2;
        this.f68656e = gt8Var;
        this.f68657f = ij7Var;
        this.f68658g = fm6Var;
        this.f68659h = z3;
        this.f68660i = z4;
        this.f68661j = z5;
        this.f68662k = str2;
        this.f68663l = z6;
    }
}
