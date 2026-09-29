package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class pya {

    /* JADX INFO: renamed from: a */
    public final int f57001a;

    /* JADX INFO: renamed from: b */
    public final String f57002b;

    public pya(int i, String str) {
        this.f57001a = i;
        this.f57002b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pya)) {
            return false;
        }
        pya pyaVar = (pya) obj;
        return this.f57001a == pyaVar.f57001a && fa4.m11650l(this.f57002b, pyaVar.f57002b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f57001a) * 31;
        String str = this.f57002b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hn1.m13354d(this.f57001a, "VocabularyFilterCourse(id=", ", title=", this.f57002b, ")");
    }
}
