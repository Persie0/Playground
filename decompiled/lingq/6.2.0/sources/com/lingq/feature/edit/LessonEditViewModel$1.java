package com.lingq.feature.edit;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.dx8;
import p000.e83;
import p000.fx8;
import p000.l83;
import p000.m23;
import p000.m83;
import p000.t66;
import p000.un1;
import p000.v91;
import p000.xc9;
import p000.xfa;
import p000.yw8;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$1", m4291f = "LessonEditViewModel.kt", m4292l = {180, 183}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25860b;

    /* JADX INFO: renamed from: com.lingq.feature.edit.LessonEditViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$1$1", m4291f = "LessonEditViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20701 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2077c f25861a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20701(C2077c c2077c, Continuation continuation) {
            super(2, continuation);
            this.f25861a = c2077c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20701(this.f25861a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20701 c20701 = (C20701) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20701.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25861a.f25945o;
            fx8 fx8Var = new fx8(1);
            c3244l.getClass();
            c3244l.m15572j(null, fx8Var);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.edit.LessonEditViewModel$1$2 */
    @c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$1$2", m4291f = "LessonEditViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20712 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Throwable f25862a;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C20712 c20712 = new C20712(3, (Continuation) obj3);
            c20712.f25862a = (Throwable) obj2;
            xfa xfaVar = xfa.f68157a;
            c20712.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th = this.f25862a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            th.printStackTrace();
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.edit.LessonEditViewModel$1$3 */
    @c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$1$3", m4291f = "LessonEditViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20723 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25863a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2077c f25864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20723(C2077c c2077c, Continuation continuation) {
            super(2, continuation);
            this.f25864b = c2077c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20723 c20723 = new C20723(this.f25864b, continuation);
            c20723.f25863a = obj;
            return c20723;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20723 c20723 = (C20723) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20723.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2077c c2077c = this.f25864b;
            t66 t66Var = c2077c.f25947q;
            List list = (List) this.f25863a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (!list.isEmpty()) {
                C3244l c3244l = c2077c.f25945o;
                List<LessonTranslationSentence> list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                for (LessonTranslationSentence lessonTranslationSentence : list2) {
                    arrayList.add(new dx8(lessonTranslationSentence.f19292a, lessonTranslationSentence.f19296e, lessonTranslationSentence));
                }
                fx8 fx8Var = new fx8(arrayList, false);
                c3244l.getClass();
                c3244l.m15572j(null, fx8Var);
                yw8 yw8Var = (yw8) ((xc9) t66Var).getValue();
                int size = list.size();
                boolean z = yw8Var.f70596b;
                yw8Var.getClass();
                ((xc9) t66Var).setValue(new yw8(size, z));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$1(C2077c c2077c, Continuation continuation) {
        super(2, continuation);
        this.f25860b = c2077c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$1(this.f25860b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r1, r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25859a;
        C2077c c2077c = this.f25860b;
        if (i != 0) {
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
        }
        AbstractC3193b.m15359b(obj);
        m23 m23Var = c2077c.f25932b;
        c2077c.f25940j.mo4589b2();
        int i2 = c2077c.f25942l;
        this.f25859a = 1;
        obj = AbstractC3224d.m15536o(((C1295k) m23Var.f50448a).f16498b.mo7487D0(i2));
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        l83 l83Var = new l83(new m83((c83) obj, new C20701(c2077c, null)), new C20712(3, null), 1);
        C20723 c20723 = new C20723(c2077c, null);
        this.f25859a = 2;
    }
}
