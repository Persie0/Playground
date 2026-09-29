package com.lingq.core.token;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.c32;
import p000.c83;
import p000.f5a;
import p000.g41;
import p000.g5a;
import p000.g91;
import p000.l83;
import p000.lda;
import p000.m83;
import p000.pg9;
import p000.ph2;
import p000.qk9;
import p000.t62;
import p000.u91;
import p000.v72;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$15", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$15 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23498b;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenUpdateViewModel$15$1 */
    @c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$15$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18951 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f23499a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1909e f23500b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f23501c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f23502d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TokenPopupData f23503e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18951(C1909e c1909e, String str, String str2, TokenPopupData tokenPopupData, Continuation continuation) {
            super(2, continuation);
            this.f23500b = c1909e;
            this.f23501c = str;
            this.f23502d = str2;
            this.f23503e = tokenPopupData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18951 c18951 = new C18951(this.f23500b, this.f23501c, this.f23502d, this.f23503e, continuation);
            c18951.f23499a = ((Boolean) obj).booleanValue();
            return c18951;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C18951 c18951 = (C18951) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18951.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            g91 g91Var;
            C3244l c3244l;
            String str2;
            int i;
            int i2;
            g91 g91Var2;
            int i3;
            C3244l c3244l2;
            String str3;
            Object value;
            boolean z = this.f23499a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str4 = this.f23502d;
            TokenPopupData tokenPopupData = this.f23503e;
            C1909e c1909e = this.f23500b;
            if (z) {
                int i4 = c1909e.f23880R;
                TokenType tokenType = tokenPopupData.f23447c;
                TokenType tokenType2 = TokenType.NewWordOrPhraseType;
                String str5 = this.f23501c;
                if (tokenType == tokenType2) {
                    g91 g91Var3 = new g91(c1909e, str5, str4, tokenPopupData, 15);
                    str = str5;
                    str4 = str4;
                    g91Var = g91Var3;
                } else {
                    str = str5;
                    g91Var = null;
                }
                C3244l c3244l3 = c1909e.f23885W;
                C3244l c3244l4 = c1909e.f23881S;
                String str6 = tokenPopupData.f23445a;
                int i5 = tokenPopupData.f23439M;
                String str7 = (String) tokenPopupData.f23436J.getOrDefault(str4, "");
                if (str7.length() > 0) {
                    while (true) {
                        Object value2 = c3244l4.getValue();
                        C3244l c3244l5 = c3244l4;
                        String str8 = str7;
                        str7 = str8;
                        if (c3244l5.m15570h(value2, new TokenMeaning(-33, str4, str8, 0, false, str4, false, 0, 136))) {
                            break;
                        }
                        c3244l4 = c3244l5;
                    }
                } else {
                    int i6 = -1;
                    if (i5 != -1) {
                        i4 = i5;
                    }
                    while (true) {
                        Object value3 = c3244l3.getValue();
                        if (c3244l3.m15570h(value3, f5a.m11558a((f5a) value3, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, true, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097095))) {
                            break;
                        }
                        c3244l3 = c3244l3;
                    }
                    while (true) {
                        Object value4 = c3244l4.getValue();
                        c3244l = c3244l4;
                        str2 = str6;
                        i = i5;
                        i2 = i6;
                        g91Var2 = g91Var;
                        i3 = i4;
                        c3244l2 = c3244l3;
                        str3 = str;
                        if (c3244l.m15570h(value4, new TokenMeaning(-1, str4, "", 0, false, str4, false, 0, 136))) {
                            break;
                        }
                        c3244l3 = c3244l2;
                        i5 = i;
                        c3244l4 = c3244l;
                        i6 = i2;
                        str6 = str2;
                        str = str3;
                        g91Var = g91Var2;
                        i4 = i3;
                    }
                    String str9 = str4;
                    m83 m83Var = new m83(c1909e.f23892f.m18872P(i3, tokenPopupData.f23434H, tokenPopupData.f23435I, str3, str9, str2), new TokenUpdateViewModel$loadCwtIfApplicable$4(c1909e, str9, null), 2);
                    g41 g41VarM16103C = lda.m16103C(c1909e);
                    String strM17734i = AbstractC3393o1.m17734i("cwt ", tokenPopupData.f23446b);
                    v72 v72Var = ph2.f56212a;
                    t62 t62Var = t62.f61909c;
                    AbstractC1263a.m7049d(m83Var, g41VarM16103C, strM17734i, t62Var);
                    int i7 = tokenPopupData.f23434H;
                    int i8 = tokenPopupData.f23435I;
                    boolean z2 = i != i2;
                    int i9 = tokenPopupData.f23440N;
                    pg9 pg9Var = c1909e.f23884V;
                    if (pg9Var != null) {
                        pg9Var.mo4537a(null);
                    }
                    if (c1909e.f23876N.m19362a()) {
                        c1909e.f23884V = wfb.m23926u(lda.m16103C(c1909e), t62Var, null, new TokenUpdateViewModel$fetchCwt$3(c1909e, str3, i3, str2, i7, i8, z2, i9, new qk9(9, g91Var2, c1909e), null), 2);
                    } else {
                        do {
                            value = c3244l.getValue();
                        } while (!c3244l.m15570h(value, null));
                        while (true) {
                            Object value5 = c3244l2.getValue();
                            C3244l c3244l6 = c3244l2;
                            if (c3244l6.m15570h(value5, f5a.m11558a((f5a) value5, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, true, true, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097095))) {
                                break;
                            }
                            c3244l2 = c3244l6;
                        }
                    }
                }
            } else if (tokenPopupData.f23447c == TokenType.NewWordOrPhraseType) {
                C1909e.m8730V2(c1909e, this.f23501c, str4, tokenPopupData.f23446b, tokenPopupData.f23443Q);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$15(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23498b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$15 tokenUpdateViewModel$15 = new TokenUpdateViewModel$15(this.f23498b, continuation);
        tokenUpdateViewModel$15.f23497a = obj;
        return tokenUpdateViewModel$15;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$15 tokenUpdateViewModel$15 = (TokenUpdateViewModel$15) create((g5a) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$15.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        int i;
        Object value;
        C1909e c1909e = this.f23498b;
        C3244l c3244l = c1909e.f23885W;
        g5a g5aVar = (g5a) this.f23497a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        String str2 = g5aVar.f40250a;
        List list = g5aVar.f40251b;
        TokenPopupData tokenPopupData = g5aVar.f40252c;
        String str3 = g5aVar.f40253d;
        if (tokenPopupData != null) {
            TokenType tokenType = tokenPopupData.f23447c;
            String str4 = tokenPopupData.f23446b;
            if (str2.length() > 0 && !list.isEmpty() && str3.length() > 0) {
                String str5 = (String) u91.m22591I0(((f5a) c3244l.getValue()).f38470b);
                m83 m83Var = new m83(c1909e.f23888b.m8710a(str2, tokenPopupData), new TokenUpdateViewModel$initializeAndLoadTokenData$1(c1909e, str2, tokenPopupData, list, str5 == null ? "en" : str5, null), 2);
                g41 g41VarM16103C = lda.m16103C(c1909e);
                v72 v72Var = ph2.f56212a;
                t62 t62Var = t62.f61909c;
                AbstractC1263a.m7049d(m83Var, g41VarM16103C, "tokenData", t62Var);
                String str6 = tokenPopupData.f23442P;
                String str7 = (str6 == null && (str6 = (String) u91.m22591I0(list)) == null) ? "en" : str6;
                boolean z = tokenPopupData.f23444R;
                TokenControllerType tokenControllerType = tokenPopupData.f23452h;
                boolean z2 = tokenControllerType == TokenControllerType.Lesson || tokenControllerType == TokenControllerType.LessonExpanded || tokenControllerType == TokenControllerType.LessonVideo;
                TokenType tokenType2 = TokenType.NewWordOrPhraseType;
                boolean z3 = tokenType != tokenType2 ? !(z || vk9.m23380c0(str4, " ", false)) : !(tokenPopupData.f23454j < 0 || z || vk9.m23380c0(str4, " ", false) || vk9.m23380c0(str4, "-", false) || tokenPopupData.f23456l || tokenPopupData.f23439M != -1);
                if (z2 && !str2.equals(str7) && z3) {
                    c83 c83VarM15536o = AbstractC3224d.m15536o(((C1368a) c1909e.f23866D.f39280a).f18467z1);
                    C18951 c18951 = new C18951(c1909e, str2, str7, tokenPopupData, null);
                    tokenPopupData = tokenPopupData;
                    AbstractC1263a.m7049d(new m83(c83VarM15536o, c18951, 2), lda.m16103C(c1909e), "shouldCheckCwt", t62Var);
                } else {
                    String str8 = str7;
                    if (tokenType == tokenType2 || vk9.m23380c0(str4, " ", false)) {
                        C1909e.m8730V2(c1909e, str2, str8, str4, tokenPopupData.f23443Q);
                    }
                }
                if (tokenType != tokenType2) {
                    String str9 = tokenPopupData.f23446b;
                    TokenFragmentData tokenFragmentData = tokenPopupData.f23450f;
                    String str10 = tokenFragmentData.f23315a;
                    int i2 = tokenFragmentData.f23316b;
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, true, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, Integer.MAX_VALUE, 2097151)));
                    str = str2;
                    i = 1;
                    l83 l83Var = new l83(new m83(c1909e.f23894h.m8726a(str, str9, TokenType.WordType, str10, i2), new TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2(c1909e, null), 2), new TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$3(c1909e, null), 1);
                    g41 g41VarM16103C2 = lda.m16103C(c1909e);
                    v72 v72Var2 = ph2.f56212a;
                    AbstractC1263a.m7049d(l83Var, g41VarM16103C2, "related phrases", t62.f61909c);
                } else {
                    str = str2;
                    i = 1;
                }
                if (!vk9.m23391n0(str4)) {
                    AbstractC1263a.m7049d(new l83(new m83(c1909e.f23889c.m8727b(str, str4, str3), new TokenUpdateViewModel$observePopularMeanings$1(c1909e, null), 2), new TokenUpdateViewModel$observePopularMeanings$2(c1909e, null), i), lda.m16103C(c1909e), "popular meanings", t62.f61909c);
                }
            }
        }
        return xfa.f68157a;
    }
}
