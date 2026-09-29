package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.CardReviewWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.u0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7623u0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41887a;

    public C7623u0(C7633z0.a aVar) {
        this.f41887a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new CardReviewWorker(context, workerParameters, this.f41887a.f42036a.f41906D.get());
    }
}
