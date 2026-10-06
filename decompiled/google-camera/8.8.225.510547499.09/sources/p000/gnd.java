package p000;

import android.hardware.camera2.CameraCharacteristics;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f25684a;

    /* JADX INFO: renamed from: b */
    private final oju f25685b;

    /* JADX INFO: renamed from: c */
    private final oju f25686c;

    /* JADX INFO: renamed from: d */
    private final oju f25687d;

    /* JADX INFO: renamed from: e */
    private final oju f25688e;

    /* JADX INFO: renamed from: f */
    private final oju f25689f;

    /* JADX INFO: renamed from: g */
    private final oju f25690g;

    /* JADX INFO: renamed from: h */
    private final oju f25691h;

    /* JADX INFO: renamed from: i */
    private final oju f25692i;

    /* JADX INFO: renamed from: j */
    private final oju f25693j;

    /* JADX INFO: renamed from: k */
    private final oju f25694k;

    /* JADX INFO: renamed from: l */
    private final oju f25695l;

    /* JADX INFO: renamed from: m */
    private final oju f25696m;

    public gnd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13) {
        this.f25684a = ojuVar;
        this.f25685b = ojuVar2;
        this.f25686c = ojuVar3;
        this.f25687d = ojuVar4;
        this.f25688e = ojuVar5;
        this.f25689f = ojuVar6;
        this.f25690g = ojuVar7;
        this.f25691h = ojuVar8;
        this.f25692i = ojuVar9;
        this.f25693j = ojuVar10;
        this.f25694k = ojuVar11;
        this.f25695l = ojuVar12;
        this.f25696m = ojuVar13;
    }

    /* JADX INFO: renamed from: a */
    public static gnd m9545a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, oju ojuVar12, oju ojuVar13) {
        return new gnd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, ojuVar12, ojuVar13);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0207  */
    /* JADX WARN: Code duplicated, block: B:74:0x0218  */
    @Override // p000.oju
    public final /* bridge */ /* synthetic */ Object get() {
        ikw ikwVarM11415a = ((ikv) this.f25684a).m11415a();
        oju ojuVar = this.f25685b;
        oju ojuVar2 = this.f25686c;
        oju ojuVar3 = this.f25687d;
        oju ojuVar4 = this.f25688e;
        oju ojuVar5 = this.f25689f;
        oju ojuVar6 = this.f25690g;
        oju ojuVar7 = this.f25691h;
        oju ojuVar8 = this.f25692i;
        jwn jwnVarM7519a = ((emf) this.f25693j).m7519a();
        fvu fvuVarM8922a = ((fxj) this.f25694k).m8922a();
        dhv dhvVar = (dhv) this.f25695l.get();
        djm djmVar = (djm) this.f25696m.get();
        EnumMap enumMap = new EnumMap(gnf.class);
        enumMap.put(gnf.VIEWFINDER, (kgi) ojuVar7.get());
        switch (ikwVarM11415a.ordinal()) {
            case 1:
                if (dhvVar.mo6184l(dib.f11334bo)) {
                    enumMap.put(gnf.YUV_LARGE, (kgi) ojuVar2.get());
                }
                if (fvuVarM8922a.mo14558k() == kmq.BACK) {
                    if (djmVar.m6222C()) {
                        enumMap.put(gnf.PD, (kgi) ojuVar4.get());
                    }
                } else if (djmVar.m6221B()) {
                    for (int i : (int[]) fvuVarM8922a.mo14560m(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, new int[0])) {
                        if (i == 8) {
                            enumMap.put(gnf.DEPTH, (kgi) ojuVar5.get());
                        }
                    }
                }
                enumMap.putAll((Map) ojuVar3.get());
                goy.m9592e(enumMap, ojuVar, ojuVar8, fvuVarM8922a, dhvVar);
                if (!dhvVar.mo6184l(dii.f11534j) && dhvVar.mo6184l(dii.f11533i)) {
                    enumMap.put(gnf.YUV_ANALYSIS, (kgi) ojuVar6.get());
                } else if (fvuVarM8922a.mo14558k() == kmq.BACK) {
                    if (!dhvVar.mo6183k(diu.f11712b)) {
                        dhw dhwVar = dir.f11704a;
                        dhvVar.mo6176d();
                    }
                    enumMap.put(gnf.YUV_ANALYSIS, (kgi) ojuVar6.get());
                } else {
                    dhx dhxVar = diw.f11719a;
                    dhvVar.mo6179g();
                }
                return enumMap;
            case 6:
                if (fvuVarM8922a.mo14544M() && fvuVarM8922a.mo14535D() && dhvVar.mo6184l(dib.f11333bn) && dhvVar.mo6184l(dio.f11683y) && fvuVarM8922a.mo14558k() == kmq.BACK) {
                    gnf gnfVar = gnf.f25701c;
                    oju ojuVar9 = (oju) ((Map) ojuVar8.get()).get(gnf.f25701c);
                    ojuVar9.getClass();
                    enumMap.put(gnfVar, (kgi) ojuVar9.get());
                    if (!((Boolean) ((jwf) jwnVarM7519a).f34942d).booleanValue()) {
                        if (((Map) ojuVar8.get()).containsKey(gnf.RAW_ULTRAWIDE)) {
                            enumMap.put(gnf.RAW_TELE, (kgi) ((oju) ((Map) ojuVar8.get()).get(gnf.RAW_ULTRAWIDE)).get());
                        } else {
                            gnf gnfVar2 = gnf.RAW_TELE;
                            oju ojuVar10 = (oju) ((Map) ojuVar8.get()).get(gnf.RAW_TELE);
                            ojuVar10.getClass();
                            enumMap.put(gnfVar2, (kgi) ojuVar10.get());
                        }
                    }
                } else if (fvuVarM8922a.mo14558k() == kmq.f36557a && fvuVarM8922a.mo14544M() && fvuVarM8922a.mo14535D() && dhvVar.mo6184l(dib.f11358cl)) {
                    p021j$.util.Map.EL.forEach((Map) ojuVar8.get(), new dan(enumMap, 4));
                } else {
                    enumMap.put(gnf.RAW_HDRPLUS, (kgi) ojuVar.get());
                }
                if (fvuVarM8922a.mo14558k() == kmq.BACK) {
                    enumMap.put(gnf.PD, (kgi) ojuVar4.get());
                } else if (fvuVarM8922a.mo14558k() == kmq.f36557a) {
                    dhx dhxVar2 = dio.f11659a;
                    dhvVar.mo6178f();
                }
                if ((dhvVar.mo6184l(dhu.f11205g) && fvuVarM8922a.mo14558k() == kmq.BACK) || dhvVar.mo6184l(did.f11436ao)) {
                    enumMap.put(gnf.YUV_ANALYSIS, (kgi) ojuVar6.get());
                } else {
                    dhx dhxVar3 = dib.f11240a;
                    dhvVar.mo6177e();
                }
                return enumMap;
            case 7:
                enumMap.put(gnf.YUV_LARGE, (kgi) ojuVar2.get());
                return enumMap;
            case 12:
                goy.m9592e(enumMap, ojuVar, ojuVar8, fvuVarM8922a, dhvVar);
                enumMap.put(gnf.YUV_ANALYSIS, (kgi) ojuVar6.get());
                return enumMap;
            default:
                goy.m9592e(enumMap, ojuVar, ojuVar8, fvuVarM8922a, dhvVar);
                if (!dhvVar.mo6184l(dii.f11534j)) {
                    if (fvuVarM8922a.mo14558k() == kmq.BACK) {
                        if (!dhvVar.mo6183k(diu.f11712b)) {
                            dhw dhwVar2 = dir.f11704a;
                            dhvVar.mo6176d();
                        }
                        enumMap.put(gnf.YUV_ANALYSIS, (kgi) ojuVar6.get());
                    } else {
                        dhx dhxVar4 = diw.f11719a;
                        dhvVar.mo6179g();
                    }
                } else if (fvuVarM8922a.mo14558k() == kmq.BACK) {
                    if (!dhvVar.mo6183k(diu.f11712b)) {
                        dhw dhwVar3 = dir.f11704a;
                        dhvVar.mo6176d();
                    }
                    enumMap.put(gnf.YUV_ANALYSIS, (kgi) ojuVar6.get());
                } else {
                    dhx dhxVar5 = diw.f11719a;
                    dhvVar.mo6179g();
                }
                return enumMap;
        }
    }
}
