package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Transactor$SQLiteTransactionType;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3352my;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.bk8;
import p000.cr7;
import p000.e9a;
import p000.gm5;
import p000.ik8;
import p000.lda;
import p000.vi3;
import p000.w47;
import p000.x47;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.coroutines.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0741b implements e9a, cr7 {

    /* JADX INFO: renamed from: a */
    public final zi3 f6933a;

    /* JADX INFO: renamed from: b */
    public final bk8 f6934b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f6935c;

    /* JADX INFO: renamed from: d */
    public Transactor$SQLiteTransactionType f6936d;

    public C0741b(zi3 zi3Var, bk8 bk8Var) {
        bk8Var.getClass();
        this.f6933a = zi3Var;
        this.f6934b = bk8Var;
        this.f6935c = new AtomicInteger(0);
    }

    @Override // p000.e9a
    /* JADX INFO: renamed from: a */
    public final Boolean mo2814a(Continuation continuation) {
        return Boolean.valueOf(this.f6936d != null || this.f6934b.mo2872S());
    }

    @Override // p000.e9a
    /* JADX INFO: renamed from: b */
    public final Object mo2815b(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, zi3 zi3Var, SuspendLambda suspendLambda) {
        Object objInvoke = this.f6933a.invoke(new PassthroughConnection$withTransaction$2(this, transactor$SQLiteTransactionType, zi3Var, null), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objInvoke;
    }

    @Override // p000.cr7
    /* JADX INFO: renamed from: c */
    public final bk8 mo2816c() {
        return this.f6934b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.ch7
    /* JADX INFO: renamed from: d */
    public final Object mo2817d(String str, vi3 vi3Var, ContinuationImpl continuationImpl) throws Exception {
        PassthroughConnection$usePrepared$1 passthroughConnection$usePrepared$1;
        if (continuationImpl instanceof PassthroughConnection$usePrepared$1) {
            passthroughConnection$usePrepared$1 = (PassthroughConnection$usePrepared$1) continuationImpl;
            int i = passthroughConnection$usePrepared$1.f6872e;
            if ((i & Integer.MIN_VALUE) != 0) {
                passthroughConnection$usePrepared$1.f6872e = i - Integer.MIN_VALUE;
            } else {
                passthroughConnection$usePrepared$1 = new PassthroughConnection$usePrepared$1(this, continuationImpl);
            }
        } else {
            passthroughConnection$usePrepared$1 = new PassthroughConnection$usePrepared$1(this, continuationImpl);
        }
        Object objMo2814a = passthroughConnection$usePrepared$1.f6870c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passthroughConnection$usePrepared$1.f6872e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objMo2814a);
            passthroughConnection$usePrepared$1.f6868a = str;
            passthroughConnection$usePrepared$1.f6869b = vi3Var;
            passthroughConnection$usePrepared$1.f6872e = 1;
            objMo2814a = mo2814a(passthroughConnection$usePrepared$1);
            if (objMo2814a != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objMo2814a);
                return objMo2814a;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        vi3Var = passthroughConnection$usePrepared$1.f6869b;
        str = passthroughConnection$usePrepared$1.f6868a;
        AbstractC3193b.m15359b(objMo2814a);
        if (((Boolean) objMo2814a).booleanValue()) {
            PassthroughConnection$usePrepared$2 passthroughConnection$usePrepared$2 = new PassthroughConnection$usePrepared$2(this, str, vi3Var, null);
            passthroughConnection$usePrepared$1.f6868a = null;
            passthroughConnection$usePrepared$1.f6869b = null;
            passthroughConnection$usePrepared$1.f6872e = 2;
            Object objInvoke = this.f6933a.invoke(passthroughConnection$usePrepared$2, passthroughConnection$usePrepared$1);
            return objInvoke == obj ? obj : objInvoke;
        }
        ik8 ik8VarMo2873e0 = this.f6934b.mo2873e0(str);
        try {
            Object objInvoke2 = vi3Var.invoke(ik8VarMo2873e0);
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            return objInvoke2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m2818e(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, zi3 zi3Var, ContinuationImpl continuationImpl) {
        PassthroughConnection$transaction$1 passthroughConnection$transaction$1;
        if (continuationImpl instanceof PassthroughConnection$transaction$1) {
            passthroughConnection$transaction$1 = (PassthroughConnection$transaction$1) continuationImpl;
            int i = passthroughConnection$transaction$1.f6867d;
            if ((i & Integer.MIN_VALUE) != 0) {
                passthroughConnection$transaction$1.f6867d = i - Integer.MIN_VALUE;
            } else {
                passthroughConnection$transaction$1 = new PassthroughConnection$transaction$1(this, continuationImpl);
            }
        } else {
            passthroughConnection$transaction$1 = new PassthroughConnection$transaction$1(this, continuationImpl);
        }
        Object objInvoke = passthroughConnection$transaction$1.f6865b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = passthroughConnection$transaction$1.f6867d;
        AtomicInteger atomicInteger = this.f6935c;
        int i3 = 1;
        bk8 bk8Var = this.f6934b;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objInvoke);
                int i4 = x47.f67759a[transactor$SQLiteTransactionType.ordinal()];
                if (i4 == 1) {
                    AbstractC3695vr.m23496g(bk8Var, "BEGIN DEFERRED TRANSACTION");
                } else if (i4 == 2) {
                    AbstractC3695vr.m23496g(bk8Var, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i4 != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    AbstractC3695vr.m23496g(bk8Var, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.f6936d = transactor$SQLiteTransactionType;
                }
                Object w47Var = new w47(this);
                passthroughConnection$transaction$1.f6864a = 1;
                passthroughConnection$transaction$1.f6867d = 1;
                objInvoke = zi3Var.invoke(w47Var, passthroughConnection$transaction$1);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = passthroughConnection$transaction$1.f6864a;
                AbstractC3193b.m15359b(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.f6936d = null;
            }
            if (i3 != 0) {
                AbstractC3695vr.m23496g(bk8Var, "END TRANSACTION");
                return objInvoke;
            }
            AbstractC3695vr.m23496g(bk8Var, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f6936d = null;
                    }
                    AbstractC3695vr.m23496g(bk8Var, "ROLLBACK TRANSACTION");
                } catch (SQLException e) {
                    lda.m16117c(th, e);
                }
                throw th2;
            }
        }
    }
}
