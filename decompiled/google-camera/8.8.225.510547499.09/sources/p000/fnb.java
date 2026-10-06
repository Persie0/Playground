package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnb {

    /* JADX INFO: renamed from: a */
    public static final fnb f22775a = m8603a(false);

    /* JADX INFO: renamed from: b */
    public static final fnb f22776b = m8603a(true);

    /* JADX INFO: renamed from: c */
    public final boolean f22777c;

    public fnb() {
    }

    public fnb(boolean z) {
        this.f22777c = z;
    }

    /* JADX INFO: renamed from: a */
    private static fnb m8603a(boolean z) {
        return new fnb(z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof fnb) && this.f22777c == ((fnb) obj).f22777c;
    }

    public final int hashCode() {
        return (true != this.f22777c ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "FirstPreviewFrameState{delivered=" + this.f22777c + "}";
    }
}
