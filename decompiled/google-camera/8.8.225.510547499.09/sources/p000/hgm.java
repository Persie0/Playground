package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgm {

    /* JADX INFO: renamed from: a */
    public final ActivityC0157ei f27690a;

    /* JADX INFO: renamed from: c */
    public final hhi f27692c;

    /* JADX INFO: renamed from: d */
    public final hfo f27693d;

    /* JADX INFO: renamed from: e */
    public boolean f27694e;

    /* JADX INFO: renamed from: f */
    public View f27695f;

    /* JADX INFO: renamed from: g */
    public View f27696g;

    /* JADX INFO: renamed from: j */
    public AmbientModeSupport.AmbientController f27699j;

    /* JADX INFO: renamed from: k */
    private final int f27700k;

    /* JADX INFO: renamed from: l */
    private AnimatorSet f27701l;

    /* JADX INFO: renamed from: b */
    public final nqf f27691b = nqf.m17621g();

    /* JADX INFO: renamed from: h */
    public ilk f27697h = ilk.PORTRAIT;

    /* JADX INFO: renamed from: i */
    public hzj f27698i = hzj.PHONE_LAYOUT;

    public hgm(ActivityC0157ei activityC0157ei, hhi hhiVar, hfo hfoVar) {
        this.f27690a = activityC0157ei;
        this.f27692c = hhiVar;
        this.f27693d = hfoVar;
        this.f27700k = activityC0157ei.getResources().getInteger(C0100R.integer.social_anim_duration_default);
    }

    /* JADX INFO: renamed from: a */
    public final Animator m10246a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27696g, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(this.f27700k);
        objectAnimatorOfFloat.addListener(jvh.m13545C(new gyc(this, 5)));
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: b */
    public final Animator m10247b() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f27696g, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f27700k);
        objectAnimatorOfFloat.addListener(jvh.m13544B(new gyc(this, 4)));
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: c */
    final void m10248c() {
        if (this.f27695f.getWidth() == 0 || this.f27695f.getHeight() == 0) {
            return;
        }
        if (!jpd.m13431l(this.f27698i)) {
            m10249d(mws.m17098m(m10247b(), m10246a()));
        }
        jiy.m13270ae(this.f27690a, this.f27695f, this.f27697h);
        jiy.m13271af(this.f27690a, this.f27695f, this.f27697h);
        this.f27693d.mo10188e(this.f27697h);
    }

    /* JADX INFO: renamed from: d */
    public final void m10249d(List list) {
        if (this.f27694e) {
            AnimatorSet animatorSet = this.f27701l;
            if (animatorSet != null && animatorSet.isStarted()) {
                this.f27701l.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f27701l = animatorSet2;
            animatorSet2.playSequentially((List<Animator>) list);
            this.f27701l.start();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10250e() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f27696g.getParent();
        C1190zy c1190zy = new C1190zy();
        c1190zy.m19820e(constraintLayout);
        int id = this.f27696g.getId();
        c1190zy.m19822g(id, 1, 0, 1);
        c1190zy.m19822g(id, 2, 0, 2);
        if (jpd.m13431l(this.f27698i)) {
            c1190zy.m19822g(id, 4, 0, 4);
            c1190zy.m19822g(id, 3, 0, 3);
            c1190zy.m19831r(id, 0.5f);
            c1190zy.m19832s(id, 0.92f);
        } else {
            c1190zy.m19822g(id, 4, C0100R.id.thumbnail_button_for_align, 4);
            c1190zy.m19822g(id, 3, C0100R.id.thumbnail_button_for_align, 3);
            c1190zy.m19831r(id, 0.12f);
            c1190zy.m19832s(id, 0.5f);
        }
        c1190zy.m19818c(constraintLayout);
    }
}
