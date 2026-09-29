package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import p163hp.AbstractC6094a;
import p163hp.C6096c;
import p163hp.InterfaceC6098e;

/* JADX INFO: renamed from: org.joda.time.format.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8140b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8148j f44154a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8146h f44155b;

    /* JADX INFO: renamed from: c */
    public final Locale f44156c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6094a f44157d;

    /* JADX INFO: renamed from: e */
    public final DateTimeZone f44158e;

    /* JADX INFO: renamed from: f */
    public final Integer f44159f;

    /* JADX INFO: renamed from: g */
    public final int f44160g;

    public C8140b(InterfaceC8148j interfaceC8148j, InterfaceC8146h interfaceC8146h) {
        this.f44154a = interfaceC8148j;
        this.f44155b = interfaceC8146h;
        this.f44156c = null;
        this.f44157d = null;
        this.f44158e = null;
        this.f44159f = null;
        this.f44160g = 2000;
    }

    public C8140b(InterfaceC8148j interfaceC8148j, InterfaceC8146h interfaceC8146h, Locale locale, boolean z10, AbstractC6094a abstractC6094a, DateTimeZone dateTimeZone, Integer num, int i10) {
        this.f44154a = interfaceC8148j;
        this.f44155b = interfaceC8146h;
        this.f44156c = locale;
        this.f44157d = abstractC6094a;
        this.f44158e = dateTimeZone;
        this.f44159f = num;
        this.f44160g = i10;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC8141c m16115a() {
        InterfaceC8146h interfaceC8146h = this.f44155b;
        if (interfaceC8146h instanceof C8143e) {
            return ((C8143e) interfaceC8146h).f44181a;
        }
        if (interfaceC8146h instanceof InterfaceC8141c) {
            return (InterfaceC8141c) interfaceC8146h;
        }
        if (interfaceC8146h == null) {
            return null;
        }
        return new C8147i(interfaceC8146h);
    }

    /* JADX INFO: renamed from: b */
    public final String m16116b(InterfaceC6098e interfaceC6098e) {
        AbstractC6094a abstractC6094aMo12598n;
        DateTimeZone dateTimeZone;
        InterfaceC8148j interfaceC8148j = this.f44154a;
        if (interfaceC8148j == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        StringBuilder sb2 = new StringBuilder(interfaceC8148j.estimatePrintedLength());
        try {
            AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
            long jCurrentTimeMillis = interfaceC6098e == null ? System.currentTimeMillis() : interfaceC6098e.mo12597k();
            if (interfaceC6098e == null || (abstractC6094aMo12598n = interfaceC6098e.mo12598n()) == null) {
                ISOChronology iSOChronology = ISOChronology.f44066e0;
                abstractC6094aMo12598n = ISOChronology.m16074k0(DateTimeZone.m16016e());
            }
            if (interfaceC8148j == null) {
                throw new UnsupportedOperationException("Printing not supported");
            }
            AbstractC6094a abstractC6094a = this.f44157d;
            if (abstractC6094a != null) {
                abstractC6094aMo12598n = abstractC6094a;
            }
            DateTimeZone dateTimeZone2 = this.f44158e;
            if (dateTimeZone2 != null) {
                abstractC6094aMo12598n = abstractC6094aMo12598n.mo12541b0(dateTimeZone2);
            }
            DateTimeZone dateTimeZoneMo12554q = abstractC6094aMo12598n.mo12554q();
            int iMo16025n = dateTimeZoneMo12554q.mo16025n(jCurrentTimeMillis);
            long j10 = iMo16025n;
            long j11 = jCurrentTimeMillis + j10;
            if ((jCurrentTimeMillis ^ j11) >= 0 || (j10 ^ jCurrentTimeMillis) < 0) {
                dateTimeZone = dateTimeZoneMo12554q;
                jCurrentTimeMillis = j11;
            } else {
                iMo16025n = 0;
                dateTimeZone = DateTimeZone.f43949a;
            }
            interfaceC8148j.printTo(sb2, jCurrentTimeMillis, abstractC6094aMo12598n.mo12539a0(), iMo16025n, dateTimeZone, this.f44156c);
            return sb2.toString();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final C8140b m16117c() {
        DateTimeZone dateTimeZone = DateTimeZone.f43949a;
        return this.f44158e == dateTimeZone ? this : new C8140b(this.f44154a, this.f44155b, this.f44156c, false, this.f44157d, dateTimeZone, this.f44159f, this.f44160g);
    }
}
