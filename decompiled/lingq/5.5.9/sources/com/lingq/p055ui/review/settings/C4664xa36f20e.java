package com.lingq.p055ui.review.settings;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: renamed from: com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$canChangeStudySentenceSettings$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {888, 889, 890}, m19208m = "canChangeStudySentenceSettings")
final class C4664xa36f20e extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f30234d;

    /* JADX INFO: renamed from: e */
    public Boolean[] f30235e;

    /* JADX INFO: renamed from: f */
    public Boolean[] f30236f;

    /* JADX INFO: renamed from: g */
    public int f30237g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f30238h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DataStoreReviewSettingsViewModel f30239i;

    /* JADX INFO: renamed from: j */
    public int f30240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4664xa36f20e(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, InterfaceC9968c<? super C4664xa36f20e> interfaceC9968c) {
        super(interfaceC9968c);
        this.f30239i = dataStoreReviewSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f30238h = obj;
        this.f30240j |= Integer.MIN_VALUE;
        return DataStoreReviewSettingsViewModel.m10299m2(this.f30239i, false, this);
    }
}
