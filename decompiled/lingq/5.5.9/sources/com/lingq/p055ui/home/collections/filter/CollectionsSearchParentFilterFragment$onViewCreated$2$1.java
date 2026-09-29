package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import androidx.navigation.NavController;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p417ui.C9533d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterFragment$onViewCreated$2$1", m19206f = "CollectionsSearchParentFilterFragment.kt", m19207l = {69}, m19208m = "invokeSuspend")
public final class CollectionsSearchParentFilterFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23646e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchParentFilterFragment f23647f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NavController f23648g;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lcom/lingq/commons/ui/FilterType;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchParentFilterFragment$onViewCreated$2$1$1", m19206f = "CollectionsSearchParentFilterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36161 extends SuspendLambda implements InterfaceC2056p<Pair<? extends FilterType, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23649e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ NavController f23650f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36161(NavController navController, InterfaceC9968c<? super C36161> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23650f = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36161 c36161 = new C36161(this.f23650f, interfaceC9968c);
            c36161.f23649e = obj;
            return c36161;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends FilterType, ? extends String> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36161) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f23649e;
            FilterType filterType = (FilterType) pair.f38012a;
            String str = (String) pair.f38013b;
            C5207g.m11111f(filterType, "filterType");
            C5207g.m11111f(str, "collectionType");
            C4924a.m10447Z(this.f23650f, new C9533d(filterType, str));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchParentFilterFragment$onViewCreated$2$1(NavController navController, CollectionsSearchParentFilterFragment collectionsSearchParentFilterFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23647f = collectionsSearchParentFilterFragment;
        this.f23648g = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchParentFilterFragment$onViewCreated$2$1(this.f23648g, this.f23647f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchParentFilterFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23646e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7137r<Pair<FilterType, String>> interfaceC7137rMo9829Q = ((CollectionsSearchParentFilterViewModel) this.f23647f.f23634Q0.getValue()).mo9829Q();
            C36161 c36161 = new C36161(this.f23648g, null);
            this.f23646e = 1;
            if (C0062b.m369m0(interfaceC7137rMo9829Q, c36161, this) == coroutineSingletons) {
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
