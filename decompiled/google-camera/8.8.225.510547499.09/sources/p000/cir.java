package p000;

import android.hardware.display.DisplayManager;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cir implements chl {

    /* JADX INFO: renamed from: A */
    private final oju f5861A;

    /* JADX INFO: renamed from: B */
    private final oju f5862B;

    /* JADX INFO: renamed from: a */
    private final oju f5863a;

    /* JADX INFO: renamed from: b */
    private final oju f5864b;

    /* JADX INFO: renamed from: c */
    private final oju f5865c;

    /* JADX INFO: renamed from: d */
    private final oju f5866d;

    /* JADX INFO: renamed from: e */
    private final oju f5867e;

    /* JADX INFO: renamed from: f */
    private final oju f5868f;

    /* JADX INFO: renamed from: g */
    private final oju f5869g;

    /* JADX INFO: renamed from: h */
    private final oju f5870h;

    /* JADX INFO: renamed from: i */
    private final oju f5871i;

    /* JADX INFO: renamed from: j */
    private final oju f5872j;

    /* JADX INFO: renamed from: k */
    private final oju f5873k;

    /* JADX INFO: renamed from: l */
    private final oju f5874l;

    /* JADX INFO: renamed from: m */
    private final oju f5875m;

    /* JADX INFO: renamed from: n */
    private final oju f5876n;

    /* JADX INFO: renamed from: o */
    private final oju f5877o;

    /* JADX INFO: renamed from: p */
    private final oju f5878p;

    /* JADX INFO: renamed from: q */
    private final oju f5879q;

    /* JADX INFO: renamed from: r */
    private final oju f5880r;

    /* JADX INFO: renamed from: s */
    private final oju f5881s;

    /* JADX INFO: renamed from: t */
    private final oju f5882t;

    /* JADX INFO: renamed from: u */
    private final oju f5883u;

    /* JADX INFO: renamed from: v */
    private final oju f5884v;

    /* JADX INFO: renamed from: w */
    private final oju f5885w;

    /* JADX INFO: renamed from: x */
    private final oju f5886x;

    /* JADX INFO: renamed from: y */
    private final oju f5887y;

    /* JADX INFO: renamed from: z */
    private final oju f5888z;

    public cir(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, oju ojuVar18, oju ojuVar19, oju ojuVar20, oju ojuVar21, oju ojuVar22, oju ojuVar23, oju ojuVar24, oju ojuVar25, oju ojuVar26, oju ojuVar27, oju ojuVar28) {
        ojuVar.getClass();
        this.f5863a = ojuVar;
        ojuVar2.getClass();
        this.f5864b = ojuVar2;
        ojuVar3.getClass();
        this.f5865c = ojuVar3;
        ojuVar4.getClass();
        this.f5866d = ojuVar4;
        this.f5867e = ojuVar5;
        ojuVar6.getClass();
        this.f5868f = ojuVar6;
        ojuVar7.getClass();
        this.f5869g = ojuVar7;
        ojuVar8.getClass();
        this.f5870h = ojuVar8;
        ojuVar9.getClass();
        this.f5871i = ojuVar9;
        ojuVar10.getClass();
        this.f5872j = ojuVar10;
        ojuVar11.getClass();
        this.f5873k = ojuVar11;
        this.f5874l = ojuVar12;
        ojuVar13.getClass();
        this.f5875m = ojuVar13;
        ojuVar14.getClass();
        this.f5876n = ojuVar14;
        ojuVar15.getClass();
        this.f5877o = ojuVar15;
        this.f5878p = ojuVar16;
        ojuVar17.getClass();
        this.f5879q = ojuVar17;
        ojuVar18.getClass();
        this.f5880r = ojuVar18;
        ojuVar19.getClass();
        this.f5881s = ojuVar19;
        ojuVar20.getClass();
        this.f5882t = ojuVar20;
        ojuVar21.getClass();
        this.f5883u = ojuVar21;
        ojuVar22.getClass();
        this.f5884v = ojuVar22;
        ojuVar23.getClass();
        this.f5885w = ojuVar23;
        this.f5886x = ojuVar24;
        ojuVar25.getClass();
        this.f5887y = ojuVar25;
        ojuVar26.getClass();
        this.f5888z = ojuVar26;
        ojuVar27.getClass();
        this.f5861A = ojuVar27;
        ojuVar28.getClass();
        this.f5862B = ojuVar28;
    }

    @Override // p000.chl
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ chm mo3710a(boolean z) {
        chj chjVar = (chj) this.f5863a.get();
        chjVar.getClass();
        Object obj = this.f5864b.get();
        iid iidVar = ((iig) this.f5865c).get();
        djm djmVar = (djm) this.f5866d.get();
        djmVar.getClass();
        hzu hzuVar = (hzu) this.f5867e.get();
        hzuVar.getClass();
        iht ihtVar = (iht) this.f5868f.get();
        ihtVar.getClass();
        cdu cduVar = ((err) this.f5869g).get();
        Object obj2 = this.f5870h.get();
        WindowManager windowManager = ((emc) this.f5871i).get();
        htf htfVar = (htf) this.f5872j.get();
        htfVar.getClass();
        huu huuVar = (huu) this.f5873k.get();
        huuVar.getClass();
        ((jpd) this.f5874l.get()).getClass();
        cht chtVar = (cht) this.f5875m.get();
        chtVar.getClass();
        BottomBarController bottomBarController = (BottomBarController) this.f5876n.get();
        bottomBarController.getClass();
        igb igbVar = (igb) this.f5877o.get();
        igbVar.getClass();
        eoq eoqVar = (eoq) this.f5878p.get();
        eoqVar.getClass();
        fcp fcpVar = (fcp) this.f5879q.get();
        fcpVar.getClass();
        CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.f5880r.get();
        cameraActivityTiming.getClass();
        oju ojuVar = this.f5881s;
        icf icfVar = (icf) this.f5882t.get();
        icfVar.getClass();
        hxp hxpVar = (hxp) this.f5883u.get();
        hxpVar.getClass();
        gfa gfaVar = (gfa) this.f5884v.get();
        gfaVar.getClass();
        jfs jfsVar = (jfs) this.f5885w.get();
        jfsVar.getClass();
        Consumer consumer = (Consumer) this.f5886x.get();
        consumer.getClass();
        dnf dnfVar = (dnf) this.f5887y.get();
        dnfVar.getClass();
        dhv dhvVar = (dhv) this.f5888z.get();
        dhvVar.getClass();
        gvy gvyVar = (gvy) this.f5861A.get();
        gvyVar.getClass();
        imy imyVar = (imy) this.f5862B.get();
        imyVar.getClass();
        return new ciq(chjVar, (MainActivityLayout) obj, iidVar, djmVar, hzuVar, ihtVar, cduVar, (DisplayManager) obj2, windowManager, htfVar, huuVar, chtVar, bottomBarController, igbVar, eoqVar, fcpVar, cameraActivityTiming, ojuVar, icfVar, hxpVar, gfaVar, jfsVar, consumer, dnfVar, dhvVar, gvyVar, imyVar, z, null, null, null);
    }
}
