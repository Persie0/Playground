package org.joda.time;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import p163hp.C6096c;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTime extends BaseDateTime {
    private static final long serialVersionUID = -5171125899451703815L;

    public DateTime() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateTime(DateTimeZone dateTimeZone) {
        super(System.currentTimeMillis(), ISOChronology.m16074k0(dateTimeZone));
        AtomicReference<Map<String, DateTimeZone>> atomicReference = C6096c.f35849a;
    }
}
