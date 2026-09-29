package androidx.room.coroutines;

import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import p000.C3386nv;
import p000.c32;
import p000.dc1;
import p000.in1;
import p000.jj5;
import p000.nn1;
import p000.r46;
import p000.un1;
import p000.wb1;
import p000.wfb;
import p000.wn3;
import p000.xb1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", m4291f = "RunBlockingUninterruptible.android.kt", m4292l = {}, m4293m = "invokeSuspend")
final class C0739x860047f8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6918a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f6919b;

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
    @c32(m4290c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", m4291f = "RunBlockingUninterruptible.android.kt", m4292l = {52}, m4293m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6920a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f6921b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xb1 f6922c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zi3 f6923d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xb1 xb1Var, zi3 zi3Var, Continuation continuation) {
            super(2, continuation);
            this.f6922c = xb1Var;
            this.f6923d = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6922c, this.f6923d, continuation);
            anonymousClass1.f6921b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            wb1 wb1Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6920a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                un1 un1Var = (un1) this.f6921b;
                xb1 xb1Var = this.f6922c;
                zi3 zi3Var = this.f6923d;
                try {
                    this.f6921b = xb1Var;
                    this.f6920a = 1;
                    obj = zi3Var.invoke(un1Var, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    wb1Var = xb1Var;
                } catch (Throwable th) {
                    th = th;
                    wb1Var = xb1Var;
                    obj = new Result.Failure(th);
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wb1Var = (wb1) this.f6921b;
                try {
                    AbstractC3193b.m15359b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    obj = new Result.Failure(th);
                }
            }
            Throwable thM15355a = Result.m15355a(obj);
            xb1 xb1Var2 = (xb1) wb1Var;
            if (thM15355a == null) {
                xb1Var2.m15505Y(obj);
            } else {
                xb1Var2.getClass();
                xb1Var2.m15505Y(new dc1(thM15355a, false));
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", m4291f = "RunBlockingUninterruptible.android.kt", m4292l = {58}, m4293m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6924a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ xb1 f6925b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(xb1 xb1Var, Continuation continuation) {
            super(2, continuation);
            this.f6925b = xb1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f6925b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6924a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f6924a = 1;
                Object objM15517w = this.f6925b.m15517w(this);
                return objM15517w == coroutineSingletons ? coroutineSingletons : objM15517w;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739x860047f8(zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6919b = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0739x860047f8 c0739x860047f8 = new C0739x860047f8(this.f6919b, continuation);
        c0739x860047f8.f6918a = obj;
        return c0739x860047f8;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0739x860047f8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        in1 in1Var = ((un1) this.f6918a).mo1309x().get(jj5.f45612c);
        in1Var.getClass();
        nn1 nn1Var = (nn1) in1Var;
        xb1 xb1VarM20377b = r46.m20377b();
        wfb.m23925t(wn3.f67092a, nn1Var, CoroutineStart.UNDISPATCHED, new AnonymousClass1(xb1VarM20377b, this.f6919b, null));
        while (!xb1VarM20377b.m15504W()) {
            try {
                return wfb.m23900B(nn1Var, new AnonymousClass2(xb1VarM20377b, null));
            } catch (InterruptedException unused) {
            }
        }
        return xb1VarM20377b.m15494K();
    }
}
