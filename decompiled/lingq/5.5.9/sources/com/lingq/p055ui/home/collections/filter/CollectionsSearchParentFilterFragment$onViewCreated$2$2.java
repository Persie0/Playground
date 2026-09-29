package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import androidx.navigation.NavController;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterFragment$onViewCreated$2$2", m19206f = "CollectionsSearchParentFilterFragment.kt", m19207l = {80}, m19208m = "invokeSuspend")
public final class CollectionsSearchParentFilterFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23651e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchParentFilterFragment f23652f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NavController f23653g;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterFragment$onViewCreated$2$2$1", m19206f = "CollectionsSearchParentFilterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36171 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f23654e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NavController f23655f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36171(NavController navController, InterfaceC9968c<? super C36171> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23655f = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36171 c36171 = new C36171(this.f23655f, interfaceC9968c);
            c36171.f23654e = ((Boolean) obj).booleanValue();
            return c36171;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36171) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f23654e) {
                this.f23655f.m3995p();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchParentFilterFragment$onViewCreated$2$2(NavController navController, CollectionsSearchParentFilterFragment collectionsSearchParentFilterFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23652f = collectionsSearchParentFilterFragment;
        this.f23653g = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchParentFilterFragment$onViewCreated$2$2(this.f23653g, this.f23652f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchParentFilterFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23651e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7137r<Boolean> interfaceC7137rMo9841s1 = ((CollectionsSearchParentFilterViewModel) this.f23652f.f23634Q0.getValue()).mo9841s1();
            C36171 c36171 = new C36171(this.f23653g, null);
            this.f23651e = 1;
            if (C0062b.m369m0(interfaceC7137rMo9841s1, c36171, this) == coroutineSingletons) {
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
