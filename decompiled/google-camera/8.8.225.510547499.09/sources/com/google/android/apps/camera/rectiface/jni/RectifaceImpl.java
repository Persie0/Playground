package com.google.android.apps.camera.rectiface.jni;

import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.os.Build;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.rectiface.Rectiface$RectifaceCallback;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.JpgEncodeOptions;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.googlex.gcam.imageio.JpgHelper;
import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import p000.dhn;
import p000.dhv;
import p000.dib;
import p000.dij;
import p000.dip;
import p000.gpw;
import p000.gpx;
import p000.gtz;
import p000.gug;
import p000.guh;
import p000.hjy;
import p000.hjz;
import p000.jww;
import p000.kba;
import p000.lku;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.nea;
import p000.niv;
import p000.nrp;
import p000.ntw;
import p000.nxl;
import p000.nxq;
import p000.nxw;
import p021j$.nio.file.Files;
import p021j$.nio.file.Path;
import p021j$.nio.file.Paths;
import p021j$.nio.file.attribute.FileAttribute;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RectifaceImpl implements gtz, kba {

    /* JADX INFO: renamed from: a */
    private static final nbh f6883a = nbh.m17259h("com/google/android/apps/camera/rectiface/jni/RectifaceImpl");

    /* JADX INFO: renamed from: b */
    private final dhv f6884b;

    /* JADX INFO: renamed from: c */
    private long f6885c = 0;

    /* JADX INFO: renamed from: d */
    private long f6886d = 0;

    /* JADX INFO: renamed from: e */
    private boolean f6887e = false;

    /* JADX INFO: renamed from: f */
    private int f6888f;

    /* JADX INFO: renamed from: g */
    private final gpx f6889g;

    /* JADX INFO: renamed from: h */
    private final gpw f6890h;

    /* JADX INFO: renamed from: i */
    private final jww f6891i;

    static {
        guh.m9772a();
    }

    public RectifaceImpl(gpx gpxVar, gpw gpwVar, jww jwwVar, dhv dhvVar) {
        this.f6889g = gpxVar;
        this.f6890h = gpwVar;
        this.f6891i = jwwVar;
        this.f6884b = dhvVar;
    }

    private static native void copyRgbaToRgbImpl(long j, long j2, long j3, boolean z);

    private static native String correctFaceDistortionAHWBImpl(HardwareBuffer hardwareBuffer, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j5, Rectiface$RectifaceCallback rectiface$RectifaceCallback, long j6);

    private static native String correctFaceDistortionImpl(long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j6, Rectiface$RectifaceCallback rectiface$RectifaceCallback, long j7);

    private static native boolean correctLensDistortionAHWBZeroCopyImpl(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, long j, long j2);

    private static native boolean correctLensDistortionImpl(Bitmap bitmap, long j);

    private static native long initializeLensCorrectionImpl(int i, int i2);

    private static native long initializeSegmenterImpl(long j, int i, String str, String str2, int i2);

    /* JADX INFO: renamed from: l */
    private final void m4255l(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, int i, String str) throws IllegalAccessException, InvocationTargetException {
        LockedHardwareBuffer lockedHardwareBufferM5040c = LockedHardwareBuffer.m5040c(hardwareBuffer, 2L);
        try {
            InterleavedReadViewU8 interleavedReadViewU8M5041a = lockedHardwareBufferM5040c.m5041a();
            InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(interleavedReadViewU8M5041a.m5013d(), interleavedReadViewU8M5041a.m5012c(), interleavedReadViewU8M5041a.m5011b());
            ImageUtils.m5154a(interleavedReadViewU8M5041a, interleavedImageU8.m5006f());
            m4256m(interleavedImageU8.m5005e(), shotMetadata, i, str);
            lockedHardwareBufferM5040c.close();
        } catch (Throwable th) {
            try {
                lockedHardwareBufferM5040c.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m4256m(InterleavedReadViewU8 interleavedReadViewU8, ShotMetadata shotMetadata, int i, String str) {
        int iM17721g;
        String str2;
        try {
            if (this.f6884b.mo6184l(dib.f11297bD)) {
                iM17721g = ntw.m17721g(shotMetadata.m5099e());
                ntw.m17725k(shotMetadata, 60);
            } else {
                iM17721g = 0;
            }
            Path path = Paths.get("sdcard", "DCIM", "CAMERA");
            Files.createDirectories(path, new FileAttribute[0]);
            JpgEncodeOptions jpgEncodeOptions = new JpgEncodeOptions();
            GcamModuleJNI.JpgEncodeOptions_quality_set(jpgEncodeOptions.f8308a, jpgEncodeOptions, 80);
            jpgEncodeOptions.m5024b(shotMetadata);
            mrm mrmVarM5156a = JpgHelper.m5156a(interleavedReadViewU8, jpgEncodeOptions, iM17721g);
            switch (i - 1) {
                case 0:
                    str2 = "rectiface_input";
                    break;
                default:
                    str2 = "rectiface_output";
                    break;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(Files.createFile(path.resolve(str + "_" + str2 + ".jpg"), new FileAttribute[0]).toFile());
            try {
                fileOutputStream.write((byte[]) mrmVarM5156a.mo16809c());
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (Exception e) {
        }
    }

    /* JADX INFO: renamed from: n */
    private static final void m4257n(ShotMetadata shotMetadata) {
        shotMetadata.m5107m(String.valueOf(shotMetadata.m5102h()).concat("Skipped Rectiface since the module is not initialized."));
        ((nbe) ((nbe) f6883a.m17252c()).mo17276G((char) 3259)).mo17293r("%s", "Skipped Rectiface since the module is not initialized.");
    }

    private static native void releaseSegmenterImpl(long j);

    @Override // p000.gtz
    /* JADX INFO: renamed from: a */
    public final gug mo4258a() {
        RectifaceWarpfieldImpl rectifaceWarpfieldImpl = new RectifaceWarpfieldImpl();
        if (rectifaceWarpfieldImpl.f6894b == 0) {
            rectifaceWarpfieldImpl.f6894b = RectifaceWarpfieldImpl.initializeImpl();
        }
        ((nbe) ((nbe) RectifaceWarpfieldImpl.f6893a.m17252c()).mo17276G((char) 3264)).mo17290o("Ignored Rectiface warpfield re-initialization.");
        lku.m15614I(rectifaceWarpfieldImpl.f6894b != 0, "Invalid rectiface warpfield.");
        return rectifaceWarpfieldImpl;
    }

    @Override // p000.gtz
    /* JADX INFO: renamed from: b */
    public final void mo4259b(HardwareBuffer hardwareBuffer, ShotMetadata shotMetadata, boolean z, boolean z2, String str, gug gugVar, hjy hjyVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU8) throws IllegalAccessException, InvocationTargetException {
        RectifaceOutput rectifaceOutput;
        if (!this.f6887e) {
            m4257n(shotMetadata);
            return;
        }
        if (this.f6884b.mo6184l(dip.f11686b)) {
            boolean z3 = !str.isEmpty() && this.f6884b.mo6184l(dip.f11692h);
            Boolean boolValueOf = Boolean.valueOf(z3);
            if (boolValueOf.booleanValue()) {
                m4255l(hardwareBuffer, new ShotMetadata(shotMetadata), 1, str);
            }
            RectifaceOutput rectifaceOutput2 = new RectifaceOutput();
            long jM5095a = ShotMetadata.m5095a(shotMetadata);
            long j = this.f6885c;
            long j2 = ((RectifaceWarpfieldImpl) gugVar).f6894b;
            long jMo9611a = this.f6890h.mo9611a();
            boolean zM4268k = m4268k();
            boolean zM4267j = m4267j(shotMetadata);
            dhv dhvVar = this.f6884b;
            int i = dhn.f11140a;
            dhvVar.mo6175c();
            boolean zMo6184l = this.f6884b.mo6184l(dip.f11689e);
            boolean z4 = this.f6884b.mo6184l(dip.f11690f) || z;
            boolean z5 = (!this.f6884b.mo6184l(dip.f11691g) && mo4264g() && ((Boolean) this.f6891i.mo3831be()).booleanValue()) ? false : true;
            correctFaceDistortionAHWBImpl(hardwareBuffer, jM5095a, j, j2, jMo9611a, zM4268k, zM4267j, z2, false, zMo6184l, z4, z5, rectifaceOutput2.f6892a, rectiface$RectifaceCallback, interleavedWriteViewU8 == null ? 0L : InterleavedWriteViewU8.m5019a(interleavedWriteViewU8));
            if (boolValueOf.booleanValue()) {
                m4255l(hardwareBuffer, new ShotMetadata(shotMetadata), 2, str);
            }
            if (hjyVar != null) {
                nxl nxlVarM18137O = niv.f42802k.m18137O();
                int i2 = nea.m17401o()[rectifaceOutput2.m4278j()];
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar = (niv) nxlVarM18137O.f44974b;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                nivVar.f42805b = i3;
                nivVar.f42804a |= 1;
                int iM4272d = rectifaceOutput2.m4272d();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar2 = (niv) nxlVarM18137O.f44974b;
                nivVar2.f42804a = 2 | nivVar2.f42804a;
                nivVar2.f42808e = iM4272d;
                int iM4275g = rectifaceOutput2.m4275g();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar3 = (niv) nxlVarM18137O.f44974b;
                nivVar3.f42804a |= 16;
                nivVar3.f42810g = iM4275g;
                int iM4277i = rectifaceOutput2.m4277i();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar4 = (niv) nxlVarM18137O.f44974b;
                nivVar4.f42804a |= 8;
                nivVar4.f42809f = iM4277i;
                int iM4276h = rectifaceOutput2.m4276h();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar5 = (niv) nxlVarM18137O.f44974b;
                nivVar5.f42804a |= 64;
                nivVar5.f42811h = iM4276h;
                rectifaceOutput = rectifaceOutput2;
                boolean isAnglerfishAppliedImpl = RectifaceOutput.getIsAnglerfishAppliedImpl(rectifaceOutput.f6892a);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar6 = (niv) nxlVarM18137O.f44974b;
                nivVar6.f42804a |= 128;
                nivVar6.f42812i = isAnglerfishAppliedImpl;
                if (rectifaceOutput.m4274f() > 0) {
                    for (int i4 = 0; i4 < rectifaceOutput.m4274f(); i4++) {
                        nxlVarM18137O.m18041D(rectifaceOutput.m4270b(i4));
                    }
                }
                if (rectifaceOutput.m4273e() > 0) {
                    for (int i5 = 0; i5 < rectifaceOutput.m4273e(); i5++) {
                        nxlVarM18137O.m18040C(rectifaceOutput.m4269a(i5));
                    }
                }
                if (rectifaceOutput.m4271c() > 0) {
                    for (int i6 = 0; i6 < rectifaceOutput.m4271c(); i6++) {
                        int i7 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}[RectifaceOutput.getAnglerfishFallbackStatusImpl(rectifaceOutput.f6892a, i6)];
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        niv nivVar7 = (niv) nxlVarM18137O.f44974b;
                        if (i7 == 0) {
                            throw null;
                        }
                        nxw nxwVar = nivVar7.f42813j;
                        if (!nxwVar.mo17770c()) {
                            nivVar7.f42813j = nxq.m18125S(nxwVar);
                        }
                        nivVar7.f42813j.mo18148g(i7 - 1);
                    }
                }
                ((hjz) hjyVar).f28091q = (niv) nxlVarM18137O.mo18103l();
            } else {
                rectifaceOutput = rectifaceOutput2;
            }
            rectifaceOutput.m4279k();
        }
    }

    @Override // p000.gtz
    /* JADX INFO: renamed from: c */
    public final void mo4260c(InterleavedWriteViewU8 interleavedWriteViewU8, ShotMetadata shotMetadata, boolean z, boolean z2, String str, gug gugVar, hjy hjyVar, Rectiface$RectifaceCallback rectiface$RectifaceCallback, InterleavedWriteViewU8 interleavedWriteViewU9) {
        if (!this.f6887e) {
            m4257n(shotMetadata);
            return;
        }
        if (this.f6884b.mo6184l(dip.f11686b)) {
            boolean z3 = !str.isEmpty() && this.f6884b.mo6184l(dip.f11692h);
            Boolean boolValueOf = Boolean.valueOf(z3);
            if (boolValueOf.booleanValue()) {
                m4256m(interleavedWriteViewU8.m5020b(), new ShotMetadata(shotMetadata), 1, str);
            }
            RectifaceOutput rectifaceOutput = new RectifaceOutput();
            long jM5019a = InterleavedWriteViewU8.m5019a(interleavedWriteViewU8);
            long jM5095a = ShotMetadata.m5095a(shotMetadata);
            long j = this.f6885c;
            long j2 = ((RectifaceWarpfieldImpl) gugVar).f6894b;
            long jMo9611a = this.f6890h.mo9611a();
            boolean zM4268k = m4268k();
            boolean zM4267j = m4267j(shotMetadata);
            boolean zMo6184l = this.f6884b.mo6184l(dip.f11689e);
            boolean z4 = this.f6884b.mo6184l(dip.f11690f) || z;
            boolean z5 = this.f6884b.mo6184l(dip.f11691g) || !mo4264g();
            String strCorrectFaceDistortionImpl = correctFaceDistortionImpl(jM5019a, jM5095a, j, j2, jMo9611a, zM4268k, zM4267j, z2, zMo6184l, z4, z5, rectifaceOutput.f6892a, rectiface$RectifaceCallback, interleavedWriteViewU9 == null ? 0L : InterleavedWriteViewU8.m5019a(interleavedWriteViewU9));
            if (boolValueOf.booleanValue()) {
                m4256m(interleavedWriteViewU8.m5020b(), new ShotMetadata(shotMetadata), 2, str);
            }
            shotMetadata.m5107m(String.valueOf(shotMetadata.m5102h()).concat(String.valueOf(strCorrectFaceDistortionImpl)));
            if (hjyVar != null) {
                nxl nxlVarM18137O = niv.f42802k.m18137O();
                int i = nea.m17401o()[rectifaceOutput.m4278j()];
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar = (niv) nxlVarM18137O.f44974b;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                nivVar.f42805b = i2;
                nivVar.f42804a |= 1;
                int iM4272d = rectifaceOutput.m4272d();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar2 = (niv) nxlVarM18137O.f44974b;
                nivVar2.f42804a |= 2;
                nivVar2.f42808e = iM4272d;
                int iM4275g = rectifaceOutput.m4275g();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar3 = (niv) nxlVarM18137O.f44974b;
                nivVar3.f42804a |= 16;
                nivVar3.f42810g = iM4275g;
                int iM4277i = rectifaceOutput.m4277i();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar4 = (niv) nxlVarM18137O.f44974b;
                nivVar4.f42804a |= 8;
                nivVar4.f42809f = iM4277i;
                int iM4276h = rectifaceOutput.m4276h();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                niv nivVar5 = (niv) nxlVarM18137O.f44974b;
                nivVar5.f42804a |= 64;
                nivVar5.f42811h = iM4276h;
                if (rectifaceOutput.m4274f() > 0) {
                    for (int i3 = 0; i3 < rectifaceOutput.m4274f(); i3++) {
                        nxlVarM18137O.m18041D(rectifaceOutput.m4270b(i3));
                    }
                }
                if (rectifaceOutput.m4273e() > 0) {
                    float[] fArr = new float[rectifaceOutput.m4273e()];
                    for (int i4 = 0; i4 < rectifaceOutput.m4273e(); i4++) {
                        nxlVarM18137O.m18040C(rectifaceOutput.m4269a(i4));
                    }
                }
                ((hjz) hjyVar).f28091q = (niv) nxlVarM18137O.mo18103l();
            }
            rectifaceOutput.m4279k();
        }
    }

    @Override // java.lang.AutoCloseable, p000.kba
    public final void close() {
        this.f6887e = false;
        long j = this.f6885c;
        if (j != 0) {
            releaseSegmenterImpl(j);
            this.f6885c = 0L;
        }
        long j2 = this.f6886d;
        if (j2 != 0) {
            releaseSegmenterImpl(j2);
            this.f6886d = 0L;
        }
    }

    @Override // p000.gtz
    /* JADX INFO: renamed from: d */
    public final void mo4261d(Bitmap bitmap, ShotMetadata shotMetadata) {
        bitmap.getClass();
        if (correctLensDistortionImpl(bitmap, ShotMetadata.m5095a(shotMetadata))) {
            return;
        }
        ((nbe) ((nbe) f6883a.m17251b()).mo17276G((char) 3255)).mo17290o("Lens correction failed.");
    }

    @Override // p000.gtz
    /* JADX INFO: renamed from: f */
    public final boolean mo4263f(HardwareBuffer hardwareBuffer, HardwareBuffer hardwareBuffer2, ShotMetadata shotMetadata) {
        if ((this.f6888f != 1 || hardwareBuffer.getFormat() == 35) && (this.f6888f != 0 || hardwareBuffer.getFormat() == 1)) {
            hardwareBuffer.getClass();
            return correctLensDistortionAHWBZeroCopyImpl(hardwareBuffer, hardwareBuffer2, ShotMetadata.m5095a(shotMetadata), this.f6886d);
        }
        ((nbe) ((nbe) f6883a.m17252c()).mo17276G((char) 3263)).mo17290o("Lens distortion correction skipped because of format mismatch.");
        return false;
    }

    @Override // p000.gtz
    /* JADX INFO: renamed from: g */
    public final boolean mo4264g() {
        return this.f6884b.mo6184l(dip.f11693i);
    }

    @Override // p000.gtz
    /* JADX INFO: renamed from: h */
    public final InterleavedImageU8 mo4265h(HardwareBuffer hardwareBuffer) throws IllegalAccessException, InvocationTargetException {
        lku.m15670x(hardwareBuffer.getFormat() == 1, "HardwareBuffer format unexpected.");
        LockedHardwareBuffer lockedHardwareBufferM5040c = LockedHardwareBuffer.m5040c(hardwareBuffer, 2L);
        try {
            InterleavedReadViewU8 interleavedReadViewU8M5041a = lockedHardwareBufferM5040c.m5041a();
            lku.m15669w(interleavedReadViewU8M5041a.m5011b() == 4);
            InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(interleavedReadViewU8M5041a.m5013d(), interleavedReadViewU8M5041a.m5012c(), 3);
            InterleavedWriteViewU8 interleavedWriteViewU8M5006f = interleavedImageU8.m5006f();
            lku.m15670x(interleavedReadViewU8M5041a.m5011b() == 4, wUzNh.wIXlVaE);
            lku.m15670x(GcamModuleJNI.InterleavedWriteViewU8_channels(interleavedWriteViewU8M5006f.f8304a, interleavedWriteViewU8M5006f) == 3, "Expect dstBuffer in RGB8 format.");
            lku.m15669w(interleavedReadViewU8M5041a.m5013d() == GcamModuleJNI.InterleavedWriteViewU8_width(interleavedWriteViewU8M5006f.f8304a, interleavedWriteViewU8M5006f));
            lku.m15669w(interleavedReadViewU8M5041a.m5012c() == GcamModuleJNI.InterleavedWriteViewU8_height(interleavedWriteViewU8M5006f.f8304a, interleavedWriteViewU8M5006f));
            copyRgbaToRgbImpl(interleavedReadViewU8M5041a.f8300a, InterleavedWriteViewU8.m5019a(interleavedWriteViewU8M5006f), this.f6885c, this.f6887e);
            lockedHardwareBufferM5040c.close();
            hardwareBuffer.close();
            return interleavedImageU8;
        } catch (Throwable th) {
            try {
                lockedHardwareBufferM5040c.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4266i() {
        return this.f6884b.mo6184l(dip.f11687c);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m4267j(ShotMetadata shotMetadata) {
        return !this.f6884b.mo6184l(dip.f11688d) || (((Integer) this.f6884b.mo6173a(dip.f11685a).get()).intValue() == 2 && shotMetadata.m5101g().m5119b() == nrp.f44269c);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4268k() {
        return (m4266i() && mo4264g() && ((Boolean) this.f6891i.mo3831be()).booleanValue()) ? false : true;
    }

    @Override // p000.gtz
    /* JADX INFO: renamed from: e */
    public final void mo4262e() {
        gpx gpxVar;
        if (this.f6885c != 0 || (gpxVar = this.f6889g) == null) {
            ((nbe) ((nbe) f6883a.m17252c()).mo17276G((char) 3256)).mo17290o("Ignored Rectiface (Segmenter) re-initialization.");
        } else {
            if (gpxVar.mo9617a() == 0 && mo4264g()) {
                ((nbe) ((nbe) f6883a.m17252c()).mo17276G((char) 3258)).mo17290o("Expected portrait segmenter to be initialized, but it wasn't. Initializing again.");
                this.f6889g.mo9618b();
            }
            long jMo9617a = this.f6889g.mo9617a();
            String str = Build.MANUFACTURER;
            str.getClass();
            String str2 = Build.DEVICE;
            str2.getClass();
            this.f6885c = initializeSegmenterImpl(jMo9617a, 8, str, str2, 0);
            int i = (this.f6884b.mo6184l(dij.f11573W) && this.f6884b.mo6184l(dij.f11595s)) ? 1 : 0;
            this.f6888f = i;
            this.f6886d = initializeLensCorrectionImpl(8, i);
        }
        lku.m15614I(this.f6885c != 0, "Invalid segmenter.");
        if (this.f6890h.mo9611a() == 0 && m4266i()) {
            ((nbe) ((nbe) f6883a.m17252c()).mo17276G((char) 3257)).mo17290o("Expected firefly to be initialized, but it wasn't. Initializing again.");
            this.f6890h.mo9612d();
        }
        this.f6887e = true;
    }
}
