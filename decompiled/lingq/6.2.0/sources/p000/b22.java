package p000;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class b22 {

    /* JADX INFO: renamed from: a */
    public final s11 f7781a;

    /* JADX INFO: renamed from: b */
    public final Locale f7782b;

    /* JADX INFO: renamed from: c */
    public final int f7783c;

    /* JADX INFO: renamed from: d */
    public DateTimeZone f7784d;

    /* JADX INFO: renamed from: e */
    public Integer f7785e;

    /* JADX INFO: renamed from: f */
    public z12[] f7786f;

    /* JADX INFO: renamed from: g */
    public int f7787g;

    /* JADX INFO: renamed from: h */
    public boolean f7788h;

    /* JADX INFO: renamed from: i */
    public a22 f7789i;

    public b22(s11 s11Var, Locale locale) {
        AtomicReference atomicReference = t22.f61763a;
        s11Var = s11Var == null ? ISOChronology.m18437Q() : s11Var;
        DateTimeZone dateTimeZoneMo18360k = s11Var.mo18360k();
        this.f7781a = s11Var.mo18358G();
        this.f7782b = locale == null ? Locale.getDefault() : locale;
        this.f7783c = 2000;
        this.f7784d = dateTimeZoneMo18360k;
        this.f7786f = new z12[8];
    }

    /* JADX INFO: renamed from: a */
    public static int m3180a(en2 en2Var, en2 en2Var2) {
        if (en2Var == null || !en2Var.mo11273f()) {
            return (en2Var2 == null || !en2Var2.mo11273f()) ? 0 : -1;
        }
        if (en2Var2 == null || !en2Var2.mo11273f()) {
            return 1;
        }
        return -en2Var.compareTo(en2Var2);
    }

    /* JADX INFO: renamed from: b */
    public final long m3181b(CharSequence charSequence) {
        z12[] z12VarArr = this.f7786f;
        int i = this.f7787g;
        if (this.f7788h) {
            z12VarArr = (z12[]) z12VarArr.clone();
            this.f7786f = z12VarArr;
            this.f7788h = false;
        }
        if (i > 10) {
            Arrays.sort(z12VarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = i2; i3 > 0; i3--) {
                    int i4 = i3 - 1;
                    z12 z12Var = z12VarArr[i4];
                    z12 z12Var2 = z12VarArr[i3];
                    z12Var.getClass();
                    f12 f12Var = z12Var2.f70741a;
                    int iM3180a = m3180a(z12Var.f70741a.mo3736q(), f12Var.mo3736q());
                    if (iM3180a == 0) {
                        iM3180a = m3180a(z12Var.f70741a.mo4682i(), f12Var.mo4682i());
                    }
                    if (iM3180a <= 0) {
                        break;
                    }
                    z12 z12Var3 = z12VarArr[i3];
                    z12VarArr[i3] = z12VarArr[i4];
                    z12VarArr[i4] = z12Var3;
                }
            }
        }
        if (i > 0) {
            DurationFieldType durationFieldType = DurationFieldType.f54838e;
            s11 s11Var = this.f7781a;
            en2 en2VarMo18361a = durationFieldType.mo18361a(s11Var);
            en2 en2VarMo18361a2 = DurationFieldType.f54840g.mo18361a(s11Var);
            en2 en2VarMo4682i = z12VarArr[0].f70741a.mo4682i();
            if (m3180a(en2VarMo4682i, en2VarMo18361a) >= 0 && m3180a(en2VarMo4682i, en2VarMo18361a2) <= 0) {
                m3190k(DateTimeFieldType.f54820e, this.f7783c);
                return m3181b(charSequence);
            }
        }
        long jMo11485D = 0;
        for (int i5 = 0; i5 < i; i5++) {
            try {
                z12 z12Var4 = z12VarArr[i5];
                String str = z12Var4.f70743c;
                f12 f12Var2 = z12Var4.f70741a;
                jMo11485D = z12Var4.f70741a.mo4687x(str == null ? f12Var2.mo11485D(jMo11485D, z12Var4.f70742b) : f12Var2.mo11029C(jMo11485D, str, z12Var4.f70744d));
            } catch (IllegalFieldValueException e) {
                if (charSequence != null) {
                    e.m18364b("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            if (!z12VarArr[i6].f70741a.mo4684t()) {
                z12 z12Var5 = z12VarArr[i6];
                boolean z = i6 == i + (-1);
                String str2 = z12Var5.f70743c;
                f12 f12Var3 = z12Var5.f70741a;
                jMo11485D = str2 == null ? f12Var3.mo11485D(jMo11485D, z12Var5.f70742b) : f12Var3.mo11029C(jMo11485D, str2, z12Var5.f70744d);
                if (z) {
                    jMo11485D = z12Var5.f70741a.mo4687x(jMo11485D);
                }
            }
            i6++;
        }
        Integer num = this.f7785e;
        if (num != null) {
            return jMo11485D - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.f7784d;
        if (dateTimeZone != null) {
            int iMo18352l = dateTimeZone.mo18352l(jMo11485D);
            jMo11485D -= (long) iMo18352l;
            if (iMo18352l != this.f7784d.mo18351k(jMo11485D)) {
                String str3 = "Illegal instant due to time zone offset transition (" + this.f7784d + ')';
                if (charSequence != null) {
                    str3 = "Cannot parse \"" + ((Object) charSequence) + "\": " + str3;
                }
                throw new IllegalInstantException(str3);
            }
        }
        return jMo11485D;
    }

    /* JADX INFO: renamed from: c */
    public final long m3182c(String str) {
        return m3181b(str);
    }

    /* JADX INFO: renamed from: d */
    public final long m3183d(s94 s94Var, String str) {
        int into = s94Var.parseInto(this, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            return m3181b(str);
        }
        C3386nv.m17626m(nc3.m17347c(into, str.toString()));
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public final s11 m3184e() {
        return this.f7781a;
    }

    /* JADX INFO: renamed from: f */
    public final Integer m3185f() {
        return this.f7785e;
    }

    /* JADX INFO: renamed from: g */
    public final DateTimeZone m3186g() {
        return this.f7784d;
    }

    /* JADX INFO: renamed from: h */
    public final z12 m3187h() {
        z12[] z12VarArr = this.f7786f;
        int i = this.f7787g;
        if (i == z12VarArr.length || this.f7788h) {
            z12[] z12VarArr2 = new z12[i == z12VarArr.length ? i * 2 : z12VarArr.length];
            System.arraycopy(z12VarArr, 0, z12VarArr2, 0, i);
            this.f7786f = z12VarArr2;
            this.f7788h = false;
            z12VarArr = z12VarArr2;
        }
        this.f7789i = null;
        z12 z12Var = z12VarArr[i];
        if (z12Var == null) {
            z12Var = new z12();
            z12VarArr[i] = z12Var;
        }
        this.f7787g = i + 1;
        return z12Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m3188i(Object obj) {
        if (obj instanceof a22) {
            a22 a22Var = (a22) obj;
            if (this != a22Var.f89e) {
                return;
            }
            this.f7784d = a22Var.f85a;
            this.f7785e = a22Var.f86b;
            this.f7786f = a22Var.f87c;
            int i = a22Var.f88d;
            if (i < this.f7787g) {
                this.f7788h = true;
            }
            this.f7787g = i;
            this.f7789i = a22Var;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3189j(bi7 bi7Var, int i) {
        z12 z12VarM3187h = m3187h();
        z12VarM3187h.f70741a = bi7Var;
        z12VarM3187h.f70742b = i;
        z12VarM3187h.f70743c = null;
        z12VarM3187h.f70744d = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m3190k(DateTimeFieldType dateTimeFieldType, int i) {
        z12 z12VarM3187h = m3187h();
        z12VarM3187h.f70741a = dateTimeFieldType.mo18335b(this.f7781a);
        z12VarM3187h.f70742b = i;
        z12VarM3187h.f70743c = null;
        z12VarM3187h.f70744d = null;
    }

    /* JADX INFO: renamed from: l */
    public final Object m3191l() {
        if (this.f7789i == null) {
            this.f7789i = new a22(this);
        }
        return this.f7789i;
    }

    /* JADX INFO: renamed from: m */
    public final void m3192m(Integer num) {
        this.f7789i = null;
        this.f7785e = num;
    }
}
