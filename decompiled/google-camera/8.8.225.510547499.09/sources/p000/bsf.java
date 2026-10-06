package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bsf implements Runnable, Comparable, bsa, cbn {

    /* JADX INFO: renamed from: A */
    private int f4297A;

    /* JADX INFO: renamed from: B */
    private int f4298B;

    /* JADX INFO: renamed from: c */
    public bpc f4302c;

    /* JADX INFO: renamed from: d */
    public bqn f4303d;

    /* JADX INFO: renamed from: e */
    public bpe f4304e;

    /* JADX INFO: renamed from: f */
    public int f4305f;

    /* JADX INFO: renamed from: g */
    public int f4306g;

    /* JADX INFO: renamed from: h */
    public bsk f4307h;

    /* JADX INFO: renamed from: i */
    public bqr f4308i;

    /* JADX INFO: renamed from: j */
    public bsd f4309j;

    /* JADX INFO: renamed from: k */
    public int f4310k;

    /* JADX INFO: renamed from: l */
    public boolean f4311l;

    /* JADX INFO: renamed from: m */
    public bqn f4312m;

    /* JADX INFO: renamed from: n */
    public volatile bsb f4313n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f4314o;

    /* JADX INFO: renamed from: p */
    public int f4315p;

    /* JADX INFO: renamed from: q */
    public final bsm f4316q;

    /* JADX INFO: renamed from: t */
    private final aed f4319t;

    /* JADX INFO: renamed from: u */
    private Thread f4320u;

    /* JADX INFO: renamed from: v */
    private bqn f4321v;

    /* JADX INFO: renamed from: w */
    private Object f4322w;

    /* JADX INFO: renamed from: x */
    private bra f4323x;

    /* JADX INFO: renamed from: y */
    private volatile boolean f4324y;

    /* JADX INFO: renamed from: z */
    private boolean f4325z;

    /* JADX INFO: renamed from: a */
    public final bsc f4300a = new bsc();

    /* JADX INFO: renamed from: s */
    private final List f4318s = new ArrayList();

    /* JADX INFO: renamed from: C */
    private final fky f4299C = fky.m8534d();

    /* JADX INFO: renamed from: r */
    public final npa f4317r = new npa();

    /* JADX INFO: renamed from: b */
    public final bse f4301b = new bse();

    public bsf(bsm bsmVar, aed aedVar) {
        this.f4316q = bsmVar;
        this.f4319t = aedVar;
    }

    /* JADX INFO: renamed from: g */
    private final int m2983g() {
        return this.f4304e.ordinal();
    }

    /* JADX INFO: renamed from: j */
    private final void m2986j() {
        m2988l();
        bsv bsvVar = new bsv("Failed to load resource", new ArrayList(this.f4318s));
        bsd bsdVar = this.f4309j;
        synchronized (bsdVar) {
            ((bsr) bsdVar).f4353g = bsvVar;
        }
        synchronized (bsdVar) {
            ((bsr) bsdVar).f4358l.m8537c();
            if (((bsr) bsdVar).f4356j) {
                ((bsr) bsdVar).m3010e();
            } else {
                if (((bsr) bsdVar).f4347a.m3004e()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (((bsr) bsdVar).f4354h) {
                    throw new IllegalStateException("Already failed once");
                }
                ((bsr) bsdVar).f4354h = true;
                bqn bqnVar = ((bsr) bsdVar).f4348b;
                bsq<bsp> bsqVarM3002c = ((bsr) bsdVar).f4347a.m3002c();
                ((bsr) bsdVar).m3009d(bsqVarM3002c.m3001a() + 1);
                bsr bsrVar = (bsr) bsdVar;
                bsrVar.f4360n.m15538p(bsrVar, bqnVar, null);
                for (bsp bspVar : bsqVarM3002c) {
                    bspVar.f4345b.execute(new bso(bsrVar, bspVar.f4344a, 1));
                }
                bsrVar.m3008c();
            }
        }
        if (this.f4301b.m2981c()) {
            m2989a();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m2987k() {
        this.f4320u = Thread.currentThread();
        SystemClock.elapsedRealtimeNanos();
        boolean zMo2967c = false;
        while (!this.f4314o && this.f4313n != null && !(zMo2967c = this.f4313n.mo2967c())) {
            this.f4297A = m2990c(this.f4297A);
            this.f4313n = m2984h();
            if (this.f4297A == 4) {
                m2991e(2);
                return;
            }
        }
        if ((this.f4297A == 6 || this.f4314o) && !zMo2967c) {
            m2986j();
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m2988l() {
        Throwable th;
        this.f4299C.m8537c();
        if (!this.f4324y) {
            this.f4324y = true;
            return;
        }
        if (this.f4318s.isEmpty()) {
            th = null;
        } else {
            List list = this.f4318s;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* JADX INFO: renamed from: a */
    public final void m2989a() {
        this.f4301b.m2979a();
        npa npaVar = this.f4317r;
        npaVar.f44016a = null;
        npaVar.f44018c = null;
        npaVar.f44017b = null;
        bsc bscVar = this.f4300a;
        bscVar.f4278c = null;
        bscVar.f4279d = null;
        bscVar.f4288m = null;
        bscVar.f4282g = null;
        bscVar.f4285j = null;
        bscVar.f4283h = null;
        bscVar.f4289n = null;
        bscVar.f4284i = null;
        bscVar.f4290o = null;
        bscVar.f4276a.clear();
        bscVar.f4286k = false;
        bscVar.f4277b.clear();
        bscVar.f4287l = false;
        this.f4324y = false;
        this.f4302c = null;
        this.f4303d = null;
        this.f4308i = null;
        this.f4304e = null;
        this.f4309j = null;
        this.f4297A = 0;
        this.f4313n = null;
        this.f4320u = null;
        this.f4312m = null;
        this.f4322w = null;
        this.f4298B = 0;
        this.f4323x = null;
        this.f4314o = false;
        this.f4318s.clear();
        this.f4319t.mo321b(this);
    }

    @Override // p000.bsa
    /* JADX INFO: renamed from: b */
    public final void mo2968b(bqn bqnVar, Exception exc, bra braVar, int i) {
        braVar.mo2939d();
        bsv bsvVar = new bsv("Fetching data failed", Collections.singletonList(exc));
        bsvVar.m3025b(bqnVar, i, braVar.mo2934a());
        this.f4318s.add(bsvVar);
        if (Thread.currentThread() != this.f4320u) {
            m2991e(2);
        } else {
            m2987k();
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bsf bsfVar = (bsf) obj;
        int iM2983g = m2983g() - bsfVar.m2983g();
        return iM2983g == 0 ? this.f4310k - bsfVar.f4310k : iM2983g;
    }

    @Override // p000.bsa
    /* JADX INFO: renamed from: d */
    public final void mo2969d(bqn bqnVar, Object obj, bra braVar, int i, bqn bqnVar2) {
        this.f4312m = bqnVar;
        this.f4322w = obj;
        this.f4323x = braVar;
        this.f4298B = i;
        this.f4321v = bqnVar2;
        this.f4325z = bqnVar != this.f4300a.m2974e().get(0);
        if (Thread.currentThread() == this.f4320u) {
            m2985i();
        } else {
            m2991e(3);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2991e(int i) {
        this.f4315p = i;
        ((bsr) this.f4309j).m3006a().execute(this);
    }

    @Override // p000.cbn
    /* JADX INFO: renamed from: f */
    public final fky mo2992f() {
        return this.f4299C;
    }

    /* JADX INFO: renamed from: h */
    private final bsb m2984h() {
        int i = this.f4297A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                return new bta(this.f4300a, this);
            case 2:
                bsc bscVar = this.f4300a;
                return new bry(bscVar.m2974e(), bscVar, this);
            case 3:
                return new bte(this.f4300a, this);
            case 4:
            default:
                throw new IllegalStateException("Unrecognized stage: ".concat(bzq.m3265e(i)));
            case 5:
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2990c(int i) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 0:
                if (this.f4307h.mo2995b()) {
                    return 2;
                }
                return m2990c(2);
            case 1:
                if (this.f4307h.mo2994a()) {
                    return 3;
                }
                return m2990c(3);
            case 2:
                return this.f4311l ? 6 : 4;
            case 3:
            case 5:
                return 6;
            case 4:
            default:
                throw new IllegalArgumentException("Unrecognized stage: ".concat(bzq.m3265e(i)));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        bra braVar = this.f4323x;
        try {
            try {
                if (this.f4314o) {
                    m2986j();
                    if (braVar == null) {
                        return;
                    }
                } else {
                    int i = this.f4315p;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    switch (i2) {
                        case 0:
                            this.f4297A = m2990c(1);
                            this.f4313n = m2984h();
                            m2987k();
                            break;
                        case 1:
                            m2987k();
                            break;
                        case 2:
                            m2985i();
                            break;
                        default:
                            switch (i) {
                                case 1:
                                    str = "INITIALIZE";
                                    break;
                                case 2:
                                    str = "SWITCH_TO_SOURCE_SERVICE";
                                    break;
                                default:
                                    str = "DECODE_DATA";
                                    break;
                            }
                            throw new IllegalStateException("Unrecognized run reason: ".concat(str));
                    }
                    if (braVar == null) {
                        return;
                    }
                }
                braVar.mo2939d();
            } catch (Throwable th) {
                if (braVar != null) {
                    braVar.mo2939d();
                }
                throw th;
            }
        } catch (brx e) {
            throw e;
        } catch (Throwable th2) {
            if (this.f4297A != 5) {
                this.f4318s.add(th2);
                m2986j();
            }
            if (!this.f4314o) {
                throw th2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8 A[LOOP:1: B:27:0x0079->B:84:0x01c8, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [bqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [bqf, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    private final void m2985i() {
        boolean z;
        bsz bszVarM3027d;
        List list;
        int i;
        int i2;
        int i3;
        List list2;
        int i4;
        bsz bszVarM3027d2;
        bqv bqvVar;
        int iMo2932b;
        bqu bquVarM2613g;
        boolean z2;
        Object brzVar;
        try {
            bra braVar = this.f4323x;
            Object obj = this.f4322w;
            int i5 = this.f4298B;
            if (obj == null) {
                braVar.mo2939d();
                bszVarM3027d = null;
            } else {
                try {
                    SystemClock.elapsedRealtimeNanos();
                    bsx bsxVarM2971b = this.f4300a.m2971b(obj.getClass());
                    bqr bqrVar = this.f4308i;
                    int i6 = 4;
                    boolean z3 = i5 == 4 || this.f4300a.f4292q;
                    Boolean bool = (Boolean) bqrVar.m2927b(bxb.f4680d);
                    if (bool == null) {
                        bqrVar = new bqr();
                        bqrVar.m2928c(this.f4308i);
                        bqrVar.m2929d(bxb.f4680d, Boolean.valueOf(z3));
                    } else if (bool.booleanValue() && !z3) {
                        z3 = false;
                        bqrVar = new bqr();
                        bqrVar.m2928c(this.f4308i);
                        bqrVar.m2929d(bxb.f4680d, Boolean.valueOf(z3));
                    }
                    brc brcVarM2833a = this.f4302c.m2831a().m2833a(obj);
                    try {
                        int i7 = this.f4305f;
                        int i8 = this.f4306g;
                        List list3 = (List) bsxVarM2971b.f4391a.mo320a();
                        bzq.m3278r(list3);
                        try {
                            int size = bsxVarM2971b.f4392b.size();
                            int i9 = 0;
                            bsz bszVarMo3199a = null;
                            while (true) {
                                if (i9 < size) {
                                    bsg bsgVar = (bsg) bsxVarM2971b.f4392b.get(i9);
                                    try {
                                        List list4 = (List) bsgVar.f4327b.mo320a();
                                        bzq.m3278r(list4);
                                        i2 = i9;
                                        i3 = size;
                                        list2 = list3;
                                        i4 = i8;
                                        try {
                                            bsz bszVarM2993a = bsgVar.m2993a(brcVarM2833a, i7, i8, bqrVar, list4);
                                            try {
                                                try {
                                                    bsgVar.f4327b.mo321b(list4);
                                                    Class<?> cls = bszVarM2993a.mo3016c().getClass();
                                                    if (i5 != i6) {
                                                        bqv bqvVarM2970a = this.f4300a.m2970a(cls);
                                                        bszVarM3027d2 = bqvVarM2970a.mo2933b(this.f4302c, bszVarM2993a, this.f4305f, this.f4306g);
                                                        bqvVar = bqvVarM2970a;
                                                    } else {
                                                        bszVarM3027d2 = bszVarM2993a;
                                                        bqvVar = null;
                                                    }
                                                    if (!bszVarM2993a.equals(bszVarM3027d2)) {
                                                        bszVarM2993a.mo3018e();
                                                    }
                                                    if (this.f4300a.f4278c.m2831a().f4057c.m2613g(bszVarM3027d2.mo3015b()) != null) {
                                                        bquVarM2613g = this.f4300a.f4278c.m2831a().f4057c.m2613g(bszVarM3027d2.mo3015b());
                                                        if (bquVarM2613g == null) {
                                                            throw new bpi(bszVarM3027d2.mo3015b());
                                                        }
                                                        iMo2932b = bquVarM2613g.mo2932b();
                                                        list = list2;
                                                        try {
                                                            list.add(e);
                                                            if (bszVarMo3199a != null) {
                                                                i9 = i2 + 1;
                                                                list3 = list;
                                                                size = i3;
                                                                i8 = i4;
                                                                i5 = i;
                                                                i6 = 4;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bsxVarM2971b.f4391a.mo321b(list);
                                                            throw th;
                                                        }
                                                    } else {
                                                        iMo2932b = 3;
                                                        bquVarM2613g = null;
                                                    }
                                                    bsc bscVar = this.f4300a;
                                                    bqn bqnVar = this.f4312m;
                                                    List listM2975f = bscVar.m2975f();
                                                    int size2 = listM2975f.size();
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 < size2) {
                                                            int i11 = size2;
                                                            if (((C1058va) listM2975f.get(i10)).f47803b.equals(bqnVar)) {
                                                                z2 = true;
                                                            } else {
                                                                i10++;
                                                                size2 = i11;
                                                            }
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (!this.f4307h.mo2997d(!z2, i5, iMo2932b)) {
                                                        i = i5;
                                                    } else {
                                                        if (bquVarM2613g == null) {
                                                            throw new bpi(bszVarM3027d2.mo3016c().getClass());
                                                        }
                                                        switch (iMo2932b - 1) {
                                                            case 0:
                                                                brzVar = new brz(this.f4312m, this.f4303d);
                                                                i = i5;
                                                                break;
                                                            default:
                                                                i = i5;
                                                                try {
                                                                    brzVar = new btb(this.f4300a.m2972c(), this.f4312m, this.f4303d, this.f4305f, this.f4306g, bqvVar, cls, this.f4308i);
                                                                } catch (bsv e) {
                                                                    e = e;
                                                                    list = list2;
                                                                    list.add(e);
                                                                }
                                                                break;
                                                        }
                                                        bszVarM3027d2 = bsy.m3027d(bszVarM3027d2);
                                                        npa npaVar = this.f4317r;
                                                        npaVar.f44016a = brzVar;
                                                        npaVar.f44018c = bquVarM2613g;
                                                        npaVar.f44017b = bszVarM3027d2;
                                                    }
                                                    bszVarMo3199a = bsgVar.f4326a.mo3199a(bszVarM3027d2, bqrVar);
                                                    list = list2;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    list = list2;
                                                    bsxVarM2971b.f4391a.mo321b(list);
                                                    throw th;
                                                }
                                            } catch (bsv e2) {
                                                e = e2;
                                                i = i5;
                                            }
                                        } catch (Throwable th3) {
                                            bsgVar.f4327b.mo321b(list4);
                                            throw th3;
                                        }
                                    } catch (bsv e3) {
                                        e = e3;
                                        i = i5;
                                        i2 = i9;
                                        i3 = size;
                                        list2 = list3;
                                        i4 = i8;
                                    }
                                    if (bszVarMo3199a != null) {
                                        i9 = i2 + 1;
                                        list3 = list;
                                        size = i3;
                                        i8 = i4;
                                        i5 = i;
                                        i6 = 4;
                                    }
                                } else {
                                    list = list3;
                                }
                            }
                            if (bszVarMo3199a == null) {
                                throw new bsv(bsxVarM2971b.f4393c, new ArrayList(list));
                            }
                            bsxVarM2971b.f4391a.mo321b(list);
                            brcVarM2833a.mo2950b();
                            braVar.mo2939d();
                            bszVarM3027d = bszVarMo3199a;
                        } catch (Throwable th4) {
                            th = th4;
                            list = list3;
                        }
                    } catch (Throwable th5) {
                        brcVarM2833a.mo2950b();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    braVar.mo2939d();
                    throw th6;
                }
            }
            z = false;
        } catch (bsv e4) {
            z = false;
            e4.m3025b(this.f4321v, this.f4298B, null);
            this.f4318s.add(e4);
            bszVarM3027d = null;
        }
        if (bszVarM3027d == null) {
            m2987k();
            return;
        }
        int i12 = this.f4298B;
        if (bszVarM3027d instanceof bsw) {
            ((bsw) bszVarM3027d).mo3026d();
        }
        bsy bsyVar = z;
        if (this.f4317r.m17600w()) {
            bszVarM3027d = bsy.m3027d(bszVarM3027d);
            bsyVar = bszVarM3027d;
        }
        m2988l();
        bsd bsdVar = this.f4309j;
        synchronized (bsdVar) {
            ((bsr) bsdVar).f4351e = bszVarM3027d;
            ((bsr) bsdVar).f4357k = i12;
        }
        synchronized (bsdVar) {
            ((bsr) bsdVar).f4358l.m8537c();
            if (((bsr) bsdVar).f4356j) {
                ((bsr) bsdVar).f4351e.mo3018e();
                ((bsr) bsdVar).m3010e();
            } else {
                if (((bsr) bsdVar).f4347a.m3004e()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (((bsr) bsdVar).f4352f) {
                    throw new IllegalStateException("Already have resource");
                }
                ((bsr) bsdVar).f4355i = new bst(((bsr) bsdVar).f4351e, ((bsr) bsdVar).f4349c, ((bsr) bsdVar).f4348b, ((bsr) bsdVar).f4359m, null, null, null, null);
                ((bsr) bsdVar).f4352f = true;
                bsq<bsp> bsqVarM3002c = ((bsr) bsdVar).f4347a.m3002c();
                ((bsr) bsdVar).m3009d(bsqVarM3002c.m3001a() + 1);
                ((bsr) bsdVar).f4360n.m15538p((bsr) bsdVar, ((bsr) bsdVar).f4348b, ((bsr) bsdVar).f4355i);
                for (bsp bspVar : bsqVarM3002c) {
                    bspVar.f4345b.execute(new bso((bsr) bsdVar, bspVar.f4344a, 0));
                }
                ((bsr) bsdVar).m3008c();
            }
        }
        this.f4297A = 5;
        try {
            npa npaVar2 = this.f4317r;
            if (npaVar2.m17600w()) {
                try {
                    this.f4316q.m2999a().mo3069b(npaVar2.f44016a, new C1058va((bqf) npaVar2.f44018c, npaVar2.f44017b, this.f4308i));
                    ((bsy) npaVar2.f44017b).m3028g();
                } catch (Throwable th7) {
                    ((bsy) npaVar2.f44017b).m3028g();
                    throw th7;
                }
            }
            if (bsyVar != 0) {
                bsyVar.m3028g();
            }
            if (this.f4301b.m2980b()) {
                m2989a();
            }
        } catch (Throwable th8) {
            if (bsyVar != 0) {
                bsyVar.m3028g();
            }
            throw th8;
        }
    }
}
