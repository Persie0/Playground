package com.lingq.feature.chat;

import com.lingq.core.domain.model.chat.ChatMessageRating;
import com.lingq.feature.chat.domain.C1999d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.c32;
import p000.e65;
import p000.h0a;
import p000.sm5;
import p000.un1;
import p000.v94;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$updateMessageRating$2", m4291f = "ChatViewModel.kt", m4292l = {1476}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$updateMessageRating$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25064a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f25065b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f25066c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25067d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f25068e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChatMessageRating f25069f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ChatMessageRating f25070g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Pair f25071h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$updateMessageRating$2(C2009m c2009m, String str, int i, int i2, ChatMessageRating chatMessageRating, ChatMessageRating chatMessageRating2, Pair pair, Continuation continuation) {
        super(2, continuation);
        this.f25065b = c2009m;
        this.f25066c = str;
        this.f25067d = i;
        this.f25068e = i2;
        this.f25069f = chatMessageRating;
        this.f25070g = chatMessageRating2;
        this.f25071h = pair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$updateMessageRating$2(this.f25065b, this.f25066c, this.f25067d, this.f25068e, this.f25069f, this.f25070g, this.f25071h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$updateMessageRating$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8864b;
        Object value;
        v94 v94VarM23191a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25064a;
        C2009m c2009m = this.f25065b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1999d c1999d = c2009m.f25267G;
            this.f25064a = 1;
            objM8864b = c1999d.m8864b(this.f25066c, this.f25067d, this.f25068e, this.f25069f, this.f25070g, this);
            if (objM8864b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM8864b = obj;
        }
        ym5 ym5Var = (ym5) objM8864b;
        C3244l c3244l = c2009m.f25281U;
        do {
            value = c3244l.getValue();
            v94 v94Var = (v94) value;
            Set set = v94Var.f65051O;
            Map map = v94Var.f65050N;
            LinkedHashSet linkedHashSetM19793w = AbstractC3489q9.m19793w(set, this.f25071h);
            if (ym5Var instanceof xm5) {
                int i2 = this.f25067d;
                Map mapM15360M = (Map) e65.m10872d(i2, map);
                if (mapM15360M == null) {
                    mapM15360M = AbstractC3194a.m15360M();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapM15360M);
                ChatMessageRating chatMessageRating = (ChatMessageRating) ((xm5) ym5Var).f68348a;
                int i3 = this.f25068e;
                if (chatMessageRating != null) {
                    linkedHashMap.put(new Integer(i3), chatMessageRating);
                } else {
                    linkedHashMap.remove(new Integer(i3));
                }
                v94VarM23191a = v94.m23191a(v94Var, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, AbstractC3194a.m15368U(map, new Pair(new Integer(i2), linkedHashMap)), linkedHashSetM19793w, null, -1, 639);
            } else {
                sm5.Companion.getClass();
                h0a.f41641a.mo11433g("ChatViewModel: updateMessageRating failed", new Object[0]);
                v94VarM23191a = v94.m23191a(v94Var, null, null, false, false, null, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, linkedHashSetM19793w, null, -1, 767);
            }
        } while (!c3244l.m15570h(value, v94VarM23191a));
        return xfa.f68157a;
    }
}
