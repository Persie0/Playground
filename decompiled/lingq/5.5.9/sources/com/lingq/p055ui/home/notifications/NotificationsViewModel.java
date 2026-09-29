package com.lingq.p055ui.home.notifications;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import ci.InterfaceC2018k;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p014aj.C0101r;
import p014aj.InterfaceC0100q;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p225kk.C6715l;
import p244lh.InterfaceC7368e;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/home/notifications/NotificationsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Laj/q;", "Llh/e;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class NotificationsViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC0100q, InterfaceC7368e {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f25354H;

    /* JADX INFO: renamed from: I */
    public final C7135p f25355I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f25356J;

    /* JADX INFO: renamed from: K */
    public final C7135p f25357K;

    /* JADX INFO: renamed from: L */
    public final StateFlowImpl f25358L;

    /* JADX INFO: renamed from: M */
    public final C7138s f25359M;

    /* JADX INFO: renamed from: N */
    public final StateFlowImpl f25360N;

    /* JADX INFO: renamed from: O */
    public final C7135p f25361O;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2018k f25362d;

    /* JADX INFO: renamed from: e */
    public final CoroutineJobManager f25363e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5182d f25364f;

    /* JADX INFO: renamed from: g */
    public final CoroutineDispatcher f25365g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC7368e f25366h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0113j f25367i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC0100q f25368j;

    /* JADX INFO: renamed from: k */
    public final C7138s f25369k;

    /* JADX INFO: renamed from: l */
    public final C7134o f25370l;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$1", m19206f = "NotificationsViewModel.kt", m19207l = {58}, m19208m = "invokeSuspend")
    final class C38811 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25371e;

        /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$1$1", m19206f = "NotificationsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ NotificationsViewModel f25373e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationsViewModel notificationsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25373e = notificationsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25373e, interfaceC9968c);
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
                NotificationsViewModel notificationsViewModel = this.f25373e;
                notificationsViewModel.f25360N.setValue(EmptyList.f38032a);
                notificationsViewModel.m9970l2();
                return C9072e.f47360a;
            }
        }

        public C38811(InterfaceC9968c<? super C38811> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return NotificationsViewModel.this.new C38811(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38811) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25371e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                NotificationsViewModel notificationsViewModel = NotificationsViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = notificationsViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(notificationsViewModel, null);
                this.f25371e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$2", m19206f = "NotificationsViewModel.kt", m19207l = {65}, m19208m = "invokeSuspend")
    final class C38822 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25374e;

        /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$2$1", m19206f = "NotificationsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ NotificationsViewModel f25376e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationsViewModel notificationsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25376e = notificationsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25376e, interfaceC9968c);
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
                StateFlowImpl stateFlowImpl = this.f25376e.f25358L;
                stateFlowImpl.setValue(new Integer(((Number) stateFlowImpl.getValue()).intValue() + 1));
                return C9072e.f47360a;
            }
        }

        public C38822(InterfaceC9968c<? super C38822> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return NotificationsViewModel.this.new C38822(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38822) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25374e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                NotificationsViewModel notificationsViewModel = NotificationsViewModel.this;
                C7138s c7138s = notificationsViewModel.f25359M;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(notificationsViewModel, null);
                this.f25374e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$3", m19206f = "NotificationsViewModel.kt", m19207l = {71}, m19208m = "invokeSuspend")
    final class C38833 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f25377e;

        /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsViewModel$3$1", m19206f = "NotificationsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ NotificationsViewModel f25379e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NotificationsViewModel notificationsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f25379e = notificationsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f25379e, interfaceC9968c);
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
                this.f25379e.m9970l2();
                return C9072e.f47360a;
            }
        }

        public C38833(InterfaceC9968c<? super C38833> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return NotificationsViewModel.this.new C38833(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38833) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f25377e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                NotificationsViewModel notificationsViewModel = NotificationsViewModel.this;
                StateFlowImpl stateFlowImpl = notificationsViewModel.f25358L;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(notificationsViewModel, null);
                this.f25377e = 1;
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

    public NotificationsViewModel(InterfaceC2018k interfaceC2018k, CoroutineJobManager coroutineJobManager, InterfaceC5182d interfaceC5182d, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C0101r c0101r, InterfaceC7368e interfaceC7368e) {
        C5207g.m11111f(interfaceC2018k, "notificationRepository");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC7368e, "notificationsController");
        this.f25362d = interfaceC2018k;
        this.f25363e = coroutineJobManager;
        this.f25364f = interfaceC5182d;
        this.f25365g = executorC7177a;
        this.f25366h = interfaceC7368e;
        this.f25367i = interfaceC0113j;
        this.f25368j = c0101r;
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f25369k = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f25370l = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(bool);
        this.f25354H = stateFlowImplM14379a;
        this.f25355I = C0062b.m306S(stateFlowImplM14379a);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool);
        this.f25356J = stateFlowImplM14379a2;
        this.f25357K = C0062b.m306S(stateFlowImplM14379a2);
        this.f25358L = C7120g.m14379a(1);
        this.f25359M = C4924a.m10448a();
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(emptyList);
        this.f25360N = stateFlowImplM14379a3;
        this.f25361O = C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C38811(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C38822(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C38833(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f25367i.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25367i.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: C1 */
    public final InterfaceC7142w<Integer> mo9327C1() {
        return this.f25366h.mo9327C1();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: D0 */
    public final Object mo9328D0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25366h.mo9328D0(i10, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f25367i.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25367i.mo499J(profile, interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: O */
    public final Object mo9329O(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25366h.mo9329O(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f25367i.mo500P();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: Q0 */
    public final Object mo9330Q0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25366h.mo9330Q0(interfaceC9968c);
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: c0 */
    public final void mo487c0() {
        this.f25368j.mo487c0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25367i.mo501d(str, interfaceC9968c);
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: d0 */
    public final InterfaceC7137r<Boolean> mo488d0() {
        return this.f25368j.mo488d0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f25367i;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25367i.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f25367i.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f25367i.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f25367i.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m9970l2() {
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StateFlowImpl stateFlowImpl = this.f25358L;
        String str = "notifications " + stateFlowImpl.getValue();
        NotificationsViewModel$observableNotifications$1 notificationsViewModel$observableNotifications$1 = new NotificationsViewModel$observableNotifications$1(this, null);
        CoroutineJobManager coroutineJobManager = this.f25363e;
        CoroutineDispatcher coroutineDispatcher = this.f25365g;
        C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, str, notificationsViewModel$observableNotifications$1);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, coroutineDispatcher, "networkGetNotifications " + stateFlowImpl.getValue(), new NotificationsViewModel$networkGetNotifications$1(this, null));
    }

    @Override // p014aj.InterfaceC0100q
    /* JADX INFO: renamed from: m1 */
    public final InterfaceC7137r<String> mo489m1() {
        return this.f25368j.mo489m1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9971m2(List<Integer> list, boolean z10) {
        C5207g.m11111f(list, "notificationIds");
        C7828f.m15570d(C8573r0.m16767w0(this), this.f25365g, null, new NotificationsViewModel$updateNotifications$1(z10, this, list, null), 2);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f25367i.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f25367i.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f25367i.mo509w0();
    }
}
