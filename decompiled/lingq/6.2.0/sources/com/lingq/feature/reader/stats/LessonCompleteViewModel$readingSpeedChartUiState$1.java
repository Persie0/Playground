package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.language.LanguageProgressChartEntry;
import com.lingq.core.domain.model.lesson.LessonStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.C3029g8;
import p000.InterfaceC3066h8;
import p000.bj3;
import p000.c32;
import p000.u91;
import p000.v91;
import p000.x08;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$readingSpeedChartUiState$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$readingSpeedChartUiState$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f30636a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC3066h8 f30637b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LessonStats f30638c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2535j f30639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$readingSpeedChartUiState$1(C2535j c2535j, Continuation continuation) {
        super(4, continuation);
        this.f30639d = c2535j;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        LessonCompleteViewModel$readingSpeedChartUiState$1 lessonCompleteViewModel$readingSpeedChartUiState$1 = new LessonCompleteViewModel$readingSpeedChartUiState$1(this.f30639d, (Continuation) obj4);
        lessonCompleteViewModel$readingSpeedChartUiState$1.f30636a = (List) obj;
        lessonCompleteViewModel$readingSpeedChartUiState$1.f30637b = (InterfaceC3066h8) obj2;
        lessonCompleteViewModel$readingSpeedChartUiState$1.f30638c = (LessonStats) obj3;
        return lessonCompleteViewModel$readingSpeedChartUiState$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f30636a;
        InterfaceC3066h8 interfaceC3066h8 = this.f30637b;
        LessonStats lessonStats = this.f30638c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List<LanguageProgressChartEntry> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (LanguageProgressChartEntry languageProgressChartEntry : list2) {
            arrayList.add(new Pair(languageProgressChartEntry.f19073c, new Float((float) languageProgressChartEntry.f19074d)));
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new Float(((Number) ((Pair) it.next()).f47624b).floatValue()));
        }
        float f = 0.0f;
        if (arrayList2.size() >= 2) {
            float fFloatValue = ((Number) AbstractC3393o1.m17731f(2, arrayList2)).floatValue();
            float fFloatValue2 = ((Number) u91.m22597O0(arrayList2)).floatValue();
            if (fFloatValue != 0.0f) {
                f = ((fFloatValue2 - fFloatValue) / fFloatValue) * 100.0f;
            } else if (fFloatValue2 > 0.0f) {
                f = 100.0f;
            }
        }
        Double d = null;
        Double d2 = interfaceC3066h8 instanceof C3029g8 ? new Double(((C3029g8) interfaceC3066h8).f40370b.f19088j.f19076a) : null;
        Double d3 = lessonStats != null ? new Double(lessonStats.f19275i) : null;
        double dDoubleValue = 0.0d;
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (Math.abs(dDoubleValue2) > Double.MAX_VALUE || dDoubleValue2 <= 0.0d) {
                d2 = null;
            }
        } else {
            d2 = null;
        }
        if (d3 != null) {
            double dDoubleValue3 = d3.doubleValue();
            if (Math.abs(dDoubleValue3) <= Double.MAX_VALUE && dDoubleValue3 > 0.0d) {
                d = d3;
            }
        }
        if (d2 != null) {
            dDoubleValue = d2.doubleValue();
        } else if (d != null) {
            dDoubleValue = d.doubleValue();
        }
        return new x08(f, (int) dDoubleValue, arrayList);
    }
}
