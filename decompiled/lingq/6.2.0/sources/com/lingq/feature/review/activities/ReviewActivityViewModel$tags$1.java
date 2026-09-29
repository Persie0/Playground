package com.lingq.feature.review.activities;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.ar9;
import p000.c32;
import p000.u91;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivityViewModel$tags$1", m4291f = "ReviewActivityViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivityViewModel$tags$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f32310a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ LessonCard f32311b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2750e f32312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$tags$1(C2750e c2750e, Continuation continuation) {
        super(3, continuation);
        this.f32312c = c2750e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReviewActivityViewModel$tags$1 reviewActivityViewModel$tags$1 = new ReviewActivityViewModel$tags$1(this.f32312c, (Continuation) obj3);
        reviewActivityViewModel$tags$1.f32310a = (List) obj;
        reviewActivityViewModel$tags$1.f32311b = (LessonCard) obj2;
        return reviewActivityViewModel$tags$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f32310a;
        LessonCard lessonCard = this.f32311b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        List list2 = lessonCard.f19180c;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        List list3 = lessonCard.f19179b;
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            arrayList3.add(lowerCase2);
        }
        ArrayList arrayListM22603U0 = u91.m22603U0(arrayList3, arrayList2);
        List list4 = list;
        ArrayList arrayList4 = new ArrayList(v91.m23189q0(list4, 10));
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            String lowerCase3 = ((String) it3.next()).toLowerCase(Locale.ROOT);
            lowerCase3.getClass();
            arrayList4.add(lowerCase3);
        }
        Set setM22627s1 = u91.m22627s1(u91.m22603U0(arrayList4, arrayListM22603U0));
        ArrayList<String> arrayList5 = new ArrayList();
        for (Object obj2 : setM22627s1) {
            if (((String) obj2).length() > 0) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList(v91.m23189q0(arrayList5, 10));
        for (String str : arrayList5) {
            arrayList6.add(new ar9(str, this.f32312c.m9562X2(str)));
        }
        arrayList.addAll(arrayList6);
        return arrayList;
    }
}
