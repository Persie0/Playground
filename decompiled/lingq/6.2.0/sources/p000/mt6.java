package p000;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amplitude.android.internal.gestures.C0888c;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ClockFaceView;
import com.lingq.core.player.service.PlayerService;
import com.lingq.feature.onboarding.OnboardingEndFragment;
import com.lingq.feature.onboarding.OnboardingStartFragment;
import com.lingq.feature.review.views.ReviewProgressBar;
import curtains.AbstractC2898a;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mt6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f51827b;

    public /* synthetic */ mt6(cj9 cj9Var, ArrayList arrayList, String str) {
        this.f51826a = 10;
        this.f51827b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l67 l67Var;
        int i = this.f51826a;
        Object obj = this.f51827b;
        switch (i) {
            case 0:
                OnboardingEndFragment onboardingEndFragment = (OnboardingEndFragment) obj;
                bh4[] bh4VarArr = OnboardingEndFragment.f26907H0;
                if (onboardingEndFragment.m2115q()) {
                    ud6 ud6VarM3244j = b34.m3244j(onboardingEndFragment);
                    qt6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j, zb6.m25538a(), null);
                    return;
                }
                return;
            case 1:
                OnboardingStartFragment onboardingStartFragment = (OnboardingStartFragment) obj;
                if (onboardingStartFragment.m2115q()) {
                    ud6 ud6VarM3244j2 = b34.m3244j(onboardingStartFragment);
                    tw6.Companion.getClass();
                    ac6.Companion.getClass();
                    jfa.m14428k(ud6VarM3244j2, zb6.m25538a(), null);
                    return;
                }
                return;
            case 2:
                ((z97) obj).f71239m--;
                return;
            case 3:
                bc7 bc7Var = PlayerService.Companion;
                ((PlayerService) obj).m8471c().m8447J();
                return;
            case 4:
                ((ClockFaceView) obj).m6251p();
                return;
            case 5:
                ReviewProgressBar.m9654a((ReviewProgressBar) obj);
                return;
            case 6:
                hz8 hz8Var = (hz8) obj;
                synchronized (hz8Var.f43246a.m20702r()) {
                    try {
                        mm7 mm7VarM20702r = hz8Var.f43246a.m20702r();
                        synchronized (mm7VarM20702r) {
                            l67Var = mm7VarM20702r.f51526b;
                        }
                        if (l67Var == null) {
                            return;
                        }
                        l67Var.m15902e(hz8Var.f43247b.f35077a, hz8Var.f43249d);
                        hz8Var.f43246a.m20702r().m16920F(l67Var);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 7:
                w41 w41Var = (w41) obj;
                synchronized (((ArrayDeque) w41Var.f66368d)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) w41Var.f66365a).edit();
                    String str = (String) w41Var.f66366b;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) w41Var.f66368d).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) w41Var.f66367c);
                    }
                    editorEdit.putString(str, sb.toString()).apply();
                    break;
                }
                return;
            case 8:
                kg0 kg0Var = (kg0) obj;
                kg0Var.f47156c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) kg0Var.f47158e;
                ita itaVar = sideSheetBehavior.f13093i;
                if (itaVar != null && itaVar.m14133f()) {
                    kg0Var.m15171a(kg0Var.f47155b);
                    return;
                } else {
                    if (sideSheetBehavior.f13092h == 2) {
                        sideSheetBehavior.m6167x(kg0Var.f47155b);
                        return;
                    }
                    return;
                }
            case 9:
                gf9 gf9Var = (gf9) obj;
                Surface surface = gf9Var.f40747h;
                if (surface != null) {
                    Iterator it2 = gf9Var.f40740a.iterator();
                    while (it2.hasNext()) {
                        ((ew2) it2.next()).f37985a.m14698D(null);
                    }
                }
                SurfaceTexture surfaceTexture = gf9Var.f40746g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                gf9Var.f40746g = null;
                gf9Var.f40747h = null;
                return;
            case 10:
                Iterator it3 = ((ArrayList) obj).iterator();
                if (it3.hasNext()) {
                    throw wq1.m24110f(it3);
                }
                return;
            case 11:
                int[] iArr = SwipeRefreshLayout.f7073g0;
                ((SwipeRefreshLayout) obj).m2886l();
                return;
            case 12:
                hp9 hp9Var = ((jp9) obj).f45972a;
                ViewParent parent = hp9Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(hp9Var);
                    return;
                }
                return;
            case 13:
                ((TextInputLayout) obj).f13286e.requestLayout();
                return;
            case 14:
                s5a s5aVar = ((Toolbar) obj).f1187j0;
                mw5 mw5Var = s5aVar != null ? s5aVar.f60391b : null;
                if (mw5Var != null) {
                    mw5Var.collapseActionView();
                    return;
                }
                return;
            case 15:
                cqa cqaVar = (cqa) obj;
                cqaVar.f7370a.postVsyncCallback(cqaVar);
                return;
            case 16:
                eua euaVar = (eua) obj;
                if (lp1.f49971a.contains(eua.class)) {
                    return;
                }
                try {
                    WeakReference weakReference = euaVar.f37917a;
                    View viewM23508s = AbstractC3695vr.m23508s((Activity) weakReference.get());
                    Activity activity = (Activity) weakReference.get();
                    if (viewM23508s != null && activity != null) {
                        for (View view : in9.m14034a(viewM23508s)) {
                            if (!bw8.m4197k(view)) {
                                String strM14036d = in9.m14036d(view);
                                if (strM14036d.length() > 0 && strM14036d.length() <= 300) {
                                    HashSet hashSet = gua.f41351e;
                                    String localClassName = activity.getLocalClassName();
                                    localClassName.getClass();
                                    to2.m22255e(view, viewM23508s, localClassName);
                                }
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                } catch (Throwable th2) {
                    lp1.m16420a(eua.class, th2);
                    return;
                }
            case 17:
                C0888c c0888c = (C0888c) obj;
                c0888c.getClass();
                c0888c.f10856f = false;
                ((ii8) AbstractC2898a.f34565a.getValue()).f44147a.remove(c0888c.f10858h);
                Iterator it4 = u91.m22622n1(c0888c.f10855e.keySet()).iterator();
                while (it4.hasNext()) {
                    c0888c.m5075b((Window) it4.next());
                }
                return;
            default:
                h7b h7bVar = (h7b) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + h7bVar.f41922a.getAction() + " finishing.");
                h7bVar.f41923b.m24140d(null);
                return;
        }
    }

    public /* synthetic */ mt6(Object obj, int i) {
        this.f51826a = i;
        this.f51827b = obj;
    }
}
