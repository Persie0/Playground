package p000;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class bkb implements kmb {

    /* JADX INFO: renamed from: a */
    public final Double f8647a;

    public bkb(Double d) {
        if (d == null) {
            this.f8647a = Double.valueOf(Double.NaN);
        } else {
            this.f8647a = d;
        }
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        Double d = this.f8647a;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        Double d = this.f8647a;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(d.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalStripTrailingZeros.toPlainString();
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return null;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        return this.f8647a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bkb) {
            return this.f8647a.equals(((bkb) obj).f8647a);
        }
        return false;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new xmb(mo3809c());
        }
        throw new IllegalArgumentException(mo3809c() + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return this.f8647a.hashCode();
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        return new bkb(this.f8647a);
    }

    public final String toString() {
        return mo3809c();
    }
}
