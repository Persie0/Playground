package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ns8 extends ws8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f53202a;

    public ns8(uq8 uq8Var) {
        this.f53202a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns8) && this.f53202a.equals(((ns8) obj).f53202a);
    }

    public final int hashCode() {
        return this.f53202a.hashCode();
    }

    public final String toString() {
        return "OnAddLessonToPlaylist(item=" + this.f53202a + ")";
    }
}
