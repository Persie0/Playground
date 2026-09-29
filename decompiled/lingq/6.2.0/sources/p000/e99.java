package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e99 implements g99 {

    /* JADX INFO: renamed from: a */
    public final Set f36889a;

    public e99(Set set) {
        this.f36889a = set;
        if (set.isEmpty()) {
            C3386nv.m17626m("The set of sizes cannot be empty");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e99.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f36889a.equals(((e99) obj).f36889a);
    }

    public final int hashCode() {
        return this.f36889a.hashCode();
    }

    public final String toString() {
        return "SizeMode.Responsive(sizes=" + this.f36889a + ')';
    }
}
