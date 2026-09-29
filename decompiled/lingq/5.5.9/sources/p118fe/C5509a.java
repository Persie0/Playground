package p118fe;

import ae.C0065e;
import af.InterfaceC0070c;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.C0322j;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2415l;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.source.InterfaceC2495l;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.internal.common.C3212a;
import com.google.firebase.crashlytics.internal.common.C3213b;
import com.google.firebase.crashlytics.internal.common.C3214c;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import com.google.firebase.heartbeatinfo.C3218a;
import com.google.firebase.messaging.C3238d0;
import com.lingq.p055ui.home.HomeFragment;
import com.lingq.p055ui.lesson.menu.LessonReviewMenuFragment;
import com.lingq.p055ui.lesson.player.ListeningModeFragment;
import com.lingq.p055ui.lesson.stats.LessonCompleteFragment;
import com.lingq.p055ui.lesson.vocabulary.LessonVocabularyFragment;
import com.lingq.p055ui.onboarding.OnboardingFragment;
import com.lingq.p055ui.onboarding.OnboardingLanguageFragment;
import com.lingq.p055ui.session.LoginFragment;
import com.lingq.p055ui.upgrade.UpgradeFragment;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import dm.C5207g;
import dm.C5212l;
import ie.C6322c;
import ie.C6323d;
import ie.InterfaceC6320a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import ke.C6665c;
import ke.InterfaceC6663a;
import ke.InterfaceC6664b;
import km.InterfaceC6727j;
import me.C7545c;
import me.C7550h;
import no.C7814a0;
import p043c7.InterfaceC1742h;
import p045c9.C1753g;
import p047ce.InterfaceC1999a;
import p073df.InterfaceC5162d;
import p090e9.InterfaceC5385a;
import p105f0.C5454b;
import p115fb.C5502r;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;
import p136gc.InterfaceC5747c;
import p155he.C6037a;
import p155he.C6039c;
import p155he.C6041e;
import p155he.CallableC6040d;
import p183ik.C6343f;
import p200jf.InterfaceC6475g;
import p241le.AbstractC7355z;
import p241le.C7322a;
import p241le.C7323a0;
import p241le.C7328d;
import p241le.C7329d0;
import p241le.C7330e;
import p241le.C7331e0;
import p241le.C7332f;
import p241le.C7335g0;
import p241le.C7337h0;
import p241le.C7341l;
import p241le.C7352w;
import p241le.CallableC7347r;
import p241le.CallableC7353x;
import p278nh.C7777d;
import p289o5.C7925e;
import p312p2.C8170b;
import p339qe.C8597b;
import p385sf.C9000b;
import p387t0.C9166r;
import p402u0.C9371n;
import p402u0.C9375r;
import p402u0.InterfaceC9366i;
import p408u6.C9471j;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import p479xa.C10144m;
import p479xa.C10145n;
import p497y2.InterfaceC10282d;
import p505ya.C10328j;
import ph.C8252a2;
import ph.C8263c1;
import ph.C8390z0;
import se.C8994d;
import se.C8997g;
import so.AbstractC9093k;

/* JADX INFO: renamed from: fe.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5509a implements InterfaceC5514f, InterfaceC9366i, InterfaceC1742h, InterfaceC5385a.a, C2415l.e, C10144m.a, InterfaceC2495l.a, C10328j.b.a, InterfaceC10282d, InterfaceC6664b, InterfaceC2004a.a, InterfaceC5745a, InterfaceC5747c, InterfaceC10060r, NestedScrollView.InterfaceC0786c, AbstractC9093k.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34147a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f34148b;

    public /* synthetic */ C5509a(int i10, Object obj) {
        this.f34147a = i10;
        this.f34148b = obj;
    }

    @Override // p043c7.InterfaceC1742h
    /* JADX INFO: renamed from: a */
    public void mo5478a(Object obj) {
        ((C9471j) this.f34148b).f48558g.mo597h();
    }

    @Override // ke.InterfaceC6664b
    /* JADX INFO: renamed from: b */
    public void mo11739b(InterfaceC6663a interfaceC6663a) {
        C6037a c6037a = (C6037a) this.f34148b;
        synchronized (c6037a) {
            if (c6037a.f35681b instanceof C6665c) {
                c6037a.f35682c.add(interfaceC6663a);
            }
            c6037a.f35681b.mo11739b(interfaceC6663a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        int i10 = this.f34147a;
        Object obj = this.f34148b;
        switch (i10) {
            case 14:
                HomeFragment homeFragment = (HomeFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                C5207g.m11111f(homeFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                FragmentContainerView fragmentContainerView = homeFragment.m9769r0().f45268b;
                C5207g.m11110e(fragmentContainerView, "binding.navHostFragment");
                ViewGroup.LayoutParams layoutParams = fragmentContainerView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = c8170bM18864a.f44303b;
                fragmentContainerView.setLayoutParams(marginLayoutParams);
                BottomNavigationView bottomNavigationView = homeFragment.m9769r0().f45267a;
                C5207g.m11110e(bottomNavigationView, "binding.bottomNavigationView");
                bottomNavigationView.setPadding(bottomNavigationView.getPaddingLeft(), bottomNavigationView.getPaddingTop(), bottomNavigationView.getPaddingRight(), c8170bM18864a.f44305d);
                return C10063s0.f51076b;
            case 15:
                LessonReviewMenuFragment lessonReviewMenuFragment = (LessonReviewMenuFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonReviewMenuFragment.f28270D0;
                C5207g.m11111f(lessonReviewMenuFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a2 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a2, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                CardView cardView = lessonReviewMenuFragment.m10184n0().f45134m;
                C5207g.m11110e(cardView, "binding.viewStreak");
                ViewGroup.LayoutParams layoutParams2 = cardView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                int i11 = c8170bM18864a2.f44303b;
                marginLayoutParams2.topMargin = i11;
                int i12 = c8170bM18864a2.f44305d;
                marginLayoutParams2.bottomMargin = i12;
                cardView.setLayoutParams(marginLayoutParams2);
                CardView cardView2 = lessonReviewMenuFragment.m10184n0().f45131j;
                C5207g.m11110e(cardView2, "binding.viewMenu");
                ViewGroup.LayoutParams layoutParams3 = cardView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = i11;
                marginLayoutParams3.bottomMargin = i12;
                cardView2.setLayoutParams(marginLayoutParams3);
                return C10063s0.f51076b;
            case 16:
                ListeningModeFragment listeningModeFragment = (ListeningModeFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                C5207g.m11111f(listeningModeFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a3 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a3, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                TextView textView = listeningModeFragment.m10210o0().f45242s;
                C5207g.m11110e(textView, "binding.tvClose");
                ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.topMargin = c8170bM18864a3.f44303b;
                textView.setLayoutParams(marginLayoutParams4);
                boolean zM15480a = C7777d.m15480a(listeningModeFragment);
                int i13 = c8170bM18864a3.f44305d;
                if (zM15480a) {
                    RecyclerView recyclerView = listeningModeFragment.m10210o0().f45240q;
                    C5207g.m11110e(recyclerView, "binding.rvSentences");
                    ViewGroup.LayoutParams layoutParams5 = recyclerView.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams5.bottomMargin = i13;
                    recyclerView.setLayoutParams(marginLayoutParams5);
                } else {
                    LinearLayout linearLayout = listeningModeFragment.m10210o0().f45239p;
                    C5207g.m11110e(linearLayout, "binding.playerControlsBottom");
                    ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
                    if (layoutParams6 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    marginLayoutParams6.bottomMargin = i13;
                    linearLayout.setLayoutParams(marginLayoutParams6);
                }
                return c10063s0;
            case 17:
                LessonCompleteFragment lessonCompleteFragment = (LessonCompleteFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = LessonCompleteFragment.f28894G0;
                C5207g.m11111f(lessonCompleteFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a4 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a4, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                RelativeLayout relativeLayout = lessonCompleteFragment.m10216p0().f44759h;
                C5207g.m11110e(relativeLayout, "binding.viewContent");
                ViewGroup.LayoutParams layoutParams7 = relativeLayout.getLayoutParams();
                if (layoutParams7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams7;
                marginLayoutParams7.bottomMargin = c8170bM18864a4.f44305d;
                relativeLayout.setLayoutParams(marginLayoutParams7);
                MaterialToolbar materialToolbar = lessonCompleteFragment.m10216p0().f44755d;
                C5207g.m11110e(materialToolbar, "binding.toolbar");
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), c8170bM18864a4.f44303b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                return C10063s0.f51076b;
            case 18:
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = LessonVocabularyFragment.f29206D0;
                C5207g.m11111f(lessonVocabularyFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a5 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a5, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                if (!C7777d.m15481b(lessonVocabularyFragment)) {
                    ViewPager2 viewPager2 = lessonVocabularyFragment.m10230n0().f45165d;
                    C5207g.m11110e(viewPager2, "binding.vpVocabulary");
                    ViewGroup.LayoutParams layoutParams8 = viewPager2.getLayoutParams();
                    if (layoutParams8 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams8;
                    marginLayoutParams8.bottomMargin = c8170bM18864a5.f44305d;
                    viewPager2.setLayoutParams(marginLayoutParams8);
                }
                MaterialToolbar materialToolbar2 = lessonVocabularyFragment.m10230n0().f45164c;
                C5207g.m11110e(materialToolbar2, "binding.toolbar");
                materialToolbar2.setPadding(materialToolbar2.getPaddingLeft(), c8170bM18864a5.f44303b, materialToolbar2.getPaddingRight(), materialToolbar2.getPaddingBottom());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = viewGroup.getChildAt(i14);
                    C5207g.m11110e(childAt, "getChildAt(index)");
                    childAt.dispatchApplyWindowInsets(c10063s0.m18870h());
                }
                return c10063s0;
            case 19:
                OnboardingFragment onboardingFragment = (OnboardingFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = OnboardingFragment.f29401E0;
                C5207g.m11111f(onboardingFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a6 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a6, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialButton materialButton = ((C8390z0) onboardingFragment.f29402A0.m10489a(onboardingFragment, OnboardingFragment.f29401E0[0])).f45496a;
                C5207g.m11110e(materialButton, "binding.btnLogin");
                ViewGroup.LayoutParams layoutParams9 = materialButton.getLayoutParams();
                if (layoutParams9 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams9;
                marginLayoutParams9.bottomMargin = c8170bM18864a6.f44305d;
                materialButton.setLayoutParams(marginLayoutParams9);
                return C10063s0.f51076b;
            case 20:
                OnboardingLanguageFragment onboardingLanguageFragment = (OnboardingLanguageFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr7 = OnboardingLanguageFragment.f29407D0;
                C5207g.m11111f(onboardingLanguageFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a7 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a7, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                InterfaceC6727j<?>[] interfaceC6727jArr8 = OnboardingLanguageFragment.f29407D0;
                InterfaceC6727j<?> interfaceC6727j = interfaceC6727jArr8[0];
                FragmentViewBindingDelegate fragmentViewBindingDelegate = onboardingLanguageFragment.f29408A0;
                AppBarLayout appBarLayout = ((C8263c1) fragmentViewBindingDelegate.m10489a(onboardingLanguageFragment, interfaceC6727j)).f44637a;
                C5207g.m11110e(appBarLayout, "binding.appbar");
                ViewGroup.LayoutParams layoutParams10 = appBarLayout.getLayoutParams();
                if (layoutParams10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams10;
                marginLayoutParams10.topMargin = c8170bM18864a7.f44303b;
                appBarLayout.setLayoutParams(marginLayoutParams10);
                RecyclerView recyclerView2 = ((C8263c1) fragmentViewBindingDelegate.m10489a(onboardingLanguageFragment, interfaceC6727jArr8[0])).f44638b;
                C5207g.m11110e(recyclerView2, "binding.rvContent");
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), c8170bM18864a7.f44305d);
                return C10063s0.f51076b;
            case 21:
                LoginFragment loginFragment = (LoginFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr9 = LoginFragment.f30685J0;
                C5207g.m11111f(loginFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a8 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a8, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                LinearLayout linearLayout2 = loginFragment.m10335o0().f45281k;
                C5207g.m11110e(linearLayout2, "binding.viewContent");
                ViewGroup.LayoutParams layoutParams11 = linearLayout2.getLayoutParams();
                if (layoutParams11 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
                marginLayoutParams11.bottomMargin = c8170bM18864a8.f44305d;
                marginLayoutParams11.topMargin = c8170bM18864a8.f44303b;
                linearLayout2.setLayoutParams(marginLayoutParams11);
                return C10063s0.f51076b;
            default:
                C6343f c6343f = (C6343f) obj;
                C5207g.m11111f(c6343f, "$tooltipData");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a9 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a9, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                Rect rect = c6343f.f36655b;
                rect.top -= c8170bM18864a9.f44303b;
                rect.bottom -= c8170bM18864a9.f44305d;
                return c10063s0;
        }
    }

    @Override // androidx.core.widget.NestedScrollView.InterfaceC0786c
    /* JADX INFO: renamed from: d */
    public void mo3002d(NestedScrollView nestedScrollView, int i10) {
        C8252a2 c8252a2 = (C8252a2) this.f34148b;
        InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
        C5207g.m11111f(c8252a2, "$this_apply");
        C5207g.m11111f(nestedScrollView, "v");
        boolean zCanScrollVertically = c8252a2.f44557b.canScrollVertically(-1);
        AppBarLayout appBarLayout = c8252a2.f44556a;
        if (zCanScrollVertically) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.i.m18725s(appBarLayout, 40.0f);
        } else {
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            C10029b0.i.m18725s(appBarLayout, 0.0f);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p136gc.InterfaceC5747c
    /* JADX INFO: renamed from: e */
    public void mo205e(AbstractC5751g abstractC5751g) {
        int i10 = this.f34147a;
        Object obj = this.f34148b;
        switch (i10) {
            case 12:
                C3238d0.m9252a((Intent) obj);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // cf.InterfaceC2004a.a
    /* JADX INFO: renamed from: f */
    public void mo5937f(InterfaceC2005b interfaceC2005b) {
        C6322c c6322c = (C6322c) this.f34148b;
        c6322c.getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        c6322c.f36549b.set((InterfaceC6320a) interfaceC2005b.get());
    }

    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public Object mo4925g() {
        ((C1753g) this.f34148b).f9638i.mo10852a();
        return null;
    }

    /* JADX INFO: renamed from: h */
    public void m11740h(Display display) {
        C10328j c10328j = (C10328j) this.f34148b;
        c10328j.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            c10328j.f51987k = refreshRate;
            c10328j.f51988l = (refreshRate * 80) / 100;
        } else {
            C10145n.m19099g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            c10328j.f51987k = -9223372036854775807L;
            c10328j.f51988l = -9223372036854775807L;
        }
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public Object mo5485i(AbstractC5751g abstractC5751g) {
        boolean z10;
        ((C7335g0) this.f34148b).getClass();
        if (abstractC5751g.mo12111m()) {
            AbstractC7355z abstractC7355z = (AbstractC7355z) abstractC5751g.mo12107i();
            C5212l c5212l = C5212l.f33289h;
            c5212l.m11188H("Crashlytics report successfully enqueued to DataTransport: " + abstractC7355z.mo14741c());
            File fileMo14740b = abstractC7355z.mo14740b();
            if (fileMo14740b.delete()) {
                c5212l.m11188H("Deleted report file: " + fileMo14740b.getPath());
            } else {
                c5212l.m11194r0("Crashlytics could not delete report file: " + fileMo14740b.getPath(), null);
            }
            z10 = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", abstractC5751g.mo12106h());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // p402u0.InterfaceC9366i
    /* JADX INFO: renamed from: j */
    public double mo11741j(double d10) {
        C9375r c9375r = (C9375r) this.f34148b;
        C5207g.m11111f(c9375r, "$function");
        if (d10 >= c9375r.f48165e) {
            return Math.pow((c9375r.f48162b * d10) + c9375r.f48163c, c9375r.f48161a) + c9375r.f48166f;
        }
        return c9375r.f48167g + (c9375r.f48164d * d10);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0473  */
    /* JADX WARN: Code duplicated, block: B:104:0x0476  */
    /* JADX WARN: Code duplicated, block: B:108:0x0482 A[Catch: Exception -> 0x048a, TryCatch #0 {Exception -> 0x048a, blocks: (B:106:0x047c, B:108:0x0482, B:109:0x0486), top: B:134:0x047c }] */
    /* JADX WARN: Code duplicated, block: B:113:0x048c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0496  */
    /* JADX WARN: Code duplicated, block: B:125:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:81:0x0370  */
    /* JADX WARN: Code duplicated, block: B:91:0x044a A[Catch: Exception -> 0x04a2, TryCatch #5 {Exception -> 0x04a2, blocks: (B:86:0x03d5, B:88:0x041f, B:89:0x0424, B:91:0x044a, B:96:0x045b, B:98:0x0469), top: B:144:0x03d5 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0454  */
    /* JADX WARN: Code duplicated, block: B:94:0x0457  */
    @Override // p118fe.InterfaceC5514f
    /* JADX INFO: renamed from: k */
    public Object mo35k(C5528t c5528t) {
        C7352w c7352w;
        int i10;
        Throwable th2;
        boolean z10;
        C7322a c7322a;
        boolean z11;
        ExecutorService executorService;
        String str;
        boolean zExists;
        boolean z12;
        boolean z13;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        int i11 = this.f34147a;
        Object obj = this.f34148b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return obj;
            case 1:
                ((CrashlyticsRegistrar) obj).getClass();
                C0065e c0065e = (C0065e) c5528t.mo11748a(C0065e.class);
                InterfaceC2004a interfaceC2004aM11766h = c5528t.m11766h(InterfaceC6320a.class);
                InterfaceC2004a interfaceC2004aM11766h2 = c5528t.m11766h(InterfaceC1999a.class);
                InterfaceC5162d interfaceC5162d = (InterfaceC5162d) c5528t.mo11748a(InterfaceC5162d.class);
                c0065e.m437a();
                Context context = c0065e.f171a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.3.6 for " + packageName, null);
                C8597b c8597b = new C8597b(context);
                C7323a0 c7323a0 = new C7323a0(c0065e);
                C7331e0 c7331e0 = new C7331e0(context, packageName, interfaceC5162d, c7323a0);
                C6322c c6322c = new C6322c(interfaceC2004aM11766h);
                C6037a c6037a = new C6037a(interfaceC2004aM11766h2);
                int i12 = 9;
                C7352w c7352w2 = c7352w;
                C7352w c7352w3 = new C7352w(c0065e, c7331e0, c6322c, c7323a0, new C5509a(i12, c6037a), new C9371n(i12, c6037a), c8597b, C7329d0.m14743a("Crashlytics Exception Handler"));
                c0065e.m437a();
                String str2 = c0065e.f173c.f184b;
                String strM9153e = CommonUtils.m9153e(context);
                ArrayList<C7328d> arrayList = new ArrayList();
                int iM9154f = CommonUtils.m9154f(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iM9154f2 = CommonUtils.m9154f(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iM9154f3 = CommonUtils.m9154f(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (iM9154f == 0 || iM9154f2 == 0 || iM9154f3 == 0) {
                    c7352w = c7352w2;
                    String str3 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iM9154f), Integer.valueOf(iM9154f2), Integer.valueOf(iM9154f3));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                        i10 = 3;
                        th2 = null;
                    } else {
                        i10 = 3;
                        th2 = null;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(iM9154f);
                    String[] stringArray2 = context.getResources().getStringArray(iM9154f2);
                    String[] stringArray3 = context.getResources().getStringArray(iM9154f3);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i13 = 0;
                        while (i13 < stringArray3.length) {
                            arrayList.add(new C7328d(stringArray[i13], stringArray2[i13], stringArray3[i13]));
                            i13++;
                            c7352w2 = c7352w2;
                        }
                        c7352w = c7352w2;
                        th2 = null;
                        i10 = 3;
                    } else {
                        c7352w = c7352w2;
                        String str4 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        i10 = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str4, null);
                        }
                        th2 = null;
                    }
                }
                String strM852k = C0204c.m852k("Mapping file ID is: ", strM9153e);
                if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                    Log.d("FirebaseCrashlytics", strM852k, th2);
                }
                for (C7328d c7328d : arrayList) {
                    Object[] objArr = new Object[i10];
                    objArr[0] = c7328d.f41037a;
                    objArr[1] = c7328d.f41038b;
                    objArr[2] = c7328d.f41039c;
                    String str5 = String.format("Build id for %s on %s: %s", objArr);
                    if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                        Log.d("FirebaseCrashlytics", str5, null);
                    }
                }
                C6323d c6323d = new C6323d(context);
                try {
                    String packageName2 = context.getPackageName();
                    String strM14748d = c7331e0.m14748d();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                    String string = Integer.toString(packageInfo.versionCode);
                    String str6 = packageInfo.versionName;
                    if (str6 == null) {
                        str6 = "0.0";
                    }
                    String str7 = str6;
                    boolean z14 = false;
                    C7322a c7322a2 = new C7322a(str2, strM9153e, arrayList, strM14748d, packageName2, string, str7, c6323d);
                    String strM852k2 = C0204c.m852k("Installer package name is: ", strM14748d);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strM852k2, null);
                    }
                    ExecutorService executorServiceM14743a = C7329d0.m14743a("com.google.firebase.crashlytics.startup");
                    C7814a0 c7814a0 = new C7814a0();
                    String strM14748d2 = c7331e0.m14748d();
                    C7341l c7341l = new C7341l();
                    C8994d c8994d = new C8994d(c7341l);
                    C9166r c9166r = new C9166r(c8597b);
                    Locale locale = Locale.US;
                    C5502r c5502r = new C5502r(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str2), c7814a0);
                    String str8 = Build.MANUFACTURER;
                    String str9 = C7331e0.f41043h;
                    String str10 = String.format(locale, "%s/%s", str8.replaceAll(str9, ""), Build.MODEL.replaceAll(str9, ""));
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str9, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str9, "");
                    int i14 = 4;
                    String[] strArr = {CommonUtils.m9153e(context), str2, str7, string};
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    while (i15 < i14) {
                        String str11 = strArr[i15];
                        String[] strArr2 = strArr;
                        if (str11 != null) {
                            arrayList2.add(str11.replace("-", "").toLowerCase(Locale.US));
                        }
                        i15++;
                        i14 = 4;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                    }
                    String string2 = sb2.toString();
                    C3215a c3215a = new C3215a(context, new C8997g(str2, str10, strReplaceAll, strReplaceAll2, c7331e0, string2.length() > 0 ? CommonUtils.m9159k(string2) : null, str7, string, DeliveryMechanism.determineFrom(strM14748d2).getId()), c7341l, c8994d, c9166r, c5502r, c7323a0);
                    c3215a.m9172c(executorServiceM14743a).mo12104f(executorServiceM14743a, new C6039c());
                    C7352w c7352w4 = c7352w;
                    C7332f c7332f = c7352w4.f41106m;
                    C8597b c8597b2 = c7352w4.f41102i;
                    Context context2 = c7352w4.f41094a;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        z10 = true;
                    } else {
                        int iM9154f4 = CommonUtils.m9154f(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iM9154f4 > 0) {
                            z10 = resources.getBoolean(iM9154f4);
                        } else {
                            int iM9154f5 = CommonUtils.m9154f(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iM9154f5 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(iM9154f5));
                            } else {
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        c7322a = c7322a2;
                        if (TextUtils.isEmpty(c7322a.f41014b)) {
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".     |  | ");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                            Log.e("FirebaseCrashlytics", ".    \\    /");
                            Log.e("FirebaseCrashlytics", ".     \\  /");
                            Log.e("FirebaseCrashlytics", ".      \\/");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".      /\\");
                            Log.e("FirebaseCrashlytics", ".     /  \\");
                            Log.e("FirebaseCrashlytics", ".    /    \\");
                            Log.e("FirebaseCrashlytics", ".   / |  | \\");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".");
                            z11 = false;
                        }
                        if (z11) {
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                        new C7330e(c7352w4.f41101h);
                        String str12 = C7330e.f41041b;
                        try {
                            int i16 = 7;
                            c7352w4.f41099f = new C0322j("crash_marker", i16, c8597b2);
                            c7352w4.f41098e = new C0322j("initialization_marker", i16, c8597b2);
                            C7550h c7550h = new C7550h(str12, c8597b2, c7332f);
                            C7545c c7545c = new C7545c(c8597b2);
                            executorService = executorServiceM14743a;
                            try {
                                try {
                                    c7352w4.f41100g = new C3213b(c7352w4.f41094a, c7352w4.f41106m, c7352w4.f41101h, c7352w4.f41095b, c7352w4.f41102i, c7352w4.f41099f, c7322a, c7550h, c7545c, C7335g0.m14751b(c7352w4.f41094a, c7352w4.f41101h, c7352w4.f41102i, c7322a, c7545c, c7550h, new C5454b(new C9000b()), c3215a, c7352w4.f41096c), c7352w4.f41107n, c7352w4.f41104k);
                                    C0322j c0322j = c7352w4.f41098e;
                                    C8597b c8597b3 = (C8597b) c0322j.f1239c;
                                    String str13 = (String) c0322j.f1238b;
                                    c8597b3.getClass();
                                    zExists = new File(c8597b3.f46076b, str13).exists();
                                    try {
                                        Boolean.TRUE.equals((Boolean) C7337h0.m14755a(c7332f.m14749a(new CallableC7353x(c7352w4))));
                                    } catch (Exception unused) {
                                    }
                                    C3213b c3213b = c7352w4.f41100g;
                                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                    c3213b.getClass();
                                    c3213b.f16209e.m14749a(new CallableC7347r(c3213b, str12));
                                    C3214c c3214c = new C3214c(new C3212a(c3213b), c3215a, defaultUncaughtExceptionHandler, c3213b.f16214j);
                                    c3213b.f16217m = c3214c;
                                    Thread.setDefaultUncaughtExceptionHandler(c3214c);
                                    if (!zExists) {
                                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        if (z12 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting())) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            str = "FirebaseCrashlytics";
                                            try {
                                                if (Log.isLoggable(str, 3)) {
                                                    Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                                }
                                                c7352w4.m14757b(c3215a);
                                            } catch (Exception e10) {
                                                e = e10;
                                                Log.e(str, "Crashlytics was not started due to an exception during initialization", e);
                                                c7352w4.f41100g = null;
                                            }
                                        } else {
                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                            }
                                            z14 = true;
                                        }
                                    } else {
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                        }
                                        z14 = true;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    str = "FirebaseCrashlytics";
                                }
                            } catch (Exception e12) {
                                e = e12;
                                str = "FirebaseCrashlytics";
                                Log.e(str, "Crashlytics was not started due to an exception during initialization", e);
                                c7352w4.f41100g = null;
                                Tasks.m8538b(executorService, new CallableC6040d(z14, c7352w4, c3215a));
                                return new C6041e(c7352w4);
                            }
                            break;
                        } catch (Exception e13) {
                            e = e13;
                            executorService = executorServiceM14743a;
                        }
                        Tasks.m8538b(executorService, new CallableC6040d(z14, c7352w4, c3215a));
                        return new C6041e(c7352w4);
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                    }
                    c7322a = c7322a2;
                    z11 = true;
                    if (z11) {
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                    new C7330e(c7352w4.f41101h);
                    String str14 = C7330e.f41041b;
                    int i17 = 7;
                    c7352w4.f41099f = new C0322j("crash_marker", i17, c8597b2);
                    c7352w4.f41098e = new C0322j("initialization_marker", i17, c8597b2);
                    C7550h c7550h2 = new C7550h(str14, c8597b2, c7332f);
                    C7545c c7545c2 = new C7545c(c8597b2);
                    executorService = executorServiceM14743a;
                    c7352w4.f41100g = new C3213b(c7352w4.f41094a, c7352w4.f41106m, c7352w4.f41101h, c7352w4.f41095b, c7352w4.f41102i, c7352w4.f41099f, c7322a, c7550h2, c7545c2, C7335g0.m14751b(c7352w4.f41094a, c7352w4.f41101h, c7352w4.f41102i, c7322a, c7545c2, c7550h2, new C5454b(new C9000b()), c3215a, c7352w4.f41096c), c7352w4.f41107n, c7352w4.f41104k);
                    C0322j c0322j2 = c7352w4.f41098e;
                    C8597b c8597b4 = (C8597b) c0322j2.f1239c;
                    String str15 = (String) c0322j2.f1238b;
                    c8597b4.getClass();
                    zExists = new File(c8597b4.f46076b, str15).exists();
                    Boolean.TRUE.equals((Boolean) C7337h0.m14755a(c7332f.m14749a(new CallableC7353x(c7352w4))));
                    C3213b c3213b2 = c7352w4.f41100g;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    c3213b2.getClass();
                    c3213b2.f16209e.m14749a(new CallableC7347r(c3213b2, str14));
                    C3214c c3214c2 = new C3214c(new C3212a(c3213b2), c3215a, defaultUncaughtExceptionHandler2, c3213b2.f16214j);
                    c3213b2.f16217m = c3214c2;
                    Thread.setDefaultUncaughtExceptionHandler(c3214c2);
                    if (!zExists) {
                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            str = "FirebaseCrashlytics";
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            c7352w4.m14757b(c3215a);
                        } else {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            z14 = true;
                        }
                        break;
                    } else {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                        }
                        z14 = true;
                    }
                    Tasks.m8538b(executorService, new CallableC6040d(z14, c7352w4, c3215a));
                    return new C6041e(c7352w4);
                } catch (PackageManager.NameNotFoundException e14) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e14);
                    return null;
                }
            default:
                return new C3218a((Context) c5528t.mo11748a(Context.class), ((C0065e) c5528t.mo11748a(C0065e.class)).m438c(), c5528t.mo11754g(C5527s.m11765a(InterfaceC0070c.class)), c5528t.mo11750c(InterfaceC6475g.class), (Executor) c5528t.mo11749b((C5527s) obj));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m11742l(C7925e c7925e, ArrayList arrayList) {
        InterfaceC2052l interfaceC2052l = (InterfaceC2052l) this.f34148b;
        C5207g.m11111f(interfaceC2052l, "$result");
        C5207g.m11111f(c7925e, "billingResult");
        if (c7925e.f43186a == 0 && arrayList.size() > 0) {
            interfaceC2052l.mo528n(arrayList);
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public void mo780n(Object obj) {
        ((InterfaceC2532v.c) obj).mo7491Q(C2413j.this.f12284Q);
    }
}
