package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c76;
import p000.cx7;
import p000.iz8;
import p000.n58;
import p000.zi3;

/* JADX INFO: renamed from: androidx.glance.session.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C0698f implements iz8 {

    /* JADX INFO: renamed from: a */
    public final Class f6267a;

    /* JADX INFO: renamed from: b */
    public final cx7 f6268b;

    /* JADX INFO: renamed from: c */
    public final C0702j f6269c;

    /* JADX INFO: renamed from: d */
    public final C3248a f6270d;

    /* JADX INFO: renamed from: e */
    public final C0697e f6271e;

    public C0698f() {
        cx7 cx7Var = new cx7(10);
        C0702j c0702j = n58.f52377e;
        this.f6267a = SessionWorker.class;
        this.f6268b = cx7Var;
        this.f6269c = c0702j;
        this.f6270d = new C3248a();
        this.f6271e = new C0697e(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static Object m2497b(C0698f c0698f, zi3 zi3Var, ContinuationImpl continuationImpl) {
        SessionManagerImpl$runWithLock$1 sessionManagerImpl$runWithLock$1;
        C3248a c3248a;
        zi3 zi3Var2;
        c76 c76Var;
        if (continuationImpl instanceof SessionManagerImpl$runWithLock$1) {
            sessionManagerImpl$runWithLock$1 = (SessionManagerImpl$runWithLock$1) continuationImpl;
            int i = sessionManagerImpl$runWithLock$1.f6146f;
            if ((i & Integer.MIN_VALUE) != 0) {
                sessionManagerImpl$runWithLock$1.f6146f = i - Integer.MIN_VALUE;
            } else {
                sessionManagerImpl$runWithLock$1 = new SessionManagerImpl$runWithLock$1(c0698f, continuationImpl);
            }
        } else {
            sessionManagerImpl$runWithLock$1 = new SessionManagerImpl$runWithLock$1(c0698f, continuationImpl);
        }
        Object obj = sessionManagerImpl$runWithLock$1.f6144d;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sessionManagerImpl$runWithLock$1.f6146f;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                c3248a = c0698f.f6270d;
                sessionManagerImpl$runWithLock$1.f6141a = c0698f;
                sessionManagerImpl$runWithLock$1.f6142b = (SuspendLambda) zi3Var;
                sessionManagerImpl$runWithLock$1.f6143c = c3248a;
                sessionManagerImpl$runWithLock$1.f6146f = 1;
                if (c3248a.mo4388c(sessionManagerImpl$runWithLock$1) != obj2) {
                }
                zi3Var2 = zi3Var;
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c76Var = (c76) sessionManagerImpl$runWithLock$1.f6141a;
                try {
                    AbstractC3193b.m15359b(obj);
                    c76Var.mo4387b(null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    c76Var.mo4387b(null);
                    throw th;
                }
            }
            C3248a c3248a2 = sessionManagerImpl$runWithLock$1.f6143c;
            zi3 zi3Var3 = (zi3) sessionManagerImpl$runWithLock$1.f6142b;
            C0698f c0698f2 = (C0698f) sessionManagerImpl$runWithLock$1.f6141a;
            AbstractC3193b.m15359b(obj);
            c3248a = c3248a2;
            c0698f = c0698f2;
            zi3Var2 = zi3Var3;
            zi3Var2 = zi3Var;
            Object obj3 = c0698f.f6271e;
            sessionManagerImpl$runWithLock$1.f6141a = c3248a;
            sessionManagerImpl$runWithLock$1.f6142b = null;
            sessionManagerImpl$runWithLock$1.f6143c = null;
            sessionManagerImpl$runWithLock$1.f6146f = 2;
            Object objInvoke = zi3Var2.invoke(obj3, sessionManagerImpl$runWithLock$1);
            if (objInvoke != obj2) {
                C3248a c3248a3 = c3248a;
                obj = objInvoke;
                c76Var = c3248a3;
                c76Var.mo4387b(null);
                return obj;
            }
            zi3Var2 = zi3Var;
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            c76Var = c3248a;
            c76Var.mo4387b(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m2498a(zi3 zi3Var, ContinuationImpl continuationImpl) {
        return m2497b(this, zi3Var, continuationImpl);
    }
}
