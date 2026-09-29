package p000;

import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes.dex */
public final class q1a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static TlsVersion m19599a(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return TlsVersion.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return TlsVersion.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return TlsVersion.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return TlsVersion.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return TlsVersion.SSL_3_0;
        }
        C3386nv.m17626m("Unexpected TLS version: ".concat(str));
        return null;
    }
}
