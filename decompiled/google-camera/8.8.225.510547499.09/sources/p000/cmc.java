package p000;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmc extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final TextView f6200a;

    /* JADX INFO: renamed from: b */
    public final TextView f6201b;

    /* JADX INFO: renamed from: c */
    public final AnimatorSet f6202c;

    /* JADX INFO: renamed from: d */
    public final AnimatorSet f6203d;

    /* JADX INFO: renamed from: e */
    public final Interpolator f6204e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f6205f;

    /* JADX INFO: renamed from: g */
    public AnimatorSet f6206g;

    /* JADX INFO: renamed from: h */
    private final LinearLayout f6207h;

    public cmc(Context context) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0100R.layout.autotimer_tutorial_layout, this);
        jfs jfsVarM13066o = jfs.m13066o(this);
        this.f6207h = (LinearLayout) jfsVarM13066o.m13100f(C0100R.id.autotimer_tutorial_text_container);
        this.f6200a = (TextView) jfsVarM13066o.m13100f(C0100R.id.autotimer_tutorial_text_title);
        this.f6201b = (TextView) jfsVarM13066o.m13100f(C0100R.id.autotimer_tutorial_text_body);
        this.f6202c = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), C0100R.animator.autotimer_tutorial_text_show);
        this.f6203d = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), C0100R.animator.autotimer_tutorial_text_hide);
        this.f6204e = AnimationUtils.loadInterpolator(context, R.interpolator.fast_out_slow_in);
        this.f6205f = AnimationUtils.loadInterpolator(context, R.interpolator.linear_out_slow_in);
        int i = context.getResources().getConfiguration().orientation;
        m3940b();
    }

    /* JADX INFO: renamed from: b */
    final void m3940b() {
        ((FrameLayout.LayoutParams) this.f6207h.getLayoutParams()).gravity = 17;
        forceLayout();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        m3940b();
    }
}
