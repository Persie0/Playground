package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.v91;
import p000.vx7;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$3$1", m4291f = "ReaderPageFragment.kt", m4292l = {1532}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28587b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28588c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$3$1$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23571 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28589a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28590b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28591c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23571(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28590b = readerPageFragment;
            this.f28591c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23571 c23571 = new C23571(this.f28591c, this.f28590b, continuation);
            c23571.f28589a = obj;
            return c23571;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23571 c23571 = (C23571) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23571.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            List list = (List) this.f28589a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            C2412n c2412nM9298W0 = this.f28590b.m9298W0();
            list.getClass();
            C3244l c3244l = c2412nM9298W0.f29336Z1;
            LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) c3244l.getValue());
            int i = this.f28591c;
            Integer numValueOf = Integer.valueOf(i);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((LessonCard) obj2).m8040h()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = ((LessonCard) it.next()).f19178a;
                Locale locale = c2412nM9298W0.f29334Z;
                locale.getClass();
                arrayList2.add(vz1.m23610P(str, locale));
            }
            linkedHashMapM15372Y.put(numValueOf, arrayList2);
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, linkedHashMapM15372Y));
            List list2 = (List) linkedHashMapM15372Y.get(Integer.valueOf(i));
            int size = list2 != null ? list2.size() : 0;
            C3244l c3244l2 = c2412nM9298W0.f29350d1;
            do {
                value2 = c3244l2.getValue();
                ((Number) value2).intValue();
            } while (!c3244l2.m15570h(value2, Integer.valueOf(size)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageFragment$onViewCreated$3$1(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
        super(2, continuation);
        this.f28587b = readerPageFragment;
        this.f28588c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageFragment$onViewCreated$3$1(this.f28588c, this.f28587b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28586a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vx7 vx7Var = ReaderPageFragment.Companion;
            ReaderPageFragment readerPageFragment = this.f28587b;
            c18 c18Var = readerPageFragment.m9299X0().f29206K;
            C23571 c23571 = new C23571(this.f28588c, readerPageFragment, null);
            c18Var.getClass();
            this.f28586a = 1;
            if (AbstractC3224d.m15529h(c18Var, c23571, this) == coroutineSingletons) {
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
