package p057cp;

import dm.C5207g;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import mo.C7661i;

/* JADX INFO: renamed from: cp.e */
/* JADX INFO: loaded from: classes2.dex */
public class C4991e implements C4996j.a {

    /* JADX INFO: renamed from: a */
    public final String f32571a;

    public C4991e() {
        this.f32571a = "com.google.android.gms.org.conscrypt";
    }

    public C4991e(String str) {
        str.getClass();
        this.f32571a = str;
    }

    @Override // p057cp.C4996j.a
    /* JADX INFO: renamed from: a */
    public boolean mo10694a(SSLSocket sSLSocket) {
        return C7661i.m15256V2(sSLSocket.getClass().getName(), C5207g.m11116k(".", this.f32571a), false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p057cp.C4996j.a
    /* JADX INFO: renamed from: b */
    public InterfaceC4997k mo10695b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!C5207g.m11106a(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(C5207g.m11116k(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new C4992f(superclass);
    }

    /* JADX INFO: renamed from: c */
    public void m10696c(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(m10697d(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f32571a);
                    sb2.append(m10697d(it.next()));
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m10697d(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
