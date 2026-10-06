package p000;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gtc {

    /* JADX INFO: renamed from: a */
    private final gtw f26321a;

    /* JADX INFO: renamed from: b */
    private final gtq f26322b;

    /* JADX INFO: renamed from: c */
    private final gtx f26323c;

    /* JADX INFO: renamed from: d */
    private final gtd f26324d;

    /* JADX INFO: renamed from: e */
    private final gsx f26325e;

    /* JADX INFO: renamed from: f */
    private final mrm f26326f;

    /* JADX INFO: renamed from: g */
    private final boolean f26327g;

    /* JADX INFO: renamed from: h */
    private final boolean f26328h;

    /* JADX INFO: renamed from: i */
    private final boolean f26329i;

    /* JADX INFO: renamed from: j */
    private final boolean f26330j;

    /* JADX INFO: renamed from: k */
    private final boolean f26331k;

    /* JADX INFO: renamed from: l */
    private List f26332l = new ArrayList();

    /* JADX INFO: renamed from: m */
    private final bkn f26333m;

    public gtc(gtw gtwVar, gtq gtqVar, gtx gtxVar, gtd gtdVar, gsx gsxVar, bkn bknVar, mrm mrmVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jvb jvbVar, byte[] bArr, byte[] bArr2) {
        this.f26321a = gtwVar;
        this.f26322b = gtqVar;
        this.f26323c = gtxVar;
        this.f26324d = gtdVar;
        this.f26325e = gsxVar;
        this.f26327g = z;
        this.f26328h = z2;
        this.f26329i = z3;
        this.f26330j = z4;
        this.f26331k = z5;
        this.f26326f = mrmVar;
        this.f26333m = bknVar;
        jvbVar.m13537d(gsxVar);
    }

    /* JADX INFO: renamed from: a */
    public final gth m9732a(kpw kpwVar, gsr gsrVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        gtc gtcVar;
        int i;
        int i2 = gsrVar.f26251k;
        float f19 = 1.0f;
        float f20 = (i2 == 2 || i2 == 3) ? 1.0f : 0.0f;
        int i3 = gsrVar.f26250j;
        float f21 = (i3 == 4 || i3 == 2) ? 1.0f : 0.0f;
        int i4 = gsrVar.f26252l;
        float f22 = (i4 == 2 || i4 == 3) ? 1.0f : 0.0f;
        gsu[] gsuVarArr = gsrVar.f26257q;
        gsuVarArr.getClass();
        int length = gsuVarArr.length;
        float f23 = length;
        Rect rect = gsrVar.f26260t;
        rect.getClass();
        gsuVarArr.getClass();
        if (length == 0) {
            f = 0.0f;
        } else {
            int i5 = 0;
            float fMin = 0.0f;
            while (i5 < length) {
                gsu gsuVar = gsuVarArr[i5];
                int iWidth = rect.width();
                int iHeight = rect.height();
                Rect rect2 = gsuVar.f26286a;
                float f24 = iWidth;
                float f25 = f24 * 0.04f;
                float f26 = iHeight;
                float f27 = 0.04f * f26;
                fMin += Math.min(f19 - exg.m7987q((-(rect2.left - (f24 * 0.15f))) / f25), Math.min(1.0f - exg.m7987q((rect2.right - (f24 * 0.85f)) / f25), Math.min(1.0f - exg.m7987q((-(rect2.top - (0.15f * f26))) / f27), 1.0f - exg.m7987q((rect2.bottom - (f26 * 0.85f)) / f27)))) / gsuVarArr.length;
                i5++;
                f19 = 1.0f;
            }
            f = fMin;
        }
        float fM9766a = this.f26322b.m9766a(gsrVar);
        int i6 = gsrVar.f26253m;
        gtx gtxVar = this.f26323c;
        float f28 = (gtxVar.f26420a * 0.85f) + (gsrVar.f26256p * 0.14999998f);
        gtxVar.f26420a = f28;
        double dPow = 1.0d / Math.pow(gsrVar.f26244d / 1000000.0f, 6.0d);
        float fM9719a = this.f26325e.m9719a(kpwVar, gsrVar);
        float fM2560I = this.f26333m.m2560I(kpwVar);
        mrm mrmVarM9720b = this.f26325e.m9720b();
        float f29 = fM2560I;
        mrm mrmVarM9770b = this.f26330j ? this.f26321a.m9770b(kpwVar, gsrVar, true) : mqu.f41450a;
        float f30 = fM9719a;
        float f31 = f;
        mrm mrmVarM7986p = exg.m7986p(this.f26326f, kpwVar.mo7248d());
        float f32 = mrmVarM9770b.mo16813g() ? ((gtt) mrmVarM9770b.mo16809c()).f26394b : 0.0f;
        boolean z = gsrVar.f26258r;
        boolean zM9721c = this.f26325e.m9721c();
        if (this.f26331k) {
            if (this.f26328h && f23 == 0.0f) {
                f2 = 0.02866f;
                f3 = 0.00574f;
                f4 = 0.28866f;
                f5 = 0.0f;
                f6 = 0.06516f;
                f7 = 0.07841f;
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.03507f;
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
                f6 = 0.53251f;
                f7 = 0.35236f;
                f8 = 0.02168f;
                f9 = 0.0f;
                f10 = 0.09346f;
            }
        } else if (this.f26329i) {
            if (this.f26328h && f23 == 0.0f) {
                f2 = 0.02396f;
                f3 = 0.00479f;
                f4 = 0.24129f;
                f5 = 0.0f;
                f6 = 0.05419f;
                f7 = 0.06547f;
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.02924f;
            } else {
                f2 = 0.0f;
                f3 = 0.00368f;
                f4 = 0.0f;
                f5 = 0.0f;
                f6 = 0.57261f;
                f7 = 0.32227f;
                f8 = 0.01841f;
                f9 = 0.0f;
                f10 = 0.08302f;
            }
        } else if (this.f26328h && f23 == 0.0f) {
            f2 = 0.00359f;
            f3 = 0.0f;
            f4 = 0.08336f;
            f5 = 1.6E-4f;
            f6 = 0.03037f;
            f7 = 0.00614f;
            f8 = 0.0f;
            f9 = 0.0f;
            f10 = 0.01661f;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
            f5 = 0.0f;
            f6 = 0.86336f;
            f7 = 0.0f;
            f8 = 0.04085f;
            f9 = 0.00393f;
            f10 = 0.09186f;
        }
        float f33 = f28 * ((float) (1.0d - (2.0d / (dPow + 1.0d))));
        float f34 = i6 == 0 ? 1.0f : 0.0f;
        float f35 = (f20 * f5) + 0.0f;
        float f36 = f21 * f3;
        float f37 = f22 * 0.0f;
        float f38 = f23 * 0.0f;
        float f39 = f31 * f8;
        float f40 = f32 * f6;
        float f41 = fM9766a * f7;
        float f42 = f30 * f4;
        float f43 = f29 * f2;
        float f44 = f3;
        float f45 = (f33 + 1.0f) / 2.0f;
        if (this.f26327g) {
            ArrayList arrayList = new ArrayList();
            if (mrmVarM9770b.mo16813g()) {
                gts[] gtsVarArr = ((gtt) mrmVarM9770b.mo16809c()).f26393a;
                int length2 = gtsVarArr.length;
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = length2;
                    gts gtsVar = gtsVarArr[i7];
                    gts[] gtsVarArr2 = gtsVarArr;
                    nxl nxlVarM18137O = obo.f45338g.m18137O();
                    float f46 = f5;
                    float f47 = fM9766a;
                    long j = gtsVar.f26386a;
                    float f48 = f8;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    float f49 = f44;
                    obo oboVar = (obo) nxqVar;
                    oboVar.f45340a |= 1;
                    oboVar.f45341b = j;
                    float f50 = gtsVar.f26388c;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obo oboVar2 = (obo) nxlVarM18137O.f44974b;
                    oboVar2.f45340a |= 4;
                    oboVar2.f45343d = f50;
                    mrm mrmVar = gtsVar.f26387b;
                    if (mrmVar.mo16813g()) {
                        long jLongValue = ((Long) mrmVar.mo16809c()).longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        obo oboVar3 = (obo) nxlVarM18137O.f44974b;
                        oboVar3.f45340a |= 2;
                        oboVar3.f45342c = jLongValue;
                    }
                    mrm mrmVar2 = gtsVar.f26391f;
                    if (mrmVar2.mo16813g()) {
                        Iterable iterable = (Iterable) mrmVar2.mo16809c();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        obo oboVar4 = (obo) nxlVarM18137O.f44974b;
                        nxv nxvVar = oboVar4.f45344e;
                        if (!nxvVar.mo17770c()) {
                            oboVar4.f45344e = nxq.m18124R(nxvVar);
                        }
                        nwb.m17749e(iterable, oboVar4.f45344e);
                    }
                    mrm mrmVar3 = gtsVar.f26392g;
                    if (mrmVar3.mo16813g()) {
                        Iterable iterable2 = (Iterable) mrmVar3.mo16809c();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        obo oboVar5 = (obo) nxlVarM18137O.f44974b;
                        nxv nxvVar2 = oboVar5.f45345f;
                        if (!nxvVar2.mo17770c()) {
                            oboVar5.f45345f = nxq.m18124R(nxvVar2);
                        }
                        nwb.m17749e(iterable2, oboVar5.f45345f);
                    }
                    arrayList.add((obo) nxlVarM18137O.mo18103l());
                    i7++;
                    length2 = i8;
                    fM9766a = f47;
                    gtsVarArr = gtsVarArr2;
                    f5 = f46;
                    f8 = f48;
                    f44 = f49;
                }
                f15 = f5;
                f16 = fM9766a;
                f17 = f44;
                f18 = f8;
            } else {
                f15 = f5;
                f16 = fM9766a;
                f17 = f44;
                f18 = f8;
            }
            nxl nxlVarM18137O2 = obh.f45269r.m18137O();
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O2.f44974b;
            obh obhVar = (obh) nxqVar2;
            obhVar.f45271a |= 1;
            obhVar.f45272b = f20;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar3 = nxlVarM18137O2.f44974b;
            obh obhVar2 = (obh) nxqVar3;
            obhVar2.f45271a |= 2;
            obhVar2.f45273c = f21;
            if (!nxqVar3.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar4 = nxlVarM18137O2.f44974b;
            obh obhVar3 = (obh) nxqVar4;
            obhVar3.f45271a |= 4;
            obhVar3.f45274d = f22;
            if (!nxqVar4.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar5 = nxlVarM18137O2.f44974b;
            obh obhVar4 = (obh) nxqVar5;
            obhVar4.f45271a |= 8;
            obhVar4.f45275e = f23;
            if (!nxqVar5.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar6 = nxlVarM18137O2.f44974b;
            obh obhVar5 = (obh) nxqVar6;
            obhVar5.f45271a |= 16;
            f12 = f31;
            obhVar5.f45276f = f12;
            if (!nxqVar6.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar7 = nxlVarM18137O2.f44974b;
            obh obhVar6 = (obh) nxqVar7;
            obhVar6.f45271a |= 32;
            obhVar6.f45277g = f32;
            if (!nxqVar7.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar8 = nxlVarM18137O2.f44974b;
            obh obhVar7 = (obh) nxqVar8;
            obhVar7.f45271a |= 64;
            float f51 = f16;
            obhVar7.f45278h = f51;
            if (!nxqVar8.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar9 = nxlVarM18137O2.f44974b;
            obh obhVar8 = (obh) nxqVar9;
            obhVar8.f45271a |= 128;
            obhVar8.f45279i = f34;
            if (!nxqVar9.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar10 = nxlVarM18137O2.f44974b;
            obh obhVar9 = (obh) nxqVar10;
            obhVar9.f45271a |= 256;
            obhVar9.f45280j = f45;
            if (!nxqVar10.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar11 = nxlVarM18137O2.f44974b;
            obh obhVar10 = (obh) nxqVar11;
            obhVar10.f45271a |= 512;
            f30 = f30;
            obhVar10.f45281k = f30;
            if (!nxqVar11.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            obh obhVar11 = (obh) nxlVarM18137O2.f44974b;
            obhVar11.f45271a |= 1024;
            obhVar11.f45282l = f29;
            float f52 = mrmVarM9770b.mo16813g() ? ((gtt) mrmVarM9770b.mo16809c()).f26395c : 0.0f;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            obh obhVar12 = (obh) nxlVarM18137O2.f44974b;
            obhVar12.f45271a |= 2048;
            obhVar12.f45285o = f52;
            float f53 = mrmVarM9770b.mo16813g() ? ((gtt) mrmVarM9770b.mo16809c()).f26396d : 0.0f;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            obh obhVar13 = (obh) nxlVarM18137O2.f44974b;
            obhVar13.f45271a |= 4096;
            obhVar13.f45286p = f53;
            float f54 = mrmVarM9770b.mo16813g() ? ((gtt) mrmVarM9770b.mo16809c()).f26397e : 0.0f;
            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            nxq nxqVar12 = nxlVarM18137O2.f44974b;
            obh obhVar14 = (obh) nxqVar12;
            f29 = f29;
            obhVar14.f45271a |= 8192;
            obhVar14.f45287q = f54;
            if (!nxqVar12.m18142ac()) {
                nxlVarM18137O2.mo18106p();
            }
            obh obhVar15 = (obh) nxlVarM18137O2.f44974b;
            nxy nxyVar = obhVar15.f45283m;
            if (!nxyVar.mo17770c()) {
                obhVar15.f45283m = nxq.m18127U(nxyVar);
            }
            nwb.m17749e(arrayList, obhVar15.f45283m);
            if (mrmVarM9720b.mo16813g()) {
                float[] fArr = (float[]) mrmVarM9720b.mo16809c();
                gtcVar = this;
                if (gtcVar.f26332l.isEmpty()) {
                    gtcVar.f26332l = new ArrayList(Collections.nCopies(fArr.length, Float.valueOf(0.0f)));
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < fArr.length) {
                    gtcVar.f26332l.set(i, Float.valueOf(fArr[i]));
                    i++;
                }
                List list = gtcVar.f26332l;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                obh obhVar16 = (obh) nxlVarM18137O2.f44974b;
                nxv nxvVar3 = obhVar16.f45284n;
                if (!nxvVar3.mo17770c()) {
                    obhVar16.f45284n = nxq.m18124R(nxvVar3);
                }
                nwb.m17749e(list, obhVar16.f45284n);
            } else {
                gtcVar = this;
                f30 = f30;
            }
            obh obhVar17 = (obh) nxlVarM18137O2.mo18103l();
            nxl nxlVarM18137O3 = obi.f45288m.m18137O();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar13 = nxlVarM18137O3.f44974b;
            obi obiVar = (obi) nxqVar13;
            obiVar.f45290a |= 1;
            obiVar.f45291b = f15;
            if (!nxqVar13.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar14 = nxlVarM18137O3.f44974b;
            obi obiVar2 = (obi) nxqVar14;
            obiVar2.f45290a |= 2;
            obiVar2.f45292c = f17;
            if (!nxqVar14.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar15 = nxlVarM18137O3.f44974b;
            obi obiVar3 = (obi) nxqVar15;
            obiVar3.f45290a |= 4;
            obiVar3.f45293d = 0.0f;
            if (!nxqVar15.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar16 = nxlVarM18137O3.f44974b;
            obi obiVar4 = (obi) nxqVar16;
            obiVar4.f45290a |= 8;
            obiVar4.f45294e = 0.0f;
            if (!nxqVar16.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar17 = nxlVarM18137O3.f44974b;
            obi obiVar5 = (obi) nxqVar17;
            obiVar5.f45290a |= 16;
            obiVar5.f45295f = f18;
            if (!nxqVar17.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar18 = nxlVarM18137O3.f44974b;
            obi obiVar6 = (obi) nxqVar18;
            obiVar6.f45290a |= 32;
            obiVar6.f45296g = f6;
            if (!nxqVar18.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar19 = nxlVarM18137O3.f44974b;
            obi obiVar7 = (obi) nxqVar19;
            obiVar7.f45290a |= 64;
            obiVar7.f45297h = f7;
            if (!nxqVar19.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar20 = nxlVarM18137O3.f44974b;
            obi obiVar8 = (obi) nxqVar20;
            obiVar8.f45290a |= 128;
            f13 = f9;
            obiVar8.f45298i = f13;
            if (!nxqVar20.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar21 = nxlVarM18137O3.f44974b;
            obi obiVar9 = (obi) nxqVar21;
            obiVar9.f45290a |= 256;
            f14 = f10;
            obiVar9.f45299j = f14;
            if (!nxqVar21.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            nxq nxqVar22 = nxlVarM18137O3.f44974b;
            obi obiVar10 = (obi) nxqVar22;
            f11 = f51;
            obiVar10.f45290a |= 512;
            obiVar10.f45300k = f4;
            if (!nxqVar22.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            obi obiVar11 = (obi) nxlVarM18137O3.f44974b;
            obiVar11.f45290a |= 1024;
            obiVar11.f45301l = f2;
            gtcVar.f26324d.m9737a(kpwVar.mo7248d(), obhVar17, (obi) nxlVarM18137O3.mo18103l());
        } else {
            f11 = fM9766a;
            f12 = f31;
            f13 = f9;
            f14 = f10;
        }
        return new gth(kpwVar.mo7248d(), f35 + f36 + f37 + f38 + f39 + f40 + f41 + (f34 * f13) + (f45 * f14) + f42 + f43, f20, f21, f22, f23, f12, f32, f11, f34, f45, f29, f30, z, zM9721c, mrmVarM9770b, mrmVarM7986p, mrmVarM9720b);
    }
}
