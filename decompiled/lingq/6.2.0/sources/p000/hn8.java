package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hn8 {

    /* JADX INFO: renamed from: a */
    public final String f42661a;

    /* JADX INFO: renamed from: b */
    public final String f42662b;

    public hn8(String str, String str2) {
        str2.getClass();
        this.f42661a = str;
        this.f42662b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn8)) {
            return false;
        }
        hn8 hn8Var = (hn8) obj;
        return this.f42661a.equals(hn8Var.f42661a) && fa4.m11650l(this.f42662b, hn8Var.f42662b);
    }

    public final int hashCode() {
        return this.f42662b.hashCode() + (this.f42661a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("ScriptChunk(chunk=", this.f42661a, ", reading=", this.f42662b, ")");
    }
}
