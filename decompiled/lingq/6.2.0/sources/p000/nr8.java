package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class nr8 extends hs8 {

    /* JADX INFO: renamed from: a */
    public final uq8 f53172a;

    public nr8(uq8 uq8Var) {
        this.f53172a = uq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nr8) && this.f53172a.equals(((nr8) obj).f53172a);
    }

    public final int hashCode() {
        return this.f53172a.hashCode();
    }

    public final String toString() {
        return "OnLessonDownloadClicked(item=" + this.f53172a + ")";
    }
}
