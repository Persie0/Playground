package com.lingq.p055ui.home.collections;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLibraryCounters$1", m19206f = "CollectionsViewModel.kt", m19207l = {329}, m19208m = "invokeSuspend")
final class CollectionsViewModel$getLibraryCounters$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23359e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23360f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<Pair<Integer, String>> f23361g;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$getLibraryCounters$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLibraryCounters$1$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35631 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23362e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsViewModel f23363f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35631(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super C35631> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23363f = collectionsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35631 c35631 = new C35631(this.f23363f, interfaceC9968c);
            c35631.f23362e = obj;
            return c35631;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35631) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f23362e;
            if (!list.isEmpty()) {
                this.f23363f.f23235R.setValue(list);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$getLibraryCounters$1(CollectionsViewModel collectionsViewModel, List<Pair<Integer, String>> list, InterfaceC9968c<? super CollectionsViewModel$getLibraryCounters$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23360f = collectionsViewModel;
        this.f23361g = list;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$getLibraryCounters$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$getLibraryCounters$1(this.f23360f, this.f23361g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23359e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsViewModel collectionsViewModel = this.f23360f;
            InterfaceC7116c<List<LibraryItemCounter>> interfaceC7116cMo6075u = collectionsViewModel.f23251f.mo6075u(this.f23361g);
            C35631 c35631 = new C35631(collectionsViewModel, null);
            this.f23359e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6075u, c35631, this) == coroutineSingletons) {
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
