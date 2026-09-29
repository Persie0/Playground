package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class l75 {

    /* JADX INFO: renamed from: a */
    public final int f49247a;

    /* JADX INFO: renamed from: b */
    public final String f49248b;

    public l75(int i, String str) {
        str.getClass();
        this.f49247a = i;
        this.f49248b = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m15964a() {
        return this.f49247a;
    }

    /* JADX INFO: renamed from: b */
    public final String m15965b() {
        return this.f49248b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l75)) {
            return false;
        }
        l75 l75Var = (l75) obj;
        return this.f49247a == l75Var.f49247a && fa4.m11650l(this.f49248b, l75Var.f49248b);
    }

    public final int hashCode() {
        return this.f49248b.hashCode() + (Integer.hashCode(this.f49247a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f49247a, "LessonsAndCardsJoin(contentId=", ", termWithLanguage=", this.f49248b, ")");
    }
}
