package org.joda.time.chrono;

import android.support.v4.media.session.C0166e;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
import p163hp.AbstractC6094a;

/* JADX INFO: loaded from: classes2.dex */
public final class GregorianChronology extends BasicGJChronology {
    private static final long serialVersionUID = -861407383323710522L;

    /* JADX INFO: renamed from: C0 */
    public static final ConcurrentHashMap<DateTimeZone, GregorianChronology[]> f44065C0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: B0 */
    public static final GregorianChronology f44064B0 = m16073J0(DateTimeZone.f43949a, 4);

    public GregorianChronology(ZonedChronology zonedChronology, int i10) {
        super(zonedChronology, i10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: J0 */
    public static GregorianChronology m16073J0(DateTimeZone dateTimeZone, int i10) {
        GregorianChronology[] gregorianChronologyArrPutIfAbsent;
        DateTimeZone dateTimeZoneM16016e = dateTimeZone;
        if (dateTimeZoneM16016e == null) {
            dateTimeZoneM16016e = DateTimeZone.m16016e();
        }
        ConcurrentHashMap<DateTimeZone, GregorianChronology[]> concurrentHashMap = f44065C0;
        GregorianChronology[] gregorianChronologyArr = concurrentHashMap.get(dateTimeZoneM16016e);
        if (gregorianChronologyArr == null && (gregorianChronologyArrPutIfAbsent = concurrentHashMap.putIfAbsent(dateTimeZoneM16016e, (gregorianChronologyArr = new GregorianChronology[7]))) != null) {
            gregorianChronologyArr = gregorianChronologyArrPutIfAbsent;
        }
        int i11 = i10 - 1;
        try {
            GregorianChronology gregorianChronology = gregorianChronologyArr[i11];
            if (gregorianChronology == null) {
                synchronized (gregorianChronologyArr) {
                    gregorianChronology = gregorianChronologyArr[i11];
                    if (gregorianChronology == null) {
                        DateTimeZone dateTimeZone2 = DateTimeZone.f43949a;
                        GregorianChronology gregorianChronology2 = dateTimeZoneM16016e == dateTimeZone2 ? new GregorianChronology(null, i10) : new GregorianChronology(ZonedChronology.m16075m0(m16073J0(dateTimeZone2, i10), dateTimeZoneM16016e), i10);
                        gregorianChronologyArr[i11] = gregorianChronology2;
                        gregorianChronology = gregorianChronology2;
                    }
                }
            }
            return gregorianChronology;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new IllegalArgumentException(C0166e.m761g("Invalid min days in first week: ", i10));
        }
    }

    private Object readResolve() {
        AbstractC6094a abstractC6094aM16043h0 = m16043h0();
        int iM16070x0 = m16070x0();
        if (iM16070x0 == 0) {
            iM16070x0 = 4;
        }
        return abstractC6094aM16043h0 == null ? m16073J0(DateTimeZone.f43949a, iM16070x0) : m16073J0(abstractC6094aM16043h0.mo12554q(), iM16070x0);
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: H0 */
    public final boolean mo16057H0(int i10) {
        return (i10 & 3) == 0 && (i10 % 100 != 0 || i10 % 400 == 0);
    }

    @Override // org.joda.time.chrono.AssembledChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: a0 */
    public final AbstractC6094a mo12539a0() {
        return f44064B0;
    }

    @Override // p163hp.AbstractC6094a
    /* JADX INFO: renamed from: b0 */
    public final AbstractC6094a mo12541b0(DateTimeZone dateTimeZone) {
        if (dateTimeZone == null) {
            dateTimeZone = DateTimeZone.m16016e();
        }
        return dateTimeZone == mo12554q() ? this : m16073J0(dateTimeZone, 4);
    }

    @Override // org.joda.time.chrono.BasicChronology, org.joda.time.chrono.AssembledChronology
    /* JADX INFO: renamed from: g0 */
    public final void mo16042g0(AssembledChronology.C8104a c8104a) {
        if (m16043h0() == null) {
            super.mo16042g0(c8104a);
        }
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: k0 */
    public final long mo16059k0(int i10) {
        int i11;
        int i12 = i10 / 100;
        if (i10 < 0) {
            i11 = ((((i10 + 3) >> 2) - i12) + ((i12 + 3) >> 2)) - 1;
        } else {
            i11 = ((i10 >> 2) - i12) + (i12 >> 2);
            if (mo16057H0(i10)) {
                i11--;
            }
        }
        return ((((long) i10) * 365) + ((long) (i11 - 719527))) * 86400000;
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: l0 */
    public final void mo16060l0() {
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: m0 */
    public final void mo16061m0() {
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: n0 */
    public final void mo16062n0() {
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: o0 */
    public final void mo16063o0() {
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: u0 */
    public final void mo16068u0() {
    }

    @Override // org.joda.time.chrono.BasicChronology
    /* JADX INFO: renamed from: w0 */
    public final void mo16069w0() {
    }
}
