package p000;

import com.google.googlex.gcam.Gcam;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecu implements ohi {

    /* JADX INFO: renamed from: A */
    private final oju f13448A;

    /* JADX INFO: renamed from: B */
    private final oju f13449B;

    /* JADX INFO: renamed from: C */
    private final oju f13450C;

    /* JADX INFO: renamed from: D */
    private final oju f13451D;

    /* JADX INFO: renamed from: E */
    private final oju f13452E;

    /* JADX INFO: renamed from: F */
    private final oju f13453F;

    /* JADX INFO: renamed from: G */
    private final oju f13454G;

    /* JADX INFO: renamed from: H */
    private final oju f13455H;

    /* JADX INFO: renamed from: I */
    private final oju f13456I;

    /* JADX INFO: renamed from: J */
    private final oju f13457J;

    /* JADX INFO: renamed from: K */
    private final oju f13458K;

    /* JADX INFO: renamed from: L */
    private final oju f13459L;

    /* JADX INFO: renamed from: M */
    private final oju f13460M;

    /* JADX INFO: renamed from: N */
    private final oju f13461N;

    /* JADX INFO: renamed from: a */
    private final oju f13462a;

    /* JADX INFO: renamed from: b */
    private final oju f13463b;

    /* JADX INFO: renamed from: c */
    private final oju f13464c;

    /* JADX INFO: renamed from: d */
    private final oju f13465d;

    /* JADX INFO: renamed from: e */
    private final oju f13466e;

    /* JADX INFO: renamed from: f */
    private final oju f13467f;

    /* JADX INFO: renamed from: g */
    private final oju f13468g;

    /* JADX INFO: renamed from: h */
    private final oju f13469h;

    /* JADX INFO: renamed from: i */
    private final oju f13470i;

    /* JADX INFO: renamed from: j */
    private final oju f13471j;

    /* JADX INFO: renamed from: k */
    private final oju f13472k;

    /* JADX INFO: renamed from: l */
    private final oju f13473l;

    /* JADX INFO: renamed from: m */
    private final oju f13474m;

    /* JADX INFO: renamed from: n */
    private final oju f13475n;

    /* JADX INFO: renamed from: o */
    private final oju f13476o;

    /* JADX INFO: renamed from: p */
    private final oju f13477p;

    /* JADX INFO: renamed from: q */
    private final oju f13478q;

    /* JADX INFO: renamed from: r */
    private final oju f13479r;

    /* JADX INFO: renamed from: s */
    private final oju f13480s;

    /* JADX INFO: renamed from: t */
    private final oju f13481t;

    /* JADX INFO: renamed from: u */
    private final oju f13482u;

    /* JADX INFO: renamed from: v */
    private final oju f13483v;

    /* JADX INFO: renamed from: w */
    private final oju f13484w;

    /* JADX INFO: renamed from: x */
    private final oju f13485x;

    /* JADX INFO: renamed from: y */
    private final oju f13486y;

    /* JADX INFO: renamed from: z */
    private final oju f13487z;

    public ecu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, oju ojuVar18, oju ojuVar19, oju ojuVar20, oju ojuVar21, oju ojuVar22, oju ojuVar23, oju ojuVar24, oju ojuVar25, oju ojuVar26, oju ojuVar27, oju ojuVar28, oju ojuVar29, oju ojuVar30, oju ojuVar31, oju ojuVar32, oju ojuVar33, oju ojuVar34, oju ojuVar35, oju ojuVar36, oju ojuVar37, oju ojuVar38, oju ojuVar39, oju ojuVar40) {
        this.f13462a = ojuVar;
        this.f13463b = ojuVar2;
        this.f13464c = ojuVar3;
        this.f13465d = ojuVar4;
        this.f13466e = ojuVar5;
        this.f13467f = ojuVar6;
        this.f13468g = ojuVar7;
        this.f13469h = ojuVar8;
        this.f13470i = ojuVar9;
        this.f13471j = ojuVar10;
        this.f13472k = ojuVar11;
        this.f13473l = ojuVar12;
        this.f13474m = ojuVar13;
        this.f13475n = ojuVar14;
        this.f13476o = ojuVar15;
        this.f13477p = ojuVar16;
        this.f13478q = ojuVar17;
        this.f13479r = ojuVar18;
        this.f13480s = ojuVar19;
        this.f13481t = ojuVar20;
        this.f13482u = ojuVar21;
        this.f13483v = ojuVar22;
        this.f13484w = ojuVar23;
        this.f13485x = ojuVar24;
        this.f13486y = ojuVar25;
        this.f13487z = ojuVar26;
        this.f13448A = ojuVar27;
        this.f13449B = ojuVar28;
        this.f13450C = ojuVar29;
        this.f13451D = ojuVar30;
        this.f13452E = ojuVar31;
        this.f13453F = ojuVar32;
        this.f13454G = ojuVar33;
        this.f13455H = ojuVar34;
        this.f13456I = ojuVar35;
        this.f13457J = ojuVar36;
        this.f13458K = ojuVar37;
        this.f13459L = ojuVar38;
        this.f13460M = ojuVar39;
        this.f13461N = ojuVar40;
    }

    /* JADX INFO: renamed from: a */
    public static ecu m7168a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, oju ojuVar15, oju ojuVar16, oju ojuVar17, oju ojuVar18, oju ojuVar19, oju ojuVar20, oju ojuVar21, oju ojuVar22, oju ojuVar23, oju ojuVar24, oju ojuVar25, oju ojuVar26, oju ojuVar27, oju ojuVar28, oju ojuVar29, oju ojuVar30, oju ojuVar31, oju ojuVar32, oju ojuVar33, oju ojuVar34, oju ojuVar35, oju ojuVar36, oju ojuVar37, oju ojuVar38, oju ojuVar39, oju ojuVar40) {
        return new ecu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, ojuVar13, ojuVar14, ojuVar15, ojuVar16, ojuVar17, ojuVar18, ojuVar19, ojuVar20, ojuVar21, ojuVar22, ojuVar23, ojuVar24, ojuVar25, ojuVar26, ojuVar27, ojuVar28, ojuVar29, ojuVar30, ojuVar31, ojuVar32, ojuVar33, ojuVar34, ojuVar35, ojuVar36, ojuVar37, ojuVar38, ojuVar39, ojuVar40);
    }

    @Override // p000.oju
    public final /* bridge */ /* synthetic */ Object get() {
        return new ect(((fww) this.f13462a).get(), (ebv) this.f13463b.get(), (bko) this.f13464c.get(), ((ntb) this.f13465d).get(), (nsz) this.f13466e.get(), ((fxk) this.f13467f).get(), (drj) this.f13468g.get(), ((geb) this.f13469h).get(), (Gcam) this.f13470i.get(), ecd.m7108b(), ((eeu) this.f13471j).get(), this.f13472k, (dhv) this.f13473l.get(), this.f13474m, (jvb) this.f13475n.get(), (fvd) this.f13476o.get(), (edk) this.f13477p.get(), this.f13478q, (ihk) this.f13479r.get(), dvb.m6761a(), ((dna) this.f13480s).get(), (ebw) this.f13481t.get(), (ebq) this.f13482u.get(), (eby) this.f13483v.get(), (eco) this.f13484w.get(), (jwn) this.f13485x.get(), (kbz) this.f13486y.get(), (fuz) this.f13487z.get(), (bko) this.f13448A.get(), (eci) this.f13449B.get(), (Executor) this.f13450C.get(), (gtl) this.f13451D.get(), (gpw) this.f13452E.get(), (kpb) this.f13453F.get(), ((ehv) this.f13454G).get(), (inm) this.f13455H.get(), (jwn) this.f13456I.get(), ((kak) this.f13457J).get(), (gcx) this.f13458K.get(), ((ebb) this.f13459L).get(), (jwn) this.f13460M.get(), (hnw) this.f13461N.get(), null, null, null, null, null);
    }
}
