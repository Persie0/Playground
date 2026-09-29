package com.lingq.p055ui.review;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel", m19206f = "ReviewViewModel.kt", m19207l = {518}, m19208m = "checkActivityValidAndShow")
final class ReviewViewModel$checkActivityValidAndShow$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ReviewViewModel f29743d;

    /* JADX INFO: renamed from: e */
    public AbstractC9953a f29744e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f29745f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ReviewViewModel f29746g;

    /* JADX INFO: renamed from: h */
    public int f29747h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$checkActivityValidAndShow$1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super ReviewViewModel$checkActivityValidAndShow$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f29746g = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f29745f = obj;
        this.f29747h |= Integer.MIN_VALUE;
        return ReviewViewModel.m10246l2(this.f29746g, null, this);
    }
}
