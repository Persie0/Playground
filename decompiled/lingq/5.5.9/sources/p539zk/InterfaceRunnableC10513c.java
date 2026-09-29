package p539zk;

import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import java.util.List;
import p033bl.C1610a;

/* JADX INFO: renamed from: zk.c */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceRunnableC10513c extends Runnable {

    /* JADX INFO: renamed from: zk.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5258a(DownloadInfo downloadInfo);

        /* JADX INFO: renamed from: b */
        void mo5259b(DownloadInfo downloadInfo, DownloadBlockInfo downloadBlockInfo, int i10);

        /* JADX INFO: renamed from: c */
        void mo5260c(DownloadInfo downloadInfo, Error error, Exception exc);

        /* JADX INFO: renamed from: d */
        void mo5261d(DownloadInfo downloadInfo, long j10, long j11);

        /* JADX INFO: renamed from: e */
        DownloadInfo mo5262e();

        /* JADX INFO: renamed from: f */
        void mo5263f(DownloadInfo downloadInfo, List list, int i10);

        /* JADX INFO: renamed from: g */
        void mo5264g(DownloadInfo downloadInfo);
    }

    /* JADX INFO: renamed from: H */
    void mo10631H();

    /* JADX INFO: renamed from: X0 */
    void mo10632X0();

    /* JADX INFO: renamed from: d1 */
    DownloadInfo mo10636d1();

    /* JADX INFO: renamed from: s0 */
    boolean mo10643s0();

    /* JADX INFO: renamed from: y1 */
    void mo10644y1(C1610a c1610a);
}
