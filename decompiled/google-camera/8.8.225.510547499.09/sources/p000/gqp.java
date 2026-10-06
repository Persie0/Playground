package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.processing.ProcessingService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqp extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ProcessingService f26079a;

    public gqp(ProcessingService processingService) {
        this.f26079a = processingService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.apps.camera.legacy.app.processing.PAUSE".equals(intent.getAction())) {
            ProcessingService processingService = this.f26079a;
            synchronized (processingService.f6863f) {
                processingService.f6864g = false;
            }
            synchronized (processingService.f6859b) {
                processingService.f6862e = true;
                gqs gqsVar = processingService.f6861d;
                if (gqsVar != null) {
                    gqsVar.mo7369g();
                }
            }
            return;
        }
        if ("com.google.android.apps.camera.legacy.app.processing.RESUME".equals(intent.getAction())) {
            ProcessingService processingService2 = this.f26079a;
            synchronized (processingService2.f6863f) {
                processingService2.f6864g = true;
            }
            synchronized (processingService2.f6859b) {
                processingService2.f6862e = false;
                gqs gqsVar2 = processingService2.f6861d;
                if (gqsVar2 != null) {
                    gqsVar2.mo7368f();
                }
            }
        }
    }
}
