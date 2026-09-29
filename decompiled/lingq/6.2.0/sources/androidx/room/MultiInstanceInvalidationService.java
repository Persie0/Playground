package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import p000.u46;
import p000.v46;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a */
    public int f6723a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f6724b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final v46 f6725c = new v46(this);

    /* JADX INFO: renamed from: d */
    public final u46 f6726d = new u46(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.f6726d;
    }
}
