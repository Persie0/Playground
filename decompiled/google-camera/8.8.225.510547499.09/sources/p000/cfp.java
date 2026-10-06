package p000;

import android.hardware.camera2.CaptureRequest;
import android.os.HandlerThread;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cfp implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f5511a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f5512b;

    public cfp(oju ojuVar, int i) {
        this.f5512b = i;
        this.f5511a = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public static cfp m3605a(oju ojuVar) {
        return new cfp(ojuVar, 1);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f5512b) {
            case 0:
                return new cfo((nps) this.f5511a.get());
            case 1:
                jwn jwnVarM8932f = fxo.m8932f(CaptureRequest.CONTROL_AF_MODE, jwr.m13640j((jwf) this.f5511a.get(), new cev(1)));
                jwnVarM8932f.getClass();
                return jwnVarM8932f;
            case 2:
                return new cge(((cgf) this.f5511a).get());
            case 3:
                dhv dhvVar = (dhv) this.f5511a.get();
                if (ivv.f32396e != null) {
                    return fxo.m8928b(ivv.f32396e, ByteBuffer.allocate(12).order(ByteOrder.nativeOrder()).putInt(true != dhvVar.mo6184l(dib.f11318bY) ? 0 : 2).array());
                }
                return fxo.m8931e();
            case 4:
                return new cgk(((dws) this.f5511a).m6830a());
            case 5:
                return new cgo((bko) this.f5511a.get(), null, null, null);
            case 6:
                return new chf(((dws) this.f5511a).m6830a());
            case 7:
                return new fmi((View) ((djm) this.f5511a.get()).f11787a);
            case 8:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f5511a.get();
                ScheduledExecutorService scheduledExecutorService2 = cje.f5921a;
                return new jvi(scheduledExecutorService);
            case 9:
                npv npvVarM14955A = kxk.m14955A((ScheduledExecutorService) this.f5511a.get());
                npvVarM14955A.getClass();
                return npvVarM14955A;
            case 10:
                ExecutorService executorServiceM3824a = ((cjj) this.f5511a).m3824a();
                ScheduledExecutorService scheduledExecutorService3 = cje.f5921a;
                return new jvi(executorServiceM3824a);
            case 11:
                ExecutorService executorServiceM3824a2 = ((cjj) this.f5511a).m3824a();
                ScheduledExecutorService scheduledExecutorService4 = cje.f5921a;
                return executorServiceM3824a2;
            case 12:
                return new jvf(jvh.m13555c((jvd) this.f5511a.get()));
            case 13:
                return kxk.m14956B((Executor) this.f5511a.get());
            case 14:
                npv npvVarM14955A2 = kxk.m14955A((ScheduledExecutorService) this.f5511a.get());
                npvVarM14955A2.getClass();
                return npvVarM14955A2;
            case 15:
                return new imy((HandlerThread) this.f5511a.get());
            case 16:
                return new jwe((kbz) this.f5511a.get());
            case 17:
                return ((cka) this.f5511a.get()).f5956c;
            case 18:
                final nqf nqfVar = ((cka) this.f5511a.get()).f5955b;
                return new Consumer() { // from class: cki
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        nqfVar.mo14894e((ckb) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                };
            case 19:
                return new jvd(new cke(jvd.f34877a, (nps) this.f5511a.get()));
            default:
                return ((cka) this.f5511a.get()).f5954a;
        }
    }
}
