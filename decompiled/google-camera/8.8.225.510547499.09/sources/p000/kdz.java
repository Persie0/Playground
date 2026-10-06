package p000;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdz implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f35705a;

    public kdz(int i) {
        this.f35705a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ksa m14010a() {
        return new ksa();
    }

    /* JADX INFO: renamed from: b */
    public static lme m14011b() {
        return new lme();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f35705a) {
            case 0:
                return new kdx();
            case 1:
                HandlerThread handlerThread = new HandlerThread("Camera-Hndlr", -2);
                handlerThread.start();
                return jvh.m13557e(handlerThread.getLooper());
            case 2:
                return new jvb();
            case 3:
                return new khg();
            case 4:
                return new khb((char[]) null, (byte[]) null);
            case 5:
                return new kiw();
            case 6:
                for (int i = 0; i < 3; i++) {
                    SystemClock.elapsedRealtimeNanos();
                    System.currentTimeMillis();
                    SystemClock.elapsedRealtimeNanos();
                }
                long j = 0;
                for (int i2 = 0; i2 < 3; i2++) {
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    if (jElapsedRealtimeNanos2 - jElapsedRealtimeNanos < Long.MAX_VALUE) {
                        j = ((jElapsedRealtimeNanos + jElapsedRealtimeNanos2) / 2) - (jUptimeMillis * 1000000);
                    }
                }
                return new lbn(j);
            case 7:
                return new kol();
            case 8:
                return kpa.m14659a();
            case 9:
                return new lme();
            case 10:
                return kpb.m14660a();
            case 11:
                khb khbVar = kpc.f36794a;
                khbVar.getClass();
                return khbVar;
            case 12:
                ExecutorService executorServiceM13823k = jzn.m13823k("MediaFS-IO", 2);
                executorServiceM13823k.getClass();
                return executorServiceM13823k;
            case 13:
                return jzn.m13827o(yTyWiTtGtnBhy.ykYICIwWXv, 2);
            case 14:
                return m14010a();
            case 15:
                return new ksl();
            case 16:
                throw null;
            case 17:
                return new lha();
            case 18:
                return true;
            case 19:
                return lwo.f39445a;
            default:
                jbd jbdVar = new jbd(GoogleSignInOptions.f7575f);
                jbdVar.f33646a.add(GoogleSignInOptions.f7571b);
                return jbdVar.m12830a();
        }
    }
}
