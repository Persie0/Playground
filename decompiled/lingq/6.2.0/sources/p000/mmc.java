package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class mmc implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzr f51539b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bundle f51540c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eoc f51541d;

    public /* synthetic */ mmc(eoc eocVar, zzr zzrVar, Bundle bundle, int i) {
        this.f51538a = i;
        this.f51539b = zzrVar;
        this.f51540c = bundle;
        this.f51541d = eocVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f51538a;
        Bundle bundle = this.f51540c;
        zzr zzrVar = this.f51539b;
        eoc eocVar = this.f51541d;
        switch (i) {
            case 0:
                eocVar.f37647f.m5902V();
                break;
            default:
                eocVar.f37647f.m5902V();
                break;
        }
        return eocVar.f37647f.m5914d0(bundle, zzrVar);
    }
}
