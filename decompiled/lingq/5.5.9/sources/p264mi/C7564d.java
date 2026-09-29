package p264mi;

import dm.C5207g;

/* JADX INFO: renamed from: mi.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7564d {

    /* JADX INFO: renamed from: a */
    public final int f41687a;

    /* JADX INFO: renamed from: b */
    public final String f41688b;

    public C7564d() {
        this(null, 0);
    }

    public C7564d(String str, int i10) {
        this.f41687a = i10;
        this.f41688b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7564d)) {
            return false;
        }
        C7564d c7564d = (C7564d) obj;
        return this.f41687a == c7564d.f41687a && C5207g.m11106a(this.f41688b, c7564d.f41688b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f41687a) * 31;
        String str = this.f41688b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "VocabularyFilterCourse(id=" + this.f41687a + ", title=" + this.f41688b + ")";
    }
}
