package p000;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class u60 {

    /* JADX INFO: renamed from: a */
    public final float f63470a;

    /* JADX INFO: renamed from: b */
    public final float f63471b;

    /* JADX INFO: renamed from: c */
    public final float f63472c;

    /* JADX INFO: renamed from: d */
    public final int f63473d;

    /* JADX INFO: renamed from: e */
    public final long f63474e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u60(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final float m22503a() {
        return this.f63472c;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.f63470a + ", touchY=" + this.f63471b + ", progress=" + this.f63472c + ", swipeEdge=" + this.f63473d + ", frameTimeMillis=" + this.f63474e + ')';
    }

    public u60(float f, float f2, float f3, int i, long j) {
        this.f63470a = f;
        this.f63471b = f2;
        this.f63472c = f3;
        this.f63473d = i;
        this.f63474e = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u60(zi6 zi6Var) {
        this(zi6Var.f71612c, zi6Var.f71613d, zi6Var.f71611b, zi6Var.f71610a, zi6Var.f71614e);
        zi6Var.getClass();
    }
}
