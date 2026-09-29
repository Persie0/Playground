package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.DictionaryAddWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C7602k implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41866a;

    public C7602k(C7633z0.a aVar) {
        this.f41866a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new DictionaryAddWorker(context, workerParameters, this.f41866a.f42036a.f41952X.get());
    }
}
