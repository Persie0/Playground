package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class ja5 {

    /* JADX INFO: renamed from: a */
    public final am4 f45336a;

    /* JADX INFO: renamed from: b */
    public final List f45337b;

    /* JADX INFO: renamed from: c */
    public final boolean f45338c;

    /* JADX INFO: renamed from: d */
    public final String f45339d;

    /* JADX INFO: renamed from: e */
    public final boolean f45340e;

    /* JADX INFO: renamed from: f */
    public final je2 f45341f;

    /* JADX INFO: renamed from: g */
    public final c7a f45342g;

    /* JADX INFO: renamed from: h */
    public final s45 f45343h;

    /* JADX INFO: renamed from: i */
    public final boolean f45344i;

    /* JADX INFO: renamed from: j */
    public final boolean f45345j;

    /* JADX INFO: renamed from: k */
    public final boolean f45346k;

    public /* synthetic */ ja5(am4 am4Var, List list, int i) {
        this((i & 1) != 0 ? new am4("") : am4Var, (i & 2) != 0 ? EmptyList.f47638a : list, false, "", (i & 16) != 0, new je2(new C3436ou(), new p68(7), new op7(15), new em6(15), new y58(3), new x16(7), new x58(3), new z25(), new h68(0, 127, null, false)), null, null, false, true, false);
    }

    /* JADX INFO: renamed from: a */
    public static ja5 m14361a(ja5 ja5Var, am4 am4Var, ArrayList arrayList, boolean z, String str, boolean z2, je2 je2Var, c7a c7aVar, s45 s45Var, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            am4Var = ja5Var.f45336a;
        }
        am4 am4Var2 = am4Var;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = ja5Var.f45337b;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = ja5Var.f45338c;
        }
        boolean z6 = z;
        String str2 = (i & 8) != 0 ? ja5Var.f45339d : str;
        boolean z7 = (i & 16) != 0 ? ja5Var.f45340e : z2;
        je2 je2Var2 = (i & 32) != 0 ? ja5Var.f45341f : je2Var;
        c7a c7aVar2 = (i & 64) != 0 ? ja5Var.f45342g : c7aVar;
        s45 s45Var2 = (i & 128) != 0 ? ja5Var.f45343h : s45Var;
        boolean z8 = (i & 256) != 0 ? ja5Var.f45344i : z3;
        boolean z9 = (i & 512) != 0 ? ja5Var.f45345j : z4;
        boolean z10 = (i & 1024) != 0 ? ja5Var.f45346k : z5;
        ja5Var.getClass();
        am4Var2.getClass();
        list2.getClass();
        str2.getClass();
        je2Var2.getClass();
        return new ja5(am4Var2, list2, z6, str2, z7, je2Var2, c7aVar2, s45Var2, z8, z9, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja5)) {
            return false;
        }
        ja5 ja5Var = (ja5) obj;
        return fa4.m11650l(this.f45336a, ja5Var.f45336a) && fa4.m11650l(this.f45337b, ja5Var.f45337b) && this.f45338c == ja5Var.f45338c && fa4.m11650l(this.f45339d, ja5Var.f45339d) && this.f45340e == ja5Var.f45340e && fa4.m11650l(this.f45341f, ja5Var.f45341f) && fa4.m11650l(this.f45342g, ja5Var.f45342g) && fa4.m11650l(this.f45343h, ja5Var.f45343h) && this.f45344i == ja5Var.f45344i && this.f45345j == ja5Var.f45345j && this.f45346k == ja5Var.f45346k;
    }

    public final int hashCode() {
        int iHashCode = (this.f45341f.hashCode() + g9a.m12428e(ux5.m22980c(g9a.m12428e(ux5.m22979b(this.f45336a.f826a.hashCode() * 31, 31, this.f45337b), 31, this.f45338c), this.f45339d, 31), 31, this.f45340e)) * 31;
        c7a c7aVar = this.f45342g;
        int iHashCode2 = (iHashCode + (c7aVar == null ? 0 : c7aVar.hashCode())) * 31;
        s45 s45Var = this.f45343h;
        return Boolean.hashCode(this.f45346k) + g9a.m12428e(g9a.m12428e((iHashCode2 + (s45Var != null ? s45Var.hashCode() : 0)) * 31, 31, this.f45344i), 31, this.f45345j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryUiState(languageInfo=");
        sb.append(this.f45336a);
        sb.append(", structure=");
        sb.append(this.f45337b);
        sb.append(", isRefreshing=");
        hn1.m13367q(", error=", this.f45339d, ", isLoading=", sb, this.f45338c);
        sb.append(this.f45340e);
        sb.append(", dialogsState=");
        sb.append(this.f45341f);
        sb.append(", tooltipState=");
        sb.append(this.f45342g);
        sb.append(", tooltipActionData=");
        sb.append(this.f45343h);
        sb.append(", tooltipIsReady=");
        wq1.m24101A(sb, this.f45344i, ", isMultiLanguage=", this.f45345j, ", showCupTrophy=");
        return AbstractC3393o1.m17740o(sb, this.f45346k, ")");
    }

    public ja5(am4 am4Var, List list, boolean z, String str, boolean z2, je2 je2Var, c7a c7aVar, s45 s45Var, boolean z3, boolean z4, boolean z5) {
        am4Var.getClass();
        list.getClass();
        str.getClass();
        this.f45336a = am4Var;
        this.f45337b = list;
        this.f45338c = z;
        this.f45339d = str;
        this.f45340e = z2;
        this.f45341f = je2Var;
        this.f45342g = c7aVar;
        this.f45343h = s45Var;
        this.f45344i = z3;
        this.f45345j = z4;
        this.f45346k = z5;
    }
}
