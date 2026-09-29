package com.lingq.feature.vocabulary;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.feature.vocabulary.state.C2862d;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b0b;
import p000.c32;
import p000.cma;
import p000.cz1;
import p000.e0b;
import p000.eh9;
import p000.fa4;
import p000.un1;
import p000.vk9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.VocabularyViewModel$observeActiveLanguage$1", m4291f = "VocabularyViewModel.kt", m4292l = {124}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyViewModel$observeActiveLanguage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2824b f33517b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.VocabularyViewModel$observeActiveLanguage$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.VocabularyViewModel$observeActiveLanguage$1$1", m4291f = "VocabularyViewModel.kt", m4292l = {85}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28221 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f33518a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f33519b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2824b f33520c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28221(C2824b c2824b, Continuation continuation) {
            super(2, continuation);
            this.f33520c = c2824b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28221 c28221 = new C28221(this.f33520c, continuation);
            c28221.f33519b = obj;
            return c28221;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28221) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Language language = (Language) this.f33519b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f33518a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (language != null) {
                    String str = language.f19024a;
                    C2824b c2824b = this.f33520c;
                    C2862d c2862d = c2824b.f33526d;
                    cma cmaVar = c2824b.f33524b;
                    b0b b0bVar = c2824b.f33530h;
                    boolean zMo4595s1 = cmaVar.mo4595s1();
                    c2862d.getClass();
                    c2862d.m9773f(new cz1(4, zMo4595s1));
                    String str2 = b0bVar.f7739a;
                    String str3 = b0bVar.f7739a;
                    if (!vk9.m23391n0(str2) && !fa4.m11650l(str, str3)) {
                        c2862d.f33811q = EmptyList.f47638a;
                        c2862d.f33812r = 0;
                        c2862d.f33813s = false;
                        c2862d.f33814t = new VocabularySearchQuery();
                        c2862d.f33816v = true;
                        c2862d.f33817w = false;
                        c2862d.f33818x = true;
                        c2862d.m9773f(new e0b(6));
                        this.f33519b = null;
                        this.f33518a = 1;
                        if (cmaVar.mo4576F1(str3, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (vk9.m23391n0(str3) || !fa4.m11650l(str, str3)) {
                        c2862d.m9772e(str, false);
                    } else {
                        c2862d.m9772e(str, !vk9.m23391n0(b0bVar.f7740b));
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyViewModel$observeActiveLanguage$1(C2824b c2824b, Continuation continuation) {
        super(2, continuation);
        this.f33517b = c2824b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyViewModel$observeActiveLanguage$1(this.f33517b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyViewModel$observeActiveLanguage$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33516a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2824b c2824b = this.f33517b;
            eh9 eh9VarMo4572B0 = c2824b.f33524b.mo4572B0();
            C28221 c28221 = new C28221(c2824b, null);
            eh9VarMo4572B0.getClass();
            this.f33516a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c28221, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
