package p173i8;

import com.facebook.internal.instrument.InstrumentData;
import dm.C5207g;
import dm.C5212l;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p291o7.C7993c0;
import p291o7.C8004n;

/* JADX INFO: renamed from: i8.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6205a {

    /* JADX INFO: renamed from: a */
    public static final Set<Object> f36096a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public static boolean f36097b;

    /* JADX INFO: renamed from: a */
    public static final void m12741a(Object obj, Throwable th2) {
        C5207g.m11111f(obj, "o");
        if (f36097b) {
            f36096a.add(obj);
            C8004n c8004n = C8004n.f43550a;
            if (C7993c0.m15849b()) {
                C5212l.m11141N(th2);
                InstrumentData.Type type = InstrumentData.Type.CrashShield;
                C5207g.m11111f(type, "t");
                new InstrumentData(th2, type).m6680c();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12742b(Object obj) {
        C5207g.m11111f(obj, "o");
        return f36096a.contains(obj);
    }
}
