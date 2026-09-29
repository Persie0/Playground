package com.lingq.p055ui.home.vocabulary;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "vocabularyCanReview", "showReviewFromDeeplink", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.vocabulary.VocabularyViewModel$showReview$1", m19206f = "VocabularyViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class VocabularyViewModel$showReview$1 extends SuspendLambda implements InterfaceC2057q<Boolean, Boolean, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f26312e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean f26313f;

    public VocabularyViewModel$showReview$1(InterfaceC9968c<? super VocabularyViewModel$showReview$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Boolean bool, Boolean bool2, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        VocabularyViewModel$showReview$1 vocabularyViewModel$showReview$1 = new VocabularyViewModel$showReview$1(interfaceC9968c);
        vocabularyViewModel$showReview$1.f26312e = zBooleanValue;
        vocabularyViewModel$showReview$1.f26313f = zBooleanValue2;
        return vocabularyViewModel$showReview$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return Boolean.valueOf(this.f26312e && this.f26313f);
    }
}
