package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase_Impl;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dcq extends apx {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ CameraFatalErrorTrackerDatabase_Impl f10517b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcq(CameraFatalErrorTrackerDatabase_Impl cameraFatalErrorTrackerDatabase_Impl) {
        super(5);
        this.f10517b = cameraFatalErrorTrackerDatabase_Impl;
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: a */
    public final void mo1834a(aqp aqpVar) {
        aqpVar.mo1868g(VCYBIzY.LLISBUgQRZNLE);
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `EnumerationErrorCounts` (`errorCode` INTEGER NOT NULL, `failuresBeforeReboot` INTEGER NOT NULL, `failuresAfterReboot` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, `lastFailureTimestamp` INTEGER NOT NULL, PRIMARY KEY(`errorCode`))");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS `HardwareHelpDialogCounts` (`reason` INTEGER, `impressionsBeforeReboot` INTEGER NOT NULL, `impressionsAfterReboot` INTEGER NOT NULL, `rebootCount` INTEGER NOT NULL, PRIMARY KEY(`reason`))");
        aqpVar.mo1868g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aqpVar.mo1868g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e7b45086cd950266a3a3a8f0da0a57b0')");
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: b */
    public final void mo1835b(aqp aqpVar) {
        aqpVar.mo1868g("DROP TABLE IF EXISTS `FatalErrorCounts`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `EnumerationErrorCounts`");
        aqpVar.mo1868g("DROP TABLE IF EXISTS `HardwareHelpDialogCounts`");
        List<aem> list = this.f10517b.f2068g;
        if (list != null) {
            for (aem aemVar : list) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: c */
    public final void mo1836c(aqp aqpVar) {
        this.f10517b.f2062a = aqpVar;
        this.f10517b.m1828p(aqpVar);
        List list = this.f10517b.f2068g;
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
        List<aem> list = this.f10517b.f2068g;
        if (list != null) {
            for (aem aemVar : list) {
            }
        }
    }

    @Override // p000.apx
    /* JADX INFO: renamed from: g */
    public final npk mo1840g(aqp aqpVar) throws IOException {
        HashMap map = new HashMap(7);
        map.put("cameraId", new aqe("cameraId", "TEXT", true, 1, null, 1));
        map.put("failuresBeforeRebootDuringOpen", new aqe("failuresBeforeRebootDuringOpen", "INTEGER", true, 0, null, 1));
        map.put("failuresAfterRebootDuringOpen", new aqe("failuresAfterRebootDuringOpen", "INTEGER", true, 0, null, 1));
        map.put("failuresBeforeRebootDuringSession", new aqe("failuresBeforeRebootDuringSession", "INTEGER", true, 0, null, 1));
        map.put("failuresAfterRebootDuringSession", new aqe("failuresAfterRebootDuringSession", "INTEGER", true, 0, null, 1));
        map.put("lastFatalErrorTimestamp", new aqe("lastFatalErrorTimestamp", "INTEGER", true, 0, null, 1));
        map.put("rebootCount", new aqe("rebootCount", "INTEGER", true, 0, null, 1));
        aqi aqiVar = new aqi("FatalErrorCounts", map, new HashSet(0), new HashSet(0));
        aqi aqiVarM464h = afe.m464h(aqpVar, "FatalErrorCounts");
        if (!aqiVar.equals(aqiVarM464h)) {
            return new npk(false, "FatalErrorCounts(com.google.android.apps.camera.camerafatalerror.FatalErrorCounts).\n Expected:\n" + aqiVar.toString() + "\n Found:\n" + aqiVarM464h.toString());
        }
        HashMap map2 = new HashMap(5);
        map2.put("errorCode", new aqe("errorCode", "INTEGER", true, 1, null, 1));
        map2.put("failuresBeforeReboot", new aqe("failuresBeforeReboot", "INTEGER", true, 0, null, 1));
        map2.put(VzWFSVj.iRKXBCaY, new aqe("failuresAfterReboot", "INTEGER", true, 0, null, 1));
        map2.put("rebootCount", new aqe("rebootCount", "INTEGER", true, 0, null, 1));
        map2.put("lastFailureTimestamp", new aqe("lastFailureTimestamp", "INTEGER", true, 0, null, 1));
        aqi aqiVar2 = new aqi("EnumerationErrorCounts", map2, new HashSet(0), new HashSet(0));
        aqi aqiVarM464h2 = afe.m464h(aqpVar, "EnumerationErrorCounts");
        if (!aqiVar2.equals(aqiVarM464h2)) {
            return new npk(false, "EnumerationErrorCounts(com.google.android.apps.camera.camerafatalerror.EnumerationErrorCounts).\n Expected:\n" + aqiVar2.toString() + "\n Found:\n" + aqiVarM464h2.toString());
        }
        HashMap map3 = new HashMap(4);
        map3.put("reason", new aqe("reason", "INTEGER", false, 1, null, 1));
        map3.put("impressionsBeforeReboot", new aqe("impressionsBeforeReboot", "INTEGER", true, 0, null, 1));
        map3.put("impressionsAfterReboot", new aqe("impressionsAfterReboot", "INTEGER", true, 0, null, 1));
        map3.put("rebootCount", new aqe(pIeXJQLZLfgIN.qWE, "INTEGER", true, 0, null, 1));
        aqi aqiVar3 = new aqi("HardwareHelpDialogCounts", map3, new HashSet(0), new HashSet(0));
        aqi aqiVarM464h3 = afe.m464h(aqpVar, "HardwareHelpDialogCounts");
        if (aqiVar3.equals(aqiVarM464h3)) {
            return new npk(true, (String) null);
        }
        return new npk(false, hiCTUJiAxf.VTlXRGWANXT + aqiVar3.toString() + "\n Found:\n" + aqiVarM464h3.toString());
    }
}
