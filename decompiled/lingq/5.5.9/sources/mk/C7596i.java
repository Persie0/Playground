package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.CourseGiveRoseWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C7596i implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41862a;

    public C7596i(C7633z0.a aVar) {
        this.f41862a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new CourseGiveRoseWorker(context, workerParameters, this.f41862a.f42036a.f41934O.get());
    }
}
