package p124fp;

import dm.C5207g;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fp.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C5613j extends C5628y {

    /* JADX INFO: renamed from: e */
    public C5628y f34439e;

    public C5613j(C5628y c5628y) {
        C5207g.m11111f(c5628y, "delegate");
        this.f34439e = c5628y;
    }

    @Override // p124fp.C5628y
    /* JADX INFO: renamed from: a */
    public final C5628y mo11980a() {
        return this.f34439e.mo11980a();
    }

    @Override // p124fp.C5628y
    /* JADX INFO: renamed from: b */
    public final C5628y mo11981b() {
        return this.f34439e.mo11981b();
    }

    @Override // p124fp.C5628y
    /* JADX INFO: renamed from: c */
    public final long mo11982c() {
        return this.f34439e.mo11982c();
    }

    @Override // p124fp.C5628y
    /* JADX INFO: renamed from: d */
    public final C5628y mo11983d(long j10) {
        return this.f34439e.mo11983d(j10);
    }

    @Override // p124fp.C5628y
    /* JADX INFO: renamed from: e */
    public final boolean mo11984e() {
        return this.f34439e.mo11984e();
    }

    @Override // p124fp.C5628y
    /* JADX INFO: renamed from: f */
    public final void mo11985f() throws IOException {
        this.f34439e.mo11985f();
    }

    @Override // p124fp.C5628y
    /* JADX INFO: renamed from: g */
    public final C5628y mo11986g(long j10, TimeUnit timeUnit) {
        C5207g.m11111f(timeUnit, "unit");
        return this.f34439e.mo11986g(j10, timeUnit);
    }
}
