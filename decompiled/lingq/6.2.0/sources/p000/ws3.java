package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ws3 {

    /* JADX INFO: renamed from: a */
    public final String f67242a;

    /* JADX INFO: renamed from: b */
    public final String f67243b;

    public ws3(String str, String str2) {
        this.f67242a = str;
        this.f67243b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws3)) {
            return false;
        }
        ws3 ws3Var = (ws3) obj;
        return this.f67242a.equals(ws3Var.f67242a) && this.f67243b.equals(ws3Var.f67243b);
    }

    public final int hashCode() {
        return this.f67243b.hashCode() + (this.f67242a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("HighlightStyleColors(background=", this.f67242a, ", underline=", this.f67243b, ")");
    }
}
