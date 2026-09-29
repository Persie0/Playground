package p000;

import android.os.Trace;
import com.google.android.gms.internal.measurement.AbstractC0965i;
import com.google.android.gms.internal.measurement.zzvr;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class qld {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f57920a;

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f57921b;

    /* JADX INFO: renamed from: c */
    public static final C2932dl f57922c;

    static {
        ImmutableSet.m6307m(new Object[]{"androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl"}, 5);
        f57920a = new AtomicReference(ImmutableSet.m6310s());
        f57921b = new WeakHashMap();
        f57922c = new C2932dl(7);
        new ArrayDeque();
        new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public static gmd m20020a() {
        fmd fmdVarM20022c = m20022c();
        gmd gmdVar = fmdVarM20022c.f39318b;
        if (gmdVar != null && gmdVar != yld.f70046g) {
            return gmdVar;
        }
        zzvr zzvrVar = wld.f67030g;
        UUID uuidM20712b = rld.f59517c.m20712b();
        String strM5415a = AbstractC0965i.m5415a(uuidM20712b);
        ImmutableSet immutableSet = (ImmutableSet) f57920a.get();
        if (!immutableSet.isEmpty()) {
            immutableSet.forEach(new vld(0));
        }
        return new wld(uuidM20712b, strM5415a, wld.f67030g, fmdVarM20022c);
    }

    /* JADX INFO: renamed from: b */
    public static gmd m20021b(fmd fmdVar, gmd gmdVar) {
        fmdVar.getClass();
        gmd gmdVar2 = fmdVar.f39318b;
        if (gmdVar2 != gmdVar) {
            if (gmdVar2 == null) {
                fmdVar.f39317a = Trace.isEnabled();
            }
            if (fmdVar.f39317a) {
                zed.m25588g(gmdVar2, gmdVar);
            }
            if (gmdVar2 != gmdVar) {
                fmdVar.f39318b = gmdVar;
                return gmdVar2;
            }
        }
        return gmdVar;
    }

    /* JADX INFO: renamed from: c */
    public static fmd m20022c() {
        return (fmd) f57922c.get();
    }
}
