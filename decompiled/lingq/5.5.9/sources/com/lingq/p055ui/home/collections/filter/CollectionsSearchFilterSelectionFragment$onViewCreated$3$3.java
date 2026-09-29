package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$onViewCreated$3$3", m19206f = "CollectionsSearchFilterSelectionFragment.kt", m19207l = {ModuleDescriptor.MODULE_VERSION}, m19208m = "invokeSuspend")
public final class CollectionsSearchFilterSelectionFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23514e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchFilterSelectionFragment f23515f;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionFragment$onViewCreated$3$3$1", m19206f = "CollectionsSearchFilterSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35921 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f23516e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsSearchFilterSelectionFragment f23517f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35921(CollectionsSearchFilterSelectionFragment collectionsSearchFilterSelectionFragment, InterfaceC9968c<? super C35921> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23517f = collectionsSearchFilterSelectionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35921 c35921 = new C35921(this.f23517f, interfaceC9968c);
            c35921.f23516e = ((Boolean) obj).booleanValue();
            return c35921;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35921) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f23516e;
            CollectionsSearchFilterSelectionFragment collectionsSearchFilterSelectionFragment = this.f23517f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsSearchFilterSelectionFragment.f23490D0;
                collectionsSearchFilterSelectionFragment.m9854o0().f44872c.m4935d();
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CollectionsSearchFilterSelectionFragment.f23490D0;
                CircularProgressIndicator circularProgressIndicator = collectionsSearchFilterSelectionFragment.m9854o0().f44872c;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterSelectionFragment$onViewCreated$3$3(CollectionsSearchFilterSelectionFragment collectionsSearchFilterSelectionFragment, InterfaceC9968c<? super CollectionsSearchFilterSelectionFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23515f = collectionsSearchFilterSelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchFilterSelectionFragment$onViewCreated$3$3(this.f23515f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchFilterSelectionFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23514e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsSearchFilterSelectionFragment collectionsSearchFilterSelectionFragment = this.f23515f;
            CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModelM9853n0 = CollectionsSearchFilterSelectionFragment.m9853n0(collectionsSearchFilterSelectionFragment);
            C35921 c35921 = new C35921(collectionsSearchFilterSelectionFragment, null);
            this.f23514e = 1;
            if (C0062b.m369m0(collectionsSearchFilterSelectionViewModelM9853n0.f23550l, c35921, this) == coroutineSingletons) {
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
