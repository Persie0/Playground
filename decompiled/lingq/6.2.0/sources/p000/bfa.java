package p000;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class bfa implements to7 {

    /* JADX INFO: renamed from: a */
    public static final Set f8482a = Collections.singleton("UTC");

    @Override // p000.to7
    /* JADX INFO: renamed from: a */
    public final DateTimeZone mo3686a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.f54829a;
        }
        return null;
    }

    @Override // p000.to7
    /* JADX INFO: renamed from: b */
    public final Set mo3687b() {
        return f8482a;
    }
}
