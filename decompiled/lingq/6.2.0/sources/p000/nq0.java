package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class nq0 implements rq0 {

    /* JADX INFO: renamed from: a */
    public final int f53112a;

    public nq0(int i) {
        this.f53112a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq0) && this.f53112a == ((nq0) obj).f53112a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53112a);
    }

    public final String toString() {
        return ux5.m22989l("RemoveBook(bookId=", this.f53112a, ")");
    }
}
