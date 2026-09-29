package com.lingq.p055ui.home.collections;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$1", m19206f = "CollectionsFragment.kt", m19207l = {412}, m19208m = "invokeSuspend")
public final class CollectionsFragment$onViewCreated$6$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23170e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsFragment f23171f;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/home/collections/a;", "nav", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$1$1", m19206f = "CollectionsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35401 extends SuspendLambda implements InterfaceC2056p<AbstractC3569a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23172e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsFragment f23173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35401(CollectionsFragment collectionsFragment, InterfaceC9968c<? super C35401> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23173f = collectionsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35401 c35401 = new C35401(this.f23173f, interfaceC9968c);
            c35401.f23172e = obj;
            return c35401;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC3569a abstractC3569a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35401) mo1336a(abstractC3569a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC3569a abstractC3569a = (AbstractC3569a) this.f23172e;
            boolean z10 = abstractC3569a instanceof AbstractC3569a.a;
            CollectionsFragment collectionsFragment = this.f23173f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment.m9800p0();
                int i10 = abstractC3569a.mo9843a().f36595a;
                collectionsViewModelM9800p0.getClass();
                C7499b.m14933c0(C8573r0.m16767w0(collectionsViewModelM9800p0), collectionsViewModelM9800p0.f23255h, collectionsViewModelM9800p0.f23253g, C0166e.m761g("downloadLesson ", i10), new CollectionsViewModel$downloadLesson$1(collectionsViewModelM9800p0, i10, null));
            } else if (abstractC3569a instanceof AbstractC3569a.b) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = CollectionsFragment.f23142F0;
                CollectionsViewModel collectionsViewModelM9800p1 = collectionsFragment.m9800p0();
                int i11 = abstractC3569a.mo9843a().f36595a;
                collectionsViewModelM9800p1.getClass();
                C7499b.m14933c0(C8573r0.m16767w0(collectionsViewModelM9800p1), collectionsViewModelM9800p1.f23255h, collectionsViewModelM9800p1.f23253g, C0166e.m761g("updateSave ", i11), new CollectionsViewModel$updateSave$1(collectionsViewModelM9800p1, i11, ((AbstractC3569a.b) abstractC3569a).f23436d, null));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsFragment$onViewCreated$6$1(CollectionsFragment collectionsFragment, InterfaceC9968c<? super CollectionsFragment$onViewCreated$6$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23171f = collectionsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsFragment$onViewCreated$6$1(this.f23171f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsFragment$onViewCreated$6$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23170e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
            CollectionsFragment collectionsFragment = this.f23171f;
            CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment.m9800p0();
            C35401 c35401 = new C35401(collectionsFragment, null);
            this.f23170e = 1;
            if (C0062b.m369m0(collectionsViewModelM9800p0.f23244a0, c35401, this) == coroutineSingletons) {
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
