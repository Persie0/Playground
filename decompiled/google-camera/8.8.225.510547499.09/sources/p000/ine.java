package p000;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ine {

    /* JADX INFO: renamed from: c */
    public final DownloadManager f31582c;

    /* JADX INFO: renamed from: d */
    public final Context f31583d;

    public ine(DownloadManager downloadManager, Context context) {
        this.f31582c = downloadManager;
        this.f31583d = context;
    }

    /* JADX INFO: renamed from: a */
    public abstract Long mo11509a(Uri uri);
}
