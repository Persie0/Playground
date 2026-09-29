package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.graphics.Rect;
import android.support.v4.media.session.C0166e;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2009b;
import ci.InterfaceC2010c;
import ci.InterfaceC2012e;
import ci.InterfaceC2013f;
import ci.InterfaceC2014g;
import ci.InterfaceC2016i;
import ci.InterfaceC2017j;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import com.lingq.shared.uimodel.language.UserStudyStatsScore;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.shared.uimodel.library.Resources;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7793a;
import ni.C7797e;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p181ii.C6332a;
import p181ii.C6336e;
import p183ik.C6343f;
import p225kk.C6715l;
import p244lh.InterfaceC7368e;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import th.InterfaceC9284a;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/home/library/LibraryViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/ui/tooltips/b;", "Llh/e;", "Lth/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LibraryViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC4912b, InterfaceC7368e, InterfaceC9284a {

    /* JADX INFO: renamed from: H */
    public final InterfaceC5180b f24743H;

    /* JADX INFO: renamed from: I */
    public final CoroutineDispatcher f24744I;

    /* JADX INFO: renamed from: J */
    public final CoroutineDispatcher f24745J;

    /* JADX INFO: renamed from: K */
    public final CoroutineJobManager f24746K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC0113j f24747L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC4912b f24748M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC7368e f24749N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC9284a f24750O;

    /* JADX INFO: renamed from: P */
    public final LinkedHashSet f24751P;

    /* JADX INFO: renamed from: Q */
    public final LinkedHashMap f24752Q;

    /* JADX INFO: renamed from: R */
    public final LinkedHashMap f24753R;

    /* JADX INFO: renamed from: S */
    public final LinkedHashMap f24754S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f24755T;

    /* JADX INFO: renamed from: U */
    public final C7135p f24756U;

    /* JADX INFO: renamed from: V */
    public final StateFlowImpl f24757V;

    /* JADX INFO: renamed from: W */
    public final C7135p f24758W;

    /* JADX INFO: renamed from: X */
    public final C7138s f24759X;

    /* JADX INFO: renamed from: Y */
    public final C7134o f24760Y;

    /* JADX INFO: renamed from: Z */
    public final StateFlowImpl f24761Z;

    /* JADX INFO: renamed from: a0 */
    public final C7135p f24762a0;

    /* JADX INFO: renamed from: b0 */
    public final C7138s f24763b0;

    /* JADX INFO: renamed from: c0 */
    public final C7134o f24764c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f24765d;

    /* JADX INFO: renamed from: d0 */
    public final C7138s f24766d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2010c f24767e;

    /* JADX INFO: renamed from: e0 */
    public final C7134o f24768e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2014g f24769f;

    /* JADX INFO: renamed from: f0 */
    public final C7138s f24770f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2013f f24771g;

    /* JADX INFO: renamed from: g0 */
    public final C7134o f24772g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2016i f24773h;

    /* JADX INFO: renamed from: h0 */
    public final C7135p f24774h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2017j f24775i;

    /* JADX INFO: renamed from: i0 */
    public final C7135p f24776i0;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2009b f24777j;

    /* JADX INFO: renamed from: j0 */
    public final StateFlowImpl f24778j0;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2012e f24779k;

    /* JADX INFO: renamed from: k0 */
    public final StateFlowImpl f24780k0;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5182d f24781l;

    /* JADX INFO: renamed from: l0 */
    public final StateFlowImpl f24782l0;

    /* JADX INFO: renamed from: m0 */
    public final StateFlowImpl f24783m0;

    /* JADX INFO: renamed from: n0 */
    public final StateFlowImpl f24784n0;

    /* JADX INFO: renamed from: o0 */
    public final StateFlowImpl f24785o0;

    /* JADX INFO: renamed from: p0 */
    public final C7135p f24786p0;

    /* JADX INFO: renamed from: q0 */
    public final StateFlowImpl f24787q0;

    /* JADX INFO: renamed from: r0 */
    public final C7138s f24788r0;

    /* JADX INFO: renamed from: s0 */
    public final C7134o f24789s0;

    /* JADX INFO: renamed from: t0 */
    public final AbstractChannel f24790t0;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$1", m19206f = "LibraryViewModel.kt", m19207l = {196}, m19208m = "invokeSuspend")
    final class C37781 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24791e;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "", "Lcom/lingq/shared/uimodel/LearningLevel;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$1$1", m19206f = "LibraryViewModel.kt", m19207l = {202}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Pair<? extends String, ? extends List<? extends LearningLevel>>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public List f24793e;

            /* JADX INFO: renamed from: f */
            public int f24794f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ Object f24795g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ LibraryViewModel f24796h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24796h = libraryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24796h, interfaceC9968c);
                anonymousClass1.f24795g = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Pair<? extends String, ? extends List<? extends LearningLevel>> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                String str;
                List list;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f24794f;
                LibraryViewModel libraryViewModel = this.f24796h;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    Pair pair = (Pair) this.f24795g;
                    str = (String) pair.f38012a;
                    List list2 = (List) pair.f38013b;
                    libraryViewModel.f24757V.setValue(Resource.Status.LOADING);
                    LinkedHashMap linkedHashMap = libraryViewModel.f24752Q;
                    if (!linkedHashMap.isEmpty()) {
                        libraryViewModel.f24754S.clear();
                        libraryViewModel.f24753R.clear();
                        libraryViewModel.f24751P.clear();
                        linkedHashMap.clear();
                        libraryViewModel.f24755T.setValue(EmptyList.f38032a);
                        Iterator it = libraryViewModel.f24746K.f32075a.values().iterator();
                        while (it.hasNext()) {
                            C4924a.m10450b((InterfaceC7875v0) it.next());
                        }
                    }
                    C7828f.m15570d(C8573r0.m16767w0(libraryViewModel), null, null, new LibraryViewModel$networkUpdateShelves$1(libraryViewModel, null), 3);
                    this.f24795g = str;
                    this.f24793e = list2;
                    this.f24794f = 1;
                    if (C7828f.m15567a(200L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = list2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = this.f24793e;
                    str = (String) this.f24795g;
                    C7499b.m14977z0(obj);
                }
                libraryViewModel.getClass();
                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), libraryViewModel.f24746K, libraryViewModel.f24744I, C0166e.m765k(str, "_shelves"), new LibraryViewModel$observeShelves$1(libraryViewModel, str, list, null));
                return C9072e.f47360a;
            }
        }

        public C37781(InterfaceC9968c<? super C37781> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LibraryViewModel.this.new C37781(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37781) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24791e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LibraryViewModel libraryViewModel = LibraryViewModel.this;
                C7135p c7135p = libraryViewModel.f24776i0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(libraryViewModel, null);
                this.f24791e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$2", m19206f = "LibraryViewModel.kt", m19207l = {209}, m19208m = "invokeSuspend")
    final class C37792 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24797e;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$2$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryShelf;", "shelves", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$2$2", m19206f = "LibraryViewModel.kt", m19207l = {215}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryShelf>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f24799e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f24800f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ LibraryViewModel f24801g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LibraryViewModel libraryViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24801g = libraryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f24801g, interfaceC9968c);
                anonymousClass2.f24800f = obj;
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends LibraryShelf> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f24799e;
                LibraryViewModel libraryViewModel = this.f24801g;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    List list = (List) this.f24800f;
                    libraryViewModel.f24752Q.clear();
                    LinkedHashSet linkedHashSet = libraryViewModel.f24751P;
                    linkedHashSet.clear();
                    linkedHashSet.addAll(list);
                    this.f24799e = 1;
                    if (LibraryViewModel.m9940l2(libraryViewModel, linkedHashSet, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                Iterator it = C6752c.m13448p0(libraryViewModel.f24751P, 3).iterator();
                while (it.hasNext()) {
                    libraryViewModel.m9944p2((LibraryShelf) it.next());
                }
                libraryViewModel.f24757V.setValue(Resource.Status.SUCCESS);
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(libraryViewModel);
                LibraryViewModel$getStreak$1 libraryViewModel$getStreak$1 = new LibraryViewModel$getStreak$1(libraryViewModel, null);
                CoroutineJobManager coroutineJobManager = libraryViewModel.f24746K;
                CoroutineDispatcher coroutineDispatcher = libraryViewModel.f24745J;
                C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "streak", libraryViewModel$getStreak$1);
                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), coroutineJobManager, coroutineDispatcher, "goals", new LibraryViewModel$getGoals$1(libraryViewModel, null));
                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), coroutineJobManager, coroutineDispatcher, "language streak", new LibraryViewModel$getLanguageStreak$1(libraryViewModel, null));
                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), coroutineJobManager, coroutineDispatcher, "notices", new LibraryViewModel$getNotices$1(libraryViewModel, null));
                libraryViewModel.m9950v2();
                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), coroutineJobManager, coroutineDispatcher, "update notices", new LibraryViewModel$updateNotices$1(libraryViewModel, null));
                C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), coroutineJobManager, coroutineDispatcher, "update topics", new LibraryViewModel$updateTopics$1(libraryViewModel, null));
                return C9072e.f47360a;
            }
        }

        public C37792(InterfaceC9968c<? super C37792> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LibraryViewModel.this.new C37792(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37792) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24797e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LibraryViewModel libraryViewModel = LibraryViewModel.this;
                final StateFlowImpl stateFlowImpl = libraryViewModel.f24778j0;
                InterfaceC7116c<List<? extends LibraryShelf>> interfaceC7116c = new InterfaceC7116c<List<? extends LibraryShelf>>() { // from class: com.lingq.ui.home.library.LibraryViewModel$2$invokeSuspend$$inlined$filterNot$1

                    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$2$invokeSuspend$$inlined$filterNot$1$2 */
                    public static final class C37802<T> implements InterfaceC7117d {

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ InterfaceC7117d f24803a;

                        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$2$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$2$invokeSuspend$$inlined$filterNot$1$2", m19206f = "LibraryViewModel.kt", m19207l = {223}, m19208m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: d */
                            public /* synthetic */ Object f24804d;

                            /* JADX INFO: renamed from: e */
                            public int f24805e;

                            public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                                super(interfaceC9968c);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            /* JADX INFO: renamed from: x */
                            public final Object mo1338x(Object obj) {
                                this.f24804d = obj;
                                this.f24805e |= Integer.MIN_VALUE;
                                return C37802.this.mo1339r(null, this);
                            }
                        }

                        public C37802(InterfaceC7117d interfaceC7117d) {
                            this.f24803a = interfaceC7117d;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // kotlinx.coroutines.flow.InterfaceC7117d
                        /* JADX INFO: renamed from: r */
                        public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC9968c instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                                int i10 = anonymousClass1.f24805e;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.f24805e = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                            }
                            Object obj2 = anonymousClass1.f24804d;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i11 = anonymousClass1.f24805e;
                            if (i11 == 0) {
                                C7499b.m14977z0(obj2);
                                if (!((List) obj).isEmpty()) {
                                    anonymousClass1.f24805e = 1;
                                    if (this.f24803a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                C7499b.m14977z0(obj2);
                            }
                            return C9072e.f47360a;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC7116c
                    /* JADX INFO: renamed from: a */
                    public final Object mo9539a(InterfaceC7117d<? super List<? extends LibraryShelf>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                        Object objMo9539a = stateFlowImpl.mo9539a(new C37802(interfaceC7117d), interfaceC9968c);
                        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(libraryViewModel, null);
                this.f24797e = 1;
                if (C0062b.m369m0(interfaceC7116c, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$3", m19206f = "LibraryViewModel.kt", m19207l = {235}, m19208m = "invokeSuspend")
    final class C37813 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24807e;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$3$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LibraryViewModel f24809e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24809e = libraryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f24809e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f24809e.m9949u2();
                return C9072e.f47360a;
            }
        }

        public C37813(InterfaceC9968c<? super C37813> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LibraryViewModel.this.new C37813(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37813) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24807e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LibraryViewModel libraryViewModel = LibraryViewModel.this;
                StateFlowImpl stateFlowImpl = libraryViewModel.f24780k0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(libraryViewModel, null);
                this.f24807e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$4", m19206f = "LibraryViewModel.kt", m19207l = {241}, m19208m = "invokeSuspend")
    final class C37824 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24810e;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$4$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguageStudyStats, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LibraryViewModel f24812e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24812e = libraryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f24812e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguageStudyStats userLanguageStudyStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguageStudyStats, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f24812e.m9949u2();
                return C9072e.f47360a;
            }
        }

        public C37824(InterfaceC9968c<? super C37824> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LibraryViewModel.this.new C37824(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37824) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24810e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LibraryViewModel libraryViewModel = LibraryViewModel.this;
                StateFlowImpl stateFlowImpl = libraryViewModel.f24785o0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(libraryViewModel, null);
                this.f24810e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$5", m19206f = "LibraryViewModel.kt", m19207l = {247}, m19208m = "invokeSuspend")
    final class C37835 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24813e;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$5$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends Double>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LibraryViewModel f24815e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24815e = libraryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f24815e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Pair<? extends Integer, ? extends Double> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f24815e.m9949u2();
                return C9072e.f47360a;
            }
        }

        public C37835(InterfaceC9968c<? super C37835> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LibraryViewModel.this.new C37835(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37835) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24813e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LibraryViewModel libraryViewModel = LibraryViewModel.this;
                StateFlowImpl stateFlowImpl = libraryViewModel.f24784n0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(libraryViewModel, null);
                this.f24813e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$6", m19206f = "LibraryViewModel.kt", m19207l = {253}, m19208m = "invokeSuspend")
    final class C37846 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24816e;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$6$1", m19206f = "LibraryViewModel.kt", m19207l = {254, 255}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f24818e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LibraryViewModel f24819f;

            /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$6$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$6$1$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
            public static final class C106241 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ LibraryViewModel f24820e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C106241(LibraryViewModel libraryViewModel, InterfaceC9968c<? super C106241> interfaceC9968c) {
                    super(2, interfaceC9968c);
                    this.f24820e = libraryViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: a */
                public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                    return new C106241(this.f24820e, interfaceC9968c);
                }

                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    return ((C106241) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    LinkedHashMap linkedHashMap;
                    String str;
                    List list;
                    UserLanguageStudyStats userLanguageStudyStats;
                    Double d10;
                    Integer num;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    C7499b.m14977z0(obj);
                    LibraryViewModel libraryViewModel = this.f24820e;
                    libraryViewModel.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (!libraryViewModel.mo502f0()) {
                        arrayList.add(LibraryAdapter.AbstractC3755a.h.f24623a);
                        arrayList.add(new LibraryAdapter.AbstractC3755a.f(16));
                    }
                    StateFlowImpl stateFlowImpl = libraryViewModel.f24780k0;
                    Object value = stateFlowImpl.getValue();
                    Resource.Status status = Resource.Status.LOADING;
                    if (value != status) {
                        StateFlowImpl stateFlowImpl2 = libraryViewModel.f24783m0;
                        if (stateFlowImpl2.getValue() == status) {
                            arrayList.add(new LibraryAdapter.AbstractC3755a.g(0, 0, 0, 0, 0.0d, 0, true, 63));
                        } else {
                            Object value2 = stateFlowImpl.getValue();
                            Resource.Status status2 = Resource.Status.SUCCESS;
                            if (value2 == status2 && stateFlowImpl2.getValue() == status2) {
                                StateFlowImpl stateFlowImpl3 = libraryViewModel.f24785o0;
                                if (stateFlowImpl3.getValue() != null) {
                                    StateFlowImpl stateFlowImpl4 = libraryViewModel.f24784n0;
                                    if (stateFlowImpl4.getValue() != null && (userLanguageStudyStats = (UserLanguageStudyStats) stateFlowImpl3.getValue()) != null) {
                                        int i10 = userLanguageStudyStats.f21788c;
                                        UserStudyStatsScore userStudyStatsScore = (UserStudyStatsScore) C6752c.m13433a0(userLanguageStudyStats.f21791f);
                                        int i11 = userStudyStatsScore != null ? userStudyStatsScore.f21800c : 0;
                                        int i12 = userLanguageStudyStats.f21787b;
                                        Pair pair = (Pair) stateFlowImpl4.getValue();
                                        int iIntValue = (pair == null || (num = (Integer) pair.f38012a) == null) ? 0 : num.intValue();
                                        Pair pair2 = (Pair) stateFlowImpl4.getValue();
                                        arrayList.add(new LibraryAdapter.AbstractC3755a.g(i10, i11, i12, iIntValue, (pair2 == null || (d10 = (Double) pair2.f38013b) == null) ? 0.0d : d10.doubleValue(), userLanguageStudyStats.f21792g, false, 64));
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList.add(new LibraryAdapter.AbstractC3755a.g(0, 0, 0, 0, 0.0d, 0, true, 63));
                    }
                    arrayList.add(new LibraryAdapter.AbstractC3755a.f(24));
                    for (LibraryShelf libraryShelf : libraryViewModel.f24751P) {
                        String str2 = libraryShelf.f22052e;
                        List<LibraryTab> list2 = libraryShelf.f22049b;
                        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                        Iterator<T> it = list2.iterator();
                        int i13 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            linkedHashMap = libraryViewModel.f24753R;
                            str = libraryShelf.f22050c;
                            if (zHasNext) {
                                Object next = it.next();
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    C9000b.m17257w();
                                    throw null;
                                }
                                LibraryTab libraryTab = (LibraryTab) next;
                                String str3 = libraryTab.f22062c;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                LibraryContentType libraryContentType = LibraryContentType.Lessons;
                                String value3 = libraryContentType.getValue();
                                String str4 = libraryTab.f22061b;
                                if (!C5207g.m11106a(str4, value3)) {
                                    LibraryContentType libraryContentType2 = LibraryContentType.Courses;
                                    if (C5207g.m11106a(str4, libraryContentType2.getValue())) {
                                        libraryContentType = libraryContentType2;
                                    }
                                }
                                Integer num2 = libraryTab.f22064e;
                                int iIntValue2 = num2 != null ? num2.intValue() : -1;
                                LibraryTab libraryTab2 = (LibraryTab) linkedHashMap.get(str);
                                int i15 = iIntValue2;
                                ArrayList arrayList3 = arrayList2;
                                arrayList3.add(new C6336e(str3, libraryShelf, libraryContentType, i15, C5207g.m11106a(libraryTab2 != null ? libraryTab2.f22065f : null, libraryTab.f22065f), i13, libraryTab.f22065f));
                                arrayList2 = arrayList3;
                                str2 = str2;
                                i13 = i14;
                            }
                        }
                        arrayList.add(new LibraryAdapter.AbstractC3755a.c(str2, libraryShelf, arrayList2));
                        arrayList.add(new LibraryAdapter.AbstractC3755a.f(16));
                        LinkedHashMap linkedHashMap2 = libraryViewModel.f24752Q;
                        LibraryAdapter.AbstractC3755a abstractC3755a = (LibraryAdapter.AbstractC3755a) linkedHashMap2.get(libraryShelf);
                        boolean z10 = abstractC3755a instanceof LibraryAdapter.AbstractC3755a.d;
                        if (z10 && (list = (List) libraryViewModel.f24754S.get(C8656b.m16880G(libraryShelf, (LibraryTab) linkedHashMap.get(str)))) != null) {
                            linkedHashMap2.put(libraryShelf, new LibraryAdapter.AbstractC3755a.d(libraryShelf, new LibraryAdapter.AbstractC3757c.a(((LibraryAdapter.AbstractC3755a.d) abstractC3755a).f24612b.f24635a, list)));
                        }
                        int size = z10 ? ((LibraryAdapter.AbstractC3755a.d) abstractC3755a).f24612b.f24635a.size() + 0 : 0;
                        if (abstractC3755a instanceof LibraryAdapter.AbstractC3755a.e) {
                            size += ((LibraryAdapter.AbstractC3755a.e) abstractC3755a).f24614b.f24637a.size();
                        }
                        if (size == 0 && !(abstractC3755a instanceof LibraryAdapter.AbstractC3755a.b)) {
                            ArrayList arrayList4 = new ArrayList(1);
                            arrayList4.add(LibraryContentType.Lessons);
                            linkedHashMap2.put(libraryShelf, new LibraryAdapter.AbstractC3755a.e(libraryShelf, new LibraryAdapter.AbstractC3757c.b(arrayList4)));
                        }
                        arrayList.add(linkedHashMap2.get(libraryShelf));
                        arrayList.add(new LibraryAdapter.AbstractC3755a.f(20));
                        arrayList.add(LibraryAdapter.AbstractC3755a.a.f24606a);
                        arrayList.add(new LibraryAdapter.AbstractC3755a.f(20));
                    }
                    int i16 = 0;
                    int i17 = -1;
                    for (Object obj2 : arrayList) {
                        int i18 = i16 + 1;
                        if (i16 < 0) {
                            C9000b.m17257w();
                            throw null;
                        }
                        if ((((LibraryAdapter.AbstractC3755a) obj2) instanceof LibraryAdapter.AbstractC3755a.d) && i17 == -1) {
                            Pair pair3 = new Pair(-1, null);
                            StateFlowImpl stateFlowImpl5 = libraryViewModel.f24761Z;
                            stateFlowImpl5.setValue(pair3);
                            stateFlowImpl5.setValue(new Pair(Integer.valueOf(i16), TooltipStep.ChooseFirstLesson));
                            i17 = i16;
                        }
                        i16 = i18;
                    }
                    libraryViewModel.f24755T.setValue(C6752c.m13421O(arrayList));
                    return C9072e.f47360a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f24819f = libraryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f24819f, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f24818e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7499b.m14977z0(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj);
                    }
                }
                C7499b.m14977z0(obj);
                this.f24818e = 1;
                if (C7828f.m15567a(60L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                LibraryViewModel libraryViewModel = this.f24819f;
                CoroutineDispatcher coroutineDispatcher = libraryViewModel.f24744I;
                C106241 c106241 = new C106241(libraryViewModel, null);
                this.f24818e = 2;
                return C7828f.m15574h(this, coroutineDispatcher, c106241) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
            }
        }

        public C37846(InterfaceC9968c<? super C37846> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LibraryViewModel.this.new C37846(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37846) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24816e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LibraryViewModel libraryViewModel = LibraryViewModel.this;
                C7114a c7114aM287L1 = C0062b.m287L1(libraryViewModel.f24790t0);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(libraryViewModel, null);
                this.f24816e = 1;
                if (C0062b.m369m0(c7114aM287L1, anonymousClass1, this) == coroutineSingletons) {
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

    public LibraryViewModel(InterfaceC3324a interfaceC3324a, InterfaceC2010c interfaceC2010c, InterfaceC2014g interfaceC2014g, InterfaceC2013f interfaceC2013f, InterfaceC2016i interfaceC2016i, InterfaceC2017j interfaceC2017j, InterfaceC2009b interfaceC2009b, InterfaceC2012e interfaceC2012e, InterfaceC5182d interfaceC5182d, InterfaceC5180b interfaceC5180b, InterfaceC5179a interfaceC5179a, C7797e c7797e, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC0113j interfaceC0113j, InterfaceC9284a interfaceC9284a, InterfaceC4912b interfaceC4912b, InterfaceC7368e interfaceC7368e, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2010c, "courseRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC2016i, "milestoneRepository");
        C5207g.m11111f(interfaceC2017j, "noticeRepository");
        C5207g.m11111f(interfaceC2009b, "challengeRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(c7797e, "utils");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC9284a, "reportDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(interfaceC7368e, "notificationsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f24765d = interfaceC3324a;
        this.f24767e = interfaceC2010c;
        this.f24769f = interfaceC2014g;
        this.f24771g = interfaceC2013f;
        this.f24773h = interfaceC2016i;
        this.f24775i = interfaceC2017j;
        this.f24777j = interfaceC2009b;
        this.f24779k = interfaceC2012e;
        this.f24781l = interfaceC5182d;
        this.f24743H = interfaceC5180b;
        this.f24744I = coroutineDispatcher;
        this.f24745J = executorC7177a;
        this.f24746K = coroutineJobManager;
        this.f24747L = interfaceC0113j;
        this.f24748M = interfaceC4912b;
        this.f24749N = interfaceC7368e;
        this.f24750O = interfaceC9284a;
        this.f24751P = new LinkedHashSet();
        this.f24752Q = new LinkedHashMap();
        this.f24753R = new LinkedHashMap();
        this.f24754S = new LinkedHashMap();
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f24755T = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f24756U = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        Resource.Status status = Resource.Status.LOADING;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(status);
        this.f24757V = stateFlowImplM14379a2;
        this.f24758W = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f24759X = c7138sM10448a;
        this.f24760Y = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(new Pair(-1, null));
        this.f24761Z = stateFlowImplM14379a3;
        this.f24762a0 = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, new Pair(-1, null));
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f24763b0 = c7138sM10448a2;
        this.f24764c0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f24766d0 = c7138sM10448a3;
        this.f24768e0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f24770f0 = c7138sM10448a4;
        this.f24772g0 = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7135p c7135pM353h2 = C0062b.m353h2(interfaceC5179a.mo9594i(), C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        this.f24774h0 = c7135pM353h2;
        this.f24776i0 = C0062b.m353h2(new C7131l(mo509w0(), c7135pM353h2, new LibraryViewModel$_shelvesWithFeedLevels$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, new Pair(mo498E1(), emptyList));
        this.f24778j0 = C7120g.m14379a(emptyList);
        this.f24780k0 = C7120g.m14379a(status);
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(null);
        this.f24782l0 = stateFlowImplM14379a4;
        this.f24783m0 = C7120g.m14379a(status);
        this.f24784n0 = C7120g.m14379a(null);
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(null);
        this.f24785o0 = stateFlowImplM14379a5;
        this.f24786p0 = C0062b.m353h2(new C7131l(stateFlowImplM14379a5, stateFlowImplM14379a4, new LibraryViewModel$showRepairStreak$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f24787q0 = C7120g.m14379a(null);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f24788r0 = c7138sM10448a5;
        this.f24789s0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f24790t0 = C8573r0.m16738m(0, BufferOverflow.SUSPEND, 4);
        C7828f.m15570d(C8573r0.m16767w0(this), coroutineDispatcher, null, new C37781(null), 2);
        C7828f.m15570d(C8573r0.m16767w0(this), coroutineDispatcher, null, new C37792(null), 2);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C37813(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C37824(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C37835(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C37846(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l2 */
    public static final Object m9940l2(LibraryViewModel libraryViewModel, LinkedHashSet linkedHashSet, InterfaceC9968c interfaceC9968c) throws Throwable {
        LibraryViewModel$setupShelvesState$1 libraryViewModel$setupShelvesState$1;
        Set<LibraryShelf> set;
        LibraryViewModel libraryViewModel2 = libraryViewModel;
        libraryViewModel2.getClass();
        if (interfaceC9968c instanceof LibraryViewModel$setupShelvesState$1) {
            libraryViewModel$setupShelvesState$1 = (LibraryViewModel$setupShelvesState$1) interfaceC9968c;
            int i10 = libraryViewModel$setupShelvesState$1.f24903h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                libraryViewModel$setupShelvesState$1.f24903h = i10 - Integer.MIN_VALUE;
            } else {
                libraryViewModel$setupShelvesState$1 = new LibraryViewModel$setupShelvesState$1(libraryViewModel2, interfaceC9968c);
            }
        } else {
            libraryViewModel$setupShelvesState$1 = new LibraryViewModel$setupShelvesState$1(libraryViewModel2, interfaceC9968c);
        }
        Object obj = libraryViewModel$setupShelvesState$1.f24901f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = libraryViewModel$setupShelvesState$1.f24903h;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            libraryViewModel$setupShelvesState$1.f24899d = libraryViewModel2;
            libraryViewModel$setupShelvesState$1.f24900e = linkedHashSet;
            libraryViewModel$setupShelvesState$1.f24903h = 1;
            if (libraryViewModel2.m9942n2(linkedHashSet, libraryViewModel$setupShelvesState$1) == coroutineSingletons) {
                set = linkedHashSet;
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set2 = libraryViewModel$setupShelvesState$1.f24900e;
            libraryViewModel2 = libraryViewModel$setupShelvesState$1.f24899d;
            C7499b.m14977z0(obj);
            set = set2;
        }
        set = linkedHashSet;
        for (LibraryShelf libraryShelf : set) {
            List<LibraryTab> list = libraryShelf.f22049b;
            libraryViewModel2.m9948t2(libraryShelf);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                libraryViewModel2.m9943o2(libraryShelf, C8656b.m16880G(libraryShelf, (LibraryTab) it.next()));
            }
        }
        return C9072e.f47360a;
    }

    /* JADX INFO: renamed from: m2 */
    public static void m9941m2(LibraryViewModel libraryViewModel, String str, String str2, LibraryShelf libraryShelf) {
        libraryViewModel.getClass();
        C7499b.m14933c0(C8573r0.m16767w0(libraryViewModel), libraryViewModel.f24746K, libraryViewModel.f24745J, "fetchLibraryItems ".concat(str2), new LibraryViewModel$fetchLibraryItemsNetwork$1(libraryViewModel, str, libraryShelf, "", str2, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f24747L.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24747L.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: C1 */
    public final InterfaceC7142w<Integer> mo9327C1() {
        return this.f24749N.mo9327C1();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: D0 */
    public final Object mo9328D0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24749N.mo9328D0(i10, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f24747L.mo498E1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f24748M.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f24748M.mo9723I(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24747L.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f24748M.mo9724L();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: O */
    public final Object mo9329O(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24749N.mo9329O(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f24747L.mo500P();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: Q0 */
    public final Object mo9330Q0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24749N.mo9330Q0(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f24748M.mo9727T0();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: W */
    public final Object mo9830W(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24750O.mo9830W(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f24748M.mo9729Y1();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: a0 */
    public final void mo9831a0(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f24750O.mo9831a0(str, i10, str2, str3);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f24748M.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f24748M.mo9731b0(z10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24747L.mo501d(str, interfaceC9968c);
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: f */
    public final Object mo9832f(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24750O.mo9832f(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f24747L;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24747L.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f24748M.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f24748M.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f24748M.mo9735h();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f24748M.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f24747L.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f24748M.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f24748M.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f24747L.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f24747L.mo506l1();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: n */
    public final void mo9834n(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f24750O.mo9834n(str, i10, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: n2 */
    public final Object m9942n2(LinkedHashSet linkedHashSet, InterfaceC9968c interfaceC9968c) throws Throwable {
        LibraryViewModel$initiateSearchSettings$1 libraryViewModel$initiateSearchSettings$1;
        LibraryViewModel libraryViewModel;
        Set set;
        if (interfaceC9968c instanceof LibraryViewModel$initiateSearchSettings$1) {
            libraryViewModel$initiateSearchSettings$1 = (LibraryViewModel$initiateSearchSettings$1) interfaceC9968c;
            int i10 = libraryViewModel$initiateSearchSettings$1.f24870h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                libraryViewModel$initiateSearchSettings$1.f24870h = i10 - Integer.MIN_VALUE;
            } else {
                libraryViewModel$initiateSearchSettings$1 = new LibraryViewModel$initiateSearchSettings$1(this, interfaceC9968c);
            }
        } else {
            libraryViewModel$initiateSearchSettings$1 = new LibraryViewModel$initiateSearchSettings$1(this, interfaceC9968c);
        }
        Object objM14360a = libraryViewModel$initiateSearchSettings$1.f24868f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = libraryViewModel$initiateSearchSettings$1.f24870h;
        if (i11 != 0) {
            if (i11 == 1) {
                Set set2 = libraryViewModel$initiateSearchSettings$1.f24867e;
                libraryViewModel = libraryViewModel$initiateSearchSettings$1.f24866d;
                C7499b.m14977z0(objM14360a);
                set = set2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM14360a);
            }
        }
        C7499b.m14977z0(objM14360a);
        InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = this.f24781l.mo9688l();
        libraryViewModel$initiateSearchSettings$1.f24866d = this;
        libraryViewModel$initiateSearchSettings$1.f24867e = linkedHashSet;
        libraryViewModel$initiateSearchSettings$1.f24870h = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l, libraryViewModel$initiateSearchSettings$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        libraryViewModel = this;
        set = linkedHashSet;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
        Iterator it = set.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                LibraryShelf libraryShelf = (LibraryShelf) it.next();
                if (((LibrarySearchQuery) linkedHashMapM13467T0.get(C8656b.m16893T(libraryShelf, libraryViewModel.mo498E1(), null))) == null) {
                    linkedHashMapM13467T0.put(C8656b.m16893T(libraryShelf, libraryViewModel.mo498E1(), null), libraryViewModel.m9947s2(libraryShelf.f22050c));
                }
            }
        }
        LibraryShelfType libraryShelfType = LibraryShelfType.Search;
        if (((LibrarySearchQuery) linkedHashMapM13467T0.get(C7793a.m15498b(libraryViewModel.mo498E1(), libraryShelfType.getValue()))) == null) {
            linkedHashMapM13467T0.put(C7793a.m15498b(libraryViewModel.mo498E1(), libraryShelfType.getValue()), libraryViewModel.m9947s2(libraryShelfType.getValue()));
        }
        libraryViewModel$initiateSearchSettings$1.f24866d = null;
        libraryViewModel$initiateSearchSettings$1.f24867e = null;
        libraryViewModel$initiateSearchSettings$1.f24870h = 2;
        return libraryViewModel.f24781l.mo9696t(linkedHashMapM13467T0, libraryViewModel$initiateSearchSettings$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9943o2(LibraryShelf libraryShelf, String str) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f24746K, this.f24744I, "libraryForShelf " + libraryShelf, new LibraryViewModel$libraryItemsForShelf$1(libraryShelf, this, str, null));
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f24748M.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f24747L.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m9944p2(LibraryShelf libraryShelf) {
        String str;
        m9948t2(libraryShelf);
        LinkedHashMap linkedHashMap = this.f24753R;
        String str2 = libraryShelf.f22050c;
        m9943o2(libraryShelf, C8656b.m16880G(libraryShelf, (LibraryTab) linkedHashMap.get(str2)));
        String strMo498E1 = mo498E1();
        LibraryTab libraryTab = (LibraryTab) linkedHashMap.get(str2);
        if (libraryTab == null || (str = libraryTab.f22065f) == null) {
            str = "";
        }
        m9941m2(this, strMo498E1, str, libraryShelf);
    }

    /* JADX INFO: renamed from: q2 */
    public final void m9945q2(AbstractC3813g abstractC3813g) {
        if (!abstractC3813g.mo9956b()) {
            this.f24759X.mo14371k(abstractC3813g);
            return;
        }
        C6332a c6332aMo9955a = abstractC3813g.mo9955a();
        int i10 = c6332aMo9955a != null ? c6332aMo9955a.f36594U : 0;
        C6332a c6332aMo9955a2 = abstractC3813g.mo9955a();
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LibraryViewModel$showBuyPremiumLesson$1(this, i10, c6332aMo9955a2 != null ? c6332aMo9955a2.f36595a : 0, null), 3);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f24748M.mo9743r0();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m9946r2() {
        String str;
        for (LibraryShelf libraryShelf : this.f24751P) {
            String strMo498E1 = mo498E1();
            LibraryTab libraryTab = (LibraryTab) this.f24753R.get(libraryShelf.f22050c);
            if (libraryTab == null || (str = libraryTab.f22065f) == null) {
                str = "";
            }
            m9941m2(this, strMo498E1, str, libraryShelf);
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LibraryViewModel$networkUpdateShelves$1(this, null), 3);
    }

    /* JADX INFO: renamed from: s2 */
    public final LibrarySearchQuery m9947s2(String str) {
        Sort sort;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map linkedHashMap2 = new LinkedHashMap();
        LibraryShelfType libraryShelfType = LibraryShelfType.Trending;
        if (!C5207g.m11106a(str, libraryShelfType.getValue())) {
            Resources resources = Resources.ResourceAttachments;
            Boolean bool = Boolean.FALSE;
            linkedHashMap.put(resources, bool);
            linkedHashMap.put(Resources.ResourceExercises, bool);
            linkedHashMap.put(Resources.ResourceNotes, bool);
            linkedHashMap.put(Resources.ResourceScript, bool);
            linkedHashMap.put(Resources.ResourceTranslations, bool);
            linkedHashMap.put(Resources.ResourceVideos, bool);
        }
        if (C5207g.m11106a(str, LibraryShelfType.MyCourses.getValue())) {
            sort = Sort.Opened;
        } else if (C5207g.m11106a(str, LibraryShelfType.Guided.getValue()) || C5207g.m11106a(str, LibraryShelfType.MiniStories.getValue())) {
            sort = Sort.Position;
        } else if (C5207g.m11106a(str, LibraryShelfType.MyLessons.getValue())) {
            sort = Sort.Opened;
        } else if (C5207g.m11106a(str, libraryShelfType.getValue())) {
            sort = Sort.Position;
        } else {
            sort = (!C5207g.m11106a(str, LibraryShelfType.Media.getValue()) && C5207g.m11106a(str, LibraryShelfType.Search.getValue())) ? Sort.Liked : Sort.Newest;
        }
        Sort sort2 = sort;
        int i10 = C5207g.m11106a(str, LibraryShelfType.MiniStories.getValue()) ? 60 : 20;
        C7135p c7135p = this.f24774h0;
        if (((Map) ((Map) c7135p.getValue()).get(mo498E1())) != null) {
            Map map = (Map) ((Map) c7135p.getValue()).get(mo498E1());
            if (map != null) {
                linkedHashMap2 = map;
            }
        } else {
            for (LearningLevel learningLevel : LearningLevel.values()) {
                linkedHashMap2.put(learningLevel, Boolean.TRUE);
            }
        }
        return new LibrarySearchQuery(linkedHashMap, linkedHashMap2, i10, sort2, false, false, false, null, null, null, null, null, 4080, null);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f24747L.mo508t1();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m9948t2(LibraryShelf libraryShelf) {
        Object next;
        LibraryTab libraryTab;
        LinkedHashMap linkedHashMap = this.f24753R;
        Object obj = linkedHashMap.get(libraryShelf.f22050c);
        String str = libraryShelf.f22050c;
        if (obj == null) {
            List<LibraryTab> list = libraryShelf.f22049b;
            if (!list.isEmpty()) {
                Object obj2 = null;
                if (list.size() == 1) {
                    libraryTab = (LibraryTab) C6752c.m13423Q(list);
                } else {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!C5207g.m11106a(((LibraryTab) next).f22063d, Boolean.TRUE));
                    libraryTab = (LibraryTab) next;
                    if (libraryTab == null) {
                        libraryTab = (LibraryTab) C6752c.m13423Q(list);
                    }
                }
                linkedHashMap.put(str, libraryTab);
                if (list.size() == 1) {
                    String str2 = ((LibraryTab) C6752c.m13423Q(list)).f22061b;
                    return;
                }
                for (Object obj3 : list) {
                    if (C5207g.m11106a(((LibraryTab) obj3).f22063d, Boolean.TRUE)) {
                        obj2 = obj3;
                        break;
                    }
                }
                LibraryTab libraryTab2 = (LibraryTab) obj2;
                if (libraryTab2 == null || libraryTab2.f22061b == null) {
                    LibraryContentType.Lessons.getValue();
                }
                return;
            }
        }
        LibraryTab libraryTab3 = (LibraryTab) linkedHashMap.get(str);
        if (libraryTab3 == null || libraryTab3.f22061b == null) {
            LibraryContentType.Lessons.getValue();
        }
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f24748M.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f24748M.mo9745u0(z10);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m9949u2() {
        this.f24790t0.mo16479j(C9072e.f47360a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f24748M.mo9746v1(tooltipStep);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m9950v2() {
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        LibraryViewModel$updateStreak$1 libraryViewModel$updateStreak$1 = new LibraryViewModel$updateStreak$1(this, null);
        CoroutineJobManager coroutineJobManager = this.f24746K;
        CoroutineDispatcher coroutineDispatcher = this.f24745J;
        C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "update streak", libraryViewModel$updateStreak$1);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "update language streak", new LibraryViewModel$updateLanguageStreak$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "update milestones", new LibraryViewModel$updateMilestones$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "update goals", new LibraryViewModel$updateGoals$1(this, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f24747L.mo509w0();
    }
}
