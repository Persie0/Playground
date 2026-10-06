package p000;

import android.content.Context;
import com.google.android.libraries.performance.primes.federatedlearning.PrimesExampleStoreDataTtlService;
import java.util.Random;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhk {

    /* JADX INFO: renamed from: a */
    private static final ksi f38269a = new ksl();

    /* JADX INFO: renamed from: b */
    private static final Random f38270b = new Random();

    /* JADX INFO: renamed from: c */
    private static final npu f38271c;

    /* JADX INFO: renamed from: d */
    private static final Object f38272d;

    /* JADX INFO: renamed from: e */
    private static ktz f38273e;

    static {
        nax naxVar = new nax((byte[]) null);
        naxVar.m17234c("PrimesBrellaExampleStore-%d");
        f38271c = kxk.m15032y(Executors.newSingleThreadExecutor(nax.m17231d(naxVar)));
        f38272d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static ktz m15348a(Context context) {
        ktz ktzVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (f38272d) {
            if (f38273e == null) {
                ksi ksiVar = f38269a;
                Random random = f38270b;
                npu npuVar = f38271c;
                f38273e = new ktz(applicationContext, new jln(applicationContext, ksiVar, random, npuVar), npuVar, PrimesExampleStoreDataTtlService.class);
            }
            ktzVar = f38273e;
        }
        return ktzVar;
    }
}
