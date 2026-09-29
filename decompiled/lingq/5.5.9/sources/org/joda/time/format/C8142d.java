package org.joda.time.format;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.ISOChronology;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;
import p163hp.C6096c;

/* JADX INFO: renamed from: org.joda.time.format.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8142d {

    /* JADX INFO: renamed from: a */
    public final AbstractC6094a f44161a;

    /* JADX INFO: renamed from: b */
    public final long f44162b;

    /* JADX INFO: renamed from: c */
    public final Locale f44163c;

    /* JADX INFO: renamed from: d */
    public final int f44164d;

    /* JADX INFO: renamed from: e */
    public DateTimeZone f44165e;

    /* JADX INFO: renamed from: f */
    public Integer f44166f;

    /* JADX INFO: renamed from: g */
    public final Integer f44167g;

    /* JADX INFO: renamed from: h */
    public a[] f44168h;

    /* JADX INFO: renamed from: i */
    public int f44169i;

    /* JADX INFO: renamed from: j */
    public boolean f44170j;

    /* JADX INFO: renamed from: k */
    public Object f44171k;

    /* JADX INFO: renamed from: org.joda.time.format.d$a */
    public static class a implements Comparable<a> {

        /* JADX INFO: renamed from: a */
        public AbstractC6095b f44172a;

        /* JADX INFO: renamed from: b */
        public int f44173b;

        /* JADX INFO: renamed from: c */
        public String f44174c;

        /* JADX INFO: renamed from: d */
        public Locale f44175d;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            AbstractC6095b abstractC6095b = aVar.f44172a;
            int iM16119a = C8142d.m16119a(this.f44172a.mo12584t(), abstractC6095b.mo12584t());
            return iM16119a != 0 ? iM16119a : C8142d.m16119a(this.f44172a.mo12577j(), abstractC6095b.mo12577j());
        }

        /* JADX INFO: renamed from: f */
        public final long m16125f(boolean z10, long j10) {
            String str = this.f44174c;
            long jMo12570Q = str == null ? this.f44172a.mo12570Q(this.f44173b, j10) : this.f44172a.mo12569M(j10, str, this.f44175d);
            return z10 ? this.f44172a.mo12564D(jMo12570Q) : jMo12570Q;
        }
    }

    /* JADX INFO: renamed from: org.joda.time.format.d$b */
    public class b {

        /* JADX INFO: renamed from: a */
        public final DateTimeZone f44176a;

        /* JADX INFO: renamed from: b */
        public final Integer f44177b;

        /* JADX INFO: renamed from: c */
        public final a[] f44178c;

        /* JADX INFO: renamed from: d */
        public final int f44179d;

        public b() {
            this.f44176a = C8142d.this.f44165e;
            this.f44177b = C8142d.this.f44166f;
            this.f44178c = C8142d.this.f44168h;
            this.f44179d = C8142d.this.f44169i;
        }
    }

    public C8142d(AbstractC6094a abstractC6094a, Locale locale, Integer num, int i10) {
        AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
        if (abstractC6094a == null) {
            ISOChronology iSOChronology = ISOChronology.f44066e0;
            abstractC6094a = ISOChronology.m16074k0(DateTimeZone.m16016e());
        }
        this.f44162b = 0L;
        DateTimeZone dateTimeZoneMo12554q = abstractC6094a.mo12554q();
        this.f44161a = abstractC6094a.mo12539a0();
        this.f44163c = locale == null ? Locale.getDefault() : locale;
        this.f44164d = i10;
        this.f44165e = dateTimeZoneMo12554q;
        this.f44167g = num;
        this.f44168h = new a[8];
    }

    /* JADX INFO: renamed from: a */
    public static int m16119a(AbstractC6097d abstractC6097d, AbstractC6097d abstractC6097d2) {
        if (abstractC6097d == null || !abstractC6097d.mo12596w()) {
            return (abstractC6097d2 == null || !abstractC6097d2.mo12596w()) ? 0 : -1;
        }
        if (abstractC6097d2 == null || !abstractC6097d2.mo12596w()) {
            return 1;
        }
        return -abstractC6097d.compareTo(abstractC6097d2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public final long m16120b(CharSequence charSequence) {
        a[] aVarArr = this.f44168h;
        int i10 = this.f44169i;
        if (this.f44170j) {
            aVarArr = (a[]) aVarArr.clone();
            this.f44168h = aVarArr;
            this.f44170j = false;
        }
        if (i10 > 10) {
            Arrays.sort(aVarArr, 0, i10);
        } else {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11;
                while (i12 > 0) {
                    int i13 = i12 - 1;
                    if (aVarArr[i13].compareTo(aVarArr[i12]) <= 0) {
                        break;
                    }
                    a aVar = aVarArr[i12];
                    aVarArr[i12] = aVarArr[i13];
                    aVarArr[i13] = aVar;
                    i12 = i13;
                }
            }
        }
        if (i10 > 0) {
            DurationFieldType durationFieldType = DurationFieldType.f43960e;
            AbstractC6094a abstractC6094a = this.f44161a;
            AbstractC6097d abstractC6097dMo16032a = durationFieldType.mo16032a(abstractC6094a);
            AbstractC6097d abstractC6097dMo16032a2 = DurationFieldType.f43962g.mo16032a(abstractC6094a);
            AbstractC6097d abstractC6097dMo12577j = aVarArr[0].f44172a.mo12577j();
            if (m16119a(abstractC6097dMo12577j, abstractC6097dMo16032a) >= 0 && m16119a(abstractC6097dMo12577j, abstractC6097dMo16032a2) <= 0) {
                m16123e(DateTimeFieldType.f43940e, this.f44164d);
                return m16120b(charSequence);
            }
        }
        long jM16125f = this.f44162b;
        for (int i14 = 0; i14 < i10; i14++) {
            try {
                jM16125f = aVarArr[i14].m16125f(true, jM16125f);
            } catch (IllegalFieldValueException e10) {
                if (charSequence != null) {
                    e10.m16035b("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e10;
            }
        }
        int i15 = 0;
        while (i15 < i10) {
            if (!aVarArr[i15].f44172a.mo12587y()) {
                jM16125f = aVarArr[i15].m16125f(i15 == i10 + (-1), jM16125f);
            }
            i15++;
        }
        Integer num = this.f44166f;
        if (num != null) {
            return jM16125f - ((long) num.intValue());
        }
        DateTimeZone dateTimeZone = this.f44165e;
        if (dateTimeZone != null) {
            int iMo16026q = dateTimeZone.mo16026q(jM16125f);
            jM16125f -= (long) iMo16026q;
            if (iMo16026q != this.f44165e.mo16025n(jM16125f)) {
                String str = "Illegal instant due to time zone offset transition (" + this.f44165e + ')';
                if (charSequence != null) {
                    str = "Cannot parse \"" + ((Object) charSequence) + "\": " + str;
                }
                throw new IllegalInstantException(str);
            }
        }
        return jM16125f;
    }

    /* JADX INFO: renamed from: c */
    public final a m16121c() {
        a[] aVarArr = this.f44168h;
        int i10 = this.f44169i;
        if (i10 == aVarArr.length || this.f44170j) {
            a[] aVarArr2 = new a[i10 == aVarArr.length ? i10 * 2 : aVarArr.length];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
            this.f44168h = aVarArr2;
            this.f44170j = false;
            aVarArr = aVarArr2;
        }
        this.f44171k = null;
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVar = new a();
            aVarArr[i10] = aVar;
        }
        this.f44169i = i10 + 1;
        return aVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m16122d(Object obj) {
        boolean z10;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this != C8142d.this) {
                z10 = false;
            } else {
                this.f44165e = bVar.f44176a;
                this.f44166f = bVar.f44177b;
                this.f44168h = bVar.f44178c;
                int i10 = this.f44169i;
                int i11 = bVar.f44179d;
                if (i11 < i10) {
                    this.f44170j = true;
                }
                this.f44169i = i11;
                z10 = true;
            }
            if (z10) {
                this.f44171k = obj;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16123e(DateTimeFieldType dateTimeFieldType, int i10) {
        a aVarM16121c = m16121c();
        aVarM16121c.f44172a = dateTimeFieldType.mo16010b(this.f44161a);
        aVarM16121c.f44173b = i10;
        aVarM16121c.f44174c = null;
        aVarM16121c.f44175d = null;
    }
}
