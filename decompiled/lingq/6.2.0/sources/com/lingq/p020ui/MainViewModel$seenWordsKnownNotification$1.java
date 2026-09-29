package com.lingq.p020ui;

import com.lingq.core.datastore.C1369b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nm7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.MainViewModel$seenWordsKnownNotification$1", m4291f = "MainViewModel.kt", m4292l = {274}, m4293m = "invokeSuspend", m4294v = 2)
final class MainViewModel$seenWordsKnownNotification$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f34136a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2889e f34137b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$seenWordsKnownNotification$1(C2889e c2889e, Continuation continuation) {
        super(2, continuation);
        this.f34137b = c2889e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainViewModel$seenWordsKnownNotification$1(this.f34137b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MainViewModel$seenWordsKnownNotification$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f34136a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            nm7 nm7Var = this.f34137b.f34215q;
            this.f34136a = 1;
            if (((C1369b) nm7Var).m7925l(true, this) == coroutineSingletons) {
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
