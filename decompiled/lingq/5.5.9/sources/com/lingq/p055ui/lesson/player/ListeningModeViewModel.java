package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import android.graphics.Rect;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.AbstractC4267a;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.player.C3296a;
import com.lingq.player.C3297b;
import com.lingq.player.C3300e;
import com.lingq.player.InterfaceC3301f;
import com.lingq.player.PlayerContentController;
import com.lingq.player.PlayerController;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import ki.C6695a;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p183ik.C6343f;
import p225kk.C6715l;
import p244lh.InterfaceC7364a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.AbstractC9006b;
import sh.InterfaceC9010f;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/lesson/player/ListeningModeViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lcom/lingq/player/f;", "Lsh/f;", "Lcom/lingq/ui/tooltips/b;", "Llh/a;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ListeningModeViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC3301f, InterfaceC9010f, InterfaceC4912b, InterfaceC7364a {

    /* JADX INFO: renamed from: H */
    public C7848l1 f28792H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f28793I;

    /* JADX INFO: renamed from: J */
    public final C7135p f28794J;

    /* JADX INFO: renamed from: K */
    public final C7138s f28795K;

    /* JADX INFO: renamed from: L */
    public final C7138s f28796L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f28797M;

    /* JADX INFO: renamed from: N */
    public final C7138s f28798N;

    /* JADX INFO: renamed from: O */
    public final C7134o f28799O;

    /* JADX INFO: renamed from: P */
    public final C7134o f28800P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f28801Q;

    /* JADX INFO: renamed from: R */
    public final StateFlowImpl f28802R;

    /* JADX INFO: renamed from: S */
    public final C7135p f28803S;

    /* JADX INFO: renamed from: T */
    public final StateFlowImpl f28804T;

    /* JADX INFO: renamed from: U */
    public final C7135p f28805U;

    /* JADX INFO: renamed from: V */
    public final C7134o f28806V;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f28807d;

    /* JADX INFO: renamed from: e */
    public final PlayerController f28808e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5182d f28809f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC0113j f28810g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC3301f f28811h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC9010f f28812i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC4912b f28813j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC7364a f28814k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f28815l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$1", m19206f = "ListeningModeViewModel.kt", m19207l = {169}, m19208m = "invokeSuspend")
    final class C44001 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28816e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$1$1", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ int f28818e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ListeningModeViewModel f28819f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28819f = listeningModeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28819f, interfaceC9968c);
                anonymousClass1.f28818e = ((Number) obj).intValue();
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
                int i10 = this.f28818e;
                ListeningModeViewModel listeningModeViewModel = this.f28819f;
                C4924a.m10450b(listeningModeViewModel.f28792H);
                listeningModeViewModel.f28792H = C7828f.m15570d(C8573r0.m16767w0(listeningModeViewModel), null, null, new ListeningModeViewModel$updateLesson$1(listeningModeViewModel, i10, null), 3);
                return C9072e.f47360a;
            }
        }

        public C44001(InterfaceC9968c<? super C44001> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ListeningModeViewModel.this.new C44001(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44001) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28816e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ListeningModeViewModel listeningModeViewModel = ListeningModeViewModel.this;
                StateFlowImpl stateFlowImpl = listeningModeViewModel.f28815l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(listeningModeViewModel, null);
                this.f28816e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$2", m19206f = "ListeningModeViewModel.kt", m19207l = {175}, m19208m = "invokeSuspend")
    final class C44012 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28820e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsh/b;", "action", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$2$1", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<AbstractC9006b, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f28822e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ListeningModeViewModel f28823f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28823f = listeningModeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28823f, interfaceC9968c);
                anonymousClass1.f28822e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(AbstractC9006b abstractC9006b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(abstractC9006b, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                AbstractC9006b abstractC9006b = (AbstractC9006b) this.f28822e;
                if (!C5207g.m11106a(abstractC9006b, AbstractC9006b.e.f47220a) && !C5207g.m11106a(abstractC9006b, AbstractC9006b.b.f47217a)) {
                    boolean zM11106a = C5207g.m11106a(abstractC9006b, AbstractC9006b.h.f47223a);
                    ListeningModeViewModel listeningModeViewModel = this.f28823f;
                    if (zM11106a) {
                        if (listeningModeViewModel.f28808e.isPlaying()) {
                            listeningModeViewModel.f28808e.pause();
                        } else {
                            listeningModeViewModel.f28808e.start();
                        }
                    } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.a.f47216a)) {
                        listeningModeViewModel.f28808e.m9410d0(-5000);
                    } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.c.f47218a)) {
                        listeningModeViewModel.f28808e.m9410d0(5000);
                    } else {
                        boolean z10 = true;
                        if (abstractC9006b instanceof AbstractC9006b.l) {
                            double d10 = ((AbstractC9006b.l) abstractC9006b).f47227a;
                            if (d10 != -1.0d) {
                                z10 = false;
                            }
                            if (!z10) {
                                listeningModeViewModel.f28808e.seekTo((int) (d10 * 1000.0d));
                            }
                        } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.f.f47221a)) {
                            listeningModeViewModel.f28808e.pause();
                        } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.g.f47222a)) {
                            listeningModeViewModel.f28808e.start();
                        } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.d.f47219a)) {
                            listeningModeViewModel.f28808e.m9392B0();
                        } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.i.f47224a)) {
                            listeningModeViewModel.f28808e.m9418u0();
                        } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.j.f47225a)) {
                            listeningModeViewModel.f28808e.m9393C0();
                        } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.k.f47226a)) {
                            PlayerController playerController = listeningModeViewModel.f28808e;
                            if (playerController.f17621M) {
                                z10 = false;
                            } else {
                                playerController.f17632e.m15505b(null, "audio_repeat");
                            }
                            playerController.f17621M = z10;
                            playerController.m9416r0();
                        } else if (C5207g.m11106a(abstractC9006b, AbstractC9006b.m.f47228a)) {
                            listeningModeViewModel.f28808e.m9420w0();
                        }
                    }
                }
                return C9072e.f47360a;
            }
        }

        public C44012(InterfaceC9968c<? super C44012> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ListeningModeViewModel.this.new C44012(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44012) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28820e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ListeningModeViewModel listeningModeViewModel = ListeningModeViewModel.this;
                C7138s c7138s = listeningModeViewModel.f28798N;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(listeningModeViewModel, null);
                this.f28820e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$3", m19206f = "ListeningModeViewModel.kt", m19207l = {237}, m19208m = "invokeSuspend")
    final class C44023 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28824e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "Lcom/lingq/player/PlayerContentController$PlayerContentItem;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$3$1", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f28826e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ListeningModeViewModel f28827f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28827f = listeningModeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28827f, interfaceC9968c);
                anonymousClass1.f28826e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Triple<? extends PlayerContentController.PlayerContentItem, ? extends Boolean, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                Triple triple = (Triple) this.f28826e;
                PlayerContentController.PlayerContentItem playerContentItem = (PlayerContentController.PlayerContentItem) triple.f38021a;
                ((Boolean) triple.f38022b).booleanValue();
                ((Number) triple.f38023c).intValue();
                if (playerContentItem != null) {
                    this.f28827f.f28815l.setValue(new Integer(playerContentItem.f17600a));
                }
                return C9072e.f47360a;
            }
        }

        public C44023(InterfaceC9968c<? super C44023> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ListeningModeViewModel.this.new C44023(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44023) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28824e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ListeningModeViewModel listeningModeViewModel = ListeningModeViewModel.this;
                InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> interfaceC7133nMo9425z0 = listeningModeViewModel.mo9425z0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(listeningModeViewModel, null);
                this.f28824e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$4", m19206f = "ListeningModeViewModel.kt", m19207l = {245}, m19208m = "invokeSuspend")
    final class C44034 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28828e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lki/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$4$1", m19206f = "ListeningModeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<C6695a, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ ListeningModeViewModel f28830e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ListeningModeViewModel listeningModeViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28830e = listeningModeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f28830e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C6695a c6695a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(c6695a, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                ListeningModeViewModel listeningModeViewModel = this.f28830e;
                listeningModeViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(listeningModeViewModel), null, null, new ListeningModeViewModel$setupForVideoStart$1(listeningModeViewModel, null), 3);
                return C9072e.f47360a;
            }
        }

        public C44034(InterfaceC9968c<? super C44034> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return ListeningModeViewModel.this.new C44034(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44034) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28828e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ListeningModeViewModel listeningModeViewModel = ListeningModeViewModel.this;
                StateFlowImpl stateFlowImpl = listeningModeViewModel.f28793I;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(listeningModeViewModel, null);
                this.f28828e = 1;
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

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public ListeningModeViewModel(InterfaceC3324a interfaceC3324a, PlayerController playerController, InterfaceC5182d interfaceC5182d, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, InterfaceC3301f interfaceC3301f, InterfaceC9010f interfaceC9010f, InterfaceC7364a interfaceC7364a, InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        Boolean bool;
        Boolean bool2;
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(playerController, "playerController");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC3301f, "playerViewModelDelegate");
        C5207g.m11111f(interfaceC9010f, "playerSentenceModeViewModelDelegate");
        C5207g.m11111f(interfaceC7364a, "appUsageController");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f28807d = interfaceC3324a;
        this.f28808e = playerController;
        this.f28809f = interfaceC5182d;
        this.f28810g = interfaceC0113j;
        this.f28811h = interfaceC3301f;
        this.f28812i = interfaceC9010f;
        this.f28813j = interfaceC4912b;
        this.f28814k = interfaceC7364a;
        LinkedHashMap linkedHashMap = c1024c0.f6616a;
        if (!linkedHashMap.containsKey("lessonId")) {
            throw new IllegalArgumentException("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
        }
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        if (num == null) {
            throw new IllegalArgumentException("Argument \"lessonId\" of type integer does not support null values");
        }
        if (linkedHashMap.containsKey("fromLesson")) {
            bool = (Boolean) c1024c0.m3929b("fromLesson");
            if (bool == null) {
                throw new IllegalArgumentException("Argument \"fromLesson\" of type boolean does not support null values");
            }
        } else {
            bool = Boolean.TRUE;
        }
        if (linkedHashMap.containsKey("video")) {
            bool2 = (Boolean) c1024c0.m3929b("video");
            if (bool2 == null) {
                throw new IllegalArgumentException("Argument \"video\" of type boolean does not support null values");
            }
        } else {
            bool2 = Boolean.FALSE;
        }
        int iIntValue = num.intValue();
        bool.booleanValue();
        bool2.booleanValue();
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(Integer.valueOf(iIntValue));
        this.f28815l = stateFlowImplM14379a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(null);
        this.f28793I = stateFlowImplM14379a2;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f28794J = C0062b.m353h2(stateFlowImplM14379a2, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        final C7138s c7138sM10448a = C4924a.m10448a();
        this.f28795K = c7138sM10448a;
        final C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f28796L = c7138sM10448a2;
        Boolean bool3 = Boolean.FALSE;
        final StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(bool3);
        this.f28797M = stateFlowImplM14379a3;
        this.f28798N = C4924a.m10448a();
        this.f28799O = C0062b.m341d2(C0062b.m389r0(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a2), new InterfaceC7116c<Double>() { // from class: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$1$2 */
            public static final class C44062<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f28854a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$1$2", m19206f = "ListeningModeViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f28855d;

                    /* JADX INFO: renamed from: e */
                    public int f28856e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f28855d = obj;
                        this.f28856e |= Integer.MIN_VALUE;
                        return C44062.this.mo1339r(null, this);
                    }
                }

                public C44062(InterfaceC7117d interfaceC7117d) {
                    this.f28854a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f28856e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f28856e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f28855d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f28856e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!(((Number) obj).doubleValue() == -1.0d)) {
                            anonymousClass1.f28856e = 1;
                            if (this.f28854a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Double> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7138sM10448a2.mo9539a(new C44062(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new InterfaceC7116c<Boolean>() { // from class: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$2

            /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$2$2 */
            public static final class C44072<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f28859a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$2$2", m19206f = "ListeningModeViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f28860d;

                    /* JADX INFO: renamed from: e */
                    public int f28861e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f28860d = obj;
                        this.f28861e |= Integer.MIN_VALUE;
                        return C44072.this.mo1339r(null, this);
                    }
                }

                public C44072(InterfaceC7117d interfaceC7117d) {
                    this.f28859a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f28861e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f28861e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f28860d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f28861e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!(!((Boolean) obj).booleanValue())) {
                            anonymousClass1.f28861e = 1;
                            if (this.f28859a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a3.mo9539a(new C44072(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new ListeningModeViewModel$startProgressForVideo$3(null)), C8573r0.m16767w0(this), startedWhileSubscribed);
        this.f28800P = C0062b.m341d2(C0062b.m389r0(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(stateFlowImplM14379a2), new InterfaceC7116c<Double>() { // from class: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$3

            /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$3$2 */
            public static final class C44082<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f28864a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$3$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$3$2", m19206f = "ListeningModeViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f28865d;

                    /* JADX INFO: renamed from: e */
                    public int f28866e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f28865d = obj;
                        this.f28866e |= Integer.MIN_VALUE;
                        return C44082.this.mo1339r(null, this);
                    }
                }

                public C44082(InterfaceC7117d interfaceC7117d) {
                    this.f28864a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f28866e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f28866e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f28865d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f28866e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!(((Number) obj).doubleValue() == -1.0d)) {
                            anonymousClass1.f28866e = 1;
                            if (this.f28864a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Double> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7138sM10448a.mo9539a(new C44082(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new InterfaceC7116c<Boolean>() { // from class: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$4

            /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$4$2 */
            public static final class C44092<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f28869a;

                /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$4$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$special$$inlined$filterNot$4$2", m19206f = "ListeningModeViewModel.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f28870d;

                    /* JADX INFO: renamed from: e */
                    public int f28871e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f28870d = obj;
                        this.f28871e |= Integer.MIN_VALUE;
                        return C44092.this.mo1339r(null, this);
                    }
                }

                public C44092(InterfaceC7117d interfaceC7117d) {
                    this.f28869a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f28871e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f28871e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f28870d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f28871e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        if (!(!((Boolean) obj).booleanValue())) {
                            anonymousClass1.f28871e = 1;
                            if (this.f28869a.mo1339r(obj, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = stateFlowImplM14379a3.mo9539a(new C44092(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, new ListeningModeViewModel$progressForVideo$3(null)), C8573r0.m16767w0(this), startedWhileSubscribed);
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(stateFlowImplM14379a, new ListeningModeViewModel$_sentencesTranslations$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        EmptyList emptyList = EmptyList.f38032a;
        C7135p c7135pM353h2 = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w1, startedWhileSubscribed, emptyList);
        this.f28801Q = c7135pM353h2;
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(bool3);
        this.f28802R = stateFlowImplM14379a4;
        this.f28803S = C0062b.m353h2(stateFlowImplM14379a4, C8573r0.m16767w0(this), startedWhileSubscribed, bool3);
        StateFlowImpl stateFlowImplM14379a5 = C7120g.m14379a(0L);
        this.f28804T = stateFlowImplM14379a5;
        this.f28805U = C0062b.m353h2(new C7131l(c7135pM353h2, stateFlowImplM14379a5, new ListeningModeViewModel$adapterItems$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f28806V = C0062b.m303R(C0062b.m372n(0, 1, BufferOverflow.DROP_OLDEST, 1));
        stateFlowImplM14379a5.setValue(0L);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44001(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44012(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44023(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44034(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX INFO: renamed from: l2 */
    public static final boolean m10212l2(ListeningModeViewModel listeningModeViewModel, long j10, double d10, boolean z10, double d11) {
        listeningModeViewModel.getClass();
        double d12 = 1000;
        boolean z11 = false;
        if (j10 >= d10 * d12) {
            if (j10 < ((long) (d12 * d11))) {
                z11 = true;
            } else if (!z10) {
                if (d11 == d10) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f28810g.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28810g.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f28810g.mo498E1();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: G */
    public final InterfaceC7142w<List<PlayerContentController.PlayerContentItem>> mo9396G() {
        return this.f28811h.mo9396G();
    }

    @Override // sh.InterfaceC9010f
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC7116c<Integer> mo10140G0() {
        return this.f28812i.mo10140G0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f28813j.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f28813j.mo9723I(tooltipStep);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: I1 */
    public final InterfaceC7133n<AbstractC4267a> mo9398I1() {
        return this.f28811h.mo9398I1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28810g.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC7133n<C3296a> mo9399J0() {
        return this.f28811h.mo9399J0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f28813j.mo9724L();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: L1 */
    public final void mo9401L1(List<PlayerContentController.PlayerContentItem> list) {
        C5207g.m11111f(list, "tracks");
        this.f28811h.mo9401L1(list);
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: N */
    public final void mo9402N(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f28814k.mo9402N(appUsageType);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: O0 */
    public final void mo9403O0(String str, int i10, double d10) {
        C5207g.m11111f(str, "language");
        this.f28811h.mo9403O0(str, i10, d10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f28810g.mo500P();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f28813j.mo9727T0();
    }

    @Override // sh.InterfaceC9010f
    /* JADX INFO: renamed from: U0 */
    public final Object mo10142U0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28812i.mo10142U0(i10, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f28813j.mo9729Y1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f28813j.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f28813j.mo9731b0(z10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28810g.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f28810g;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28810g.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f28813j.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f28813j.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f28813j.mo9735h();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f28813j.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f28810g.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f28813j.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f28813j.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28810g.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f28810g.mo506l1();
    }

    /* JADX INFO: renamed from: m2 */
    public final void m10213m2(AbstractC9006b abstractC9006b) {
        C5207g.m11111f(abstractC9006b, "action");
        this.f28798N.mo14371k(abstractC9006b);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f28813j.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f28810g.mo507p1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f28813j.mo9743r0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f28810g.mo508t1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f28813j.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f28813j.mo9745u0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f28813j.mo9746v1(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f28810g.mo509w0();
    }

    @Override // p244lh.InterfaceC7364a
    /* JADX INFO: renamed from: x */
    public final void mo9421x(AppUsageType appUsageType) {
        C5207g.m11111f(appUsageType, "appUsageType");
        this.f28814k.mo9421x(appUsageType);
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y */
    public final InterfaceC7133n<C3297b> mo9423y() {
        return this.f28811h.mo9423y();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC7133n<C3300e> mo9424y0() {
        return this.f28811h.mo9424y0();
    }

    @Override // com.lingq.player.InterfaceC3301f
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC7133n<Triple<PlayerContentController.PlayerContentItem, Boolean, Integer>> mo9425z0() {
        return this.f28811h.mo9425z0();
    }
}
