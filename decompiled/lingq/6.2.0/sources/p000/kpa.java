package p000;

import java.math.BigInteger;
import kotlin.AbstractC3192a;

/* JADX INFO: loaded from: classes2.dex */
public final class kpa implements Comparable {

    /* JADX INFO: renamed from: f */
    public static final kpa f48300f;

    /* JADX INFO: renamed from: a */
    public final int f48301a;

    /* JADX INFO: renamed from: b */
    public final int f48302b;

    /* JADX INFO: renamed from: c */
    public final int f48303c;

    /* JADX INFO: renamed from: d */
    public final String f48304d;

    /* JADX INFO: renamed from: e */
    public final cs4 f48305e = AbstractC3192a.m15356a(new br8(this, 10));

    static {
        new kpa(0, 0, 0, "");
        f48300f = new kpa(0, 1, 0, "");
        new kpa(1, 0, 0, "");
    }

    public kpa(int i, int i2, int i3, String str) {
        this.f48301a = i;
        this.f48302b = i2;
        this.f48303c = i3;
        this.f48304d = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        kpa kpaVar = (kpa) obj;
        kpaVar.getClass();
        Object value = this.f48305e.getValue();
        value.getClass();
        Object value2 = kpaVar.f48305e.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kpa)) {
            return false;
        }
        kpa kpaVar = (kpa) obj;
        return this.f48301a == kpaVar.f48301a && this.f48302b == kpaVar.f48302b && this.f48303c == kpaVar.f48303c;
    }

    public final int hashCode() {
        return ((((527 + this.f48301a) * 31) + this.f48302b) * 31) + this.f48303c;
    }

    public final String toString() {
        String str = this.f48304d;
        String strConcat = !vk9.m23391n0(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f48301a);
        sb.append('.');
        sb.append(this.f48302b);
        sb.append('.');
        return wq1.m24123s(sb, this.f48303c, strConcat);
    }
}
