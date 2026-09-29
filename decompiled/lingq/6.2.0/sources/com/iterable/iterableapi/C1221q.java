package com.iterable.iterableapi;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p000.eh0;
import p000.mb4;
import p000.qc4;

/* JADX INFO: renamed from: com.iterable.iterableapi.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C1221q {

    /* JADX INFO: renamed from: e */
    public static C1221q f14084e;

    /* JADX INFO: renamed from: a */
    public SQLiteDatabase f14085a;

    /* JADX INFO: renamed from: b */
    public mb4 f14086b;

    /* JADX INFO: renamed from: c */
    public ArrayList f14087c;

    /* JADX INFO: renamed from: d */
    public ArrayList f14088d;

    /* JADX INFO: renamed from: a */
    public static C1218n m6959a(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("task_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("name"));
        int i = cursor.getInt(cursor.getColumnIndex("version"));
        long j = cursor.getLong(cursor.getColumnIndex("created"));
        long j2 = !cursor.isNull(cursor.getColumnIndex("modified")) ? cursor.getLong(cursor.getColumnIndex("modified")) : 0L;
        long j3 = cursor.isNull(cursor.getColumnIndex("last_attempt")) ? 0L : cursor.getLong(cursor.getColumnIndex("last_attempt"));
        if (!cursor.isNull(cursor.getColumnIndex("scheduled"))) {
            cursor.getLong(cursor.getColumnIndex("scheduled"));
        }
        if (!cursor.isNull(cursor.getColumnIndex("requested"))) {
            cursor.getLong(cursor.getColumnIndex("requested"));
        }
        boolean z = !cursor.isNull(cursor.getColumnIndex("processing")) && cursor.getInt(cursor.getColumnIndex("processing")) > 0;
        boolean z2 = !cursor.isNull(cursor.getColumnIndex("failed")) && cursor.getInt(cursor.getColumnIndex("failed")) > 0;
        boolean z3 = !cursor.isNull(cursor.getColumnIndex("blocking")) && cursor.getInt(cursor.getColumnIndex("blocking")) > 0;
        String string3 = !cursor.isNull(cursor.getColumnIndex("data")) ? cursor.getString(cursor.getColumnIndex("data")) : null;
        String string4 = !cursor.isNull(cursor.getColumnIndex("error")) ? cursor.getString(cursor.getColumnIndex("error")) : null;
        IterableTaskType iterableTaskTypeValueOf = cursor.isNull(cursor.getColumnIndex("type")) ? null : IterableTaskType.valueOf(cursor.getString(cursor.getColumnIndex("type")));
        int i2 = !cursor.isNull(cursor.getColumnIndex("attempts")) ? cursor.getInt(cursor.getColumnIndex("attempts")) : 0;
        C1218n c1218n = new C1218n();
        c1218n.f14060a = string;
        c1218n.f14061b = string2;
        c1218n.f14062c = i;
        c1218n.f14063d = j;
        c1218n.f14064e = j2;
        c1218n.f14065f = j3;
        c1218n.f14066g = z;
        c1218n.f14067h = z2;
        c1218n.f14068i = z3;
        c1218n.f14069j = string3;
        c1218n.f14070k = string4;
        c1218n.f14071l = iterableTaskTypeValueOf;
        c1218n.f14072m = i2;
        return c1218n;
    }

    /* JADX INFO: renamed from: d */
    public static C1221q m6960d(Context context) {
        if (f14084e == null) {
            C1221q c1221q = new C1221q();
            c1221q.f14087c = new ArrayList();
            c1221q.f14088d = new ArrayList();
            if (context != null) {
                try {
                    if (c1221q.f14086b == null) {
                        c1221q.f14086b = new mb4(context, "iterable_sdk.db", null, 1);
                    }
                    c1221q.f14085a = c1221q.f14086b.getWritableDatabase();
                } catch (SQLException unused) {
                    eh0.m11135p("IterableTaskStorage", "Database cannot be opened for writing");
                }
            }
            f14084e = c1221q;
        }
        return f14084e;
    }

    /* JADX INFO: renamed from: b */
    public final void m6961b() {
        if (m6962c()) {
            eh0.m11120Q("IterableTaskStorage", "Deleted " + this.f14085a.delete("OfflineTask", null, null) + " offline tasks");
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6962c() {
        SQLiteDatabase sQLiteDatabase = this.f14085a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        new Handler(Looper.getMainLooper()).post(new qc4(this));
        eh0.m11135p("IterableTaskStorage", "Database not initialized or is closed");
        return false;
    }
}
