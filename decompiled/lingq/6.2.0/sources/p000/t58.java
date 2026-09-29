package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class t58 {

    /* JADX INFO: renamed from: a */
    public final long[] f61880a;

    /* JADX INFO: renamed from: b */
    public final RemoteViews[] f61881b;

    /* JADX INFO: renamed from: c */
    public final boolean f61882c;

    /* JADX INFO: renamed from: d */
    public final int f61883d;

    public t58(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.f61880a = jArr;
        this.f61881b = remoteViewsArr;
        this.f61882c = false;
        this.f61883d = 1;
        if (jArr.length != remoteViewsArr.length) {
            C3386nv.m17626m("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = u91.m22622n1(u91.m22626r1(arrayList)).size();
        if (size <= 1) {
            return;
        }
        C3386nv.m17624j(ux5.m22989l("View type count is set to 1, but the collection contains ", size, " different layout ids"));
        throw null;
    }

    public t58(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.f61880a = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        creator.getClass();
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, creator);
        for (int i2 = 0; i2 < i; i2++) {
            if (remoteViewsArr[i2] == null) {
                ij6.m13964v(remoteViewsArr, "null element found in ");
                throw null;
            }
        }
        this.f61881b = remoteViewsArr;
        this.f61882c = parcel.readInt() == 1;
        this.f61883d = parcel.readInt();
    }
}
