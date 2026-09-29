package p033bl;

import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import dm.C5207g;
import java.util.List;
import p099el.C5427b;
import p290o6.C7967l0;
import p463wk.InterfaceC9963f;
import p489xk.C10221i;
import p539zk.InterfaceRunnableC10513c;

/* JADX INFO: renamed from: bl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1610a implements InterfaceRunnableC10513c.a {

    /* JADX INFO: renamed from: a */
    public volatile boolean f9109a;

    /* JADX INFO: renamed from: b */
    public final C7967l0 f9110b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9963f f9111c;

    /* JADX INFO: renamed from: d */
    public final boolean f9112d;

    /* JADX INFO: renamed from: e */
    public final int f9113e;

    public C1610a(C7967l0 c7967l0, ListenerCoordinator.C4972a c4972a, boolean z10, int i10) {
        C5207g.m11112g(c7967l0, "downloadInfoUpdater");
        C5207g.m11112g(c4972a, "fetchListener");
        this.f9110b = c7967l0;
        this.f9111c = c4972a;
        this.f9112d = z10;
        this.f9113e = i10;
    }

    @Override // p539zk.InterfaceRunnableC10513c.a
    /* JADX INFO: renamed from: a */
    public final void mo5258a(DownloadInfo downloadInfo) {
        C5207g.m11112g(downloadInfo, "download");
        if (this.f9109a) {
            return;
        }
        downloadInfo.m10610r(Status.DOWNLOADING);
        C7967l0 c7967l0 = this.f9110b;
        c7967l0.getClass();
        ((C10221i) c7967l0.f43382a).mo10616Y(downloadInfo);
    }

    @Override // p539zk.InterfaceRunnableC10513c.a
    /* JADX INFO: renamed from: b */
    public final void mo5259b(DownloadInfo downloadInfo, DownloadBlockInfo downloadBlockInfo, int i10) {
        C5207g.m11112g(downloadInfo, "download");
        C5207g.m11112g(downloadBlockInfo, "downloadBlock");
        if (!this.f9109a) {
            this.f9111c.mo10657b(downloadInfo, downloadBlockInfo, i10);
        }
    }

    @Override // p539zk.InterfaceRunnableC10513c.a
    /* JADX INFO: renamed from: c */
    public final void mo5260c(DownloadInfo downloadInfo, Error error, Exception exc) {
        C5207g.m11112g(downloadInfo, "download");
        if (!this.f9109a) {
            int i10 = this.f9113e;
            if (i10 == -1) {
                i10 = downloadInfo.f32327N;
            }
            if (this.f9112d && downloadInfo.f32341k == Error.NO_NETWORK_CONNECTION) {
                downloadInfo.m10610r(Status.QUEUED);
                downloadInfo.m10604h(C5427b.f33967d);
                this.f9110b.m15809j(downloadInfo);
                this.f9111c.mo10665r(downloadInfo, true);
                return;
            }
            int i11 = downloadInfo.f32328O;
            if (i11 < i10) {
                downloadInfo.f32328O = i11 + 1;
                downloadInfo.m10610r(Status.QUEUED);
                downloadInfo.m10604h(C5427b.f33967d);
                this.f9110b.m15809j(downloadInfo);
                this.f9111c.mo10665r(downloadInfo, true);
                return;
            }
            downloadInfo.m10610r(Status.FAILED);
            this.f9110b.m15809j(downloadInfo);
            this.f9111c.mo10659g(downloadInfo, error, exc);
        }
    }

    @Override // p539zk.InterfaceRunnableC10513c.a
    /* JADX INFO: renamed from: d */
    public final void mo5261d(DownloadInfo downloadInfo, long j10, long j11) {
        C5207g.m11112g(downloadInfo, "download");
        if (!this.f9109a) {
            this.f9111c.mo10662n(downloadInfo, j10, j11);
        }
    }

    @Override // p539zk.InterfaceRunnableC10513c.a
    /* JADX INFO: renamed from: e */
    public final DownloadInfo mo5262e() {
        return ((C10221i) this.f9110b.f43382a).mo10620e();
    }

    @Override // p539zk.InterfaceRunnableC10513c.a
    /* JADX INFO: renamed from: f */
    public final void mo5263f(DownloadInfo downloadInfo, List list, int i10) {
        C5207g.m11112g(downloadInfo, "download");
        if (!this.f9109a) {
            downloadInfo.m10610r(Status.DOWNLOADING);
            this.f9110b.m15809j(downloadInfo);
            this.f9111c.mo10658e(downloadInfo, list, i10);
        }
    }

    @Override // p539zk.InterfaceRunnableC10513c.a
    /* JADX INFO: renamed from: g */
    public final void mo5264g(DownloadInfo downloadInfo) {
        if (this.f9109a) {
            return;
        }
        downloadInfo.m10610r(Status.COMPLETED);
        this.f9110b.m15809j(downloadInfo);
        this.f9111c.mo10664q(downloadInfo);
    }
}
