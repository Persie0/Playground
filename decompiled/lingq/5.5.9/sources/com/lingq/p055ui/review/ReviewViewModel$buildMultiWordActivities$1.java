package com.lingq.p055ui.review;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel", m19206f = "ReviewViewModel.kt", m19207l = {706, 715}, m19208m = "buildMultiWordActivities")
public final class ReviewViewModel$buildMultiWordActivities$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ReviewViewModel f29725d;

    /* JADX INFO: renamed from: e */
    public ArrayList f29726e;

    /* JADX INFO: renamed from: f */
    public Set f29727f;

    /* JADX INFO: renamed from: g */
    public int f29728g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f29729h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ReviewViewModel f29730i;

    /* JADX INFO: renamed from: j */
    public int f29731j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$buildMultiWordActivities$1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super ReviewViewModel$buildMultiWordActivities$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f29730i = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f29729h = obj;
        this.f29731j |= Integer.MIN_VALUE;
        return this.f29730i.m10258q2(this);
    }
}
