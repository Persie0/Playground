package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.elapsedtimeui.ElapsedTimerView;
import com.google.android.apps.camera.p014ui.elapsedtimeui.LongPressElapsedTimeView;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxz implements hxw {

    /* JADX INFO: renamed from: b */
    private static final nbh f29878b = nbh.m17259h("com/google/android/apps/camera/ui/elapsedtimeui/LongPressElapsedTimeUIControllerImpl");

    /* JADX INFO: renamed from: a */
    public LongPressElapsedTimeView f29879a;

    /* JADX INFO: renamed from: c */
    private final Activity f29880c;

    /* JADX INFO: renamed from: d */
    private final hxw f29881d;

    /* JADX INFO: renamed from: e */
    private final hah f29882e;

    /* JADX INFO: renamed from: f */
    private final msi f29883f;

    /* JADX INFO: renamed from: g */
    private ElapsedTimerView f29884g;

    /* JADX INFO: renamed from: h */
    private ViewGroup f29885h;

    /* JADX INFO: renamed from: i */
    private Resources f29886i;

    /* JADX INFO: renamed from: j */
    private final int[] f29887j = new int[2];

    /* JADX INFO: renamed from: k */
    private int f29888k;

    /* JADX INFO: renamed from: l */
    private final boolean f29889l;

    /* JADX INFO: renamed from: m */
    private final int f29890m;

    public hxz(Activity activity, hxw hxwVar, hah hahVar, dhv dhvVar, msi msiVar) {
        this.f29880c = activity;
        this.f29881d = hxwVar;
        this.f29882e = hahVar;
        this.f29883f = msiVar;
        this.f29889l = dhvVar.mo6184l(dii.f11539o);
        this.f29890m = ((Integer) dhvVar.mo6173a(dii.f11525a).get()).intValue();
    }

    /* JADX INFO: renamed from: k */
    private final void m10862k(ViewGroup viewGroup, int i) {
        LongPressElapsedTimeView longPressElapsedTimeView;
        if (viewGroup != this.f29885h && (longPressElapsedTimeView = this.f29879a) != null) {
            viewGroup.removeView(longPressElapsedTimeView);
            this.f29885h.addView(this.f29879a);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29879a.getLayoutParams();
        layoutParams.bottomMargin = this.f29888k;
        layoutParams.topMargin = this.f29888k;
        layoutParams.gravity = i | 1;
        this.f29879a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: l */
    private final void m10863l(C1190zy c1190zy, View view) {
        this.f29880c.findViewById(C0100R.id.bottom_bar).getLocationInWindow(this.f29887j);
        jiy.m13269ad(c1190zy, view, (this.f29887j[1] - this.f29886i.getDimensionPixelSize(C0100R.dimen.timer_height)) - this.f29886i.getDimensionPixelOffset(C0100R.dimen.long_press_bottom_padding));
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: a */
    public final void mo10848a(boolean z) {
        if (!this.f29889l) {
            this.f29881d.mo10848a(z);
            return;
        }
        if (z) {
            LongPressElapsedTimeView longPressElapsedTimeView = this.f29879a;
            longPressElapsedTimeView.removeCallbacks(longPressElapsedTimeView.f7019d);
            this.f29879a.animate().setDuration(200L).setStartDelay(0L).alpha(0.0f).withEndAction(new huh(this, 6));
        } else {
            this.f29879a.animate().cancel();
            this.f29879a.setAlpha(0.0f);
            this.f29879a.setVisibility(8);
        }
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: b */
    public final void mo10849b() {
        this.f29881d.mo10849b();
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: c */
    public final void mo10850c() {
        this.f29881d.mo10850c();
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: d */
    public final void mo10851d(hxv hxvVar) {
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo10852e() {
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: f */
    public final void mo10853f() {
        Display display = this.f29880c.getDisplay();
        if (display == null) {
            throw new IllegalStateException("Orientation can not be determined");
        }
        ilk ilkVarM11426b = this.f29889l ? ilk.m11426b(display, this.f29879a.getContext()) : ilk.m11426b(display, this.f29884g.getContext());
        if ((this.f29883f.mo6051a() != null && jpd.m13431l(((hzp) this.f29883f.mo6051a()).f30074a.f30073i)) || ilk.m11427e(ilkVarM11426b)) {
            LinearLayout linearLayout = this.f29889l ? this.f29879a : this.f29884g;
            ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            ViewGroup viewGroup = (ViewGroup) this.f29880c.findViewById(C0100R.id.activity_root_view);
            viewGroup.addView(linearLayout);
            linearLayout.bringToFront();
            C1190zy c1190zy = new C1190zy();
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
            c1190zy.m19820e(constraintLayout);
            int iM11541m = inr.m11541m(((Integer) this.f29882e.mo10031c(gzy.f27046e)).intValue());
            if (this.f29883f.mo6051a() == null || !jpd.m13431l(((hzp) this.f29883f.mo6051a()).f30074a.f30073i)) {
                switch (iM11541m - 1) {
                    case 0:
                        if (!((Boolean) this.f29882e.mo10031c(gzy.f27062u)).booleanValue()) {
                            View viewFindViewById = this.f29880c.findViewById(C0100R.id.shutter_button);
                            viewFindViewById.getLocationInWindow(this.f29887j);
                            jiy.m13269ad(c1190zy, linearLayout, (((this.f29887j[1] + (viewFindViewById.getHeight() / 2)) - this.f29886i.getDimensionPixelSize(C0100R.dimen.long_pressed_photo_button_radius)) - this.f29886i.getDimensionPixelSize(C0100R.dimen.timer_height)) - this.f29886i.getDimensionPixelOffset(C0100R.dimen.long_press_bottom_padding));
                        } else {
                            m10863l(c1190zy, linearLayout);
                        }
                        break;
                    case 1:
                        m10863l(c1190zy, linearLayout);
                        break;
                    default:
                        ((nbe) ((nbe) f29878b.m17251b()).mo17276G((char) 4024)).mo17290o("Invalid aspect ratio detected!");
                        break;
                }
            } else {
                View viewFindViewById2 = this.f29880c.findViewById(C0100R.id.mode_switcher);
                viewFindViewById2.getLocationInWindow(this.f29887j);
                jiy.m13269ad(c1190zy, linearLayout, (this.f29887j[1] + (viewFindViewById2.getHeight() / 2)) - (this.f29886i.getDimensionPixelSize(C0100R.dimen.timer_height) / 2));
            }
            c1190zy.m19818c(constraintLayout);
            mo10855h(0L);
            m10864j();
            linearLayout.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new huh(linearLayout, 5));
        } else if (this.f29889l) {
            mo10855h(0L);
            if (this.f29885h != null) {
                Display display2 = this.f29880c.getDisplay();
                if (display2 == null) {
                    throw new IllegalStateException("Orientation can not be determined");
                }
                ilk ilkVarM11426b2 = ilk.m11426b(display2, this.f29879a.getContext());
                ViewGroup viewGroup2 = (ViewGroup) this.f29879a.getParent();
                switch (ilkVarM11426b2.ordinal()) {
                    case 1:
                        m10862k(viewGroup2, 80);
                        break;
                    case 2:
                        m10862k(viewGroup2, 48);
                        break;
                }
            }
            m10864j();
            this.f29879a.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new huh(this, 7));
        } else {
            this.f29881d.mo10853f();
        }
        if (this.f29889l) {
            LongPressElapsedTimeView longPressElapsedTimeView = this.f29879a;
            switch (this.f29890m) {
                case 0:
                    longPressElapsedTimeView.f7018c.startAnimation(longPressElapsedTimeView.f7016a);
                    return;
                case 1:
                    longPressElapsedTimeView.f7018c.startAnimation(longPressElapsedTimeView.f7017b);
                    return;
                case 2:
                    longPressElapsedTimeView.f7019d.run();
                    return;
                default:
                    return;
            }
        }
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: g */
    public final void mo10854g(long j) {
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: h */
    public final void mo10855h(long j) {
        if (this.f29889l) {
            this.f29879a.m4367b().setText(DateUtils.formatElapsedTime(Duration.ofMillis(j).getSeconds()));
        } else {
            this.f29881d.mo10855h(j);
        }
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: i */
    public final void mo10856i(LinearLayout linearLayout) {
        if (this.f29889l) {
            this.f29879a = (LongPressElapsedTimeView) linearLayout;
        } else {
            this.f29884g = (ElapsedTimerView) linearLayout;
        }
        this.f29886i = linearLayout.getResources();
        if (this.f29889l) {
            ViewGroup viewGroup = (ViewGroup) this.f29879a.getRootView();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0100R.id.camera_app_root);
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            }
            this.f29885h = (ViewGroup) viewGroup.findViewById(C0100R.id.uncovered_preview_layout);
            this.f29888k = this.f29886i.getDimensionPixelSize(C0100R.dimen.recording_time_landscape_vertical_margin);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10864j() {
        if (this.f29889l) {
            this.f29879a.setBackground(this.f29886i.getDrawable(C0100R.drawable.bg_text_on_video_recording_counter, null));
            int dimensionPixelSize = this.f29886i.getDimensionPixelSize(C0100R.dimen.long_shot_elapsed_timer_text_size);
            int dimensionPixelSize2 = this.f29886i.getDimensionPixelSize(C0100R.dimen.timer_side_padding);
            this.f29879a.m4367b().setTextSize(0, dimensionPixelSize);
            this.f29879a.m4367b().setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            this.f29879a.m4367b().setCompoundDrawablesWithIntrinsicBounds(C0100R.drawable.ic_recording_on_red_circle, 0, 0, 0);
            this.f29879a.m4366a().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f29879a.m4366a().setVisibility(8);
            return;
        }
        this.f29884g.setBackground(this.f29886i.getDrawable(C0100R.drawable.bg_text_on_video_recording_counter, null));
        int dimensionPixelSize3 = this.f29886i.getDimensionPixelSize(C0100R.dimen.legacy_elapsed_timer_text_size);
        int dimensionPixelSize4 = this.f29886i.getDimensionPixelSize(C0100R.dimen.timer_side_padding);
        this.f29884g.m4365b().setTextSize(0, dimensionPixelSize3);
        this.f29884g.m4365b().setPadding(dimensionPixelSize4, 0, dimensionPixelSize4, 0);
        this.f29884g.m4365b().setCompoundDrawablesWithIntrinsicBounds(C0100R.drawable.ic_recording_on_red_circle, 0, 0, 0);
        this.f29884g.m4364a().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f29884g.m4364a().setVisibility(8);
    }
}
