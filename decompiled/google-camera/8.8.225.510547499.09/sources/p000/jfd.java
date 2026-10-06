package p000;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfd {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BasePendingResult f33862a;

    public jfd(BasePendingResult basePendingResult) {
        this.f33862a = basePendingResult;
    }

    protected final void finalize() throws Throwable {
        BasePendingResult basePendingResult = this.f33862a;
        ThreadLocal threadLocal = BasePendingResult.f7611c;
        BasePendingResult.m4646h(basePendingResult.f7614d);
        super.finalize();
    }
}
