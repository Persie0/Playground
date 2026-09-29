package p000;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class si4 {

    /* JADX INFO: renamed from: c */
    public static final si4 f60894c = new si4("ENABLED", 0);

    /* JADX INFO: renamed from: d */
    public static final si4 f60895d = new si4("DISABLED", 0);

    /* JADX INFO: renamed from: e */
    public static final si4 f60896e = new si4("DESTROYED", 0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60897a;

    /* JADX INFO: renamed from: b */
    public final String f60898b;

    public si4(String str, int i) {
        this.f60897a = i;
        switch (i) {
            case 1:
                str.getClass();
                this.f60898b = str;
                break;
            default:
                this.f60898b = str;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m21393c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m21394a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(m21393c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f60898b);
                    sb.append(m21393c(it.next()));
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m21395b(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        StringBuilder sb = new StringBuilder();
        m21394a(sb, it);
        return sb.toString();
    }

    public String toString() {
        boolean zContainsAlias;
        int i = this.f60897a;
        String str = this.f60898b;
        switch (i) {
            case 0:
                return str;
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    zContainsAlias = keyStore.containsAlias(str);
                    break;
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    zContainsAlias = false;
                }
                return AbstractC3393o1.m17740o(sb, zContainsAlias, "}");
        }
    }

    public si4(Object obj, String str) {
        this.f60897a = 2;
        this.f60898b = str;
    }
}
