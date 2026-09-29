package gd;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: gd.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5770i implements InterfaceC5764c {

    /* JADX INFO: renamed from: a */
    public final float f34893a;

    public C5770i(float f3) {
        this.f34893a = f3;
    }

    @Override // gd.InterfaceC5764c
    /* JADX INFO: renamed from: a */
    public final float mo12127a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f34893a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5770i) && this.f34893a == ((C5770i) obj).f34893a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f34893a)});
    }
}
