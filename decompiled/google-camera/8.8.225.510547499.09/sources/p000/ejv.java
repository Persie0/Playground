package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.googlex.gcam.Gcam;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14416a;

    /* JADX INFO: renamed from: b */
    private final oju f14417b;

    /* JADX INFO: renamed from: c */
    private final oju f14418c;

    /* JADX INFO: renamed from: d */
    private final oju f14419d;

    /* JADX INFO: renamed from: e */
    private final oju f14420e;

    /* JADX INFO: renamed from: f */
    private final oju f14421f;

    /* JADX INFO: renamed from: g */
    private final oju f14422g;

    /* JADX INFO: renamed from: h */
    private final oju f14423h;

    /* JADX INFO: renamed from: i */
    private final oju f14424i;

    /* JADX INFO: renamed from: j */
    private final oju f14425j;

    /* JADX INFO: renamed from: k */
    private final oju f14426k;

    /* JADX INFO: renamed from: l */
    private final oju f14427l;

    /* JADX INFO: renamed from: m */
    private final /* synthetic */ int f14428m;

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i) {
        this.f14428m = i;
        this.f14416a = ojuVar;
        this.f14417b = ojuVar2;
        this.f14418c = ojuVar3;
        this.f14419d = ojuVar4;
        this.f14420e = ojuVar5;
        this.f14421f = ojuVar6;
        this.f14422g = ojuVar7;
        this.f14423h = ojuVar8;
        this.f14424i = ojuVar9;
        this.f14425j = ojuVar10;
        this.f14426k = ojuVar11;
        this.f14427l = ojuVar12;
    }

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, byte[] bArr) {
        this.f14428m = i;
        this.f14419d = ojuVar;
        this.f14423h = ojuVar2;
        this.f14427l = ojuVar3;
        this.f14424i = ojuVar4;
        this.f14426k = ojuVar5;
        this.f14417b = ojuVar6;
        this.f14418c = ojuVar7;
        this.f14422g = ojuVar8;
        this.f14425j = ojuVar9;
        this.f14421f = ojuVar10;
        this.f14416a = ojuVar11;
        this.f14420e = ojuVar12;
    }

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, char[] cArr) {
        this.f14428m = i;
        this.f14419d = ojuVar;
        this.f14425j = ojuVar2;
        this.f14426k = ojuVar3;
        this.f14424i = ojuVar4;
        this.f14416a = ojuVar5;
        this.f14418c = ojuVar6;
        this.f14417b = ojuVar7;
        this.f14423h = ojuVar8;
        this.f14427l = ojuVar9;
        this.f14420e = ojuVar10;
        this.f14421f = ojuVar11;
        this.f14422g = ojuVar12;
    }

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, float[] fArr) {
        this.f14428m = i;
        this.f14424i = ojuVar;
        this.f14422g = ojuVar2;
        this.f14421f = ojuVar3;
        this.f14418c = ojuVar4;
        this.f14420e = ojuVar5;
        this.f14426k = ojuVar6;
        this.f14417b = ojuVar7;
        this.f14425j = ojuVar8;
        this.f14427l = ojuVar9;
        this.f14416a = ojuVar10;
        this.f14423h = ojuVar11;
        this.f14419d = ojuVar12;
    }

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, int[] iArr) {
        this.f14428m = i;
        this.f14418c = ojuVar;
        this.f14419d = ojuVar2;
        this.f14416a = ojuVar3;
        this.f14422g = ojuVar4;
        this.f14421f = ojuVar5;
        this.f14425j = ojuVar6;
        this.f14427l = ojuVar7;
        this.f14417b = ojuVar8;
        this.f14426k = ojuVar9;
        this.f14424i = ojuVar10;
        this.f14423h = ojuVar11;
        this.f14420e = ojuVar12;
    }

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, short[] sArr) {
        this.f14428m = i;
        this.f14421f = ojuVar;
        this.f14425j = ojuVar2;
        this.f14418c = ojuVar3;
        this.f14420e = ojuVar4;
        this.f14416a = ojuVar5;
        this.f14423h = ojuVar6;
        this.f14419d = ojuVar7;
        this.f14427l = ojuVar8;
        this.f14422g = ojuVar9;
        this.f14426k = ojuVar10;
        this.f14417b = ojuVar11;
        this.f14424i = ojuVar12;
    }

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, boolean[] zArr) {
        this.f14428m = i;
        this.f14422g = ojuVar;
        this.f14425j = ojuVar2;
        this.f14421f = ojuVar3;
        this.f14427l = ojuVar4;
        this.f14416a = ojuVar5;
        this.f14418c = ojuVar6;
        this.f14423h = ojuVar7;
        this.f14420e = ojuVar8;
        this.f14417b = ojuVar9;
        this.f14419d = ojuVar10;
        this.f14424i = ojuVar11;
        this.f14426k = ojuVar12;
    }

    public ejv(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, int i, byte[][] bArr) {
        this.f14428m = i;
        this.f14416a = ojuVar;
        this.f14422g = ojuVar2;
        this.f14423h = ojuVar3;
        this.f14417b = ojuVar4;
        this.f14419d = ojuVar5;
        this.f14420e = ojuVar6;
        this.f14421f = ojuVar7;
        this.f14425j = ojuVar8;
        this.f14426k = ojuVar9;
        this.f14424i = ojuVar10;
        this.f14418c = ojuVar11;
        this.f14427l = ojuVar12;
    }

    /* JADX INFO: renamed from: a */
    public static ejv m7402a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12) {
        return new ejv(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static ejv m7403b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12) {
        return new ejv(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, 5, (boolean[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f14428m) {
            case 0:
                return new eju((eib) this.f14416a.get(), (eig) this.f14417b.get(), (ekd) this.f14418c.get(), (eiw) this.f14419d.get(), (ejd) this.f14420e.get(), ((ejm) this.f14421f).get(), ((eji) this.f14422g).get(), (ejt) this.f14423h.get(), ((ejo) this.f14424i).get(), (ejj) this.f14425j.get(), ((ejg) this.f14426k).get(), ((dws) this.f14427l).m6830a());
            case 1:
                return new cpq(((dws) this.f14419d).m6830a(), ((cwr) this.f14423h).get(), (cwd) this.f14427l.get(), ((csg) this.f14424i).get(), (dhv) this.f14426k.get(), (djm) this.f14417b.get(), (djm) this.f14418c.get(), (jwn) this.f14422g.get(), ((hip) this.f14425j).get(), (cxo) this.f14421f.get(), (fmz) this.f14416a.get(), (kpb) this.f14420e.get(), null, null, null, null);
            case 2:
                return new epz((epy) this.f14419d.get(), (eqc) this.f14425j.get(), gtf.m9754c(), (jwf) this.f14426k.get(), (Map) this.f14424i.get(), (jwn) this.f14416a.get(), (ecq) this.f14418c.get(), (Gcam) this.f14417b.get(), (kbz) this.f14423h.get(), (dhv) this.f14427l.get(), (eqm) this.f14420e.get(), (hah) this.f14421f.get(), (jvb) this.f14422g.get());
            case 3:
                return new erf((igb) this.f14421f.get(), (iey) this.f14425j.get(), (gfa) this.f14418c.get(), (icf) this.f14420e.get(), (BottomBarController) this.f14416a.get(), ((ity) this.f14423h).get(), (jwn) this.f14419d.get(), (hyo) this.f14427l.get(), (mrm) this.f14422g.get(), (mrm) this.f14426k.get(), (elx) this.f14417b.get(), (mrm) this.f14424i.get());
            case 4:
                return new ffo((Executor) this.f14418c.get(), (kfk) this.f14419d.get(), ((fxj) this.f14416a).m8922a(), (hnw) this.f14422g.get(), ((hog) this.f14421f).m10532a(), (jww) this.f14425j.get(), ((fxk) this.f14427l).get(), (kpb) this.f14417b.get(), ((gic) this.f14426k).get(), (AtomicBoolean) this.f14424i.get(), (kbz) this.f14423h.get(), (dhv) this.f14420e.get(), null, null);
            case 5:
                return new fjg((eat) this.f14422g.get(), (C1058va) this.f14425j.get(), (dxx) this.f14421f.get(), ((etl) this.f14427l).m7866a(), ((etl) this.f14416a).m7866a(), (Executor) this.f14418c.get(), (kbc) this.f14423h.get(), (gtl) this.f14420e.get(), (gtd) this.f14417b.get(), ((fjc) this.f14419d).get(), ((fjh) this.f14424i).get(), fxo.m8935i(), (dhv) this.f14426k.get(), null, null, null, null, null);
            case 6:
                return new fpa(this.f14424i, this.f14422g, this.f14421f, (huu) this.f14418c.get(), (jvd) this.f14420e.get(), (dac) this.f14426k.get(), this.f14417b, (cxo) this.f14425j.get(), (csm) this.f14427l.get(), (jww) this.f14416a.get(), ((ity) this.f14423h).get(), ((hzr) this.f14419d).get());
            default:
                return new fpm((chk) this.f14416a.get(), ((dww) this.f14422g).m6836a(), (cqm) this.f14423h.get(), (BottomBarController) this.f14417b.get(), ((cpk) this.f14419d).get(), (czt) this.f14420e.get(), (jfs) this.f14421f.get(), (hai) this.f14425j.get(), (dhv) this.f14426k.get(), (fpp) this.f14424i.get(), (hst) this.f14418c.get(), (fna) this.f14427l.get(), null, null, null);
        }
    }
}
