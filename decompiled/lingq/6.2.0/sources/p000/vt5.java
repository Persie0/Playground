package p000;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.media3.common.C0713b;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vt5 {

    /* JADX INFO: renamed from: a */
    public final String f65881a;

    /* JADX INFO: renamed from: b */
    public final String f65882b;

    /* JADX INFO: renamed from: c */
    public final String f65883c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f65884d;

    /* JADX INFO: renamed from: e */
    public final boolean f65885e;

    /* JADX INFO: renamed from: f */
    public final boolean f65886f;

    /* JADX INFO: renamed from: g */
    public final boolean f65887g;

    /* JADX INFO: renamed from: h */
    public final boolean f65888h;

    /* JADX INFO: renamed from: i */
    public final boolean f65889i;

    /* JADX INFO: renamed from: j */
    public int f65890j;

    /* JADX INFO: renamed from: k */
    public int f65891k;

    /* JADX INFO: renamed from: l */
    public float f65892l;

    public vt5(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f65881a = str;
        this.f65882b = str2;
        this.f65883c = str3;
        this.f65884d = codecCapabilities;
        this.f65887g = z;
        this.f65885e = z4;
        this.f65886f = z5;
        this.f65888h = z6;
        this.f65889i = ez5.m11401k(str2);
        this.f65892l = -3.4028235E38f;
        this.f65890j = -1;
        this.f65891k = -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m23532b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(uma.m22810e(i, widthAlignment) * widthAlignment, uma.m22810e(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double dFloor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX INFO: renamed from: l */
    public static vt5 m23533l(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        boolean z4;
        boolean zIsFeatureSupported = codecCapabilities.isFeatureSupported("adaptive-playback");
        codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean zIsFeatureSupported2 = codecCapabilities.isFeatureSupported("secure-playback");
        if (Build.VERSION.SDK_INT < 35 || !codecCapabilities.isFeatureSupported("detached-surface")) {
            z4 = false;
        } else {
            String str4 = Build.MANUFACTURER;
            if (str4.equals("Xiaomi") || str4.equals("OPPO") || str4.equals("realme") || str4.equals("motorola") || str4.equals("LENOVO")) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        return new vt5(str, str2, str3, codecCapabilities, z, z2, z3, zIsFeatureSupported, zIsFeatureSupported2, z4);
    }

    /* JADX INFO: renamed from: a */
    public final Point m23534a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f65884d.getVideoCapabilities();
        if (videoCapabilities == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(uma.m22810e(i, widthAlignment) * widthAlignment, uma.m22810e(i2, heightAlignment) * heightAlignment);
    }

    /* JADX INFO: renamed from: c */
    public final o32 m23535c(C0713b c0713b, C0713b c0713b2) {
        C0713b c0713b3;
        C0713b c0713b4;
        int i;
        String str = c0713b.f6406o;
        ga1 ga1Var = c0713b.f6379E;
        String str2 = c0713b2.f6406o;
        ga1 ga1Var2 = c0713b2.f6379E;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f65889i) {
            if (c0713b.f6375A != c0713b2.f6375A) {
                i2 |= 1024;
            }
            boolean z = (c0713b.f6413v == c0713b2.f6413v && c0713b.f6414w == c0713b2.f6414w) ? false : true;
            if (!this.f65885e && z) {
                i2 |= 512;
            }
            if ((!ga1.m12449e(ga1Var) || !ga1.m12449e(ga1Var2)) && !Objects.equals(ga1Var, ga1Var2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f65881a) && !c0713b.m2521b(c0713b2)) {
                i2 |= 2;
            }
            int i3 = c0713b.f6415x;
            if (i3 != -1 && (i = c0713b.f6416y) != -1 && i3 == c0713b2.f6415x && i == c0713b2.f6416y && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(c0713b2.f6406o, "video/dolby-vision")) {
                Pair pairM16616b = m41.m16616b(c0713b);
                Pair pairM16616b2 = m41.m16616b(c0713b2);
                if (pairM16616b == null || pairM16616b2 == null || !((Integer) pairM16616b.first).equals(pairM16616b2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new o32(this.f65881a, c0713b, c0713b2, c0713b.m2521b(c0713b2) ? 3 : 2, 0);
            }
            c0713b3 = c0713b;
            c0713b4 = c0713b2;
        } else {
            c0713b3 = c0713b;
            c0713b4 = c0713b2;
            if (c0713b3.f6381G != c0713b4.f6381G) {
                i2 |= 4096;
            }
            if (c0713b3.f6382H != c0713b4.f6382H) {
                i2 |= 8192;
            }
            if (c0713b3.f6383I != c0713b4.f6383I) {
                i2 |= 16384;
            }
            String str3 = this.f65882b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair pairM16616b3 = m41.m16616b(c0713b3);
                Pair pairM16616b4 = m41.m16616b(c0713b4);
                if (pairM16616b3 != null && pairM16616b4 != null) {
                    int iIntValue = ((Integer) pairM16616b3.first).intValue();
                    int iIntValue2 = ((Integer) pairM16616b4.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new o32(this.f65881a, c0713b3, c0713b4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && pairM16616b3.equals(pairM16616b4)) {
                        return new o32(this.f65881a, c0713b3, c0713b4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals("audio/eac3-joc") || str3.equals("audio/eac3"))) {
                return new o32(this.f65881a, c0713b3, c0713b4, 3, 0);
            }
            if (!c0713b3.m2521b(c0713b4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new o32(this.f65881a, c0713b3, c0713b4, 1, 0);
            }
        }
        return new o32(this.f65881a, c0713b3, c0713b4, 0, i2);
    }

    /* JADX INFO: renamed from: d */
    public final float m23536d(int i, int i2) {
        if (!this.f65889i) {
            return -3.4028235E38f;
        }
        float f = this.f65892l;
        if (f != -3.4028235E38f && this.f65890j == i && this.f65891k == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!m23542j(1024.0d, i, i2)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                if (m23542j(f5, i, i2)) {
                    f3 = f5;
                } else {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.f65892l = f2;
        this.f65890j = i;
        this.f65891k = i2;
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c2 A[PHI: r2
      0x00c2: PHI (r2v1 android.util.Pair) = (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v0 android.util.Pair), (r2v14 android.util.Pair) binds: [B:3:0x000e, B:5:0x0016, B:10:0x002a, B:37:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final boolean m23537e(Context context, C0713b c0713b, boolean z) {
        Pair pair;
        String strM16615a;
        Pair pairM16616b = m41.m16616b(c0713b);
        String str = c0713b.f6406o;
        String str2 = this.f65883c;
        if (str != null && str.equals("video/mv-hevc")) {
            String strM11402l = ez5.m11402l(str2);
            if (strM11402l.equals("video/mv-hevc")) {
                return true;
            }
            if (strM11402l.equals("video/hevc")) {
                HashMap map = au5.f7517a;
                List list = c0713b.f6409r;
                int i = 0;
                loop0: while (true) {
                    if (i >= list.size()) {
                        pair = null;
                        strM16615a = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        c14 c14VarM6284m = ImmutableList.m6284m();
                        int i2 = 0;
                        while (i2 < bArr.length) {
                            int iM25794b = zuc.m25794b(bArr, i2, bArr.length, zArr);
                            if (iM25794b != bArr.length) {
                                c14VarM6284m.m3157b(Integer.valueOf(iM25794b));
                            }
                            i2 = iM25794b + 3;
                        }
                        ImmutableList immutableListM4280g = c14VarM6284m.m4280g();
                        for (int i3 = 0; i3 < immutableListM4280g.size(); i3++) {
                            if (((Integer) immutableListM4280g.get(i3)).intValue() + 3 < length) {
                                l47 l47Var = new l47(bArr, ((Integer) immutableListM4280g.get(i3)).intValue() + 3, length);
                                C3283l2 c3283l2M25798f = zuc.m25798f(l47Var);
                                if (c3283l2M25798f.f48908a == 33 && c3283l2M25798f.f48909b == 0) {
                                    l47Var.m15788j(4);
                                    int iM15783e = l47Var.m15783e(3);
                                    l47Var.m15787i();
                                    pair = null;
                                    g76 g76VarM25799g = zuc.m25799g(l47Var, true, iM15783e, null);
                                    strM16615a = m41.m16615a(g76VarM25799g.f40325a, g76VarM25799g.f40326b, g76VarM25799g.f40327c, g76VarM25799g.f40328d, g76VarM25799g.f40329e, g76VarM25799g.f40330f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (strM16615a == null) {
                    pairM16616b = pair;
                } else {
                    String strTrim = strM16615a.trim();
                    String str3 = uma.f64080a;
                    pairM16616b = m41.m16617c(strM16615a, strTrim.split("\\.", -1), c0713b.f6379E);
                }
            }
        }
        if (pairM16616b == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM16616b.first).intValue();
        int iIntValue2 = ((Integer) pairM16616b.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str);
        String str4 = this.f65882b;
        if (zEquals) {
            str4.getClass();
            switch (str4) {
                case "video/av01":
                case "video/hevc":
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    break;
            }
            iIntValue2 = 0;
        }
        if (!this.f65889i && !str4.equals("audio/ac4") && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f65884d;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
        if (codecProfileLevelArr == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (str4.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            int i4 = (audioCapabilities != null ? audioCapabilities.getMaxInputChannelCount() : 2) > 18 ? 16 : 8;
            codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{au5.m3051b(1026, i4)} : new MediaCodecInfo.CodecProfileLevel[]{au5.m3051b(257, i4), au5.m3051b(513, i4), au5.m3051b(514, i4), au5.m3051b(1026, i4), au5.m3051b(1028, i4)};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == iIntValue && (codecProfileLevel.level >= iIntValue2 || !z)) {
                if (!"video/hevc".equals(str4) || 2 != iIntValue) {
                    return true;
                }
                String str5 = Build.DEVICE;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        m23543k("codec.profileLevel, " + c0713b.f6402k + ", " + str2);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m23538f(C0713b c0713b) {
        return (Objects.equals(c0713b.f6406o, "audio/flac") && c0713b.f6383I == 22 && Build.VERSION.SDK_INT < 34 && this.f65881a.equals("c2.android.flac.decoder")) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m23539g(Context context, C0713b c0713b) {
        int i;
        int i2;
        String str = c0713b.f6406o;
        String str2 = this.f65882b;
        if ((!str2.equals(str) && !str2.equals(au5.m3052c(c0713b))) || !m23537e(context, c0713b, true) || !m23538f(c0713b)) {
            return false;
        }
        if (this.f65889i) {
            int i3 = c0713b.f6413v;
            if (i3 > 0 && (i2 = c0713b.f6414w) > 0) {
                return m23542j(c0713b.f6417z, i3, i2);
            }
        } else {
            int i4 = c0713b.f6382H;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f65884d;
            if (i4 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m23543k("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i4)) {
                    m23543k("sampleRate.support, " + i4);
                    return false;
                }
            }
            int i5 = c0713b.f6381G;
            if (i5 != -1) {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m23543k("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i = 6;
                    } else {
                        i = "audio/eac3".equals(str2) ? 16 : 30;
                    }
                    StringBuilder sbM17741p = AbstractC3393o1.m17741p(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.f65881a, ", [", " to ");
                    sbM17741p.append(i);
                    sbM17741p.append("]");
                    ss5.m21707d0("MediaCodecInfo", sbM17741p.toString());
                    maxInputChannelCount = i;
                }
                if (maxInputChannelCount < i5) {
                    m23543k("channelCount.support, " + i5);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m23540h() {
        if ("video/x-vnd.on2.vp9".equals(this.f65882b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = this.f65884d.profileLevels;
            if (codecProfileLevelArr == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m23541i(C0713b c0713b) {
        if (this.f65889i) {
            return this.f65885e;
        }
        Pair pairM16616b = m41.m16616b(c0713b);
        return pairM16616b != null && ((Integer) pairM16616b.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX INFO: renamed from: j */
    public final boolean m23542j(double d, int i, int i2) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        char c;
        boolean z;
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f65884d.getVideoCapabilities();
        if (videoCapabilities == null) {
            m23543k("sizeAndRate.vCaps");
            return false;
        }
        Boolean bool = apb.f7350k;
        if ((bool != null && bool.booleanValue()) || (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) == null || supportedPerformancePoints.isEmpty()) {
            c = 0;
        } else {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i3 = 0;
            while (true) {
                if (i3 >= supportedPerformancePoints.size()) {
                    c = 1;
                    break;
                }
                if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                    c = 2;
                    break;
                }
                i3++;
            }
            if (c == 1 && apb.f7350k == null) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 37) {
                    z = false;
                } else {
                    int iM24629a = xob.m24629a(true);
                    if (i4 < 35 ? xob.m24629a(false) != 2 || iM24629a == 1 : iM24629a == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                apb.f7350k = Boolean.valueOf(z);
                if (z) {
                    c = 0;
                }
            }
        }
        if (c != 2) {
            if (c == 1) {
                StringBuilder sbM22994q = ux5.m22994q(i, i2, "sizeAndRate.cover, ", "x", "@");
                sbM22994q.append(d);
                m23543k(sbM22994q.toString());
                return false;
            }
            if (!m23532b(videoCapabilities, i, i2, d)) {
                if (i < i2) {
                    String str = this.f65881a;
                    if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m23532b(videoCapabilities, i2, i, d)) {
                        StringBuilder sbM22994q2 = ux5.m22994q(i, i2, "sizeAndRate.rotated, ", "x", "@");
                        sbM22994q2.append(d);
                        StringBuilder sbM23000w = ux5.m23000w("AssumedSupport [", sbM22994q2.toString(), "] [", str, ", ");
                        sbM23000w.append(this.f65882b);
                        sbM23000w.append("] [");
                        sbM23000w.append(uma.f64080a);
                        sbM23000w.append("]");
                        ss5.m21722t("MediaCodecInfo", sbM23000w.toString());
                        return true;
                    }
                }
                StringBuilder sbM22994q3 = ux5.m22994q(i, i2, "sizeAndRate.support, ", "x", "@");
                sbM22994q3.append(d);
                m23543k(sbM22994q3.toString());
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final void m23543k(String str) {
        StringBuilder sbM17742q = AbstractC3393o1.m17742q("NoSupport [", str, "] [");
        sbM17742q.append(this.f65881a);
        sbM17742q.append(", ");
        sbM17742q.append(this.f65882b);
        sbM17742q.append("] [");
        sbM17742q.append(uma.f64080a);
        sbM17742q.append("]");
        ss5.m21722t("MediaCodecInfo", sbM17742q.toString());
    }

    public final String toString() {
        return this.f65881a;
    }
}
