package so;

import dm.C5207g;
import java.util.Comparator;
import java.util.LinkedHashMap;
import mo.C7661i;

/* JADX INFO: renamed from: so.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C9088f {

    /* JADX INFO: renamed from: b */
    public static final b f47399b;

    /* JADX INFO: renamed from: c */
    public static final a f47400c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f47401d;

    /* JADX INFO: renamed from: e */
    public static final C9088f f47402e;

    /* JADX INFO: renamed from: f */
    public static final C9088f f47403f;

    /* JADX INFO: renamed from: g */
    public static final C9088f f47404g;

    /* JADX INFO: renamed from: h */
    public static final C9088f f47405h;

    /* JADX INFO: renamed from: i */
    public static final C9088f f47406i;

    /* JADX INFO: renamed from: j */
    public static final C9088f f47407j;

    /* JADX INFO: renamed from: k */
    public static final C9088f f47408k;

    /* JADX INFO: renamed from: l */
    public static final C9088f f47409l;

    /* JADX INFO: renamed from: m */
    public static final C9088f f47410m;

    /* JADX INFO: renamed from: n */
    public static final C9088f f47411n;

    /* JADX INFO: renamed from: o */
    public static final C9088f f47412o;

    /* JADX INFO: renamed from: p */
    public static final C9088f f47413p;

    /* JADX INFO: renamed from: q */
    public static final C9088f f47414q;

    /* JADX INFO: renamed from: r */
    public static final C9088f f47415r;

    /* JADX INFO: renamed from: s */
    public static final C9088f f47416s;

    /* JADX INFO: renamed from: t */
    public static final C9088f f47417t;

    /* JADX INFO: renamed from: u */
    public static final C9088f f47418u;

    /* JADX INFO: renamed from: a */
    public final String f47419a;

    /* JADX INFO: renamed from: so.f$a */
    public static final class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            C5207g.m11111f(str3, "a");
            C5207g.m11111f(str4, "b");
            int iMin = Math.min(str3.length(), str4.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = str3.charAt(i10);
                char cCharAt2 = str4.charAt(i10);
                if (cCharAt != cCharAt2) {
                    if (C5207g.m11113h(cCharAt, cCharAt2) >= 0) {
                        return 1;
                    }
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: so.f$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static final C9088f m17291a(b bVar, String str) {
            C9088f c9088f = new C9088f(str);
            C9088f.f47401d.put(str, c9088f);
            return c9088f;
        }

        /* JADX INFO: renamed from: b */
        public final synchronized C9088f m17292b(String str) {
            C9088f c9088f;
            String strM11116k;
            C5207g.m11111f(str, "javaName");
            LinkedHashMap linkedHashMap = C9088f.f47401d;
            c9088f = (C9088f) linkedHashMap.get(str);
            if (c9088f == null) {
                if (C7661i.m15256V2(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strM11116k = C5207g.m11116k(strSubstring, "SSL_");
                } else if (C7661i.m15256V2(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strM11116k = C5207g.m11116k(strSubstring2, "TLS_");
                } else {
                    strM11116k = str;
                }
                c9088f = (C9088f) linkedHashMap.get(strM11116k);
                if (c9088f == null) {
                    c9088f = new C9088f(str);
                }
                linkedHashMap.put(str, c9088f);
            }
            return c9088f;
        }
    }

    static {
        b bVar = new b();
        f47399b = bVar;
        f47400c = new a();
        f47401d = new LinkedHashMap();
        b.m17291a(bVar, "SSL_RSA_WITH_NULL_MD5");
        b.m17291a(bVar, "SSL_RSA_WITH_NULL_SHA");
        b.m17291a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b.m17291a(bVar, "SSL_RSA_WITH_RC4_128_MD5");
        b.m17291a(bVar, "SSL_RSA_WITH_RC4_128_SHA");
        b.m17291a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.m17291a(bVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f47402e = b.m17291a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b.m17291a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b.m17291a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b.m17291a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b.m17291a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b.m17291a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        b.m17291a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b.m17291a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        b.m17291a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        b.m17291a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "TLS_KRB5_WITH_RC4_128_SHA");
        b.m17291a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        b.m17291a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b.m17291a(bVar, "TLS_KRB5_WITH_RC4_128_MD5");
        b.m17291a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b.m17291a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b.m17291a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b.m17291a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f47403f = b.m17291a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f47404g = b.m17291a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_RSA_WITH_NULL_SHA256");
        b.m17291a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b.m17291a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b.m17291a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b.m17291a(bVar, "TLS_PSK_WITH_RC4_128_SHA");
        b.m17291a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        f47405h = b.m17291a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f47406i = b.m17291a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        f47407j = b.m17291a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b.m17291a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b.m17291a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b.m17291a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b.m17291a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b.m17291a(bVar, "TLS_FALLBACK_SCSV");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f47408k = b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f47409l = b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        b.m17291a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        b.m17291a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f47410m = b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f47411n = b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b.m17291a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f47412o = b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f47413p = b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b.m17291a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b.m17291a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b.m17291a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f47414q = b.m17291a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f47415r = b.m17291a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        b.m17291a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b.m17291a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f47416s = b.m17291a(bVar, "TLS_AES_128_GCM_SHA256");
        f47417t = b.m17291a(bVar, "TLS_AES_256_GCM_SHA384");
        f47418u = b.m17291a(bVar, "TLS_CHACHA20_POLY1305_SHA256");
        b.m17291a(bVar, "TLS_AES_128_CCM_SHA256");
        b.m17291a(bVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public C9088f(String str) {
        this.f47419a = str;
    }

    public final String toString() {
        return this.f47419a;
    }
}
