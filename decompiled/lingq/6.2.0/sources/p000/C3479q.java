package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: q */
/* JADX INFO: loaded from: classes.dex */
public final class C3479q implements fn1 {

    /* JADX INFO: renamed from: a */
    public final float f57063a;

    public C3479q(float f) {
        this.f57063a = f;
    }

    @Override // p000.fn1
    /* JADX INFO: renamed from: a */
    public final float mo11947a(RectF rectF) {
        return this.f57063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3479q) && this.f57063a == ((C3479q) obj).f57063a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f57063a)});
    }

    public final String toString() {
        return wq1.m24121q(new StringBuilder(), this.f57063a, "px");
    }
}
