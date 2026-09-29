package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class xv3 {

    /* JADX INFO: renamed from: a */
    public static final jr3[] f68841a;

    /* JADX INFO: renamed from: b */
    public static final Map f68842b;

    static {
        jr3 jr3Var = new jr3(jr3.f46036i, "");
        ByteString byteString = jr3.f46033f;
        jr3 jr3Var2 = new jr3(byteString, "GET");
        jr3 jr3Var3 = new jr3(byteString, "POST");
        ByteString byteString2 = jr3.f46034g;
        jr3 jr3Var4 = new jr3(byteString2, "/");
        jr3 jr3Var5 = new jr3(byteString2, "/index.html");
        ByteString byteString3 = jr3.f46035h;
        jr3 jr3Var6 = new jr3(byteString3, "http");
        jr3 jr3Var7 = new jr3(byteString3, "https");
        ByteString byteString4 = jr3.f46032e;
        jr3[] jr3VarArr = {jr3Var, jr3Var2, jr3Var3, jr3Var4, jr3Var5, jr3Var6, jr3Var7, new jr3(byteString4, "200"), new jr3(byteString4, "204"), new jr3(byteString4, "206"), new jr3(byteString4, "304"), new jr3(byteString4, "400"), new jr3(byteString4, "404"), new jr3(byteString4, "500"), new jr3("accept-charset", ""), new jr3("accept-encoding", "gzip, deflate"), new jr3("accept-language", ""), new jr3("accept-ranges", ""), new jr3("accept", ""), new jr3("access-control-allow-origin", ""), new jr3("age", ""), new jr3("allow", ""), new jr3("authorization", ""), new jr3("cache-control", ""), new jr3("content-disposition", ""), new jr3("content-encoding", ""), new jr3("content-language", ""), new jr3("content-length", ""), new jr3("content-location", ""), new jr3("content-range", ""), new jr3("content-type", ""), new jr3("cookie", ""), new jr3("date", ""), new jr3("etag", ""), new jr3("expect", ""), new jr3("expires", ""), new jr3("from", ""), new jr3("host", ""), new jr3("if-match", ""), new jr3("if-modified-since", ""), new jr3("if-none-match", ""), new jr3("if-range", ""), new jr3("if-unmodified-since", ""), new jr3("last-modified", ""), new jr3("link", ""), new jr3("location", ""), new jr3("max-forwards", ""), new jr3("proxy-authenticate", ""), new jr3("proxy-authorization", ""), new jr3("range", ""), new jr3("referer", ""), new jr3("refresh", ""), new jr3("retry-after", ""), new jr3("server", ""), new jr3("set-cookie", ""), new jr3("strict-transport-security", ""), new jr3("transfer-encoding", ""), new jr3("user-agent", ""), new jr3("vary", ""), new jr3("via", ""), new jr3("www-authenticate", "")};
        f68841a = jr3VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(jr3VarArr[i].f46037a)) {
                linkedHashMap.put(jr3VarArr[i].f46037a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        f68842b = mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m24708a(ByteString byteString) {
        byteString.getClass();
        int iMo18078d = byteString.mo18078d();
        for (int i = 0; i < iMo18078d; i++) {
            byte bMo18082i = byteString.mo18082i(i);
            if (65 <= bMo18082i && bMo18082i < 91) {
                v63.m23133k("PROTOCOL_ERROR response malformed: mixed case name: ".concat(byteString.m18089r()));
                return;
            }
        }
    }
}
