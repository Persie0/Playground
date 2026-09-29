package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.C0322j;
import androidx.work.NetworkType;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p026b5.AbstractC1314g;
import p026b5.C1309b;
import p041c5.C1699a0;
import p041c5.C1722t;
import p041c5.InterfaceC1704d;
import p086e5.C5371a;
import p131g5.C5700d;
import p214k5.C6607i;
import p214k5.C6610l;
import p214k5.C6617s;
import p214k5.InterfaceC6608j;
import p235l5.RunnableC7272s;
import p257m5.C7480b;
import p260m8.C7499b;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1250a implements InterfaceC1704d {

    /* JADX INFO: renamed from: e */
    public static final String f7852e = AbstractC1314g.m4868f("CommandHandler");

    /* JADX INFO: renamed from: a */
    public final Context f7853a;

    /* JADX INFO: renamed from: b */
    public final HashMap f7854b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Object f7855c = new Object();

    /* JADX INFO: renamed from: d */
    public final C0322j f7856d;

    public C1250a(Context context, C0322j c0322j) {
        this.f7853a = context;
        this.f7856d = c0322j;
    }

    /* JADX INFO: renamed from: b */
    public static C6610l m4727b(Intent intent) {
        return new C6610l(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* JADX INFO: renamed from: c */
    public static void m4728c(Intent intent, C6610l c6610l) {
        intent.putExtra("KEY_WORKSPEC_ID", c6610l.f37514a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c6610l.f37515b);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0408 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x039d  */
    /* JADX WARN: Code duplicated, block: B:99:0x03dc  */
    /* JADX WARN: Instruction removed from duplicated block: B:99:0x03dc, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final void m4729a(int i10, Intent intent, C1253d c1253d) {
        List listM1222j;
        List<C1722t> list;
        C6610l c6610l;
        InterfaceC6608j interfaceC6608jMo4715w;
        C6607i c6607iMo13209a;
        ArrayList arrayList;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            AbstractC1314g.m4867d().mo4869a(f7852e, "Handling constraints changed " + intent);
            C1251b c1251b = new C1251b(this.f7853a, i10, c1253d);
            ArrayList<C6617s> arrayListMo13231i = c1253d.f7879e.f9477c.mo4718z().mo13231i();
            String str = ConstraintProxy.f7843a;
            Iterator it = arrayListMo13231i.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                C1309b c1309b = ((C6617s) it.next()).f37533j;
                z10 |= c1309b.f8049d;
                z11 |= c1309b.f8047b;
                z12 |= c1309b.f8050e;
                z13 |= c1309b.f8046a != NetworkType.NOT_REQUIRED;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f7844a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c1251b.f7858a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            C5700d c5700d = c1251b.f7860c;
            c5700d.m12066d(arrayListMo13231i);
            ArrayList<C6617s> arrayList2 = new ArrayList(arrayListMo13231i.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            loop1: while (true) {
                for (C6617s c6617s : arrayListMo13231i) {
                    String str3 = c6617s.f37524a;
                    if (jCurrentTimeMillis < c6617s.m13220a() || (c6617s.m13221b() && !c5700d.m12065c(str3))) {
                    }
                    arrayList2.add(c6617s);
                }
                break loop1;
            }
            for (C6617s c6617s2 : arrayList2) {
                String str4 = c6617s2.f37524a;
                C6610l c6610lM14892A = C7499b.m14892A(c6617s2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                m4728c(intent3, c6610lM14892A);
                AbstractC1314g.m4867d().mo4869a(C1251b.f7857d, C0141b.m611g("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((C7480b) c1253d.f7876b).f41354c.execute(new C1253d.b(c1251b.f7859b, intent3, c1253d));
            }
            c5700d.m12067e();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            AbstractC1314g.m4867d().mo4869a(f7852e, "Handling reschedule " + intent + ", " + i10);
            c1253d.f7879e.m5433g();
            return;
        }
        Bundle extras = intent.getExtras();
        if (!((extras == null || extras.isEmpty() || extras.get(new String[]{"KEY_WORKSPEC_ID"}[0]) == null) ? false : true)) {
            AbstractC1314g.m4867d().mo4870b(f7852e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C6610l c6610lM4727b = m4727b(intent);
            String str5 = f7852e;
            AbstractC1314g.m4867d().mo4869a(str5, "Handling schedule work for " + c6610lM4727b);
            WorkDatabase workDatabase = c1253d.f7879e.f9477c;
            workDatabase.m4552c();
            try {
                C6617s c6617sMo13237o = workDatabase.mo4718z().mo13237o(c6610lM4727b.f37514a);
                if (c6617sMo13237o == null) {
                    AbstractC1314g.m4867d().mo4873g(str5, "Skipping scheduling " + c6610lM4727b + " because it's no longer in the DB");
                } else if (c6617sMo13237o.f37525b.isFinished()) {
                    AbstractC1314g.m4867d().mo4873g(str5, "Skipping scheduling " + c6610lM4727b + "because it is finished.");
                } else {
                    long jM13220a = c6617sMo13237o.m13220a();
                    boolean zM13221b = c6617sMo13237o.m13221b();
                    Context context2 = this.f7853a;
                    if (zM13221b) {
                        AbstractC1314g.m4867d().mo4869a(str5, "Opportunistically setting an alarm for " + c6610lM4727b + "at " + jM13220a);
                        C5371a.m11542b(context2, workDatabase, c6610lM4727b, jM13220a);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((C7480b) c1253d.f7876b).f41354c.execute(new C1253d.b(i10, intent4, c1253d));
                    } else {
                        AbstractC1314g.m4867d().mo4869a(str5, "Setting up Alarms for " + c6610lM4727b + "at " + jM13220a);
                        C5371a.m11542b(context2, workDatabase, c6610lM4727b, jM13220a);
                    }
                    workDatabase.m4568s();
                }
                return;
            } finally {
                workDatabase.m4563n();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f7855c) {
                C6610l c6610lM4727b2 = m4727b(intent);
                AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
                String str6 = f7852e;
                abstractC1314gM4867d.mo4869a(str6, "Handing delay met for " + c6610lM4727b2);
                if (this.f7854b.containsKey(c6610lM4727b2)) {
                    AbstractC1314g.m4867d().mo4869a(str6, "WorkSpec " + c6610lM4727b2 + " is is already being handled for ACTION_DELAY_MET");
                } else {
                    C1252c c1252c = new C1252c(this.f7853a, i10, c1253d, this.f7856d.m1224l(c6610lM4727b2));
                    this.f7854b.put(c6610lM4727b2, c1252c);
                    c1252c.m4735e();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                AbstractC1314g.m4867d().mo4873g(f7852e, "Ignoring intent " + intent);
                return;
            }
            C6610l c6610lM4727b3 = m4727b(intent);
            boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            AbstractC1314g.m4867d().mo4869a(f7852e, "Handling onExecutionCompleted " + intent + ", " + i10);
            mo4730e(c6610lM4727b3, z14);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        C0322j c0322j = this.f7856d;
        if (zContainsKey) {
            int i11 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            C1722t c1722tM1221i = c0322j.m1221i(new C6610l(string, i11));
            if (c1722tM1221i != null) {
                listM1222j = arrayList;
                arrayList.add(c1722tM1221i);
                list = arrayList;
            }
            for (C1722t c1722t : list) {
                AbstractC1314g.m4867d().mo4869a(f7852e, C0204c.m852k("Handing stopWork work for ", string));
                C1699a0 c1699a0 = c1253d.f7879e;
                c1699a0.f9478d.m14863a(new RunnableC7272s(c1699a0, c1722t, false));
                WorkDatabase workDatabase2 = c1253d.f7879e.f9477c;
                c6610l = c1722t.f9553a;
                String str7 = C5371a.f33746a;
                interfaceC6608jMo4715w = workDatabase2.mo4715w();
                c6607iMo13209a = interfaceC6608jMo4715w.mo13209a(c6610l);
                if (c6607iMo13209a != null) {
                    C5371a.m11541a(this.f7853a, c6610l, c6607iMo13209a.f37509c);
                    AbstractC1314g.m4867d().mo4869a(C5371a.f33746a, "Removing SystemIdInfo for workSpecId (" + c6610l + ")");
                    interfaceC6608jMo4715w.mo13211c(c6610l);
                }
                c1253d.mo4730e(c1722t.f9553a, false);
            }
        }
        listM1222j = c0322j.m1222j(string);
        listM1222j = arrayList;
        list = listM1222j;
        while (r11.hasNext()) {
            AbstractC1314g.m4867d().mo4869a(f7852e, C0204c.m852k("Handing stopWork work for ", string));
            C1699a0 c1699a1 = c1253d.f7879e;
            c1699a1.f9478d.m14863a(new RunnableC7272s(c1699a1, c1722t, false));
            WorkDatabase workDatabase3 = c1253d.f7879e.f9477c;
            c6610l = c1722t.f9553a;
            String str8 = C5371a.f33746a;
            interfaceC6608jMo4715w = workDatabase3.mo4715w();
            c6607iMo13209a = interfaceC6608jMo4715w.mo13209a(c6610l);
            if (c6607iMo13209a != null) {
                C5371a.m11541a(this.f7853a, c6610l, c6607iMo13209a.f37509c);
                AbstractC1314g.m4867d().mo4869a(C5371a.f33746a, "Removing SystemIdInfo for workSpecId (" + c6610l + ")");
                interfaceC6608jMo4715w.mo13211c(c6610l);
            }
            c1253d.mo4730e(c1722t.f9553a, false);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p041c5.InterfaceC1704d
    /* JADX INFO: renamed from: e */
    public final void mo4730e(C6610l c6610l, boolean z10) {
        synchronized (this.f7855c) {
            C1252c c1252c = (C1252c) this.f7854b.remove(c6610l);
            this.f7856d.m1221i(c6610l);
            if (c1252c != null) {
                c1252c.m4737g(z10);
            }
        }
    }
}
