package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class nql extends npr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqm f44066a;

    /* JADX INFO: renamed from: b */
    private final Callable f44067b;

    public nql(nqm nqmVar, Callable callable) {
        this.f44066a = nqmVar;
        callable.getClass();
        this.f44067b = callable;
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: a */
    public final Object mo17569a() {
        return this.f44067b.call();
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: b */
    public final String mo17570b() {
        return this.f44067b.toString();
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: d */
    public final void mo17572d(Throwable th) {
        this.f44066a.mo8566a(th);
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: e */
    public final void mo17573e(Object obj) {
        this.f44066a.mo14894e(obj);
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: g */
    public final boolean mo17575g() {
        return this.f44066a.isDone();
    }
}
