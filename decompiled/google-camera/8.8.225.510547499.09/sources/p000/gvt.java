package p000;

import android.app.Activity;
import android.content.Context;
import android.view.Surface;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvt implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f26522a;

    /* JADX INFO: renamed from: b */
    private final oju f26523b;

    /* JADX INFO: renamed from: c */
    private final oju f26524c;

    /* JADX INFO: renamed from: d */
    private final oju f26525d;

    /* JADX INFO: renamed from: e */
    private final oju f26526e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f26527f;

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i) {
        this.f26527f = i;
        this.f26522a = ojuVar;
        this.f26523b = ojuVar2;
        this.f26524c = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26526e = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr) {
        this.f26527f = i;
        this.f26525d = ojuVar;
        this.f26524c = ojuVar2;
        this.f26522a = ojuVar3;
        this.f26523b = ojuVar4;
        this.f26526e = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f26527f = i;
        this.f26525d = ojuVar;
        this.f26524c = ojuVar2;
        this.f26526e = ojuVar3;
        this.f26523b = ojuVar4;
        this.f26522a = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr) {
        this.f26527f = i;
        this.f26524c = ojuVar;
        this.f26523b = ojuVar2;
        this.f26522a = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26526e = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr, byte[] bArr) {
        this.f26527f = i;
        this.f26523b = ojuVar;
        this.f26522a = ojuVar2;
        this.f26524c = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26526e = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[] fArr) {
        this.f26527f = i;
        this.f26526e = ojuVar;
        this.f26524c = ojuVar2;
        this.f26522a = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26523b = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[] iArr) {
        this.f26527f = i;
        this.f26523b = ojuVar;
        this.f26525d = ojuVar2;
        this.f26522a = ojuVar3;
        this.f26526e = ojuVar4;
        this.f26524c = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[] sArr) {
        this.f26527f = i;
        this.f26523b = ojuVar;
        this.f26526e = ojuVar2;
        this.f26525d = ojuVar3;
        this.f26524c = ojuVar4;
        this.f26522a = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[] zArr) {
        this.f26527f = i;
        this.f26524c = ojuVar;
        this.f26523b = ojuVar2;
        this.f26525d = ojuVar3;
        this.f26526e = ojuVar4;
        this.f26522a = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][] bArr) {
        this.f26527f = i;
        this.f26523b = ojuVar;
        this.f26524c = ojuVar2;
        this.f26526e = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26522a = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][] cArr) {
        this.f26527f = i;
        this.f26523b = ojuVar;
        this.f26524c = ojuVar2;
        this.f26526e = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26522a = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][] fArr) {
        this.f26527f = i;
        this.f26523b = ojuVar;
        this.f26526e = ojuVar2;
        this.f26522a = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26524c = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][] iArr) {
        this.f26527f = i;
        this.f26526e = ojuVar;
        this.f26525d = ojuVar2;
        this.f26524c = ojuVar3;
        this.f26522a = ojuVar4;
        this.f26523b = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][] sArr) {
        this.f26527f = i;
        this.f26522a = ojuVar;
        this.f26523b = ojuVar2;
        this.f26526e = ojuVar3;
        this.f26524c = ojuVar4;
        this.f26525d = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][] zArr) {
        this.f26527f = i;
        this.f26525d = ojuVar;
        this.f26524c = ojuVar2;
        this.f26523b = ojuVar3;
        this.f26522a = ojuVar4;
        this.f26526e = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][][] bArr) {
        this.f26527f = i;
        this.f26524c = ojuVar;
        this.f26523b = ojuVar2;
        this.f26525d = ojuVar3;
        this.f26526e = ojuVar4;
        this.f26522a = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][][] cArr) {
        this.f26527f = i;
        this.f26524c = ojuVar;
        this.f26523b = ojuVar2;
        this.f26526e = ojuVar3;
        this.f26522a = ojuVar4;
        this.f26525d = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][][] fArr) {
        this.f26527f = i;
        this.f26525d = ojuVar;
        this.f26523b = ojuVar2;
        this.f26524c = ojuVar3;
        this.f26526e = ojuVar4;
        this.f26522a = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][][] iArr) {
        this.f26527f = i;
        this.f26522a = ojuVar;
        this.f26524c = ojuVar2;
        this.f26523b = ojuVar3;
        this.f26525d = ojuVar4;
        this.f26526e = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][][] sArr) {
        this.f26527f = i;
        this.f26526e = ojuVar;
        this.f26523b = ojuVar2;
        this.f26522a = ojuVar3;
        this.f26524c = ojuVar4;
        this.f26525d = ojuVar5;
    }

    public gvt(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][][] zArr) {
        this.f26527f = i;
        this.f26525d = ojuVar;
        this.f26523b = ojuVar2;
        this.f26524c = ojuVar3;
        this.f26522a = ojuVar4;
        this.f26526e = ojuVar5;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f26527f) {
            case 0:
                jvd jvdVar = (jvd) this.f26522a.get();
                Activity activity = ((ema) this.f26523b).get();
                fba fbaVar = ((eru) this.f26524c).get();
                oju ojuVar = this.f26525d;
                kbz kbzVar = (kbz) this.f26526e.get();
                try {
                    kbzVar.mo13961e("secure");
                    return gvs.m9801a(activity.getIntent()) ? jbx.m12869n(new gxn(ojuVar, jvdVar, fbaVar, 1)) : cdw.f5366g;
                } finally {
                    kbzVar.mo13962f();
                }
            case 1:
                kbz kbzVar2 = (kbz) this.f26525d.get();
                Context contextM6830a = ((dws) this.f26524c).m6830a();
                dhv dhvVar = (dhv) this.f26522a.get();
                return new gpp(kbzVar2, contextM6830a, dhvVar.mo6184l(dio.f11672n), dhvVar.mo6184l(dio.f11673o), dhvVar.mo6184l(dio.f11674p), dhvVar.mo6184l(dio.f11675q), dhvVar.mo6184l(dio.f11676r), this.f26523b, this.f26526e);
            case 2:
                return new gvu(((err) this.f26524c).get(), (jww) this.f26523b.get(), (jwn) this.f26522a.get(), (jvd) this.f26525d.get(), (gwp) this.f26526e.get());
            case 3:
                return new gwo((BottomBarController) this.f26523b.get(), (icx) this.f26526e.get(), ((iii) this.f26525d).get(), (djm) this.f26524c.get(), (dhv) this.f26522a.get(), null, null);
            case 4:
                return new gxq(((gxd) this.f26523b).get(), (kqj) this.f26525d.get(), (dhv) this.f26522a.get(), (fcp) this.f26526e.get(), (Executor) this.f26524c.get(), null, null);
            case 5:
                return new hba(((dws) this.f26524c).m6830a(), (fve) this.f26523b.get(), (kms) this.f26525d.get(), (har) this.f26526e.get(), (dhv) this.f26522a.get());
            case 6:
                return new hcd((lih) this.f26526e.get(), this.f26524c, this.f26522a, this.f26525d, (jvd) this.f26523b.get(), null);
            case 7:
                chx chxVar = (chx) this.f26523b.get();
                hic hicVar = new hic(((dws) this.f26524c).m6830a(), (jwn) this.f26526e.get(), this.f26525d, (Executor) this.f26522a.get());
                chxVar.f5767b.m13537d(hicVar);
                return hicVar;
            case 8:
                chx chxVar2 = (chx) this.f26523b.get();
                hic hicVar2 = new hic(((dws) this.f26524c).m6830a(), (jwn) this.f26526e.get(), this.f26525d, (Executor) this.f26522a.get());
                chxVar2.f5767b.m13537d(hicVar2);
                return hicVar2;
            case 9:
                return new hmr((hlw) this.f26523b.get(), (Executor) this.f26522a.get(), (kbz) this.f26526e.get(), (kpa) this.f26524c.get(), (dhv) this.f26525d.get());
            case 10:
                return new hnt((fcp) this.f26526e.get(), (hns) this.f26525d.get(), ((fav) this.f26524c).get(), (jvd) this.f26522a.get(), (dhv) this.f26523b.get());
            case 11:
                return new hua((jvd) this.f26525d.get(), (drj) this.f26524c.get(), (bkn) this.f26523b.get(), (dox) this.f26522a.get(), (mrm) this.f26526e.get(), null, null, null, null, null);
            case 12:
                return new hwu((BottomBarController) this.f26523b.get(), (igb) this.f26526e.get(), (gfa) this.f26522a.get(), (jfs) this.f26525d.get(), (drj) this.f26524c.get(), null, null, null);
            case 13:
                return new hxy(((ema) this.f26524c).get(), (dhv) this.f26523b.get(), (jvd) this.f26525d.get(), (jww) this.f26526e.get(), ((hzr) this.f26522a).get());
            case 14:
                return new hxz(((ema) this.f26524c).get(), (hxw) this.f26523b.get(), (hah) this.f26526e.get(), (dhv) this.f26522a.get(), ((hzr) this.f26525d).get());
            case 15:
                return new ike((iex) this.f26526e.get(), this.f26523b, (dhv) this.f26522a.get(), ((erq) this.f26524c).get(), (elx) this.f26525d.get(), 1);
            case 16:
                return new kgt(((kbm) this.f26522a).get(), (Executor) this.f26524c.get(), (khb) this.f26523b.get(), ((kjb) this.f26525d).get(), (kbz) this.f26526e.get(), null, null, null, null);
            case 17:
                return new kkk((kkz) this.f26525d.get(), (jvb) this.f26523b.get(), (Executor) this.f26524c.get(), ((kbm) this.f26522a).get(), (kbz) this.f26526e.get());
            case 18:
                Map map = (Map) this.f26525d.get();
                kfl kflVar = (kfl) this.f26523b.get();
                InterfaceC0951rb interfaceC0951rb = (InterfaceC0951rb) this.f26524c.get();
                kkz kkzVar = (kkz) this.f26526e.get();
                jvb jvbVar = (jvb) this.f26522a.get();
                map.getClass();
                kflVar.getClass();
                interfaceC0951rb.getClass();
                kkzVar.getClass();
                jvbVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    kgi kgiVar = (kgi) entry.getKey();
                    bkn bknVar = (bkn) entry.getValue();
                    kgg kggVarMo14137b = kflVar.mo14137b(kgiVar);
                    InterfaceC0978sb interfaceC0978sbMo19368a = interfaceC0951rb.mo19368a();
                    bknVar.getClass();
                    C0959rj c0959rj = (C0959rj) ((C1097wm) interfaceC0978sbMo19368a).f47939a.get(bknVar);
                    if (c0959rj != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Mapped Stream ");
                        sb.append(kggVarMo14137b);
                        sb.append(" to CameraStream ");
                        sb.append(c0959rj);
                        linkedHashMap.put(kggVarMo14137b, c0959rj);
                    }
                }
                for (kkr kkrVar : kkzVar.f36450c) {
                    jvbVar.m13537d(kkrVar.f36403a.mo3830a(new kkp(linkedHashMap, kkrVar, interfaceC0951rb, 0), not.INSTANCE));
                }
                for (kkq kkqVar : kkzVar.f36449b) {
                    C0959rj c0959rj2 = (C0959rj) linkedHashMap.get(kkqVar);
                    if (c0959rj2 != null) {
                        String strM19387b = C0979sc.m19387b(c0959rj2.f47553a);
                        Surface surfaceMo14452g = kkqVar.mo14452g();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Setting surface for buffered CameraStream, id=");
                        sb2.append(strM19387b);
                        sb2.append(", surface=");
                        sb2.append(surfaceMo14452g);
                        interfaceC0951rb.mo19370c(c0959rj2.f47553a, kkqVar.mo14452g());
                    }
                }
                return linkedHashMap;
            case 19:
                Context contextM6830a2 = ((dws) this.f26525d).m6830a();
                kqv kqvVar = ((hlz) this.f26524c).get();
                return new kqj(contextM6830a2, contextM6830a2.getContentResolver(), kqvVar, ((kbm) this.f26522a).get());
            default:
                return new lkh((mrm) ((ohj) this.f26522a).f46012a, ohh.m18485a(this.f26524c), ((dws) this.f26523b).m6830a(), ohh.m18485a(this.f26525d), ohh.m18485a(this.f26526e));
        }
    }
}
