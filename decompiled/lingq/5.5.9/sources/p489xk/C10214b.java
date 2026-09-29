package p489xk;

import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadDatabase;
import com.tonyodev.fetch2.database.DownloadInfo;
import dm.C5206f;
import dm.C5207g;
import java.util.Map;
import p213k4.AbstractC6583c;
import p288o4.InterfaceC7920f;

/* JADX INFO: renamed from: xk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10214b extends AbstractC6583c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C10218f f51630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10214b(C10218f c10218f, DownloadDatabase downloadDatabase) {
        super(downloadDatabase, 1);
        this.f51630d = c10218f;
    }

    @Override // androidx.room.SharedSQLiteStatement
    /* JADX INFO: renamed from: b */
    public final String mo4575b() {
        return "INSERT OR ABORT INTO `requests` (`_id`,`_namespace`,`_url`,`_file`,`_group`,`_priority`,`_headers`,`_written_bytes`,`_total_bytes`,`_status`,`_error`,`_network_type`,`_created`,`_tag`,`_enqueue_action`,`_identifier`,`_download_on_enqueue`,`_extras`,`_auto_retry_max_attempts`,`_auto_retry_attempts`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // p213k4.AbstractC6583c
    /* JADX INFO: renamed from: d */
    public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        interfaceC7920f.mo13194W(1, downloadInfo.f32331a);
        String str = downloadInfo.f32332b;
        if (str == null) {
            interfaceC7920f.mo13193J0(2);
        } else {
            interfaceC7920f.mo13197h0(str, 2);
        }
        String str2 = downloadInfo.f32333c;
        if (str2 == null) {
            interfaceC7920f.mo13193J0(3);
        } else {
            interfaceC7920f.mo13197h0(str2, 3);
        }
        String str3 = downloadInfo.f32334d;
        if (str3 == null) {
            interfaceC7920f.mo13193J0(4);
        } else {
            interfaceC7920f.mo13197h0(str3, 4);
        }
        interfaceC7920f.mo13194W(5, downloadInfo.f32335e);
        C10218f c10218f = this.f51630d;
        C5206f c5206f = c10218f.f51634c;
        Priority priority = downloadInfo.f32336f;
        c5206f.getClass();
        C5207g.m11112g(priority, "priority");
        interfaceC7920f.mo13194W(6, priority.getValue());
        C5206f c5206f2 = c10218f.f51634c;
        Map<String, String> map = downloadInfo.f32337g;
        c5206f2.getClass();
        interfaceC7920f.mo13197h0(C5206f.m11027v1(map), 7);
        interfaceC7920f.mo13194W(8, downloadInfo.f32338h);
        interfaceC7920f.mo13194W(9, downloadInfo.f32339i);
        Status status = downloadInfo.f32340j;
        C5207g.m11112g(status, "status");
        interfaceC7920f.mo13194W(10, status.getValue());
        Error error = downloadInfo.f32341k;
        C5207g.m11112g(error, "error");
        interfaceC7920f.mo13194W(11, error.getValue());
        NetworkType networkType = downloadInfo.f32342l;
        C5207g.m11112g(networkType, "networkType");
        interfaceC7920f.mo13194W(12, networkType.getValue());
        interfaceC7920f.mo13194W(13, downloadInfo.f32321H);
        String str4 = downloadInfo.f32322I;
        if (str4 == null) {
            interfaceC7920f.mo13193J0(14);
        } else {
            interfaceC7920f.mo13197h0(str4, 14);
        }
        EnqueueAction enqueueAction = downloadInfo.f32323J;
        C5207g.m11112g(enqueueAction, "enqueueAction");
        interfaceC7920f.mo13194W(15, enqueueAction.getValue());
        interfaceC7920f.mo13194W(16, downloadInfo.f32324K);
        interfaceC7920f.mo13194W(17, downloadInfo.f32325L ? 1L : 0L);
        interfaceC7920f.mo13197h0(C5206f.m10990K0(downloadInfo.f32326M), 18);
        interfaceC7920f.mo13194W(19, downloadInfo.f32327N);
        interfaceC7920f.mo13194W(20, downloadInfo.f32328O);
    }
}
