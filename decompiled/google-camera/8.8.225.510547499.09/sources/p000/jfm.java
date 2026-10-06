package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jfm implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public static final Status f33890a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: b */
    public static final Status f33891b = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: c */
    public static final Object f33892c = new Object();

    /* JADX INFO: renamed from: d */
    public static jfm f33893d;

    /* JADX INFO: renamed from: g */
    public final Context f33896g;

    /* JADX INFO: renamed from: h */
    public final jcy f33897h;

    /* JADX INFO: renamed from: n */
    public final Handler f33903n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f33904o;

    /* JADX INFO: renamed from: p */
    public final kon f33905p;

    /* JADX INFO: renamed from: q */
    private jih f33906q;

    /* JADX INFO: renamed from: s */
    private jip f33908s;

    /* JADX INFO: renamed from: e */
    public long f33894e = 10000;

    /* JADX INFO: renamed from: f */
    public boolean f33895f = false;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f33898i = new AtomicInteger(1);

    /* JADX INFO: renamed from: j */
    public final AtomicInteger f33899j = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    public final Map f33900k = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: l */
    public jfh f33901l = null;

    /* JADX INFO: renamed from: m */
    public final Set f33902m = new C1112xa();

    /* JADX INFO: renamed from: r */
    private final Set f33907r = new C1112xa();

    private jfm(Context context, Looper looper, jcy jcyVar) {
        this.f33904o = true;
        this.f33896g = context;
        jmx jmxVar = new jmx(looper, this);
        this.f33903n = jmxVar;
        this.f33897h = jcyVar;
        this.f33905p = new kon(jcyVar);
        PackageManager packageManager = context.getPackageManager();
        if (jit.f34140b == null) {
            jit.f34140b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (jit.f34140b.booleanValue()) {
            this.f33904o = false;
        }
        jmxVar.sendMessage(jmxVar.obtainMessage(6));
    }

    /* JADX INFO: renamed from: a */
    public static Status m13040a(jev jevVar, jcu jcuVar) {
        return new Status(1, 17, "API: " + jevVar.m12997a() + " is not available on this device. Connection failed with: " + String.valueOf(jcuVar), jcuVar.f33756d, jcuVar);
    }

    /* JADX INFO: renamed from: c */
    public static jfm m13041c(Context context) {
        jfm jfmVar;
        HandlerThread handlerThread;
        synchronized (f33892c) {
            if (f33893d == null) {
                synchronized (jhj.f34065a) {
                    handlerThread = jhj.f34066b;
                    if (handlerThread == null) {
                        jhj.f34066b = new HandlerThread("GoogleApiHandler", 9);
                        jhj.f34066b.start();
                        handlerThread = jhj.f34066b;
                    }
                }
                f33893d = new jfm(context.getApplicationContext(), handlerThread.getLooper(), jcy.f33766a);
            }
            jfmVar = f33893d;
        }
        return jfmVar;
    }

    /* JADX INFO: renamed from: j */
    private final jfj m13042j(jdz jdzVar) {
        jev jevVar = jdzVar.f33823f;
        jfj jfjVar = (jfj) this.f33900k.get(jevVar);
        if (jfjVar == null) {
            jfjVar = new jfj(this, jdzVar);
            this.f33900k.put(jevVar, jfjVar);
        }
        if (jfjVar.m13036o()) {
            this.f33907r.add(jevVar);
        }
        jfjVar.m13025d();
        return jfjVar;
    }

    /* JADX INFO: renamed from: k */
    private final void m13043k() {
        jih jihVar = this.f33906q;
        if (jihVar != null) {
            if (jihVar.f34127a > 0 || m13049g()) {
                m13044l().m13227a(jihVar);
            }
            this.f33906q = null;
        }
    }

    /* JADX INFO: renamed from: l */
    private final jip m13044l() {
        if (this.f33908s == null) {
            this.f33908s = new jip(this.f33896g, jii.f34129a);
        }
        return this.f33908s;
    }

    /* JADX INFO: renamed from: b */
    final jfj m13045b(jev jevVar) {
        return (jfj) this.f33900k.get(jevVar);
    }

    /* JADX INFO: renamed from: d */
    public final void m13046d(jcu jcuVar, int i) {
        if (m13050h(jcuVar, i)) {
            return;
        }
        Handler handler = this.f33903n;
        handler.sendMessage(handler.obtainMessage(5, i, 0, jcuVar));
    }

    /* JADX INFO: renamed from: e */
    public final void m13047e() {
        Handler handler = this.f33903n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX INFO: renamed from: f */
    public final void m13048f(jfh jfhVar) {
        synchronized (f33892c) {
            if (this.f33901l != jfhVar) {
                this.f33901l = jfhVar;
                this.f33902m.clear();
            }
            this.f33902m.addAll(jfhVar.f33867e);
        }
    }

    /* JADX INFO: renamed from: g */
    final boolean m13049g() {
        if (this.f33895f) {
            return false;
        }
        jig jigVar = jif.m13225a().f34121a;
        if (jigVar != null && !jigVar.f34123b) {
            return false;
        }
        int iM14631g = this.f33905p.m14631g(203400000);
        return iM14631g == -1 || iM14631g == 0;
    }

    /* JADX INFO: renamed from: h */
    final boolean m13050h(jcu jcuVar, int i) {
        jcy jcyVar = this.f33897h;
        Context context = this.f33896g;
        if (jiy.m13265a(context)) {
            return false;
        }
        PendingIntent pendingIntentM12904h = jcuVar.m12894a() ? jcuVar.f33756d : jcyVar.m12904h(context, jcuVar.f33755c, null);
        if (pendingIntentM12904h == null) {
            return false;
        }
        jcyVar.m12900d(context, jcuVar.f33755c, jmv.m13375b(context, GoogleApiActivity.m4642a(context, pendingIntentM12904h, i, true), 167772160));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:133:0x0300  */
    /* JADX WARN: Code duplicated, block: B:134:0x031f  */
    /* JADX WARN: Code duplicated, block: B:135:0x032a  */
    /* JADX WARN: Instruction removed from duplicated block: B:133:0x0300, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x032a, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        jcw[] jcwVarArrMo12972b;
        jfj jfjVar = null;
        switch (message.what) {
            case 1:
                this.f33894e = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f33903n.removeMessages(12);
                for (jev jevVar : this.f33900k.keySet()) {
                    Handler handler = this.f33903n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, jevVar), this.f33894e);
                }
                return true;
            case 2:
                jew jewVar = (jew) message.obj;
                for (jev jevVar2 : ((C1109wy) jewVar.f33847b).keySet()) {
                    jfj jfjVar2 = (jfj) this.f33900k.get(jevVar2);
                    if (jfjVar2 == null) {
                        jewVar.m12998a(jevVar2, new jcu(13), null);
                        return true;
                    }
                    if (jfjVar2.f33870b.m12944l()) {
                        jewVar.m12998a(jevVar2, jcu.f33753a, jfjVar2.f33870b.m12938f());
                    } else {
                        jib.m13199d(jfjVar2.f33879k.f33903n);
                        jcu jcuVar = jfjVar2.f33877i;
                        if (jcuVar != null) {
                            jewVar.m12998a(jevVar2, jcuVar, null);
                        } else {
                            jib.m13199d(jfjVar2.f33879k.f33903n);
                            jfjVar2.f33872d.add(jewVar);
                            jfjVar2.m13025d();
                        }
                    }
                }
                return true;
            case 3:
                for (jfj jfjVar3 : this.f33900k.values()) {
                    jfjVar3.m13024c();
                    jfjVar3.m13025d();
                }
                return true;
            case 4:
            case 8:
            case 13:
                lqq lqqVar = (lqq) message.obj;
                jfj jfjVarM13042j = (jfj) this.f33900k.get(((jdz) lqqVar.f39002b).f33823f);
                if (jfjVarM13042j == null) {
                    jfjVarM13042j = m13042j((jdz) lqqVar.f39002b);
                }
                if (!jfjVarM13042j.m13036o() || this.f33899j.get() == lqqVar.f39001a) {
                    jfjVarM13042j.m13026e((jet) lqqVar.f39003c);
                } else {
                    ((jet) lqqVar.f39003c).mo12974d(f33890a);
                    jfjVarM13042j.m13034m();
                }
                return true;
            case 5:
                int i = message.arg1;
                jcu jcuVar2 = (jcu) message.obj;
                for (jfj jfjVar4 : this.f33900k.values()) {
                    if (jfjVar4.f33874f == i) {
                        jfjVar = jfjVar4;
                        if (jfjVar != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
                        } else if (jcuVar2.f33755c == 13) {
                            int i2 = jdm.f33802c;
                            jfjVar.m13027f(new Status(17, "Error resolution was canceled by the user, original error message: CANCELED: " + jcuVar2.f33757e));
                        } else {
                            jfjVar.m13027f(m13040a(jfjVar.f33871c, jcuVar2));
                        }
                        return true;
                    }
                }
                if (jfjVar != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
                } else if (jcuVar2.f33755c == 13) {
                    int i3 = jdm.f33802c;
                    jfjVar.m13027f(new Status(17, "Error resolution was canceled by the user, original error message: CANCELED: " + jcuVar2.f33757e));
                } else {
                    jfjVar.m13027f(m13040a(jfjVar.f33871c, jcuVar2));
                }
                return true;
            case 6:
                if (this.f33896g.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f33896g.getApplicationContext();
                    synchronized (jex.f33851a) {
                        jex jexVar = jex.f33851a;
                        if (!jexVar.f33855e) {
                            application.registerActivityLifecycleCallbacks(jexVar);
                            application.registerComponentCallbacks(jex.f33851a);
                            jex.f33851a.f33855e = true;
                        }
                        break;
                    }
                    jex jexVar2 = jex.f33851a;
                    AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
                    synchronized (jexVar2) {
                        jexVar2.f33854d.add(ambientController);
                        break;
                    }
                    jex jexVar3 = jex.f33851a;
                    if (!jexVar3.f33853c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!jexVar3.f33853c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            jexVar3.f33852b.set(true);
                        }
                    }
                    if (!jexVar3.f33852b.get()) {
                        this.f33894e = 300000L;
                    }
                }
                return true;
            case 7:
                m13042j((jdz) message.obj);
                return true;
            case 9:
                if (this.f33900k.containsKey(message.obj)) {
                    jfj jfjVar5 = (jfj) this.f33900k.get(message.obj);
                    jib.m13199d(jfjVar5.f33879k.f33903n);
                    if (jfjVar5.f33875g) {
                        jfjVar5.m13025d();
                    }
                }
                return true;
            case 10:
                Iterator it = this.f33907r.iterator();
                while (it.hasNext()) {
                    jfj jfjVar6 = (jfj) this.f33900k.remove((jev) it.next());
                    if (jfjVar6 != null) {
                        jfjVar6.m13034m();
                    }
                }
                this.f33907r.clear();
                return true;
            case 11:
                if (this.f33900k.containsKey(message.obj)) {
                    jfj jfjVar7 = (jfj) this.f33900k.get(message.obj);
                    jib.m13199d(jfjVar7.f33879k.f33903n);
                    if (jfjVar7.f33875g) {
                        jfjVar7.m13035n();
                        jfm jfmVar = jfjVar7.f33879k;
                        jfjVar7.m13027f(jfmVar.f33897h.m12901e(jfmVar.f33896g) == 18 ? new Status(21, xPAWq.ImfRfAJOiOwuR) : new Status(22, "API failed to connect while resuming due to an unknown error."));
                        jfjVar7.f33870b.m12943k("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.f33900k.containsKey(message.obj)) {
                    jfj jfjVar8 = (jfj) this.f33900k.get(message.obj);
                    jib.m13199d(jfjVar8.f33879k.f33903n);
                    if (jfjVar8.f33870b.m12944l() && jfjVar8.f33873e.size() == 0) {
                        ihk ihkVar = jfjVar8.f33880l;
                        if (ihkVar.f30967b.isEmpty() && ihkVar.f30966a.isEmpty()) {
                            jfjVar8.f33870b.m12943k("Timing out service connection.");
                        } else {
                            jfjVar8.m13033l();
                        }
                    }
                }
                return true;
            case 14:
                throw null;
            case 15:
                jfk jfkVar = (jfk) message.obj;
                if (this.f33900k.containsKey(jfkVar.f33882a)) {
                    jfj jfjVar9 = (jfj) this.f33900k.get(jfkVar.f33882a);
                    if (jfjVar9.f33876h.contains(jfkVar) && !jfjVar9.f33875g) {
                        if (jfjVar9.f33870b.m12944l()) {
                            jfjVar9.m13028g();
                        } else {
                            jfjVar9.m13025d();
                        }
                    }
                }
                return true;
            case 16:
                jfk jfkVar2 = (jfk) message.obj;
                if (this.f33900k.containsKey(jfkVar2.f33882a)) {
                    jfj jfjVar10 = (jfj) this.f33900k.get(jfkVar2.f33882a);
                    if (jfjVar10.f33876h.remove(jfkVar2)) {
                        jfjVar10.f33879k.f33903n.removeMessages(15, jfkVar2);
                        jfjVar10.f33879k.f33903n.removeMessages(16, jfkVar2);
                        jcw jcwVar = jfkVar2.f33883b;
                        ArrayList arrayList = new ArrayList(jfjVar10.f33869a.size());
                        for (jet jetVar : jfjVar10.f33869a) {
                            if ((jetVar instanceof jen) && (jcwVarArrMo12972b = ((jen) jetVar).mo12972b(jfjVar10)) != null) {
                                for (int i4 = 0; i4 <= 0; i4++) {
                                    if (jib.m13209n(jcwVarArrMo12972b[i4], jcwVar)) {
                                        if (i4 < 0) {
                                        }
                                        arrayList.add(jetVar);
                                    }
                                    break;
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            jet jetVar2 = (jet) arrayList.get(i5);
                            jfjVar10.f33869a.remove(jetVar2);
                            jetVar2.mo12975e(new jem(jcwVar));
                        }
                    }
                }
                return true;
            case 17:
                m13043k();
                return true;
            case 18:
                jfz jfzVar = (jfz) message.obj;
                if (jfzVar.f33930b == 0) {
                    m13044l().m13227a(new jih(jfzVar.f33929a, Arrays.asList((jhx) jfzVar.f33932d)));
                } else {
                    jih jihVar = this.f33906q;
                    if (jihVar != null) {
                        List list = jihVar.f34128b;
                        if (jihVar.f34127a != jfzVar.f33929a || (list != null && list.size() >= jfzVar.f33931c)) {
                            this.f33903n.removeMessages(17);
                            m13043k();
                        } else {
                            jih jihVar2 = this.f33906q;
                            Object obj = jfzVar.f33932d;
                            if (jihVar2.f34128b == null) {
                                jihVar2.f34128b = new ArrayList();
                            }
                            jihVar2.f34128b.add(obj);
                        }
                    }
                    if (this.f33906q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(jfzVar.f33932d);
                        this.f33906q = new jih(jfzVar.f33929a, arrayList2);
                        Handler handler2 = this.f33903n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), jfzVar.f33930b);
                    }
                }
                return true;
            case 19:
                this.f33895f = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13051i(khb khbVar, int i, jdz jdzVar) {
        boolean z;
        if (i != 0) {
            jev jevVar = jdzVar.f33823f;
            jfy jfyVar = null;
            if (m13049g()) {
                jig jigVar = jif.m13225a().f34121a;
                if (jigVar == null) {
                    z = true;
                } else if (jigVar.f34123b) {
                    z = jigVar.f34124c;
                    jfj jfjVarM13045b = m13045b(jevVar);
                    if (jfjVarM13045b != null) {
                        Object obj = jfjVarM13045b.f33870b;
                        if (obj instanceof jgw) {
                            jgw jgwVar = (jgw) obj;
                            if (jgwVar.m13153B() && !jgwVar.m13163m()) {
                                jhc jhcVarM13124b = jfy.m13124b(jfjVarM13045b, jgwVar, i);
                                if (jhcVarM13124b != null) {
                                    jfjVarM13045b.f33878j++;
                                    z = jhcVarM13124b.f34031c;
                                }
                            }
                        }
                    }
                }
                jfyVar = new jfy(this, i, jevVar, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            }
            if (jfyVar != null) {
                Object obj2 = khbVar.f36008a;
                Handler handler = this.f33903n;
                handler.getClass();
                ((jpp) obj2).mo13455h(new ltz(handler, 1), jfyVar);
            }
        }
    }
}
