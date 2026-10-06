package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lxq implements lxn {

    /* JADX INFO: renamed from: a */
    public final apt f39526a;

    public lxq(apt aptVar) {
        this.f39526a = aptVar;
    }

    @Override // p000.lxn
    /* JADX INFO: renamed from: a */
    public final Object mo16118a(nzw nzwVar, lwh lwhVar, lvi lviVar, ols olsVar) {
        apy apyVarM1841a = apy.m1841a("\n      SELECT \n        MIN(\n          CASE \n            WHEN \n              ? < upload \n              AND (expiry IS NULL OR upload <= expiry OR expiry < ?) \n            THEN \n              upload\n            WHEN \n              ? < expiry \n              AND (upload IS NULL OR expiry < upload OR upload < ? ) \n            THEN \n              expiry\n            ELSE NULL \n          END\n        )\n      FROM (\n        SELECT\n          status_addedToAirlockEpochTimestamp + airlockExpiration / 1000000 AS expiry,\n          CASE\n            WHEN status_uploadState = ? \n              THEN status_addedToAirlockEpochTimestamp + f250AutoUploadDelay / 1000000\n            ELSE NULL \n          END AS upload\n        FROM ResourceEntity\n        WHERE\n          status_airlockFileState = ?\n      )\n    ", 6);
        Long lM16204u = lyy.m16204u(nzwVar);
        if (lM16204u == null) {
            apyVarM1841a.mo1846f(1);
        } else {
            apyVarM1841a.mo1845e(1, lM16204u.longValue());
        }
        Long lM16204u2 = lyy.m16204u(nzwVar);
        if (lM16204u2 == null) {
            apyVarM1841a.mo1846f(2);
        } else {
            apyVarM1841a.mo1845e(2, lM16204u2.longValue());
        }
        Long lM16204u3 = lyy.m16204u(nzwVar);
        if (lM16204u3 == null) {
            apyVarM1841a.mo1846f(3);
        } else {
            apyVarM1841a.mo1845e(3, lM16204u3.longValue());
        }
        Long lM16204u4 = lyy.m16204u(nzwVar);
        if (lM16204u4 == null) {
            apyVarM1841a.mo1846f(4);
        } else {
            apyVarM1841a.mo1845e(4, lM16204u4.longValue());
        }
        apyVarM1841a.mo1845e(5, lyy.m16206w(lwhVar));
        apyVarM1841a.mo1845e(6, lyy.m16184a(lviVar));
        return adr.m306b(this.f39526a, false, afj.m507g(), new kab(this, apyVarM1841a, 2), olsVar);
    }

    @Override // p000.lxn
    /* JADX INFO: renamed from: b */
    public final Object mo16119b(nzw nzwVar, Set set, lvi lviVar, ols olsVar) {
        StringBuilder sbM451l = afc.m451l();
        sbM451l.append("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState IN (");
        int size = set.size();
        afc.m452m(sbM451l, size);
        sbM451l.append(")\n        AND status_airlockFileState IS ?\n        AND status_addedToAirlockEpochTimestamp + airlockExpiration / 1000000 <= ?\n    ");
        int i = size + 2;
        apy apyVarM1841a = apy.m1841a(sbM451l.toString(), i);
        Iterator it = set.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            apyVarM1841a.mo1845e(i2, lyy.m16206w((lwh) it.next()));
            i2++;
        }
        apyVarM1841a.mo1845e(size + 1, lyy.m16184a(lviVar));
        Long lM16204u = lyy.m16204u(nzwVar);
        if (lM16204u == null) {
            apyVarM1841a.mo1846f(i);
        } else {
            apyVarM1841a.mo1845e(i, lM16204u.longValue());
        }
        return adr.m306b(this.f39526a, true, afj.m507g(), new lxp(this, apyVarM1841a), olsVar);
    }

    @Override // p000.lxn
    /* JADX INFO: renamed from: c */
    public final Object mo16120c(nzw nzwVar, lwh lwhVar, lvi lviVar, ols olsVar) {
        apy apyVarM1841a = apy.m1841a("\n      SELECT * FROM ResourceEntity\n      WHERE\n        status_uploadState IS ?\n        AND status_airlockFileState IS ?\n        AND status_addedToAirlockEpochTimestamp + f250AutoUploadDelay / 1000000 <= ?\n    ", 3);
        apyVarM1841a.mo1845e(1, lyy.m16206w(lwhVar));
        apyVarM1841a.mo1845e(2, lyy.m16184a(lviVar));
        Long lM16204u = lyy.m16204u(nzwVar);
        if (lM16204u == null) {
            apyVarM1841a.mo1846f(3);
        } else {
            apyVarM1841a.mo1845e(3, lM16204u.longValue());
        }
        return adr.m306b(this.f39526a, true, afj.m507g(), new lxo(this, apyVarM1841a), olsVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m16121d(HashMap map) {
        ArrayList arrayList;
        Set<Long> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 1;
        if (map.size() > 999) {
            afb.m439t(map, new lzi(this, i));
            return;
        }
        StringBuilder sbM451l = afc.m451l();
        sbM451l.append("SELECT `resourceOnDeviceId`,`isAttachment`,`id`,`contentType`,`provenance`,`onDeviceSize`,`uploadTransferHandle`,`blobstoreId`,`contentHash`,`onDeviceId`,`status_addedToAirlockEpochTimestamp`,`status_uploadToF250RequestedEpochTimestamp`,`status_uploadToF250CompletedEpochTimestamp`,`status_airlockFileState`,`status_uploadState`,`status_uploadProgressPercent` FROM `AnnotachmentEntity` WHERE `resourceOnDeviceId` IN (");
        int size = setKeySet == null ? 1 : setKeySet.size();
        afc.m452m(sbM451l, size);
        sbM451l.append(")");
        apy apyVarM1841a = apy.m1841a(sbM451l.toString(), size);
        if (setKeySet == null) {
            apyVarM1841a.mo1846f(1);
        } else {
            int i2 = 1;
            for (Long l : setKeySet) {
                if (l == null) {
                    apyVarM1841a.mo1846f(i2);
                } else {
                    apyVarM1841a.mo1845e(i2, l.longValue());
                }
                i2++;
            }
        }
        Cursor cursorM409e = aey.m409e(this.f39526a, apyVarM1841a, false);
        try {
            int iM378n = aeq.m378n(cursorM409e, "resourceOnDeviceId");
            if (iM378n != -1) {
                while (cursorM409e.moveToNext()) {
                    Long lValueOf = null;
                    Long lValueOf2 = cursorM409e.isNull(iM378n) ? null : Long.valueOf(cursorM409e.getLong(iM378n));
                    if (lValueOf2 != null && (arrayList = (ArrayList) map.get(lValueOf2)) != null) {
                        long j = cursorM409e.getLong(0);
                        lvl lvlVarM16205v = lyy.m16205v(cursorM409e.getInt(1));
                        lvk lvkVarM16200q = lyy.m16200q(cursorM409e.isNull(2) ? null : cursorM409e.getString(2));
                        String string = cursorM409e.isNull(3) ? null : cursorM409e.getString(3);
                        ocl oclVarM16187d = lyy.m16187d(cursorM409e.isNull(4) ? null : cursorM409e.getBlob(4));
                        long j2 = cursorM409e.getLong(5);
                        String string2 = cursorM409e.isNull(6) ? null : cursorM409e.getString(6);
                        String string3 = cursorM409e.isNull(7) ? null : cursorM409e.getString(7);
                        String string4 = cursorM409e.isNull(8) ? null : cursorM409e.getString(8);
                        long j3 = cursorM409e.getLong(9);
                        nzw nzwVarM16194k = lyy.m16194k(cursorM409e.isNull(10) ? null : Long.valueOf(cursorM409e.getLong(10)));
                        nzw nzwVarM16194k2 = lyy.m16194k(cursorM409e.isNull(11) ? null : Long.valueOf(cursorM409e.getLong(11)));
                        if (!cursorM409e.isNull(12)) {
                            lValueOf = Long.valueOf(cursorM409e.getLong(12));
                        }
                        arrayList.add(new lxm(j, lvlVarM16205v, lvkVarM16200q, string, oclVarM16187d, j2, string2, string3, string4, new lxv(nzwVarM16194k, nzwVarM16194k2, lyy.m16194k(lValueOf), lyy.m16196m(cursorM409e.getInt(13)), lyy.m16197n(cursorM409e.getInt(14)), cursorM409e.getDouble(15)), j3));
                    }
                }
            }
        } finally {
            cursorM409e.close();
        }
    }
}
