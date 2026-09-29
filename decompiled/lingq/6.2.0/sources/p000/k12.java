package p000;

import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes.dex */
public final class k12 {

    /* JADX INFO: renamed from: a */
    public final u94 f46544a;

    /* JADX INFO: renamed from: b */
    public final s94 f46545b;

    /* JADX INFO: renamed from: c */
    public final Locale f46546c;

    /* JADX INFO: renamed from: d */
    public final boolean f46547d;

    /* JADX INFO: renamed from: e */
    public final s11 f46548e;

    /* JADX INFO: renamed from: f */
    public final DateTimeZone f46549f;

    public k12(u94 u94Var, s94 s94Var) {
        this.f46544a = u94Var;
        this.f46545b = s94Var;
        this.f46546c = null;
        this.f46547d = false;
        this.f46548e = null;
        this.f46549f = null;
    }

    /* JADX INFO: renamed from: a */
    public final String m14766a(AbstractC3631u0 abstractC3631u0) {
        DateTimeZone dateTimeZone;
        long j;
        u94 u94Var = this.f46544a;
        if (u94Var == null) {
            C3386nv.m17636w("Printing not supported");
            return null;
        }
        StringBuilder sb = new StringBuilder(u94Var.estimatePrintedLength());
        try {
            AtomicReference atomicReference = t22.f61763a;
            long jMo18366b = abstractC3631u0.mo18366b();
            s11 s11VarMo18365a = abstractC3631u0.mo18365a();
            if (s11VarMo18365a == null) {
                s11VarMo18365a = ISOChronology.m18437Q();
            }
            if (u94Var == null) {
                throw new UnsupportedOperationException("Printing not supported");
            }
            s11 s11VarM14768c = m14768c(s11VarMo18365a);
            DateTimeZone dateTimeZoneMo18360k = s11VarM14768c.mo18360k();
            int iMo18351k = dateTimeZoneMo18360k.mo18351k(jMo18366b);
            long j2 = iMo18351k;
            long j3 = jMo18366b + j2;
            if ((jMo18366b ^ j3) >= 0 || (j2 ^ jMo18366b) < 0) {
                dateTimeZone = dateTimeZoneMo18360k;
                j = j3;
            } else {
                iMo18351k = 0;
                dateTimeZone = DateTimeZone.f54829a;
                j = jMo18366b;
            }
            u94Var.printTo(sb, j, s11VarM14768c.mo18358G(), iMo18351k, dateTimeZone, this.f46546c);
            return sb.toString();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m14767b(p90 p90Var) {
        u94 u94Var = this.f46544a;
        if (u94Var == null) {
            C3386nv.m17636w("Printing not supported");
            return null;
        }
        StringBuilder sb = new StringBuilder(u94Var.estimatePrintedLength());
        try {
            if (u94Var == null) {
                throw new UnsupportedOperationException("Printing not supported");
            }
            u94Var.printTo(sb, p90Var, this.f46546c);
            return sb.toString();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final s11 m14768c(s11 s11Var) {
        AtomicReference atomicReference = t22.f61763a;
        if (s11Var == null) {
            s11Var = ISOChronology.m18437Q();
        }
        s11 s11Var2 = this.f46548e;
        if (s11Var2 != null) {
            s11Var = s11Var2;
        }
        DateTimeZone dateTimeZone = this.f46549f;
        return dateTimeZone != null ? s11Var.mo18359H(dateTimeZone) : s11Var;
    }

    /* JADX INFO: renamed from: d */
    public final k12 m14769d(Locale locale) {
        Locale locale2 = this.f46546c;
        if (locale == locale2 || (locale != null && locale.equals(locale2))) {
            return this;
        }
        return new k12(this.f46544a, this.f46545b, locale, this.f46547d, this.f46548e, this.f46549f);
    }

    /* JADX INFO: renamed from: e */
    public final k12 m14770e() {
        DateTimeZone dateTimeZone = DateTimeZone.f54829a;
        if (this.f46549f == dateTimeZone) {
            return this;
        }
        return new k12(this.f46544a, this.f46545b, this.f46546c, false, this.f46548e, dateTimeZone);
    }

    public k12(u94 u94Var, s94 s94Var, Locale locale, boolean z, s11 s11Var, DateTimeZone dateTimeZone) {
        this.f46544a = u94Var;
        this.f46545b = s94Var;
        this.f46546c = locale;
        this.f46547d = z;
        this.f46548e = s11Var;
        this.f46549f = dateTimeZone;
    }
}
