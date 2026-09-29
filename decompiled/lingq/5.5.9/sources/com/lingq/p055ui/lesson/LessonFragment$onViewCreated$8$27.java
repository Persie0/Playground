package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.goals.DailyGoalCoinsTutorialFragment;
import com.lingq.p055ui.goals.DailyGoalMetFragment;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuFragment;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.lesson.tutorial.LessonFirstLingQCongratsFragment;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.upgrade.UpgradeGoPremiumFragment;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.util.DailyGoalMet;
import com.lingq.shared.util.GoalMetType;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import ni.C7794b;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6704a;
import p260m8.C7499b;
import p278nh.C7777d;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$27", m19206f = "LessonFragment.kt", m19207l = {897}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$27 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27156e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27157f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$27$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lni/b;", "goal", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$27$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41891 extends SuspendLambda implements InterfaceC2056p<C7794b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27158e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27159f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$27$1$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27160a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C7794b f27161b;

            /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$27$1$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C10628a {

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int[] f27162a;

                static {
                    int[] iArr = new int[GoalMetType.values().length];
                    try {
                        iArr[GoalMetType.DailyGoal.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GoalMetType.Milestone.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GoalMetType.StreakMilestone.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f27162a = iArr;
                }
            }

            public a(LessonFragment lessonFragment, C7794b c7794b) {
                this.f27160a = lessonFragment;
                this.f27161b = c7794b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                LessonFragment lessonFragment = this.f27160a;
                if (lessonFragment.f6112l0.f6681d == Lifecycle.State.RESUMED) {
                    Bundle bundle = new Bundle();
                    C7794b c7794b = this.f27161b;
                    int i10 = C10628a.f27162a[c7794b.f42866a.ordinal()];
                    Object obj = c7794b.f42867b;
                    String str2 = "";
                    if (i10 == 1) {
                        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.shared.util.DailyGoalMet");
                        bundle.putParcelable("goalData", (DailyGoalMet) obj);
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                        LessonStudy lessonStudy = (LessonStudy) lessonFragment.m10109q0().f27515w0.getValue();
                        if (lessonStudy == null || (str = lessonStudy.f21818d) == null) {
                            str = "";
                        }
                        bundle.putString("imageUrl", str);
                    } else if (i10 == 2) {
                        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.shared.uimodel.UserMilestone");
                        bundle.putParcelable("milestone", (UserMilestone) obj);
                    } else if (i10 == 3) {
                        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.shared.util.DailyGoalMet");
                        bundle.putParcelable("goalData", (DailyGoalMet) obj);
                    }
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                    Fragment fragmentM3616D = null;
                    if (((Boolean) lessonFragment.m10109q0().f27505r0.getValue()).booleanValue()) {
                        C6704a c6704a = lessonFragment.f27064K0;
                        if (c6704a == null) {
                            C5207g.m11117l("appSettings");
                            throw null;
                        }
                        boolean z10 = false;
                        if (c6704a.f37891b.getInt("lessonsOpened", 0) > 1) {
                            FragmentManager fragmentManagerM10446Y = C4924a.m10446Y(lessonFragment);
                            if (((LessonDealWithWordsFragment) (fragmentManagerM10446Y != null ? fragmentManagerM10446Y.m3616D(LessonDealWithWordsFragment.class.getName()) : null)) == null) {
                                if (((TokenFragment) (fragmentManagerM10446Y != null ? fragmentManagerM10446Y.m3616D(TokenFragment.class.getName()) : null)) == null) {
                                    if (((UpgradeGoPremiumFragment) (fragmentManagerM10446Y != null ? fragmentManagerM10446Y.m3616D(UpgradeGoPremiumFragment.class.getName()) : null)) == null) {
                                        if (((DailyGoalMetFragment) (fragmentManagerM10446Y != null ? fragmentManagerM10446Y.m3616D(DailyGoalMetFragment.class.getName()) : null)) == null) {
                                            if (((DailyGoalCoinsTutorialFragment) (fragmentManagerM10446Y != null ? fragmentManagerM10446Y.m3616D(DailyGoalCoinsTutorialFragment.class.getName()) : null)) == null) {
                                                if (((LessonReviewMenuFragment) (fragmentManagerM10446Y != null ? fragmentManagerM10446Y.m3616D(LessonReviewMenuFragment.class.getName()) : null)) == null) {
                                                    if (fragmentManagerM10446Y != null) {
                                                        fragmentM3616D = fragmentManagerM10446Y.m3616D(LessonFirstLingQCongratsFragment.class.getName());
                                                    }
                                                    if (((LessonFirstLingQCongratsFragment) fragmentM3616D) == null) {
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                DailyGoalMetFragment dailyGoalMetFragment = new DailyGoalMetFragment();
                                dailyGoalMetFragment.m3583e0(bundle);
                                if (fragmentManagerM10446Y != null) {
                                    C7777d.m15487h(fragmentManagerM10446Y, dailyGoalMetFragment, R.id.fragment_top, DailyGoalMetFragment.class.getName(), true);
                                }
                            }
                        }
                    } else {
                        LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                        if (obj instanceof DailyGoalMet) {
                            str2 = ((DailyGoalMet) obj).f22151f;
                        } else if (obj instanceof UserMilestone) {
                            str2 = ((UserMilestone) obj).f21627b;
                        }
                        C5207g.m11111f(str2, "slug");
                        C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), lessonViewModelM10109q0.f27423P, null, new LessonViewModel$meetMilestone$1(lessonViewModelM10109q0, str2, null), 2);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41891(LessonFragment lessonFragment, InterfaceC9968c<? super C41891> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27159f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41891 c41891 = new C41891(this.f27159f, interfaceC9968c);
            c41891.f27158e = obj;
            return c41891;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7794b c7794b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41891) mo1336a(c7794b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C7794b c7794b = (C7794b) this.f27158e;
            LessonFragment lessonFragment = this.f27159f;
            lessonFragment.m3580c0().postDelayed(new a(lessonFragment, c7794b), 500L);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$27(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$27> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27157f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$27(this.f27157f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$27) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27156e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27157f;
            C7138s c7138s = lessonFragment.m10109q0().f27502p1;
            C41891 c41891 = new C41891(lessonFragment, null);
            this.f27156e = 1;
            if (C0062b.m369m0(c7138s, c41891, this) == coroutineSingletons) {
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
