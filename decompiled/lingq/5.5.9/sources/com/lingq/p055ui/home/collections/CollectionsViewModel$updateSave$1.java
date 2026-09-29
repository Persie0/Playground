package com.lingq.p055ui.home.collections;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$updateSave$1", m19206f = "CollectionsViewModel.kt", m19207l = {567}, m19208m = "invokeSuspend")
final class CollectionsViewModel$updateSave$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23421e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23422f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23423g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f23424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$updateSave$1(CollectionsViewModel collectionsViewModel, int i10, boolean z10, InterfaceC9968c<? super CollectionsViewModel$updateSave$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23422f = collectionsViewModel;
        this.f23423g = i10;
        this.f23424h = z10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$updateSave$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$updateSave$1(this.f23422f, this.f23423g, this.f23424h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23421e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsViewModel collectionsViewModel = this.f23422f;
            InterfaceC3324a interfaceC3324a = collectionsViewModel.f23247d;
            UserLanguage value = collectionsViewModel.mo509w0().getValue();
            int i11 = value != null ? value.f21727b : 0;
            int i12 = this.f23423g;
            boolean z10 = this.f23424h;
            String strMo498E1 = collectionsViewModel.mo498E1();
            this.f23421e = 1;
            if (interfaceC3324a.mo9490L(i11, i12, strMo498E1, this, z10) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
