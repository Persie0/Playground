package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C3386nv;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GmsDocumentScanningResult implements Parcelable {

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Page implements Parcelable {
        /* JADX INFO: renamed from: a */
        public abstract Uri mo6776a();
    }

    public static abstract class Pdf implements Parcelable {
        /* JADX INFO: renamed from: a */
        public abstract int mo6777a();
    }

    /* JADX INFO: renamed from: c */
    public static GmsDocumentScanningResult m6773c(ArrayList arrayList, ArrayList arrayList2, Uri uri, int i) {
        ArrayList arrayList3 = new ArrayList();
        if (arrayList2 != null) {
            if (!(arrayList2.size() == arrayList.size())) {
                C3386nv.m17626m("Error: imageHashes and imageUris size mismatch.");
                return null;
            }
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                arrayList3.add(new zzg((Uri) arrayList.get(i2), (String) arrayList2.get(i2)));
            }
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(new zzg((Uri) it.next(), null));
            }
        }
        return new zze(arrayList3, uri != null ? new zzi(uri, i) : null);
    }

    /* JADX INFO: renamed from: a */
    public abstract List mo6774a();

    /* JADX INFO: renamed from: b */
    public abstract Pdf mo6775b();
}
