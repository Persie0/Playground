package p070db;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Status;
import gb.InterfaceC5740d;
import p152hb.C6020w0;
import p398tb.C9245d;

/* JADX INFO: renamed from: db.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5129i extends AbstractC5132l {
    public C5129i(C6020w0 c6020w0) {
        super(c6020w0);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC5740d mo7564c(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC2546a
    /* JADX INFO: renamed from: k */
    public final void mo7580k(C2542a.e eVar) throws RemoteException {
        C5127g c5127g = (C5127g) eVar;
        C5138r c5138r = (C5138r) c5127g.m12871C();
        BinderC5128h binderC5128h = new BinderC5128h(this);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c5138r.f47932b);
        int i10 = C9245d.f47934a;
        parcelObtain.writeStrongBinder(binderC5128h);
        GoogleSignInOptions googleSignInOptions = c5127g.f33113b0;
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            c5138r.f47931a.transact(102, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain.recycle();
            parcelObtain2.recycle();
        } catch (Throwable th2) {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            throw th2;
        }
    }
}
