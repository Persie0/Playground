package p000;

import android.content.Context;
import android.content.IntentFilter;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqh implements lqj {

    /* JADX INFO: renamed from: a */
    public static volatile mrm f38959a = null;

    /* JADX INFO: renamed from: b */
    public final boolean f38960b;

    /* JADX INFO: renamed from: c */
    public final lra f38961c;

    /* JADX INFO: renamed from: d */
    public final lra f38962d;

    /* JADX INFO: renamed from: e */
    private final Set f38963e;

    public lqh(boolean z, Set set, lra lraVar, lra lraVar2) {
        this.f38960b = z;
        this.f38963e = set;
        this.f38961c = lraVar;
        this.f38962d = lraVar2;
    }

    /* JADX INFO: renamed from: a */
    public final lql m15852a(lpj lpjVar, String str) {
        lhz lhzVar = lql.f38969i;
        lqk lqkVar = new lqk(lpjVar, str, this.f38960b, 0);
        mrn mrnVarM16830a = mrn.m16830a(str, "");
        Object objMo6051a = (lql) ((mvn) lhzVar.f38277a).get(mrnVarM16830a);
        if (objMo6051a == null) {
            objMo6051a = lqkVar.mo6051a();
            lql lqlVar = (lql) ((lpw) lhzVar.f38277a).putIfAbsent(mrnVarM16830a, objMo6051a);
            if (lqlVar == null) {
                Context context = lpjVar.f38894c;
                lql lqlVar2 = (lql) objMo6051a;
                lqu.f39015c.putIfAbsent(mrnVarM16830a, new AmbientMode.AmbientController(lqlVar2));
                if (!lqu.f39014b) {
                    synchronized (lqu.f39013a) {
                        if (!lqu.f39014b) {
                            context.registerReceiver(new lqu(), new IntentFilter(CswIK.yeFOEJop), 2);
                            lqu.f39014b = true;
                        }
                    }
                }
                lqp.f38996a.putIfAbsent(mrnVarM16830a, new lpm(lqlVar2, 3));
            } else {
                objMo6051a = lqlVar;
            }
        }
        lql lqlVar3 = (lql) objMo6051a;
        boolean z = lqlVar3.f38974e;
        lku.m15607B(true, "Package %s cannot be registered both with and without stickyAccountSupport", str);
        return lqlVar3;
    }
}
