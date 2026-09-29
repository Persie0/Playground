package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class feb extends qcb {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ wr9 f38967g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feb(geb gebVar, wr9 wr9Var) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", 0);
        this.f38967g = wr9Var;
    }

    @Override // p000.qcb
    /* JADX INFO: renamed from: F */
    public final boolean mo11078F(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) zcb.m25554a(parcel, Status.CREATOR);
        zcb.m25556c(parcel);
        h6d.m13105d(status, null, this.f38967g);
        return true;
    }
}
