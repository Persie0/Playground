package p000;

import android.database.sqlite.SQLiteException;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aza implements Runnable {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f2742a;

    /* JADX INFO: renamed from: b */
    private final Object f2743b;

    /* JADX INFO: renamed from: c */
    private final Object f2744c;

    /* JADX INFO: renamed from: d */
    private final Object f2745d;

    public aza(Handler handler, Callable callable, aea aeaVar, int i) {
        this.f2742a = i;
        this.f2745d = callable;
        this.f2744c = aeaVar;
        this.f2743b = handler;
    }

    public aza(ayo ayoVar, bcj bcjVar, nps npsVar, int i) {
        this.f2742a = i;
        this.f2743b = ayoVar;
        this.f2744c = bcjVar;
        this.f2745d = npsVar;
    }

    public aza(azp azpVar, bkn bknVar, C0159ek c0159ek, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f2742a = i;
        this.f2745d = azpVar;
        this.f2744c = bknVar;
        this.f2743b = c0159ek;
    }

    public aza(kbo kboVar, Runnable runnable, int i) {
        this.f2742a = i;
        this.f2743b = kboVar;
        this.f2744c = false;
        this.f2745d = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ayo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aea, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        kym kymVarCall;
        switch (this.f2742a) {
            case 0:
                try {
                    zBooleanValue = ((Boolean) this.f2745d.get()).booleanValue();
                } catch (InterruptedException | ExecutionException e) {
                    zBooleanValue = true;
                }
                this.f2743b.mo1714a((bcj) this.f2744c, zBooleanValue);
                break;
            case 1:
                try {
                    kymVarCall = ((adu) this.f2745d).call();
                } catch (Exception e2) {
                    kymVarCall = null;
                }
                ?? r1 = this.f2744c;
                ((Handler) this.f2743b).post(new RunnableC0058bd((aea) r1, kymVarCall, 11));
                break;
            case 2:
                ((azp) this.f2745d).f2784f.m2116g((bkn) this.f2744c);
                break;
            default:
                try {
                    this.f2745d.run();
                } catch (SQLiteException e3) {
                    this.f2743b.mo13943e(kfv.m14168E("SQLite error while recording fatal error", new Object[0]), e3);
                    ((Boolean) this.f2744c).booleanValue();
                    return;
                }
                break;
        }
    }
}
