package p000;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.concurrent.futures.C0464b;
import androidx.work.DirectExecutor;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ah1 implements bm1, sg5, gp9, f92, fn9, em0, fk8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f634a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f635b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f636c;

    public /* synthetic */ ah1(C3496qf c3496qf, eh5 eh5Var, ru5 ru5Var, IOException iOException, boolean z) {
        this.f634a = c3496qf;
        this.f635b = ru5Var;
        this.f636c = iOException;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036 A[PHI: r6
      0x0036: PHI (r6v9 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
      (r6v2 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v3 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v4 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v7 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
     binds: [B:9:0x0034, B:12:0x003e, B:15:0x0047, B:18:0x0050, B:21:0x0059, B:24:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.fk8
    public Object apply(Object obj) {
        hk8 hk8Var = (hk8) this.f634a;
        HashMap map = (HashMap) this.f635b;
        C3329mb c3329mb = (C3329mb) this.f636c;
        ArrayList arrayList = (ArrayList) c3329mb.f50861c;
        Cursor cursor = (Cursor) obj;
        hk8Var.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i = cursor.getInt(1);
            LogEventDropped$Reason logEventDropped$Reason = LogEventDropped$Reason.REASON_UNKNOWN;
            if (i != logEventDropped$Reason.getNumber()) {
                LogEventDropped$Reason logEventDropped$Reason2 = LogEventDropped$Reason.MESSAGE_TOO_OLD;
                if (i == logEventDropped$Reason2.getNumber()) {
                    logEventDropped$Reason = logEventDropped$Reason2;
                } else {
                    logEventDropped$Reason2 = LogEventDropped$Reason.CACHE_FULL;
                    if (i == logEventDropped$Reason2.getNumber()) {
                        logEventDropped$Reason = logEventDropped$Reason2;
                    } else {
                        logEventDropped$Reason2 = LogEventDropped$Reason.PAYLOAD_TOO_BIG;
                        if (i == logEventDropped$Reason2.getNumber()) {
                            logEventDropped$Reason = logEventDropped$Reason2;
                        } else {
                            logEventDropped$Reason2 = LogEventDropped$Reason.MAX_RETRIES_REACHED;
                            if (i == logEventDropped$Reason2.getNumber()) {
                                logEventDropped$Reason = logEventDropped$Reason2;
                            } else {
                                logEventDropped$Reason2 = LogEventDropped$Reason.INVALID_PAYLOD;
                                if (i == logEventDropped$Reason2.getNumber()) {
                                    logEventDropped$Reason = logEventDropped$Reason2;
                                } else {
                                    logEventDropped$Reason2 = LogEventDropped$Reason.SERVER_ERROR;
                                    if (i == logEventDropped$Reason2.getNumber()) {
                                        logEventDropped$Reason = logEventDropped$Reason2;
                                    } else {
                                        x74.m24357n("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            List list = (List) map.get(string);
            int i2 = fj5.f39194c;
            list.add(new fj5(j, logEventDropped$Reason));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i3 = ij5.f44185c;
            new ArrayList();
            arrayList.add(new ij5((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long jMo100g = hk8Var.f42544b.mo100g();
        SQLiteDatabase sQLiteDatabaseM13313a = hk8Var.m13313a();
        sQLiteDatabaseM13313a.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseM13313a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
            try {
                cursorRawQuery.moveToNext();
                u0a u0aVar = new u0a(cursorRawQuery.getLong(0), jMo100g);
                cursorRawQuery.close();
                sQLiteDatabaseM13313a.setTransactionSuccessful();
                sQLiteDatabaseM13313a.endTransaction();
                c3329mb.f50860b = u0aVar;
                c3329mb.f50862d = new tn3(new aj9(hk8Var.m13313a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hk8Var.m13313a().compileStatement("PRAGMA page_count").simpleQueryForLong(), m40.f50553f.f50554a));
                c3329mb.f50863e = (String) hk8Var.f42547e.get();
                return new r31((u0a) c3329mb.f50860b, Collections.unmodifiableList(arrayList), (tn3) c3329mb.f50862d, (String) c3329mb.f50863e);
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabaseM13313a.endTransaction();
            throw th2;
        }
    }

    @Override // p000.em0
    /* JADX INFO: renamed from: c */
    public Object mo392c(C0464b c0464b) {
        Executor executor = (Executor) this.f634a;
        String str = (String) this.f635b;
        ui3 ui3Var = (ui3) this.f636c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jg5 jg5Var = new jg5(atomicBoolean, 0);
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        r78 r78Var = c0464b.f5330c;
        if (r78Var != null) {
            r78Var.mo52a(jg5Var, directExecutor);
        }
        executor.execute(new kg5(atomicBoolean, c0464b, ui3Var, 0));
        return str;
    }

    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) {
        URL url;
        ch1 ch1Var = (ch1) this.f634a;
        Task task2 = (Task) this.f635b;
        Task task3 = (Task) this.f636c;
        if (!task2.mo5971m()) {
            return Tasks.m5974b(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable) task2.mo5966h()));
        }
        try {
            if (!task3.mo5971m()) {
                return Tasks.m5974b(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable) task3.mo5966h()));
            }
            try {
                url = new URL(ch1Var.m4652c(ch1Var.f10077n));
            } catch (MalformedURLException unused) {
                Log.e("FirebaseRemoteConfig", "URL is malformed");
                url = null;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            ch1Var.m4656i(httpURLConnection, (String) task3.mo5967i(), ((t40) task2.mo5967i()).f61836a);
            return Tasks.m5975c(httpURLConnection);
        } catch (IOException e) {
            return Tasks.m5974b(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", (Throwable) e));
        }
    }

    @Override // p000.f92
    /* JADX INFO: renamed from: i */
    public List mo394i(int i, j8a j8aVar, int[] iArr) {
        d92 d92Var = (d92) this.f634a;
        String str = (String) this.f635b;
        String str2 = (String) this.f636c;
        c14 c14VarM6284m = ImmutableList.m6284m();
        for (int i2 = 0; i2 < j8aVar.f45214a; i2++) {
            c14VarM6284m.m3157b(new e92(i, j8aVar, i2, d92Var, iArr[i2], str, str2));
        }
        return c14VarM6284m.m4280g();
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        ((InterfaceC3534rf) obj).mo20623h((C3496qf) this.f634a, (ru5) this.f635b, (IOException) this.f636c);
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f634a;
        String str = (String) this.f635b;
        cn5 cn5Var = (cn5) this.f636c;
        String str2 = (String) obj;
        C3336mi c3336miM6705c = FirebaseMessaging.m6705c(firebaseMessaging.f13722b);
        q43 q43Var = firebaseMessaging.f13721a;
        q43Var.m19644a();
        String strM19646d = "[DEFAULT]".equals(q43Var.f57253b) ? "" : q43Var.m19646d();
        String strM16247b = firebaseMessaging.f13728h.m16247b();
        synchronized (c3336miM6705c) {
            String strM4894b = cn5.m4894b(System.currentTimeMillis(), str2, strM16247b);
            if (strM4894b != null) {
                SharedPreferences.Editor editorEdit = c3336miM6705c.f51344a.edit();
                editorEdit.putString(strM19646d + "|T|" + str + "|*", strM4894b);
                editorEdit.commit();
            }
        }
        if (cn5Var == null || !str2.equals((String) cn5Var.f10327b)) {
            q43 q43Var2 = firebaseMessaging.f13721a;
            q43Var2.m19644a();
            if ("[DEFAULT]".equals(q43Var2.f57253b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    q43Var2.m19644a();
                    sb.append(q43Var2.f57253b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C3156jq(firebaseMessaging.f13722b).m14592F(intent);
            }
        }
        return Tasks.m5975c(str2);
    }

    @Override // p000.gp9
    /* JADX INFO: renamed from: n */
    public Object mo395n() {
        w72 w72Var = (w72) this.f634a;
        q50 q50Var = (q50) this.f635b;
        l40 l40Var = (l40) this.f636c;
        hk8 hk8Var = w72Var.f66466d;
        hk8Var.getClass();
        Priority priority = q50Var.f57281c;
        String str = l40Var.f49001a;
        String str2 = q50Var.f57279a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + priority + ", name=" + str + " for destination " + str2);
        }
        ((Long) hk8Var.m13314c(new ar1(hk8Var, l40Var, q50Var, 6))).getClass();
        w72Var.f66463a.m16493M(q50Var, 1, false);
        return null;
    }

    public /* synthetic */ ah1(Object obj, Object obj2, Object obj3) {
        this.f634a = obj;
        this.f635b = obj2;
        this.f636c = obj3;
    }
}
