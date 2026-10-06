package p000;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewb implements ohi {

    /* JADX INFO: renamed from: A */
    private final oju f20569A;

    /* JADX INFO: renamed from: B */
    private final oju f20570B;

    /* JADX INFO: renamed from: C */
    private final oju f20571C;

    /* JADX INFO: renamed from: D */
    private final oju f20572D;

    /* JADX INFO: renamed from: E */
    private final oju f20573E;

    /* JADX INFO: renamed from: F */
    private final oju f20574F;

    /* JADX INFO: renamed from: G */
    private final oju f20575G;

    /* JADX INFO: renamed from: H */
    private final oju f20576H;

    /* JADX INFO: renamed from: I */
    private final oju f20577I;

    /* JADX INFO: renamed from: J */
    private final oju f20578J;

    /* JADX INFO: renamed from: K */
    private final oju f20579K;

    /* JADX INFO: renamed from: L */
    private final oju f20580L;

    /* JADX INFO: renamed from: M */
    private final oju f20581M;

    /* JADX INFO: renamed from: N */
    private final oju f20582N;

    /* JADX INFO: renamed from: O */
    private final oju f20583O;

    /* JADX INFO: renamed from: P */
    private final oju f20584P;

    /* JADX INFO: renamed from: Q */
    private final oju f20585Q;

    /* JADX INFO: renamed from: R */
    private final oju f20586R;

    /* JADX INFO: renamed from: S */
    private final oju f20587S;

    /* JADX INFO: renamed from: T */
    private final oju f20588T;

    /* JADX INFO: renamed from: U */
    private final oju f20589U;

    /* JADX INFO: renamed from: V */
    private final oju f20590V;

    /* JADX INFO: renamed from: W */
    private final oju f20591W;

    /* JADX INFO: renamed from: X */
    private final oju f20592X;

    /* JADX INFO: renamed from: Y */
    private final oju f20593Y;

    /* JADX INFO: renamed from: a */
    private final oju f20594a;

    /* JADX INFO: renamed from: b */
    private final oju f20595b;

    /* JADX INFO: renamed from: c */
    private final oju f20596c;

    /* JADX INFO: renamed from: d */
    private final oju f20597d;

    /* JADX INFO: renamed from: e */
    private final oju f20598e;

    /* JADX INFO: renamed from: f */
    private final oju f20599f;

    /* JADX INFO: renamed from: g */
    private final oju f20600g;

    /* JADX INFO: renamed from: h */
    private final oju f20601h;

    /* JADX INFO: renamed from: i */
    private final oju f20602i;

    /* JADX INFO: renamed from: j */
    private final oju f20603j;

    /* JADX INFO: renamed from: k */
    private final oju f20604k;

    /* JADX INFO: renamed from: l */
    private final oju f20605l;

    /* JADX INFO: renamed from: m */
    private final oju f20606m;

    /* JADX INFO: renamed from: n */
    private final oju f20607n;

    /* JADX INFO: renamed from: o */
    private final oju f20608o;

    /* JADX INFO: renamed from: p */
    private final oju f20609p;

    /* JADX INFO: renamed from: q */
    private final oju f20610q;

    /* JADX INFO: renamed from: r */
    private final oju f20611r;

    /* JADX INFO: renamed from: s */
    private final oju f20612s;

    /* JADX INFO: renamed from: t */
    private final oju f20613t;

    /* JADX INFO: renamed from: u */
    private final oju f20614u;

    /* JADX INFO: renamed from: v */
    private final oju f20615v;

    /* JADX INFO: renamed from: w */
    private final oju f20616w;

    /* JADX INFO: renamed from: x */
    private final oju f20617x;

    /* JADX INFO: renamed from: y */
    private final oju f20618y;

    /* JADX INFO: renamed from: z */
    private final oju f20619z;

    public ewb(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, oju ojuVar18, oju ojuVar19, oju ojuVar20, oju ojuVar21, oju ojuVar22, oju ojuVar23, oju ojuVar24, oju ojuVar25, oju ojuVar26, oju ojuVar27, oju ojuVar28, oju ojuVar29, oju ojuVar30, oju ojuVar31, oju ojuVar32, oju ojuVar33, oju ojuVar34, oju ojuVar35, oju ojuVar36, oju ojuVar37, oju ojuVar38, oju ojuVar39, oju ojuVar40, oju ojuVar41, oju ojuVar42, oju ojuVar43, oju ojuVar44, oju ojuVar45, oju ojuVar46, oju ojuVar47, oju ojuVar48, oju ojuVar49, oju ojuVar50, oju ojuVar51) {
        this.f20594a = ojuVar;
        this.f20595b = ojuVar2;
        this.f20596c = ojuVar3;
        this.f20597d = ojuVar4;
        this.f20598e = ojuVar5;
        this.f20599f = ojuVar6;
        this.f20600g = ojuVar7;
        this.f20601h = ojuVar8;
        this.f20602i = ojuVar9;
        this.f20603j = ojuVar10;
        this.f20604k = ojuVar11;
        this.f20605l = ojuVar12;
        this.f20606m = ojuVar13;
        this.f20607n = ojuVar14;
        this.f20608o = ojuVar15;
        this.f20609p = ojuVar16;
        this.f20610q = ojuVar17;
        this.f20611r = ojuVar18;
        this.f20612s = ojuVar19;
        this.f20613t = ojuVar20;
        this.f20614u = ojuVar21;
        this.f20615v = ojuVar22;
        this.f20616w = ojuVar23;
        this.f20617x = ojuVar24;
        this.f20618y = ojuVar25;
        this.f20619z = ojuVar26;
        this.f20569A = ojuVar27;
        this.f20570B = ojuVar28;
        this.f20571C = ojuVar29;
        this.f20572D = ojuVar30;
        this.f20573E = ojuVar31;
        this.f20574F = ojuVar32;
        this.f20575G = ojuVar33;
        this.f20576H = ojuVar34;
        this.f20577I = ojuVar35;
        this.f20578J = ojuVar36;
        this.f20579K = ojuVar37;
        this.f20580L = ojuVar38;
        this.f20581M = ojuVar39;
        this.f20582N = ojuVar40;
        this.f20583O = ojuVar41;
        this.f20584P = ojuVar42;
        this.f20585Q = ojuVar43;
        this.f20586R = ojuVar44;
        this.f20587S = ojuVar45;
        this.f20588T = ojuVar46;
        this.f20589U = ojuVar47;
        this.f20590V = ojuVar48;
        this.f20591W = ojuVar49;
        this.f20592X = ojuVar50;
        this.f20593Y = ojuVar51;
    }

    @Override // p000.oju
    public final /* bridge */ /* synthetic */ Object get() {
        kbz kbzVar = (kbz) this.f20594a.get();
        dbr dbrVar = (dbr) this.f20595b.get();
        fvn fvnVar = ((fvo) this.f20596c).get();
        chk chkVar = (chk) this.f20597d.get();
        fvs fvsVarM7931a = ((evr) this.f20598e).m7931a();
        mrm mrmVarM6617a = ((dra) this.f20599f).m6617a();
        jvd jvdVar = (jvd) this.f20600g.get();
        Executor executorM3825a = ((cjm) this.f20601h).m3825a();
        fmy fmyVarM7932a = ((evs) this.f20602i).m7932a();
        hht hhtVar = (hht) this.f20603j.get();
        mrm mrmVarM5442a = ((crv) this.f20604k).m5442a();
        gps gpsVar = (gps) this.f20605l.get();
        cbz cbzVar = ((cca) this.f20606m).get();
        eoq eoqVar = (eoq) this.f20607n.get();
        idf idfVar = (idf) this.f20608o.get();
        hua huaVar = (hua) this.f20609p.get();
        ggm ggmVar = (ggm) this.f20610q.get();
        AccessibilityManager accessibilityManager = ((eml) this.f20611r).get();
        dpx dpxVar = (dpx) this.f20612s.get();
        bkn bknVar = new bkn((char[]) null, (short[]) null);
        iuj iujVar = ((ity) this.f20613t).get();
        icf icfVar = (icf) this.f20614u.get();
        jww jwwVar = (jww) this.f20615v.get();
        jww jwwVar2 = (jww) this.f20616w.get();
        fmi fmiVar = (fmi) this.f20617x.get();
        hwy hwyVar = ((hwz) this.f20618y).get();
        hee heeVar = ((fmx) this.f20619z).get();
        kms kmsVar = (kms) this.f20569A.get();
        dhv dhvVar = (dhv) this.f20570B.get();
        bko bkoVar = ((ers) this.f20571C).get();
        dnn dnnVar = (dnn) this.f20572D.get();
        BottomBarController bottomBarController = (BottomBarController) this.f20573E.get();
        igb igbVar = (igb) this.f20574F.get();
        gfa gfaVar = (gfa) this.f20575G.get();
        dsx dsxVar = ((cdr) this.f20576H).get();
        hkx hkxVar = (hkx) this.f20577I.get();
        hnw hnwVar = (hnw) this.f20578J.get();
        hoa hoaVar = (hoa) this.f20579K.get();
        return new ewa(kbzVar, dbrVar, fvnVar, chkVar, fvsVarM7931a, mrmVarM6617a, jvdVar, executorM3825a, fmyVarM7932a, hhtVar, mrmVarM5442a, gpsVar, cbzVar, eoqVar, idfVar, huaVar, ggmVar, accessibilityManager, dpxVar, bknVar, iujVar, icfVar, jwwVar, jwwVar2, fmiVar, hwyVar, heeVar, kmsVar, dhvVar, bkoVar, dnnVar, bottomBarController, igbVar, gfaVar, dsxVar, hkxVar, hnwVar, hoaVar, (eby) this.f20581M.get(), (fds) this.f20582N.get(), (hyb) this.f20583O.get(), ((gub) this.f20584P).get(), (mrm) this.f20585Q.get(), (mrm) ((ohj) this.f20586R).f46012a, (glu) this.f20587S.get(), (mrm) this.f20588T.get(), (ebv) this.f20589U.get(), (hys) this.f20590V.get(), (htf) this.f20591W.get(), (fna) this.f20592X.get(), (C1058va) this.f20593Y.get(), null, null, null, null, null, null);
    }
}
