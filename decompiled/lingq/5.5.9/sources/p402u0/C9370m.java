package p402u0;

import ae.C0062b;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.Purchase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.pushnotification.C2260f;
import com.clevertap.android.sdk.pushnotification.InterfaceC2254a;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.google.android.exoplayer2.C2412i;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.p055ui.goals.DailyGoalCoinsTutorialFragment;
import com.lingq.p055ui.home.language.stats.LanguageStatsFragment;
import com.lingq.p055ui.home.notifications.NotificationsFragment;
import com.lingq.p055ui.lesson.LessonFragment;
import com.lingq.p055ui.onboarding.OnboardingDailyGoalFragment;
import com.lingq.p055ui.onboarding.OnboardingLevelFragment;
import com.lingq.p055ui.review.ReviewFragment;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.p055ui.session.magiclink.EmailLoginFragment;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import km.InterfaceC6727j;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import p043c7.InterfaceC1742h;
import p068d9.C5110x;
import p068d9.InterfaceC5089c;
import p090e9.InterfaceC5385a;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p136gc.InterfaceC5745a;
import p155he.C6041e;
import p174i9.InterfaceC6208b;
import p205jk.C6505a;
import p241le.C7337h0;
import p261m9.AbstractC7500a;
import p261m9.C7515p;
import p289o5.C7925e;
import p312p2.C8170b;
import p338qd.C8573r0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import p479xa.C10134c0;
import p479xa.C10144m;
import p505ya.C10332n;
import ph.C8251a1;
import ph.C8269d1;
import ph.C8287g1;

/* JADX INFO: renamed from: u0.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9370m implements InterfaceC9366i, InterfaceC1742h, InterfaceC5385a.a, C10144m.a, AbstractC7500a.d, InterfaceC5745a, InterfaceC10060r, Toolbar.InterfaceC0293h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48142a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48143b;

    public /* synthetic */ C9370m(int i10, Object obj) {
        this.f48142a = i10;
        this.f48143b = obj;
    }

    @Override // p043c7.InterfaceC1742h
    /* JADX INFO: renamed from: a */
    public final void mo5478a(Object obj) {
        C2260f c2260f = (C2260f) this.f48143b;
        ArrayList<PushConstants.PushType> arrayList = c2260f.f11341d;
        arrayList.addAll(c2260f.f11338a);
        Iterator<InterfaceC2254a> it = c2260f.f11340c.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next().getPushType());
        }
    }

    @Override // p261m9.AbstractC7500a.d
    /* JADX INFO: renamed from: b */
    public final long mo14985b(long j10) {
        C7515p c7515p = (C7515p) this.f48143b;
        return C10134c0.m19042i((j10 * ((long) c7515p.f41498e)) / 1000000, 0L, c7515p.f41503j - 1);
    }

    /* JADX WARN: Unreachable blocks removed: 6, instructions: 6 */
    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        int i10 = this.f48142a;
        Object obj = this.f48143b;
        switch (i10) {
            case 11:
                DailyGoalCoinsTutorialFragment dailyGoalCoinsTutorialFragment = (DailyGoalCoinsTutorialFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = DailyGoalCoinsTutorialFragment.f22489E0;
                C5207g.m11111f(dailyGoalCoinsTutorialFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialButton materialButton = dailyGoalCoinsTutorialFragment.m9755n0().f45020b;
                C5207g.m11110e(materialButton, "binding.btnContinue");
                ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = c8170bM18864a.f44305d;
                materialButton.setLayoutParams(marginLayoutParams);
                ImageButton imageButton = dailyGoalCoinsTutorialFragment.m9755n0().f45019a;
                C5207g.m11110e(imageButton, "binding.btnClose");
                ViewGroup.LayoutParams layoutParams2 = imageButton.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = c8170bM18864a.f44303b;
                imageButton.setLayoutParams(marginLayoutParams2);
                return C10063s0.f51076b;
            case 14:
                LessonFragment lessonFragment = (LessonFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                C5207g.m11111f(lessonFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a2 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a2, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                FrameLayout frameLayout = lessonFragment.m10107o0().f44714y;
                C5207g.m11110e(frameLayout, "binding.viewTopBar");
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                int i11 = c8170bM18864a2.f44303b;
                marginLayoutParams3.topMargin = i11;
                frameLayout.setLayoutParams(marginLayoutParams3);
                RelativeLayout relativeLayout = lessonFragment.m10107o0().f44697h;
                C5207g.m11110e(relativeLayout, "binding.lessonLayout");
                ViewGroup.LayoutParams layoutParams4 = relativeLayout.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                int i12 = c8170bM18864a2.f44305d;
                marginLayoutParams4.bottomMargin = i12;
                relativeLayout.setLayoutParams(marginLayoutParams4);
                LinearLayout linearLayout = (LinearLayout) lessonFragment.m10107o0().f44699j.f45029c;
                C5207g.m11110e(linearLayout, "binding.loadingViews.root");
                ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                marginLayoutParams5.topMargin = i11;
                marginLayoutParams5.bottomMargin = i12;
                linearLayout.setLayoutParams(marginLayoutParams5);
                RelativeLayout relativeLayout2 = (RelativeLayout) lessonFragment.m10107o0().f44696g.f45172d;
                C5207g.m11110e(relativeLayout2, "binding.headerContent.root");
                ViewGroup.LayoutParams layoutParams6 = relativeLayout2.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                marginLayoutParams6.topMargin = i11;
                marginLayoutParams6.bottomMargin = i12;
                relativeLayout2.setLayoutParams(marginLayoutParams6);
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    C5207g.m11110e(childAt, "getChildAt(index)");
                    childAt.dispatchApplyWindowInsets(c10063s0.m18870h());
                }
                return c10063s0;
            case 15:
                OnboardingDailyGoalFragment onboardingDailyGoalFragment = (OnboardingDailyGoalFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = OnboardingDailyGoalFragment.f29358D0;
                C5207g.m11111f(onboardingDailyGoalFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a3 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a3, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                InterfaceC6727j<?>[] interfaceC6727jArr4 = OnboardingDailyGoalFragment.f29358D0;
                InterfaceC6727j<?> interfaceC6727j = interfaceC6727jArr4[0];
                FragmentViewBindingDelegate fragmentViewBindingDelegate = onboardingDailyGoalFragment.f29359A0;
                AppBarLayout appBarLayout = ((C8251a1) fragmentViewBindingDelegate.m10489a(onboardingDailyGoalFragment, interfaceC6727j)).f44553a;
                C5207g.m11110e(appBarLayout, "binding.appbar");
                ViewGroup.LayoutParams layoutParams7 = appBarLayout.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                marginLayoutParams7.topMargin = c8170bM18864a3.f44303b;
                appBarLayout.setLayoutParams(marginLayoutParams7);
                RecyclerView recyclerView = ((C8251a1) fragmentViewBindingDelegate.m10489a(onboardingDailyGoalFragment, interfaceC6727jArr4[0])).f44554b;
                C5207g.m11110e(recyclerView, "binding.rvContent");
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), c8170bM18864a3.f44305d);
                return C10063s0.f51076b;
            case 16:
                OnboardingLevelFragment onboardingLevelFragment = (OnboardingLevelFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = OnboardingLevelFragment.f29413D0;
                C5207g.m11111f(onboardingLevelFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a4 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a4, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                InterfaceC6727j<?>[] interfaceC6727jArr6 = OnboardingLevelFragment.f29413D0;
                InterfaceC6727j<?> interfaceC6727j2 = interfaceC6727jArr6[0];
                FragmentViewBindingDelegate fragmentViewBindingDelegate2 = onboardingLevelFragment.f29414A0;
                AppBarLayout appBarLayout2 = ((C8269d1) fragmentViewBindingDelegate2.m10489a(onboardingLevelFragment, interfaceC6727j2)).f44664a;
                C5207g.m11110e(appBarLayout2, "binding.appbar");
                ViewGroup.LayoutParams layoutParams8 = appBarLayout2.getLayoutParams();
                if (layoutParams8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
                marginLayoutParams8.topMargin = c8170bM18864a4.f44303b;
                appBarLayout2.setLayoutParams(marginLayoutParams8);
                RecyclerView recyclerView2 = ((C8269d1) fragmentViewBindingDelegate2.m10489a(onboardingLevelFragment, interfaceC6727jArr6[0])).f44665b;
                C5207g.m11110e(recyclerView2, "binding.rvContent");
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), c8170bM18864a4.f44305d);
                return C10063s0.f51076b;
            case 17:
                ReviewFragment reviewFragment = (ReviewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = ReviewFragment.f29431E0;
                C5207g.m11111f(reviewFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a5 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a5, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                LinearLayout linearLayout2 = reviewFragment.m10239n0().f45109h;
                C5207g.m11110e(linearLayout2, "binding.viewToolbar");
                ViewGroup.LayoutParams layoutParams9 = linearLayout2.getLayoutParams();
                if (layoutParams9 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams9;
                marginLayoutParams9.topMargin = c8170bM18864a5.f44303b;
                linearLayout2.setLayoutParams(marginLayoutParams9);
                LinearLayout linearLayout3 = reviewFragment.m10239n0().f45107f.f45137a;
                C5207g.m11110e(linearLayout3, "binding.viewBottom.root");
                ViewGroup.LayoutParams layoutParams10 = linearLayout3.getLayoutParams();
                if (layoutParams10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams10;
                marginLayoutParams10.bottomMargin = c8170bM18864a5.f44305d;
                linearLayout3.setLayoutParams(marginLayoutParams10);
                return c10063s0;
        }
        EmailLoginFragment emailLoginFragment = (EmailLoginFragment) obj;
        InterfaceC6727j<Object>[] interfaceC6727jArr8 = EmailLoginFragment.f30886C0;
        C5207g.m11111f(emailLoginFragment, "this$0");
        C5207g.m11111f(view, "view");
        C8170b c8170bM18864a6 = c10063s0.m18864a(7);
        C5207g.m11110e(c8170bM18864a6, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        ConstraintLayout constraintLayout = emailLoginFragment.m10347o0().f45186f;
        C5207g.m11110e(constraintLayout, "binding.viewContent");
        ViewGroup.LayoutParams layoutParams11 = constraintLayout.getLayoutParams();
        if (layoutParams11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
        marginLayoutParams11.bottomMargin = c8170bM18864a6.f44305d;
        marginLayoutParams11.topMargin = c8170bM18864a6.f44303b;
        constraintLayout.setLayoutParams(marginLayoutParams11);
        return C10063s0.f51076b;
    }

    /* JADX INFO: renamed from: d */
    public final void m17742d(C7925e c7925e) {
        Purchase purchase = (Purchase) this.f48143b;
        C5207g.m11111f(purchase, "$purchase");
        C5207g.m11111f(c7925e, "billingResult");
        if (c7925e.f43186a == 0) {
            C6041e c6041eM12476a = C6041e.m12476a();
            JSONObject jSONObject = purchase.f10529c;
            c6041eM12476a.m12477b(new Exception("Purchase was acknowledged for " + jSONObject.optString("orderId") + " " + jSONObject.optLong("purchaseTime")));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17743e(C7925e c7925e, List list) {
        C6505a.a aVar;
        C6505a c6505a = (C6505a) this.f48143b;
        C5207g.m11111f(c6505a, "this$0");
        C5207g.m11111f(c7925e, "billingResult");
        C5207g.m11111f(list, "purchases");
        if (c7925e.f43186a != 0 || (aVar = c6505a.f37119b) == null) {
            return;
        }
        aVar.mo9711p(list);
    }

    /* JADX INFO: renamed from: f */
    public final Object m17744f() {
        return ((C5110x) this.f48143b).getWritableDatabase();
    }

    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public final Object mo4925g() {
        return ((InterfaceC5089c) this.f48143b).mo10853b();
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g abstractC5751g) {
        C5752h c5752h = (C5752h) this.f48143b;
        ExecutorService executorService = C7337h0.f41062a;
        if (abstractC5751g.mo12111m()) {
            c5752h.m12116d(abstractC5751g.mo12107i());
        } else if (abstractC5751g.mo12106h() != null) {
            c5752h.m12115c(abstractC5751g.mo12106h());
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p402u0.InterfaceC9366i
    /* JADX INFO: renamed from: j */
    public final double mo11741j(double d10) {
        int i10 = this.f48142a;
        Object obj = this.f48143b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C9374q c9374q = (C9374q) obj;
                C5207g.m11111f(c9374q, "this$0");
                return c9374q.f48158m.mo11741j(C0062b.m354i0(d10, c9374q.f48150e, c9374q.f48151f));
            default:
                C9375r c9375r = (C9375r) obj;
                C5207g.m11111f(c9375r, "$function");
                return d10 >= c9375r.f48165e ? Math.pow((c9375r.f48162b * d10) + c9375r.f48163c, c9375r.f48161a) : d10 * c9375r.f48164d;
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f48142a;
        Object obj2 = this.f48143b;
        switch (i10) {
            case 5:
                ((InterfaceC2532v.c) obj).mo7490M((C2412i) obj2);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ((InterfaceC2532v.c) obj).mo7411h((C10332n) obj2);
                break;
            default:
                ((InterfaceC6208b) obj).mo12781P((InterfaceC6208b.a) obj2);
                break;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.appcompat.widget.Toolbar.InterfaceC0293h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        int i10 = this.f48142a;
        Object obj = this.f48143b;
        switch (i10) {
            case 12:
                LanguageStatsFragment languageStatsFragment = (LanguageStatsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
                C5207g.m11111f(languageStatsFragment, "this$0");
                if (menuItem.getItemId() == R.id.item_share) {
                    NavController navControllerM16725g0 = C8573r0.m16725g0(languageStatsFragment);
                    Bundle bundle = new Bundle();
                    NavDestination navDestinationM3986g = navControllerM16725g0.m3986g();
                    if (navDestinationM3986g != null && navDestinationM3986g.m4016i(R.id.actionToStatsShare) != null) {
                        navControllerM16725g0.m3992m(R.id.actionToStatsShare, bundle, null);
                    }
                }
                break;
            case 13:
                NotificationsFragment notificationsFragment = (NotificationsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = NotificationsFragment.f25285F0;
                C5207g.m11111f(notificationsFragment, "this$0");
                int itemId = menuItem.getItemId();
                if (itemId == R.id.item_mark_all_as_read) {
                    notificationsFragment.m9969p0().m9971m2(EmptyList.f38032a, true);
                } else if (itemId == R.id.item_settings) {
                    Bundle bundle2 = new Bundle();
                    NavController navControllerM16725g1 = C8573r0.m16725g0(notificationsFragment);
                    NavDestination navDestinationM3986g2 = navControllerM16725g1.m3986g();
                    if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToNotificationsSettings) != null) {
                        navControllerM16725g1.m3992m(R.id.actionToNotificationsSettings, bundle2, null);
                    }
                }
                break;
            default:
                C8287g1 c8287g1 = (C8287g1) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = RegisterFragment.f30733J0;
                C5207g.m11111f(c8287g1, "$this_with");
                if (menuItem.getItemId() == R.id.item_referral_id) {
                    TextInputLayout textInputLayout = c8287g1.f44812p;
                    C5207g.m11110e(textInputLayout, "viewCoupon");
                    if (!(textInputLayout.getVisibility() == 0)) {
                        C4924a.m10457e0(textInputLayout);
                    } else {
                        C4924a.m10442U(textInputLayout);
                    }
                }
                break;
        }
        return true;
    }
}
