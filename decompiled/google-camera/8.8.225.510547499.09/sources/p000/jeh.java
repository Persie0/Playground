package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jeh extends BasePendingResult {

    /* JADX INFO: renamed from: a */
    private final jel f33833a;

    public jeh(jel jelVar) {
        super(null);
        this.f33833a = jelVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final jel mo4647a(Status status) {
        return this.f33833a;
    }
}
