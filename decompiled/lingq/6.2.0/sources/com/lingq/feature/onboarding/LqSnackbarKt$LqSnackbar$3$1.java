package com.lingq.feature.onboarding;

import androidx.compose.material3.C0232g0;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarResult;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.an5;
import p000.c32;
import p000.gm5;
import p000.ui3;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.LqSnackbarKt$LqSnackbar$3$1", m4291f = "LqSnackbar.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LqSnackbarKt$LqSnackbar$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0232g0 f26894b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26895c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f26896d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ SnackbarDuration f26897e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f26898f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ui3 f26899g;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.LqSnackbarKt$LqSnackbar$3$1$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.LqSnackbarKt$LqSnackbar$3$1$1", m4291f = "LqSnackbar.kt", m4292l = {26}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21691 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f26900a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0232g0 f26901b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f26902c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f26903d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ SnackbarDuration f26904e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ui3 f26905f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ui3 f26906g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21691(C0232g0 c0232g0, String str, String str2, SnackbarDuration snackbarDuration, ui3 ui3Var, ui3 ui3Var2, Continuation continuation) {
            super(2, continuation);
            this.f26901b = c0232g0;
            this.f26902c = str;
            this.f26903d = str2;
            this.f26904e = snackbarDuration;
            this.f26905f = ui3Var;
            this.f26906g = ui3Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21691(this.f26901b, this.f26902c, this.f26903d, this.f26904e, this.f26905f, this.f26906g, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21691) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C21691 c21691;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f26900a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f26900a = 1;
                c21691 = this;
                obj = C0232g0.m1155b(this.f26901b, this.f26902c, this.f26903d, this.f26904e, c21691, 4);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                c21691 = this;
            }
            int i2 = an5.f878a[((SnackbarResult) obj).ordinal()];
            if (i2 == 1) {
                c21691.f26905f.mo0a();
            } else {
                if (i2 != 2) {
                    gm5.m12750e();
                    return null;
                }
                c21691.f26906g.mo0a();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LqSnackbarKt$LqSnackbar$3$1(C0232g0 c0232g0, String str, String str2, SnackbarDuration snackbarDuration, ui3 ui3Var, ui3 ui3Var2, Continuation continuation) {
        super(2, continuation);
        this.f26894b = c0232g0;
        this.f26895c = str;
        this.f26896d = str2;
        this.f26897e = snackbarDuration;
        this.f26898f = ui3Var;
        this.f26899g = ui3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LqSnackbarKt$LqSnackbar$3$1 lqSnackbarKt$LqSnackbar$3$1 = new LqSnackbarKt$LqSnackbar$3$1(this.f26894b, this.f26895c, this.f26896d, this.f26897e, this.f26898f, this.f26899g, continuation);
        lqSnackbarKt$LqSnackbar$3$1.f26893a = obj;
        return lqSnackbarKt$LqSnackbar$3$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LqSnackbarKt$LqSnackbar$3$1 lqSnackbarKt$LqSnackbar$3$1 = (LqSnackbarKt$LqSnackbar$3$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        lqSnackbarKt$LqSnackbar$3$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var = (un1) this.f26893a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        wfb.m23926u(un1Var, null, null, new C21691(this.f26894b, this.f26895c, this.f26896d, this.f26897e, this.f26898f, this.f26899g, null), 3);
        return xfa.f68157a;
    }
}
