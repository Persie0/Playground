package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.p014ui.elapsedtimeui.ElapsedTimerView;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxy implements hxw {

    /* JADX INFO: renamed from: f */
    private static final hxv f29858f = hxv.m10847a().m10841a();

    /* JADX INFO: renamed from: a */
    public ElapsedTimerView f29859a;

    /* JADX INFO: renamed from: b */
    public TextView f29860b;

    /* JADX INFO: renamed from: c */
    public TextView f29861c;

    /* JADX INFO: renamed from: d */
    public long f29862d;

    /* JADX INFO: renamed from: e */
    public long f29863e;

    /* JADX INFO: renamed from: g */
    private final Activity f29864g;

    /* JADX INFO: renamed from: h */
    private final dhv f29865h;

    /* JADX INFO: renamed from: i */
    private final jvd f29866i;

    /* JADX INFO: renamed from: j */
    private final jww f29867j;

    /* JADX INFO: renamed from: k */
    private final msi f29868k;

    /* JADX INFO: renamed from: l */
    private View.OnLayoutChangeListener f29869l;

    /* JADX INFO: renamed from: m */
    private hxv f29870m = f29858f;

    /* JADX INFO: renamed from: n */
    private Resources f29871n;

    /* JADX INFO: renamed from: o */
    private View f29872o;

    /* JADX INFO: renamed from: p */
    private ViewGroup f29873p;

    /* JADX INFO: renamed from: q */
    private View f29874q;

    /* JADX INFO: renamed from: r */
    private int f29875r;

    /* JADX INFO: renamed from: s */
    private kba f29876s;

    /* JADX INFO: renamed from: t */
    private boolean f29877t;

    public hxy(Activity activity, dhv dhvVar, jvd jvdVar, jww jwwVar, msi msiVar) {
        this.f29864g = activity;
        this.f29865h = dhvVar;
        this.f29866i = jvdVar;
        this.f29867j = jwwVar;
        this.f29868k = msiVar;
    }

    /* JADX INFO: renamed from: m */
    private final void m10857m(ViewGroup viewGroup, int i) {
        if (viewGroup != this.f29873p) {
            viewGroup.removeView(this.f29859a);
            this.f29873p.addView(this.f29859a);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f29859a.getLayoutParams();
        layoutParams.bottomMargin = this.f29875r;
        layoutParams.topMargin = this.f29875r;
        layoutParams.gravity = i | 1;
        this.f29859a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: n */
    private final void m10858n(ViewGroup viewGroup) {
        viewGroup.removeView(this.f29859a);
        ViewGroup viewGroup2 = (ViewGroup) this.f29864g.findViewById(C0100R.id.activity_root_view);
        viewGroup2.addView(this.f29859a);
        this.f29859a.bringToFront();
        C1190zy c1190zy = new C1190zy();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup2;
        c1190zy.m19820e(constraintLayout);
        int height = this.f29874q.getHeight();
        int dimensionPixelSize = this.f29871n.getDimensionPixelSize(C0100R.dimen.timer_height);
        jiy.m13269ad(c1190zy, this.f29859a, (((int) this.f29874q.getY()) + (height / 2)) - (dimensionPixelSize / 2));
        c1190zy.m19818c(constraintLayout);
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: a */
    public final void mo10848a(boolean z) {
        View view;
        kba kbaVar = this.f29876s;
        if (kbaVar != null) {
            kbaVar.close();
        }
        if (z) {
            this.f29859a.animate().setDuration(200L).setStartDelay(0L).alpha(0.0f).withEndAction(new huh(this, 4));
        } else {
            this.f29859a.animate().cancel();
            this.f29859a.setAlpha(0.0f);
            this.f29859a.setVisibility(8);
            m10860k();
        }
        dhv dhvVar = this.f29865h;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6177e();
        this.f29867j.mo3415bf(false);
        if (((AccessibilityManager) this.f29864g.getSystemService("accessibility")).isTouchExplorationEnabled() && (view = this.f29874q) != null) {
            view.setFocusable(true);
            this.f29874q.setImportantForAccessibility(1);
        }
        View view2 = this.f29874q;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(this.f29869l);
        }
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: b */
    public final void mo10849b() {
        this.f29877t = this.f29861c.getVisibility() == 0;
        this.f29860b.setText(this.f29871n.getString(C0100R.string.video_recording_paused_indicator, DateUtils.formatElapsedTime(Duration.ofMillis(this.f29862d).getSeconds())));
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: c */
    public final void mo10850c() {
        this.f29860b.setText(DateUtils.formatElapsedTime(Duration.ofMillis(this.f29862d).getSeconds()));
        if (this.f29877t) {
            mo10852e();
        }
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: d */
    public final void mo10851d(hxv hxvVar) {
        this.f29870m = hxvVar;
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: e */
    public final void mo10852e() {
        Drawable drawable;
        int dimensionPixelSize = this.f29871n.getDimensionPixelSize(C0100R.dimen.timer_side_padding);
        this.f29861c.setTextSize(0, this.f29871n.getDimensionPixelSize(C0100R.dimen.elapsed_timer_text_size));
        int color = this.f29871n.getColor(C0100R.color.elapsed_timer_text_color, null);
        Drawable drawable2 = this.f29864g.getDrawable(C0100R.drawable.quantum_gm_ic_trending_flat_white_18);
        drawable2.getClass();
        drawable2.setTint(color);
        hxv hxvVar = this.f29870m;
        if (hxvVar.f29853b) {
            drawable = this.f29864g.getDrawable(C0100R.drawable.quantum_gm_ic_mic_off_white_18);
        } else if (((Boolean) hxvVar.f29855d.mo3831be()).booleanValue()) {
            drawable = this.f29864g.getDrawable(C0100R.drawable.gm_filled_mic_external_on_white_18);
        } else {
            drawable = ((Boolean) this.f29870m.f29856e.mo3831be()).booleanValue() ? this.f29864g.getDrawable(C0100R.drawable.gm_filled_bluetooth_connected_white_18) : null;
        }
        if (drawable != null) {
            drawable.setTint(color);
        }
        this.f29861c.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f29861c.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
        TextView textView = this.f29860b;
        textView.setPadding(textView.getPaddingLeft(), 0, 0, 0);
        this.f29860b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        this.f29861c.setVisibility(0);
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: f */
    public final void mo10853f() {
        View view;
        hxv hxvVar = this.f29870m;
        this.f29876s = jwr.m13632b(hxvVar.f29855d, hxvVar.f29856e).mo3830a(new hmv(this, 16), this.f29866i);
        mo10855h(0L);
        if (this.f29873p != null) {
            m10861l();
        }
        m10859j();
        mo10854g(0L);
        this.f29861c.addOnLayoutChangeListener(new hdf(this, 4));
        this.f29859a.animate().setDuration(200L).setStartDelay(517L).alpha(1.0f).withStartAction(new huh(this, 3));
        this.f29867j.mo3415bf(true);
        if (((AccessibilityManager) this.f29864g.getSystemService(BEeWZPor.dNvJyvbCINe)).isTouchExplorationEnabled() && (view = this.f29874q) != null) {
            view.setFocusable(false);
            this.f29874q.setImportantForAccessibility(2);
        }
        dhv dhvVar = this.f29865h;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6177e();
        View view2 = this.f29874q;
        if (view2 != null) {
            view2.addOnLayoutChangeListener(this.f29869l);
        }
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: g */
    public final void mo10854g(long j) {
        this.f29863e = j;
        this.f29861c.setText(DateUtils.formatElapsedTime(Duration.ofMillis(j).getSeconds()));
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: h */
    public final void mo10855h(long j) {
        this.f29862d = j;
        this.f29860b.setText(DateUtils.formatElapsedTime(Duration.ofMillis(j).getSeconds()));
    }

    @Override // p000.hxw
    /* JADX INFO: renamed from: i */
    public final void mo10856i(LinearLayout linearLayout) {
        this.f29871n = linearLayout.getResources();
        ElapsedTimerView elapsedTimerView = (ElapsedTimerView) linearLayout;
        this.f29859a = elapsedTimerView;
        TextView textViewM4365b = elapsedTimerView.m4365b();
        this.f29860b = textViewM4365b;
        textViewM4365b.setCompoundDrawablePadding(this.f29871n.getDimensionPixelSize(C0100R.dimen.indicator_padding));
        TextView textViewM4364a = this.f29859a.m4364a();
        this.f29861c = textViewM4364a;
        textViewM4364a.setCompoundDrawablePadding(this.f29871n.getDimensionPixelSize(C0100R.dimen.indicator_padding));
        this.f29872o = this.f29859a.findViewById(C0100R.id.speech_enhance_view);
        this.f29875r = this.f29871n.getDimensionPixelSize(C0100R.dimen.recording_time_landscape_vertical_margin);
        ViewGroup viewGroup = (ViewGroup) linearLayout.getRootView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0100R.id.camera_app_root);
        if (viewGroup2 == null) {
            viewGroup2 = viewGroup;
        }
        this.f29873p = (ViewGroup) viewGroup2.findViewById(C0100R.id.uncovered_preview_layout);
        this.f29874q = viewGroup.findViewById(C0100R.id.mode_switcher);
        this.f29869l = new hdf(this, 3);
        dhv dhvVar = this.f29865h;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6177e();
        linearLayout.setAccessibilityDelegate(new hxx(this));
    }

    /* JADX INFO: renamed from: j */
    public final void m10859j() {
        Drawable drawable;
        Drawable drawable2 = this.f29871n.getDrawable(C0100R.drawable.bg_elapsed_timer, null);
        int color = this.f29871n.getColor(C0100R.color.elapsed_timer_text_color, null);
        this.f29859a.setBackground(drawable2);
        int dimensionPixelSize = this.f29871n.getDimensionPixelSize(C0100R.dimen.timer_side_padding);
        this.f29860b.setTextSize(0, this.f29871n.getDimensionPixelSize(C0100R.dimen.elapsed_timer_text_size));
        this.f29860b.setPadding(dimensionPixelSize, 0, true != this.f29870m.f29854c ? dimensionPixelSize : 0, 0);
        hxv hxvVar = this.f29870m;
        if (hxvVar.f29853b) {
            drawable = this.f29864g.getDrawable(C0100R.drawable.quantum_gm_ic_mic_off_white_18);
        } else if (((Boolean) hxvVar.f29855d.mo3831be()).booleanValue()) {
            drawable = this.f29864g.getDrawable(C0100R.drawable.gm_filled_mic_external_on_white_18);
        } else {
            drawable = ((Boolean) this.f29870m.f29856e.mo3831be()).booleanValue() ? this.f29864g.getDrawable(C0100R.drawable.gm_filled_bluetooth_connected_white_18) : null;
        }
        if (drawable != null) {
            drawable.setTint(color);
        }
        this.f29872o.setVisibility(true != this.f29870m.f29854c ? 8 : 0);
        if (this.f29870m.f29852a) {
            this.f29860b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            mo10852e();
        } else {
            this.f29860b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            m10860k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10860k() {
        this.f29861c.setVisibility(8);
        this.f29861c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        TextView textView = this.f29860b;
        textView.setPadding(textView.getPaddingLeft(), 0, this.f29860b.getPaddingLeft(), 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m10861l() {
        ilk ilkVarM11426b = ilk.m11426b(this.f29859a.getDisplay(), this.f29859a.getContext());
        ViewGroup viewGroup = (ViewGroup) this.f29859a.getParent();
        if (this.f29868k.mo6051a() != null && jpd.m13431l(((hzp) this.f29868k.mo6051a()).f30074a.f30073i)) {
            m10858n(viewGroup);
        }
        switch (ilkVarM11426b) {
            case PORTRAIT:
            case REVERSE_PORTRAIT:
                m10858n(viewGroup);
                break;
            case LANDSCAPE:
                m10857m(viewGroup, 80);
                break;
            case REVERSE_LANDSCAPE:
                m10857m(viewGroup, 48);
                break;
        }
    }
}
