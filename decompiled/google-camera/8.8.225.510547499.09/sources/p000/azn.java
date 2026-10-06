package p000;

import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azn extends apx {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ WorkDatabase_Impl f2776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azn(WorkDatabase_Impl workDatabase_Impl) {
        super(17);
        this.f2776b = workDatabase_Impl;
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: a */
    public final void mo1834a(aqp aqpVar) {
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aqpVar.mo1868g(HRLmc.URe);
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aqpVar.mo1868g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9a88f3f80fa3930a8acb506b8ba7ca77')");
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: b */
    public final void mo1835b(aqp aqpVar) {
        aqpVar.mo1868g("DROP TABLE IF EXISTS `Dependency`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `WorkSpec`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `WorkTag`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `SystemIdInfo`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `WorkName`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `WorkProgress`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `Preference`");
        List list = this.f2776b.f2068g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: c */
    public final void mo1836c(aqp aqpVar) {
        this.f2776b.f2062a = aqpVar;
        aqpVar.mo1868g("PRAGMA foreign_keys = ON");
        this.f2776b.m1828p(aqpVar);
        List list = this.f2776b.f2068g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((aem) this.f2776b.f2068g.get(i)).mo353d(aqpVar);
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: d */
    public final void mo1837d(aqp aqpVar) {
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: e */
    public final void mo1838e(aqp aqpVar) throws IOException {
        aey.m408d(aqpVar);
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: f */
    public final void mo1839f() {
        List list = this.f2776b.f2068g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: g */
    public final npk mo1840g(aqp aqpVar) throws IOException {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new aqe("work_spec_id", "TEXT", true, 1, null, 1));
        map.put("prerequisite_id", new aqe("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new aqf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new aqf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new aqh("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new aqh(IuyLAqNmW.DKlMhvNvzrqnlGw, false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        aqi aqiVar = new aqi("Dependency", map, hashSet, hashSet2);
        aqi aqiVarM464h = afe.m464h(aqpVar, "Dependency");
        if (!aqiVar.equals(aqiVarM464h)) {
            return new npk(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + aqiVar + "\n Found:\n" + aqiVarM464h);
        }
        HashMap map2 = new HashMap(27);
        map2.put("id", new aqe("id", "TEXT", true, 1, null, 1));
        map2.put("state", new aqe("state", "INTEGER", true, 0, null, 1));
        map2.put("worker_class_name", new aqe("worker_class_name", "TEXT", true, 0, null, 1));
        map2.put("input_merger_class_name", new aqe("input_merger_class_name", "TEXT", true, 0, null, 1));
        map2.put("input", new aqe("input", "BLOB", true, 0, null, 1));
        map2.put("output", new aqe("output", "BLOB", true, 0, null, 1));
        map2.put("initial_delay", new aqe("initial_delay", "INTEGER", true, 0, null, 1));
        map2.put("interval_duration", new aqe("interval_duration", "INTEGER", true, 0, null, 1));
        map2.put("flex_duration", new aqe(BcwGDRhrTsnlj.gVz, "INTEGER", true, 0, null, 1));
        map2.put("run_attempt_count", new aqe("run_attempt_count", "INTEGER", true, 0, null, 1));
        map2.put("backoff_policy", new aqe("backoff_policy", "INTEGER", true, 0, null, 1));
        map2.put("backoff_delay_duration", new aqe("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        map2.put("last_enqueue_time", new aqe("last_enqueue_time", "INTEGER", true, 0, null, 1));
        map2.put("minimum_retention_duration", new aqe("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        map2.put("schedule_requested_at", new aqe("schedule_requested_at", "INTEGER", true, 0, null, 1));
        map2.put("run_in_foreground", new aqe("run_in_foreground", "INTEGER", true, 0, null, 1));
        map2.put("out_of_quota_policy", new aqe("out_of_quota_policy", "INTEGER", true, 0, null, 1));
        map2.put("period_count", new aqe("period_count", "INTEGER", true, 0, wUzNh.AMtejtG, 1));
        map2.put("generation", new aqe(VzWFSVj.VFxVKbyGtOvgA, "INTEGER", true, 0, "0", 1));
        map2.put("required_network_type", new aqe("required_network_type", "INTEGER", true, 0, null, 1));
        map2.put("requires_charging", new aqe("requires_charging", "INTEGER", true, 0, null, 1));
        map2.put("requires_device_idle", new aqe("requires_device_idle", "INTEGER", true, 0, null, 1));
        map2.put("requires_battery_not_low", new aqe("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        map2.put("requires_storage_not_low", new aqe("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        map2.put("trigger_content_update_delay", new aqe("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        map2.put("trigger_max_content_delay", new aqe("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        map2.put("content_uri_triggers", new aqe("content_uri_triggers", "BLOB", true, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new aqh("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new aqh("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        aqi aqiVar2 = new aqi("WorkSpec", map2, hashSet3, hashSet4);
        aqi aqiVarM464h2 = afe.m464h(aqpVar, "WorkSpec");
        if (!aqiVar2.equals(aqiVarM464h2)) {
            return new npk(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + aqiVar2 + "\n Found:\n" + aqiVarM464h2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new aqe("tag", "TEXT", true, 1, null, 1));
        map3.put("work_spec_id", new aqe("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new aqf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new aqh("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        aqi aqiVar3 = new aqi("WorkTag", map3, hashSet5, hashSet6);
        aqi aqiVarM464h3 = afe.m464h(aqpVar, "WorkTag");
        if (!aqiVar3.equals(aqiVarM464h3)) {
            return new npk(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + aqiVar3 + "\n Found:\n" + aqiVarM464h3);
        }
        HashMap map4 = new HashMap(3);
        map4.put("work_spec_id", new aqe("work_spec_id", "TEXT", true, 1, null, 1));
        map4.put("generation", new aqe("generation", "INTEGER", true, 2, "0", 1));
        map4.put("system_id", new aqe(IuyLAqNmW.rjTQST, "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new aqf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        aqi aqiVar4 = new aqi("SystemIdInfo", map4, hashSet7, new HashSet(0));
        aqi aqiVarM464h4 = afe.m464h(aqpVar, "SystemIdInfo");
        if (!aqiVar4.equals(aqiVarM464h4)) {
            return new npk(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + aqiVar4 + "\n Found:\n" + aqiVarM464h4);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new aqe("name", "TEXT", true, 1, null, 1));
        map5.put("work_spec_id", new aqe("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new aqf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new aqh("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        aqi aqiVar5 = new aqi("WorkName", map5, hashSet8, hashSet9);
        aqi aqiVarM464h5 = afe.m464h(aqpVar, "WorkName");
        if (!aqiVar5.equals(aqiVarM464h5)) {
            return new npk(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + aqiVar5 + "\n Found:\n" + aqiVarM464h5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new aqe("work_spec_id", "TEXT", true, 1, null, 1));
        map6.put("progress", new aqe("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new aqf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet11 = new HashSet(0);
        String str = KMNlNMe.PlapcYqqYSpstqU;
        aqi aqiVar6 = new aqi(str, map6, hashSet10, hashSet11);
        aqi aqiVarM464h6 = afe.m464h(aqpVar, str);
        if (!aqiVar6.equals(aqiVarM464h6)) {
            return new npk(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + aqiVar6 + "\n Found:\n" + aqiVarM464h6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new aqe("key", rmwTRjObXLGH.NldULgVvTgFQ, true, 1, null, 1));
        map7.put("long_value", new aqe("long_value", "INTEGER", false, 0, null, 1));
        aqi aqiVar7 = new aqi("Preference", map7, new HashSet(0), new HashSet(0));
        aqi aqiVarM464h7 = afe.m464h(aqpVar, "Preference");
        if (aqiVar7.equals(aqiVarM464h7)) {
            return new npk(true, (String) null);
        }
        return new npk(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + aqiVar7 + "\n Found:\n" + aqiVarM464h7);
    }
}
