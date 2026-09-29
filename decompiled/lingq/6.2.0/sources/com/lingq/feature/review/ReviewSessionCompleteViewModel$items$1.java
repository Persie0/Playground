package com.lingq.feature.review;

import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dj3;
import p000.e83;
import p000.le8;
import p000.me8;
import p000.ne8;
import p000.v91;
import p000.vs3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewSessionCompleteViewModel$items$1", m4291f = "ReviewSessionCompleteViewModel.kt", m4292l = {67}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSessionCompleteViewModel$items$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public int f31802a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f31803b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f31804c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Map f31805d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Map f31806e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ vs3 f31807f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2757e f31808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteViewModel$items$1(C2757e c2757e, Continuation continuation) {
        super(6, continuation);
        this.f31808g = c2757e;
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ReviewSessionCompleteViewModel$items$1 reviewSessionCompleteViewModel$items$1 = new ReviewSessionCompleteViewModel$items$1(this.f31808g, (Continuation) obj6);
        reviewSessionCompleteViewModel$items$1.f31803b = (e83) obj;
        reviewSessionCompleteViewModel$items$1.f31804c = (List) obj2;
        reviewSessionCompleteViewModel$items$1.f31805d = (Map) obj3;
        reviewSessionCompleteViewModel$items$1.f31806e = (Map) obj4;
        reviewSessionCompleteViewModel$items$1.f31807f = (vs3) obj5;
        return reviewSessionCompleteViewModel$items$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f31803b;
        List list = this.f31804c;
        Map map = this.f31805d;
        Map map2 = this.f31806e;
        vs3 vs3Var = this.f31807f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31802a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            C2757e c2757e = this.f31808g;
            arrayList.add(new le8(c2757e.f32476f, c2757e.f32475e));
            arrayList.add(new ne8(R$string.activities_terms_studied));
            List<LessonCard> list2 = list;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
            for (LessonCard lessonCard : list2) {
                Integer num = (Integer) map.get(lessonCard.f19178a);
                int iIntValue = 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                Integer num2 = (Integer) map2.get(lessonCard.f19178a);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                arrayList2.add(new me8(vs3Var, lessonCard, iIntValue2, iIntValue));
            }
            arrayList.addAll(arrayList2);
            this.f31803b = null;
            this.f31804c = null;
            this.f31805d = null;
            this.f31806e = null;
            this.f31807f = null;
            this.f31802a = 1;
            if (e83Var.emit(arrayList, this) == coroutineSingletons) {
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
