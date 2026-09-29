package p000;

import androidx.compose.foundation.gestures.C0096d;
import androidx.compose.foundation.gestures.C0116v;
import androidx.compose.foundation.gestures.FlingCancellationException;

/* JADX INFO: renamed from: zf */
/* JADX INFO: loaded from: classes.dex */
public final class C3831zf implements wn8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71478a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f71479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71480c;

    public /* synthetic */ C3831zf(int i, Object obj, Object obj2) {
        this.f71478a = i;
        this.f71479b = obj;
        this.f71480c = obj2;
    }

    @Override // p000.wn8
    /* JADX INFO: renamed from: a */
    public final float mo3997a(float f) {
        int i = this.f71478a;
        Object obj = this.f71480c;
        Object obj2 = this.f71479b;
        switch (i) {
            case 0:
                C0096d c0096d = (C0096d) obj2;
                float fM851e = c0096d.f2227e0.m851e(f);
                float fM19861h = fM851e - c0096d.f2227e0.f2241j.m19861h();
                ((C0809bg) obj).m3692a(fM851e, 0.0f);
                return fM19861h;
            default:
                C0116v c0116v = (C0116v) obj2;
                if (Math.abs(f) == 0.0f || ((Boolean) c0116v.f2367h.mo0a()).booleanValue()) {
                    return c0116v.m932d(c0116v.m935g(((ho8) obj).m13413a(2, c0116v.m933e(c0116v.m936h(f)))));
                }
                throw new FlingCancellationException("The fling animation was cancelled");
        }
    }
}
