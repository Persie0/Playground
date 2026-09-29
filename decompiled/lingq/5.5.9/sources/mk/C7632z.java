package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LessonDeleteFavoriteWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C7632z implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41896a;

    public C7632z(C7633z0.a aVar) {
        this.f41896a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new LessonDeleteFavoriteWorker(context, workerParameters, this.f41896a.f42036a.f42018u.get());
    }
}
