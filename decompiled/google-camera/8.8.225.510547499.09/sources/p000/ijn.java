package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijn implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31192a;

    /* JADX INFO: renamed from: b */
    private final oju f31193b;

    /* JADX INFO: renamed from: c */
    private final oju f31194c;

    /* JADX INFO: renamed from: d */
    private final oju f31195d;

    /* JADX INFO: renamed from: e */
    private final oju f31196e;

    /* JADX INFO: renamed from: f */
    private final oju f31197f;

    /* JADX INFO: renamed from: g */
    private final oju f31198g;

    /* JADX INFO: renamed from: h */
    private final oju f31199h;

    /* JADX INFO: renamed from: i */
    private final oju f31200i;

    /* JADX INFO: renamed from: j */
    private final oju f31201j;

    /* JADX INFO: renamed from: k */
    private final oju f31202k;

    /* JADX INFO: renamed from: l */
    private final oju f31203l;

    /* JADX INFO: renamed from: m */
    private final oju f31204m;

    /* JADX INFO: renamed from: n */
    private final /* synthetic */ int f31205n;

    public ijn(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i) {
        this.f31205n = i;
        this.f31192a = ojuVar;
        this.f31193b = ojuVar2;
        this.f31194c = ojuVar3;
        this.f31195d = ojuVar4;
        this.f31196e = ojuVar5;
        this.f31197f = ojuVar6;
        this.f31198g = ojuVar7;
        this.f31199h = ojuVar8;
        this.f31200i = ojuVar9;
        this.f31201j = ojuVar10;
        this.f31202k = ojuVar11;
        this.f31203l = ojuVar12;
        this.f31204m = ojuVar13;
    }

    public ijn(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i, byte[] bArr) {
        this.f31205n = i;
        this.f31203l = ojuVar;
        this.f31193b = ojuVar2;
        this.f31197f = ojuVar3;
        this.f31192a = ojuVar4;
        this.f31202k = ojuVar5;
        this.f31196e = ojuVar6;
        this.f31200i = ojuVar7;
        this.f31198g = ojuVar8;
        this.f31201j = ojuVar9;
        this.f31204m = ojuVar10;
        this.f31195d = ojuVar11;
        this.f31199h = ojuVar12;
        this.f31194c = ojuVar13;
    }

    public ijn(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i, char[] cArr) {
        this.f31205n = i;
        this.f31200i = ojuVar;
        this.f31196e = ojuVar2;
        this.f31204m = ojuVar3;
        this.f31198g = ojuVar4;
        this.f31197f = ojuVar5;
        this.f31192a = ojuVar6;
        this.f31199h = ojuVar7;
        this.f31202k = ojuVar8;
        this.f31194c = ojuVar9;
        this.f31203l = ojuVar10;
        this.f31193b = ojuVar11;
        this.f31201j = ojuVar12;
        this.f31195d = ojuVar13;
    }

    public ijn(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i, int[] iArr) {
        this.f31205n = i;
        this.f31199h = ojuVar;
        this.f31201j = ojuVar2;
        this.f31200i = ojuVar3;
        this.f31193b = ojuVar4;
        this.f31202k = ojuVar5;
        this.f31192a = ojuVar6;
        this.f31197f = ojuVar7;
        this.f31194c = ojuVar8;
        this.f31195d = ojuVar9;
        this.f31204m = ojuVar10;
        this.f31198g = ojuVar11;
        this.f31196e = ojuVar12;
        this.f31203l = ojuVar13;
    }

    public ijn(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, int i, short[] sArr) {
        this.f31205n = i;
        this.f31198g = ojuVar;
        this.f31200i = ojuVar2;
        this.f31192a = ojuVar3;
        this.f31196e = ojuVar4;
        this.f31204m = ojuVar5;
        this.f31202k = ojuVar6;
        this.f31203l = ojuVar7;
        this.f31199h = ojuVar8;
        this.f31195d = ojuVar9;
        this.f31197f = ojuVar10;
        this.f31194c = ojuVar11;
        this.f31201j = ojuVar12;
        this.f31193b = ojuVar13;
    }

    /* JADX INFO: renamed from: a */
    public static ijn m11401a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13) {
        return new ijn(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, ojuVar13, 1, (byte[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f31205n) {
            case 0:
                return new ijm(((crv) this.f31192a).m5442a(), this.f31193b, this.f31194c, this.f31195d, this.f31196e, this.f31197f, this.f31198g, this.f31199h, ((err) this.f31200i).get(), (jwn) this.f31201j.get(), ((eru) this.f31202k).get(), (kbz) this.f31203l.get(), (hah) this.f31204m.get());
            case 1:
                return new gtc((gtw) this.f31203l.get(), (gtq) this.f31193b.get(), (gtx) this.f31197f.get(), (gtd) this.f31192a.get(), ((gsy) this.f31202k).get(), ((gtp) this.f31196e).get(), ((etl) this.f31200i).m7866a(), ((Boolean) this.f31198g.get()).booleanValue(), ((cde) this.f31201j).m3490a().booleanValue(), ((cde) this.f31204m).m3490a().booleanValue(), ((cde) this.f31195d).m3490a().booleanValue(), ((cde) this.f31199h).m3490a().booleanValue(), (jvb) this.f31194c.get(), null, null);
            case 2:
                return new ikm(this.f31200i, ((dws) this.f31196e).m6830a(), (ipv) this.f31204m.get(), (ipt) this.f31198g.get(), ((ity) this.f31197f).get(), (eoq) this.f31192a.get(), (icf) this.f31199h.get(), (BottomBarController) this.f31202k.get(), (dhv) this.f31194c.get(), (hah) this.f31203l.get(), (hsk) this.f31193b.get(), this.f31201j, ((hzr) this.f31195d).get());
            case 3:
                return new lkb(((ljg) this.f31198g).get(), ((dws) this.f31200i).m6830a(), (Executor) this.f31192a.get(), ohh.m18485a(this.f31196e), ((etl) this.f31204m).m7866a(), (lhz) this.f31202k.get(), ((lnp) this.f31203l).get(), ohh.m18485a(this.f31199h), (mrm) ((ohj) this.f31195d).f46012a, this.f31197f, this.f31194c, this.f31201j, ((ljt) this.f31193b).get(), null);
            default:
                return new lla(((ljg) this.f31199h).get(), ((dws) this.f31201j).m6830a(), (lhz) this.f31200i.get(), ohh.m18485a(this.f31193b), (lkt) this.f31202k.get(), this.f31192a, this.f31197f, (Executor) this.f31194c.get(), ohh.m18485a(this.f31195d), (ljk) this.f31204m.get(), this.f31198g, this.f31196e, ((egx) this.f31203l).m7318b().booleanValue());
        }
    }
}
