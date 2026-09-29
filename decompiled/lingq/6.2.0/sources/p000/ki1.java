package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes.dex */
public final class ki1 {

    /* JADX INFO: renamed from: e */
    public static final List f47313e;

    /* JADX INFO: renamed from: f */
    public static final List f47314f;

    /* JADX INFO: renamed from: g */
    public static final ki1 f47315g;

    /* JADX INFO: renamed from: h */
    public static final ki1 f47316h;

    /* JADX INFO: renamed from: a */
    public final boolean f47317a;

    /* JADX INFO: renamed from: b */
    public final boolean f47318b;

    /* JADX INFO: renamed from: c */
    public final String[] f47319c;

    /* JADX INFO: renamed from: d */
    public final String[] f47320d;

    static {
        c21 c21Var = c21.f9344s;
        c21 c21Var2 = c21.f9345t;
        c21 c21Var3 = c21.f9346u;
        c21 c21Var4 = c21.f9338m;
        c21 c21Var5 = c21.f9340o;
        c21 c21Var6 = c21.f9339n;
        c21 c21Var7 = c21.f9341p;
        c21 c21Var8 = c21.f9343r;
        c21 c21Var9 = c21.f9342q;
        List listM23605K = vz1.m23605K(c21Var, c21Var2, c21Var3, c21Var4, c21Var5, c21Var6, c21Var7, c21Var8, c21Var9);
        f47313e = listM23605K;
        List listM23605K2 = vz1.m23605K(c21Var, c21Var2, c21Var3, c21Var4, c21Var5, c21Var6, c21Var7, c21Var8, c21Var9, c21.f9336k, c21.f9337l, c21.f9333h, c21.f9334i, c21.f9331f, c21.f9332g, c21.f9330e);
        f47314f = listM23605K2;
        C3040gj c3040gj = new C3040gj();
        c21[] c21VarArr = (c21[]) listM23605K.toArray(new c21[0]);
        c3040gj.m12679c((c21[]) Arrays.copyOf(c21VarArr, c21VarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        c3040gj.m12681e(tlsVersion, tlsVersion2);
        c3040gj.f40866b = true;
        c3040gj.m12677a();
        C3040gj c3040gj2 = new C3040gj();
        List list = listM23605K2;
        c21[] c21VarArr2 = (c21[]) list.toArray(new c21[0]);
        c3040gj2.m12679c((c21[]) Arrays.copyOf(c21VarArr2, c21VarArr2.length));
        c3040gj2.m12681e(tlsVersion, tlsVersion2);
        c3040gj2.f40866b = true;
        f47315g = c3040gj2.m12677a();
        C3040gj c3040gj3 = new C3040gj();
        c21[] c21VarArr3 = (c21[]) list.toArray(new c21[0]);
        c3040gj3.m12679c((c21[]) Arrays.copyOf(c21VarArr3, c21VarArr3.length));
        c3040gj3.m12681e(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        c3040gj3.f40866b = true;
        c3040gj3.m12677a();
        f47316h = new ki1(false, false, null, null);
    }

    public ki1(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.f47317a = z;
        this.f47318b = z2;
        this.f47319c = strArr;
        this.f47320d = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final void m15260a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.f47319c;
        if (strArr != null) {
            enabledCipherSuites = icb.m13775k(strArr, enabledCipherSuites, c21.f9328c);
        }
        String[] strArr2 = this.f47320d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = icb.m13775k(enabledProtocols2, strArr2, t76.f61938b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        es6 es6Var = c21.f9328c;
        byte[] bArr = icb.f43946a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (es6Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.f47317a;
        if (!z2) {
            C3386nv.m17626m("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            C3386nv.m17626m("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            C3386nv.m17626m("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            C3386nv.m17626m("At least one TLS version is required");
            return;
        }
        ki1 ki1Var = new ki1(z2, this.f47318b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (ki1Var.m15262c() != null) {
            sSLSocket.setEnabledProtocols(ki1Var.f47320d);
        }
        if (ki1Var.m15261b() != null) {
            sSLSocket.setEnabledCipherSuites(ki1Var.f47319c);
        }
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m15261b() {
        String[] strArr = this.f47319c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(c21.f9327b.m22377f(str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m15262c() {
        String[] strArr = this.f47320d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.Companion.getClass();
            arrayList.add(q1a.m19599a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ki1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ki1 ki1Var = (ki1) obj;
        boolean z = ki1Var.f47317a;
        boolean z2 = this.f47317a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.f47319c, ki1Var.f47319c) && Arrays.equals(this.f47320d, ki1Var.f47320d) && this.f47318b == ki1Var.f47318b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f47317a) {
            return 17;
        }
        String[] strArr = this.f47319c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f47320d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f47318b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f47317a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(m15261b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(m15262c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return ux5.m22993p(sb, this.f47318b, ')');
    }
}
