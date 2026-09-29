package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.ox7;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$2", m4291f = "ReaderPageViewModel.kt", m4292l = {1577}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28607b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$2$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23591 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28608a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2411m f28609b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23591(C2411m c2411m, Continuation continuation) {
            super(2, continuation);
            this.f28609b = c2411m;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23591 c23591 = new C23591(this.f28609b, continuation);
            c23591.f28608a = obj;
            return c23591;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23591 c23591 = (C23591) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23591.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = (Map) this.f28608a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28609b;
            Locale locale = c2411m.f29253u;
            ox7 ox7Var = (ox7) c2411m.f29254v.getValue();
            List<xz7> list = ox7Var != null ? ox7Var.f55132e : EmptyList.f47638a;
            xz7 xz7Var = c2411m.f29251s;
            if (xz7Var != null) {
                String str = xz7Var.f69008e;
                C3211a c3211a = c2411m.f29232f0;
                locale.getClass();
                if (((LessonCard) map.get(vz1.m23610P(str, locale))) == null) {
                    for (xz7 xz7Var2 : list) {
                        String str2 = xz7Var2.f69008e;
                        locale.getClass();
                        if (((LessonCard) map.get(vz1.m23610P(str2, locale))) != null) {
                            c3211a.mo4677k(new Pair(xz7Var2, TooltipStep.FirstLingQ));
                            break;
                        }
                    }
                } else {
                    c3211a.mo4677k(new Pair(xz7Var, TooltipStep.FirstLingQ));
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$2(C2411m c2411m, Continuation continuation) {
        super(2, continuation);
        this.f28607b = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$2(this.f28607b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28606a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28607b;
            C3244l c3244l = c2411m.f29196A;
            C23591 c23591 = new C23591(c2411m, null);
            c3244l.getClass();
            this.f28606a = 1;
            if (AbstractC3224d.m15529h(c3244l, c23591, this) == coroutineSingletons) {
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
