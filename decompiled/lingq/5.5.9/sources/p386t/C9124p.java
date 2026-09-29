package p386t;

import android.content.Context;
import android.widget.EdgeEffect;
import dm.C5207g;
import p338qd.C8573r0;

/* JADX INFO: renamed from: t.p */
/* JADX INFO: loaded from: classes.dex */
public final class C9124p extends EdgeEffect {

    /* JADX INFO: renamed from: a */
    public final float f47631a;

    /* JADX INFO: renamed from: b */
    public float f47632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9124p(Context context) {
        super(context);
        C5207g.m11111f(context, "context");
        this.f47631a = C8573r0.m16746p(context).f50964a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f47632b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3) {
        this.f47632b = 0.0f;
        super.onPull(f3);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f3, float f10) {
        this.f47632b = 0.0f;
        super.onPull(f3, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f47632b = 0.0f;
        super.onRelease();
    }
}
