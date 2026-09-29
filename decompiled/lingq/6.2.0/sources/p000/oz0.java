package p000;

/* JADX INFO: loaded from: classes.dex */
public final class oz0 {

    /* JADX INFO: renamed from: a */
    public final String f55316a;

    /* JADX INFO: renamed from: b */
    public final String f55317b;

    public oz0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f55316a = str;
        this.f55317b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz0)) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return fa4.m11650l(this.f55316a, oz0Var.f55316a) && fa4.m11650l(this.f55317b, oz0Var.f55317b);
    }

    public final int hashCode() {
        return this.f55317b.hashCode() + (this.f55316a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ChatSuggestion(source=", this.f55316a, ", target=", this.f55317b, ")");
    }
}
