package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ww6 {

    /* JADX INFO: renamed from: a */
    public final String f67424a;

    /* JADX INFO: renamed from: b */
    public final String f67425b;

    public ww6(String str, String str2) {
        str2.getClass();
        this.f67424a = str;
        this.f67425b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m24182a() {
        return this.f67424a;
    }

    /* JADX INFO: renamed from: b */
    public final String m24183b() {
        return this.f67425b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww6)) {
            return false;
        }
        ww6 ww6Var = (ww6) obj;
        return this.f67424a.equals(ww6Var.f67424a) && fa4.m11650l(this.f67425b, ww6Var.f67425b);
    }

    public final int hashCode() {
        return this.f67425b.hashCode() + (this.f67424a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("OnboardingSurveyItem(question=", this.f67424a, ", response=", this.f67425b, ")");
    }
}
