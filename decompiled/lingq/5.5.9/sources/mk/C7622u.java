package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LanguageTopicsUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C7622u implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41886a;

    public C7622u(C7633z0.a aVar) {
        this.f41886a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0 c7633z0 = this.f41886a.f42036a;
        LanguageTopicsUpdateWorker languageTopicsUpdateWorker = new LanguageTopicsUpdateWorker(context, workerParameters);
        languageTopicsUpdateWorker.f19246h = c7633z0.f41968d0.get();
        return languageTopicsUpdateWorker;
    }
}
