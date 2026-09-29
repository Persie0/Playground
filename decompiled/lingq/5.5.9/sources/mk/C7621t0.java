package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import ci.InterfaceC2008a;
import com.lingq.shared.network.workers.CardDeleteWorker;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7832g0;
import p354r3.InterfaceC8728b;
import p385sf.C9000b;

/* JADX INFO: renamed from: mk.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7621t0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41885a;

    public C7621t0(C7633z0.a aVar) {
        this.f41885a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41885a;
        InterfaceC2008a interfaceC2008a = aVar.f42036a.f41906D.get();
        ExecutorC7177a executorC7177a = C7832g0.f42931b;
        C9000b.m17242h(executorC7177a);
        return new CardDeleteWorker(context, workerParameters, interfaceC2008a, executorC7177a, aVar.f42036a.f41982i.get());
    }
}
