package p000;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public final class rq2 extends d32 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ d32 f59702h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ThreadPoolExecutor f59703i;

    public rq2(d32 d32Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f59702h = d32Var;
        this.f59703i = threadPoolExecutor;
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: a0 */
    public final void mo10069a0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f59703i;
        try {
            this.f59702h.mo10069a0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: b0 */
    public final void mo10070b0(C3329mb c3329mb) {
        ThreadPoolExecutor threadPoolExecutor = this.f59703i;
        try {
            this.f59702h.mo10070b0(c3329mb);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
