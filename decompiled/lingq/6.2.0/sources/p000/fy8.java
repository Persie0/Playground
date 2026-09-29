package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fy8 {

    /* JADX INFO: renamed from: a */
    public final Class f39933a;

    /* JADX INFO: renamed from: b */
    public final yk0 f39934b;

    public fy8(Class cls, yk0 yk0Var) {
        this.f39933a = cls;
        this.f39934b = yk0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fy8)) {
            return false;
        }
        fy8 fy8Var = (fy8) obj;
        return fy8Var.f39933a.equals(this.f39933a) && fy8Var.f39934b.equals(this.f39934b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39933a, this.f39934b);
    }

    public final String toString() {
        return this.f39933a.getSimpleName() + ", object identifier: " + this.f39934b;
    }
}
