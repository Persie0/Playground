package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcu {

    /* JADX INFO: renamed from: a */
    public final String f2957a;

    /* JADX INFO: renamed from: b */
    public final axt f2958b;

    /* JADX INFO: renamed from: c */
    public final int f2959c;

    /* JADX INFO: renamed from: d */
    public final int f2960d;

    /* JADX INFO: renamed from: e */
    public final List f2961e;

    /* JADX INFO: renamed from: f */
    public final List f2962f;

    /* JADX INFO: renamed from: g */
    public final int f2963g;

    public bcu(String str, int i, axt axtVar, int i2, int i3, List list, List list2) {
        str.getClass();
        this.f2957a = str;
        this.f2963g = i;
        this.f2958b = axtVar;
        this.f2959c = i2;
        this.f2960d = i3;
        this.f2961e = list;
        this.f2962f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcu)) {
            return false;
        }
        bcu bcuVar = (bcu) obj;
        return ooc.m18737c(this.f2957a, bcuVar.f2957a) && this.f2963g == bcuVar.f2963g && ooc.m18737c(this.f2958b, bcuVar.f2958b) && this.f2959c == bcuVar.f2959c && this.f2960d == bcuVar.f2960d && ooc.m18737c(this.f2961e, bcuVar.f2961e) && ooc.m18737c(this.f2962f, bcuVar.f2962f);
    }

    public final int hashCode() {
        int iHashCode = this.f2957a.hashCode() * 31;
        int i = this.f2963g;
        C0158ej.m7380g(i);
        return ((((((((((iHashCode + i) * 31) + this.f2958b.hashCode()) * 31) + this.f2959c) * 31) + this.f2960d) * 31) + this.f2961e.hashCode()) * 31) + this.f2962f.hashCode();
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.f2957a + ", state=" + ((Object) C0158ej.m7378e(this.f2963g)) + ", output=" + this.f2958b + ", runAttemptCount=" + this.f2959c + ", generation=" + this.f2960d + ", tags=" + this.f2961e + ", progress=" + this.f2962f + ')';
    }
}
