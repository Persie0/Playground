package androidx.room;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e9a;
import p000.np6;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", m4291f = "InvalidationTracker.kt", m4292l = {307, 314}, m4293m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ReentrantLock f6803a;

    /* JADX INFO: renamed from: b */
    public int f6804b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f6805c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0750h f6806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1(C0750h c0750h, Continuation continuation) {
        super(2, continuation);
        this.f6806d = c0750h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this.f6806d, continuation);
        triggerBasedInvalidationTracker$syncTriggers$2$1.f6805c = obj;
        return triggerBasedInvalidationTracker$syncTriggers$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create((e9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e9a e9aVar;
        Object objMo2814a;
        np6 np6Var;
        ReentrantLock reentrantLock;
        ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp;
        np6 np6Var2;
        ReentrantLock reentrantLock2;
        boolean z;
        xfa xfaVar = xfa.f68157a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6804b;
        boolean z2 = false;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e9aVar = (e9a) this.f6805c;
            this.f6805c = e9aVar;
            this.f6804b = 1;
            objMo2814a = e9aVar.mo2814a(this);
            if (objMo2814a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            reentrantLock2 = this.f6803a;
            np6Var2 = (np6) this.f6805c;
            try {
                AbstractC3193b.m15359b(obj);
                reentrantLock = reentrantLock2;
                np6Var = np6Var2;
                np6Var.f53102f = false;
                reentrantLock.unlock();
                return xfaVar;
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    np6Var2.f53102f = z;
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock = reentrantLock2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }
        e9aVar = (e9a) this.f6805c;
        AbstractC3193b.m15359b(obj);
        objMo2814a = obj;
        if (((Boolean) objMo2814a).booleanValue()) {
            return xfaVar;
        }
        C0750h c0750h = this.f6806d;
        np6Var = c0750h.f6980h;
        reentrantLock = np6Var.f53101e;
        reentrantLock.lock();
        try {
            np6Var.f53102f = true;
            ReentrantLock reentrantLock3 = np6Var.f53097a;
            reentrantLock3.lock();
            try {
                if (np6Var.f53100d) {
                    np6Var.f53100d = false;
                    int length = np6Var.f53098b.length;
                    observedTableStates$ObserveOpArr = new ObservedTableStates$ObserveOp[length];
                    int i2 = 0;
                    boolean z3 = false;
                    while (i2 < length) {
                        boolean z4 = np6Var.f53098b[i2] > 0 ? true : z2;
                        boolean[] zArr = np6Var.f53099c;
                        if (z4 != zArr[i2]) {
                            zArr[i2] = z4;
                            observedTableStates$ObserveOp = z4 ? ObservedTableStates$ObserveOp.ADD : ObservedTableStates$ObserveOp.REMOVE;
                            z3 = true;
                        } else {
                            observedTableStates$ObserveOp = ObservedTableStates$ObserveOp.NO_OP;
                        }
                        observedTableStates$ObserveOpArr[i2] = observedTableStates$ObserveOp;
                        i2++;
                        z2 = false;
                    }
                    if (!z3) {
                        observedTableStates$ObserveOpArr = null;
                    }
                } else {
                    observedTableStates$ObserveOpArr = null;
                }
                reentrantLock3.unlock();
                if (observedTableStates$ObserveOpArr != null) {
                    try {
                        if (observedTableStates$ObserveOpArr.length != 0) {
                            Transactor$SQLiteTransactionType transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                            TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 triggerBasedInvalidationTracker$syncTriggers$2$1$1$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(observedTableStates$ObserveOpArr, c0750h, e9aVar, null);
                            this.f6805c = np6Var;
                            this.f6803a = reentrantLock;
                            this.f6804b = 2;
                            if (e9aVar.mo2815b(transactor$SQLiteTransactionType, triggerBasedInvalidationTracker$syncTriggers$2$1$1$1, this) != coroutineSingletons) {
                                np6Var2 = np6Var;
                                reentrantLock2 = reentrantLock;
                                reentrantLock = reentrantLock2;
                                np6Var = np6Var2;
                            }
                            return coroutineSingletons;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        np6Var2 = np6Var;
                        reentrantLock2 = reentrantLock;
                        z = false;
                        np6Var2.f53102f = z;
                        throw th;
                    }
                }
                np6Var.f53102f = false;
                reentrantLock.unlock();
                return xfaVar;
            } catch (Throwable th4) {
                reentrantLock3.unlock();
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            reentrantLock.unlock();
            throw th;
        }
    }
}
