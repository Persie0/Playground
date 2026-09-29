package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.CourseDeleteRoseWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.y0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7631y0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41895a;

    public C7631y0(C7633z0.a aVar) {
        this.f41895a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new CourseDeleteRoseWorker(context, workerParameters, this.f41895a.f42036a.f41934O.get());
    }
}
