package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.ChatHistoryEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3704w;
import p000.bl2;
import p000.bq1;
import p000.lv0;
import p000.ov0;
import p000.qn0;
import p000.qn3;
import p000.s70;
import p000.sv0;
import p000.tv0;
import p000.uv0;
import p000.vv0;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1315c extends bq1 {
    public static final vv0 Companion = new vv0();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f17001K;

    /* JADX INFO: renamed from: L */
    public final bl2 f17002L;

    /* JADX INFO: renamed from: M */
    public final qn3 f17003M = new qn3(20);

    /* JADX INFO: renamed from: N */
    public final bl2 f17004N;

    /* JADX INFO: renamed from: O */
    public final bl2 f17005O;

    /* JADX INFO: renamed from: P */
    public final bl2 f17006P;

    /* JADX INFO: renamed from: Q */
    public final bl2 f17007Q;

    /* JADX INFO: renamed from: R */
    public final bl2 f17008R;

    /* JADX INFO: renamed from: S */
    public final bl2 f17009S;

    /* JADX INFO: renamed from: T */
    public final bl2 f17010T;

    /* JADX INFO: renamed from: U */
    public final bl2 f17011U;

    public C1315c(AbstractC0746d abstractC0746d) {
        this.f17001K = abstractC0746d;
        int i = 2;
        this.f17002L = new bl2(new tv0(this, i), new uv0(this, i));
        int i2 = 3;
        int i3 = 4;
        this.f17004N = new bl2(new sv0(i2), new qn0(i3));
        sv0 sv0Var = new sv0(i3);
        int i4 = 5;
        this.f17005O = new bl2(sv0Var, new qn0(i4));
        this.f17006P = new bl2(new sv0(i4), new qn0(6));
        int i5 = 0;
        int i6 = 1;
        this.f17007Q = new bl2(new sv0(i5), new qn0(i6));
        this.f17008R = new bl2(new tv0(this, i5), new uv0(this, i5));
        this.f17009S = new bl2(new sv0(i6), new qn0(i));
        this.f17010T = new bl2(new tv0(this, i6), new uv0(this, i6));
        this.f17011U = new bl2(new sv0(i), new qn0(i2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z0 */
    public static Object m7463z0(C1315c c1315c, String str, int i, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        ChatDao$replaceChatSuggestions$1 chatDao$replaceChatSuggestions$1;
        if (continuationImpl instanceof ChatDao$replaceChatSuggestions$1) {
            chatDao$replaceChatSuggestions$1 = (ChatDao$replaceChatSuggestions$1) continuationImpl;
            int i2 = chatDao$replaceChatSuggestions$1.f16866f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatDao$replaceChatSuggestions$1.f16866f = i2 - Integer.MIN_VALUE;
            } else {
                chatDao$replaceChatSuggestions$1 = new ChatDao$replaceChatSuggestions$1(c1315c, continuationImpl);
            }
        } else {
            chatDao$replaceChatSuggestions$1 = new ChatDao$replaceChatSuggestions$1(c1315c, continuationImpl);
        }
        Object obj = chatDao$replaceChatSuggestions$1.f16864d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = chatDao$replaceChatSuggestions$1.f16866f;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            chatDao$replaceChatSuggestions$1.f16861a = c1315c;
            chatDao$replaceChatSuggestions$1.f16862b = arrayList;
            chatDao$replaceChatSuggestions$1.f16863c = i;
            chatDao$replaceChatSuggestions$1.f16866f = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ov0(str, i), c1315c.f17001K, chatDao$replaceChatSuggestions$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = chatDao$replaceChatSuggestions$1.f16863c;
        arrayList = chatDao$replaceChatSuggestions$1.f16862b;
        c1315c = chatDao$replaceChatSuggestions$1.f16861a;
        AbstractC3193b.m15359b(obj);
        chatDao$replaceChatSuggestions$1.f16861a = null;
        chatDao$replaceChatSuggestions$1.f16862b = null;
        chatDao$replaceChatSuggestions$1.f16863c = i;
        chatDao$replaceChatSuggestions$1.f16866f = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new C3704w(8, c1315c, arrayList), c1315c.f17001K, chatDao$replaceChatSuggestions$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new s70(12, this, (ChatHistoryEntity) obj), this.f17001K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new lv0(this, (ArrayList) list, 2), this.f17001K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m7464y0(String str, int i, ArrayList arrayList, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new ChatDao_Impl$replaceChatSuggestions$2(this, str, i, arrayList, null), this.f17001K, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
