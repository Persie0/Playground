package p057cp;

import dm.C5207g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import mo.C7653a;
import okhttp3.Protocol;
import p034bp.C1634b;
import p034bp.C1640h;

/* JADX INFO: renamed from: cp.f */
/* JADX INFO: loaded from: classes2.dex */
public class C4992f implements InterfaceC4997k {

    /* JADX INFO: renamed from: f */
    public static final C4991e f32572f = new C4991e();

    /* JADX INFO: renamed from: a */
    public final Class<? super SSLSocket> f32573a;

    /* JADX INFO: renamed from: b */
    public final Method f32574b;

    /* JADX INFO: renamed from: c */
    public final Method f32575c;

    /* JADX INFO: renamed from: d */
    public final Method f32576d;

    /* JADX INFO: renamed from: e */
    public final Method f32577e;

    public C4992f(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        this.f32573a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C5207g.m11110e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f32574b = declaredMethod;
        this.f32575c = cls.getMethod("setHostname", String.class);
        this.f32576d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f32577e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: a */
    public final boolean mo10690a(SSLSocket sSLSocket) {
        return this.f32573a.isInstance(sSLSocket);
    }

    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: b */
    public final String mo10691b(SSLSocket sSLSocket) {
        if (!this.f32573a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f32576d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, C7653a.f42116b);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && C5207g.m11106a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p057cp.InterfaceC4997k
    /* JADX INFO: renamed from: c */
    public final void mo10692c(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        C5207g.m11111f(list, "protocols");
        if (this.f32573a.isInstance(sSLSocket)) {
            try {
                this.f32574b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f32575c.invoke(sSLSocket, str);
                }
                Method method = this.f32577e;
                C1640h c1640h = C1640h.f9199a;
                method.invoke(sSLSocket, C1640h.a.m5336b(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // p057cp.InterfaceC4997k
    public final boolean isSupported() {
        boolean z10 = C1634b.f9178e;
        return C1634b.f9178e;
    }
}
