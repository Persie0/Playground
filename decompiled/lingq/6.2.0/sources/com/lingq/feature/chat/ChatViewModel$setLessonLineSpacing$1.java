package com.lingq.feature.chat;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$setLessonLineSpacing$1", m4291f = "ChatViewModel.kt", m4292l = {1878}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$setLessonLineSpacing$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25016a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f25017b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ double f25018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$setLessonLineSpacing$1(C2009m c2009m, double d, Continuation continuation) {
        super(2, continuation);
        this.f25017b = c2009m;
        this.f25018c = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$setLessonLineSpacing$1(this.f25017b, this.f25018c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$setLessonLineSpacing$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25016a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f25017b.f25272L;
            this.f25016a = 1;
            if (((C1368a) si7Var).m7897p(this.f25018c, this) == coroutineSingletons) {
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
