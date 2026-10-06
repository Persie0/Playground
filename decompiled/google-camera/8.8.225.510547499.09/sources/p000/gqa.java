package p000;

import android.os.Handler;
import android.os.Message;
import android.os.Trace;
import com.google.android.apps.camera.prewarm.ProcessingBoostService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gqa extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessingBoostService f26056a;

    public gqa(ProcessingBoostService processingBoostService) {
        this.f26056a = processingBoostService;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ProcessingBoostService processingBoostService = this.f26056a;
                if (processingBoostService.f6855b == null) {
                    Trace.beginSection("PBS#ensureInjection");
                    ((gqb) ((emv) processingBoostService.getApplication()).mo4193e(gqb.class)).mo7821p(processingBoostService);
                    Trace.endSection();
                }
                this.f26056a.f6855b.execute(new gpn(this, 7));
                break;
        }
        super.handleMessage(message);
    }
}
