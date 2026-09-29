package com.lingq.core.settings.review;

import com.lingq.core.settings.ViewKeys;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.xfa;
import p000.yf8;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.review.ReviewSettingsViewModel$state$2", m4291f = "ReviewSettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewSettingsViewModel$state$2 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f23175a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ViewKeys f23176b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Pair f23177c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        ReviewSettingsViewModel$state$2 reviewSettingsViewModel$state$2 = new ReviewSettingsViewModel$state$2(4, (Continuation) obj4);
        reviewSettingsViewModel$state$2.f23175a = (List) obj;
        reviewSettingsViewModel$state$2.f23176b = (ViewKeys) obj2;
        reviewSettingsViewModel$state$2.f23177c = (Pair) obj3;
        return reviewSettingsViewModel$state$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f23175a;
        ViewKeys viewKeys = this.f23176b;
        Pair pair = this.f23177c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Pair pair2 = (Pair) pair.f47623a;
        Pair pair3 = (Pair) pair.f47624b;
        return new yf8(list, viewKeys, (ViewKeys) pair2.f47623a, (String) pair2.f47624b, ((Boolean) pair3.f47623a).booleanValue(), ((Number) pair3.f47624b).intValue());
    }
}
