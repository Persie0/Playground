package p000;

import android.database.Cursor;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.material.behavior.iWN.zuAgeeF;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lza implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ aqv f39589a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lyz f39590b;

    public lza(lyz lyzVar, aqv aqvVar) {
        this.f39590b = lyzVar;
        this.f39589a = aqvVar;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List call() throws Throwable {
        List listM16202s;
        nzw nzwVarM16194k;
        nxd nxdVarM16195l;
        lvn lvnVarM16209z;
        nxd nxdVarM16195l2;
        nxd nxdVarM16195l3;
        nxd nxdVarM16195l4;
        nuw nuwVarM16189f;
        List listM16201r;
        ocm ocmVarM16188e;
        ocl oclVarM16187d;
        nut nutVarM16186c;
        nzw nzwVarM16194k2;
        nzw nzwVarM16194k3;
        nzw nzwVarM16194k4;
        lza lzaVar = this;
        ((apt) lzaVar.f39590b.f39584a).m1825m();
        try {
            try {
                Cursor cursorM409e = aey.m409e((apt) lzaVar.f39590b.f39584a, lzaVar.f39589a, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                    while (cursorM409e.moveToNext()) {
                        try {
                            int iM378n = aeq.m378n(cursorM409e, "title");
                            String str = IuyLAqNmW.IckTLLlctt;
                            String str2 = EArqVBjecl.yfzFoVFycvyqRMi;
                            String str3 = NptsKnlVczSZ.EbHlqVBOYZixTEq;
                            ArrayList arrayList2 = arrayList;
                            String str4 = zuAgeeF.AIFpemgeJanwYs;
                            int iM378n2 = aeq.m378n(cursorM409e, "experienceId");
                            int iM378n3 = aeq.m378n(cursorM409e, "queryableTags");
                            int iM378n4 = aeq.m378n(cursorM409e, "queryableEpochTimestamp");
                            int iM378n5 = aeq.m378n(cursorM409e, "queryableDuration");
                            int iM378n6 = aeq.m378n(cursorM409e, "approximateTotalSize");
                            int iM378n7 = aeq.m378n(cursorM409e, str4);
                            int iM378n8 = aeq.m378n(cursorM409e, "partitionId");
                            int iM378n9 = aeq.m378n(cursorM409e, "f250ResourceId");
                            int iM378n10 = aeq.m378n(cursorM409e, "f250AutoUploadDelay");
                            int iM378n11 = aeq.m378n(cursorM409e, "airlockExpiration");
                            int iM378n12 = aeq.m378n(cursorM409e, "f250Expiration");
                            int iM378n13 = aeq.m378n(cursorM409e, "wipeout");
                            int iM378n14 = aeq.m378n(cursorM409e, "deleteAirlockFilesOnceUploaded");
                            int iM378n15 = aeq.m378n(cursorM409e, "nonSignedInDataOwners");
                            int iM378n16 = aeq.m378n(cursorM409e, "overridenObfuscatedGaiaId");
                            int iM378n17 = aeq.m378n(cursorM409e, "uploadTransferHandle");
                            int iM378n18 = aeq.m378n(cursorM409e, "relations");
                            int iM378n19 = aeq.m378n(cursorM409e, "provenance");
                            int iM378n20 = aeq.m378n(cursorM409e, str3);
                            int iM378n21 = aeq.m378n(cursorM409e, str2);
                            int iM378n22 = aeq.m378n(cursorM409e, "status_addedToAirlockEpochTimestamp");
                            int iM378n23 = aeq.m378n(cursorM409e, "status_uploadToF250RequestedEpochTimestamp");
                            int iM378n24 = aeq.m378n(cursorM409e, str);
                            int iM378n25 = aeq.m378n(cursorM409e, "status_airlockFileState");
                            int iM378n26 = aeq.m378n(cursorM409e, "status_uploadState");
                            int iM378n27 = aeq.m378n(cursorM409e, "status_uploadProgressPercent");
                            String string = (iM378n == -1 || cursorM409e.isNull(iM378n)) ? null : cursorM409e.getString(iM378n);
                            String string2 = (iM378n2 == -1 || cursorM409e.isNull(iM378n2)) ? null : cursorM409e.getString(iM378n2);
                            if (iM378n3 == -1) {
                                listM16202s = null;
                            } else {
                                listM16202s = lyy.m16202s(cursorM409e.isNull(iM378n3) ? null : cursorM409e.getString(iM378n3));
                            }
                            if (iM378n4 == -1) {
                                nzwVarM16194k = null;
                            } else {
                                nzwVarM16194k = lyy.m16194k(cursorM409e.isNull(iM378n4) ? null : Long.valueOf(cursorM409e.getLong(iM378n4)));
                            }
                            if (iM378n5 == -1) {
                                nxdVarM16195l = null;
                            } else {
                                nxdVarM16195l = lyy.m16195l(cursorM409e.isNull(iM378n5) ? null : Long.valueOf(cursorM409e.getLong(iM378n5)));
                            }
                            long j = iM378n6 == -1 ? 0L : cursorM409e.getLong(iM378n6);
                            String string3 = (iM378n7 == -1 || cursorM409e.isNull(iM378n7)) ? null : cursorM409e.getString(iM378n7);
                            String string4 = (iM378n8 == -1 || cursorM409e.isNull(iM378n8)) ? null : cursorM409e.getString(iM378n8);
                            if (iM378n9 == -1) {
                                lvnVarM16209z = null;
                            } else {
                                lvnVarM16209z = lyy.m16209z(cursorM409e.isNull(iM378n9) ? null : cursorM409e.getString(iM378n9));
                            }
                            if (iM378n10 == -1) {
                                nxdVarM16195l2 = null;
                            } else {
                                nxdVarM16195l2 = lyy.m16195l(cursorM409e.isNull(iM378n10) ? null : Long.valueOf(cursorM409e.getLong(iM378n10)));
                            }
                            if (iM378n11 == -1) {
                                nxdVarM16195l3 = null;
                            } else {
                                nxdVarM16195l3 = lyy.m16195l(cursorM409e.isNull(iM378n11) ? null : Long.valueOf(cursorM409e.getLong(iM378n11)));
                            }
                            if (iM378n12 == -1) {
                                nxdVarM16195l4 = null;
                            } else {
                                nxdVarM16195l4 = lyy.m16195l(cursorM409e.isNull(iM378n12) ? null : Long.valueOf(cursorM409e.getLong(iM378n12)));
                            }
                            if (iM378n13 == -1) {
                                nuwVarM16189f = null;
                            } else {
                                nuwVarM16189f = lyy.m16189f(cursorM409e.isNull(iM378n13) ? null : cursorM409e.getBlob(iM378n13));
                            }
                            boolean z = (iM378n14 == -1 || cursorM409e.getInt(iM378n14) == 0) ? false : true;
                            if (iM378n15 == -1) {
                                listM16201r = null;
                            } else {
                                listM16201r = lyy.m16201r(cursorM409e.isNull(iM378n15) ? null : cursorM409e.getString(iM378n15));
                            }
                            String string5 = (iM378n16 == -1 || cursorM409e.isNull(iM378n16)) ? null : cursorM409e.getString(iM378n16);
                            String string6 = (iM378n17 == -1 || cursorM409e.isNull(iM378n17)) ? null : cursorM409e.getString(iM378n17);
                            if (iM378n18 == -1) {
                                ocmVarM16188e = null;
                            } else {
                                ocmVarM16188e = lyy.m16188e(cursorM409e.isNull(iM378n18) ? null : cursorM409e.getBlob(iM378n18));
                            }
                            if (iM378n19 == -1) {
                                oclVarM16187d = null;
                            } else {
                                oclVarM16187d = lyy.m16187d(cursorM409e.isNull(iM378n19) ? null : cursorM409e.getBlob(iM378n19));
                            }
                            if (iM378n20 == -1) {
                                nutVarM16186c = null;
                            } else {
                                nutVarM16186c = lyy.m16186c(cursorM409e.isNull(iM378n20) ? null : cursorM409e.getBlob(iM378n20));
                            }
                            long j2 = iM378n21 == -1 ? 0L : cursorM409e.getLong(iM378n21);
                            if (iM378n22 == -1) {
                                nzwVarM16194k2 = null;
                            } else {
                                nzwVarM16194k2 = lyy.m16194k(cursorM409e.isNull(iM378n22) ? null : Long.valueOf(cursorM409e.getLong(iM378n22)));
                            }
                            if (iM378n23 == -1) {
                                nzwVarM16194k3 = null;
                            } else {
                                nzwVarM16194k3 = lyy.m16194k(cursorM409e.isNull(iM378n23) ? null : Long.valueOf(cursorM409e.getLong(iM378n23)));
                            }
                            if (iM378n24 == -1) {
                                nzwVarM16194k4 = null;
                            } else {
                                nzwVarM16194k4 = lyy.m16194k(cursorM409e.isNull(iM378n24) ? null : Long.valueOf(cursorM409e.getLong(iM378n24)));
                            }
                            arrayList2.add(new lzb(string, string2, listM16202s, nzwVarM16194k, nxdVarM16195l, j, string3, string4, lvnVarM16209z, nxdVarM16195l2, nxdVarM16195l3, nxdVarM16195l4, nuwVarM16189f, z, listM16201r, string5, string6, ocmVarM16188e, oclVarM16187d, nutVarM16186c, new lxv(nzwVarM16194k2, nzwVarM16194k3, nzwVarM16194k4, iM378n25 == -1 ? null : lyy.m16196m(cursorM409e.getInt(iM378n25)), iM378n26 == -1 ? null : lyy.m16197n(cursorM409e.getInt(iM378n26)), iM378n27 == -1 ? 0.0d : cursorM409e.getDouble(iM378n27)), j2));
                            arrayList = arrayList2;
                            lzaVar = this;
                        } catch (Throwable th) {
                            th = th;
                            cursorM409e.close();
                            throw th;
                        }
                    }
                    ArrayList arrayList3 = arrayList;
                    try {
                        ((apt) this.f39590b.f39584a).m1829q();
                        cursorM409e.close();
                        ((apt) this.f39590b.f39584a).m1827o();
                        return arrayList3;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorM409e.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                ((apt) lzaVar.f39590b.f39584a).m1827o();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            ((apt) lzaVar.f39590b.f39584a).m1827o();
            throw th;
        }
    }
}
