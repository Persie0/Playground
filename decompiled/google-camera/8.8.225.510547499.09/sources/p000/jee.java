package p000;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jee extends jeg {

    /* JADX INFO: renamed from: a */
    private final BasePendingResult f33832a;

    public jee() {
    }

    public jee(jeg jegVar) {
        this.f33832a = (BasePendingResult) jegVar;
    }

    @Override // p000.jeg
    /* JADX INFO: renamed from: k */
    public final void mo4651k(jef jefVar) {
        this.f33832a.mo4651k(jefVar);
    }

    @Override // p000.jeg
    /* JADX INFO: renamed from: l */
    public final jel mo4652l(TimeUnit timeUnit) {
        return this.f33832a.mo4652l(timeUnit);
    }
}
