package p000;

/* JADX INFO: renamed from: yw */
/* JADX INFO: loaded from: classes.dex */
public final class C3811yw {

    /* JADX INFO: renamed from: a */
    public final Object f70564a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3811yw) {
            return fa4.m11650l(this.f70564a, ((C3811yw) obj).f70564a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f70564a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.f70564a + ')';
    }
}
