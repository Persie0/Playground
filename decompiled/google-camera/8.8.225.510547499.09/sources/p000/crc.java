package p000;

import android.content.Context;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class crc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f9102a;

    /* JADX INFO: renamed from: b */
    private final oju f9103b;

    /* JADX INFO: renamed from: c */
    private final oju f9104c;

    /* JADX INFO: renamed from: d */
    private final oju f9105d;

    /* JADX INFO: renamed from: e */
    private final oju f9106e;

    /* JADX INFO: renamed from: f */
    private final oju f9107f;

    /* JADX INFO: renamed from: g */
    private final oju f9108g;

    /* JADX INFO: renamed from: h */
    private final oju f9109h;

    /* JADX INFO: renamed from: i */
    private final oju f9110i;

    /* JADX INFO: renamed from: j */
    private final oju f9111j;

    /* JADX INFO: renamed from: k */
    private final oju f9112k;

    /* JADX INFO: renamed from: l */
    private final oju f9113l;

    /* JADX INFO: renamed from: m */
    private final oju f9114m;

    /* JADX INFO: renamed from: n */
    private final oju f9115n;

    /* JADX INFO: renamed from: o */
    private final /* synthetic */ int f9116o;

    public crc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, int i) {
        this.f9116o = i;
        this.f9102a = ojuVar;
        this.f9103b = ojuVar2;
        this.f9104c = ojuVar3;
        this.f9105d = ojuVar4;
        this.f9106e = ojuVar5;
        this.f9107f = ojuVar6;
        this.f9108g = ojuVar7;
        this.f9109h = ojuVar8;
        this.f9110i = ojuVar9;
        this.f9111j = ojuVar10;
        this.f9112k = ojuVar11;
        this.f9113l = ojuVar12;
        this.f9114m = ojuVar13;
        this.f9115n = ojuVar14;
    }

    public crc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, int i, byte[] bArr) {
        this.f9116o = i;
        this.f9103b = ojuVar;
        this.f9102a = ojuVar2;
        this.f9108g = ojuVar3;
        this.f9110i = ojuVar4;
        this.f9111j = ojuVar5;
        this.f9113l = ojuVar6;
        this.f9106e = ojuVar7;
        this.f9107f = ojuVar8;
        this.f9104c = ojuVar9;
        this.f9114m = ojuVar10;
        this.f9112k = ojuVar11;
        this.f9109h = ojuVar12;
        this.f9105d = ojuVar13;
        this.f9115n = ojuVar14;
    }

    public crc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, int i, char[] cArr) {
        this.f9116o = i;
        this.f9103b = ojuVar;
        this.f9113l = ojuVar2;
        this.f9115n = ojuVar3;
        this.f9106e = ojuVar4;
        this.f9114m = ojuVar5;
        this.f9108g = ojuVar6;
        this.f9109h = ojuVar7;
        this.f9111j = ojuVar8;
        this.f9112k = ojuVar9;
        this.f9102a = ojuVar10;
        this.f9110i = ojuVar11;
        this.f9105d = ojuVar12;
        this.f9107f = ojuVar13;
        this.f9104c = ojuVar14;
    }

    public crc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, int i, int[] iArr) {
        this.f9116o = i;
        this.f9104c = ojuVar;
        this.f9110i = ojuVar2;
        this.f9115n = ojuVar3;
        this.f9108g = ojuVar4;
        this.f9105d = ojuVar5;
        this.f9107f = ojuVar6;
        this.f9114m = ojuVar7;
        this.f9103b = ojuVar8;
        this.f9111j = ojuVar9;
        this.f9106e = ojuVar10;
        this.f9109h = ojuVar11;
        this.f9112k = ojuVar12;
        this.f9102a = ojuVar13;
        this.f9113l = ojuVar14;
    }

    public crc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, int i, short[] sArr) {
        this.f9116o = i;
        this.f9109h = ojuVar;
        this.f9115n = ojuVar2;
        this.f9102a = ojuVar3;
        this.f9107f = ojuVar4;
        this.f9113l = ojuVar5;
        this.f9114m = ojuVar6;
        this.f9104c = ojuVar7;
        this.f9112k = ojuVar8;
        this.f9111j = ojuVar9;
        this.f9103b = ojuVar10;
        this.f9110i = ojuVar11;
        this.f9105d = ojuVar12;
        this.f9106e = ojuVar13;
        this.f9108g = ojuVar14;
    }

    public crc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13, oju ojuVar14, int i, boolean[] zArr) {
        this.f9116o = i;
        this.f9110i = ojuVar;
        this.f9111j = ojuVar2;
        this.f9108g = ojuVar3;
        this.f9105d = ojuVar4;
        this.f9115n = ojuVar5;
        this.f9104c = ojuVar6;
        this.f9112k = ojuVar7;
        this.f9102a = ojuVar8;
        this.f9114m = ojuVar9;
        this.f9106e = ojuVar10;
        this.f9103b = ojuVar11;
        this.f9109h = ojuVar12;
        this.f9107f = ojuVar13;
        this.f9113l = ojuVar14;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f9116o) {
            case 0:
                return new crb(this.f9102a, this.f9103b, this.f9104c, this.f9105d, this.f9106e, this.f9107f, this.f9108g, this.f9110i, this.f9111j, this.f9112k, this.f9113l, this.f9114m, this.f9115n);
            case 1:
                return new cdv(((dws) this.f9103b).m6830a(), ((ers) this.f9102a).get(), (fcp) this.f9108g.get(), (CameraActivityTiming) this.f9110i.get(), (cwd) this.f9111j.get(), (hkk) this.f9113l.get(), (jvd) this.f9106e.get(), (kbz) this.f9107f.get(), (jww) this.f9104c.get(), (dlc) this.f9114m.get(), (ggm) this.f9112k.get(), ((gzz) this.f9109h).get(), (god) this.f9105d.get(), (gwu) this.f9115n.get(), null, null, null, null);
            case 2:
                dbr dbrVar = (dbr) this.f9103b.get();
                fve fveVar = (fve) this.f9113l.get();
                kms kmsVar = (kms) this.f9115n.get();
                dhv dhvVar = (dhv) this.f9106e.get();
                dnn dnnVar = (dnn) this.f9114m.get();
                return new fws(dbrVar, fveVar, kmsVar, dhvVar, dnnVar, (cwt) this.f9109h.get(), (czl) this.f9111j.get(), ((ers) this.f9112k).get(), ((emh) this.f9102a).m7522a(), ((dws) this.f9110i).m6830a(), (cvt) this.f9105d.get(), (drj) this.f9107f.get(), (cpl) this.f9104c.get(), null, null, null);
            case 3:
                return new dav(((dbf) this.f9109h).get(), ((dba) this.f9115n).get(), (elx) this.f9102a.get(), (jfs) this.f9107f.get(), (hsk) this.f9113l.get(), (jvd) this.f9114m.get(), ((dws) this.f9104c).m6830a(), (ggm) this.f9112k.get(), (htb) this.f9111j.get(), (dhv) this.f9103b.get(), ((err) this.f9110i).get(), (hai) this.f9105d.get(), (gfa) this.f9106e.get(), ((ity) this.f9108g).get(), null, null, null);
            case 4:
                Context contextM6830a = ((dws) this.f9104c).m6830a();
                cdu cduVar = ((err) this.f9110i).get();
                dkg dkgVar = (dkg) this.f9115n.get();
                cvy cvyVar = (cvy) this.f9108g.get();
                bko bkoVar = ((dkd) this.f9105d).get();
                kbz kbzVar = (kbz) this.f9107f.get();
                dhv dhvVar2 = (dhv) this.f9114m.get();
                Executor executor = (Executor) this.f9103b.get();
                gxa gxaVar = (gxa) this.f9111j.get();
                boolean zBooleanValue = ((Boolean) this.f9106e.get()).booleanValue();
                hah hahVar = (hah) this.f9109h.get();
                djz djzVar = (djz) this.f9112k.get();
                djs djsVar = ((djt) this.f9102a).get();
                return new djr(contextM6830a, cduVar, dkgVar, cvyVar, bkoVar, kbzVar, dhvVar2, executor, gxaVar, zBooleanValue, hahVar, djzVar, djsVar, null, null, null, null, null);
            default:
                return new erz(this.f9110i, this.f9111j, this.f9108g, this.f9105d, this.f9115n, ohh.m18485a(this.f9104c), (jvd) this.f9112k.get(), ((cjm) this.f9102a).m3825a(), (nps) this.f9114m.get(), ((dki) this.f9106e).get(), ((jvu) this.f9103b).get(), (cwd) this.f9109h.get(), (kbz) this.f9107f.get(), (htf) this.f9113l.get(), null, null, null, null);
        }
    }
}
