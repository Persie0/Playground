package com.lingq.feature.chat;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.analytics.data.modules.ChatEngagedDataType;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.chat.ChatPhraseCard;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1533a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.u91;
import p000.un1;
import p000.vk9;
import p000.xa2;
import p000.xfa;
import p000.y7d;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$updatePhraseStatus$1", m4291f = "ChatViewModel.kt", m4292l = {1827, 1845}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$updatePhraseStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TokenStatus f25073b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2009m f25074c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ChatPhrase f25075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$updatePhraseStatus$1(TokenStatus tokenStatus, C2009m c2009m, ChatPhrase chatPhrase, Continuation continuation) {
        super(2, continuation);
        this.f25073b = tokenStatus;
        this.f25074c = c2009m;
        this.f25075d = chatPhrase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$updatePhraseStatus$1(this.f25073b, this.f25074c, this.f25075d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$updatePhraseStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r0.m8211b(-1, r4, r3, r9, r1, r2, false, false, r7, r22) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (r0.m24431a(r1, r2, r3, -1, r22) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ad, code lost:
    
        return r11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2009m c2009m = this.f25074c;
        cma cmaVar = c2009m.f25273M;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25072a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            TokenStatus tokenStatus = TokenStatus.Known;
            TokenStatus tokenStatus2 = this.f25073b;
            if (tokenStatus2 == tokenStatus) {
                c2009m.f25279S.mo8922a1(ChatEngagedDataType.KnownWordsAdded, new Integer(1));
            }
            ChatPhrase chatPhrase = this.f25075d;
            ChatPhraseCard chatPhraseCard = chatPhrase.f18941e;
            if (chatPhraseCard != null || tokenStatus2 != TokenStatus.Ignored) {
                if (chatPhraseCard == null) {
                    C1533a c1533a = c2009m.f25310w;
                    String strMo4589b2 = cmaVar.mo4589b2();
                    String str = chatPhrase.f18937a;
                    TokenMeaning tokenMeaning = (TokenMeaning) u91.m22591I0(chatPhrase.f18942f);
                    if (tokenMeaning == null) {
                        String strMo4580K1 = cmaVar.mo4580K1();
                        String strMo4580K2 = cmaVar.mo4580K1();
                        String str2 = chatPhrase.f18938b;
                        tokenMeaning = new TokenMeaning(0, strMo4580K1, vk9.m23391n0(str2) ? null : str2, 0, false, strMo4580K2, false, 0, 953);
                    }
                    int iM24986e = y7d.m24986e(tokenStatus2);
                    String str3 = chatPhrase.f18940d;
                    String value = LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue();
                    this.f25072a = 1;
                } else {
                    xa2 xa2Var = c2009m.f25311x;
                    String strMo4589b3 = cmaVar.mo4589b2();
                    String str4 = chatPhrase.f18937a;
                    int iM24986e2 = y7d.m24986e(tokenStatus2);
                    this.f25072a = 2;
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
