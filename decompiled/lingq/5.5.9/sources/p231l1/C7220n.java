package p231l1;

import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: l1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7220n {

    /* JADX INFO: renamed from: a */
    public final String f40602a;

    public C7220n(String str) {
        C5207g.m11111f(str, "url");
        this.f40602a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7220n) {
            return C5207g.m11106a(this.f40602a, ((C7220n) obj).f40602a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40602a.hashCode();
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("UrlAnnotation(url="), this.f40602a, ')');
    }
}
