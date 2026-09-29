package p000;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class i38 {

    /* JADX INFO: renamed from: a */
    public int f43444a;

    /* JADX INFO: renamed from: b */
    public int f43445b;

    /* JADX INFO: renamed from: c */
    public int f43446c;

    /* JADX INFO: renamed from: d */
    public int f43447d;

    /* JADX INFO: renamed from: e */
    public Interpolator f43448e;

    /* JADX INFO: renamed from: f */
    public boolean f43449f;

    /* JADX INFO: renamed from: g */
    public int f43450g;

    /* JADX INFO: renamed from: a */
    public final void m13649a(RecyclerView recyclerView) {
        int i = this.f43447d;
        if (i >= 0) {
            this.f43447d = -1;
            recyclerView.m2723R(i);
            this.f43449f = false;
            return;
        }
        if (!this.f43449f) {
            this.f43450g = 0;
            return;
        }
        Interpolator interpolator = this.f43448e;
        if (interpolator != null && this.f43446c < 1) {
            C3386nv.m17633t("If you provide an interpolator, you must set a positive duration");
            return;
        }
        int i2 = this.f43446c;
        if (i2 < 1) {
            C3386nv.m17633t("Scroll duration must be a positive number");
            return;
        }
        recyclerView.f6680z0.m17201c(this.f43444a, this.f43445b, i2, interpolator);
        int i3 = this.f43450g + 1;
        this.f43450g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f43449f = false;
    }
}
