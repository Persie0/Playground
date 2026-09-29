package p402u0;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.InterfaceC0957i0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cm.InterfaceC2056p;
import com.facebook.login.LoginClient;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.messaging.C3234b0;
import com.google.firebase.messaging.C3249l;
import com.google.firebase.messaging.C3260w;
import com.google.firebase.messaging.FirebaseMessaging;
import com.lingq.p055ui.home.WebViewFragment;
import com.lingq.p055ui.home.course.AbstractC3689c;
import com.lingq.p055ui.home.course.CourseFragment;
import com.lingq.p055ui.home.course.CoursePlaylistFragment;
import com.lingq.p055ui.home.course.CourseViewModel;
import com.lingq.p055ui.lesson.tutorial.LessonDealWithWordsFragment;
import com.lingq.p055ui.session.RegisterFragment;
import com.lingq.p055ui.session.magiclink.CheckEmailFragment;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import je.InterfaceC6465a;
import km.InterfaceC6727j;
import p004a3.InterfaceC0014d;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p136gc.InterfaceC5745a;
import p136gc.InterfaceC5749e;
import p155he.C6037a;
import p181ii.C6332a;
import p218k9.AbstractC6636f;
import p219ka.C6642c;
import p241le.C7337h0;
import p312p2.C8170b;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;
import p479xa.C10144m;
import ph.C8318l2;
import ua.C9508q;

/* JADX INFO: renamed from: u0.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9371n implements InterfaceC9366i, InterfaceC0014d, InterfaceC0957i0, LoginClient.InterfaceC2324c, C10144m.a, AbstractC6636f.a, InterfaceC6465a, InterfaceC5745a, InterfaceC5749e, NavigationBarView.InterfaceC3043a, InterfaceC10060r, Toolbar.InterfaceC0293h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48145b;

    public /* synthetic */ C9371n(int i10, Object obj) {
        this.f48144a = i10;
        this.f48145b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p136gc.InterfaceC5749e
    /* JADX INFO: renamed from: a */
    public final void mo12098a(Object obj) {
        boolean zBooleanValue;
        boolean z10;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f48145b;
        C3234b0 c3234b0 = (C3234b0) obj;
        C3260w c3260w = FirebaseMessaging.f16304m;
        FirebaseMessaging.C3229a c3229a = firebaseMessaging.f16313g;
        synchronized (c3229a) {
            try {
                c3229a.m9235a();
                Boolean bool = c3229a.f16320c;
                zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f16307a.m440g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zBooleanValue) {
            if (c3234b0.f16360h.m9299a() != null) {
                synchronized (c3234b0) {
                    z10 = c3234b0.f16359g;
                }
                if (!z10) {
                    c3234b0.m9244f(0L);
                }
            }
        }
    }

    @Override // androidx.fragment.app.InterfaceC0957i0
    /* JADX INFO: renamed from: b */
    public final void mo3679b(Bundle bundle, String str) {
        InterfaceC2056p interfaceC2056p = (InterfaceC2056p) this.f48145b;
        C5207g.m11111f(interfaceC2056p, "$tmp0");
        C5207g.m11111f(str, "p0");
        interfaceC2056p.mo1337m0(str, bundle);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        int i10 = this.f48144a;
        Object obj = this.f48145b;
        switch (i10) {
            case 14:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr = WebViewFragment.f22829S0;
                C5207g.m11111f(webViewFragment, "this$0");
                C5207g.m11111f(view, "<anonymous parameter 0>");
                C8170b c8170bM18864a = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                InterfaceC6727j<?>[] interfaceC6727jArr2 = WebViewFragment.f22829S0;
                InterfaceC6727j<?> interfaceC6727j = interfaceC6727jArr2[0];
                FragmentViewBindingDelegate fragmentViewBindingDelegate = webViewFragment.f22830Q0;
                AppBarLayout appBarLayout = ((C8318l2) fragmentViewBindingDelegate.m10489a(webViewFragment, interfaceC6727j)).f45006a;
                C5207g.m11110e(appBarLayout, "binding.appbar");
                appBarLayout.setPadding(appBarLayout.getPaddingLeft(), c8170bM18864a.f44303b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
                WebView webView = ((C8318l2) fragmentViewBindingDelegate.m10489a(webViewFragment, interfaceC6727jArr2[0])).f45009d;
                C5207g.m11110e(webView, "binding.webView");
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = c8170bM18864a.f44305d;
                webView.setLayoutParams(marginLayoutParams);
                return C10063s0.f51076b;
            case 15:
            default:
                CheckEmailFragment checkEmailFragment = (CheckEmailFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = CheckEmailFragment.f30844E0;
                C5207g.m11111f(checkEmailFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a2 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a2, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                if (checkEmailFragment.f30848D0 == -1) {
                    checkEmailFragment.f30848D0 = c8170bM18864a2.f44303b;
                }
                ConstraintLayout constraintLayout = checkEmailFragment.m10345o0().f44831f;
                C5207g.m11110e(constraintLayout, "binding.viewContent");
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.bottomMargin = c8170bM18864a2.f44305d;
                marginLayoutParams2.topMargin = checkEmailFragment.f30848D0;
                constraintLayout.setLayoutParams(marginLayoutParams2);
                return C10063s0.f51076b;
            case 16:
                CoursePlaylistFragment coursePlaylistFragment = (CoursePlaylistFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = CoursePlaylistFragment.f23761G0;
                C5207g.m11111f(coursePlaylistFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a3 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a3, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialToolbar materialToolbar = coursePlaylistFragment.m9860o0().f44944e;
                C5207g.m11110e(materialToolbar, "binding.toolbar");
                materialToolbar.setPadding(materialToolbar.getPaddingLeft(), c8170bM18864a3.f44303b, materialToolbar.getPaddingRight(), materialToolbar.getPaddingBottom());
                MaterialCardView materialCardView = coursePlaylistFragment.m9860o0().f44941b;
                C5207g.m11110e(materialCardView, "binding.playerCard");
                ViewGroup.LayoutParams layoutParams3 = materialCardView.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                int i11 = c8170bM18864a3.f44305d;
                marginLayoutParams3.bottomMargin = i11;
                materialCardView.setLayoutParams(marginLayoutParams3);
                SwipeRefreshLayout swipeRefreshLayout = coursePlaylistFragment.m9860o0().f44943d;
                C5207g.m11110e(swipeRefreshLayout, "binding.swipeContainer");
                ViewGroup.LayoutParams layoutParams4 = swipeRefreshLayout.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams4.bottomMargin = i11;
                swipeRefreshLayout.setLayoutParams(marginLayoutParams4);
                return C10063s0.f51076b;
            case 17:
                LessonDealWithWordsFragment lessonDealWithWordsFragment = (LessonDealWithWordsFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr5 = LessonDealWithWordsFragment.f29086F0;
                C5207g.m11111f(lessonDealWithWordsFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a4 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a4, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                MaterialCardView materialCardView2 = lessonDealWithWordsFragment.m10224n0().f44834c;
                C5207g.m11110e(materialCardView2, "binding.cardView");
                ViewGroup.LayoutParams layoutParams5 = materialCardView2.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                marginLayoutParams5.bottomMargin = c8170bM18864a4.f44305d;
                marginLayoutParams5.topMargin = c8170bM18864a4.f44303b;
                materialCardView2.setLayoutParams(marginLayoutParams5);
                return C10063s0.f51076b;
            case 18:
                RegisterFragment registerFragment = (RegisterFragment) obj;
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = RegisterFragment.f30733J0;
                C5207g.m11111f(registerFragment, "this$0");
                C5207g.m11111f(view, "view");
                C8170b c8170bM18864a5 = c10063s0.m18864a(7);
                C5207g.m11110e(c8170bM18864a5, "windowInsets.getInsets(W…Compat.Type.systemBars())");
                LinearLayout linearLayout = registerFragment.m10341o0().f44811o;
                C5207g.m11110e(linearLayout, "binding.viewContent");
                ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
                if (layoutParams6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                marginLayoutParams6.bottomMargin = c8170bM18864a5.f44305d;
                marginLayoutParams6.topMargin = c8170bM18864a5.f44303b;
                linearLayout.setLayoutParams(marginLayoutParams6);
                return C10063s0.f51076b;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g abstractC5751g) throws IOException {
        int i10 = this.f48144a;
        Object obj = this.f48145b;
        switch (i10) {
            case 10:
                C5752h c5752h = (C5752h) obj;
                ExecutorService executorService = C7337h0.f41062a;
                if (abstractC5751g.mo12111m()) {
                    c5752h.m12114b(abstractC5751g.mo12107i());
                } else if (abstractC5751g.mo12106h() != null) {
                    c5752h.m12113a(abstractC5751g.mo12106h());
                }
                return null;
            default:
                ((C3249l) obj).getClass();
                Bundle bundle = (Bundle) abstractC5751g.mo12108j(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string == null && (string = bundle.getString("unregistered")) == null) {
                    String string2 = bundle.getString("error");
                    if ("RST".equals(string2)) {
                        throw new IOException("INSTANCE_ID_RESET");
                    }
                    if (string2 != null) {
                        throw new IOException(string2);
                    }
                    Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                return string;
        }
    }

    @Override // p402u0.InterfaceC9366i
    /* JADX INFO: renamed from: j */
    public final double mo11741j(double d10) {
        C9375r c9375r = (C9375r) this.f48145b;
        C5207g.m11111f(c9375r, "$function");
        double d11 = c9375r.f48165e;
        double d12 = c9375r.f48164d;
        return d10 >= d11 * d12 ? (Math.pow(d10, 1.0d / c9375r.f48161a) - c9375r.f48163c) / c9375r.f48162b : d10 / d12;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f48144a;
        Object obj2 = this.f48145b;
        switch (i10) {
            case 5:
                int i11 = C2413j.f12267x0;
                ((InterfaceC2532v.c) obj).mo7495Y((C9508q) obj2);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ((InterfaceC2532v.c) obj).mo7499f((Metadata) obj2);
                break;
            default:
                ((InterfaceC2532v.c) obj).mo7412j((C6642c) obj2);
                break;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.InterfaceC0293h
    public final boolean onMenuItemClick(MenuItem menuItem) {
        CourseFragment courseFragment = (CourseFragment) this.f48145b;
        InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
        C5207g.m11111f(courseFragment, "this$0");
        if (menuItem.getItemId() == R.id.item_menu) {
            CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
            LibraryItemCounter libraryItemCounter = (LibraryItemCounter) courseViewModelM9858q0.f23936S.getValue();
            if (libraryItemCounter != null) {
                int i10 = courseViewModelM9858q0.f23927J.f49749a;
                C6332a c6332a = (C6332a) courseViewModelM9858q0.f23938U.getValue();
                courseViewModelM9858q0.m9896r2(new AbstractC3689c.b(i10, c6332a != null ? c6332a.f36599e : null, libraryItemCounter.f22005b, ((Boolean) courseViewModelM9858q0.f23941X.getValue()).booleanValue(), ((Boolean) courseViewModelM9858q0.f23942Y.getValue()).booleanValue(), courseViewModelM9858q0.m9894p2()));
            }
        }
        return true;
    }

    @Override // je.InterfaceC6465a
    /* JADX INFO: renamed from: p */
    public final void mo13074p(Bundle bundle) {
        ((C6037a) this.f48145b).f35680a.mo13074p(bundle);
    }
}
