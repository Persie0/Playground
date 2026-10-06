package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureRequest;
import android.os.HandlerThread;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iro implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f31924a;

    /* JADX INFO: renamed from: b */
    private final oju f31925b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f31926c;

    public iro(oju ojuVar, oju ojuVar2, int i) {
        this.f31926c = i;
        this.f31924a = ojuVar;
        this.f31925b = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, byte[][] bArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, char[][] cArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    public iro(oju ojuVar, oju ojuVar2, int i, short[][] sArr) {
        this.f31926c = i;
        this.f31925b = ojuVar;
        this.f31924a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static iro m11656a(oju ojuVar, oju ojuVar2) {
        return new iro(ojuVar, ojuVar2, 0);
    }

    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, kso] */
    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f31926c) {
            case 0:
                return ((dhv) this.f31925b.get()).mo6184l(diz.f11753a) ? ((etl) this.f31924a).m7866a() : mqu.f41450a;
            case 1:
                return new iri((fcp) this.f31925b.get(), ((kbm) this.f31924a).get());
            case 2:
                return ((dhv) this.f31924a.get()).mo6184l(diz.f11753a) ? ((etl) this.f31925b).m7866a() : mqu.f41450a;
            case 3:
                Context context = ((kal) this.f31924a).get();
                Set set = (Set) ((ohj) this.f31925b).f46012a;
                HashMap map = new HashMap(set.size());
                omn.m18664D(map, set);
                if (map.size() == set.size()) {
                    return new C0957rh(new C0955rf(context, new C0956rg(null), new bkn((byte[]) null, (char[]) null, (byte[]) null), new bkn((Map) map), new C0954re(null), null, null, null, null));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected or mismatched cameraBackends! Received: ");
                sb.append(set);
                throw new IllegalStateException("Unexpected or mismatched cameraBackends! Received: ".concat(set.toString()));
            case 4:
                kpa kpaVar = (kpa) this.f31924a.get();
                oju ojuVar = this.f31925b;
                boolean z = kpaVar.f36761d;
                return ((kck) ojuVar).get();
            case 5:
                return new ktz(((fne) this.f31924a).m8604a(), (mxk) this.f31925b.get());
            case 6:
                return new ihk((Executor) new kcf((Executor) this.f31924a.get(), (kbz) this.f31925b.get(), "FrameEventHandler"));
            case 7:
                jvb jvbVar = (jvb) this.f31925b.get();
                return jvh.m13558f(jvbVar, "CallbackHndlr");
            case 8:
                ((khc) this.f31924a).get();
                kbo kboVar = ((kbm) this.f31925b).get();
                mzx mzxVar = mzx.f41874a;
                mxk mxkVarM17138J = mxk.m17138J(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AE_LOCK, CaptureRequest.CONTROL_AWB_LOCK);
                mzx mzxVar2 = mzx.f41874a;
                return new kqj(mzxVar, mxkVarM17138J, mzxVar2, mzxVar2, kboVar);
            case 9:
                return new ihk((AmbientDelegate) this.f31925b.get(), (khb) this.f31924a.get(), null, null, null, null, null);
            case 10:
                jvb jvbVar2 = (jvb) this.f31924a.get();
                HandlerThread handlerThread = new HandlerThread(NptsKnlVczSZ.kRiq, -4);
                handlerThread.start();
                jvbVar2.m13537d(new jva(handlerThread));
                return jvh.m13557e(handlerThread.getLooper());
            case 11:
                Object obj = (kka) this.f31925b.get();
                mrm mrmVar = (mrm) this.f31924a.get();
                if (mrmVar.mo16813g()) {
                    obj = (kiv) mrmVar.mo16809c();
                }
                obj.getClass();
                return obj;
            case 12:
                return new kko((InterfaceC0951rb) this.f31924a.get(), (Map) this.f31925b.get());
            case 13:
                return new kot(((fne) this.f31924a).m8604a());
            case 14:
                return new kne(((emt) this.f31925b).get(), ((kbm) this.f31924a).get());
            case 15:
                mrm mrmVar2 = (mrm) this.f31924a.get();
                kni kniVar = (kni) (mrmVar2.mo16813g() ? mrmVar2.mo16809c() : this.f31925b.get());
                kniVar.getClass();
                return kniVar;
            case 16:
                kpa kpaVar2 = (kpa) this.f31925b.get();
                oju ojuVar2 = this.f31924a;
                boolean z2 = kpaVar2.f36760c;
                Log.w("MediaFsQModule", "Returning Q MediaFs implementation");
                return ((krh) ojuVar2).get();
            case 17:
                SharedPreferences sharedPreferences = (SharedPreferences) ((msi) ((hfb) this.f31925b).m10179a().mo16811e(new dfg(((dws) this.f31924a).m6830a(), 13))).mo6051a();
                sharedPreferences.getClass();
                return sharedPreferences;
            case 18:
                return new lgl((npv) this.f31924a.get(), (lhz) this.f31925b.get());
            case 19:
                lgy lgyVar = (lgy) this.f31925b.get();
                lhz lhzVar = ((ksn) this.f31924a).get();
                npv npvVarM14955A = lgyVar.f38245a;
                if (npvVarM14955A == null) {
                    int i = lgyVar.f38247c;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i, new lgx(lgyVar.f38246b), new lgw());
                    scheduledThreadPoolExecutor.setMaximumPoolSize(i);
                    npvVarM14955A = kxk.m14955A(scheduledThreadPoolExecutor);
                    ?? r0 = lhzVar.f38277a;
                    if (r0 != 0) {
                        npvVarM14955A = r0.m14819a();
                    }
                }
                npvVarM14955A.getClass();
                return npvVarM14955A;
            default:
                return new lhi(((dws) this.f31924a).m6830a(), (Executor) this.f31925b.get());
        }
    }
}
