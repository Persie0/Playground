package p000;

import com.facebook.internal.instrument.InstrumentData$Type;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class lp1 {

    /* JADX INFO: renamed from: a */
    public static final Set f49971a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public static boolean f49972b;

    /* JADX INFO: renamed from: a */
    public static final void m16420a(Object obj, Throwable th) {
        obj.getClass();
        if (f49972b) {
            f49971a.add(obj);
            sy2 sy2Var = sy2.f61585a;
            if (ema.m11256c()) {
                pk9.m19374l(th);
                egd.m11100b(th, InstrumentData$Type.CrashShield).m20433d();
            }
        }
    }
}
