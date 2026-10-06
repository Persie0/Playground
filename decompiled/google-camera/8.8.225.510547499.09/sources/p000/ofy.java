package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ofy implements Parcelable {

    /* JADX INFO: renamed from: a */
    public byte[] f45896a;

    public ofy() {
        this.f45896a = null;
    }

    protected ofy(Parcel parcel) {
        this.f45896a = null;
        this.f45896a = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof ofy) && Arrays.equals(((ofy) obj).f45896a, this.f45896a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45896a);
    }

    public final String toString() {
        byte[] bArr = this.f45896a;
        return "ParcelableProtoLite[" + (bArr == null ? 0 : bArr.length) + " bytes]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f45896a);
    }

    /* JADX INFO: renamed from: a */
    public final void m18471a(nyw nywVar) {
        int iM18135M;
        if (nywVar != null) {
            nxq nxqVar = (nxq) nywVar;
            if (nxqVar.m18142ac()) {
                iM18135M = nxqVar.m18135M(null);
                if (iM18135M < 0) {
                    throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M);
                }
            } else {
                int i = nxqVar.f44980aI & Integer.MAX_VALUE;
                if (i != Integer.MAX_VALUE) {
                    iM18135M = i;
                } else {
                    int iM18135M2 = nxqVar.m18135M(null);
                    if (iM18135M2 < 0) {
                        throw new IllegalStateException("serialized size must be non-negative, was " + iM18135M2);
                    }
                    nxqVar.f44980aI = (nxqVar.f44980aI & Integer.MIN_VALUE) | iM18135M2;
                    iM18135M = iM18135M2;
                }
            }
            if (iM18135M != 0) {
                this.f45896a = nywVar.mo17760J();
                return;
            }
        }
        this.f45896a = null;
    }
}
