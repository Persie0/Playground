package p000;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class gzb extends wpb implements cvb {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kj3 f41580f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzb(lxb lxbVar, kj3 kj3Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f41580f = kj3Var;
    }

    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo9913b();
        return true;
    }

    @Override // p000.cvb
    /* JADX INFO: renamed from: b */
    public final void mo9913b() {
        this.f41580f.run();
    }
}
