package com.lingq.p055ui.goals;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.MilestoneLevel;
import com.lingq.shared.uimodel.MilestoneType;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8315l;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$2", m19206f = "DailyGoalMetFragment.kt", m19207l = {186}, m19208m = "invokeSuspend")
public final class DailyGoalMetFragment$onViewCreated$8$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22554e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DailyGoalMetFragment f22555f;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/UserMilestone;", "milestone", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$2$1", m19206f = "DailyGoalMetFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34491 extends SuspendLambda implements InterfaceC2056p<UserMilestone, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22556e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DailyGoalMetFragment f22557f;

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$2$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22558a;

            public a(DailyGoalMetFragment dailyGoalMetFragment) {
                this.f22558a = dailyGoalMetFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22558a.m9758o0().m9760m2();
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$2$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22559a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f22560b;

            public b(DailyGoalMetFragment dailyGoalMetFragment, String str) {
                this.f22559a = dailyGoalMetFragment;
                this.f22560b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22559a.m9758o0().m9762o2(this.f22560b);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$2$1$c */
        public static final class c implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22561a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f22562b;

            public c(DailyGoalMetFragment dailyGoalMetFragment, String str) {
                this.f22561a = dailyGoalMetFragment;
                this.f22562b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22561a.m9758o0().m9761n2(this.f22562b);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetFragment$onViewCreated$8$2$1$d */
        public static final class d implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DailyGoalMetFragment f22563a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f22564b;

            public d(DailyGoalMetFragment dailyGoalMetFragment, String str) {
                this.f22563a = dailyGoalMetFragment;
                this.f22564b = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                this.f22563a.m9758o0().m9759l2(this.f22564b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34491(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super C34491> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22557f = dailyGoalMetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34491 c34491 = new C34491(this.f22557f, interfaceC9968c);
            c34491.f22556e = obj;
            return c34491;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserMilestone userMilestone, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34491) mo1336a(userMilestone, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String strM613i;
            String strM613i2;
            MilestoneLevel[] enumConstants;
            MilestoneLevel milestoneLevel;
            MilestoneLevel[] enumConstants2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserMilestone userMilestone = (UserMilestone) this.f22556e;
            if (userMilestone != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
                DailyGoalMetFragment dailyGoalMetFragment = this.f22557f;
                C8315l c8315lM9757n0 = dailyGoalMetFragment.m9757n0();
                TextView textView = c8315lM9757n0.f44987i;
                Context contextM3578a0 = dailyGoalMetFragment.m3578a0();
                int i10 = C4924a.a.f32088c[C4924a.m10487y(userMilestone).ordinal()];
                String str = userMilestone.f21627b;
                Class<MilestoneLevel> cls = MilestoneLevel.class;
                int i11 = userMilestone.f21628c;
                if (i10 == 1) {
                    Locale locale = Locale.getDefault();
                    String string = contextM3578a0.getString(R.string.milestones_n_words);
                    C5207g.m11110e(string, "context.getString(R.string.milestones_n_words)");
                    strM613i = C0141b.m613i(new Object[]{Integer.valueOf(i11)}, 1, locale, string, "format(locale, format, *args)");
                } else if (i10 == 2) {
                    List listM14299s3 = C7076b.m14299s3(str, new String[]{"."}, 0, 6);
                    MilestoneLevel.Companion companion = MilestoneLevel.INSTANCE;
                    String str2 = (String) C6752c.m13432Z(listM14299s3);
                    Class<MilestoneLevel> cls2 = cls.isEnum() ? cls : null;
                    if (cls2 == null || (enumConstants2 = cls2.getEnumConstants()) == null) {
                        milestoneLevel = null;
                    } else {
                        int length = enumConstants2.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            milestoneLevel = enumConstants2[i12];
                            MilestoneLevel[] milestoneLevelArr = enumConstants2;
                            if (C5207g.m11106a(milestoneLevel.getImage(), str2)) {
                                break;
                            }
                            i12++;
                            enumConstants2 = milestoneLevelArr;
                        }
                    }
                    if (milestoneLevel == null && (milestoneLevel = MilestoneLevel.Beginner1) == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.lingq.shared.uimodel.MilestoneLevel");
                    }
                    Locale locale2 = Locale.getDefault();
                    String string2 = contextM3578a0.getString(R.string.milestones_you_are_now);
                    C5207g.m11110e(string2, "context.getString(R.string.milestones_you_are_now)");
                    strM613i = C0141b.m613i(new Object[]{C4924a.m10469k0(milestoneLevel, contextM3578a0)}, 1, locale2, string2, "format(locale, format, *args)");
                } else if (i10 == 3) {
                    Locale locale3 = Locale.getDefault();
                    String string3 = contextM3578a0.getString(R.string.milestones_daily_goal_met);
                    C5207g.m11110e(string3, "context.getString(R.stri…ilestones_daily_goal_met)");
                    strM613i = C0141b.m613i(new Object[0], 0, locale3, string3, "format(locale, format, *args)");
                } else {
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Locale locale4 = Locale.getDefault();
                    String string4 = contextM3578a0.getString(R.string.daily_goal_met_doubled);
                    C5207g.m11110e(string4, "context.getString(R.string.daily_goal_met_doubled)");
                    strM613i = C0141b.m613i(new Object[0], 0, locale4, string4, "format(locale, format, *args)");
                }
                textView.setText(strM613i);
                ImageView imageView = c8315lM9757n0.f44984f;
                C5207g.m11110e(imageView, "ivMilestone");
                C4924a.m10457e0(imageView);
                List<Integer> list = C6716m.f37937a;
                String strM10485w = C4924a.m10485w(userMilestone);
                C5207g.m11111f(strM10485w, "name");
                int identifier = imageView.getContext().getResources().getIdentifier(strM10485w, "drawable", imageView.getContext().getPackageName());
                if (identifier != 0) {
                    imageView.setImageResource(identifier);
                } else {
                    imageView.setImageResource(R.drawable.ic_milestone_daily_goal);
                }
                MilestoneType milestoneTypeM10487y = C4924a.m10487y(userMilestone);
                MilestoneType milestoneType = MilestoneType.Level;
                String str3 = userMilestone.f21626a;
                if (milestoneTypeM10487y == milestoneType || milestoneTypeM10487y == MilestoneType.KnownWords) {
                    ImageView imageView2 = c8315lM9757n0.f44985g;
                    C5207g.m11110e(imageView2, "ivMilestoneLanguageFlag");
                    C4924a.m10457e0(imageView2);
                    C6716m.m13326k(imageView2, str3, 0.0f);
                }
                DailyGoalMetViewModel dailyGoalMetViewModelM9758o0 = dailyGoalMetFragment.m9758o0();
                MilestoneLevel milestoneLevel2 = null;
                C7828f.m15570d(C8573r0.m16767w0(dailyGoalMetViewModelM9758o0), dailyGoalMetViewModelM9758o0.f22605e, null, new DailyGoalMetViewModel$meetMilestone$1(dailyGoalMetViewModelM9758o0, null), 2);
                Context contextM3578a1 = dailyGoalMetFragment.m3578a0();
                int i13 = C4924a.a.f32088c[C4924a.m10487y(userMilestone).ordinal()];
                if (i13 == 1) {
                    Locale locale5 = Locale.getDefault();
                    String string5 = contextM3578a1.getString(R.string.milestones_i_now_know);
                    C5207g.m11110e(string5, "context.getString(R.string.milestones_i_now_know)");
                    strM613i2 = C0141b.m613i(new Object[]{String.valueOf(i11), C4924a.m10439R(contextM3578a1, str3)}, 2, locale5, string5, "format(locale, format, *args)");
                } else if (i13 == 2) {
                    List listM14299s4 = C7076b.m14299s3(str, new String[]{"."}, 0, 6);
                    MilestoneLevel.Companion companion2 = MilestoneLevel.INSTANCE;
                    String str4 = (String) C6752c.m13432Z(listM14299s4);
                    cls = cls.isEnum() ? MilestoneLevel.class : null;
                    if (cls != null && (enumConstants = cls.getEnumConstants()) != null) {
                        int length2 = enumConstants.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length2) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            milestoneLevel2 = enumConstants[i14];
                            if (C5207g.m11106a(milestoneLevel2.getImage(), str4)) {
                                break;
                            }
                            i14++;
                        }
                    }
                    if (milestoneLevel2 == null && (milestoneLevel2 = MilestoneLevel.Beginner1) == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.lingq.shared.uimodel.MilestoneLevel");
                    }
                    Locale locale6 = Locale.getDefault();
                    String string6 = contextM3578a1.getString(R.string.milestones_im_now_level);
                    C5207g.m11110e(string6, "context.getString(R.stri….milestones_im_now_level)");
                    strM613i2 = C0141b.m613i(new Object[]{C4924a.m10469k0(milestoneLevel2, contextM3578a1), C4924a.m10439R(contextM3578a1, str3)}, 2, locale6, string6, "format(locale, format, *args)");
                } else if (i13 == 3) {
                    Locale locale7 = Locale.getDefault();
                    String string7 = contextM3578a1.getString(R.string.daily_goal_met_share);
                    C5207g.m11110e(string7, "context.getString(R.string.daily_goal_met_share)");
                    strM613i2 = C0141b.m613i(new Object[]{C4924a.m10439R(contextM3578a1, str3)}, 1, locale7, string7, "format(locale, format, *args)");
                } else {
                    if (i13 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Locale locale8 = Locale.getDefault();
                    String string8 = contextM3578a1.getString(R.string.daily_goal_met_share_double);
                    C5207g.m11110e(string8, "context.getString(R.stri…ly_goal_met_share_double)");
                    strM613i2 = C0141b.m613i(new Object[]{C4924a.m10439R(contextM3578a1, str3)}, 1, locale8, string8, "format(locale, format, *args)");
                }
                c8315lM9757n0.f44982d.setOnClickListener(new a(dailyGoalMetFragment));
                c8315lM9757n0.f44986h.setOnClickListener(new b(dailyGoalMetFragment, strM613i2));
                c8315lM9757n0.f44983e.setOnClickListener(new c(dailyGoalMetFragment, strM613i2));
                c8315lM9757n0.f44981c.setOnClickListener(new d(dailyGoalMetFragment, strM613i2));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyGoalMetFragment$onViewCreated$8$2(DailyGoalMetFragment dailyGoalMetFragment, InterfaceC9968c<? super DailyGoalMetFragment$onViewCreated$8$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22555f = dailyGoalMetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DailyGoalMetFragment$onViewCreated$8$2(this.f22555f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DailyGoalMetFragment$onViewCreated$8$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22554e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalMetFragment.f22526E0;
            DailyGoalMetFragment dailyGoalMetFragment = this.f22555f;
            DailyGoalMetViewModel dailyGoalMetViewModelM9758o0 = dailyGoalMetFragment.m9758o0();
            C34491 c34491 = new C34491(dailyGoalMetFragment, null);
            this.f22554e = 1;
            if (C0062b.m369m0(dailyGoalMetViewModelM9758o0.f22593I, c34491, this) == coroutineSingletons) {
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
