package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.SystemClock;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.facedeblur.deeprestore.jni.DeepRestoreNative;
import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;
import com.pairip.VMRunner;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.concurrent.Executor;
import p021j$.nio.channels.DesugarChannels;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drl implements drk {

    /* JADX INFO: renamed from: d */
    private static final nbh f12400d = nbh.m17259h("com/google/android/apps/camera/facedeblur/deeprestore/DeepRestoreFaceDeblurControllerImpl");

    /* JADX INFO: renamed from: a */
    public final Executor f12401a;

    /* JADX INFO: renamed from: b */
    public final kbz f12402b;

    /* JADX INFO: renamed from: c */
    public mrm f12403c;

    /* JADX INFO: renamed from: e */
    private final boolean f12404e;

    /* JADX INFO: renamed from: f */
    private final boolean f12405f;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f12406g;

    /* JADX INFO: renamed from: h */
    private final fxs f12407h;

    /* JADX INFO: renamed from: i */
    private final int f12408i;

    /* JADX WARN: Code duplicated, block: B:69:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[Catch: IOException -> 0x0100, Exception -> 0x0109, SYNTHETIC, TRY_LEAVE, TryCatch #5 {IOException -> 0x0100, blocks: (B:14:0x0064, B:23:0x0093, B:57:0x00ff, B:56:0x00fc), top: B:71:0x0064, outer: #3 }] */
    public drl(fxs fxsVar, Executor executor, jvb jvbVar, dhv dhvVar, kbz kbzVar, Context context) {
        this.f12403c = mqu.f41450a;
        this.f12406g = null;
        this.f12407h = fxsVar;
        this.f12401a = executor;
        String str = dhvVar.mo6184l(dhq.f11155b) ? "darwinn" : dhvVar.mo6184l(dhq.f11156c) ? "gpu" : "cpu";
        if (str.equals("cpu")) {
            ((nbe) ((nbe) f12400d.m17251b()).mo17276G((char) 1101)).mo17293r("%s accelName = .cpu is not supported!", "[FaceDB-DR]");
            this.f12404e = true;
            this.f12405f = false;
            this.f12402b = kbzVar;
            this.f12408i = 1;
            return;
        }
        try {
            String absolutePath = context.getCacheDir().getAbsolutePath();
            String strMo6182j = dhvVar.mo6182j(dhq.f11160g);
            strMo6182j.getClass();
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(strMo6182j);
                try {
                    FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorOpenFd.createInputStream();
                    try {
                        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStreamCreateInputStream.getChannel());
                        try {
                            MappedByteBuffer map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            }
                            if (fileInputStreamCreateInputStream != null) {
                                fileInputStreamCreateInputStream.close();
                            }
                            if (assetFileDescriptorOpenFd != null) {
                                assetFileDescriptorOpenFd.close();
                            }
                            this.f12406g = map;
                            map.getClass();
                            dhvVar.mo6175c();
                            this.f12403c = mrm.m16829i(Long.valueOf(DeepRestoreNative.createHandle(str, map, absolutePath, false, false)));
                            jvbVar.m13537d(new dev(this, 14));
                            this.f12404e = dhvVar.mo6184l(dhq.f11157d);
                            this.f12405f = dhvVar.mo6184l(dhq.f11159f);
                            this.f12402b = kbzVar;
                            this.f12408i = true != str.equals("darwinn") ? 2 : 3;
                        } catch (Throwable th) {
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                                throw th;
                            }
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                throw th;
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                throw th;
                            }
                            if (assetFileDescriptorOpenFd != null) {
                                throw th;
                            }
                            try {
                                assetFileDescriptorOpenFd.close();
                                throw th;
                            } catch (Throwable th3) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        if (fileInputStreamCreateInputStream == null) {
                            throw th4;
                        }
                        try {
                            fileInputStreamCreateInputStream.close();
                            throw th4;
                        } catch (Throwable th5) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    if (assetFileDescriptorOpenFd != null) {
                        throw th6;
                    }
                    assetFileDescriptorOpenFd.close();
                    throw th6;
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to mmap deeprestore asset file", e);
            }
        } catch (Exception e2) {
            ((nbe) ((nbe) ((nbe) f12400d.m17251b()).mo17283h(e2)).mo17276G((char) 1100)).mo17293r("%s Failed create deeprestore client.", "[FaceDB-DR]");
            this.f12404e = true;
            this.f12405f = false;
            this.f12402b = kbzVar;
            this.f12408i = 1;
        }
    }

    @Override // p000.drk
    /* JADX INFO: renamed from: a */
    public synchronized nps mo6620a(drj drjVar) {
        return (nps) VMRunner.invoke("tG1AE6Ivd2SLtOG3", new Object[]{this, drjVar});
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Boolean m6641b(drj drjVar) {
        if (!this.f12403c.mo16813g()) {
            ((nbe) ((nbe) f12400d.m17252c()).mo17276G((char) 1093)).mo17293r("%s DeepRestoreFaceDeblur is not ready, return the image.", "[FaceDB-DR]");
            return false;
        }
        Object obj = drjVar.f12396b;
        Object obj2 = drjVar.f12395a;
        if (drjVar.f12397c == null) {
            ((nbe) ((nbe) f12400d.m17252c()).mo17276G((char) 1090)).mo17293r("%s [RGB path] Input mask is null.", "[FaceDB-DR]");
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj3 = drjVar.f12399e;
        long jLongValue = ((Long) this.f12403c.mo16809c()).longValue();
        long jM5019a = InterleavedWriteViewU8.m5019a(((InterleavedImageU8) drjVar.f12395a).m5006f());
        long jM5019a2 = InterleavedWriteViewU8.m5019a(((InterleavedImageU8) drjVar.f12397c).m5006f());
        Object obj4 = drjVar.f12396b;
        int iDeepRestoreFaceDeblurRgb = DeepRestoreNative.deepRestoreFaceDeblurRgb(jLongValue, jM5019a, jM5019a2, ((drn) obj4).f12413a, ((drn) obj4).f12414b, ((drn) obj4).f12415c, this.f12404e, this.f12405f, obj3 != null ? ShotMetadata.m5095a((ShotMetadata) obj3) : 0L);
        boolean z = iDeepRestoreFaceDeblurRgb > 0;
        if (obj3 != null && z) {
            GcamModuleJNI.ShotMetadata_should_apply_deblur_badge_set(((ShotMetadata) obj3).f8356a, (ShotMetadata) obj3, true);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        nxl nxlVarM18137O = nil.f42722g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nil nilVar = (nil) nxlVarM18137O.f44974b;
        nilVar.f42724a |= 4;
        nilVar.f42727d = jElapsedRealtime2;
        int i = 0;
        for (long j : ((drn) drjVar.f12396b).f12414b) {
            int thumbnailSize = FaceMetadataNative.getThumbnailSize(j);
            if (i < thumbnailSize) {
                i = thumbnailSize;
            }
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        nil nilVar2 = (nil) nxqVar;
        nilVar2.f42724a |= 2;
        nilVar2.f42726c = i;
        int i2 = true != z ? 3 : 4;
        if (iDeepRestoreFaceDeblurRgb < 0) {
            i2 = 5;
        }
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        nil nilVar3 = (nil) nxqVar2;
        nilVar3.f42725b = i2 - 1;
        nilVar3.f42724a |= 1;
        if (iDeepRestoreFaceDeblurRgb == 1) {
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nil nilVar4 = (nil) nxlVarM18137O.f44974b;
            nilVar4.f42728e = 1;
            nilVar4.f42724a |= 8;
        } else if (iDeepRestoreFaceDeblurRgb == 2) {
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nil nilVar5 = (nil) nxlVarM18137O.f44974b;
            nilVar5.f42728e = 2;
            nilVar5.f42724a |= 8;
        }
        int i3 = this.f12408i;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nil nilVar6 = (nil) nxlVarM18137O.f44974b;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        nilVar6.f42729f = i4;
        nilVar6.f42724a |= 16;
        Object obj5 = drjVar.f12398d;
        if (obj5 != null) {
            ((hjz) obj5).f28092r = (nil) nxlVarM18137O.mo18103l();
        }
        String str = BEeWZPor.BajRZLfP;
        Locale locale = Locale.getDefault();
        Boolean boolValueOf = Boolean.valueOf(z);
        String.format(locale, "\n === Deeprestore Summary === \nEnabled: true\nImage format: %s\nApplied: %b\nProcessing Time: %d ms \n", str, boolValueOf, Long.valueOf(jElapsedRealtime2));
        return boolValueOf;
    }
}
