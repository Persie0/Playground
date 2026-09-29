package com.lingq.p055ui.home.collections.filter;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$networkSearchUserForSharedBy$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$networkSearchUserForSharedBy$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {370}, m19208m = "invokeSuspend")
final class C3612x7367dfe8 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23607e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3612x7367dfe8(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super C3612x7367dfe8> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23608f = collectionsSearchFilterSelectionViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C3612x7367dfe8) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new C3612x7367dfe8(this.f23608f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23607e;
        CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23608f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CharSequence charSequence = (CharSequence) collectionsSearchFilterSelectionViewModel.f23530I.getValue();
                if (C7661i.m15250P2(charSequence)) {
                    charSequence = null;
                }
                InterfaceC3324a interfaceC3324a = collectionsSearchFilterSelectionViewModel.f23543e;
                String strMo498E1 = collectionsSearchFilterSelectionViewModel.mo498E1();
                this.f23607e = 1;
                obj = interfaceC3324a.mo9519h(strMo498E1, (String) charSequence, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            if (((Number) obj).intValue() == 0) {
                collectionsSearchFilterSelectionViewModel.f23549k.setValue(Boolean.FALSE);
                collectionsSearchFilterSelectionViewModel.f23529H.setValue(Boolean.TRUE);
            }
        } catch (Exception unused) {
            collectionsSearchFilterSelectionViewModel.f23549k.setValue(Boolean.FALSE);
        }
        return C9072e.f47360a;
    }
}
