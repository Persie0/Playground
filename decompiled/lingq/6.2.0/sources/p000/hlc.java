package p000;

import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzr;

/* JADX INFO: loaded from: classes2.dex */
public final class hlc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f42591b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eoc f42592c;

    public /* synthetic */ hlc(eoc eocVar, zzr zzrVar, int i) {
        this.f42590a = i;
        this.f42591b = zzrVar;
        this.f42592c = eocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f42590a;
        zzr zzrVar = this.f42591b;
        eoc eocVar = this.f42592c;
        switch (i) {
            case 0:
                eocVar.f37647f.m5902V();
                C1045d c1045d = eocVar.f37647f;
                c1045d.mo5913d().mo12359D();
                c1045d.m5930l0();
                lda.m16127m(zzrVar.f12432a);
                c1045d.m5912c0(zzrVar);
                break;
            case 1:
                eocVar.f37647f.m5902V();
                C1045d c1045d2 = eocVar.f37647f;
                c1045d2.mo5913d().mo12359D();
                c1045d2.m5930l0();
                lda.m16127m(zzrVar.f12432a);
                c1045d2.m5932m0(zzrVar);
                c1045d2.m5934n0(zzrVar);
                break;
            default:
                C1045d c1045d3 = eocVar.f37647f;
                c1045d3.m5902V();
                c1045d3.m5932m0(zzrVar);
                break;
        }
    }
}
