package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g90 extends BasePendingResult {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(b64 b64Var, vcb vcbVar) {
        super(vcbVar);
        lda.m16131q(vcbVar, "GoogleApiClient must not be null");
        lda.m16131q(b64Var, "Api must not be null");
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo4602g(co3 co3Var);

    /* JADX INFO: renamed from: h */
    public final void m12419h(Status status) {
        lda.m16124j("Failed result must not be success", !status.m5282r());
        m5286e(mo4601b(status));
    }
}
