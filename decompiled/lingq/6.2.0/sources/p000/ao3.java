package p000;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class ao3 extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f7288a;

    /* JADX INFO: renamed from: b */
    public float f7289b;

    public ao3(Context context) {
        super(context);
        this.f7288a = AbstractC3489q9.m19772b(context).f45374a * 1.0f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        this.f7289b = 0.0f;
        super.onAbsorb(i);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        this.f7289b = 0.0f;
        super.onPull(f, f2);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f7289b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        this.f7289b = 0.0f;
        super.onPull(f);
    }
}
