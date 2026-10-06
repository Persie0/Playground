package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class bac implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bag f2851a;

    public bac(bag bagVar) {
        this.f2851a = bagVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        baf bafVar;
        ?? r2;
        List<bkn> listM2207a;
        synchronized (this.f2851a.f2862g) {
            bag bagVar = this.f2851a;
            bagVar.f2863h = (Intent) bagVar.f2862g.get(0);
        }
        Intent intent = this.f2851a.f2863h;
        if (intent != null) {
            String action = intent.getAction();
            int intExtra = this.f2851a.f2863h.getIntExtra("KEY_START_ID", 0);
            ayc.m2099a();
            StringBuilder sb = new StringBuilder();
            sb.append("Processing command ");
            sb.append(this.f2851a.f2863h);
            sb.append(", ");
            sb.append(intExtra);
            PowerManager.WakeLock wakeLockM2264a = bee.m2264a(this.f2851a.f2857b, action + " (" + intExtra + ")");
            try {
                ayc.m2099a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Acquiring operation wake lock (");
                sb2.append(action);
                sb2.append(") ");
                sb2.append(wakeLockM2264a);
                wakeLockM2264a.acquire();
                bag bagVar2 = this.f2851a;
                azx azxVar = bagVar2.f2861f;
                Intent intent2 = bagVar2.f2863h;
                String action2 = intent2.getAction();
                if ("ACTION_CONSTRAINTS_CHANGED".equals(action2)) {
                    ayc.m2099a();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Handling constraints changed ");
                    sb3.append(intent2);
                    int i = azz.f2831a;
                    Context context = azxVar.f2826b;
                    bap bapVar = new bap(bagVar2.f2860e.f2787i, null);
                    List<bcv> listMo2234c = bagVar2.f2860e.f2782d.mo1700B().mo2234c();
                    int i2 = azy.f2830a;
                    Iterator it = listMo2234c.iterator();
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        axr axrVar = ((bcv) it.next()).f2972i;
                        z |= axrVar.f2681d;
                        z2 |= axrVar.f2679b;
                        z3 |= axrVar.f2682e;
                        z4 |= axrVar.f2686i != 1;
                        if (z && z2 && z3 && z4) {
                            break;
                        }
                    }
                    Intent intent3 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
                    intent3.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
                    intent3.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
                    context.sendBroadcast(intent3);
                    bapVar.mo2166a(listMo2234c);
                    ArrayList arrayList = new ArrayList(listMo2234c.size());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (bcv bcvVar : listMo2234c) {
                        String str = bcvVar.f2964a;
                        if (jCurrentTimeMillis >= bcvVar.m2228a() && (!bcvVar.m2229c() || bapVar.m2168c(str))) {
                            arrayList.add(bcvVar);
                        }
                    }
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        bcv bcvVar2 = (bcv) arrayList.get(i3);
                        String str2 = bcvVar2.f2964a;
                        Intent intentM2146c = azx.m2146c(context, bbu.m2189b(bcvVar2));
                        ayc.m2099a();
                        bagVar2.f2865j.f47803b.execute(new bad(bagVar2, intentM2146c, intExtra));
                    }
                    bapVar.mo2167b();
                } else if (!"ACTION_RESCHEDULE".equals(action2)) {
                    Bundle extras = intent2.getExtras();
                    String[] strArr = {"KEY_WORKSPEC_ID"};
                    if (extras == null || extras.isEmpty()) {
                        ayc.m2099a();
                        Log.e(azx.f2825a, "Invalid request for " + action2 + " , requires KEY_WORKSPEC_ID .");
                        break;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 > 0) {
                            if (!"ACTION_SCHEDULE_WORK".equals(action2)) {
                                if (!"ACTION_DELAY_MET".equals(action2)) {
                                    if (!"ACTION_STOP_WORK".equals(action2)) {
                                        if (!"ACTION_EXECUTION_COMPLETED".equals(action2)) {
                                            ayc.m2099a();
                                            String str3 = azx.f2825a;
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("Ignoring intent ");
                                            sb4.append(intent2);
                                            Log.w(str3, "Ignoring intent ".concat(String.valueOf(intent2)));
                                            break;
                                        }
                                        bcj bcjVarM2148e = azx.m2148e(intent2);
                                        boolean z5 = intent2.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                                        ayc.m2099a();
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append("Handling onExecutionCompleted ");
                                        sb5.append(intent2);
                                        sb5.append(", ");
                                        sb5.append(intExtra);
                                        azxVar.mo1714a(bcjVarM2148e, z5);
                                        break;
                                    }
                                    Bundle extras2 = intent2.getExtras();
                                    String string = extras2.getString("KEY_WORKSPEC_ID");
                                    if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
                                        int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                                        listM2207a = new ArrayList(1);
                                        bkn bknVarM2205E = azxVar.f2829e.m2205E(new bcj(string, i5));
                                        if (bknVarM2205E != null) {
                                            listM2207a.add(bknVarM2205E);
                                        }
                                    } else {
                                        listM2207a = azxVar.f2829e.m2207a(string);
                                    }
                                    for (bkn bknVar : listM2207a) {
                                        ayc.m2099a();
                                        bagVar2.f2860e.m2129i(bknVar);
                                        Context context2 = azxVar.f2826b;
                                        WorkDatabase workDatabase = bagVar2.f2860e.f2782d;
                                        Object obj = bknVar.f3651a;
                                        int i6 = azw.f2824a;
                                        bce bceVarMo1704y = workDatabase.mo1704y();
                                        bcd bcdVarM2124b = azo.m2124b(bceVarMo1704y, (bcj) obj);
                                        if (bcdVarM2124b != null) {
                                            azw.m2142a(context2, (bcj) obj, bcdVarM2124b.f2941c);
                                            ayc.m2099a();
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append("Removing SystemIdInfo for workSpecId (");
                                            sb6.append(obj);
                                            sb6.append(")");
                                            String str4 = ((bcj) obj).f2946a;
                                            int i7 = ((bcj) obj).f2947b;
                                            ((bci) bceVarMo1704y).f2942a.m1824l();
                                            arf arfVarM1853e = ((bci) bceVarMo1704y).f2943b.m1853e();
                                            arfVarM1853e.mo1847g(1, str4);
                                            arfVarM1853e.mo1845e(2, i7);
                                            ((bci) bceVarMo1704y).f2942a.m1825m();
                                            try {
                                                arfVarM1853e.m1883a();
                                                ((bci) bceVarMo1704y).f2942a.m1829q();
                                                ((bci) bceVarMo1704y).f2942a.m1827o();
                                                ((bci) bceVarMo1704y).f2943b.m1855g(arfVarM1853e);
                                            } catch (Throwable th) {
                                                ((bci) bceVarMo1704y).f2942a.m1827o();
                                                ((bci) bceVarMo1704y).f2943b.m1855g(arfVarM1853e);
                                                throw th;
                                            }
                                        }
                                        bagVar2.mo1714a((bcj) bknVar.f3651a, false);
                                    }
                                    break;
                                }
                                synchronized (azxVar.f2828d) {
                                    bcj bcjVarM2148e2 = azx.m2148e(intent2);
                                    ayc.m2099a();
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(BcwGDRhrTsnlj.ZlGdgZwuRNMNQS);
                                    sb7.append(bcjVarM2148e2);
                                    if (azxVar.f2827c.containsKey(bcjVarM2148e2)) {
                                        ayc.m2099a();
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("WorkSpec ");
                                        sb8.append(bcjVarM2148e2);
                                        sb8.append(" is is already being handled for ACTION_DELAY_MET");
                                    } else {
                                        bab babVar = new bab(azxVar.f2826b, intExtra, bagVar2, azxVar.f2829e.m2206F(bcjVarM2148e2), null);
                                        azxVar.f2827c.put(bcjVarM2148e2, babVar);
                                        String str5 = babVar.f2841c.f2946a;
                                        babVar.f2847i = bee.m2264a(babVar.f2839a, str5 + " (" + babVar.f2840b + ")");
                                        ayc.m2099a();
                                        StringBuilder sb9 = new StringBuilder();
                                        sb9.append("Acquiring wakelock ");
                                        sb9.append(babVar.f2847i);
                                        sb9.append("for WorkSpec ");
                                        sb9.append(str5);
                                        babVar.f2847i.acquire();
                                        bcv bcvVarMo2232a = babVar.f2842d.f2860e.f2782d.mo1700B().mo2232a(str5);
                                        if (bcvVarMo2232a == null) {
                                            babVar.f2845g.execute(new baa(babVar, 0));
                                        } else {
                                            boolean zM2229c = bcvVarMo2232a.m2229c();
                                            babVar.f2848j = zM2229c;
                                            if (zM2229c) {
                                                babVar.f2843e.mo2166a(Collections.singletonList(bcvVarMo2232a));
                                            } else {
                                                ayc.m2099a();
                                                babVar.mo1720e(Collections.singletonList(bcvVarMo2232a));
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            bcj bcjVarM2148e3 = azx.m2148e(intent2);
                            ayc.m2099a();
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append("Handling schedule work for ");
                            sb10.append(bcjVarM2148e3);
                            bcjVarM2148e3.toString();
                            WorkDatabase workDatabase2 = bagVar2.f2860e.f2782d;
                            workDatabase2.m1825m();
                            try {
                                bcv bcvVarMo2232a2 = workDatabase2.mo1700B().mo2232a(bcjVarM2148e3.f2946a);
                                if (bcvVarMo2232a2 == null) {
                                    ayc.m2099a();
                                    Log.w(azx.f2825a, "Skipping scheduling " + bcjVarM2148e3 + " because it's no longer in the DB");
                                } else if (C0158ej.m7379f(bcvVarMo2232a2.f2981r)) {
                                    ayc.m2099a();
                                    Log.w(azx.f2825a, "Skipping scheduling " + bcjVarM2148e3 + "because it is finished.");
                                } else {
                                    long jM2228a = bcvVarMo2232a2.m2228a();
                                    if (bcvVarMo2232a2.m2229c()) {
                                        ayc.m2099a();
                                        StringBuilder sb11 = new StringBuilder();
                                        sb11.append("Opportunistically setting an alarm for ");
                                        sb11.append(bcjVarM2148e3);
                                        sb11.append("at ");
                                        sb11.append(jM2228a);
                                        azw.m2143b(azxVar.f2826b, workDatabase2, bcjVarM2148e3, jM2228a);
                                        bagVar2.f2865j.f47803b.execute(new bad(bagVar2, azx.m2145b(azxVar.f2826b), intExtra));
                                    } else {
                                        ayc.m2099a();
                                        StringBuilder sb12 = new StringBuilder();
                                        sb12.append("Setting up Alarms for ");
                                        sb12.append(bcjVarM2148e3);
                                        sb12.append("at ");
                                        sb12.append(jM2228a);
                                        azw.m2143b(azxVar.f2826b, workDatabase2, bcjVarM2148e3, jM2228a);
                                    }
                                    workDatabase2.m1829q();
                                }
                                workDatabase2.m1827o();
                                break;
                            } catch (Throwable th2) {
                                workDatabase2.m1827o();
                                throw th2;
                            }
                        }
                        if (extras.get(strArr[i4]) == null) {
                            ayc.m2099a();
                            Log.e(azx.f2825a, "Invalid request for " + action2 + " , requires KEY_WORKSPEC_ID .");
                            break;
                        }
                        i4++;
                    }
                } else {
                    ayc.m2099a();
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("Handling reschedule ");
                    sb13.append(intent2);
                    sb13.append(aJFPpVSaoDO.XyQ);
                    sb13.append(intExtra);
                    bagVar2.f2860e.m2127g();
                }
                ayc.m2099a();
                StringBuilder sb14 = new StringBuilder();
                sb14.append("Releasing operation wake lock (");
                sb14.append(action);
                sb14.append(") ");
                sb14.append(wakeLockM2264a);
                wakeLockM2264a.release();
                bag bagVar3 = this.f2851a;
                Object obj2 = bagVar3.f2865j.f47803b;
                bafVar = new baf(bagVar3);
                r2 = obj2;
            } catch (Throwable th3) {
                try {
                    ayc.m2099a();
                    Log.e(bag.f2856a, "Unexpected error in onHandleIntent", th3);
                    ayc.m2099a();
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(IuyLAqNmW.RGdBktfepIMzdne);
                    sb15.append(action);
                    sb15.append(") ");
                    sb15.append(wakeLockM2264a);
                    wakeLockM2264a.release();
                    bag bagVar4 = this.f2851a;
                    Object obj3 = bagVar4.f2865j.f47803b;
                    bafVar = new baf(bagVar4);
                    r2 = obj3;
                } catch (Throwable th4) {
                    ayc.m2099a();
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append("Releasing operation wake lock (");
                    sb16.append(action);
                    sb16.append(") ");
                    sb16.append(wakeLockM2264a);
                    wakeLockM2264a.release();
                    bag bagVar5 = this.f2851a;
                    bagVar5.f2865j.f47803b.execute(new baf(bagVar5));
                    throw th4;
                }
            }
            r2.execute(bafVar);
        }
    }
}
