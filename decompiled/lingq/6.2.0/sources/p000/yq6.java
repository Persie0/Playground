package p000;

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

/* JADX INFO: loaded from: classes.dex */
public final class yq6 implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final yq6 f70293a = new yq6();

    /* JADX INFO: renamed from: a */
    public static List m25283a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && fa4.m11650l(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25284b(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            C3386nv.m17624j(ux5.m22989l("endIndex < beginIndex: ", length2, " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            C3386nv.m17623i(str.length(), ux5.m22998u("endIndex > string.length: ", length2, " > "));
            return false;
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX INFO: renamed from: c */
    public static boolean m25285c(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        str.getClass();
        if (gcb.f40555a.m15427f(str)) {
            String strM12480b = gcb.m12480b(str);
            List listM25283a = m25283a(x509Certificate, 7);
            if (!(listM25283a instanceof Collection) || !listM25283a.isEmpty()) {
                Iterator it = listM25283a.iterator();
                while (it.hasNext()) {
                    if (fa4.m11650l(strM12480b, gcb.m12480b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (m25284b(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> listM25283a2 = m25283a(x509Certificate, 2);
        if (!(listM25283a2 instanceof Collection) || !listM25283a2.isEmpty()) {
            for (String lowerCase : listM25283a2) {
                if (str.length() == 0 || cl9.m4842Y(str, ".", false) || cl9.m4833P(str, "..", false) || lowerCase == null || lowerCase.length() == 0 || cl9.m4842Y(lowerCase, ".", false) || cl9.m4833P(lowerCase, "..", false)) {
                    zEquals = false;
                } else {
                    String strConcat = !cl9.m4833P(str, ".", false) ? str.concat(".") : str;
                    if (!cl9.m4833P(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (m25284b(lowerCase)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        lowerCase = lowerCase.toLowerCase(locale2);
                        lowerCase.getClass();
                    }
                    if (!vk9.m23380c0(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!cl9.m4842Y(lowerCase, "*.", false) || vk9.m23388k0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (cl9.m4833P(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || vk9.m23393p0(strConcat, '.', length - 1, 4) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (m25284b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return m25285c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
