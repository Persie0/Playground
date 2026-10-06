package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.lens.sdk.LensApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ooc {
    /* JADX INFO: renamed from: a */
    public static int m18735a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m18736b(String str) {
        okh okhVar = new okh("lateinit property " + str + xRFdVyfdeve.SNTQdxkgjqA);
        m18738d(okhVar, ooc.class.getName());
        throw okhVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18737c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    static void m18738d(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: e */
    public static String m18739e(ooa ooaVar) {
        String string = ooaVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18740f(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX INFO: renamed from: g */
    public static void m18741g(int i) {
        oot ootVar = new oot(2, 36);
        if (ootVar.f46357a > i || i > ootVar.f46358b) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new oot(2, 36));
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m18742h(char c, char c2) {
        return c == c2;
    }

    /* JADX INFO: renamed from: i */
    public static opa m18743i(onm onmVar) {
        return new opd(onmVar, 0);
    }

    /* JADX INFO: renamed from: j */
    public static List m18744j(opa opaVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itMo18817a = opaVar.mo18817a();
        while (itMo18817a.hasNext()) {
            arrayList.add(itMo18817a.next());
        }
        switch (arrayList.size()) {
            case 0:
                return okv.f46215a;
            case 1:
                return omn.m18666F(arrayList.get(0));
            default:
                return arrayList;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Object m18745k(oly olyVar, onm onmVar) throws Throwable {
        orj orjVarM19021a;
        oly olyVarM18912b;
        olyVar.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        olu oluVar = (olu) olyVar.get(olu.f46271a);
        if (oluVar == null) {
            ThreadLocal threadLocal = oss.f46499a;
            orjVarM19021a = oss.m19021a();
            olyVarM18912b = oqn.m18912b(ors.f46467a, olyVar.plus(orjVarM19021a));
        } else {
            if (oluVar instanceof orj) {
            }
            ThreadLocal threadLocal2 = oss.f46499a;
            orjVarM19021a = (orj) oss.f46499a.get();
            olyVarM18912b = oqn.m18912b(ors.f46467a, olyVar);
        }
        ops opsVar = new ops(olyVarM18912b, threadCurrentThread, orjVarM19021a);
        opsVar.m18861cU(1, opsVar, onmVar);
        orj orjVar = opsVar.f46402b;
        if (orjVar != null) {
            orjVar.m18956m(false);
        }
        while (!Thread.interrupted()) {
            try {
                orj orjVar2 = opsVar.f46402b;
                long jMo18953j = orjVar2 != null ? orjVar2.mo18953j() : Long.MAX_VALUE;
                if (opsVar.m19008H()) {
                    orj orjVar3 = opsVar.f46402b;
                    if (orjVar3 != null) {
                        orjVar3.m18954k(false);
                    }
                    Object objM19017b = osh.m19017b(opsVar.m19010cV());
                    oqg oqgVar = objM19017b instanceof oqg ? (oqg) objM19017b : null;
                    if (oqgVar == null) {
                        return objM19017b;
                    }
                    throw oqgVar.f46421b;
                }
                LockSupport.parkNanos(opsVar, jMo18953j);
            } catch (Throwable th) {
                orj orjVar4 = opsVar.f46402b;
                if (orjVar4 != null) {
                    orjVar4.m18954k(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        opsVar.m19005E(interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ ory m18746l(oqs oqsVar, oly olyVar, onm onmVar, int i) {
        if ((i & 1) != 0) {
            olyVar = olz.f46282a;
        }
        oqsVar.getClass();
        olyVar.getClass();
        osp ospVar = new osp(oqn.m18912b(oqsVar, olyVar));
        ospVar.m18861cU(1, ospVar, onmVar);
        return ospVar;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m18747m(onm onmVar) {
        return m18745k(olz.f46282a, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public static Object m18748n(oub oubVar, omx omxVar, ols olsVar) throws Throwable {
        oua ouaVar;
        if (olsVar instanceof oua) {
            ouaVar = (oua) olsVar;
            int i = ouaVar.f46570b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ouaVar.f46570b = i - Integer.MIN_VALUE;
            } else {
                ouaVar = new oua(olsVar);
            }
        } else {
            ouaVar = new oua(olsVar);
        }
        Object obj = ouaVar.f46569a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (ouaVar.f46570b) {
            case 0:
                lkm.m15592s(obj);
                if (ouaVar.mo18639d().get(ory.f46473c) != oubVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                try {
                    ouaVar.f46571c = omxVar;
                    ouaVar.f46570b = 1;
                    opy opyVar = new opy(omn.m18701f(ouaVar), 1);
                    opyVar.m18898x();
                    oubVar.f46543b.mo19061w(new avu(opyVar, 10));
                    if (opyVar.m18887m() == omaVar) {
                        return omaVar;
                    }
                    omxVar.mo2077a();
                    return oki.f46196a;
                } catch (Throwable th) {
                    th = th;
                    omxVar.mo2077a();
                    throw th;
                }
            case 1:
                omxVar = ouaVar.f46571c;
                try {
                    lkm.m15592s(obj);
                    omxVar.mo2077a();
                    return oki.f46196a;
                } catch (Throwable th2) {
                    th = th2;
                    omxVar.mo2077a();
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m18749o(oud oudVar, Throwable th) {
        oudVar.getClass();
        CancellationException cancellationExceptionM18932m = null;
        if (th != null) {
            cancellationExceptionM18932m = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM18932m == null) {
                cancellationExceptionM18932m = oqv.m18932m("Channel was consumed, consumer had failed", th);
            }
        }
        oudVar.mo19049r(cancellationExceptionM18932m);
    }

    /* JADX INFO: renamed from: p */
    public static void m18750p(ouh ouhVar, Object obj) {
        Object objMo19057s = ouhVar.mo19057s(obj);
        if (objMo19057s instanceof ott) {
            Object obj2 = ((otu) m18747m(new otv(ouhVar, obj, null))).f46546b;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Object m18751q(Throwable th) {
        return new ots(th);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v13, types: [ols, omg] */
    /* JADX WARN: Type inference failed for: r8v9, types: [ols, omg] */
    /* JADX INFO: renamed from: s */
    public static Object m18753s(long j, onm onmVar, ols olsVar) throws Throwable {
        osv osvVar;
        ost e;
        ooi ooiVar;
        Object oqgVar;
        if (olsVar instanceof osv) {
            osvVar = (osv) olsVar;
            int i = osvVar.f46503b;
            if ((i & Integer.MIN_VALUE) != 0) {
                osvVar.f46503b = i - Integer.MIN_VALUE;
            } else {
                osvVar = new osv(olsVar);
            }
        } else {
            osvVar = new osv(olsVar);
        }
        Object objM19017b = osvVar.f46502a;
        Object obj = oma.COROUTINE_SUSPENDED;
        switch (osvVar.f46503b) {
            case 0:
                lkm.m15592s(objM19017b);
                if (j <= 0) {
                    return null;
                }
                ooi ooiVar2 = new ooi();
                try {
                    osvVar.f46504c = ooiVar2;
                    osvVar.f46503b = 1;
                    osu osuVar = new osu(j, osvVar);
                    ooiVar2.f46351a = osuVar;
                    osuVar.mo18973cY(false, true, new orh(oqv.m18923d(osuVar.f46797e.mo18639d()).mo18940f(osuVar.f46501b, osuVar, ((opp) osuVar).f46400a)));
                    onmVar.getClass();
                    try {
                        ook.m18788b(onmVar, 2);
                        oqgVar = onmVar.mo560a(osuVar, osuVar);
                        break;
                    } catch (Throwable th) {
                        oqgVar = new oqg(th);
                    }
                    Object obj2 = oma.COROUTINE_SUSPENDED;
                    if (oqgVar == obj2) {
                        objM19017b = obj2;
                    } else {
                        Object objM19011cW = osuVar.m19011cW(oqgVar);
                        if (objM19011cW == osh.f46491b) {
                            objM19017b = oma.COROUTINE_SUSPENDED;
                        } else {
                            if (objM19011cW instanceof oqg) {
                                Throwable th2 = ((oqg) objM19011cW).f46421b;
                                if ((th2 instanceof ost) && ((ost) th2).f46500a == osuVar) {
                                    if (oqgVar instanceof oqg) {
                                        Throwable th3 = ((oqg) oqgVar).f46421b;
                                        ?? r8 = osuVar.f46797e;
                                        if (oqu.f46433b && (r8 instanceof omg)) {
                                            throw oxy.m19156a(th3, r8);
                                        }
                                        throw th3;
                                    }
                                    objM19017b = oqgVar;
                                }
                                ?? r7 = osuVar.f46797e;
                                if (!oqu.f46433b) {
                                    throw th2;
                                }
                                if (r7 instanceof omg) {
                                    throw oxy.m19156a(th2, r7);
                                }
                                throw th2;
                            }
                            objM19017b = osh.m19017b(objM19011cW);
                        }
                    }
                    return objM19017b == obj ? obj : objM19017b;
                } catch (ost e2) {
                    e = e2;
                    ooiVar = ooiVar2;
                    if (e.f46500a == ooiVar.f46351a) {
                        return null;
                    }
                    throw e;
                }
            case 1:
                ooiVar = osvVar.f46504c;
                try {
                    lkm.m15592s(objM19017b);
                } catch (ost e3) {
                    e = e3;
                    if (e.f46500a == ooiVar.f46351a) {
                        return null;
                    }
                    throw e;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m18754t(oly olyVar, CancellationException cancellationException) {
        olyVar.getClass();
        ory oryVar = (ory) olyVar.get(ory.f46473c);
        if (oryVar != null) {
            oryVar.mo18977r(cancellationException);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m18755u(oly olyVar) {
        olyVar.getClass();
        ory oryVar = (ory) olyVar.get(ory.f46473c);
        if (oryVar != null) {
            m18756v(oryVar);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m18756v(ory oryVar) {
        if (!oryVar.mo18974cZ()) {
            throw oryVar.mo18975o();
        }
    }

    /* JADX INFO: renamed from: w */
    public static boolean m18757w(oly olyVar) {
        ory oryVar = (ory) olyVar.get(ory.f46473c);
        return oryVar != null && oryVar.mo18974cZ();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ osb m18758x() {
        return new osb();
    }

    /* JADX INFO: renamed from: y */
    public static liv m18759y(int i) {
        return new liv(i);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ otq m18752r(int i, int i2, int i3) {
        int i4 = 1;
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i2 == 0) {
            throw null;
        }
        if (1 == (i3 & 1)) {
            i = 0;
        }
        switch (i) {
            case -2:
                return new oto(i2 == 1 ? otp.f46542a : 1, i2);
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                if (i2 == 1) {
                    return new otz();
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            case 0:
                return i2 == 1 ? new ouf() : new oto(1, 2);
            default:
                if (i != 1) {
                    i4 = i;
                } else if (i2 == 2) {
                    return new otz();
                }
                return new oto(i4, i2);
        }
    }
}
