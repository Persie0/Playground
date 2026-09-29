package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class he6 extends hf6 {

    /* JADX INFO: renamed from: a */
    public final String f42259a;

    /* JADX INFO: renamed from: b */
    public final hf6 f42260b;

    public he6(String str, hf6 hf6Var) {
        str.getClass();
        this.f42259a = str;
        this.f42260b = hf6Var;
    }

    /* JADX INFO: renamed from: a */
    public final hf6 m13207a() {
        return this.f42260b;
    }

    /* JADX INFO: renamed from: b */
    public final String m13208b() {
        return this.f42259a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he6)) {
            return false;
        }
        he6 he6Var = (he6) obj;
        return fa4.m11650l(this.f42259a, he6Var.f42259a) && this.f42260b.equals(he6Var.f42260b);
    }

    public final int hashCode() {
        return this.f42260b.hashCode() + (this.f42259a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeLanguage(language=" + this.f42259a + ", destination=" + this.f42260b + ")";
    }
}
