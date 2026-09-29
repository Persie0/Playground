package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hu0 extends iu0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f42938a;

    public hu0(Throwable th) {
        this.f42938a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hu0) {
            return fa4.m11650l(this.f42938a, ((hu0) obj).f42938a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f42938a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000.iu0
    public final String toString() {
        return "Closed(" + this.f42938a + ')';
    }
}
