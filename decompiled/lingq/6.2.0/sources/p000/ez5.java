package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class ez5 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f38107a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static final Pattern f38108b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: a */
    public static boolean m11391a(String str, String str2) {
        qg3 qg3VarM11395e;
        int iM19942a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "application/vnd.dvb.ait":
            case "application/x-icy":
            case "application/x-camera-motion":
            case "application/id3":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "application/meta":
            case "audio/ac3":
            case "audio/raw":
            case "application/x-media3-cues":
            case "application/x-itut-t35":
            case "application/x-emsg":
            case "video/apv":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "application/x-scte35":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (qg3VarM11395e = m11395e(str2)) == null || (iM19942a = qg3VarM11395e.m19942a()) == 0 || iM19942a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m11392b(String str, String str2) {
        qg3 qg3VarM11395e;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (qg3VarM11395e = m11395e(str2)) == null) {
                    return 0;
                }
                return qg3VarM11395e.m19942a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m11393c(String str) {
        qg3 qg3VarM11395e;
        String strM11394d = null;
        if (str != null) {
            String strM21625f0 = AbstractC3584sr.m21625f0(str.trim());
            if (strM21625f0.startsWith("avc1") || strM21625f0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strM21625f0.startsWith("hev1") || strM21625f0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strM21625f0.startsWith("vvc1") || strM21625f0.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (strM21625f0.startsWith("dvav") || strM21625f0.startsWith("dva1") || strM21625f0.startsWith("dvhe") || strM21625f0.startsWith("dvh1") || strM21625f0.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (strM21625f0.startsWith("av01")) {
                return "video/av01";
            }
            if (strM21625f0.startsWith("vp9") || strM21625f0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strM21625f0.startsWith("vp8") || strM21625f0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strM21625f0.startsWith("mp4a")) {
                if (strM21625f0.startsWith("mp4a.") && (qg3VarM11395e = m11395e(strM21625f0)) != null) {
                    strM11394d = m11394d(qg3VarM11395e.f57750a);
                }
                return strM11394d == null ? "audio/mp4a-latm" : strM11394d;
            }
            if (strM21625f0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strM21625f0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strM21625f0.startsWith("ac-3") || strM21625f0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strM21625f0.startsWith("ec-3") || strM21625f0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strM21625f0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strM21625f0.startsWith("ac-4") || strM21625f0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strM21625f0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strM21625f0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strM21625f0.startsWith("dtsh") || strM21625f0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strM21625f0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strM21625f0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strM21625f0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strM21625f0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strM21625f0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strM21625f0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strM21625f0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strM21625f0.contains("eia608") || strM21625f0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = f38107a;
            if (arrayList.size() > 0) {
                g9a.m12435l(arrayList.get(0));
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m11394d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: e */
    public static qg3 m11395e(String str) {
        Matcher matcher = f38108b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new qg3(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m11396f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: g */
    public static int m11397g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m11398h(str)) {
            return 1;
        }
        if (m11401k(str)) {
            return 2;
        }
        if (m11400j(str)) {
            return 3;
        }
        if (m11399i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f38107a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        g9a.m12435l(arrayList.get(0));
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11398h(String str) {
        return "audio".equals(m11396f(str));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m11399i(String str) {
        return "image".equals(m11396f(str)) || "application/x-image-uri".equals(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m11400j(String str) {
        return "text".equals(m11396f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11401k(String str) {
        return "video".equals(m11396f(str));
    }

    /* JADX INFO: renamed from: l */
    public static String m11402l(String str) {
        if (str == null) {
            return null;
        }
        String strM21625f0 = AbstractC3584sr.m21625f0(str);
        strM21625f0.getClass();
        switch (strM21625f0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strM21625f0;
        }
    }
}
