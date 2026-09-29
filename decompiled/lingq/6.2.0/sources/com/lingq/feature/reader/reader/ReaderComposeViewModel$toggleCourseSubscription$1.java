package com.lingq.feature.reader.reader;

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
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$toggleCourseSubscription$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {941}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$toggleCourseSubscription$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f30127c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f30128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$toggleCourseSubscription$1(C2493a c2493a, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f30126b = c2493a;
        this.f30127c = i;
        this.f30128d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderComposeViewModel$toggleCourseSubscription$1(this.f30126b, this.f30127c, this.f30128d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderComposeViewModel$toggleCourseSubscription$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30125a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            zl3 zl3Var = this.f30126b.f30181C;
            this.f30125a = 1;
            Object objM7187k = ((C1290f) zl3Var.f71694a).m7187k(this.f30127c, this.f30128d, this);
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
