package com.lingq.p055ui.home.course;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2014g;
import ci.InterfaceC2019l;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.playlist.PlaylistAdapter;
import com.lingq.p055ui.lesson.AbstractC4267a;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.player.C3296a;
import com.lingq.player.C3297b;
import com.lingq.player.C3300e;
import com.lingq.player.InterfaceC3301f;
import com.lingq.player.PlayerContentController;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ki.C6697c;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p076di.InterfaceC5182d;
import p205jk.InterfaceC6515k;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p416uh.InterfaceC9527a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.C9015k;
import sh.InterfaceC9013i;
import sl.C9072e;
import tl.C9325m;
import vi.C9737l;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/home/course/CoursePlaylistViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/player/f;", "Lsh/i;", "Ljk/k;", "Luh/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CoursePlaylistViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC3301f, InterfaceC9013i, InterfaceC6515k, InterfaceC9527a {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC3301f f23819H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC9013i f23820I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC6515k f23821J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC9527a f23822K;

    /* JADX INFO: renamed from: L */
    public final C9737l f23823L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f23824M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f23825N;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f23826O;

    /* JADX INFO: renamed from: P */
    public final StateFlowImpl f23827P;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f23828Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f23829R;

    /* JADX INFO: renamed from: S */
    public final C7135p f23830S;

    /* JADX INFO: renamed from: T */
    public final C7135p f23831T;

    /* JADX INFO: renamed from: U */
    public final C7135p f23832U;

    /* JADX INFO: renamed from: V */
    public final StateFlowImpl f23833V;

    /* JADX INFO: renamed from: W */
    public final C7135p f23834W;

    /* JADX INFO: renamed from: X */
    public final StateFlowImpl f23835X;

    /* JADX INFO: renamed from: Y */
    public final C7135p f23836Y;

    /* JADX INFO: renamed from: Z */
    public final C7138s f23837Z;

    /* JADX INFO: renamed from: a0 */
    public final C7134o f23838a0;

    /* JADX INFO: renamed from: b0 */
    public final C7138s f23839b0;

    /* JADX INFO: renamed from: c0 */
    public final C7138s f23840c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2019l f23841d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f23842d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2014g f23843e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2024q f23844f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5180b f23845g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5182d f23846h;

    /* JADX INFO: renamed from: i */
    public final CoroutineDispatcher f23847i;

    /* JADX INFO: renamed from: j */
    public final CoroutineJobManager f23848j;

    /* JADX INFO: renamed from: k */
    public final PlayerController f23849k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0113j f23850l;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {170}, m19208m = "invokeSuspend")
    final class C36531 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23851e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/playlist/PlaylistAdapter$c$e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$1$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends PlaylistAdapter.AbstractC3890c.e>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CoursePlaylistViewModel f23853e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23853e = coursePlaylistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23853e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends PlaylistAdapter.AbstractC3890c.e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = this.f23853e;
                coursePlaylistViewModel.f23835X.setValue(CoursePlaylistViewModel.m9884l2(coursePlaylistViewModel));
                return C9072e.f47360a;
            }
        }

        public C36531(InterfaceC9968c<? super C36531> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CoursePlaylistViewModel.this.new C36531(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36531) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23851e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = CoursePlaylistViewModel.this;
                C7135p c7135p = coursePlaylistViewModel.f23834W;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coursePlaylistViewModel, null);
                this.f23851e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$2", m19206f = "CoursePlaylistViewModel.kt", m19207l = {176}, m19208m = "invokeSuspend")
    final class C36542 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23854e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$2$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6697c>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CoursePlaylistViewModel f23856e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23856e = coursePlaylistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23856e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C6697c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = this.f23856e;
                coursePlaylistViewModel.f23835X.setValue(CoursePlaylistViewModel.m9884l2(coursePlaylistViewModel));
                return C9072e.f47360a;
            }
        }

        public C36542(InterfaceC9968c<? super C36542> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CoursePlaylistViewModel.this.new C36542(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36542) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23854e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = CoursePlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = coursePlaylistViewModel.f23827P;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coursePlaylistViewModel, null);
                this.f23854e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$3", m19206f = "CoursePlaylistViewModel.kt", m19207l = {182}, m19208m = "invokeSuspend")
    final class C36553 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23857e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$3$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CoursePlaylistViewModel f23859e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23859e = coursePlaylistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23859e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = this.f23859e;
                coursePlaylistViewModel.f23835X.setValue(CoursePlaylistViewModel.m9884l2(coursePlaylistViewModel));
                return C9072e.f47360a;
            }
        }

        public C36553(InterfaceC9968c<? super C36553> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CoursePlaylistViewModel.this.new C36553(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36553) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23857e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = CoursePlaylistViewModel.this;
                InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> interfaceC7133nMo9425z0 = coursePlaylistViewModel.mo9425z0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coursePlaylistViewModel, null);
                this.f23857e = 1;
                if (C0062b.m369m0(interfaceC7133nMo9425z0, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$4", m19206f = "CoursePlaylistViewModel.kt", m19207l = {188}, m19208m = "invokeSuspend")
    final class C36564 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23860e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/d;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$4$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6698d>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CoursePlaylistViewModel f23862e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23862e = coursePlaylistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23862e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C6698d> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = this.f23862e;
                coursePlaylistViewModel.f23835X.setValue(CoursePlaylistViewModel.m9884l2(coursePlaylistViewModel));
                return C9072e.f47360a;
            }
        }

        public C36564(InterfaceC9968c<? super C36564> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CoursePlaylistViewModel.this.new C36564(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36564) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23860e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = CoursePlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = coursePlaylistViewModel.f23824M;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coursePlaylistViewModel, null);
                this.f23860e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$5", m19206f = "CoursePlaylistViewModel.kt", m19207l = {194}, m19208m = "invokeSuspend")
    final class C36575 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23863e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$5$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CoursePlaylistViewModel f23865e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23865e = coursePlaylistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23865e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends LibraryItemCounter> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = this.f23865e;
                coursePlaylistViewModel.f23835X.setValue(CoursePlaylistViewModel.m9884l2(coursePlaylistViewModel));
                return C9072e.f47360a;
            }
        }

        public C36575(InterfaceC9968c<? super C36575> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CoursePlaylistViewModel.this.new C36575(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36575) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23863e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = CoursePlaylistViewModel.this;
                StateFlowImpl stateFlowImpl = coursePlaylistViewModel.f23826O;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coursePlaylistViewModel, null);
                this.f23863e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$6 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$6", m19206f = "CoursePlaylistViewModel.kt", m19207l = {200}, m19208m = "invokeSuspend")
    final class C36586 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23866e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$6$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "tracks", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$6$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends PlayerContentController.PlayerContentItem>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f23868e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CoursePlaylistViewModel f23869f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23869f = coursePlaylistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23869f, interfaceC9968c);
                anonymousClass1.f23868e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends PlayerContentController.PlayerContentItem> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f23869f.m9888p2((List) this.f23868e);
                return C9072e.f47360a;
            }
        }

        public C36586(InterfaceC9968c<? super C36586> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CoursePlaylistViewModel.this.new C36586(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36586) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23866e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CoursePlaylistViewModel coursePlaylistViewModel = CoursePlaylistViewModel.this;
                C7135p c7135p = coursePlaylistViewModel.f23831T;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(coursePlaylistViewModel, null);
                this.f23866e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$7 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$7", m19206f = "CoursePlaylistViewModel.kt", m19207l = {206, 207}, m19208m = "invokeSuspend")
    final class C36597 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23870e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$7$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$7$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f23872e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CoursePlaylistViewModel f23873f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23873f = coursePlaylistViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23873f, interfaceC9968c);
                anonymousClass1.f23872e = ((Number) obj).intValue();
                return anonymousClass1;
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
                this.f23873f.f23842d0.setValue(Boolean.valueOf(this.f23872e > 0));
                return C9072e.f47360a;
            }
        }

        public C36597(InterfaceC9968c<? super C36597> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CoursePlaylistViewModel.this.new C36597(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36597) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23870e;
            CoursePlaylistViewModel coursePlaylistViewModel = CoursePlaylistViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC2024q interfaceC2024q = coursePlaylistViewModel.f23844f;
            String strMo498E1 = coursePlaylistViewModel.mo498E1();
            this.f23870e = 1;
            obj = interfaceC2024q.mo6170a(strMo498E1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(coursePlaylistViewModel, null);
            this.f23870e = 2;
            if (C0062b.m369m0((InterfaceC7116c) obj, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    public CoursePlaylistViewModel(InterfaceC2019l interfaceC2019l, InterfaceC2014g interfaceC2014g, InterfaceC2024q interfaceC2024q, InterfaceC5180b interfaceC5180b, InterfaceC5182d interfaceC5182d, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, PlayerController playerController, InterfaceC0113j interfaceC0113j, InterfaceC3301f interfaceC3301f, InterfaceC9013i interfaceC9013i, InterfaceC9527a interfaceC9527a, InterfaceC6515k interfaceC6515k, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(playerController, "playerController");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC3301f, "playerViewModelDelegate");
        C5207g.m11111f(interfaceC9013i, "playerServiceControllerDelegate");
        C5207g.m11111f(interfaceC9527a, "downloadManagerDelegate");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23841d = interfaceC2019l;
        this.f23843e = interfaceC2014g;
        this.f23844f = interfaceC2024q;
        this.f23845g = interfaceC5180b;
        this.f23846h = interfaceC5182d;
        this.f23847i = executorC7177a;
        this.f23848j = coroutineJobManager;
        this.f23849k = playerController;
        this.f23850l = interfaceC0113j;
        this.f23819H = interfaceC3301f;
        this.f23820I = interfaceC9013i;
        this.f23821J = interfaceC6515k;
        this.f23822K = interfaceC9527a;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("courseId")) {
            throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) c1024c0.m3929b("courseId");
        if (num == null) {
            throw new IllegalArgumentException("Argument \"courseId\" of type integer does not support null values");
        }
        if (!linkedHashMap.containsKey("courseTitle")) {
            throw new IllegalArgumentException("Required argument \"courseTitle\" is missing and does not have an android:defaultValue");
        }
        String str = (String) c1024c0.m3929b("courseTitle");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"courseTitle\" is marked as non-null but was passed a null value");
        }
        this.f23823L = new C9737l(str, num.intValue());
        EmptyList emptyList = EmptyList.f38032a;
        this.f23824M = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f23825N = stateFlowImplM14379a;
        this.f23826O = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f23827P = stateFlowImplM14379a2;
        this.f23828Q = C7120g.m14379a(CoursePlaylistSort.All);
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(bool);
        this.f23829R = stateFlowImplM14379a3;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f23830S = C0062b.m353h2(stateFlowImplM14379a3, interfaceC7882zM16767w0, startedWhileSubscribed, bool);
        this.f23831T = C0062b.m353h2(new C7131l(stateFlowImplM14379a2, stateFlowImplM14379a, new CoursePlaylistViewModel$audioSources$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f23832U = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a2, new CoursePlaylistViewModel$showPlayer$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(Resource.Status.EMPTY);
        this.f23833V = stateFlowImplM14379a4;
        this.f23834W = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a4, new CoursePlaylistViewModel$_loadingPlaylistsItems$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(emptyList);
        this.f23835X = stateFlowImplM14379a5;
        this.f23836Y = C0062b.m353h2(stateFlowImplM14379a5, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f23837Z = c7138sM10448a;
        this.f23838a0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f23839b0 = c7138sM10448a2;
        C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f23840c0 = c7138sM10448a3;
        C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C0062b.m341d2(C4924a.m10448a(), C8573r0.m16767w0(this), startedWhileSubscribed);
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(null);
        this.f23842d0 = stateFlowImplM14379a6;
        C0062b.m353h2(stateFlowImplM14379a6, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        m9885m2();
        mo9401L1(emptyList);
        playerController.m9415p0(true);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36531(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36542(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36553(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36564(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36575(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36586(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36597(null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final ArrayList m9884l2(CoursePlaylistViewModel coursePlaylistViewModel) {
        Object obj;
        boolean z10;
        Object next;
        coursePlaylistViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PlaylistAdapter.AbstractC3890c.c((CoursePlaylistSort) coursePlaylistViewModel.f23828Q.getValue()));
        StateFlowImpl stateFlowImpl = coursePlaylistViewModel.f23827P;
        List<C6697c> list = (List) stateFlowImpl.getValue();
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        for (C6697c c6697c : list) {
            Iterator it = ((Iterable) coursePlaylistViewModel.f23826O.getValue()).iterator();
            do {
                obj = null;
                z10 = true;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((LibraryItemCounter) next).f22004a == c6697c.f37856a));
            LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
            for (Object obj2 : (Iterable) coursePlaylistViewModel.f23824M.getValue()) {
                C6698d c6698d = (C6698d) obj2;
                if (c6698d != null && c6697c.f37856a == c6698d.f37875a) {
                    obj = obj2;
                    break;
                }
            }
            C6698d c6698d2 = (C6698d) obj;
            PlayerContentController.PlayerContentItem playerContentItem = coursePlaylistViewModel.mo9425z0().getValue().f38021a;
            if (playerContentItem == null || c6697c.f37856a != playerContentItem.f17600a) {
                z10 = false;
            }
            arrayList2.add(new PlaylistAdapter.AbstractC3890c.a(c6697c, null, libraryItemCounter, c6698d2, false, Boolean.valueOf(z10), 2));
        }
        arrayList.addAll(arrayList2);
        if (((List) stateFlowImpl.getValue()).isEmpty()) {
            arrayList.addAll((Collection) coursePlaylistViewModel.f23834W.getValue());
        }
        return arrayList;
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f23821J.mo9771A(upgradeReason);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        this.f23822K.mo9391A0(i10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f23850l.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23850l.mo497B0(interfaceC9968c);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: E */
    public final void mo9720E(PlayingFrom playingFrom) {
        C5207g.m11111f(playingFrom, "playingFrom");
        this.f23820I.mo9720E(playingFrom);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f23850l.mo498E1();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: F0 */
    public final InterfaceC7142w<C9015k> mo9721F0() {
        return this.f23820I.mo9721F0();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: G */
    public final InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> mo9396G() {
        return this.f23819H.mo9396G();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f23821J.mo9772G1(str);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: I1 */
    public final InterfaceC7133n<AbstractC4267a> mo9398I1() {
        return this.f23819H.mo9398I1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23850l.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC7133n<C3296a> mo9399J0() {
        return this.f23819H.mo9399J0();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: L1 */
    public final void mo9401L1(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        this.f23819H.mo9401L1(list);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: O0 */
    public final void mo9403O0(String str, int i10, double d10) {
        C5207g.m11111f(str, "language");
        this.f23819H.mo9403O0(str, i10, d10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f23850l.mo500P();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: R1 */
    public final InterfaceC7142w<PlayingFrom> mo9726R1() {
        return this.f23820I.mo9726R1();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f23821J.mo9773S0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23822K.mo9405S1(downloadItem, interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f23821J.mo9774X();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(DownloadItem downloadItem, boolean z10) {
        this.f23822K.mo9406X0(downloadItem, z10);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23822K.mo9407X1(str, list, i10, false, interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f23822K.mo9409a2();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: b1 */
    public final void mo9732b1() {
        this.f23820I.mo9732b1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23850l.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f23850l;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23850l.mo503f1(interfaceC9968c);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f23821J.mo9775i0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        this.f23822K.mo9412i1(arrayList, str);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f23850l.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23850l.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f23850l.mo506l1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9885m2() {
        m9886n2(mo498E1());
        String strMo498E1 = mo498E1();
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        String strM852k = C0204c.m852k("lessons downloads ", strMo498E1);
        CoursePlaylistViewModel$getLessonDownloadsObservable$1 coursePlaylistViewModel$getLessonDownloadsObservable$1 = new CoursePlaylistViewModel$getLessonDownloadsObservable$1(this, strMo498E1, null);
        CoroutineJobManager coroutineJobManager = this.f23848j;
        C7499b.m14935d0(interfaceC7882zM16767w0, coroutineJobManager, strM852k, coursePlaylistViewModel$getLessonDownloadsObservable$1);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, this.f23847i, C0166e.m761g("course playlist ", this.f23823L.f49762a), new CoursePlaylistViewModel$getCoursePlaylist$1(this, null));
    }

    /* JADX INFO: renamed from: n2 */
    public final void m9886n2(String str) {
        C5207g.m11111f(str, "language");
        C7499b.m14935d0(C8573r0.m16767w0(this), this.f23848j, "lessons downloads start ".concat(str), new CoursePlaylistViewModel$getLessonDownloadsForStart$1(this, str, null));
    }

    /* JADX INFO: renamed from: o2 */
    public final boolean m9887o2(int i10) {
        Object obj;
        Object next;
        Iterator it = ((Iterable) this.f23826O.getValue()).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((LibraryItemCounter) next).f22004a == i10));
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
        for (Object obj2 : (Iterable) this.f23827P.getValue()) {
            if (((C6697c) obj2).f37856a == i10) {
                obj = obj2;
                break;
            }
        }
        C6697c c6697c = (C6697c) obj;
        if ((libraryItemCounter == null || libraryItemCounter.f22009f) ? false : true) {
            if ((c6697c != null ? c6697c.f37874s : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<C9072e> mo9740p() {
        return this.f23820I.mo9740p();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f23850l.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m9888p2(List<PlayerContentController.PlayerContentItem> list) {
        if (!list.isEmpty()) {
            mo9401L1(list);
            C7499b.m14935d0(C8573r0.m16767w0(this), this.f23848j, C0166e.m761g("tracksDownload ", this.f23823L.f49762a), new CoursePlaylistViewModel$resetAndSetupTracks$1(this, list, null));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final void m9889q2(int i10) {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new CoursePlaylistViewModel$showBuyPremiumLesson$1(this, i10, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f23850l.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f23850l.mo509w0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23822K.mo9422x0(downloadItem, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y */
    public final InterfaceC7133n<C3297b> mo9423y() {
        return this.f23819H.mo9423y();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC7133n<C3300e> mo9424y0() {
        return this.f23819H.mo9424y0();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> mo9425z0() {
        return this.f23819H.mo9425z0();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: z1 */
    public final void mo9747z1(int i10, long j10, boolean z10) {
        this.f23820I.mo9747z1(i10, j10, z10);
    }
}
