package com.lingq.feature.chat.domain;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.database.dao.C1315c;
import com.lingq.core.domain.model.chat.ChatMessageRating;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c83;
import p000.g91;
import p000.pv0;
import p000.um5;
import p000.vp0;
import p000.xm5;
import p000.ym5;
import p000.zg0;
import p000.zj6;
import p000.zw0;

/* JADX INFO: renamed from: com.lingq.feature.chat.domain.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1999d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25214a;

    /* JADX INFO: renamed from: b */
    public final zw0 f25215b;

    public C1999d(zw0 zw0Var, int i) {
        this.f25214a = i;
        zw0Var.getClass();
        switch (i) {
            case 1:
                this.f25215b = zw0Var;
                break;
            case 2:
                this.f25215b = zw0Var;
                break;
            case 3:
                this.f25215b = zw0Var;
                break;
            default:
                this.f25215b = zw0Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public c83 m8863a(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return str3.length() == 0 ? AbstractC3224d.m15536o(AbstractC3224d.m15546y(AbstractC1261a.m7044c(new zg0(this, str, str2, 11), new GetChatsUseCase$invoke$2(this, str, str2, null)), new GetChatsUseCase$invoke$3(2, null))) : AbstractC3224d.m15536o(AbstractC3224d.m15546y(AbstractC1261a.m7044c(new g91(this, str, str2, str3, 3), new GetChatsUseCase$invoke$5(this, str, str3, null)), new GetChatsUseCase$invoke$6(2, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8864b(String str, int i, int i2, ChatMessageRating chatMessageRating, ChatMessageRating chatMessageRating2, ContinuationImpl continuationImpl) throws Throwable {
        UpdateChatMessageRatingUseCase$invoke$1 updateChatMessageRatingUseCase$invoke$1;
        if (continuationImpl instanceof UpdateChatMessageRatingUseCase$invoke$1) {
            updateChatMessageRatingUseCase$invoke$1 = (UpdateChatMessageRatingUseCase$invoke$1) continuationImpl;
            int i3 = updateChatMessageRatingUseCase$invoke$1.f25207c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                updateChatMessageRatingUseCase$invoke$1.f25207c = i3 - Integer.MIN_VALUE;
            } else {
                updateChatMessageRatingUseCase$invoke$1 = new UpdateChatMessageRatingUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateChatMessageRatingUseCase$invoke$1 = new UpdateChatMessageRatingUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7153c = updateChatMessageRatingUseCase$invoke$1.f25205a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = updateChatMessageRatingUseCase$invoke$1.f25207c;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM7153c);
            zw0 zw0Var = this.f25215b;
            if (chatMessageRating != chatMessageRating2) {
                updateChatMessageRatingUseCase$invoke$1.f25207c = 1;
                Object objM7168r = ((C1289e) zw0Var).m7168r(str, i, i2, chatMessageRating2, updateChatMessageRatingUseCase$invoke$1);
                if (objM7168r != coroutineSingletons) {
                    return objM7168r;
                }
            } else {
                UpdateChatMessageRatingUseCase$invoke$1 updateChatMessageRatingUseCase$invoke$2 = updateChatMessageRatingUseCase$invoke$1;
                updateChatMessageRatingUseCase$invoke$2.f25207c = 2;
                objM7153c = ((C1289e) zw0Var).m7153c(i, i2, str, updateChatMessageRatingUseCase$invoke$2);
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            AbstractC3193b.m15359b(objM7153c);
            return objM7153c;
        }
        if (i4 != 2) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM7153c);
        ym5 ym5Var = (ym5) objM7153c;
        if (ym5Var instanceof xm5) {
            return new xm5(null);
        }
        return ym5Var instanceof um5 ? ym5Var : new um5(zj6.f71653a);
    }

    /* JADX INFO: renamed from: c */
    public C3235e m8865c(int i, String str, ArrayList arrayList) {
        int i2 = this.f25214a;
        zw0 zw0Var = this.f25215b;
        str.getClass();
        switch (i2) {
            case 1:
                C1289e c1289e = (C1289e) zw0Var;
                c1289e.getClass();
                C1315c c1315c = c1289e.f16467a;
                c1315c.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM ChatMessagePhrasesEntity WHERE chatId = ? AND messageIndex IN (");
                return AbstractC3224d.m15546y(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1315c.f17001K, true, new String[]{"ChatMessagePhrasesEntity"}, new vp0(AbstractC3393o1.m17736k(")", sb, arrayList), i, arrayList, c1315c))), new GetPhraseSuggestionsForMessagesUseCase$invoke$1(2, null));
            default:
                C1289e c1289e2 = (C1289e) zw0Var;
                c1289e2.getClass();
                C1315c c1315c2 = c1289e2.f16467a;
                c1315c2.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM ChatMessageTranslationEntity WHERE chatId = ? AND messageIndex IN (");
                return AbstractC3224d.m15546y(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1315c2.f17001K, true, new String[]{"ChatMessageTranslationEntity"}, new pv0(i, 0, AbstractC3393o1.m17736k(")", sb2, arrayList), arrayList))), new GetTranslationForMessagesUseCase$invoke$1(2, null));
        }
    }
}
