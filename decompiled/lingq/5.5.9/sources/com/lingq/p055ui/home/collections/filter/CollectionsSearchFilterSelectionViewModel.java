package com.lingq.p055ui.home.collections.filter;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.Accent;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p096ei.C5408a;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollectionsSearchFilterSelectionViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f23529H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f23530I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f23531J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f23532K;

    /* JADX INFO: renamed from: L */
    public final C7135p f23533L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f23534M;

    /* JADX INFO: renamed from: N */
    public final C7135p f23535N;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f23536O;

    /* JADX INFO: renamed from: P */
    public final C7135p f23537P;

    /* JADX INFO: renamed from: Q */
    public final C7138s f23538Q;

    /* JADX INFO: renamed from: R */
    public final C7134o f23539R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f23540S;

    /* JADX INFO: renamed from: T */
    public final C7135p f23541T;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5182d f23542d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3324a f23543e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f23544f;

    /* JADX INFO: renamed from: g */
    public final CoroutineJobManager f23545g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0113j f23546h;

    /* JADX INFO: renamed from: i */
    public final FilterType f23547i;

    /* JADX INFO: renamed from: j */
    public final String f23548j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f23549k;

    /* JADX INFO: renamed from: l */
    public final C7135p f23550l;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {210}, m19208m = "invokeSuspend")
    final class C36021 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23551e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b;", "items", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$1$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23553e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23554f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23554f = collectionsSearchFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23554f, interfaceC9968c);
                anonymousClass1.f23553e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23554f.f23534M.setValue((List) this.f23553e);
                return C9072e.f47360a;
            }
        }

        public C36021(InterfaceC9968c<? super C36021> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsSearchFilterSelectionViewModel.this.new C36021(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36021) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23551e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = CollectionsSearchFilterSelectionViewModel.this;
                C7135p c7135p = collectionsSearchFilterSelectionViewModel.f23533L;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsSearchFilterSelectionViewModel, null);
                this.f23551e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$2", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {216}, m19208m = "invokeSuspend")
    final class C36032 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23555e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$2$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23557e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23558f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23558f = collectionsSearchFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23558f, interfaceC9968c);
                anonymousClass1.f23557e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                boolean zM15250P2 = C7661i.m15250P2((String) this.f23557e);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23558f;
                if (zM15250P2) {
                    collectionsSearchFilterSelectionViewModel.f23534M.setValue(EmptyList.f38032a);
                } else {
                    collectionsSearchFilterSelectionViewModel.getClass();
                    InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(collectionsSearchFilterSelectionViewModel);
                    CollectionsSearchFilterSelectionViewModel$getTags$1 collectionsSearchFilterSelectionViewModel$getTags$1 = new CollectionsSearchFilterSelectionViewModel$getTags$1(collectionsSearchFilterSelectionViewModel, null);
                    CoroutineJobManager coroutineJobManager = collectionsSearchFilterSelectionViewModel.f23545g;
                    CoroutineDispatcher coroutineDispatcher = collectionsSearchFilterSelectionViewModel.f23544f;
                    C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "observeLessonTags", collectionsSearchFilterSelectionViewModel$getTags$1);
                    C7499b.m14933c0(C8573r0.m16767w0(collectionsSearchFilterSelectionViewModel), coroutineJobManager, coroutineDispatcher, "networkGetLessonTags", new CollectionsSearchFilterSelectionViewModel$networkGetLessonTags$1(collectionsSearchFilterSelectionViewModel, null));
                }
                return C9072e.f47360a;
            }
        }

        public C36032(InterfaceC9968c<? super C36032> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsSearchFilterSelectionViewModel.this.new C36032(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36032) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23555e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = CollectionsSearchFilterSelectionViewModel.this;
                StateFlowImpl stateFlowImpl = collectionsSearchFilterSelectionViewModel.f23530I;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsSearchFilterSelectionViewModel, null);
                this.f23555e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$3", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {230}, m19208m = "invokeSuspend")
    final class C36043 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23559e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b;", "items", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$3$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23561e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23562f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23562f = collectionsSearchFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23562f, interfaceC9968c);
                anonymousClass1.f23561e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23562f.f23534M.setValue((List) this.f23561e);
                return C9072e.f47360a;
            }
        }

        public C36043(InterfaceC9968c<? super C36043> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsSearchFilterSelectionViewModel.this.new C36043(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36043) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23559e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = CollectionsSearchFilterSelectionViewModel.this;
                C7135p c7135p = collectionsSearchFilterSelectionViewModel.f23537P;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsSearchFilterSelectionViewModel, null);
                this.f23559e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$4", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {236}, m19208m = "invokeSuspend")
    final class C36054 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23563e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$4$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23565e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23565e = collectionsSearchFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23565e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23565e;
                collectionsSearchFilterSelectionViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(collectionsSearchFilterSelectionViewModel), null, null, new CollectionsSearchFilterSelectionViewModel$getSharedByUsers$1(collectionsSearchFilterSelectionViewModel, null), 3);
                C7499b.m14933c0(C8573r0.m16767w0(collectionsSearchFilterSelectionViewModel), collectionsSearchFilterSelectionViewModel.f23545g, collectionsSearchFilterSelectionViewModel.f23544f, "networkSearchUserForSharedBy", new C3612x7367dfe8(collectionsSearchFilterSelectionViewModel, null));
                return C9072e.f47360a;
            }
        }

        public C36054(InterfaceC9968c<? super C36054> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsSearchFilterSelectionViewModel.this.new C36054(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36054) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23563e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = CollectionsSearchFilterSelectionViewModel.this;
                StateFlowImpl stateFlowImpl = collectionsSearchFilterSelectionViewModel.f23530I;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsSearchFilterSelectionViewModel, null);
                this.f23563e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$5", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {246}, m19208m = "invokeSuspend")
    final class C36065 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23566e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b$c;", "accents", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$5$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23568e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23569f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23569f = collectionsSearchFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23569f, interfaceC9968c);
                anonymousClass1.f23568e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends CollectionsSearchFilterSelectionAdapter.AbstractC3585b.c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23569f.f23534M.setValue((List) this.f23568e);
                return C9072e.f47360a;
            }
        }

        public C36065(InterfaceC9968c<? super C36065> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsSearchFilterSelectionViewModel.this.new C36065(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36065) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23566e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = CollectionsSearchFilterSelectionViewModel.this;
                C7135p c7135p = collectionsSearchFilterSelectionViewModel.f23541T;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsSearchFilterSelectionViewModel, null);
                this.f23566e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$6", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {253}, m19208m = "invokeSuspend")
    final class C36076 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23570e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/library/LibrarySearchQuery;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$6$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends LibrarySearchQuery>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23572e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23573f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23573f = collectionsSearchFilterSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23573f, interfaceC9968c);
                anonymousClass1.f23572e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends LibrarySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                List list;
                List list2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Map map = (Map) this.f23572e;
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23573f;
                StateFlowImpl stateFlowImpl = collectionsSearchFilterSelectionViewModel.f23532K;
                String str = collectionsSearchFilterSelectionViewModel.f23548j;
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) map.get(str);
                if (librarySearchQuery == null || (list = librarySearchQuery.f22031h) == null) {
                    list = EmptyList.f38032a;
                }
                stateFlowImpl.setValue(list);
                LibrarySearchQuery librarySearchQuery2 = (LibrarySearchQuery) map.get(str);
                if (librarySearchQuery2 == null || (list2 = librarySearchQuery2.f22035l) == null) {
                    list2 = EmptyList.f38032a;
                }
                collectionsSearchFilterSelectionViewModel.f23540S.setValue(list2);
                return C9072e.f47360a;
            }
        }

        public C36076(InterfaceC9968c<? super C36076> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsSearchFilterSelectionViewModel.this.new C36076(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36076) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23570e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = CollectionsSearchFilterSelectionViewModel.this;
                InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = collectionsSearchFilterSelectionViewModel.f23542d.mo9688l();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsSearchFilterSelectionViewModel, null);
                this.f23570e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9688l, anonymousClass1, this) == coroutineSingletons) {
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

    public CollectionsSearchFilterSelectionViewModel(InterfaceC5182d interfaceC5182d, InterfaceC3324a interfaceC3324a, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23542d = interfaceC5182d;
        this.f23543e = interfaceC3324a;
        this.f23544f = executorC7177a;
        this.f23545g = coroutineJobManager;
        this.f23546h = interfaceC0113j;
        FilterType filterType = (FilterType) c1024c0.m3929b("filterType");
        this.f23547i = filterType;
        String str = (String) c1024c0.m3929b("collectionType");
        this.f23548j = str == null ? "" : str;
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(bool);
        this.f23549k = stateFlowImplM14379a;
        this.f23550l = C0062b.m306S(stateFlowImplM14379a);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool);
        this.f23529H = stateFlowImplM14379a2;
        C0062b.m306S(stateFlowImplM14379a2);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a("");
        this.f23530I = stateFlowImplM14379a3;
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(emptyList);
        this.f23531J = stateFlowImplM14379a4;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(emptyList);
        this.f23532K = stateFlowImplM14379a5;
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2M381p0 = C0062b.m381p0(stateFlowImplM14379a4, stateFlowImplM14379a5, stateFlowImplM14379a3, stateFlowImplM14379a2, new CollectionsSearchFilterSelectionViewModel$_lessonTags$1(null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f23533L = C0062b.m353h2(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2M381p0, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(emptyList);
        this.f23534M = stateFlowImplM14379a6;
        this.f23535N = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a6, new CollectionsSearchFilterSelectionViewModel$selectionItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(emptyList);
        this.f23536O = stateFlowImplM14379a7;
        this.f23537P = C0062b.m353h2(C0062b.m381p0(stateFlowImplM14379a7, stateFlowImplM14379a3, stateFlowImplM14379a2, stateFlowImplM14379a, new CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f23538Q = c7138sM10448a;
        this.f23539R = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        String strMo498E1 = mo498E1();
        C5207g.m11111f(strMo498E1, "language");
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Arabic)) ? C9000b.m17252r(Accent.Standard, Accent.Egyptian, Accent.Levantine) : C5207g.m11106a(strMo498E1, C5408a.m11570c(LanguageLearnBeta.Farsi)) ? C9000b.m17252r(Accent.Formal, Accent.Spoken) : C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Portuguese)) ? C9000b.m17252r(Accent.European, Accent.Brazilian) : C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.Spanish)) ? C9000b.m17252r(Accent.EuropeanSpanish, Accent.LatinAmerican) : C5207g.m11106a(strMo498E1, C5408a.m11569b(LanguageLearn.English)) ? C9000b.m17252r(Accent.American, Accent.British, Accent.Canadian) : emptyList);
        StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(emptyList);
        this.f23540S = stateFlowImplM14379a9;
        this.f23541T = C0062b.m353h2(new C7131l(stateFlowImplM14379a9, stateFlowImplM14379a8, new CollectionsSearchFilterSelectionViewModel$accents$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        if (filterType == FilterType.LessonTags) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36021(null), 3);
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36032(null), 3);
        }
        if (filterType == FilterType.ProviderSharedBy) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36043(null), 3);
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36054(null), 3);
        }
        if (filterType == FilterType.Accent) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36065(null), 3);
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36076(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f23546h.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23546h.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f23546h.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23546h.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f23546h.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23546h.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f23546h;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23546h.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f23546h.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23546h.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f23546h.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f23546h.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f23546h.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f23546h.mo509w0();
    }
}
