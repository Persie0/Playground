package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jsy extends cbr implements jsz {
    public jsy() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    /* JADX INFO: renamed from: b */
    public void mo13495b(jsg jsgVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public void mo13496c(jsq jsqVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public void mo13497d(jtx jtxVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public void mo13498e(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                jtx jtxVar = (jtx) cbs.m3402a(parcel, jtx.CREATOR);
                cbs.m3403b(parcel);
                mo13497d(jtxVar);
                break;
            case 8:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 9:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 10:
                jsq jsqVar = (jsq) cbs.m3402a(parcel, jsq.CREATOR);
                cbs.m3403b(parcel);
                mo13496c(jsqVar);
                break;
            case 11:
                Status status = (Status) cbs.m3402a(parcel, Status.CREATOR);
                cbs.m3403b(parcel);
                mo13498e(status);
                break;
            case 12:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 13:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 14:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 15:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 16:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 17:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 18:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 19:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 20:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                jsg jsgVar = (jsg) cbs.m3402a(parcel, jsg.CREATOR);
                cbs.m3403b(parcel);
                mo13495b(jsgVar);
                break;
            case 23:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 26:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 27:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 28:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 29:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 30:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 34:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 35:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 36:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 37:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 38:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 39:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 40:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 41:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 42:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 43:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
        }
        parcel2.writeNoException();
        return true;
    }
}
