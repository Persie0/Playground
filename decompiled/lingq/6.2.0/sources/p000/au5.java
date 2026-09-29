package p000;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Pair;
import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class au5 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f7517a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static void m3050a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            Collections.sort(arrayList, new vb1(new fg2(9), 2));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((vt5) arrayList.get(0)).f65881a)) {
            return;
        }
        arrayList.add((vt5) arrayList.remove(0));
    }

    /* JADX INFO: renamed from: b */
    public static MediaCodecInfo.CodecProfileLevel m3051b(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    /* JADX INFO: renamed from: c */
    public static String m3052c(C0713b c0713b) {
        Pair pairM16616b;
        String str = c0713b.f6406o;
        String str2 = c0713b.f6406o;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (pairM16616b = m41.m16616b(c0713b)) != null) {
            int iIntValue = ((Integer) pairM16616b.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                ga1 ga1Var = c0713b.f6379E;
                if (ga1Var != null && ga1Var.f40446c == 6 && ga1Var.f40445b == 1) {
                    return null;
                }
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static List m3053d(gm5 gm5Var, C0713b c0713b, boolean z, boolean z2) {
        String strM3052c = m3052c(c0713b);
        return strM3052c == null ? ImmutableList.m6289v() : gm5Var.m12752a(strM3052c, z, z2);
    }

    /* JADX INFO: renamed from: e */
    public static String m3054e(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized List m3055f(String str, boolean z, boolean z2) {
        try {
            yt5 yt5Var = new yt5(str, z, z2);
            HashMap map = f7517a;
            List list = (List) map.get(yt5Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListM3056g = m3056g(yt5Var, new ztb(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListM3056g.isEmpty();
            }
            m3050a(str, arrayListM3056g);
            ImmutableList immutableListM6287r = ImmutableList.m6287r(arrayListM3056g);
            map.put(yt5Var, immutableListM6287r);
            return immutableListM6287r;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m3056g(yt5 yt5Var, ztb ztbVar) throws MediaCodecUtil$DecoderQueryException {
        String strM3054e;
        String str;
        ztb ztbVar2 = ztbVar;
        int i = ztbVar2.f72161b;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = yt5Var.f70442a;
            boolean z = yt5Var.f70443b;
            if (((MediaCodecInfo[]) ztbVar2.f72162c) == null) {
                ztbVar2.f72162c = new MediaCodecList(i).getCodecInfos();
            }
            int length = ((MediaCodecInfo[]) ztbVar2.f72162c).length;
            int i2 = 0;
            while (i2 < length) {
                if (((MediaCodecInfo[]) ztbVar2.f72162c) == null) {
                    ztbVar2.f72162c = new MediaCodecList(i).getCodecInfos();
                }
                MediaCodecInfo mediaCodecInfo = ((MediaCodecInfo[]) ztbVar2.f72162c)[i2];
                if (!mediaCodecInfo.isAlias()) {
                    String name = mediaCodecInfo.getName();
                    if (!mediaCodecInfo.isEncoder() && (strM3054e = m3054e(mediaCodecInfo, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(strM3054e);
                            boolean zIsFeatureSupported = capabilitiesForType.isFeatureSupported("tunneled-playback");
                            boolean zIsFeatureRequired = capabilitiesForType.isFeatureRequired("tunneled-playback");
                            boolean z2 = yt5Var.f70444c;
                            if ((z2 || !zIsFeatureRequired) && (!z2 || zIsFeatureSupported)) {
                                boolean zIsFeatureSupported2 = capabilitiesForType.isFeatureSupported("secure-playback");
                                boolean zIsFeatureRequired2 = capabilitiesForType.isFeatureRequired("secure-playback");
                                if ((z || !zIsFeatureRequired2) && (!z || zIsFeatureSupported2)) {
                                    str = name;
                                    try {
                                        boolean zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                        boolean zIsSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
                                        boolean zIsVendor = mediaCodecInfo.isVendor();
                                        if (z == zIsFeatureSupported2) {
                                            arrayList.add(vt5.m23533l(str, str2, strM3054e, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, zIsVendor));
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        ss5.m21723u("MediaCodecUtil", "Failed to query codec " + str + " (" + strM3054e + ")");
                                        throw e;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = name;
                        }
                    }
                }
                i2++;
                ztbVar2 = ztbVar;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new MediaCodecUtil$DecoderQueryException("Failed to query underlying media codecs", e3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static List m3057h(gm5 gm5Var, C0713b c0713b, boolean z, boolean z2) {
        List listM12752a = gm5Var.m12752a(c0713b.f6406o, z, z2);
        List listM3053d = m3053d(gm5Var, c0713b, z, z2);
        c14 c14VarM6284m = ImmutableList.m6284m();
        c14VarM6284m.m3159d(listM12752a);
        c14VarM6284m.m3159d(listM3053d);
        return c14VarM6284m.m4280g();
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m3058i(Context context, List list, C0713b c0713b) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new vb1(new vg1(12, context, c0713b), 2));
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static vt5 m3059j() {
        List listM3055f = m3055f("audio/raw", false, false);
        if (listM3055f.isEmpty()) {
            return null;
        }
        return (vt5) listM3055f.get(0);
    }
}
