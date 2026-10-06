package p000;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lmt {

    /* JADX INFO: renamed from: a */
    private static final nbh f38708a = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/storage/PackageStatsCaptureO");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.UUID] */
    /* JADX INFO: renamed from: a */
    static PackageStats m15735a(Context context) {
        UUID uuid;
        UUID uuidFromString;
        lij.m15452v();
        StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
        if (storageManager == null) {
            ((nbe) ((nbe) f38708a.m17251b()).mo17276G((char) 4561)).mo17290o("StorageManager is not available");
            return null;
        }
        try {
            try {
                StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
                String packageName = context.getPackageName();
                PackageStats packageStats = new PackageStats(packageName);
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    if (storageVolume.getState().equals("mounted")) {
                        Object uuid2 = storageVolume.getUuid();
                        if ("1AEF-1A1E".equals(uuid2)) {
                            uuid = 0;
                        } else if (uuid2 == 0) {
                            try {
                                uuid2 = StorageManager.UUID_DEFAULT;
                                uuid = uuid2;
                            } catch (IllegalArgumentException e) {
                                ((nbe) ((nbe) ((nbe) f38708a.m17252c()).mo17283h(e)).mo17276G((char) 4563)).mo17293r("Invalid UUID format: '%s'", uuid2);
                                uuid = 0;
                            }
                        } else {
                            uuidFromString = UUID.fromString(uuid2);
                        }
                        if (uuid != 0) {
                            try {
                                uuid = uuidFromString;
                                StorageStats storageStatsQueryStatsForPackage = storageStatsManager.queryStatsForPackage(uuid, packageName, Process.myUserHandle());
                                if (StorageManager.UUID_DEFAULT.equals(uuid)) {
                                    packageStats.codeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                    packageStats.dataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                    packageStats.cacheSize += storageStatsQueryStatsForPackage.getCacheBytes();
                                } else {
                                    packageStats.externalCodeSize += storageStatsQueryStatsForPackage.getAppBytes();
                                    packageStats.externalDataSize += storageStatsQueryStatsForPackage.getDataBytes() - storageStatsQueryStatsForPackage.getCacheBytes();
                                    packageStats.externalCacheSize += storageStatsQueryStatsForPackage.getCacheBytes();
                                }
                            } catch (PackageManager.NameNotFoundException | IOException | RuntimeException e2) {
                                ((nbe) ((nbe) ((nbe) f38708a.m17252c()).mo17283h(e2)).mo17276G(4559)).mo17290o("queryStatsForPackage() call failed");
                            }
                        } else {
                            uuid = uuidFromString;
                        }
                    }
                }
                return packageStats;
            } catch (Error e3) {
                e = e3;
                ((nbe) ((nbe) ((nbe) f38708a.m17252c()).mo17283h(e)).mo17276G((char) 4560)).mo17290o("StorageStatsManager is not available");
                return null;
            }
        } catch (RuntimeException e4) {
            e = e4;
            ((nbe) ((nbe) ((nbe) f38708a.m17252c()).mo17283h(e)).mo17276G((char) 4560)).mo17290o("StorageStatsManager is not available");
            return null;
        }
    }
}
