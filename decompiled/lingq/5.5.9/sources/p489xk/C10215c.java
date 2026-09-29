package p489xk;

import com.tonyodev.fetch2.database.DownloadDatabase;
import com.tonyodev.fetch2.database.DownloadInfo;
import p213k4.AbstractC6583c;
import p288o4.InterfaceC7920f;

/* JADX INFO: renamed from: xk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10215c extends AbstractC6583c {
    public C10215c(DownloadDatabase downloadDatabase) {
        super(downloadDatabase, 0);
    }

    @Override // androidx.room.SharedSQLiteStatement
    /* JADX INFO: renamed from: b */
    public final String mo4575b() {
        return "DELETE FROM `requests` WHERE `_id` = ?";
    }

    @Override // p213k4.AbstractC6583c
    /* JADX INFO: renamed from: d */
    public final void mo4989d(InterfaceC7920f interfaceC7920f, Object obj) {
        interfaceC7920f.mo13194W(1, ((DownloadInfo) obj).f32331a);
    }
}
