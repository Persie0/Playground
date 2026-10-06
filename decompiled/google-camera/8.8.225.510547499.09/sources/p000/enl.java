package p000;

import com.google.android.apps.camera.async.p005tt.CpuSets;
import com.google.android.apps.camera.debug.logorcrash.LogOrCrash;
import com.google.android.apps.camera.facemetadata.conversions.jni.MeshWarpInverseNative;
import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNima;
import com.google.android.apps.camera.jni.aesthetic.AestheticScorerNimaV2;
import com.google.android.apps.camera.jni.eis.EisNative;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import com.google.android.apps.camera.jni.faceobfuscation.GpuRedactorNative;
import com.google.android.apps.camera.jni.federatedphoto.ModeSuggestionClient;
import com.google.android.apps.camera.jni.gyro.GyroQueueNative;
import com.google.android.apps.camera.jni.lensoffset.LensOffsetQueueNative;
import com.google.android.apps.camera.jni.mallopt.Mallopt;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import com.google.android.apps.camera.jni.surface.SurfaceNative;
import com.google.android.apps.camera.jni.tracking.RoiTrackerNative;
import com.google.android.apps.camera.moments.FastMomentsHdrImpl;
import com.google.android.apps.camera.processing.imagebackend.FaceUtilNative;
import com.google.android.apps.camera.processing.imagebackend.ImgUtilNative;
import com.google.android.libraries.camera.gyro.hardwarebuffer.ReadHardwareBufferJniFunctions;
import com.google.android.libraries.camera.jni.graphics.HardwareBuffers;
import com.google.android.libraries.camera.jni.jpeg.JpegUtilNative;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.android.libraries.oliveoil.bufferflinger.BufferFlinger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enl {

    /* JADX INFO: renamed from: a */
    public static final mws f14762a = mws.m17102q(AestheticScorerNima.class, AestheticScorerNimaV2.class, BufferFlinger.class, dfm.class, CpuSets.class, dnr.class, EisNative.class, FaceBeautificationNative.class, FaceUtilNative.class, FaceMetadataNative.class, MeshWarpInverseNative.class, FastMomentsHdrImpl.class, FrameUtilNative.class, enc.class, GpuRetoucherNative.class, GpuRedactorNative.class, GyroQueueNative.class, HardwareBuffers.class, ImgUtilNative.class, JpegUtilNative.class, LensOffsetQueueNative.class, LogOrCrash.class, Mallopt.class, MicrovideoToneMapNative.class, ModeSuggestionClient.class, ReadHardwareBufferJniFunctions.class, guh.class, RoiTrackerNative.class, SurfaceNative.class, YuvUtilNative.class);
}
