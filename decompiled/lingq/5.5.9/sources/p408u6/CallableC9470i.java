package p408u6;

import android.database.sqlite.SQLiteException;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.p049db.DBAdapter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: u6.i */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9470i implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f48550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9471j f48551b;

    public CallableC9470i(C9471j c9471j, String str) {
        this.f48551b = c9471j;
        this.f48550a = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C9471j c9471j = this.f48551b;
        DBAdapter dBAdapter = c9471j.f48552a;
        String str = this.f48550a;
        String str2 = c9471j.f48555d;
        synchronized (dBAdapter) {
            if (str != null && str2 != null) {
                String name = DBAdapter.Table.INBOX_MESSAGES.getName();
                try {
                    try {
                        dBAdapter.f11040b.getWritableDatabase().delete(name, "_id = ? AND messageUser = ?", new String[]{str, str2});
                        dBAdapter.f11040b.close();
                    } catch (SQLiteException e10) {
                        dBAdapter.m6470g().getClass();
                        C2181a.m6459l("Error removing stale records from " + name, e10);
                        dBAdapter.f11040b.close();
                    }
                } catch (Throwable th2) {
                    dBAdapter.f11040b.close();
                    throw th2;
                }
            }
        }
        return null;
    }
}
