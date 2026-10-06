package p021j$.time.format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p021j$.time.temporal.C0488q;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;

/* JADX INFO: renamed from: j$.time.format.h */
/* JADX INFO: loaded from: classes3.dex */
final class C0440h extends C0444l {

    /* JADX INFO: renamed from: g */
    private final boolean f32939g;

    C0440h(EnumC0472a enumC0472a, int i, int i2, boolean z) {
        this(enumC0472a, i, i2, z, 0);
        if (enumC0472a == null) {
            throw new NullPointerException("field");
        }
        if (!enumC0472a.mo12424f().m12454f()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(enumC0472a)));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // p021j$.time.format.C0444l, p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        InterfaceC0483l interfaceC0483l = this.f32946a;
        Long lM12313e = c0455w.m12313e(interfaceC0483l);
        if (lM12313e == null) {
            return false;
        }
        C0458z c0458zM12310b = c0455w.m12310b();
        long jLongValue = lM12313e.longValue();
        C0488q c0488qMo12424f = interfaceC0483l.mo12424f();
        c0488qMo12424f.m12451b(jLongValue, interfaceC0483l);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c0488qMo12424f.m12453e());
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf).divide(BigDecimal.valueOf(c0488qMo12424f.m12452d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal bigDecimalStripTrailingZeros = bigDecimalDivide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : bigDecimalDivide.stripTrailingZeros();
        int iScale = bigDecimalStripTrailingZeros.scale();
        boolean z = this.f32939g;
        int i = this.f32947b;
        if (iScale != 0) {
            String strSubstring = bigDecimalStripTrailingZeros.setScale(Math.min(Math.max(bigDecimalStripTrailingZeros.scale(), i), this.f32948c), RoundingMode.FLOOR).toPlainString().substring(2);
            c0458zM12310b.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            c0458zM12310b.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            c0458zM12310b.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // p021j$.time.format.C0444l
    /* JADX INFO: renamed from: d */
    final C0444l mo12279d() {
        return this.f32950e == -1 ? this : new C0440h(this.f32946a, this.f32947b, this.f32948c, this.f32939g, -1);
    }

    @Override // p021j$.time.format.C0444l
    /* JADX INFO: renamed from: e */
    final C0444l mo12280e(int i) {
        return new C0440h(this.f32946a, this.f32947b, this.f32948c, this.f32939g, this.f32950e + i);
    }

    @Override // p021j$.time.format.C0444l
    public final String toString() {
        String str = this.f32939g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.f32946a) + "," + this.f32947b + "," + this.f32948c + str + ")";
    }

    C0440h(InterfaceC0483l interfaceC0483l, int i, int i2, boolean z, int i3) {
        super(interfaceC0483l, i, i2, EnumC0431B.NOT_NEGATIVE, i3);
        this.f32939g = z;
    }
}
