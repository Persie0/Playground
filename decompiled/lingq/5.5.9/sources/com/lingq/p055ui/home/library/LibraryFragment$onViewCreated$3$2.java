package com.lingq.p055ui.home.library;

import ae.C0062b;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.shared.domain.Resource;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$2", m19206f = "LibraryFragment.kt", m19207l = {345}, m19208m = "invokeSuspend")
public final class LibraryFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24684e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryFragment f24685f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryFragment$onViewCreated$3$2$1", m19206f = "LibraryFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37691 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24686e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryFragment f24687f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37691(LibraryFragment libraryFragment, InterfaceC9968c<? super C37691> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24687f = libraryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37691 c37691 = new C37691(this.f24687f, interfaceC9968c);
            c37691.f24686e = obj;
            return c37691;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37691) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource.Status status = (Resource.Status) this.f24686e;
            Resource.Status status2 = Resource.Status.LOADING;
            LibraryFragment libraryFragment = this.f24687f;
            if (status == status2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
                RecyclerView recyclerView = libraryFragment.m9936q0().f45342g;
                C5207g.m11110e(recyclerView, "binding.rvCollections");
                C4924a.m10442U(recyclerView);
                libraryFragment.m9936q0().f45347l.m4935d();
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LibraryFragment.f24638G0;
                CircularProgressIndicator circularProgressIndicator = libraryFragment.m9936q0().f45347l;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator);
                RecyclerView recyclerView2 = libraryFragment.m9936q0().f45342g;
                C5207g.m11110e(recyclerView2, "binding.rvCollections");
                C4924a.m10457e0(recyclerView2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryFragment$onViewCreated$3$2(LibraryFragment libraryFragment, InterfaceC9968c<? super LibraryFragment$onViewCreated$3$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24685f = libraryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryFragment$onViewCreated$3$2(this.f24685f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24684e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LibraryFragment.f24638G0;
            LibraryFragment libraryFragment = this.f24685f;
            LibraryViewModel libraryViewModelM9938s0 = libraryFragment.m9938s0();
            C37691 c37691 = new C37691(libraryFragment, null);
            this.f24684e = 1;
            if (C0062b.m369m0(libraryViewModelM9938s0.f24758W, c37691, this) == coroutineSingletons) {
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
