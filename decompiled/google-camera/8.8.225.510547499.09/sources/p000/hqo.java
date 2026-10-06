package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum hqo {
    AUTO_FPS_30_5X(hqn.SLOW, 30, true, 6.0d, 6.0d, 3.0d, 1.0d, 0.25d),
    MANUAL_FPS_30_1X(hqn.SLOWEST, 30, false, 30.0d, 6.0d, 3.0d, 1.0d, 0.25d),
    MANUAL_FPS_60_2X(hqn.SLOWEST, 60, false, 60.0d, 8.0d, 4.0d, 1.0d, 0.25d);


    /* JADX INFO: renamed from: d */
    public final mwx f29158d;

    /* JADX INFO: renamed from: e */
    public final mws f29159e;

    /* JADX INFO: renamed from: f */
    public final hqn f29160f;

    /* JADX INFO: renamed from: g */
    public final int f29161g;

    /* JADX INFO: renamed from: h */
    public final int f29162h = 30;

    hqo(hqn hqnVar, int i, boolean z, double... dArr) {
        this.f29161g = i;
        if (z) {
            this.f29160f = hqn.AUTO;
        } else {
            this.f29160f = hqn.SLOW;
        }
        int iOrdinal = hqnVar.ordinal();
        HashMap mapM16493A = mkv.m16493A(5);
        ArrayList arrayList = new ArrayList(5);
        for (int i2 = 0; i2 < 5; i2++) {
            if (!z) {
                int i3 = i2 + iOrdinal;
                mapM16493A.put(hqn.values()[i3], Double.valueOf(dArr[i2]));
                arrayList.add(hqn.values()[i3]);
            } else if (i2 == 0) {
                mapM16493A.put(hqn.AUTO, Double.valueOf(dArr[0]));
                arrayList.add(hqn.AUTO);
            } else {
                int i4 = (i2 - 1) + iOrdinal;
                mapM16493A.put(hqn.values()[i4], Double.valueOf(dArr[i2]));
                arrayList.add(hqn.values()[i4]);
            }
        }
        this.f29158d = mwx.m17118m(mapM16493A);
        this.f29159e = mws.m17095j(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final double m10615a(double d) {
        for (hqn hqnVar : hqn.values()) {
            if (this.f29158d.containsKey(hqnVar) && ((Double) this.f29158d.get(hqnVar)).doubleValue() == d) {
                double d2 = this.f29162h;
                Double.isNaN(d2);
                return d2 / d;
            }
        }
        throw new IllegalArgumentException(pIeXJQLZLfgIN.ciNHtcAPtAL + d + " is not valid.");
    }

    /* JADX INFO: renamed from: b */
    public final double m10616b() {
        if (this.f29158d.containsKey(this.f29160f)) {
            return ((Double) this.f29158d.get(this.f29160f)).doubleValue();
        }
        Double d = (Double) this.f29158d.get(hqn.SLOW);
        d.getClass();
        return d.doubleValue();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m10617c(double d) {
        return this.f29158d.containsValue(Double.valueOf(d));
    }
}
