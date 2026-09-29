package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.DictionaryDeleteWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7604l implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41868a;

    public C7604l(C7633z0.a aVar) {
        this.f41868a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new DictionaryDeleteWorker(context, workerParameters, this.f41868a.f42036a.f41952X.get());
    }
}
