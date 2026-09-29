package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class z2a implements j3a {

    /* JADX INFO: renamed from: a */
    public final zf2 f70806a;

    public z2a(zf2 zf2Var) {
        this.f70806a = zf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z2a) && this.f70806a.equals(((z2a) obj).f70806a);
    }

    public final int hashCode() {
        return this.f70806a.hashCode();
    }

    public final String toString() {
        return "SelectDictionary(dictionary=" + this.f70806a + ")";
    }
}
