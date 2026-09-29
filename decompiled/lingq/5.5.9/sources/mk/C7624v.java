package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LessonAddFavoriteWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C7624v implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41888a;

    public C7624v(C7633z0.a aVar) {
        this.f41888a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new LessonAddFavoriteWorker(context, workerParameters, this.f41888a.f42036a.f42018u.get());
    }
}
