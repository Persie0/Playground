package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Transactor$SQLiteTransactionType;
import kotlin.AbstractC3193b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3352my;
import p000.AbstractC3695vr;
import p000.C0825bv;
import p000.C3386nv;
import p000.bk8;
import p000.cr7;
import p000.dh7;
import p000.e9a;
import p000.eh7;
import p000.fh7;
import p000.gh7;
import p000.gi1;
import p000.lda;
import p000.ni1;
import p000.to2;
import p000.u91;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.coroutines.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0744e implements e9a, cr7 {

    /* JADX INFO: renamed from: a */
    public final to2 f6949a;

    /* JADX INFO: renamed from: b */
    public final ni1 f6950b;

    /* JADX INFO: renamed from: c */
    public final boolean f6951c;

    /* JADX INFO: renamed from: d */
    public final C0825bv f6952d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f6953e;

    public C0744e(to2 to2Var, ni1 ni1Var, boolean z) {
        to2Var.getClass();
        this.f6949a = to2Var;
        this.f6950b = ni1Var;
        this.f6951c = z;
        this.f6952d = new C0825bv();
    }

    @Override // p000.e9a
    /* JADX INFO: renamed from: a */
    public final Boolean mo2814a(Continuation continuation) {
        if (this.f6953e) {
            AbstractC3695vr.m23485C(21, "Connection is recycled");
            throw null;
        }
        gi1 gi1Var = (gi1) continuation.getContext().get(this.f6949a);
        if (gi1Var != null && gi1Var.f40845b == this) {
            return Boolean.valueOf(!this.f6952d.isEmpty() || this.f6950b.f52749a.mo2872S());
        }
        AbstractC3695vr.m23485C(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // p000.e9a
    /* JADX INFO: renamed from: b */
    public final Object mo2815b(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, zi3 zi3Var, SuspendLambda suspendLambda) {
        if (this.f6953e) {
            AbstractC3695vr.m23485C(21, "Connection is recycled");
            throw null;
        }
        gi1 gi1Var = (gi1) suspendLambda.getContext().get(this.f6949a);
        if (gi1Var != null && gi1Var.f40845b == this) {
            return m2826g(transactor$SQLiteTransactionType, zi3Var, suspendLambda);
        }
        AbstractC3695vr.m23485C(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // p000.cr7
    /* JADX INFO: renamed from: c */
    public final bk8 mo2816c() {
        return this.f6950b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.ch7
    /* JADX INFO: renamed from: d */
    public final Object mo2817d(String str, vi3 vi3Var, ContinuationImpl continuationImpl) throws Throwable {
        PooledConnectionImpl$usePrepared$1 pooledConnectionImpl$usePrepared$1;
        ni1 ni1Var;
        if (continuationImpl instanceof PooledConnectionImpl$usePrepared$1) {
            pooledConnectionImpl$usePrepared$1 = (PooledConnectionImpl$usePrepared$1) continuationImpl;
            int i = pooledConnectionImpl$usePrepared$1.f6917f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$usePrepared$1.f6917f = i - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$usePrepared$1 = new PooledConnectionImpl$usePrepared$1(this, continuationImpl);
            }
        } else {
            pooledConnectionImpl$usePrepared$1 = new PooledConnectionImpl$usePrepared$1(this, continuationImpl);
        }
        Object obj = pooledConnectionImpl$usePrepared$1.f6915d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pooledConnectionImpl$usePrepared$1.f6917f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            if (this.f6953e) {
                AbstractC3695vr.m23485C(21, "Connection is recycled");
                throw null;
            }
            gi1 gi1Var = (gi1) pooledConnectionImpl$usePrepared$1.getContext().get(this.f6949a);
            if (gi1Var == null || gi1Var.f40845b != this) {
                AbstractC3695vr.m23485C(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            ni1Var = this.f6950b;
            pooledConnectionImpl$usePrepared$1.f6912a = str;
            pooledConnectionImpl$usePrepared$1.f6913b = vi3Var;
            pooledConnectionImpl$usePrepared$1.f6914c = ni1Var;
            pooledConnectionImpl$usePrepared$1.f6917f = 1;
            if (ni1Var.f52750b.mo4388c(pooledConnectionImpl$usePrepared$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ni1 ni1Var2 = pooledConnectionImpl$usePrepared$1.f6914c;
            vi3Var = pooledConnectionImpl$usePrepared$1.f6913b;
            String str2 = pooledConnectionImpl$usePrepared$1.f6912a;
            AbstractC3193b.m15359b(obj);
            ni1Var = ni1Var2;
            str = str2;
        }
        try {
            dh7 dh7Var = new dh7(this, this.f6950b.mo2873e0(str));
            try {
                Object objInvoke = vi3Var.invoke(dh7Var);
                AbstractC3352my.m17126j(dh7Var, null);
                ni1Var.mo4387b(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3352my.m17126j(dh7Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ni1Var.mo4387b(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m2824e(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, ContinuationImpl continuationImpl) throws Throwable {
        PooledConnectionImpl$beginTransaction$1 pooledConnectionImpl$beginTransaction$1;
        ni1 ni1Var;
        C0825bv c0825bv = this.f6952d;
        if (continuationImpl instanceof PooledConnectionImpl$beginTransaction$1) {
            pooledConnectionImpl$beginTransaction$1 = (PooledConnectionImpl$beginTransaction$1) continuationImpl;
            int i = pooledConnectionImpl$beginTransaction$1.f6900e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$beginTransaction$1.f6900e = i - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$beginTransaction$1 = new PooledConnectionImpl$beginTransaction$1(this, continuationImpl);
            }
        } else {
            pooledConnectionImpl$beginTransaction$1 = new PooledConnectionImpl$beginTransaction$1(this, continuationImpl);
        }
        Object obj = pooledConnectionImpl$beginTransaction$1.f6898c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pooledConnectionImpl$beginTransaction$1.f6900e;
        ni1 ni1Var2 = this.f6950b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            pooledConnectionImpl$beginTransaction$1.f6896a = transactor$SQLiteTransactionType;
            pooledConnectionImpl$beginTransaction$1.f6897b = ni1Var2;
            pooledConnectionImpl$beginTransaction$1.f6900e = 1;
            if (ni1Var2.f52750b.mo4388c(pooledConnectionImpl$beginTransaction$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ni1Var = ni1Var2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ni1 ni1Var3 = pooledConnectionImpl$beginTransaction$1.f6897b;
            Transactor$SQLiteTransactionType transactor$SQLiteTransactionType2 = pooledConnectionImpl$beginTransaction$1.f6896a;
            AbstractC3193b.m15359b(obj);
            ni1Var = ni1Var3;
            transactor$SQLiteTransactionType = transactor$SQLiteTransactionType2;
        }
        try {
            int i3 = c0825bv.f9041c;
            if (c0825bv.isEmpty()) {
                int i4 = gh7.f40822a[transactor$SQLiteTransactionType.ordinal()];
                if (i4 == 1) {
                    AbstractC3695vr.m23496g(ni1Var2, "BEGIN DEFERRED TRANSACTION");
                } else if (i4 == 2) {
                    AbstractC3695vr.m23496g(ni1Var2, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC3695vr.m23496g(ni1Var2, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                AbstractC3695vr.m23496g(ni1Var2, "SAVEPOINT '" + i3 + '\'');
            }
            c0825bv.addLast(new fh7(i3));
            xfa xfaVar = xfa.f68157a;
            ni1Var.mo4387b(null);
            return xfaVar;
        } catch (Throwable th) {
            ni1Var.mo4387b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: f */
    public final Object m2825f(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        PooledConnectionImpl$endTransaction$1 pooledConnectionImpl$endTransaction$1;
        ni1 ni1Var;
        C0825bv c0825bv = this.f6952d;
        if (continuationImpl instanceof PooledConnectionImpl$endTransaction$1) {
            pooledConnectionImpl$endTransaction$1 = (PooledConnectionImpl$endTransaction$1) continuationImpl;
            int i = pooledConnectionImpl$endTransaction$1.f6905e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$endTransaction$1.f6905e = i - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$endTransaction$1 = new PooledConnectionImpl$endTransaction$1(this, continuationImpl);
            }
        } else {
            pooledConnectionImpl$endTransaction$1 = new PooledConnectionImpl$endTransaction$1(this, continuationImpl);
        }
        Object obj = pooledConnectionImpl$endTransaction$1.f6903c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pooledConnectionImpl$endTransaction$1.f6905e;
        ni1 ni1Var2 = this.f6950b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            pooledConnectionImpl$endTransaction$1.f6902b = ni1Var2;
            pooledConnectionImpl$endTransaction$1.f6901a = z;
            pooledConnectionImpl$endTransaction$1.f6905e = 1;
            if (ni1Var2.f52750b.mo4388c(pooledConnectionImpl$endTransaction$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            ni1Var = ni1Var2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = pooledConnectionImpl$endTransaction$1.f6901a;
            ni1Var = pooledConnectionImpl$endTransaction$1.f6902b;
            AbstractC3193b.m15359b(obj);
        }
        try {
            if (c0825bv.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            fh7 fh7Var = (fh7) u91.m22608Z0(c0825bv);
            if (z) {
                fh7Var.getClass();
                if (c0825bv.isEmpty()) {
                    AbstractC3695vr.m23496g(ni1Var2, "END TRANSACTION");
                } else {
                    AbstractC3695vr.m23496g(ni1Var2, "RELEASE SAVEPOINT '" + fh7Var.f39109a + '\'');
                }
            } else if (c0825bv.isEmpty()) {
                AbstractC3695vr.m23496g(ni1Var2, "ROLLBACK TRANSACTION");
            } else {
                AbstractC3695vr.m23496g(ni1Var2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + fh7Var.f39109a + '\'');
            }
            xfa xfaVar = xfa.f68157a;
            ni1Var.mo4387b(null);
            return xfaVar;
        } catch (Throwable th) {
            ni1Var.mo4387b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m2826g(Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        PooledConnectionImpl$transaction$1 pooledConnectionImpl$transaction$1;
        SQLException e;
        Throwable th;
        int i;
        boolean z;
        if (continuationImpl instanceof PooledConnectionImpl$transaction$1) {
            pooledConnectionImpl$transaction$1 = (PooledConnectionImpl$transaction$1) continuationImpl;
            int i2 = pooledConnectionImpl$transaction$1.f6911f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$transaction$1.f6911f = i2 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$transaction$1 = new PooledConnectionImpl$transaction$1(this, continuationImpl);
            }
        } else {
            pooledConnectionImpl$transaction$1 = new PooledConnectionImpl$transaction$1(this, continuationImpl);
        }
        Object objInvoke = pooledConnectionImpl$transaction$1.f6909d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = pooledConnectionImpl$transaction$1.f6911f;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objInvoke);
                if (transactor$SQLiteTransactionType == null) {
                    transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.DEFERRED;
                }
                pooledConnectionImpl$transaction$1.f6906a = zi3Var;
                pooledConnectionImpl$transaction$1.f6911f = 1;
                if (m2824e(transactor$SQLiteTransactionType, pooledConnectionImpl$transaction$1) != obj) {
                }
                return obj;
            }
            if (i3 == 1) {
                zi3Var = (zi3) pooledConnectionImpl$transaction$1.f6906a;
                AbstractC3193b.m15359b(objInvoke);
            } else {
                if (i3 != 2) {
                    if (i3 == 3 || i3 == 4) {
                        Object obj2 = pooledConnectionImpl$transaction$1.f6906a;
                        AbstractC3193b.m15359b(objInvoke);
                        return obj2;
                    }
                    if (i3 != 5) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = pooledConnectionImpl$transaction$1.f6907b;
                    th = (Throwable) pooledConnectionImpl$transaction$1.f6906a;
                    try {
                        AbstractC3193b.m15359b(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        lda.m16117c(th, e);
                        throw th;
                    }
                }
                i = pooledConnectionImpl$transaction$1.f6908c;
                AbstractC3193b.m15359b(objInvoke);
            }
            z = i != 0;
            pooledConnectionImpl$transaction$1.f6906a = objInvoke;
            pooledConnectionImpl$transaction$1.f6911f = 3;
            if (m2825f(z, pooledConnectionImpl$transaction$1) != obj) {
                return obj;
            }
            return objInvoke;
            eh7 eh7Var = new eh7(this);
            pooledConnectionImpl$transaction$1.f6906a = null;
            pooledConnectionImpl$transaction$1.f6908c = 1;
            pooledConnectionImpl$transaction$1.f6911f = 2;
            objInvoke = zi3Var.invoke(eh7Var, pooledConnectionImpl$transaction$1);
            if (objInvoke != obj) {
                i = 1;
                if (i != 0) {
                }
                pooledConnectionImpl$transaction$1.f6906a = objInvoke;
                pooledConnectionImpl$transaction$1.f6911f = 3;
                if (m2825f(z, pooledConnectionImpl$transaction$1) != obj) {
                    return objInvoke;
                }
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    pooledConnectionImpl$transaction$1.f6906a = th;
                    pooledConnectionImpl$transaction$1.f6907b = th3;
                    pooledConnectionImpl$transaction$1.f6911f = 5;
                    if (m2825f(false, pooledConnectionImpl$transaction$1) != obj) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    lda.m16117c(th, e);
                    throw th;
                }
            }
        }
    }
}
