package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.Sort;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$updateSearchSettings$1", m19206f = "CollectionsViewModel.kt", m19207l = {552}, m19208m = "invokeSuspend")
final class CollectionsViewModel$updateSearchSettings$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23425e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23426f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Sort f23427g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$updateSearchSettings$1(CollectionsViewModel collectionsViewModel, Sort sort, InterfaceC9968c<? super CollectionsViewModel$updateSearchSettings$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23426f = collectionsViewModel;
        this.f23427g = sort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$updateSearchSettings$1(this.f23426f, this.f23427g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$updateSearchSettings$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23425e;
        Sort sort = this.f23427g;
        CollectionsViewModel collectionsViewModel = this.f23426f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) collectionsViewModel.f23245b0.getValue());
            LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) ((Map) collectionsViewModel.f23245b0.getValue()).get(CollectionsViewModel.m9827m2(collectionsViewModel, collectionsViewModel.mo498E1()));
            if (librarySearchQuery == null) {
                librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
            }
            C5207g.m11111f(sort, "<set-?>");
            librarySearchQuery.f22027d = sort;
            linkedHashMapM13467T0.put(CollectionsViewModel.m9827m2(collectionsViewModel, collectionsViewModel.mo498E1()), librarySearchQuery);
            this.f23425e = 1;
            if (collectionsViewModel.f23257i.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        collectionsViewModel.f23233P.setValue(sort);
        return C9072e.f47360a;
    }
}
