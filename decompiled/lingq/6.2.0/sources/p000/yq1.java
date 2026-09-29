package p000;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yq1 {

    /* JADX INFO: renamed from: a */
    public static final cc4 f70284a;

    static {
        of4 of4Var = new of4();
        v00 v00Var = v00.f64641a;
        of4Var.mo12901e(vq1.class, v00Var);
        of4Var.mo12901e(x20.class, v00Var);
        b10 b10Var = b10.f7744a;
        of4Var.mo12901e(uq1.class, b10Var);
        of4Var.mo12901e(g30.class, b10Var);
        y00 y00Var = y00.f69039a;
        of4Var.mo12901e(cq1.class, y00Var);
        of4Var.mo12901e(h30.class, y00Var);
        z00 z00Var = z00.f70722a;
        of4Var.mo12901e(bq1.class, z00Var);
        of4Var.mo12901e(i30.class, z00Var);
        r10 r10Var = r10.f58478a;
        of4Var.mo12901e(tq1.class, r10Var);
        of4Var.mo12901e(h40.class, r10Var);
        q10 q10Var = q10.f57116a;
        of4Var.mo12901e(sq1.class, q10Var);
        of4Var.mo12901e(g40.class, q10Var);
        a10 a10Var = a10.f43a;
        of4Var.mo12901e(dq1.class, a10Var);
        of4Var.mo12901e(k30.class, a10Var);
        l10 l10Var = l10.f48879a;
        of4Var.mo12901e(rq1.class, l10Var);
        of4Var.mo12901e(m30.class, l10Var);
        c10 c10Var = c10.f9296a;
        of4Var.mo12901e(lq1.class, c10Var);
        of4Var.mo12901e(n30.class, c10Var);
        e10 e10Var = e10.f36550a;
        of4Var.mo12901e(jq1.class, e10Var);
        of4Var.mo12901e(o30.class, e10Var);
        h10 h10Var = h10.f41649a;
        of4Var.mo12901e(iq1.class, h10Var);
        of4Var.mo12901e(s30.class, h10Var);
        i10 i10Var = i10.f43306a;
        of4Var.mo12901e(hq1.class, i10Var);
        of4Var.mo12901e(u30.class, i10Var);
        f10 f10Var = f10.f38165a;
        of4Var.mo12901e(fq1.class, f10Var);
        of4Var.mo12901e(q30.class, f10Var);
        t00 t00Var = t00.f61687a;
        of4Var.mo12901e(xp1.class, t00Var);
        of4Var.mo12901e(a30.class, t00Var);
        s00 s00Var = s00.f60105a;
        of4Var.mo12901e(wp1.class, s00Var);
        of4Var.mo12901e(b30.class, s00Var);
        g10 g10Var = g10.f40040a;
        of4Var.mo12901e(gq1.class, g10Var);
        of4Var.mo12901e(r30.class, g10Var);
        d10 d10Var = d10.f34817a;
        of4Var.mo12901e(eq1.class, d10Var);
        of4Var.mo12901e(p30.class, d10Var);
        u00 u00Var = u00.f63159a;
        of4Var.mo12901e(yp1.class, u00Var);
        of4Var.mo12901e(c30.class, u00Var);
        j10 j10Var = j10.f44871a;
        of4Var.mo12901e(kq1.class, j10Var);
        of4Var.mo12901e(w30.class, j10Var);
        k10 k10Var = k10.f46526a;
        of4Var.mo12901e(mq1.class, k10Var);
        of4Var.mo12901e(y30.class, k10Var);
        m10 m10Var = m10.f50408a;
        of4Var.mo12901e(nq1.class, m10Var);
        of4Var.mo12901e(z30.class, m10Var);
        p10 p10Var = p10.f55412a;
        of4Var.mo12901e(qq1.class, p10Var);
        of4Var.mo12901e(e40.class, p10Var);
        n10 n10Var = n10.f52153a;
        of4Var.mo12901e(pq1.class, n10Var);
        of4Var.mo12901e(b40.class, n10Var);
        o10 o10Var = o10.f53566a;
        of4Var.mo12901e(oq1.class, o10Var);
        of4Var.mo12901e(c40.class, o10Var);
        w00 w00Var = w00.f66157a;
        of4Var.mo12901e(aq1.class, w00Var);
        of4Var.mo12901e(d30.class, w00Var);
        x00 x00Var = x00.f67583a;
        of4Var.mo12901e(zp1.class, x00Var);
        of4Var.mo12901e(e30.class, x00Var);
        of4Var.f54272d = true;
        f70284a = new cc4(of4Var);
    }

    /* JADX INFO: renamed from: a */
    public static u30 m25273a(JsonReader jsonReader) throws IOException {
        t30 t30Var = new t30();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    t30Var.f61783d = jsonReader.nextLong();
                    t30Var.f61785f = (byte) (t30Var.f61785f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C3386nv.m17635v("Null symbol");
                        return null;
                    }
                    t30Var.f61781b = strNextString;
                    break;
                    break;
                case "pc":
                    t30Var.f61780a = jsonReader.nextLong();
                    t30Var.f61785f = (byte) (t30Var.f61785f | 1);
                    break;
                case "file":
                    t30Var.f61782c = jsonReader.nextString();
                    break;
                case "importance":
                    t30Var.f61784e = jsonReader.nextInt();
                    t30Var.f61785f = (byte) (t30Var.f61785f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return t30Var.m21825a();
    }

    /* JADX INFO: renamed from: b */
    public static c30 m25274b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    C3386nv.m17635v("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    C3386nv.m17635v("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new c30(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static a30 m25275c(JsonReader jsonReader) throws IOException {
        z20 z20Var = new z20();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    z20Var.m25404b(m25276d(jsonReader, new hm2(9)));
                    break;
                case "pid":
                    z20Var.m25406d(jsonReader.nextInt());
                    break;
                case "pss":
                    z20Var.m25408f(jsonReader.nextLong());
                    break;
                case "rss":
                    z20Var.m25410h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    z20Var.m25411i(jsonReader.nextLong());
                    break;
                case "processName":
                    z20Var.m25407e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    z20Var.m25409g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    z20Var.m25412j(jsonReader.nextString());
                    break;
                case "importance":
                    z20Var.m25405c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z20Var.m25403a();
    }

    /* JADX INFO: renamed from: d */
    public static List m25276d(JsonReader jsonReader, hm2 hm2Var) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(hm2Var.m13332b(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x024e  */
    /* JADX WARN: Code duplicated, block: B:234:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [q30] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [xp1] */
    /* JADX WARN: Type inference failed for: r24v2, types: [a30] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [r30] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: e */
    public static m30 m25277e(JsonReader jsonReader) throws IOException {
        byte b;
        l30 l30Var = new l30();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            m30 m30Var = null;
            switch (b) {
                case 0:
                    x30 x30Var = new x30();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                x30Var.f67687a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                x30Var.f67688b = jsonReader.nextInt();
                                x30Var.f67693g = (byte) (x30Var.f67693g | 1);
                                break;
                            case "orientation":
                                x30Var.f67690d = jsonReader.nextInt();
                                x30Var.f67693g = (byte) (x30Var.f67693g | 4);
                                break;
                            case "diskUsed":
                                x30Var.f67692f = jsonReader.nextLong();
                                x30Var.f67693g = (byte) (x30Var.f67693g | 16);
                                break;
                            case "ramUsed":
                                x30Var.f67691e = jsonReader.nextLong();
                                x30Var.f67693g = (byte) (x30Var.f67693g | 8);
                                break;
                            case "proximityOn":
                                x30Var.f67689c = jsonReader.nextBoolean();
                                x30Var.f67693g = (byte) (x30Var.f67693g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    l30Var.f48955d = x30Var.m24252a();
                    break;
                case 1:
                    d40 d40Var = new d40();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            d40Var.m10083c(m25276d(jsonReader, new hm2(11)));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    l30Var.f48957f = d40Var.m10081a();
                    break;
                case 2:
                    jsonReader.beginObject();
                    o30 o30Var = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    w30 w30VarM25279g = null;
                    List listUnmodifiableList3 = null;
                    boolean z = false;
                    int iNextInt = 0;
                    while (true) {
                        m30 m30Var2 = m30Var;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && o30Var != null) {
                                l30Var.f48954c = new n30(o30Var, listUnmodifiableList, listUnmodifiableList2, boolValueOf, w30VarM25279g, listUnmodifiableList3, iNextInt);
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (o30Var == null) {
                                sb.append(" execution");
                            }
                            if (!z) {
                                sb.append(" uiOrientation");
                            }
                            C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
                            return m30Var2;
                        }
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m25279g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                m30Var = m30Var2;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                m30Var = m30Var2;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                ?? M25276d = m30Var2;
                                ?? M25278f = M25276d;
                                ?? M25275c = M25278f;
                                ?? r30Var = M25275c;
                                ?? r26 = r30Var;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            M25275c = m25275c(jsonReader);
                                            break;
                                        case "threads":
                                            M25276d = m25276d(jsonReader, new hm2(12));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b2 = 0;
                                            ?? NextString = m30Var2;
                                            ?? NextString2 = NextString;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b2 = (byte) (b2 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 == 0) {
                                                            C3386nv.m17635v("Null code");
                                                            return m30Var2;
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString == 0) {
                                                            C3386nv.m17635v("Null name");
                                                            return m30Var2;
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b2 == 1 && NextString != 0 && NextString2 != 0) {
                                                r30Var = new r30(jNextLong, NextString, NextString2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (NextString == 0) {
                                                    sb2.append(" name");
                                                }
                                                if (NextString2 == 0) {
                                                    sb2.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb2));
                                                return m30Var2;
                                            }
                                            break;
                                        case "binaries":
                                            List listM25276d = m25276d(jsonReader, new hm2(13));
                                            M25278f = M25278f;
                                            r26 = listM25276d;
                                            if (listM25276d == null) {
                                                C3386nv.m17635v("Null binaries");
                                                return m30Var2;
                                            }
                                            break;
                                        case "exception":
                                            M25278f = m25278f(jsonReader);
                                            r26 = r26;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            M25278f = M25278f;
                                            r26 = r26;
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (r30Var != 0 && r26 != 0) {
                                    o30Var = new o30(M25276d, M25278f, M25275c, r30Var, r26);
                                    m30Var = m30Var2;
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (r30Var == 0) {
                                        sb3.append(" signal");
                                    }
                                    if (r26 == 0) {
                                        sb3.append(" binaries");
                                    }
                                    C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb3));
                                    return m30Var2;
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(m25274b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                m30Var = m30Var2;
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(m25274b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                m30Var = m30Var2;
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                z = true;
                                m30Var = m30Var2;
                                break;
                            case "currentProcessDetails":
                                w30VarM25279g = m25279g(jsonReader);
                                m30Var = m30Var2;
                                break;
                            default:
                                jsonReader.skipValue();
                                m30Var = m30Var2;
                                break;
                        }
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                C3386nv.m17635v("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null) {
                        C3386nv.m17633t("Missing required properties: content");
                        return null;
                    }
                    l30Var.f48956e = new z30(strNextString);
                    break;
                    break;
                case 4:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        C3386nv.m17635v("Null type");
                        return null;
                    }
                    l30Var.f48953b = strNextString2;
                    break;
                    break;
                case 5:
                    l30Var.f48952a = jsonReader.nextLong();
                    l30Var.f48958g = (byte) (l30Var.f48958g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return l30Var.m15768a();
    }

    /* JADX INFO: renamed from: f */
    public static q30 m25278f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listM25276d = null;
        q30 q30VarM25278f = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listM25276d != null) {
                    return new q30(strNextString, strNextString2, listM25276d, q30VarM25278f, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listM25276d == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listM25276d = m25276d(jsonReader, new hm2(15));
                    if (listM25276d == null) {
                        C3386nv.m17635v("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C3386nv.m17635v("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    q30VarM25278f = m25278f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static w30 m25279g(JsonReader jsonReader) throws IOException {
        v30 v30Var = new v30();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    v30Var.f64774b = jsonReader.nextInt();
                    v30Var.f64777e = (byte) (v30Var.f64777e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C3386nv.m17635v("Null processName");
                        return null;
                    }
                    v30Var.f64773a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    v30Var.f64776d = jsonReader.nextBoolean();
                    v30Var.f64777e = (byte) (v30Var.f64777e | 4);
                    break;
                case "importance":
                    v30Var.f64775c = jsonReader.nextInt();
                    v30Var.f64777e = (byte) (v30Var.f64777e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return v30Var.m23076a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0205, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x020b, code lost:
    
        if (r12.equals("displayVersion") != true) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020e, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0214, code lost:
    
        if (r12.equals("installationUuid") != true) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0217, code lost:
    
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021e, code lost:
    
        if (r12.equals("version") == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0227, code lost:
    
        if (r12.equals("developmentPlatformVersion") != true) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022a, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0232, code lost:
    
        if (r12.equals("developmentPlatform") != true) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0235, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x023c, code lost:
    
        if (r12.equals("identifier") != true) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x023f, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0240, code lost:
    
        switch(r3) {
            case 0: goto L172;
            case 1: goto L171;
            case 2: goto L170;
            case 3: goto L165;
            case 4: goto L164;
            case 5: goto L163;
            default: goto L162;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:?, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v136 fo2, still in use, count: 2, list:
      (r12v136 fo2) from 0x01da: INVOKE (r12v136 fo2) VIRTUAL call: fo2.a():h40 A[MD:():h40 (m), WRAPPED]
      (r12v136 fo2) from 0x01cf: INVOKE 
      (r12v136 fo2)
      (wrap java.lang.String:0x01cb: INVOKE (r29v0 android.util.JsonReader) VIRTUAL call: android.util.JsonReader.nextString():java.lang.String A[MD:():java.lang.String throws java.io.IOException (c), WRAPPED])
     VIRTUAL call: fo2.e(java.lang.String):void A[MD:(java.lang.String):void (m)]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x20 m25280h(JsonReader jsonReader) throws IOException {
        int i;
        Charset charset = vq1.f65777a;
        w20 w20Var = new w20();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    C3156jq c3156jq = new C3156jq((char) 0);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            c3156jq.m14598L(m25276d(jsonReader, new hm2(10)));
                        } else if (strNextName2.equals("orgId")) {
                            c3156jq.m14600N(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    w20Var.f66247k = c3156jq.m14611v();
                    continue;
                    break;
                case "sdkVersion":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C3386nv.m17635v("Null sdkVersion");
                        return null;
                    }
                    w20Var.f66237a = strNextString;
                    break;
                    break;
                case "appQualitySessionId":
                    w20Var.f66243g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    w20Var.f66248l = m25275c(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        C3386nv.m17635v("Null buildVersion");
                        return null;
                    }
                    w20Var.f66244h = strNextString2;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    w20Var.f66242f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        C3386nv.m17635v("Null gmpAppId");
                        return null;
                    }
                    w20Var.f66238b = strNextString3;
                    break;
                    break;
                case "installationUuid":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        C3386nv.m17635v("Null installationUuid");
                        return null;
                    }
                    w20Var.f66240d = strNextString4;
                    break;
                    break;
                case "firebaseInstallationId":
                    w20Var.f66241e = jsonReader.nextString();
                    break;
                case "platform":
                    w20Var.f66239c = jsonReader.nextInt();
                    w20Var.f66249m = (byte) (w20Var.f66249m | 1);
                    break;
                case "displayVersion":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        C3386nv.m17635v("Null displayVersion");
                        return null;
                    }
                    w20Var.f66245i = strNextString5;
                    break;
                    break;
                case "session":
                    f30 f30Var = new f30();
                    f30Var.f38325f = false;
                    f30Var.f38332m = (byte) (f30Var.f38332m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3.hashCode()) {
                            case -2128794476:
                                i = !strNextName3.equals("startedAt") ? -1 : 0;
                                break;
                            case -1907185581:
                                i = !strNextName3.equals("appQualitySessionId") ? -1 : 1;
                                break;
                            case -1618432855:
                                i = !strNextName3.equals("identifier") ? -1 : 2;
                                break;
                            case -1606742899:
                                i = !strNextName3.equals("endedAt") ? -1 : r3;
                                break;
                            case -1335157162:
                                i = !strNextName3.equals("device") ? -1 : 4;
                                break;
                            case -1291329255:
                                i = !strNextName3.equals("events") ? -1 : 5;
                                break;
                            case 3556:
                                i = !strNextName3.equals("os") ? -1 : 6;
                                break;
                            case 96801:
                                i = !strNextName3.equals("app") ? -1 : 7;
                                break;
                            case 3599307:
                                i = !strNextName3.equals("user") ? -1 : 8;
                                break;
                            case 286956243:
                                i = !strNextName3.equals("generator") ? -1 : 9;
                                break;
                            case 1025385094:
                                i = !strNextName3.equals("crashed") ? -1 : 10;
                                break;
                            case 2047016109:
                                i = !strNextName3.equals("generatorType") ? -1 : 11;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        switch (i) {
                            case 0:
                                f30Var.f38323d = jsonReader.nextLong();
                                f30Var.f38332m = (byte) (f30Var.f38332m | 1);
                                break;
                            case 1:
                                f30Var.f38322c = jsonReader.nextString();
                                break;
                            case 2:
                                f30Var.f38321b = new String(Base64.decode(jsonReader.nextString(), 2), vq1.f65777a);
                                break;
                            case 3:
                                f30Var.f38324e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                j30 j30Var = new j30();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            j30Var.f44994f = jsonReader.nextBoolean();
                                            j30Var.f44998j = (byte) (j30Var.f44998j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString6 = jsonReader.nextString();
                                            if (strNextString6 == null) {
                                                C3386nv.m17635v("Null manufacturer");
                                                return null;
                                            }
                                            j30Var.f44996h = strNextString6;
                                            break;
                                            break;
                                        case "ram":
                                            j30Var.f44992d = jsonReader.nextLong();
                                            j30Var.f44998j = (byte) (j30Var.f44998j | 4);
                                            break;
                                        case "arch":
                                            j30Var.f44989a = jsonReader.nextInt();
                                            j30Var.f44998j = (byte) (j30Var.f44998j | 1);
                                            break;
                                        case "diskSpace":
                                            j30Var.f44993e = jsonReader.nextLong();
                                            j30Var.f44998j = (byte) (j30Var.f44998j | 8);
                                            break;
                                        case "cores":
                                            j30Var.f44991c = jsonReader.nextInt();
                                            j30Var.f44998j = (byte) (j30Var.f44998j | 2);
                                            break;
                                        case "model":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                C3386nv.m17635v("Null model");
                                                return null;
                                            }
                                            j30Var.f44990b = strNextString7;
                                            break;
                                            break;
                                        case "state":
                                            j30Var.f44995g = jsonReader.nextInt();
                                            j30Var.f44998j = (byte) (j30Var.f44998j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                C3386nv.m17635v("Null modelClass");
                                                return null;
                                            }
                                            j30Var.f44997i = strNextString8;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                f30Var.f38329j = j30Var.m14280a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(m25277e(jsonReader));
                                }
                                jsonReader.endArray();
                                f30Var.f38330k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                f40 f40Var = new f40();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                C3386nv.m17635v("Null buildVersion");
                                                return null;
                                            }
                                            f40Var.f38384c = strNextString9;
                                            break;
                                            break;
                                        case "jailbroken":
                                            f40Var.f38385d = jsonReader.nextBoolean();
                                            f40Var.f38386e = (byte) (f40Var.f38386e | 2);
                                            break;
                                        case "version":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                C3386nv.m17635v("Null version");
                                                return null;
                                            }
                                            f40Var.f38383b = strNextString10;
                                            break;
                                            break;
                                        case "platform":
                                            f40Var.f38382a = jsonReader.nextInt();
                                            f40Var.f38386e = (byte) (f40Var.f38386e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                f30Var.f38328i = f40Var.m11529a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String strNextString11 = null;
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                C3386nv.m17635v("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                C3386nv.m17635v("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                    r3 = 3;
                                }
                                jsonReader.endObject();
                                if (strNextString11 == null || strNextString12 == null) {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString11 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    C3386nv.m17633t(wq1.m24120p("Missing required properties:", sb));
                                    return null;
                                }
                                f30Var.f38326g = new h30(strNextString11, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                break;
                            case 8:
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        fo2Var.m11966e(jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                f30Var.f38327h = fo2Var.m11965a();
                                break;
                            case 9:
                                String strNextString17 = jsonReader.nextString();
                                if (strNextString17 == null) {
                                    C3386nv.m17635v("Null generator");
                                    return null;
                                }
                                f30Var.f38320a = strNextString17;
                                break;
                                break;
                            case 10:
                                f30Var.f38325f = jsonReader.nextBoolean();
                                f30Var.f38332m = (byte) (f30Var.f38332m | 2);
                                break;
                            case 11:
                                f30Var.f38331l = jsonReader.nextInt();
                                f30Var.f38332m = (byte) (f30Var.f38332m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    w20Var.f66246j = f30Var.m11510a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w20Var.m23675a();
    }

    /* JADX INFO: renamed from: i */
    public static x20 m25281i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                x20 x20VarM25280h = m25280h(jsonReader);
                jsonReader.close();
                return x20VarM25280h;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
