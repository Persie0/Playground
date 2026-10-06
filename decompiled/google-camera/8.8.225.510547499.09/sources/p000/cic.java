package p000;

import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cic implements kba {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5783a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5784b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f5785c;

    public /* synthetic */ cic(cgm cgmVar, iuj iujVar, int i) {
        this.f5785c = i;
        this.f5784b = cgmVar;
        this.f5783a = iujVar;
    }

    public /* synthetic */ cic(cie cieVar, cid cidVar, int i) {
        this.f5785c = i;
        this.f5783a = cieVar;
        this.f5784b = cidVar;
    }

    public /* synthetic */ cic(ckw ckwVar, iuh iuhVar, int i) {
        this.f5785c = i;
        this.f5784b = ckwVar;
        this.f5783a = iuhVar;
    }

    public /* synthetic */ cic(csd csdVar, kfv kfvVar, int i, byte[] bArr) {
        this.f5785c = i;
        this.f5784b = csdVar;
        this.f5783a = kfvVar;
    }

    public /* synthetic */ cic(cwd cwdVar, AmbientMode.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5785c = i;
        this.f5784b = cwdVar;
        this.f5783a = ambientController;
    }

    public /* synthetic */ cic(cwd cwdVar, clk clkVar, int i, byte[] bArr, byte[] bArr2) {
        this.f5785c = i;
        this.f5783a = cwdVar;
        this.f5784b = clkVar;
    }

    public /* synthetic */ cic(cxo cxoVar, cxn cxnVar, int i) {
        this.f5785c = i;
        this.f5783a = cxoVar;
        this.f5784b = cxnVar;
    }

    public /* synthetic */ cic(czr czrVar, czp czpVar, int i) {
        this.f5785c = i;
        this.f5783a = czrVar;
        this.f5784b = czpVar;
    }

    public /* synthetic */ cic(dab dabVar, AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2) {
        this.f5785c = i;
        this.f5784b = dabVar;
        this.f5783a = ambientController;
    }

    public /* synthetic */ cic(dbe dbeVar, dbi dbiVar, int i) {
        this.f5785c = i;
        this.f5784b = dbeVar;
        this.f5783a = dbiVar;
    }

    public /* synthetic */ cic(dff dffVar, kba kbaVar, int i) {
        this.f5785c = i;
        this.f5784b = dffVar;
        this.f5783a = kbaVar;
    }

    public /* synthetic */ cic(dfn dfnVar, guj gujVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5785c = i;
        this.f5784b = dfnVar;
        this.f5783a = gujVar;
    }

    public /* synthetic */ cic(dfo dfoVar, ggm ggmVar, int i) {
        this.f5785c = i;
        this.f5784b = dfoVar;
        this.f5783a = ggmVar;
    }

    public /* synthetic */ cic(dni dniVar, kev kevVar, int i) {
        this.f5785c = i;
        this.f5784b = dniVar;
        this.f5783a = kevVar;
    }

    public cic(dny dnyVar, doe doeVar, int i) {
        this.f5785c = i;
        this.f5784b = dnyVar;
        this.f5783a = doeVar;
    }

    public /* synthetic */ cic(dvx dvxVar, chs chsVar, int i) {
        this.f5785c = i;
        this.f5783a = dvxVar;
        this.f5784b = chsVar;
    }

    public /* synthetic */ cic(dxx dxxVar, dxy dxyVar, int i) {
        this.f5785c = i;
        this.f5784b = dxxVar;
        this.f5783a = dxyVar;
    }

    public /* synthetic */ cic(dyb dybVar, dxr dxrVar, int i) {
        this.f5785c = i;
        this.f5783a = dybVar;
        this.f5784b = dxrVar;
    }

    public /* synthetic */ cic(ebw ebwVar, oyo oyoVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5785c = i;
        this.f5783a = ebwVar;
        this.f5784b = oyoVar;
    }

    public /* synthetic */ cic(gye gyeVar, djr djrVar, int i) {
        this.f5785c = i;
        this.f5783a = gyeVar;
        this.f5784b = djrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kos] */
    /* JADX WARN: Type inference failed for: r1v10, types: [guj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kba] */
    /* JADX WARN: Type inference failed for: r1v17, types: [ggm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [ggm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [gyi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kev] */
    /* JADX WARN: Type inference failed for: r1v23, types: [dxy, java.lang.Object] */
    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f5785c) {
            case 0:
                Object obj = this.f5783a;
                Object obj2 = this.f5784b;
                synchronized (obj) {
                    ((cie) obj).f5786a.remove(obj2);
                    break;
                }
                return;
            case 1:
                Object obj3 = this.f5784b;
                Object obj4 = this.f5783a;
                ((ite) obj4).f32064O.f7407c.remove(((cgm) obj3).f5630e);
                return;
            case 2:
                Object obj5 = this.f5784b;
                ((ite) ((ckw) obj5).f6056o).f32104i.remove(this.f5783a);
                return;
            case 3:
                Object obj6 = this.f5783a;
                Object obj7 = this.f5784b;
                synchronized (((cwd) obj6).f9866a) {
                    ((cwd) obj6).f9866a.remove(obj7);
                    break;
                }
                return;
            case 4:
                Object obj8 = this.f5784b;
                Object obj9 = this.f5783a;
                synchronized (((cwd) obj8).f9866a) {
                    ((cwd) obj8).f9866a.remove(obj9);
                    break;
                }
                return;
            case 5:
                Object obj10 = this.f5784b;
                ((csd) obj10).f9217a.remove(this.f5783a);
                return;
            case 6:
                Object obj11 = this.f5784b;
                ((guk) ((dfn) obj11).f10790c).m9777b(this.f5783a);
                return;
            case 7:
                Object obj12 = this.f5783a;
                ((cxo) obj12).f9988a.remove(this.f5784b);
                return;
            case 8:
                Object obj13 = this.f5783a;
                Object obj14 = this.f5784b;
                synchronized (obj13) {
                    ((czr) obj13).f10135a.remove(obj14);
                    break;
                }
                return;
            case 9:
                Object obj15 = this.f5784b;
                ((dab) obj15).f10208c.remove(this.f5783a);
                return;
            case 10:
                Object obj16 = this.f5784b;
                ((dbe) obj16).f10370e.remove(this.f5783a);
                return;
            case 11:
                Object obj17 = this.f5784b;
                ?? r1 = this.f5783a;
                dff dffVar = (dff) obj17;
                dffVar.f10770f = dff.f10765a;
                r1.close();
                dffVar.f10774j.evictAll();
                return;
            case 12:
                this.f5783a.mo9218h(this.f5784b);
                return;
            case 13:
                this.f5783a.mo9218h(this.f5784b);
                return;
            case 14:
                ((gye) this.f5783a).m9973h(this.f5784b);
                return;
            case 15:
                ((dni) this.f5784b).m6434d(this.f5783a);
                return;
            case 16:
                ((dny) this.f5784b).f12144a.remove(this.f5783a);
                return;
            case 17:
                Object obj18 = this.f5783a;
                ((dvx) obj18).f12688a.remove(this.f5784b);
                return;
            case 18:
                ((dxx) this.f5784b).m6890f(this.f5783a);
                return;
            case 19:
                ((dyb) this.f5783a).m6916c((dxr) this.f5784b);
                return;
            default:
                Object obj19 = this.f5783a;
                Object obj20 = this.f5784b;
                synchronized (((ebw) obj19).f13309a) {
                    ((ebw) obj19).f13310b.remove(obj20);
                    break;
                }
                return;
        }
    }
}
