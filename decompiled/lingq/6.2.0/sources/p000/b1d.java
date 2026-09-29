package p000;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzoq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class b1d extends wpb implements oac {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f7775f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ v4d f7776g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1d(v4d v4dVar, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f7775f = atomicReference;
        this.f7776g = v4dVar;
    }

    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        zzoq zzoqVar = (zzoq) bqb.m4105b(parcel, zzoq.CREATOR);
        bqb.m4109f(parcel);
        mo3174w(zzoqVar);
        return true;
    }

    @Override // p000.oac
    /* JADX INFO: renamed from: w */
    public final void mo3174w(zzoq zzoqVar) {
        AtomicReference atomicReference = this.f7775f;
        synchronized (atomicReference) {
            xcc xccVar = ((kjc) this.f7776g.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17924b(Integer.valueOf(zzoqVar.f12405a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
