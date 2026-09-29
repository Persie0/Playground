package gd;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: gd.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5763b implements InterfaceC5764c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5764c f34842a;

    /* JADX INFO: renamed from: b */
    public final float f34843b;

    public C5763b(float f3, InterfaceC5764c interfaceC5764c) {
        while (interfaceC5764c instanceof C5763b) {
            interfaceC5764c = ((C5763b) interfaceC5764c).f34842a;
            f3 += ((C5763b) interfaceC5764c).f34843b;
        }
        this.f34842a = interfaceC5764c;
        this.f34843b = f3;
    }

    @Override // gd.InterfaceC5764c
    /* JADX INFO: renamed from: a */
    public final float mo12127a(RectF rectF) {
        return Math.max(0.0f, this.f34842a.mo12127a(rectF) + this.f34843b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5763b)) {
            return false;
        }
        C5763b c5763b = (C5763b) obj;
        return this.f34842a.equals(c5763b.f34842a) && this.f34843b == c5763b.f34843b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34842a, Float.valueOf(this.f34843b)});
    }
}
