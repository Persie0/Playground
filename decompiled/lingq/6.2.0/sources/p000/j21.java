package p000;

import android.animation.ObjectAnimator;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j21 extends x60 {

    /* JADX INFO: renamed from: k */
    public static final int[] f44925k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l */
    public static final int[] f44926l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m */
    public static final int[] f44927m = {DescriptorProtos.Edition.EDITION_2023_VALUE, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n */
    public static final r90 f44928n = new r90(Float.class, "animationFraction", 4);

    /* JADX INFO: renamed from: o */
    public static final r90 f44929o = new r90(Float.class, "completeEndFraction", 5);

    /* JADX INFO: renamed from: c */
    public ObjectAnimator f44930c;

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f44931d;

    /* JADX INFO: renamed from: e */
    public final qz2 f44932e;

    /* JADX INFO: renamed from: f */
    public final q21 f44933f;

    /* JADX INFO: renamed from: g */
    public int f44934g;

    /* JADX INFO: renamed from: h */
    public float f44935h;

    /* JADX INFO: renamed from: i */
    public float f44936i;

    /* JADX INFO: renamed from: j */
    public AbstractC3689vl f44937j;

    public j21(q21 q21Var) {
        super(1);
        this.f44934g = 0;
        this.f44937j = null;
        this.f44933f = q21Var;
        this.f44932e = new qz2(1);
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: a */
    public final void mo278a() {
        ObjectAnimator objectAnimator = this.f44930c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: c */
    public final void mo279c() {
        m14271m();
        ObjectAnimator objectAnimator = this.f44930c;
        q21 q21Var = this.f44933f;
        objectAnimator.setDuration((long) (q21Var.f67957n * 5400.0f));
        this.f44931d.setDuration((long) (q21Var.f67957n * 333.0f));
        this.f44934g = 0;
        ((bm2) ((ArrayList) this.f67809b).get(0)).f8673c = q21Var.f67948e[0];
        this.f44936i = 0.0f;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: i */
    public final void mo280i(w90 w90Var) {
        this.f44937j = w90Var;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: j */
    public final void mo281j() {
        ObjectAnimator objectAnimator = this.f44931d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((o34) this.f67808a).isVisible()) {
            this.f44931d.start();
        } else {
            mo278a();
        }
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: k */
    public final void mo282k() {
        m14271m();
        this.f44934g = 0;
        ((bm2) ((ArrayList) this.f67809b).get(0)).f8673c = this.f44933f.f67948e[0];
        this.f44936i = 0.0f;
        this.f44930c.start();
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: l */
    public final void mo283l() {
        this.f44937j = null;
    }

    /* JADX INFO: renamed from: m */
    public final void m14271m() {
        ObjectAnimator objectAnimator = this.f44930c;
        q21 q21Var = this.f44933f;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f44928n, 0.0f, 1.0f);
            this.f44930c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (q21Var.f67957n * 5400.0f));
            this.f44930c.setInterpolator(null);
            this.f44930c.setRepeatCount(-1);
            this.f44930c.addListener(new i21(this, 0));
        }
        if (this.f44931d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f44929o, 0.0f, 1.0f);
            this.f44931d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (q21Var.f67957n * 333.0f));
            this.f44931d.setInterpolator(this.f44932e);
            this.f44931d.addListener(new i21(this, 1));
        }
    }
}
