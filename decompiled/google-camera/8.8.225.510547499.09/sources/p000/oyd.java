package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyd implements olw {

    /* JADX INFO: renamed from: a */
    private final ThreadLocal f46811a;

    public oyd(ThreadLocal threadLocal) {
        this.f46811a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oyd) && ooc.m18737c(this.f46811a, ((oyd) obj).f46811a);
    }

    public final int hashCode() {
        return this.f46811a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f46811a + ")";
    }
}
