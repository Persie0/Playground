package p000;

import android.graphics.Point;
import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class foe extends chw {

    /* JADX INFO: renamed from: b */
    public final icf f22917b;

    /* JADX INFO: renamed from: c */
    public final kbg f22918c;

    /* JADX INFO: renamed from: d */
    public final foh f22919d;

    /* JADX INFO: renamed from: e */
    public final bko f22920e;

    /* JADX INFO: renamed from: f */
    private final kbz f22921f;

    /* JADX INFO: renamed from: g */
    private final iad f22922g;

    /* JADX INFO: renamed from: h */
    private final iuj f22923h;

    /* JADX INFO: renamed from: i */
    private final Executor f22924i;

    /* JADX INFO: renamed from: j */
    private final fon f22925j;

    /* JADX INFO: renamed from: k */
    private nps f22926k;

    /* JADX INFO: renamed from: l */
    private final drj f22927l;

    public foe(icf icfVar, kbz kbzVar, iad iadVar, bko bkoVar, iuj iujVar, kbg kbgVar, Executor executor, drj drjVar, foh fohVar, fon fonVar, byte[] bArr, byte[] bArr2) {
        this.f22917b = icfVar;
        this.f22921f = kbzVar;
        this.f22922g = iadVar;
        this.f22920e = bkoVar;
        this.f22923h = iujVar;
        this.f22918c = kbgVar;
        this.f22924i = executor;
        this.f22927l = drjVar;
        this.f22919d = fohVar;
        this.f22925j = fonVar;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        this.f22922g.m10979e().onPause();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f22919d.close();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        this.f22917b.mo11013l(true);
        foh fohVar = this.f22919d;
        jvd.m13538a();
        kfk kfkVar = fohVar.f22935e;
        if (kfkVar != null) {
            kfkVar.mo14120g();
        }
        this.f22922g.m10979e().onResume();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.WindowManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kme] */
    /* JADX WARN: Type inference failed for: r3v0, types: [dhv, java.lang.Object] */
    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final synchronized void mo3780n() {
        this.f22921f.mo13961e("MORE_MODES-start");
        drj drjVar = this.f22927l;
        kmg kmgVarM6439b = ((dnn) drjVar.f12397c).m6439b(drjVar.f12395a, drjVar.f12396b, ((dbr) drjVar.f12398d).mo5895d());
        kmgVarM6439b.getClass();
        fvu fvuVarM14581f = ((kms) drjVar.f12395a).m14581f(kmgVarM6439b);
        Point point = new Point();
        drjVar.f12399e.getDefaultDisplay().getSize(point);
        kbc kbcVar = (kbc) Collections.max(lku.m15650d(fvuVarM14581f.mo14572y(), new isr(kbc.m13901f(point).m13908e(), 1)), C1143ye.f48118b);
        if (kbcVar == null) {
            throw new NullPointerException("Null previewSize");
        }
        fol folVar = new fol(kmgVarM6439b, kbcVar);
        fon fonVar = this.f22925j;
        kmq kmqVarMo5895d = fonVar.f22953a.mo5895d();
        kbc kbcVar2 = folVar.f22947b;
        ihx ihxVarM11369a = ihx.m11369a(kmqVarMo5895d, kbcVar2, kan.m13873j(kbcVar2));
        if (((Boolean) fonVar.f22956d.mo3831be()).booleanValue()) {
            fonVar.f22957e = fonVar.f22955c.mo16808b(fod.f22898c);
        } else {
            fonVar.f22957e = mqu.f41450a;
        }
        nps npsVarM17553i = nod.m17553i(fonVar.f22954b.m11367f(ihxVarM11369a, fonVar.f22957e, Integer.valueOf(fonVar.f22958f.m14581f(folVar.f22946a).mo14553f())), new dvz(this, folVar, 2), this.f22924i);
        this.f22926k = npsVarM17553i;
        jvh.m13561i(npsVarM17553i, new cis(this, 19));
        this.f22923h.mo11773x();
        this.f22921f.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final synchronized void mo3781p() {
        nps npsVar = this.f22926k;
        if (npsVar != null && !npsVar.isDone()) {
            this.f22926k.cancel(false);
        }
        this.f22926k = null;
        this.f22919d.close();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: v */
    public final boolean mo3787v() {
        return false;
    }
}
