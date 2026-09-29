package org.joda.time.p022tz;

import org.joda.time.DateTimeZone;
import p000.ol0;

/* JADX INFO: loaded from: classes.dex */
public class CachedDateTimeZone extends DateTimeZone {

    /* JADX INFO: renamed from: f */
    public static final int f54926f;
    private static final long serialVersionUID = 5472298452022250685L;

    /* JADX INFO: renamed from: e */
    public final transient ol0[] f54927e;
    private final DateTimeZone iZone;

    static {
        Integer integer;
        int i;
        try {
            integer = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            integer = null;
        }
        if (integer == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int iIntValue = integer.intValue() - 1; iIntValue > 0; iIntValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        f54926f = i - 1;
    }

    public CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.m18348g());
        this.f54927e = new ol0[f54926f + 1];
        this.iZone = dateTimeZone;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return this.iZone.hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: i */
    public final String mo18350i(long j) {
        return m18453v(j).m18093a(j);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: k */
    public final int mo18351k(long j) {
        return m18453v(j).m18094b(j);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: o */
    public final int mo18354o(long j) {
        return m18453v(j).m18095c(j);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: p */
    public final boolean mo18355p() {
        return this.iZone.mo18355p();
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: q */
    public final long mo18356q(long j) {
        return this.iZone.mo18356q(j);
    }

    @Override // org.joda.time.DateTimeZone
    /* JADX INFO: renamed from: s */
    public final long mo18357s(long j) {
        return this.iZone.mo18357s(j);
    }

    /* JADX INFO: renamed from: v */
    public final ol0 m18453v(long j) {
        int i = (int) (j >> 32);
        int i2 = f54926f & i;
        ol0[] ol0VarArr = this.f54927e;
        ol0 ol0Var = ol0VarArr[i2];
        if (ol0Var != null && ((int) (ol0Var.f54520a >> 32)) == i) {
            return ol0Var;
        }
        long j2 = j & (-4294967296L);
        ol0 ol0Var2 = new ol0(this.iZone, j2);
        long j3 = 4294967295L | j2;
        ol0 ol0Var3 = ol0Var2;
        while (true) {
            long jMo18356q = this.iZone.mo18356q(j2);
            if (jMo18356q == j2 || jMo18356q > j3) {
                break;
            }
            ol0 ol0Var4 = new ol0(this.iZone, jMo18356q);
            ol0Var3.f54522c = ol0Var4;
            ol0Var3 = ol0Var4;
            j2 = jMo18356q;
        }
        ol0VarArr[i2] = ol0Var2;
        return ol0Var2;
    }
}
