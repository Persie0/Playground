package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oxg {

    /* JADX INFO: renamed from: a */
    public static final oxz f46770a = new oxz(BEeWZPor.dZdeP);

    /* JADX INFO: renamed from: b */
    public static final oxz f46771b = new oxz("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: a */
    public static final void m19129a(ols olsVar, Object obj) {
        if (!(olsVar instanceof oxf)) {
            olsVar.mo18640e(obj);
            return;
        }
        oxf oxfVar = (oxf) olsVar;
        Object objM18770H = ook.m18770H(obj);
        if (oxfVar.f46765a.mo18916e(oxfVar.mo18639d())) {
            oxfVar.f46767c = objM18770H;
            oxfVar.f46444f = 1;
            oxfVar.f46765a.mo18915d(oxfVar.mo18639d(), oxfVar);
            return;
        }
        boolean z = oqu.f46432a;
        ThreadLocal threadLocal = oss.f46499a;
        orj orjVarM19021a = oss.m19021a();
        if (orjVarM19021a.m18957n()) {
            oxfVar.f46767c = objM18770H;
            oxfVar.f46444f = 1;
            orjVarM19021a.m18955l(oxfVar);
            return;
        }
        orjVarM19021a.m18956m(true);
        try {
            ory oryVar = (ory) oxfVar.mo18639d().get(ory.f46473c);
            if (oryVar == null || oryVar.mo18974cZ()) {
                ols olsVar2 = oxfVar.f46766b;
                Object obj2 = oxfVar.f46768d;
                oly olyVarMo18639d = olsVar2.mo18639d();
                Object objM19165b = oyb.m19165b(olyVarMo18639d, obj2);
                osx osxVarM18913c = objM19165b != oyb.f46804a ? oqn.m18913c(olsVar2, olyVarMo18639d, objM19165b) : null;
                try {
                    oxfVar.f46766b.mo18640e(obj);
                    if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
                        oyb.m19166c(olyVarMo18639d, objM19165b);
                    }
                } catch (Throwable th) {
                    if (osxVarM18913c == null || osxVarM18913c.m19023M()) {
                        oyb.m19166c(olyVarMo18639d, objM19165b);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionMo18975o = oryVar.mo18975o();
                oxfVar.mo18895u(objM18770H, cancellationExceptionMo18975o);
                oxfVar.mo18640e(lkm.m15591r(cancellationExceptionMo18975o));
            }
            while (orjVarM19021a.m18958o()) {
            }
        } catch (Throwable th2) {
            try {
                oxfVar.m18946B(th2, null);
            } finally {
                orjVarM19021a.m18954k(true);
            }
        }
    }
}
