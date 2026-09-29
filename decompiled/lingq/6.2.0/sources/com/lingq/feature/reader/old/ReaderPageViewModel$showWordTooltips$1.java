package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.status.WordStatus;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.ox7;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$showWordTooltips$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1412, 1417, 1422}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$showWordTooltips$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public xz7 f28730a;

    /* JADX INFO: renamed from: b */
    public int f28731b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2411m f28732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$showWordTooltips$1(C2411m c2411m, Continuation continuation) {
        super(2, continuation);
        this.f28732c = c2411m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$showWordTooltips$1(this.f28732c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$showWordTooltips$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(320, r12) == r2) goto L39;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        xz7 xz7Var;
        xz7 xz7Var2;
        C2411m c2411m = this.f28732c;
        C3211a c3211a = c2411m.f29232f0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28731b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ox7 ox7Var = (ox7) c2411m.f29254v.getValue();
            Iterator it = (ox7Var != null ? ox7Var.f55132e : EmptyList.f47638a).iterator();
            while (true) {
                if (it.hasNext()) {
                    xz7Var = (xz7) it.next();
                    Map map = (Map) c2411m.f29197B.getValue();
                    String str = xz7Var.f69008e;
                    Locale locale = c2411m.f29253u;
                    locale.getClass();
                    LessonWord lessonWord = (LessonWord) map.get(vz1.m23610P(str, locale));
                    if (lessonWord != null && fa4.m11650l(lessonWord.f19322i, WordStatus.New.getValue())) {
                        this.f28730a = xz7Var;
                        this.f28731b = 1;
                        if (AbstractC3208a.m15437d(320L, this) != coroutineSingletons) {
                            break;
                        }
                        return coroutineSingletons;
                    }
                }
                return xfa.f68157a;
            }
        }
        if (i == 1) {
            xz7Var = this.f28730a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                xz7Var = this.f28730a;
                AbstractC3193b.m15359b(obj);
                c3211a.mo4677k(new Pair(xz7Var, TooltipStep.TapSecondBlueWord));
                if (c2411m.mo8753Z0(TooltipStep.TapThirdBlueWord)) {
                    this.f28730a = xz7Var;
                    this.f28731b = 3;
                    if (AbstractC3208a.m15437d(320L, this) != coroutineSingletons) {
                        xz7Var2 = xz7Var;
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            }
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xz7Var2 = this.f28730a;
            AbstractC3193b.m15359b(obj);
        }
        c3211a.mo4677k(new Pair(xz7Var2, TooltipStep.TapThirdBlueWord));
        return xfa.f68157a;
        TooltipStep tooltipStep = TooltipStep.TapBlueWord;
        if (c2411m.mo8753Z0(tooltipStep)) {
            c3211a.mo4677k(new Pair(xz7Var, tooltipStep));
        }
        if (!c2411m.mo8753Z0(TooltipStep.TapSecondBlueWord)) {
            if (c2411m.mo8753Z0(TooltipStep.TapThirdBlueWord)) {
                this.f28730a = xz7Var;
                this.f28731b = 3;
                if (AbstractC3208a.m15437d(320L, this) != coroutineSingletons) {
                    xz7Var2 = xz7Var;
                    c3211a.mo4677k(new Pair(xz7Var2, TooltipStep.TapThirdBlueWord));
                }
            }
            return xfa.f68157a;
        }
        this.f28730a = xz7Var;
        this.f28731b = 2;
        return coroutineSingletons;
    }
}
