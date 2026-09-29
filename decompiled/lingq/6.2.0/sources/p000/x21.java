package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x21 implements fn1 {

    /* JADX INFO: renamed from: a */
    public final float f67668a;

    public x21(float f) {
        this.f67668a = f;
    }

    @Override // p000.fn1
    /* JADX INFO: renamed from: a */
    public final float mo11947a(RectF rectF) {
        return AbstractC3584sr.m21644w(this.f67668a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x21) && this.f67668a == ((x21) obj).f67668a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f67668a)});
    }
}
