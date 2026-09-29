package p479xa;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0166e;
import android.text.TextUtils;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p003a2.C0009a;
import p166i1.C6153k;
import p482xd.C10170b;

/* JADX INFO: renamed from: xa.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10134c0 {

    /* JADX INFO: renamed from: a */
    public static final int f51354a;

    /* JADX INFO: renamed from: b */
    public static final String f51355b;

    /* JADX INFO: renamed from: c */
    public static final String f51356c;

    /* JADX INFO: renamed from: d */
    public static final String f51357d;

    /* JADX INFO: renamed from: e */
    public static final String f51358e;

    /* JADX INFO: renamed from: f */
    public static final byte[] f51359f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f51360g;

    /* JADX INFO: renamed from: h */
    public static final Pattern f51361h;

    /* JADX INFO: renamed from: i */
    public static HashMap<String, String> f51362i;

    /* JADX INFO: renamed from: j */
    public static final String[] f51363j;

    /* JADX INFO: renamed from: k */
    public static final String[] f51364k;

    /* JADX INFO: renamed from: l */
    public static final int[] f51365l;

    /* JADX INFO: renamed from: m */
    public static final int[] f51366m;

    /* JADX INFO: renamed from: xa.c0$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static Drawable m19060a(Context context, Resources resources, int i10) {
            return resources.getDrawable(i10, context.getTheme());
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f51354a = i10;
        String str = Build.DEVICE;
        f51355b = str;
        String str2 = Build.MANUFACTURER;
        f51356c = str2;
        String str3 = Build.MODEL;
        f51357d = str3;
        f51358e = str + ", " + str3 + ", " + str2 + ", " + i10;
        f51359f = new byte[0];
        f51360g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f51361h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f51363j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f51364k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f51365l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f51366m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, BuildConfig.SDK_TRUNCATE_LENGTH, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* JADX INFO: renamed from: A */
    public static String m19016A(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "unknown";
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                return i10 >= 10000 ? C0166e.m762h("custom (", i10, ")") : "?";
        }
    }

    /* JADX INFO: renamed from: B */
    public static String m19017B(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(" (Linux;Android ");
        return C0009a.m23l(sb2, Build.VERSION.RELEASE, ") ExoPlayerLib/2.18.5");
    }

    /* JADX INFO: renamed from: C */
    public static byte[] m19018C(String str) {
        return str.getBytes(C10170b.f51477c);
    }

    /* JADX INFO: renamed from: D */
    public static int m19019D(Uri uri, String str) {
        int i10;
        boolean z10;
        char c10;
        int i11 = 4;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            if ("rtsp" != scheme) {
                if (4 == scheme.length()) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= 4) {
                            z10 = true;
                        } else {
                            char cCharAt = "rtsp".charAt(i12);
                            char cCharAt2 = scheme.charAt(i12);
                            if (cCharAt != cCharAt2 && ((c10 = (char) ((cCharAt | ' ') - 97)) >= 26 || c10 != ((char) ((cCharAt2 | ' ') - 97)))) {
                            }
                            i12++;
                        }
                    }
                }
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return 3;
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String strM383p2 = C0062b.m383p2(lastPathSegment.substring(iLastIndexOf + 1));
            strM383p2.getClass();
            switch (strM383p2.hashCode()) {
                case 104579:
                    if (strM383p2.equals("ism")) {
                    }
                    break;
                case 108321:
                    if (strM383p2.equals("mpd")) {
                    }
                    break;
                case 3242057:
                    if (strM383p2.equals("isml")) {
                    }
                    break;
                case 3299913:
                    if (!strM383p2.equals("m3u8")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                Method dump skipped, instruction units count: 396
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p479xa.C10134c0.m19019D(android.net.Uri, java.lang.String):int");
        }

        /* JADX INFO: renamed from: E */
        public static boolean m19020E(C10151t c10151t, C10151t c10151t2, Inflater inflater) {
            int i10 = c10151t.f51440c - c10151t.f51439b;
            if (i10 <= 0) {
                return false;
            }
            if (c10151t2.f51438a.length < i10) {
                c10151t2.m19126a(i10 * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            byte[] bArr = c10151t.f51438a;
            int i11 = c10151t.f51439b;
            inflater.setInput(bArr, i11, c10151t.f51440c - i11);
            int iInflate = 0;
            loop0: while (true) {
                while (true) {
                    try {
                        byte[] bArr2 = c10151t2.f51438a;
                        iInflate += inflater.inflate(bArr2, iInflate, bArr2.length - iInflate);
                        if (!inflater.finished()) {
                            if (inflater.needsDictionary() || inflater.needsInput()) {
                                break loop0;
                                break loop0;
                            }
                            byte[] bArr3 = c10151t2.f51438a;
                            if (iInflate == bArr3.length) {
                                c10151t2.m19126a(bArr3.length * 2);
                            }
                        } else {
                            c10151t2.m19123D(iInflate);
                            inflater.reset();
                            return true;
                        }
                    } catch (DataFormatException unused) {
                        inflater.reset();
                        return false;
                    } catch (Throwable th2) {
                        inflater.reset();
                        throw th2;
                    }
                }
            }
            inflater.reset();
            return false;
        }

        /* JADX INFO: renamed from: F */
        public static String m19021F(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: renamed from: G */
        public static boolean m19022G(int i10) {
            return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4;
        }

        /* JADX INFO: renamed from: H */
        public static boolean m19023H(int i10) {
            return i10 == 10 || i10 == 13;
        }

        /* JADX INFO: renamed from: I */
        public static boolean m19024I(Context context) {
            UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
            return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        }

        /* JADX INFO: renamed from: J */
        public static void m19025J(ArrayList arrayList, int i10, int i11, int i12) {
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = i11 - i10;
            while (true) {
                i13--;
                if (i13 < 0) {
                    arrayList.addAll(Math.min(i12, arrayList.size()), arrayDeque);
                    return;
                }
                arrayDeque.addFirst(arrayList.remove(i10 + i13));
            }
        }

        /* JADX INFO: renamed from: K */
        public static long m19026K(long j10) {
            if (j10 != -9223372036854775807L) {
                if (j10 != Long.MIN_VALUE) {
                    j10 *= 1000;
                }
            }
            return j10;
        }

        /* JADX INFO: renamed from: L */
        public static String m19027L(String str) {
            String str2 = str;
            if (str2 == null) {
                return null;
            }
            String strReplace = str2.replace('_', '-');
            if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                str2 = strReplace;
            }
            String strM383p2 = C0062b.m383p2(str2);
            int i10 = 0;
            String str3 = strM383p2.split("-", 2)[0];
            if (f51362i == null) {
                String[] iSOLanguages = Locale.getISOLanguages();
                int length = iSOLanguages.length;
                String[] strArr = f51363j;
                HashMap<String, String> map = new HashMap<>(length + strArr.length);
                for (String str4 : iSOLanguages) {
                    try {
                        String iSO3Language = new Locale(str4).getISO3Language();
                        if (!TextUtils.isEmpty(iSO3Language)) {
                            map.put(iSO3Language, str4);
                        }
                    } catch (MissingResourceException unused) {
                    }
                }
                for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                    map.put(strArr[i11], strArr[i11 + 1]);
                }
                f51362i = map;
            }
            String str5 = f51362i.get(str3);
            if (str5 != null) {
                StringBuilder sbM771r = C0166e.m771r(str5);
                sbM771r.append(strM383p2.substring(str3.length()));
                strM383p2 = sbM771r.toString();
                str3 = str5;
            }
            if (!"no".equals(str3) && !"i".equals(str3) && !"zh".equals(str3)) {
                return strM383p2;
            }
            while (true) {
                String[] strArr2 = f51364k;
                if (i10 >= strArr2.length) {
                    return strM383p2;
                }
                if (strM383p2.startsWith(strArr2[i10])) {
                    return strArr2[i10 + 1] + strM383p2.substring(strArr2[i10].length());
                }
                i10 += 2;
            }
        }

        /* JADX INFO: renamed from: M */
        public static Object[] m19028M(int i10, Object[] objArr) {
            C10129a.m18990b(i10 <= objArr.length);
            return Arrays.copyOf(objArr, i10);
        }

        /* JADX INFO: renamed from: N */
        public static void m19029N(Handler handler, Runnable runnable) {
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }

        /* JADX INFO: renamed from: O */
        public static long m19030O(long j10, long j11, long j12) {
            if (j12 >= j11 && j12 % j11 == 0) {
                return j10 / (j12 / j11);
            }
            if (j12 < j11 && j11 % j12 == 0) {
                return (j11 / j12) * j10;
            }
            return (long) (j10 * (j11 / j12));
        }

        /* JADX INFO: renamed from: P */
        public static void m19031P(long[] jArr, long j10) {
            int i10 = 0;
            if (j10 >= 1000000 && j10 % 1000000 == 0) {
                long j11 = j10 / 1000000;
                while (i10 < jArr.length) {
                    jArr[i10] = jArr[i10] / j11;
                    i10++;
                }
                return;
            }
            if (j10 >= 1000000 || 1000000 % j10 != 0) {
                double d10 = 1000000 / j10;
                while (i10 < jArr.length) {
                    jArr[i10] = (long) (jArr[i10] * d10);
                    i10++;
                }
                return;
            }
            long j12 = 1000000 / j10;
            while (i10 < jArr.length) {
                jArr[i10] = jArr[i10] * j12;
                i10++;
            }
        }

        /* JADX INFO: renamed from: Q */
        public static String[] m19032Q(String str) {
            return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
        }

        /* JADX INFO: renamed from: R */
        public static long m19033R(long j10) {
            if (j10 != -9223372036854775807L) {
                if (j10 != Long.MIN_VALUE) {
                    j10 /= 1000;
                }
            }
            return j10;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m19034a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* JADX INFO: renamed from: b */
        public static int m19035b(long[] jArr, long j10, boolean z10) {
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j10);
            return z10 ? iBinarySearch - 1 : iBinarySearch;
        }

        /* JADX INFO: renamed from: c */
        public static int m19036c(C6153k c6153k, long j10) {
            int i10 = c6153k.f35977a - 1;
            int i11 = 0;
            while (i11 <= i10) {
                int i12 = (i11 + i10) >>> 1;
                if (c6153k.m12660b(i12) < j10) {
                    i11 = i12 + 1;
                } else {
                    i10 = i12 - 1;
                }
            }
            int i13 = i10 + 1;
            if (i13 < c6153k.f35977a && c6153k.m12660b(i13) == j10) {
                return i13;
            }
            if (i10 == -1) {
                return 0;
            }
            return i10;
        }

        /* JADX INFO: renamed from: d */
        public static int m19037d(List list, Long l10, boolean z10) {
            int i10;
            int iBinarySearch = Collections.binarySearch(list, l10);
            if (iBinarySearch < 0) {
                i10 = -(iBinarySearch + 2);
            } else {
                do {
                    iBinarySearch--;
                    if (iBinarySearch < 0) {
                        break;
                    }
                } while (((Comparable) list.get(iBinarySearch)).compareTo(l10) == 0);
                i10 = iBinarySearch + 1;
            }
            return z10 ? Math.max(0, i10) : i10;
        }

        /* JADX INFO: renamed from: e */
        public static int m19038e(int[] iArr, int i10, boolean z10, boolean z11) {
            int i11;
            int iBinarySearch = Arrays.binarySearch(iArr, i10);
            if (iBinarySearch < 0) {
                i11 = -(iBinarySearch + 2);
            } else {
                do {
                    iBinarySearch--;
                    if (iBinarySearch < 0) {
                        break;
                    }
                } while (iArr[iBinarySearch] == i10);
                i11 = z10 ? iBinarySearch + 1 : iBinarySearch;
            }
            return z11 ? Math.max(0, i11) : i11;
        }

        /* JADX INFO: renamed from: f */
        public static int m19039f(long[] jArr, long j10, boolean z10) {
            int iMax;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch < 0) {
                iMax = -(iBinarySearch + 2);
            } else {
                do {
                    iBinarySearch--;
                    if (iBinarySearch < 0) {
                        break;
                    }
                } while (jArr[iBinarySearch] == j10);
                iMax = iBinarySearch + 1;
            }
            if (z10) {
                iMax = Math.max(0, iMax);
            }
            return iMax;
        }

        /* JADX INFO: renamed from: g */
        public static float m19040g(float f3, float f10, float f11) {
            return Math.max(f10, Math.min(f3, f11));
        }

        /* JADX INFO: renamed from: h */
        public static int m19041h(int i10, int i11, int i12) {
            return Math.max(i11, Math.min(i10, i12));
        }

        /* JADX INFO: renamed from: i */
        public static long m19042i(long j10, long j11, long j12) {
            return Math.max(j11, Math.min(j10, j12));
        }

        /* JADX INFO: renamed from: j */
        public static boolean m19043j(Object obj, Object[] objArr) {
            for (Object obj2 : objArr) {
                if (m19034a(obj2, obj)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        public static Handler m19044k(Handler.Callback callback) {
            Looper looperMyLooper = Looper.myLooper();
            C10129a.m18993e(looperMyLooper);
            return new Handler(looperMyLooper, callback);
        }

        /* JADX INFO: renamed from: l */
        public static String m19045l(String str, Object... objArr) {
            return String.format(Locale.US, str, objArr);
        }

        @SuppressLint({"InlinedApi"})
        /* JADX INFO: renamed from: m */
        public static int m19046m(int i10) {
            if (i10 == 12) {
                return 743676;
            }
            switch (i10) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return 252;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return 1276;
                case 8:
                    return 6396;
                default:
                    return 0;
            }
        }

        /* JADX INFO: renamed from: n */
        public static int m19047n(String str, int i10) {
            int i11 = 0;
            for (String str2 : m19032Q(str)) {
                if (i10 == C10147p.m19108h(C10147p.m19104d(str2))) {
                    i11++;
                }
            }
            return i11;
        }

        /* JADX INFO: renamed from: o */
        public static String m19048o(String str, int i10) {
            String[] strArrM19032Q = m19032Q(str);
            if (strArrM19032Q.length == 0) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str2 : strArrM19032Q) {
                if (i10 == C10147p.m19108h(C10147p.m19104d(str2))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str2);
                }
            }
            return sb2.length() > 0 ? sb2.toString() : null;
        }

        /* JADX INFO: renamed from: p */
        public static Drawable m19049p(Context context, Resources resources, int i10) {
            return f51354a >= 21 ? a.m19060a(context, resources, i10) : resources.getDrawable(i10);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x002d  */
        /* JADX INFO: renamed from: q */
        public static int m19050q(int i10) {
            if (i10 != 2 && i10 != 4) {
                if (i10 != 10) {
                    if (i10 != 7) {
                        if (i10 != 8) {
                            switch (i10) {
                                case 15:
                                    break;
                                case 16:
                                case 18:
                                    break;
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                    break;
                                default:
                                    switch (i10) {
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                            return 6002;
                                        default:
                                            return 6006;
                                    }
                            }
                        }
                        return 6003;
                    }
                }
                return 6004;
            }
            return 6005;
        }

        /* JADX INFO: renamed from: r */
        public static int m19051r(String str) {
            String[] strArrSplit;
            int length;
            int i10 = 0;
            if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                return i10;
            }
            String str2 = strArrSplit[length - 1];
            int i11 = (length < 3 || !"neg".equals(strArrSplit[length - 2])) ? i10 : 1;
            try {
                str2.getClass();
                i10 = Integer.parseInt(str2);
                if (i11 != 0) {
                    i10 = -i10;
                }
            } catch (NumberFormatException unused) {
            }
            return i10;
        }

        /* JADX INFO: renamed from: s */
        public static String m19052s(int i10) {
            if (i10 == 0) {
                return "NO";
            }
            if (i10 == 1) {
                return "NO_UNSUPPORTED_TYPE";
            }
            if (i10 == 2) {
                return "NO_UNSUPPORTED_DRM";
            }
            if (i10 == 3) {
                return "NO_EXCEEDS_CAPABILITIES";
            }
            if (i10 == 4) {
                return "YES";
            }
            throw new IllegalStateException();
        }

        /* JADX INFO: renamed from: t */
        public static long m19053t(float f3, long j10) {
            return f3 == 1.0f ? j10 : Math.round(j10 * ((double) f3));
        }

        /* JADX INFO: renamed from: u */
        public static int m19054u(int i10) {
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 2;
            }
            if (i10 != 24) {
                return i10 != 32 ? 0 : 805306368;
            }
            return 536870912;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: v */
        public static int m19055v(int i10, int i11) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return i11;
                }
                if (i10 != 4) {
                    if (i10 != 268435456) {
                        if (i10 == 536870912) {
                            return i11 * 3;
                        }
                        if (i10 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i11 * 4;
            }
            return i11 * 2;
        }

        /* JADX INFO: renamed from: w */
        public static long m19056w(float f3, long j10) {
            return f3 == 1.0f ? j10 : Math.round(j10 / ((double) f3));
        }

        /* JADX INFO: renamed from: x */
        public static int m19057x(int i10) {
            if (i10 == 13) {
                return 1;
            }
            switch (i10) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                case 10:
                    return 5;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return 2;
                default:
                    return 3;
            }
        }

        /* JADX INFO: renamed from: y */
        public static String m19058y(StringBuilder sb2, Formatter formatter, long j10) {
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            String str = j10 < 0 ? "-" : "";
            long jAbs = (Math.abs(j10) + 500) / 1000;
            long j11 = jAbs % 60;
            long j12 = (jAbs / 60) % 60;
            long j13 = jAbs / 3600;
            sb2.setLength(0);
            return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
        }

        /* JADX INFO: renamed from: z */
        public static String m19059z(String str) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                return (String) cls.getMethod("get", String.class).invoke(cls, str);
            } catch (Exception e10) {
                C10145n.m19096d("Util", "Failed to read system property ".concat(str), e10);
                return null;
            }
        }
    }
