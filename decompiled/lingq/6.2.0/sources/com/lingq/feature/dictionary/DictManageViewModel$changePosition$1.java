package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$changePosition$1", m4291f = "DictManageViewModel.kt", m4292l = {222}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$changePosition$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2057b f25683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25684c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$changePosition$1(C2057b c2057b, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f25683b = c2057b;
        this.f25684c = i;
        this.f25685d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictManageViewModel$changePosition$1(this.f25683b, this.f25684c, this.f25685d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictManageViewModel$changePosition$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25682a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25683b;
            xf2 xf2Var = c2057b.f25793c;
            String strMo4589b2 = c2057b.f25792b.mo4589b2();
            this.f25682a = 1;
            if (((C1292h) xf2Var).m7197c(this.f25684c, this.f25685d, strMo4589b2, this) == coroutineSingletons) {
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
