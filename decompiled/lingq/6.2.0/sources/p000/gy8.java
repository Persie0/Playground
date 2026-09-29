package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gy8 {

    /* JADX INFO: renamed from: a */
    public final Class f41532a;

    /* JADX INFO: renamed from: b */
    public final Class f41533b;

    public gy8(Class cls, Class cls2) {
        this.f41532a = cls;
        this.f41533b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gy8)) {
            return false;
        }
        gy8 gy8Var = (gy8) obj;
        return gy8Var.f41532a.equals(this.f41532a) && gy8Var.f41533b.equals(this.f41533b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41532a, this.f41533b);
    }

    public final String toString() {
        return this.f41532a.getSimpleName() + " with serialization type: " + this.f41533b.getSimpleName();
    }
}
