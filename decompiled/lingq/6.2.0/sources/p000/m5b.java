package p000;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final class m5b {

    /* JADX INFO: renamed from: a */
    public l5b f50624a;

    public m5b(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f50624a = new k5b(i5b.m13672e(i, interpolator, j));
        } else {
            this.f50624a = new h5b(i, interpolator, j);
        }
    }
}
