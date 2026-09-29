package com.lingq.p055ui.home.collections;

import ae.C0062b;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2010c;
import ci.InterfaceC2014g;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.uimodel.library.SortType;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7797e;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p181ii.C6332a;
import p181ii.C6335d;
import p181ii.C6336e;
import p183ik.C6343f;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p385sf.C9000b;
import p400ti.C9288c;
import p416uh.InterfaceC9527a;
import p417ui.InterfaceC9530a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import th.InterfaceC9284a;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/home/collections/CollectionsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Luh/a;", "Lui/a;", "Lcom/lingq/ui/tooltips/b;", "Lth/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CollectionsViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC9527a, InterfaceC9530a, InterfaceC4912b, InterfaceC9284a {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC0113j f23225H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC9527a f23226I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC9530a f23227J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC4912b f23228K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC9284a f23229L;

    /* JADX INFO: renamed from: M */
    public final C9288c f23230M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f23231N;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f23232O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f23233P;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f23234Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f23235R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f23236S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f23237T;

    /* JADX INFO: renamed from: U */
    public final StateFlowImpl f23238U;

    /* JADX INFO: renamed from: V */
    public final StateFlowImpl f23239V;

    /* JADX INFO: renamed from: W */
    public final C7138s f23240W;

    /* JADX INFO: renamed from: X */
    public final C7138s f23241X;

    /* JADX INFO: renamed from: Y */
    public final C7134o f23242Y;

    /* JADX INFO: renamed from: Z */
    public final C7138s f23243Z;

    /* JADX INFO: renamed from: a0 */
    public final C7134o f23244a0;

    /* JADX INFO: renamed from: b0 */
    public final StateFlowImpl f23245b0;

    /* JADX INFO: renamed from: c0 */
    public final StateFlowImpl f23246c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f23247d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f23248d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2010c f23249e;

    /* JADX INFO: renamed from: e0 */
    public final C7135p f23250e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2014g f23251f;

    /* JADX INFO: renamed from: f0 */
    public final C7138s f23252f0;

    /* JADX INFO: renamed from: g */
    public final CoroutineDispatcher f23253g;

    /* JADX INFO: renamed from: g0 */
    public final C7134o f23254g0;

    /* JADX INFO: renamed from: h */
    public final CoroutineJobManager f23255h;

    /* JADX INFO: renamed from: h0 */
    public final C7138s f23256h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5182d f23257i;

    /* JADX INFO: renamed from: i0 */
    public final C7134o f23258i0;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5180b f23259j;

    /* JADX INFO: renamed from: j0 */
    public final C7138s f23260j0;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5179a f23261k;

    /* JADX INFO: renamed from: k0 */
    public final C7134o f23262k0;

    /* JADX INFO: renamed from: l */
    public final C7797e f23263l;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$1", m19206f = "CollectionsViewModel.kt", m19207l = {263}, m19208m = "invokeSuspend")
    final class C35531 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23264e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$1$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23266e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23266e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23266e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23266e.m9836o2(true);
                return C9072e.f47360a;
            }
        }

        public C35531(InterfaceC9968c<? super C35531> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35531(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35531) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23264e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = collectionsViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23264e = 1;
                if (C0062b.m369m0(interfaceC7142wMo509w0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$2", m19206f = "CollectionsViewModel.kt", m19207l = {269}, m19208m = "invokeSuspend")
    final class C35542 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23267e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$2$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23269e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23269e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23269e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23269e.m9836o2(true);
                return C9072e.f47360a;
            }
        }

        public C35542(InterfaceC9968c<? super C35542> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35542(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35542) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23267e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                InterfaceC7137r<Boolean> interfaceC7137rMo9833g1 = collectionsViewModel.mo9833g1();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23267e = 1;
                if (C0062b.m369m0(interfaceC7137rMo9833g1, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$3", m19206f = "CollectionsViewModel.kt", m19207l = {275}, m19208m = "invokeSuspend")
    final class C35553 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23270e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryTab;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$3$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<LibraryTab, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23272e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23272e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23272e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(LibraryTab libraryTab, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(libraryTab, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23272e.m9836o2(true);
                return C9072e.f47360a;
            }
        }

        public C35553(InterfaceC9968c<? super C35553> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35553(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35553) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23270e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                StateFlowImpl stateFlowImpl = collectionsViewModel.f23231N;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23270e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$4", m19206f = "CollectionsViewModel.kt", m19207l = {281}, m19208m = "invokeSuspend")
    final class C35564 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23273e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$4$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23275e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23275e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23275e, interfaceC9968c);
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
                this.f23275e.m9836o2(true);
                return C9072e.f47360a;
            }
        }

        public C35564(InterfaceC9968c<? super C35564> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35564(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35564) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23273e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                StateFlowImpl stateFlowImpl = collectionsViewModel.f23232O;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23273e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$5", m19206f = "CollectionsViewModel.kt", m19207l = {287}, m19208m = "invokeSuspend")
    final class C35575 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23276e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/Sort;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$5$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Sort, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23278e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23278e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23278e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Sort sort, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(sort, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23278e.m9836o2(true);
                return C9072e.f47360a;
            }
        }

        public C35575(InterfaceC9968c<? super C35575> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35575(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35575) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23276e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                StateFlowImpl stateFlowImpl = collectionsViewModel.f23233P;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23276e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$6", m19206f = "CollectionsViewModel.kt", m19207l = {293}, m19208m = "invokeSuspend")
    final class C35586 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23279e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$6$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23281e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23281e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23281e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                StateFlowImpl stateFlowImpl = this.f23281e.f23239V;
                stateFlowImpl.setValue(new Integer(((Number) stateFlowImpl.getValue()).intValue() + 1));
                return C9072e.f47360a;
            }
        }

        public C35586(InterfaceC9968c<? super C35586> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35586(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35586) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23279e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                C7138s c7138s = collectionsViewModel.f23240W;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23279e = 1;
                if (C0062b.m369m0(c7138s, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$7", m19206f = "CollectionsViewModel.kt", m19207l = {299}, m19208m = "invokeSuspend")
    final class C35597 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23282e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$7$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23284e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23284e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23284e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23284e.m9836o2(false);
                return C9072e.f47360a;
            }
        }

        public C35597(InterfaceC9968c<? super C35597> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35597(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35597) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23282e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                StateFlowImpl stateFlowImpl = collectionsViewModel.f23239V;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23282e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$8 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$8", m19206f = "CollectionsViewModel.kt", m19207l = {305}, m19208m = "invokeSuspend")
    final class C35608 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23285e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$8$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/library/LibrarySearchQuery;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$8$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends LibrarySearchQuery>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CollectionsViewModel f23287e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23287e = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23287e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends LibrarySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = this.f23287e;
                StateFlowImpl stateFlowImpl = collectionsViewModel.f23248d0;
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) ((Map) collectionsViewModel.f23245b0.getValue()).get(CollectionsViewModel.m9827m2(collectionsViewModel, collectionsViewModel.mo498E1()));
                stateFlowImpl.setValue(librarySearchQuery != null ? librarySearchQuery.m9704a() : (Pair) C7828f.m15572f(EmptyCoroutineContext.f38093a, new CollectionsViewModel$getLibraryLevels$1(collectionsViewModel, null)));
                return C9072e.f47360a;
            }
        }

        public C35608(InterfaceC9968c<? super C35608> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35608(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35608) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23285e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                StateFlowImpl stateFlowImpl = collectionsViewModel.f23245b0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23285e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$9 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$9", m19206f = "CollectionsViewModel.kt", m19207l = {313}, m19208m = "invokeSuspend")
    final class C35619 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23288e;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$9$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/library/LibrarySearchQuery;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$9$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends LibrarySearchQuery>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23290e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CollectionsViewModel f23291f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23291f = collectionsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23291f, interfaceC9968c);
                anonymousClass1.f23290e = obj;
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
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23291f.f23245b0.setValue((Map) this.f23290e);
                return C9072e.f47360a;
            }
        }

        public C35619(InterfaceC9968c<? super C35619> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CollectionsViewModel.this.new C35619(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35619) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23288e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CollectionsViewModel collectionsViewModel = CollectionsViewModel.this;
                InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = collectionsViewModel.f23257i.mo9688l();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(collectionsViewModel, null);
                this.f23288e = 1;
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

    public CollectionsViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2010c interfaceC2010c, InterfaceC2014g interfaceC2014g, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC5182d interfaceC5182d, InterfaceC5180b interfaceC5180b, InterfaceC5179a interfaceC5179a, C7797e c7797e, InterfaceC0113j interfaceC0113j, InterfaceC9530a interfaceC9530a, InterfaceC9527a interfaceC9527a, InterfaceC9284a interfaceC9284a, InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        LibraryTab libraryTab;
        String str;
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2010c, "courseRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(c7797e, "utils");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC9530a, "collectionsSearchFilterDelegate");
        C5207g.m11111f(interfaceC9527a, "downloadManagerDelegate");
        C5207g.m11111f(interfaceC9284a, "reportDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23247d = interfaceC3324a;
        this.f23249e = interfaceC2010c;
        this.f23251f = interfaceC2014g;
        this.f23253g = executorC7177a;
        this.f23255h = coroutineJobManager;
        this.f23257i = interfaceC5182d;
        this.f23259j = interfaceC5180b;
        this.f23261k = interfaceC5179a;
        this.f23263l = c7797e;
        this.f23225H = interfaceC0113j;
        this.f23226I = interfaceC9527a;
        this.f23227J = interfaceC9530a;
        this.f23228K = interfaceC4912b;
        this.f23229L = interfaceC9284a;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("shelf")) {
            throw new IllegalArgumentException("Required argument \"shelf\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(LibraryShelf.class) && !Serializable.class.isAssignableFrom(LibraryShelf.class)) {
            throw new UnsupportedOperationException(LibraryShelf.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        LibraryShelf libraryShelf = (LibraryShelf) c1024c0.m3929b("shelf");
        if (libraryShelf == null) {
            throw new IllegalArgumentException("Argument \"shelf\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) c1024c0.m3929b("title");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value");
        }
        if (!linkedHashMap.containsKey("tabSelected")) {
            libraryTab = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LibraryTab.class) && !Serializable.class.isAssignableFrom(LibraryTab.class)) {
                throw new UnsupportedOperationException(LibraryTab.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            libraryTab = (LibraryTab) c1024c0.m3929b("tabSelected");
        }
        if (linkedHashMap.containsKey("query")) {
            str = (String) c1024c0.m3929b("query");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"query\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        this.f23230M = new C9288c(libraryShelf, str2, libraryTab, str);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(libraryTab);
        this.f23231N = stateFlowImplM14379a;
        this.f23232O = C7120g.m14379a(str);
        this.f23233P = C7120g.m14379a(Sort.Opened);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f23234Q = stateFlowImplM14379a2;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(emptyList);
        this.f23235R = stateFlowImplM14379a3;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(emptyList);
        this.f23236S = stateFlowImplM14379a4;
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(emptyList);
        this.f23237T = stateFlowImplM14379a5;
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(Boolean.FALSE);
        this.f23238U = stateFlowImplM14379a6;
        this.f23239V = C7120g.m14379a(1);
        this.f23240W = C4924a.m10448a();
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f23241X = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f23242Y = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f23243Z = c7138sM10448a2;
        this.f23244a0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(C6753d.m13459L0());
        this.f23245b0 = stateFlowImplM14379a7;
        C7135p c7135pM353h2 = C0062b.m353h2(C0062b.m381p0(stateFlowImplM14379a2, stateFlowImplM14379a3, stateFlowImplM14379a4, stateFlowImplM14379a5, new CollectionsViewModel$_libraryAdapterItems$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(Resource.Status.EMPTY);
        this.f23246c0 = stateFlowImplM14379a8;
        C7135p c7135pM353h3 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a8, new CollectionsViewModel$_loadingLibraryItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f23248d0 = C7120g.m14379a((Pair) C7828f.m15572f(EmptyCoroutineContext.f38093a, new CollectionsViewModel$getLibraryLevels$1(this, null)));
        final InterfaceC7116c[] interfaceC7116cArr = {c7135pM353h2, stateFlowImplM14379a, c7135pM353h3, stateFlowImplM14379a6, stateFlowImplM14379a7};
        this.f23250e0 = C0062b.m353h2(new InterfaceC7116c<List<CollectionsAdapter.AbstractC3739a>>() { // from class: com.lingq.ui.home.collections.CollectionsViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$special$$inlined$combine$1$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$special$$inlined$combine$1$3", m19206f = "CollectionsViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C35683 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<CollectionsAdapter.AbstractC3739a>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f23411e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f23412f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f23413g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ CollectionsViewModel f23414h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C35683(CollectionsViewModel collectionsViewModel, InterfaceC9968c interfaceC9968c) {
                    super(3, interfaceC9968c);
                    this.f23414h = collectionsViewModel;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super List<CollectionsAdapter.AbstractC3739a>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C35683 c35683 = new C35683(this.f23414h, interfaceC9968c);
                    c35683.f23412f = interfaceC7117d;
                    c35683.f23413g = objArr;
                    return c35683.mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
                /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
                /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
                /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons;
                    InterfaceC7117d interfaceC7117d;
                    Sort sort;
                    ArrayList arrayList;
                    LibraryContentType libraryContentType;
                    Integer num;
                    int iIntValue;
                    String str;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f23411e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d2 = this.f23412f;
                        Object[] objArr = this.f23413g;
                        Object obj2 = objArr[0];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.ui.home.library.CollectionsAdapter.AdapterItem>");
                        List list = (List) obj2;
                        LibraryTab libraryTab = (LibraryTab) objArr[1];
                        Object obj3 = objArr[2];
                        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.LessonLoading>");
                        List list2 = (List) obj3;
                        Object obj4 = objArr[3];
                        C5207g.m11109d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        ArrayList arrayList2 = new ArrayList();
                        CollectionsViewModel collectionsViewModel = this.f23414h;
                        LibraryShelf libraryShelf = collectionsViewModel.f23230M.f47985a;
                        if (libraryShelf.f22049b.size() > 1) {
                            List<LibraryTab> list3 = libraryShelf.f22049b;
                            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list3, 10));
                            int i11 = 0;
                            for (Object obj5 : list3) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    C9000b.m17257w();
                                    throw null;
                                }
                                LibraryTab libraryTab2 = (LibraryTab) obj5;
                                String str2 = libraryTab2.f22062c;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                LibraryContentType libraryContentType2 = LibraryContentType.Lessons;
                                String value = libraryContentType2.getValue();
                                String str3 = libraryTab2.f22061b;
                                if (C5207g.m11106a(str3, value)) {
                                    arrayList = arrayList3;
                                } else {
                                    LibraryContentType libraryContentType3 = LibraryContentType.Courses;
                                    arrayList = arrayList3;
                                    if (!C5207g.m11106a(str3, libraryContentType3.getValue())) {
                                        libraryContentType3 = LibraryContentType.Mixed;
                                        if (C5207g.m11106a(str3, libraryContentType3.getValue())) {
                                        }
                                        num = libraryTab2.f22064e;
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                        } else {
                                            iIntValue = -1;
                                        }
                                        int i13 = iIntValue;
                                        if (libraryTab != null) {
                                            str = libraryTab.f22065f;
                                        } else {
                                            str = null;
                                        }
                                        InterfaceC7117d interfaceC7117d3 = interfaceC7117d2;
                                        ArrayList arrayList4 = arrayList;
                                        arrayList4.add(new C6336e(str2, libraryShelf, libraryContentType, i13, C5207g.m11106a(str, libraryTab2.f22065f), i11, libraryTab2.f22065f));
                                        arrayList3 = arrayList4;
                                        i11 = i12;
                                        coroutineSingletons2 = coroutineSingletons2;
                                        interfaceC7117d2 = interfaceC7117d3;
                                    }
                                    libraryContentType = libraryContentType3;
                                    num = libraryTab2.f22064e;
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                    int i14 = iIntValue;
                                    if (libraryTab != null) {
                                        str = libraryTab.f22065f;
                                    } else {
                                        str = null;
                                    }
                                    InterfaceC7117d interfaceC7117d4 = interfaceC7117d2;
                                    ArrayList arrayList5 = arrayList;
                                    arrayList5.add(new C6336e(str2, libraryShelf, libraryContentType, i14, C5207g.m11106a(str, libraryTab2.f22065f), i11, libraryTab2.f22065f));
                                    arrayList3 = arrayList5;
                                    i11 = i12;
                                    coroutineSingletons2 = coroutineSingletons2;
                                    interfaceC7117d2 = interfaceC7117d4;
                                }
                                libraryContentType = libraryContentType2;
                                num = libraryTab2.f22064e;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                int i15 = iIntValue;
                                if (libraryTab != null) {
                                    str = libraryTab.f22065f;
                                } else {
                                    str = null;
                                }
                                InterfaceC7117d interfaceC7117d5 = interfaceC7117d2;
                                ArrayList arrayList6 = arrayList;
                                arrayList6.add(new C6336e(str2, libraryShelf, libraryContentType, i15, C5207g.m11106a(str, libraryTab2.f22065f), i11, libraryTab2.f22065f));
                                arrayList3 = arrayList6;
                                i11 = i12;
                                coroutineSingletons2 = coroutineSingletons2;
                                interfaceC7117d2 = interfaceC7117d5;
                            }
                            coroutineSingletons = coroutineSingletons2;
                            interfaceC7117d = interfaceC7117d2;
                            arrayList2.add(new CollectionsAdapter.AbstractC3739a.i(arrayList3));
                        } else {
                            coroutineSingletons = coroutineSingletons2;
                            interfaceC7117d = interfaceC7117d2;
                        }
                        String value2 = LibraryShelfType.Guided.getValue();
                        String str4 = libraryShelf.f22050c;
                        if (!C5207g.m11106a(str4, value2)) {
                            arrayList2.add(new CollectionsAdapter.AbstractC3739a.l((String) collectionsViewModel.f23232O.getValue(), C5207g.m11106a(str4, LibraryShelfType.Search.getValue()) || C5207g.m11106a(str4, LibraryShelfType.SourceSearch.getValue())));
                            SortType sortType = (C5207g.m11106a(str4, LibraryShelfType.MyCourses.getValue()) || C5207g.m11106a(str4, LibraryShelfType.MyLessons.getValue())) ? C5207g.m11106a(libraryTab != null ? libraryTab.f22061b : null, LibraryContentType.Courses.getValue()) ? SortType.MyCourses : SortType.MyLessons : SortType.New;
                            LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) ((Map) collectionsViewModel.f23245b0.getValue()).get(CollectionsViewModel.m9827m2(collectionsViewModel, collectionsViewModel.mo498E1()));
                            if (librarySearchQuery == null || (sort = librarySearchQuery.f22027d) == null) {
                                sort = (Sort) C6752c.m13423Q(C6335d.m12965a(sortType));
                            }
                            arrayList2.add(new CollectionsAdapter.AbstractC3739a.h(sortType, sort, (Pair) collectionsViewModel.f23248d0.getValue(), str4));
                        }
                        if (list.isEmpty()) {
                            arrayList2.addAll(list2);
                        } else {
                            arrayList2.addAll(list);
                        }
                        if (zBooleanValue) {
                            arrayList2.add(CollectionsAdapter.AbstractC3739a.g.f24490a);
                        }
                        this.f23411e = 1;
                        CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
                        if (interfaceC7117d.mo1339r(arrayList2, this) == coroutineSingletons3) {
                            return coroutineSingletons3;
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

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super List<CollectionsAdapter.AbstractC3739a>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.home.collections.CollectionsViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr2.length];
                    }
                }, new C35683(this, null), interfaceC7117d, interfaceC7116cArr2);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f23252f0 = c7138sM10448a3;
        this.f23254g0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f23256h0 = c7138sM10448a4;
        this.f23258i0 = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f23260j0 = c7138sM10448a5;
        this.f23262k0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35531(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35542(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35553(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35564(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35575(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35586(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35597(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35608(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C35619(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), executorC7177a, null, new CollectionsViewModel$setLanguageFilters$1(this, true, null), 2);
    }

    /* JADX INFO: renamed from: l2 */
    public static final C9072e m9826l2(CollectionsViewModel collectionsViewModel, int i10, List list) {
        collectionsViewModel.getClass();
        C7499b.m14933c0(C8573r0.m16767w0(collectionsViewModel), collectionsViewModel.f23255h, collectionsViewModel.f23253g, C0166e.m761g("downloadCourseLessons ", i10), new CollectionsViewModel$downloadCourseLessons$2(collectionsViewModel, list, null));
        return C9072e.f47360a;
    }

    /* JADX INFO: renamed from: m2 */
    public static final String m9827m2(CollectionsViewModel collectionsViewModel, String str) {
        return C8656b.m16893T(collectionsViewModel.f23230M.f47985a, str, (LibraryTab) collectionsViewModel.f23231N.getValue());
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        this.f23226I.mo9391A0(i10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f23225H.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23225H.mo497B0(interfaceC9968c);
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: B1 */
    public final void mo9828B1() {
        this.f23227J.mo9828B1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f23225H.mo498E1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f23228K.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f23228K.mo9723I(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23225H.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f23228K.mo9724L();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f23225H.mo500P();
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: Q */
    public final InterfaceC7137r<Pair<FilterType, String>> mo9829Q() {
        return this.f23227J.mo9829Q();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23226I.mo9405S1(downloadItem, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f23228K.mo9727T0();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: W */
    public final Object mo9830W(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23229L.mo9830W(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(DownloadItem downloadItem, boolean z10) {
        this.f23226I.mo9406X0(downloadItem, z10);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23226I.mo9407X1(str, list, i10, false, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f23228K.mo9729Y1();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: a0 */
    public final void mo9831a0(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f23229L.mo9831a0(str, i10, str2, str3);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f23228K.mo9730a1();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f23226I.mo9409a2();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f23228K.mo9731b0(z10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23225H.mo501d(str, interfaceC9968c);
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: f */
    public final Object mo9832f(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23229L.mo9832f(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f23225H;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23225H.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f23228K.mo9733g0();
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: g1 */
    public final InterfaceC7137r<Boolean> mo9833g1() {
        return this.f23227J.mo9833g1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f23228K.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f23228K.mo9735h();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        this.f23226I.mo9412i1(arrayList, str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f23228K.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f23225H.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f23228K.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f23228K.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23225H.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f23225H.mo506l1();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: n */
    public final void mo9834n(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f23229L.mo9834n(str, i10, str2, str3);
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m9835n2(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
        C5207g.m11111f(c6332a, "lesson");
        return (libraryItemCounter != null && !libraryItemCounter.f22009f) && c6332a.f36594U > 0;
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9836o2(boolean z10) {
        C7828f.m15570d(C8573r0.m16767w0(this), this.f23253g, null, new CollectionsViewModel$loadData$1(this, z10, null), 2);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f23228K.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f23225H.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m9837p2(AbstractC3571c abstractC3571c) {
        if (!abstractC3571c.mo9846b()) {
            this.f23241X.mo14371k(abstractC3571c);
            return;
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new CollectionsViewModel$showBuyPremiumLesson$1(this, abstractC3571c.mo9845a().f36594U, abstractC3571c.mo9845a().f36595a, null), 3);
    }

    /* JADX INFO: renamed from: q2 */
    public final void m9838q2(AbstractC3569a abstractC3569a) {
        if (!abstractC3569a.mo9844b()) {
            this.f23243Z.mo14371k(abstractC3569a);
            return;
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new CollectionsViewModel$showBuyPremiumLesson$1(this, abstractC3569a.mo9843a().f36594U, abstractC3569a.mo9843a().f36595a, null), 3);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f23228K.mo9743r0();
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: r1 */
    public final void mo9839r1(Pair<? extends FilterType, String> pair) {
        this.f23227J.mo9839r1(pair);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m9840r2(int i10) {
        C7828f.m15570d(C8573r0.m16767w0(this), this.f23253g, null, new CollectionsViewModel$updateLike$1(this, i10, null), 2);
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: s1 */
    public final InterfaceC7137r<Boolean> mo9841s1() {
        return this.f23227J.mo9841s1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f23225H.mo508t1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f23228K.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f23228K.mo9745u0(z10);
    }

    @Override // p417ui.InterfaceC9530a
    /* JADX INFO: renamed from: u1 */
    public final void mo9842u1() {
        this.f23227J.mo9842u1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f23228K.mo9746v1(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f23225H.mo509w0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23226I.mo9422x0(downloadItem, interfaceC9968c);
    }
}
