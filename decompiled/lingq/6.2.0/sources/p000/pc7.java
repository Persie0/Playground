package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pc7 implements ad7 {

    /* JADX INFO: renamed from: a */
    public final ud7 f55948a;

    public pc7(ud7 ud7Var) {
        this.f55948a = ud7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc7) && this.f55948a.equals(((pc7) obj).f55948a);
    }

    public final int hashCode() {
        return this.f55948a.hashCode();
    }

    public final String toString() {
        return "OnDownload(playlistLesson=" + this.f55948a + ")";
    }
}
