package p000;

import androidx.compose.foundation.gestures.C0101i;

/* JADX INFO: loaded from: classes.dex */
public final class y72 implements wn8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0101i f69400a;

    public y72(C0101i c0101i) {
        this.f69400a = c0101i;
    }

    @Override // p000.wn8
    /* JADX INFO: renamed from: a */
    public final float mo3997a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        C0101i c0101i = this.f69400a;
        float fFloatValue = ((Number) c0101i.f2260a.invoke(Float.valueOf(f))).floatValue();
        ((xc9) c0101i.f2264e).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((xc9) c0101i.f2265f).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
