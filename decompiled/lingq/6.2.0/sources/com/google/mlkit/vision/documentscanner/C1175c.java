package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.mlkit.vision.documentscanner.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1175c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new zzi((Uri) parcel.readParcelable(GmsDocumentScanningResult.Pdf.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
