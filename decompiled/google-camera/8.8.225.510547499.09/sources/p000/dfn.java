package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dfn {

    /* JADX INFO: renamed from: a */
    public final Object f10788a;

    /* JADX INFO: renamed from: b */
    public final Object f10789b;

    /* JADX INFO: renamed from: c */
    public final Object f10790c;

    /* JADX INFO: renamed from: d */
    public final Object f10791d;

    /* JADX INFO: renamed from: e */
    public final Object f10792e;

    /* JADX INFO: renamed from: f */
    public final Object f10793f;

    public dfn(buj bujVar, buj bujVar2, buj bujVar3, ljf ljfVar, ljf ljfVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f10792e = cbp.m3396b(150, new bsl(this, 0, null, null, null, null));
        this.f10790c = bujVar;
        this.f10793f = bujVar2;
        this.f10791d = bujVar3;
        this.f10789b = ljfVar;
        this.f10788a = ljfVar2;
    }

    public dfn(BottomBarController bottomBarController, igb igbVar, iuj iujVar, gfa gfaVar, jww jwwVar, dox doxVar) {
        this.f10789b = bottomBarController;
        this.f10791d = igbVar;
        this.f10790c = iujVar;
        this.f10792e = gfaVar;
        this.f10788a = jwwVar;
        this.f10793f = doxVar;
    }

    public dfn(dgi dgiVar, dgu dguVar, dgo dgoVar, dsx dsxVar, dgb dgbVar, dfo dfoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10788a = dgiVar;
        this.f10789b = dguVar;
        this.f10790c = dgoVar;
        this.f10791d = dsxVar;
        this.f10792e = dgbVar;
        this.f10793f = dfoVar;
    }

    public dfn(dhv dhvVar, oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        this.f10793f = dhvVar;
        this.f10788a = ojuVar;
        this.f10789b = ojuVar2;
        this.f10792e = ojuVar3;
        this.f10791d = ojuVar4;
        this.f10790c = ojuVar5;
    }

    public dfn(geg gegVar, ggi ggiVar, fvu fvuVar, jwn jwnVar, kpa kpaVar, dhv dhvVar, byte[] bArr) {
        this.f10791d = gegVar;
        this.f10789b = ggiVar;
        this.f10788a = fvuVar;
        this.f10793f = kpaVar;
        this.f10792e = dhvVar;
        this.f10790c = jwnVar;
    }

    public dfn(hnw hnwVar, hnv hnvVar, jvd jvdVar) {
        this.f10790c = new AtomicBoolean(false);
        jwf jwfVar = new jwf(false);
        this.f10791d = jwfVar;
        this.f10792e = jwj.m13624c(jwfVar);
        this.f10793f = hnwVar;
        this.f10789b = hnvVar;
        this.f10788a = jvdVar;
    }

    public dfn(oju ojuVar, oju ojuVar2, oju ojuVar3, Executor executor, Executor executor2, kbz kbzVar) {
        this.f10791d = new AtomicBoolean(false);
        this.f10793f = new kcf(executor, kbzVar, "ActivityStartup");
        this.f10792e = new kcf(executor2, kbzVar, "ActivityStartup");
        this.f10790c = ojuVar;
        this.f10789b = ojuVar2;
        this.f10788a = ojuVar3;
    }

    /* JADX INFO: renamed from: f */
    public static final void m6063f(kfk kfkVar, csl cslVar, csn csnVar) {
        int i;
        if (((jwf) cslVar.f9277g).f34942d == csj.RECORDING_SESSION_ACTIVE) {
            i = csnVar.f9350o ? 3 : 1;
        } else {
            i = 4;
        }
        kew kewVarMo14115b = kfkVar.mo14115b();
        ((kgo) kewVarMo14115b).f35933d = Integer.valueOf(i);
        kfkVar.mo14128o(kewVarMo14115b.mo14090a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r1v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    private final MeteringRectangle[] m6064l(fux fuxVar) {
        if (!geg.m9089g(this.f10788a, this.f10792e)) {
            return fuxVar.mo3457b(((gef) ((jxc) this.f10791d).mo3831be()).f24363a);
        }
        boolean z = ((kpa) this.f10793f).f36761d;
        return fuxVar.mo3457b(((geg) this.f10791d).m9090c().f24363a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: m */
    private final MeteringRectangle[] m6065m(PointF pointF, int i) {
        int iIntValue = this.f10792e.mo6184l(dib.f11315bV) ? ((Integer) this.f10790c.mo3831be()).intValue() : ((kmr) this.f10788a).mo14553f();
        lku.m15670x(iIntValue % 90 == 0, "sensorOrientation must be a multiple of 90");
        lku.m15670x(iIntValue >= 0, "sensorOrientation must not be negative");
        return m6064l(new ccp(pointF, pointF, new oyo(iIntValue % 360), i, null, null));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ddq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ddq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: a */
    public final void m6066a(kmq kmqVar, int i, int i2) {
        nps npsVarMo5941a;
        int iM5666n;
        int iM5665m;
        if (i2 == 3) {
            npsVarMo5941a = this.f10790c.mo5942b(kmqVar);
            iM5666n = ((cwd) this.f10793f).m5668p();
            iM5665m = ((cwd) this.f10793f).m5667o();
        } else {
            npsVarMo5941a = this.f10790c.mo5941a(kmqVar);
            iM5666n = ((cwd) this.f10793f).m5666n();
            iM5665m = ((cwd) this.f10793f).m5665m();
        }
        kxk.m14975U(npsVarMo5941a, new dcd(this, kmqVar, i, i2, iM5666n, iM5665m, null), this.f10791d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v3, types: [igb, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m6067b() {
        this.f10788a.mo3415bf(true);
        ((BottomBarController) this.f10789b).resumeRecording();
        this.f10791d.mo11250v();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [iuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [dox, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final void m6068c() {
        this.f10792e.mo9127m();
        this.f10788a.mo3415bf(true);
        ite iteVar = (ite) this.f10790c;
        iteVar.f32057H.setSoundEffectsEnabled(false);
        iteVar.f32056G.setSoundEffectsEnabled(false);
        ?? r0 = this.f10790c;
        ((ite) r0).f32071V = false;
        r0.mo11767r(false);
        this.f10793f.mo6470f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v3, types: [igb, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m6069d() {
        this.f10788a.mo3415bf(false);
        ((BottomBarController) this.f10789b).pauseRecording();
        this.f10791d.mo11246r();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gfa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [iuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [dox, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m6070e() {
        this.f10792e.mo9126l();
        this.f10788a.mo3415bf(false);
        ite iteVar = (ite) this.f10790c;
        iteVar.f32057H.setSoundEffectsEnabled(true);
        iteVar.f32056G.setSoundEffectsEnabled(true);
        ?? r0 = this.f10790c;
        ((ite) r0).f32071V = true;
        r0.mo11767r(true);
        this.f10793f.mo6473i();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: g */
    public final void m6071g(int i) {
        if (((AtomicBoolean) this.f10791d).compareAndSet(false, true)) {
            switch (i - 1) {
                case 1:
                    jbx.m12871p(this.f10790c, this.f10793f);
                    jbx.m12871p(this.f10789b, this.f10793f);
                    jbx.m12871p(this.f10788a, this.f10793f);
                    break;
                default:
                    jbx.m12871p(this.f10789b, this.f10793f);
                    jbx.m12871p(this.f10788a, this.f10792e);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final MeteringRectangle[] m6072h() {
        MeteringRectangle[] meteringRectangleArr = fuv.f23610a;
        fuv fuvVar = fuu.f23609a;
        Rect rect = ((gef) ((jxc) this.f10791d).mo3831be()).f24363a;
        return fuv.f23610a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: i */
    public final MeteringRectangle[] m6073i(PointF pointF) {
        return m6064l(ccp.m3453c(pointF, pointF, this.f10792e.mo6184l(dib.f11315bV) ? ((Integer) this.f10790c.mo3831be()).intValue() : ((kmr) this.f10788a).mo14553f()));
    }

    /* JADX INFO: renamed from: j */
    public final MeteringRectangle[] m6074j(PointF pointF) {
        return m6065m(pointF, 2);
    }

    /* JADX INFO: renamed from: k */
    public final MeteringRectangle[] m6075k(PointF pointF) {
        return m6065m(pointF, 1);
    }

    public dfn(kpa kpaVar, csm csmVar, cwd cwdVar, dhv dhvVar, guk gukVar, dnf dnfVar, byte[] bArr) {
        cxk cxkVar = cxk.OFF;
        this.f10788a = kpaVar;
        this.f10789b = csmVar;
        this.f10793f = cwdVar;
        this.f10792e = dhvVar;
        this.f10790c = gukVar;
        this.f10791d = dnfVar;
    }

    public dfn(jvd jvdVar, ddq ddqVar, dcm dcmVar, cwd cwdVar, kbo kboVar, dcf dcfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10791d = jvdVar;
        this.f10790c = ddqVar;
        this.f10788a = dcmVar;
        this.f10793f = cwdVar;
        this.f10792e = dcfVar;
        this.f10789b = kboVar.mo6314a("FallbackHandler");
    }
}
