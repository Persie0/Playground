package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import com.lingq.core.database.dao.C1315c;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3475pw;
import p000.aj3;
import p000.bx0;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.ld0;
import p000.wl3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$observeSuggestions$$inlined$flatMapLatest$1", m4291f = "ChatViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ChatViewModel$observeSuggestions$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f24978a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f24979b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f24980c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2009m f24981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$observeSuggestions$$inlined$flatMapLatest$1(C2009m c2009m, Continuation continuation) {
        super(3, continuation);
        this.f24981d = c2009m;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatViewModel$observeSuggestions$$inlined$flatMapLatest$1 chatViewModel$observeSuggestions$$inlined$flatMapLatest$1 = new ChatViewModel$observeSuggestions$$inlined$flatMapLatest$1(this.f24981d, (Continuation) obj3);
        chatViewModel$observeSuggestions$$inlined$flatMapLatest$1.f24979b = (e83) obj;
        chatViewModel$observeSuggestions$$inlined$flatMapLatest$1.f24980c = obj2;
        return chatViewModel$observeSuggestions$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f24979b;
        Object obj2 = this.f24980c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24978a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        Pair pair = (Pair) obj2;
        String str = (String) pair.f47623a;
        Integer num = (Integer) pair.f47624b;
        wl3 wl3Var = this.f24981d.f25303p;
        wl3Var.getClass();
        str.getClass();
        C1289e c1289e = (C1289e) wl3Var.f66997a;
        c1289e.getClass();
        C1315c c1315c = c1289e.f16467a;
        int iIntValue = num != null ? num.intValue() : 0;
        c1315c.getClass();
        c83 c83VarM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(c1315c.f17001K, false, new String[]{"ChatSuggestionEntity"}, new ld0(str, iIntValue, 2)), 0));
        this.f24979b = null;
        this.f24980c = null;
        this.f24978a = 1;
        AbstractC3224d.m15539r(e83Var);
        Object objCollect = c83VarM15536o.collect(new C3475pw(e83Var, 22), this);
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        if (objCollect != coroutineSingletons) {
            objCollect = xfaVar;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
