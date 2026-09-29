package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ur2 implements nn3 {

    /* JADX INFO: renamed from: a */
    public final boolean f64246a;

    public ur2(boolean z) {
        this.f64246a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ur2) && this.f64246a == ((ur2) obj).f64246a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64246a);
    }

    public final String toString() {
        return ux5.m22993p(new StringBuilder("EnabledModifier(enabled="), this.f64246a, ')');
    }
}
