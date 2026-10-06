package p000;

import android.database.Cursor;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase_Impl;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lyx extends apx {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ F250RoomDatabase_Impl f39581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lyx(F250RoomDatabase_Impl f250RoomDatabase_Impl) {
        super(7);
        this.f39581b = f250RoomDatabase_Impl;
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: a */
    public final void mo1834a(aqp aqpVar) {
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `ResourceEntity` (`title` TEXT, `experienceId` TEXT, `queryableTags` TEXT NOT NULL, `queryableEpochTimestamp` INTEGER, `queryableDuration` INTEGER, `approximateTotalSize` INTEGER NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `f250AutoUploadDelay` INTEGER, `airlockExpiration` INTEGER, `f250Expiration` INTEGER, `wipeout` BLOB, `deleteAirlockFilesOnceUploaded` INTEGER NOT NULL, `nonSignedInDataOwners` TEXT NOT NULL, `overridenObfuscatedGaiaId` TEXT, `uploadTransferHandle` TEXT, `relations` BLOB, `provenance` BLOB, `indexTokens` BLOB, `onDeviceId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status_addedToAirlockEpochTimestamp` INTEGER NOT NULL, `status_uploadToF250RequestedEpochTimestamp` INTEGER, `status_uploadToF250CompletedEpochTimestamp` INTEGER, `status_airlockFileState` INTEGER NOT NULL, `status_uploadState` INTEGER NOT NULL, `status_uploadProgressPercent` REAL NOT NULL)");
        aqpVar.mo1868g("CREATE VIRTUAL TABLE IF NOT EXISTS `ResourceFts` USING FTS4(`experienceId` TEXT, `queryableTags` TEXT NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `nonSignedInDataOwners` TEXT NOT NULL, content=`ResourceEntity`)");
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_UPDATE BEFORE UPDATE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_DELETE BEFORE DELETE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_UPDATE AFTER UPDATE ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_INSERT AFTER INSERT ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `AnnotachmentEntity` (`resourceOnDeviceId` INTEGER NOT NULL, `isAttachment` INTEGER NOT NULL, `id` TEXT, `contentType` TEXT, `provenance` BLOB, `onDeviceSize` INTEGER NOT NULL, `uploadTransferHandle` TEXT, `blobstoreId` TEXT, `contentHash` TEXT, `onDeviceId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status_addedToAirlockEpochTimestamp` INTEGER NOT NULL, `status_uploadToF250RequestedEpochTimestamp` INTEGER, `status_uploadToF250CompletedEpochTimestamp` INTEGER, `status_airlockFileState` INTEGER NOT NULL, `status_uploadState` INTEGER NOT NULL, `status_uploadProgressPercent` REAL NOT NULL, FOREIGN KEY(`resourceOnDeviceId`) REFERENCES `ResourceEntity`(`onDeviceId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        aqpVar.mo1868g("CREATE INDEX IF NOT EXISTS `index_AnnotachmentEntity_resourceOnDeviceId` ON `AnnotachmentEntity` (`resourceOnDeviceId`)");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `F250LogEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `resourceOnDeviceIds` TEXT NOT NULL, `f250LogAction` TEXT NOT NULL, `logEpochTimestamp` INTEGER NOT NULL, `f250LogReason` INTEGER NOT NULL, `errorMessage` TEXT)");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aqpVar.mo1868g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '12dd2799a8f9d4b7738f03f617a61c16')");
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: b */
    public final void mo1835b(aqp aqpVar) {
        aqpVar.mo1868g("DROP TABLE IF EXISTS `ResourceEntity`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `ResourceFts`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `AnnotachmentEntity`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `F250LogEntity`");
        List<aem> list = this.f39581b.f2068g;
        if (list != null) {
            for (aem aemVar : list) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: c */
    public final void mo1836c(aqp aqpVar) {
        this.f39581b.f2062a = aqpVar;
        aqpVar.mo1868g("PRAGMA foreign_keys = ON");
        this.f39581b.m1828p(aqpVar);
        List list = this.f39581b.f2068g;
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
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_UPDATE BEFORE UPDATE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_DELETE BEFORE DELETE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_UPDATE AFTER UPDATE ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        aqpVar.mo1868g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_INSERT AFTER INSERT ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: e */
    public final void mo1838e(aqp aqpVar) throws IOException {
        aey.m408d(aqpVar);
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: f */
    public final void mo1839f() {
        List<aem> list = this.f39581b.f2068g;
        if (list != null) {
            for (aem aemVar : list) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: g */
    public final npk mo1840g(aqp aqpVar) throws IOException {
        HashMap map = new HashMap(27);
        map.put("title", new aqe("title", "TEXT", false, 0, null, 1));
        map.put("experienceId", new aqe("experienceId", "TEXT", false, 0, null, 1));
        map.put("queryableTags", new aqe("queryableTags", "TEXT", true, 0, null, 1));
        map.put("queryableEpochTimestamp", new aqe("queryableEpochTimestamp", "INTEGER", false, 0, null, 1));
        map.put("queryableDuration", new aqe("queryableDuration", "INTEGER", false, 0, null, 1));
        map.put("approximateTotalSize", new aqe("approximateTotalSize", "INTEGER", true, 0, null, 1));
        map.put("namespaceId", new aqe("namespaceId", "TEXT", false, 0, null, 1));
        map.put("partitionId", new aqe("partitionId", "TEXT", false, 0, null, 1));
        map.put("f250ResourceId", new aqe("f250ResourceId", "TEXT", false, 0, null, 1));
        map.put("f250AutoUploadDelay", new aqe("f250AutoUploadDelay", "INTEGER", false, 0, null, 1));
        map.put("airlockExpiration", new aqe(rmwTRjObXLGH.yjpKpNoSBCQzYI, "INTEGER", false, 0, null, 1));
        map.put("f250Expiration", new aqe("f250Expiration", "INTEGER", false, 0, null, 1));
        map.put("wipeout", new aqe("wipeout", "BLOB", false, 0, null, 1));
        map.put("deleteAirlockFilesOnceUploaded", new aqe("deleteAirlockFilesOnceUploaded", "INTEGER", true, 0, null, 1));
        map.put("nonSignedInDataOwners", new aqe("nonSignedInDataOwners", "TEXT", true, 0, null, 1));
        map.put("overridenObfuscatedGaiaId", new aqe("overridenObfuscatedGaiaId", "TEXT", false, 0, null, 1));
        map.put("uploadTransferHandle", new aqe(NptsKnlVczSZ.cIFgpDcEDsntz, "TEXT", false, 0, null, 1));
        map.put("relations", new aqe("relations", "BLOB", false, 0, null, 1));
        map.put("provenance", new aqe("provenance", "BLOB", false, 0, null, 1));
        map.put("indexTokens", new aqe("indexTokens", "BLOB", false, 0, null, 1));
        map.put("onDeviceId", new aqe("onDeviceId", "INTEGER", true, 1, null, 1));
        map.put("status_addedToAirlockEpochTimestamp", new aqe("status_addedToAirlockEpochTimestamp", "INTEGER", true, 0, null, 1));
        map.put("status_uploadToF250RequestedEpochTimestamp", new aqe("status_uploadToF250RequestedEpochTimestamp", qQLA.nFRPacznGTgdeWC, false, 0, null, 1));
        map.put("status_uploadToF250CompletedEpochTimestamp", new aqe("status_uploadToF250CompletedEpochTimestamp", "INTEGER", false, 0, null, 1));
        map.put("status_airlockFileState", new aqe("status_airlockFileState", "INTEGER", true, 0, null, 1));
        map.put("status_uploadState", new aqe("status_uploadState", "INTEGER", true, 0, null, 1));
        map.put("status_uploadProgressPercent", new aqe("status_uploadProgressPercent", "REAL", true, 0, null, 1));
        aqi aqiVar = new aqi("ResourceEntity", map, new HashSet(0), new HashSet(0));
        aqi aqiVarM464h = afe.m464h(aqpVar, "ResourceEntity");
        if (!aqiVar.equals(aqiVarM464h)) {
            return new npk(false, "ResourceEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.ResourceEntity).\n Expected:\n" + aqiVar.toString() + "\n Found:\n" + aqiVarM464h.toString());
        }
        HashSet hashSet = new HashSet(6);
        hashSet.add("experienceId");
        hashSet.add("queryableTags");
        hashSet.add("namespaceId");
        hashSet.add("partitionId");
        hashSet.add("f250ResourceId");
        hashSet.add("nonSignedInDataOwners");
        aqd aqdVar = new aqd(hashSet, afa.m419b("CREATE VIRTUAL TABLE IF NOT EXISTS `ResourceFts` USING FTS4(`experienceId` TEXT, `queryableTags` TEXT NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `nonSignedInDataOwners` TEXT NOT NULL, content=`ResourceEntity`)"));
        Set setM18717v = omn.m18717v();
        Cursor cursorMo1863b = aqpVar.mo1863b("PRAGMA table_info(`ResourceFts`)");
        try {
            if (cursorMo1863b.getColumnCount() > 0) {
                int columnIndex = cursorMo1863b.getColumnIndex("name");
                while (cursorMo1863b.moveToNext()) {
                    String string = cursorMo1863b.getString(columnIndex);
                    string.getClass();
                    setM18717v.add(string);
                }
            }
            omn.m18709n(cursorMo1863b, null);
            omn.m18720y(setM18717v);
            Cursor cursorMo1863b2 = aqpVar.mo1863b("SELECT * FROM sqlite_master WHERE `name` = 'ResourceFts'");
            try {
                String string2 = cursorMo1863b2.moveToFirst() ? cursorMo1863b2.getString(cursorMo1863b2.getColumnIndexOrThrow("sql")) : "";
                omn.m18709n(cursorMo1863b2, null);
                string2.getClass();
                aqd aqdVar2 = new aqd(setM18717v, afa.m419b(string2));
                if (!aqdVar.equals(aqdVar2)) {
                    return new npk(false, "ResourceFts(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.ResourceFts).\n Expected:\n" + aqdVar.toString() + "\n Found:\n" + aqdVar2.toString());
                }
                HashMap map2 = new HashMap(16);
                map2.put("resourceOnDeviceId", new aqe("resourceOnDeviceId", "INTEGER", true, 0, null, 1));
                map2.put("isAttachment", new aqe("isAttachment", "INTEGER", true, 0, null, 1));
                map2.put("id", new aqe("id", "TEXT", false, 0, null, 1));
                map2.put("contentType", new aqe("contentType", "TEXT", false, 0, null, 1));
                map2.put("provenance", new aqe("provenance", "BLOB", false, 0, null, 1));
                map2.put("onDeviceSize", new aqe("onDeviceSize", "INTEGER", true, 0, null, 1));
                map2.put("uploadTransferHandle", new aqe("uploadTransferHandle", "TEXT", false, 0, null, 1));
                map2.put("blobstoreId", new aqe("blobstoreId", "TEXT", false, 0, null, 1));
                map2.put("contentHash", new aqe(BcwGDRhrTsnlj.EfJYFIROYdvpaR, "TEXT", false, 0, null, 1));
                map2.put("onDeviceId", new aqe("onDeviceId", xPAWq.bdSkUOi, true, 1, null, 1));
                map2.put("status_addedToAirlockEpochTimestamp", new aqe("status_addedToAirlockEpochTimestamp", "INTEGER", true, 0, null, 1));
                map2.put("status_uploadToF250RequestedEpochTimestamp", new aqe("status_uploadToF250RequestedEpochTimestamp", "INTEGER", false, 0, null, 1));
                map2.put("status_uploadToF250CompletedEpochTimestamp", new aqe("status_uploadToF250CompletedEpochTimestamp", "INTEGER", false, 0, null, 1));
                map2.put("status_airlockFileState", new aqe("status_airlockFileState", "INTEGER", true, 0, null, 1));
                map2.put("status_uploadState", new aqe("status_uploadState", "INTEGER", true, 0, null, 1));
                map2.put("status_uploadProgressPercent", new aqe("status_uploadProgressPercent", "REAL", true, 0, null, 1));
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new aqf("ResourceEntity", "NO ACTION", "NO ACTION", Arrays.asList("resourceOnDeviceId"), Arrays.asList("onDeviceId")));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new aqh("index_AnnotachmentEntity_resourceOnDeviceId", false, Arrays.asList("resourceOnDeviceId"), Arrays.asList("ASC")));
                aqi aqiVar2 = new aqi("AnnotachmentEntity", map2, hashSet2, hashSet3);
                aqi aqiVarM464h2 = afe.m464h(aqpVar, "AnnotachmentEntity");
                if (!aqiVar2.equals(aqiVarM464h2)) {
                    return new npk(false, "AnnotachmentEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.AnnotachmentEntity).\n Expected:\n" + aqiVar2.toString() + "\n Found:\n" + aqiVarM464h2.toString());
                }
                HashMap map3 = new HashMap(6);
                map3.put("id", new aqe("id", "INTEGER", true, 1, null, 1));
                map3.put("resourceOnDeviceIds", new aqe("resourceOnDeviceIds", "TEXT", true, 0, null, 1));
                map3.put("f250LogAction", new aqe("f250LogAction", "TEXT", true, 0, null, 1));
                map3.put("logEpochTimestamp", new aqe("logEpochTimestamp", "INTEGER", true, 0, null, 1));
                map3.put("f250LogReason", new aqe("f250LogReason", "INTEGER", true, 0, null, 1));
                map3.put("errorMessage", new aqe("errorMessage", "TEXT", false, 0, null, 1));
                aqi aqiVar3 = new aqi("F250LogEntity", map3, new HashSet(0), new HashSet(0));
                aqi aqiVarM464h3 = afe.m464h(aqpVar, "F250LogEntity");
                if (aqiVar3.equals(aqiVarM464h3)) {
                    return new npk(true, (String) null);
                }
                return new npk(false, "F250LogEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250LogEntity).\n Expected:\n" + aqiVar3.toString() + "\n Found:\n" + aqiVarM464h3.toString());
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    omn.m18709n(cursorMo1863b2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                omn.m18709n(cursorMo1863b, th3);
                throw th4;
            }
        }
    }
}
