package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axp {

    /* JADX INFO: renamed from: a */
    public final Executor f2670a = m2088a(false);

    /* JADX INFO: renamed from: b */
    public final Executor f2671b = m2088a(true);

    /* JADX INFO: renamed from: c */
    public final ayl f2672c;

    /* JADX INFO: renamed from: d */
    public final int f2673d;

    /* JADX INFO: renamed from: e */
    public final int f2674e;

    /* JADX INFO: renamed from: f */
    public final bkn f2675f;

    public axp(nax naxVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        Object obj = naxVar.f41919a;
        if (obj == null) {
            this.f2672c = new ayk();
        } else {
            this.f2672c = (ayl) obj;
        }
        this.f2675f = new bkn((char[]) null);
        this.f2673d = Integer.MAX_VALUE;
        this.f2674e = 20;
    }

    /* JADX INFO: renamed from: a */
    private static final Executor m2088a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new axn(z));
    }
}
