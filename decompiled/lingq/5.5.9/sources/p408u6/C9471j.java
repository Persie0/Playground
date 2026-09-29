package p408u6;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.media.AbstractC0140a;
import android.text.TextUtils;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.p049db.DBAdapter;
import com.clevertap.android.sdk.task.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import p043c7.C1735a;
import p043c7.C1738d;
import p118fe.C5509a;
import p289o5.C7940t;
import p402u0.C9371n;

/* JADX INFO: renamed from: u6.j */
/* JADX INFO: loaded from: classes.dex */
public final class C9471j {

    /* JADX INFO: renamed from: a */
    public final DBAdapter f48552a;

    /* JADX INFO: renamed from: b */
    public ArrayList<C9473l> f48553b;

    /* JADX INFO: renamed from: c */
    public final Object f48554c = new Object();

    /* JADX INFO: renamed from: d */
    public final String f48555d;

    /* JADX INFO: renamed from: e */
    public final boolean f48556e;

    /* JADX INFO: renamed from: f */
    public final C7940t f48557f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0140a f48558g;

    /* JADX INFO: renamed from: h */
    public final CleverTapInstanceConfig f48559h;

    /* JADX INFO: renamed from: u6.j$a */
    public class a implements Callable<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f48560a;

        public a(String str) {
            this.f48560a = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C9471j c9471j = C9471j.this;
            DBAdapter dBAdapter = c9471j.f48552a;
            String str = this.f48560a;
            String str2 = c9471j.f48555d;
            synchronized (dBAdapter) {
                if (str != null && str2 != null) {
                    DBAdapter.Table table = DBAdapter.Table.INBOX_MESSAGES;
                    String name = table.getName();
                    try {
                        try {
                            SQLiteDatabase writableDatabase = dBAdapter.f11040b.getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("isRead", (Integer) 1);
                            writableDatabase.update(table.getName(), contentValues, "_id = ? AND messageUser = ?", new String[]{str, str2});
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

    public C9471j(CleverTapInstanceConfig cleverTapInstanceConfig, String str, DBAdapter dBAdapter, C7940t c7940t, AbstractC0140a abstractC0140a, boolean z10) {
        this.f48555d = str;
        this.f48552a = dBAdapter;
        this.f48553b = dBAdapter.m6471h(str);
        this.f48556e = z10;
        this.f48557f = c7940t;
        this.f48558g = abstractC0140a;
        this.f48559h = cleverTapInstanceConfig;
    }

    /* JADX INFO: renamed from: a */
    public final void m17885a(String str) {
        C9473l c9473lM17887c = m17887c(str);
        if (c9473lM17887c == null) {
            return;
        }
        synchronized (this.f48554c) {
            this.f48553b.remove(c9473lM17887c);
        }
        C1735a.m5472a(this.f48559h).m5474b().m6585b("RunDeleteMessage", new CallableC9470i(this, str));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17886b(String str) {
        int i10;
        C9473l c9473lM17887c = m17887c(str);
        if (c9473lM17887c == null) {
            return false;
        }
        synchronized (this.f48554c) {
            i10 = 1;
            c9473lM17887c.f48569f = true;
        }
        Task taskM5474b = C1735a.m5472a(this.f48559h).m5474b();
        taskM5474b.m6584a(new C5509a(i10, this));
        C9371n c9371n = new C9371n(3, str);
        Executor executor = taskM5474b.f11355b;
        synchronized (taskM5474b) {
            taskM5474b.f11357d.add(new C1738d(executor, c9371n));
        }
        taskM5474b.m6585b("RunMarkMessageRead", new a(str));
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final C9473l m17887c(String str) {
        synchronized (this.f48554c) {
            try {
                for (C9473l c9473l : this.f48553b) {
                    if (c9473l.f48567d.equals(str)) {
                        return c9473l;
                    }
                }
                C2181a.m6455h("Inbox Message for message id - " + str + " not found");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17888d() {
        C2181a.m6455h("CTInboxController:trimMessages() called");
        ArrayList arrayList = new ArrayList();
        synchronized (this.f48554c) {
            Iterator<C9473l> it = this.f48553b.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    C9473l next = it.next();
                    if (this.f48556e || !next.m17892a()) {
                        long j10 = next.f48566c;
                        if (j10 > 0 && System.currentTimeMillis() / 1000 > j10) {
                            C2181a.m6455h("Inbox Message: " + next.f48567d + " is expired - removing");
                            arrayList.add(next);
                        }
                    } else {
                        C2181a.m6449a("Removing inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                        arrayList.add(next);
                    }
                }
            }
            if (arrayList.size() <= 0) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                m17885a(((C9473l) it2.next()).f48567d);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m17889e(JSONArray jSONArray) {
        C2181a.m6455h("CTInboxController:updateMessages() called");
        ArrayList<C9473l> arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                C9473l c9473lM17891b = C9473l.m17891b(this.f48555d, jSONArray.getJSONObject(i10));
                if (c9473lM17891b != null) {
                    if (this.f48556e || !c9473lM17891b.m17892a()) {
                        arrayList.add(c9473lM17891b);
                        C2181a.m6455h("Inbox Message for message id - " + c9473lM17891b.f48567d + " added");
                    } else {
                        C2181a.m6449a("Dropping inbox message containing video/audio as app does not support video. For more information checkout CleverTap documentation.");
                    }
                }
            } catch (JSONException e10) {
                C2181a.m6449a("Unable to update notification inbox messages - " + e10.getLocalizedMessage());
            }
        }
        if (arrayList.size() <= 0) {
            return false;
        }
        DBAdapter dBAdapter = this.f48552a;
        synchronized (dBAdapter) {
            if (dBAdapter.m6464a()) {
                try {
                    SQLiteDatabase writableDatabase = dBAdapter.f11040b.getWritableDatabase();
                    for (C9473l c9473l : arrayList) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("_id", c9473l.f48567d);
                        contentValues.put("data", c9473l.f48568e.toString());
                        contentValues.put("wzrkParams", c9473l.f48572i.toString());
                        contentValues.put("campaignId", c9473l.f48564a);
                        contentValues.put("tags", TextUtils.join(",", c9473l.f48570g));
                        contentValues.put("isRead", Integer.valueOf(c9473l.f48569f ? 1 : 0));
                        contentValues.put("expires", Long.valueOf(c9473l.f48566c));
                        contentValues.put("created_at", Long.valueOf(c9473l.f48565b));
                        contentValues.put("messageUser", c9473l.f48571h);
                        writableDatabase.insertWithOnConflict(DBAdapter.Table.INBOX_MESSAGES.getName(), null, contentValues, 5);
                    }
                } catch (SQLiteException unused) {
                    C2181a c2181aM6470g = dBAdapter.m6470g();
                    String str = "Error adding data to table " + DBAdapter.Table.INBOX_MESSAGES.getName();
                    c2181aM6470g.getClass();
                    C2181a.m6458k(str);
                } finally {
                    dBAdapter.f11040b.close();
                }
            } else {
                C2181a.m6455h("There is not enough space left on the device to store data, data discarded");
            }
        }
        C2181a.m6455h("New Notification Inbox messages added");
        synchronized (this.f48554c) {
            this.f48553b = this.f48552a.m6471h(this.f48555d);
            m17888d();
        }
        return true;
    }
}
