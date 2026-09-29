package mk;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import com.lingq.shared.network.workers.LanguageRepetitionLingqsUpdateWorker;
import p354r3.InterfaceC8728b;

/* JADX INFO: renamed from: mk.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C7616r implements InterfaceC8728b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7633z0.a f41880a;

    public C7616r(C7633z0.a aVar) {
        this.f41880a = aVar;
    }

    @Override // p354r3.InterfaceC8728b
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo15081a(Context context, WorkerParameters workerParameters) {
        C7633z0 c7633z0 = this.f41880a.f42036a;
        LanguageRepetitionLingqsUpdateWorker languageRepetitionLingqsUpdateWorker = new LanguageRepetitionLingqsUpdateWorker(context, workerParameters);
        languageRepetitionLingqsUpdateWorker.f19238h = c7633z0.f41968d0.get();
        return languageRepetitionLingqsUpdateWorker;
    }
}
