package gd;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: gd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5762a implements InterfaceC5764c {

    /* JADX INFO: renamed from: a */
    public final float f34841a;

    public C5762a(float f3) {
        this.f34841a = f3;
    }

    @Override // gd.InterfaceC5764c
    /* JADX INFO: renamed from: a */
    public final float mo12127a(RectF rectF) {
        return this.f34841a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5762a) && this.f34841a == ((C5762a) obj).f34841a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f34841a)});
    }
}
