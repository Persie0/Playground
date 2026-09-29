package org.joda.time;

import android.support.v4.media.C0141b;
import org.joda.time.format.C8139a;

/* JADX INFO: loaded from: classes2.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    public IllegalInstantException(String str, long j10) {
        super(C0141b.m611g("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", C8139a.m16112a().m16116b(new Instant(j10)), str != null ? C0141b.m611g(" (", str, ")") : ""));
    }
}
