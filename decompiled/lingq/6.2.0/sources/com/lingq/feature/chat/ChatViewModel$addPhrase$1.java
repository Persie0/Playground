package com.lingq.feature.chat;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1533a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e05;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$addPhrase$1", m4291f = "ChatViewModel.kt", m4292l = {1786}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$addPhrase$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24917a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24918b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e05 f24919c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$addPhrase$1(C2009m c2009m, e05 e05Var, Continuation continuation) {
        super(2, continuation);
        this.f24918b = c2009m;
        this.f24919c = e05Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$addPhrase$1(this.f24918b, this.f24919c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$addPhrase$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24917a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2009m c2009m = this.f24918b;
            C1533a c1533a = c2009m.f25310w;
            String strMo4589b2 = c2009m.f25273M.mo4589b2();
            e05 e05Var = this.f24919c;
            String str = e05Var.f36528a;
            TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(e05Var.f36529b);
            if (tokenMeaning == null) {
                tokenMeaning = new TokenMeaning(0, null, "", 0, false, null, false, 0, 1019);
            }
            int value = CardStatus.New.getValue();
            String str2 = e05Var.f36531d;
            String value2 = LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue();
            this.f24917a = 1;
            if (c1533a.m8211b(-1, strMo4589b2, str, tokenMeaning, value, str2, false, false, value2, this) == coroutineSingletons) {
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
