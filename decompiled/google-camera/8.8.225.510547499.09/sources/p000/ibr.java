package p000;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ibr implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f30242a;

    /* JADX INFO: renamed from: b */
    private final oju f30243b;

    /* JADX INFO: renamed from: c */
    private final oju f30244c;

    /* JADX INFO: renamed from: d */
    private final oju f30245d;

    /* JADX INFO: renamed from: e */
    private final oju f30246e;

    /* JADX INFO: renamed from: f */
    private final oju f30247f;

    /* JADX INFO: renamed from: g */
    private final oju f30248g;

    /* JADX INFO: renamed from: h */
    private final oju f30249h;

    /* JADX INFO: renamed from: i */
    private final oju f30250i;

    /* JADX INFO: renamed from: j */
    private final oju f30251j;

    /* JADX INFO: renamed from: k */
    private final oju f30252k;

    /* JADX INFO: renamed from: l */
    private final oju f30253l;

    /* JADX INFO: renamed from: m */
    private final oju f30254m;

    /* JADX INFO: renamed from: n */
    private final oju f30255n;

    /* JADX INFO: renamed from: o */
    private final oju f30256o;

    /* JADX INFO: renamed from: p */
    private final oju f30257p;

    /* JADX INFO: renamed from: q */
    private final oju f30258q;

    /* JADX INFO: renamed from: r */
    private final oju f30259r;

    /* JADX INFO: renamed from: s */
    private final oju f30260s;

    /* JADX INFO: renamed from: t */
    private final oju f30261t;

    /* JADX INFO: renamed from: u */
    private final /* synthetic */ int f30262u;

    public ibr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, oju ojuVar18, oju ojuVar19, oju ojuVar20, int i) {
        this.f30262u = i;
        this.f30242a = ojuVar;
        this.f30243b = ojuVar2;
        this.f30244c = ojuVar3;
        this.f30245d = ojuVar4;
        this.f30246e = ojuVar5;
        this.f30247f = ojuVar6;
        this.f30248g = ojuVar7;
        this.f30249h = ojuVar8;
        this.f30250i = ojuVar9;
        this.f30251j = ojuVar10;
        this.f30252k = ojuVar11;
        this.f30253l = ojuVar12;
        this.f30254m = ojuVar13;
        this.f30255n = ojuVar14;
        this.f30256o = ojuVar15;
        this.f30257p = ojuVar16;
        this.f30258q = ojuVar17;
        this.f30259r = ojuVar18;
        this.f30260s = ojuVar19;
        this.f30261t = ojuVar20;
    }

    public ibr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, oju ojuVar18, oju ojuVar19, oju ojuVar20, int i, byte[] bArr) {
        this.f30262u = i;
        this.f30254m = ojuVar;
        this.f30258q = ojuVar2;
        this.f30244c = ojuVar3;
        this.f30260s = ojuVar4;
        this.f30248g = ojuVar5;
        this.f30251j = ojuVar6;
        this.f30252k = ojuVar7;
        this.f30259r = ojuVar8;
        this.f30245d = ojuVar9;
        this.f30247f = ojuVar10;
        this.f30249h = ojuVar11;
        this.f30261t = ojuVar12;
        this.f30255n = ojuVar13;
        this.f30257p = ojuVar14;
        this.f30256o = ojuVar15;
        this.f30250i = ojuVar16;
        this.f30243b = ojuVar17;
        this.f30253l = ojuVar18;
        this.f30246e = ojuVar19;
        this.f30242a = ojuVar20;
    }

    public ibr(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, oju ojuVar18, oju ojuVar19, oju ojuVar20, int i, char[] cArr) {
        this.f30262u = i;
        this.f30245d = ojuVar;
        this.f30251j = ojuVar2;
        this.f30249h = ojuVar3;
        this.f30257p = ojuVar4;
        this.f30261t = ojuVar5;
        this.f30259r = ojuVar6;
        this.f30242a = ojuVar7;
        this.f30243b = ojuVar8;
        this.f30258q = ojuVar9;
        this.f30248g = ojuVar10;
        this.f30250i = ojuVar11;
        this.f30244c = ojuVar12;
        this.f30256o = ojuVar13;
        this.f30255n = ojuVar14;
        this.f30254m = ojuVar15;
        this.f30260s = ojuVar16;
        this.f30252k = ojuVar17;
        this.f30247f = ojuVar18;
        this.f30246e = ojuVar19;
        this.f30253l = ojuVar20;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f30262u) {
            case 0:
                WindowManager windowManager = ((emc) this.f30242a).get();
                fcp fcpVar = (fcp) this.f30243b.get();
                BottomBarController bottomBarController = (BottomBarController) this.f30244c.get();
                cdu cduVar = ((err) this.f30245d).get();
                igb igbVar = (igb) this.f30246e.get();
                eoq eoqVar = (eoq) this.f30247f.get();
                icx icxVar = (icx) this.f30248g.get();
                boolean zBooleanValue = ((cde) this.f30249h).m3490a().booleanValue();
                kbz kbzVar = (kbz) this.f30250i.get();
                Context contextM6830a = ((dws) this.f30251j).m6830a();
                bko bkoVar = ((ers) this.f30252k).get();
                fma fmaVar = (fma) this.f30253l.get();
                hkx hkxVar = (hkx) this.f30254m.get();
                gfa gfaVar = (gfa) this.f30255n.get();
                ohh.m18485a(this.f30256o);
                ((cde) this.f30257p).m3490a().booleanValue();
                return new ibq(windowManager, fcpVar, bottomBarController, cduVar, igbVar, eoqVar, icxVar, zBooleanValue, kbzVar, contextM6830a, bkoVar, fmaVar, hkxVar, gfaVar, (dhv) this.f30260s.get(), ((hzr) this.f30261t).get(), null, null);
            case 1:
                Activity activity = ((ema) this.f30254m).get();
                mrm mrmVar = (mrm) ((ohj) this.f30258q).f46012a;
                chk chkVar = (chk) this.f30244c.get();
                jfs jfsVar = ((hrm) this.f30260s).get();
                hro hroVar = (hro) this.f30248g.get();
                jww jwwVar = (jww) this.f30252k.get();
                jww jwwVar2 = (jww) this.f30259r.get();
                fba fbaVar = ((eru) this.f30245d).get();
                boolean zBooleanValue2 = ((ino) this.f30247f).get().booleanValue();
                dhv dhvVar = (dhv) this.f30249h.get();
                jvd jvdVar = (jvd) this.f30261t.get();
                gfa gfaVar2 = (gfa) this.f30255n.get();
                return new hrk(activity, mrmVar, chkVar, jfsVar, hroVar, jwwVar, jwwVar2, fbaVar, zBooleanValue2, dhvVar, jvdVar, gfaVar2, (ceb) this.f30256o.get(), (hah) this.f30250i.get(), (hai) this.f30243b.get(), (fls) this.f30253l.get(), (guk) this.f30246e.get(), ((ina) this.f30242a).get(), null, null, null);
            default:
                return new irg(((ema) this.f30245d).get(), ((dws) this.f30251j).m6830a(), (kov) this.f30249h.get(), ((iqv) this.f30257p).get(), (jww) this.f30261t.get(), ((irc) this.f30259r).get(), ((ity) this.f30242a).get(), (jww) this.f30243b.get(), (hht) this.f30258q.get(), (fcp) this.f30248g.get(), (iri) this.f30250i.get(), (dbr) this.f30244c.get(), (iht) this.f30256o.get(), (igb) this.f30255n.get(), (BottomBarController) this.f30254m.get(), (hwx) this.f30260s.get(), (jww) this.f30252k.get(), (mrm) this.f30247f.get(), (iqz) this.f30246e.get(), (kbz) this.f30253l.get());
        }
    }
}
