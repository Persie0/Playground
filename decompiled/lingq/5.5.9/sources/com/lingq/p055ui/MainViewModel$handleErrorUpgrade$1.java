package com.lingq.p055ui;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel", m19206f = "MainViewModel.kt", m19207l = {339, 349, 352, 357, 368, 374}, m19208m = "handleErrorUpgrade")
final class MainViewModel$handleErrorUpgrade$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f22316d;

    /* JADX INFO: renamed from: e */
    public Object f22317e;

    /* JADX INFO: renamed from: f */
    public Throwable f22318f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f22319g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ MainViewModel f22320h;

    /* JADX INFO: renamed from: i */
    public int f22321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$handleErrorUpgrade$1(MainViewModel mainViewModel, InterfaceC9968c<? super MainViewModel$handleErrorUpgrade$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f22320h = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f22319g = obj;
        this.f22321i |= Integer.MIN_VALUE;
        return MainViewModel.m9717l2(this.f22320h, null, null, this);
    }
}
