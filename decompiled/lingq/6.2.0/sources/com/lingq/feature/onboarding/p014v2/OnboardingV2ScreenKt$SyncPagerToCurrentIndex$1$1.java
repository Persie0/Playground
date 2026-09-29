package com.lingq.feature.onboarding.p014v2;

import androidx.compose.foundation.pager.AbstractC0150d;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.OnboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1", m4291f = "OnboardingV2Screen.kt", m4292l = {551, 553}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f27312b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0150d f27313c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f27314d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f27315e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1(List list, AbstractC0150d abstractC0150d, int i, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f27312b = list;
        this.f27313c = abstractC0150d;
        this.f27314d = i;
        this.f27315e = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1(this.f27312b, this.f27313c, this.f27314d, this.f27315e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (androidx.compose.foundation.pager.AbstractC0150d.m1031u(r7, r5, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r7.m1032f(r5, p000.ss5.m21698Y(0.0f, 0.0f, null, 7), r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27311a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            t66 t66Var = this.f27315e;
            List list = (List) t66Var.getValue();
            List list2 = this.f27312b;
            boolean zM11650l = fa4.m11650l(list, list2);
            t66Var.setValue(list2);
            AbstractC0150d abstractC0150d = this.f27313c;
            int iM1036k = abstractC0150d.m1036k();
            int i2 = this.f27314d;
            if (iM1036k != i2) {
                if (zM11650l) {
                    this.f27311a = 2;
                } else {
                    this.f27311a = 1;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
