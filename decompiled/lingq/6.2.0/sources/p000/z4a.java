package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class z4a {

    /* JADX INFO: renamed from: a */
    public final String f70900a;

    /* JADX INFO: renamed from: b */
    public final String f70901b;

    /* JADX INFO: renamed from: c */
    public final e28 f70902c;

    public z4a(String str, String str2, e28 e28Var) {
        str.getClass();
        e28Var.getClass();
        this.f70900a = str;
        this.f70901b = str2;
        this.f70902c = e28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4a)) {
            return false;
        }
        z4a z4aVar = (z4a) obj;
        return fa4.m11650l(this.f70900a, z4aVar.f70900a) && this.f70901b.equals(z4aVar.f70901b) && fa4.m11650l(this.f70902c, z4aVar.f70902c);
    }

    public final int hashCode() {
        return this.f70902c.hashCode() + ux5.m22980c(this.f70900a.hashCode() * 31, this.f70901b, 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("TokenPopupState(word=", this.f70900a, ", translation=", this.f70901b, ", anchorRect=");
        sbM23000w.append(this.f70902c);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
