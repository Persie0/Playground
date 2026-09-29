package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LanguageProgressUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C7614q implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41878a;

    public C7614q(C7633z0.a aVar) {
        this.f41878a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new LanguageProgressUpdateWorker(context, workerParameters, this.f41878a.f42036a.f42030y.get());
    }
}
