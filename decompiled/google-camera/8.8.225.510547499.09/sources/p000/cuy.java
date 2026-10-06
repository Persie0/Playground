package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cuy implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9724a;

    /* JADX INFO: renamed from: b */
    private final oju f9725b;

    /* JADX INFO: renamed from: c */
    private final oju f9726c;

    /* JADX INFO: renamed from: d */
    private final oju f9727d;

    /* JADX INFO: renamed from: e */
    private final oju f9728e;

    /* JADX INFO: renamed from: f */
    private final oju f9729f;

    /* JADX INFO: renamed from: g */
    private final oju f9730g;

    /* JADX INFO: renamed from: h */
    private final oju f9731h;

    /* JADX INFO: renamed from: i */
    private final oju f9732i;

    /* JADX INFO: renamed from: j */
    private final oju f9733j;

    /* JADX INFO: renamed from: k */
    private final oju f9734k;

    /* JADX INFO: renamed from: l */
    private final oju f9735l;

    /* JADX INFO: renamed from: m */
    private final oju f9736m;

    /* JADX INFO: renamed from: n */
    private final oju f9737n;

    /* JADX INFO: renamed from: o */
    private final oju f9738o;

    /* JADX INFO: renamed from: p */
    private final oju f9739p;

    /* JADX INFO: renamed from: q */
    private final oju f9740q;

    /* JADX INFO: renamed from: r */
    private final /* synthetic */ int f9741r;

    public cuy(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, int i) {
        this.f9741r = i;
        this.f9724a = ojuVar;
        this.f9725b = ojuVar2;
        this.f9726c = ojuVar3;
        this.f9727d = ojuVar4;
        this.f9728e = ojuVar5;
        this.f9729f = ojuVar6;
        this.f9730g = ojuVar7;
        this.f9731h = ojuVar8;
        this.f9732i = ojuVar9;
        this.f9733j = ojuVar10;
        this.f9734k = ojuVar11;
        this.f9735l = ojuVar12;
        this.f9736m = ojuVar13;
        this.f9737n = ojuVar14;
        this.f9738o = ojuVar15;
        this.f9739p = ojuVar16;
        this.f9740q = ojuVar17;
    }

    public cuy(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, int i, byte[] bArr) {
        this.f9741r = i;
        this.f9727d = ojuVar;
        this.f9738o = ojuVar2;
        this.f9730g = ojuVar3;
        this.f9737n = ojuVar4;
        this.f9731h = ojuVar5;
        this.f9732i = ojuVar6;
        this.f9739p = ojuVar7;
        this.f9740q = ojuVar8;
        this.f9726c = ojuVar9;
        this.f9725b = ojuVar10;
        this.f9724a = ojuVar11;
        this.f9733j = ojuVar12;
        this.f9735l = ojuVar13;
        this.f9729f = ojuVar14;
        this.f9734k = ojuVar15;
        this.f9728e = ojuVar16;
        this.f9736m = ojuVar17;
    }

    public cuy(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, int i, char[] cArr) {
        this.f9741r = i;
        this.f9725b = ojuVar;
        this.f9724a = ojuVar2;
        this.f9726c = ojuVar3;
        this.f9735l = ojuVar4;
        this.f9727d = ojuVar5;
        this.f9739p = ojuVar6;
        this.f9737n = ojuVar7;
        this.f9729f = ojuVar8;
        this.f9733j = ojuVar9;
        this.f9731h = ojuVar10;
        this.f9740q = ojuVar11;
        this.f9730g = ojuVar12;
        this.f9728e = ojuVar13;
        this.f9732i = ojuVar14;
        this.f9734k = ojuVar15;
        this.f9736m = ojuVar16;
        this.f9738o = ojuVar17;
    }

    public cuy(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, int i, short[] sArr) {
        this.f9741r = i;
        this.f9740q = ojuVar;
        this.f9734k = ojuVar2;
        this.f9731h = ojuVar3;
        this.f9728e = ojuVar4;
        this.f9739p = ojuVar5;
        this.f9738o = ojuVar6;
        this.f9736m = ojuVar7;
        this.f9735l = ojuVar8;
        this.f9727d = ojuVar9;
        this.f9724a = ojuVar10;
        this.f9730g = ojuVar11;
        this.f9729f = ojuVar12;
        this.f9726c = ojuVar13;
        this.f9732i = ojuVar14;
        this.f9733j = ojuVar15;
        this.f9725b = ojuVar16;
        this.f9737n = ojuVar17;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f9741r) {
            case 0:
                ((emm) this.f9724a).get();
                return new cux(this.f9725b, ((cri) this.f9726c).get(), ((crv) this.f9727d).m5442a(), (cuh) this.f9728e.get(), (npu) this.f9729f.get(), (ScheduledExecutorService) this.f9730g.get(), ((cwr) this.f9731h).get(), (kbz) this.f9732i.get(), this.f9733j, (fca) this.f9734k.get(), (cwd) this.f9735l.get(), (cvy) this.f9736m.get(), ((cvi) this.f9737n).get(), (djm) this.f9738o.get(), (dhv) this.f9739p.get(), ((cvl) this.f9740q).get(), null, null, null, null);
            case 1:
                return new ckx((hwx) this.f9727d.get(), (eby) this.f9738o.get(), (fek) this.f9730g.get(), ((fdm) this.f9737n).get(), (igb) this.f9731h.get(), (jvd) this.f9732i.get(), (elx) this.f9739p.get(), ohh.m18485a(this.f9740q), (hht) this.f9726c.get(), (mrm) this.f9725b.get(), (dgb) this.f9724a.get(), ((fdn) this.f9733j).get(), (ebv) this.f9735l.get(), ((ity) this.f9729f).get(), ((hzr) this.f9734k).get(), (dhv) this.f9728e.get(), (kbz) this.f9736m.get(), null, null, null);
            case 2:
                fan fanVar = ((erq) this.f9725b).get();
                cdu cduVar = ((err) this.f9724a).get();
                jww jwwVar = (jww) this.f9726c.get();
                jww jwwVar2 = (jww) this.f9735l.get();
                BottomBarController bottomBarController = (BottomBarController) this.f9727d.get();
                eoq eoqVar = (eoq) this.f9739p.get();
                jvd jvdVar = (jvd) this.f9737n.get();
                dad dadVar = (dad) this.f9729f.get();
                iaq iaqVar = new iaq();
                icf icfVar = (icf) this.f9733j.get();
                igb igbVar = (igb) this.f9731h.get();
                daj dajVar = (daj) this.f9740q.get();
                Set set = ((ohm) this.f9730g).get();
                dbr dbrVar = (dbr) this.f9728e.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f9732i);
                msi msiVar = ((hzr) this.f9734k).get();
                fcp fcpVar = (fcp) this.f9736m.get();
                dhv dhvVar = (dhv) this.f9738o.get();
                jvb jvbVarM3529i = cduVar.m3529i();
                dab dabVar = new dab(fanVar, jwwVar, jwwVar2, bottomBarController, eoqVar, jvdVar, dadVar, iaqVar, icfVar, dajVar, igbVar, set, dbrVar, ohbVarM18485a, msiVar, fcpVar, dhvVar);
                jvbVarM3529i.m13537d(dabVar);
                return dabVar;
            default:
                return new epr(gtf.m9754c(), (jwf) this.f9740q.get(), (jwn) this.f9734k.get(), (eqc) this.f9731h.get(), (Executor) this.f9728e.get(), (nsz) this.f9739p.get(), (nsk) this.f9738o.get(), ((eqg) this.f9736m).get(), (ebv) this.f9735l.get(), (dhv) this.f9727d.get(), ((kak) this.f9724a).get(), (eqm) this.f9730g.get(), (kbz) this.f9729f.get(), ((fjp) this.f9726c).m8495b(), (gpx) this.f9732i.get(), (epy) this.f9733j.get(), (chx) this.f9725b.get(), ((eox) this.f9737n).get(), null, null, null, null, null);
        }
    }
}
