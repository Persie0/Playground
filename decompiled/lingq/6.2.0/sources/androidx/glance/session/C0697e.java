package androidx.glance.session;

import android.content.Context;
import android.util.Log;
import androidx.concurrent.futures.AbstractC0465c;
import androidx.glance.appwidget.C0656d;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.ak1;
import p000.gk6;
import p000.gm0;
import p000.iu0;
import p000.ju0;
import p000.sz1;
import p000.tx6;
import p000.u91;
import p000.ux6;
import p000.xfa;

/* JADX INFO: renamed from: androidx.glance.session.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0697e {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f6265a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0698f f6266b;

    public C0697e(C0698f c0698f) {
        this.f6266b = c0698f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m2494a(Context context, String str, ContinuationImpl continuationImpl) throws Throwable {
        SessionManagerImpl$scope$1$isSessionRunning$1 sessionManagerImpl$scope$1$isSessionRunning$1;
        if (continuationImpl instanceof SessionManagerImpl$scope$1$isSessionRunning$1) {
            sessionManagerImpl$scope$1$isSessionRunning$1 = (SessionManagerImpl$scope$1$isSessionRunning$1) continuationImpl;
            int i = sessionManagerImpl$scope$1$isSessionRunning$1.f6150d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionManagerImpl$scope$1$isSessionRunning$1.f6150d = i - Integer.MIN_VALUE;
            } else {
                sessionManagerImpl$scope$1$isSessionRunning$1 = new SessionManagerImpl$scope$1$isSessionRunning$1(this, continuationImpl);
            }
        } else {
            sessionManagerImpl$scope$1$isSessionRunning$1 = new SessionManagerImpl$scope$1$isSessionRunning$1(this, continuationImpl);
        }
        Object objM2501a = sessionManagerImpl$scope$1$isSessionRunning$1.f6148b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sessionManagerImpl$scope$1$isSessionRunning$1.f6150d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2501a);
            C0702j c0702j = this.f6266b.f6269c;
            sessionManagerImpl$scope$1$isSessionRunning$1.f6147a = str;
            sessionManagerImpl$scope$1$isSessionRunning$1.f6150d = 1;
            objM2501a = c0702j.m2501a(context, str, sessionManagerImpl$scope$1$isSessionRunning$1);
            if (objM2501a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = sessionManagerImpl$scope$1$isSessionRunning$1.f6147a;
            AbstractC3193b.m15359b(objM2501a);
        }
        boolean zBooleanValue = ((Boolean) objM2501a).booleanValue();
        AbstractC0696d abstractC0696d = (AbstractC0696d) this.f6265a.get(str);
        return Boolean.valueOf((abstractC0696d != null ? abstractC0696d.f6262b.get() : false) && zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        if (r14 == r1) goto L41;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2495b(AbstractC0696d abstractC0696d, ContinuationImpl continuationImpl) throws Throwable {
        SessionManagerImpl$scope$1$recreateOrClose$1 sessionManagerImpl$scope$1$recreateOrClose$1;
        Object objMo9890g;
        if (continuationImpl instanceof SessionManagerImpl$scope$1$recreateOrClose$1) {
            sessionManagerImpl$scope$1$recreateOrClose$1 = (SessionManagerImpl$scope$1$recreateOrClose$1) continuationImpl;
            int i = sessionManagerImpl$scope$1$recreateOrClose$1.f6153c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionManagerImpl$scope$1$recreateOrClose$1.f6153c = i - Integer.MIN_VALUE;
            } else {
                sessionManagerImpl$scope$1$recreateOrClose$1 = new SessionManagerImpl$scope$1$recreateOrClose$1(this, continuationImpl);
            }
        } else {
            sessionManagerImpl$scope$1$recreateOrClose$1 = new SessionManagerImpl$scope$1$recreateOrClose$1(this, continuationImpl);
        }
        Object objM2225f = sessionManagerImpl$scope$1$recreateOrClose$1.f6151a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sessionManagerImpl$scope$1$recreateOrClose$1.f6153c;
        LinkedHashMap linkedHashMap = this.f6265a;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM2225f);
                return null;
            }
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM2225f);
            AbstractC0696d abstractC0696d2 = (AbstractC0696d) objM2225f;
            AbstractC0696d abstractC0696d3 = (AbstractC0696d) linkedHashMap.put(abstractC0696d2.f6261a, abstractC0696d2);
            if (abstractC0696d3 != null) {
                abstractC0696d3.f6264d.mo15331i(null);
                abstractC0696d3.f6262b.set(false);
                ((C0656d) abstractC0696d3).f6006m.mo4537a(null);
            }
            return objM2225f;
        }
        AbstractC3193b.m15359b(objM2225f);
        C3211a c3211a = abstractC0696d.f6264d;
        String str = abstractC0696d.f6261a;
        AtomicBoolean atomicBoolean = abstractC0696d.f6263c;
        AtomicBoolean atomicBoolean2 = abstractC0696d.f6262b;
        ArrayList arrayList = new ArrayList();
        do {
            objMo9890g = c3211a.mo9890g();
            Object objM14648a = ju0.m14648a(objMo9890g);
            if (objM14648a != null) {
                arrayList.add(objM14648a);
            }
        } while (!(objMo9890g instanceof iu0));
        if (!atomicBoolean2.get() || atomicBoolean.get() || arrayList.isEmpty()) {
            StringBuilder sbM17742q = AbstractC3393o1.m17742q("Closing session ", str, " wasOpen=");
            sbM17742q.append(!atomicBoolean2.get());
            sbM17742q.append(" hasError=");
            sbM17742q.append(atomicBoolean.get());
            sbM17742q.append(" events=");
            sbM17742q.append(arrayList);
            Log.d("GlanceSessionManager", sbM17742q.toString());
            sessionManagerImpl$scope$1$recreateOrClose$1.f6153c = 1;
            AbstractC0696d abstractC0696d4 = (AbstractC0696d) linkedHashMap.remove(str);
            if (abstractC0696d4 != null) {
                abstractC0696d4.f6264d.mo15331i(null);
                abstractC0696d4.f6262b.set(false);
                ((C0656d) abstractC0696d4).f6006m.mo4537a(null);
            }
            if (xfa.f68157a != coroutineSingletons) {
                return null;
            }
        } else {
            sessionManagerImpl$scope$1$recreateOrClose$1.f6153c = 2;
            objM2225f = C0656d.m2225f((C0656d) abstractC0696d, arrayList, sessionManagerImpl$scope$1$recreateOrClose$1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: c */
    public final Object m2496c(Context context, C0656d c0656d, ContinuationImpl continuationImpl) throws Throwable {
        SessionManagerImpl$scope$1$startSession$1 sessionManagerImpl$scope$1$startSession$1;
        Context context2;
        C0698f c0698f = this.f6266b;
        C0702j c0702j = c0698f.f6269c;
        Class cls = c0698f.f6267a;
        if (continuationImpl instanceof SessionManagerImpl$scope$1$startSession$1) {
            sessionManagerImpl$scope$1$startSession$1 = (SessionManagerImpl$scope$1$startSession$1) continuationImpl;
            int i = sessionManagerImpl$scope$1$startSession$1.f6157d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionManagerImpl$scope$1$startSession$1.f6157d = i - Integer.MIN_VALUE;
            } else {
                sessionManagerImpl$scope$1$startSession$1 = new SessionManagerImpl$scope$1$startSession$1(this, continuationImpl);
            }
        } else {
            sessionManagerImpl$scope$1$startSession$1 = new SessionManagerImpl$scope$1$startSession$1(this, continuationImpl);
        }
        Object obj = sessionManagerImpl$scope$1$startSession$1.f6155b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sessionManagerImpl$scope$1$startSession$1.f6157d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            AbstractC0696d abstractC0696d = (AbstractC0696d) this.f6265a.put(c0656d.f6261a, c0656d);
            if (abstractC0696d != null) {
                abstractC0696d.f6264d.mo15331i(null);
                abstractC0696d.f6262b.set(false);
                ((C0656d) abstractC0696d).f6006m.mo4537a(null);
            }
            ux6 ux6Var = (ux6) ((tx6) new tx6(cls).m15008g((sz1) c0698f.f6268b.invoke(c0698f, c0656d))).m15004a();
            String str = c0656d.f6261a;
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            sessionManagerImpl$scope$1$startSession$1.f6154a = context;
            sessionManagerImpl$scope$1$startSession$1.f6157d = 1;
            c0702j.getClass();
            context.getClass();
            C0773b c0773bM2910c = C0773b.m2910c(context);
            c0773bM2910c.getClass();
            Object objM1910a = AbstractC0465c.m1910a((gm0) c0773bM2910c.m2913b(str, existingWorkPolicy, ux6Var).f66742a, sessionManagerImpl$scope$1$startSession$1);
            if (objM1910a != coroutineSingletons) {
                objM1910a = xfaVar;
            }
            if (objM1910a != coroutineSingletons) {
                context2 = context;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        context2 = sessionManagerImpl$scope$1$startSession$1.f6154a;
        AbstractC3193b.m15359b(obj);
        sessionManagerImpl$scope$1$startSession$1.f6154a = null;
        sessionManagerImpl$scope$1$startSession$1.f6157d = 2;
        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.KEEP;
        tx6 tx6Var = (tx6) new tx6(cls).m15007f();
        tx6Var.f46873c.f55781j = new ak1(new gk6(null), NetworkType.NOT_REQUIRED, true, false, false, false, -1L, -1L, u91.m22627s1(new LinkedHashSet()));
        ux6 ux6Var2 = (ux6) tx6Var.m15004a();
        c0702j.getClass();
        context2.getClass();
        C0773b c0773bM2910c2 = C0773b.m2910c(context2);
        c0773bM2910c2.getClass();
        Object objM1910a2 = AbstractC0465c.m1910a((gm0) c0773bM2910c2.m2913b("sessionWorkerKeepEnabled", existingWorkPolicy2, ux6Var2).f66742a, sessionManagerImpl$scope$1$startSession$1);
        if (objM1910a2 != coroutineSingletons) {
            objM1910a2 = xfaVar;
        }
        if (objM1910a2 != coroutineSingletons) {
            objM1910a2 = xfaVar;
        }
        return objM1910a2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
