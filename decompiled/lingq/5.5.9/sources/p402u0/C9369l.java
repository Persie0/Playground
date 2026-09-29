package p402u0;

import ae.C0062b;
import ae.C0065e;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0762b;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2467q;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.audio.C2367a;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.mediacodec.C2427d;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.C3083d;
import com.google.firebase.installations.C3219a;
import com.google.firebase.messaging.BinderC3242f0;
import com.google.firebase.messaging.ServiceConnectionC3244g0;
import com.lingq.p055ui.home.HomeFragment;
import com.lingq.p055ui.home.collections.CollectionsFragment;
import com.lingq.p055ui.lesson.stats.LessonCompleteFragment;
import com.lingq.p055ui.onboarding.OnboardingFinishFragment;
import com.lingq.p055ui.onboarding.OnboardingTopicsFragment;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.p055ui.token.ViewLearnProgress;
import com.lingq.p055ui.upgrade.UpgradeFragment;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import dm.C5212l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import je.C6467c;
import je.C6468d;
import ke.InterfaceC6663a;
import km.InterfaceC6727j;
import ni.C7797e;
import p045c9.C1755i;
import p047ce.C2000b;
import p047ce.InterfaceC1999a;
import p068d9.C5104r;
import p068d9.InterfaceC5090d;
import p073df.InterfaceC5162d;
import p090e9.InterfaceC5385a;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p136gc.InterfaceC5745a;
import p136gc.InterfaceC5747c;
import p150h9.C5920j0;
import p155he.C6037a;
import p155he.C6038b;
import p155he.C6041e;
import p194j8.C6423a;
import p241le.C7337h0;
import p278nh.C7777d;
import p312p2.C8170b;
import p338qd.C8573r0;
import p382s7.C8969b;
import p387t0.C9166r;
import p395t8.C9220b;
import p452w8.AbstractC9838s;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import p479xa.C10144m;
import p479xa.InterfaceC10137f;
import ph.C8257b1;

/* JADX INFO: renamed from: u0.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9369l implements InterfaceC9366i, NavigationBarView.InterfaceC3044b, FeatureManager.InterfaceC2304a, InterfaceC5385a.a, C5104r.a, C10144m.a, InterfaceC10137f, MediaCodecUtil.InterfaceC2423e, InterfaceC2004a.a, InterfaceC5745a, InterfaceC5747c, InterfaceC10060r, Toolbar.InterfaceC0293h, C3083d.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48141b;

    public /* synthetic */ C9369l(int i10, Object obj) {
        this.f48140a = i10;
        this.f48141b = obj;
    }

    @Override // p479xa.InterfaceC10137f
    /* JADX INFO: renamed from: a */
    public final void mo12173a(Object obj) {
        ((InterfaceC2398b.a) obj).m6971e((Exception) this.f48141b);
    }

    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        int i10 = this.f48140a;
        Object obj2 = this.f48141b;
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C5104r c5104r = (C5104r) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C9220b c9220b = C5104r.f33055f;
                c5104r.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c5104r.f33057b.mo11713a()).execute();
                break;
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                C9220b c9220b2 = C5104r.f33055f;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j10));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j10), hashSet);
                    }
                    hashSet.add(new C5104r.b(cursor.getString(1), cursor.getString(2)));
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        int i10 = this.f48140a;
        Object obj = this.f48141b;
        switch (i10) {
            case 20:
                CollectionsFragment collectionsFragment = (CollectionsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                C5207g.m11111f(collectionsFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialToolbar materialToolbar = collectionsFragment.m9799o0().f45303d;
                C5207g.m11110e(materialToolbar, "binding.toolbar");
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), c8170bM18864a.f44303b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                SwipeRefreshLayout swipeRefreshLayout = collectionsFragment.m9799o0().f45302c;
                C5207g.m11110e(swipeRefreshLayout, "binding.swipeContainer");
                ViewGroup.LayoutParams layoutParams = swipeRefreshLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = c8170bM18864a.f44305d;
                swipeRefreshLayout.setLayoutParams(marginLayoutParams);
                return C10063s0.f51076b;
            case 21:
            case 22:
            default:
                UpgradeFragment upgradeFragment = (UpgradeFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = UpgradeFragment.f31981F0;
                C5207g.m11111f(upgradeFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a2 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a2, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                AppBarLayout appBarLayout = upgradeFragment.m10408p0().f44556a;
                C5207g.m11110e(appBarLayout, "binding.appbar");
                appBarLayout.setPadding(appBarLayout.getPaddingLeft(), c8170bM18864a2.f44303b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
                NestedScrollView nestedScrollView = upgradeFragment.m10408p0().f44557b;
                C5207g.m11110e(nestedScrollView, "binding.scrollView");
                nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingRight(), c8170bM18864a2.f44305d);
                return C10063s0.f51076b;
            case 23:
                OnboardingFinishFragment onboardingFinishFragment = (OnboardingFinishFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = OnboardingFinishFragment.f29364J0;
                C5207g.m11111f(onboardingFinishFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a3 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a3, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                AppBarLayout appBarLayout2 = ((C8257b1) onboardingFinishFragment.f29368D0.m10489a(onboardingFinishFragment, OnboardingFinishFragment.f29364J0[0])).f44611a;
                C5207g.m11110e(appBarLayout2, "binding.appbar");
                ViewGroup.LayoutParams layoutParams2 = appBarLayout2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = c8170bM18864a3.f44303b;
                appBarLayout2.setLayoutParams(marginLayoutParams2);
                return C10063s0.f51076b;
            case 24:
                OnboardingTopicsFragment onboardingTopicsFragment = (OnboardingTopicsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = OnboardingTopicsFragment.f29419D0;
                C5207g.m11111f(onboardingTopicsFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a4 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a4, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                AppBarLayout appBarLayout3 = onboardingTopicsFragment.m10238n0().f44716a;
                C5207g.m11110e(appBarLayout3, "binding.appbar");
                ViewGroup.LayoutParams layoutParams3 = appBarLayout3.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.topMargin = c8170bM18864a4.f44303b;
                appBarLayout3.setLayoutParams(marginLayoutParams3);
                RecyclerView recyclerView = onboardingTopicsFragment.m10238n0().f44717b;
                C5207g.m11110e(recyclerView, "binding.rvContent");
                int paddingLeft = recyclerView.getPaddingLeft();
                int paddingTop = recyclerView.getPaddingTop();
                int paddingRight = recyclerView.getPaddingRight();
                int i11 = c8170bM18864a4.f44305d;
                recyclerView.setPadding(paddingLeft, paddingTop, paddingRight, i11);
                MaterialButton materialButton = onboardingTopicsFragment.m10238n0().f44719d;
                C5207g.m11110e(materialButton, "binding.tvContinue");
                ViewGroup.LayoutParams layoutParams4 = materialButton.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.bottomMargin = i11;
                materialButton.setLayoutParams(marginLayoutParams4);
                return C10063s0.f51076b;
            case 25:
                TokenFragment tokenFragment = (TokenFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = TokenFragment.f31202R0;
                C5207g.m11111f(tokenFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a5 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a5, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                C0762b c0762bM2809z = tokenFragment.m10362n0().f45395q.m2809z(R.id.expandedTransition);
                if (c0762bM2809z != null) {
                    c0762bM2809z.m2899q(tokenFragment.m10362n0().f45377Y.getId(), c8170bM18864a5.f44303b);
                }
                if (!C7777d.m15481b(tokenFragment)) {
                    ViewLearnProgress viewLearnProgress = tokenFragment.m10362n0().f45373U;
                    C5207g.m11110e(viewLearnProgress, "binding.viewLearn");
                    ViewGroup.LayoutParams layoutParams5 = viewLearnProgress.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams5.bottomMargin = c8170bM18864a5.f44305d;
                    viewLearnProgress.setLayoutParams(marginLayoutParams5);
                }
                return C10063s0.f51076b;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC2423e
    /* JADX INFO: renamed from: d */
    public final int mo7175d(Object obj) {
        C2416m c2416m = (C2416m) this.f48141b;
        C2427d c2427d = (C2427d) obj;
        Pattern pattern = MediaCodecUtil.f12594a;
        c2427d.getClass();
        String str = c2416m.f12484l;
        String str2 = c2427d.f12616b;
        return ((str2.equals(str) || str2.equals(MediaCodecUtil.m7162b(c2416m))) && c2427d.m7197c(c2416m, false)) ? 1 : 0;
    }

    @Override // p136gc.InterfaceC5747c
    /* JADX INFO: renamed from: e */
    public final void mo205e(AbstractC5751g abstractC5751g) {
        int i10 = this.f48140a;
        Object obj = this.f48141b;
        switch (i10) {
            case 18:
                int i11 = BinderC3242f0.f16380b;
                ((ServiceConnectionC3244g0.a) obj).f16392b.m12116d(null);
                return;
            default:
                HomeFragment homeFragment = (HomeFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
                C5207g.m11111f(homeFragment, "this$0");
                C5207g.m11111f(abstractC5751g, "taskToken");
                if (abstractC5751g.mo12111m()) {
                    Object obj2 = C3219a.f16252m;
                    C0065e c0065eM434b = C0065e.m434b();
                    c0065eM434b.m437a();
                    ((C3219a) c0065eM434b.f174d.mo11748a(InterfaceC5162d.class)).getId().mo12100b(new C8969b(abstractC5751g, 11, homeFragment));
                } else {
                    C7797e c7797e = homeFragment.f22659F0;
                    if (c7797e == null) {
                        C5207g.m11117l("utils");
                        throw null;
                    }
                    if (!c7797e.m15513f()) {
                        C6041e c6041eM12476a = C6041e.m12476a();
                        Exception excMo12106h = abstractC5751g.mo12106h();
                        if (excMo12106h == null) {
                            excMo12106h = new Exception("getInstanceId failed");
                        }
                        c6041eM12476a.m12477b(excMo12106h);
                        return;
                    }
                }
                return;
        }
    }

    @Override // cf.InterfaceC2004a.a
    /* JADX INFO: renamed from: f */
    public final void mo5937f(InterfaceC2005b interfaceC2005b) {
        C6037a c6037a = (C6037a) this.f48141b;
        c6037a.getClass();
        C5212l c5212l = C5212l.f33289h;
        c5212l.m11188H("AnalyticsConnector now available.");
        InterfaceC1999a interfaceC1999a = (InterfaceC1999a) interfaceC2005b.get();
        C9166r c9166r = new C9166r(interfaceC1999a);
        C6038b c6038b = new C6038b();
        C2000b c2000bMo5933a = interfaceC1999a.mo5933a("clx", c6038b);
        if (c2000bMo5933a == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            C2000b c2000bMo5933a2 = interfaceC1999a.mo5933a("crash", c6038b);
            if (c2000bMo5933a2 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            c2000bMo5933a = c2000bMo5933a2;
        }
        if (c2000bMo5933a == null) {
            c5212l.m11194r0("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c5212l.m11188H("Registered Firebase Analytics listener.");
        C6468d c6468d = new C6468d();
        C6467c c6467c = new C6467c(c9166r, TimeUnit.MILLISECONDS);
        synchronized (c6037a) {
            Iterator it = c6037a.f35682c.iterator();
            while (it.hasNext()) {
                c6468d.mo11739b((InterfaceC6663a) it.next());
            }
            c6038b.f35684b = c6468d;
            c6038b.f35683a = c6467c;
            c6037a.f35681b = c6468d;
            c6037a.f35680a = c6467c;
        }
    }

    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public final Object mo4925g() {
        int i10 = this.f48140a;
        Object obj = this.f48141b;
        switch (i10) {
            case 4:
                return Integer.valueOf(((InterfaceC5090d) obj).mo10859d());
            default:
                C1755i c1755i = (C1755i) obj;
                Iterator it = c1755i.f9649b.mo10856N().iterator();
                while (it.hasNext()) {
                    c1755i.f9650c.mo5483a((AbstractC9838s) it.next(), 1);
                }
                return null;
        }
    }

    @Override // com.facebook.internal.FeatureManager.InterfaceC2304a
    /* JADX INFO: renamed from: h */
    public final void mo6668h(boolean z10) {
        String str = (String) this.f48141b;
        int i10 = FacebookException.f11435a;
        if (z10) {
            try {
                C6423a c6423a = new C6423a(str);
                if ((c6423a.f36899b == null || c6423a.f36900c == null) ? false : true) {
                    C5206f.m10980A1(c6423a.f36898a, c6423a.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g abstractC5751g) {
        int i10 = this.f48140a;
        Object obj = this.f48141b;
        switch (i10) {
            case 16:
                ExecutorService executorService = C7337h0.f41062a;
                ((CountDownLatch) obj).countDown();
                break;
            default:
                C5752h c5752h = (C5752h) obj;
                ExecutorService executorService2 = C7337h0.f41062a;
                if (abstractC5751g.mo12111m()) {
                    c5752h.m12116d(abstractC5751g.mo12107i());
                } else if (abstractC5751g.mo12106h() != null) {
                    c5752h.m12115c(abstractC5751g.mo12106h());
                }
                break;
        }
        return null;
    }

    @Override // p402u0.InterfaceC9366i
    /* JADX INFO: renamed from: j */
    public final double mo11741j(double d10) {
        int i10 = this.f48140a;
        Object obj = this.f48141b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C9374q c9374q = (C9374q) obj;
                C5207g.m11111f(c9374q, "this$0");
                return C0062b.m354i0(c9374q.f48156k.mo11741j(d10), c9374q.f48150e, c9374q.f48151f);
            default:
                C9375r c9375r = (C9375r) obj;
                C5207g.m11111f(c9375r, "$function");
                double d11 = c9375r.f48165e;
                double d12 = c9375r.f48164d;
                return d10 >= d11 * d12 ? (Math.pow(d10 - c9375r.f48166f, 1.0d / c9375r.f48161a) - c9375r.f48163c) / c9375r.f48162b : (d10 - c9375r.f48167g) / d12;
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f48140a;
        Object obj2 = this.f48141b;
        switch (i10) {
            case 9:
                int i11 = C2413j.f12267x0;
                ((InterfaceC2532v.c) obj).mo7496Z((C2367a) obj2);
                break;
            case 10:
                ((InterfaceC2532v.c) obj).mo7508s0(C2413j.m7017o((C5920j0) obj2));
                break;
            case 11:
                int i12 = C2413j.f12267x0;
                ((InterfaceC2532v.c) obj).mo7491Q((C2467q) obj2);
                break;
            default:
                ((InterfaceC2532v.c) obj).mo7486D(((C2413j) obj2).f12283P);
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.InterfaceC0293h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        LessonCompleteFragment lessonCompleteFragment = (LessonCompleteFragment) this.f48141b;
        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
        C5207g.m11111f(lessonCompleteFragment, "this$0");
        if (menuItem.getItemId() == R.id.action_quit) {
            C8573r0.m16725g0(lessonCompleteFragment).m3996q(R.id.fragment_lesson, true);
        }
        return true;
    }
}
