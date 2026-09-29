package p445w1;

import androidx.compose.p017ui.text.style.TextForegroundStyle;
import p387t0.AbstractC9161o;
import p387t0.C9169u;

/* JADX INFO: renamed from: w1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9793c implements TextForegroundStyle {

    /* JADX INFO: renamed from: a */
    public final long f49903a;

    public C9793c(long j10) {
        this.f49903a = j10;
        if (!(j10 != C9169u.f47703f)) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: A */
    public final float mo2614A() {
        return C9169u.m17498d(this.f49903a);
    }

    @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: a */
    public final long mo2615a() {
        return this.f49903a;
    }

    @Override // androidx.compose.p017ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: d */
    public final AbstractC9161o mo2618d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9793c) && C9169u.m17497c(this.f49903a, ((C9793c) obj).f49903a);
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return Long.hashCode(this.f49903a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) C9169u.m17503i(this.f49903a)) + ')';
    }
}
