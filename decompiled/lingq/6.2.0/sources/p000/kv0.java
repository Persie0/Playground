package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kv0 {

    /* JADX INFO: renamed from: a */
    public final String f48448a;

    /* JADX INFO: renamed from: b */
    public final String f48449b;

    /* JADX INFO: renamed from: c */
    public final String f48450c;

    /* JADX INFO: renamed from: d */
    public final String f48451d;

    /* JADX INFO: renamed from: e */
    public final String f48452e;

    public kv0(String str, String str2, String str3, String str4, String str5) {
        ux5.m22975B(str, str2, str3, str4, str5);
        this.f48448a = str;
        this.f48449b = str2;
        this.f48450c = str3;
        this.f48451d = str4;
        this.f48452e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv0)) {
            return false;
        }
        kv0 kv0Var = (kv0) obj;
        return fa4.m11650l(this.f48448a, kv0Var.f48448a) && fa4.m11650l(this.f48449b, kv0Var.f48449b) && fa4.m11650l(this.f48450c, kv0Var.f48450c) && fa4.m11650l(this.f48451d, kv0Var.f48451d) && fa4.m11650l(this.f48452e, kv0Var.f48452e);
    }

    public final int hashCode() {
        return this.f48452e.hashCode() + ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f48448a.hashCode() * 31, this.f48449b, 31), this.f48450c, 31), this.f48451d, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ChatBotConfig(greeting=", this.f48448a, ", inputPlaceholder=", this.f48449b, ", translationLabel=");
        AbstractC3393o1.m17725C(sbM23000w, this.f48450c, ", suggestedTermsLabel=", this.f48451d, ", lessonPromptTemplate=");
        return AbstractC3393o1.m17738m(sbM23000w, this.f48452e, ")");
    }

    public /* synthetic */ kv0() {
        this("", "", "", "", "");
    }
}
