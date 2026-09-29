package p489xk;

import androidx.room.SharedSQLiteStatement;
import com.tonyodev.fetch2.database.DownloadDatabase;

/* JADX INFO: renamed from: xk.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C10217e extends SharedSQLiteStatement {
    public C10217e(DownloadDatabase downloadDatabase) {
        super(downloadDatabase);
    }

    @Override // androidx.room.SharedSQLiteStatement
    /* JADX INFO: renamed from: b */
    public final String mo4575b() {
        return "DELETE FROM requests";
    }
}
