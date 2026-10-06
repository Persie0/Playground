package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jcn extends cbr implements IInterface {
    public jcn() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* JADX INFO: renamed from: b */
    public void mo12890b(Status status) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public void mo12891c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo12891c(status);
                return true;
            case 2:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo12890b(status2);
                return true;
            default:
                return false;
        }
    }
}
