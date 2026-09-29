package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2694i implements InterfaceC2790p {

    /* JADX INFO: renamed from: a */
    public final Double f14245a;

    public C2694i(Double d10) {
        if (d10 == null) {
            this.f14245a = Double.valueOf(Double.NaN);
        } else {
            this.f14245a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        return new C2694i(this.f14245a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        return this.f14245a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2694i) {
            return this.f14245a.equals(((C2694i) obj).f14245a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        Double d10 = this.f14245a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(d10.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        if (i10 >= 0 || i10 <= -7) {
            if (i10 < 0 || i10 >= 21) {
                return str.replace("E-", "e-").replace("E", "e+");
            }
        }
        return bigDecimalStripTrailingZeros.toPlainString();
    }

    public final int hashCode() {
        return this.f14245a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        Double d10 = this.f14245a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C2842t(mo7784f());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", mo7784f(), str));
    }

    public final String toString() {
        return mo7784f();
    }
}
