package androidx.room.coroutines;

import androidx.room.Transactor$SQLiteTransactionType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", m4291f = "PassthroughConnectionPool.kt", m4292l = {103}, m4293m = "invokeSuspend")
final class PassthroughConnection$withTransaction$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f6876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0741b f6877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Transactor$SQLiteTransactionType f6878c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f6879d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassthroughConnection$withTransaction$2(C0741b c0741b, Transactor$SQLiteTransactionType transactor$SQLiteTransactionType, zi3 zi3Var, Continuation continuation) {
        super(1, continuation);
        this.f6877b = c0741b;
        this.f6878c = transactor$SQLiteTransactionType;
        this.f6879d = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PassthroughConnection$withTransaction$2(this.f6877b, this.f6878c, this.f6879d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PassthroughConnection$withTransaction$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6876a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6876a = 1;
            Object objM2818e = this.f6877b.m2818e(this.f6878c, this.f6879d, this);
            return objM2818e == coroutineSingletons ? coroutineSingletons : objM2818e;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            return obj;
        }
        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
