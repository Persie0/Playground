package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rz9 implements jn1 {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f60093a;

    public rz9(ThreadLocal threadLocal) {
        this.f60093a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rz9) && fa4.m11650l(this.f60093a, ((rz9) obj).f60093a);
    }

    public final int hashCode() {
        return this.f60093a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f60093a + ')';
    }
}
