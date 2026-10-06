package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpn implements jpq, jpl, jpk, jpi {

    /* JADX INFO: renamed from: a */
    private final Executor f34557a;

    /* JADX INFO: renamed from: b */
    private final jpt f34558b;

    public jpn(Executor executor, jpt jptVar) {
        this.f34557a = executor;
        this.f34558b = jptVar;
    }

    @Override // p000.jpq
    /* JADX INFO: renamed from: a */
    public final void mo13446a(jpp jppVar) {
        this.f34557a.execute(new jpm(this, jppVar, 0));
    }

    @Override // p000.jpi
    /* JADX INFO: renamed from: b */
    public final void mo13447b() {
        this.f34558b.m13464p();
    }

    @Override // p000.jpk
    /* JADX INFO: renamed from: c */
    public final void mo11475c(Exception exc) {
        this.f34558b.m13462n(exc);
    }

    @Override // p000.jpl
    /* JADX INFO: renamed from: d */
    public final void mo4011d(Object obj) {
        this.f34558b.m13463o(obj);
    }
}
