package gb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import gb.InterfaceC5740d;

/* JADX INFO: renamed from: gb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5742f<R extends InterfaceC5740d> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: m */
    public final R f34811m;

    public C5742f(Status status) {
        super(null);
        this.f34811m = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: c */
    public final R mo7564c(Status status) {
        return this.f34811m;
    }
}
