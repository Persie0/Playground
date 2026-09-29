package com.lingq.p055ui.home.library;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel", m19206f = "LibraryViewModel.kt", m19207l = {286, 303}, m19208m = "initiateSearchSettings")
final class LibraryViewModel$initiateSearchSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LibraryViewModel f24866d;

    /* JADX INFO: renamed from: e */
    public Set f24867e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f24868f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LibraryViewModel f24869g;

    /* JADX INFO: renamed from: h */
    public int f24870h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$initiateSearchSettings$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$initiateSearchSettings$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f24869g = libraryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f24868f = obj;
        this.f24870h |= Integer.MIN_VALUE;
        return this.f24869g.m9942n2(null, this);
    }
}
