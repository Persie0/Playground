package p000;

import android.util.Log;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public final class dl0 {

    /* JADX INFO: renamed from: k */
    public static final String f35764k;

    /* JADX INFO: renamed from: l */
    public static final String f35765l;

    /* JADX INFO: renamed from: a */
    public final ex3 f35766a;

    /* JADX INFO: renamed from: b */
    public final qr3 f35767b;

    /* JADX INFO: renamed from: c */
    public final String f35768c;

    /* JADX INFO: renamed from: d */
    public final Protocol f35769d;

    /* JADX INFO: renamed from: e */
    public final int f35770e;

    /* JADX INFO: renamed from: f */
    public final String f35771f;

    /* JADX INFO: renamed from: g */
    public final qr3 f35772g;

    /* JADX INFO: renamed from: h */
    public final ar3 f35773h;

    /* JADX INFO: renamed from: i */
    public final long f35774i;

    /* JADX INFO: renamed from: j */
    public final long f35775j;

    static {
        C2927dg c2927dg = u87.f63590a;
        u87.f63590a.getClass();
        f35764k = "OkHttp-Sent-Millis";
        u87.f63590a.getClass();
        f35765l = "OkHttp-Received-Millis";
    }

    public dl0(yd9 yd9Var) throws IOException {
        ex3 ex3VarM10734a;
        TlsVersion tlsVersionM19599a;
        yd9Var.getClass();
        try {
            e18 e18Var = new e18(yd9Var);
            String strMo457D = e18Var.mo457D(Long.MAX_VALUE);
            try {
                dx3 dx3Var = new dx3();
                dx3Var.m10737d(null, strMo457D);
                ex3VarM10734a = dx3Var.m10734a();
            } catch (IllegalArgumentException unused) {
                ex3VarM10734a = null;
            }
            if (ex3VarM10734a == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strMo457D));
                C2927dg c2927dg = u87.f63590a;
                u87.f63590a.getClass();
                Log.w("OkHttp", "cache corruption", iOException);
                throw iOException;
            }
            this.f35766a = ex3VarM10734a;
            this.f35768c = e18Var.mo457D(Long.MAX_VALUE);
            or3 or3Var = new or3(0);
            int iM18238W = AbstractC3423or.m18238W(e18Var);
            for (int i = 0; i < iM18238W; i++) {
                or3Var.m18306l(e18Var.mo457D(Long.MAX_VALUE));
            }
            this.f35767b = or3Var.m18309w();
            C3047gq c3047gqM19796z = AbstractC3489q9.m19796z(e18Var.mo457D(Long.MAX_VALUE));
            this.f35769d = (Protocol) c3047gqM19796z.f41172c;
            this.f35770e = c3047gqM19796z.f41171b;
            this.f35771f = (String) c3047gqM19796z.f41173d;
            or3 or3Var2 = new or3(0);
            int iM18238W2 = AbstractC3423or.m18238W(e18Var);
            for (int i2 = 0; i2 < iM18238W2; i2++) {
                or3Var2.m18306l(e18Var.mo457D(Long.MAX_VALUE));
            }
            String str = f35764k;
            String strM18291B = or3Var2.m18291B(str);
            String str2 = f35765l;
            String strM18291B2 = or3Var2.m18291B(str2);
            or3Var2.m18300M(str);
            or3Var2.m18300M(str2);
            this.f35774i = strM18291B != null ? Long.parseLong(strM18291B) : 0L;
            this.f35775j = strM18291B2 != null ? Long.parseLong(strM18291B2) : 0L;
            this.f35772g = or3Var2.m18309w();
            if (this.f35766a.m11380f()) {
                String strMo457D2 = e18Var.mo457D(Long.MAX_VALUE);
                if (strMo457D2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo457D2 + '\"');
                }
                c21 c21VarM22377f = c21.f9327b.m22377f(e18Var.mo457D(Long.MAX_VALUE));
                List listM10446a = m10446a(e18Var);
                List listM10446a2 = m10446a(e18Var);
                if (e18Var.m10787a()) {
                    tlsVersionM19599a = TlsVersion.SSL_3_0;
                } else {
                    q1a q1aVar = TlsVersion.Companion;
                    String strMo457D3 = e18Var.mo457D(Long.MAX_VALUE);
                    q1aVar.getClass();
                    tlsVersionM19599a = q1a.m19599a(strMo457D3);
                }
                tlsVersionM19599a.getClass();
                this.f35773h = new ar3(tlsVersionM19599a, c21VarM22377f, kcb.m15119j(listM10446a2), new C3757xf(kcb.m15119j(listM10446a), 15));
            } else {
                this.f35773h = null;
            }
            yd9Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(yd9Var, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static List m10446a(e18 e18Var) throws IOException {
        int iM18238W = AbstractC3423or.m18238W(e18Var);
        if (iM18238W == -1) {
            return EmptyList.f47638a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM18238W);
            for (int i = 0; i < iM18238W; i++) {
                String strMo457D = e18Var.mo457D(Long.MAX_VALUE);
                aj0 aj0Var = new aj0();
                ByteString byteString = ByteString.f54513d;
                ByteString byteStringM14191f = iy5.m14191f(strMo457D);
                if (byteStringM14191f == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                aj0Var.m486j0(byteStringM14191f);
                arrayList.add(certificateFactory.generateCertificate(new yi0(aj0Var, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            v63.m23133k(e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10447b(d18 d18Var, List list) throws IOException {
        try {
            d18Var.mo477c0(list.size());
            d18Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                ByteString byteString = ByteString.f54513d;
                encoded.getClass();
                d18Var.mo461H(iy5.m14200p(encoded).mo18075a());
                d18Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            v63.m23133k(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10448c(C3552rx c3552rx) {
        ex3 ex3Var = this.f35766a;
        ar3 ar3Var = this.f35773h;
        qr3 qr3Var = this.f35772g;
        qr3 qr3Var2 = this.f35767b;
        d18 d18Var = new d18(c3552rx.m20975j(0));
        try {
            d18Var.mo461H(ex3Var.f38032i);
            d18Var.writeByte(10);
            d18Var.mo461H(this.f35768c);
            d18Var.writeByte(10);
            d18Var.mo477c0(qr3Var2.size());
            d18Var.writeByte(10);
            int size = qr3Var2.size();
            for (int i = 0; i < size; i++) {
                d18Var.mo461H(qr3Var2.m20122f(i));
                d18Var.mo461H(": ");
                d18Var.mo461H(qr3Var2.m20124h(i));
                d18Var.writeByte(10);
            }
            Protocol protocol = this.f35769d;
            int i2 = this.f35770e;
            String str = this.f35771f;
            protocol.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (protocol == Protocol.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            d18Var.mo461H(sb.toString());
            d18Var.writeByte(10);
            d18Var.mo477c0(qr3Var.size() + 2);
            d18Var.writeByte(10);
            int size2 = qr3Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                d18Var.mo461H(qr3Var.m20122f(i3));
                d18Var.mo461H(": ");
                d18Var.mo461H(qr3Var.m20124h(i3));
                d18Var.writeByte(10);
            }
            d18Var.mo461H(f35764k);
            d18Var.mo461H(": ");
            d18Var.mo477c0(this.f35774i);
            d18Var.writeByte(10);
            d18Var.mo461H(f35765l);
            d18Var.mo461H(": ");
            d18Var.mo477c0(this.f35775j);
            d18Var.writeByte(10);
            if (ex3Var.m11380f()) {
                d18Var.writeByte(10);
                ar3Var.getClass();
                d18Var.mo461H(ar3Var.f7383b.f9347a);
                d18Var.writeByte(10);
                m10447b(d18Var, ar3Var.m3000a());
                m10447b(d18Var, ar3Var.f7384c);
                d18Var.mo461H(ar3Var.f7382a.javaName());
                d18Var.writeByte(10);
            }
            d18Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3584sr.m21646y(d18Var, th);
                throw th2;
            }
        }
    }

    public dl0(j88 j88Var) {
        qr3 qr3VarM18309w;
        co7 co7Var = j88Var.f45201a;
        this.f35766a = (ex3) co7Var.f10360c;
        j88 j88Var2 = j88Var.f45209i;
        j88Var2.getClass();
        qr3 qr3Var = (qr3) j88Var2.f45201a.f10361d;
        qr3 qr3Var2 = j88Var.f45206f;
        Set setM18277r0 = AbstractC3423or.m18277r0(qr3Var2);
        if (setM18277r0.isEmpty()) {
            qr3VarM18309w = qr3.f58109b;
        } else {
            or3 or3Var = new or3(0);
            int size = qr3Var.size();
            for (int i = 0; i < size; i++) {
                String strM20122f = qr3Var.m20122f(i);
                if (setM18277r0.contains(strM20122f)) {
                    or3Var.m18305j(strM20122f, qr3Var.m20124h(i));
                }
            }
            qr3VarM18309w = or3Var.m18309w();
        }
        this.f35767b = qr3VarM18309w;
        this.f35768c = (String) co7Var.f10359b;
        this.f35769d = j88Var.f45202b;
        this.f35770e = j88Var.f45204d;
        this.f35771f = j88Var.f45203c;
        this.f35772g = qr3Var2;
        this.f35773h = j88Var.f45205e;
        this.f35774i = j88Var.f45212l;
        this.f35775j = j88Var.f45196H;
    }
}
