package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glf implements kfc {

    /* JADX INFO: renamed from: b */
    public final kfc f25469b;

    /* JADX INFO: renamed from: c */
    public final Executor f25470c;

    /* JADX INFO: renamed from: d */
    public kfc f25471d;

    /* JADX INFO: renamed from: e */
    public boolean f25472e;

    /* JADX INFO: renamed from: g */
    private final kfk f25474g;

    /* JADX INFO: renamed from: i */
    private final kho f25476i;

    /* JADX INFO: renamed from: a */
    public final List f25468a = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final kfb f25473f = new dtb(this, 4);

    /* JADX INFO: renamed from: h */
    private final int f25475h = 3;

    public glf(kfk kfkVar, jvb jvbVar, Executor executor, kho khoVar, jwn jwnVar) {
        this.f25474g = kfkVar;
        this.f25470c = executor;
        this.f25476i = khoVar;
        gle gleVar = new gle(khoVar, 3);
        this.f25469b = gleVar;
        if (((Boolean) jwnVar.mo3831be()).booleanValue()) {
            this.f25471d = m9418r();
        } else {
            this.f25471d = gleVar;
        }
        jvbVar.m13537d(jwnVar.mo3830a(new gmb(this, kfkVar, 1), not.INSTANCE));
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: a */
    public final synchronized int mo9401a() {
        return this.f25471d.mo9401a();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: b */
    public final synchronized int mo9402b() {
        return this.f25471d.mo9402b();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: c */
    public final synchronized key mo9403c() {
        return this.f25471d.mo9403c();
    }

    @Override // p000.kfc, p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f25472e = true;
        this.f25468a.clear();
        this.f25471d.mo9412l(this.f25473f);
        gls.m9443e(this.f25474g, this.f25471d);
        this.f25471d.close();
        this.f25471d = this.f25469b;
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: d */
    public final synchronized key mo9404d(mrp mrpVar) {
        return this.f25471d.mo9404d(mrpVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: e */
    public final synchronized key mo9405e() {
        return this.f25471d.mo9405e();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: f */
    public final synchronized key mo9406f(mrp mrpVar) {
        return this.f25471d.mo9406f(mrpVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: g */
    public final synchronized key mo9407g() {
        return this.f25471d.mo9407g();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: h */
    public final synchronized key mo9408h() {
        return this.f25471d.mo9408h();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: i */
    public final synchronized List mo9409i() {
        return this.f25471d.mo9409i();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: j */
    public final synchronized List mo9410j() {
        return this.f25471d.mo9410j();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: k */
    public final synchronized void mo9411k(kfb kfbVar) {
        this.f25468a.add(kfbVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: l */
    public final synchronized void mo9412l(kfb kfbVar) {
        this.f25468a.remove(kfbVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: m */
    public final synchronized void mo9413m(int i) {
        this.f25471d.mo9413m(i);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: n */
    public final synchronized void mo9414n(kfa kfaVar) {
        this.f25471d.mo9414n(kfaVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: o */
    public final synchronized boolean mo9415o(kfd kfdVar) {
        return this.f25471d.mo9415o(kfdVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: p */
    public final synchronized boolean mo9416p() {
        return this.f25471d.mo9416p();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: q */
    public final synchronized kho mo9417q() {
        return this.f25476i;
    }

    /* JADX INFO: renamed from: r */
    public final kfc m9418r() {
        kfk kfkVar = this.f25474g;
        kfkVar.getClass();
        kho khoVar = this.f25476i;
        khoVar.getClass();
        kfc kfcVarMo14131r = kfkVar.mo14131r(khoVar, this.f25475h);
        kfcVarMo14131r.mo9411k(this.f25473f);
        return kfcVarMo14131r;
    }
}
