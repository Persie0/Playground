package com.lingq.feature.search.search;

import com.lingq.core.domain.user.C1539a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fm6;
import p000.ij7;
import p000.jp8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$requestPremiumLesson$1", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {271}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$requestPremiumLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2775b f32966b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f32967c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f32968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$requestPremiumLesson$1(C2775b c2775b, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f32966b = c2775b;
        this.f32967c = i;
        this.f32968d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchCollectionsStateHolder$requestPremiumLesson$1(this.f32966b, this.f32967c, this.f32968d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchCollectionsStateHolder$requestPremiumLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32965a;
        C2775b c2775b = this.f32966b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1539a c1539a = c2775b.f33078n;
            this.f32965a = 1;
            obj = c1539a.m8225a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        C3244l c3244l = c2775b.f33084t;
        int i2 = this.f32967c;
        if (iIntValue < i2) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, jp8.m14581a((jp8) value2, null, new fm6(i2, iIntValue), false, false, null, false, 61)));
        } else {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jp8.m14581a((jp8) value, new ij7(i2, iIntValue, this.f32968d), null, false, false, null, false, 62)));
        }
        return xfa.f68157a;
    }
}
