package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class jya implements kya {

    /* JADX INFO: renamed from: a */
    public final fya f46411a;

    public jya(fya fyaVar) {
        this.f46411a = fyaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jya) && this.f46411a.equals(((jya) obj).f46411a);
    }

    public final int hashCode() {
        return this.f46411a.hashCode();
    }

    public final String toString() {
        return "ShowMessage(type=" + this.f46411a + ")";
    }
}
