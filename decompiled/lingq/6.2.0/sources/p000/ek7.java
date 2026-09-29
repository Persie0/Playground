package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ek7 {

    /* JADX INFO: renamed from: a */
    public final Class f37387a;

    /* JADX INFO: renamed from: b */
    public final Class f37388b;

    public ek7(Class cls, Class cls2) {
        this.f37387a = cls;
        this.f37388b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ek7)) {
            return false;
        }
        ek7 ek7Var = (ek7) obj;
        return ek7Var.f37387a.equals(this.f37387a) && ek7Var.f37388b.equals(this.f37388b);
    }

    public final int hashCode() {
        return Objects.hash(this.f37387a, this.f37388b);
    }

    public final String toString() {
        return this.f37387a.getSimpleName() + " with primitive type: " + this.f37388b.getSimpleName();
    }
}
