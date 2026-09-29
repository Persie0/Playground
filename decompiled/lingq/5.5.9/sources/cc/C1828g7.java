package cc;

import com.google.android.gms.internal.measurement.C2600b3;
import com.google.android.gms.internal.measurement.C2740l3;
import java.util.ArrayList;

/* JADX INFO: renamed from: cc.g7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1828g7 {

    /* JADX INFO: renamed from: a */
    public C2740l3 f9819a;

    /* JADX INFO: renamed from: b */
    public ArrayList f9820b;

    /* JADX INFO: renamed from: c */
    public ArrayList f9821c;

    /* JADX INFO: renamed from: d */
    public long f9822d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1846i7 f9823e;

    public /* synthetic */ C1828g7(C1846i7 c1846i7) {
        this.f9823e = c1846i7;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5611a(long j10, C2600b3 c2600b3) {
        if (this.f9821c == null) {
            this.f9821c = new ArrayList();
        }
        if (this.f9820b == null) {
            this.f9820b = new ArrayList();
        }
        if (!this.f9821c.isEmpty() && ((((C2600b3) this.f9821c.get(0)).m7683w() / 1000) / 60) / 60 != ((c2600b3.m7683w() / 1000) / 60) / 60) {
            return false;
        }
        long jMo7920b = this.f9822d + ((long) c2600b3.mo7920b());
        C1846i7 c1846i7 = this.f9823e;
        c1846i7.m5640J();
        if (jMo7920b >= Math.max(0, ((Integer) C1985y2.f10359k.m5912a(null)).intValue())) {
            return false;
        }
        this.f9822d = jMo7920b;
        this.f9821c.add(c2600b3);
        this.f9820b.add(Long.valueOf(j10));
        int size = this.f9821c.size();
        c1846i7.m5640J();
        return size < Math.max(1, ((Integer) C1985y2.f10361l.m5912a(null)).intValue());
    }
}
