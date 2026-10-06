package p000;

import com.google.android.apps.camera.debug.shottracker.p009db.ShotDatabase_Impl;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmg extends apx {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ShotDatabase_Impl f12018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmg(ShotDatabase_Impl shotDatabase_Impl) {
        super(9);
        this.f12018b = shotDatabase_Impl;
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: a */
    public final void mo1834a(aqp aqpVar) {
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `shots` (`shot_id` INTEGER NOT NULL, `title` TEXT, `start_millis` INTEGER NOT NULL, `persisted_millis` INTEGER NOT NULL, `canceled_millis` INTEGER NOT NULL, `deleted_millis` INTEGER NOT NULL, `most_recent_event_millis` INTEGER NOT NULL, `capture_session_type` TEXT, `capture_session_shot_id` TEXT, `pid` INTEGER NOT NULL, `stuck` INTEGER NOT NULL, `failed` INTEGER NOT NULL, PRIMARY KEY(`shot_id`))");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `shot_log` (`sequence` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `shot_id` INTEGER NOT NULL, `time_millis` INTEGER NOT NULL, `message` TEXT, FOREIGN KEY(`shot_id`) REFERENCES `shots`(`shot_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_shot_log_shot_id_sequence` ON `shot_log` (`shot_id`, `sequence`)");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aqpVar.mo1868g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd5a320f0e030e16072c0c60f65398e1d')");
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: b */
    public final void mo1835b(aqp aqpVar) {
        aqpVar.mo1868g("DROP TABLE IF EXISTS `shots`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `shot_log`");
        List<aem> list = this.f12018b.f2068g;
        if (list != null) {
            for (aem aemVar : list) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: c */
    public final void mo1836c(aqp aqpVar) {
        this.f12018b.f2062a = aqpVar;
        aqpVar.mo1868g("PRAGMA foreign_keys = ON");
        this.f12018b.m1828p(aqpVar);
        List list = this.f12018b.f2068g;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((aem) it.next()).mo353d(aqpVar);
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
        List<aem> list = this.f12018b.f2068g;
        if (list != null) {
            for (aem aemVar : list) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: g */
    public final npk mo1840g(aqp aqpVar) throws IOException {
        HashMap map = new HashMap(12);
        map.put("shot_id", new aqe("shot_id", "INTEGER", true, 1, null, 1));
        map.put("title", new aqe("title", "TEXT", false, 0, null, 1));
        map.put(NptsKnlVczSZ.znhDWaW, new aqe("start_millis", "INTEGER", true, 0, null, 1));
        map.put("persisted_millis", new aqe("persisted_millis", "INTEGER", true, 0, null, 1));
        map.put("canceled_millis", new aqe("canceled_millis", CswIK.dhrMInLZXLVJat, true, 0, null, 1));
        map.put("deleted_millis", new aqe("deleted_millis", "INTEGER", true, 0, null, 1));
        map.put("most_recent_event_millis", new aqe("most_recent_event_millis", "INTEGER", true, 0, null, 1));
        map.put("capture_session_type", new aqe("capture_session_type", "TEXT", false, 0, null, 1));
        map.put("capture_session_shot_id", new aqe("capture_session_shot_id", "TEXT", false, 0, null, 1));
        map.put("pid", new aqe("pid", "INTEGER", true, 0, null, 1));
        map.put("stuck", new aqe("stuck", "INTEGER", true, 0, null, 1));
        map.put("failed", new aqe("failed", "INTEGER", true, 0, null, 1));
        aqi aqiVar = new aqi("shots", map, new HashSet(0), new HashSet(0));
        aqi aqiVarM464h = afe.m464h(aqpVar, "shots");
        if (!aqiVar.equals(aqiVarM464h)) {
            return new npk(false, "shots(com.google.android.apps.camera.debug.shottracker.db.ShotEntity).\n Expected:\n" + aqiVar.toString() + "\n Found:\n" + aqiVarM464h.toString());
        }
        HashMap map2 = new HashMap(4);
        map2.put("sequence", new aqe("sequence", "INTEGER", true, 1, null, 1));
        map2.put("shot_id", new aqe(aJFPpVSaoDO.Jha, "INTEGER", true, 0, null, 1));
        map2.put("time_millis", new aqe("time_millis", "INTEGER", true, 0, null, 1));
        map2.put("message", new aqe("message", "TEXT", false, 0, null, 1));
        HashSet hashSet = new HashSet(1);
        hashSet.add(new aqf("shots", "CASCADE", "NO ACTION", Arrays.asList("shot_id"), Arrays.asList("shot_id")));
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new aqh("index_shot_log_shot_id_sequence", false, Arrays.asList("shot_id", "sequence"), Arrays.asList("ASC", "ASC")));
        aqi aqiVar2 = new aqi("shot_log", map2, hashSet, hashSet2);
        aqi aqiVarM464h2 = afe.m464h(aqpVar, "shot_log");
        if (aqiVar2.equals(aqiVarM464h2)) {
            return new npk(true, (String) null);
        }
        return new npk(false, "shot_log(com.google.android.apps.camera.debug.shottracker.db.ShotLogEntity).\n Expected:\n" + aqiVar2.toString() + "\n Found:\n" + aqiVarM464h2.toString());
    }
}
