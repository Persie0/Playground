package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.C2416m;
import com.kochava.tracker.BuildConfig;
import java.util.List;
import p003a2.C0009a;
import p218k9.C6637g;
import p312p2.C8177i;
import p312p2.C8178j;
import p387t0.C9135b;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2427d {

    /* JADX INFO: renamed from: a */
    public final String f12615a;

    /* JADX INFO: renamed from: b */
    public final String f12616b;

    /* JADX INFO: renamed from: c */
    public final String f12617c;

    /* JADX INFO: renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f12618d;

    /* JADX INFO: renamed from: e */
    public final boolean f12619e;

    /* JADX INFO: renamed from: f */
    public final boolean f12620f;

    /* JADX INFO: renamed from: g */
    public final boolean f12621g;

    /* JADX INFO: renamed from: h */
    public final boolean f12622h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.d$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:18:0x004f  */
        /* JADX INFO: renamed from: a */
        public static int m7202a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            boolean z10;
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                String str = C10134c0.f51355b;
                if (str.equals("sabrina") || str.equals("boreal")) {
                    z10 = true;
                } else {
                    String str2 = C10134c0.f51357d;
                    if (str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    C9135b.m17397p();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM16267e = C8178j.m16267e(i10, i11, (int) d10);
                    for (int i12 = 0; i12 < supportedPerformancePoints.size(); i12++) {
                        if (C8177i.m16248e(supportedPerformancePoints.get(i12)).covers(performancePointM16267e)) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
            return 0;
        }
    }

    public C2427d(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f12615a = str;
        this.f12616b = str2;
        this.f12617c = str3;
        this.f12618d = codecCapabilities;
        this.f12621g = z10;
        this.f12619e = z11;
        this.f12620f = z12;
        this.f12622h = C10147p.m19111k(str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7194a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = C10134c0.f51354a;
        Point point = new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i13 = point.x;
        int i14 = point.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i13, i14, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX INFO: renamed from: h */
    public static C2427d m7195h(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        if (codecCapabilities == null) {
            z14 = false;
        } else {
            int i10 = C10134c0.f51354a;
            if (i10 >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (i10 <= 22) {
                    String str4 = C10134c0.f51357d;
                    if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                if (z16) {
                    z14 = false;
                } else {
                    z14 = true;
                }
            } else {
                z14 = false;
            }
        }
        if (codecCapabilities != null && (C10134c0.f51354a >= 21 && !codecCapabilities.isFeatureSupported("tunneled-playback"))) {
        }
        if (z13) {
            z15 = true;
        } else {
            if (codecCapabilities != null) {
                if (C10134c0.f51354a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")) {
                    z15 = true;
                }
            }
            z15 = false;
        }
        return new C2427d(str, str2, str3, codecCapabilities, z10, z14, z15);
    }

    /* JADX INFO: renamed from: b */
    public final C6637g m7196b(C2416m c2416m, C2416m c2416m2) {
        boolean z10 = false;
        int i10 = !C10134c0.m19034a(c2416m.f12484l, c2416m2.f12484l) ? 8 : 0;
        if (this.f12622h) {
            if (c2416m.f12458O != c2416m2.f12458O) {
                i10 |= 1024;
            }
            if (!this.f12619e && (c2416m.f12455L != c2416m2.f12455L || c2416m.f12456M != c2416m2.f12456M)) {
                i10 |= 512;
            }
            if (!C10134c0.m19034a(c2416m.f12462S, c2416m2.f12462S)) {
                i10 |= 2048;
            }
            if (C10134c0.f51357d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f12615a)) {
                z10 = true;
            }
            if (z10 && !c2416m.m7126b(c2416m2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C6637g(this.f12615a, c2416m, c2416m2, c2416m.m7126b(c2416m2) ? 3 : 2, 0);
            }
        } else {
            if (c2416m.f12463T != c2416m2.f12463T) {
                i10 |= 4096;
            }
            if (c2416m.f12464U != c2416m2.f12464U) {
                i10 |= 8192;
            }
            if (c2416m.f12465V != c2416m2.f12465V) {
                i10 |= 16384;
            }
            String str = this.f12616b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair<Integer, Integer> pairM7164d = MediaCodecUtil.m7164d(c2416m);
                Pair<Integer, Integer> pairM7164d2 = MediaCodecUtil.m7164d(c2416m2);
                if (pairM7164d != null && pairM7164d2 != null) {
                    int iIntValue = ((Integer) pairM7164d.first).intValue();
                    int iIntValue2 = ((Integer) pairM7164d2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C6637g(this.f12615a, c2416m, c2416m2, 3, 0);
                    }
                }
            }
            if (!c2416m.m7126b(c2416m2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C6637g(this.f12615a, c2416m, c2416m2, 1, 0);
            }
        }
        return new C6637g(this.f12615a, c2416m, c2416m2, 0, i10);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0134  */
    /* JADX INFO: renamed from: c */
    public final boolean m7197c(C2416m c2416m, boolean z10) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z11;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair<Integer, Integer> pairM7164d = MediaCodecUtil.m7164d(c2416m);
        if (pairM7164d == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM7164d.first).intValue();
        int iIntValue2 = ((Integer) pairM7164d.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(c2416m.f12484l);
        int i10 = 8;
        String str = this.f12616b;
        if (zEquals) {
            if ("video/avc".equals(str)) {
                iIntValue = 8;
            } else if ("video/hevc".equals(str)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.f12622h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12618d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (C10134c0.f51354a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i10 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i10 = 512;
            } else if (iIntValue3 >= 60000000) {
                i10 = 256;
            } else if (iIntValue3 >= 30000000) {
                i10 = BuildConfig.SDK_TRUNCATE_LENGTH;
            } else if (iIntValue3 >= 18000000) {
                i10 = 64;
            } else if (iIntValue3 >= 12000000) {
                i10 = 32;
            } else if (iIntValue3 >= 7200000) {
                i10 = 16;
            } else if (iIntValue3 < 3600000) {
                i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i10;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                if ("video/hevc".equals(str) && 2 == iIntValue) {
                    String str2 = C10134c0.f51355b;
                    if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                if (!z11) {
                    return true;
                }
            }
        }
        m7201g("codec.profileLevel, " + c2416m.f12481i + ", " + this.f12617c);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:102:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x016b  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0176  */
    /* JADX WARN: Code duplicated, block: B:94:0x0179  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c8  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01b1, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final boolean m7198d(C2416m c2416m) throws MediaCodecUtil.DecoderQueryException {
        int i10;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        int maxInputChannelCount;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        String str = c2416m.f12484l;
        String str2 = this.f12616b;
        boolean z12 = false;
        if (!(str2.equals(str) || str2.equals(MediaCodecUtil.m7162b(c2416m))) || !m7197c(c2416m, true)) {
            return false;
        }
        if (this.f12622h) {
            int i13 = c2416m.f12455L;
            if (i13 <= 0 || (i12 = c2416m.f12456M) <= 0) {
                return true;
            }
            if (C10134c0.f51354a >= 21) {
                return m7200f(i13, i12, c2416m.f12457N);
            }
            if (i13 * i12 <= MediaCodecUtil.m7169i()) {
                z12 = true;
            }
            if (!z12) {
                m7201g("legacyFrameSize, " + i13 + "x" + i12);
            }
            return z12;
        }
        int i14 = C10134c0.f51354a;
        if (i14 >= 21) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12618d;
            int i15 = c2416m.f12464U;
            if (i15 == -1) {
                i10 = c2416m.f12463T;
                if (i10 == -1) {
                    z12 = true;
                } else {
                    if (codecCapabilities == null) {
                        m7201g("channelCount.caps");
                    } else {
                        audioCapabilities = codecCapabilities.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            m7201g("channelCount.aCaps");
                        } else {
                            maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((i14 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                                if ("audio/ac3".equals(str2)) {
                                    i11 = 6;
                                } else if ("audio/eac3".equals(str2)) {
                                    i11 = 16;
                                } else {
                                    i11 = 30;
                                }
                                C10145n.m19099g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f12615a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                                maxInputChannelCount = i11;
                            }
                            if (maxInputChannelCount < i10) {
                                m7201g("channelCount.support, " + i10);
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                z12 = true;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        z12 = true;
                    }
                }
            } else {
                if (codecCapabilities == null) {
                    m7201g("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        m7201g("sampleRate.aCaps");
                    } else {
                        if (audioCapabilities2.isSampleRateSupported(i15)) {
                            z11 = true;
                        } else {
                            m7201g("sampleRate.support, " + i15);
                        }
                        if (z11) {
                            i10 = c2416m.f12463T;
                            if (i10 == -1) {
                                z12 = true;
                            } else {
                                if (codecCapabilities == null) {
                                    m7201g("channelCount.caps");
                                } else {
                                    audioCapabilities = codecCapabilities.getAudioCapabilities();
                                    if (audioCapabilities == null) {
                                        m7201g("channelCount.aCaps");
                                    } else {
                                        maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                                        if (maxInputChannelCount <= 1) {
                                            if ("audio/ac3".equals(str2)) {
                                                i11 = 6;
                                            } else if ("audio/eac3".equals(str2)) {
                                                i11 = 16;
                                            } else {
                                                i11 = 30;
                                            }
                                            C10145n.m19099g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f12615a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                                            maxInputChannelCount = i11;
                                        }
                                        if (maxInputChannelCount < i10) {
                                            m7201g("channelCount.support, " + i10);
                                        } else {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            z12 = true;
                                        }
                                    }
                                }
                                z10 = false;
                                if (z10) {
                                    z12 = true;
                                }
                            }
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    i10 = c2416m.f12463T;
                    if (i10 == -1) {
                        z12 = true;
                    } else {
                        if (codecCapabilities == null) {
                            m7201g("channelCount.caps");
                        } else {
                            audioCapabilities = codecCapabilities.getAudioCapabilities();
                            if (audioCapabilities == null) {
                                m7201g("channelCount.aCaps");
                            } else {
                                maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                                if (maxInputChannelCount <= 1) {
                                    if ("audio/ac3".equals(str2)) {
                                        i11 = 6;
                                    } else if ("audio/eac3".equals(str2)) {
                                        i11 = 16;
                                    } else {
                                        i11 = 30;
                                    }
                                    C10145n.m19099g("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f12615a + ", [" + maxInputChannelCount + " to " + i11 + "]");
                                    maxInputChannelCount = i11;
                                }
                                if (maxInputChannelCount < i10) {
                                    m7201g("channelCount.support, " + i10);
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    z12 = true;
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                            z12 = true;
                        }
                    }
                }
            }
        } else {
            z12 = true;
        }
        return z12;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7199e(C2416m c2416m) {
        if (this.f12622h) {
            return this.f12619e;
        }
        Pair<Integer, Integer> pairM7164d = MediaCodecUtil.m7164d(c2416m);
        return pairM7164d != null && ((Integer) pairM7164d.first).intValue() == 42;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m7200f(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f12618d;
        if (codecCapabilities == null) {
            m7201g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m7201g("sizeAndRate.vCaps");
            return false;
        }
        if (C10134c0.f51354a >= 29) {
            int iM7202a = a.m7202a(videoCapabilities, i10, i11, d10);
            if (iM7202a == 2) {
                return true;
            }
            if (iM7202a == 1) {
                StringBuilder sbM25n = C0009a.m25n("sizeAndRate.cover, ", i10, "x", i11, "@");
                sbM25n.append(d10);
                m7201g(sbM25n.toString());
                return false;
            }
        }
        if (!m7194a(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11) {
                String str = this.f12615a;
                if ((("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(C10134c0.f51355b)) ? false : true) && m7194a(videoCapabilities, i11, i10, d10)) {
                    StringBuilder sbM25n2 = C0009a.m25n("sizeAndRate.rotated, ", i10, "x", i11, "@");
                    sbM25n2.append(d10);
                    StringBuilder sbM855o = C0204c.m855o("AssumedSupport [", sbM25n2.toString(), "] [", str, ", ");
                    sbM855o.append(this.f12616b);
                    sbM855o.append("] [");
                    sbM855o.append(C10134c0.f51358e);
                    sbM855o.append("]");
                    C10145n.m19094b("MediaCodecInfo", sbM855o.toString());
                }
            }
            StringBuilder sbM25n3 = C0009a.m25n("sizeAndRate.support, ", i10, "x", i11, "@");
            sbM25n3.append(d10);
            m7201g(sbM25n3.toString());
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m7201g(String str) {
        StringBuilder sbM854m = C0204c.m854m("NoSupport [", str, "] [");
        sbM854m.append(this.f12615a);
        sbM854m.append(", ");
        sbM854m.append(this.f12616b);
        sbM854m.append("] [");
        sbM854m.append(C10134c0.f51358e);
        sbM854m.append("]");
        C10145n.m19094b("MediaCodecInfo", sbM854m.toString());
    }

    public final String toString() {
        return this.f12615a;
    }
}
