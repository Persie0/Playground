package p000;

import androidx.compose.runtime.AbstractC0278f;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ed9 {

    /* JADX INFO: renamed from: a */
    public final vi3 f37070a;

    /* JADX INFO: renamed from: c */
    public boolean f37072c;

    /* JADX INFO: renamed from: h */
    public sd3 f37077h;

    /* JADX INFO: renamed from: i */
    public dd9 f37078i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f37071b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C3186kj f37073d = new C3186kj(this, 21);

    /* JADX INFO: renamed from: e */
    public final kv4 f37074e = new kv4(this, 25);

    /* JADX INFO: renamed from: f */
    public final x66 f37075f = new x66(new dd9[16]);

    /* JADX INFO: renamed from: g */
    public final Object f37076g = new Object();

    /* JADX INFO: renamed from: j */
    public long f37079j = -1;

    public ed9(vi3 vi3Var) {
        this.f37070a = vi3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m11065a() {
        synchronized (this.f37076g) {
            x66 x66Var = this.f37075f;
            Object[] objArr = x66Var.f67830a;
            int i = x66Var.f67832c;
            for (int i2 = 0; i2 < i; i2++) {
                dd9 dd9Var = (dd9) objArr[i2];
                dd9Var.f35458e.m17249a();
                dd9Var.f35459f.m17249a();
                dd9Var.f35465l.m17249a();
                dd9Var.f35466m.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11066b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f37076g) {
            z = this.f37072c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f37071b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        cf1.m4606b("Unexpected notification");
                        C3386nv.m17631r();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                do {
                    if (atomicReference.compareAndSet(obj, obj2)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.f37076g) {
                x66 x66Var = this.f37075f;
                Object[] objArr = x66Var.f67830a;
                int i = x66Var.f67832c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((dd9) objArr[i2]).m10297a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m11067c(Object obj, vi3 vi3Var, ui3 ui3Var) {
        x66 x66Var;
        Object obj2;
        dd9 dd9Var;
        boolean z;
        dd9 dd9Var2;
        long j;
        long j2;
        dd9 dd9Var3;
        jc9 bbaVar;
        long j3;
        d66 d66Var;
        int i;
        long j4;
        d66 d66Var2;
        long jM20393t = r46.m20393t();
        synchronized (this.f37076g) {
            x66Var = this.f37075f;
            Object[] objArr = x66Var.f67830a;
            int i2 = x66Var.f67832c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((dd9) obj2).f35454a == vi3Var) {
                    break;
                } else {
                    i3++;
                }
            }
            dd9Var = (dd9) obj2;
            z = true;
            if (dd9Var == null) {
                vi3Var.getClass();
                lda.m16119e(1, vi3Var);
                dd9Var = new dd9(vi3Var);
                x66Var.m24305c(dd9Var);
            }
            dd9Var2 = this.f37078i;
            j = this.f37079j;
        }
        Object obj3 = x66Var;
        if (j != -1 && j != jM20393t) {
            obj3 = x66Var;
            StringBuilder sbM22996s = ux5.m22996s(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbM22996s.append(jM20393t);
            sbM22996s.append(", name=");
            sbM22996s.append(Thread.currentThread().getName());
            sbM22996s.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            hi7.m13278a(sbM22996s.toString());
            obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
        }
        try {
            obj3 = x66Var;
            synchronized (this.f37076g) {
                try {
                    this.f37078i = dd9Var;
                    this.f37079j = jM20393t;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            kv4 kv4Var = this.f37074e;
            Object obj4 = dd9Var.f35455b;
            d66 d66Var3 = dd9Var.f35456c;
            int i4 = dd9Var.f35457d;
            dd9Var.f35455b = obj;
            dd9Var.f35456c = (d66) dd9Var.f35459f.m17255g(obj);
            if (dd9Var.f35457d == -1) {
                dd9Var.f35457d = Long.hashCode(nc9.m17358j().mo3582g());
            }
            sj3 sj3Var = dd9Var.f35462i;
            x66 x66VarM1253c = AbstractC0278f.m1253c();
            try {
                x66VarM1253c.m24305c(sj3Var);
                if (kv4Var == null) {
                    ui3Var.mo0a();
                    dd9Var3 = dd9Var;
                } else {
                    jc9 jc9Var = (jc9) nc9.f52601b.m21566g();
                    if (jc9Var instanceof bba) {
                        dd9Var3 = dd9Var;
                        if (((bba) jc9Var).f8301t == r46.m20393t()) {
                            vi3 vi3Var2 = ((bba) jc9Var).f8299r;
                            vi3 vi3Var3 = ((bba) jc9Var).f8300s;
                            try {
                                ((bba) jc9Var).f8299r = nc9.m17359k(kv4Var, vi3Var2, true);
                                ((bba) jc9Var).f8300s = vi3Var3;
                                ui3Var.mo0a();
                                ((bba) jc9Var).f8299r = vi3Var2;
                                ((bba) jc9Var).f8300s = vi3Var3;
                            } catch (Throwable th2) {
                                ((bba) jc9Var).f8299r = vi3Var2;
                                ((bba) jc9Var).f8300s = vi3Var3;
                                throw th2;
                            }
                        }
                    } else {
                        dd9Var3 = dd9Var;
                    }
                    if (jc9Var == null || (jc9Var instanceof s66)) {
                        bbaVar = new bba(jc9Var instanceof s66 ? (s66) jc9Var : null, kv4Var, null, true, false);
                    } else {
                        bbaVar = jc9Var.mo3170u(kv4Var);
                    }
                    try {
                        jc9 jc9VarM14393j = bbaVar.m14393j();
                        try {
                            ui3Var.mo0a();
                            jc9.m14390q(jc9VarM14393j);
                            bbaVar.mo3162c();
                        } catch (Throwable th3) {
                            try {
                                jc9.m14390q(jc9VarM14393j);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    bbaVar.mo3162c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    x66VarM1253c.m24314l(x66VarM1253c.f67832c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                x66VarM1253c.m24314l(x66VarM1253c.f67832c - 1);
                dd9 dd9Var4 = dd9Var3;
                Object obj5 = dd9Var4.f35455b;
                obj5.getClass();
                int i5 = dd9Var4.f35457d;
                d66 d66Var4 = dd9Var4.f35456c;
                if (d66Var4 != null) {
                    try {
                        long[] jArr = d66Var4.f35034a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                d66 d66Var5 = d66Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            d66Var2 = d66Var5;
                                            Object obj6 = d66Var2.f35035b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = d66Var2.f35036c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    dd9Var4.m10299c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    d66Var2.m10127f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.f37076g) {
                                                    this.f37078i = dd9Var2;
                                                    this.f37079j = j2;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            d66Var2 = d66Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        d66Var5 = d66Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    d66Var = d66Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    d66Var = d66Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                d66Var4 = d66Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.f37076g) {
                            this.f37078i = dd9Var2;
                            this.f37079j = j2;
                            throw th;
                        }
                    }
                } else {
                    j3 = j;
                }
                dd9Var4.f35455b = obj4;
                dd9Var4.f35456c = d66Var3;
                dd9Var4.f35457d = i4;
                synchronized (this.f37076g) {
                    this.f37078i = dd9Var2;
                    this.f37079j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11068d() {
        C3186kj c3186kj = this.f37073d;
        nc9.m17353e(nc9.f52600a);
        synchronized (nc9.f52602c) {
            nc9.f52607h = u91.m22604V0(nc9.f52607h, c3186kj);
        }
        this.f37077h = new sd3(c3186kj);
    }
}
