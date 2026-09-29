package p000;

/* JADX INFO: renamed from: wj */
/* JADX INFO: loaded from: classes.dex */
public final class C3724wj implements ig7 {

    /* JADX INFO: renamed from: b */
    public final int f66898b;

    public C3724wj(int i) {
        this.f66898b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C3724wj.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f66898b == ((C3724wj) obj).f66898b;
    }

    public final int hashCode() {
        return this.f66898b;
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("AndroidPointerIcon(type="), this.f66898b, ')');
    }
}
