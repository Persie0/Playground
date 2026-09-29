package p000;

import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.material3.C0269z;

/* JADX INFO: loaded from: classes2.dex */
public final class o59 implements wn8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0269z f53869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0809bg f53870b;

    public o59(C0269z c0269z, C0809bg c0809bg) {
        this.f53869a = c0269z;
        this.f53870b = c0809bg;
    }

    @Override // p000.wn8
    /* JADX INFO: renamed from: a */
    public final float mo3997a(float f) {
        C0097e c0097e = this.f53869a.f3651e;
        float fM15944g = l70.m15944g((Float.isNaN(c0097e.f2241j.m19861h()) ? 0.0f : c0097e.f2241j.m19861h()) + f, c0097e.m849c().m132e(), c0097e.m849c().m131d());
        float fM19861h = fM15944g - c0097e.f2241j.m19861h();
        this.f53870b.m3692a(fM15944g, 0.0f);
        return fM19861h;
    }
}
