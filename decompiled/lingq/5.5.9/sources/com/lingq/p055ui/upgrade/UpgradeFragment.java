package com.lingq.p055ui.upgrade;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.platform.ComposeView;
import androidx.compose.p017ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.fragment.app.C0987y;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.Lifecycle;
import androidx.view.compose.C1026a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.crashlytics.internal.common.C3213b;
import com.lingq.p055ui.MainViewModel;
import com.lingq.p055ui.theme.ThemeKt;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;
import mo.C7661i;
import ni.C7796d;
import no.C7828f;
import p015ak.ViewOnClickListenerC0111h;
import p040c4.C1681f;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p118fe.C5509a;
import p155he.C6041e;
import p205jk.AbstractC6507c;
import p205jk.C6510f;
import p205jk.C6511g;
import p205jk.C6514j;
import p225kk.C6704a;
import p225kk.C6716m;
import p230l0.C7204a;
import p241le.C7352w;
import p241le.CallableC7345p;
import p260m8.C7499b;
import p278nh.C7776c;
import p289o5.C7926f;
import p322pd.C8228i;
import p338qd.C8573r0;
import p385sf.C9000b;
import p402u0.C9369l;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import ph.C8252a2;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/upgrade/UpgradeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UpgradeFragment extends AbstractC6507c {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f31981F0 = {C0204c.m857q(UpgradeFragment.class, "getBinding()Lcom/lingq/databinding/FragmentUpgradeBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final C1038i0 f31982A0;

    /* JADX INFO: renamed from: B0 */
    public final FragmentViewBindingDelegate f31983B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f31984C0;

    /* JADX INFO: renamed from: D0 */
    public C7796d f31985D0;

    /* JADX INFO: renamed from: E0 */
    public C6704a f31986E0;

    public UpgradeFragment() {
        super(R.layout.fragment_upgrade);
        this.f31982A0 = C8573r0.m16711Z(this, C5209i.m11118a(MainViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.upgrade.UpgradeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                C1046m0 c1046m0Mo796n = this.m3576Y().mo796n();
                C5207g.m11110e(c1046m0Mo796n, "requireActivity().viewModelStore");
                return c1046m0Mo796n;
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.upgrade.UpgradeFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                return this.m3576Y().mo792j();
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.upgrade.UpgradeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i = this.m3576Y().mo470i();
                C5207g.m11110e(bVarMo470i, "requireActivity().defaultViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f31983B0 = C4924a.m10477o0(this, UpgradeFragment$binding$2.f31987j);
        this.f31984C0 = new C1681f(C5209i.m11118a(C6511g.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.upgrade.UpgradeFragment$special$$inlined$navArgs$1
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

    /* JADX WARN: Type inference failed for: r2v13, types: [com.lingq.ui.upgrade.UpgradeFragment$setupUpgradeItems$1$1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C9369l c9369l = new C9369l(26, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c9369l);
        C8228i c8228i = new C8228i(1, true);
        c8228i.f48293c = 400L;
        m3585f0(c8228i);
        C8228i c8228i2 = new C8228i(1, false);
        c8228i2.f48293c = 400L;
        m3589h0(c8228i2);
        C7796d c7796d = this.f31985D0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "show_upgrade_packages");
        String str = m10407o0().f37140a;
        MainViewModel mainViewModelM10409q0 = m10409q0();
        C5207g.m11111f(str, "attemptedAction");
        mainViewModelM10409q0.f22294i0.setValue(str);
        C8252a2 c8252a2M10408p0 = m10408p0();
        c8252a2M10408p0.f44566k.setOnClickListener(new ViewOnClickListenerC0111h(4, this));
        TextView textView = c8252a2M10408p0.f44560e;
        C5207g.m11110e(textView, "tvGetStartedFree");
        String strM3600t = m3600t(R.string.upgrade_not_ready_to_upgrade);
        C5207g.m11110e(strM3600t, "getString(R.string.upgrade_not_ready_to_upgrade)");
        String strM3600t2 = m3600t(R.string.upgrade_get_started_for_free);
        C5207g.m11110e(strM3600t2, "getString(R.string.upgrade_get_started_for_free)");
        C4924a.m10453c0(textView, strM3600t, strM3600t2, R.attr.blueTint, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$4$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
                this.f31994b.m10410r0();
                return C9072e.f47360a;
            }
        }, 8);
        boolean zM11106a = C5207g.m11106a(str, "Blue Word Clicked");
        TextView textView2 = c8252a2M10408p0.f44565j;
        if (zM11106a) {
            textView2.setText(m3600t(R.string.upgrade_premium_unlimited_lingqs));
        } else {
            List<Integer> list = C6716m.f37937a;
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C6716m.m13333r(R.attr.colorSecondary, m3578a0()));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m3600t(C5207g.m11106a(m10406n0().m13299a(), "UpgradeTest") ? R.string.upgrade_get_premium : R.string.upgrade_reach_your_goals));
            String strM3600t3 = m3600t(R.string.upgrade_reach_your_goals_substring_lingq_premium);
            C5207g.m11110e(strM3600t3, "getString(R.string.upgra…_substring_lingq_premium)");
            try {
                spannableStringBuilder.setSpan(foregroundColorSpan, C7076b.m14285e3(spannableStringBuilder, strM3600t3, 0, false, 6), C7076b.m14285e3(spannableStringBuilder, strM3600t3, 0, false, 6) + strM3600t3.length(), 33);
            } catch (Exception unused) {
                C6041e c6041eM12476a = C6041e.m12476a();
                String strM852k = C0204c.m852k("Error setting span in UpgradeFragment with language ", m10409q0().f22269P);
                C7352w c7352w = c6041eM12476a.f35688a;
                c7352w.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - c7352w.f41097d;
                C3213b c3213b = c7352w.f41100g;
                c3213b.getClass();
                c3213b.f16209e.m14749a(new CallableC7345p(c3213b, jCurrentTimeMillis, strM852k));
            }
            textView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
        if (C5207g.m11106a(m10406n0().m13299a(), "UpgradeTest")) {
            c8252a2M10408p0.f44559d.setText(m3600t(R.string.upgrade_save_unlimited_words));
            c8252a2M10408p0.f44558c.setText(m3600t(R.string.upgrade_import_unlimited_lessons));
            c8252a2M10408p0.f44562g.setText(m3600t(R.string.upgrade_see_translations));
        }
        Locale locale = Locale.getDefault();
        String strM3600t4 = m3600t(R.string.upgrade_reviews);
        C5207g.m11110e(strM3600t4, "getString(R.string.upgrade_reviews)");
        c8252a2M10408p0.f44563h.setText(C0141b.m613i(new Object[]{"24,129"}, 1, locale, strM3600t4, "format(locale, format, *args)"));
        TextView textView3 = c8252a2M10408p0.f44561f;
        textView3.setTransformationMethod(null);
        C7776c c7776c = C7776c.f42711a;
        textView3.setMovementMethod(c7776c);
        TextView textView4 = c8252a2M10408p0.f44564i;
        textView4.setTransformationMethod(null);
        textView4.setMovementMethod(c7776c);
        List<Integer> list2 = C6716m.f37937a;
        Context contextM3578a0 = m3578a0();
        String strM3600t5 = m3600t(R.string.welcome_by_using_lingq_substring_privacy_policy);
        C5207g.m11110e(strM3600t5, "getString(R.string.welco…substring_privacy_policy)");
        textView3.setText(C6716m.m13332q(contextM3578a0, strM3600t5), TextView.BufferType.SPANNABLE);
        Context contextM3578a1 = m3578a0();
        String strM3600t6 = m3600t(R.string.welcome_by_using_lingq_substring_terms_of_service);
        C5207g.m11110e(strM3600t6, "getString(R.string.welco…bstring_terms_of_service)");
        textView4.setText(C6716m.m13332q(contextM3578a1, strM3600t6), TextView.BufferType.SPANNABLE);
        c8252a2M10408p0.f44557b.setOnScrollChangeListener(new C5509a(24, c8252a2M10408p0));
        ComposeView composeView = m10408p0().f44567l;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f4204a);
        composeView.setContent(C7204a.m14523c(-1417918551, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeFragment$setupUpgradeItems$1$1
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r7v5, types: [com.lingq.ui.upgrade.UpgradeFragment$setupUpgradeItems$1$1$1, kotlin.jvm.internal.Lambda] */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                    interfaceC0476a2.mo1650q();
                } else {
                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                    final UpgradeFragment upgradeFragment = this.f32007b;
                    ThemeKt.m10361a(false, C7204a.m14522b(interfaceC0476a2, 1639606949, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeFragment$setupUpgradeItems$1$1.1
                        {
                            super(2);
                        }

                        /* JADX WARN: Code duplicated, block: B:102:0x02fe A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:103:0x0300  */
                        /* JADX WARN: Code duplicated, block: B:104:0x0303  */
                        /* JADX WARN: Code duplicated, block: B:107:0x0353  */
                        /* JADX WARN: Code duplicated, block: B:108:0x0370  */
                        /* JADX WARN: Code duplicated, block: B:110:0x038b  */
                        /* JADX WARN: Code duplicated, block: B:112:0x03a4 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:113:0x03a6  */
                        /* JADX WARN: Code duplicated, block: B:116:0x03ee  */
                        /* JADX WARN: Code duplicated, block: B:117:0x040f  */
                        /* JADX WARN: Code duplicated, block: B:120:0x0482  */
                        /* JADX WARN: Code duplicated, block: B:122:0x0495 A[DONT_INVERT] */
                        /* JADX WARN: Code duplicated, block: B:123:0x0497  */
                        /* JADX WARN: Code duplicated, block: B:126:0x04de  */
                        /* JADX WARN: Code duplicated, block: B:127:0x0500  */
                        /* JADX WARN: Code duplicated, block: B:130:0x0530  */
                        /* JADX WARN: Code duplicated, block: B:131:0x0538  */
                        /* JADX WARN: Code duplicated, block: B:134:0x058f  */
                        /* JADX WARN: Code duplicated, block: B:54:0x022f  */
                        /* JADX WARN: Code duplicated, block: B:55:0x0232  */
                        /* JADX WARN: Code duplicated, block: B:93:0x02cd  */
                        /* JADX WARN: Code duplicated, block: B:95:0x02d1  */
                        /* JADX WARN: Code duplicated, block: B:96:0x02d4  */
                        /* JADX WARN: Instruction removed from duplicated block: B:110:0x038b, please report this as an issue */
                        @Override // cm.InterfaceC2056p
                        /* JADX INFO: renamed from: m0 */
                        public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a3, Integer num2) {
                            Object obj;
                            final UpgradeFragment upgradeFragment2;
                            List listM17252r;
                            Iterator it;
                            C7926f.d dVar;
                            Object next;
                            C7926f.b bVar;
                            String str2;
                            MainViewModel mainViewModelM10409q1;
                            String str3;
                            String str4;
                            boolean z10;
                            ArrayList arrayList;
                            String str5;
                            UpgradeFragment upgradeFragment3;
                            String str6;
                            String str7;
                            ArrayList arrayList2;
                            String str8;
                            UpgradeFragment upgradeFragment4;
                            String str9;
                            C6514j c6514j;
                            String str10;
                            double d10;
                            String str11;
                            String strM613i;
                            String strM3600t7;
                            double d11;
                            String strM613i2;
                            long j10;
                            double d12;
                            String strM613i3;
                            C7926f.c cVar;
                            ArrayList arrayList3;
                            Object next2;
                            Iterator it2;
                            C7926f.d dVar2;
                            Object next3;
                            C7926f.b bVar2;
                            long j11;
                            C7926f.c cVar2;
                            ArrayList arrayList4;
                            Object next4;
                            InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                            if ((num2.intValue() & 11) == 2 && interfaceC0476a4.mo1642m()) {
                                interfaceC0476a4.mo1650q();
                            } else {
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
                                UpgradeFragment upgradeFragment5 = upgradeFragment;
                                InterfaceC5312g0 interfaceC5312g0M3932a = C1026a.m3932a(upgradeFragment5.m10409q0().f22275V, interfaceC0476a4);
                                NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
                                C5207g.m11110e(currencyInstance, "getCurrencyInstance(Locale.getDefault())");
                                currencyInstance.setMaximumFractionDigits(2);
                                boolean z11 = (C7661i.m15250P2(upgradeFragment5.m10407o0().f37141b) ^ true) && !C5207g.m11106a(upgradeFragment5.m10407o0().f37141b, "lingq-standard");
                                String str12 = "getString(R.string.upgrade_six_months)";
                                String str13 = "getString(R.string.upgrade_twelve_months)";
                                if (((List) interfaceC5312g0M3932a.getValue()).isEmpty()) {
                                    String str14 = upgradeFragment5.m10409q0().f22273T;
                                    String strM3600t8 = upgradeFragment5.m3600t(R.string.upgrade_twelve_months);
                                    C5207g.m11110e(strM3600t8, "getString(R.string.upgrade_twelve_months)");
                                    String strM613i4 = C0141b.m613i(new Object[]{"$10,42", upgradeFragment5.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), "%s/%s", "format(locale, format, *args)");
                                    Locale locale2 = Locale.getDefault();
                                    String strM3600t9 = upgradeFragment5.m3600t(R.string.upgrade_save_amount1);
                                    C5207g.m11110e(strM3600t9, "getString(R.string.upgrade_save_amount1)");
                                    String strM613i5 = C0141b.m613i(new Object[]{"25%"}, 1, locale2, strM3600t9, "format(locale, format, *args)");
                                    obj = "UpgradeTest";
                                    String str15 = upgradeFragment5.m10409q0().f22271R;
                                    String strM3600t10 = upgradeFragment5.m3600t(R.string.upgrade_one_month);
                                    C5207g.m11110e(strM3600t10, "getString(R.string.upgrade_one_month)");
                                    Locale locale3 = Locale.getDefault();
                                    Object[] objArr = {"$13,99", upgradeFragment5.m3600t(R.string.upgrade_subscribe_substring_month)};
                                    String str16 = upgradeFragment5.m10409q0().f22272S;
                                    String strM3600t11 = upgradeFragment5.m3600t(R.string.upgrade_six_months);
                                    C5207g.m11110e(strM3600t11, "getString(R.string.upgrade_six_months)");
                                    String strM613i6 = C0141b.m613i(new Object[]{"$13,33", upgradeFragment5.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), "%s/%s", "format(locale, format, *args)");
                                    Locale locale4 = Locale.getDefault();
                                    String strM3600t12 = upgradeFragment5.m3600t(R.string.upgrade_save_amount1);
                                    C5207g.m11110e(strM3600t12, "getString(R.string.upgrade_save_amount1)");
                                    listM17252r = C9000b.m17252r(new C6514j(str14, strM3600t8, "$124,99", strM613i4, strM613i5, true, z11), new C6514j(str15, strM3600t10, "$13,99", C0141b.m613i(objArr, 2, locale3, "%s/%s", "format(locale, format, *args)"), "", 96), new C6514j(str16, strM3600t11, "$79,99", strM613i6, C0141b.m613i(new Object[]{"4%"}, 1, locale4, strM3600t12, "format(locale, format, *args)"), 96));
                                    upgradeFragment2 = upgradeFragment5;
                                } else {
                                    String str17 = "%s/%s";
                                    obj = "UpgradeTest";
                                    String str18 = "getString(R.string.upgrade_one_month)";
                                    String str19 = "getString(R.string.upgrade_save_amount1)";
                                    String str20 = "format(locale, format, *args)";
                                    Iterator it3 = ((List) interfaceC5312g0M3932a.getValue()).iterator();
                                    double d13 = 0.0d;
                                    while (true) {
                                        C7926f.b bVar3 = null;
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        C7926f c7926f = (C7926f) it3.next();
                                        if (C5207g.m11106a(c7926f.f43192c, upgradeFragment5.m10409q0().f22271R)) {
                                            ArrayList arrayList5 = c7926f.f43197h;
                                            if (arrayList5 != null) {
                                                Iterator it4 = arrayList5.iterator();
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        it2 = it3;
                                                        next4 = null;
                                                        break;
                                                    }
                                                    next4 = it4.next();
                                                    it2 = it3;
                                                    if (((C7926f.d) next4).f43205c.contains(upgradeFragment5.m10407o0().f37141b)) {
                                                        break;
                                                    }
                                                    it3 = it2;
                                                }
                                                dVar2 = (C7926f.d) next4;
                                                if (dVar2 == null) {
                                                }
                                                if (dVar2 != null && (cVar2 = dVar2.f43204b) != null && (arrayList4 = cVar2.f43202a) != null) {
                                                    bVar3 = (C7926f.b) C6752c.m13425S(arrayList4);
                                                }
                                                bVar2 = bVar3;
                                                if (bVar2 != null) {
                                                    j11 = bVar2.f43200a;
                                                } else {
                                                    j11 = 0;
                                                }
                                                d13 = j11 / 1000000.0f;
                                            } else {
                                                it2 = it3;
                                            }
                                            if (arrayList5 != null) {
                                                Iterator it5 = arrayList5.iterator();
                                                do {
                                                    if (!it5.hasNext()) {
                                                        next3 = null;
                                                        break;
                                                    }
                                                    next3 = it5.next();
                                                } while (!((C7926f.d) next3).f43205c.isEmpty());
                                                dVar2 = (C7926f.d) next3;
                                            } else {
                                                dVar2 = null;
                                            }
                                            if (dVar2 != null) {
                                                bVar3 = (C7926f.b) C6752c.m13425S(arrayList4);
                                            }
                                            bVar2 = bVar3;
                                            if (bVar2 != null) {
                                                j11 = bVar2.f43200a;
                                            } else {
                                                j11 = 0;
                                            }
                                            d13 = j11 / 1000000.0f;
                                        } else {
                                            it2 = it3;
                                        }
                                        it3 = it2;
                                    }
                                    List list3 = (List) interfaceC5312g0M3932a.getValue();
                                    ArrayList arrayList6 = new ArrayList(C9325m.m17681z(list3, 10));
                                    Iterator it6 = list3.iterator();
                                    while (it6.hasNext()) {
                                        C7926f c7926f2 = (C7926f) it6.next();
                                        ArrayList arrayList7 = c7926f2.f43197h;
                                        try {
                                            if (arrayList7 != null) {
                                                Iterator it7 = arrayList7.iterator();
                                                while (true) {
                                                    if (!it7.hasNext()) {
                                                        it = it6;
                                                        next2 = null;
                                                        break;
                                                    }
                                                    next2 = it7.next();
                                                    it = it6;
                                                    if (((C7926f.d) next2).f43205c.contains(upgradeFragment5.m10407o0().f37141b)) {
                                                        break;
                                                    }
                                                    it6 = it;
                                                }
                                                dVar = (C7926f.d) next2;
                                                if (dVar == null) {
                                                }
                                                if (dVar != null || (cVar = dVar.f43204b) == null || (arrayList3 = cVar.f43202a) == null) {
                                                    bVar = null;
                                                } else {
                                                    bVar = (C7926f.b) C6752c.m13425S(arrayList3);
                                                }
                                                if (bVar != null) {
                                                    str2 = bVar.f43201b;
                                                } else {
                                                    str2 = null;
                                                }
                                                currencyInstance.setCurrency(Currency.getInstance(str2));
                                                mainViewModelM10409q1 = upgradeFragment5.m10409q0();
                                                str3 = c7926f2.f43192c;
                                                if (C5207g.m11106a(str3, mainViewModelM10409q1.f22271R)) {
                                                    if (bVar != null) {
                                                        j10 = bVar.f43200a;
                                                    } else {
                                                        j10 = 0;
                                                    }
                                                    d12 = j10 / 1000000.0f;
                                                    String str21 = upgradeFragment5.m10409q0().f22271R;
                                                    arrayList = arrayList6;
                                                    String strM3600t13 = upgradeFragment5.m3600t(R.string.upgrade_one_month);
                                                    C5207g.m11110e(strM3600t13, str18);
                                                    str4 = str18;
                                                    z10 = z11;
                                                    str5 = str13;
                                                    String strM613i7 = C0141b.m613i(new Object[]{currencyInstance.format(d12), upgradeFragment5.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str17, str20);
                                                    if (C5207g.m11106a(upgradeFragment5.m10406n0().m13299a(), obj)) {
                                                        Locale locale5 = Locale.getDefault();
                                                        String strM3600t14 = upgradeFragment5.m3600t(R.string.upgrade_price_month_abbr);
                                                        C5207g.m11110e(strM3600t14, "getString(\n             …                        )");
                                                        strM613i3 = C0141b.m613i(new Object[]{currencyInstance.format(d12)}, 1, locale5, strM3600t14, str20);
                                                    } else {
                                                        strM613i3 = "";
                                                    }
                                                    c6514j = new C6514j(str21, strM3600t13, strM613i7, strM613i3, null, 112);
                                                } else {
                                                    str4 = str18;
                                                    z10 = z11;
                                                    arrayList = arrayList6;
                                                    str5 = str13;
                                                    if (C5207g.m11106a(str3, upgradeFragment5.m10409q0().f22272S)) {
                                                        d11 = ((bVar != null ? bVar.f43200a : 0.0f) / 6.0f) / 1000000.0f;
                                                        String str22 = upgradeFragment5.m10409q0().f22272S;
                                                        String strM3600t15 = upgradeFragment5.m3600t(R.string.upgrade_six_months);
                                                        C5207g.m11110e(strM3600t15, str12);
                                                        String strM613i8 = C0141b.m613i(new Object[]{currencyInstance.format(d11 * 6.0d)}, 1, Locale.getDefault(), "%s", str20);
                                                        if (C5207g.m11106a(upgradeFragment5.m10406n0().m13299a(), obj)) {
                                                            Locale locale6 = Locale.getDefault();
                                                            String strM3600t16 = upgradeFragment5.m3600t(R.string.upgrade_price_month_abbr);
                                                            C5207g.m11110e(strM3600t16, "getString(\n             …                        )");
                                                            strM613i2 = C0141b.m613i(new Object[]{currencyInstance.format(d11)}, 1, locale6, strM3600t16, str20);
                                                        } else {
                                                            strM613i2 = C0141b.m613i(new Object[]{currencyInstance.format(d11), upgradeFragment5.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str17, str20);
                                                        }
                                                        Locale locale7 = Locale.getDefault();
                                                        String strM3600t17 = upgradeFragment5.m3600t(R.string.upgrade_save_amount1);
                                                        C5207g.m11110e(strM3600t17, str19);
                                                        double d14 = 6;
                                                        double d15 = d13 * d14;
                                                        c6514j = new C6514j(str22, strM3600t15, strM613i8, strM613i2, C0141b.m613i(new Object[]{((int) (((d15 - (d11 * d14)) / d15) * ((double) 100))) + "%"}, 1, locale7, strM3600t17, str20), 96);
                                                    } else {
                                                        upgradeFragment3 = upgradeFragment5;
                                                        str6 = str17;
                                                        str12 = str12;
                                                        if (C5207g.m11106a(str3, upgradeFragment3.m10409q0().f22273T)) {
                                                            d10 = ((bVar != null ? bVar.f43200a : 0.0f) / 12.0f) / 1000000.0f;
                                                            String str23 = upgradeFragment3.m10409q0().f22273T;
                                                            upgradeFragment4 = upgradeFragment3;
                                                            String strM3600t18 = upgradeFragment4.m3600t(R.string.upgrade_twelve_months);
                                                            C5207g.m11110e(strM3600t18, str5);
                                                            String str24 = str19;
                                                            String strM613i9 = C0141b.m613i(new Object[]{currencyInstance.format(d10 * 12.0d)}, 1, Locale.getDefault(), "%s", str20);
                                                            if (C5207g.m11106a(upgradeFragment4.m10406n0().m13299a(), obj)) {
                                                                Locale locale8 = Locale.getDefault();
                                                                String strM3600t19 = upgradeFragment4.m3600t(R.string.upgrade_price_month_abbr);
                                                                C5207g.m11110e(strM3600t19, "getString(\n             …                        )");
                                                                strM613i = C0141b.m613i(new Object[]{currencyInstance.format(d10)}, 1, locale8, strM3600t19, str20);
                                                                str11 = str6;
                                                            } else {
                                                                str11 = str6;
                                                                strM613i = C0141b.m613i(new Object[]{currencyInstance.format(d10), upgradeFragment4.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str11, str20);
                                                            }
                                                            Locale locale9 = Locale.getDefault();
                                                            if (C7661i.m15250P2(upgradeFragment4.m10407o0().f37141b)) {
                                                                strM3600t7 = upgradeFragment4.m3600t(R.string.upgrade_save_amount1);
                                                            } else {
                                                                strM3600t7 = upgradeFragment4.m3600t(R.string.upgrade_special_offer_off_now);
                                                            }
                                                            C5207g.m11110e(strM3600t7, "if (args.offer.isBlank()…                        }");
                                                            double d16 = 12;
                                                            double d17 = d13 * d16;
                                                            Object[] objArr2 = {((int) (((d17 - (d10 * d16)) / d17) * ((double) 100))) + "%"};
                                                            arrayList2 = arrayList;
                                                            str9 = str11;
                                                            str7 = str24;
                                                            str8 = str5;
                                                            c6514j = new C6514j(str23, strM3600t18, strM613i9, strM613i, C0141b.m613i(objArr2, 1, locale9, strM3600t7, str20), true, z10);
                                                            str10 = str4;
                                                        } else {
                                                            currencyInstance = currencyInstance;
                                                            str20 = str20;
                                                            str7 = str19;
                                                            arrayList2 = arrayList;
                                                            str8 = str5;
                                                            upgradeFragment4 = upgradeFragment3;
                                                            str9 = str6;
                                                            String strM3600t20 = upgradeFragment4.m3600t(R.string.upgrade_one_month);
                                                            str10 = str4;
                                                            C5207g.m11110e(strM3600t20, str10);
                                                            c6514j = new C6514j("1", strM3600t20, "$13,99", C0141b.m613i(new Object[]{"$13,99", upgradeFragment4.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str9, str20), "", 96);
                                                        }
                                                    }
                                                    arrayList2.add(c6514j);
                                                    it6 = it;
                                                    str19 = str7;
                                                    arrayList6 = arrayList2;
                                                    str20 = str20;
                                                    str18 = str10;
                                                    upgradeFragment5 = upgradeFragment4;
                                                    currencyInstance = currencyInstance;
                                                    str12 = str12;
                                                    str13 = str8;
                                                    str17 = str9;
                                                    z11 = z10;
                                                }
                                                str7 = str19;
                                                arrayList2 = arrayList;
                                                str8 = str5;
                                                upgradeFragment4 = upgradeFragment5;
                                                str9 = str17;
                                                str10 = str4;
                                                arrayList2.add(c6514j);
                                                it6 = it;
                                                str19 = str7;
                                                arrayList6 = arrayList2;
                                                str20 = str20;
                                                str18 = str10;
                                                upgradeFragment5 = upgradeFragment4;
                                                currencyInstance = currencyInstance;
                                                str12 = str12;
                                                str13 = str8;
                                                str17 = str9;
                                                z11 = z10;
                                            } else {
                                                it = it6;
                                            }
                                            currencyInstance.setCurrency(Currency.getInstance(str2));
                                        } catch (NullPointerException unused2) {
                                            currencyInstance.setCurrency(Currency.getInstance(new Locale("en", "US")));
                                        }
                                        ArrayList arrayList8 = c7926f2.f43197h;
                                        if (arrayList8 != null) {
                                            Iterator it8 = arrayList8.iterator();
                                            do {
                                                if (!it8.hasNext()) {
                                                    next = null;
                                                    break;
                                                }
                                                next = it8.next();
                                            } while (!((C7926f.d) next).f43205c.isEmpty());
                                            dVar = (C7926f.d) next;
                                        } else {
                                            dVar = null;
                                        }
                                        if (dVar != null) {
                                            bVar = null;
                                        } else {
                                            bVar = null;
                                        }
                                        if (bVar != null) {
                                            str2 = bVar.f43201b;
                                        } else {
                                            str2 = null;
                                        }
                                        mainViewModelM10409q1 = upgradeFragment5.m10409q0();
                                        str3 = c7926f2.f43192c;
                                        if (C5207g.m11106a(str3, mainViewModelM10409q1.f22271R)) {
                                            if (bVar != null) {
                                                j10 = bVar.f43200a;
                                            } else {
                                                j10 = 0;
                                            }
                                            d12 = j10 / 1000000.0f;
                                            String str25 = upgradeFragment5.m10409q0().f22271R;
                                            arrayList = arrayList6;
                                            String strM3600t110 = upgradeFragment5.m3600t(R.string.upgrade_one_month);
                                            C5207g.m11110e(strM3600t110, str18);
                                            str4 = str18;
                                            z10 = z11;
                                            str5 = str13;
                                            String strM613i10 = C0141b.m613i(new Object[]{currencyInstance.format(d12), upgradeFragment5.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str17, str20);
                                            if (C5207g.m11106a(upgradeFragment5.m10406n0().m13299a(), obj)) {
                                                Locale locale10 = Locale.getDefault();
                                                String strM3600t111 = upgradeFragment5.m3600t(R.string.upgrade_price_month_abbr);
                                                C5207g.m11110e(strM3600t111, "getString(\n             …                        )");
                                                strM613i3 = C0141b.m613i(new Object[]{currencyInstance.format(d12)}, 1, locale10, strM3600t111, str20);
                                            } else {
                                                strM613i3 = "";
                                            }
                                            c6514j = new C6514j(str25, strM3600t110, strM613i10, strM613i3, null, 112);
                                        } else {
                                            str4 = str18;
                                            z10 = z11;
                                            arrayList = arrayList6;
                                            str5 = str13;
                                            if (C5207g.m11106a(str3, upgradeFragment5.m10409q0().f22272S)) {
                                                d11 = ((bVar != null ? bVar.f43200a : 0.0f) / 6.0f) / 1000000.0f;
                                                String str26 = upgradeFragment5.m10409q0().f22272S;
                                                String strM3600t112 = upgradeFragment5.m3600t(R.string.upgrade_six_months);
                                                C5207g.m11110e(strM3600t112, str12);
                                                String strM613i11 = C0141b.m613i(new Object[]{currencyInstance.format(d11 * 6.0d)}, 1, Locale.getDefault(), "%s", str20);
                                                if (C5207g.m11106a(upgradeFragment5.m10406n0().m13299a(), obj)) {
                                                    Locale locale11 = Locale.getDefault();
                                                    String strM3600t113 = upgradeFragment5.m3600t(R.string.upgrade_price_month_abbr);
                                                    C5207g.m11110e(strM3600t113, "getString(\n             …                        )");
                                                    strM613i2 = C0141b.m613i(new Object[]{currencyInstance.format(d11)}, 1, locale11, strM3600t113, str20);
                                                } else {
                                                    strM613i2 = C0141b.m613i(new Object[]{currencyInstance.format(d11), upgradeFragment5.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str17, str20);
                                                }
                                                Locale locale12 = Locale.getDefault();
                                                String strM3600t114 = upgradeFragment5.m3600t(R.string.upgrade_save_amount1);
                                                C5207g.m11110e(strM3600t114, str19);
                                                double d18 = 6;
                                                double d19 = d13 * d18;
                                                c6514j = new C6514j(str26, strM3600t112, strM613i11, strM613i2, C0141b.m613i(new Object[]{((int) (((d19 - (d11 * d18)) / d19) * ((double) 100))) + "%"}, 1, locale12, strM3600t114, str20), 96);
                                            } else {
                                                upgradeFragment3 = upgradeFragment5;
                                                str6 = str17;
                                                str12 = str12;
                                                if (C5207g.m11106a(str3, upgradeFragment3.m10409q0().f22273T)) {
                                                    d10 = ((bVar != null ? bVar.f43200a : 0.0f) / 12.0f) / 1000000.0f;
                                                    String str27 = upgradeFragment3.m10409q0().f22273T;
                                                    upgradeFragment4 = upgradeFragment3;
                                                    String strM3600t115 = upgradeFragment4.m3600t(R.string.upgrade_twelve_months);
                                                    C5207g.m11110e(strM3600t115, str5);
                                                    String str28 = str19;
                                                    String strM613i12 = C0141b.m613i(new Object[]{currencyInstance.format(d10 * 12.0d)}, 1, Locale.getDefault(), "%s", str20);
                                                    if (C5207g.m11106a(upgradeFragment4.m10406n0().m13299a(), obj)) {
                                                        Locale locale13 = Locale.getDefault();
                                                        String strM3600t116 = upgradeFragment4.m3600t(R.string.upgrade_price_month_abbr);
                                                        C5207g.m11110e(strM3600t116, "getString(\n             …                        )");
                                                        strM613i = C0141b.m613i(new Object[]{currencyInstance.format(d10)}, 1, locale13, strM3600t116, str20);
                                                        str11 = str6;
                                                    } else {
                                                        str11 = str6;
                                                        strM613i = C0141b.m613i(new Object[]{currencyInstance.format(d10), upgradeFragment4.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str11, str20);
                                                    }
                                                    Locale locale14 = Locale.getDefault();
                                                    if (C7661i.m15250P2(upgradeFragment4.m10407o0().f37141b)) {
                                                        strM3600t7 = upgradeFragment4.m3600t(R.string.upgrade_save_amount1);
                                                    } else {
                                                        strM3600t7 = upgradeFragment4.m3600t(R.string.upgrade_special_offer_off_now);
                                                    }
                                                    C5207g.m11110e(strM3600t7, "if (args.offer.isBlank()…                        }");
                                                    double d110 = 12;
                                                    double d111 = d13 * d110;
                                                    Object[] objArr3 = {((int) (((d111 - (d10 * d110)) / d111) * ((double) 100))) + "%"};
                                                    arrayList2 = arrayList;
                                                    str9 = str11;
                                                    str7 = str28;
                                                    str8 = str5;
                                                    c6514j = new C6514j(str27, strM3600t115, strM613i12, strM613i, C0141b.m613i(objArr3, 1, locale14, strM3600t7, str20), true, z10);
                                                    str10 = str4;
                                                } else {
                                                    currencyInstance = currencyInstance;
                                                    str20 = str20;
                                                    str7 = str19;
                                                    arrayList2 = arrayList;
                                                    str8 = str5;
                                                    upgradeFragment4 = upgradeFragment3;
                                                    str9 = str6;
                                                    String strM3600t21 = upgradeFragment4.m3600t(R.string.upgrade_one_month);
                                                    str10 = str4;
                                                    C5207g.m11110e(strM3600t21, str10);
                                                    c6514j = new C6514j("1", strM3600t21, "$13,99", C0141b.m613i(new Object[]{"$13,99", upgradeFragment4.m3600t(R.string.upgrade_subscribe_substring_month)}, 2, Locale.getDefault(), str9, str20), "", 96);
                                                }
                                            }
                                            arrayList2.add(c6514j);
                                            it6 = it;
                                            str19 = str7;
                                            arrayList6 = arrayList2;
                                            str20 = str20;
                                            str18 = str10;
                                            upgradeFragment5 = upgradeFragment4;
                                            currencyInstance = currencyInstance;
                                            str12 = str12;
                                            str13 = str8;
                                            str17 = str9;
                                            z11 = z10;
                                        }
                                        str7 = str19;
                                        arrayList2 = arrayList;
                                        str8 = str5;
                                        upgradeFragment4 = upgradeFragment5;
                                        str9 = str17;
                                        str10 = str4;
                                        arrayList2.add(c6514j);
                                        it6 = it;
                                        str19 = str7;
                                        arrayList6 = arrayList2;
                                        str20 = str20;
                                        str18 = str10;
                                        upgradeFragment5 = upgradeFragment4;
                                        currencyInstance = currencyInstance;
                                        str12 = str12;
                                        str13 = str8;
                                        str17 = str9;
                                        z11 = z10;
                                    }
                                    upgradeFragment2 = upgradeFragment5;
                                    listM17252r = arrayList6;
                                }
                                UpgradeItemsListKt.m10413a(C6752c.m13447o0(listM17252r, new C6510f(C5207g.m11106a(upgradeFragment2.m10406n0().m13299a(), obj) ? C9000b.m17252r(upgradeFragment2.m10409q0().f22273T, upgradeFragment2.m10409q0().f22272S, upgradeFragment2.m10409q0().f22271R) : C9000b.m17252r(upgradeFragment2.m10409q0().f22273T, upgradeFragment2.m10409q0().f22271R, upgradeFragment2.m10409q0().f22272S))), C5207g.m11106a(upgradeFragment2.m10406n0().m13299a(), obj), new InterfaceC2052l<C6514j, C9072e>() { // from class: com.lingq.ui.upgrade.UpgradeFragment.setupUpgradeItems.1.1.1.2
                                    {
                                        super(1);
                                    }

                                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                    @Override // cm.InterfaceC2052l
                                    /* JADX INFO: renamed from: n */
                                    public final C9072e mo528n(C6514j c6514j2) {
                                        C6514j c6514j3 = c6514j2;
                                        C5207g.m11111f(c6514j3, "item");
                                        UpgradeFragment upgradeFragment6 = upgradeFragment2;
                                        C7796d c7796d2 = upgradeFragment6.f31985D0;
                                        if (c7796d2 == null) {
                                            C5207g.m11117l("analytics");
                                            throw null;
                                        }
                                        c7796d2.m15505b(null, "upgrade_button_click");
                                        MainViewModel mainViewModelM10409q2 = upgradeFragment6.m10409q0();
                                        String str29 = c6514j3.f37142a;
                                        if (C5207g.m11106a(str29, mainViewModelM10409q2.f22273T)) {
                                            MainViewModel mainViewModelM10409q3 = upgradeFragment6.m10409q0();
                                            MainViewModel mainViewModelM10409q4 = upgradeFragment6.m10409q0();
                                            mainViewModelM10409q3.m9742p2(mainViewModelM10409q4.f22273T, upgradeFragment6.m10407o0().f37141b);
                                        } else if (C5207g.m11106a(str29, upgradeFragment6.m10409q0().f22272S)) {
                                            MainViewModel mainViewModelM10409q5 = upgradeFragment6.m10409q0();
                                            MainViewModel mainViewModelM10409q6 = upgradeFragment6.m10409q0();
                                            mainViewModelM10409q5.m9742p2(mainViewModelM10409q6.f22272S, upgradeFragment6.m10407o0().f37141b);
                                        } else if (C5207g.m11106a(str29, upgradeFragment6.m10409q0().f22271R)) {
                                            MainViewModel mainViewModelM10409q7 = upgradeFragment6.m10409q0();
                                            MainViewModel mainViewModelM10409q8 = upgradeFragment6.m10409q0();
                                            mainViewModelM10409q7.m9742p2(mainViewModelM10409q8.f22271R, upgradeFragment6.m10407o0().f37141b);
                                        }
                                        return C9072e.f47360a;
                                    }
                                }, interfaceC0476a4, 8, 0);
                                InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                            }
                            return C9072e.f47360a;
                        }
                    }), interfaceC0476a2, 48, 1);
                }
                return C9072e.f47360a;
            }
        }, true));
        FrameLayout frameLayout = c8252a2M10408p0.f44568m;
        C5207g.m11110e(frameLayout, "viewProgress");
        C4924a.m10442U(frameLayout);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4918xe5490aaf(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C6704a m10406n0() {
        C6704a c6704a = this.f31986E0;
        if (c6704a != null) {
            return c6704a;
        }
        C5207g.m11117l("appSettings");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final C6511g m10407o0() {
        return (C6511g) this.f31984C0.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    public final C8252a2 m10408p0() {
        return (C8252a2) this.f31983B0.m10489a(this, f31981F0[0]);
    }

    /* JADX INFO: renamed from: q0 */
    public final MainViewModel m10409q0() {
        return (MainViewModel) this.f31982A0.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10410r0() {
        if (this.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
            C0987y.m3824f(new Bundle(), this, "upgradeClosed");
            C8573r0.m16725g0(this).m3995p();
        }
    }
}
