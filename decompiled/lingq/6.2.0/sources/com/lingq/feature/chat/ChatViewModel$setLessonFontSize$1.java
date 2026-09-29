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
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$setLessonFontSize$1", m4291f = "ChatViewModel.kt", m4292l = {1872}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$setLessonFontSize$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25013a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f25014b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25015c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$setLessonFontSize$1(C2009m c2009m, int i, Continuation continuation) {
        super(2, continuation);
        this.f25014b = c2009m;
        this.f25015c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$setLessonFontSize$1(this.f25014b, this.f25015c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$setLessonFontSize$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25013a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f25014b.f25272L;
            this.f25013a = 1;
            if (((C1368a) si7Var).m7895o(this.f25015c, this) == coroutineSingletons) {
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
