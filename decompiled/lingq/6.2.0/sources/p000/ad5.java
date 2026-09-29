package p000;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.material.R$anim;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ad5 extends x60 {

    /* JADX INFO: renamed from: k */
    public static final int[] f511k = {533, 567, 850, 750};

    /* JADX INFO: renamed from: l */
    public static final int[] f512l = {1267, DescriptorProtos.Edition.EDITION_2023_VALUE, 333, 0};

    /* JADX INFO: renamed from: m */
    public static final r90 f513m = new r90(Float.class, "animationFraction", 11);

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f514c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f515d;

    /* JADX INFO: renamed from: e */
    public final Interpolator[] f516e;

    /* JADX INFO: renamed from: f */
    public final ed5 f517f;

    /* JADX INFO: renamed from: g */
    public int f518g;

    /* JADX INFO: renamed from: h */
    public boolean f519h;

    /* JADX INFO: renamed from: i */
    public float f520i;

    /* JADX INFO: renamed from: j */
    public AbstractC3689vl f521j;

    public ad5(Context context, ed5 ed5Var) {
        super(2);
        this.f518g = 0;
        this.f521j = null;
        this.f517f = ed5Var;
        this.f516e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R$anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: a */
    public final void mo278a() {
        ObjectAnimator objectAnimator = this.f514c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: c */
    public final void mo279c() {
        m284m();
        ObjectAnimator objectAnimator = this.f514c;
        ed5 ed5Var = this.f517f;
        objectAnimator.setDuration((long) (ed5Var.f67957n * 1800.0f));
        this.f515d.setDuration((long) (ed5Var.f67957n * 1800.0f));
        m285n();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: i */
    public final void mo280i(w90 w90Var) {
        this.f521j = w90Var;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: j */
    public final void mo281j() {
        ObjectAnimator objectAnimator = this.f515d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo278a();
        if (((o34) this.f67808a).isVisible()) {
            this.f515d.setFloatValues(this.f520i, 1.0f);
            this.f515d.setDuration((long) ((1.0f - this.f520i) * 1800.0f));
            this.f515d.start();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: k */
    public final void mo282k() {
        m284m();
        m285n();
        this.f514c.start();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: l */
    public final void mo283l() {
        this.f521j = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m284m() {
        ObjectAnimator objectAnimator = this.f514c;
        int i = 0;
        ed5 ed5Var = this.f517f;
        r90 r90Var = f513m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, r90Var, 0.0f, 1.0f);
            this.f514c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (ed5Var.f67957n * 1800.0f));
            this.f514c.setInterpolator(null);
            this.f514c.setRepeatCount(-1);
            this.f514c.addListener(new zc5(this, i));
        }
        if (this.f515d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, r90Var, 1.0f);
            this.f515d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (ed5Var.f67957n * 1800.0f));
            this.f515d.setInterpolator(null);
            this.f515d.addListener(new zc5(this, 1));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m285n() {
        this.f518g = 0;
        Iterator it = ((ArrayList) this.f67809b).iterator();
        while (it.hasNext()) {
            ((bm2) it.next()).f8673c = this.f517f.f67948e[0];
        }
    }
}
