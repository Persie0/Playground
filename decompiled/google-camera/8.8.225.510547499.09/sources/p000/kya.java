package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kya implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f37704a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37705b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37706c;

    public /* synthetic */ kya(fxs fxsVar, Executor executor, int i) {
        this.f37706c = i;
        this.f37705b = fxsVar;
        this.f37704a = executor;
    }

    public kya(Executor executor, nnz nnzVar, int i) {
        this.f37706c = i;
        this.f37704a = executor;
        this.f37705b = nnzVar;
    }

    public /* synthetic */ kya(kyc kycVar, Executor executor, int i) {
        this.f37706c = i;
        this.f37705b = kycVar;
        this.f37704a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f37706c) {
            case 0:
                this.f37704a.execute(new kds((kyc) this.f37705b, runnable, 16));
                return;
            case 1:
                if (((fxs) this.f37705b).m8939a(new dqr(this.f37704a, runnable, 5)).isCancelled()) {
                    throw new RejectedExecutionException("Queue already closed.");
                }
                return;
            default:
                try {
                    this.f37704a.execute(runnable);
                    return;
                } catch (RejectedExecutionException e) {
                    ((nnz) this.f37705b).mo8566a(e);
                    return;
                }
        }
    }
}
