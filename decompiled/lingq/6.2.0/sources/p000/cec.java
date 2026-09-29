package p000;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class cec extends g90 {

    /* JADX INFO: renamed from: k */
    public final zze f9992k;

    public cec(zze zzeVar, vcb vcbVar) {
        super(m31.f50488j, vcbVar);
        this.f9992k = zzeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q88 mo4601b(Status status) {
        return status;
    }

    @Override // p000.g90
    /* JADX INFO: renamed from: g */
    public final void mo4602g(co3 co3Var) {
        zze zzeVar = this.f9992k;
        gnc gncVar = (gnc) co3Var;
        vic vicVar = new vic(this);
        try {
            zzeVar.getClass();
            mec mecVar = zzeVar.f11632i;
            int iM11603c = mecVar.m11603c();
            byte[] bArr = new byte[iM11603c];
            f8c.m11601b(mecVar, bArr, iM11603c);
            zzeVar.f11625b = bArr;
            l6d l6dVar = (l6d) gncVar.m11611l();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
            int i = yrb.f70354a;
            parcelObtain.writeStrongBinder(vicVar);
            parcelObtain.writeInt(1);
            zzeVar.writeToParcel(parcelObtain, 0);
            try {
                l6dVar.f49228f.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            m12419h(new Status(10, "MessageProducer", null, null));
        }
    }
}
