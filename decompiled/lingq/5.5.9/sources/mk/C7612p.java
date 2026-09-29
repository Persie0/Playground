package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LanguageIntensityUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C7612p implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41876a;

    public C7612p(C7633z0.a aVar) {
        this.f41876a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0 c7633z0 = this.f41876a.f42036a;
        LanguageIntensityUpdateWorker languageIntensityUpdateWorker = new LanguageIntensityUpdateWorker(context, workerParameters);
        languageIntensityUpdateWorker.f19230h = c7633z0.f41968d0.get();
        return languageIntensityUpdateWorker;
    }
}
