package com.lingq.p055ui.home;

import ae.C0062b;
import android.graphics.Rect;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2011d;
import ci.InterfaceC2012e;
import ci.InterfaceC2014g;
import ci.InterfaceC2015h;
import ci.InterfaceC2019l;
import ci.InterfaceC2020m;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.AbstractC3274b;
import com.lingq.commons.controllers.InterfaceC3273a;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.player.PlayerController;
import com.lingq.player.PlayingFrom;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import com.lingq.shared.util.LessonPath;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7793a;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5182d;
import p183ik.C6343f;
import p205jk.InterfaceC6515k;
import p225kk.C6715l;
import p244lh.InterfaceC7368e;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sh.C9015k;
import sh.InterfaceC9013i;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\b¨\u0006\t"}, m13365d2 = {"Lcom/lingq/ui/home/HomeViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Lsh/i;", "Ljk/k;", "Llh/e;", "Lcom/lingq/ui/tooltips/b;", "Lcom/lingq/commons/controllers/a;", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class HomeViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC9013i, InterfaceC6515k, InterfaceC7368e, InterfaceC4912b, InterfaceC3273a {

    /* JADX INFO: renamed from: H */
    public final InterfaceC3275c f22732H;

    /* JADX INFO: renamed from: I */
    public final CoroutineDispatcher f22733I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC7882z f22734J;

    /* JADX INFO: renamed from: K */
    public final PlayerController f22735K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC7368e f22736L;

    /* JADX INFO: renamed from: M */
    public final InterfaceC4912b f22737M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC0113j f22738N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC9013i f22739O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC6515k f22740P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ InterfaceC3273a f22741Q;

    /* JADX INFO: renamed from: R */
    public final C7135p f22742R;

    /* JADX INFO: renamed from: S */
    public final AbstractChannel f22743S;

    /* JADX INFO: renamed from: T */
    public final C7114a f22744T;

    /* JADX INFO: renamed from: U */
    public final C7138s f22745U;

    /* JADX INFO: renamed from: V */
    public final C7134o f22746V;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2020m f22747d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2012e f22748e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2015h f22749f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2011d f22750g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2014g f22751h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2019l f22752i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5182d f22753j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5179a f22754k;

    /* JADX INFO: renamed from: l */
    public final LingQDatabase f22755l;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$1", m19206f = "HomeViewModel.kt", m19207l = {117}, m19208m = "invokeSuspend")
    final class C34761 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22756e;

        public C34761(InterfaceC9968c<? super C34761> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return HomeViewModel.this.new C34761(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34761) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22756e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                this.f22756e = 1;
                if (HomeViewModel.this.mo503f1(this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$2", m19206f = "HomeViewModel.kt", m19207l = {121}, m19208m = "invokeSuspend")
    final class C34772 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22758e;

        public C34772(InterfaceC9968c<? super C34772> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return HomeViewModel.this.new C34772(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34772) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22758e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                this.f22758e = 1;
                if (HomeViewModel.this.mo497B0(this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$3", m19206f = "HomeViewModel.kt", m19207l = {125}, m19208m = "invokeSuspend")
    final class C34783 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22760e;

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "language", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$3$1", m19206f = "HomeViewModel.kt", m19207l = {132, 138, 142, 143, 145}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public Object f22762e;

            /* JADX INFO: renamed from: f */
            public UserLanguage f22763f;

            /* JADX INFO: renamed from: g */
            public int f22764g;

            /* JADX INFO: renamed from: h */
            public /* synthetic */ Object f22765h;

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ HomeViewModel f22766i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeViewModel homeViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22766i = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22766i, interfaceC9968c);
                anonymousClass1.f22765h = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:37:0x0115 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:38:0x0116  */
            /* JADX WARN: Code duplicated, block: B:41:0x0124  */
            /* JADX WARN: Code duplicated, block: B:43:0x0138 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:44:0x0139  */
            /* JADX WARN: Code duplicated, block: B:47:0x0164 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:48:0x0165  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                UserLanguage userLanguage;
                HomeViewModel homeViewModel;
                Object objM14360a;
                UserLanguage userLanguage2;
                HomeViewModel homeViewModel2;
                List<String> list;
                UserLanguage userLanguage3;
                Object objM14360a2;
                HomeViewModel homeViewModel3;
                UserLanguage userLanguage4;
                Object objM14360a3;
                HomeViewModel homeViewModel4;
                UserLanguage userLanguage5;
                LinkedHashMap linkedHashMapM13467T0;
                UserLanguage userLanguage6;
                HomeViewModel homeViewModel5;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f22764g;
                int i11 = 0;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    userLanguage = (UserLanguage) this.f22765h;
                    homeViewModel = this.f22766i;
                    homeViewModel.f22735K.m9415p0(false);
                    C7828f.m15570d(C8573r0.m16767w0(homeViewModel), null, null, new HomeViewModel$initiateSettings$1(homeViewModel, null), 3);
                    if (userLanguage != null) {
                        InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i = homeViewModel.f22754k.mo9594i();
                        this.f22765h = userLanguage;
                        this.f22762e = homeViewModel;
                        this.f22763f = userLanguage;
                        this.f22764g = 1;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i, this);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        userLanguage2 = userLanguage;
                    }
                    return C9072e.f47360a;
                }
                if (i10 == 1) {
                    userLanguage = this.f22763f;
                    HomeViewModel homeViewModel6 = (HomeViewModel) this.f22762e;
                    UserLanguage userLanguage7 = (UserLanguage) this.f22765h;
                    C7499b.m14977z0(obj);
                    userLanguage2 = userLanguage7;
                    homeViewModel = homeViewModel6;
                    objM14360a = obj;
                } else {
                    if (i10 == 2) {
                        userLanguage = this.f22763f;
                        homeViewModel2 = (HomeViewModel) this.f22762e;
                        userLanguage3 = (UserLanguage) this.f22765h;
                        C7499b.m14977z0(obj);
                        userLanguage2 = userLanguage3;
                        InterfaceC7116c<Map<String, LessonFont>> interfaceC7116cMo9598m = homeViewModel2.f22754k.mo9598m();
                        this.f22765h = userLanguage2;
                        this.f22762e = homeViewModel2;
                        this.f22763f = userLanguage;
                        this.f22764g = 3;
                        objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9598m, this);
                        if (objM14360a2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        homeViewModel3 = homeViewModel2;
                        userLanguage4 = userLanguage2;
                        if (((Map) objM14360a2).get(homeViewModel3.mo498E1()) == null) {
                            InterfaceC7116c<Map<String, LessonFont>> interfaceC7116cMo9598m2 = homeViewModel3.f22754k.mo9598m();
                            this.f22765h = userLanguage4;
                            this.f22762e = homeViewModel3;
                            this.f22763f = userLanguage;
                            this.f22764g = 4;
                            objM14360a3 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9598m2, this);
                            if (objM14360a3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            homeViewModel4 = homeViewModel3;
                            userLanguage5 = userLanguage4;
                            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a3);
                            String strMo498E1 = homeViewModel4.mo498E1();
                            LessonFont.Companion companion = LessonFont.INSTANCE;
                            String str = userLanguage5.f21726a;
                            companion.getClass();
                            linkedHashMapM13467T0.put(strMo498E1, LessonFont.Companion.m9551a(str));
                            this.f22765h = homeViewModel4;
                            this.f22762e = userLanguage;
                            this.f22763f = null;
                            this.f22764g = 5;
                            if (homeViewModel4.f22754k.mo9568O(linkedHashMapM13467T0, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            userLanguage6 = userLanguage;
                            homeViewModel5 = homeViewModel4;
                        }
                        homeViewModel3.f22732H.mo9338O1(userLanguage.f21726a);
                        return C9072e.f47360a;
                    }
                    if (i10 == 3) {
                        userLanguage = this.f22763f;
                        homeViewModel3 = (HomeViewModel) this.f22762e;
                        userLanguage4 = (UserLanguage) this.f22765h;
                        C7499b.m14977z0(obj);
                        objM14360a2 = obj;
                        if (((Map) objM14360a2).get(homeViewModel3.mo498E1()) == null) {
                            InterfaceC7116c<Map<String, LessonFont>> interfaceC7116cMo9598m3 = homeViewModel3.f22754k.mo9598m();
                            this.f22765h = userLanguage4;
                            this.f22762e = homeViewModel3;
                            this.f22763f = userLanguage;
                            this.f22764g = 4;
                            objM14360a3 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9598m3, this);
                            if (objM14360a3 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            homeViewModel4 = homeViewModel3;
                            userLanguage5 = userLanguage4;
                            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a3);
                            String strMo498E2 = homeViewModel4.mo498E1();
                            LessonFont.Companion companion2 = LessonFont.INSTANCE;
                            String str2 = userLanguage5.f21726a;
                            companion2.getClass();
                            linkedHashMapM13467T0.put(strMo498E2, LessonFont.Companion.m9551a(str2));
                            this.f22765h = homeViewModel4;
                            this.f22762e = userLanguage;
                            this.f22763f = null;
                            this.f22764g = 5;
                            if (homeViewModel4.f22754k.mo9568O(linkedHashMapM13467T0, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            userLanguage6 = userLanguage;
                            homeViewModel5 = homeViewModel4;
                        }
                        homeViewModel3.f22732H.mo9338O1(userLanguage.f21726a);
                        return C9072e.f47360a;
                    }
                    if (i10 == 4) {
                        userLanguage = this.f22763f;
                        homeViewModel4 = (HomeViewModel) this.f22762e;
                        userLanguage5 = (UserLanguage) this.f22765h;
                        C7499b.m14977z0(obj);
                        objM14360a3 = obj;
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a3);
                        String strMo498E3 = homeViewModel4.mo498E1();
                        LessonFont.Companion companion3 = LessonFont.INSTANCE;
                        String str3 = userLanguage5.f21726a;
                        companion3.getClass();
                        linkedHashMapM13467T0.put(strMo498E3, LessonFont.Companion.m9551a(str3));
                        this.f22765h = homeViewModel4;
                        this.f22762e = userLanguage;
                        this.f22763f = null;
                        this.f22764g = 5;
                        if (homeViewModel4.f22754k.mo9568O(linkedHashMapM13467T0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        userLanguage6 = userLanguage;
                        homeViewModel5 = homeViewModel4;
                    } else {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        userLanguage6 = (UserLanguage) this.f22762e;
                        homeViewModel5 = (HomeViewModel) this.f22765h;
                        C7499b.m14977z0(obj);
                    }
                }
                homeViewModel3 = homeViewModel5;
                userLanguage = userLanguage6;
                homeViewModel3.f22732H.mo9338O1(userLanguage.f21726a);
                return C9072e.f47360a;
                if (((Map) objM14360a).get(homeViewModel.mo498E1()) != null || (list = userLanguage2.f21742q) == null) {
                    homeViewModel2 = homeViewModel;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LearningLevel[] learningLevelArrValues = LearningLevel.values();
                    int length = learningLevelArrValues.length;
                    int i12 = 0;
                    while (i11 < length) {
                        linkedHashMap.put(learningLevelArrValues[i11], Boolean.valueOf(Boolean.parseBoolean(list.get(i12))));
                        i11++;
                        i12++;
                    }
                    Map<String, ? extends Map<LearningLevel, Boolean>> mapM14943h0 = C7499b.m14943h0(new Pair(homeViewModel.mo498E1(), linkedHashMap));
                    this.f22765h = userLanguage2;
                    this.f22762e = homeViewModel;
                    this.f22763f = userLanguage;
                    this.f22764g = 2;
                    if (homeViewModel.f22754k.mo9569P(mapM14943h0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    homeViewModel2 = homeViewModel;
                    userLanguage3 = userLanguage2;
                    userLanguage2 = userLanguage3;
                }
                InterfaceC7116c<Map<String, LessonFont>> interfaceC7116cMo9598m4 = homeViewModel2.f22754k.mo9598m();
                this.f22765h = userLanguage2;
                this.f22762e = homeViewModel2;
                this.f22763f = userLanguage;
                this.f22764g = 3;
                objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9598m4, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                homeViewModel3 = homeViewModel2;
                userLanguage4 = userLanguage2;
                if (((Map) objM14360a2).get(homeViewModel3.mo498E1()) == null) {
                    InterfaceC7116c<Map<String, LessonFont>> interfaceC7116cMo9598m5 = homeViewModel3.f22754k.mo9598m();
                    this.f22765h = userLanguage4;
                    this.f22762e = homeViewModel3;
                    this.f22763f = userLanguage;
                    this.f22764g = 4;
                    objM14360a3 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9598m5, this);
                    if (objM14360a3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    homeViewModel4 = homeViewModel3;
                    userLanguage5 = userLanguage4;
                    linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a3);
                    String strMo498E4 = homeViewModel4.mo498E1();
                    LessonFont.Companion companion4 = LessonFont.INSTANCE;
                    String str4 = userLanguage5.f21726a;
                    companion4.getClass();
                    linkedHashMapM13467T0.put(strMo498E4, LessonFont.Companion.m9551a(str4));
                    this.f22765h = homeViewModel4;
                    this.f22762e = userLanguage;
                    this.f22763f = null;
                    this.f22764g = 5;
                    if (homeViewModel4.f22754k.mo9568O(linkedHashMapM13467T0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguage6 = userLanguage;
                    homeViewModel5 = homeViewModel4;
                    homeViewModel3 = homeViewModel5;
                    userLanguage = userLanguage6;
                }
                homeViewModel3.f22732H.mo9338O1(userLanguage.f21726a);
                return C9072e.f47360a;
            }
        }

        public C34783(InterfaceC9968c<? super C34783> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return HomeViewModel.this.new C34783(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34783) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22760e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                HomeViewModel homeViewModel = HomeViewModel.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = homeViewModel.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(homeViewModel, null);
                this.f22760e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a */
    public static abstract class AbstractC3479a {

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$a */
        public static final class a extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public static final a f22770a = new a();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$b */
        public static final class b extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public static final b f22771a = new b();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$c */
        public static final class c extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public static final c f22772a = new c();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$d */
        public static final class d extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public final int f22773a;

            /* JADX INFO: renamed from: b */
            public final int f22774b;

            /* JADX INFO: renamed from: c */
            public final String f22775c;

            /* JADX INFO: renamed from: d */
            public final LessonPath f22776d;

            /* JADX INFO: renamed from: e */
            public final String f22777e;

            public d(int i10, int i11, String str, LessonPath lessonPath) {
                C5207g.m11111f(lessonPath, "lessonPath");
                this.f22773a = i10;
                this.f22774b = i11;
                this.f22775c = str;
                this.f22776d = lessonPath;
                this.f22777e = "";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f22773a == dVar.f22773a && this.f22774b == dVar.f22774b && C5207g.m11106a(this.f22775c, dVar.f22775c) && C5207g.m11106a(this.f22776d, dVar.f22776d) && C5207g.m11106a(this.f22777e, dVar.f22777e);
            }

            public final int hashCode() {
                return this.f22777e.hashCode() + ((this.f22776d.hashCode() + C0166e.m758d(this.f22775c, C0009a.m16d(this.f22774b, Integer.hashCode(this.f22773a) * 31, 31), 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigateToLesson(lessonId=");
                sb2.append(this.f22773a);
                sb2.append(", courseId=");
                sb2.append(this.f22774b);
                sb2.append(", courseTitle=");
                sb2.append(this.f22775c);
                sb2.append(", lessonPath=");
                sb2.append(this.f22776d);
                sb2.append(", deeplinkLanguage=");
                return C0009a.m23l(sb2, this.f22777e, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$e */
        public static final class e extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public final String f22778a;

            /* JADX INFO: renamed from: b */
            public final String f22779b;

            /* JADX INFO: renamed from: c */
            public final int f22780c;

            /* JADX INFO: renamed from: d */
            public final LessonPath f22781d;

            public e(int i10, LessonPath lessonPath, String str, String str2) {
                C5207g.m11111f(lessonPath, "lessonPath");
                this.f22778a = str;
                this.f22779b = str2;
                this.f22780c = i10;
                this.f22781d = lessonPath;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return C5207g.m11106a(this.f22778a, eVar.f22778a) && C5207g.m11106a(this.f22779b, eVar.f22779b) && this.f22780c == eVar.f22780c && C5207g.m11106a(this.f22781d, eVar.f22781d);
            }

            public final int hashCode() {
                return this.f22781d.hashCode() + C0009a.m16d(this.f22780c, C0166e.m758d(this.f22779b, this.f22778a.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                return "NavigateToLessonPreview(source=" + this.f22778a + ", url=" + this.f22779b + ", lessonId=" + this.f22780c + ", lessonPath=" + this.f22781d + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$f */
        public static final class f extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public static final f f22782a = new f();
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$g */
        public static final class g extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public final int f22783a;

            /* JADX INFO: renamed from: b */
            public final boolean f22784b = false;

            /* JADX INFO: renamed from: c */
            public final boolean f22785c;

            public g(int i10, boolean z10) {
                this.f22783a = i10;
                this.f22785c = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.f22783a == gVar.f22783a && this.f22784b == gVar.f22784b && this.f22785c == gVar.f22785c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v3, types: [int] */
            /* JADX WARN: Type inference failed for: r0v5, types: [int] */
            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4 */
            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f22783a) * 31;
                boolean z10 = this.f22784b;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                int i10 = (iHashCode + r10) * 31;
                boolean z11 = this.f22785c;
                return i10 + (z11 ? 1 : z11);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigateToListeningMode(lessonId=");
                sb2.append(this.f22783a);
                sb2.append(", fromLesson=");
                sb2.append(this.f22784b);
                sb2.append(", isVideo=");
                return C0166e.m769p(sb2, this.f22785c, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$h */
        public static final class h extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public final boolean f22786a;

            /* JADX INFO: renamed from: b */
            public final boolean f22787b;

            /* JADX INFO: renamed from: c */
            public final String f22788c;

            /* JADX INFO: renamed from: d */
            public final List<String> f22789d;

            /* JADX INFO: renamed from: e */
            public final String f22790e;

            public /* synthetic */ h(boolean z10, List list, String str, int i10) {
                this((i10 & 1) == 0, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "" : null, list, (i10 & 16) != 0 ? null : str);
            }

            public h(boolean z10, boolean z11, String str, List<String> list, String str2) {
                C5207g.m11111f(str, "reviewLanguageFromDeeplink");
                C5207g.m11111f(list, "terms");
                this.f22786a = z10;
                this.f22787b = z11;
                this.f22788c = str;
                this.f22789d = list;
                this.f22790e = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                if (this.f22786a == hVar.f22786a && this.f22787b == hVar.f22787b && C5207g.m11106a(this.f22788c, hVar.f22788c) && C5207g.m11106a(this.f22789d, hVar.f22789d) && C5207g.m11106a(this.f22790e, hVar.f22790e)) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0 */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v2, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v3, types: [int] */
            public final int hashCode() {
                ?? r10 = 1;
                boolean z10 = this.f22786a;
                ?? r11 = z10;
                if (z10) {
                    r11 = 1;
                }
                int i10 = r11 * 31;
                boolean z11 = this.f22787b;
                if (!z11) {
                    r10 = z11;
                }
                int iM848g = C0204c.m848g(this.f22789d, C0166e.m758d(this.f22788c, (i10 + r10) * 31, 31), 31);
                String str = this.f22790e;
                return iM848g + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigateToReview(isFromVocabulary=");
                sb2.append(this.f22786a);
                sb2.append(", isDailyLingQs=");
                sb2.append(this.f22787b);
                sb2.append(", reviewLanguageFromDeeplink=");
                sb2.append(this.f22788c);
                sb2.append(", terms=");
                sb2.append(this.f22789d);
                sb2.append(", lotd=");
                return C0009a.m23l(sb2, this.f22790e, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$i */
        public static final class i extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public final String f22791a = "Home Screen Button Click";

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && C5207g.m11106a(this.f22791a, ((i) obj).f22791a);
            }

            public final int hashCode() {
                return this.f22791a.hashCode();
            }

            public final String toString() {
                return C0009a.m23l(new StringBuilder("NavigateToUpgrade(attemptedAction="), this.f22791a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.HomeViewModel$a$j */
        public static final class j extends AbstractC3479a {

            /* JADX INFO: renamed from: a */
            public final String f22792a = "";

            /* JADX INFO: renamed from: b */
            public final String f22793b = "";

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                if (C5207g.m11106a(this.f22792a, jVar.f22792a) && C5207g.m11106a(this.f22793b, jVar.f22793b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f22793b.hashCode() + (this.f22792a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("NavigateToVocabulary(vocabularyLanguageFromDeeplink=");
                sb2.append(this.f22792a);
                sb2.append(", lotd=");
                return C0009a.m23l(sb2, this.f22793b, ")");
            }
        }
    }

    public HomeViewModel(InterfaceC2020m interfaceC2020m, InterfaceC2012e interfaceC2012e, InterfaceC2015h interfaceC2015h, InterfaceC2011d interfaceC2011d, InterfaceC2014g interfaceC2014g, InterfaceC2019l interfaceC2019l, InterfaceC5182d interfaceC5182d, InterfaceC5179a interfaceC5179a, LingQDatabase lingQDatabase, InterfaceC3275c interfaceC3275c, InterfaceC3273a interfaceC3273a, ExecutorC7177a executorC7177a, InterfaceC7882z interfaceC7882z, InterfaceC0113j interfaceC0113j, InterfaceC9013i interfaceC9013i, InterfaceC6515k interfaceC6515k, PlayerController playerController, InterfaceC7368e interfaceC7368e, InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC2011d, "dictionaryRepository");
        C5207g.m11111f(interfaceC2014g, "libraryRepository");
        C5207g.m11111f(interfaceC2019l, "playlistRepository");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(lingQDatabase, "database");
        C5207g.m11111f(interfaceC3275c, "ttsManager");
        C5207g.m11111f(interfaceC3273a, "deepLinkController");
        C5207g.m11111f(interfaceC7882z, "applicationScope");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC9013i, "playerServiceControllerDelegate");
        C5207g.m11111f(interfaceC6515k, "upgradePopupDelegate");
        C5207g.m11111f(playerController, "playerController");
        C5207g.m11111f(interfaceC7368e, "notificationsController");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f22747d = interfaceC2020m;
        this.f22748e = interfaceC2012e;
        this.f22749f = interfaceC2015h;
        this.f22750g = interfaceC2011d;
        this.f22751h = interfaceC2014g;
        this.f22752i = interfaceC2019l;
        this.f22753j = interfaceC5182d;
        this.f22754k = interfaceC5179a;
        this.f22755l = lingQDatabase;
        this.f22732H = interfaceC3275c;
        this.f22733I = executorC7177a;
        this.f22734J = interfaceC7882z;
        this.f22735K = playerController;
        this.f22736L = interfaceC7368e;
        this.f22737M = interfaceC4912b;
        this.f22738N = interfaceC0113j;
        this.f22739O = interfaceC9013i;
        this.f22740P = interfaceC6515k;
        this.f22741Q = interfaceC3273a;
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(mo504j1(), new HomeViewModel$_allLanguages$1(this, null));
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        EmptyList emptyList = EmptyList.f38032a;
        C7135p c7135pM353h2 = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        this.f22742R = C0062b.m353h2(C0062b.m399t2(mo509w0(), new HomeViewModel$locales$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f22743S = abstractChannelM16738m;
        this.f22744T = C0062b.m287L1(abstractChannelM16738m);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f22745U = c7138sM10448a;
        this.f22746V = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C0062b.m353h2(new C7131l(c7135pM353h2, C0062b.m287L1(C8573r0.m16738m(-1, null, 6)), new HomeViewModel$updateUserLanguage$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34761(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34772(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34783(null), 3);
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: A */
    public final void mo9771A(UpgradeReason upgradeReason) {
        C5207g.m11111f(upgradeReason, "reason");
        this.f22740P.mo9771A(upgradeReason);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f22738N.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22738N.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: C1 */
    public final InterfaceC7142w<Integer> mo9327C1() {
        return this.f22736L.mo9327C1();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: D0 */
    public final Object mo9328D0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22736L.mo9328D0(i10, interfaceC9968c);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: E */
    public final void mo9720E(PlayingFrom playingFrom) {
        C5207g.m11111f(playingFrom, "playingFrom");
        this.f22739O.mo9720E(playingFrom);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f22738N.mo498E1();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: F0 */
    public final InterfaceC7142w<C9015k> mo9721F0() {
        return this.f22739O.mo9721F0();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: G1 */
    public final void mo9772G1(String str) {
        this.f22740P.mo9772G1(str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f22737M.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f22737M.mo9723I(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22738N.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f22737M.mo9724L();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: O */
    public final Object mo9329O(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22736L.mo9329O(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f22738N.mo500P();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: Q0 */
    public final Object mo9330Q0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22736L.mo9330Q0(interfaceC9968c);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: R1 */
    public final InterfaceC7142w<PlayingFrom> mo9726R1() {
        return this.f22739O.mo9726R1();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: S0 */
    public final InterfaceC7116c<UpgradeReason> mo9773S0() {
        return this.f22740P.mo9773S0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f22737M.mo9727T0();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: X */
    public final InterfaceC7116c<String> mo9774X() {
        return this.f22740P.mo9774X();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f22737M.mo9729Y1();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: Z */
    public final void mo9317Z(String str, long j10) {
        C5207g.m11111f(str, "url");
        this.f22741Q.mo9317Z(str, j10);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC7142w<Pair<Boolean, String>> mo9318Z0() {
        return this.f22741Q.mo9318Z0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f22737M.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f22737M.mo9731b0(z10);
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: b1 */
    public final void mo9732b1() {
        this.f22739O.mo9732b1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22738N.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f22738N;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22738N.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f22737M.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f22737M.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f22737M.mo9735h();
    }

    @Override // p205jk.InterfaceC6515k
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC7116c<C9072e> mo9775i0() {
        return this.f22740P.mo9775i0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f22737M.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f22738N.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f22737M.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f22737M.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22738N.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f22738N.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m9776l2(int i10, int i11, String str, LessonPath lessonPath) {
        C5207g.m11111f(lessonPath, "lessonPath");
        this.f22743S.mo16479j(new AbstractC3479a.d(i10, i11, str, lessonPath));
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9777m2(int i10, LessonPath lessonPath, String str, String str2) {
        C5207g.m11111f(lessonPath, "lessonPath");
        this.f22743S.mo16479j(new AbstractC3479a.e(i10, lessonPath, str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: n2 */
    public final Object m9778n2(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        HomeViewModel$navigateToPlaylist$1 homeViewModel$navigateToPlaylist$1;
        Object obj;
        String str2;
        HomeViewModel homeViewModel;
        if (interfaceC9968c instanceof HomeViewModel$navigateToPlaylist$1) {
            homeViewModel$navigateToPlaylist$1 = (HomeViewModel$navigateToPlaylist$1) interfaceC9968c;
            int i11 = homeViewModel$navigateToPlaylist$1.f22806i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                homeViewModel$navigateToPlaylist$1.f22806i = i11 - Integer.MIN_VALUE;
            } else {
                homeViewModel$navigateToPlaylist$1 = new HomeViewModel$navigateToPlaylist$1(this, interfaceC9968c);
            }
        } else {
            homeViewModel$navigateToPlaylist$1 = new HomeViewModel$navigateToPlaylist$1(this, interfaceC9968c);
        }
        Object obj2 = homeViewModel$navigateToPlaylist$1.f22804g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = homeViewModel$navigateToPlaylist$1.f22806i;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = homeViewModel$navigateToPlaylist$1.f22803f;
                String str3 = homeViewModel$navigateToPlaylist$1.f22802e;
                HomeViewModel homeViewModel2 = homeViewModel$navigateToPlaylist$1.f22801d;
                C7499b.m14977z0(obj2);
                str2 = str3;
                homeViewModel = homeViewModel2;
                obj = obj2;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = homeViewModel$navigateToPlaylist$1.f22803f;
                homeViewModel = homeViewModel$navigateToPlaylist$1.f22801d;
                C7499b.m14977z0(obj2);
            }
            homeViewModel.mo9319q(new AbstractC3274b.m(i10));
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj2);
        homeViewModel$navigateToPlaylist$1.f22801d = this;
        homeViewModel$navigateToPlaylist$1.f22802e = str;
        homeViewModel$navigateToPlaylist$1.f22803f = i10;
        homeViewModel$navigateToPlaylist$1.f22806i = 1;
        Object objMo6130y = this.f22752i.mo6130y(i10, str, homeViewModel$navigateToPlaylist$1);
        if (objMo6130y == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objMo6130y;
        str2 = str;
        homeViewModel = this;
        if (((UserPlaylist) obj) == null) {
            InterfaceC2019l interfaceC2019l = homeViewModel.f22752i;
            homeViewModel$navigateToPlaylist$1.f22801d = homeViewModel;
            homeViewModel$navigateToPlaylist$1.f22802e = null;
            homeViewModel$navigateToPlaylist$1.f22803f = i10;
            homeViewModel$navigateToPlaylist$1.f22806i = 2;
            if (interfaceC2019l.mo6097C(str2, homeViewModel$navigateToPlaylist$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        homeViewModel.mo9319q(new AbstractC3274b.m(i10));
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0191 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0192  */
    /* JADX WARN: Code duplicated, block: B:46:0x01bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: o2 */
    public final Object m9779o2(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        HomeViewModel$navigateToShelf$1 homeViewModel$navigateToShelf$1;
        HomeViewModel homeViewModel;
        LibraryShelf libraryShelf;
        String str3;
        String str4;
        HomeViewModel homeViewModel2;
        String str5;
        LibraryShelf libraryShelf2;
        LibrarySearchQuery librarySearchQuery;
        Object objM14360a;
        HomeViewModel homeViewModel3;
        LibrarySearchQuery librarySearchQuery2;
        String str6;
        LibraryShelf libraryShelf3;
        LinkedHashMap linkedHashMapM13467T0;
        InterfaceC5182d interfaceC5182d;
        LibraryShelf libraryShelf4;
        HomeViewModel homeViewModel4;
        String str7 = str;
        String str8 = str2;
        if (interfaceC9968c instanceof HomeViewModel$navigateToShelf$1) {
            homeViewModel$navigateToShelf$1 = (HomeViewModel$navigateToShelf$1) interfaceC9968c;
            int i10 = homeViewModel$navigateToShelf$1.f22814k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                homeViewModel$navigateToShelf$1.f22814k = i10 - Integer.MIN_VALUE;
            } else {
                homeViewModel$navigateToShelf$1 = new HomeViewModel$navigateToShelf$1(this, interfaceC9968c);
            }
        } else {
            homeViewModel$navigateToShelf$1 = new HomeViewModel$navigateToShelf$1(this, interfaceC9968c);
        }
        Object objMo6073s = homeViewModel$navigateToShelf$1.f22812i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = homeViewModel$navigateToShelf$1.f22814k;
        if (i11 != 0) {
            if (i11 == 1) {
                String str9 = homeViewModel$navigateToShelf$1.f22809f;
                String str10 = (String) homeViewModel$navigateToShelf$1.f22808e;
                homeViewModel = homeViewModel$navigateToShelf$1.f22807d;
                C7499b.m14977z0(objMo6073s);
                str8 = str9;
                str7 = str10;
            } else {
                if (i11 == 2) {
                    str4 = homeViewModel$navigateToShelf$1.f22809f;
                    str3 = (String) homeViewModel$navigateToShelf$1.f22808e;
                    homeViewModel = homeViewModel$navigateToShelf$1.f22807d;
                    C7499b.m14977z0(objMo6073s);
                    InterfaceC2014g interfaceC2014g = homeViewModel.f22751h;
                    homeViewModel$navigateToShelf$1.f22807d = homeViewModel;
                    homeViewModel$navigateToShelf$1.f22808e = str3;
                    homeViewModel$navigateToShelf$1.f22809f = str4;
                    homeViewModel$navigateToShelf$1.f22814k = 3;
                    objMo6073s = interfaceC2014g.mo6073s(str3, str4, homeViewModel$navigateToShelf$1);
                    if (objMo6073s == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    homeViewModel2 = homeViewModel;
                    str5 = str4;
                    libraryShelf = (LibraryShelf) objMo6073s;
                    if (libraryShelf == null) {
                        libraryShelf2 = new LibraryShelf(false, C9000b.m17252r(new LibraryTab(null, LibraryContentType.Lessons.getValue(), "Lessons", Boolean.TRUE, new Integer(-1), "/search/lessons", 1, null), new LibraryTab(null, LibraryContentType.Courses.getValue(), "Courses", Boolean.FALSE, new Integer(-1), "/search/courses", 1, null)), str5, 0, null, 0, 57, null);
                        librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                        InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = homeViewModel2.f22753j.mo9688l();
                        homeViewModel$navigateToShelf$1.f22807d = homeViewModel2;
                        homeViewModel$navigateToShelf$1.f22808e = str3;
                        homeViewModel$navigateToShelf$1.f22809f = str5;
                        homeViewModel$navigateToShelf$1.f22810g = libraryShelf2;
                        homeViewModel$navigateToShelf$1.f22811h = librarySearchQuery;
                        homeViewModel$navigateToShelf$1.f22814k = 4;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l, homeViewModel$navigateToShelf$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        homeViewModel3 = homeViewModel2;
                        librarySearchQuery2 = librarySearchQuery;
                        str6 = str3;
                        libraryShelf3 = libraryShelf2;
                        objMo6073s = objM14360a;
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo6073s);
                        linkedHashMapM13467T0.put(C7793a.m15498b(str6, str5), librarySearchQuery2);
                        interfaceC5182d = homeViewModel3.f22753j;
                        homeViewModel$navigateToShelf$1.f22807d = homeViewModel3;
                        homeViewModel$navigateToShelf$1.f22808e = libraryShelf3;
                        homeViewModel$navigateToShelf$1.f22809f = null;
                        homeViewModel$navigateToShelf$1.f22810g = null;
                        homeViewModel$navigateToShelf$1.f22811h = null;
                        homeViewModel$navigateToShelf$1.f22814k = 5;
                        if (interfaceC5182d.mo9696t(linkedHashMapM13467T0, homeViewModel$navigateToShelf$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        libraryShelf4 = libraryShelf3;
                        homeViewModel4 = homeViewModel3;
                    } else {
                        homeViewModel = homeViewModel2;
                    }
                    homeViewModel.mo9319q(new AbstractC3274b.d(libraryShelf));
                    return C9072e.f47360a;
                }
                if (i11 == 3) {
                    str4 = homeViewModel$navigateToShelf$1.f22809f;
                    str3 = (String) homeViewModel$navigateToShelf$1.f22808e;
                    homeViewModel = homeViewModel$navigateToShelf$1.f22807d;
                    C7499b.m14977z0(objMo6073s);
                    homeViewModel2 = homeViewModel;
                    str5 = str4;
                    libraryShelf = (LibraryShelf) objMo6073s;
                    if (libraryShelf == null) {
                        libraryShelf2 = new LibraryShelf(false, C9000b.m17252r(new LibraryTab(null, LibraryContentType.Lessons.getValue(), "Lessons", Boolean.TRUE, new Integer(-1), "/search/lessons", 1, null), new LibraryTab(null, LibraryContentType.Courses.getValue(), "Courses", Boolean.FALSE, new Integer(-1), "/search/courses", 1, null)), str5, 0, null, 0, 57, null);
                        librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                        InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l2 = homeViewModel2.f22753j.mo9688l();
                        homeViewModel$navigateToShelf$1.f22807d = homeViewModel2;
                        homeViewModel$navigateToShelf$1.f22808e = str3;
                        homeViewModel$navigateToShelf$1.f22809f = str5;
                        homeViewModel$navigateToShelf$1.f22810g = libraryShelf2;
                        homeViewModel$navigateToShelf$1.f22811h = librarySearchQuery;
                        homeViewModel$navigateToShelf$1.f22814k = 4;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l2, homeViewModel$navigateToShelf$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        homeViewModel3 = homeViewModel2;
                        librarySearchQuery2 = librarySearchQuery;
                        str6 = str3;
                        libraryShelf3 = libraryShelf2;
                        objMo6073s = objM14360a;
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo6073s);
                        linkedHashMapM13467T0.put(C7793a.m15498b(str6, str5), librarySearchQuery2);
                        interfaceC5182d = homeViewModel3.f22753j;
                        homeViewModel$navigateToShelf$1.f22807d = homeViewModel3;
                        homeViewModel$navigateToShelf$1.f22808e = libraryShelf3;
                        homeViewModel$navigateToShelf$1.f22809f = null;
                        homeViewModel$navigateToShelf$1.f22810g = null;
                        homeViewModel$navigateToShelf$1.f22811h = null;
                        homeViewModel$navigateToShelf$1.f22814k = 5;
                        if (interfaceC5182d.mo9696t(linkedHashMapM13467T0, homeViewModel$navigateToShelf$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        libraryShelf4 = libraryShelf3;
                        homeViewModel4 = homeViewModel3;
                    } else {
                        homeViewModel = homeViewModel2;
                    }
                    homeViewModel.mo9319q(new AbstractC3274b.d(libraryShelf));
                    return C9072e.f47360a;
                }
                if (i11 == 4) {
                    librarySearchQuery2 = homeViewModel$navigateToShelf$1.f22811h;
                    libraryShelf3 = homeViewModel$navigateToShelf$1.f22810g;
                    str5 = homeViewModel$navigateToShelf$1.f22809f;
                    str6 = (String) homeViewModel$navigateToShelf$1.f22808e;
                    homeViewModel3 = homeViewModel$navigateToShelf$1.f22807d;
                    C7499b.m14977z0(objMo6073s);
                    linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo6073s);
                    linkedHashMapM13467T0.put(C7793a.m15498b(str6, str5), librarySearchQuery2);
                    interfaceC5182d = homeViewModel3.f22753j;
                    homeViewModel$navigateToShelf$1.f22807d = homeViewModel3;
                    homeViewModel$navigateToShelf$1.f22808e = libraryShelf3;
                    homeViewModel$navigateToShelf$1.f22809f = null;
                    homeViewModel$navigateToShelf$1.f22810g = null;
                    homeViewModel$navigateToShelf$1.f22811h = null;
                    homeViewModel$navigateToShelf$1.f22814k = 5;
                    if (interfaceC5182d.mo9696t(linkedHashMapM13467T0, homeViewModel$navigateToShelf$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    libraryShelf4 = libraryShelf3;
                    homeViewModel4 = homeViewModel3;
                } else {
                    if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    libraryShelf4 = (LibraryShelf) homeViewModel$navigateToShelf$1.f22808e;
                    homeViewModel4 = homeViewModel$navigateToShelf$1.f22807d;
                    C7499b.m14977z0(objMo6073s);
                }
            }
            libraryShelf = libraryShelf4;
            homeViewModel = homeViewModel4;
            homeViewModel.mo9319q(new AbstractC3274b.d(libraryShelf));
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo6073s);
        homeViewModel$navigateToShelf$1.f22807d = this;
        homeViewModel$navigateToShelf$1.f22808e = str7;
        homeViewModel$navigateToShelf$1.f22809f = str8;
        homeViewModel$navigateToShelf$1.f22814k = 1;
        objMo6073s = this.f22751h.mo6073s(str7, str8, homeViewModel$navigateToShelf$1);
        if (objMo6073s == coroutineSingletons) {
            return coroutineSingletons;
        }
        homeViewModel = this;
        libraryShelf = (LibraryShelf) objMo6073s;
        if (libraryShelf == null) {
            InterfaceC2014g interfaceC2014g2 = homeViewModel.f22751h;
            LearningLevel[] learningLevelArrValues = LearningLevel.values();
            ArrayList arrayList = new ArrayList(learningLevelArrValues.length);
            for (LearningLevel learningLevel : learningLevelArrValues) {
                arrayList.add(learningLevel.getServerName());
            }
            homeViewModel$navigateToShelf$1.f22807d = homeViewModel;
            homeViewModel$navigateToShelf$1.f22808e = str7;
            homeViewModel$navigateToShelf$1.f22809f = str8;
            homeViewModel$navigateToShelf$1.f22814k = 2;
            if (interfaceC2014g2.mo6070p(str7, arrayList, homeViewModel$navigateToShelf$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            String str11 = str8;
            str3 = str7;
            str4 = str11;
            InterfaceC2014g interfaceC2014g3 = homeViewModel.f22751h;
            homeViewModel$navigateToShelf$1.f22807d = homeViewModel;
            homeViewModel$navigateToShelf$1.f22808e = str3;
            homeViewModel$navigateToShelf$1.f22809f = str4;
            homeViewModel$navigateToShelf$1.f22814k = 3;
            objMo6073s = interfaceC2014g3.mo6073s(str3, str4, homeViewModel$navigateToShelf$1);
            if (objMo6073s == coroutineSingletons) {
                return coroutineSingletons;
            }
            homeViewModel2 = homeViewModel;
            str5 = str4;
            libraryShelf = (LibraryShelf) objMo6073s;
            if (libraryShelf == null) {
                libraryShelf2 = new LibraryShelf(false, C9000b.m17252r(new LibraryTab(null, LibraryContentType.Lessons.getValue(), "Lessons", Boolean.TRUE, new Integer(-1), "/search/lessons", 1, null), new LibraryTab(null, LibraryContentType.Courses.getValue(), "Courses", Boolean.FALSE, new Integer(-1), "/search/courses", 1, null)), str5, 0, null, 0, 57, null);
                librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l3 = homeViewModel2.f22753j.mo9688l();
                homeViewModel$navigateToShelf$1.f22807d = homeViewModel2;
                homeViewModel$navigateToShelf$1.f22808e = str3;
                homeViewModel$navigateToShelf$1.f22809f = str5;
                homeViewModel$navigateToShelf$1.f22810g = libraryShelf2;
                homeViewModel$navigateToShelf$1.f22811h = librarySearchQuery;
                homeViewModel$navigateToShelf$1.f22814k = 4;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l3, homeViewModel$navigateToShelf$1);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                homeViewModel3 = homeViewModel2;
                librarySearchQuery2 = librarySearchQuery;
                str6 = str3;
                libraryShelf3 = libraryShelf2;
                objMo6073s = objM14360a;
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objMo6073s);
                linkedHashMapM13467T0.put(C7793a.m15498b(str6, str5), librarySearchQuery2);
                interfaceC5182d = homeViewModel3.f22753j;
                homeViewModel$navigateToShelf$1.f22807d = homeViewModel3;
                homeViewModel$navigateToShelf$1.f22808e = libraryShelf3;
                homeViewModel$navigateToShelf$1.f22809f = null;
                homeViewModel$navigateToShelf$1.f22810g = null;
                homeViewModel$navigateToShelf$1.f22811h = null;
                homeViewModel$navigateToShelf$1.f22814k = 5;
                if (interfaceC5182d.mo9696t(linkedHashMapM13467T0, homeViewModel$navigateToShelf$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                libraryShelf4 = libraryShelf3;
                homeViewModel4 = homeViewModel3;
                libraryShelf = libraryShelf4;
                homeViewModel = homeViewModel4;
            } else {
                homeViewModel = homeViewModel2;
            }
        }
        homeViewModel.mo9319q(new AbstractC3274b.d(libraryShelf));
        return C9072e.f47360a;
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<C9072e> mo9740p() {
        return this.f22739O.mo9740p();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f22737M.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f22738N.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m9780p2(String str, LanguageToLearn languageToLearn) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(languageToLearn, "languageData");
        C7828f.m15570d(this.f22734J, null, null, new HomeViewModel$updateActiveLanguage$2(this, str, languageToLearn, null), 3);
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: q */
    public final void mo9319q(AbstractC3274b abstractC3274b) {
        C5207g.m11111f(abstractC3274b, "destination");
        this.f22741Q.mo9319q(abstractC3274b);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f22737M.mo9743r0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f22738N.mo508t1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f22737M.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f22737M.mo9745u0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f22737M.mo9746v1(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f22738N.mo509w0();
    }

    @Override // com.lingq.commons.controllers.InterfaceC3273a
    /* JADX INFO: renamed from: y1 */
    public final InterfaceC7137r<AbstractC3274b> mo9320y1() {
        return this.f22741Q.mo9320y1();
    }

    @Override // sh.InterfaceC9013i
    /* JADX INFO: renamed from: z1 */
    public final void mo9747z1(int i10, long j10, boolean z10) {
        this.f22739O.mo9747z1(i10, j10, z10);
    }
}
