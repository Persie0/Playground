package ga;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p454wa.C9884i;

/* JADX INFO: renamed from: ga.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5725h {

    /* JADX INFO: renamed from: b */
    public static final AtomicLong f34748b = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final Map<String, List<String>> f34749a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5725h(long j10, C9884i c9884i, long j11) {
        this(Collections.emptyMap());
        Uri uri = c9884i.f50436a;
    }

    public C5725h(Map map) {
        this.f34749a = map;
    }
}
