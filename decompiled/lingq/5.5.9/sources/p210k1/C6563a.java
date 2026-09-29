package p210k1;

import dm.C5207g;
import sl.InterfaceC9068a;

/* JADX INFO: renamed from: k1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6563a<T extends InterfaceC9068a<? extends Boolean>> {

    /* JADX INFO: renamed from: a */
    public final String f37362a;

    /* JADX INFO: renamed from: b */
    public final T f37363b;

    public C6563a(String str, T t10) {
        this.f37362a = str;
        this.f37363b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6563a)) {
            return false;
        }
        C6563a c6563a = (C6563a) obj;
        return C5207g.m11106a(this.f37362a, c6563a.f37362a) && C5207g.m11106a(this.f37363b, c6563a.f37363b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f37362a;
        int iHashCode2 = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.f37363b;
        if (t10 != null) {
            iHashCode = t10.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f37362a + ", action=" + this.f37363b + ')';
    }
}
