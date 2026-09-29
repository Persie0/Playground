package com.lingq.feature.reader.video;

import com.lingq.core.data.repository.C1290f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zl3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$toggleCourseSubscription$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {387}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$toggleCourseSubscription$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31322c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f31323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$toggleCourseSubscription$1(C2583a c2583a, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f31321b = c2583a;
        this.f31322c = i;
        this.f31323d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$toggleCourseSubscription$1(this.f31321b, this.f31322c, this.f31323d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$toggleCourseSubscription$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31320a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            zl3 zl3Var = this.f31321b.f31382o;
            this.f31320a = 1;
            Object objM7187k = ((C1290f) zl3Var.f71694a).m7187k(this.f31322c, this.f31323d, this);
            if (objM7187k != coroutineSingletons) {
                objM7187k = xfaVar;
            }
            if (objM7187k == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
