package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lzo extends lzh {

    /* JADX INFO: renamed from: a */
    public final apt f39638a;

    /* JADX INFO: renamed from: b */
    public final aqa f39639b;

    public lzo(apt aptVar) {
        this.f39638a = aptVar;
        this.f39639b = new lzj(aptVar);
    }

    @Override // p000.lzh
    /* JADX INFO: renamed from: a */
    public final Object mo16247a(ols olsVar) {
        return aeo.m363i(this.f39638a, new lzi(this, 0), olsVar);
    }

    @Override // p000.lzh
    /* JADX INFO: renamed from: c */
    public final Object mo16248c(ols olsVar) {
        return aeo.m363i(this.f39638a, new lzi(this, 2), olsVar);
    }

    @Override // p000.lzh
    /* JADX INFO: renamed from: e */
    public final Object mo16249e(lwh lwhVar, ols olsVar) {
        apy apyVarM1841a = apy.m1841a("SELECT * FROM ResourceEntity WHERE status_uploadState IS ?", 1);
        apyVarM1841a.mo1845e(1, lyy.m16206w(lwhVar));
        return adr.m306b(this.f39638a, true, afj.m507g(), new lzl(this, apyVarM1841a), olsVar);
    }

    @Override // p000.lzh
    /* JADX INFO: renamed from: f */
    public final Object mo16250f(long j, lwh lwhVar, ols olsVar) {
        return adr.m307c(this.f39638a, new maa(this, lwhVar, j, 1), olsVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m16251g(HashMap map) {
        ArrayList arrayList;
        Set<Long> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        int i = 3;
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
        Cursor cursorM409e = aey.m409e(this.f39638a, apyVarM1841a, false);
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
