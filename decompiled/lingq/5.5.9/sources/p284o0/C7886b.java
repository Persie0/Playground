package p284o0;

import android.support.v4.media.C0141b;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p338qd.C8573r0;
import p470x1.C10022j;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7886b implements InterfaceC7885a {

    /* JADX INFO: renamed from: a */
    public final float f42997a;

    /* JADX INFO: renamed from: b */
    public final float f42998b;

    /* JADX INFO: renamed from: o0.b$a */
    public static final class a implements InterfaceC7885a.b {

        /* JADX INFO: renamed from: a */
        public final float f42999a;

        public a(float f3) {
            this.f42999a = f3;
        }

        @Override // p284o0.InterfaceC7885a.b
        /* JADX INFO: renamed from: a */
        public final int mo15656a(int i10, LayoutDirection layoutDirection) {
            C5207g.m11111f(layoutDirection, "layoutDirection");
            float f3 = (i10 + 0) / 2.0f;
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            float f10 = this.f42999a;
            if (layoutDirection != layoutDirection2) {
                f10 *= -1;
            }
            return C8573r0.m16710Y0((1 + f10) * f3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f42999a, ((a) obj).f42999a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f42999a);
        }

        public final String toString() {
            return C0141b.m612h(new StringBuilder("Horizontal(bias="), this.f42999a, ')');
        }
    }

    /* JADX INFO: renamed from: o0.b$b */
    public static final class b implements InterfaceC7885a.c {

        /* JADX INFO: renamed from: a */
        public final float f43000a;

        public b(float f3) {
            this.f43000a = f3;
        }

        @Override // p284o0.InterfaceC7885a.c
        /* JADX INFO: renamed from: a */
        public final int mo15657a(int i10) {
            return C8573r0.m16710Y0((1 + this.f43000a) * ((i10 + 0) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f43000a, ((b) obj).f43000a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f43000a);
        }

        public final String toString() {
            return C0141b.m612h(new StringBuilder("Vertical(bias="), this.f43000a, ')');
        }
    }

    public C7886b(float f3, float f10) {
        this.f42997a = f3;
        this.f42998b = f10;
    }

    @Override // p284o0.InterfaceC7885a
    /* JADX INFO: renamed from: a */
    public final long mo15655a(long j10, long j11, LayoutDirection layoutDirection) {
        C5207g.m11111f(layoutDirection, "layoutDirection");
        float f3 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float fM18628b = (C10022j.m18628b(j11) - C10022j.m18628b(j10)) / 2.0f;
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f10 = this.f42997a;
        if (layoutDirection != layoutDirection2) {
            f10 *= -1;
        }
        float f11 = 1;
        return C8573r0.m16752r(C8573r0.m16710Y0((f10 + f11) * f3), C8573r0.m16710Y0((f11 + this.f42998b) * fM18628b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7886b)) {
            return false;
        }
        C7886b c7886b = (C7886b) obj;
        return Float.compare(this.f42997a, c7886b.f42997a) == 0 && Float.compare(this.f42998b, c7886b.f42998b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42998b) + (Float.hashCode(this.f42997a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f42997a);
        sb2.append(", verticalBias=");
        return C0141b.m612h(sb2, this.f42998b, ')');
    }
}
