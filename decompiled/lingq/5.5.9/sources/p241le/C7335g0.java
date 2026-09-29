package p241le;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.settings.C3215a;
import dm.C5212l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import me.C7544b;
import me.C7545c;
import me.C7550h;
import ne.C7745c0;
import ne.C7748e;
import ne.C7755l;
import ne.C7756m;
import ne.C7757n;
import ne.C7759p;
import ne.C7760q;
import ne.C7764u;
import p023b2.C1292a;
import p105f0.C5454b;
import p118fe.C5509a;
import p134g8.C5715b;
import p136gc.C5752h;
import p136gc.C5761q;
import p289o5.C7940t;
import p298oe.C8038a;
import p339qe.C8596a;
import p339qe.C8597b;
import p395t8.C9220b;
import p399te.InterfaceC9279a;
import p410u8.C9476a;
import p452w8.C9842w;
import re.C8770a;
import re.C8772c;
import re.C8772c.a;

/* JADX INFO: renamed from: le.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7335g0 {

    /* JADX INFO: renamed from: a */
    public final C7354y f41056a;

    /* JADX INFO: renamed from: b */
    public final C8596a f41057b;

    /* JADX INFO: renamed from: c */
    public final C8770a f41058c;

    /* JADX INFO: renamed from: d */
    public final C7545c f41059d;

    /* JADX INFO: renamed from: e */
    public final C7550h f41060e;

    public C7335g0(C7354y c7354y, C8596a c8596a, C8770a c8770a, C7545c c7545c, C7550h c7550h) {
        this.f41056a = c7354y;
        this.f41057b = c8596a;
        this.f41058c = c8770a;
        this.f41059d = c7545c;
        this.f41060e = c7550h;
    }

    /* JADX INFO: renamed from: a */
    public static C7755l m14750a(C7755l c7755l, C7545c c7545c, C7550h c7550h) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        C7755l.a aVar = new C7755l.a(c7755l);
        String strMo15050b = c7545c.f41626b.mo15050b();
        if (strMo15050b != null) {
            aVar.f42607e = new C7764u(strMo15050b);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        C7544b reference = c7550h.f41651d.f41654a.getReference();
        synchronized (reference) {
            try {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f41621a));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayListM14752c = m14752c(mapUnmodifiableMap);
        C7544b reference2 = c7550h.f41652e.f41654a.getReference();
        synchronized (reference2) {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference2.f41621a));
        }
        ArrayList arrayListM14752c2 = m14752c(mapUnmodifiableMap2);
        if (!arrayListM14752c.isEmpty() || !arrayListM14752c2.isEmpty()) {
            C7756m.a aVarMo15407f = c7755l.f42600c.mo15407f();
            aVarMo15407f.f42614b = new C7745c0<>(arrayListM14752c);
            aVarMo15407f.f42615c = new C7745c0<>(arrayListM14752c2);
            aVar.f42605c = aVarMo15407f.m15467a();
        }
        return aVar.m15466a();
    }

    /* JADX INFO: renamed from: b */
    public static C7335g0 m14751b(Context context, C7331e0 c7331e0, C8597b c8597b, C7322a c7322a, C7545c c7545c, C7550h c7550h, C5454b c5454b, C3215a c3215a, C7940t c7940t) {
        C7354y c7354y = new C7354y(context, c7331e0, c7322a, c5454b, c3215a);
        C8596a c8596a = new C8596a(c8597b, c3215a);
        C8038a c8038a = C8770a.f46490b;
        C9842w.m18334b(context);
        return new C7335g0(c7354y, c8596a, new C8770a(new C8772c(C9842w.m18333a().m18335c(new C9476a(C8770a.f46491c, C8770a.f46492d)).mo17582a("FIREBASE_CRASHLYTICS_REPORT", new C9220b("json"), C8770a.f46493e), c3215a.m9171b(), c7940t)), c7545c, c7550h);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m14752c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new C7748e(str, str2));
        }
        Collections.sort(arrayList, new C5715b(8));
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m14753d(Throwable th2, Thread thread, String str, String str2, long j10, boolean z10) {
        ActivityManager.RunningAppProcessInfo next;
        boolean zEquals = str2.equals("crash");
        C7354y c7354y = this.f41056a;
        Context context = c7354y.f41112a;
        int i10 = context.getResources().getConfiguration().orientation;
        InterfaceC9279a interfaceC9279a = c7354y.f41115d;
        C1292a c1292a = new C1292a(th2, interfaceC9279a);
        C7755l.a aVar = new C7755l.a();
        aVar.f42604b = str2;
        aVar.f42603a = Long.valueOf(j10);
        String str3 = c7354y.f41114c.f41017e;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            next = null;
            break;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.processName.equals(str3));
        Boolean boolValueOf = next != null ? Boolean.valueOf(next.importance != 100) : null;
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C7354y.m14761e(thread, (StackTraceElement[]) c1292a.f8005c, 4));
        if (z10) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(C7354y.m14761e(key, interfaceC9279a.mo11675b(entry.getValue()), 0));
                }
            }
        }
        C7745c0 c7745c0 = new C7745c0(arrayList);
        C7759p c7759pM14759c = C7354y.m14759c(c1292a, 0);
        Long l10 = 0L;
        String str4 = l10 == null ? " address" : "";
        if (!str4.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str4));
        }
        C7757n c7757n = new C7757n(c7745c0, c7759pM14759c, null, new C7760q("0", "0", l10.longValue()), c7354y.m14762a());
        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        aVar.f42605c = new C7756m(c7757n, null, null, boolValueOf, numValueOf.intValue());
        aVar.f42606d = c7354y.m14763b(i10);
        this.f41057b.m16814c(m14750a(aVar.m15466a(), this.f41059d, this.f41060e), str, zEquals);
    }

    /* JADX INFO: renamed from: e */
    public final C5761q m14754e(String str, Executor executor) {
        C5752h<AbstractC7355z> c5752h;
        ArrayList<File> arrayListM16813b = this.f41057b.m16813b();
        ArrayList<AbstractC7355z> arrayList = new ArrayList();
        for (File file : arrayListM16813b) {
            try {
                C8038a c8038a = C8596a.f46069f;
                String strM16811d = C8596a.m16811d(file);
                c8038a.getClass();
                arrayList.add(new C7324b(C8038a.m15921h(strM16811d), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC7355z abstractC7355z : arrayList) {
            if (str == null || str.equals(abstractC7355z.mo14741c())) {
                C8770a c8770a = this.f41058c;
                boolean z10 = true;
                boolean z11 = str != null;
                C8772c c8772c = c8770a.f46494a;
                synchronized (c8772c.f46504f) {
                    c5752h = new C5752h<>();
                    if (z11) {
                        ((AtomicInteger) c8772c.f46507i.f43256a).getAndIncrement();
                        if (c8772c.f46504f.size() >= c8772c.f46503e) {
                            z10 = false;
                        }
                        if (z10) {
                            C5212l c5212l = C5212l.f33289h;
                            c5212l.m11188H("Enqueueing report: " + abstractC7355z.mo14741c());
                            c5212l.m11188H("Queue size: " + c8772c.f46504f.size());
                            c8772c.f46505g.execute(c8772c.new a(abstractC7355z, c5752h));
                            c5212l.m11188H("Closing task for report: " + abstractC7355z.mo14741c());
                            c5752h.m12116d(abstractC7355z);
                        } else {
                            c8772c.m17019a();
                            String str2 = "Dropping report due to queue being full: " + abstractC7355z.mo14741c();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            ((AtomicInteger) c8772c.f46507i.f43257b).getAndIncrement();
                            c5752h.m12116d(abstractC7355z);
                        }
                    } else {
                        c8772c.m17020b(abstractC7355z, c5752h);
                    }
                }
                arrayList2.add(c5752h.f34812a.mo12104f(executor, new C5509a(11, this)));
            }
        }
        return Tasks.m8540d(arrayList2);
    }
}
