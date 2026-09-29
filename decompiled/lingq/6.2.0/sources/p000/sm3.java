package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class sm3 {

    /* JADX INFO: renamed from: a */
    public final String f61020a;

    /* JADX INFO: renamed from: b */
    public final int f61021b;

    /* JADX INFO: renamed from: c */
    public final int f61022c;

    public sm3(String str, int i, int i2) {
        str.getClass();
        this.f61020a = str;
        this.f61021b = i;
        this.f61022c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm3)) {
            return false;
        }
        sm3 sm3Var = (sm3) obj;
        return fa4.m11650l(this.f61020a, sm3Var.f61020a) && this.f61021b == sm3Var.f61021b && this.f61022c == sm3Var.f61022c;
    }

    public final int hashCode() {
        return wq1.m24106b(this.f61022c, wq1.m24106b(this.f61021b, this.f61020a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return wq1.m24123s(AbstractC3393o1.m17741p(this.f61021b, "TokenRef(text=", this.f61020a, ", sentenceIndex=", ", sentenceTokenIndex="), this.f61022c, ", inlineTranslation=null)");
    }
}
