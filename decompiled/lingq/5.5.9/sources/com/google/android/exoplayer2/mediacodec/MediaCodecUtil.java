package com.google.android.exoplayer2.mediacodec;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import android.util.Pair;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2416m;
import com.google.common.collect.ImmutableList;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p150h9.C5931p;
import p402u0.C9362e;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;
import p504y9.C10317j;
import p505ya.C10320b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a */
    public static final Pattern f12594a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b */
    public static final HashMap<C2419a, List<C2427d>> f12595b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static int f12596c = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Exception exc) {
            super("Failed to query underlying media codecs", exc);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$a */
    public static final class C2419a {

        /* JADX INFO: renamed from: a */
        public final String f12597a;

        /* JADX INFO: renamed from: b */
        public final boolean f12598b;

        /* JADX INFO: renamed from: c */
        public final boolean f12599c;

        public C2419a(String str, boolean z10, boolean z11) {
            this.f12597a = str;
            this.f12598b = z10;
            this.f12599c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C2419a.class) {
                C2419a c2419a = (C2419a) obj;
                return TextUtils.equals(this.f12597a, c2419a.f12597a) && this.f12598b == c2419a.f12598b && this.f12599c == c2419a.f12599c;
            }
            return false;
        }

        public final int hashCode() {
            return ((C0166e.m758d(this.f12597a, 31, 31) + (this.f12598b ? 1231 : 1237)) * 31) + (this.f12599c ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    public interface InterfaceC2420b {
        /* JADX INFO: renamed from: a */
        MediaCodecInfo mo7170a(int i10);

        /* JADX INFO: renamed from: b */
        boolean mo7171b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: c */
        boolean mo7172c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: d */
        int mo7173d();

        /* JADX INFO: renamed from: e */
        boolean mo7174e();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    public static final class C2421c implements InterfaceC2420b {
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: a */
        public final MediaCodecInfo mo7170a(int i10) {
            return MediaCodecList.getCodecInfoAt(i10);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: b */
        public final boolean mo7171b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: c */
        public final boolean mo7172c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: d */
        public final int mo7173d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: e */
        public final boolean mo7174e() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    public static final class C2422d implements InterfaceC2420b {

        /* JADX INFO: renamed from: a */
        public final int f12600a;

        /* JADX INFO: renamed from: b */
        public MediaCodecInfo[] f12601b;

        public C2422d(boolean z10, boolean z11) {
            this.f12600a = (z10 || z11) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: a */
        public final MediaCodecInfo mo7170a(int i10) {
            if (this.f12601b == null) {
                this.f12601b = new MediaCodecList(this.f12600a).getCodecInfos();
            }
            return this.f12601b[i10];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: b */
        public final boolean mo7171b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: c */
        public final boolean mo7172c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: d */
        public final int mo7173d() {
            if (this.f12601b == null) {
                this.f12601b = new MediaCodecList(this.f12600a).getCodecInfos();
            }
            return this.f12601b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2420b
        /* JADX INFO: renamed from: e */
        public final boolean mo7174e() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$e */
    public interface InterfaceC2423e<T> {
        /* JADX INFO: renamed from: d */
        int mo7175d(T t10);
    }

    /* JADX INFO: renamed from: a */
    public static void m7161a(ArrayList arrayList, String str) {
        if ("audio/raw".equals(str)) {
            if (C10134c0.f51354a < 26 && C10134c0.f51355b.equals("R9") && arrayList.size() == 1 && ((C2427d) arrayList.get(0)).f12615a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C2427d.m7195h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C10317j(0, new C9362e(20)));
        }
        int i10 = C10134c0.f51354a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((C2427d) arrayList.get(0)).f12615a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C10317j(0, new C5931p(14)));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C2427d) arrayList.get(0)).f12615a)) {
            return;
        }
        arrayList.add((C2427d) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static String m7162b(C2416m c2416m) {
        Pair<Integer, Integer> pairM7164d;
        if ("audio/eac3-joc".equals(c2416m.f12484l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c2416m.f12484l) || (pairM7164d = m7164d(c2416m)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM7164d.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m7163c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
        } else {
            if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
                return "audio/x-lg-alac";
            }
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:133:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x021b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0288  */
    /* JADX WARN: Code duplicated, block: B:243:0x0326  */
    /* JADX WARN: Code duplicated, block: B:244:0x032c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0392 A[PHI: r0
      0x0392: PHI (r0v34 int) = (r0v33 int), (r0v39 int), (r0v40 int), (r0v42 int), (r0v43 int), (r0v44 int) binds: [B:254:0x0363, B:256:0x0369, B:258:0x036d, B:260:0x0373, B:262:0x0377, B:264:0x037b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:407:0x0568  */
    /* JADX WARN: Code duplicated, block: B:436:0x0623  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX INFO: renamed from: d */
    public static Pair<Integer, Integer> m7164d(C2416m c2416m) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Integer numValueOf;
        int i19;
        int i20;
        int i21;
        int i22;
        Integer numValueOf2;
        Integer numValueOf3;
        String str = c2416m.f12481i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        boolean zEquals = "video/dolby-vision".equals(c2416m.f12484l);
        int i23 = 512;
        int i24 = 4;
        String str2 = c2416m.f12481i;
        if (zEquals) {
            if (strArrSplit.length < 3) {
                C0141b.m622r("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            } else {
                Matcher matcher = f12594a.matcher(strArrSplit[1]);
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    if (strGroup != null) {
                        switch (strGroup) {
                            case "00":
                                numValueOf2 = 1;
                                break;
                            case "01":
                                numValueOf2 = 2;
                                break;
                            case "02":
                                numValueOf2 = 4;
                                break;
                            case "03":
                                numValueOf2 = 8;
                                break;
                            case "04":
                                numValueOf2 = 16;
                                break;
                            case "05":
                                numValueOf2 = 32;
                                break;
                            case "06":
                                numValueOf2 = 64;
                                break;
                            case "07":
                                numValueOf2 = Integer.valueOf(BuildConfig.SDK_TRUNCATE_LENGTH);
                                break;
                            case "08":
                                numValueOf2 = 256;
                                break;
                            case "09":
                                numValueOf2 = 512;
                                break;
                            default:
                                numValueOf2 = null;
                                break;
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 == null) {
                        C0141b.m622r("Unknown Dolby Vision profile string: ", strGroup, "MediaCodecUtil");
                    } else {
                        String str3 = strArrSplit[2];
                        if (str3 != null) {
                            switch (str3) {
                                case "01":
                                    numValueOf3 = 1;
                                    break;
                                case "02":
                                    numValueOf3 = 2;
                                    break;
                                case "03":
                                    numValueOf3 = 4;
                                    break;
                                case "04":
                                    numValueOf3 = 8;
                                    break;
                                case "05":
                                    numValueOf3 = 16;
                                    break;
                                case "06":
                                    numValueOf3 = 32;
                                    break;
                                case "07":
                                    numValueOf3 = 64;
                                    break;
                                case "08":
                                    numValueOf3 = Integer.valueOf(BuildConfig.SDK_TRUNCATE_LENGTH);
                                    break;
                                case "09":
                                    numValueOf3 = 256;
                                    break;
                                case "10":
                                    numValueOf3 = 512;
                                    break;
                                case "11":
                                    numValueOf3 = 1024;
                                    break;
                                case "12":
                                    numValueOf3 = 2048;
                                    break;
                                case "13":
                                    numValueOf3 = 4096;
                                    break;
                                default:
                                    numValueOf3 = null;
                                    break;
                            }
                        } else {
                            numValueOf3 = null;
                        }
                        if (numValueOf3 != null) {
                            return new Pair<>(numValueOf2, numValueOf3);
                        }
                        C0141b.m622r("Unknown Dolby Vision level string: ", str3, "MediaCodecUtil");
                    }
                } else {
                    C0141b.m622r("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
                }
            }
            return null;
        }
        String str4 = strArrSplit[0];
        str4.getClass();
        switch (str4) {
            case "av01":
                if (strArrSplit.length < 4) {
                    C0141b.m622r("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        int i25 = Integer.parseInt(strArrSplit[1]);
                        int i26 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                        int i27 = Integer.parseInt(strArrSplit[3]);
                        if (i25 != 0) {
                            C0141b.m620p("Unknown AV1 profile: ", i25, "MediaCodecUtil");
                        } else if (i27 == 8 || i27 == 10) {
                            if (i27 == 8) {
                                i10 = 1;
                            } else {
                                C10320b c10320b = c2416m.f12462S;
                                i10 = (c10320b == null || !(c10320b.f51899d != null || (i11 = c10320b.f51898c) == 7 || i11 == 6)) ? 2 : 4096;
                            }
                            switch (i26) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    i12 = -1;
                                    i13 = 1;
                                    break;
                                case 1:
                                    i23 = 2;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 2:
                                    i12 = -1;
                                    i13 = 4;
                                    break;
                                case 3:
                                    i23 = 8;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 4:
                                    i23 = 16;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 5:
                                    i23 = 32;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                    i23 = 64;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i23 = 128;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 8:
                                    i23 = 256;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 9:
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 10:
                                    i23 = 1024;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 11:
                                    i12 = -1;
                                    i13 = 2048;
                                    break;
                                case 12:
                                    i12 = -1;
                                    i13 = 4096;
                                    break;
                                case 13:
                                    i23 = 8192;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 14:
                                    i23 = 16384;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 15:
                                    i23 = 32768;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 16:
                                    i23 = 65536;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 17:
                                    i23 = 131072;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 18:
                                    i23 = 262144;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 19:
                                    i23 = 524288;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 20:
                                    i23 = 1048576;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 21:
                                    i23 = 2097152;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 22:
                                    i23 = 4194304;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                case 23:
                                    i23 = 8388608;
                                    i12 = -1;
                                    i13 = i23;
                                    break;
                                default:
                                    i12 = -1;
                                    i13 = -1;
                                    break;
                            }
                            if (i13 != i12) {
                                return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i13));
                            }
                            C0141b.m620p("Unknown AV1 level: ", i26, "MediaCodecUtil");
                        } else {
                            C0141b.m620p("Unknown AV1 bit depth: ", i27, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused) {
                        C0141b.m622r("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "avc1":
            case "avc2":
                if (strArrSplit.length < 2) {
                    C0141b.m622r("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        if (strArrSplit[1].length() == 6) {
                            i14 = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                            i15 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                        } else if (strArrSplit.length >= 3) {
                            i14 = Integer.parseInt(strArrSplit[1]);
                            i15 = Integer.parseInt(strArrSplit[2]);
                        } else {
                            C10145n.m19099g("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                        }
                        if (i14 == 66) {
                            i16 = 1;
                        } else if (i14 == 77) {
                            i16 = 2;
                        } else if (i14 == 88) {
                            i16 = 4;
                        } else if (i14 == 100) {
                            i16 = 8;
                        } else if (i14 == 110) {
                            i16 = 16;
                        } else if (i14 != 122) {
                            i16 = i14 != 244 ? -1 : 64;
                        } else {
                            i16 = 32;
                        }
                        if (i16 == -1) {
                            C0141b.m620p("Unknown AVC profile: ", i14, "MediaCodecUtil");
                        } else {
                            switch (i15) {
                                case 10:
                                    i23 = 1;
                                    i17 = -1;
                                    break;
                                case 11:
                                    i23 = 4;
                                    i17 = -1;
                                    break;
                                case 12:
                                    i23 = 8;
                                    i17 = -1;
                                    break;
                                case 13:
                                    i23 = 16;
                                    i17 = -1;
                                    break;
                                default:
                                    switch (i15) {
                                        case 20:
                                            i23 = 32;
                                            i17 = -1;
                                            break;
                                        case 21:
                                            i23 = 64;
                                            i17 = -1;
                                            break;
                                        case 22:
                                            i23 = 128;
                                            i17 = -1;
                                            break;
                                        default:
                                            switch (i15) {
                                                case 30:
                                                    i23 = 256;
                                                    i17 = -1;
                                                    break;
                                                case 31:
                                                    i17 = -1;
                                                    break;
                                                case 32:
                                                    i23 = 1024;
                                                    i17 = -1;
                                                    break;
                                                default:
                                                    switch (i15) {
                                                        case 40:
                                                            i17 = -1;
                                                            i23 = 2048;
                                                            break;
                                                        case 41:
                                                            i17 = -1;
                                                            i23 = 4096;
                                                            break;
                                                        case 42:
                                                            i23 = 8192;
                                                            i17 = -1;
                                                            break;
                                                        default:
                                                            switch (i15) {
                                                                case 50:
                                                                    i23 = 16384;
                                                                    i17 = -1;
                                                                    break;
                                                                case 51:
                                                                    i23 = 32768;
                                                                    i17 = -1;
                                                                    break;
                                                                case 52:
                                                                    i23 = 65536;
                                                                    i17 = -1;
                                                                    break;
                                                                default:
                                                                    i17 = -1;
                                                                    i23 = -1;
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            if (i23 != i17) {
                                return new Pair<>(Integer.valueOf(i16), Integer.valueOf(i23));
                            }
                            C0141b.m620p("Unknown AVC level: ", i15, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused2) {
                        C0141b.m622r("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "hev1":
            case "hvc1":
                if (strArrSplit.length < 4) {
                    C0141b.m622r("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                } else {
                    Matcher matcher2 = f12594a.matcher(strArrSplit[1]);
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        if ("1".equals(strGroup2)) {
                            i18 = 1;
                        } else if ("2".equals(strGroup2)) {
                            C10320b c10320b2 = c2416m.f12462S;
                            i18 = (c10320b2 == null || c10320b2.f51898c != 6) ? 2 : 4096;
                        } else {
                            C0141b.m622r("Unknown HEVC profile string: ", strGroup2, "MediaCodecUtil");
                        }
                        String str5 = strArrSplit[3];
                        if (str5 != null) {
                            switch (str5) {
                                case "H30":
                                    numValueOf = 2;
                                    break;
                                case "H60":
                                    numValueOf = 8;
                                    break;
                                case "H63":
                                    numValueOf = 32;
                                    break;
                                case "H90":
                                    numValueOf = Integer.valueOf(BuildConfig.SDK_TRUNCATE_LENGTH);
                                    break;
                                case "H93":
                                    numValueOf = 512;
                                    break;
                                case "L30":
                                    numValueOf = 1;
                                    break;
                                case "L60":
                                    numValueOf = 4;
                                    break;
                                case "L63":
                                    numValueOf = 16;
                                    break;
                                case "L90":
                                    numValueOf = 64;
                                    break;
                                case "L93":
                                    numValueOf = 256;
                                    break;
                                case "H120":
                                    numValueOf = 2048;
                                    break;
                                case "H123":
                                    numValueOf = 8192;
                                    break;
                                case "H150":
                                    numValueOf = 32768;
                                    break;
                                case "H153":
                                    numValueOf = 131072;
                                    break;
                                case "H156":
                                    numValueOf = 524288;
                                    break;
                                case "H180":
                                    numValueOf = 2097152;
                                    break;
                                case "H183":
                                    numValueOf = 8388608;
                                    break;
                                case "H186":
                                    numValueOf = 33554432;
                                    break;
                                case "L120":
                                    numValueOf = 1024;
                                    break;
                                case "L123":
                                    numValueOf = 4096;
                                    break;
                                case "L150":
                                    numValueOf = 16384;
                                    break;
                                case "L153":
                                    numValueOf = 65536;
                                    break;
                                case "L156":
                                    numValueOf = 262144;
                                    break;
                                case "L180":
                                    numValueOf = 1048576;
                                    break;
                                case "L183":
                                    numValueOf = 4194304;
                                    break;
                                case "L186":
                                    numValueOf = 16777216;
                                    break;
                                default:
                                    numValueOf = null;
                                    break;
                            }
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            return new Pair<>(Integer.valueOf(i18), numValueOf);
                        }
                        C0141b.m622r("Unknown HEVC level string: ", str5, "MediaCodecUtil");
                    } else {
                        C0141b.m622r("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "mp4a":
                if (strArrSplit.length != 3) {
                    C0141b.m622r("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(C10147p.m19105e(Integer.parseInt(strArrSplit[1], 16)))) {
                            int i28 = Integer.parseInt(strArrSplit[2]);
                            int i29 = 17;
                            if (i28 != 17) {
                                i29 = 20;
                                if (i28 != 20) {
                                    i29 = 23;
                                    if (i28 != 23) {
                                        i29 = 29;
                                        if (i28 != 29) {
                                            i29 = 39;
                                            if (i28 != 39) {
                                                i29 = 42;
                                                if (i28 != 42) {
                                                    switch (i28) {
                                                        case 1:
                                                            i24 = 1;
                                                            break;
                                                        case 2:
                                                            i24 = 2;
                                                            break;
                                                        case 3:
                                                            i19 = -1;
                                                            i20 = 3;
                                                            break;
                                                        case 4:
                                                            break;
                                                        case 5:
                                                            i19 = -1;
                                                            i20 = 5;
                                                            break;
                                                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                                            i19 = -1;
                                                            i20 = 6;
                                                            break;
                                                        default:
                                                            i19 = -1;
                                                            i20 = -1;
                                                            break;
                                                    }
                                                } else {
                                                    i24 = i29;
                                                }
                                                i19 = -1;
                                                i20 = i24;
                                            } else {
                                                i24 = i29;
                                                i19 = -1;
                                                i20 = i24;
                                            }
                                        } else {
                                            i24 = i29;
                                            i19 = -1;
                                            i20 = i24;
                                        }
                                    } else {
                                        i24 = i29;
                                        i19 = -1;
                                        i20 = i24;
                                    }
                                } else {
                                    i24 = i29;
                                    i19 = -1;
                                    i20 = i24;
                                }
                            } else {
                                i24 = i29;
                                i19 = -1;
                                i20 = i24;
                            }
                            if (i20 != i19) {
                                return new Pair<>(Integer.valueOf(i20), 0);
                            }
                        }
                    } catch (NumberFormatException unused3) {
                        C0141b.m622r("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            case "vp09":
                if (strArrSplit.length < 3) {
                    C0141b.m622r("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                } else {
                    try {
                        int i30 = Integer.parseInt(strArrSplit[1]);
                        int i31 = Integer.parseInt(strArrSplit[2]);
                        if (i30 == 0) {
                            i21 = 1;
                        } else if (i30 == 1) {
                            i21 = 2;
                        } else if (i30 != 2) {
                            i21 = i30 != 3 ? -1 : 8;
                        } else {
                            i21 = 4;
                        }
                        if (i21 == -1) {
                            C0141b.m620p("Unknown VP9 profile: ", i30, "MediaCodecUtil");
                        } else {
                            if (i31 == 10) {
                                i23 = 1;
                            } else if (i31 == 11) {
                                i23 = 2;
                            } else if (i31 == 20) {
                                i23 = 4;
                            } else if (i31 == 21) {
                                i23 = 8;
                            } else if (i31 == 30) {
                                i23 = 16;
                            } else if (i31 == 31) {
                                i23 = 32;
                            } else if (i31 == 40) {
                                i23 = 64;
                            } else if (i31 == 41) {
                                i23 = 128;
                            } else if (i31 != 50) {
                                if (i31 != 51) {
                                    switch (i31) {
                                        case 60:
                                            i22 = -1;
                                            i23 = 2048;
                                            break;
                                        case 61:
                                            i22 = -1;
                                            i23 = 4096;
                                            break;
                                        case 62:
                                            i23 = 8192;
                                            break;
                                        default:
                                            i22 = -1;
                                            i23 = -1;
                                            break;
                                    }
                                }
                                if (i23 == i22) {
                                    return new Pair<>(Integer.valueOf(i21), Integer.valueOf(i23));
                                }
                                C0141b.m620p("Unknown VP9 level: ", i31, "MediaCodecUtil");
                            } else {
                                i23 = 256;
                            }
                            i22 = -1;
                            if (i23 == i22) {
                                return new Pair<>(Integer.valueOf(i21), Integer.valueOf(i23));
                            }
                            C0141b.m620p("Unknown VP9 level: ", i31, "MediaCodecUtil");
                        }
                    } catch (NumberFormatException unused4) {
                        C0141b.m622r("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                    }
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static synchronized List<C2427d> m7165e(String str, boolean z10, boolean z11) throws DecoderQueryException {
        C2419a c2419a = new C2419a(str, z10, z11);
        HashMap<C2419a, List<C2427d>> map = f12595b;
        List<C2427d> list = map.get(c2419a);
        if (list != null) {
            return list;
        }
        int i10 = C10134c0.f51354a;
        ArrayList<C2427d> arrayListM7166f = m7166f(c2419a, i10 >= 21 ? new C2422d(z10, z11) : new C2421c());
        if (z10 && arrayListM7166f.isEmpty() && 21 <= i10 && i10 <= 23) {
            arrayListM7166f = m7166f(c2419a, new C2421c());
            if (!arrayListM7166f.isEmpty()) {
                C10145n.m19099g("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListM7166f.get(0).f12615a);
            }
        }
        m7161a(arrayListM7166f, str);
        ImmutableList immutableListM9060Q = ImmutableList.m9060Q(arrayListM7166f);
        map.put(c2419a, immutableListM9060Q);
        return immutableListM9060Q;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList<C2427d> m7166f(C2419a c2419a, InterfaceC2420b interfaceC2420b) throws DecoderQueryException {
        String strM7163c;
        String str;
        String str2;
        int i10;
        boolean z10;
        boolean z11;
        boolean zIsHardwareAccelerated;
        boolean zIsVendor;
        C2419a c2419a2 = c2419a;
        try {
            ArrayList<C2427d> arrayList = new ArrayList<>();
            String str3 = c2419a2.f12597a;
            int iMo7173d = interfaceC2420b.mo7173d();
            boolean zMo7174e = interfaceC2420b.mo7174e();
            int i11 = 0;
            while (i11 < iMo7173d) {
                MediaCodecInfo mediaCodecInfoMo7170a = interfaceC2420b.mo7170a(i11);
                int i12 = C10134c0.f51354a;
                if (!(i12 >= 29 && mediaCodecInfoMo7170a.isAlias())) {
                    String name = mediaCodecInfoMo7170a.getName();
                    if (m7167g(mediaCodecInfoMo7170a, name, zMo7174e, str3) && (strM7163c = m7163c(mediaCodecInfoMo7170a, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo7170a.getCapabilitiesForType(strM7163c);
                            boolean zMo7171b = interfaceC2420b.mo7171b("tunneled-playback", strM7163c, capabilitiesForType);
                            boolean zMo7172c = interfaceC2420b.mo7172c("tunneled-playback", capabilitiesForType);
                            boolean z12 = c2419a2.f12599c;
                            if ((z12 || !zMo7172c) && (!z12 || zMo7171b)) {
                                boolean zMo7171b2 = interfaceC2420b.mo7171b("secure-playback", strM7163c, capabilitiesForType);
                                boolean zMo7172c2 = interfaceC2420b.mo7172c("secure-playback", capabilitiesForType);
                                boolean z13 = c2419a2.f12598b;
                                if ((z13 || !zMo7172c2) && (!z13 || zMo7171b2)) {
                                    if (i12 >= 29) {
                                        zIsHardwareAccelerated = mediaCodecInfoMo7170a.isHardwareAccelerated();
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                        zIsHardwareAccelerated = !m7168h(mediaCodecInfoMo7170a, str3);
                                    }
                                    boolean zM7168h = m7168h(mediaCodecInfoMo7170a, str3);
                                    if (i12 >= 29) {
                                        zIsVendor = mediaCodecInfoMo7170a.isVendor();
                                    } else {
                                        String strM383p2 = C0062b.m383p2(mediaCodecInfoMo7170a.getName());
                                        if (strM383p2.startsWith("omx.google.") || strM383p2.startsWith("c2.android.") || strM383p2.startsWith("c2.google.")) {
                                            z11 = false;
                                        }
                                        zIsVendor = z11;
                                    }
                                    if (!(zMo7174e && z13 == zMo7171b2) && (zMo7174e || z13)) {
                                        str = strM7163c;
                                        str2 = name;
                                        i10 = i11;
                                        z10 = zMo7174e;
                                        if (!z10 && zMo7171b2) {
                                            try {
                                                arrayList.add(C2427d.m7195h(str2 + ".secure", str3, str, capabilitiesForType, zIsHardwareAccelerated, zM7168h, zIsVendor, true));
                                                return arrayList;
                                            } catch (Exception e10) {
                                                e = e10;
                                                if (C10134c0.f51354a <= 23) {
                                                }
                                                C10145n.m19095c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        }
                                    } else {
                                        str = strM7163c;
                                        i10 = i11;
                                        z10 = zMo7174e;
                                        try {
                                            arrayList.add(C2427d.m7195h(name, str3, strM7163c, capabilitiesForType, zIsHardwareAccelerated, zM7168h, zIsVendor, false));
                                        } catch (Exception e11) {
                                            e = e11;
                                            str2 = name;
                                            if (C10134c0.f51354a <= 23 || arrayList.isEmpty()) {
                                                C10145n.m19095c("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                            C10145n.m19095c("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = strM7163c;
                            str2 = name;
                            i10 = i11;
                            z10 = zMo7174e;
                        }
                    }
                    i11 = i10 + 1;
                    c2419a2 = c2419a;
                    zMo7174e = z10;
                }
                i10 = i11;
                z10 = zMo7174e;
                i11 = i10 + 1;
                c2419a2 = c2419a;
                zMo7174e = z10;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new DecoderQueryException(e13);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7167g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z10 && str.endsWith(".secure"))) {
            return false;
        }
        int i10 = C10134c0.f51354a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C10134c0.f51355b;
            if (!"a70".equals(str3)) {
                if ("Xiaomi".equals(C10134c0.f51356c) && str3.startsWith("HM")) {
                }
            }
            return false;
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C10134c0.f51355b;
            if (!"dlxu".equals(str4)) {
                if (!"protou".equals(str4)) {
                    if (!"ville".equals(str4)) {
                        if (!"villeplus".equals(str4)) {
                            if (!"villec2".equals(str4)) {
                                if (!str4.startsWith("gee")) {
                                    if (!"C6602".equals(str4)) {
                                        if (!"C6603".equals(str4)) {
                                            if (!"C6606".equals(str4)) {
                                                if (!"C6616".equals(str4)) {
                                                    if (!"L36h".equals(str4)) {
                                                        if ("SO-02E".equals(str4)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C10134c0.f51355b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C10134c0.f51356c))) {
            String str6 = C10134c0.f51355b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C10134c0.f51356c)) {
            String str7 = C10134c0.f51355b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && C10134c0.f51355b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7168h(MediaCodecInfo mediaCodecInfo, String str) {
        if (C10134c0.f51354a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (C10147p.m19109i(str)) {
            return true;
        }
        String strM383p2 = C0062b.m383p2(mediaCodecInfo.getName());
        if (strM383p2.startsWith("arc.")) {
            return false;
        }
        if (strM383p2.startsWith("omx.google.") || strM383p2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if (strM383p2.startsWith("omx.sec.") && strM383p2.contains(".sw.")) {
            return true;
        }
        if (strM383p2.equals("omx.qcom.video.decoder.hevcswvdec") || strM383p2.startsWith("c2.android.") || strM383p2.startsWith("c2.google.")) {
            return true;
        }
        return (strM383p2.startsWith("omx.") || strM383p2.startsWith("c2.")) ? false : true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static int m7169i() throws DecoderQueryException {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f12596c == -1) {
            int iMax = 0;
            List<C2427d> listM7165e = m7165e("video/avc", false, false);
            C2427d c2427d = listM7165e.isEmpty() ? null : listM7165e.get(0);
            if (c2427d != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c2427d.f12618d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, C10134c0.f51354a >= 21 ? 345600 : 172800);
            }
            f12596c = iMax;
        }
        return f12596c;
    }
}
