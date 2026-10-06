package p000;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bah {

    /* JADX INFO: renamed from: a */
    public final ComponentName f2867a;

    static {
        ayc.m2100b("SystemJobInfoConverter");
    }

    public bah(Context context) {
        this.f2867a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
