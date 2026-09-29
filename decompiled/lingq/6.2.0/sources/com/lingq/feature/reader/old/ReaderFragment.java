package com.lingq.feature.reader.old;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.C0411w;
import androidx.compose.p002ui.platform.ComposeView;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractC0638f;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.R$attr;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.designsystem.R$bool;
import com.lingq.core.designsystem.R$dimen;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import com.lingq.core.player.video.AbstractC1824e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenPopupHostFragment;
import com.lingq.core.token.TokenViewState;
import com.lingq.feature.reader.R$drawable;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.shared.p018ui.components.ReaderPlayerView;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import org.json.JSONException;
import p000.AbstractC3184kh;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3479q;
import p000.C3509qs;
import p000.aw7;
import p000.b34;
import p000.bh4;
import p000.bw7;
import p000.c3a;
import p000.cs4;
import p000.d34;
import p000.ded;
import p000.dta;
import p000.dua;
import p000.dw6;
import p000.ew7;
import p000.fa4;
import p000.fw7;
import p000.fx5;
import p000.gr3;
import p000.gw7;
import p000.hf1;
import p000.hm5;
import p000.hy7;
import p000.jfa;
import p000.lda;
import p000.lfa;
import p000.or1;
import p000.q39;
import p000.qx3;
import p000.r46;
import p000.rt3;
import p000.rw7;
import p000.sq5;
import p000.tw7;
import p000.ui3;
import p000.uq0;
import p000.ux5;
import p000.vj6;
import p000.vqb;
import p000.vz1;
import p000.w41;
import p000.we3;
import p000.web;
import p000.wf0;
import p000.wfb;
import p000.wsa;
import p000.x74;
import p000.xwc;
import p000.y38;
import p000.zta;

/* JADX INFO: loaded from: classes3.dex */
public final class ReaderFragment extends rt3 {

    /* JADX INFO: renamed from: P0 */
    public static final /* synthetic */ bh4[] f28218P0 = {new PropertyReference1Impl(ReaderFragment.class, "binding", "getBinding()Lcom/lingq/feature/reader/databinding/FragmentReaderBinding;")};

    /* JADX INFO: renamed from: C0 */
    public hy7 f28219C0;

    /* JADX INFO: renamed from: D0 */
    public final C3309ls f28220D0;

    /* JADX INFO: renamed from: E0 */
    public final w41 f28221E0;

    /* JADX INFO: renamed from: F0 */
    public final sq5 f28222F0;

    /* JADX INFO: renamed from: G0 */
    public PopupWindow f28223G0;

    /* JADX INFO: renamed from: H0 */
    public fx5 f28224H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f28225I0;

    /* JADX INFO: renamed from: J0 */
    public final rw7 f28226J0;

    /* JADX INFO: renamed from: K0 */
    public final hf1 f28227K0;

    /* JADX INFO: renamed from: L0 */
    public hm5 f28228L0;

    /* JADX INFO: renamed from: M0 */
    public C3509qs f28229M0;

    /* JADX INFO: renamed from: N0 */
    public C1808b f28230N0;

    /* JADX INFO: renamed from: O0 */
    public w41 f28231O0;

    public ReaderFragment() {
        super(R$layout.fragment_reader, 12);
        this.f28220D0 = jfa.m14432o(this, ReaderFragment$binding$2.f28232i);
        final aw7 aw7Var = new aw7(this, 0);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.reader.old.ReaderFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                ReaderFragment readerFragment = aw7Var.f7619b;
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                return readerFragment;
            }
        });
        this.f28221E0 = new w41(y38.m24933a(C2412n.class), new ui3() { // from class: com.lingq.feature.reader.old.ReaderFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.ReaderFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f28438b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.reader.old.ReaderFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
        this.f28222F0 = new sq5(3, y38.m24933a(tw7.class), new uq0(this, 14));
        this.f28226J0 = new rw7(this, 1);
        this.f28227K0 = new hf1(this, 2);
    }

    /* JADX INFO: renamed from: R0 */
    public static final void m9285R0(ReaderFragment readerFragment, TokenPopupData tokenPopupData) {
        Bundle bundle = new Bundle();
        String str = tokenPopupData.f23445a;
        String str2 = tokenPopupData.f23446b;
        TokenType tokenType = tokenPopupData.f23447c;
        int i = tokenPopupData.f23448d;
        int i2 = tokenPopupData.f23449e;
        int i3 = tokenPopupData.f23437K;
        int i4 = tokenPopupData.f23438L;
        TokenFragmentData tokenFragmentData = tokenPopupData.f23450f;
        bundle.putParcelable("tokenData", new TokenPopupData(str, str2, tokenType, i, i2, new TokenFragmentData(tokenFragmentData.f23315a, tokenFragmentData.f23316b), readerFragment.m9292Y0() ? TokenViewState.Expanded.f23709a : tokenPopupData.f23451g, readerFragment.m9292Y0() ? TokenControllerType.LessonExpanded : TokenControllerType.Lesson, null, tokenPopupData.f23454j, tokenPopupData.f23455k, false, tokenPopupData.f23434H, tokenPopupData.f23435I, tokenPopupData.f23436J, i3, i4, 0, 0, readerFragment.m9292Y0(), null, null, false, 7735552, null));
        bundle.putInt("lessonId", readerFragment.m9290W0().m9332l3());
        bundle.putBoolean("isSentence", readerFragment.m9290W0().m9331k3());
        boolean z = true;
        if (!readerFragment.m2110l().getBoolean(R$bool.is_phone) && (readerFragment.m2110l().getBoolean(R$bool.is_phone) || readerFragment.m2110l().getConfiguration().orientation != 1)) {
            z = false;
        }
        AbstractC0638f abstractC0638fM2106h = readerFragment.m2106h();
        int i5 = readerFragment.m9292Y0() ? R$id.fragment_container_token : R$id.fragment_top;
        boolean zM9292Y0 = readerFragment.m9292Y0();
        TokenPopupHostFragment tokenPopupHostFragment = (TokenPopupHostFragment) (abstractC0638fM2106h != null ? abstractC0638fM2106h.m2137E(TokenPopupHostFragment.class.getName()) : null);
        if (tokenPopupHostFragment == null) {
            TokenPopupHostFragment tokenPopupHostFragment2 = new TokenPopupHostFragment();
            tokenPopupHostFragment2.m2095W(bundle);
            if (abstractC0638fM2106h != null) {
                ded.m10316b(abstractC0638fM2106h, tokenPopupHostFragment2, i5, TokenPopupHostFragment.class.getName(), z);
                return;
            }
            return;
        }
        TokenPopupData tokenPopupData2 = (TokenPopupData) xwc.m24730C(bundle, "tokenData", TokenPopupData.class);
        if (zM9292Y0 && tokenPopupData2 != null) {
            tokenPopupHostFragment.m8689c0().m8760d3(new c3a(tokenPopupData2, false));
            return;
        }
        TokenPopupHostFragment tokenPopupHostFragment3 = new TokenPopupHostFragment();
        tokenPopupHostFragment3.m2095W(bundle);
        ded.m10316b(abstractC0638fM2106h, tokenPopupHostFragment3, i5, TokenPopupHostFragment.class.getName(), z);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        C2412n c2412nM9290W0 = m9290W0();
        DateTime dateTime = new DateTime();
        c2412nM9290W0.getClass();
        c2412nM9290W0.f29388n.mo47b(dateTime);
        m9290W0().mo8768j0(true);
        m9290W0().mo9211g0(PlayingFrom.Lesson);
        m9290W0().mo9033o1(AppUsageType.Reading, Integer.valueOf(m9290W0().m9332l3()));
        if (m9292Y0()) {
            m9290W0().mo8735B();
        }
        if (this.f28225I0) {
            this.f28225I0 = false;
            C2412n c2412nM9290W1 = m9290W0();
            c2412nM9290W1.getClass();
            wfb.m23926u(lda.m16103C(c2412nM9290W1), null, null, new ReaderViewModel$updateUser$1(c2412nM9290W1, null), 3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: L */
    public final void mo2084L() {
        this.f5688b0 = true;
        m9290W0().mo50y(LqAnalyticsValues$LessonExitPath.BackgroundedLingq);
        C3244l c3244l = m9290W0().f29322V;
        c3244l.getClass();
        c3244l.m15572j(null, -1);
        ((ArrayList) m9288U0().f66709o.f7120c.f42294b).remove(this.f28227K0);
        C2412n c2412nM9290W0 = m9290W0();
        wfb.m23926u(c2412nM9290W0.f29304P, null, null, new ReaderViewModel$updateCounterForLesson$1(c2412nM9290W0, vz1.m23604J(Integer.valueOf(c2412nM9290W0.m9332l3())), null), 3);
        m9290W0().mo8768j0(false);
        C3244l c3244l2 = m9290W0().f29263B0;
        Boolean bool = Boolean.FALSE;
        c3244l2.getClass();
        c3244l2.m15572j(null, bool);
        if (jfa.m14418a(m2090R())) {
            ux5.m22977D(m9292Y0(), m9290W0().f29345c0, null);
        }
        m9290W0().mo9034v0(AppUsageType.Reading);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) throws JSONException, IOException {
        View viewM16159c;
        int i;
        view.getClass();
        final int i2 = 5;
        dw6 dw6Var = new dw6(this, 5);
        WeakHashMap weakHashMap = dta.f36217a;
        wsa.m24145c(view, dw6Var);
        final int i3 = 2;
        x74.m24339F(this, "lessonEdit", new bw7(this, i3));
        qx3 qx3Var = new qx3(m2090R());
        qx3Var.m20193b("https://" + m2090R().getPackageName());
        String strMo4589b2 = m9290W0().f29340b.mo4589b2();
        strMo4589b2.getClass();
        AbstractC1824e.m8504c(qx3Var, "hl", strMo4589b2);
        vj6 vj6Var = new vj6(qx3Var.f58334a, 20);
        YouTubePlayerView youTubePlayerView = m9288U0().f66694O;
        gw7 gw7Var = new gw7();
        if (youTubePlayerView.f34327c) {
            C3386nv.m17633t("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
            return;
        }
        final int i4 = 0;
        youTubePlayerView.f34326b.m11385a(gw7Var, false, vj6Var, null);
        sq5 sq5Var = this.f28222F0;
        if (((tw7) sq5Var.getValue()).f63017e) {
            vz1.m23641m0(this);
        } else {
            vz1.m23638j0(r46.m20364G(m2090R(), R$attr.motionDurationLong2, 500), this);
        }
        we3 we3VarM9288U0 = m9288U0();
        CircularProgressIndicator circularProgressIndicator = we3VarM9288U0.f66713s;
        ReaderProgressBar readerProgressBar = we3VarM9288U0.f66708n;
        LinearLayout linearLayout = we3VarM9288U0.f66688I;
        ImageView imageView = we3VarM9288U0.f66696b;
        ViewPager2 viewPager2 = we3VarM9288U0.f66709o;
        ReaderPlayerView readerPlayerView = we3VarM9288U0.f66686G;
        d34 d34Var = we3VarM9288U0.f66707m;
        ImageView imageView2 = d34Var.f34900b;
        jfa.m14425h(circularProgressIndicator);
        jfa.m14429l(m9288U0().f66712r);
        ViewPager2 viewPager3 = m9288U0().f66709o;
        if (!viewPager3.isLaidOut() || viewPager3.isLayoutRequested()) {
            viewPager3.addOnLayoutChangeListener(new wf0(this, 2));
        } else {
            C3244l c3244l = m9290W0().f29263B0;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
        }
        jfa.m14429l(d34Var.f34901c);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderFragment f34638b;

            {
                this.f34638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object value;
                int i5 = i4;
                ReaderFragment readerFragment = this.f34638b;
                switch (i5) {
                    case 0:
                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 2:
                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 3:
                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 4:
                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                        return;
                    case 5:
                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8776s2(false, true);
                        vz1.m23641m0(readerFragment);
                        ec6 ec6Var = fc6.Companion;
                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                        ec6Var.getClass();
                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                        return;
                    case 6:
                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                        C1808b c1808b = readerFragment.f28230N0;
                        if (c1808b == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        c1808b.m8447J();
                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                        return;
                    case 7:
                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        PopupWindow popupWindow = readerFragment.f28223G0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 8:
                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 9:
                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                        do {
                            value = c3244l2.getValue();
                            ((Boolean) value).getClass();
                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                        return;
                    case 10:
                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                        return;
                    default:
                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                        return;
                }
            }
        });
        final int i5 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderFragment f34638b;

            {
                this.f34638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object value;
                int i6 = i5;
                ReaderFragment readerFragment = this.f34638b;
                switch (i6) {
                    case 0:
                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 2:
                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 3:
                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 4:
                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                        return;
                    case 5:
                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8776s2(false, true);
                        vz1.m23641m0(readerFragment);
                        ec6 ec6Var = fc6.Companion;
                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                        ec6Var.getClass();
                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                        return;
                    case 6:
                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                        C1808b c1808b = readerFragment.f28230N0;
                        if (c1808b == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        c1808b.m8447J();
                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                        return;
                    case 7:
                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        PopupWindow popupWindow = readerFragment.f28223G0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 8:
                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 9:
                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                        do {
                            value = c3244l2.getValue();
                            ((Boolean) value).getClass();
                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                        return;
                    case 10:
                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                        return;
                    default:
                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                        return;
                }
            }
        });
        we3VarM9288U0.f66712r.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderFragment f34638b;

            {
                this.f34638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object value;
                int i6 = i3;
                ReaderFragment readerFragment = this.f34638b;
                switch (i6) {
                    case 0:
                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 2:
                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 3:
                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 4:
                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                        return;
                    case 5:
                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8776s2(false, true);
                        vz1.m23641m0(readerFragment);
                        ec6 ec6Var = fc6.Companion;
                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                        ec6Var.getClass();
                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                        return;
                    case 6:
                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                        C1808b c1808b = readerFragment.f28230N0;
                        if (c1808b == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        c1808b.m8447J();
                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                        return;
                    case 7:
                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        PopupWindow popupWindow = readerFragment.f28223G0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 8:
                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 9:
                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                        do {
                            value = c3244l2.getValue();
                            ((Boolean) value).getClass();
                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                        return;
                    case 10:
                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                        return;
                    default:
                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                        return;
                }
            }
        });
        final int i6 = 3;
        we3VarM9288U0.f66713s.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderFragment f34638b;

            {
                this.f34638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object value;
                int i7 = i6;
                ReaderFragment readerFragment = this.f34638b;
                switch (i7) {
                    case 0:
                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 2:
                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 3:
                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 4:
                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                        return;
                    case 5:
                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8776s2(false, true);
                        vz1.m23641m0(readerFragment);
                        ec6 ec6Var = fc6.Companion;
                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                        ec6Var.getClass();
                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                        return;
                    case 6:
                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                        C1808b c1808b = readerFragment.f28230N0;
                        if (c1808b == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        c1808b.m8447J();
                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                        return;
                    case 7:
                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        PopupWindow popupWindow = readerFragment.f28223G0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 8:
                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 9:
                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                        do {
                            value = c3244l2.getValue();
                            ((Boolean) value).getClass();
                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                        return;
                    case 10:
                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                        return;
                    default:
                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                        return;
                }
            }
        });
        final int i7 = 4;
        readerPlayerView.getBinding().f7595c.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderFragment f34638b;

            {
                this.f34638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object value;
                int i8 = i7;
                ReaderFragment readerFragment = this.f34638b;
                switch (i8) {
                    case 0:
                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 2:
                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 3:
                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 4:
                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                        return;
                    case 5:
                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8776s2(false, true);
                        vz1.m23641m0(readerFragment);
                        ec6 ec6Var = fc6.Companion;
                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                        ec6Var.getClass();
                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                        return;
                    case 6:
                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                        C1808b c1808b = readerFragment.f28230N0;
                        if (c1808b == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        c1808b.m8447J();
                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                        return;
                    case 7:
                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        PopupWindow popupWindow = readerFragment.f28223G0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 8:
                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 9:
                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                        do {
                            value = c3244l2.getValue();
                            ((Boolean) value).getClass();
                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                        return;
                    case 10:
                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                        return;
                    default:
                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                        return;
                }
            }
        });
        we3VarM9288U0.f66717w.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ReaderFragment f34638b;

            {
                this.f34638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object value;
                int i8 = i2;
                ReaderFragment readerFragment = this.f34638b;
                switch (i8) {
                    case 0:
                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 1:
                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                        readerFragment.m9286S0();
                        return;
                    case 2:
                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 3:
                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().m9334n3();
                        return;
                    case 4:
                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                        return;
                    case 5:
                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8776s2(false, true);
                        vz1.m23641m0(readerFragment);
                        ec6 ec6Var = fc6.Companion;
                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                        ec6Var.getClass();
                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                        return;
                    case 6:
                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                        C1808b c1808b = readerFragment.f28230N0;
                        if (c1808b == null) {
                            fa4.m11636J("playerController");
                            throw null;
                        }
                        c1808b.m8447J();
                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                        return;
                    case 7:
                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        PopupWindow popupWindow = readerFragment.f28223G0;
                        if (popupWindow != null) {
                            popupWindow.dismiss();
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 8:
                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                        if (popupWindow2 != null) {
                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                            return;
                        } else {
                            fa4.m11636J("popupSettings");
                            throw null;
                        }
                    case 9:
                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                        readerFragment.m9290W0().mo8745Q();
                        readerFragment.m9290W0().mo8747U1();
                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                        do {
                            value = c3244l2.getValue();
                            ((Boolean) value).getClass();
                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                        return;
                    case 10:
                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                        return;
                    default:
                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                        return;
                }
            }
        });
        if (((tw7) sq5Var.getValue()).f63017e) {
            imageView2.setImageResource(R$drawable.ic_sentence_mode_close);
            we3VarM9288U0.f66715u.setImageResource(R$drawable.ic_sentence_review);
            jfa.m14425h(we3VarM9288U0.f66716v);
            final int i8 = 6;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ReaderFragment f34638b;

                {
                    this.f34638b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object value;
                    int i9 = i8;
                    ReaderFragment readerFragment = this.f34638b;
                    switch (i9) {
                        case 0:
                            bh4[] bh4VarArr = ReaderFragment.f28218P0;
                            readerFragment.m9286S0();
                            return;
                        case 1:
                            bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                            readerFragment.m9286S0();
                            return;
                        case 2:
                            bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().m9334n3();
                            return;
                        case 3:
                            bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().m9334n3();
                            return;
                        case 4:
                            bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                            readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                            return;
                        case 5:
                            bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().mo8776s2(false, true);
                            vz1.m23641m0(readerFragment);
                            ec6 ec6Var = fc6.Companion;
                            int iM9332l3 = readerFragment.m9290W0().m9332l3();
                            LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                            ec6Var.getClass();
                            jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                            return;
                        case 6:
                            bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                            C1808b c1808b = readerFragment.f28230N0;
                            if (c1808b == null) {
                                fa4.m11636J("playerController");
                                throw null;
                            }
                            c1808b.m8447J();
                            readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                            return;
                        case 7:
                            bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().mo8745Q();
                            PopupWindow popupWindow = readerFragment.f28223G0;
                            if (popupWindow != null) {
                                popupWindow.dismiss();
                                return;
                            } else {
                                fa4.m11636J("popupSettings");
                                throw null;
                            }
                        case 8:
                            bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().mo8745Q();
                            readerFragment.m9290W0().mo8747U1();
                            PopupWindow popupWindow2 = readerFragment.f28223G0;
                            if (popupWindow2 != null) {
                                popupWindow2.showAsDropDown(view2, 0, 0, 0);
                                return;
                            } else {
                                fa4.m11636J("popupSettings");
                                throw null;
                            }
                        case 9:
                            bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                            readerFragment.m9290W0().mo8745Q();
                            readerFragment.m9290W0().mo8747U1();
                            C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                            do {
                                value = c3244l2.getValue();
                                ((Boolean) value).getClass();
                            } while (!c3244l2.m15570h(value, Boolean.TRUE));
                            return;
                        case 10:
                            bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                            jfa.m14425h(readerFragment.m9288U0().f66693N);
                            jfa.m14425h(readerFragment.m9288U0().f66694O);
                            readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                            return;
                        default:
                            bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                            readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                            return;
                    }
                }
            });
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.feature.reader.old.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                    C2412n c2412nM9290W0 = this.f29175a.m9290W0();
                    c2412nM9290W0.mo8747U1();
                    wfb.m23926u(lda.m16103C(c2412nM9290W0), null, null, new ReaderViewModel$showReview$1(c2412nM9290W0, null), 3);
                }
            });
        }
        LayoutInflater layoutInflaterMo2078E = this.f5702i0;
        if (layoutInflaterMo2078E == null) {
            layoutInflaterMo2078E = mo2078E(null);
            this.f5702i0 = layoutInflaterMo2078E;
        }
        View viewInflate = layoutInflaterMo2078E.inflate(R$layout.menu_reader, (ViewGroup) null, false);
        int i9 = R$id.btnGrammarGuide;
        LinearLayout linearLayout2 = (LinearLayout) lfa.m16159c(viewInflate, i9);
        if (linearLayout2 != null) {
            i9 = R$id.btnHelp;
            LinearLayout linearLayout3 = (LinearLayout) lfa.m16159c(viewInflate, i9);
            if (linearLayout3 != null) {
                i9 = R$id.btnLessonEdit;
                LinearLayout linearLayout4 = (LinearLayout) lfa.m16159c(viewInflate, i9);
                if (linearLayout4 != null) {
                    i9 = R$id.btnLessonInfo;
                    LinearLayout linearLayout5 = (LinearLayout) lfa.m16159c(viewInflate, i9);
                    if (linearLayout5 != null) {
                        i9 = R$id.btnNextLesson;
                        ImageView imageView3 = (ImageView) lfa.m16159c(viewInflate, i9);
                        if (imageView3 != null) {
                            i9 = R$id.btnPreviousLesson;
                            ImageView imageView4 = (ImageView) lfa.m16159c(viewInflate, i9);
                            if (imageView4 != null) {
                                i9 = R$id.btnRefresh;
                                LinearLayout linearLayout6 = (LinearLayout) lfa.m16159c(viewInflate, i9);
                                if (linearLayout6 != null) {
                                    i9 = R$id.btnSettings;
                                    LinearLayout linearLayout7 = (LinearLayout) lfa.m16159c(viewInflate, i9);
                                    if (linearLayout7 != null) {
                                        i9 = R$id.btnSimplifyAi;
                                        LinearLayout linearLayout8 = (LinearLayout) lfa.m16159c(viewInflate, i9);
                                        if (linearLayout8 != null) {
                                            i9 = R$id.btnStatistics;
                                            LinearLayout linearLayout9 = (LinearLayout) lfa.m16159c(viewInflate, i9);
                                            if (linearLayout9 != null && (viewM16159c = lfa.m16159c(viewInflate, (i9 = R$id.divider))) != null) {
                                                i9 = R$id.ivSimplifyAi;
                                                ImageView imageView5 = (ImageView) lfa.m16159c(viewInflate, i9);
                                                if (imageView5 != null) {
                                                    i9 = R$id.ivSimplifyPlus;
                                                    ImageView imageView6 = (ImageView) lfa.m16159c(viewInflate, i9);
                                                    if (imageView6 != null) {
                                                        i9 = R$id.tvLessonTitle;
                                                        TextView textView = (TextView) lfa.m16159c(viewInflate, i9);
                                                        if (textView != null) {
                                                            i9 = R$id.tvSimplifyAi;
                                                            TextView textView2 = (TextView) lfa.m16159c(viewInflate, i9);
                                                            if (textView2 != null) {
                                                                i9 = R$id.viewHeader;
                                                                if (((RelativeLayout) lfa.m16159c(viewInflate, i9)) != null) {
                                                                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                    this.f28224H0 = new fx5(frameLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, imageView3, imageView4, linearLayout6, linearLayout7, linearLayout8, linearLayout9, viewM16159c, imageView5, imageView6, textView, textView2, frameLayout);
                                                                    fx5 fx5Var = this.f28224H0;
                                                                    if (fx5Var == null) {
                                                                        fa4.m11636J("viewLessonMenuBinding");
                                                                        throw null;
                                                                    }
                                                                    this.f28223G0 = new PopupWindow((View) fx5Var.f39852a, jfa.m14418a(m2089Q()) ? -2 : -1, -1, true);
                                                                    fx5 fx5Var2 = this.f28224H0;
                                                                    if (fx5Var2 == null) {
                                                                        fa4.m11636J("viewLessonMenuBinding");
                                                                        throw null;
                                                                    }
                                                                    final int i10 = 7;
                                                                    fx5Var2.f39868q.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ ReaderFragment f34638b;

                                                                        {
                                                                            this.f34638b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                            Object value;
                                                                            int i11 = i10;
                                                                            ReaderFragment readerFragment = this.f34638b;
                                                                            switch (i11) {
                                                                                case 0:
                                                                                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9286S0();
                                                                                    return;
                                                                                case 1:
                                                                                    bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9286S0();
                                                                                    return;
                                                                                case 2:
                                                                                    bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().m9334n3();
                                                                                    return;
                                                                                case 3:
                                                                                    bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().m9334n3();
                                                                                    return;
                                                                                case 4:
                                                                                    bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                                                                                    return;
                                                                                case 5:
                                                                                    bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8776s2(false, true);
                                                                                    vz1.m23641m0(readerFragment);
                                                                                    ec6 ec6Var = fc6.Companion;
                                                                                    int iM9332l3 = readerFragment.m9290W0().m9332l3();
                                                                                    LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                                                                                    ec6Var.getClass();
                                                                                    jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                                                                                    return;
                                                                                case 6:
                                                                                    bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                                                                                    C1808b c1808b = readerFragment.f28230N0;
                                                                                    if (c1808b == null) {
                                                                                        fa4.m11636J("playerController");
                                                                                        throw null;
                                                                                    }
                                                                                    c1808b.m8447J();
                                                                                    readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                                                                                    return;
                                                                                case 7:
                                                                                    bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    PopupWindow popupWindow = readerFragment.f28223G0;
                                                                                    if (popupWindow != null) {
                                                                                        popupWindow.dismiss();
                                                                                        return;
                                                                                    } else {
                                                                                        fa4.m11636J("popupSettings");
                                                                                        throw null;
                                                                                    }
                                                                                case 8:
                                                                                    bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    readerFragment.m9290W0().mo8747U1();
                                                                                    PopupWindow popupWindow2 = readerFragment.f28223G0;
                                                                                    if (popupWindow2 != null) {
                                                                                        popupWindow2.showAsDropDown(view2, 0, 0, 0);
                                                                                        return;
                                                                                    } else {
                                                                                        fa4.m11636J("popupSettings");
                                                                                        throw null;
                                                                                    }
                                                                                case 9:
                                                                                    bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    readerFragment.m9290W0().mo8747U1();
                                                                                    C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                                                                                    do {
                                                                                        value = c3244l2.getValue();
                                                                                        ((Boolean) value).getClass();
                                                                                    } while (!c3244l2.m15570h(value, Boolean.TRUE));
                                                                                    return;
                                                                                case 10:
                                                                                    bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                                                                                    jfa.m14425h(readerFragment.m9288U0().f66693N);
                                                                                    jfa.m14425h(readerFragment.m9288U0().f66694O);
                                                                                    readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                                                                                    return;
                                                                                default:
                                                                                    bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                                                                                    return;
                                                                            }
                                                                        }
                                                                    });
                                                                    final int i11 = 8;
                                                                    we3VarM9288U0.f66698d.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ ReaderFragment f34638b;

                                                                        {
                                                                            this.f34638b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                            Object value;
                                                                            int i12 = i11;
                                                                            ReaderFragment readerFragment = this.f34638b;
                                                                            switch (i12) {
                                                                                case 0:
                                                                                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9286S0();
                                                                                    return;
                                                                                case 1:
                                                                                    bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9286S0();
                                                                                    return;
                                                                                case 2:
                                                                                    bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().m9334n3();
                                                                                    return;
                                                                                case 3:
                                                                                    bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().m9334n3();
                                                                                    return;
                                                                                case 4:
                                                                                    bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                                                                                    return;
                                                                                case 5:
                                                                                    bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8776s2(false, true);
                                                                                    vz1.m23641m0(readerFragment);
                                                                                    ec6 ec6Var = fc6.Companion;
                                                                                    int iM9332l3 = readerFragment.m9290W0().m9332l3();
                                                                                    LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                                                                                    ec6Var.getClass();
                                                                                    jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                                                                                    return;
                                                                                case 6:
                                                                                    bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                                                                                    C1808b c1808b = readerFragment.f28230N0;
                                                                                    if (c1808b == null) {
                                                                                        fa4.m11636J("playerController");
                                                                                        throw null;
                                                                                    }
                                                                                    c1808b.m8447J();
                                                                                    readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                                                                                    return;
                                                                                case 7:
                                                                                    bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    PopupWindow popupWindow = readerFragment.f28223G0;
                                                                                    if (popupWindow != null) {
                                                                                        popupWindow.dismiss();
                                                                                        return;
                                                                                    } else {
                                                                                        fa4.m11636J("popupSettings");
                                                                                        throw null;
                                                                                    }
                                                                                case 8:
                                                                                    bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    readerFragment.m9290W0().mo8747U1();
                                                                                    PopupWindow popupWindow2 = readerFragment.f28223G0;
                                                                                    if (popupWindow2 != null) {
                                                                                        popupWindow2.showAsDropDown(view2, 0, 0, 0);
                                                                                        return;
                                                                                    } else {
                                                                                        fa4.m11636J("popupSettings");
                                                                                        throw null;
                                                                                    }
                                                                                case 9:
                                                                                    bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    readerFragment.m9290W0().mo8747U1();
                                                                                    C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                                                                                    do {
                                                                                        value = c3244l2.getValue();
                                                                                        ((Boolean) value).getClass();
                                                                                    } while (!c3244l2.m15570h(value, Boolean.TRUE));
                                                                                    return;
                                                                                case 10:
                                                                                    bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                                                                                    jfa.m14425h(readerFragment.m9288U0().f66693N);
                                                                                    jfa.m14425h(readerFragment.m9288U0().f66694O);
                                                                                    readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                                                                                    return;
                                                                                default:
                                                                                    bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                                                                                    return;
                                                                            }
                                                                        }
                                                                    });
                                                                    final int i12 = 9;
                                                                    we3VarM9288U0.f66699e.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

                                                                        /* JADX INFO: renamed from: b */
                                                                        public final /* synthetic */ ReaderFragment f34638b;

                                                                        {
                                                                            this.f34638b = this;
                                                                        }

                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view2) {
                                                                            Object value;
                                                                            int i13 = i12;
                                                                            ReaderFragment readerFragment = this.f34638b;
                                                                            switch (i13) {
                                                                                case 0:
                                                                                    bh4[] bh4VarArr = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9286S0();
                                                                                    return;
                                                                                case 1:
                                                                                    bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9286S0();
                                                                                    return;
                                                                                case 2:
                                                                                    bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().m9334n3();
                                                                                    return;
                                                                                case 3:
                                                                                    bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().m9334n3();
                                                                                    return;
                                                                                case 4:
                                                                                    bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                                                                                    return;
                                                                                case 5:
                                                                                    bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8776s2(false, true);
                                                                                    vz1.m23641m0(readerFragment);
                                                                                    ec6 ec6Var = fc6.Companion;
                                                                                    int iM9332l3 = readerFragment.m9290W0().m9332l3();
                                                                                    LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                                                                                    ec6Var.getClass();
                                                                                    jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                                                                                    return;
                                                                                case 6:
                                                                                    bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                                                                                    C1808b c1808b = readerFragment.f28230N0;
                                                                                    if (c1808b == null) {
                                                                                        fa4.m11636J("playerController");
                                                                                        throw null;
                                                                                    }
                                                                                    c1808b.m8447J();
                                                                                    readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                                                                                    return;
                                                                                case 7:
                                                                                    bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    PopupWindow popupWindow = readerFragment.f28223G0;
                                                                                    if (popupWindow != null) {
                                                                                        popupWindow.dismiss();
                                                                                        return;
                                                                                    } else {
                                                                                        fa4.m11636J("popupSettings");
                                                                                        throw null;
                                                                                    }
                                                                                case 8:
                                                                                    bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    readerFragment.m9290W0().mo8747U1();
                                                                                    PopupWindow popupWindow2 = readerFragment.f28223G0;
                                                                                    if (popupWindow2 != null) {
                                                                                        popupWindow2.showAsDropDown(view2, 0, 0, 0);
                                                                                        return;
                                                                                    } else {
                                                                                        fa4.m11636J("popupSettings");
                                                                                        throw null;
                                                                                    }
                                                                                case 9:
                                                                                    bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9290W0().mo8745Q();
                                                                                    readerFragment.m9290W0().mo8747U1();
                                                                                    C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                                                                                    do {
                                                                                        value = c3244l2.getValue();
                                                                                        ((Boolean) value).getClass();
                                                                                    } while (!c3244l2.m15570h(value, Boolean.TRUE));
                                                                                    return;
                                                                                case 10:
                                                                                    bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                                                                                    jfa.m14425h(readerFragment.m9288U0().f66693N);
                                                                                    jfa.m14425h(readerFragment.m9288U0().f66694O);
                                                                                    readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                                                                                    return;
                                                                                default:
                                                                                    bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                                                                                    readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                                                                                    return;
                                                                            }
                                                                        }
                                                                    });
                                                                    hm5 hm5Var = this.f28228L0;
                                                                    if (hm5Var == null) {
                                                                        fa4.m11636J("analytics");
                                                                        throw null;
                                                                    }
                                                                    readerPlayerView.setupViews(hm5Var);
                                                                    readerPlayerView.setPlayerControlsListener(new web(this));
                                                                    we3VarM9288U0.f66710p.setOnTouchListener(new ew7(i4, this, we3VarM9288U0));
                                                                    hy7 hy7Var = new hy7(this);
                                                                    hy7Var.f43215m = EmptyList.f47638a;
                                                                    this.f28219C0 = hy7Var;
                                                                    ViewPager2 viewPager4 = m9288U0().f66709o;
                                                                    hy7 hy7Var2 = this.f28219C0;
                                                                    if (hy7Var2 == null) {
                                                                        fa4.m11636J("readerPagerAdapter");
                                                                        throw null;
                                                                    }
                                                                    viewPager4.setAdapter(hy7Var2);
                                                                    readerProgressBar.setOnPageChangedListener(new vqb(this, 25));
                                                                    viewPager2.setOffscreenPageLimit(-1);
                                                                    if (AbstractC3184kh.m15194A(m9290W0().f29340b.mo4589b2())) {
                                                                        readerProgressBar.f30423c0 = true;
                                                                        readerProgressBar.m9428l();
                                                                        i = 1;
                                                                    } else {
                                                                        i = 0;
                                                                    }
                                                                    viewPager2.setLayoutDirection(i);
                                                                    hy7 hy7Var3 = this.f28219C0;
                                                                    if (hy7Var3 == null) {
                                                                        fa4.m11636J("readerPagerAdapter");
                                                                        throw null;
                                                                    }
                                                                    hy7Var3.f55488c = RecyclerView$Adapter$StateRestorationPolicy.ALLOW;
                                                                    hy7Var3.f55486a.m19623g();
                                                                    hy7 hy7Var4 = this.f28219C0;
                                                                    if (hy7Var4 == null) {
                                                                        fa4.m11636J("readerPagerAdapter");
                                                                        throw null;
                                                                    }
                                                                    viewPager2.setAdapter(hy7Var4);
                                                                    final int i13 = 10;
                                                                    if (((tw7) sq5Var.getValue()).f63017e) {
                                                                        we3VarM9288U0.f66692M.setBackgroundColor(jfa.m14431n(m2090R(), com.lingq.core.designsystem.R$attr.fadeBgColor));
                                                                        imageView.setImageResource(R$drawable.ic_sentence_mode_close);
                                                                        MaterialCardView materialCardView = we3VarM9288U0.f66702h;
                                                                        q39 q39VarM20285l = materialCardView.getShapeAppearanceModel().m20285l();
                                                                        q39VarM20285l.f57203h = new C3479q(0.0f);
                                                                        q39VarM20285l.f57202g = new C3479q(0.0f);
                                                                        q39VarM20285l.f57200e = new C3479q(m2090R().getResources().getDimension(R$dimen.btn_corner_large));
                                                                        q39VarM20285l.f57201f = new C3479q(m2090R().getResources().getDimension(R$dimen.btn_corner_large));
                                                                        materialCardView.setShapeAppearanceModel(q39VarM20285l.m19627a());
                                                                        jfa.m14425h(we3VarM9288U0.f66685F);
                                                                        jfa.m14425h(we3VarM9288U0.f66719y);
                                                                        jfa.m14425h(we3VarM9288U0.f66718x);
                                                                        m9288U0().f66700f.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

                                                                            /* JADX INFO: renamed from: b */
                                                                            public final /* synthetic */ ReaderFragment f34638b;

                                                                            {
                                                                                this.f34638b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view2) {
                                                                                Object value;
                                                                                int i14 = i13;
                                                                                ReaderFragment readerFragment = this.f34638b;
                                                                                switch (i14) {
                                                                                    case 0:
                                                                                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9286S0();
                                                                                        return;
                                                                                    case 1:
                                                                                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9286S0();
                                                                                        return;
                                                                                    case 2:
                                                                                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().m9334n3();
                                                                                        return;
                                                                                    case 3:
                                                                                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().m9334n3();
                                                                                        return;
                                                                                    case 4:
                                                                                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                                                                                        return;
                                                                                    case 5:
                                                                                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8776s2(false, true);
                                                                                        vz1.m23641m0(readerFragment);
                                                                                        ec6 ec6Var = fc6.Companion;
                                                                                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                                                                                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                                                                                        ec6Var.getClass();
                                                                                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                                                                                        return;
                                                                                    case 6:
                                                                                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                                                                                        C1808b c1808b = readerFragment.f28230N0;
                                                                                        if (c1808b == null) {
                                                                                            fa4.m11636J("playerController");
                                                                                            throw null;
                                                                                        }
                                                                                        c1808b.m8447J();
                                                                                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                                                                                        return;
                                                                                    case 7:
                                                                                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8745Q();
                                                                                        PopupWindow popupWindow = readerFragment.f28223G0;
                                                                                        if (popupWindow != null) {
                                                                                            popupWindow.dismiss();
                                                                                            return;
                                                                                        } else {
                                                                                            fa4.m11636J("popupSettings");
                                                                                            throw null;
                                                                                        }
                                                                                    case 8:
                                                                                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8745Q();
                                                                                        readerFragment.m9290W0().mo8747U1();
                                                                                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                                                                                        if (popupWindow2 != null) {
                                                                                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                                                                                            return;
                                                                                        } else {
                                                                                            fa4.m11636J("popupSettings");
                                                                                            throw null;
                                                                                        }
                                                                                    case 9:
                                                                                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8745Q();
                                                                                        readerFragment.m9290W0().mo8747U1();
                                                                                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                                                                                        do {
                                                                                            value = c3244l2.getValue();
                                                                                            ((Boolean) value).getClass();
                                                                                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                                                                                        return;
                                                                                    case 10:
                                                                                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                                                                                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                                                                                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                                                                                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                                                                                        return;
                                                                                    default:
                                                                                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                        final int i14 = 11;
                                                                        m9288U0().f66701g.setOnClickListener(new View.OnClickListener(this) { // from class: cw7

                                                                            /* JADX INFO: renamed from: b */
                                                                            public final /* synthetic */ ReaderFragment f34638b;

                                                                            {
                                                                                this.f34638b = this;
                                                                            }

                                                                            @Override // android.view.View.OnClickListener
                                                                            public final void onClick(View view2) {
                                                                                Object value;
                                                                                int i15 = i14;
                                                                                ReaderFragment readerFragment = this.f34638b;
                                                                                switch (i15) {
                                                                                    case 0:
                                                                                        bh4[] bh4VarArr = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9286S0();
                                                                                        return;
                                                                                    case 1:
                                                                                        bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9286S0();
                                                                                        return;
                                                                                    case 2:
                                                                                        bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().m9334n3();
                                                                                        return;
                                                                                    case 3:
                                                                                        bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().m9334n3();
                                                                                        return;
                                                                                    case 4:
                                                                                        bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, false));
                                                                                        return;
                                                                                    case 5:
                                                                                        bh4[] bh4VarArr6 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8776s2(false, true);
                                                                                        vz1.m23641m0(readerFragment);
                                                                                        ec6 ec6Var = fc6.Companion;
                                                                                        int iM9332l3 = readerFragment.m9290W0().m9332l3();
                                                                                        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = ((tw7) readerFragment.f28222F0.getValue()).f63014b;
                                                                                        ec6Var.getClass();
                                                                                        jfa.m14428k(b34.m3244j(readerFragment), new bc6(iM9332l3, lqAnalyticsValues$LessonPath, "", ""), null);
                                                                                        return;
                                                                                    case 6:
                                                                                        bh4[] bh4VarArr7 = ReaderFragment.f28218P0;
                                                                                        C1808b c1808b = readerFragment.f28230N0;
                                                                                        if (c1808b == null) {
                                                                                            fa4.m11636J("playerController");
                                                                                            throw null;
                                                                                        }
                                                                                        c1808b.m8447J();
                                                                                        readerFragment.m9290W0().m9339s3(ReviewType.Integrated);
                                                                                        return;
                                                                                    case 7:
                                                                                        bh4[] bh4VarArr8 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8745Q();
                                                                                        PopupWindow popupWindow = readerFragment.f28223G0;
                                                                                        if (popupWindow != null) {
                                                                                            popupWindow.dismiss();
                                                                                            return;
                                                                                        } else {
                                                                                            fa4.m11636J("popupSettings");
                                                                                            throw null;
                                                                                        }
                                                                                    case 8:
                                                                                        bh4[] bh4VarArr9 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8745Q();
                                                                                        readerFragment.m9290W0().mo8747U1();
                                                                                        PopupWindow popupWindow2 = readerFragment.f28223G0;
                                                                                        if (popupWindow2 != null) {
                                                                                            popupWindow2.showAsDropDown(view2, 0, 0, 0);
                                                                                            return;
                                                                                        } else {
                                                                                            fa4.m11636J("popupSettings");
                                                                                            throw null;
                                                                                        }
                                                                                    case 9:
                                                                                        bh4[] bh4VarArr10 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9290W0().mo8745Q();
                                                                                        readerFragment.m9290W0().mo8747U1();
                                                                                        C3244l c3244l2 = readerFragment.m9290W0().f29294L1;
                                                                                        do {
                                                                                            value = c3244l2.getValue();
                                                                                            ((Boolean) value).getClass();
                                                                                        } while (!c3244l2.m15570h(value, Boolean.TRUE));
                                                                                        return;
                                                                                    case 10:
                                                                                        bh4[] bh4VarArr11 = ReaderFragment.f28218P0;
                                                                                        jfa.m14425h(readerFragment.m9288U0().f66693N);
                                                                                        jfa.m14425h(readerFragment.m9288U0().f66694O);
                                                                                        readerFragment.m9288U0().f66694O.m9820a(new hw7(0));
                                                                                        return;
                                                                                    default:
                                                                                        bh4[] bh4VarArr12 = ReaderFragment.f28218P0;
                                                                                        readerFragment.m9289V0().m23737z(new aa6(readerFragment.m9290W0().m9332l3(), true, true));
                                                                                        return;
                                                                                }
                                                                            }
                                                                        });
                                                                    }
                                                                    ComposeView composeView = m9288U0().f66681B;
                                                                    C0411w c0411w = C0411w.f4868a;
                                                                    composeView.setViewCompositionStrategy(c0411w);
                                                                    composeView.setContent(new C0282a(1910191120, true, new bw7(this, i12)));
                                                                    ComposeView composeView2 = m9288U0().f66690K;
                                                                    composeView2.setViewCompositionStrategy(c0411w);
                                                                    composeView2.setContent(new C0282a(-1489677127, true, new bw7(this, i13)));
                                                                    ComposeView composeView3 = m9288U0().f66687H;
                                                                    composeView3.setViewCompositionStrategy(c0411w);
                                                                    composeView3.setContent(new C0282a(-1253507304, true, new bw7(this, i4)));
                                                                    ComposeView composeView4 = m9288U0().f66683D;
                                                                    composeView4.setViewCompositionStrategy(c0411w);
                                                                    composeView4.setContent(new C0282a(-1017337481, true, new bw7(this, i5)));
                                                                    ComposeView composeView5 = m9288U0().f66691L;
                                                                    composeView5.setViewCompositionStrategy(c0411w);
                                                                    composeView5.setContent(new C0282a(-781167658, true, new bw7(this, 3)));
                                                                    Lifecycle$State lifecycle$State = Lifecycle$State.STARTED;
                                                                    wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2274x876c30d6(this, lifecycle$State, null, this), 3);
                                                                    wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2273x2affaa79(this, Lifecycle$State.RESUMED, null, this), 3);
                                                                    wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2275x876c30d7(this, lifecycle$State, null, this), 3);
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i9)));
    }

    /* JADX INFO: renamed from: S0 */
    public final void m9286S0() {
        m9290W0().mo50y(LqAnalyticsValues$LessonExitPath.QuitLesson);
        if (m2115q()) {
            b34.m3244j(this).m22689f();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final C3509qs m9287T0() {
        C3509qs c3509qs = this.f28229M0;
        if (c3509qs != null) {
            return c3509qs;
        }
        fa4.m11636J("appSettings");
        throw null;
    }

    /* JADX INFO: renamed from: U0 */
    public final we3 m9288U0() {
        return (we3) this.f28220D0.getValue(this, f28218P0[0]);
    }

    /* JADX INFO: renamed from: V0 */
    public final w41 m9289V0() {
        w41 w41Var = this.f28231O0;
        if (w41Var != null) {
            return w41Var;
        }
        fa4.m11636J("navGraphController");
        throw null;
    }

    /* JADX INFO: renamed from: W0 */
    public final C2412n m9290W0() {
        return (C2412n) this.f28221E0.getValue();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m9291X0(boolean z) {
        we3 we3VarM9288U0 = m9288U0();
        Animation animation = we3VarM9288U0.f66707m.f34901c.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        we3VarM9288U0.f66707m.f34901c.animate().setDuration(100L).alpha(z ? 1.0f : 0.0f).setListener(new fw7(this, we3VarM9288U0, z));
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m9292Y0() {
        return vz1.m23653w(this) && ((Boolean) m9290W0().f29296M0.getValue()).booleanValue();
    }
}
