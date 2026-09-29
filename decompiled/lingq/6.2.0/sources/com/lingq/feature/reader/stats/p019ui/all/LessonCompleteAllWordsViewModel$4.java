package com.lingq.feature.reader.stats.p019ui.all;

import com.lingq.core.domain.model.lesson.LessonWord;
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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$4", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {162}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30900b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$4$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$4$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25481 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f30901a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Map f30902b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C25481 c25481 = new C25481(3, (Continuation) obj3);
            c25481.f30901a = (List) obj;
            c25481.f30902b = (Map) obj2;
            return c25481.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = this.f30901a;
            Map map = this.f30902b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            List<LessonWord> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (LessonWord lessonWordM8073g : list2) {
                TokenMeaning tokenMeaning = (TokenMeaning) map.get(lessonWordM8073g.f19314a);
                if (lessonWordM8073g.f19319f.isEmpty() && tokenMeaning != null) {
                    lessonWordM8073g = LessonWord.m8073g(lessonWordM8073g, vz1.m23604J(tokenMeaning));
                }
                arrayList.add(lessonWordM8073g);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(((LessonWord) obj2).f19314a)) {
                    arrayList2.add(obj2);
                }
            }
            return new ArrayList(arrayList2);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$4$2 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$4$2", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25492 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f30903a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2556c f30904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25492(C2556c c2556c, Continuation continuation) {
            super(2, continuation);
            this.f30904b = c2556c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25492 c25492 = new C25492(this.f30904b, continuation);
            c25492.f30903a = obj;
            return c25492;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25492 c25492 = (C25492) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25492.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f30903a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f30904b.f30970r.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$4(C2556c c2556c, Continuation continuation) {
        super(2, continuation);
        this.f30900b = c2556c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$4(this.f30900b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30899a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2556c c2556c = this.f30900b;
            C3228h c3228h = new C3228h(c2556c.f30968p, c2556c.f30974v, new C25481(3, null));
            C25492 c25492 = new C25492(c2556c, null);
            this.f30899a = 1;
            if (AbstractC3224d.m15529h(c3228h, c25492, this) == coroutineSingletons) {
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
