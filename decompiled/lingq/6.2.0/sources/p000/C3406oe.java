package p000;

/* JADX INFO: renamed from: oe */
/* JADX INFO: loaded from: classes.dex */
public final class C3406oe {

    /* JADX INFO: renamed from: a */
    public final int f54237a;

    public /* synthetic */ C3406oe(int i) {
        this.f54237a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C3406oe m17944a(int i) {
        return new C3406oe(i);
    }

    /* JADX INFO: renamed from: b */
    public static String m17945b(int i) {
        return wq1.m24114j("Horizontal(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3406oe) {
            return this.f54237a == ((C3406oe) obj).f54237a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54237a);
    }

    public final String toString() {
        return m17945b(this.f54237a);
    }
}
