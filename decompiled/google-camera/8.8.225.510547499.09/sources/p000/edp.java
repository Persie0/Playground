package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.imageio.JpgHelper;
import com.google.googlex.gcam.imageproc.Resample;
import java.io.IOException;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class edp {

    /* JADX INFO: renamed from: a */
    private static final nbh f13512a = nbh.m17259h("com/google/android/apps/camera/hdrplus/JpegCompressionSaving");

    /* JADX INFO: renamed from: b */
    private static final mwh f13513b;

    /* JADX INFO: renamed from: c */
    private static final mxk f13514c;

    /* JADX INFO: renamed from: d */
    private static final mwx f13515d;

    /* JADX INFO: renamed from: e */
    private final dhv f13516e;

    /* JADX INFO: renamed from: f */
    private final dzr f13517f;

    /* JADX INFO: renamed from: g */
    private final kbz f13518g;

    /* JADX INFO: renamed from: h */
    private final gvw f13519h;

    /* JADX INFO: renamed from: i */
    private final jfs f13520i;

    static {
        mwf mwfVar = new mwf();
        mwfVar.m17060c(nrn.f44250b, kei.TOP_LEFT);
        mwfVar.m17060c(nrn.f44251c, kei.TOP_RIGHT);
        mwfVar.m17060c(nrn.f44252d, kei.BOTTOM_RIGHT);
        mwfVar.m17060c(nrn.f44253e, kei.BOTTOM_LEFT);
        mwfVar.m17060c(nrn.f44254f, kei.LEFT_TOP);
        mwfVar.m17060c(nrn.f44255g, kei.RIGHT_TOP);
        mwfVar.m17060c(nrn.f44256h, kei.RIGHT_BOTTOM);
        mwfVar.m17060c(nrn.f44257i, kei.LEFT_BOTTOM);
        f13513b = mwfVar.mo17059b();
        f13514c = mxk.m17139K(nrn.f44254f, nrn.f44255g, nrn.f44256h, nrn.f44257i);
        mwt mwtVarM17115i = mwx.m17115i();
        mwtVarM17115i.mo17110e(kei.TOP_LEFT, kei.TOP_RIGHT);
        mwtVarM17115i.mo17110e(kei.TOP_RIGHT, kei.TOP_LEFT);
        mwtVarM17115i.mo17110e(kei.BOTTOM_RIGHT, kei.BOTTOM_LEFT);
        mwtVarM17115i.mo17110e(kei.BOTTOM_LEFT, kei.BOTTOM_RIGHT);
        mwtVarM17115i.mo17110e(kei.RIGHT_TOP, kei.LEFT_TOP);
        mwtVarM17115i.mo17110e(kei.LEFT_TOP, kei.RIGHT_TOP);
        mwtVarM17115i.mo17110e(kei.LEFT_BOTTOM, kei.RIGHT_BOTTOM);
        mwtVarM17115i.mo17110e(kei.RIGHT_BOTTOM, kei.LEFT_BOTTOM);
        f13515d = mwtVarM17115i.mo17059b();
    }

    public edp(dhv dhvVar, jfs jfsVar, dzr dzrVar, kbz kbzVar, gvw gvwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f13516e = dhvVar;
        this.f13520i = jfsVar;
        this.f13517f = dzrVar;
        this.f13518g = kbzVar;
        this.f13519h = gvwVar;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m7178b(eea eeaVar) {
        return this.f13519h.mo9812h(((fua) eeaVar.f13597n.f25503d).f23576d);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m7179a(eea eeaVar, edn ednVar) {
        byte[] bArr;
        kei keiVar;
        if (ednVar.f13505d) {
            ShotMetadata shotMetadata = new ShotMetadata(eeaVar.f13587d);
            edz edzVarM7203b = eeaVar.m7203b();
            edzVarM7203b.m7195f(shotMetadata);
            eeaVar = edzVarM7203b.m7190a();
        }
        nrn nrnVar = nrn.f44250b;
        if (this.f13516e.mo6184l(dib.f11297bD)) {
            ShotMetadata shotMetadata2 = eeaVar.f13587d;
            this.f13518g.mo13961e("rotationCalculation");
            nrn nrnVarM5099e = shotMetadata2.m5099e();
            ntw.m17725k(shotMetadata2, 60);
            this.f13518g.mo13962f();
            if (m7178b(eeaVar)) {
                mwh mwhVar = f13513b;
                kei keiVar2 = (kei) mwhVar.get(nrnVarM5099e);
                nrnVar = (keiVar2 == null || (keiVar = (kei) f13515d.get(keiVar2)) == null) ? nrn.f44249a : (nrn) ((mzq) mwhVar).f41853c.getOrDefault(keiVar, nrn.f44249a);
            } else {
                nrnVar = nrnVarM5099e;
            }
        }
        eev eevVar = eeaVar.f13585b;
        long j = eeaVar.f13590g;
        if (eevVar != null && nrnVar != nrn.f44250b && nrnVar != nrn.f44249a) {
            kbc kbcVar = new kbc(eevVar.mo7247c(), eevVar.mo7246b());
            if (f13514c.contains(nrnVar)) {
                kbcVar = kbcVar.m13910j();
            }
            YuvWriteView yuvWriteViewM17720f = ntw.m17720f(new YuvImage(kbcVar.f35517a, kbcVar.f35518b, eevVar.f13755c.m5148a()));
            Resample.m5158b(eevVar.f13755c, nrnVar, yuvWriteViewM17720f);
            eevVar = new eev(yuvWriteViewM17720f, j);
        }
        InterleavedImageU8 interleavedImageU8 = eeaVar.f13584a;
        if (interleavedImageU8 != null && nrnVar != nrn.f44250b) {
            kbc kbcVar2 = new kbc(interleavedImageU8.m5004c(), interleavedImageU8.m5003b());
            if (f13514c.contains(nrnVar)) {
                kbcVar2 = kbcVar2.m13910j();
            }
            InterleavedImageU8 interleavedImageU9 = new InterleavedImageU8(kbcVar2.f35517a, kbcVar2.f35518b, interleavedImageU8.m5002a());
            Resample.m5157a(interleavedImageU8.m5005e(), nrnVar, interleavedImageU9.m5006f());
            interleavedImageU8 = interleavedImageU9;
        }
        edo edoVar = new edo(eevVar, interleavedImageU8);
        float f = ednVar.f13506e;
        float f2 = ednVar.f13507f;
        float f3 = ednVar.f13508g;
        int i = ednVar.f13509h;
        kby kbyVar = new kby(this.f13518g, "compressJpeg");
        try {
            InterleavedImageU8 interleavedImageU10 = edoVar.f13511b;
            if (interleavedImageU10 != null) {
                bArr = (byte[]) mrm.m16828h(JpgHelper.encodeRgbToJpegAsByteArrayImpl(interleavedImageU10.m5005e().f8300a, new JpgEncodeOptions().f8308a, 0, f, f2, f3, i)).mo16809c();
            } else {
                eev eevVar2 = edoVar.f13510a;
                if (eevVar2 == null) {
                    throw new IllegalArgumentException("Only YUV and RGB are supported for JPEG compression.");
                }
                bArr = (byte[]) mrm.m16828h(JpgHelper.encodeYuvToJpegAsByteArrayImpl(eevVar2.f13755c.f8391a, new JpgEncodeOptions().f8308a, 0, f, f2, f3, i)).mo16809c();
            }
            kbyVar.close();
            kbc kbcVarM7177a = edoVar.m7177a();
            kby kbyVar2 = new kby(this.f13518g, "getExif");
            try {
                ExifInterface exifInterfaceM7069a = ebq.m7069a(kbcVarM7177a.f35517a, kbcVarM7177a.f35518b, eeaVar.f13587d, eeaVar.f13597n.f25502c.mo9907m());
                kbyVar2.close();
                int length = bArr.length;
                String str = ednVar.f13502a;
                kby kbyVar3 = new kby(this.f13518g, "populateExif");
                if (str != null) {
                    try {
                        String tagStringValue = exifInterfaceM7069a.getTagStringValue(ExifInterface.TAG_SOFTWARE);
                        tagStringValue.getClass();
                        exifInterfaceM7069a.m4695y(exifInterfaceM7069a.m4684i(ExifInterface.TAG_SOFTWARE, tagStringValue + str));
                    } catch (Throwable th) {
                        try {
                            kbyVar3.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                }
                glk glkVar = eeaVar.f13597n;
                ((hjz) glkVar.f25502c.mo9905k()).f28085k = Long.valueOf(length);
                new kep(exifInterfaceM7069a).m14071g(ins.m11547a(eeaVar.f13590g));
                new kep(exifInterfaceM7069a).m14072h(((fua) glkVar.f25503d).f23576d, exifInterfaceM7069a.mo4680a(ExifInterface.f7812Z), exifInterfaceM7069a.mo4680a(ExifInterface.f7793G));
                int i2 = ((fua) glkVar.f25503d).f23575c;
                if (i2 >= 0) {
                    ken kenVarM4684i = exifInterfaceM7069a.m4684i(ExifInterface.f7876bh, "M");
                    ken kenVarM4684i2 = exifInterfaceM7069a.m4684i(ExifInterface.f7877bi, new kaz(i2, 1L));
                    exifInterfaceM7069a.m4695y(kenVarM4684i);
                    exifInterfaceM7069a.m4695y(kenVarM4684i2);
                }
                byte[] bArr2 = ((fua) glkVar.f25503d).f23577e;
                if (bArr2.length > 0) {
                    exifInterfaceM7069a.m4695y(exifInterfaceM7069a.m4684i(ExifInterface.f7897f, new String(bArr2)));
                }
                if (!this.f13516e.mo6184l(dib.f11297bD) && m7178b(eeaVar)) {
                    exifInterfaceM7069a.m4695y(exifInterfaceM7069a.m4684i(ExifInterface.f7901j, Short.valueOf(((kei) Optional.ofNullable((kei) f13515d.get(kei.m14034c(exifInterfaceM7069a))).orElse(kei.TOP_LEFT)).f35732i)));
                }
                kbyVar3.close();
                glk glkVar2 = eeaVar.f13597n;
                edoVar.m7177a();
                this.f13520i.m13108n(exifInterfaceM7069a);
                if (ednVar.f13505d) {
                    gyj gyjVarM9988h = glkVar2.f25502c.mo9901g().m9988h();
                    String str2 = ednVar.f13503b;
                    if (str2 != null) {
                        gyjVarM9988h.f26832a.mo14688h(str2);
                    }
                    try {
                        dzk dzkVar = ednVar.f13504c;
                        if (dzkVar != null) {
                            this.f13517f.mo6974c(gyjVarM9988h.f26832a, dzkVar);
                        }
                        kxk.m15019l(bArr, exifInterfaceM7069a, gyjVarM9988h.f26832a);
                        gyjVarM9988h.m9977b();
                    } catch (IOException e) {
                        ((nbe) ((nbe) ((nbe) f13512a.m17251b()).mo17283h(e)).mo17276G((char) 1317)).mo17290o("Error writing secondary image to disk");
                        gyjVarM9988h.m9976a();
                    }
                }
                if (ednVar.f13505d) {
                    return;
                }
                ?? r15 = glkVar2.f25502c;
                hln hlnVar = new hln(krd.JPEG);
                hlnVar.m10447a(exifInterfaceM7069a);
                hlnVar.m10448b(kay.m13889b(kei.m14032a(kei.m14034c(exifInterfaceM7069a)).f35503e));
                r15.mo9912r(bArr, hlnVar);
                ((fua) glkVar2.f25503d).f23578f.close();
            } catch (Throwable th3) {
                try {
                    kbyVar2.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                kbyVar.close();
            } catch (Throwable th6) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
            }
            throw th5;
        }
    }
}
