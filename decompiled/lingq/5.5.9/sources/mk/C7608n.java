package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LanguageEmailNotificationUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C7608n implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41872a;

    public C7608n(C7633z0.a aVar) {
        this.f41872a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new LanguageEmailNotificationUpdateWorker(context, workerParameters, this.f41872a.f42036a.f41968d0.get());
    }
}
