package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o54 {

    /* JADX INFO: renamed from: a */
    public final String f53861a;

    /* JADX INFO: renamed from: b */
    public final String f53862b;

    public o54(String str, String str2) {
        this.f53861a = str;
        this.f53862b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o54)) {
            return false;
        }
        o54 o54Var = (o54) obj;
        return this.f53861a.equals(o54Var.f53861a) && this.f53862b.equals(o54Var.f53862b);
    }

    public final int hashCode() {
        return this.f53862b.hashCode() + (this.f53861a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("InlineMarkdownMarker(delimiter=", this.f53861a, ", tag=", this.f53862b, ")");
    }
}
