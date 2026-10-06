package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nxq extends nwc {

    /* JADX INFO: renamed from: aH */
    public static final Map f44979aH = new ConcurrentHashMap();

    /* JADX INFO: renamed from: aI */
    public int f44980aI = -1;

    /* JADX INFO: renamed from: aJ */
    public nzy f44981aJ = nzy.f45105a;

    /* JADX INFO: renamed from: Q */
    public static nxq m18123Q(nxq nxqVar, byte[] bArr, int i, int i2, nxf nxfVar) throws nyb {
        nxq nxqVarM18138P = nxqVar.m18138P();
        try {
            nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
            nzmVarM18260b.mo18253i(nxqVarM18138P, bArr, i, i + i2, new nwh(nxfVar));
            nzmVarM18260b.mo18250f(nxqVarM18138P);
            return nxqVarM18138P;
        } catch (nyb e) {
            if (e.f44994a) {
                throw new nyb(e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof nyb) {
                throw ((nyb) e2.getCause());
            }
            throw new nyb(e2);
        } catch (IndexOutOfBoundsException e3) {
            throw nyb.m18167i();
        } catch (nzx e4) {
            throw e4.m18328a();
        }
    }

    /* JADX INFO: renamed from: R */
    public static nxv m18124R(nxv nxvVar) {
        int size = nxvVar.size();
        return nxvVar.mo17775e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: S */
    public static nxw m18125S(nxw nxwVar) {
        int size = nxwVar.size();
        return nxwVar.mo17775e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: T */
    public static nxx m18126T(nxx nxxVar) {
        int size = nxxVar.size();
        return nxxVar.mo17775e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: U */
    public static nxy m18127U(nxy nxyVar) {
        int size = nxyVar.size();
        return nxyVar.mo17775e(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: W */
    static Object m18128W(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: X */
    protected static Object m18129X(nyw nywVar, String str, Object[] objArr) {
        return new nzh(nywVar, str, objArr);
    }

    /* JADX INFO: renamed from: aa */
    protected static void m18130aa(Class cls, nxq nxqVar) {
        nxqVar.m18141Z();
        f44979aH.put(cls, nxqVar);
    }

    /* JADX INFO: renamed from: ab */
    protected static final boolean m18131ab(nxq nxqVar, boolean z) {
        byte bByteValue = ((Byte) nxqVar.m18143ad(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo18255k = nzf.f45060a.m18260b(nxqVar).mo18255k(nxqVar);
        if (z) {
            nxqVar.mo3994a(2, true != zMo18255k ? null : nxqVar);
        }
        return zMo18255k;
    }

    /* JADX INFO: renamed from: ae */
    public static void m18132ae(nxq nxqVar) throws nyb {
        if (nxqVar != null && !nxqVar.mo18098cz()) {
            throw m17756K().m18328a();
        }
    }

    /* JADX INFO: renamed from: af */
    public static ktz m18133af(nyw nywVar, Object obj, nyw nywVar2, int i, oaj oajVar) {
        return new ktz(nywVar, obj, nywVar2, new nxp(i, oajVar));
    }

    /* JADX INFO: renamed from: L */
    public final int m18134L() {
        return nzf.f45060a.m18260b(this).mo18247b(this);
    }

    /* JADX INFO: renamed from: M */
    public final int m18135M(nzm nzmVar) {
        return nzmVar == null ? nzf.f45060a.m18260b(this).mo18246a(this) : nzmVar.mo18246a(this);
    }

    /* JADX INFO: renamed from: O */
    public final nxl m18137O() {
        return (nxl) m18143ad(5);
    }

    /* JADX INFO: renamed from: P */
    public final nxq m18138P() {
        return (nxq) m18143ad(4);
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: V */
    public final nzd mo18139V() {
        return (nzd) m18143ad(7);
    }

    /* JADX INFO: renamed from: Y */
    protected final void m18140Y() {
        nzf.f45060a.m18260b(this).mo18250f(this);
        m18141Z();
    }

    /* JADX INFO: renamed from: Z */
    final void m18141Z() {
        this.f44980aI &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    protected abstract Object mo3994a(int i, Object obj);

    /* JADX INFO: renamed from: ac */
    public final boolean m18142ac() {
        return (this.f44980aI & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: ad */
    public final Object m18143ad(int i) {
        return mo3994a(i, null);
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: bg */
    public final /* synthetic */ nyv mo17761bg() {
        return (nxl) m18143ad(5);
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: cl */
    public final /* synthetic */ nyv mo17763cl() {
        nxl nxlVar = (nxl) m18143ad(5);
        nxlVar.m18108s(this);
        return nxlVar;
    }

    @Override // p000.nyx
    /* JADX INFO: renamed from: cx */
    public final /* synthetic */ nyw mo18097cx() {
        return (nxq) m18143ad(6);
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: cy */
    public final void mo17764cy(nxb nxbVar) {
        nzm nzmVarM18260b = nzf.f45060a.m18260b(this);
        liv livVar = nxbVar.f44894f;
        if (livVar == null) {
            livVar = new liv(nxbVar);
        }
        nzmVarM18260b.mo18256l(this, livVar);
    }

    @Override // p000.nyx
    /* JADX INFO: renamed from: cz */
    public final boolean mo18098cz() {
        return m18131ab(this, Boolean.TRUE.booleanValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return nzf.f45060a.m18260b(this).mo18254j(this, (nxq) obj);
        }
        return false;
    }

    public final int hashCode() {
        if (m18142ac()) {
            return m18134L();
        }
        int i = this.f44820aG;
        if (i != 0) {
            return i;
        }
        int iM18134L = m18134L();
        this.f44820aG = iM18134L;
        return iM18134L;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        nyy.m18198b(this, sb, 0);
        return sb.toString();
    }

    @Override // p000.nwc
    /* JADX INFO: renamed from: G */
    public final int mo17757G(nzm nzmVar) {
        if (m18142ac()) {
            int iM18135M = m18135M(nzmVar);
            if (iM18135M >= 0) {
                return iM18135M;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
        }
        int i = this.f44980aI & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iM18135M2 = m18135M(nzmVar);
        if (iM18135M2 >= 0) {
            this.f44980aI = (this.f44980aI & Integer.MIN_VALUE) | iM18135M2;
            return iM18135M2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M2);
    }

    @Override // p000.nyw
    /* JADX INFO: renamed from: N */
    public final int mo18136N() {
        int iM18135M;
        if (m18142ac()) {
            iM18135M = m18135M(null);
            if (iM18135M < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
            }
        } else {
            iM18135M = this.f44980aI & Integer.MAX_VALUE;
            if (iM18135M == Integer.MAX_VALUE) {
                iM18135M = m18135M(null);
                if (iM18135M < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                }
                this.f44980aI = (this.f44980aI & Integer.MIN_VALUE) | iM18135M;
            }
        }
        return iM18135M;
    }
}
