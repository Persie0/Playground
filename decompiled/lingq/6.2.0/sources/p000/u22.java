package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class u22 {

    /* JADX INFO: renamed from: a */
    public final char f63264a;

    /* JADX INFO: renamed from: b */
    public final int f63265b;

    /* JADX INFO: renamed from: c */
    public final int f63266c;

    /* JADX INFO: renamed from: d */
    public final int f63267d;

    /* JADX INFO: renamed from: e */
    public final boolean f63268e;

    /* JADX INFO: renamed from: f */
    public final int f63269f;

    public u22(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.f63264a = c;
        this.f63265b = i;
        this.f63266c = i2;
        this.f63267d = i3;
        this.f63268e = z;
        this.f63269f = i4;
    }

    /* JADX INFO: renamed from: a */
    public final long m22392a(long j, s11 s11Var) {
        int i = this.f63266c;
        if (i >= 0) {
            return s11Var.mo18398e().mo3733B(i, j);
        }
        return s11Var.mo18398e().mo11031a(i, s11Var.mo18415w().mo11031a(1, s11Var.mo18398e().mo3733B(1, j)));
    }

    /* JADX INFO: renamed from: b */
    public final long m22393b(long j, s11 s11Var) {
        try {
            return m22392a(j, s11Var);
        } catch (IllegalArgumentException e) {
            if (this.f63265b != 2 || this.f63266c != 29) {
                throw e;
            }
            while (!s11Var.mo18386I().mo11038s(j)) {
                j = s11Var.mo18386I().mo11031a(1, j);
            }
            return m22392a(j, s11Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m22394c(long j, s11 s11Var) {
        try {
            return m22392a(j, s11Var);
        } catch (IllegalArgumentException e) {
            if (this.f63265b != 2 || this.f63266c != 29) {
                throw e;
            }
            while (!s11Var.mo18386I().mo11038s(j)) {
                j = s11Var.mo18386I().mo11031a(-1, j);
            }
            return m22392a(j, s11Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m22395d(long j, s11 s11Var) {
        int iMo3734b = this.f63267d - s11Var.mo18399f().mo3734b(j);
        if (iMo3734b == 0) {
            return j;
        }
        if (this.f63268e) {
            if (iMo3734b < 0) {
                iMo3734b += 7;
            }
        } else if (iMo3734b > 0) {
            iMo3734b -= 7;
        }
        return s11Var.mo18399f().mo11031a(iMo3734b, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u22) {
            u22 u22Var = (u22) obj;
            if (this.f63264a == u22Var.f63264a && this.f63265b == u22Var.f63265b && this.f63266c == u22Var.f63266c && this.f63267d == u22Var.f63267d && this.f63268e == u22Var.f63268e && this.f63269f == u22Var.f63269f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.f63264a), Integer.valueOf(this.f63265b), Integer.valueOf(this.f63266c), Integer.valueOf(this.f63267d), Boolean.valueOf(this.f63268e), Integer.valueOf(this.f63269f)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[OfYear]\nMode: ");
        sb.append(this.f63264a);
        sb.append("\nMonthOfYear: ");
        sb.append(this.f63265b);
        sb.append("\nDayOfMonth: ");
        sb.append(this.f63266c);
        sb.append("\nDayOfWeek: ");
        sb.append(this.f63267d);
        sb.append("\nAdvanceDayOfWeek: ");
        sb.append(this.f63268e);
        sb.append("\nMillisOfDay: ");
        return wq1.m24122r(sb, this.f63269f, '\n');
    }
}
