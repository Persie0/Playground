package okhttp3;

import kotlin.enums.AbstractC3201a;
import p000.q1a;
import p000.ys2;
import p000.zb2;

/* JADX INFO: loaded from: classes.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");

    private final String javaName;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final q1a Companion = new q1a();

    TlsVersion(String str) {
        this.javaName = str;
    }

    public static final TlsVersion forJavaName(String str) {
        Companion.getClass();
        return q1a.m19599a(str);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    @zb2
    /* JADX INFO: renamed from: -deprecated_javaName, reason: not valid java name */
    public final String m25921deprecated_javaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
