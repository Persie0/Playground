package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import ci.InterfaceC2020m;
import com.lingq.shared.network.workers.ProfileUpdateWorker;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7832g0;
import p354r3.InterfaceC8728b;
import p385sf.C9000b;

/* JADX INFO: renamed from: mk.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7615q0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41879a;

    public C7615q0(C7633z0.a aVar) {
        this.f41879a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41879a;
        InterfaceC2020m interfaceC2020m = aVar.f42036a.f41939Q0.get();
        ExecutorC7177a executorC7177a = C7832g0.f42931b;
        C9000b.m17242h(executorC7177a);
        return new ProfileUpdateWorker(context, workerParameters, interfaceC2020m, executorC7177a, aVar.f42036a.f41982i.get());
    }
}
