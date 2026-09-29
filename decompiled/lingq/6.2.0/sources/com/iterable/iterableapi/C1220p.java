package com.iterable.iterableapi;

import android.app.Activity;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C3082ho;
import p000.ab4;
import p000.bb4;
import p000.eh0;
import p000.fb4;
import p000.gb4;
import p000.nc0;
import p000.sr3;

/* JADX INFO: renamed from: com.iterable.iterableapi.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C1220p implements Handler.Callback, ab4 {

    /* JADX INFO: renamed from: a */
    public final C1221q f14076a;

    /* JADX INFO: renamed from: b */
    public final bb4 f14077b;

    /* JADX INFO: renamed from: c */
    public final nc0 f14078c;

    /* JADX INFO: renamed from: d */
    public final sr3 f14079d;

    /* JADX INFO: renamed from: e */
    public final C3082ho f14080e;

    /* JADX INFO: renamed from: f */
    public final Handler f14081f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f14082g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f14083h;

    public C1220p(C1221q c1221q, bb4 bb4Var, nc0 nc0Var, sr3 sr3Var, C3082ho c3082ho) {
        HandlerThread handlerThread = new HandlerThread("NetworkThread");
        this.f14082g = new ArrayList();
        this.f14083h = false;
        this.f14076a = c1221q;
        this.f14077b = bb4Var;
        this.f14078c = nc0Var;
        this.f14079d = sr3Var;
        this.f14080e = c3082ho;
        handlerThread.start();
        this.f14081f = new Handler(handlerThread.getLooper(), this);
        c1221q.f14087c.add(this);
        synchronized (nc0Var) {
            ((ArrayList) nc0Var.f52587e).add(this);
        }
        bb4Var.m3555a(this);
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: a */
    public final void mo231a() {
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: b */
    public final void mo232b() {
        m6958e();
    }

    /* JADX INFO: renamed from: c */
    public final void m6956c(String str, IterableTaskRunner$TaskResult iterableTaskRunner$TaskResult, gb4 gb4Var) {
        Iterator it = this.f14082g.iterator();
        while (it.hasNext()) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1219o((C1223s) it.next(), str, iterableTaskRunner$TaskResult, gb4Var));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6957d() {
        this.f14083h = false;
        m6958e();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6958e() {
        this.f14081f.removeMessages(100);
        this.f14081f.sendEmptyMessage(100);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0159  */
    /* JADX WARN: Code duplicated, block: B:98:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0165 A[SYNTHETIC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        C1218n c1218nM6959a;
        gb4 gb4VarM6950b;
        C1221q c1221q;
        String str;
        JSONObject jSONObject;
        if (message.what != 100) {
            return false;
        }
        WeakReference weakReference = this.f14077b.f8271b;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == null) {
            eh0.m11133m("IterableTaskRunner", "App not in foreground, skipping processing tasks");
            return true;
        }
        sr3 sr3Var = this.f14079d;
        StringBuilder sb = new StringBuilder("Health monitor can process: ");
        sb.append(!sr3Var.f61294a);
        eh0.m11133m("HealthMonitor", sb.toString());
        if (!sr3Var.f61294a) {
            boolean z = fb4.f38769t.f38779j;
            while (this.f14078c.f52584b) {
                if (this.f14083h) {
                    C1221q c1221q2 = this.f14076a;
                    C3082ho c3082ho = this.f14080e;
                    if (c1221q2.m6962c()) {
                        Cursor cursorRawQuery = c1221q2.f14085a.rawQuery("select * from OfflineTask order by scheduled", null);
                        if (!cursorRawQuery.moveToFirst()) {
                            c1218nM6959a = null;
                            break;
                        }
                        while (true) {
                            C1218n c1218nM6959a2 = C1221q.m6959a(cursorRawQuery);
                            if (c3082ho.f42681a.contains(c1218nM6959a2.f14061b)) {
                                c1218nM6959a = c1218nM6959a2;
                                break;
                            }
                            if (!cursorRawQuery.moveToNext()) {
                                c1218nM6959a = null;
                                break;
                            }
                        }
                        cursorRawQuery.close();
                    } else {
                        c1218nM6959a = null;
                    }
                } else {
                    if (z) {
                        fb4.f38769t.m11692c().getClass();
                    }
                    C1221q c1221q3 = this.f14076a;
                    if (c1221q3.m6962c()) {
                        Cursor cursorRawQuery2 = c1221q3.f14085a.rawQuery("select * from OfflineTask order by scheduled limit 1", null);
                        c1218nM6959a = cursorRawQuery2.moveToFirst() ? C1221q.m6959a(cursorRawQuery2) : null;
                        cursorRawQuery2.close();
                    } else {
                        c1218nM6959a = null;
                    }
                }
                if (c1218nM6959a == null) {
                    break;
                }
                if (c1218nM6959a.f14071l == IterableTaskType.API) {
                    IterableTaskRunner$TaskResult iterableTaskRunner$TaskResult = IterableTaskRunner$TaskResult.FAILURE;
                    try {
                        String str2 = fb4.f38769t.f38776g;
                        try {
                            jSONObject = new JSONObject(c1218nM6959a.f14069j);
                            jSONObject.getJSONObject("data").put("createdAt", c1218nM6959a.f14063d / 1000);
                        } catch (JSONException e) {
                            e.printStackTrace();
                            jSONObject = null;
                        }
                        C1205a c1205aM6894a = C1205a.m6894a(str2, jSONObject);
                        c1205aM6894a.f13984f = IterableApiRequest$ProcessorType.OFFLINE;
                        gb4VarM6950b = AsyncTaskC1217m.m6950b(c1205aM6894a);
                    } catch (Exception e2) {
                        eh0.m11136q("IterableTaskRunner", "Error while processing request task", e2);
                        sr3 sr3Var2 = this.f14079d;
                        sr3Var2.getClass();
                        eh0.m11135p("HealthMonitor", "DB Error notified to healthMonitor");
                        sr3Var2.f61294a = true;
                        gb4VarM6950b = null;
                    }
                    if (gb4VarM6950b == null) {
                        m6956c(c1218nM6959a.f14060a, iterableTaskRunner$TaskResult, gb4VarM6950b);
                        if (iterableTaskRunner$TaskResult == IterableTaskRunner$TaskResult.RETRY) {
                            c1221q = this.f14076a;
                            str = c1218nM6959a.f14060a;
                            if (!c1221q.m6962c()) {
                                eh0.m11120Q("IterableTaskStorage", "Deleted entry - " + c1221q.f14085a.delete("OfflineTask", "task_id =?", new String[]{str}));
                            }
                        }
                    } else {
                        if (gb4VarM6950b.f40488a) {
                            iterableTaskRunner$TaskResult = IterableTaskRunner$TaskResult.SUCCESS;
                        } else if (z && gb4VarM6950b.f40489b == 401) {
                            eh0.m11133m("IterableTaskRunner", "JWT auth failure on task " + c1218nM6959a.f14060a + ". Retaining task and pausing processing.");
                            C1206b c1206bM11692c = fb4.f38769t.m11692c();
                            c1206bM11692c.getClass();
                            c1206bM11692c.m6899f(IterableAuthManager$AuthState.INVALID);
                            this.f14083h = true;
                            m6956c(c1218nM6959a.f14060a, IterableTaskRunner$TaskResult.RETRY, gb4VarM6950b);
                        } else {
                            int i = gb4VarM6950b.f40489b;
                            iterableTaskRunner$TaskResult = (i != 0 && i != 429 && i >= 400 && i < 500) ? IterableTaskRunner$TaskResult.FAILURE : IterableTaskRunner$TaskResult.RETRY;
                        }
                        m6956c(c1218nM6959a.f14060a, iterableTaskRunner$TaskResult, gb4VarM6950b);
                        if (iterableTaskRunner$TaskResult == IterableTaskRunner$TaskResult.RETRY) {
                            c1221q = this.f14076a;
                            str = c1218nM6959a.f14060a;
                            if (!c1221q.m6962c()) {
                                eh0.m11120Q("IterableTaskStorage", "Deleted entry - " + c1221q.f14085a.delete("OfflineTask", "task_id =?", new String[]{str}));
                            }
                        }
                    }
                }
                if (!z || !this.f14083h) {
                    Handler handler = this.f14081f;
                    handler.removeCallbacksAndMessages(100);
                    handler.sendEmptyMessageDelayed(100, 60000L);
                    break;
                }
                break;
            }
        }
        return true;
    }
}
