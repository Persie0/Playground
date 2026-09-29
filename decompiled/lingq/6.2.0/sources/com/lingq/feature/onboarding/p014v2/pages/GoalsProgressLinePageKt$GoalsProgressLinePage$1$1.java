package com.lingq.feature.onboarding.p014v2.pages;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.qc9;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.GoalsProgressLinePageKt$GoalsProgressLinePage$1$1", m4291f = "GoalsProgressLinePage.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GoalsProgressLinePageKt$GoalsProgressLinePage$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qc9 f27487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalsProgressLinePageKt$GoalsProgressLinePage$1$1(qc9 qc9Var, Continuation continuation) {
        super(2, continuation);
        this.f27487b = qc9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoalsProgressLinePageKt$GoalsProgressLinePage$1$1(this.f27487b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GoalsProgressLinePageKt$GoalsProgressLinePage$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27486a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f27486a = 1;
            if (AbstractC3208a.m15437d(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f27487b.m19862i(1.0f);
        return xfa.f68157a;
    }
}
