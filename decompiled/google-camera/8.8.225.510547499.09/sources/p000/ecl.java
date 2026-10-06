package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.NormalizedRect;
import com.google.googlex.gcam.PixelRect;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.StringFrameMetadataMap;
import com.google.googlex.gcam.StringStaticMetadataMap;
import com.google.googlex.gcam.Tuning;
import com.google.googlex.gcam.hdrplus.NativeHdrPlusInterface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ecl implements eck {

    /* JADX INFO: renamed from: a */
    private static final nbh f13358a = nbh.m17259h("com/google/android/apps/camera/hdrplus/HdrPlusPostProcessingPipelineImpl");

    /* JADX INFO: renamed from: b */
    private final edp f13359b;

    /* JADX INFO: renamed from: c */
    private final edk f13360c;

    /* JADX INFO: renamed from: d */
    private final dhv f13361d;

    /* JADX INFO: renamed from: e */
    private final eec f13362e;

    /* JADX INFO: renamed from: f */
    private final egy f13363f;

    /* JADX INFO: renamed from: g */
    private final kbz f13364g;

    /* JADX INFO: renamed from: h */
    private final fvu f13365h;

    /* JADX INFO: renamed from: i */
    private final dsx f13366i;

    /* JADX INFO: renamed from: j */
    private final dsx f13367j;

    /* JADX INFO: renamed from: k */
    private final cwd f13368k;

    /* JADX INFO: renamed from: l */
    private final cwd f13369l;

    /* JADX INFO: renamed from: m */
    private final cwd f13370m;

    public ecl(edp edpVar, edk edkVar, fvu fvuVar, ohb ohbVar, ohb ohbVar2, ohb ohbVar3, dhv dhvVar, dsx dsxVar, dsx dsxVar2, eec eecVar, egy egyVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f13359b = edpVar;
        this.f13360c = edkVar;
        this.f13368k = cwd.m5640N(ohbVar);
        this.f13365h = fvuVar;
        this.f13369l = cwd.m5640N(ohbVar2);
        this.f13370m = cwd.m5640N(ohbVar3);
        this.f13361d = dhvVar;
        this.f13367j = dsxVar;
        this.f13366i = dsxVar2;
        this.f13362e = eecVar;
        this.f13363f = egyVar;
        this.f13364g = kbzVar;
    }

    /* JADX INFO: renamed from: d */
    private static ebu m7120d(eea eeaVar) {
        if (eeaVar.f13585b != null) {
            return ebu.YUV;
        }
        if (eeaVar.f13584a != null) {
            return ebu.RGB;
        }
        if (eeaVar.f13586c != null) {
            return ebu.RGB_HW;
        }
        throw new IllegalArgumentException("Unknown image format in PostprocessingImage.");
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    private final void m7121e(eea eeaVar) {
        this.f13362e.m7210f(eeaVar, dzk.DEBLUR_FUSION);
        eeaVar.f13597n.f25502c.mo9905k().mo10400b();
    }

    /* JADX INFO: renamed from: f */
    private static boolean m7122f(eea eeaVar) {
        FaceInfoVector faceInfoVectorM4957g;
        FrameMetadata frameMetadataM5098d = eeaVar.f13587d.m5098d();
        return (frameMetadataM5098d == null || (faceInfoVectorM4957g = frameMetadataM5098d.m4957g()) == null || faceInfoVectorM4957g.m4936a() <= 0) ? false : true;
    }

    @Override // p000.eck
    /* JADX INFO: renamed from: a */
    public final mrm mo7118a(ebn ebnVar, mrm mrmVar, egl eglVar) {
        try {
            this.f13364g.mo13961e("processPrimary");
            return m7123c(ebnVar, mrmVar, eglVar, true, "primary");
        } finally {
            this.f13364g.mo13962f();
        }
    }

    @Override // p000.eck
    /* JADX INFO: renamed from: b */
    public final void mo7119b(ebn ebnVar, eea eeaVar) {
        this.f13364g.mo13960d("processSecondary", new apv(this, ebnVar, eeaVar, 8));
    }

    /* JADX WARN: Type inference failed for: r2v44, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v79, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v80, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v67, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final mrm m7123c(ebn ebnVar, mrm mrmVar, egl eglVar, boolean z, String str) {
        eea eeaVarM7190a;
        mrm mrmVarM16829i;
        if (z && mrmVar.mo16813g()) {
            eea eeaVar = (eea) mrmVar.mo16809c();
            if (this.f13368k.m5652K()) {
                ((ftp) this.f13368k.m5651J()).mo8738h(eeaVar.f13597n.f25502c.mo9902h(), eeaVar.f13590g);
            }
            if ((this.f13361d.mo6184l(dht.f11176d) || this.f13361d.mo6184l(dht.f11185m)) && eeaVar.f13587d.m5109o()) {
                m7121e(eeaVar);
            }
            ShotMetadata shotMetadata = eeaVar.f13587d;
            shotMetadata.m5107m(this.f13363f.mo7312a(shotMetadata.m5102h()));
        }
        if (this.f13360c == edk.MOTION_BLUR) {
            return !mrmVar.mo16813g() ? mrm.m16829i(ebu.MUTABLE_MERGED_RAW) : mqu.f41450a;
        }
        if (eglVar == egl.DEBLUR) {
            return !mrmVar.mo16813g() ? mrm.m16829i(ebu.MERGED_RAW) : mqu.f41450a;
        }
        if (eglVar == egl.ZOOM) {
            return !mrmVar.mo16813g() ? mrm.m16829i(ebu.RGB) : mqu.f41450a;
        }
        if (mrmVar.mo16813g()) {
            mrm.m16829i(m7120d((eea) mrmVar.mo16809c()));
        } else {
            mqu mquVar = mqu.f41450a;
        }
        boolean z2 = ((Integer) this.f13361d.mo6173a(dip.f11685a).get()).intValue() == 1;
        boolean z3 = ((Integer) this.f13361d.mo6173a(dip.f11685a).get()).intValue() == 2;
        kmq kmqVarMo14558k = this.f13365h.mo14558k();
        kmq kmqVar = kmq.f36557a;
        boolean z4 = z3 || z2;
        if (this.f13365h.mo14558k() != kmq.f36557a || !this.f13361d.mo6184l(dhp.f11150g) || ebnVar.f13246a.m10016b()) {
        }
        dhv dhvVar = this.f13361d;
        dhx dhxVar = dhp.f11144a;
        dhvVar.mo6177e();
        this.f13361d.mo6178f();
        boolean z5 = ebnVar.f13255j;
        boolean z6 = ebnVar.f13253h;
        boolean zM6693h = this.f13367j.m6693h();
        boolean z7 = ebnVar.f13250e;
        String str2 = "yuvToRgb";
        if (!this.f13369l.m5652K() || !(this.f13369l.m5651J() instanceof edx)) {
            String str3 = "applyRgb";
            if ((z2 || (z3 && kmqVarMo14558k == kmqVar)) && ebnVar.f13249d && this.f13370m.m5652K()) {
                if (!mrmVar.mo16813g()) {
                    return mrm.m16829i(ebu.RGB_HW);
                }
                this.f13364g.mo13961e("Rectiface");
                eea eeaVar2 = (eea) mrmVar.mo16809c();
                if (eeaVar2.f13584a != null) {
                    this.f13364g.mo13961e("applyRgb");
                    eeaVarM7190a = this.f13362e.m7207c(eeaVar2, z6);
                    str3 = "applyRgb";
                    str2 = "yuvToRgb";
                } else {
                    this.f13364g.mo13961e("applyRgbHw");
                    HardwareBuffer hardwareBuffer = eeaVar2.f13586c;
                    hardwareBuffer.getClass();
                    eec eecVar = this.f13362e;
                    hardwareBuffer.getClass();
                    edk edkVar = eecVar.f13610g;
                    edk edkVar2 = edk.LONG_EXPOSURE;
                    gtz gtzVar = (gtz) ((mrm) eecVar.f13608e.get()).mo16809c();
                    gug gugVarMo4258a = gtzVar.mo4258a();
                    InterleavedImageU8 interleavedImageU8 = eecVar.f13611h.mo6184l(dhq.f11154a) ? new InterleavedImageU8(hardwareBuffer.getWidth(), hardwareBuffer.getHeight(), 1) : null;
                    InterleavedWriteViewU8 interleavedWriteViewU8M5006f = interleavedImageU8 == null ? null : interleavedImageU8.m5006f();
                    str2 = "yuvToRgb";
                    str3 = "applyRgb";
                    gtzVar.mo4259b(hardwareBuffer, eeaVar2.f13587d, edkVar == edkVar2, z6, eeaVar2.f13597n.f25502c.mo9913s(), gugVarMo4258a, eeaVar2.f13597n.f25502c.mo9905k(), new eeb(eecVar, eeaVar2, z6, new AtomicReference(null), 0), interleavedWriteViewU8M5006f);
                    edz edzVarM7203b = eeaVar2.m7203b();
                    edzVarM7203b.f13539g = gugVarMo4258a;
                    edzVarM7203b.f13538f = interleavedImageU8;
                    eeaVarM7190a = edzVarM7203b.m7190a();
                }
                this.f13364g.mo13963g("setWarpfield");
                mrmVarM16829i = mrm.m16829i(eeaVarM7190a);
                gug gugVar = eeaVarM7190a.f13594k;
                gugVar.getClass();
                this.f13366i.m6689d(((eea) ((mrq) mrmVarM16829i).f41482a).f13597n.f25502c.mo9902h(), gugVar);
                this.f13364g.mo13962f();
                this.f13364g.mo13962f();
            } else if (!z4) {
                if (mrmVar.mo16813g()) {
                    this.f13366i.m6689d(((eea) mrmVar.mo16809c()).f13597n.f25502c.mo9902h(), null);
                }
                mrmVarM16829i = mrmVar;
            } else {
                if (!mrmVar.mo16813g()) {
                    return mrm.m16829i(ebu.RGB);
                }
                this.f13364g.mo13961e("Rectiface");
                ((eea) mrmVar.mo16809c()).f13584a.getClass();
                eea eeaVar3 = (eea) mrmVar.mo16809c();
                this.f13364g.mo13961e(str3);
                eea eeaVarM7207c = this.f13362e.m7207c(eeaVar3, z6);
                mrmVarM16829i = mrm.m16829i(eeaVarM7207c);
                this.f13364g.mo13963g("setWarpfield");
                gug gugVar2 = eeaVarM7207c.f13594k;
                gugVar2.getClass();
                this.f13366i.m6689d(((eea) ((mrq) mrmVarM16829i).f41482a).f13597n.f25502c.mo9902h(), gugVar2);
                this.f13364g.mo13962f();
                this.f13364g.mo13962f();
            }
            if (!z5) {
                dhv dhvVar2 = this.f13361d;
                dhw dhwVar = dhq.f11154a;
                dhvVar2.mo6175c();
                if (this.f13361d.mo6184l(dhq.f11154a)) {
                    if (!mrmVarM16829i.mo16813g()) {
                        return mrm.m16829i(ebu.YUV);
                    }
                    if (m7122f((eea) mrmVarM16829i.mo16809c())) {
                        this.f13364g.mo13961e("FaceMetadata");
                        if (((eea) mrmVarM16829i.mo16809c()).f13586c != null) {
                            this.f13364g.mo13961e("rgbHwToRgb");
                            mrmVarM16829i = mrm.m16829i(this.f13362e.m7208d((eea) mrmVarM16829i.mo16809c()));
                            this.f13364g.mo13962f();
                        }
                        if (((eea) mrmVarM16829i.mo16809c()).f13585b != null) {
                            this.f13364g.mo13961e("applyYuv");
                            mrmVarM16829i = mrm.m16829i(this.f13362e.m7206b((eea) mrmVarM16829i.mo16809c()));
                            this.f13364g.mo13962f();
                        } else if (((eea) mrmVarM16829i.mo16809c()).f13584a != null) {
                            this.f13364g.mo13961e("rgbToYuv");
                            eea eeaVarM7204j = eec.m7204j((eea) mrmVarM16829i.mo16809c());
                            this.f13364g.mo13963g("applyYuv");
                            mrmVarM16829i = mrm.m16829i(this.f13362e.m7206b(eeaVarM7204j));
                            this.f13364g.mo13962f();
                        } else {
                            ((nbe) ((nbe) f13358a.m17252c()).mo17276G((char) 1288)).mo17293r("couldn't extract face metadata on %s", m7120d((eea) mrmVarM16829i.mo16809c()));
                        }
                        this.f13364g.mo13962f();
                    }
                }
            }
            if (!z5 && z && this.f13361d.mo6184l(dhq.f11154a)) {
                if (!mrmVarM16829i.mo16813g()) {
                    this.f13361d.mo6175c();
                    return mrm.m16829i(ebu.RGB);
                }
                if (m7122f((eea) mrmVarM16829i.mo16809c())) {
                    this.f13364g.mo13961e("DeepR");
                    if (((eea) mrmVarM16829i.mo16809c()).f13585b != null) {
                        this.f13361d.mo6175c();
                        this.f13364g.mo13961e(str2);
                        eea eeaVarM7209e = this.f13362e.m7209e((eea) mrmVarM16829i.mo16809c());
                        this.f13364g.mo13963g(str3);
                        mrm mrmVarM16829i2 = mrm.m16829i(this.f13362e.m7205a(eeaVarM7209e));
                        eec eecVar2 = this.f13362e;
                        eea eeaVar4 = (eea) ((mrq) mrmVarM16829i2).f41482a;
                        eecVar2.m7212h(eeaVar4);
                        mrmVarM16829i = mrm.m16829i(eeaVar4);
                        this.f13364g.mo13962f();
                    } else if (((eea) mrmVarM16829i.mo16809c()).f13584a != null) {
                        this.f13361d.mo6175c();
                        this.f13364g.mo13961e(str3);
                        mrm mrmVarM16829i3 = mrm.m16829i(this.f13362e.m7205a((eea) mrmVarM16829i.mo16809c()));
                        eec eecVar3 = this.f13362e;
                        eea eeaVar5 = (eea) ((mrq) mrmVarM16829i3).f41482a;
                        eecVar3.m7212h(eeaVar5);
                        mrmVarM16829i = mrm.m16829i(eeaVar5);
                        this.f13364g.mo13962f();
                    } else if (((eea) mrmVarM16829i.mo16809c()).f13586c != null) {
                        this.f13364g.mo13961e("rgbHwToRgb");
                        eea eeaVarM7208d = this.f13362e.m7208d((eea) mrmVarM16829i.mo16809c());
                        this.f13361d.mo6175c();
                        this.f13364g.mo13961e(str3);
                        mrm mrmVarM16829i4 = mrm.m16829i(this.f13362e.m7205a(eeaVarM7208d));
                        eec eecVar4 = this.f13362e;
                        eea eeaVar6 = (eea) ((mrq) mrmVarM16829i4).f41482a;
                        eecVar4.m7212h(eeaVar6);
                        mrmVarM16829i = mrm.m16829i(eeaVar6);
                        this.f13364g.mo13962f();
                        this.f13364g.mo13962f();
                    }
                    this.f13364g.mo13962f();
                } else {
                    ((nbe) ((nbe) f13358a.m17252c()).mo17276G((char) 1287)).mo17293r("couldn't apply face deblur on %s", m7120d((eea) mrmVarM16829i.mo16809c()));
                }
                if (((eea) mrmVarM16829i.mo16809c()).f13587d.m5109o()) {
                    m7121e((eea) mrmVarM16829i.mo16809c());
                }
            }
            if (z5) {
                if (!mrmVarM16829i.mo16813g()) {
                    return mrm.m16829i(ebu.RGB_HW);
                }
                if (((eea) mrmVarM16829i.mo16809c()).f13586c != null) {
                    this.f13364g.mo13961e("FaceO");
                    eec eecVar5 = this.f13362e;
                    eea eeaVarM7190a2 = (eea) mrmVarM16829i.mo16809c();
                    HardwareBuffer hardwareBuffer2 = eeaVarM7190a2.f13586c;
                    hardwareBuffer2.getClass();
                    try {
                        dsk dskVar = (dsk) ((dsl) eecVar5.f13607d.get()).mo6648b(new dsn(hardwareBuffer2, 0), mrm.m16829i(eeaVarM7190a2.f13589f)).get();
                        eeaVarM7190a2.f13597n.f25502c.mo9905k();
                        dskVar.mo6662c();
                        if (dskVar.mo6661b()) {
                            ShotMetadata shotMetadata2 = eeaVarM7190a2.f13587d;
                            shotMetadata2.m5108n(String.valueOf(shotMetadata2.m5103i()).concat("o"));
                            edz edzVarM7203b2 = eeaVarM7190a2.m7203b();
                            edzVarM7203b2.f13535c = (HardwareBuffer) dskVar.mo6660a();
                            eeaVarM7190a2 = edzVarM7203b2.m7190a();
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        eecVar5.f13606c.mo13948j("Can't apply face obfuscation post-processing", e);
                    }
                    mrmVarM16829i = mrm.m16829i(eeaVarM7190a2);
                    this.f13364g.mo13962f();
                } else {
                    ((nbe) ((nbe) f13358a.m17252c()).mo17276G((char) 1286)).mo17293r("Couldn't apply face obfuscation on %s", m7120d((eea) mrmVarM16829i.mo16809c()));
                }
            }
            if (mrmVarM16829i.mo16813g() && ((eea) mrmVarM16829i.mo16809c()).f13586c != null) {
                this.f13364g.mo13961e("RgbHwToRgb");
                mrmVarM16829i = mrm.m16829i(this.f13362e.m7208d((eea) mrmVarM16829i.mo16809c()));
                this.f13364g.mo13962f();
            }
            if (r10 != 0) {
                if (!mrmVarM16829i.mo16813g()) {
                    return mrm.m16829i(ebu.YUV);
                }
                eea eeaVarM7204j2 = (eea) mrmVarM16829i.mo16809c();
                lku.m15613H(eeaVarM7204j2.f13586c == null);
                if (eeaVarM7204j2.f13584a != null) {
                    this.f13364g.mo13961e("FaceRetouch#rgbToYuv");
                    eeaVarM7204j2 = eec.m7204j(eeaVarM7204j2);
                    this.f13364g.mo13962f();
                }
                this.f13364g.mo13961e("FaceRetouch#applyYuv");
                this.f13362e.m7213i(eeaVarM7204j2);
                this.f13364g.mo13962f();
                mrmVarM16829i = mrm.m16829i(eeaVarM7204j2);
            }
            if (!mrmVarM16829i.mo16813g() && zM6693h) {
                return mrm.m16829i(ebu.YUV);
            }
            if (z && mrmVarM16829i.mo16813g() && ebnVar.f13254i) {
                this.f13364g.mo13961e("applySwiss");
                eec eecVar6 = this.f13362e;
                eea eeaVar7 = (eea) mrmVarM16829i.mo16809c();
                eecVar6.f13606c.mo13940b("Swiss not present. Returning without swiss.");
                mrmVarM16829i = mrm.m16829i(eeaVar7);
                this.f13364g.mo13962f();
            }
            if (z7 != 0) {
                if (!mrmVarM16829i.mo16813g()) {
                    return mrm.m16829i(ebu.YUV);
                }
                eea eeaVarM7204j3 = (eea) mrmVarM16829i.mo16809c();
                if (eeaVarM7204j3.f13584a != null) {
                    this.f13364g.mo13961e("RgbToYuv");
                    eeaVarM7204j3 = eec.m7204j(eeaVarM7204j3);
                    this.f13364g.mo13962f();
                }
                this.f13364g.mo13961e("sendYuvForJpegCompression");
                edp edpVar = this.f13359b;
                eay eayVarM7176a = edn.m7176a();
                eayVarM7176a.f13150a = ebv.m7082a((ebu) r3.mo16809c());
                edpVar.m7179a(eeaVarM7204j3, eayVarM7176a.m7029a());
                this.f13364g.mo13962f();
                return mqu.f41450a;
            }
            if (!mrmVarM16829i.mo16813g()) {
                return mrm.m16829i(ebu.YUV);
            }
            eea eeaVar8 = (eea) mrmVarM16829i.mo16809c();
            if (!z) {
                this.f13364g.mo13961e("SaveSecondaryImage");
                edp edpVar2 = this.f13359b;
                eay eayVarM7176a2 = edn.m7176a();
                eayVarM7176a2.m7034f(true);
                eayVarM7176a2.f13151b = str;
                edpVar2.m7179a(eeaVar8, eayVarM7176a2.m7029a());
                this.f13364g.mo13962f();
                return mqu.f41450a;
            }
            this.f13364g.mo13961e("JpegCompression");
            if (eeaVar8.f13585b != null) {
                edp edpVar3 = this.f13359b;
                eay eayVarM7176a3 = edn.m7176a();
                eayVarM7176a3.f13150a = ebv.m7082a((ebu) r3.mo16809c());
                Optional optionalMo6180h = this.f13361d.mo6180h(did.f11417aA);
                Float fValueOf = Float.valueOf(-1.0f);
                eayVarM7176a3.m7030b(((Float) optionalMo6180h.orElse(fValueOf)).floatValue());
                eayVarM7176a3.m7032d(((Float) this.f13361d.mo6180h(did.f11418aB).orElse(fValueOf)).floatValue());
                eayVarM7176a3.m7031c(((Float) this.f13361d.mo6180h(did.f11419aC).orElse(fValueOf)).floatValue());
                eayVarM7176a3.m7033e(((Integer) this.f13361d.mo6173a(did.f11469w).orElse(0)).intValue());
                edpVar3.m7179a(eeaVar8, eayVarM7176a3.m7029a());
                this.f13364g.mo13962f();
                return mqu.f41450a;
            }
            if (eeaVar8.f13584a == null) {
                this.f13364g.mo13962f();
                throw new IllegalStateException("Requested JPEG and still got uncompressed callback.");
            }
            edp edpVar4 = this.f13359b;
            eay eayVarM7176a4 = edn.m7176a();
            Optional optionalMo6180h2 = this.f13361d.mo6180h(did.f11417aA);
            Float fValueOf2 = Float.valueOf(-1.0f);
            eayVarM7176a4.m7030b(((Float) optionalMo6180h2.orElse(fValueOf2)).floatValue());
            eayVarM7176a4.m7032d(((Float) this.f13361d.mo6180h(did.f11418aB).orElse(fValueOf2)).floatValue());
            eayVarM7176a4.m7031c(((Float) this.f13361d.mo6180h(did.f11419aC).orElse(fValueOf2)).floatValue());
            eayVarM7176a4.m7033e(((Integer) this.f13361d.mo6173a(did.f11469w).orElse(0)).intValue());
            edpVar4.m7179a(eeaVar8, eayVarM7176a4.m7029a());
            this.f13364g.mo13962f();
            return mqu.f41450a;
        }
        if (!mrmVar.mo16813g()) {
            return mrm.m16829i(ebu.YUV);
        }
        eea eeaVar9 = (eea) mrmVar.mo16809c();
        eeaVar9.f13585b.getClass();
        this.f13364g.mo13961e("FaceRetouchYuv");
        this.f13362e.m7213i(eeaVar9);
        this.f13364g.mo13963g("yuvToRgb");
        eea eeaVarM7209e2 = this.f13362e.m7209e(eeaVar9);
        this.f13364g.mo13963g("sendImageForPortraitProcessing");
        eec eecVar7 = this.f13362e;
        edy edyVarMo3604b = ((edw) eecVar7.f13612i.mo16809c()).mo3604b(eeaVarM7209e2.f13597n);
        InterleavedImageU8 interleavedImageU9 = eeaVarM7209e2.f13584a;
        if (interleavedImageU9 == null) {
            throw new IllegalStateException("RGB for portrait processing unavailable");
        }
        String str4 = edu.f13530a;
        nsx nsxVarM7108b = ecd.m7108b();
        gtd gtdVar = eeaVarM7209e2.f13598o;
        gtdVar.getClass();
        long j = ((Tuning) gtdVar.f26335b).f8376a;
        int iM5004c = interleavedImageU9.m5004c();
        int iM5003b = interleavedImageU9.m5003b();
        ShotMetadata shotMetadata3 = eeaVarM7209e2.f13587d;
        ShotParams shotParams = eeaVarM7209e2.f13595l;
        shotParams.getClass();
        int i = eeaVarM7209e2.f13588e.f35503e;
        boolean zMo6184l = eecVar7.f13611h.mo6184l(dib.f11297bD);
        gtd gtdVar2 = eeaVarM7209e2.f13598o;
        gtdVar2.getClass();
        Object obj = gtdVar2.f26334a;
        kbc kbcVar = eecVar7.f13613j.f24348b;
        boolean z8 = eeaVarM7209e2.f13596m.f13249d;
        PortraitRequest portraitRequest = new PortraitRequest();
        GcamModuleJNI.PortraitRequest_image_rotation_set(portraitRequest.f8338a, portraitRequest, ntw.m17722h((360 - i) % 360).f44260j);
        GcamModuleJNI.PortraitRequest_manually_rotate_xmp_jpg_set(portraitRequest.f8338a, portraitRequest, zMo6184l);
        PixelRectVector pixelRectVector = new PixelRectVector();
        igp igpVar = (igp) obj;
        float f = iM5004c;
        Rect rect = (Rect) igpVar.f30850b;
        float fWidth = rect.width();
        float f2 = iM5003b;
        float fHeight = rect.height();
        Object obj2 = igpVar.f30851c;
        int i2 = 0;
        while (true) {
            edy edyVar = edyVarMo3604b;
            Face[] faceArr = (Face[]) obj2;
            Object obj3 = obj2;
            if (i2 >= faceArr.length) {
                GcamModuleJNI.PortraitRequest_faces_set(portraitRequest.f8338a, portraitRequest, pixelRectVector.f8333a, pixelRectVector);
                int i3 = kbcVar.f35517a;
                int i4 = kbcVar.f35518b;
                GcamModuleJNI.PortraitRequest_output_width_set(portraitRequest.f8338a, portraitRequest, i3);
                GcamModuleJNI.PortraitRequest_output_height_set(portraitRequest.f8338a, portraitRequest, i4);
                StringFrameMetadataMap stringFrameMetadataMap = new StringFrameMetadataMap(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
                stringFrameMetadataMap.m5129b(edu.f13530a, shotMetadata3.m5098d());
                GcamModuleJNI.PortraitRequest_frame_metadata_set(portraitRequest.f8338a, portraitRequest, stringFrameMetadataMap.f8369a, stringFrameMetadataMap);
                StringStaticMetadataMap stringStaticMetadataMap = new StringStaticMetadataMap(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
                stringStaticMetadataMap.m5134b(edu.f13530a, shotMetadata3.m5101g());
                GcamModuleJNI.PortraitRequest_static_metadata_set(portraitRequest.f8338a, portraitRequest, stringStaticMetadataMap.f8374a, stringStaticMetadataMap);
                NormalizedRect normalizedRectM4884a = shotParams.m5110a().m4884a();
                GcamModuleJNI.PortraitRequest_crop_set(portraitRequest.f8338a, portraitRequest, NormalizedRect.m5050a(normalizedRectM4884a), normalizedRectM4884a);
                NormalizedRect normalizedRectM4885b = shotParams.m5110a().m4885b();
                GcamModuleJNI.PortraitRequest_merged_crop_set(portraitRequest.f8338a, portraitRequest, NormalizedRect.m5050a(normalizedRectM4885b), normalizedRectM4885b);
                GcamModuleJNI.PortraitRequest_post_resample_sharpening_set(portraitRequest.f8338a, portraitRequest, ((NativeHdrPlusInterface) nsxVarM7108b).nativeGetPostZoomSharpenStrength(j, i3 / f));
                GcamModuleJNI.PortraitRequest_output_format_primary_set(portraitRequest.f8338a, portraitRequest, nrx.f44311d.f44321l);
                GcamModuleJNI.PortraitRequest_use_internal_rectiface_set(portraitRequest.f8338a, portraitRequest, z8);
                edyVar.mo7187c(interleavedImageU9, portraitRequest, eeaVarM7209e2.f13587d, eeaVarM7209e2.f13591h, ((fua) eeaVarM7209e2.f13597n.f25503d).f23578f);
                edyVar.close();
                this.f13364g.mo13962f();
                return mqu.f41450a;
            }
            float f3 = f2 / fHeight;
            float f4 = f / fWidth;
            Rect bounds = faceArr[i2].getBounds();
            float f5 = fWidth;
            PixelRect pixelRect = new PixelRect();
            pixelRect.m5068f((int) ((bounds.left - rect.left) * f4));
            pixelRect.m5070h((int) ((bounds.top - rect.top) * f3));
            pixelRect.m5069g((int) ((bounds.right - rect.left) * f4));
            pixelRect.m5071i((int) ((bounds.bottom - rect.top) * f3));
            pixelRectVector.m5072a(pixelRect);
            i2++;
            edyVarMo3604b = edyVar;
            obj2 = obj3;
            fWidth = f5;
            f2 = f2;
            fHeight = fHeight;
        }
    }
}
