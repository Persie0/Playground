package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.DateTimeZone;
import p163hp.AbstractC6094a;

/* JADX INFO: renamed from: org.joda.time.format.j */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8148j {
    int estimatePrintedLength();

    void printTo(Appendable appendable, long j10, AbstractC6094a abstractC6094a, int i10, DateTimeZone dateTimeZone, Locale locale) throws IOException;
}
