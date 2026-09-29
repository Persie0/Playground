package p000;

import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class cld extends mcb implements imd {
    @Override // p000.imd
    /* JADX INFO: renamed from: b */
    public final int mo4846b() {
        Parcel parcelM16771H = m16771H(m16773J(), 2);
        int i = parcelM16771H.readInt();
        parcelM16771H.recycle();
        return i;
    }

    @Override // p000.imd
    /* JADX INFO: renamed from: e */
    public final by3 mo4847e() {
        Parcel parcelM16771H = m16771H(m16773J(), 1);
        by3 by3VarM16421H = lp6.m16421H(parcelM16771H.readStrongBinder());
        parcelM16771H.recycle();
        return by3VarM16421H;
    }
}
