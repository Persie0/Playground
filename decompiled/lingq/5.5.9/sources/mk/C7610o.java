package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LanguageFeedLevelUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C7610o implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41874a;

    public C7610o(C7633z0.a aVar) {
        this.f41874a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new LanguageFeedLevelUpdateWorker(context, workerParameters, this.f41874a.f42036a.f41968d0.get());
    }
}
