package p231l1;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: l1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7221o extends AbstractC7219m {

    /* JADX INFO: renamed from: a */
    public final String f40603a;

    public C7221o(String str) {
        C5207g.m11111f(str, "verbatim");
        this.f40603a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7221o) {
            return C5207g.m11106a(this.f40603a, ((C7221o) obj).f40603a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40603a.hashCode();
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f40603a, ')');
    }
}
