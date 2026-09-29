package com.lingq.p055ui.review;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p264mi.C7566f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"", "Lmi/f;", "cardsForAnswers", "", "hasTTS", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$cardsForAnswers$2", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class ReviewViewModel$cardsForAnswers$2 extends SuspendLambda implements InterfaceC2057q<List<? extends C7566f>, Boolean, InterfaceC9968c<? super List<? extends C7566f>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f29732e;

    public ReviewViewModel$cardsForAnswers$2(InterfaceC9968c<? super ReviewViewModel$cardsForAnswers$2> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends C7566f> list, Boolean bool, InterfaceC9968c<? super List<? extends C7566f>> interfaceC9968c) {
        bool.booleanValue();
        ReviewViewModel$cardsForAnswers$2 reviewViewModel$cardsForAnswers$2 = new ReviewViewModel$cardsForAnswers$2(interfaceC9968c);
        reviewViewModel$cardsForAnswers$2.f29732e = list;
        return reviewViewModel$cardsForAnswers$2.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return this.f29732e;
    }
}
