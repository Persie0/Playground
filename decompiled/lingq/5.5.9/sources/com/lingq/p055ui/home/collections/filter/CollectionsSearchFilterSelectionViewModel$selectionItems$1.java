package com.lingq.p055ui.home.collections.filter;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$selectionItems$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {103}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterSelectionViewModel$selectionItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b>>, List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23609e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f23610f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f23611g;

    public CollectionsSearchFilterSelectionViewModel$selectionItems$1(InterfaceC9968c<? super CollectionsSearchFilterSelectionViewModel$selectionItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b>> interfaceC7117d, List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CollectionsSearchFilterSelectionViewModel$selectionItems$1 collectionsSearchFilterSelectionViewModel$selectionItems$1 = new CollectionsSearchFilterSelectionViewModel$selectionItems$1(interfaceC9968c);
        collectionsSearchFilterSelectionViewModel$selectionItems$1.f23610f = interfaceC7117d;
        collectionsSearchFilterSelectionViewModel$selectionItems$1.f23611g = list;
        return collectionsSearchFilterSelectionViewModel$selectionItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23609e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f23610f;
            List list = this.f23611g;
            this.f23610f = null;
            this.f23609e = 1;
            if (interfaceC7117d.mo1339r(list, this) == coroutineSingletons) {
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
