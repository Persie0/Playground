package p000;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ib8 extends nb8 implements sd8 {

    /* JADX INFO: renamed from: a */
    public final List f43905a;

    public ib8(List list) {
        this.f43905a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib8) && this.f43905a.equals(((ib8) obj).f43905a);
    }

    public final int hashCode() {
        return this.f43905a.hashCode();
    }

    public final String toString() {
        return e65.m10874f("MatchingActivity(terms=", ")", this.f43905a);
    }
}
