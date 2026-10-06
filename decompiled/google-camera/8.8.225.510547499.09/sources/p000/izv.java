package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class izv {

    /* JADX INFO: renamed from: h */
    private static volatile izv f32727h;

    /* JADX INFO: renamed from: a */
    public final Context f32728a;

    /* JADX INFO: renamed from: b */
    public final Context f32729b;

    /* JADX INFO: renamed from: c */
    public final jah f32730c;

    /* JADX INFO: renamed from: d */
    public final jar f32731d;

    /* JADX INFO: renamed from: e */
    public final jak f32732e;

    /* JADX INFO: renamed from: f */
    public final jau f32733f;

    /* JADX INFO: renamed from: g */
    public final jis f32734g;

    /* JADX INFO: renamed from: i */
    private final izo f32735i;

    /* JADX INFO: renamed from: j */
    private final izq f32736j;

    /* JADX INFO: renamed from: k */
    private final jaz f32737k;

    protected izv(ihk ihkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        Object obj = ihkVar.f30967b;
        jib.m13206k(obj, "Application context can't be null");
        Object obj2 = ihkVar.f30966a;
        jib.m13205j(obj2);
        this.f32728a = (Context) obj;
        this.f32729b = (Context) obj2;
        this.f32734g = jis.f34138a;
        this.f32730c = new jah(this);
        jar jarVar = new jar(this);
        jarVar.m11944A();
        this.f32731d = jarVar;
        m11951d().m11942w(4, "Google Analytics " + izt.f32725a + " is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4", null, null, null);
        jau jauVar = new jau(this);
        jauVar.m11944A();
        this.f32733f = jauVar;
        jaz jazVar = new jaz(this);
        jazVar.m11944A();
        this.f32737k = jazVar;
        izq izqVar = new izq(this);
        jag jagVar = new jag(this);
        izp izpVar = new izp(this);
        jab jabVar = new jab(this);
        jaj jajVar = new jaj(this);
        jib.m13205j(obj);
        if (izo.f32717a == null) {
            synchronized (izo.class) {
                if (izo.f32717a == null) {
                    izo.f32717a = new izo((Context) obj);
                }
            }
        }
        izo izoVar = izo.f32717a;
        izoVar.f32719c = new izu(this);
        this.f32735i = izoVar;
        izg izgVar = new izg(this);
        jagVar.m11944A();
        izpVar.m11944A();
        jabVar.m11944A();
        jajVar.m11944A();
        jak jakVar = new jak(this);
        jakVar.m11944A();
        this.f32732e = jakVar;
        izqVar.m11944A();
        this.f32736j = izqVar;
        jaz jazVarM11952e = izgVar.f32713b.m11952e();
        jazVarM11952e.m11946z();
        jazVarM11952e.m11946z();
        if (jazVarM11952e.f33640f) {
            jazVarM11952e.m11946z();
            boolean z = jazVarM11952e.f33641g;
        }
        jazVarM11952e.m11946z();
        jaf jafVar = izqVar.f32722a;
        jafVar.m11946z();
        jib.m13202g(!jafVar.f33554a, "Analytics backend already started");
        jafVar.f33554a = true;
        jafVar.m11925e().m11917b(new ith(jafVar, 11));
    }

    /* JADX INFO: renamed from: c */
    public static izv m11947c(Context context) {
        jib.m13205j(context);
        if (f32727h == null) {
            synchronized (izv.class) {
                if (f32727h == null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    izv izvVar = new izv(new ihk(context, (byte[]) null), null, null, null, null);
                    f32727h = izvVar;
                    List list = izg.f32707a;
                    synchronized (izg.class) {
                        List list2 = izg.f32707a;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            izg.f32707a = null;
                        }
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    long jLongValue = ((Long) jam.f33577B.m11334D()).longValue();
                    if (jElapsedRealtime2 > jLongValue) {
                        izvVar.m11951d().m11941v("Slow initialization (ms)", Long.valueOf(jElapsedRealtime2), Long.valueOf(jLongValue));
                    }
                }
            }
        }
        return f32727h;
    }

    /* JADX INFO: renamed from: f */
    public static final void m11948f(izs izsVar) {
        jib.m13206k(izsVar, "Analytics service not created/initialized");
        jib.m13197b(izsVar.m11945B(), "Analytics service not initialized");
    }

    /* JADX INFO: renamed from: a */
    public final izo m11949a() {
        jib.m13205j(this.f32735i);
        return this.f32735i;
    }

    /* JADX INFO: renamed from: b */
    public final izq m11950b() {
        m11948f(this.f32736j);
        return this.f32736j;
    }

    /* JADX INFO: renamed from: d */
    public final jar m11951d() {
        m11948f(this.f32731d);
        return this.f32731d;
    }

    /* JADX INFO: renamed from: e */
    public final jaz m11952e() {
        m11948f(this.f32737k);
        return this.f32737k;
    }
}
