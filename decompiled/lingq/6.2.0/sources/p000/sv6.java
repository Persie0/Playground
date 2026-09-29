package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class sv6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final Set f61491a;

    public sv6(Set set) {
        set.getClass();
        this.f61491a = set;
    }

    /* JADX INFO: renamed from: a */
    public final Set m21749a() {
        return this.f61491a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv6) && fa4.m11650l(this.f61491a, ((sv6) obj).f61491a);
    }

    public final int hashCode() {
        return this.f61491a.hashCode();
    }

    public final String toString() {
        return "TopicsSelected(topics=" + this.f61491a + ")";
    }
}
