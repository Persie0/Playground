package com.lingq.p055ui.home;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.LibraryShelf;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel", m19206f = "HomeViewModel.kt", m19207l = {267, 270, 274, 299, 301}, m19208m = "navigateToShelf")
public final class HomeViewModel$navigateToShelf$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public HomeViewModel f22807d;

    /* JADX INFO: renamed from: e */
    public Object f22808e;

    /* JADX INFO: renamed from: f */
    public String f22809f;

    /* JADX INFO: renamed from: g */
    public LibraryShelf f22810g;

    /* JADX INFO: renamed from: h */
    public LibrarySearchQuery f22811h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f22812i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ HomeViewModel f22813j;

    /* JADX INFO: renamed from: k */
    public int f22814k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$navigateToShelf$1(HomeViewModel homeViewModel, InterfaceC9968c<? super HomeViewModel$navigateToShelf$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f22813j = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f22812i = obj;
        this.f22814k |= Integer.MIN_VALUE;
        return this.f22813j.m9779o2(null, null, this);
    }
}
