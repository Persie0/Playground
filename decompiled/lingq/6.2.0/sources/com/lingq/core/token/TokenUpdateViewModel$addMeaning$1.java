package com.lingq.core.token;

import com.lingq.core.analytics.data.LqAnalyticsValues$LingQCreatedLocation;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.token.C1533a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.az5;
import p000.bz5;
import p000.c32;
import p000.f5a;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$addMeaning$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1342}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$addMeaning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23536a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23537b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f23538c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f23539d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f23540e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenMeaning f23541f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23542g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TokenFragmentData f23543h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f23544i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f23545j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f23546k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ TokenPopupData f23547l;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenUpdateViewModel$addMeaning$1$1 */
    @c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$addMeaning$1$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {1378, 1379}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18961 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f23548a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1909e f23549b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18961(C1909e c1909e, Continuation continuation) {
            super(2, continuation);
            this.f23549b = c1909e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18961(this.f23549b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18961) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
        
            if (r6.mo4239l2(0, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f23548a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f23548a = 1;
                if (AbstractC3208a.m15437d(2000L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
            bz5 bz5Var = this.f23549b.f23871I;
            this.f23548a = 2;
            az5 az5Var = bz5.Companion;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$addMeaning$1(C1909e c1909e, int i, String str, String str2, TokenMeaning tokenMeaning, int i2, TokenFragmentData tokenFragmentData, boolean z, boolean z2, boolean z3, TokenPopupData tokenPopupData, Continuation continuation) {
        super(2, continuation);
        this.f23537b = c1909e;
        this.f23538c = i;
        this.f23539d = str;
        this.f23540e = str2;
        this.f23541f = tokenMeaning;
        this.f23542g = i2;
        this.f23543h = tokenFragmentData;
        this.f23544i = z;
        this.f23545j = z2;
        this.f23546k = z3;
        this.f23547l = tokenPopupData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenUpdateViewModel$addMeaning$1(this.f23537b, this.f23538c, this.f23539d, this.f23540e, this.f23541f, this.f23542g, this.f23543h, this.f23544i, this.f23545j, this.f23546k, this.f23547l, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenUpdateViewModel$addMeaning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String value2;
        Object objM8211b;
        C1909e c1909e = this.f23537b;
        C3244l c3244l = c1909e.f23885W;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23536a;
        int i2 = 1;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1533a c1533a = c1909e.f23900n;
                int i3 = this.f23538c;
                String str = this.f23539d;
                String str2 = this.f23540e;
                TokenMeaning tokenMeaning = this.f23541f;
                int i4 = this.f23542g;
                String str3 = this.f23543h.f23315a;
                boolean z = this.f23544i;
                boolean z2 = this.f23545j;
                if (z) {
                    value2 = LqAnalyticsValues$LingQCreatedLocation.Sentence.getValue();
                } else {
                    TokenPopupData tokenPopupData = ((f5a) c3244l.getValue()).f38475g;
                    if (tokenPopupData != null) {
                        TokenControllerType tokenControllerType = tokenPopupData.f23452h;
                        if (tokenControllerType == TokenControllerType.LessonVideo) {
                            value2 = LqAnalyticsValues$LingQCreatedLocation.VideoMode.getValue();
                        } else if (tokenControllerType == TokenControllerType.LessonExpanded || tokenControllerType == TokenControllerType.Lesson) {
                            value2 = tokenPopupData.f23439M != -1 ? LqAnalyticsValues$LingQCreatedLocation.AiChat.getValue() : LqAnalyticsValues$LingQCreatedLocation.Page.getValue();
                        } else {
                            value2 = (tokenControllerType == TokenControllerType.Vocabulary || tokenControllerType == TokenControllerType.Review || tokenControllerType == TokenControllerType.ReviewSentence) ? LqAnalyticsValues$LingQCreatedLocation.VocabImport.getValue() : LqAnalyticsValues$LingQCreatedLocation.PagingPrompt.getValue();
                        }
                    } else {
                        value2 = LqAnalyticsValues$LingQCreatedLocation.PagingPrompt.getValue();
                    }
                    i2 = 1;
                }
                this.f23536a = i2;
                objM8211b = c1533a.m8211b(i3, str, str2, tokenMeaning, i4, str3, z, z2, value2, this);
                if (objM8211b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM8211b = obj;
            }
            if (((Boolean) objM8211b).booleanValue()) {
                c1909e.f23868F.mo8737E(this.f23540e);
                c1909e.f23869G.mo8766i1();
                wfb.m23926u(c1909e.f23877O, null, null, new C18961(c1909e, null), 3);
            }
            c1909e.m8755a3(this.f23547l, this.f23546k);
        } catch (Exception e) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, AbstractC3393o1.m17734i("Add Meaning Error: ", e.getMessage()), null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -17, 2097151)));
        }
        return xfa.f68157a;
    }
}
