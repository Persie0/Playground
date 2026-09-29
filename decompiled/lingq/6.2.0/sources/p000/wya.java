package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class wya {

    /* JADX INFO: renamed from: a */
    public final int f67531a;

    /* JADX INFO: renamed from: b */
    public final String f67532b;

    public wya(int i, String str) {
        this.f67531a = i;
        this.f67532b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wya)) {
            return false;
        }
        wya wyaVar = (wya) obj;
        return this.f67531a == wyaVar.f67531a && fa4.m11650l(this.f67532b, wyaVar.f67532b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f67531a) * 31;
        String str = this.f67532b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return hn1.m13354d(this.f67531a, "VocabularyFilterLesson(id=", ", title=", this.f67532b, ")");
    }
}
