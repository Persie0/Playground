package p021j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: renamed from: j$.time.zone.f */
/* JADX INFO: loaded from: classes3.dex */
final class C0496f extends AbstractC0497g {

    /* JADX INFO: renamed from: c */
    private final Set f33106c;

    C0496f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f33106c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // p021j$.time.zone.AbstractC0497g
    /* JADX INFO: renamed from: b */
    protected final C0493c mo12495b(String str) {
        if (this.f33106c.contains(str)) {
            return new C0493c(TimeZone.getTimeZone(str));
        }
        throw new C0494d("Not a built-in time zone: " + str);
    }

    @Override // p021j$.time.zone.AbstractC0497g
    /* JADX INFO: renamed from: c */
    protected final Set mo12496c() {
        return this.f33106c;
    }
}
