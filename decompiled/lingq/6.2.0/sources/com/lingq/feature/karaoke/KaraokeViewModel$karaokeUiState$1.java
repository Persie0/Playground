package com.lingq.feature.karaoke;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2907cy;
import p000.C2981ey;
import p000.InterfaceC3055gy;
import p000.aj3;
import p000.c32;
import p000.ch4;
import p000.fh4;
import p000.hc7;
import p000.hh4;
import p000.oh4;
import p000.u45;
import p000.u91;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeViewModel$karaokeUiState$1", m4291f = "KaraokeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeViewModel$karaokeUiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ch4 f26268a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ hh4 f26269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2118c f26270c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeViewModel$karaokeUiState$1(C2118c c2118c, Continuation continuation) {
        super(3, continuation);
        this.f26270c = c2118c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KaraokeViewModel$karaokeUiState$1 karaokeViewModel$karaokeUiState$1 = new KaraokeViewModel$karaokeUiState$1(this.f26270c, (Continuation) obj3);
        karaokeViewModel$karaokeUiState$1.f26268a = (ch4) obj;
        karaokeViewModel$karaokeUiState$1.f26269b = (hh4) obj2;
        return karaokeViewModel$karaokeUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        double dDoubleValue;
        ch4 ch4Var = this.f26268a;
        hh4 hh4Var = this.f26269b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        List list = ch4Var.f10086a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) obj2;
            Double d = lessonTranslationSentence.f19294c;
            Double d2 = lessonTranslationSentence.f19295d;
            if (d == null) {
                if (d2 != null) {
                    arrayList2.add(obj2);
                }
            } else if (d2 == null || d.doubleValue() != d2.doubleValue()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        int i = 0;
        LessonTranslationSentence lessonTranslationSentence2 = null;
        while (true) {
            if (!it.hasNext()) {
                InterfaceC3055gy interfaceC3055gy = hh4Var.f42364c;
                boolean z = interfaceC3055gy instanceof C2907cy;
                C2907cy c2907cy = z ? (C2907cy) interfaceC3055gy : null;
                int i2 = c2907cy != null ? c2907cy.f34700c : 0;
                boolean z2 = z || (interfaceC3055gy instanceof C2981ey);
                boolean z3 = ch4Var.f10088c;
                C2118c c2118c = this.f26270c;
                fh4 fh4Var = c2118c.f26299m;
                LessonTranslationSentence lessonTranslationSentence3 = lessonTranslationSentence2;
                boolean z4 = fh4Var.f39105b;
                u45 u45Var = hh4Var.f42362a;
                boolean z5 = (u45Var.f63398e != null && u45Var.f63399f == null) || (fh4Var.f39106c && z4);
                int i3 = hh4Var.f42363b;
                hc7 hc7Var = ch4Var.f10089d;
                if (hc7Var == null) {
                    hc7Var = new hc7(null, null, 8191);
                }
                return new oh4(arrayList, lessonTranslationSentence3, z3, z4, z5, i3, hc7Var, ch4Var.f10090e, c2118c.f26288b.mo4589b2(), z2, i2);
            }
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                vz1.m23628e0();
                throw null;
            }
            LessonTranslationSentence lessonTranslationSentence4 = (LessonTranslationSentence) next;
            Double d3 = lessonTranslationSentence4.f19294c;
            Double d4 = lessonTranslationSentence4.f19295d;
            if (d3 != null) {
                double dDoubleValue2 = d3.doubleValue();
                if (d4 != null) {
                    dDoubleValue = d4.doubleValue();
                } else {
                    LessonTranslationSentence lessonTranslationSentence5 = (LessonTranslationSentence) u91.m22592J0(i4, ch4Var.f10086a);
                    Double d5 = lessonTranslationSentence5 != null ? lessonTranslationSentence5.f19294c : null;
                    dDoubleValue = d5 != null ? d5.doubleValue() : 0.01d + dDoubleValue2;
                }
                boolean z6 = d4 != null && dDoubleValue2 == d4.doubleValue();
                long j = ch4Var.f10087b;
                ArrayList arrayList3 = arrayList;
                if (j >= dDoubleValue2 * 1000.0d && (j < ((long) (dDoubleValue * 1000.0d)) || (!z6 && dDoubleValue == dDoubleValue2))) {
                    lessonTranslationSentence2 = lessonTranslationSentence4;
                }
                arrayList = arrayList3;
            }
            arrayList.add(lessonTranslationSentence4);
            i = i4;
        }
    }
}
