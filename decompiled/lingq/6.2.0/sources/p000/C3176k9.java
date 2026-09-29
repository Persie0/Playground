package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: k9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3176k9 implements fn1 {

    /* JADX INFO: renamed from: a */
    public final fn1 f46880a;

    /* JADX INFO: renamed from: b */
    public final float f46881b;

    public C3176k9(float f, fn1 fn1Var) {
        while (fn1Var instanceof C3176k9) {
            fn1Var = ((C3176k9) fn1Var).f46880a;
            f += ((C3176k9) fn1Var).f46881b;
        }
        this.f46880a = fn1Var;
        this.f46881b = f;
    }

    @Override // p000.fn1
    /* JADX INFO: renamed from: a */
    public final float mo11947a(RectF rectF) {
        return Math.max(0.0f, this.f46880a.mo11947a(rectF) + this.f46881b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3176k9)) {
            return false;
        }
        C3176k9 c3176k9 = (C3176k9) obj;
        return this.f46880a.equals(c3176k9.f46880a) && this.f46881b == c3176k9.f46881b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f46880a, Float.valueOf(this.f46881b)});
    }
}
