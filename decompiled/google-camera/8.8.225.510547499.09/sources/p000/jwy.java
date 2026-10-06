package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class jwy implements jwn {

    /* JADX INFO: renamed from: a */
    public volatile Object f34974a;

    /* JADX INFO: renamed from: b */
    private final jws f34975b = new jws(new dfg(this, 11));

    public jwy(Object obj) {
        this.f34974a = obj;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        return this.f34975b.mo3830a(kbgVar, executor);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final Object mo3831be() {
        return this.f34975b.mo3831be();
    }

    /* JADX INFO: renamed from: c */
    public final void m13646c() {
        this.f34975b.m13643c();
    }
}
