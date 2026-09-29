package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import bi.AbstractC1388a;
import ci.InterfaceC2008a;
import com.lingq.shared.network.workers.CardUpdateWorker;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7832g0;
import p354r3.InterfaceC8728b;
import p385sf.C9000b;

/* JADX INFO: renamed from: mk.v0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7625v0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41889a;

    public C7625v0(C7633z0.a aVar) {
        this.f41889a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0.a aVar = this.f41889a;
        InterfaceC2008a interfaceC2008a = aVar.f42036a.f41906D.get();
        C7633z0 c7633z0 = aVar.f42036a;
        AbstractC1388a abstractC1388a = c7633z0.f41897A.get();
        ExecutorC7177a executorC7177a = C7832g0.f42931b;
        C9000b.m17242h(executorC7177a);
        return new CardUpdateWorker(context, workerParameters, interfaceC2008a, abstractC1388a, executorC7177a, c7633z0.f41982i.get());
    }
}
