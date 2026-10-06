package p000;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikt {

    /* JADX INFO: renamed from: a */
    public final ZoomLockView f31374a;

    /* JADX INFO: renamed from: b */
    public final ImageView f31375b;

    /* JADX INFO: renamed from: c */
    public final ImageView f31376c;

    /* JADX INFO: renamed from: d */
    public final Resources f31377d;

    /* JADX INFO: renamed from: e */
    public MotionEvent f31378e;

    /* JADX INFO: renamed from: f */
    public float f31379f;

    /* JADX INFO: renamed from: g */
    public float f31380g;

    /* JADX INFO: renamed from: h */
    public boolean f31381h;

    /* JADX INFO: renamed from: i */
    public boolean f31382i = true;

    /* JADX INFO: renamed from: j */
    public final float f31383j;

    public ikt(ZoomLockView zoomLockView) {
        this.f31374a = zoomLockView;
        this.f31375b = zoomLockView.f7304b;
        this.f31376c = zoomLockView.f7303a;
        Resources resources = zoomLockView.getResources();
        this.f31377d = resources;
        this.f31383j = (resources.getDimensionPixelSize(C0100R.dimen.zoom_lock_translation) - (resources.getDimensionPixelSize(C0100R.dimen.zoom_lock_icon_size) / 2)) + resources.getDimensionPixelSize(C0100R.dimen.zoom_dot_trans_adjust);
    }

    /* JADX INFO: renamed from: c */
    public static final float m11407c(float f, float f2, float f3) {
        float fMin = Math.min(f2, f3);
        if (f <= fMin) {
            f = fMin;
        }
        float fMax = Math.max(f2, f3);
        return f >= fMax ? fMax : f;
    }

    /* JADX INFO: renamed from: a */
    public final void m11408a() {
        this.f31378e = null;
        ZoomLockView zoomLockView = this.f31374a;
        if (zoomLockView.f7306d.isRunning()) {
            zoomLockView.f7306d.cancel();
        }
        if (zoomLockView.getVisibility() != 8) {
            zoomLockView.f7307e.start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX INFO: renamed from: b */
    public final void m11409b(boolean z) {
        ilk ilkVar = this.f31374a.f7310h;
        Point pointM13569q = jvh.m13569q(this.f31375b);
        int width = pointM13569q.x + (this.f31375b.getWidth() / 2);
        int height = pointM13569q.y + (this.f31375b.getHeight() / 2);
        ilk ilkVar2 = ilk.PORTRAIT;
        float f = height;
        switch (ilkVar.ordinal()) {
            case 1:
                float height2 = pointM13569q.y - this.f31375b.getHeight();
                if (height2 <= jvh.m13569q(this.f31376c).y && height2 >= jvh.m13569q(this.f31376c).y - this.f31376c.getHeight()) {
                    if (!this.f31382i && this.f31378e != null && (!this.f31374a.f7306d.isRunning() || z)) {
                        if (!this.f31381h) {
                            this.f31376c.setImageDrawable(this.f31377d.getDrawable(C0100R.drawable.ic_lock_24dp_white, null));
                            this.f31381h = true;
                        }
                    }
                }
                if (this.f31381h) {
                    this.f31376c.setImageDrawable(this.f31377d.getDrawable(C0100R.drawable.ic_lock_24dp, null));
                    this.f31381h = false;
                }
                break;
            case 2:
                if (f >= jvh.m13569q(this.f31376c).y && f <= jvh.m13569q(this.f31376c).y + this.f31376c.getHeight()) {
                    if (!this.f31382i) {
                        if (!this.f31381h) {
                            this.f31376c.setImageDrawable(this.f31377d.getDrawable(C0100R.drawable.ic_lock_24dp_white, null));
                            this.f31381h = true;
                        }
                    }
                }
                if (this.f31381h) {
                    this.f31376c.setImageDrawable(this.f31377d.getDrawable(C0100R.drawable.ic_lock_24dp, null));
                    this.f31381h = false;
                }
                break;
            default:
                float f2 = width;
                Point pointM13569q2 = jvh.m13569q(this.f31376c);
                if (pointM13569q2.x <= f2 && f2 <= pointM13569q2.x + this.f31376c.getWidth() && pointM13569q2.y <= f && f <= pointM13569q2.y + this.f31376c.getHeight()) {
                    if (!this.f31382i) {
                        if (!this.f31381h) {
                            this.f31376c.setImageDrawable(this.f31377d.getDrawable(C0100R.drawable.ic_lock_24dp_white, null));
                            this.f31381h = true;
                        }
                    }
                }
                if (this.f31381h) {
                    this.f31376c.setImageDrawable(this.f31377d.getDrawable(C0100R.drawable.ic_lock_24dp, null));
                    this.f31381h = false;
                }
                break;
        }
    }
}
