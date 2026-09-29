package com.lingq.p055ui.home;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel", m19206f = "HomeViewModel.kt", m19207l = {309, 314}, m19208m = "navigateToPlaylist")
final class HomeViewModel$navigateToPlaylist$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public HomeViewModel f22801d;

    /* JADX INFO: renamed from: e */
    public String f22802e;

    /* JADX INFO: renamed from: f */
    public int f22803f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f22804g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ HomeViewModel f22805h;

    /* JADX INFO: renamed from: i */
    public int f22806i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$navigateToPlaylist$1(HomeViewModel homeViewModel, InterfaceC9968c<? super HomeViewModel$navigateToPlaylist$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f22805h = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f22804g = obj;
        this.f22806i |= Integer.MIN_VALUE;
        return this.f22805h.m9778n2(0, null, this);
    }
}
