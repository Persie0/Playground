package p000;

import android.media.MediaCodecInfo;
import androidx.compose.runtime.internal.C0282a;
import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xob {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68461a = new C0282a(1277848724, false, new kd1(17));

    /* JADX INFO: renamed from: b */
    public static final C0282a f68462b = new C0282a(-1873949068, false, new ld1(10));

    /* JADX INFO: renamed from: c */
    public static final C0282a f68463c = new C0282a(-1241268259, false, new ld1(11));

    /* JADX INFO: renamed from: a */
    public static int m24629a(boolean z) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            lc3 lc3Var = new lc3();
            lc3Var.f49453n = ez5.m11402l("video/avc");
            C0713b c0713b = new C0713b(lc3Var);
            if (c0713b.f6406o != null) {
                List listM3057h = au5.m3057h(gm5.f41009c, c0713b, z, false);
                for (int i = 0; i < listM3057h.size(); i++) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = ((vt5) listM3057h.get(i)).f65884d;
                    MediaCodecInfo.VideoCapabilities videoCapabilities = ((vt5) listM3057h.get(i)).f65884d.getVideoCapabilities();
                    if (videoCapabilities != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (supportedPerformancePoints.get(i2).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }
}
