package p000;

import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.AbstractC1112b;

/* JADX INFO: loaded from: classes.dex */
public final class svc extends AbstractC1112b {

    /* JADX INFO: renamed from: h */
    public Task f61502h;

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: d */
    public final void mo42d() {
        this.f61502h = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC1112b
    /* JADX INFO: renamed from: k */
    public final String mo43k() {
        Task task = this.f61502h;
        return task == null ? "" : task.toString();
    }
}
