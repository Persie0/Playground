package androidx.room;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c9a;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", m4291f = "RoomDatabase.android.kt", m4292l = {2058}, m4293m = "invokeSuspend")
final class C0733x2e53b6b3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6751a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f6753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0733x2e53b6b3(vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6753c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0733x2e53b6b3 c0733x2e53b6b3 = new C0733x2e53b6b3(this.f6753c, continuation);
        c0733x2e53b6b3.f6752b = obj;
        return c0733x2e53b6b3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0733x2e53b6b3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6751a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        if (((un1) this.f6752b).mo1309x().get(c9a.f9771b) == null) {
            C3386nv.m17633t("Expected a TransactionElement in the CoroutineContext but none was found.");
            return null;
        }
        this.f6751a = 1;
        Object objInvoke = this.f6753c.invoke(this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
