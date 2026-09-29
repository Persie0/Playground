package com.lingq.feature.reader.stats.p019ui.lingqs;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.un1;
import p000.v91;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$3", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {122}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteVocabularyViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2568b f31007b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$3$1", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25611 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f31008a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Map f31009b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C25611 c25611 = new C25611(3, (Continuation) obj3);
            c25611.f31008a = (List) obj;
            c25611.f31009b = (Map) obj2;
            return c25611.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = this.f31008a;
            Map map = this.f31009b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            List<LessonCard> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (LessonCard lessonCardM8033g : list2) {
                TokenMeaning tokenMeaning = (TokenMeaning) map.get(lessonCardM8033g.f19178a);
                if (lessonCardM8033g.f19183f.isEmpty() && tokenMeaning != null) {
                    lessonCardM8033g = LessonCard.m8033g(lessonCardM8033g, vz1.m23604J(tokenMeaning));
                }
                arrayList.add(lessonCardM8033g);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(((LessonCard) obj2).f19178a)) {
                    arrayList2.add(obj2);
                }
            }
            return new ArrayList(arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$3$2 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.lingqs.LessonCompleteVocabularyViewModel$3$2", m4291f = "LessonCompleteVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25622 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2568b f31011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25622(C2568b c2568b, Continuation continuation) {
            super(2, continuation);
            this.f31011b = c2568b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25622 c25622 = new C25622(this.f31011b, continuation);
            c25622.f31010a = obj;
            return c25622;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25622 c25622 = (C25622) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25622.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31010a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31011b.f31069p.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteVocabularyViewModel$3(C2568b c2568b, Continuation continuation) {
        super(2, continuation);
        this.f31007b = c2568b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteVocabularyViewModel$3(this.f31007b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteVocabularyViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31006a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2568b c2568b = this.f31007b;
            C3228h c3228h = new C3228h(c2568b.f31071r, c2568b.f31072s, new C25611(3, null));
            C25622 c25622 = new C25622(c2568b, null);
            this.f31006a = 1;
            if (AbstractC3224d.m15529h(c3228h, c25622, this) == coroutineSingletons) {
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
