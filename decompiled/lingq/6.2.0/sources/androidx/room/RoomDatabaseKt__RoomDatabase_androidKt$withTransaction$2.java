package androidx.room;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", m4291f = "RoomDatabase.android.kt", m4292l = {2044}, m4293m = "invokeSuspend")
final class RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f6748a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0746d f6749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f6750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation) {
        super(1, continuation);
        this.f6749b = abstractC0746d;
        this.f6750c = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(this.f6750c, this.f6749b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6748a;
        AbstractC0746d abstractC0746d = this.f6749b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                abstractC0746d.m2830c();
                vi3 vi3Var = this.f6750c;
                this.f6748a = 1;
                obj = vi3Var.invoke(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            abstractC0746d.m2846s();
            abstractC0746d.m2835h();
            return obj;
        } catch (Throwable th) {
            abstractC0746d.m2835h();
            throw th;
        }
    }
}
