package p000;

import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfb implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f5493a;

    public cfb(int i) {
        this.f5493a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final jve m3589a() {
        final nqf nqfVarM17621g = nqf.m17621g();
        jvd.f34878b.execute(new Runnable() { // from class: cju
            @Override // java.lang.Runnable
            public final void run() {
                final nqf nqfVar = nqfVarM17621g;
                Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: cjv
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        nqfVar.mo14894e(ckb.f5959b);
                    }
                });
            }
        });
        return new cjt(new cke(jvd.f34877a, nqfVarM17621g), true != dvb.m6761a().m6199a(dja.DOGFOOD) ? 128 : 512);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5493a) {
            case 0:
                return nqf.m17621g();
            case 1:
                return new bzq((int[]) null);
            case 2:
                return new bzq((float[]) null);
            case 3:
                return new jwf(true);
            case 4:
                return new cgx();
            case 5:
                return nqf.m17621g();
            case 6:
                return new chx();
            case 7:
                return new cie();
            case 8:
                return ffn.f21703b;
            case 9:
                jvm jvmVarM13583a = jvn.m13583a();
                jvmVarM13583a.f34893a = VCYBIzY.AwDzq;
                jvmVarM13583a.m13581b(-1);
                jvmVarM13583a.m13582c(1);
                return cjq.m3827a(jzn.m13826n(jvmVarM13583a.m13580a()));
            case 10:
                ScheduledExecutorService scheduledExecutorService = cje.f5921a;
                scheduledExecutorService.getClass();
                return scheduledExecutorService;
            case 11:
                return new jvh();
            case 12:
                ScheduledExecutorService scheduledExecutorService2 = cje.f5922b;
                scheduledExecutorService2.getClass();
                return scheduledExecutorService2;
            case 13:
                return cje.m3821b();
            case 14:
                return cjq.m3827a(jzn.m13828p("00UiWorker"));
            case 15:
                return new HandlerThread("HelperThread");
            case 16:
                return jvh.m13557e(Looper.getMainLooper());
            case 17:
                throw null;
            case 18:
                return new jvd(m3589a());
            case 19:
                return nqf.m17621g();
            default:
                return nqf.m17621g();
        }
    }
}
