package com.lingq.feature.reader.stats.p019ui.all;

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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$3", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {141}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30894b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$3$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25461 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f30895a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Map f30896b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C25461 c25461 = new C25461(3, (Continuation) obj3);
            c25461.f30895a = (List) obj;
            c25461.f30896b = (Map) obj2;
            return c25461.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = this.f30895a;
            Map map = this.f30896b;
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

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$3$2 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$3$2", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25472 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f30897a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2556c f30898b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25472(C2556c c2556c, Continuation continuation) {
            super(2, continuation);
            this.f30898b = c2556c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25472 c25472 = new C25472(this.f30898b, continuation);
            c25472.f30897a = obj;
            return c25472;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25472 c25472 = (C25472) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25472.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f30897a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f30898b.f30972t.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$3(C2556c c2556c, Continuation continuation) {
        super(2, continuation);
        this.f30894b = c2556c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$3(this.f30894b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30893a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2556c c2556c = this.f30894b;
            C3228h c3228h = new C3228h(c2556c.f30969q, c2556c.f30974v, new C25461(3, null));
            C25472 c25472 = new C25472(c2556c, null);
            this.f30893a = 1;
            if (AbstractC3224d.m15529h(c3228h, c25472, this) == coroutineSingletons) {
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
