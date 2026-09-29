package com.lingq.feature.search.search;

import com.lingq.core.domain.premiumlessons.C1525a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.jp8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$confirmPremiumLessonPurchase$1", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {298}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$confirmPremiumLessonPurchase$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32923a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2775b f32924b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32925c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f32926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$confirmPremiumLessonPurchase$1(C2775b c2775b, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f32924b = c2775b;
        this.f32925c = i;
        this.f32926d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchCollectionsStateHolder$confirmPremiumLessonPurchase$1(this.f32924b, this.f32925c, this.f32926d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchCollectionsStateHolder$confirmPremiumLessonPurchase$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32923a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2775b c2775b = this.f32924b;
            C3244l c3244l = c2775b.f33084t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jp8.m14581a((jp8) value, null, null, false, false, null, false, 62)));
            C1525a c1525a = c2775b.f33079o;
            int i2 = c2775b.f33086v.f72110b;
            this.f32923a = 1;
            if (c1525a.m8202a(i2, this.f32925c, this.f32926d, this) == coroutineSingletons) {
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
