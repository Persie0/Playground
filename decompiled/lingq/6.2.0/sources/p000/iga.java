package p000;

/* JADX INFO: loaded from: classes.dex */
public final class iga extends m88 implements yd9 {

    /* JADX INFO: renamed from: c */
    public final xv5 f44093c;

    /* JADX INFO: renamed from: d */
    public final long f44094d;

    public iga(xv5 xv5Var, long j) {
        this.f44093c = xv5Var;
        this.f44094d = j;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) {
        aj0Var.getClass();
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: b */
    public final long mo3001b() {
        return this.f44094d;
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: c */
    public final xv5 mo3002c() {
        return this.f44093c;
    }

    @Override // p000.m88, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.m88
    /* JADX INFO: renamed from: e */
    public final hj0 mo3003e() {
        return new e18(this);
    }

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return c1a.f9314d;
    }
}
