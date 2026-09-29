package p000;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class qa0 extends vz1 {

    /* JADX INFO: renamed from: l */
    public final tb0 f57485l;

    public qa0(tb0 tb0Var) {
        tb0Var.getClass();
        this.f57485l = tb0Var;
    }

    /* JADX INFO: renamed from: q0 */
    public static boolean m19835q0(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i) {
        if (!fa4.m11650l(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qa0) && fa4.m11650l(((qa0) obj).f57485l, this.f57485l);
    }

    public final int hashCode() {
        return this.f57485l.hashCode();
    }

    @Override // p000.vz1
    /* JADX INFO: renamed from: q */
    public final List mo19836q(String str, List list) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        list.getClass();
        str.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        objRemoveFirst.getClass();
        arrayList.add(objRemoveFirst);
        int i = 0;
        boolean z = false;
        while (i < 9) {
            Object obj = arrayList.get(arrayList.size() - 1);
            obj.getClass();
            X509Certificate x509Certificate2 = (X509Certificate) obj;
            tb0 tb0Var = this.f57485l;
            tb0Var.getClass();
            Set set = (Set) tb0Var.f62089a.get(x509Certificate2.getIssuerX500Principal());
            X509Certificate x509Certificate3 = null;
            Object obj2 = null;
            if (set != null) {
                for (Object obj3 : set) {
                    try {
                        x509Certificate2.verify(((X509Certificate) obj3).getPublicKey());
                        obj2 = obj3;
                        break;
                    } catch (Exception unused) {
                    }
                }
                x509Certificate3 = (X509Certificate) obj2;
            }
            if (x509Certificate3 != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509Certificate3)) {
                    arrayList.add(x509Certificate3);
                }
                if (m19835q0(x509Certificate3, x509Certificate3, arrayList.size() - 2)) {
                    return arrayList;
                }
                z = true;
                i++;
                z = z;
            } else {
                Iterator it = arrayDeque.iterator();
                it.getClass();
                do {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    next.getClass();
                    x509Certificate = (X509Certificate) next;
                } while (!m19835q0(x509Certificate2, x509Certificate, arrayList.size() - 1));
                it.remove();
                arrayList.add(x509Certificate);
                i++;
                z = z;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
