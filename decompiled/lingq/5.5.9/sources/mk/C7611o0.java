package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.CardCreateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.o0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7611o0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41875a;

    public C7611o0(C7633z0.a aVar) {
        this.f41875a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41875a;
        return new CardCreateWorker(context, workerParameters, aVar.f42036a.f41906D.get(), aVar.f42036a.f41982i.get());
    }
}
