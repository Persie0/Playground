package com.lingq.feature.search.search;

import com.lingq.feature.search.domain.C2766b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bp8;
import p000.c32;
import p000.cl9;
import p000.jp8;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;
import p000.zyc;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$withPremiumAndPaidContentCheck$1", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {248}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$withPremiumAndPaidContentCheck$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32973a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2775b f32974b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bp8 f32975c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f32976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$withPremiumAndPaidContentCheck$1(C2775b c2775b, bp8 bp8Var, ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f32974b = c2775b;
        this.f32975c = bp8Var;
        this.f32976d = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchCollectionsStateHolder$withPremiumAndPaidContentCheck$1(this.f32974b, this.f32975c, this.f32976d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchCollectionsStateHolder$withPremiumAndPaidContentCheck$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32973a;
        C2775b c2775b = this.f32974b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2766b c2766b = c2775b.f33080p;
            this.f32973a = 1;
            obj = c2766b.m9674a(this);
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
        bp8 bp8Var = this.f32975c;
        if (cl9.m4834Q(bp8Var.mo2972e(), (String) obj, false)) {
            this.f32976d.mo0a();
        } else {
            c2775b.f33087w = (zyc) bp8Var;
            C3244l c3244l = c2775b.f33084t;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jp8.m14581a((jp8) value, null, null, true, false, null, false, 59)));
        }
        return xfa.f68157a;
    }
}
