package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class m17 implements y21 {

    /* JADX INFO: renamed from: a */
    public final Class f50435a;

    public m17(Class cls) {
        cls.getClass();
        this.f50435a = cls;
    }

    @Override // p000.y21
    /* JADX INFO: renamed from: a */
    public final Class mo16595a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m17) {
            return fa4.m11650l(this.f50435a, ((m17) obj).f50435a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f50435a.hashCode();
    }

    public final String toString() {
        return this.f50435a.toString() + " (Kotlin reflection is not available)";
    }
}
