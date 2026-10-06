package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkw implements kba {

    /* JADX INFO: renamed from: l */
    private static int f36415l = 0;

    /* JADX INFO: renamed from: a */
    public final kpz f36416a;

    /* JADX INFO: renamed from: b */
    public final int f36417b;

    /* JADX INFO: renamed from: c */
    public final kbc f36418c;

    /* JADX INFO: renamed from: d */
    public final Executor f36419d;

    /* JADX INFO: renamed from: f */
    public final kbo f36421f;

    /* JADX INFO: renamed from: g */
    public final kce f36422g;

    /* JADX INFO: renamed from: k */
    public final lpe f36426k;

    /* JADX INFO: renamed from: m */
    private final jvb f36427m;

    /* JADX INFO: renamed from: o */
    private final kbz f36429o;

    /* JADX INFO: renamed from: p */
    private final kkt f36430p;

    /* JADX INFO: renamed from: r */
    private final String f36432r;

    /* JADX INFO: renamed from: t */
    private List f36434t;

    /* JADX INFO: renamed from: u */
    private kpw f36435u;

    /* JADX INFO: renamed from: j */
    public boolean f36425j = false;

    /* JADX INFO: renamed from: s */
    private boolean f36433s = true;

    /* JADX INFO: renamed from: h */
    public final Deque f36423h = new ArrayDeque();

    /* JADX INFO: renamed from: i */
    public final Queue f36424i = new nao(new ArrayDeque());

    /* JADX INFO: renamed from: n */
    private final Runnable f36428n = new jzq(this, 16);

    /* JADX INFO: renamed from: e */
    public final Runnable f36420e = new jzq(this, 17);

    /* JADX INFO: renamed from: q */
    private final long f36431q = m14468d();

    public kkw(kpz kpzVar, jvb jvbVar, Executor executor, kbo kboVar, kbz kbzVar, lpe lpeVar, kkt kktVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f36416a = kpzVar;
        this.f36417b = kpzVar.mo14507b();
        this.f36427m = jvbVar;
        this.f36419d = executor;
        this.f36421f = kboVar;
        this.f36429o = kbzVar;
        this.f36426k = lpeVar;
        this.f36418c = kbc.m13903h(kpzVar.mo14509d(), kpzVar.mo14506a());
        this.f36430p = kktVar;
        this.f36422g = kbzVar.mo13958b("PckImageCount_".concat(lle.m15697q(kpzVar)));
        this.f36432r = "distribute_".concat(lle.m15697q(kpzVar));
    }

    /* JADX INFO: renamed from: d */
    private static synchronized int m14468d() {
        int i;
        i = f36415l;
        f36415l = i + 1;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0206 A[Catch: all -> 0x0249, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:34:0x0072, B:37:0x008f, B:39:0x0093, B:40:0x009d, B:42:0x00a3, B:44:0x00af, B:50:0x00be, B:51:0x00c5, B:53:0x00cb, B:55:0x00d7, B:58:0x00e3, B:59:0x00e8, B:72:0x0126, B:60:0x00ef, B:61:0x00f6, B:63:0x00fc, B:65:0x0108, B:67:0x0110, B:70:0x011a, B:71:0x011f, B:73:0x0128, B:75:0x012c, B:78:0x0134, B:79:0x0138, B:81:0x013f, B:84:0x015c, B:85:0x0168, B:104:0x01f9, B:105:0x0200, B:107:0x0206, B:109:0x0215, B:114:0x0227, B:116:0x023c, B:117:0x0244), top: B:128:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0215 A[Catch: all -> 0x0249, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:34:0x0072, B:37:0x008f, B:39:0x0093, B:40:0x009d, B:42:0x00a3, B:44:0x00af, B:50:0x00be, B:51:0x00c5, B:53:0x00cb, B:55:0x00d7, B:58:0x00e3, B:59:0x00e8, B:72:0x0126, B:60:0x00ef, B:61:0x00f6, B:63:0x00fc, B:65:0x0108, B:67:0x0110, B:70:0x011a, B:71:0x011f, B:73:0x0128, B:75:0x012c, B:78:0x0134, B:79:0x0138, B:81:0x013f, B:84:0x015c, B:85:0x0168, B:104:0x01f9, B:105:0x0200, B:107:0x0206, B:109:0x0215, B:114:0x0227, B:116:0x023c, B:117:0x0244), top: B:128:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0227 A[Catch: all -> 0x0249, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:34:0x0072, B:37:0x008f, B:39:0x0093, B:40:0x009d, B:42:0x00a3, B:44:0x00af, B:50:0x00be, B:51:0x00c5, B:53:0x00cb, B:55:0x00d7, B:58:0x00e3, B:59:0x00e8, B:72:0x0126, B:60:0x00ef, B:61:0x00f6, B:63:0x00fc, B:65:0x0108, B:67:0x0110, B:70:0x011a, B:71:0x011f, B:73:0x0128, B:75:0x012c, B:78:0x0134, B:79:0x0138, B:81:0x013f, B:84:0x015c, B:85:0x0168, B:104:0x01f9, B:105:0x0200, B:107:0x0206, B:109:0x0215, B:114:0x0227, B:116:0x023c, B:117:0x0244), top: B:128:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x023c A[Catch: all -> 0x0249, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:34:0x0072, B:37:0x008f, B:39:0x0093, B:40:0x009d, B:42:0x00a3, B:44:0x00af, B:50:0x00be, B:51:0x00c5, B:53:0x00cb, B:55:0x00d7, B:58:0x00e3, B:59:0x00e8, B:72:0x0126, B:60:0x00ef, B:61:0x00f6, B:63:0x00fc, B:65:0x0108, B:67:0x0110, B:70:0x011a, B:71:0x011f, B:73:0x0128, B:75:0x012c, B:78:0x0134, B:79:0x0138, B:81:0x013f, B:84:0x015c, B:85:0x0168, B:104:0x01f9, B:105:0x0200, B:107:0x0206, B:109:0x0215, B:114:0x0227, B:116:0x023c, B:117:0x0244), top: B:128:0x000c, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x013f A[Catch: all -> 0x0249, TryCatch #1 {, blocks: (B:5:0x000c, B:7:0x0010, B:11:0x0017, B:13:0x001b, B:15:0x001f, B:17:0x0023, B:18:0x0037, B:20:0x003b, B:22:0x003f, B:24:0x0044, B:25:0x004b, B:27:0x0051, B:29:0x0060, B:34:0x0072, B:37:0x008f, B:39:0x0093, B:40:0x009d, B:42:0x00a3, B:44:0x00af, B:50:0x00be, B:51:0x00c5, B:53:0x00cb, B:55:0x00d7, B:58:0x00e3, B:59:0x00e8, B:72:0x0126, B:60:0x00ef, B:61:0x00f6, B:63:0x00fc, B:65:0x0108, B:67:0x0110, B:70:0x011a, B:71:0x011f, B:73:0x0128, B:75:0x012c, B:78:0x0134, B:79:0x0138, B:81:0x013f, B:84:0x015c, B:85:0x0168, B:104:0x01f9, B:105:0x0200, B:107:0x0206, B:109:0x0215, B:114:0x0227, B:116:0x023c, B:117:0x0244), top: B:128:0x000c, outer: #2 }] */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0245, code lost:
    
        r0 = r16.f36429o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        r0 = r16.f36429o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r0 = r16.f36429o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        r0 = r16.f36429o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0169, code lost:
    
        r16.f36429o.mo13961e(r16.f36432r);
        r2 = new p000.kmv(r5);
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017d, code lost:
    
        if (r3.hasNext() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017f, code lost:
    
        r6 = (p000.klc) r3.next();
        r8 = r6.mo14460c();
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0192, code lost:
    
        if (r8.f35811b != r0.f35811b) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019a, code lost:
    
        if (r8.f35812c != r0.f35812c) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019c, code lost:
    
        r6.mo14465k(r2.m14585k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a4, code lost:
    
        r16.f36421f.mo13947i("Distributing null to " + java.lang.String.valueOf(r6.mo14461d()) + " for frame " + r8.f35812c + " at " + r8.f35811b + " because it is older than " + r5.toString());
        r6.mo14465k(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e7, code lost:
    
        r2.m14586l();
        r16.f36429o.mo13962f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ef, code lost:
    
        monitor-enter(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
    
        r16.f36433s = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f3, code lost:
    
        monitor-exit(r16);
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14469a() {
        kbz kbzVar;
        List list;
        klc klcVar;
        kkt kktVar;
        kfd kfdVarMo14460c;
        kfd kfdVarMo14460c2;
        kfd kfdVarMo14460c3;
        Iterator it;
        kfd kfdVarMo14460c4;
        kfd kfdVarMo14460c5;
        ArrayList arrayList;
        this.f36429o.mo13961e("distribute");
        try {
            kfd kfdVar = kfd.f35810a;
            while (true) {
                synchronized (this) {
                    if (!this.f36425j) {
                        if (this.f36433s) {
                            if (this.f36435u == null) {
                                this.f36429o.mo13961e("acquire");
                                this.f36435u = this.f36416a.mo14512g();
                                this.f36429o.mo13962f();
                            }
                            kpw kpwVar = this.f36435u;
                            if (kpwVar != null) {
                                if (this.f36434t == null) {
                                    klc klcVar2 = null;
                                    for (klc klcVar3 : this.f36423h) {
                                        kfd kfdVarMo14460c6 = klcVar3.mo14460c();
                                        kfdVarMo14460c6.getClass();
                                        if (klcVar2 != null) {
                                            kfd kfdVarMo14460c7 = klcVar2.mo14460c();
                                            kfdVarMo14460c7.getClass();
                                            if (kfdVarMo14460c6.compareTo(kfdVarMo14460c7) > 0) {
                                            }
                                        }
                                        klcVar2 = klcVar3;
                                    }
                                    if (klcVar2 != null) {
                                        kkt kktVar2 = this.f36430p;
                                        kfd kfdVarMo14460c8 = klcVar2.mo14460c();
                                        kfdVarMo14460c8.getClass();
                                        if (((kpwVar.mo7248d() - kfdVarMo14460c8.f35811b) - kktVar2.f36410b) - kktVar2.f36409a <= 0) {
                                        }
                                    }
                                    long jMo7248d = kpwVar.mo7248d();
                                    Iterator it2 = this.f36423h.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            kfdVarMo14460c5 = null;
                                            break;
                                        }
                                        kfdVarMo14460c5 = ((klc) it2.next()).mo14460c();
                                        if (kfdVarMo14460c5 != null && this.f36430p.m14466a(kfdVarMo14460c5.f35811b, jMo7248d)) {
                                            break;
                                        }
                                    }
                                    if (kfdVarMo14460c5 == null) {
                                        Iterator it3 = this.f36423h.iterator();
                                        arrayList = null;
                                        while (it3.hasNext()) {
                                            klc klcVar4 = (klc) it3.next();
                                            kfd kfdVarMo14460c9 = klcVar4.mo14460c();
                                            if (kfdVarMo14460c9 != null && !this.f36430p.m14467b(kfdVarMo14460c9.f35811b, jMo7248d)) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList(2);
                                                }
                                                arrayList.add(klcVar4);
                                                it3.remove();
                                            }
                                        }
                                    } else {
                                        Iterator it4 = this.f36423h.iterator();
                                        arrayList = null;
                                        while (it4.hasNext()) {
                                            klc klcVar5 = (klc) it4.next();
                                            kfd kfdVarMo14460c10 = klcVar5.mo14460c();
                                            if (kfdVarMo14460c10 != null && (kfdVarMo14460c10.f35813d <= kfdVarMo14460c5.f35813d || kfdVarMo14460c10.f35811b == kfdVarMo14460c5.f35811b)) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList(2);
                                                }
                                                arrayList.add(klcVar5);
                                                it4.remove();
                                            }
                                        }
                                    }
                                    this.f36434t = arrayList;
                                    list = this.f36434t;
                                    if (list != null && !list.isEmpty()) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            kfdVarMo14460c4 = ((klc) it.next()).mo14460c();
                                            kfdVarMo14460c4.getClass();
                                            if (true == this.f36430p.m14466a(kfdVarMo14460c4.f35811b, kpwVar.mo7248d())) {
                                                kfdVar = kfdVarMo14460c4;
                                            }
                                        }
                                        kku kkuVar = new kku(this, kpwVar, kfdVar);
                                        this.f36433s = false;
                                        this.f36435u = null;
                                        this.f36434t = null;
                                    }
                                    klcVar = null;
                                    for (klc klcVar6 : this.f36423h) {
                                        kfdVarMo14460c2 = klcVar6.mo14460c();
                                        kfdVarMo14460c2.getClass();
                                        if (klcVar != null) {
                                            kfdVarMo14460c3 = klcVar.mo14460c();
                                            kfdVarMo14460c3.getClass();
                                            if (kfdVarMo14460c2.compareTo(kfdVarMo14460c3) < 0) {
                                            }
                                        }
                                        klcVar = klcVar6;
                                    }
                                    if (klcVar != null) {
                                        kktVar = this.f36430p;
                                        kfdVarMo14460c = klcVar.mo14460c();
                                        kfdVarMo14460c.getClass();
                                        if (kktVar.m14467b(kfdVarMo14460c.f35811b, kpwVar.mo7248d())) {
                                            this.f36435u = null;
                                            kpwVar.close();
                                            m14470b();
                                        }
                                    }
                                } else {
                                    list = this.f36434t;
                                    if (list != null) {
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            kfdVarMo14460c4 = ((klc) it.next()).mo14460c();
                                            kfdVarMo14460c4.getClass();
                                            if (true == this.f36430p.m14466a(kfdVarMo14460c4.f35811b, kpwVar.mo7248d())) {
                                                kfdVar = kfdVarMo14460c4;
                                            }
                                        }
                                        kku kkuVar2 = new kku(this, kpwVar, kfdVar);
                                        this.f36433s = false;
                                        this.f36435u = null;
                                        this.f36434t = null;
                                    }
                                    klcVar = null;
                                    while (r0.hasNext()) {
                                        kfdVarMo14460c2 = klcVar6.mo14460c();
                                        kfdVarMo14460c2.getClass();
                                        if (klcVar != null) {
                                            kfdVarMo14460c3 = klcVar.mo14460c();
                                            kfdVarMo14460c3.getClass();
                                            if (kfdVarMo14460c2.compareTo(kfdVarMo14460c3) < 0) {
                                            }
                                        }
                                        klcVar = klcVar6;
                                    }
                                    if (klcVar != null) {
                                        kktVar = this.f36430p;
                                        kfdVarMo14460c = klcVar.mo14460c();
                                        kfdVarMo14460c.getClass();
                                        if (kktVar.m14467b(kfdVarMo14460c.f35811b, kpwVar.mo7248d())) {
                                            this.f36435u = null;
                                            kpwVar.close();
                                            m14470b();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                kbzVar = this.f36429o;
            }
            kbzVar.mo13962f();
        } catch (Throwable th) {
            this.f36429o.mo13962f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14470b() {
        synchronized (this) {
            if (!this.f36425j) {
                this.f36419d.execute(this.f36428n);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14471c(kgg kggVar, long j) {
        this.f36419d.execute(new frn(this, kggVar, j, new ArrayList(), 3));
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        kpw kpwVar;
        ArrayList arrayList;
        synchronized (this) {
            if (this.f36425j) {
                return;
            }
            this.f36425j = true;
            synchronized (this) {
                kpwVar = this.f36435u;
                arrayList = new ArrayList();
                List list = this.f36434t;
                if (list != null) {
                    arrayList.addAll(list);
                }
                arrayList.addAll(this.f36423h);
                this.f36435u = null;
                this.f36434t = null;
                this.f36423h.clear();
            }
            if (kpwVar != null) {
                kpwVar.close();
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((klc) arrayList.get(i)).mo14465k(null);
            }
            this.f36427m.close();
        }
    }

    public final String toString() {
        return lle.m15697q(this.f36416a) + "-" + this.f36431q;
    }
}
