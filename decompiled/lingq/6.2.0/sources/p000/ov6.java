package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ov6 extends vv6 {

    /* JADX INFO: renamed from: a */
    public final Set f55034a;

    public ov6(Set set) {
        set.getClass();
        this.f55034a = set;
    }

    /* JADX INFO: renamed from: a */
    public final Set m18523a() {
        return this.f55034a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov6) && fa4.m11650l(this.f55034a, ((ov6) obj).f55034a);
    }

    public final int hashCode() {
        return this.f55034a.hashCode();
    }

    public final String toString() {
        return "SkillsSelected(skills=" + this.f55034a + ")";
    }
}
