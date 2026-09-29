package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import com.lingq.core.domain.model.token.TokenTranslations;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.lda;
import p000.u91;
import p000.un1;
import p000.vz1;
import p000.w3a;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$fetchTokenTranslation$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {144}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownViewModel$fetchTokenTranslation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458c f29620b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f29621c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$fetchTokenTranslation$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$fetchTokenTranslation$1$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {151}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24531 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f29622a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f29623b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2458c f29624c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f29625d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24531(C2458c c2458c, String str, Continuation continuation) {
            super(2, continuation);
            this.f29624c = c2458c;
            this.f29625d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24531 c24531 = new C24531(this.f29624c, this.f29625d, continuation);
            c24531.f29623b = obj;
            return c24531;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C24531) create((TokenTranslations) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Object value;
            C2458c c2458c = this.f29624c;
            C3244l c3244l = c2458c.f29673p;
            TokenTranslations tokenTranslations = (TokenTranslations) this.f29623b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f29622a;
            String str2 = this.f29625d;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (tokenTranslations != null) {
                    LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) c3244l.getValue());
                    Locale locale = c2458c.f29668k;
                    locale.getClass();
                    String strM23610P = vz1.m23610P(str2, locale);
                    TokenTranslationSimple tokenTranslationSimple = (TokenTranslationSimple) u91.m22591I0(tokenTranslations.f19618b);
                    if (tokenTranslationSimple == null || (str = tokenTranslationSimple.f19615a) == null) {
                        str = "";
                    }
                    linkedHashMapM15372Y.put(strM23610P, str);
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, linkedHashMapM15372Y));
                } else {
                    this.f29623b = null;
                    this.f29622a = 1;
                    if (AbstractC3208a.m15437d(500L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            wfb.m23926u(lda.m16103C(c2458c), null, null, new LessonMoveKnownViewModel$updateTokenTranslation$1(c2458c, str2, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownViewModel$fetchTokenTranslation$1(C2458c c2458c, String str, Continuation continuation) {
        super(2, continuation);
        this.f29620b = c2458c;
        this.f29621c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownViewModel$fetchTokenTranslation$1(this.f29620b, this.f29621c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownViewModel$fetchTokenTranslation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2458c c2458c = this.f29620b;
        cma cmaVar = c2458c.f29660c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29619a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            w3a w3aVar = c2458c.f29665h;
            String strMo4589b2 = cmaVar.mo4589b2();
            String strMo4580K1 = cmaVar.mo4580K1();
            String str = this.f29621c;
            c83 c83VarM7383i = ((C1306v) w3aVar).m7383i(strMo4589b2, strMo4580K1, str);
            C24531 c24531 = new C24531(c2458c, str, null);
            this.f29619a = 1;
            if (AbstractC3224d.m15529h(c83VarM7383i, c24531, this) == coroutineSingletons) {
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
