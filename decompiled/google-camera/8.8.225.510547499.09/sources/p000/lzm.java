package p000;

import android.database.Cursor;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lzm implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ apy f39631a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lzo f39632b;

    public lzm(lzo lzoVar, apy apyVar) {
        this.f39632b = lzoVar;
        this.f39631a = apyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        lzc lzcVar;
        this.f39632b.f39638a.m1825m();
        try {
            Cursor cursorM409e = aey.m409e(this.f39632b.f39638a, this.f39631a, true);
            try {
                int iM379o = aeq.m379o(cursorM409e, "title");
                int iM379o2 = aeq.m379o(cursorM409e, voNZjxiJou.MPvLDhfXwTx);
                int iM379o3 = aeq.m379o(cursorM409e, "queryableTags");
                int iM379o4 = aeq.m379o(cursorM409e, "queryableEpochTimestamp");
                int iM379o5 = aeq.m379o(cursorM409e, "queryableDuration");
                int iM379o6 = aeq.m379o(cursorM409e, "approximateTotalSize");
                int iM379o7 = aeq.m379o(cursorM409e, "namespaceId");
                int iM379o8 = aeq.m379o(cursorM409e, "partitionId");
                int iM379o9 = aeq.m379o(cursorM409e, "f250ResourceId");
                int iM379o10 = aeq.m379o(cursorM409e, "f250AutoUploadDelay");
                int iM379o11 = aeq.m379o(cursorM409e, "airlockExpiration");
                int iM379o12 = aeq.m379o(cursorM409e, "f250Expiration");
                int iM379o13 = aeq.m379o(cursorM409e, "wipeout");
                int iM379o14 = aeq.m379o(cursorM409e, "deleteAirlockFilesOnceUploaded");
                int iM379o15 = aeq.m379o(cursorM409e, "nonSignedInDataOwners");
                int iM379o16 = aeq.m379o(cursorM409e, "overridenObfuscatedGaiaId");
                int iM379o17 = aeq.m379o(cursorM409e, "uploadTransferHandle");
                int iM379o18 = aeq.m379o(cursorM409e, "relations");
                int iM379o19 = aeq.m379o(cursorM409e, "provenance");
                int iM379o20 = aeq.m379o(cursorM409e, "indexTokens");
                int iM379o21 = aeq.m379o(cursorM409e, "onDeviceId");
                int iM379o22 = aeq.m379o(cursorM409e, "status_addedToAirlockEpochTimestamp");
                int iM379o23 = aeq.m379o(cursorM409e, "status_uploadToF250RequestedEpochTimestamp");
                int iM379o24 = aeq.m379o(cursorM409e, voNZjxiJou.PuvEYLnEkikLq);
                int iM379o25 = aeq.m379o(cursorM409e, "status_airlockFileState");
                int iM379o26 = aeq.m379o(cursorM409e, "status_uploadState");
                int iM379o27 = aeq.m379o(cursorM409e, "status_uploadProgressPercent");
                HashMap map = new HashMap();
                while (true) {
                    lzcVar = null;
                    if (!cursorM409e.moveToNext()) {
                        break;
                    }
                    Long lValueOf = cursorM409e.isNull(iM379o21) ? null : Long.valueOf(cursorM409e.getLong(iM379o21));
                    if (lValueOf != null && !map.containsKey(lValueOf)) {
                        map.put(lValueOf, new ArrayList());
                        iM379o12 = iM379o12;
                    }
                }
                int i = iM379o21;
                int i2 = iM379o12;
                cursorM409e.moveToPosition(-1);
                this.f39632b.m16251g(map);
                if (cursorM409e.moveToFirst()) {
                    lzb lzbVar = new lzb(cursorM409e.isNull(iM379o) ? null : cursorM409e.getString(iM379o), cursorM409e.isNull(iM379o2) ? null : cursorM409e.getString(iM379o2), lyy.m16202s(cursorM409e.isNull(iM379o3) ? null : cursorM409e.getString(iM379o3)), lyy.m16194k(cursorM409e.isNull(iM379o4) ? null : Long.valueOf(cursorM409e.getLong(iM379o4))), lyy.m16195l(cursorM409e.isNull(iM379o5) ? null : Long.valueOf(cursorM409e.getLong(iM379o5))), cursorM409e.getLong(iM379o6), cursorM409e.isNull(iM379o7) ? null : cursorM409e.getString(iM379o7), cursorM409e.isNull(iM379o8) ? null : cursorM409e.getString(iM379o8), lyy.m16209z(cursorM409e.isNull(iM379o9) ? null : cursorM409e.getString(iM379o9)), lyy.m16195l(cursorM409e.isNull(iM379o10) ? null : Long.valueOf(cursorM409e.getLong(iM379o10))), lyy.m16195l(cursorM409e.isNull(iM379o11) ? null : Long.valueOf(cursorM409e.getLong(iM379o11))), lyy.m16195l(cursorM409e.isNull(i2) ? null : Long.valueOf(cursorM409e.getLong(i2))), lyy.m16189f(cursorM409e.isNull(iM379o13) ? null : cursorM409e.getBlob(iM379o13)), cursorM409e.getInt(iM379o14) != 0, lyy.m16201r(cursorM409e.isNull(iM379o15) ? null : cursorM409e.getString(iM379o15)), cursorM409e.isNull(iM379o16) ? null : cursorM409e.getString(iM379o16), cursorM409e.isNull(iM379o17) ? null : cursorM409e.getString(iM379o17), lyy.m16188e(cursorM409e.isNull(iM379o18) ? null : cursorM409e.getBlob(iM379o18)), lyy.m16187d(cursorM409e.isNull(iM379o19) ? null : cursorM409e.getBlob(iM379o19)), lyy.m16186c(cursorM409e.isNull(iM379o20) ? null : cursorM409e.getBlob(iM379o20)), new lxv(lyy.m16194k(cursorM409e.isNull(iM379o22) ? null : Long.valueOf(cursorM409e.getLong(iM379o22))), lyy.m16194k(cursorM409e.isNull(iM379o23) ? null : Long.valueOf(cursorM409e.getLong(iM379o23))), lyy.m16194k(cursorM409e.isNull(iM379o24) ? null : Long.valueOf(cursorM409e.getLong(iM379o24))), lyy.m16196m(cursorM409e.getInt(iM379o25)), lyy.m16197n(cursorM409e.getInt(iM379o26)), cursorM409e.getDouble(iM379o27)), cursorM409e.getLong(i));
                    Long lValueOf2 = cursorM409e.isNull(i) ? null : Long.valueOf(cursorM409e.getLong(i));
                    lzcVar = new lzc(lzbVar, lValueOf2 != null ? (ArrayList) map.get(lValueOf2) : new ArrayList());
                }
                this.f39632b.f39638a.m1829q();
                cursorM409e.close();
                this.f39631a.m1850j();
                this.f39632b.f39638a.m1827o();
                return lzcVar;
            } catch (Throwable th) {
                cursorM409e.close();
                this.f39631a.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            this.f39632b.f39638a.m1827o();
            throw th2;
        }
    }
}
