package com.lingq.p055ui.review.settings;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {866, 867, 868, 869, 870, 874, 875}, m19208m = "canChangeActivitiesSettings")
final class DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f30227d;

    /* JADX INFO: renamed from: e */
    public Boolean[] f30228e;

    /* JADX INFO: renamed from: f */
    public Boolean[] f30229f;

    /* JADX INFO: renamed from: g */
    public int f30230g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f30231h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DataStoreReviewSettingsViewModel f30232i;

    /* JADX INFO: renamed from: j */
    public int f30233j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, InterfaceC9968c<? super DataStoreReviewSettingsViewModel$canChangeActivitiesSettings$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f30232i = dataStoreReviewSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f30231h = obj;
        this.f30233j |= Integer.MIN_VALUE;
        return DataStoreReviewSettingsViewModel.m10298l2(this.f30232i, false, this);
    }
}
