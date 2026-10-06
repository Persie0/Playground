package p000;

import android.database.Cursor;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lzl implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ apy f39629a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lzo f39630b;

    public lzl(lzo lzoVar, apy apyVar) {
        this.f39630b = lzoVar;
        this.f39629a = apyVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f39630b.f39638a.m1825m();
        try {
            Cursor cursorM409e = aey.m409e(this.f39630b.f39638a, this.f39629a, true);
            try {
                int iM379o = aeq.m379o(cursorM409e, "title");
                int iM379o2 = aeq.m379o(cursorM409e, "experienceId");
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
                int i = iM379o13;
                int iM379o22 = aeq.m379o(cursorM409e, "status_addedToAirlockEpochTimestamp");
                int iM379o23 = aeq.m379o(cursorM409e, "status_uploadToF250RequestedEpochTimestamp");
                int iM379o24 = aeq.m379o(cursorM409e, hsSUWRJfoeC.PVfwtNNKLjrDS);
                int iM379o25 = aeq.m379o(cursorM409e, "status_airlockFileState");
                int iM379o26 = aeq.m379o(cursorM409e, "status_uploadState");
                int iM379o27 = aeq.m379o(cursorM409e, "status_uploadProgressPercent");
                HashMap map = new HashMap();
                while (cursorM409e.moveToNext()) {
                    Long lValueOf = cursorM409e.isNull(iM379o21) ? null : Long.valueOf(cursorM409e.getLong(iM379o21));
                    if (lValueOf != null && !map.containsKey(lValueOf)) {
                        map.put(lValueOf, new ArrayList());
                        iM379o12 = iM379o12;
                    }
                }
                int i2 = iM379o21;
                int i3 = iM379o12;
                cursorM409e.moveToPosition(-1);
                this.f39630b.m16251g(map);
                ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                while (cursorM409e.moveToNext()) {
                    String string = cursorM409e.isNull(iM379o) ? null : cursorM409e.getString(iM379o);
                    String string2 = cursorM409e.isNull(iM379o2) ? null : cursorM409e.getString(iM379o2);
                    List listM16202s = lyy.m16202s(cursorM409e.isNull(iM379o3) ? null : cursorM409e.getString(iM379o3));
                    nzw nzwVarM16194k = lyy.m16194k(cursorM409e.isNull(iM379o4) ? null : Long.valueOf(cursorM409e.getLong(iM379o4)));
                    nxd nxdVarM16195l = lyy.m16195l(cursorM409e.isNull(iM379o5) ? null : Long.valueOf(cursorM409e.getLong(iM379o5)));
                    long j = cursorM409e.getLong(iM379o6);
                    String string3 = cursorM409e.isNull(iM379o7) ? null : cursorM409e.getString(iM379o7);
                    String string4 = cursorM409e.isNull(iM379o8) ? null : cursorM409e.getString(iM379o8);
                    lvn lvnVarM16209z = lyy.m16209z(cursorM409e.isNull(iM379o9) ? null : cursorM409e.getString(iM379o9));
                    nxd nxdVarM16195l2 = lyy.m16195l(cursorM409e.isNull(iM379o10) ? null : Long.valueOf(cursorM409e.getLong(iM379o10)));
                    nxd nxdVarM16195l3 = lyy.m16195l(cursorM409e.isNull(iM379o11) ? null : Long.valueOf(cursorM409e.getLong(iM379o11)));
                    int i4 = i3;
                    nxd nxdVarM16195l4 = lyy.m16195l(cursorM409e.isNull(i4) ? null : Long.valueOf(cursorM409e.getLong(i4)));
                    int i5 = iM379o;
                    int i6 = i;
                    nuw nuwVarM16189f = lyy.m16189f(cursorM409e.isNull(i6) ? null : cursorM409e.getBlob(i6));
                    i = i6;
                    int i7 = iM379o14;
                    boolean z = cursorM409e.getInt(i7) != 0;
                    iM379o14 = i7;
                    int i8 = iM379o15;
                    List listM16201r = lyy.m16201r(cursorM409e.isNull(i8) ? null : cursorM409e.getString(i8));
                    iM379o15 = i8;
                    int i9 = iM379o16;
                    String string5 = cursorM409e.isNull(i9) ? null : cursorM409e.getString(i9);
                    iM379o16 = i9;
                    int i10 = iM379o17;
                    String string6 = cursorM409e.isNull(i10) ? null : cursorM409e.getString(i10);
                    iM379o17 = i10;
                    int i11 = iM379o18;
                    ocm ocmVarM16188e = lyy.m16188e(cursorM409e.isNull(i11) ? null : cursorM409e.getBlob(i11));
                    iM379o18 = i11;
                    int i12 = iM379o19;
                    ocl oclVarM16187d = lyy.m16187d(cursorM409e.isNull(i12) ? null : cursorM409e.getBlob(i12));
                    iM379o19 = i12;
                    int i13 = iM379o20;
                    nut nutVarM16186c = lyy.m16186c(cursorM409e.isNull(i13) ? null : cursorM409e.getBlob(i13));
                    iM379o20 = i13;
                    int i14 = i2;
                    long j2 = cursorM409e.getLong(i14);
                    int i15 = iM379o2;
                    int i16 = iM379o22;
                    nzw nzwVarM16194k2 = lyy.m16194k(cursorM409e.isNull(i16) ? null : Long.valueOf(cursorM409e.getLong(i16)));
                    iM379o22 = i16;
                    int i17 = iM379o23;
                    nzw nzwVarM16194k3 = lyy.m16194k(cursorM409e.isNull(i17) ? null : Long.valueOf(cursorM409e.getLong(i17)));
                    iM379o23 = i17;
                    int i18 = iM379o24;
                    nzw nzwVarM16194k4 = lyy.m16194k(cursorM409e.isNull(i18) ? null : Long.valueOf(cursorM409e.getLong(i18)));
                    iM379o24 = i18;
                    int i19 = iM379o25;
                    lvi lviVarM16196m = lyy.m16196m(cursorM409e.getInt(i19));
                    iM379o25 = i19;
                    int i20 = iM379o26;
                    lwh lwhVarM16197n = lyy.m16197n(cursorM409e.getInt(i20));
                    iM379o26 = i20;
                    int i21 = iM379o27;
                    iM379o27 = i21;
                    lzb lzbVar = new lzb(string, string2, listM16202s, nzwVarM16194k, nxdVarM16195l, j, string3, string4, lvnVarM16209z, nxdVarM16195l2, nxdVarM16195l3, nxdVarM16195l4, nuwVarM16189f, z, listM16201r, string5, string6, ocmVarM16188e, oclVarM16187d, nutVarM16186c, new lxv(nzwVarM16194k2, nzwVarM16194k3, nzwVarM16194k4, lviVarM16196m, lwhVarM16197n, cursorM409e.getDouble(i21)), j2);
                    Long lValueOf2 = cursorM409e.isNull(i14) ? null : Long.valueOf(cursorM409e.getLong(i14));
                    arrayList.add(new lzc(lzbVar, lValueOf2 != null ? (ArrayList) map.get(lValueOf2) : new ArrayList()));
                    iM379o2 = i15;
                    iM379o = i5;
                    iM379o3 = iM379o3;
                    i2 = i14;
                    i3 = i4;
                }
                this.f39630b.f39638a.m1829q();
                cursorM409e.close();
                this.f39629a.m1850j();
                this.f39630b.f39638a.m1827o();
                return arrayList;
            } catch (Throwable th) {
                cursorM409e.close();
                this.f39629a.m1850j();
                throw th;
            }
        } catch (Throwable th2) {
            this.f39630b.f39638a.m1827o();
            throw th2;
        }
    }
}
