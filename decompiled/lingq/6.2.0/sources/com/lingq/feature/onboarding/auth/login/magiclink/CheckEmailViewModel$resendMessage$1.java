package com.lingq.feature.onboarding.auth.login.magiclink;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e01;
import p000.e83;
import p000.kk8;
import p000.km7;
import p000.m83;
import p000.un1;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailViewModel$resendMessage$1", m4291f = "CheckEmailViewModel.kt", m4292l = {47}, m4293m = "invokeSuspend", m4294v = 2)
final class CheckEmailViewModel$resendMessage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27094a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e01 f27095b;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailViewModel$resendMessage$1$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailViewModel$resendMessage$1$1", m4291f = "CheckEmailViewModel.kt", m4292l = {43, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21811 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27096a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f27097b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e01 f27098c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21811(e01 e01Var, Continuation continuation) {
            super(2, continuation);
            this.f27098c = e01Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21811 c21811 = new C21811(this.f27098c, continuation);
            c21811.f27097b = obj;
            return c21811;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21811) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit((p000.ym5) r7, r6) == r1) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = (e83) this.f27097b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27096a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                return xfa.f68157a;
            }
            AbstractC3193b.m15359b(obj);
            e01 e01Var = this.f27098c;
            km7 km7Var = e01Var.f36478b;
            String str = e01Var.f36480d.f9245a;
            this.f27097b = e83Var;
            this.f27096a = 1;
            obj = ((C1267a) km7Var).m7090s(str, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
            this.f27097b = null;
            this.f27096a = 2;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailViewModel$resendMessage$1$2 */
    @c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailViewModel$resendMessage$1$2", m4291f = "CheckEmailViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21822 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e01 f27099a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21822(e01 e01Var, Continuation continuation) {
            super(2, continuation);
            this.f27099a = e01Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21822(this.f27099a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21822 c21822 = (C21822) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21822.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f27099a.f36481e;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailViewModel$resendMessage$1$3 */
    @c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.CheckEmailViewModel$resendMessage$1$3", m4291f = "CheckEmailViewModel.kt", m4292l = {51}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21833 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27100a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f27101b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ e01 f27102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21833(e01 e01Var, Continuation continuation) {
            super(2, continuation);
            this.f27102c = e01Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21833 c21833 = new C21833(this.f27102c, continuation);
            c21833.f27101b = obj;
            return c21833;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21833) create((ym5) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ym5 ym5Var = (ym5) this.f27101b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27100a;
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
            e01 e01Var = this.f27102c;
            C3244l c3244l = e01Var.f36481e;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            ym5Var.getClass();
            if (ym5Var instanceof xm5) {
                C3211a c3211a = e01Var.f36483g;
                this.f27101b = null;
                this.f27100a = 1;
                if (c3211a.mo4678m(xfaVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckEmailViewModel$resendMessage$1(e01 e01Var, Continuation continuation) {
        super(2, continuation);
        this.f27095b = e01Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckEmailViewModel$resendMessage$1(this.f27095b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckEmailViewModel$resendMessage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27094a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e01 e01Var = this.f27095b;
            m83 m83Var = new m83(new kk8(new C21811(e01Var, null)), new C21822(e01Var, null));
            C21833 c21833 = new C21833(e01Var, null);
            this.f27094a = 1;
            if (AbstractC3224d.m15529h(m83Var, c21833, this) == coroutineSingletons) {
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
