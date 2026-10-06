package p000;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jkp extends cbr implements IInterface {
    public jkp() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    /* JADX INFO: renamed from: b */
    public void mo13324b(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                GoogleHelp googleHelp = (GoogleHelp) cbs.m3402a(parcel, GoogleHelp.CREATOR);
                cbs.m3403b(parcel);
                mo13324b(googleHelp);
                parcel2.writeNoException();
                return true;
            case 2:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                throw new UnsupportedOperationException();
            case 8:
                throw new UnsupportedOperationException();
            case 9:
                parcel.readInt();
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 10:
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            case 12:
                throw new UnsupportedOperationException();
            case 13:
                parcel.createByteArray();
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 14:
                throw new UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                cbs.m3403b(parcel);
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
