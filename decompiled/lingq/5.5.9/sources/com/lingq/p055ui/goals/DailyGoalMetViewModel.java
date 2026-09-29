package com.lingq.p055ui.goals;

import ae.C0062b;
import android.graphics.Rect;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2016i;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.ExoPlayer;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7794b;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p183ik.C6343f;
import p225kk.C6715l;
import p244lh.InterfaceC7367d;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/goals/DailyGoalMetViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Llh/d;", "Lcom/lingq/ui/tooltips/b;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DailyGoalMetViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC7367d, InterfaceC4912b {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f22592H;

    /* JADX INFO: renamed from: I */
    public final C7135p f22593I;

    /* JADX INFO: renamed from: J */
    public final C7138s f22594J;

    /* JADX INFO: renamed from: K */
    public final C7134o f22595K;

    /* JADX INFO: renamed from: L */
    public final C7138s f22596L;

    /* JADX INFO: renamed from: M */
    public final C7134o f22597M;

    /* JADX INFO: renamed from: N */
    public final C7138s f22598N;

    /* JADX INFO: renamed from: O */
    public final C7134o f22599O;

    /* JADX INFO: renamed from: P */
    public final C7138s f22600P;

    /* JADX INFO: renamed from: Q */
    public final C7134o f22601Q;

    /* JADX INFO: renamed from: R */
    public final C7138s f22602R;

    /* JADX INFO: renamed from: S */
    public final C7134o f22603S;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2016i f22604d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f22605e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0113j f22606f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7367d f22607g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4912b f22608h;

    /* JADX INFO: renamed from: i */
    public final Integer f22609i;

    /* JADX INFO: renamed from: j */
    public final String f22610j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f22611k;

    /* JADX INFO: renamed from: l */
    public final C7135p f22612l;

    /* JADX INFO: renamed from: com.lingq.ui.goals.DailyGoalMetViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.goals.DailyGoalMetViewModel$1", m19206f = "DailyGoalMetViewModel.kt", m19207l = {74}, m19208m = "invokeSuspend")
    final class C34551 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22613e;

        public C34551(InterfaceC9968c<? super C34551> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DailyGoalMetViewModel.this.new C34551(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34551) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22613e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                this.f22613e = 1;
                if (C7828f.m15567a(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            C7138s c7138s = DailyGoalMetViewModel.this.f22602R;
            C9072e c9072e = C9072e.f47360a;
            c7138s.mo14371k(c9072e);
            return c9072e;
        }
    }

    public DailyGoalMetViewModel(InterfaceC2016i interfaceC2016i, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, InterfaceC7367d interfaceC7367d, InterfaceC4912b interfaceC4912b, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2016i, "milestoneRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC7367d, "milestonesControllerDelegate");
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f22604d = interfaceC2016i;
        this.f22605e = executorC7177a;
        this.f22606f = interfaceC0113j;
        this.f22607g = interfaceC7367d;
        this.f22608h = interfaceC4912b;
        this.f22609i = (Integer) c1024c0.m3929b("lessonId");
        this.f22610j = (String) c1024c0.m3929b("imageUrl");
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(c1024c0.m3929b("goalData"));
        this.f22611k = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f22612l = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(c1024c0.m3929b("milestone"));
        this.f22592H = stateFlowImplM14379a2;
        this.f22593I = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f22594J = c7138sM10448a;
        this.f22595K = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f22596L = c7138sM10448a2;
        this.f22597M = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f22598N = c7138sM10448a3;
        this.f22599O = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f22600P = c7138sM10448a4;
        this.f22601Q = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f22602R = c7138sM10448a5;
        this.f22603S = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        mo9322a().mo14371k(Boolean.TRUE);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C34551(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f22606f.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22606f.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: D1 */
    public final void mo9321D1(List<C7794b> list) {
        this.f22607g.mo9321D1(list);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f22606f.mo498E1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f22608h.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f22608h.mo9723I(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22606f.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f22608h.mo9724L();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f22606f.mo500P();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f22608h.mo9727T0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f22608h.mo9729Y1();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7133n<Boolean> mo9322a() {
        return this.f22607g.mo9322a();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f22608h.mo9730a1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f22608h.mo9731b0(z10);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22606f.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f22606f;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22606f.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f22608h.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f22608h.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f22608h.mo9735h();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: h2 */
    public final void mo9324h2(C7794b c7794b) {
        this.f22607g.mo9324h2(c7794b);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f22608h.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f22606f.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f22608h.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f22608h.mo9738k1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f22606f.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f22606f.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m9759l2(String str) {
        Pair pair;
        C5207g.m11111f(str, "message");
        Integer num = this.f22609i;
        if (num == null) {
            pair = new Pair("https://www.lingq.com/", str);
        } else {
            StringBuilder sbM855o = C0204c.m855o("https://www.lingq.com/", mo507p1(), "/learn/", mo498E1(), "/web/reader/");
            sbM855o.append(num);
            pair = new Pair(sbM855o.toString(), str);
        }
        this.f22600P.mo14371k(pair);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m9760m2() {
        String string = "https://www.lingq.com/";
        Integer num = this.f22609i;
        if (num != null) {
            StringBuilder sbM855o = C0204c.m855o(string, mo507p1(), "/learn/", mo498E1(), "/web/reader/");
            sbM855o.append(num);
            string = sbM855o.toString();
        }
        this.f22596L.mo14371k(string);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m9761n2(String str) {
        C5207g.m11111f(str, "message");
        String strM10485w = this.f22610j;
        if (strM10485w == null) {
            UserMilestone userMilestone = (UserMilestone) this.f22592H.getValue();
            if (userMilestone != null) {
                strM10485w = C4924a.m10485w(userMilestone);
            } else {
                strM10485w = null;
            }
        }
        this.f22598N.mo14371k(new Pair(str, strM10485w));
    }

    /* JADX INFO: renamed from: o2 */
    public final void m9762o2(String str) {
        String strM766l;
        C5207g.m11111f(str, "message");
        Integer num = this.f22609i;
        if (num == null) {
            strM766l = C0141b.m611g("http://www.twitter.com/intent/tweet?url=https://www.lingq.com/&text=", URLEncoder.encode(str.concat(" via @LingQ_Central"), "utf-8"), ".");
        } else {
            strM766l = C0166e.m766l("http://www.twitter.com/intent/tweet?url=", "https://www.lingq.com/en/learn/" + mo498E1() + "/web/reader/" + num, "&text=", URLEncoder.encode(str.concat(" via @LingQ_Central"), "utf-8"), ".");
        }
        this.f22594J.mo14371k(strM766l);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f22608h.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f22606f.mo507p1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f22608h.mo9743r0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f22606f.mo508t1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f22608h.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f22608h.mo9745u0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f22608h.mo9746v1(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f22606f.mo509w0();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: w1 */
    public final InterfaceC7116c<C7794b> mo9325w1() {
        return this.f22607g.mo9325w1();
    }
}
