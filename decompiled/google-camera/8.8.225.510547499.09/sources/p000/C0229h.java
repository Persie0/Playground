package p000;

import java.text.Format;

/* JADX INFO: renamed from: h */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0229h {

    /* JADX INFO: renamed from: a */
    final int f27073a;

    /* JADX INFO: renamed from: b */
    final String f27074b;

    /* JADX INFO: renamed from: c */
    final Number f27075c;

    /* JADX INFO: renamed from: d */
    final double f27076d;

    /* JADX INFO: renamed from: e */
    int f27077e;

    /* JADX INFO: renamed from: f */
    Format f27078f;

    /* JADX INFO: renamed from: g */
    String f27079g;

    /* JADX INFO: renamed from: h */
    boolean f27080h;

    public C0229h(int i, String str, Number number, double d) {
        this.f27073a = i;
        this.f27074b = str;
        if (d == 0.0d) {
            this.f27075c = number;
        } else {
            this.f27075c = Double.valueOf(number.doubleValue() - d);
        }
        this.f27076d = d;
    }

    public final String toString() {
        throw new AssertionError("PluralSelectorContext being formatted, rather than its number");
    }
}
