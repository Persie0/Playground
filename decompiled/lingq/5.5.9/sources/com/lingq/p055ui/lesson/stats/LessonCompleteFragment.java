package com.lingq.p055ui.lesson.stats;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.google.android.material.appbar.MaterialToolbar;
import com.lingq.p055ui.home.library.RepairStreakFragment;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p118fe.C5509a;
import p159hi.C6050a;
import p225kk.C6704a;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.C7777d;
import p278nh.InterfaceC7775b;
import p278nh.InterfaceC7792s;
import p290o6.C7946b;
import p322pd.C8228i;
import p324pj.AbstractC8395a;
import p324pj.C8396b;
import p338qd.C8573r0;
import p402u0.C9369l;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p487xi.C10201i;
import ph.C8280f0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/stats/LessonCompleteFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonCompleteFragment extends AbstractC8395a {

    /* JADX INFO: renamed from: G0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f28894G0 = {C0204c.m857q(LessonCompleteFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonCompleteBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final C1038i0 f28895A0;

    /* JADX INFO: renamed from: B0 */
    public final FragmentViewBindingDelegate f28896B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f28897C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f28898D0;

    /* JADX INFO: renamed from: E0 */
    public C6704a f28899E0;

    /* JADX INFO: renamed from: F0 */
    public C7796d f28900F0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$a */
    public static final class C4415a implements InterfaceC7792s {
        public C4415a() {
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: a */
        public final void mo9909a(LanguageProgressSort languageProgressSort) {
            C5207g.m11111f(languageProgressSort, "newFilter");
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: b */
        public final void mo9910b(ChallengeDetail challengeDetail, boolean z10) {
            C5207g.m11111f(challengeDetail, "challengeDetail");
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: c */
        public final void mo9911c(boolean z10) {
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: d */
        public final void mo9912d(String str, int i10) {
            C5207g.m11111f(str, "stat");
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
            LessonCompleteViewModel lessonCompleteViewModelM10217q0 = LessonCompleteFragment.this.m10217q0();
            C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModelM10217q0), null, null, new LessonCompleteViewModel$updateLessonStat$1(str, lessonCompleteViewModelM10217q0, ((double) i10) / ((double) 10.0f), null), 3);
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: e */
        public final void mo9913e(LanguageProgressMetric languageProgressMetric, LanguageProgressPeriod languageProgressPeriod) {
            C5207g.m11111f(languageProgressMetric, "newMetric");
            C5207g.m11111f(languageProgressPeriod, "newPeriod");
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
            LessonCompleteViewModel lessonCompleteViewModelM10217q0 = LessonCompleteFragment.this.m10217q0();
            StateFlowImpl stateFlowImpl = lessonCompleteViewModelM10217q0.f29004h0;
            Object value = stateFlowImpl.getValue();
            StateFlowImpl stateFlowImpl2 = lessonCompleteViewModelM10217q0.f29006i0;
            if (languageProgressMetric == value && languageProgressPeriod == stateFlowImpl2.getValue()) {
                return;
            }
            stateFlowImpl.setValue(languageProgressMetric);
            stateFlowImpl2.setValue(languageProgressPeriod);
            lessonCompleteViewModelM10217q0.m10220l2();
            lessonCompleteViewModelM10217q0.m10222n2();
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: f */
        public final void mo9914f(int i10, int i11, int i12, int i13) {
            RepairStreakFragment repairStreakFragment = new RepairStreakFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("streak", i10);
            bundle.putInt("previousDayLingqs", i11);
            bundle.putInt("goal", i12);
            bundle.putInt("activityLevel", i13);
            repairStreakFragment.m3583e0(bundle);
            repairStreakFragment.mo3772s0(LessonCompleteFragment.this.m3594l(), "repairStreakFragment");
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: g */
        public final void mo9915g(String str, int i10, double d10) {
            C5207g.m11111f(str, "stat");
        }

        @Override // p278nh.InterfaceC7792s
        /* JADX INFO: renamed from: h */
        public final void mo9916h() {
        }
    }

    public LessonCompleteFragment() {
        super(R.layout.fragment_lesson_complete);
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$viewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f28972b;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f28895A0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonCompleteViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f28896B0 = C4924a.m10477o0(this, LessonCompleteFragment$binding$2.f28902j);
        this.f28897C0 = new C1681f(C5209i.m11118a(C8396b.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static final void m10214n0(LessonCompleteFragment lessonCompleteFragment, C6050a c6050a) {
        lessonCompleteFragment.getClass();
        C7499b.m14906H(lessonCompleteFragment).m3951d(new LessonCompleteFragment$nextLesson$1(lessonCompleteFragment, c6050a, null));
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        this.f6090a0 = true;
        if (this.f28898D0) {
            this.f28898D0 = false;
            LessonCompleteViewModel lessonCompleteViewModelM10217q0 = m10217q0();
            C7828f.m15570d(C8573r0.m16767w0(lessonCompleteViewModelM10217q0), null, null, new LessonCompleteViewModel$updateUser$1(lessonCompleteViewModelM10217q0, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r14v4, types: [com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$lessonStatsAdapter$2] */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        int i10 = 17;
        C5509a c5509a = new C5509a(i10, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(0, false);
        c8228i2.f48293c = 400L;
        m3591j0(c8228i2);
        C8228i c8228i3 = new C8228i(0, false);
        c8228i3.f48293c = 400L;
        m3587g0(c8228i3);
        C10201i c10201i = new C10201i(new C4415a(), new InterfaceC7775b() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$lessonStatsAdapter$2
            /* JADX WARN: Code duplicated, block: B:14:0x0038  */
            @Override // p278nh.InterfaceC7775b
            /* JADX INFO: renamed from: a */
            public final void mo10218a() {
                boolean z10;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
                final LessonCompleteFragment lessonCompleteFragment = this.f28964a;
                C6050a c6050a = (C6050a) lessonCompleteFragment.m10217q0().f28977L.getValue();
                boolean z11 = true;
                if (c6050a != null) {
                    String str = c6050a.f35732l;
                    if (C7661i.m15249O2(str, "private") || C7661i.m15249O2(str, "D")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    C6050a c6050a2 = (C6050a) lessonCompleteFragment.m10217q0().f28977L.getValue();
                    if (c6050a2 == null || c6050a2.f35728h) {
                        z11 = false;
                    }
                    if (z11) {
                        ViewsUtilsKt.m10421g(lessonCompleteFragment, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$lessonStatsAdapter$2$onLikeClicked$1
                            {
                                super(0);
                            }

                            @Override // cm.InterfaceC2041a
                            /* JADX INFO: renamed from: E */
                            public final C9072e mo807E() {
                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonCompleteFragment.f28894G0;
                                lessonCompleteFragment.m10217q0().m10223o2();
                                return C9072e.f47360a;
                            }
                        });
                        return;
                    }
                }
                lessonCompleteFragment.m10217q0().m10223o2();
            }

            @Override // p278nh.InterfaceC7775b
            /* JADX INFO: renamed from: b */
            public final void mo10219b(boolean z10) {
                String str = "";
                LessonCompleteFragment lessonCompleteFragment = this.f28964a;
                if (z10) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
                    LessonCompleteViewModel lessonCompleteViewModelM10217q0 = lessonCompleteFragment.m10217q0();
                    C6050a c6050a = (C6050a) lessonCompleteViewModelM10217q0.f28976K.getValue();
                    if (c6050a != null) {
                        C7138s c7138s = lessonCompleteViewModelM10217q0.f28987V;
                        Integer numValueOf = Integer.valueOf(c6050a.f35721a);
                        String str2 = c6050a.f35729i;
                        if (str2 != null) {
                            str = str2;
                        }
                        c7138s.mo14371k(new Pair(numValueOf, str));
                    }
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonCompleteFragment.f28894G0;
                    LessonCompleteViewModel lessonCompleteViewModelM10217q1 = lessonCompleteFragment.m10217q0();
                    C6050a c6050a2 = (C6050a) lessonCompleteViewModelM10217q1.f28976K.getValue();
                    if (c6050a2 != null) {
                        C7138s c7138s2 = lessonCompleteViewModelM10217q1.f28989X;
                        Integer numValueOf2 = Integer.valueOf(c6050a2.f35721a);
                        String str3 = c6050a2.f35729i;
                        str = str3 != null ? str3 : "";
                        boolean z11 = true;
                        if (((Number) lessonCompleteViewModelM10217q1.f28975J.getValue()).intValue() <= 1) {
                            z11 = false;
                        }
                        c7138s2.mo14371k(new Triple(numValueOf2, str, Boolean.valueOf(z11)));
                    }
                }
            }
        });
        C8280f0 c8280f0M10216p0 = m10216p0();
        c8280f0M10216p0.f44755d.setTitle("");
        MaterialToolbar materialToolbar = c8280f0M10216p0.f44755d;
        materialToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        List<Integer> list = C6716m.f37937a;
        materialToolbar.setNavigationIconTint(C6716m.m13333r(R.attr.colorOnSurface, m3578a0()));
        materialToolbar.setNavigationOnClickListener(new ViewOnClickListenerC2238x(19, this));
        materialToolbar.mo1059k(R.menu.menu_lesson_complete);
        materialToolbar.setOnMenuItemClickListener(new C9369l(21, this));
        c8280f0M10216p0.f44757f.setOnClickListener(new ViewOnClickListenerC7718c(24, this));
        c8280f0M10216p0.f44758g.setOnScrollChangeListener(new C7946b(c8280f0M10216p0, i10, this));
        boolean z10 = ((C8396b) this.f28897C0.getValue()).f45520b;
        TextView textView = c8280f0M10216p0.f44756e;
        if (z10) {
            textView.setText(m3600t(R.string.complete_lesson_complete));
            Context contextM3578a0 = m3578a0();
            Object obj = C7472a.f41322a;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C7472a.c.m14849b(contextM3578a0, R.drawable.ic_check), (Drawable) null);
        } else {
            textView.setText(m3600t(R.string.complete_lesson_stats));
            Context contextM3578a1 = m3578a0();
            Object obj2 = C7472a.f41322a;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, C7472a.c.m14849b(contextM3578a1, R.drawable.ic_stats_s), (Drawable) null);
        }
        m10217q0().f28974I.setValue(Boolean.valueOf(C7777d.m15481b(this)));
        boolean zM15481b = C7777d.m15481b(this);
        RecyclerView recyclerView = c8280f0M10216p0.f44754c;
        if (zM15481b) {
            recyclerView.setLayoutManager(new StaggeredGridLayoutManager());
        } else {
            m3578a0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
        }
        recyclerView.setAdapter(c10201i);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4416x3316924(this, Lifecycle.State.STARTED, null, this, c10201i), 3);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o0 */
    public final C6704a m10215o0() {
        C6704a c6704a = this.f28899E0;
        if (c6704a != null) {
            return c6704a;
        }
        C5207g.m11117l("appSettings");
        throw null;
    }

    /* JADX INFO: renamed from: p0 */
    public final C8280f0 m10216p0() {
        return (C8280f0) this.f28896B0.m10489a(this, f28894G0[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public final LessonCompleteViewModel m10217q0() {
        return (LessonCompleteViewModel) this.f28895A0.getValue();
    }
}
