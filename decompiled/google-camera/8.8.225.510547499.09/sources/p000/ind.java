package p000;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ind extends ine {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f31580a;

    /* JADX INFO: renamed from: b */
    public final Object f31581b;

    public ind(DownloadManager downloadManager, Context context, SharedPreferences sharedPreferences) {
        super(downloadManager, context);
        this.f31581b = new Object();
        this.f31580a = sharedPreferences;
    }

    @Override // p000.ine
    /* JADX INFO: renamed from: a */
    public final Long mo11509a(Uri uri) {
        synchronized (this.f31581b) {
            String string = uri.toString();
            if (!this.f31580a.contains(string)) {
                return null;
            }
            return Long.valueOf(this.f31580a.getLong(string, 0L));
        }
    }
}
