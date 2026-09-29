package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class gdb extends BasePendingResult {

    /* JADX INFO: renamed from: k */
    public final Status f40599k;

    public gdb(Status status) {
        super(null);
        this.f40599k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: b */
    public final q88 mo4601b(Status status) {
        return this.f40599k;
    }
}
