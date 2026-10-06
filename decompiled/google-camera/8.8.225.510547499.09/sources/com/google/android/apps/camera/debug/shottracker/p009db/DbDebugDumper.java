package com.google.android.apps.camera.debug.shottracker.p009db;

import android.content.Context;
import android.database.Cursor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.aek;
import p000.aeq;
import p000.aey;
import p000.aps;
import p000.apy;
import p000.dlz;
import p000.dmf;
import p000.dmh;
import p000.dmi;
import p000.dmm;
import p000.dmn;
import p000.kbt;
import p021j$.time.Duration;
import p021j$.time.Instant;
import p021j$.time.ZoneId;
import p021j$.time.format.DateTimeFormatter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DbDebugDumper extends kbt {

    /* JADX INFO: renamed from: a */
    private static final DateTimeFormatter f6604a = DateTimeFormatter.ofPattern("MM-dd HH:mm:ss.SSS").withZone(ZoneId.systemDefault());

    /* JADX INFO: renamed from: b */
    private static void m4092b(Map map, List list, PrintWriter printWriter) {
        PrintWriter printWriter2;
        String str;
        PrintWriter printWriter3 = printWriter;
        Iterator it = list.iterator();
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        Instant instant = null;
        while (it.hasNext()) {
            dmn dmnVar = (dmn) it.next();
            dmh dmhVar = (dmh) map.get(Long.valueOf(dmnVar.f12034b));
            if (dmhVar != null) {
                if (dmnVar.f12034b != j2) {
                    if (j2 < j) {
                        printWriter3.println("");
                        printWriter.flush();
                    }
                    printWriter2 = printWriter;
                    printWriter2.println(dmhVar.f12019a + " " + dmhVar.f12027i + "[pid=" + dmhVar.f12028j + "] title=" + dmhVar.f12020b + " captureSessionType=" + dmhVar.f12026h + " start=" + dmhVar.f12021c + " persisted=" + dmhVar.f12022d + " canceled=" + dmhVar.f12023e + " deleted=" + dmhVar.f12024f + " mostRecentEvent=" + dmhVar.f12025g + " failed=" + dmhVar.f12030l);
                    instant = null;
                } else {
                    printWriter2 = printWriter3;
                }
                Instant instantOfEpochMilli = Instant.ofEpochMilli(dmnVar.f12035c);
                Duration durationBetween = instant == null ? Duration.ZERO : Duration.between(instant, instantOfEpochMilli);
                long j3 = dmnVar.f12035c;
                String str2 = f6604a.format(instantOfEpochMilli);
                long millis = durationBetween.toMillis();
                if (millis >= 1000) {
                    double d = millis;
                    Double.isNaN(d);
                    str = String.format("%10.3fs", Double.valueOf(d / 1000.0d));
                } else {
                    str = String.format("      .%03ds", Long.valueOf(millis));
                }
                printWriter2.println("  " + j3 + "  " + str2 + str + ": " + dmnVar.f12036d);
                j2 = dmnVar.f12034b;
                instant = instantOfEpochMilli;
                printWriter3 = printWriter2;
                it = it;
                j = Long.MAX_VALUE;
            } else {
                it = it;
                j = Long.MAX_VALUE;
            }
        }
        printWriter.flush();
    }

    @Override // p000.kbt
    /* JADX INFO: renamed from: a */
    public final void mo4091a(PrintWriter printWriter) throws Throwable {
        apy apyVar;
        Context context = getContext();
        context.getClass();
        aps apsVarM348g = aek.m348g(context, ShotDatabase.class, "shot_db");
        apsVarM348g.m1815c();
        ShotDatabase shotDatabase = (ShotDatabase) apsVarM348g.m1813a();
        dlz dlzVarMo4093w = shotDatabase.mo4093w();
        apy apyVarM1841a = apy.m1841a("SELECT * FROM shots ORDER BY shot_id", 0);
        dmf dmfVar = (dmf) dlzVarMo4093w;
        dmfVar.f12013a.m1824l();
        Cursor cursorM409e = aey.m409e(dmfVar.f12013a, apyVarM1841a, false);
        try {
            int iM379o = aeq.m379o(cursorM409e, "shot_id");
            int iM379o2 = aeq.m379o(cursorM409e, "title");
            int iM379o3 = aeq.m379o(cursorM409e, "start_millis");
            int iM379o4 = aeq.m379o(cursorM409e, "persisted_millis");
            int iM379o5 = aeq.m379o(cursorM409e, "canceled_millis");
            int iM379o6 = aeq.m379o(cursorM409e, "deleted_millis");
            int iM379o7 = aeq.m379o(cursorM409e, "most_recent_event_millis");
            int iM379o8 = aeq.m379o(cursorM409e, "capture_session_type");
            int iM379o9 = aeq.m379o(cursorM409e, "capture_session_shot_id");
            int iM379o10 = aeq.m379o(cursorM409e, "pid");
            int iM379o11 = aeq.m379o(cursorM409e, "stuck");
            int iM379o12 = aeq.m379o(cursorM409e, "failed");
            ArrayList<dmh> arrayList = new ArrayList(cursorM409e.getCount());
            while (true) {
                apyVar = apyVarM1841a;
                if (!cursorM409e.moveToNext()) {
                    break;
                }
                try {
                    dmh dmhVar = new dmh();
                    int i = iM379o11;
                    dmhVar.f12019a = cursorM409e.getLong(iM379o);
                    if (cursorM409e.isNull(iM379o2)) {
                        dmhVar.f12020b = null;
                    } else {
                        dmhVar.f12020b = cursorM409e.getString(iM379o2);
                    }
                    dmhVar.f12021c = cursorM409e.getLong(iM379o3);
                    dmhVar.f12022d = cursorM409e.getLong(iM379o4);
                    dmhVar.f12023e = cursorM409e.getLong(iM379o5);
                    dmhVar.f12024f = cursorM409e.getLong(iM379o6);
                    dmhVar.f12025g = cursorM409e.getLong(iM379o7);
                    if (cursorM409e.isNull(iM379o8)) {
                        dmhVar.f12026h = null;
                    } else {
                        dmhVar.f12026h = cursorM409e.getString(iM379o8);
                    }
                    if (cursorM409e.isNull(iM379o9)) {
                        dmhVar.f12027i = null;
                    } else {
                        dmhVar.f12027i = cursorM409e.getString(iM379o9);
                    }
                    dmhVar.f12028j = cursorM409e.getLong(iM379o10);
                    dmhVar.f12029k = cursorM409e.getInt(i) != 0;
                    dmhVar.f12030l = cursorM409e.getInt(iM379o12) != 0;
                    arrayList.add(dmhVar);
                    iM379o11 = i;
                    apyVarM1841a = apyVar;
                } catch (Throwable th) {
                    th = th;
                    cursorM409e.close();
                    apyVar.m1850j();
                    throw th;
                }
            }
            cursorM409e.close();
            apyVar.m1850j();
            dmi dmiVarMo4094x = shotDatabase.mo4094x();
            apy apyVarM1841a2 = apy.m1841a("SELECT * FROM shot_log ORDER BY shot_id DESC, sequence", 0);
            dmm dmmVar = (dmm) dmiVarMo4094x;
            dmmVar.f12031a.m1824l();
            Cursor cursorM409e2 = aey.m409e(dmmVar.f12031a, apyVarM1841a2, false);
            try {
                int iM379o13 = aeq.m379o(cursorM409e2, "sequence");
                int iM379o14 = aeq.m379o(cursorM409e2, "shot_id");
                int iM379o15 = aeq.m379o(cursorM409e2, "time_millis");
                int iM379o16 = aeq.m379o(cursorM409e2, "message");
                ArrayList arrayList2 = new ArrayList(cursorM409e2.getCount());
                while (cursorM409e2.moveToNext()) {
                    dmn dmnVar = new dmn();
                    dmnVar.f12033a = cursorM409e2.getInt(iM379o13);
                    dmnVar.f12034b = cursorM409e2.getLong(iM379o14);
                    dmnVar.f12035c = cursorM409e2.getLong(iM379o15);
                    if (cursorM409e2.isNull(iM379o16)) {
                        dmnVar.f12036d = null;
                    } else {
                        dmnVar.f12036d = cursorM409e2.getString(iM379o16);
                    }
                    arrayList2.add(dmnVar);
                }
                cursorM409e2.close();
                apyVarM1841a2.m1850j();
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (dmh dmhVar2 : arrayList) {
                    if (dmhVar2.f12030l || (dmhVar2.f12022d == 0 && dmhVar2.f12023e == 0 && dmhVar2.f12024f == 0)) {
                        map2.put(Long.valueOf(dmhVar2.f12019a), dmhVar2);
                    } else {
                        map.put(Long.valueOf(dmhVar2.f12019a), dmhVar2);
                    }
                }
                printWriter.println("DUMPING: " + map2.size() + " SUSPECT, " + map.size() + " OK");
                printWriter.flush();
                if (!map2.isEmpty()) {
                    printWriter.println("\nSUSPECT SHOTS");
                    m4092b(map2, arrayList2, printWriter);
                }
                if (!map.isEmpty()) {
                    printWriter.println("\nOK SHOTS");
                    m4092b(map, arrayList2, printWriter);
                }
                printWriter.println("\nDUMPED: " + map2.size() + " SUSPECT, " + map.size() + " OK");
                printWriter.flush();
                shotDatabase.m1826n();
            } catch (Throwable th2) {
                cursorM409e2.close();
                apyVarM1841a2.m1850j();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            apyVar = apyVarM1841a;
        }
    }
}
