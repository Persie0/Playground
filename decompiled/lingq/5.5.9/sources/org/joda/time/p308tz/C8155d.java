package org.joda.time.p308tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* JADX INFO: renamed from: org.joda.time.tz.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8155d implements InterfaceC8154c {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f44263a = Collections.singleton("UTC");

    @Override // org.joda.time.p308tz.InterfaceC8154c
    /* JADX INFO: renamed from: a */
    public final DateTimeZone mo16176a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.f43949a;
        }
        return null;
    }

    @Override // org.joda.time.p308tz.InterfaceC8154c
    /* JADX INFO: renamed from: b */
    public final Set<String> mo16177b() {
        return f44263a;
    }
}
