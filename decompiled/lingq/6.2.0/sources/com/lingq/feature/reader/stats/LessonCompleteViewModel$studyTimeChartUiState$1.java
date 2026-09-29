package com.lingq.feature.reader.stats;

import com.lingq.core.domain.model.language.LanguageProgressChartEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.ql9;
import p000.u91;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$studyTimeChartUiState$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$studyTimeChartUiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f30705a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f30706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2535j f30707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$studyTimeChartUiState$1(C2535j c2535j, Continuation continuation) {
        super(3, continuation);
        this.f30707c = c2535j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonCompleteViewModel$studyTimeChartUiState$1 lessonCompleteViewModel$studyTimeChartUiState$1 = new LessonCompleteViewModel$studyTimeChartUiState$1(this.f30707c, (Continuation) obj3);
        lessonCompleteViewModel$studyTimeChartUiState$1.f30705a = (List) obj;
        lessonCompleteViewModel$studyTimeChartUiState$1.f30706b = (List) obj2;
        return lessonCompleteViewModel$studyTimeChartUiState$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2535j c2535j;
        ?? arrayList;
        float fM22631x0;
        float fM22631x1;
        List list = this.f30705a;
        List list2 = this.f30706b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
        Iterator it = list3.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2535j = this.f30707c;
            if (!zHasNext) {
                break;
            }
            LanguageProgressChartEntry languageProgressChartEntry = (LanguageProgressChartEntry) it.next();
            arrayList2.add(new Pair(C2535j.m9460V2(c2535j, languageProgressChartEntry.f19073c), new Float((float) (languageProgressChartEntry.f19074d / 60.0d))));
        }
        if (list2.size() > 7) {
            List<LanguageProgressChartEntry> listM22616h1 = u91.m22616h1(7, u91.m22615g1(list2, list2.size() - 7));
            arrayList = new ArrayList(v91.m23189q0(listM22616h1, 10));
            for (LanguageProgressChartEntry languageProgressChartEntry2 : listM22616h1) {
                arrayList.add(new Pair(C2535j.m9460V2(c2535j, languageProgressChartEntry2.f19073c), new Float((float) (languageProgressChartEntry2.f19074d / 60.0d))));
            }
        } else {
            arrayList = EmptyList.f47638a;
        }
        float f = 0.0f;
        if (arrayList2.isEmpty()) {
            fM22631x0 = 0.0f;
        } else {
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new Float(((Number) ((Pair) it2.next()).f47624b).floatValue()));
            }
            fM22631x0 = (float) u91.m22631x0(arrayList3);
        }
        if (((Collection) arrayList).isEmpty()) {
            fM22631x1 = 0.0f;
        } else {
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList4 = new ArrayList(v91.m23189q0(iterable, 10));
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                arrayList4.add(new Float(((Number) ((Pair) it3.next()).f47624b).floatValue()));
            }
            fM22631x1 = (float) u91.m22631x0(arrayList4);
        }
        if (fM22631x1 != 0.0f) {
            f = ((fM22631x0 - fM22631x1) / fM22631x1) * 100.0f;
        } else if (fM22631x0 > 0.0f) {
            f = 100.0f;
        }
        return new ql9(arrayList2, arrayList, fM22631x0, f);
    }
}
