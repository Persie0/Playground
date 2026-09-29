package com.lingq.feature.reader.vocabulary;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.reader.vocabulary.model.VocabularyType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.cj3;
import p000.fa4;
import p000.gm5;
import p000.j75;
import p000.ma3;
import p000.n83;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vz1;
import p000.w65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$5", m4291f = "LessonVocabularyViewModel.kt", m4292l = {190}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonVocabularyViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2610a f31591b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$5$1 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$5$1", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26031 extends SuspendLambda implements cj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f31592a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ List f31593b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Map f31594c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ VocabularyType f31595d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C2610a f31596e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26031(C2610a c2610a, Continuation continuation) {
            super(5, continuation);
            this.f31596e = c2610a;
        }

        @Override // p000.cj3
        /* JADX INFO: renamed from: i */
        public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            C26031 c26031 = new C26031(this.f31596e, (Continuation) obj5);
            c26031.f31592a = (List) obj;
            c26031.f31593b = (List) obj2;
            c26031.f31594c = (Map) obj3;
            c26031.f31595d = (VocabularyType) obj4;
            return c26031.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Locale locale = this.f31596e.f31668n;
            List list = this.f31592a;
            List list2 = this.f31593b;
            Map map = this.f31594c;
            VocabularyType vocabularyType = this.f31595d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            List<LessonCard> list3 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
            for (LessonCard lessonCardM8033g : list3) {
                TokenMeaning tokenMeaning = (TokenMeaning) map.get(lessonCardM8033g.f19178a);
                if (lessonCardM8033g.f19183f.isEmpty() && tokenMeaning != null) {
                    lessonCardM8033g = LessonCard.m8033g(lessonCardM8033g, vz1.m23604J(tokenMeaning));
                }
                arrayList.add(lessonCardM8033g);
            }
            ArrayList<LessonWord> arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (vocabularyType == VocabularyType.NewWords ? fa4.m11650l(((LessonWord) next).f19322i, WordStatus.New.getValue()) : true) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            for (LessonWord lessonWordM8073g : arrayList2) {
                TokenMeaning tokenMeaning2 = (TokenMeaning) map.get(lessonWordM8073g.f19314a);
                if (lessonWordM8073g.f19319f.isEmpty() && tokenMeaning2 != null) {
                    lessonWordM8073g = LessonWord.m8073g(lessonWordM8073g, vz1.m23604J(tokenMeaning2));
                }
                arrayList3.add(lessonWordM8073g);
            }
            int i = j75.f45147a[vocabularyType.ordinal()];
            List listM22614f1 = arrayList;
            if (i != 1) {
                if (i == 2) {
                    listM22614f1 = arrayList3;
                } else {
                    if (i != 3) {
                        gm5.m12750e();
                        return null;
                    }
                    ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str = ((LessonCard) it2.next()).f19178a;
                        locale.getClass();
                        arrayList4.add(vz1.m23610P(str, locale));
                    }
                    Set setM22627s1 = u91.m22627s1(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        String str2 = ((LessonWord) obj2).f19314a;
                        locale.getClass();
                        if (!setM22627s1.contains(vz1.m23610P(str2, locale))) {
                            arrayList5.add(obj2);
                        }
                    }
                    listM22614f1 = u91.m22614f1(u91.m22603U0(arrayList5, arrayList), new ma3(27));
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : listM22614f1) {
                if (hashSet.add(((w65) obj3).mo8037d())) {
                    arrayList6.add(obj3);
                }
            }
            return new ArrayList(arrayList6);
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$5$2 */
    @c32(m4290c = "com.lingq.feature.reader.vocabulary.LessonVocabularyViewModel$5$2", m4291f = "LessonVocabularyViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C26042 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f31597a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2610a f31598b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26042(C2610a c2610a, Continuation continuation) {
            super(2, continuation);
            this.f31598b = c2610a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C26042 c26042 = new C26042(this.f31598b, continuation);
            c26042.f31597a = obj;
            return c26042;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C26042 c26042 = (C26042) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c26042.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f31597a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f31598b.f31669o.m15571i(list);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonVocabularyViewModel$5(C2610a c2610a, Continuation continuation) {
        super(2, continuation);
        this.f31591b = c2610a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonVocabularyViewModel$5(this.f31591b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonVocabularyViewModel$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31590a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2610a c2610a = this.f31591b;
            n83 n83VarM15531j = AbstractC3224d.m15531j(c2610a.f31671q, c2610a.f31672r, c2610a.f31673s, new C3540rl(c2610a.f31676v, 5), new C26031(c2610a, null));
            C26042 c26042 = new C26042(c2610a, null);
            this.f31590a = 1;
            if (AbstractC3224d.m15529h(n83VarM15531j, c26042, this) == coroutineSingletons) {
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
