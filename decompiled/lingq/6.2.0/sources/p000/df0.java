package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class df0 {

    /* JADX INFO: renamed from: a */
    public final String f35536a;

    /* JADX INFO: renamed from: b */
    public final List f35537b;

    /* JADX INFO: renamed from: c */
    public final List f35538c;

    /* JADX INFO: renamed from: d */
    public final pya f35539d;

    /* JADX INFO: renamed from: e */
    public final String f35540e;

    /* JADX INFO: renamed from: f */
    public final boolean f35541f;

    /* JADX INFO: renamed from: g */
    public final String f35542g;

    /* JADX INFO: renamed from: h */
    public final int f35543h;

    /* JADX INFO: renamed from: i */
    public final boolean f35544i;

    /* JADX INFO: renamed from: j */
    public final boolean f35545j;

    public df0(String str, List list, List list2, pya pyaVar, String str2, boolean z, String str3, int i, boolean z2, boolean z3) {
        list.getClass();
        list2.getClass();
        this.f35536a = str;
        this.f35537b = list;
        this.f35538c = list2;
        this.f35539d = pyaVar;
        this.f35540e = str2;
        this.f35541f = z;
        this.f35542g = str3;
        this.f35543h = i;
        this.f35544i = z2;
        this.f35545j = z3;
    }

    /* JADX INFO: renamed from: a */
    public static df0 m10318a(df0 df0Var, String str, List list, List list2, pya pyaVar, String str2, boolean z, String str3, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = df0Var.f35536a;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            list = df0Var.f35537b;
        }
        List list3 = list;
        List list4 = (i2 & 4) != 0 ? df0Var.f35538c : list2;
        pya pyaVar2 = (i2 & 8) != 0 ? df0Var.f35539d : pyaVar;
        String str5 = (i2 & 16) != 0 ? df0Var.f35540e : str2;
        boolean z2 = (i2 & 32) != 0 ? df0Var.f35541f : z;
        String str6 = (i2 & 64) != 0 ? df0Var.f35542g : str3;
        int i3 = (i2 & 128) != 0 ? df0Var.f35543h : i;
        boolean z3 = df0Var.f35544i;
        boolean z4 = df0Var.f35545j;
        df0Var.getClass();
        str4.getClass();
        list3.getClass();
        list4.getClass();
        return new df0(str4, list3, list4, pyaVar2, str5, z2, str6, i3, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df0)) {
            return false;
        }
        df0 df0Var = (df0) obj;
        return fa4.m11650l(this.f35536a, df0Var.f35536a) && fa4.m11650l(this.f35537b, df0Var.f35537b) && fa4.m11650l(this.f35538c, df0Var.f35538c) && fa4.m11650l(this.f35539d, df0Var.f35539d) && fa4.m11650l(this.f35540e, df0Var.f35540e) && this.f35541f == df0Var.f35541f && fa4.m11650l(this.f35542g, df0Var.f35542g) && this.f35543h == df0Var.f35543h && this.f35544i == df0Var.f35544i && this.f35545j == df0Var.f35545j;
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22979b(this.f35536a.hashCode() * 31, 31, this.f35537b), 31, this.f35538c);
        pya pyaVar = this.f35539d;
        int iHashCode = (iM22979b + (pyaVar == null ? 0 : pyaVar.hashCode())) * 31;
        String str = this.f35540e;
        int iM12428e = g9a.m12428e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f35541f);
        String str2 = this.f35542g;
        return Boolean.hashCode(this.f35545j) + g9a.m12428e(wq1.m24106b(this.f35543h, (iM12428e + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f35544i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BookChallengeChooserScreenState(query=");
        sb.append(this.f35536a);
        sb.append(", libraryCourses=");
        sb.append(this.f35537b);
        sb.append(", importedCourses=");
        sb.append(this.f35538c);
        sb.append(", selectedBook=");
        sb.append(this.f35539d);
        sb.append(", selectedFileName=");
        ux5.m22976C(this.f35540e, ", isLoading=", ", error=", sb, this.f35541f);
        AbstractC3393o1.m17748w(this.f35543h, this.f35542g, ", completedRequestId=", ", isJoined=", sb);
        return e65.m10875g(sb, this.f35544i, ", isReplacingBook=", this.f35545j, ")");
    }
}
