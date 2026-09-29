package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.gestures.AbstractC0102j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import p000.C3186kj;
import p000.C3386nv;
import p000.c32;
import p000.kv4;
import p000.og7;
import p000.ui3;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xt9;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", m4291f = "LongPressTextDragObserver.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class C0162x3c48fd5d extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ og7 f2798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xt9 f2799c;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    @c32(m4290c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", m4291f = "LongPressTextDragObserver.kt", m4292l = {67}, m4293m = "invokeSuspend", m4294v = 1)
    final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2800a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ og7 f2801b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xt9 f2802c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(og7 og7Var, xt9 xt9Var, Continuation continuation) {
            super(2, continuation);
            this.f2801b = og7Var;
            this.f2802c = xt9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.f2801b, this.f2802c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2800a;
            xfa xfaVar = xfa.f68157a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            this.f2800a = 1;
            Object objM836k = AbstractC0095c.m836k(this.f2801b, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.f2802c, null), this);
            if (objM836k != coroutineSingletons) {
                objM836k = xfaVar;
            }
            return objM836k == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    @c32(m4290c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", m4291f = "LongPressTextDragObserver.kt", m4292l = {68}, m4293m = "invokeSuspend", m4294v = 1)
    final class AnonymousClass2 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2803a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ og7 f2804b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xt9 f2805c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(og7 og7Var, xt9 xt9Var, Continuation continuation) {
            super(2, continuation);
            this.f2804b = og7Var;
            this.f2805c = xt9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f2804b, this.f2805c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2803a;
            xfa xfaVar = xfa.f68157a;
            final int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            this.f2803a = 1;
            final xt9 xt9Var = this.f2805c;
            final int i3 = 0;
            Object objM869d = AbstractC0102j.m869d(this.f2804b, new kv4(xt9Var, 7), new ui3() { // from class: qk5
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    int i4 = i3;
                    xfa xfaVar2 = xfa.f68157a;
                    xt9 xt9Var2 = xt9Var;
                    switch (i4) {
                        case 0:
                            xt9Var2.mo17644a();
                            break;
                        default:
                            xt9Var2.onCancel();
                            break;
                    }
                    return xfaVar2;
                }
            }, new ui3() { // from class: qk5
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    int i4 = i2;
                    xfa xfaVar2 = xfa.f68157a;
                    xt9 xt9Var2 = xt9Var;
                    switch (i4) {
                        case 0:
                            xt9Var2.mo17644a();
                            break;
                        default:
                            xt9Var2.onCancel();
                            break;
                    }
                    return xfaVar2;
                }
            }, new C3186kj(xt9Var, 12), this);
            if (objM869d != coroutineSingletons) {
                objM869d = xfaVar;
            }
            return objM869d == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162x3c48fd5d(og7 og7Var, xt9 xt9Var, Continuation continuation) {
        super(2, continuation);
        this.f2798b = og7Var;
        this.f2799c = xt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0162x3c48fd5d c0162x3c48fd5d = new C0162x3c48fd5d(this.f2798b, this.f2799c, continuation);
        c0162x3c48fd5d.f2797a = obj;
        return c0162x3c48fd5d;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0162x3c48fd5d) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        un1 un1Var = (un1) this.f2797a;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        og7 og7Var = this.f2798b;
        xt9 xt9Var = this.f2799c;
        wfb.m23926u(un1Var, null, coroutineStart, new AnonymousClass1(og7Var, xt9Var, null), 1);
        return wfb.m23926u(un1Var, null, coroutineStart, new AnonymousClass2(og7Var, xt9Var, null), 1);
    }
}
