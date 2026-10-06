package p000;

import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hou implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f28679a;

    /* JADX INFO: renamed from: b */
    private final oju f28680b;

    /* JADX INFO: renamed from: c */
    private final oju f28681c;

    /* JADX INFO: renamed from: d */
    private final oju f28682d;

    /* JADX INFO: renamed from: e */
    private final oju f28683e;

    /* JADX INFO: renamed from: f */
    private final oju f28684f;

    /* JADX INFO: renamed from: g */
    private final oju f28685g;

    /* JADX INFO: renamed from: h */
    private final oju f28686h;

    /* JADX INFO: renamed from: i */
    private final oju f28687i;

    /* JADX INFO: renamed from: j */
    private final oju f28688j;

    /* JADX INFO: renamed from: k */
    private final oju f28689k;

    /* JADX INFO: renamed from: l */
    private final /* synthetic */ int f28690l;

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i) {
        this.f28690l = i;
        this.f28679a = ojuVar;
        this.f28680b = ojuVar2;
        this.f28681c = ojuVar3;
        this.f28682d = ojuVar4;
        this.f28683e = ojuVar5;
        this.f28684f = ojuVar6;
        this.f28685g = ojuVar7;
        this.f28686h = ojuVar8;
        this.f28687i = ojuVar9;
        this.f28688j = ojuVar10;
        this.f28689k = ojuVar11;
    }

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, byte[] bArr) {
        this.f28690l = i;
        this.f28681c = ojuVar;
        this.f28685g = ojuVar2;
        this.f28687i = ojuVar3;
        this.f28688j = ojuVar4;
        this.f28689k = ojuVar5;
        this.f28682d = ojuVar6;
        this.f28679a = ojuVar7;
        this.f28684f = ojuVar8;
        this.f28683e = ojuVar9;
        this.f28680b = ojuVar10;
        this.f28686h = ojuVar11;
    }

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, char[] cArr) {
        this.f28690l = i;
        this.f28681c = ojuVar;
        this.f28683e = ojuVar2;
        this.f28688j = ojuVar3;
        this.f28685g = ojuVar4;
        this.f28680b = ojuVar5;
        this.f28686h = ojuVar6;
        this.f28682d = ojuVar7;
        this.f28684f = ojuVar8;
        this.f28689k = ojuVar9;
        this.f28687i = ojuVar10;
        this.f28679a = ojuVar11;
    }

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, float[] fArr) {
        this.f28690l = i;
        this.f28688j = ojuVar;
        this.f28681c = ojuVar2;
        this.f28679a = ojuVar3;
        this.f28687i = ojuVar4;
        this.f28686h = ojuVar5;
        this.f28682d = ojuVar6;
        this.f28680b = ojuVar7;
        this.f28689k = ojuVar8;
        this.f28685g = ojuVar9;
        this.f28683e = ojuVar10;
        this.f28684f = ojuVar11;
    }

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, int[] iArr) {
        this.f28690l = i;
        this.f28679a = ojuVar;
        this.f28681c = ojuVar2;
        this.f28682d = ojuVar3;
        this.f28686h = ojuVar4;
        this.f28689k = ojuVar5;
        this.f28683e = ojuVar6;
        this.f28687i = ojuVar7;
        this.f28685g = ojuVar8;
        this.f28680b = ojuVar9;
        this.f28684f = ojuVar10;
        this.f28688j = ojuVar11;
    }

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, short[] sArr) {
        this.f28690l = i;
        this.f28680b = ojuVar;
        this.f28679a = ojuVar2;
        this.f28684f = ojuVar3;
        this.f28688j = ojuVar4;
        this.f28685g = ojuVar5;
        this.f28686h = ojuVar6;
        this.f28689k = ojuVar7;
        this.f28687i = ojuVar8;
        this.f28683e = ojuVar9;
        this.f28682d = ojuVar10;
        this.f28681c = ojuVar11;
    }

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, boolean[] zArr) {
        this.f28690l = i;
        this.f28683e = ojuVar;
        this.f28680b = ojuVar2;
        this.f28682d = ojuVar3;
        this.f28685g = ojuVar4;
        this.f28681c = ojuVar5;
        this.f28688j = ojuVar6;
        this.f28684f = ojuVar7;
        this.f28689k = ojuVar8;
        this.f28686h = ojuVar9;
        this.f28687i = ojuVar10;
        this.f28679a = ojuVar11;
    }

    public hou(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, byte[][] bArr) {
        this.f28690l = i;
        this.f28681c = ojuVar;
        this.f28684f = ojuVar2;
        this.f28679a = ojuVar3;
        this.f28686h = ojuVar4;
        this.f28685g = ojuVar5;
        this.f28683e = ojuVar6;
        this.f28687i = ojuVar7;
        this.f28689k = ojuVar8;
        this.f28688j = ojuVar9;
        this.f28680b = ojuVar10;
        this.f28682d = ojuVar11;
    }

    /* JADX INFO: renamed from: a */
    public static hou m10554a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11) {
        return new hou(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, 1, (byte[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f28690l) {
            case 0:
                return new hot((drj) this.f28679a.get(), (bkn) this.f28680b.get(), (dox) this.f28681c.get(), ((cca) this.f28682d).get(), (dhv) this.f28683e.get(), ((crv) this.f28684f).m5442a(), ((hfb) this.f28685g).m10179a(), (ccs) this.f28686h.get(), (ScheduledExecutorService) this.f28687i.get(), ftx.m8799e(), (hqk) this.f28688j.get(), (fvd) this.f28689k.get(), null, null, null, null, null, null);
            case 1:
                return new hbg((fve) this.f28681c.get(), (had) this.f28685g.get(), (kms) this.f28687i.get(), (khy) this.f28688j.get(), (hai) this.f28689k.get(), (jww) this.f28682d.get(), ((err) this.f28679a).get(), (dhv) this.f28684f.get(), (jwn) this.f28683e.get(), (fmz) this.f28680b.get(), ((emf) this.f28686h).m7519a());
            case 2:
                return new iak(((dws) this.f28681c).m6830a(), (dhv) this.f28683e.get(), (hah) this.f28688j.get(), (hai) this.f28685g.get(), ((iaf) this.f28680b).get(), (jvd) this.f28686h.get(), ((cjm) this.f28682d).m3825a(), (elx) this.f28684f.get(), (igb) this.f28689k.get(), (gfa) this.f28687i.get(), ((err) this.f28679a).get(), null);
            case 3:
                return new imf((imh) this.f28680b.get(), ((dws) this.f28679a).m6830a(), (elx) this.f28684f.get(), (hah) this.f28688j.get(), (hai) this.f28685g.get(), ((inb) this.f28686h).get(), (fcp) this.f28689k.get(), (gye) this.f28687i.get(), dvb.m6761a(), (jvd) this.f28683e.get(), ((cde) this.f28682d).m3490a().booleanValue(), ((ino) this.f28681c).get().booleanValue());
            case 4:
                cdu cduVar = ((err) this.f28679a).get();
                dbr dbrVar = (dbr) this.f28682d.get();
                jvd jvdVar = (jvd) this.f28686h.get();
                oju ojuVar = this.f28689k;
                hxn hxnVar = (hxn) this.f28683e.get();
                mrm mrmVarM5442a = ((crv) this.f28685g).m5442a();
                jww jwwVar = (jww) this.f28680b.get();
                jww jwwVar2 = (jww) this.f28684f.get();
                ihk ihkVar = (ihk) this.f28688j.get();
                jvb jvbVarM3529i = cduVar.m3529i();
                irs irsVar = new irs(cduVar, dbrVar, jvdVar, mrmVarM5442a, ojuVar, hxnVar, jwwVar, jwwVar2, ihkVar, null, null, null, null, null);
                jvbVarM3529i.m13537d(irsVar);
                return irsVar;
            case 5:
                return new kjm(((khc) this.f28683e).get(), (kcu) this.f28680b.get(), (kjn) this.f28682d.get(), (kkk) this.f28685g.get(), (Handler) this.f28681c.get(), (kka) this.f28688j.get(), (jvb) this.f28684f.get(), (kbz) this.f28689k.get(), ((kbm) this.f28686h).get(), ((kjb) this.f28687i).get(), ((kjk) this.f28679a).get(), null, null, null, null);
            case 6:
                ljf ljfVar = ((ljg) this.f28688j).get();
                return new llq(ljfVar, ((dws) this.f28679a).m6830a(), (llp) this.f28687i.get(), (npv) this.f28686h.get(), ohh.m18485a(this.f28682d), ((llv) this.f28680b).get(), (lha) this.f28689k.get(), this.f28685g, (Executor) this.f28683e.get(), (mrm) ((ohj) this.f28684f).f46012a);
            default:
                return new lwv((ksi) this.f28681c.get(), (mav) this.f28684f.get(), (lxd) this.f28679a.get(), (mat) this.f28686h.get(), (lyz) this.f28685g.get(), (oqo) this.f28683e.get(), (lyz) this.f28687i.get(), (lzd) this.f28689k.get(), (lwz) this.f28688j.get(), (AmbientMode.AmbientController) this.f28680b.get(), (lwo) this.f28682d.get(), null, null, null);
        }
    }
}
