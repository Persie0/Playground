package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.foundation.text.selection.C0205f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import p000.C3386nv;
import p000.c32;
import p000.og7;
import p000.un1;
import p000.vm1;
import p000.wfb;
import p000.xfa;
import p000.xt9;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", m4291f = "CoreTextField.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class CoreTextFieldKt$TextFieldCursorHandle$2$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f2786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ og7 f2787b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xt9 f2788c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0205f f2789d;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1 */
    @c32(m4290c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", m4291f = "CoreTextField.kt", m4292l = {1099}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01601 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2790a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ og7 f2791b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ xt9 f2792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01601(og7 og7Var, xt9 xt9Var, Continuation continuation) {
            super(2, continuation);
            this.f2791b = og7Var;
            this.f2792c = xt9Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01601(this.f2791b, this.f2792c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01601) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2790a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f2790a = 1;
                if (AbstractC0176d.m1072e(this.f2791b, this.f2792c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2 */
    @c32(m4290c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", m4291f = "CoreTextField.kt", m4292l = {1102}, m4293m = "invokeSuspend", m4294v = 1)
    final class C01612 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f2793a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ og7 f2794b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0205f f2795c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01612(og7 og7Var, C0205f c0205f, Continuation continuation) {
            super(2, continuation);
            this.f2794b = og7Var;
            this.f2795c = c0205f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C01612(this.f2794b, this.f2795c, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C01612) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f2793a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                vm1 vm1Var = new vm1(this.f2795c, 1);
                this.f2793a = 1;
                if (AbstractC0117w.m942e(this.f2794b, null, vm1Var, this, 7) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$TextFieldCursorHandle$2$1$1(og7 og7Var, xt9 xt9Var, C0205f c0205f, Continuation continuation) {
        super(2, continuation);
        this.f2787b = og7Var;
        this.f2788c = xt9Var;
        this.f2789d = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(this.f2787b, this.f2788c, this.f2789d, continuation);
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.f2786a = obj;
        return coreTextFieldKt$TextFieldCursorHandle$2$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = (CoreTextFieldKt$TextFieldCursorHandle$2$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        un1 un1Var = (un1) this.f2786a;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        xt9 xt9Var = this.f2788c;
        og7 og7Var = this.f2787b;
        wfb.m23926u(un1Var, null, coroutineStart, new C01601(og7Var, xt9Var, null), 1);
        wfb.m23926u(un1Var, null, coroutineStart, new C01612(og7Var, this.f2789d, null), 1);
        return xfa.f68157a;
    }
}
