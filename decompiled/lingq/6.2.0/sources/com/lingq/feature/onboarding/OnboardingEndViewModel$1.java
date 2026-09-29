package com.lingq.feature.onboarding;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C3244l f26930a;

    /* JADX INFO: renamed from: b */
    public C2197b f26931b;

    /* JADX INFO: renamed from: c */
    public Object f26932c;

    /* JADX INFO: renamed from: d */
    public int f26933d;

    /* JADX INFO: renamed from: e */
    public int f26934e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f26935f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2197b f26936g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$1(C2197b c2197b, Continuation continuation) {
        super(2, continuation);
        this.f26936g = c2197b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OnboardingEndViewModel$1 onboardingEndViewModel$1 = new OnboardingEndViewModel$1(this.f26936g, continuation);
        onboardingEndViewModel$1.f26935f = obj;
        return onboardingEndViewModel$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$1) create((ym5) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0077 -> B:6:0x001d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:9:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.f26935f
            ym5 r1 = (p000.ym5) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r0.f26934e
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L29
            if (r3 != r4) goto L23
            int r3 = r0.f26933d
            java.lang.Object r6 = r0.f26932c
            com.lingq.feature.onboarding.b r7 = r0.f26931b
            kotlinx.coroutines.flow.l r8 = r0.f26930a
            kotlin.AbstractC3193b.m15359b(r18)
            r9 = r18
        L1d:
            r10 = r1
            r11 = r3
            r12 = r6
            r13 = r7
            r14 = r8
            goto L7a
        L23:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r0)
            return r5
        L29:
            kotlin.AbstractC3193b.m15359b(r18)
            com.lingq.feature.onboarding.b r3 = r0.f26936g
            kotlinx.coroutines.flow.l r6 = r3.f27176q
            r7 = 0
            r8 = r7
            r7 = r3
            r3 = r8
            r8 = r6
        L35:
            java.lang.Object r6 = r8.getValue()
            r9 = r6
            ym5 r9 = (p000.ym5) r9
            java.lang.Object r9 = p000.pk9.m19381x(r1)
            com.lingq.core.domain.model.user.Login r9 = (com.lingq.core.domain.model.user.Login) r9
            if (r9 == 0) goto L47
            java.lang.String r9 = r9.f19647b
            goto L48
        L47:
            r9 = r5
        L48:
            if (r9 == 0) goto La6
            int r9 = r9.length()
            if (r9 != 0) goto L51
            goto La6
        L51:
            kotlinx.coroutines.flow.l r9 = r7.f27175p
        L53:
            java.lang.Object r10 = r9.getValue()
            r11 = r10
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r10 = r9.m15570h(r10, r11)
            if (r10 == 0) goto L53
            com.lingq.feature.onboarding.domain.a r9 = r7.f27165f
            r0.f26935f = r1
            r0.f26930a = r8
            r0.f26931b = r7
            r0.f26932c = r6
            r0.f26933d = r3
            r0.f26934e = r4
            java.lang.Object r9 = r9.m9136a(r0)
            if (r9 != r2) goto L1d
            return r2
        L7a:
            r15 = r9
            ym5 r15 = (p000.ym5) r15
            kotlinx.coroutines.flow.l r1 = r13.f27175p
        L7f:
            java.lang.Object r3 = r1.getValue()
            r6 = r3
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r3 = r1.m15570h(r3, r6)
            if (r3 == 0) goto L7f
            boolean r1 = r15 instanceof p000.xm5
            if (r1 == 0) goto La0
            un1 r1 = r13.f27173n
            com.lingq.feature.onboarding.OnboardingEndViewModel$seedLynxMemory$1 r3 = new com.lingq.feature.onboarding.OnboardingEndViewModel$seedLynxMemory$1
            r3.<init>(r13, r5)
            r6 = 3
            p000.wfb.m23926u(r1, r5, r5, r3, r6)
        La0:
            r1 = r10
            r3 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            goto La8
        La6:
            wm5 r15 = p000.wm5.f67054a
        La8:
            boolean r6 = r8.m15570h(r6, r15)
            if (r6 == 0) goto L35
            xfa r0 = p000.xfa.f68157a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.onboarding.OnboardingEndViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
