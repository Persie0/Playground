package p034bp;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C6744b;
import okhttp3.Protocol;
import p057cp.C4987a;
import p057cp.C4988b;
import p057cp.C4992f;
import p057cp.C4993g;
import p057cp.C4995i;
import p057cp.C4996j;
import p057cp.InterfaceC4997k;
import p103ep.AbstractC5449c;
import p103ep.C5447a;

/* JADX INFO: renamed from: bp.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1633a extends C1640h {

    /* JADX INFO: renamed from: d */
    public static final boolean f9176d;

    /* JADX INFO: renamed from: c */
    public final ArrayList f9177c;

    static {
        f9176d = C1640h.a.m5337c() && Build.VERSION.SDK_INT >= 29;
    }

    public C1633a() {
        InterfaceC4997k[] interfaceC4997kArr = new InterfaceC4997k[4];
        interfaceC4997kArr[0] = C1640h.a.m5337c() && Build.VERSION.SDK_INT >= 29 ? new C4987a() : null;
        interfaceC4997kArr[1] = new C4996j(C4992f.f32572f);
        interfaceC4997kArr[2] = new C4996j(C4995i.f32582a);
        interfaceC4997kArr[3] = new C4996j(C4993g.f32578a);
        ArrayList arrayListM13378j0 = C6744b.m13378j0(interfaceC4997kArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListM13378j0.iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    this.f9177c = arrayList;
                    return;
                } else {
                    Object next = it.next();
                    if (((InterfaceC4997k) next).isSupported()) {
                        arrayList.add(next);
                    }
                }
            }
        }
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: b */
    public final AbstractC5449c mo5317b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        AbstractC5449c c5447a = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            c5447a = new C4988b(x509TrustManager, x509TrustManagerExtensions);
        }
        if (c5447a == null) {
            c5447a = new C5447a(mo5321c(x509TrustManager));
        }
        return c5447a;
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: d */
    public final void mo5318d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        Object next;
        C5207g.m11111f(list, "protocols");
        Iterator it = this.f9177c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC4997k) next).mo10690a(sSLSocket));
        InterfaceC4997k interfaceC4997k = (InterfaceC4997k) next;
        if (interfaceC4997k == null) {
            return;
        }
        interfaceC4997k.mo10692c(sSLSocket, str, list);
    }

    @Override // p034bp.C1640h
    /* JADX INFO: renamed from: f */
    public final String mo5319f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f9177c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC4997k) next).mo10690a(sSLSocket));
        InterfaceC4997k interfaceC4997k = (InterfaceC4997k) next;
        if (interfaceC4997k == null) {
            return null;
        }
        return interfaceC4997k.mo10691b(sSLSocket);
    }

    @Override // p034bp.C1640h
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public final boolean mo5320h(String str) {
        C5207g.m11111f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
