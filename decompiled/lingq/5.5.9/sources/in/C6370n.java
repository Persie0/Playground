package in;

import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p003a2.C0009a;
import p248ln.AbstractC7403d;

/* JADX INFO: renamed from: in.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C6370n {

    /* JADX INFO: renamed from: a */
    public final String f36759a;

    /* JADX INFO: renamed from: in.n$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static C6370n m13003a(AbstractC7403d abstractC7403d) {
            if (abstractC7403d instanceof AbstractC7403d.b) {
                String strMo14805c = abstractC7403d.mo14805c();
                String strMo14804b = abstractC7403d.mo14804b();
                C5207g.m11111f(strMo14805c, "name");
                C5207g.m11111f(strMo14804b, "desc");
                return new C6370n(strMo14805c.concat(strMo14804b));
            }
            if (!(abstractC7403d instanceof AbstractC7403d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String strMo14805c2 = abstractC7403d.mo14805c();
            String strMo14804b2 = abstractC7403d.mo14804b();
            C5207g.m11111f(strMo14805c2, "name");
            C5207g.m11111f(strMo14804b2, "desc");
            return new C6370n(strMo14805c2 + '#' + strMo14804b2);
        }
    }

    public C6370n(String str) {
        this.f36759a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6370n) && C5207g.m11106a(this.f36759a, ((C6370n) obj).f36759a);
    }

    public final int hashCode() {
        return this.f36759a.hashCode();
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("MemberSignature(signature="), this.f36759a, ')');
    }
}
