package androidx.work.impl;

import android.content.Context;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import androidx.room.RoomDatabase;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import dm.C5207g;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p041c5.C1727y;
import p041c5.C1728z;
import p213k4.C6581a;
import p213k4.C6586f;
import p213k4.C6594n;
import p214k5.C6601c;
import p214k5.C6605g;
import p214k5.C6609k;
import p214k5.C6613o;
import p214k5.C6616r;
import p214k5.C6619u;
import p214k5.C6622x;
import p214k5.InterfaceC6600b;
import p214k5.InterfaceC6603e;
import p214k5.InterfaceC6606h;
import p214k5.InterfaceC6608j;
import p214k5.InterfaceC6612n;
import p214k5.InterfaceC6615q;
import p214k5.InterfaceC6618t;
import p214k5.InterfaceC6621w;
import p234l4.InterfaceC7251a;
import p256m4.C7478a;
import p288o4.InterfaceC7917c;
import p338qd.C8573r0;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: m */
    public volatile C6619u f7835m;

    /* JADX INFO: renamed from: n */
    public volatile C6601c f7836n;

    /* JADX INFO: renamed from: o */
    public volatile C6622x f7837o;

    /* JADX INFO: renamed from: p */
    public volatile C6609k f7838p;

    /* JADX INFO: renamed from: q */
    public volatile C6613o f7839q;

    /* JADX INFO: renamed from: r */
    public volatile C6616r f7840r;

    /* JADX INFO: renamed from: s */
    public volatile C6605g f7841s;

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C1248a extends C6594n.a {
        public C1248a() {
            super(16);
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: a */
        public final void mo4719a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            frameworkSQLiteDatabase.mo4600u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.mo4600u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: b */
        public final void mo4720b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            C0204c.m860t(frameworkSQLiteDatabase, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
            frameworkSQLiteDatabase.mo4600u("DROP TABLE IF EXISTS `WorkName`");
            frameworkSQLiteDatabase.mo4600u("DROP TABLE IF EXISTS `WorkProgress`");
            frameworkSQLiteDatabase.mo4600u("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.AbstractC1181b> list = workDatabase_Impl.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    workDatabase_Impl.f7516g.get(i10).getClass();
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: c */
        public final void mo4721c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            List<? extends RoomDatabase.AbstractC1181b> list = workDatabase_Impl.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    workDatabase_Impl.f7516g.get(i10).getClass();
                }
            }
        }

        @Override // p213k4.C6594n.a
        /* JADX INFO: renamed from: d */
        public final void mo4722d(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            WorkDatabase_Impl.this.f7510a = frameworkSQLiteDatabase;
            frameworkSQLiteDatabase.mo4600u("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m4564o(frameworkSQLiteDatabase);
            List<? extends RoomDatabase.AbstractC1181b> list = WorkDatabase_Impl.this.f7516g;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    WorkDatabase_Impl.this.f7516g.get(i10).mo4571a(frameworkSQLiteDatabase);
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
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new C7478a.a(1, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSetM615k = C0141b.m615k(map, "prerequisite_id", new C7478a.a(2, 1, "prerequisite_id", "TEXT", null, true), 2);
            hashSetM615k.add(new C7478a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSetM615k.add(new C7478a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C7478a.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            hashSet.add(new C7478a.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
            C7478a c7478a = new C7478a("Dependency", map, hashSetM615k, hashSet);
            C7478a c7478aM14861a = C7478a.m14861a(frameworkSQLiteDatabase, "Dependency");
            if (!c7478a.equals(c7478aM14861a)) {
                return new C6594n.b(C0166e.m767m("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", c7478a, "\n Found:\n", c7478aM14861a), false);
            }
            HashMap map2 = new HashMap(27);
            map2.put("id", new C7478a.a(1, 1, "id", "TEXT", null, true));
            map2.put("state", new C7478a.a(0, 1, "state", "INTEGER", null, true));
            map2.put("worker_class_name", new C7478a.a(0, 1, "worker_class_name", "TEXT", null, true));
            map2.put("input_merger_class_name", new C7478a.a(0, 1, "input_merger_class_name", "TEXT", null, false));
            map2.put("input", new C7478a.a(0, 1, "input", "BLOB", null, true));
            map2.put("output", new C7478a.a(0, 1, "output", "BLOB", null, true));
            map2.put("initial_delay", new C7478a.a(0, 1, "initial_delay", "INTEGER", null, true));
            map2.put("interval_duration", new C7478a.a(0, 1, "interval_duration", "INTEGER", null, true));
            map2.put("flex_duration", new C7478a.a(0, 1, "flex_duration", "INTEGER", null, true));
            map2.put("run_attempt_count", new C7478a.a(0, 1, "run_attempt_count", "INTEGER", null, true));
            map2.put("backoff_policy", new C7478a.a(0, 1, "backoff_policy", "INTEGER", null, true));
            map2.put("backoff_delay_duration", new C7478a.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            map2.put("last_enqueue_time", new C7478a.a(0, 1, "last_enqueue_time", "INTEGER", null, true));
            map2.put("minimum_retention_duration", new C7478a.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            map2.put("schedule_requested_at", new C7478a.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            map2.put("run_in_foreground", new C7478a.a(0, 1, "run_in_foreground", "INTEGER", null, true));
            map2.put("out_of_quota_policy", new C7478a.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            map2.put("period_count", new C7478a.a(0, 1, "period_count", "INTEGER", "0", true));
            map2.put("generation", new C7478a.a(0, 1, "generation", "INTEGER", "0", true));
            map2.put("required_network_type", new C7478a.a(0, 1, "required_network_type", "INTEGER", null, true));
            map2.put("requires_charging", new C7478a.a(0, 1, "requires_charging", "INTEGER", null, true));
            map2.put("requires_device_idle", new C7478a.a(0, 1, "requires_device_idle", "INTEGER", null, true));
            map2.put("requires_battery_not_low", new C7478a.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            map2.put("requires_storage_not_low", new C7478a.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            map2.put("trigger_content_update_delay", new C7478a.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            map2.put("trigger_max_content_delay", new C7478a.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            HashSet hashSetM615k2 = C0141b.m615k(map2, "content_uri_triggers", new C7478a.a(0, 1, "content_uri_triggers", "BLOB", null, true), 0);
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C7478a.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
            hashSet2.add(new C7478a.d("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
            C7478a c7478a2 = new C7478a("WorkSpec", map2, hashSetM615k2, hashSet2);
            C7478a c7478aM14861a2 = C7478a.m14861a(frameworkSQLiteDatabase, "WorkSpec");
            if (!c7478a2.equals(c7478aM14861a2)) {
                return new C6594n.b(C0166e.m767m("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", c7478a2, "\n Found:\n", c7478aM14861a2), false);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new C7478a.a(1, 1, "tag", "TEXT", null, true));
            HashSet hashSetM615k3 = C0141b.m615k(map3, "work_spec_id", new C7478a.a(2, 1, "work_spec_id", "TEXT", null, true), 1);
            hashSetM615k3.add(new C7478a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new C7478a.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            C7478a c7478a3 = new C7478a("WorkTag", map3, hashSetM615k3, hashSet3);
            C7478a c7478aM14861a3 = C7478a.m14861a(frameworkSQLiteDatabase, "WorkTag");
            if (!c7478a3.equals(c7478aM14861a3)) {
                return new C6594n.b(C0166e.m767m("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", c7478a3, "\n Found:\n", c7478aM14861a3), false);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new C7478a.a(1, 1, "work_spec_id", "TEXT", null, true));
            map4.put("generation", new C7478a.a(2, 1, "generation", "INTEGER", "0", true));
            HashSet hashSetM615k4 = C0141b.m615k(map4, "system_id", new C7478a.a(0, 1, "system_id", "INTEGER", null, true), 1);
            hashSetM615k4.add(new C7478a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C7478a c7478a4 = new C7478a("SystemIdInfo", map4, hashSetM615k4, new HashSet(0));
            C7478a c7478aM14861a4 = C7478a.m14861a(frameworkSQLiteDatabase, "SystemIdInfo");
            if (!c7478a4.equals(c7478aM14861a4)) {
                return new C6594n.b(C0166e.m767m("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", c7478a4, "\n Found:\n", c7478aM14861a4), false);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new C7478a.a(1, 1, "name", "TEXT", null, true));
            HashSet hashSetM615k5 = C0141b.m615k(map5, "work_spec_id", new C7478a.a(2, 1, "work_spec_id", "TEXT", null, true), 1);
            hashSetM615k5.add(new C7478a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new C7478a.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            C7478a c7478a5 = new C7478a("WorkName", map5, hashSetM615k5, hashSet4);
            C7478a c7478aM14861a5 = C7478a.m14861a(frameworkSQLiteDatabase, "WorkName");
            if (!c7478a5.equals(c7478aM14861a5)) {
                return new C6594n.b(C0166e.m767m("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", c7478a5, "\n Found:\n", c7478aM14861a5), false);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new C7478a.a(1, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSetM615k6 = C0141b.m615k(map6, "progress", new C7478a.a(0, 1, "progress", "BLOB", null, true), 1);
            hashSetM615k6.add(new C7478a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C7478a c7478a6 = new C7478a("WorkProgress", map6, hashSetM615k6, new HashSet(0));
            C7478a c7478aM14861a6 = C7478a.m14861a(frameworkSQLiteDatabase, "WorkProgress");
            if (!c7478a6.equals(c7478aM14861a6)) {
                return new C6594n.b(C0166e.m767m("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", c7478a6, "\n Found:\n", c7478aM14861a6), false);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new C7478a.a(1, 1, "key", "TEXT", null, true));
            C7478a c7478a7 = new C7478a("Preference", map7, C0141b.m615k(map7, "long_value", new C7478a.a(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
            C7478a c7478aM14861a7 = C7478a.m14861a(frameworkSQLiteDatabase, "Preference");
            return !c7478a7.equals(c7478aM14861a7) ? new C6594n.b(C0166e.m767m("Preference(androidx.work.impl.model.Preference).\n Expected:\n", c7478a7, "\n Found:\n", c7478aM14861a7), false) : new C6594n.b(null, true);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: A */
    public final InterfaceC6621w mo4712A() {
        C6622x c6622x;
        if (this.f7837o != null) {
            return this.f7837o;
        }
        synchronized (this) {
            if (this.f7837o == null) {
                this.f7837o = new C6622x(this);
            }
            c6622x = this.f7837o;
        }
        return c6622x;
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: g */
    public final C6586f mo4556g() {
        return new C6586f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: h */
    public final InterfaceC7917c mo4557h(C6581a c6581a) {
        C6594n c6594n = new C6594n(c6581a, new C1248a(), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e");
        Context context = c6581a.f37406a;
        C5207g.m11111f(context, "context");
        return c6581a.f37408c.mo5467a(new InterfaceC7917c.b(context, c6581a.f37407b, c6594n, false, false));
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: i */
    public final List mo4558i(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new C1727y(0), new C1728z(0));
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: k */
    public final Set<Class<? extends InterfaceC7251a>> mo4560k() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: l */
    public final Map<Class<?>, List<Class<?>>> mo4561l() {
        HashMap map = new HashMap();
        map.put(InterfaceC6618t.class, Collections.emptyList());
        map.put(InterfaceC6600b.class, Collections.emptyList());
        map.put(InterfaceC6621w.class, Collections.emptyList());
        map.put(InterfaceC6608j.class, Collections.emptyList());
        map.put(InterfaceC6612n.class, Collections.emptyList());
        map.put(InterfaceC6615q.class, Collections.emptyList());
        map.put(InterfaceC6603e.class, Collections.emptyList());
        map.put(InterfaceC6606h.class, Collections.emptyList());
        return map;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: u */
    public final InterfaceC6600b mo4713u() {
        C6601c c6601c;
        if (this.f7836n != null) {
            return this.f7836n;
        }
        synchronized (this) {
            if (this.f7836n == null) {
                this.f7836n = new C6601c(this);
            }
            c6601c = this.f7836n;
        }
        return c6601c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: v */
    public final InterfaceC6603e mo4714v() {
        C6605g c6605g;
        if (this.f7841s != null) {
            return this.f7841s;
        }
        synchronized (this) {
            if (this.f7841s == null) {
                this.f7841s = new C6605g(this);
            }
            c6605g = this.f7841s;
        }
        return c6605g;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: w */
    public final InterfaceC6608j mo4715w() {
        C6609k c6609k;
        if (this.f7838p != null) {
            return this.f7838p;
        }
        synchronized (this) {
            if (this.f7838p == null) {
                this.f7838p = new C6609k(this);
            }
            c6609k = this.f7838p;
        }
        return c6609k;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: x */
    public final InterfaceC6612n mo4716x() {
        C6613o c6613o;
        if (this.f7839q != null) {
            return this.f7839q;
        }
        synchronized (this) {
            if (this.f7839q == null) {
                this.f7839q = new C6613o(this);
            }
            c6613o = this.f7839q;
        }
        return c6613o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: y */
    public final InterfaceC6615q mo4717y() {
        C6616r c6616r;
        if (this.f7840r != null) {
            return this.f7840r;
        }
        synchronized (this) {
            if (this.f7840r == null) {
                this.f7840r = new C6616r(this);
            }
            c6616r = this.f7840r;
        }
        return c6616r;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.work.impl.WorkDatabase
    /* JADX INFO: renamed from: z */
    public final InterfaceC6618t mo4718z() {
        C6619u c6619u;
        if (this.f7835m != null) {
            return this.f7835m;
        }
        synchronized (this) {
            if (this.f7835m == null) {
                this.f7835m = new C6619u(this);
            }
            c6619u = this.f7835m;
        }
        return c6619u;
    }
}
