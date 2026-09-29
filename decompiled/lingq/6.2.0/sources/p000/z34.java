package p000;

/* JADX INFO: loaded from: classes.dex */
public final class z34 {

    /* JADX INFO: renamed from: a */
    public final int f70830a;

    public final boolean equals(Object obj) {
        if (obj instanceof z34) {
            return this.f70830a == ((z34) obj).f70830a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f70830a);
    }

    public final String toString() {
        return wq1.m24114j("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", this.f70830a, ')');
    }
}
