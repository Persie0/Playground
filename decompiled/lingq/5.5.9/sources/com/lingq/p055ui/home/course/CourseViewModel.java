package com.lingq.p055ui.home.course;

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
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.p055ui.lesson.AbstractC4267a;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.player.C3296a;
import com.lingq.player.C3297b;
import com.lingq.player.C3300e;
import com.lingq.player.InterfaceC3301f;
import com.lingq.player.PlayerContentController;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.Sort;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p181ii.C6332a;
import p183ik.C6343f;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p416uh.InterfaceC9527a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import th.InterfaceC9284a;
import vi.C9730e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/home/course/CourseViewModel;", "Landroidx/lifecycle/h0;", "Luh/a;", "Lak/j;", "Lcom/lingq/player/f;", "Lcom/lingq/ui/tooltips/b;", "Lth/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class CourseViewModel extends AbstractC1036h0 implements InterfaceC9527a, InterfaceC0113j, InterfaceC3301f, InterfaceC4912b, InterfaceC9284a {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4912b f23925H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC9284a f23926I;

    /* JADX INFO: renamed from: J */
    public final C9730e f23927J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f23928K;

    /* JADX INFO: renamed from: L */
    public final StateFlowImpl f23929L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f23930M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f23931N;

    /* JADX INFO: renamed from: O */
    public final StateFlowImpl f23932O;

    /* JADX INFO: renamed from: P */
    public final C7138s f23933P;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f23934Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f23935R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f23936S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f23937T;

    /* JADX INFO: renamed from: U */
    public final StateFlowImpl f23938U;

    /* JADX INFO: renamed from: V */
    public final StateFlowImpl f23939V;

    /* JADX INFO: renamed from: W */
    public final StateFlowImpl f23940W;

    /* JADX INFO: renamed from: X */
    public final StateFlowImpl f23941X;

    /* JADX INFO: renamed from: Y */
    public final StateFlowImpl f23942Y;

    /* JADX INFO: renamed from: Z */
    public final StateFlowImpl f23943Z;

    /* JADX INFO: renamed from: a0 */
    public final StateFlowImpl f23944a0;

    /* JADX INFO: renamed from: b0 */
    public final StateFlowImpl f23945b0;

    /* JADX INFO: renamed from: c0 */
    public final StateFlowImpl f23946c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2010c f23947d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f23948d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3324a f23949e;

    /* JADX INFO: renamed from: e0 */
    public final C7138s f23950e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2014g f23951f;

    /* JADX INFO: renamed from: f0 */
    public final C7134o f23952f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5180b f23953g;

    /* JADX INFO: renamed from: g0 */
    public final C7138s f23954g0;

    /* JADX INFO: renamed from: h */
    public final CoroutineDispatcher f23955h;

    /* JADX INFO: renamed from: h0 */
    public final C7134o f23956h0;

    /* JADX INFO: renamed from: i */
    public final CoroutineJobManager f23957i;

    /* JADX INFO: renamed from: i0 */
    public final C7135p f23958i0;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC9527a f23959j;

    /* JADX INFO: renamed from: j0 */
    public final C7138s f23960j0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC0113j f23961k;

    /* JADX INFO: renamed from: k0 */
    public final C7134o f23962k0;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC3301f f23963l;

    /* JADX INFO: renamed from: l0 */
    public final C7138s f23964l0;

    /* JADX INFO: renamed from: m0 */
    public final C7134o f23965m0;

    /* JADX INFO: renamed from: n0 */
    public final C7138s f23966n0;

    /* JADX INFO: renamed from: o0 */
    public final C7134o f23967o0;

    /* JADX INFO: renamed from: p0 */
    public final C7138s f23968p0;

    /* JADX INFO: renamed from: q0 */
    public final C7134o f23969q0;

    /* JADX INFO: renamed from: r0 */
    public final C7138s f23970r0;

    /* JADX INFO: renamed from: s0 */
    public final C7134o f23971s0;

    /* JADX INFO: renamed from: t0 */
    public final C7135p f23972t0;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$1", m19206f = "CourseViewModel.kt", m19207l = {273}, m19208m = "invokeSuspend")
    final class C36651 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23973e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$1$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CourseViewModel f23975e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CourseViewModel courseViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23975e = courseViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23975e, interfaceC9968c);
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
                StateFlowImpl stateFlowImpl = this.f23975e.f23932O;
                stateFlowImpl.setValue(new Integer(((Number) stateFlowImpl.getValue()).intValue() + 1));
                return C9072e.f47360a;
            }
        }

        public C36651(InterfaceC9968c<? super C36651> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CourseViewModel.this.new C36651(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36651) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23973e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CourseViewModel courseViewModel = CourseViewModel.this;
                C7138s c7138s = courseViewModel.f23933P;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(courseViewModel, null);
                this.f23973e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$2", m19206f = "CourseViewModel.kt", m19207l = {279}, m19208m = "invokeSuspend")
    final class C36662 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23976e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$2$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ CourseViewModel f23978e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CourseViewModel courseViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23978e = courseViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f23978e, interfaceC9968c);
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
                CourseViewModel courseViewModel = this.f23978e;
                CourseViewModel.m9890l2(courseViewModel);
                courseViewModel.m9892n2();
                return C9072e.f47360a;
            }
        }

        public C36662(InterfaceC9968c<? super C36662> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CourseViewModel.this.new C36662(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36662) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23976e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CourseViewModel courseViewModel = CourseViewModel.this;
                StateFlowImpl stateFlowImpl = courseViewModel.f23932O;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(courseViewModel, null);
                this.f23976e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$3", m19206f = "CourseViewModel.kt", m19207l = {286}, m19208m = "invokeSuspend")
    final class C36673 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f23979e;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$3$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ boolean f23981e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ CourseViewModel f23982f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CourseViewModel courseViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f23982f = courseViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23982f, interfaceC9968c);
                anonymousClass1.f23981e = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                this.f23982f.f23934Q.setValue(Boolean.valueOf(this.f23981e));
                return C9072e.f47360a;
            }
        }

        public C36673(InterfaceC9968c<? super C36673> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return CourseViewModel.this.new C36673(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36673) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f23979e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                CourseViewModel courseViewModel = CourseViewModel.this;
                C7135p c7135p = courseViewModel.f23972t0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(courseViewModel, null);
                this.f23979e = 1;
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

    public CourseViewModel(InterfaceC2010c interfaceC2010c, InterfaceC3324a interfaceC3324a, InterfaceC2014g interfaceC2014g, InterfaceC5180b interfaceC5180b, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager, InterfaceC0113j interfaceC0113j, InterfaceC3301f interfaceC3301f, InterfaceC9527a interfaceC9527a, InterfaceC9284a interfaceC9284a, InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        LessonPath lessonPath;
        C5207g.m11111f(interfaceC2010c, "courseRepository");
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC3301f, "playerViewModelDelegate");
        C5207g.m11111f(interfaceC9527a, "downloadManagerDelegate");
        C5207g.m11111f(interfaceC9284a, "reportDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f23947d = interfaceC2010c;
        this.f23949e = interfaceC3324a;
        this.f23951f = interfaceC2014g;
        this.f23953g = interfaceC5180b;
        this.f23955h = executorC7177a;
        this.f23957i = coroutineJobManager;
        this.f23959j = interfaceC9527a;
        this.f23961k = interfaceC0113j;
        this.f23963l = interfaceC3301f;
        this.f23925H = interfaceC4912b;
        this.f23926I = interfaceC9284a;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("courseId")) {
            throw new IllegalArgumentException("Required argument \"courseId\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) c1024c0.m3929b("courseId");
        if (num == null) {
            throw new IllegalArgumentException("Argument \"courseId\" of type integer does not support null values");
        }
        if (!linkedHashMap.containsKey("lessonPath")) {
            lessonPath = null;
        } else {
            if (!Parcelable.class.isAssignableFrom(LessonPath.class) && !Serializable.class.isAssignableFrom(LessonPath.class)) {
                throw new UnsupportedOperationException(LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            lessonPath = (LessonPath) c1024c0.m3929b("lessonPath");
        }
        this.f23927J = new C9730e(num.intValue(), lessonPath);
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(bool);
        this.f23928K = stateFlowImplM14379a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool);
        this.f23929L = stateFlowImplM14379a2;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(bool);
        this.f23930M = stateFlowImplM14379a3;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(bool);
        this.f23931N = stateFlowImplM14379a4;
        this.f23932O = C7120g.m14379a(1);
        this.f23933P = C4924a.m10448a();
        this.f23934Q = C7120g.m14379a(bool);
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(bool);
        this.f23935R = stateFlowImplM14379a5;
        StateFlowImpl stateFlowImplM14379a6 = C7120g.m14379a(null);
        this.f23936S = stateFlowImplM14379a6;
        this.f23937T = C7120g.m14379a(bool);
        StateFlowImpl stateFlowImplM14379a7 = C7120g.m14379a(null);
        this.f23938U = stateFlowImplM14379a7;
        final InterfaceC7116c[] interfaceC7116cArr = {new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a7), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a6), stateFlowImplM14379a, stateFlowImplM14379a2, stateFlowImplM14379a3, stateFlowImplM14379a4, stateFlowImplM14379a5};
        InterfaceC7116c<CollectionsAdapter.C3741c> interfaceC7116c = new InterfaceC7116c<CollectionsAdapter.C3741c>() { // from class: com.lingq.ui.home.course.CourseViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$special$$inlined$combine$1$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$special$$inlined$combine$1$3", m19206f = "CourseViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C36833 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super CollectionsAdapter.C3741c>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f24114e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f24115f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f24116g;

                public C36833(InterfaceC9968c interfaceC9968c) {
                    super(3, interfaceC9968c);
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super CollectionsAdapter.C3741c> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C36833 c36833 = new C36833(interfaceC9968c);
                    c36833.f24115f = interfaceC7117d;
                    c36833.f24116g = objArr;
                    return c36833.mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f24114e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d = this.f24115f;
                        Object[] objArr = this.f24116g;
                        Object obj2 = objArr[0];
                        C5207g.m11109d(obj2, "null cannot be cast to non-null type com.lingq.shared.uimodel.library.LibraryItem");
                        C6332a c6332a = (C6332a) obj2;
                        Object obj3 = objArr[1];
                        C5207g.m11109d(obj3, "null cannot be cast to non-null type com.lingq.shared.uimodel.library.LibraryItemCounter");
                        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) obj3;
                        Object obj4 = objArr[2];
                        C5207g.m11109d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        Object obj5 = objArr[3];
                        C5207g.m11109d(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                        Object obj6 = objArr[4];
                        C5207g.m11109d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
                        Object obj7 = objArr[5];
                        C5207g.m11109d(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue4 = ((Boolean) obj7).booleanValue();
                        Object obj8 = objArr[6];
                        C5207g.m11109d(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                        CollectionsAdapter.C3741c c3741c = new CollectionsAdapter.C3741c(c6332a, libraryItemCounter, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, ((Boolean) obj8).booleanValue());
                        this.f24114e = 1;
                        if (interfaceC7117d.mo1339r(c3741c, this) == coroutineSingletons) {
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

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super CollectionsAdapter.C3741c> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.home.course.CourseViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr2.length];
                    }
                }, new C36833(null), interfaceC7117d, interfaceC7116cArr2);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        };
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(interfaceC7116c, new CourseViewModel$_courseHeaderItem$1(null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C7135p c7135pM353h2 = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        C7135p c7135pM353h3 = C0062b.m353h2(C0062b.m399t2(interfaceC7116c, new CourseViewModel$_courseInfoItem$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        StateFlowImpl stateFlowImplM14379a8 = C7120g.m14379a(Sort.Position);
        this.f23939V = stateFlowImplM14379a8;
        C7135p c7135pM353h4 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a8, new CourseViewModel$_courseFilterItem$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        EmptyList emptyList = EmptyList.f38032a;
        final StateFlowImpl stateFlowImplM14379a9 = C7120g.m14379a(emptyList);
        this.f23940W = stateFlowImplM14379a9;
        this.f23941X = C7120g.m14379a(bool);
        this.f23942Y = C7120g.m14379a(bool);
        StateFlowImpl stateFlowImplM14379a10 = C7120g.m14379a(emptyList);
        this.f23943Z = stateFlowImplM14379a10;
        StateFlowImpl stateFlowImplM14379a11 = C7120g.m14379a(emptyList);
        this.f23944a0 = stateFlowImplM14379a11;
        StateFlowImpl stateFlowImplM14379a12 = C7120g.m14379a(emptyList);
        this.f23945b0 = stateFlowImplM14379a12;
        C7135p c7135pM353h5 = C0062b.m353h2(C0062b.m393s0(stateFlowImplM14379a12, new InterfaceC7116c<List<? extends LibraryItemCounter>>() { // from class: com.lingq.ui.home.course.CourseViewModel$special$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$special$$inlined$filterNot$1$2 */
            public static final class C36862<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f24125a;

                /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$special$$inlined$filterNot$1$2", m19206f = "CourseViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f24126d;

                    /* JADX INFO: renamed from: e */
                    public int f24127e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f24126d = obj;
                        this.f24127e |= Integer.MIN_VALUE;
                        return C36862.this.mo1339r(null, this);
                    }
                }

                public C36862(InterfaceC7117d interfaceC7117d) {
                    this.f24125a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f24127e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f24127e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f24126d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f24127e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!((List) obj).isEmpty()) {
                            anonymousClass1.f24127e = 1;
                            if (this.f24125a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super List<? extends LibraryItemCounter>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a9.mo9539a(new C36862(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, stateFlowImplM14379a10, stateFlowImplM14379a11, new CourseViewModel$_lessonsItems$2(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a13 = C7120g.m14379a(status);
        this.f23946c0 = stateFlowImplM14379a13;
        C7135p c7135pM353h6 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a13, new CourseViewModel$_loadingLessonsItems$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a14 = C7120g.m14379a(status);
        this.f23948d0 = stateFlowImplM14379a14;
        C7135p c7135pM353h7 = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a14, new CourseViewModel$_loadingCourseItem$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f23950e0 = c7138sM10448a;
        this.f23952f0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f23954g0 = c7138sM10448a2;
        this.f23956h0 = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f23958i0 = C0062b.m353h2(new C7136q(new CourseViewModel$special$$inlined$combineTransform$1(new InterfaceC7116c[]{c7135pM353h7, c7135pM353h6, c7135pM353h2, c7135pM353h3, c7135pM353h5, c7135pM353h4}, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f23960j0 = c7138sM10448a3;
        this.f23962k0 = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f23964l0 = c7138sM10448a4;
        this.f23965m0 = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f23966n0 = c7138sM10448a5;
        this.f23967o0 = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a6 = C4924a.m10448a();
        this.f23968p0 = c7138sM10448a6;
        this.f23969q0 = C0062b.m341d2(c7138sM10448a6, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a7 = C4924a.m10448a();
        this.f23970r0 = c7138sM10448a7;
        this.f23971s0 = C0062b.m341d2(c7138sM10448a7, C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f23972t0 = C0062b.m353h2(new C7131l(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a7), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a6), new CourseViewModel$isPremiumCourse$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        m9893o2();
        m9891m2();
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36651(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36662(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C36673(null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m9890l2(CourseViewModel courseViewModel) {
        courseViewModel.getClass();
        C7499b.m14933c0(C8573r0.m16767w0(courseViewModel), courseViewModel.f23957i, courseViewModel.f23955h, C0166e.m761g("getCourseWithLessons ", courseViewModel.f23927J.f49749a), new CourseViewModel$getCourseWithLessons$1(courseViewModel, null));
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: A0 */
    public final void mo9391A0(int i10) {
        this.f23959j.mo9391A0(i10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f23961k.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23961k.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f23961k.mo498E1();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: G */
    public final InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> mo9396G() {
        return this.f23963l.mo9396G();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f23925H.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f23925H.mo9723I(tooltipStep);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: I1 */
    public final InterfaceC7133n<AbstractC4267a> mo9398I1() {
        return this.f23963l.mo9398I1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23961k.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC7133n<C3296a> mo9399J0() {
        return this.f23963l.mo9399J0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f23925H.mo9724L();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: L1 */
    public final void mo9401L1(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        this.f23963l.mo9401L1(list);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: O0 */
    public final void mo9403O0(String str, int i10, double d10) {
        C5207g.m11111f(str, "language");
        this.f23963l.mo9403O0(str, i10, d10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f23961k.mo500P();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: S1 */
    public final Object mo9405S1(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23959j.mo9405S1(downloadItem, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f23925H.mo9727T0();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: W */
    public final Object mo9830W(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23926I.mo9830W(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X0 */
    public final void mo9406X0(DownloadItem downloadItem, boolean z10) {
        this.f23959j.mo9406X0(downloadItem, z10);
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: X1 */
    public final Object mo9407X1(String str, List<Pair<String, Integer>> list, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23959j.mo9407X1(str, list, i10, false, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f23925H.mo9729Y1();
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: a0 */
    public final void mo9831a0(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f23926I.mo9831a0(str, i10, str2, str3);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f23925H.mo9730a1();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: a2 */
    public final InterfaceC7137r<AbstractC3312a<DownloadItem>> mo9409a2() {
        return this.f23959j.mo9409a2();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f23925H.mo9731b0(z10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23961k.mo501d(str, interfaceC9968c);
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: f */
    public final Object mo9832f(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23926I.mo9832f(str, i10, str2, str3, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f23961k;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23961k.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f23925H.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f23925H.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f23925H.mo9735h();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: i1 */
    public final void mo9412i1(ArrayList arrayList, String str) {
        C5207g.m11111f(str, "language");
        this.f23959j.mo9412i1(arrayList, str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f23925H.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f23961k.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f23925H.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f23925H.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23961k.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f23961k.mo506l1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9891m2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f23957i, this.f23955h, C0166e.m761g("fetchCourse ", this.f23927J.f49749a), new CourseViewModel$fetchCourse$1(this, null));
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: n */
    public final void mo9834n(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        this.f23926I.mo9834n(str, i10, str2, str3);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m9892n2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f23957i, this.f23955h, "fetchCourseWithLessons " + this.f23927J.f49749a + " " + this.f23939V.getValue(), new CourseViewModel$fetchCourseWithLessons$1(this, null));
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9893o2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f23957i, this.f23955h, C0166e.m761g("getCourse ", this.f23927J.f49749a), new CourseViewModel$getCourse$1(this, null));
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f23925H.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f23961k.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final boolean m9894p2() {
        return ((Boolean) this.f23934Q.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: q2 */
    public final boolean m9895q2(C6332a c6332a, LibraryItemCounter libraryItemCounter) {
        C5207g.m11111f(c6332a, "lesson");
        return (libraryItemCounter != null && !libraryItemCounter.f22009f) && c6332a.f36594U > 0;
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f23925H.mo9743r0();
    }

    /* JADX INFO: renamed from: r2 */
    public final void m9896r2(AbstractC3689c abstractC3689c) {
        if (abstractC3689c.mo9903a()) {
            m9898t2();
        } else {
            this.f23950e0.mo14371k(abstractC3689c);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final void m9897s2(AbstractC3688b abstractC3688b) {
        if (!abstractC3688b.mo9902b()) {
            this.f23954g0.mo14371k(abstractC3688b);
            return;
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new CourseViewModel$showBuyPremiumLesson$1(this, abstractC3688b.mo9901a().f36594U, abstractC3688b.mo9901a().f36595a, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f23961k.mo508t1();
    }

    /* JADX INFO: renamed from: t2 */
    public final void m9898t2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new CourseViewModel$showBuyPremiumCourse$1(this, null), 3);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f23925H.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f23925H.mo9745u0(z10);
    }

    /* JADX INFO: renamed from: u2 */
    public final void m9899u2() {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f23957i, this.f23955h, C0166e.m761g("updateCourseLike ", this.f23927J.f49749a), new CourseViewModel$updateCourseLike$1(this, null));
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f23925H.mo9746v1(tooltipStep);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m9900v2(int i10) {
        C7499b.m14933c0(C8573r0.m16767w0(this), this.f23957i, this.f23955h, C0166e.m761g("updateLike ", i10), new CourseViewModel$updateLike$1(this, i10, null));
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f23961k.mo509w0();
    }

    @Override // p416uh.InterfaceC9527a
    /* JADX INFO: renamed from: x0 */
    public final Object mo9422x0(DownloadItem downloadItem, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f23959j.mo9422x0(downloadItem, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y */
    public final InterfaceC7133n<C3297b> mo9423y() {
        return this.f23963l.mo9423y();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC7133n<C3300e> mo9424y0() {
        return this.f23963l.mo9424y0();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> mo9425z0() {
        return this.f23963l.mo9425z0();
    }
}
