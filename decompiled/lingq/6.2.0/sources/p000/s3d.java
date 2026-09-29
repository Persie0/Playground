package p000;

import android.content.ComponentName;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.measurement.internal.C1043b;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class s3d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60251a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60252b;

    public /* synthetic */ s3d(Object obj, int i) {
        this.f60251a = i;
        this.f60252b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f60251a;
        int i2 = 0;
        Object obj = this.f60252b;
        switch (i) {
            case 0:
                v4d v4dVar = ((e4d) obj).f36710c;
                v4dVar.m23114O(new ComponentName(((kjc) v4dVar.f60774a).f47433a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 1:
                v4d v4dVar2 = ((e4d) ((gvb) obj).f41409c).f36710c;
                tic ticVar = ((kjc) v4dVar2.f60774a).f47439g;
                kjc.m15280l(ticVar);
                ticVar.m22076M(new y3d(v4dVar2, i2));
                return;
            case 2:
                throw new RuntimeException(((ExecutionException) obj).getCause());
            case 3:
                try {
                    AbstractC1118h.m6398b((ListenableFuture) obj);
                    return;
                } catch (ExecutionException e) {
                    AbstractC3695vr.m23490H().post(new s3d(e, 2));
                    return;
                }
            case 4:
                try {
                    AbstractC1118h.m6398b((j93) obj);
                    return;
                } catch (Exception e2) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 5:
                if (((Boolean) ((pcd) obj).f55965c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 6:
                kjc kjcVar = (kjc) ((C3693vp) obj).f65737b;
                kjc.m15277i(kjcVar.f47422P);
                kjcVar.f47422P.m18840H(((Long) z8c.f71107D.m21901a(null)).longValue());
                return;
            default:
                kjc kjcVar2 = (kjc) obj;
                rad radVar = kjcVar2.f47441i;
                C1043b c1043b = kjcVar2.f47414H;
                kjc.m15278j(radVar);
                radVar.mo12359D();
                if (radVar.m20540Z() != 1) {
                    xcc xccVar = kjcVar2.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17923a("registerTrigger called but app not eligible");
                    return;
                }
                kjc.m15279k(c1043b);
                c1043b.mo12359D();
                tqc tqcVar = c1043b.f12334l;
                if (tqcVar != null) {
                    tqcVar.m25216c();
                }
                kjc.m15279k(c1043b);
                new Thread(new pqc(c1043b, 3)).start();
                return;
        }
    }
}
