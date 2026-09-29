package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {321}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23595e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23596f;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/library/CollectionsFilterUser;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36081 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends CollectionsFilterUser>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23597e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36081(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super C36081> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23597e = collectionsSearchFilterSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C36081(this.f23597e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends CollectionsFilterUser>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36081) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23597e;
            collectionsSearchFilterSelectionViewModel.f23549k.setValue(Boolean.TRUE);
            collectionsSearchFilterSelectionViewModel.f23529H.setValue(Boolean.FALSE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/CollectionsFilterUser;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1$2", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36092 extends SuspendLambda implements InterfaceC2056p<List<? extends CollectionsFilterUser>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23598e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23599f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36092(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super C36092> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23599f = collectionsSearchFilterSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36092 c36092 = new C36092(this.f23599f, interfaceC9968c);
            c36092.f23598e = obj;
            return c36092;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends CollectionsFilterUser> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36092) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f23598e;
            CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23599f;
            collectionsSearchFilterSelectionViewModel.f23536O.setValue(list);
            if (!list.isEmpty()) {
                collectionsSearchFilterSelectionViewModel.f23549k.setValue(Boolean.FALSE);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23596f = collectionsSearchFilterSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1(this.f23596f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23595e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23596f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C36081(collectionsSearchFilterSelectionViewModel, null), collectionsSearchFilterSelectionViewModel.f23543e.mo9487I(collectionsSearchFilterSelectionViewModel.mo498E1(), (String) collectionsSearchFilterSelectionViewModel.f23530I.getValue()));
            C36092 c36092 = new C36092(collectionsSearchFilterSelectionViewModel, null);
            this.f23595e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c36092, this) == coroutineSingletons) {
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
