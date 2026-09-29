package p103ep;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.EmptyList;
import kotlin.text.C7076b;
import mo.C7661i;
import to.C9347b;

/* JADX INFO: renamed from: ep.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5450d implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C5450d f34001a = new C5450d();

    /* JADX INFO: renamed from: a */
    public static List m11669a(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return EmptyList.f38032a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && C5207g.m11106a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return EmptyList.f38032a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11670b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (!(length2 >= 0)) {
            throw new IllegalArgumentException(C0166e.m762h("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (!(length2 <= str.length())) {
            StringBuilder sbM614j = C0141b.m614j("endIndex > string.length: ", length2, " > ");
            sbM614j.append(str.length());
            throw new IllegalArgumentException(sbM614j.toString().toString());
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i11 = i12;
                    } else {
                        j10 += (long) 4;
                        i11 += 2;
                    }
                }
                j10 += (long) i10;
            }
            i11++;
        }
        return length == ((int) j10);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0179  */
    /* JADX INFO: renamed from: c */
    public static boolean m11671c(String str, X509Certificate x509Certificate) {
        boolean zM11106a;
        int length;
        C5207g.m11111f(str, "host");
        C5207g.m11111f(x509Certificate, "certificate");
        byte[] bArr = C9347b.f48082a;
        boolean z10 = false;
        if (!C9347b.f48087f.m14271b(str)) {
            if (m11670b(str)) {
                Locale locale = Locale.US;
                C5207g.m11110e(locale, "US");
                str = str.toLowerCase(locale);
                C5207g.m11110e(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listM11669a = m11669a(x509Certificate, 2);
            if (!(listM11669a instanceof Collection) || !listM11669a.isEmpty()) {
                for (String lowerCase : listM11669a) {
                    if ((str.length() == 0) || C7661i.m15256V2(str, ".", false) || C7661i.m15248N2(str, "..")) {
                        zM11106a = false;
                    } else if ((lowerCase == null || lowerCase.length() == 0) || C7661i.m15256V2(lowerCase, ".", false) || C7661i.m15248N2(lowerCase, "..")) {
                        zM11106a = false;
                    } else {
                        String strM11116k = !C7661i.m15248N2(str, ".") ? C5207g.m11116k(".", str) : str;
                        if (!C7661i.m15248N2(lowerCase, ".")) {
                            lowerCase = C5207g.m11116k(".", lowerCase);
                        }
                        if (m11670b(lowerCase)) {
                            Locale locale2 = Locale.US;
                            C5207g.m11110e(locale2, "US");
                            lowerCase = lowerCase.toLowerCase(locale2);
                            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!C7076b.m14278X2(lowerCase, "*", false)) {
                            zM11106a = C5207g.m11106a(strM11116k, lowerCase);
                        } else if (!C7661i.m15256V2(lowerCase, "*.", false) || C7076b.m14284d3(lowerCase, '*', 1, false, 4) != -1 || strM11116k.length() < lowerCase.length() || C5207g.m11106a("*.", lowerCase)) {
                            zM11106a = false;
                        } else {
                            String strSubstring = lowerCase.substring(1);
                            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (C7661i.m15248N2(strM11116k, strSubstring) && ((length = strM11116k.length() - strSubstring.length()) <= 0 || C7076b.m14287g3(strM11116k, '.', length - 1, 4) == -1)) {
                                zM11106a = true;
                            } else {
                                zM11106a = false;
                            }
                        }
                    }
                    if (zM11106a) {
                        z10 = true;
                        break;
                    }
                }
            }
        } else {
            String strM375n2 = C0062b.m375n2(str);
            List listM11669a2 = m11669a(x509Certificate, 7);
            if (!(listM11669a2 instanceof Collection) || !listM11669a2.isEmpty()) {
                Iterator it = listM11669a2.iterator();
                while (it.hasNext()) {
                    if (C5207g.m11106a(strM375n2, C0062b.m375n2((String) it.next()))) {
                        z10 = true;
                        break;
                    }
                }
            }
        }
        return z10;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        C5207g.m11111f(str, "host");
        C5207g.m11111f(sSLSession, "session");
        if (!m11670b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return m11671c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
