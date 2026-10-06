package p000;

import android.animation.TimeAnimator;
import android.view.View;
import androidx.wear.ambient.AmbientMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyv {

    /* JADX INFO: renamed from: a */
    public boolean f32686a;

    /* JADX INFO: renamed from: b */
    public boolean f32687b;

    /* JADX INFO: renamed from: c */
    public boolean f32688c;

    /* JADX INFO: renamed from: d */
    public long f32689d;

    /* JADX INFO: renamed from: e */
    public AmbientMode.AmbientController f32690e;

    /* JADX INFO: renamed from: f */
    private final TimeAnimator f32691f;

    public iyv(View view, View view2) {
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f32691f = timeAnimator;
        timeAnimator.setTimeListener(new TimeAnimator.TimeListener() { // from class: iyt
            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j, long j2) {
                boolean zM1649v;
                iyv iyvVar = this.f32683a;
                if (j - iyvVar.f32689d > 60) {
                    iyvVar.f32689d = j;
                    AmbientMode.AmbientController ambientController = iyvVar.f32690e;
                    if (ambientController != null) {
                        if (iyvVar.f32687b) {
                            zM1649v = ambientController.m1649v();
                        } else if (!iyvVar.f32688c) {
                            return;
                        } else {
                            zM1649v = ambientController.m1648u();
                        }
                        if (zM1649v) {
                            return;
                        }
                        iyvVar.m11910a();
                    }
                }
            }
        });
        view.setOnClickListener(new iec(this, 10));
        view.setOnLongClickListener(new iyu(this, 0));
        view.setOnTouchListener(new isv(this, 2));
        view2.setOnClickListener(new iec(this, 11));
        view2.setOnLongClickListener(new iyu(this, 2));
        view2.setOnTouchListener(new isv(this, 3));
    }

    /* JADX INFO: renamed from: a */
    public final void m11910a() {
        this.f32687b = false;
        this.f32688c = false;
        if (this.f32691f.isStarted()) {
            this.f32691f.cancel();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11911b() {
        if (this.f32686a) {
            if (!this.f32687b && !this.f32688c) {
                this.f32691f.cancel();
            } else {
                this.f32689d = 0L;
                this.f32691f.start();
            }
        }
    }
}
