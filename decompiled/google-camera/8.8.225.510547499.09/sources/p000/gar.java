package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gar implements gav {

    /* JADX INFO: renamed from: a */
    public final fua f24048a;

    /* JADX INFO: renamed from: b */
    public final jvd f24049b;

    /* JADX INFO: renamed from: d */
    public final gyh f24051d;

    /* JADX INFO: renamed from: f */
    private gau f24053f;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f24052e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f24050c = new AtomicBoolean(true);

    public gar(fua fuaVar, jvd jvdVar, gyh gyhVar) {
        this.f24048a = fuaVar;
        this.f24049b = jvdVar;
        this.f24051d = gyhVar;
    }

    @Override // p000.gav
    /* JADX INFO: renamed from: a */
    public final gau mo9008a() {
        lku.m15613H(!this.f24052e.getAndSet(true));
        gao gaoVar = new gao(this);
        this.f24053f = gaoVar;
        return gaoVar;
    }

    @Override // p000.gav
    /* JADX INFO: renamed from: b */
    public final gau mo9009b() {
        lku.m15613H(!this.f24052e.getAndSet(true));
        gap gapVar = new gap(this);
        this.f24053f = gapVar;
        return gapVar;
    }

    @Override // p000.gav
    /* JADX INFO: renamed from: c */
    public final gau mo9010c() {
        lku.m15613H(!this.f24052e.getAndSet(true));
        gaq gaqVar = new gaq(this);
        this.f24053f = gaqVar;
        return gaqVar;
    }

    @Override // p000.gav
    /* JADX INFO: renamed from: d */
    public final gau mo9011d() {
        return this.f24053f;
    }

    @Override // p000.gav
    /* JADX INFO: renamed from: e */
    public final gau mo9012e() {
        gau gauVar = this.f24053f;
        return gauVar != null ? gauVar : mo9010c();
    }

    @Override // p000.gav
    /* JADX INFO: renamed from: f */
    public final void mo9013f() {
        this.f24049b.execute(new fzz(this, 3));
    }

    /* JADX INFO: renamed from: g */
    public final void m9014g() {
        this.f24051d.mo9919y();
        this.f24048a.f23574b.mo7885c();
    }

    @Override // p000.gav
    /* JADX INFO: renamed from: h */
    public final void mo9015h() {
        this.f24052e.set(false);
    }
}
