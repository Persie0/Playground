package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: nk */
/* JADX INFO: loaded from: classes.dex */
public class C3375nk implements jd9 {

    /* JADX INFO: renamed from: e */
    public static final nj0 f52867e = new nj0(7);

    /* JADX INFO: renamed from: a */
    public final Class f52868a;

    /* JADX INFO: renamed from: b */
    public final Method f52869b;

    /* JADX INFO: renamed from: c */
    public final Method f52870c;

    /* JADX INFO: renamed from: d */
    public final Method f52871d;

    public C3375nk(Class cls) throws NoSuchMethodException {
        this.f52868a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.f52869b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f52870c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f52871d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: a */
    public final boolean mo206a(SSLSocket sSLSocket) {
        return this.f52868a.isInstance(sSLSocket);
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: b */
    public final boolean mo207b() {
        int i = AbstractC3687vj.f65427c;
        return false;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: c */
    public final String mo208c(SSLSocket sSLSocket) {
        if (this.f52868a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f52870c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, yu0.f70463a);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (!(cause instanceof NullPointerException) || !fa4.m11650l(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e2);
                }
            }
        }
        return null;
    }

    @Override // p000.jd9
    /* JADX INFO: renamed from: d */
    public final void mo209d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.f52868a.isInstance(sSLSocket)) {
            try {
                this.f52869b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f52871d;
                C2927dg c2927dg = u87.f63590a;
                method.invoke(sSLSocket, jj5.m14498e(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
