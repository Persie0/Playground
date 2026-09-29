package com.lingq.p055ui.home.library;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel", m19206f = "LibraryViewModel.kt", m19207l = {156}, m19208m = "setupShelvesState")
final class LibraryViewModel$setupShelvesState$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LibraryViewModel f24899d;

    /* JADX INFO: renamed from: e */
    public Set f24900e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f24901f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LibraryViewModel f24902g;

    /* JADX INFO: renamed from: h */
    public int f24903h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$setupShelvesState$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$setupShelvesState$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f24902g = libraryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f24901f = obj;
        this.f24903h |= Integer.MIN_VALUE;
        return LibraryViewModel.m9940l2(this.f24902g, null, this);
    }
}
