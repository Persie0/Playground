package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class clq implements hjk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6168c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6169d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f6170e;

    public /* synthetic */ clq(Context context, ckp ckpVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, int i) {
        this.f6170e = i;
        this.f6169d = context;
        this.f6166a = ckpVar;
        this.f6168c = scheduledExecutorService;
        this.f6167b = scheduledExecutorService2;
    }

    public /* synthetic */ clq(AmbientModeSupport.AmbientController ambientController, mxk mxkVar, jwn jwnVar, ohb ohbVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f6170e = i;
        this.f6169d = ambientController;
        this.f6168c = mxkVar;
        this.f6166a = jwnVar;
        this.f6167b = ohbVar;
    }

    public /* synthetic */ clq(cdu cduVar, jww jwwVar, dlc dlcVar, igb igbVar, int i) {
        this.f6170e = i;
        this.f6169d = cduVar;
        this.f6167b = jwwVar;
        this.f6166a = dlcVar;
        this.f6168c = igbVar;
    }

    public /* synthetic */ clq(cwd cwdVar, mpx mpxVar, dsx dsxVar, cdu cduVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f6170e = i;
        this.f6166a = cwdVar;
        this.f6167b = mpxVar;
        this.f6168c = dsxVar;
        this.f6169d = cduVar;
    }

    public /* synthetic */ clq(jvd jvdVar, oju ojuVar, mrm mrmVar, oju ojuVar2, int i) {
        this.f6170e = i;
        this.f6169d = jvdVar;
        this.f6168c = ojuVar;
        this.f6166a = mrmVar;
        this.f6167b = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r2v2, types: [dlc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r3v3, types: [igb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, oju] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6170e) {
            case 0:
                Object obj = this.f6166a;
                Object obj2 = this.f6167b;
                Object obj3 = this.f6168c;
                Object obj4 = this.f6169d;
                final dsx dsxVar = (dsx) obj3;
                final mpx mpxVar = (mpx) obj2;
                final byte[] bArr = null;
                final byte[] bArr2 = null;
                final byte[] bArr3 = null;
                final byte[] bArr4 = null;
                clk clkVar = new clk(dsxVar, bArr, bArr2, bArr3, bArr4) { // from class: clr

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ dsx f6172b;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Code duplicated, block: B:223:0x04e6  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
                    /* JADX WARN: Type inference failed for: r4v47, types: [fcp, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.List] */
                    @Override // p000.clk
                    /* JADX INFO: renamed from: a */
                    public final void mo3918a(long j, clx clxVar) {
                        float f;
                        byte b;
                        mpx mpxVar2 = this.f6171a;
                        dsx dsxVar2 = this.f6172b;
                        ?? r4 = mpxVar2.f41306a;
                        Long lValueOf = Long.valueOf(j);
                        r4.add(lValueOf);
                        mpxVar2.f41308c.add(Long.valueOf(((msn) mpxVar2.f41309d).mo15326a()));
                        nxl nxlVarM18137O = nle.f43483p.m18137O();
                        String string = ((UUID) ((mpx) dsxVar2.f12521a).f41310e).toString();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nle nleVar = (nle) nxlVarM18137O.f44974b;
                        string.getClass();
                        int i = 1;
                        nleVar.f43485a |= 1;
                        nleVar.f43486b = string;
                        int iIndexOf = ((mpx) dsxVar2.f12521a).f41306a.indexOf(lValueOf) + 1;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar = nxlVarM18137O.f44974b;
                        nle nleVar2 = (nle) nxqVar;
                        int i2 = 2;
                        nleVar2.f43485a |= 2;
                        nleVar2.f43487c = iIndexOf;
                        if (!nxqVar.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar2 = nxlVarM18137O.f44974b;
                        nle nleVar3 = (nle) nxqVar2;
                        nleVar3.f43488d = 0;
                        nleVar3.f43485a |= 4;
                        long j2 = clxVar.f6182a;
                        if (!nxqVar2.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar3 = nxlVarM18137O.f44974b;
                        nle nleVar4 = (nle) nxqVar3;
                        nleVar4.f43485a |= 8;
                        nleVar4.f43489e = j2;
                        long j3 = clxVar.f6183b;
                        if (!nxqVar3.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar4 = nxlVarM18137O.f44974b;
                        nle nleVar5 = (nle) nxqVar4;
                        nleVar5.f43485a |= 16;
                        nleVar5.f43490f = j3;
                        int i3 = clxVar.f6184c;
                        if (!nxqVar4.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar5 = nxlVarM18137O.f44974b;
                        nle nleVar6 = (nle) nxqVar5;
                        nleVar6.f43485a |= 32;
                        nleVar6.f43491g = i3;
                        int i4 = clxVar.f6185d;
                        if (!nxqVar5.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar6 = nxlVarM18137O.f44974b;
                        nle nleVar7 = (nle) nxqVar6;
                        nleVar7.f43485a |= 64;
                        nleVar7.f43492h = i4;
                        int i5 = clxVar.f6186e;
                        if (!nxqVar6.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxq nxqVar7 = nxlVarM18137O.f44974b;
                        nle nleVar8 = (nle) nxqVar7;
                        nleVar8.f43485a |= 128;
                        nleVar8.f43493i = i5;
                        float f2 = clxVar.f6187f;
                        if (!nxqVar7.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nle nleVar9 = (nle) nxlVarM18137O.f44974b;
                        nleVar9.f43485a |= 256;
                        nleVar9.f43494j = f2;
                        odg odgVar = clxVar.f6188g.f45617i;
                        if (odgVar == null) {
                            odgVar = odg.f45596i;
                        }
                        oda odaVar = odgVar.f45601d;
                        if (odaVar == null) {
                            odaVar = oda.f45573b;
                        }
                        if (odaVar.f45575a.size() > 138) {
                            odg odgVar2 = clxVar.f6188g.f45617i;
                            if (odgVar2 == null) {
                                odgVar2 = odg.f45596i;
                            }
                            oda odaVar2 = odgVar2.f45601d;
                            if (odaVar2 == null) {
                                odaVar2 = oda.f45573b;
                            }
                            float fMo18032d = odaVar2.f45575a.mo18032d(138);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nle nleVar10 = (nle) nxlVarM18137O.f44974b;
                            nleVar10.f43485a |= 512;
                            nleVar10.f43496l = fMo18032d;
                        }
                        odg odgVar3 = clxVar.f6188g.f45617i;
                        if (odgVar3 == null) {
                            odgVar3 = odg.f45596i;
                        }
                        if (odgVar3.m18402c("v_sign")) {
                            odg odgVar4 = clxVar.f6188g.f45617i;
                            if (odgVar4 == null) {
                                odgVar4 = odg.f45596i;
                            }
                            nyr nyrVar = odgVar4.f45600c;
                            if (!nyrVar.containsKey("v_sign")) {
                                throw new IllegalArgumentException();
                            }
                            float f3 = ((odf) nyrVar.get("v_sign")).f45594a;
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nle nleVar11 = (nle) nxlVarM18137O.f44974b;
                            nleVar11.f43485a |= 1024;
                            nleVar11.f43497m = f3;
                        }
                        odg odgVar5 = clxVar.f6188g.f45617i;
                        if (odgVar5 == null) {
                            odgVar5 = odg.f45596i;
                        }
                        if (odgVar5.m18402c("stop")) {
                            odg odgVar6 = clxVar.f6188g.f45617i;
                            if (odgVar6 == null) {
                                odgVar6 = odg.f45596i;
                            }
                            nyr nyrVar2 = odgVar6.f45600c;
                            if (!nyrVar2.containsKey("stop")) {
                                throw new IllegalArgumentException();
                            }
                            float f4 = ((odf) nyrVar2.get("stop")).f45594a;
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nle nleVar12 = (nle) nxlVarM18137O.f44974b;
                            nleVar12.f43485a |= 2048;
                            nleVar12.f43498n = f4;
                        }
                        odg odgVar7 = clxVar.f6188g.f45617i;
                        if (odgVar7 == null) {
                            odgVar7 = odg.f45596i;
                        }
                        String str = zuAgeeF.PICY;
                        if (odgVar7.m18402c(str)) {
                            odg odgVar8 = clxVar.f6188g.f45617i;
                            if (odgVar8 == null) {
                                odgVar8 = odg.f45596i;
                            }
                            nyr nyrVar3 = odgVar8.f45600c;
                            if (!nyrVar3.containsKey(str)) {
                                throw new IllegalArgumentException();
                            }
                            float f5 = ((odf) nyrVar3.get(str)).f45594a;
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nle nleVar13 = (nle) nxlVarM18137O.f44974b;
                            nleVar13.f43485a |= 4096;
                            nleVar13.f43499o = f5;
                        }
                        ocd ocdVar = clxVar.f6188g.f45613e;
                        if (ocdVar == null) {
                            ocdVar = ocd.f45443b;
                        }
                        for (occ occVar : ocdVar.f45445a) {
                            nxl nxlVarM18137O2 = nld.f43455A.m18137O();
                            if ((occVar.f45432a & i) != 0) {
                                oca ocaVar = occVar.f45433b;
                                if (ocaVar == null) {
                                    ocaVar = oca.f45417f;
                                }
                                nxl nxlVarM18137O3 = nlc.f43448f.m18137O();
                                float f6 = ocaVar.f45420b;
                                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                    nxlVarM18137O3.mo18106p();
                                }
                                nxq nxqVar8 = nxlVarM18137O3.f44974b;
                                nlc nlcVar = (nlc) nxqVar8;
                                nlcVar.f43450a |= i;
                                nlcVar.f43451b = f6;
                                float f7 = ocaVar.f45422d;
                                if (!nxqVar8.m18142ac()) {
                                    nxlVarM18137O3.mo18106p();
                                }
                                nxq nxqVar9 = nxlVarM18137O3.f44974b;
                                nlc nlcVar2 = (nlc) nxqVar9;
                                nlcVar2.f43450a |= 4;
                                nlcVar2.f43453d = f7;
                                float f8 = ocaVar.f45421c;
                                if (!nxqVar9.m18142ac()) {
                                    nxlVarM18137O3.mo18106p();
                                }
                                nxq nxqVar10 = nxlVarM18137O3.f44974b;
                                nlc nlcVar3 = (nlc) nxqVar10;
                                nlcVar3.f43450a |= i2;
                                nlcVar3.f43452c = f8;
                                float f9 = ocaVar.f45423e;
                                if (!nxqVar10.m18142ac()) {
                                    nxlVarM18137O3.mo18106p();
                                }
                                nlc nlcVar4 = (nlc) nxlVarM18137O3.f44974b;
                                nlcVar4.f43450a |= 8;
                                nlcVar4.f43454e = f9;
                                nlc nlcVar5 = (nlc) nxlVarM18137O3.mo18103l();
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nld nldVar = (nld) nxlVarM18137O2.f44974b;
                                nlcVar5.getClass();
                                nldVar.f43458b = nlcVar5;
                                nldVar.f43457a |= i;
                            }
                            if ((occVar.f45432a & i2) != 0) {
                                float f10 = occVar.f45435d;
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nld nldVar2 = (nld) nxlVarM18137O2.f44974b;
                                nldVar2.f43457a |= i2;
                                nldVar2.f43459c = f10;
                            }
                            if ((occVar.f45432a & 4) != 0) {
                                float f11 = occVar.f45436e;
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nld nldVar3 = (nld) nxlVarM18137O2.f44974b;
                                nldVar3.f43457a |= 4;
                                nldVar3.f43460d = f11;
                            }
                            if ((occVar.f45432a & 8) != 0) {
                                float f12 = occVar.f45437f;
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nld nldVar4 = (nld) nxlVarM18137O2.f44974b;
                                nldVar4.f43457a |= 8;
                                nldVar4.f43461e = f12;
                            }
                            if ((occVar.f45432a & 16) != 0) {
                                float f13 = occVar.f45438g;
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nld nldVar5 = (nld) nxlVarM18137O2.f44974b;
                                nldVar5.f43457a |= 16;
                                nldVar5.f43462f = f13;
                            }
                            if ((occVar.f45432a & 128) != 0) {
                                float f14 = occVar.f45441j;
                                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                    nxlVarM18137O2.mo18106p();
                                }
                                nld nldVar6 = (nld) nxlVarM18137O2.f44974b;
                                nldVar6.f43457a |= 16777216;
                                nldVar6.f43482z = f14;
                            }
                            String[] strArr = new String[19];
                            strArr[0] = "face_landmark_motion_mean";
                            strArr[i] = "face_landmark_motion_variance";
                            strArr[i2] = "eyes_visible";
                            strArr[3] = "mouth_open";
                            strArr[4] = "frontal_gaze";
                            strArr[5] = "smiling";
                            strArr[6] = "amusement";
                            strArr[7] = "contentment";
                            strArr[8] = "elation";
                            strArr[9] = "surprise";
                            strArr[10] = "tongue_out";
                            strArr[11] = "wink";
                            strArr[12] = "puckered_lips";
                            strArr[13] = "puffy_cheeks";
                            strArr[14] = "pouting";
                            strArr[15] = "dark_glasses";
                            strArr[16] = "blurry";
                            strArr[17] = "under_exposed";
                            strArr[18] = "mouth_moving_score";
                            mxk mxkVarM17135G = mxk.m17135G(strArr);
                            for (obz obzVar : occVar.f45439h) {
                                if (mxkVarM17135G.contains(obzVar.f45413b)) {
                                    int i6 = obzVar.f45412a;
                                    if ((i6 & 4) != 0) {
                                        f = obzVar.f45414c;
                                    } else if ((i6 & 8) != 0) {
                                        f = obzVar.f45415d;
                                    }
                                    String str2 = obzVar.f45413b;
                                    switch (str2.hashCode()) {
                                        case -2090390075:
                                            if (str2.equals("smiling")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1823490087:
                                            if (str2.equals("mouth_moving_score")) {
                                                b = 18;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1666318674:
                                            if (str2.equals("elation")) {
                                                b = 8;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1605867799:
                                            if (str2.equals("surprise")) {
                                                b = 9;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1385971474:
                                            if (str2.equals("blurry")) {
                                                b = 16;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1279678573:
                                            if (str2.equals("tongue_out")) {
                                                b = 10;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -1067129503:
                                            if (str2.equals(hiCTUJiAxf.LTe)) {
                                                b = 15;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -623218992:
                                            if (str2.equals("frontal_gaze")) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -590085114:
                                            if (str2.equals("puckered_lips")) {
                                                b = 12;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -389354940:
                                            if (str2.equals("pouting")) {
                                                b = 14;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -388405929:
                                            if (str2.equals("contentment")) {
                                                b = 7;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case -4588171:
                                            if (str2.equals("face_landmark_motion_variance")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 3649551:
                                            if (str2.equals("wink")) {
                                                b = 11;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 222810517:
                                            if (str2.equals("eyes_visible")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 529069753:
                                            if (str2.equals("under_exposed")) {
                                                b = 17;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1000879305:
                                            if (str2.equals("face_landmark_motion_mean")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1014779640:
                                            if (str2.equals("puffy_cheeks")) {
                                                b = 13;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1611065785:
                                            if (str2.equals("amusement")) {
                                                b = 6;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1981056706:
                                            if (str2.equals("mouth_open")) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar7 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar7.f43457a |= 32;
                                            nldVar7.f43463g = f;
                                            break;
                                        case 1:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar8 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar8.f43457a |= 64;
                                            nldVar8.f43464h = f;
                                            break;
                                        case 2:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar9 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar9.f43457a |= 128;
                                            nldVar9.f43465i = f;
                                            break;
                                        case 3:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar10 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar10.f43457a |= 256;
                                            nldVar10.f43466j = f;
                                            break;
                                        case 4:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar11 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar11.f43457a |= 512;
                                            nldVar11.f43467k = f;
                                            break;
                                        case 5:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar12 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar12.f43457a |= 1024;
                                            nldVar12.f43468l = f;
                                            break;
                                        case 6:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar13 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar13.f43457a |= 2048;
                                            nldVar13.f43469m = f;
                                            break;
                                        case 7:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar14 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar14.f43457a |= 4096;
                                            nldVar14.f43470n = f;
                                            break;
                                        case 8:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar15 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar15.f43457a |= 8192;
                                            nldVar15.f43471o = f;
                                            break;
                                        case 9:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar16 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar16.f43457a |= 16384;
                                            nldVar16.f43472p = f;
                                            break;
                                        case 10:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar17 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar17.f43457a |= 32768;
                                            nldVar17.f43473q = f;
                                            break;
                                        case 11:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar18 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar18.f43457a |= 65536;
                                            nldVar18.f43474r = f;
                                            break;
                                        case 12:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar19 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar19.f43457a |= 131072;
                                            nldVar19.f43475s = f;
                                            break;
                                        case 13:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar20 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar20.f43457a |= 262144;
                                            nldVar20.f43476t = f;
                                            break;
                                        case 14:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar21 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar21.f43457a |= 524288;
                                            nldVar21.f43477u = f;
                                            break;
                                        case 15:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar22 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar22.f43457a |= 1048576;
                                            nldVar22.f43478v = f;
                                            break;
                                        case 16:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar23 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar23.f43457a |= 2097152;
                                            nldVar23.f43479w = f;
                                            break;
                                        case 17:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar24 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar24.f43457a |= 4194304;
                                            nldVar24.f43480x = f;
                                            break;
                                        case 18:
                                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                                nxlVarM18137O2.mo18106p();
                                            }
                                            nld nldVar25 = (nld) nxlVarM18137O2.f44974b;
                                            nldVar25.f43457a |= 8388608;
                                            nldVar25.f43481y = f;
                                            break;
                                        default:
                                            throw new AssertionError("Unexpected face attribute: ".concat(String.valueOf(str2)));
                                    }
                                }
                            }
                            nld nldVar26 = (nld) nxlVarM18137O2.mo18103l();
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nle nleVar14 = (nle) nxlVarM18137O.f44974b;
                            nldVar26.getClass();
                            nxy nxyVar = nleVar14.f43495k;
                            if (!nxyVar.mo17770c()) {
                                nleVar14.f43495k = nxq.m18127U(nxyVar);
                            }
                            nleVar14.f43495k.add(nldVar26);
                            i = 1;
                            i2 = 2;
                        }
                        dsxVar2.f12522b.mo8149X(27, null, (nle) nxlVarM18137O.mo18103l(), null, null);
                    }
                };
                cwd cwdVar = (cwd) obj;
                synchronized (cwdVar.f9866a) {
                    ((cwd) obj).f9866a.add(clkVar);
                    break;
                }
                ((cdu) obj4).m3529i().m13537d(new cic(cwdVar, clkVar, 3, (byte[]) null, (byte[]) null));
                return;
            case 1:
                Object obj5 = this.f6169d;
                Object obj6 = this.f6166a;
                final ?? r2 = this.f6168c;
                final ?? r3 = this.f6167b;
                final ckp ckpVar = (ckp) obj6;
                jvh.m13562j(dfm.m6061f((Context) obj5), new kao() { // from class: ckq
                    @Override // p000.kao
                    /* JADX INFO: renamed from: a */
                    public final void mo3483a(Object obj7) {
                        ckp ckpVar2 = ckpVar;
                        ScheduledExecutorService scheduledExecutorService = r2;
                        ScheduledExecutorService scheduledExecutorService2 = r3;
                        new ckn(ckpVar2, scheduledExecutorService, 2).m3839a();
                        new ckn(ckpVar2, scheduledExecutorService2, 1).m3839a();
                    }
                }, not.INSTANCE);
                return;
            case 2:
                Object obj7 = this.f6169d;
                ?? r1 = this.f6167b;
                ?? r4 = this.f6166a;
                ?? r5 = this.f6168c;
                Executor executor = dlb.f11923a;
                cdu cduVar = (cdu) obj7;
                jvb jvbVarM3529i = cduVar.m3529i();
                r4.getClass();
                jvbVarM3529i.m13537d(r1.mo3830a(new czq((dlc) r4, 17), dlb.f11923a));
                cduVar.m3529i().m13537d(r5.mo11233e(new dla(r4)));
                return;
            case 3:
                Object obj8 = this.f6169d;
                Object obj9 = this.f6168c;
                ?? r6 = this.f6166a;
                hes hesVar = (hes) this.f6167b.get();
                lja ljaVarM10159a = het.m10159a();
                ljaVarM10159a.f38344c = "Portrait";
                ljaVarM10159a.m15518h((mxk) obj9);
                ljaVarM10159a.m15517g(mxk.m17137I(kmq.BACK, kmq.f36557a));
                ljaVarM10159a.m15519i(r6);
                ((AmbientModeSupport.AmbientController) obj8).m1661k(hesVar, ljaVarM10159a.m15516f());
                return;
            default:
                Object obj10 = this.f6169d;
                jvd jvdVar = (jvd) obj10;
                jvdVar.m13541c(new gxn((oju) this.f6168c, (mrm) this.f6166a, (oju) this.f6167b, 9));
                return;
        }
    }
}
