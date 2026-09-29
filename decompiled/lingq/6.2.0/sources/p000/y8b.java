package p000;

import androidx.work.Worker;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y8b implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69486a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Worker f69487b;

    public /* synthetic */ y8b(Worker worker, int i) {
        this.f69486a = i;
        this.f69487b = worker;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f69486a;
        Worker worker = this.f69487b;
        switch (i) {
            case 0:
                return worker.mo2901d();
            default:
                return worker.mo2902e();
        }
    }
}
