package p445w1;

import android.support.v4.media.C0141b;
import androidx.compose.p017ui.text.style.TextForegroundStyle;
import dm.C5207g;
import p387t0.AbstractC9150i0;
import p387t0.AbstractC9161o;
import p387t0.C9169u;

/* JADX INFO: renamed from: w1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9792b implements TextForegroundStyle {

    /* JADX INFO: renamed from: a */
    public final AbstractC9150i0 f49901a;

    /* JADX INFO: renamed from: b */
    public final float f49902b;

    public C9792b(AbstractC9150i0 abstractC9150i0, float f3) {
        C5207g.m11111f(abstractC9150i0, "value");
        this.f49901a = abstractC9150i0;
        this.f49902b = f3;
    }

    @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: A */
    public final float mo2614A() {
        return this.f49902b;
    }

    @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: a */
    public final long mo2615a() {
        int i10 = C9169u.f47704g;
        return C9169u.f47703f;
    }

    @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: d */
    public final AbstractC9161o mo2618d() {
        return this.f49901a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9792b)) {
            return false;
        }
        C9792b c9792b = (C9792b) obj;
        return C5207g.m11106a(this.f49901a, c9792b.f49901a) && Float.compare(this.f49902b, c9792b.f49902b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f49902b) + (this.f49901a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f49901a);
        sb2.append(", alpha=");
        return C0141b.m612h(sb2, this.f49902b, ')');
    }
}
