package p000;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface jft {
    /* JADX INFO: renamed from: a */
    Activity mo13117a();

    /* JADX INFO: renamed from: b */
    void mo13118b(LifecycleCallback lifecycleCallback);

    /* JADX INFO: renamed from: c */
    LifecycleCallback mo13119c(Class cls);

    void startActivityForResult(Intent intent, int i);
}
