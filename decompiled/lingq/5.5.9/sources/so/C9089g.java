package so;

import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.C6752c;
import okhttp3.TlsVersion;
import p440vl.C9758b;
import to.C9347b;

/* JADX INFO: renamed from: so.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C9089g {

    /* JADX INFO: renamed from: e */
    public static final C9089g f47420e;

    /* JADX INFO: renamed from: f */
    public static final C9089g f47421f;

    /* JADX INFO: renamed from: a */
    public final boolean f47422a;

    /* JADX INFO: renamed from: b */
    public final boolean f47423b;

    /* JADX INFO: renamed from: c */
    public final String[] f47424c;

    /* JADX INFO: renamed from: d */
    public final String[] f47425d;

    /* JADX INFO: renamed from: so.g$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final boolean f47426a;

        /* JADX INFO: renamed from: b */
        public String[] f47427b;

        /* JADX INFO: renamed from: c */
        public String[] f47428c;

        /* JADX INFO: renamed from: d */
        public boolean f47429d;

        public a() {
            this.f47426a = true;
        }

        public a(C9089g c9089g) {
            C5207g.m11111f(c9089g, "connectionSpec");
            this.f47426a = c9089g.f47422a;
            this.f47427b = c9089g.f47424c;
            this.f47428c = c9089g.f47425d;
            this.f47429d = c9089g.f47423b;
        }

        /* JADX INFO: renamed from: a */
        public final C9089g m17296a() {
            return new C9089g(this.f47426a, this.f47429d, this.f47427b, this.f47428c);
        }

        /* JADX INFO: renamed from: b */
        public final void m17297b(String... strArr) {
            C5207g.m11111f(strArr, "cipherSuites");
            if (!this.f47426a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f47427b = (String[]) strArr.clone();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final void m17298c(C9088f... c9088fArr) {
            C5207g.m11111f(c9088fArr, "cipherSuites");
            if (!this.f47426a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(c9088fArr.length);
            for (C9088f c9088f : c9088fArr) {
                arrayList.add(c9088f.f47419a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            m17297b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* JADX INFO: renamed from: d */
        public final void m17299d() {
            if (!this.f47426a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f47429d = true;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: e */
        public final void m17300e(String... strArr) {
            C5207g.m11111f(strArr, "tlsVersions");
            if (!this.f47426a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(strArr.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f47428c = (String[]) strArr.clone();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: f */
        public final void m17301f(TlsVersion... tlsVersionArr) {
            if (!this.f47426a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            m17300e((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    static {
        C9088f c9088f = C9088f.f47416s;
        C9088f c9088f2 = C9088f.f47417t;
        C9088f c9088f3 = C9088f.f47418u;
        C9088f c9088f4 = C9088f.f47410m;
        C9088f c9088f5 = C9088f.f47412o;
        C9088f c9088f6 = C9088f.f47411n;
        C9088f c9088f7 = C9088f.f47413p;
        C9088f c9088f8 = C9088f.f47415r;
        C9088f c9088f9 = C9088f.f47414q;
        C9088f[] c9088fArr = {c9088f, c9088f2, c9088f3, c9088f4, c9088f5, c9088f6, c9088f7, c9088f8, c9088f9};
        C9088f[] c9088fArr2 = {c9088f, c9088f2, c9088f3, c9088f4, c9088f5, c9088f6, c9088f7, c9088f8, c9088f9, C9088f.f47408k, C9088f.f47409l, C9088f.f47405h, C9088f.f47406i, C9088f.f47403f, C9088f.f47404g, C9088f.f47402e};
        a aVar = new a();
        aVar.m17298c((C9088f[]) Arrays.copyOf(c9088fArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        aVar.m17301f(tlsVersion, tlsVersion2);
        aVar.m17299d();
        aVar.m17296a();
        a aVar2 = new a();
        aVar2.m17298c((C9088f[]) Arrays.copyOf(c9088fArr2, 16));
        aVar2.m17301f(tlsVersion, tlsVersion2);
        aVar2.m17299d();
        f47420e = aVar2.m17296a();
        a aVar3 = new a();
        aVar3.m17298c((C9088f[]) Arrays.copyOf(c9088fArr2, 16));
        aVar3.m17301f(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        aVar3.m17299d();
        aVar3.m17296a();
        f47421f = new C9089g(false, false, null, null);
    }

    public C9089g(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f47422a = z10;
        this.f47423b = z11;
        this.f47424c = strArr;
        this.f47425d = strArr2;
    }

    /* JADX INFO: renamed from: a */
    public final List<C9088f> m17293a() {
        String[] strArr = this.f47424c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C9088f.f47399b.m17292b(str));
        }
        return C6752c.m13453u0(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17294b(SSLSocket sSLSocket) {
        if (!this.f47422a) {
            return false;
        }
        String[] strArr = this.f47425d;
        if (strArr != null && !C9347b.m17703j(strArr, sSLSocket.getEnabledProtocols(), C9758b.f49823a)) {
            return false;
        }
        String[] strArr2 = this.f47424c;
        return strArr2 == null || C9347b.m17703j(strArr2, sSLSocket.getEnabledCipherSuites(), C9088f.f47400c);
    }

    /* JADX INFO: renamed from: c */
    public final List<TlsVersion> m17295c() {
        String[] strArr = this.f47425d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.INSTANCE.getClass();
            arrayList.add(TlsVersion.Companion.m15940a(str));
        }
        return C6752c.m13453u0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9089g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C9089g c9089g = (C9089g) obj;
        boolean z10 = c9089g.f47422a;
        boolean z11 = this.f47422a;
        if (z11 != z10) {
            return false;
        }
        return !z11 || (Arrays.equals(this.f47424c, c9089g.f47424c) && Arrays.equals(this.f47425d, c9089g.f47425d) && this.f47423b == c9089g.f47423b);
    }

    public final int hashCode() {
        if (!this.f47422a) {
            return 17;
        }
        int iHashCode = 0;
        String[] strArr = this.f47424c;
        int iHashCode2 = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f47425d;
        if (strArr2 != null) {
            iHashCode = Arrays.hashCode(strArr2);
        }
        return ((iHashCode2 + iHashCode) * 31) + (!this.f47423b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f47422a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(m17293a(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(m17295c(), "[all enabled]")) + ", supportsTlsExtensions=" + this.f47423b + ')';
    }
}
