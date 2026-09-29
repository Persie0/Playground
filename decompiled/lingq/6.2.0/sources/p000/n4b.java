package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n4b {

    /* JADX INFO: renamed from: a */
    public final b7b f52348a;

    /* JADX INFO: renamed from: b */
    public final vh7 f52349b;

    public n4b(b7b b7bVar, vh7 vh7Var) {
        this.f52348a = b7bVar;
        this.f52349b = vh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4b)) {
            return false;
        }
        n4b n4bVar = (n4b) obj;
        return this.f52348a.equals(n4bVar.f52348a) && this.f52349b.equals(n4bVar.f52349b);
    }

    public final int hashCode() {
        return this.f52349b.hashCode() + (this.f52348a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f52348a + ", windowPosture=" + this.f52349b + ')';
    }
}
