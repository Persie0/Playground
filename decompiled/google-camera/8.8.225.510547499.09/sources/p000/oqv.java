package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oqv {
    /* JADX INFO: renamed from: a */
    public static final String m18920a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: b */
    public static final String m18921b(Object obj) {
        obj.getClass();
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: c */
    public static final String m18922c(ols olsVar) {
        Object objM15591r;
        if (olsVar instanceof oxf) {
            return olsVar.toString();
        }
        try {
            objM15591r = olsVar + "@" + m18921b(olsVar);
        } catch (Throwable th) {
            objM15591r = lkm.m15591r(th);
        }
        if (okd.m18589a(objM15591r) != null) {
            objM15591r = olsVar.getClass().getName() + "@" + m18921b(olsVar);
        }
        return (String) objM15591r;
    }

    /* JADX INFO: renamed from: d */
    public static final oqy m18923d(oly olyVar) {
        olyVar.getClass();
        olv olvVar = olyVar.get(olu.f46271a);
        oqy oqyVar = olvVar instanceof oqy ? (oqy) olvVar : null;
        return oqyVar == null ? oqx.f46437a : oqyVar;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m18924e(onm onmVar, ols olsVar) throws Throwable {
        oxw oxwVar = new oxw(olsVar.mo18639d(), olsVar);
        Object objM15635ad = lku.m15635ad(oxwVar, oxwVar, onmVar);
        oma omaVar = oma.COROUTINE_SUSPENDED;
        return objM15635ad;
    }

    /* JADX INFO: renamed from: f */
    public static final oqs m18925f(oly olyVar) {
        olyVar.getClass();
        if (olyVar.get(ory.f46473c) == null) {
            olyVar = olyVar.plus(ooc.m18758x());
        }
        return new oxd(olyVar);
    }

    /* JADX INFO: renamed from: g */
    public static final oqs m18926g(oly olyVar) {
        return new oxd(olyVar);
    }

    /* JADX INFO: renamed from: h */
    public static final Throwable m18927h(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        lkm.m15595v(runtimeException, th);
        return runtimeException;
    }

    /* JADX INFO: renamed from: i */
    public static final void m18928i(oly olyVar, Throwable th) {
        olyVar.getClass();
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) olyVar.get(CoroutineExceptionHandler.f36712a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(olyVar, th);
            } else {
                oqp.m18917a(olyVar, th);
            }
        } catch (Throwable th2) {
            oqp.m18917a(olyVar, m18927h(th, th2));
        }
    }

    /* JADX INFO: renamed from: l */
    public static final oqo m18931l(Executor executor) {
        executor.getClass();
        orc orcVar = executor instanceof orc ? (orc) executor : null;
        return orcVar != null ? orcVar.f46445a : new orr(executor);
    }

    /* JADX INFO: renamed from: m */
    public static final CancellationException m18932m(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: n */
    public static final void m18933n(orb orbVar, ols olsVar, boolean z) {
        Object objM18888n = ((opy) orbVar).m18888n();
        Throwable thMo18891q = orbVar.mo18891q(objM18888n);
        Object objM15591r = thMo18891q != null ? lkm.m15591r(thMo18891q) : orbVar.mo18889o(objM18888n);
        if (!z) {
            olsVar.mo18640e(objM15591r);
            return;
        }
        oxf oxfVar = (oxf) olsVar;
        ols olsVar2 = oxfVar.f46766b;
        Object obj = oxfVar.f46768d;
        oly olyVarMo18639d = olsVar2.mo18639d();
        Object objM19165b = oyb.m19165b(olyVarMo18639d, obj);
        osx osxVarM18913c = objM19165b != oyb.f46804a ? oqn.m18913c(olsVar2, olyVarMo18639d, objM19165b) : null;
        try {
            oxfVar.f46766b.mo18640e(objM15591r);
            if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
            }
        } finally {
            if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
                oyb.m19166c(olyVarMo18639d, objM19165b);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m18934o(int i) {
        return i == 1 || i == 2;
    }
}
