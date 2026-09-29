package androidx.room.util;

import androidx.room.AbstractC0746d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", m4291f = "DBUtil.android.kt", m4292l = {261}, m4293m = "invokeSuspend")
public final class C0756xcdc6cef6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0746d f7031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f7032c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f7033d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f7034e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0756xcdc6cef6(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.f7031b = abstractC0746d;
        this.f7032c = z;
        this.f7033d = z2;
        this.f7034e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0756xcdc6cef6(this.f7034e, this.f7031b, continuation, this.f7032c, this.f7033d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0756xcdc6cef6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7030a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        vi3 vi3Var = this.f7034e;
        AbstractC0746d abstractC0746d = this.f7031b;
        boolean z = this.f7033d;
        boolean z2 = this.f7032c;
        C0757x2db6401c c0757x2db6401c = new C0757x2db6401c(vi3Var, abstractC0746d, null, z, z2);
        this.f7030a = 1;
        Object objM2847t = abstractC0746d.m2847t(z2, c0757x2db6401c, this);
        return objM2847t == coroutineSingletons ? coroutineSingletons : objM2847t;
    }
}
