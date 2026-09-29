package p000;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.iterable.iterableapi.AbstractC1208d;
import com.iterable.iterableapi.C1209e;
import com.iterable.iterableapi.R$anim;

/* JADX INFO: loaded from: classes2.dex */
public final class ac4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f483a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1209e f484b;

    public /* synthetic */ ac4(C1209e c1209e, int i) {
        this.f483a = i;
        this.f484b = c1209e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Dialog dialog;
        Dialog dialog2;
        int i = this.f483a;
        C1209e c1209e = this.f484b;
        switch (i) {
            case 0:
                if (c1209e.mo2107i() != null && (dialog = c1209e.f8417H0) != null && dialog.getWindow() != null) {
                    c1209e.m6905l0(new ColorDrawable(0), c1209e.m6907n0());
                    c1209e.f14001M0.setAlpha(1.0f);
                    c1209e.f14001M0.setVisibility(0);
                    if (c1209e.f14011W0) {
                        int i2 = AbstractC1208d.f13997a[C1209e.m6903o0(c1209e.f14010V0).ordinal()];
                        int i3 = i2 != 1 ? (i2 == 2 || i2 == 3 || i2 != 4) ? R$anim.fade_in_custom : R$anim.slide_up_custom : R$anim.slide_down_custom;
                        try {
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(c1209e.mo2107i(), i3);
                            animationLoadAnimation.setDuration(500L);
                            c1209e.f14001M0.startAnimation(animationLoadAnimation);
                        } catch (Exception unused) {
                            eh0.m11135p("IterableInAppFragmentHTMLNotification", "Failed to show inapp with animation");
                            return;
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (c1209e.mo2107i() != null && (dialog2 = c1209e.f8417H0) != null && dialog2.getWindow() != null) {
                    c1209e.m3658d0();
                    break;
                }
                break;
            default:
                sc4 sc4Var = c1209e.f14001M0;
                if (sc4Var == null) {
                    eh0.m11121R("IterableInAppFragmentHTMLNotification", "WebView is null, skipping resize");
                    break;
                } else {
                    float contentHeight = sc4Var.getContentHeight();
                    if (contentHeight <= 0.0f) {
                        eh0.m11121R("IterableInAppFragmentHTMLNotification", "Invalid content height: " + contentHeight + "dp, skipping resize");
                        break;
                    } else if (Math.abs(contentHeight - c1209e.f14009U0) < 1.0f) {
                        eh0.m11133m("IterableInAppFragmentHTMLNotification", "Content height unchanged (" + contentHeight + "dp), skipping resize");
                        break;
                    } else {
                        c1209e.f14009U0 = contentHeight;
                        eh0.m11133m("IterableInAppFragmentHTMLNotification", "💚 Resizing in-app to height: " + contentHeight + "dp");
                        id3 id3VarM2105g = c1209e.m2105g();
                        if (id3VarM2105g != null) {
                            id3VarM2105g.runOnUiThread(new bc4(c1209e, id3VarM2105g, contentHeight));
                            break;
                        }
                    }
                }
                break;
        }
    }
}
