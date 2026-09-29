package p081e0;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: e0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5318j0 {

    /* JADX INFO: renamed from: a */
    public final String f33591a;

    public C5318j0(String str) {
        this.f33591a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5318j0) && C5207g.m11106a(this.f33591a, ((C5318j0) obj).f33591a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33591a.hashCode();
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("OpaqueKey(key="), this.f33591a, ')');
    }
}
