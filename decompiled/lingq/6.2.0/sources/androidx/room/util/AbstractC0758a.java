package androidx.room.util;

import androidx.room.AbstractC0746d;
import androidx.room.AbstractC0747e;
import androidx.room.coroutines.AbstractC0745f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c9a;
import p000.fa4;
import p000.kn1;
import p000.vi3;
import p000.vl1;
import p000.wfb;

/* JADX INFO: renamed from: androidx.room.util.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0758a {
    /* JADX INFO: renamed from: a */
    public static final kn1 m2858a(AbstractC0746d abstractC0746d, boolean z, ContinuationImpl continuationImpl) {
        c9a c9aVar = (c9a) continuationImpl.getContext().get(c9a.f9771b);
        kn1 kn1Var = c9aVar != null ? c9aVar.f9772a : null;
        if (!abstractC0746d.m2840m()) {
            vl1 vl1Var = abstractC0746d.f6954a;
            if (vl1Var == null) {
                fa4.m11636J("coroutineScope");
                throw null;
            }
            kn1 kn1Var2 = vl1Var.f65559a;
            if (kn1Var == null) {
                kn1Var = EmptyCoroutineContext.f47685a;
            }
            return kn1Var2.plus(kn1Var);
        }
        if (kn1Var != null) {
            vl1 vl1Var2 = abstractC0746d.f6954a;
            if (vl1Var2 != null) {
                return vl1Var2.f65559a.plus(kn1Var);
            }
            fa4.m11636J("coroutineScope");
            throw null;
        }
        if (z) {
            kn1 kn1Var3 = abstractC0746d.f6955b;
            if (kn1Var3 != null) {
                return kn1Var3;
            }
            fa4.m11636J("transactionContext");
            throw null;
        }
        vl1 vl1Var3 = abstractC0746d.f6954a;
        if (vl1Var3 != null) {
            return vl1Var3.f65559a;
        }
        fa4.m11636J("coroutineScope");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m2859b(AbstractC0746d abstractC0746d, boolean z, boolean z2, vi3 vi3Var) {
        abstractC0746d.getClass();
        abstractC0746d.m2828a();
        abstractC0746d.m2829b();
        kn1 kn1Var = (kn1) abstractC0746d.f6962i.get();
        if (kn1Var == null) {
            kn1Var = EmptyCoroutineContext.f47685a;
        }
        return AbstractC0745f.m2827a(new DBUtil__DBUtil_androidKt$performBlocking$1(kn1Var, abstractC0746d, z2, z, vi3Var, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final Object m2860c(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$1;
        vi3 vi3Var2;
        if (continuation instanceof DBUtil__DBUtil_androidKt$performInTransactionSuspending$1) {
            dBUtil__DBUtil_androidKt$performInTransactionSuspending$1 = (DBUtil__DBUtil_androidKt$performInTransactionSuspending$1) continuation;
            int i = dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7010d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7010d = i - Integer.MIN_VALUE;
            } else {
                dBUtil__DBUtil_androidKt$performInTransactionSuspending$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$1(continuation);
            }
        } else {
            dBUtil__DBUtil_androidKt$performInTransactionSuspending$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$1(continuation);
        }
        Object objM2858a = dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7009c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7010d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2858a);
            if (abstractC0746d.m2840m()) {
                DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(vi3Var, abstractC0746d, null);
                dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7010d = 1;
                Object objM2850c = AbstractC0747e.m2850c(dBUtil__DBUtil_androidKt$performInTransactionSuspending$2, abstractC0746d, dBUtil__DBUtil_androidKt$performInTransactionSuspending$1);
                if (objM2850c != obj) {
                    return objM2850c;
                }
            } else if (abstractC0746d.m2840m() && abstractC0746d.m2843p() && abstractC0746d.m2841n()) {
                C0755x5eaa2107 c0755x5eaa2107 = new C0755x5eaa2107(vi3Var, abstractC0746d, null);
                dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7010d = 2;
                Object objM2847t = abstractC0746d.m2847t(false, c0755x5eaa2107, dBUtil__DBUtil_androidKt$performInTransactionSuspending$1);
                if (objM2847t != obj) {
                    return objM2847t;
                }
            } else {
                dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7007a = abstractC0746d;
                dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7008b = (SuspendLambda) vi3Var;
                dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7010d = 3;
                objM2858a = m2858a(abstractC0746d, true, dBUtil__DBUtil_androidKt$performInTransactionSuspending$1);
                vi3Var2 = vi3Var;
                if (objM2858a != obj) {
                }
            }
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM2858a);
            return objM2858a;
        }
        if (i2 == 2) {
            AbstractC3193b.m15359b(objM2858a);
            return objM2858a;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                AbstractC3193b.m15359b(objM2858a);
                return objM2858a;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vi3 vi3Var3 = (vi3) dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7008b;
        abstractC0746d = dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7007a;
        AbstractC3193b.m15359b(objM2858a);
        vi3Var2 = vi3Var3;
        C0753x66ceda29 c0753x66ceda29 = new C0753x66ceda29(vi3Var2, abstractC0746d, null);
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7007a = null;
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7008b = null;
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$1.f7010d = 4;
        Object objM23905G = wfb.m23905G(c0753x66ceda29, (kn1) objM2858a, dBUtil__DBUtil_androidKt$performInTransactionSuspending$1);
        return objM23905G == obj ? obj : objM23905G;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: d */
    public static final Object m2861d(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation, boolean z, boolean z2) {
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$1;
        vi3 vi3Var2;
        AbstractC0746d abstractC0746d2;
        boolean z3;
        boolean z4;
        if (continuation instanceof DBUtil__DBUtil_androidKt$performSuspending$1) {
            dBUtil__DBUtil_androidKt$performSuspending$1 = (DBUtil__DBUtil_androidKt$performSuspending$1) continuation;
            int i = dBUtil__DBUtil_androidKt$performSuspending$1.f7040f;
            if ((i & Integer.MIN_VALUE) != 0) {
                dBUtil__DBUtil_androidKt$performSuspending$1.f7040f = i - Integer.MIN_VALUE;
            } else {
                dBUtil__DBUtil_androidKt$performSuspending$1 = new DBUtil__DBUtil_androidKt$performSuspending$1(continuation);
            }
        } else {
            dBUtil__DBUtil_androidKt$performSuspending$1 = new DBUtil__DBUtil_androidKt$performSuspending$1(continuation);
        }
        DBUtil__DBUtil_androidKt$performSuspending$1 dBUtil__DBUtil_androidKt$performSuspending$2 = dBUtil__DBUtil_androidKt$performSuspending$1;
        Object obj = dBUtil__DBUtil_androidKt$performSuspending$2.f7039e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dBUtil__DBUtil_androidKt$performSuspending$2.f7040f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (abstractC0746d.m2840m() && abstractC0746d.m2843p() && abstractC0746d.m2841n()) {
                C0757x2db6401c c0757x2db6401c = new C0757x2db6401c(vi3Var, abstractC0746d, null, z2, z);
                dBUtil__DBUtil_androidKt$performSuspending$2.f7040f = 1;
                Object objM2847t = abstractC0746d.m2847t(z, c0757x2db6401c, dBUtil__DBUtil_androidKt$performSuspending$2);
                if (objM2847t != coroutineSingletons) {
                    return objM2847t;
                }
            } else {
                dBUtil__DBUtil_androidKt$performSuspending$2.f7035a = abstractC0746d;
                dBUtil__DBUtil_androidKt$performSuspending$2.f7036b = vi3Var;
                dBUtil__DBUtil_androidKt$performSuspending$2.f7037c = z;
                dBUtil__DBUtil_androidKt$performSuspending$2.f7038d = z2;
                dBUtil__DBUtil_androidKt$performSuspending$2.f7040f = 2;
                kn1 kn1VarM2858a = m2858a(abstractC0746d, z2, dBUtil__DBUtil_androidKt$performSuspending$2);
                if (kn1VarM2858a != coroutineSingletons) {
                    vi3Var2 = vi3Var;
                    abstractC0746d2 = abstractC0746d;
                    obj = kn1VarM2858a;
                    z3 = z;
                    z4 = z2;
                }
            }
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z5 = dBUtil__DBUtil_androidKt$performSuspending$2.f7038d;
        boolean z6 = dBUtil__DBUtil_androidKt$performSuspending$2.f7037c;
        vi3 vi3Var3 = dBUtil__DBUtil_androidKt$performSuspending$2.f7036b;
        AbstractC0746d abstractC0746d3 = dBUtil__DBUtil_androidKt$performSuspending$2.f7035a;
        AbstractC3193b.m15359b(obj);
        z4 = z5;
        z3 = z6;
        vi3Var2 = vi3Var3;
        abstractC0746d2 = abstractC0746d3;
        C0756xcdc6cef6 c0756xcdc6cef6 = new C0756xcdc6cef6(vi3Var2, abstractC0746d2, null, z3, z4);
        dBUtil__DBUtil_androidKt$performSuspending$2.f7035a = null;
        dBUtil__DBUtil_androidKt$performSuspending$2.f7036b = null;
        dBUtil__DBUtil_androidKt$performSuspending$2.f7040f = 3;
        Object objM23905G = wfb.m23905G(c0756xcdc6cef6, (kn1) obj, dBUtil__DBUtil_androidKt$performSuspending$2);
        return objM23905G == coroutineSingletons ? coroutineSingletons : objM23905G;
    }
}
