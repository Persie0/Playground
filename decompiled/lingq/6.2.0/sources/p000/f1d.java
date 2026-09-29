package p000;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class f1d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38281a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f38282b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f38283c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ v4d f38284d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractSafeParcelable f38285e;

    public /* synthetic */ f1d(v4d v4dVar, zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.f38281a = i;
        this.f38282b = zzrVar;
        this.f38283c = z;
        this.f38285e = abstractSafeParcelable;
        this.f38284d = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f38281a;
        AbstractSafeParcelable abstractSafeParcelable = this.f38285e;
        boolean z = this.f38283c;
        zzr zzrVar = this.f38282b;
        v4d v4dVar = this.f38284d;
        switch (i) {
            case 0:
                q9c q9cVar = v4dVar.f64866d;
                if (q9cVar != null) {
                    v4dVar.m23121V(q9cVar, z ? null : (zzpl) abstractSafeParcelable, zzrVar);
                    v4dVar.m23116Q();
                } else {
                    xcc xccVar = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17923a("Discarding data. Failed to set user property");
                }
                break;
            default:
                q9c q9cVar2 = v4dVar.f64866d;
                if (q9cVar2 != null) {
                    v4dVar.m23121V(q9cVar2, z ? null : (zzbh) abstractSafeParcelable, zzrVar);
                    v4dVar.m23116Q();
                } else {
                    xcc xccVar2 = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17923a("Discarding data. Failed to send event to service");
                }
                break;
        }
    }
}
