package com.tonyodev.fetch2.database;

import android.content.Context;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import dm.C5207g;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p213k4.C6581a;
import p213k4.C6586f;
import p213k4.C6594n;
import p256m4.C7478a;
import p288o4.InterfaceC7917c;
import p338qd.C8573r0;
import p489xk.C10218f;
import p489xk.InterfaceC10213a;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadDatabase_Impl extends DownloadDatabase {

    /* JADX INFO: renamed from: m */
    public volatile C10218f f32319m;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.database.DownloadDatabase_Impl$a */
    public class C4964a extends C6594n.a {
        public C4964a() {
            super(7);
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: a */
        public final void mo4719a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `requests` (`_id` INTEGER NOT NULL, `_namespace` TEXT NOT NULL, `_url` TEXT NOT NULL, `_file` TEXT NOT NULL, `_group` INTEGER NOT NULL, `_priority` INTEGER NOT NULL, `_headers` TEXT NOT NULL, `_written_bytes` INTEGER NOT NULL, `_total_bytes` INTEGER NOT NULL, `_status` INTEGER NOT NULL, `_error` INTEGER NOT NULL, `_network_type` INTEGER NOT NULL, `_created` INTEGER NOT NULL, `_tag` TEXT, `_enqueue_action` INTEGER NOT NULL, `_identifier` INTEGER NOT NULL, `_download_on_enqueue` INTEGER NOT NULL, `_extras` TEXT NOT NULL, `_auto_retry_max_attempts` INTEGER NOT NULL, `_auto_retry_attempts` INTEGER NOT NULL, PRIMARY KEY(`_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_requests__file` ON `requests` (`_file`)", "CREATE INDEX IF NOT EXISTS `index_requests__group__status` ON `requests` (`_group`, `_status`)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.mo4600u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '460643a974555d792b8f5a6e1a5d323c')");
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: b */
        public final void mo4720b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.mo4600u("DROP TABLE IF EXISTS `requests`");
            DownloadDatabase_Impl downloadDatabase_Impl = DownloadDatabase_Impl.this;
            List<? extends RoomDatabase.AbstractC1181b> list = downloadDatabase_Impl.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    downloadDatabase_Impl.f7516g.get(i10).getClass();
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: c */
        public final void mo4721c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            DownloadDatabase_Impl downloadDatabase_Impl = DownloadDatabase_Impl.this;
            List<? extends RoomDatabase.AbstractC1181b> list = downloadDatabase_Impl.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    downloadDatabase_Impl.f7516g.get(i10).getClass();
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: d */
        public final void mo4722d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            DownloadDatabase_Impl.this.f7510a = frameworkSQLiteDatabase;
            DownloadDatabase_Impl.this.m4564o(frameworkSQLiteDatabase);
            List<? extends RoomDatabase.AbstractC1181b> list = DownloadDatabase_Impl.this.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    DownloadDatabase_Impl.this.f7516g.get(i10).mo4571a(frameworkSQLiteDatabase);
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: e */
        public final void mo4723e() {
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: f */
        public final void mo4724f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
            C8573r0.m16717c0(frameworkSQLiteDatabase);
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: g */
        public final C6594n.b mo4725g(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
            HashMap map = new HashMap(20);
            map.put("_id", new C7478a.a(1, 1, "_id", "INTEGER", null, true));
            map.put("_namespace", new C7478a.a(0, 1, "_namespace", "TEXT", null, true));
            map.put("_url", new C7478a.a(0, 1, "_url", "TEXT", null, true));
            map.put("_file", new C7478a.a(0, 1, "_file", "TEXT", null, true));
            map.put("_group", new C7478a.a(0, 1, "_group", "INTEGER", null, true));
            map.put("_priority", new C7478a.a(0, 1, "_priority", "INTEGER", null, true));
            map.put("_headers", new C7478a.a(0, 1, "_headers", "TEXT", null, true));
            map.put("_written_bytes", new C7478a.a(0, 1, "_written_bytes", "INTEGER", null, true));
            map.put("_total_bytes", new C7478a.a(0, 1, "_total_bytes", "INTEGER", null, true));
            map.put("_status", new C7478a.a(0, 1, "_status", "INTEGER", null, true));
            map.put("_error", new C7478a.a(0, 1, "_error", "INTEGER", null, true));
            map.put("_network_type", new C7478a.a(0, 1, "_network_type", "INTEGER", null, true));
            map.put("_created", new C7478a.a(0, 1, "_created", "INTEGER", null, true));
            map.put("_tag", new C7478a.a(0, 1, "_tag", "TEXT", null, false));
            map.put("_enqueue_action", new C7478a.a(0, 1, "_enqueue_action", "INTEGER", null, true));
            map.put("_identifier", new C7478a.a(0, 1, "_identifier", "INTEGER", null, true));
            map.put("_download_on_enqueue", new C7478a.a(0, 1, "_download_on_enqueue", "INTEGER", null, true));
            map.put("_extras", new C7478a.a(0, 1, "_extras", "TEXT", null, true));
            map.put("_auto_retry_max_attempts", new C7478a.a(0, 1, "_auto_retry_max_attempts", "INTEGER", null, true));
            HashSet hashSetM615k = C0141b.m615k(map, "_auto_retry_attempts", new C7478a.a(0, 1, "_auto_retry_attempts", "INTEGER", null, true), 0);
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C7478a.d("index_requests__file", Arrays.asList("_file"), true));
            hashSet.add(new C7478a.d("index_requests__group__status", Arrays.asList("_group", "_status"), false));
            C7478a c7478a = new C7478a("requests", map, hashSetM615k, hashSet);
            C7478a c7478aM14861a = C7478a.m14861a(frameworkSQLiteDatabase, "requests");
            return !c7478a.equals(c7478aM14861a) ? new C6594n.b(C0166e.m767m("requests(com.tonyodev.fetch2.database.DownloadInfo).\n Expected:\n", c7478a, "\n Found:\n", c7478aM14861a), false) : new C6594n.b(null, true);
        }
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: g */
    public final C6586f mo4556g() {
        return new C6586f(this, new HashMap(0), new HashMap(0), "requests");
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h */
    public final InterfaceC7917c mo4557h(C6581a c6581a) {
        C6594n c6594n = new C6594n(c6581a, new C4964a(), "460643a974555d792b8f5a6e1a5d323c", "946eca6b182e63ebe50cf82e483715bf");
        Context context = c6581a.f37406a;
        C5207g.m11111f(context, "context");
        return c6581a.f37408c.mo5467a(new InterfaceC7917c.b(context, c6581a.f37407b, c6594n, false, false));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.tonyodev.fetch2.database.DownloadDatabase
    /* JADX INFO: renamed from: u */
    public final InterfaceC10213a mo10598u() {
        C10218f c10218f;
        if (this.f32319m != null) {
            return this.f32319m;
        }
        synchronized (this) {
            if (this.f32319m == null) {
                this.f32319m = new C10218f(this);
            }
            c10218f = this.f32319m;
        }
        return c10218f;
    }
}
