package p000;

import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.concurrent.Executor;
import p021j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddr implements ddq {

    /* JADX INFO: renamed from: a */
    public final CameraFatalErrorTrackerDatabase f10578a;

    /* JADX INFO: renamed from: b */
    public final djm f10579b;

    /* JADX INFO: renamed from: c */
    private final Executor f10580c;

    public ddr(djm djmVar, CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, Executor executor, dhv dhvVar, byte[] bArr) {
        this.f10579b = djmVar;
        this.f10578a = cameraFatalErrorTrackerDatabase;
        this.f10580c = executor;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6178f();
    }

    /* JADX INFO: renamed from: l */
    public static ddp m5952l(kmq kmqVar) {
        return kmqVar == kmq.f36557a ? ddp.FRONT_ENUMERATION : ddp.BACK_ENUMERATION;
    }

    /* JADX INFO: renamed from: m */
    private static ddp m5953m(kmq kmqVar) {
        return kmqVar == kmq.f36557a ? ddp.f10573c : ddp.BACK_UNOPENABLE;
    }

    /* JADX INFO: renamed from: n */
    private final nps m5954n(ddp ddpVar) {
        return kxk.m14969O(new cpb(this, ddpVar, 2), this.f10580c);
    }

    /* JADX INFO: renamed from: o */
    private final void m5955o(ddp ddpVar) {
        this.f10580c.execute(new cuq(this, ddpVar, 8));
    }

    /* JADX INFO: renamed from: p */
    private final void m5956p(ddp... ddpVarArr) {
        this.f10580c.execute(new cuq(this, ddpVarArr, 9));
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: a */
    public final nps mo5941a(kmq kmqVar) {
        return m5954n(m5952l(kmqVar));
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: b */
    public final nps mo5942b(kmq kmqVar) {
        return m5954n(m5953m(kmqVar));
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: c */
    public final nps mo5943c() {
        return m5954n(ddp.ENUMERATION);
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: d */
    public final nps mo5944d() {
        return m5954n(ddp.f10572b);
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: e */
    public final void mo5945e(kmq... kmqVarArr) {
        m5956p((ddp[]) DesugarArrays.stream(kmqVarArr).map(cqk.f8920g).toArray(dgh.f10885b));
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: f */
    public final void mo5946f(kmq kmqVar) {
        m5955o(m5952l(kmqVar));
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: g */
    public final void mo5947g(kmq kmqVar) {
        m5956p(m5953m(kmqVar), ddp.f10572b);
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: h */
    public final void mo5948h(kmq kmqVar) {
        m5955o(m5953m(kmqVar));
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: i */
    public final void mo5949i() {
        m5956p(ddp.ENUMERATION);
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: j */
    public final void mo5950j() {
        m5955o(ddp.ENUMERATION);
    }

    @Override // p000.ddq
    /* JADX INFO: renamed from: k */
    public final void mo5951k() {
        m5955o(ddp.f10572b);
    }
}
