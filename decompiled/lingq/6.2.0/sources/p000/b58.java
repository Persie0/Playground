package p000;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b58 {

    /* JADX INFO: renamed from: e */
    public static final b58 f7970e = new b58(new long[0], new RemoteViews[0], false, 1);

    /* JADX INFO: renamed from: a */
    public final long[] f7971a;

    /* JADX INFO: renamed from: b */
    public final RemoteViews[] f7972b;

    /* JADX INFO: renamed from: c */
    public final boolean f7973c;

    /* JADX INFO: renamed from: d */
    public final int f7974d;

    public b58(long[] jArr, RemoteViews[] remoteViewsArr, boolean z, int i) {
        this.f7971a = jArr;
        this.f7972b = remoteViewsArr;
        this.f7973c = z;
        this.f7974d = i;
        if (jArr.length != remoteViewsArr.length) {
            C3386nv.m17626m("RemoteCollectionItems has different number of ids and views");
            throw null;
        }
        if (i < 1) {
            C3386nv.m17626m("View type count must be >= 1");
            throw null;
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = u91.m22622n1(u91.m22626r1(arrayList)).size();
        if (size <= this.f7974d) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.f7974d + ", but the collection contains " + size + " different layout ids").toString());
    }
}
