package com.lingq.feature.reader.old.tutorial;

import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3540rl;
import p000.aj3;
import p000.c32;
import p000.un1;
import p000.v91;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$2", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {95}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29612a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458c f29613b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$2$1", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24511 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f29614a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Map f29615b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2458c f29616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24511(C2458c c2458c, Continuation continuation) {
            super(3, continuation);
            this.f29616c = c2458c;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C24511 c24511 = new C24511(this.f29616c, (Continuation) obj3);
            c24511.f29614a = (List) obj;
            c24511.f29615b = (Map) obj2;
            return c24511.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = this.f29614a;
            Map map = this.f29615b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            List<LessonWord> list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (LessonWord lessonWordM8073g : list2) {
                if (lessonWordM8073g.f19319f.isEmpty()) {
                    String str = lessonWordM8073g.f19314a;
                    Locale locale = this.f29616c.f29668k;
                    locale.getClass();
                    String str2 = (String) map.get(vz1.m23610P(str, locale));
                    if (str2 == null) {
                        str2 = "";
                    }
                    lessonWordM8073g = LessonWord.m8073g(lessonWordM8073g, vz1.m23604J(new TokenMeaning(0, null, str2, 0, false, null, true, 0, 763)));
                }
                arrayList.add(lessonWordM8073g);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$2$2 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownViewModel$2$2", m4291f = "LessonMoveKnownViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24522 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29617a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2458c f29618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24522(C2458c c2458c, Continuation continuation) {
            super(2, continuation);
            this.f29618b = c2458c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24522 c24522 = new C24522(this.f29618b, continuation);
            c24522.f29617a = obj;
            return c24522;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24522 c24522 = (C24522) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24522.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            List list = (List) this.f29617a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f29618b.f29671n;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, list));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownViewModel$2(C2458c c2458c, Continuation continuation) {
        super(2, continuation);
        this.f29613b = c2458c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownViewModel$2(this.f29613b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29612a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2458c c2458c = this.f29613b;
            C3228h c3228h = new C3228h(new C3540rl(c2458c.f29669l, 5), c2458c.f29673p, new C24511(c2458c, null));
            C24522 c24522 = new C24522(c2458c, null);
            this.f29612a = 1;
            if (AbstractC3224d.m15529h(c3228h, c24522, this) == coroutineSingletons) {
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
