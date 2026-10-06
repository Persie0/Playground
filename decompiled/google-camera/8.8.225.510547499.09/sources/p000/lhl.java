package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhl implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f38274a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f38275b;

    public lhl(oju ojuVar, int i) {
        this.f38275b = i;
        this.f38274a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Looper looper;
        switch (this.f38275b) {
            case 0:
                pas pasVarMo18575a = ojd.f46164a.mo6051a().mo18575a(((dws) this.f38274a).m6830a());
                pasVarMo18575a.getClass();
                return pasVarMo18575a;
            case 1:
                pas pasVarMo18569a = oix.f46135a.mo6051a().mo18569a(((dws) this.f38274a).m6830a());
                pasVarMo18569a.getClass();
                return pasVarMo18569a;
            case 2:
                lkc lkcVarMo18559b = oir.f46122a.mo6051a().mo18559b(((dws) this.f38274a).m6830a());
                lkcVarMo18559b.getClass();
                return lkcVarMo18559b;
            case 3:
                return Boolean.valueOf(oiu.f46128a.mo6051a().mo18567e(((dws) this.f38274a).m6830a()));
            case 4:
                pas pasVarMo18578b = ojg.f46167a.mo6051a().mo18578b(((dws) this.f38274a).m6830a());
                pasVarMo18578b.getClass();
                return pasVarMo18578b;
            case 5:
                pas pasVarMo18581a = ojj.f46172a.mo6051a().mo18581a(((dws) this.f38274a).m6830a());
                pasVarMo18581a.getClass();
                return pasVarMo18581a;
            case 6:
                nxy nxyVar = oif.f46105a.mo6051a().mo18545a(((dws) this.f38274a).m6830a()).f45382a;
                nxyVar.getClass();
                return nxyVar;
            case 7:
                pas pasVarMo18583a = ojm.f46175a.mo6051a().mo18583a(((dws) this.f38274a).m6830a());
                pasVarMo18583a.getClass();
                return pasVarMo18583a;
            case 8:
                pas pasVarMo18585a = ojp.f46178a.mo6051a().mo18585a(((dws) this.f38274a).m6830a());
                pasVarMo18585a.getClass();
                return pasVarMo18585a;
            case 9:
                return new lia((lhz) this.f38274a.get(), null, null);
            case 10:
                return new lhz((lia) this.f38274a.get());
            case 11:
                return new ljd(ohh.m18485a(this.f38274a));
            case 12:
                Context contextM6830a = ((dws) this.f38274a).m6830a();
                PackageManager packageManager = contextM6830a.getPackageManager();
                String packageName = contextM6830a.getPackageName();
                try {
                    return packageManager.getPackageInfo(packageName, 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    ((nbe) ((nbe) ((nbe) ljj.f38391a.m17252c()).mo17283h(e)).mo17276G((char) 4508)).mo17293r("Failed to get PackageInfo for: %s", packageName);
                    return null;
                }
            case 13:
                return new ljk((msn) this.f38274a.get());
            case 14:
                return new NativeCrashHandlerImpl((mrm) ((ohj) this.f38274a).f46012a);
            case 15:
                return mxk.m17136H((ljh) this.f38274a.get());
            case 16:
                mrm mrmVar = (mrm) ((ohj) this.f38274a).f46012a;
                if (mrmVar.mo16813g()) {
                    looper = (Looper) mrmVar.mo16809c();
                } else {
                    HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
                    handlerThread.start();
                    looper = handlerThread.getLooper();
                }
                return new Handler(looper);
            case 17:
                return new lly(this.f38274a);
            case 18:
                mrm mrmVar2 = (mrm) ((ohj) this.f38274a).f46012a;
                mqu mquVar = mqu.f41450a;
                return (lmb) mrmVar2.mo16811e(new lmb(mquVar, mquVar));
            case 19:
                return new lnm((Random) this.f38274a.get());
            default:
                return new lqi(this.f38274a);
        }
    }
}
