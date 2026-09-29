package p000;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p48 implements fn1 {

    /* JADX INFO: renamed from: a */
    public final float f55567a;

    public p48(float f) {
        this.f55567a = f;
    }

    @Override // p000.fn1
    /* JADX INFO: renamed from: a */
    public final float mo11947a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f55567a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p48) && this.f55567a == ((p48) obj).f55567a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f55567a)});
    }

    public final String toString() {
        return wq1.m24123s(new StringBuilder(), (int) (this.f55567a * 100.0f), "%");
    }
}
