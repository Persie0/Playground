package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.PlaylistDeleteWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.m0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7607m0 implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41871a;

    public C7607m0(C7633z0.a aVar) {
        this.f41871a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        return new PlaylistDeleteWorker(context, workerParameters, this.f41871a.f42036a.f42018u.get());
    }
}
