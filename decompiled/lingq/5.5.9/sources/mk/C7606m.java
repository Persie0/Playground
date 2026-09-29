package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.DictionaryOrderWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C7606m implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41870a;

    public C7606m(C7633z0.a aVar) {
        this.f41870a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41870a;
        return new DictionaryOrderWorker(context, workerParameters, aVar.f42036a.f41952X.get(), aVar.f42036a.f41982i.get());
    }
}
