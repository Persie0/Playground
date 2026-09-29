package androidx.room.util;

import androidx.room.AbstractC0746d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", m4291f = "DBUtil.android.kt", m4292l = {260}, m4293m = "invokeSuspend")
final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f7011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0746d f7012b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f7013c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation) {
        super(1, continuation);
        this.f7012b = abstractC0746d;
        this.f7013c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(this.f7013c, this.f7012b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7011a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        vi3 vi3Var = this.f7013c;
        AbstractC0746d abstractC0746d = this.f7012b;
        C0754xfea5cf01 c0754xfea5cf01 = new C0754xfea5cf01(vi3Var, abstractC0746d, null);
        this.f7011a = 1;
        Object objM2847t = abstractC0746d.m2847t(false, c0754xfea5cf01, this);
        return objM2847t == coroutineSingletons ? coroutineSingletons : objM2847t;
    }
}
