package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.CourseReportWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C7599j implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41864a;

    public C7599j(C7633z0.a aVar) {
        this.f41864a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new CourseReportWorker(context, workerParameters, this.f41864a.f42036a.f41942S.get());
    }
}
