package p479xa;

import ae.C0062b;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: xa.p */
/* JADX INFO: loaded from: classes.dex */
public final class C10147p {

    /* JADX INFO: renamed from: a */
    public static final ArrayList<a> f51398a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static final Pattern f51399b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: xa.p$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: xa.p$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f51400a;

        /* JADX INFO: renamed from: b */
        public final int f51401b;

        public b(int i10, int i11) {
            this.f51400a = i10;
            this.f51401b = i11;
        }

        /* JADX INFO: renamed from: a */
        public final int m19112a() {
            int i10 = this.f51401b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 == 42) {
                return 16;
            }
            if (i10 != 22) {
                return i10 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m19101a(String str, String str2) {
        b bVarM19106f;
        int iM19112a;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarM19106f = m19106f(str2)) == null || (iM19112a = bVarM19106f.m19112a()) == 0 || iM19112a == 16) ? false : true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m19102b(String str, String str2) {
        String string = null;
        if (str != null) {
            if (str2 != null) {
                String[] strArrM19032Q = C10134c0.m19032Q(str);
                StringBuilder sb2 = new StringBuilder();
                for (String str3 : strArrM19032Q) {
                    if (str2.equals(m19104d(str3))) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(str3);
                    }
                }
                if (sb2.length() > 0) {
                    string = sb2.toString();
                }
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static int m19103c(String str, String str2) {
        b bVarM19106f;
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 != null && (bVarM19106f = m19106f(str2)) != null) {
                    return bVarM19106f.m19112a();
                }
                return 0;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
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

    /* JADX INFO: renamed from: d */
    public static String m19104d(String str) {
        b bVarM19106f;
        String strM19105e = null;
        if (str == null) {
            return null;
        }
        String strM383p2 = C0062b.m383p2(str.trim());
        if (strM383p2.startsWith("avc1") || strM383p2.startsWith("avc3")) {
            return "video/avc";
        }
        if (strM383p2.startsWith("hev1") || strM383p2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (!strM383p2.startsWith("dvav") && !strM383p2.startsWith("dva1") && !strM383p2.startsWith("dvhe")) {
            if (!strM383p2.startsWith("dvh1")) {
                if (strM383p2.startsWith("av01")) {
                    return "video/av01";
                }
                if (!strM383p2.startsWith("vp9") && !strM383p2.startsWith("vp09")) {
                    if (strM383p2.startsWith("vp8") || strM383p2.startsWith("vp08")) {
                        return "video/x-vnd.on2.vp8";
                    }
                    if (strM383p2.startsWith("mp4a")) {
                        if (strM383p2.startsWith("mp4a.") && (bVarM19106f = m19106f(strM383p2)) != null) {
                            strM19105e = m19105e(bVarM19106f.f51400a);
                        }
                        if (strM19105e == null) {
                            strM19105e = "audio/mp4a-latm";
                        }
                        return strM19105e;
                    }
                    if (strM383p2.startsWith("mha1")) {
                        return "audio/mha1";
                    }
                    if (strM383p2.startsWith("mhm1")) {
                        return "audio/mhm1";
                    }
                    if (!strM383p2.startsWith("ac-3") && !strM383p2.startsWith("dac3")) {
                        if (strM383p2.startsWith("ec-3") || strM383p2.startsWith("dec3")) {
                            return "audio/eac3";
                        }
                        if (strM383p2.startsWith("ec+3")) {
                            return "audio/eac3-joc";
                        }
                        if (!strM383p2.startsWith("ac-4") && !strM383p2.startsWith("dac4")) {
                            if (strM383p2.startsWith("dtsc")) {
                                return "audio/vnd.dts";
                            }
                            if (strM383p2.startsWith("dtse")) {
                                return "audio/vnd.dts.hd;profile=lbr";
                            }
                            if (!strM383p2.startsWith("dtsh") && !strM383p2.startsWith("dtsl")) {
                                if (strM383p2.startsWith("dtsx")) {
                                    return "audio/vnd.dts.uhd;profile=p2";
                                }
                                if (strM383p2.startsWith("opus")) {
                                    return "audio/opus";
                                }
                                if (strM383p2.startsWith("vorbis")) {
                                    return "audio/vorbis";
                                }
                                if (strM383p2.startsWith("flac")) {
                                    return "audio/flac";
                                }
                                if (strM383p2.startsWith("stpp")) {
                                    return "application/ttml+xml";
                                }
                                if (strM383p2.startsWith("wvtt")) {
                                    return "text/vtt";
                                }
                                if (strM383p2.contains("cea708")) {
                                    return "application/cea-708";
                                }
                                if (!strM383p2.contains("eia608") && !strM383p2.contains("cea608")) {
                                    ArrayList<a> arrayList = f51398a;
                                    int size = arrayList.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        arrayList.get(i10).getClass();
                                        if (strM383p2.startsWith(null)) {
                                            break;
                                        }
                                    }
                                    return null;
                                }
                                return "application/cea-608";
                            }
                            return "audio/vnd.dts.hd";
                        }
                        return "audio/ac4";
                    }
                    return "audio/ac3";
                }
                return "video/x-vnd.on2.vp9";
            }
        }
        return "video/dolby-vision";
    }

    /* JADX INFO: renamed from: e */
    public static String m19105e(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 != 64) {
            if (i10 == 163) {
                return "video/wvc1";
            }
            if (i10 == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i10 == 165) {
                return "audio/ac3";
            }
            if (i10 == 166) {
                return "audio/eac3";
            }
            switch (i10) {
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
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i10) {
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
        return "audio/mp4a-latm";
    }

    /* JADX INFO: renamed from: f */
    public static b m19106f(String str) {
        Matcher matcher = f51399b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m19107g(String str) {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf(47)) != -1) {
            return str.substring(0, iIndexOf);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static int m19108h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m19109i(str)) {
            return 1;
        }
        if (m19111k(str)) {
            return 2;
        }
        if (m19110j(str)) {
            return 3;
        }
        if ("image".equals(m19107g(str))) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList<a> arrayList = f51398a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).getClass();
                if (str.equals(null)) {
                    return 0;
                }
            }
            return -1;
        }
        return 5;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m19109i(String str) {
        return "audio".equals(m19107g(str));
    }

    /* JADX INFO: renamed from: j */
    public static boolean m19110j(String str) {
        return "text".equals(m19107g(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m19111k(String str) {
        return "video".equals(m19107g(str));
    }
}
