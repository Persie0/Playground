package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.C2529c;
import com.google.common.collect.ImmutableList;
import dm.C5206f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p003a2.C0009a;
import p150h9.C5903b;
import p196ja.AbstractC6440c;
import p411u9.C9485h;
import p454wa.C9883h;
import p479xa.C10129a;
import p479xa.C10132b0;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;

/* JADX INFO: loaded from: classes.dex */
public final class HlsPlaylistParser implements C2529c.a<AbstractC6440c> {

    /* JADX INFO: renamed from: a */
    public final C2491d f13195a;

    /* JADX INFO: renamed from: b */
    public final C2490c f13196b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f13171c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d */
    public static final Pattern f13172d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* JADX INFO: renamed from: e */
    public static final Pattern f13173e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* JADX INFO: renamed from: f */
    public static final Pattern f13174f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* JADX INFO: renamed from: g */
    public static final Pattern f13175g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: h */
    public static final Pattern f13176h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i */
    public static final Pattern f13177i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* JADX INFO: renamed from: j */
    public static final Pattern f13178j = Pattern.compile("CODECS=\"(.+?)\"");

    /* JADX INFO: renamed from: k */
    public static final Pattern f13179k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: l */
    public static final Pattern f13180l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: m */
    public static final Pattern f13181m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: n */
    public static final Pattern f13182n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o */
    public static final Pattern f13183o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p */
    public static final Pattern f13184p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: q */
    public static final Pattern f13185q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: r */
    public static final Pattern f13186r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s */
    public static final Pattern f13187s = m7284b("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: t */
    public static final Pattern f13188t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: u */
    public static final Pattern f13189u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v */
    public static final Pattern f13190v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: w */
    public static final Pattern f13191w = m7284b("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: x */
    public static final Pattern f13192x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: y */
    public static final Pattern f13193y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z */
    public static final Pattern f13194z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: A */
    public static final Pattern f13143A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: B */
    public static final Pattern f13144B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: C */
    public static final Pattern f13145C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: D */
    public static final Pattern f13146D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: E */
    public static final Pattern f13147E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: F */
    public static final Pattern f13148F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: G */
    public static final Pattern f13149G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: H */
    public static final Pattern f13150H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: I */
    public static final Pattern f13151I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: J */
    public static final Pattern f13152J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* JADX INFO: renamed from: K */
    public static final Pattern f13153K = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: L */
    public static final Pattern f13154L = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: M */
    public static final Pattern f13155M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: N */
    public static final Pattern f13156N = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: O */
    public static final Pattern f13157O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* JADX INFO: renamed from: P */
    public static final Pattern f13158P = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: Q */
    public static final Pattern f13159Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* JADX INFO: renamed from: R */
    public static final Pattern f13160R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* JADX INFO: renamed from: S */
    public static final Pattern f13161S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: T */
    public static final Pattern f13162T = m7284b("AUTOSELECT");

    /* JADX INFO: renamed from: U */
    public static final Pattern f13163U = m7284b("DEFAULT");

    /* JADX INFO: renamed from: V */
    public static final Pattern f13164V = m7284b("FORCED");

    /* JADX INFO: renamed from: W */
    public static final Pattern f13165W = m7284b("INDEPENDENT");

    /* JADX INFO: renamed from: X */
    public static final Pattern f13166X = m7284b("GAP");

    /* JADX INFO: renamed from: Y */
    public static final Pattern f13167Y = m7284b("PRECISE");

    /* JADX INFO: renamed from: Z */
    public static final Pattern f13168Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: a0 */
    public static final Pattern f13169a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: b0 */
    public static final Pattern f13170b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$a */
    public static class C2485a {

        /* JADX INFO: renamed from: a */
        public final BufferedReader f13197a;

        /* JADX INFO: renamed from: b */
        public final Queue<String> f13198b;

        /* JADX INFO: renamed from: c */
        public String f13199c;

        public C2485a(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.f13198b = arrayDeque;
            this.f13197a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        /* JADX INFO: renamed from: a */
        public final boolean m7297a() throws IOException {
            String strTrim;
            if (this.f13199c != null) {
                return true;
            }
            Queue<String> queue = this.f13198b;
            if (!queue.isEmpty()) {
                String strPoll = queue.poll();
                strPoll.getClass();
                this.f13199c = strPoll;
                return true;
            }
            do {
                String line = this.f13197a.readLine();
                this.f13199c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f13199c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final String m7298b() throws IOException {
            if (!m7297a()) {
                throw new NoSuchElementException();
            }
            String str = this.f13199c;
            this.f13199c = null;
            return str;
        }
    }

    public HlsPlaylistParser(C2491d c2491d, C2490c c2490c) {
        this.f13195a = c2491d;
        this.f13196b = c2490c;
    }

    /* JADX INFO: renamed from: b */
    public static Pattern m7284b(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    /* JADX INFO: renamed from: c */
    public static DrmInitData m7285c(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i10 = 0; i10 < schemeDataArr.length; i10++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i10];
            schemeDataArr2[i10] = new DrmInitData.SchemeData(schemeData.f12191b, schemeData.f12192c, schemeData.f12193d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    /* JADX INFO: renamed from: d */
    public static DrmInitData.SchemeData m7286d(String str, String str2, HashMap map) throws ParserException {
        String strM7293k = m7293k(str, f13152J, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f13153K;
        if (zEquals) {
            String strM7294l = m7294l(str, pattern, map);
            return new DrmInitData.SchemeData(C5903b.f35261d, null, "video/mp4", Base64.decode(strM7294l.substring(strM7294l.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(C5903b.f35261d, null, "hls", C10134c0.m19018C(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM7293k)) {
            return null;
        }
        String strM7294l2 = m7294l(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM7294l2.substring(strM7294l2.indexOf(44)), 0);
        UUID uuid = C5903b.f35262e;
        return new DrmInitData.SchemeData(uuid, null, "video/mp4", C9485h.m17927a(uuid, bArrDecode));
    }

    /* JADX INFO: renamed from: e */
    public static int m7287e(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(m7294l(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C2490c m7288f(C2491d c2491d, C2490c c2490c, C2485a c2485a, String str) throws IOException {
        HashMap map;
        ArrayList arrayList;
        int i10;
        String strM7293k;
        int i11;
        int i12;
        long j10;
        long j11;
        HashMap map2;
        HashMap map3;
        DrmInitData drmInitData;
        boolean z10 = c2491d.f36991c;
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C2490c.e eVar = new C2490c.e(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        c2490c = c2490c;
        c2491d = c2491d;
        boolean z11 = z10;
        C2490c.e eVar2 = eVar;
        String strM7293k2 = "";
        long jM19026K = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long jLongValue = 0;
        long j17 = 0;
        long j18 = -1;
        int i13 = 0;
        long j19 = -9223372036854775807L;
        boolean zM7290h = false;
        boolean z12 = false;
        int i14 = 0;
        int iM7287e = 1;
        long jM7287e = -9223372036854775807L;
        long j20 = -9223372036854775807L;
        boolean z13 = false;
        DrmInitData drmInitDataM7285c = null;
        DrmInitData drmInitData2 = null;
        boolean z14 = false;
        String str2 = null;
        String strM7294l = null;
        String str3 = null;
        int i15 = 0;
        boolean z15 = false;
        C2490c.c cVar = null;
        ArrayList arrayList6 = arrayList3;
        C2490c.a aVar = null;
        while (c2485a.m7297a()) {
            String strM7298b = c2485a.m7298b();
            if (strM7298b.startsWith("#EXT")) {
                arrayList5.add(strM7298b);
            }
            if (strM7298b.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM7294l2 = m7294l(strM7298b, f13185q, map4);
                if ("VOD".equals(strM7294l2)) {
                    i13 = 1;
                } else if ("EVENT".equals(strM7294l2)) {
                    i13 = 2;
                }
            } else if (strM7298b.equals("#EXT-X-I-FRAMES-ONLY")) {
                z15 = true;
            } else if (strM7298b.startsWith("#EXT-X-START")) {
                double d10 = Double.parseDouble(m7294l(strM7298b, f13145C, Collections.emptyMap()));
                zM7290h = m7290h(strM7298b, f13167Y);
                j19 = (long) (d10 * 1000000.0d);
                i13 = i13;
            } else {
                int i16 = i13;
                if (strM7298b.startsWith("#EXT-X-SERVER-CONTROL")) {
                    double dM7291i = m7291i(strM7298b, f13186r);
                    long j21 = dM7291i == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM7291i * 1000000.0d);
                    boolean zM7290h2 = m7290h(strM7298b, f13187s);
                    double dM7291i2 = m7291i(strM7298b, f13189u);
                    long j22 = dM7291i2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM7291i2 * 1000000.0d);
                    double dM7291i3 = m7291i(strM7298b, f13190v);
                    eVar2 = new C2490c.e(j21, zM7290h2, j22, dM7291i3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM7291i3 * 1000000.0d), m7290h(strM7298b, f13191w));
                } else if (strM7298b.startsWith("#EXT-X-PART-INF")) {
                    j20 = (long) (Double.parseDouble(m7294l(strM7298b, f13183o, Collections.emptyMap())) * 1000000.0d);
                } else {
                    boolean zStartsWith = strM7298b.startsWith("#EXT-X-MAP");
                    Pattern pattern = f13147E;
                    arrayList = arrayList5;
                    Pattern pattern2 = f13153K;
                    if (zStartsWith) {
                        String strM7294l3 = m7294l(strM7298b, pattern2, map4);
                        String strM7293k3 = m7293k(strM7298b, pattern, null, map4);
                        if (strM7293k3 != null) {
                            int i17 = C10134c0.f51354a;
                            String[] strArrSplit = strM7293k3.split("@", -1);
                            j18 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j13 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        if (j18 == -1) {
                            j13 = 0;
                        }
                        if (strM7294l != null && str2 == null) {
                            throw ParserException.m6771b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                        }
                        cVar = new C2490c.c(j13, j18, strM7294l3, strM7294l, str2);
                        if (j18 != -1) {
                            j13 += j18;
                        }
                        i13 = i16;
                        j18 = -1;
                        arrayList5 = arrayList;
                    } else {
                        map = map5;
                        C2490c.a aVar2 = aVar;
                        if (strM7298b.startsWith("#EXT-X-TARGETDURATION")) {
                            jM7287e = ((long) m7287e(strM7298b, f13181m)) * 1000000;
                        } else if (strM7298b.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                            j12 = Long.parseLong(m7294l(strM7298b, f13192x, Collections.emptyMap()));
                            j14 = j12;
                            aVar = aVar2;
                            c2491d = c2491d;
                            str3 = str3;
                            arrayList5 = arrayList;
                            map5 = map;
                            i13 = i16;
                        } else if (strM7298b.startsWith("#EXT-X-VERSION")) {
                            iM7287e = m7287e(strM7298b, f13184p);
                        } else {
                            if (strM7298b.startsWith("#EXT-X-DEFINE")) {
                                String strM7293k4 = m7293k(strM7298b, f13169a0, null, map4);
                                if (strM7293k4 != null) {
                                    String str4 = c2491d.f13278l.get(strM7293k4);
                                    if (str4 != null) {
                                        map4.put(strM7293k4, str4);
                                    }
                                } else {
                                    map4.put(m7294l(strM7298b, f13158P, map4), m7294l(strM7298b, f13168Z, map4));
                                }
                                i16 = i16;
                                str3 = str3;
                            } else if (strM7298b.startsWith("#EXTINF")) {
                                jLongValue = new BigDecimal(m7294l(strM7298b, f13193y, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                strM7293k2 = m7293k(strM7298b, f13194z, "", map4);
                            } else {
                                if (strM7298b.startsWith("#EXT-X-SKIP")) {
                                    int iM7287e2 = m7287e(strM7298b, f13188t);
                                    C10129a.m18992d(c2490c != null && arrayList2.isEmpty());
                                    int i18 = C10134c0.f51354a;
                                    int i19 = (int) (j12 - c2490c.f13234k);
                                    int i20 = iM7287e2 + i19;
                                    if (i19 < 0 || i20 > c2490c.f13241r.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    while (i19 < i20) {
                                        C2490c.c cVar2 = (C2490c.c) c2490c.f13241r.get(i19);
                                        if (j12 != c2490c.f13234k) {
                                            int i21 = (c2490c.f13233j - i14) + cVar2.f13256d;
                                            ArrayList arrayList7 = new ArrayList();
                                            long j23 = j16;
                                            int i22 = 0;
                                            while (true) {
                                                ImmutableList immutableList = cVar2.f13251H;
                                                if (i22 >= immutableList.size()) {
                                                    break;
                                                }
                                                C2490c.a aVar3 = (C2490c.a) immutableList.get(i22);
                                                arrayList7.add(new C2490c.a(aVar3.f13253a, aVar3.f13254b, aVar3.f13255c, i21, j23, aVar3.f13258f, aVar3.f13259g, aVar3.f13260h, aVar3.f13261i, aVar3.f13262j, aVar3.f13263k, aVar3.f13247l, aVar3.f13246H));
                                                j23 += aVar3.f13255c;
                                                i22++;
                                                i16 = i16;
                                            }
                                            i10 = i16;
                                            cVar2 = new C2490c.c(cVar2.f13253a, cVar2.f13254b, cVar2.f13252l, cVar2.f13255c, i21, j16, cVar2.f13258f, cVar2.f13259g, cVar2.f13260h, cVar2.f13261i, cVar2.f13262j, cVar2.f13263k, arrayList7);
                                        } else {
                                            i10 = i16;
                                        }
                                        arrayList2.add(cVar2);
                                        j16 += cVar2.f13255c;
                                        long j24 = cVar2.f13262j;
                                        if (j24 != -1) {
                                            j13 = cVar2.f13261i + j24;
                                        }
                                        String str5 = cVar2.f13260h;
                                        if (str5 == null || !str5.equals(Long.toHexString(j14))) {
                                            str2 = str5;
                                        }
                                        j14++;
                                        i19++;
                                        int i23 = cVar2.f13256d;
                                        C2490c.c cVar3 = cVar2.f13254b;
                                        DrmInitData drmInitData3 = cVar2.f13258f;
                                        c2490c = c2490c;
                                        i15 = i23;
                                        cVar = cVar3;
                                        strM7294l = cVar2.f13259g;
                                        drmInitData2 = drmInitData3;
                                        j15 = j16;
                                        i16 = i10;
                                    }
                                    i16 = i16;
                                    str3 = str3;
                                } else {
                                    i16 = i16;
                                    if (strM7298b.startsWith("#EXT-X-KEY")) {
                                        String strM7294l4 = m7294l(strM7298b, f13150H, map4);
                                        String strM7293k5 = m7293k(strM7298b, f13151I, "identity", map4);
                                        if ("NONE".equals(strM7294l4)) {
                                            treeMap.clear();
                                            strM7293k = null;
                                        } else {
                                            strM7293k = m7293k(strM7298b, f13154L, null, map4);
                                            if ("identity".equals(strM7293k5)) {
                                                if ("AES-128".equals(strM7294l4)) {
                                                    strM7294l = m7294l(strM7298b, pattern2, map4);
                                                    str2 = strM7293k;
                                                }
                                                c2491d = c2491d;
                                            } else {
                                                String str6 = str3;
                                                str3 = str6 == null ? ("SAMPLE-AES-CENC".equals(strM7294l4) || "SAMPLE-AES-CTR".equals(strM7294l4)) ? "cenc" : "cbcs" : str6;
                                                DrmInitData.SchemeData schemeDataM7286d = m7286d(strM7298b, strM7293k5, map4);
                                                if (schemeDataM7286d != null) {
                                                    treeMap.put(strM7293k5, schemeDataM7286d);
                                                }
                                                strM7294l = null;
                                                c2491d = c2491d;
                                            }
                                            str2 = strM7293k;
                                            strM7294l = null;
                                            c2491d = c2491d;
                                        }
                                        str2 = strM7293k;
                                        drmInitData2 = null;
                                        strM7294l = null;
                                        c2491d = c2491d;
                                    } else {
                                        str3 = str3;
                                        if (strM7298b.startsWith("#EXT-X-BYTERANGE")) {
                                            String strM7294l5 = m7294l(strM7298b, f13146D, map4);
                                            int i24 = C10134c0.f51354a;
                                            String[] strArrSplit2 = strM7294l5.split("@", -1);
                                            j18 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j13 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else {
                                            if (strM7298b.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                i14 = Integer.parseInt(strM7298b.substring(strM7298b.indexOf(58) + 1));
                                                c2491d = c2491d;
                                                c2490c = c2490c;
                                                aVar = aVar2;
                                                z12 = true;
                                            } else if (strM7298b.equals("#EXT-X-DISCONTINUITY")) {
                                                i15++;
                                            } else if (strM7298b.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                if (jM19026K == 0) {
                                                    String strSubstring = strM7298b.substring(strM7298b.indexOf(58) + 1);
                                                    Matcher matcher = C10134c0.f51360g.matcher(strSubstring);
                                                    if (!matcher.matches()) {
                                                        throw ParserException.m6770a("Invalid date/time format: " + strSubstring, null);
                                                    }
                                                    if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                                        i11 = 0;
                                                    } else {
                                                        i11 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                                                        if ("-".equals(matcher.group(11))) {
                                                            i11 *= -1;
                                                        }
                                                    }
                                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                                    gregorianCalendar.clear();
                                                    gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                                    if (!TextUtils.isEmpty(matcher.group(8))) {
                                                        gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                                    }
                                                    long timeInMillis = gregorianCalendar.getTimeInMillis();
                                                    if (i11 != 0) {
                                                        timeInMillis -= ((long) i11) * 60000;
                                                    }
                                                    jM19026K = C10134c0.m19026K(timeInMillis) - j16;
                                                }
                                            } else if (strM7298b.equals("#EXT-X-GAP")) {
                                                c2491d = c2491d;
                                                c2490c = c2490c;
                                                aVar = aVar2;
                                                z14 = true;
                                            } else if (strM7298b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                c2491d = c2491d;
                                                c2490c = c2490c;
                                                aVar = aVar2;
                                                z11 = true;
                                            } else if (strM7298b.equals("#EXT-X-ENDLIST")) {
                                                c2491d = c2491d;
                                                c2490c = c2490c;
                                                aVar = aVar2;
                                                z13 = true;
                                            } else if (strM7298b.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long jM7292j = m7292j(strM7298b, f13143A);
                                                Matcher matcher2 = f13144B.matcher(strM7298b);
                                                if (matcher2.find()) {
                                                    String strGroup = matcher2.group(1);
                                                    strGroup.getClass();
                                                    i12 = Integer.parseInt(strGroup);
                                                } else {
                                                    i12 = -1;
                                                }
                                                arrayList4.add(new C2490c.b(Uri.parse(C10132b0.m19010c(str, m7294l(strM7298b, pattern2, map4))), jM7292j, i12));
                                            } else if (strM7298b.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (aVar2 == null && "PART".equals(m7294l(strM7298b, f13156N, map4))) {
                                                    String strM7294l6 = m7294l(strM7298b, pattern2, map4);
                                                    long jM7292j2 = m7292j(strM7298b, f13148F);
                                                    long jM7292j3 = m7292j(strM7298b, f13149G);
                                                    String hexString = strM7294l == null ? null : str2 != null ? str2 : Long.toHexString(j14);
                                                    if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData4 = new DrmInitData(str3, true, schemeDataArr);
                                                        if (drmInitDataM7285c == null) {
                                                            drmInitDataM7285c = m7285c(str3, schemeDataArr);
                                                        }
                                                        drmInitData2 = drmInitData4;
                                                    }
                                                    aVar = (jM7292j2 == -1 || jM7292j3 != -1) ? new C2490c.a(strM7294l6, cVar, 0L, i15, j15, drmInitData2, strM7294l, hexString, jM7292j2 != -1 ? jM7292j2 : 0L, jM7292j3, false, false, true) : aVar2;
                                                    c2491d = c2491d;
                                                    c2490c = c2490c;
                                                }
                                            } else if (strM7298b.startsWith("#EXT-X-PART")) {
                                                String hexString2 = strM7294l == null ? null : str2 != null ? str2 : Long.toHexString(j14);
                                                String strM7294l7 = m7294l(strM7298b, pattern2, map4);
                                                long j25 = (long) (Double.parseDouble(m7294l(strM7298b, f13182n, Collections.emptyMap())) * 1000000.0d);
                                                boolean zM7290h3 = m7290h(strM7298b, f13165W) | (z11 && arrayList6.isEmpty());
                                                boolean zM7290h4 = m7290h(strM7298b, f13166X);
                                                String strM7293k6 = m7293k(strM7298b, pattern, null, map4);
                                                if (strM7293k6 != null) {
                                                    int i25 = C10134c0.f51354a;
                                                    String[] strArrSplit3 = strM7293k6.split("@", -1);
                                                    j10 = Long.parseLong(strArrSplit3[0]);
                                                    if (strArrSplit3.length > 1) {
                                                        j17 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    j10 = -1;
                                                }
                                                if (j10 == -1) {
                                                    j17 = 0;
                                                }
                                                if (drmInitData2 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData5 = new DrmInitData(str3, true, schemeDataArr2);
                                                    if (drmInitDataM7285c == null) {
                                                        drmInitDataM7285c = m7285c(str3, schemeDataArr2);
                                                    }
                                                    drmInitData2 = drmInitData5;
                                                }
                                                arrayList6.add(new C2490c.a(strM7294l7, cVar, j25, i15, j15, drmInitData2, strM7294l, hexString2, j17, j10, zM7290h4, zM7290h3, false));
                                                j15 += j25;
                                                if (j10 != -1) {
                                                    j17 += j10;
                                                }
                                                c2491d = c2491d;
                                                str3 = str3;
                                            } else if (!strM7298b.startsWith("#")) {
                                                String hexString3 = strM7294l == null ? null : str2 != null ? str2 : Long.toHexString(j14);
                                                long j26 = j14 + 1;
                                                String strM7295m = m7295m(strM7298b, map4);
                                                C2490c.c cVar4 = (C2490c.c) map.get(strM7295m);
                                                if (j18 == -1) {
                                                    j11 = 0;
                                                } else {
                                                    if (z15 && cVar == null && cVar4 == null) {
                                                        cVar4 = new C2490c.c(0L, j13, strM7295m, null, null);
                                                        map.put(strM7295m, cVar4);
                                                    }
                                                    j11 = j13;
                                                }
                                                if (drmInitData2 != null || treeMap.isEmpty()) {
                                                    map2 = map4;
                                                    map3 = map;
                                                    drmInitData = drmInitData2;
                                                } else {
                                                    map2 = map4;
                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    drmInitData = new DrmInitData(str3, true, schemeDataArr3);
                                                    if (drmInitDataM7285c == null) {
                                                        map3 = map;
                                                        drmInitDataM7285c = m7285c(str3, schemeDataArr3);
                                                    }
                                                }
                                                map3 = map;
                                                arrayList2.add(new C2490c.c(strM7295m, cVar != null ? cVar : cVar4, strM7293k2, jLongValue, i15, j16, drmInitData, strM7294l, hexString3, j11, j18, z14, arrayList6));
                                                j15 = j16 + jLongValue;
                                                arrayList6 = new ArrayList();
                                                if (j18 != -1) {
                                                    j11 += j18;
                                                }
                                                j13 = j11;
                                                c2491d = c2491d;
                                                str3 = str3;
                                                strM7293k2 = "";
                                                drmInitData2 = drmInitData;
                                                j14 = j26;
                                                jLongValue = 0;
                                                j18 = -1;
                                                j16 = j15;
                                                map4 = map2;
                                                arrayList5 = arrayList;
                                                map5 = map3;
                                                aVar = aVar2;
                                                i13 = i16;
                                                z14 = false;
                                                c2490c = c2490c;
                                            }
                                            c2491d = c2491d;
                                            str3 = str3;
                                            arrayList5 = arrayList;
                                            map5 = map;
                                            i13 = i16;
                                        }
                                    }
                                    arrayList5 = arrayList;
                                    map5 = map;
                                    aVar = aVar2;
                                    i13 = i16;
                                }
                                aVar = aVar2;
                                c2491d = c2491d;
                                str3 = str3;
                                arrayList5 = arrayList;
                                map5 = map;
                                i13 = i16;
                            }
                            c2491d = c2491d;
                            str3 = str3;
                            map4 = map4;
                            arrayList5 = arrayList;
                            map5 = map;
                            aVar = aVar2;
                            i13 = i16;
                        }
                        aVar = aVar2;
                        c2491d = c2491d;
                        str3 = str3;
                        arrayList5 = arrayList;
                        map5 = map;
                        i13 = i16;
                    }
                }
                map = map5;
                arrayList = arrayList5;
                c2491d = c2491d;
                i16 = i16;
                c2491d = c2491d;
                str3 = str3;
                arrayList5 = arrayList;
                map5 = map;
                i13 = i16;
            }
        }
        int i26 = i13;
        C2490c.a aVar4 = aVar;
        ArrayList arrayList8 = arrayList5;
        HashMap map6 = new HashMap();
        for (int i27 = 0; i27 < arrayList4.size(); i27++) {
            C2490c.b bVar = (C2490c.b) arrayList4.get(i27);
            long size = bVar.f13249b;
            if (size == -1) {
                size = (j12 + ((long) arrayList2.size())) - (arrayList6.isEmpty() ? 1L : 0L);
            }
            int size2 = bVar.f13250c;
            if (size2 == -1 && j20 != -9223372036854775807L) {
                size2 = (arrayList6.isEmpty() ? ((C2490c.c) C5206f.m11002X0(arrayList2)).f13251H : arrayList6).size() - 1;
            }
            Uri uri = bVar.f13248a;
            map6.put(uri, new C2490c.b(uri, size, size2));
        }
        if (aVar4 != null) {
            arrayList6.add(aVar4);
        }
        return new C2490c(i26, str, arrayList8, j19, zM7290h, jM19026K, z12, i14, j12, iM7287e, jM7287e, j20, z11, z13, jM19026K != 0, drmInitDataM7285c, arrayList2, arrayList6, eVar2, map6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:128:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:147:0x040f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX INFO: renamed from: g */
    public static C2491d m7289g(C2485a c2485a, String str) throws IOException {
        ?? r10;
        String str2;
        int i10;
        byte b10;
        C2416m c2416m;
        ArrayList arrayList;
        ArrayList arrayList2;
        C2491d.b bVar;
        String strM19104d;
        ArrayList arrayList3;
        C2416m c2416m2;
        C2416m c2416m3;
        int i11;
        String str3;
        C2491d.b bVar2;
        String strM19104d2;
        C2491d.b bVar3;
        int i12;
        ArrayList arrayList4;
        int i13;
        int i14;
        Uri uriM19011d;
        HashMap map;
        String str4 = str;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            boolean zM7297a = c2485a.m7297a();
            Pattern pattern = f13153K;
            String str5 = "application/x-mpegURL";
            boolean z12 = z10;
            Pattern pattern2 = f13158P;
            if (!zM7297a) {
                ArrayList arrayList13 = arrayList10;
                ArrayList arrayList14 = arrayList6;
                ArrayList arrayList15 = arrayList7;
                ArrayList arrayList16 = arrayList8;
                ArrayList arrayList17 = arrayList9;
                ArrayList arrayList18 = arrayList12;
                ArrayList arrayList19 = arrayList11;
                HashMap map4 = map2;
                ArrayList arrayList20 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i15 = 0;
                while (i15 < arrayList5.size()) {
                    C2491d.b bVar4 = (C2491d.b) arrayList5.get(i15);
                    if (hashSet.add(bVar4.f13283a)) {
                        C2416m c2416m4 = bVar4.f13284b;
                        C10129a.m18992d(c2416m4.f12482j == null);
                        ArrayList arrayList21 = (ArrayList) map4.get(bVar4.f13283a);
                        arrayList21.getClass();
                        Metadata metadata = new Metadata(new HlsTrackMetadataEntry(null, null, arrayList21));
                        C2416m.a aVar = new C2416m.a(c2416m4);
                        aVar.f12499i = metadata;
                        arrayList20.add(new C2491d.b(bVar4.f13283a, new C2416m(aVar), bVar4.f13285c, bVar4.f13286d, bVar4.f13287e, bVar4.f13288f));
                    }
                    i15++;
                    hashSet = hashSet;
                    map4 = map4;
                }
                int i16 = 0;
                ArrayList arrayList22 = null;
                C2416m c2416m5 = null;
                while (i16 < arrayList13.size()) {
                    String str6 = (String) arrayList13.get(i16);
                    String strM7294l = m7294l(str6, f13159Q, map3);
                    String strM7294l2 = m7294l(str6, pattern2, map3);
                    C2416m.a aVar2 = new C2416m.a();
                    aVar2.f12491a = C0009a.m21i(strM7294l, ":", strM7294l2);
                    aVar2.f12492b = strM7294l2;
                    aVar2.f12500j = str5;
                    boolean zM7290h = m7290h(str6, f13163U);
                    Pattern pattern3 = pattern2;
                    if (m7290h(str6, f13164V)) {
                        r10 = zM7290h;
                        r10 = (zM7290h ? 1 : 0) | 2;
                    }
                    r10 = zM7290h;
                    int i17 = r10;
                    if (m7290h(str6, f13162T)) {
                        i17 = (r10 == true ? 1 : 0) | 4;
                    }
                    aVar2.f12494d = i17;
                    String strM7293k = m7293k(str6, f13160R, null, map3);
                    if (TextUtils.isEmpty(strM7293k)) {
                        i10 = 0;
                        str2 = str5;
                    } else {
                        int i18 = C10134c0.f51354a;
                        str2 = str5;
                        String[] strArrSplit = strM7293k.split(",", -1);
                        int i19 = C10134c0.m19043j("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        if (C10134c0.m19043j("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i19 |= 4096;
                        }
                        if (C10134c0.m19043j("public.accessibility.describes-music-and-sound", strArrSplit)) {
                            i19 |= 1024;
                        }
                        i10 = C10134c0.m19043j("public.easy-to-read", strArrSplit) ? i19 | 8192 : i19;
                    }
                    aVar2.f12495e = i10;
                    aVar2.f12493c = m7293k(str6, f13157O, null, map3);
                    String strM7293k2 = m7293k(str6, pattern, null, map3);
                    Uri uriM19011d2 = strM7293k2 == null ? null : C10132b0.m19011d(str4, strM7293k2);
                    Pattern pattern4 = pattern;
                    Metadata metadata2 = new Metadata(new HlsTrackMetadataEntry(strM7294l, strM7294l2, Collections.emptyList()));
                    switch (m7294l(str6, f13155M, map3)) {
                        case "SUBTITLES":
                            b10 = 0;
                            break;
                        case "CLOSED-CAPTIONS":
                            b10 = 1;
                            break;
                        case "AUDIO":
                            b10 = 2;
                            break;
                        case "VIDEO":
                            b10 = 3;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 != 0) {
                        if (b10 == 1) {
                            c2416m3 = c2416m5;
                            arrayList = arrayList15;
                            arrayList2 = arrayList14;
                            String strM7294l3 = m7294l(str6, f13161S, map3);
                            if (strM7294l3.startsWith("CC")) {
                                i11 = Integer.parseInt(strM7294l3.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                i11 = Integer.parseInt(strM7294l3.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList22 == null) {
                                arrayList22 = new ArrayList();
                            }
                            aVar2.f12501k = str3;
                            aVar2.f12487C = i11;
                            arrayList22.add(new C2416m(aVar2));
                        } else if (b10 != 2) {
                            if (b10 != 3) {
                                arrayList2 = arrayList14;
                            } else {
                                int i20 = 0;
                                while (true) {
                                    if (i20 < arrayList5.size()) {
                                        bVar3 = (C2491d.b) arrayList5.get(i20);
                                        if (!strM7294l.equals(bVar3.f13285c)) {
                                            i20++;
                                        }
                                    } else {
                                        bVar3 = null;
                                    }
                                }
                                if (bVar3 != null) {
                                    C2416m c2416m6 = bVar3.f13284b;
                                    String strM19048o = C10134c0.m19048o(c2416m6.f12481i, 2);
                                    aVar2.f12498h = strM19048o;
                                    aVar2.f12501k = C10147p.m19104d(strM19048o);
                                    aVar2.f12506p = c2416m6.f12455L;
                                    aVar2.f12507q = c2416m6.f12456M;
                                    aVar2.f12508r = c2416m6.f12457N;
                                }
                                if (uriM19011d2 == null) {
                                    arrayList2 = arrayList14;
                                } else {
                                    aVar2.f12499i = metadata2;
                                    arrayList2 = arrayList14;
                                    arrayList2.add(new C2491d.a(uriM19011d2, new C2416m(aVar2), strM7294l2));
                                }
                            }
                            c2416m = c2416m5;
                            arrayList3 = arrayList16;
                            arrayList = arrayList15;
                        } else {
                            arrayList2 = arrayList14;
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList5.size()) {
                                    bVar2 = (C2491d.b) arrayList5.get(i21);
                                    c2416m3 = c2416m5;
                                    if (!strM7294l.equals(bVar2.f13286d)) {
                                        i21++;
                                        c2416m5 = c2416m3;
                                    }
                                } else {
                                    c2416m3 = c2416m5;
                                    bVar2 = null;
                                }
                            }
                            if (bVar2 != null) {
                                String strM19048o2 = C10134c0.m19048o(bVar2.f13284b.f12481i, 1);
                                aVar2.f12498h = strM19048o2;
                                strM19104d2 = C10147p.m19104d(strM19048o2);
                            } else {
                                strM19104d2 = null;
                            }
                            String strM7293k3 = m7293k(str6, f13177i, null, map3);
                            if (strM7293k3 != null) {
                                int i22 = C10134c0.f51354a;
                                aVar2.f12514x = Integer.parseInt(strM7293k3.split("/", 2)[0]);
                                if ("audio/eac3".equals(strM19104d2) && strM7293k3.endsWith("/JOC")) {
                                    aVar2.f12498h = "ec+3";
                                    strM19104d2 = "audio/eac3-joc";
                                }
                            }
                            aVar2.f12501k = strM19104d2;
                            if (uriM19011d2 != null) {
                                aVar2.f12499i = metadata2;
                                arrayList = arrayList15;
                                arrayList.add(new C2491d.a(uriM19011d2, new C2416m(aVar2), strM7294l2));
                            } else {
                                arrayList = arrayList15;
                                if (bVar2 != null) {
                                    c2416m2 = new C2416m(aVar2);
                                }
                                arrayList3 = arrayList16;
                                i16++;
                                arrayList16 = arrayList3;
                                arrayList15 = arrayList;
                                arrayList14 = arrayList2;
                                pattern2 = pattern3;
                                str5 = str2;
                                pattern = pattern4;
                                c2416m5 = c2416m2;
                                str4 = str;
                            }
                        }
                        c2416m2 = c2416m3;
                        arrayList3 = arrayList16;
                        i16++;
                        arrayList16 = arrayList3;
                        arrayList15 = arrayList;
                        arrayList14 = arrayList2;
                        pattern2 = pattern3;
                        str5 = str2;
                        pattern = pattern4;
                        c2416m5 = c2416m2;
                        str4 = str;
                    } else {
                        c2416m = c2416m5;
                        arrayList = arrayList15;
                        arrayList2 = arrayList14;
                        int i23 = 0;
                        while (true) {
                            if (i23 < arrayList5.size()) {
                                bVar = (C2491d.b) arrayList5.get(i23);
                                if (!strM7294l.equals(bVar.f13287e)) {
                                    i23++;
                                }
                            } else {
                                bVar = null;
                            }
                        }
                        if (bVar != null) {
                            String strM19048o3 = C10134c0.m19048o(bVar.f13284b.f12481i, 3);
                            aVar2.f12498h = strM19048o3;
                            strM19104d = C10147p.m19104d(strM19048o3);
                        } else {
                            strM19104d = null;
                        }
                        if (strM19104d == null) {
                            strM19104d = "text/vtt";
                        }
                        aVar2.f12501k = strM19104d;
                        aVar2.f12499i = metadata2;
                        if (uriM19011d2 != null) {
                            arrayList3 = arrayList16;
                            arrayList3.add(new C2491d.a(uriM19011d2, new C2416m(aVar2), strM7294l2));
                        } else {
                            arrayList3 = arrayList16;
                            C10145n.m19099g("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                        }
                    }
                    c2416m2 = c2416m;
                    i16++;
                    arrayList16 = arrayList3;
                    arrayList15 = arrayList;
                    arrayList14 = arrayList2;
                    pattern2 = pattern3;
                    str5 = str2;
                    pattern = pattern4;
                    c2416m5 = c2416m2;
                    str4 = str;
                }
                return new C2491d(str, arrayList18, arrayList20, arrayList14, arrayList15, arrayList16, arrayList17, c2416m5, z11 ? Collections.emptyList() : arrayList22, z12, map3, arrayList19);
            }
            String strM7298b = c2485a.m7298b();
            ArrayList arrayList23 = arrayList9;
            if (strM7298b.startsWith("#EXT")) {
                arrayList12.add(strM7298b);
            }
            boolean zStartsWith = strM7298b.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList24 = arrayList12;
            if (strM7298b.startsWith("#EXT-X-DEFINE")) {
                map3.put(m7294l(strM7298b, pattern2, map3), m7294l(strM7298b, f13168Z, map3));
            } else {
                if (strM7298b.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z10 = true;
                    arrayList4 = arrayList6;
                    arrayList11 = arrayList11;
                    map = map2;
                } else if (strM7298b.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strM7298b);
                } else if (strM7298b.startsWith("#EXT-X-SESSION-KEY")) {
                    DrmInitData.SchemeData schemeDataM7286d = m7286d(strM7298b, m7293k(strM7298b, f13151I, "identity", map3), map3);
                    if (schemeDataM7286d != null) {
                        String strM7294l4 = m7294l(strM7298b, f13150H, map3);
                        arrayList11.add(new DrmInitData(("SAMPLE-AES-CENC".equals(strM7294l4) || "SAMPLE-AES-CTR".equals(strM7294l4)) ? "cenc" : "cbcs", true, schemeDataM7286d));
                    }
                } else if (strM7298b.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = strM7298b.contains("CLOSED-CAPTIONS=NONE") | z11;
                    int i24 = zStartsWith ? 16384 : 0;
                    int iM7287e = m7287e(strM7298b, f13176h);
                    Matcher matcher = f13171c.matcher(strM7298b);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        strGroup.getClass();
                        i12 = Integer.parseInt(strGroup);
                    } else {
                        i12 = -1;
                    }
                    String strM7293k4 = m7293k(strM7298b, f13178j, null, map3);
                    String strM7293k5 = m7293k(strM7298b, f13179k, null, map3);
                    if (strM7293k5 != null) {
                        int i25 = C10134c0.f51354a;
                        arrayList4 = arrayList6;
                        String[] strArrSplit2 = strM7293k5.split("x", -1);
                        i13 = Integer.parseInt(strArrSplit2[0]);
                        i14 = Integer.parseInt(strArrSplit2[1]);
                        if (i13 <= 0 || i14 <= 0) {
                            i14 = -1;
                            i13 = -1;
                        }
                    } else {
                        arrayList4 = arrayList6;
                        i13 = -1;
                        i14 = -1;
                    }
                    String strM7293k6 = m7293k(strM7298b, f13180l, null, map3);
                    float f3 = strM7293k6 != null ? Float.parseFloat(strM7293k6) : -1.0f;
                    HashMap map5 = map2;
                    String strM7293k7 = m7293k(strM7298b, f13172d, null, map3);
                    String strM7293k8 = m7293k(strM7298b, f13173e, null, map3);
                    String strM7293k9 = m7293k(strM7298b, f13174f, null, map3);
                    String strM7293k10 = m7293k(strM7298b, f13175g, null, map3);
                    if (zStartsWith) {
                        uriM19011d = C10132b0.m19011d(str4, m7294l(strM7298b, pattern, map3));
                    } else {
                        if (!c2485a.m7297a()) {
                            throw ParserException.m6771b("#EXT-X-STREAM-INF must be followed by another line");
                        }
                        uriM19011d = C10132b0.m19011d(str4, m7295m(c2485a.m7298b(), map3));
                    }
                    C2416m.a aVar3 = new C2416m.a();
                    aVar3.m7129b(arrayList5.size());
                    aVar3.f12500j = "application/x-mpegURL";
                    aVar3.f12498h = strM7293k4;
                    aVar3.f12496f = i12;
                    aVar3.f12497g = iM7287e;
                    aVar3.f12506p = i13;
                    aVar3.f12507q = i14;
                    aVar3.f12508r = f3;
                    aVar3.f12495e = i24;
                    arrayList5.add(new C2491d.b(uriM19011d, new C2416m(aVar3), strM7293k7, strM7293k8, strM7293k9, strM7293k10));
                    map = map5;
                    ArrayList arrayList25 = (ArrayList) map.get(uriM19011d);
                    if (arrayList25 == null) {
                        arrayList25 = new ArrayList();
                        map.put(uriM19011d, arrayList25);
                    }
                    arrayList25.add(new HlsTrackMetadataEntry.VariantInfo(i12, iM7287e, strM7293k7, strM7293k8, strM7293k9, strM7293k10));
                    z10 = z12;
                    z11 = zContains;
                }
                map2 = map;
                arrayList9 = arrayList23;
                arrayList12 = arrayList24;
                arrayList11 = arrayList11;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList4;
                arrayList10 = arrayList10;
            }
            z10 = z12;
            arrayList4 = arrayList6;
            arrayList11 = arrayList11;
            map = map2;
            map2 = map;
            arrayList9 = arrayList23;
            arrayList12 = arrayList24;
            arrayList11 = arrayList11;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList4;
            arrayList10 = arrayList10;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7290h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static double m7291i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: j */
    public static long m7292j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: k */
    public static String m7293k(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            str2 = m7295m(str2, map);
        }
        return str2;
    }

    /* JADX INFO: renamed from: l */
    public static String m7294l(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String strM7293k = m7293k(str, pattern, null, map);
        if (strM7293k != null) {
            return strM7293k;
        }
        throw ParserException.m6771b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX INFO: renamed from: m */
    public static String m7295m(String str, Map<String, String> map) {
        Matcher matcher = f13170b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            while (true) {
                if (!matcher.find()) {
                    matcher.appendTail(stringBuffer);
                    return stringBuffer.toString();
                }
                String strGroup = matcher.group(1);
                if (map.containsKey(strGroup)) {
                    matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:3:0x0012, B:5:0x001d, B:7:0x0025, B:34:0x0081, B:36:0x0088, B:39:0x0096, B:41:0x00a0, B:42:0x00b4, B:44:0x00bd, B:46:0x00c6, B:48:0x00ce, B:50:0x00d8, B:52:0x00e2, B:54:0x00ec, B:56:0x00f7, B:59:0x0103, B:60:0x0108, B:69:0x0138, B:70:0x0141, B:10:0x0031, B:13:0x003b, B:15:0x0043, B:21:0x0050, B:24:0x005a, B:26:0x0064, B:28:0x006b, B:30:0x0072, B:31:0x0078), top: B:82:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a A[Catch: all -> 0x0048, LOOP:2: B:19:0x004c->B:24:0x005a, LOOP_END, TryCatch #2 {all -> 0x0048, blocks: (B:3:0x0012, B:5:0x001d, B:7:0x0025, B:34:0x0081, B:36:0x0088, B:39:0x0096, B:41:0x00a0, B:42:0x00b4, B:44:0x00bd, B:46:0x00c6, B:48:0x00ce, B:50:0x00d8, B:52:0x00e2, B:54:0x00ec, B:56:0x00f7, B:59:0x0103, B:60:0x0108, B:69:0x0138, B:70:0x0141, B:10:0x0031, B:13:0x003b, B:15:0x0043, B:21:0x0050, B:24:0x005a, B:26:0x0064, B:28:0x006b, B:30:0x0072, B:31:0x0078), top: B:82:0x0012 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.upstream.C2529c.a
    /* JADX INFO: renamed from: a */
    public final Object mo7296a(Uri uri, C9883h c9883h) throws IOException {
        int i10;
        Object objM7289g;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c9883h));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i11 = bufferedReader.read();
            boolean zM19023H = false;
            if (i11 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i11 = bufferedReader.read();
                    while (i11 != -1) {
                        i11 = bufferedReader.read();
                    }
                    i10 = 0;
                    while (true) {
                        if (i10 < 7) {
                            while (i11 != -1) {
                                i11 = bufferedReader.read();
                            }
                            zM19023H = C10134c0.m19023H(i11);
                            break;
                            break;
                        }
                        if (i11 != "#EXTM3U".charAt(i10)) {
                            break;
                            break;
                        }
                        i11 = bufferedReader.read();
                        i10++;
                    }
                }
            } else {
                while (i11 != -1 && Character.isWhitespace(i11)) {
                    i11 = bufferedReader.read();
                }
                i10 = 0;
                while (true) {
                    if (i10 < 7) {
                        while (i11 != -1 && Character.isWhitespace(i11) && !C10134c0.m19023H(i11)) {
                            i11 = bufferedReader.read();
                        }
                        zM19023H = C10134c0.m19023H(i11);
                        break;
                    }
                    if (i11 != "#EXTM3U".charAt(i10)) {
                        break;
                    }
                    i11 = bufferedReader.read();
                    i10++;
                }
            }
            if (!zM19023H) {
                throw ParserException.m6771b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    int i12 = C10134c0.f51354a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    throw ParserException.m6771b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        objM7289g = m7288f(this.f13195a, this.f13196b, new C2485a(arrayDeque, bufferedReader), uri.toString());
                        break;
                    }
                    arrayDeque.add(strTrim);
                    objM7289g = m7289g(new C2485a(arrayDeque, bufferedReader), uri.toString());
                    break;
                }
            }
            int i13 = C10134c0.f51354a;
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return objM7289g;
        } catch (Throwable th2) {
            int i14 = C10134c0.f51354a;
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
            throw th2;
        }
    }
}
