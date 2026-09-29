package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mr0 implements nr0 {

    /* JADX INFO: renamed from: a */
    public final List f51765a;

    public mr0(List list) {
        this.f51765a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mr0) && this.f51765a.equals(((mr0) obj).f51765a);
    }

    public final int hashCode() {
        return this.f51765a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("Success(rankings=", ")", this.f51765a);
    }
}
