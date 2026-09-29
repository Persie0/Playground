package p000;

import android.content.Context;
import android.os.Build;
import androidx.glance.appwidget.AsyncRequestWorker;
import androidx.glance.appwidget.protobuf.AbstractC0673g;
import androidx.glance.appwidget.protobuf.C0671e;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ped {
    /* JADX INFO: renamed from: a */
    public static boolean m19083a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m19084b(vi3 vi3Var, Context context) {
        if (!ec3.f36994a.get() && (!fa4.m11650l(Build.MANUFACTURER, "vivo") || Build.VERSION.SDK_INT >= 35)) {
            return false;
        }
        br4 br4VarM18311E = or4.m18311E();
        vi3Var.invoke(br4VarM18311E);
        or4 or4Var = (or4) br4VarM18311E.m23359a();
        context.getClass();
        C0773b c0773bM2910c = C0773b.m2910c(context);
        c0773bM2910c.getClass();
        tx6 tx6Var = new tx6(AsyncRequestWorker.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            int iMo2278b = or4Var.mo2278b(null);
            byte[] bArr = new byte[iMo2278b];
            Logger logger = AbstractC0673g.f6073b;
            C0671e c0671e = new C0671e(iMo2278b, bArr);
            or4Var.m2388m(c0671e);
            if (c0671e.m2361z() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            String str = r02.f58436a;
            Byte[] bArr2 = new Byte[iMo2278b];
            for (int i = 0; i < iMo2278b; i++) {
                bArr2[i] = Byte.valueOf(bArr[i]);
            }
            linkedHashMap.put("request", bArr2);
            sz1 sz1Var = new sz1(linkedHashMap);
            jad.m14369d(sz1Var);
            c0773bM2910c.m2912a(((tx6) tx6Var.m15008g(sz1Var)).m15004a());
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
            tx6 tx6Var2 = (tx6) new tx6(AsyncRequestWorker.class).m15007f();
            tx6Var2.f46873c.f55781j = new ak1(new gk6(null), NetworkType.NOT_REQUIRED, true, false, false, false, -1L, -1L, u91.m22627s1(new LinkedHashSet()));
            c0773bM2910c.m2913b("updateRequestWorkerKeepEnabled", existingWorkPolicy, (ux6) tx6Var2.m15004a());
            return true;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + or4.class.getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
