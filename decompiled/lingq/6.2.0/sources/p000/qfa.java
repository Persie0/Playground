package p000;

import android.content.Context;
import android.os.PowerManager;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.AbstractC0964h;
import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.C0988b0;
import com.google.android.gms.internal.play_billing.C0990c0;
import com.google.android.gms.internal.play_billing.C1005p;
import com.google.android.gms.internal.play_billing.C1006q;
import com.google.android.gms.internal.play_billing.C1008s;
import com.google.android.gms.internal.play_billing.C1010u;
import com.google.android.gms.internal.play_billing.C1014y;
import com.google.android.gms.internal.play_billing.C1015z;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.AbstractC3208a;
import p000.RunnableC3725wk;
import p000.a8b;
import p000.e8b;
import p000.eh0;
import p000.gm0;
import p000.hh1;
import p000.hz4;
import p000.il7;
import p000.la2;
import p000.lz6;
import p000.mv5;
import p000.nn1;
import p000.oj5;
import p000.p8b;
import p000.qfa;
import p000.qn2;
import p000.sd4;
import p000.wp7;
import p000.zg9;

/* JADX INFO: loaded from: classes.dex */
public final class qfa implements gr6, bu8, vvb, a58 {

    /* JADX INFO: renamed from: a */
    public Object f57705a;

    /* JADX INFO: renamed from: b */
    public Object f57706b;

    public qfa(int i) {
        switch (i) {
            case 5:
                this.f57705a = new x66(new Reference[16]);
                this.f57706b = new ReferenceQueue();
                break;
            case 6:
            case 7:
            default:
                this.f57705a = new l79(0);
                this.f57706b = new tk5((Object) null);
                break;
            case 8:
                this.f57705a = Collections.synchronizedMap(new WeakHashMap());
                this.f57706b = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 9:
                oo3 oo3Var = oo3.f54649e;
                this.f57705a = new SparseIntArray();
                this.f57706b = oo3Var;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m19903c(qfa qfaVar, boolean z, boolean z2) {
        synchronized (qfaVar) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) qfaVar.f57706b) == null) {
                    if (((Context) qfaVar.f57705a).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        ss5.m21707d0("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) qfaVar.f57705a).getSystemService("power");
                    if (powerManager == null) {
                        ss5.m21707d0("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        qfaVar.f57706b = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) qfaVar.f57706b;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public void m19904A(C1005p c1005p, C1010u c1010u) {
        if (c1005p == null) {
            return;
        }
        try {
            ssc sscVarM5654q = C1015z.m5654q();
            sscVarM5654q.m21734c(c1010u);
            sscVarM5654q.m18948b();
            C1015z.m5655r((C1015z) sscVarM5654q.f55715b, c1005p);
            ((xe1) this.f57706b).m24475m((C1015z) sscVarM5654q.m18947a());
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m19905B(C1006q c1006q, C1010u c1010u) {
        if (c1006q == null) {
            return;
        }
        try {
            ssc sscVarM5654q = C1015z.m5654q();
            sscVarM5654q.m21734c(c1010u);
            sscVarM5654q.m18948b();
            C1015z.m5656s((C1015z) sscVarM5654q.f55715b, c1006q);
            ((xe1) this.f57706b).m24475m((C1015z) sscVarM5654q.m18947a());
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: a */
    public int mo3845a(int i) {
        CharSequence charSequence = (CharSequence) this.f57705a;
        do {
            i = ((gh1) this.f57706b).m12634m(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // p000.a58
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = ltc.f50124l;
        lrc lrcVar = new lrc((wr9) obj2);
        ((suc) ((yuc) obj).m11611l()).m21745Q(lrcVar, (String) this.f57705a, (String[]) this.f57706b);
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: b */
    public int mo3846b(int i) {
        do {
            i = ((gh1) this.f57706b).m12639r(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f57705a).charAt(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: d */
    public void m19906d(o38 o38Var, xp7 xp7Var) {
        l79 l79Var = (l79) this.f57705a;
        qta qtaVarM20161a = (qta) l79Var.get(o38Var);
        if (qtaVarM20161a == null) {
            qtaVarM20161a = qta.m20161a();
            l79Var.put(o38Var, qtaVarM20161a);
        }
        qtaVarM20161a.f58202c = xp7Var;
        qtaVarM20161a.f58200a |= 8;
    }

    /* JADX INFO: renamed from: e */
    public View m19907e(int i, int i2, int i3, int i4) {
        osa osaVar = (osa) this.f57706b;
        psa psaVar = (psa) this.f57705a;
        int iMo4511k = psaVar.mo4511k();
        int iMo4514o = psaVar.mo4514o();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo4515q = psaVar.mo4515q(i);
            int iMo4510f = psaVar.mo4510f(viewMo4515q);
            int iMo4518t = psaVar.mo4518t(viewMo4515q);
            osaVar.f54948b = iMo4511k;
            osaVar.f54949c = iMo4514o;
            osaVar.f54950d = iMo4510f;
            osaVar.f54951e = iMo4518t;
            if (i3 != 0) {
                osaVar.f54947a = i3;
                if (osaVar.m18463a()) {
                    return viewMo4515q;
                }
            }
            if (i4 != 0) {
                osaVar.f54947a = i4;
                if (osaVar.m18463a()) {
                    view = viewMo4515q;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: f */
    public int mo3850f(int i) {
        do {
            i = ((gh1) this.f57706b).m12639r(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f57705a).charAt(i)));
        return i;
    }

    /* JADX INFO: renamed from: g */
    public boolean m19908g(View view) {
        osa osaVar = (osa) this.f57706b;
        psa psaVar = (psa) this.f57705a;
        int iMo4511k = psaVar.mo4511k();
        int iMo4514o = psaVar.mo4514o();
        int iMo4510f = psaVar.mo4510f(view);
        int iMo4518t = psaVar.mo4518t(view);
        osaVar.f54948b = iMo4511k;
        osaVar.f54949c = iMo4514o;
        osaVar.f54950d = iMo4510f;
        osaVar.f54951e = iMo4518t;
        osaVar.f54947a = 24579;
        return osaVar.m18463a();
    }

    /* JADX INFO: renamed from: h */
    public xp7 m19909h(o38 o38Var, int i) {
        qta qtaVar;
        xp7 xp7Var;
        l79 l79Var = (l79) this.f57705a;
        int iM15972d = l79Var.m15972d(o38Var);
        if (iM15972d >= 0 && (qtaVar = (qta) l79Var.m15977i(iM15972d)) != null) {
            int i2 = qtaVar.f58200a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                qtaVar.f58200a = i3;
                if (i == 4) {
                    xp7Var = qtaVar.f58201b;
                } else if (i == 8) {
                    xp7Var = qtaVar.f58202c;
                } else {
                    C3386nv.m17626m("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    l79Var.m15975g(iM15972d);
                    qtaVar.f58200a = 0;
                    qtaVar.f58201b = null;
                    qtaVar.f58202c = null;
                    qta.f58199d.mo14460c(qtaVar);
                }
                return xp7Var;
            }
        }
        return null;
    }

    @Override // p000.bu8
    /* JADX INFO: renamed from: i */
    public int mo3853i(int i) {
        do {
            i = ((gh1) this.f57706b).m12634m(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f57705a).charAt(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: j */
    public void m19910j(o38 o38Var) {
        qta qtaVar = (qta) ((l79) this.f57705a).get(o38Var);
        if (qtaVar == null) {
            return;
        }
        qtaVar.f58200a &= -2;
    }

    /* JADX INFO: renamed from: k */
    public void m19911k(o38 o38Var) {
        tk5 tk5Var = (tk5) this.f57706b;
        for (int iM22182h = tk5Var.m22182h() - 1; iM22182h >= 0; iM22182h--) {
            if (o38Var == tk5Var.m22183i(iM22182h)) {
                Object[] objArr = tk5Var.f62444c;
                Object obj = objArr[iM22182h];
                Object obj2 = do7.f35955d;
                if (obj == obj2) {
                    break;
                }
                objArr[iM22182h] = obj2;
                tk5Var.f62442a = true;
                break;
            }
        }
        qta qtaVar = (qta) ((l79) this.f57705a).remove(o38Var);
        if (qtaVar != null) {
            qtaVar.f58200a = 0;
            qtaVar.f58201b = null;
            qtaVar.f58202c = null;
            qta.f58199d.mo14460c(qtaVar);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m19912l(final zg9 zg9Var, final wp7 wp7Var) {
        zg9Var.getClass();
        e8b e8bVar = (e8b) this.f57706b;
        e8bVar.f36847a.execute(new Runnable() { // from class: androidx.work.impl.a
            @Override // java.lang.Runnable
            public final void run() {
                qfa qfaVar = this.f7198a;
                zg9 zg9Var2 = zg9Var;
                il7 il7Var = (il7) qfaVar.f57705a;
                il7Var.getClass();
                a8b a8bVar = zg9Var2.f71553a;
                String str = a8bVar.f364a;
                ArrayList arrayList = new ArrayList();
                int i = 1;
                p8b p8bVar = (p8b) il7Var.f44271e.m2845r(new hz4(new la2(il7Var, arrayList, str, i), 28));
                int i2 = 4;
                if (p8bVar == null) {
                    oj5.m18040f().m18046j(il7.f44266l, "Didn't find WorkSpec for id " + a8bVar);
                    il7Var.f44270d.f36850d.execute(new mv5(i2, il7Var, a8bVar));
                    return;
                }
                synchronized (il7Var.f44277k) {
                    try {
                        synchronized (il7Var.f44277k) {
                            if (il7Var.m14014c(str) == null) {
                                i = 0;
                            }
                        }
                        if (i != 0) {
                            Set set = (Set) il7Var.f44274h.get(str);
                            if (((zg9) set.iterator().next()).f71553a.f365b == a8bVar.f365b) {
                                set.add(zg9Var2);
                                oj5.m18040f().m18042a(il7.f44266l, "Work " + a8bVar + " is already enqueued for processing");
                            } else {
                                il7Var.f44270d.f36850d.execute(new mv5(i2, il7Var, a8bVar));
                            }
                            return;
                        }
                        if (p8bVar.f55791t != a8bVar.f365b) {
                            il7Var.f44270d.f36850d.execute(new mv5(i2, il7Var, a8bVar));
                            return;
                        }
                        Context context = il7Var.f44268b;
                        hh1 hh1Var = il7Var.f44269c;
                        e8b e8bVar2 = il7Var.f44270d;
                        WorkDatabase workDatabase = il7Var.f44271e;
                        context.getClass();
                        il7Var.getClass();
                        qn2 qn2Var = new qn2();
                        qn2Var.f57962a = hh1Var;
                        qn2Var.f57963b = e8bVar2;
                        qn2Var.f57964c = il7Var;
                        qn2Var.f57965d = workDatabase;
                        qn2Var.f57966e = p8bVar;
                        qn2Var.f57967f = arrayList;
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        qn2Var.f57968g = applicationContext;
                        new wp7();
                        C0778d c0778d = new C0778d(qn2Var);
                        nn1 nn1Var = c0778d.f7243d.f36848b;
                        sd4 sd4VarM15434a = AbstractC3208a.m15434a();
                        nn1Var.getClass();
                        gm0 gm0VarM16582g = lz6.m16582g(eh0.m11113J(nn1Var, sd4VarM15434a), new WorkerWrapper$launch$1(c0778d, null));
                        gm0VarM16582g.f40990b.mo52a(new RunnableC3725wk(il7Var, gm0VarM16582g, c0778d, 16), il7Var.f44270d.f36850d);
                        il7Var.f44273g.put(str, c0778d);
                        HashSet hashSet = new HashSet();
                        hashSet.add(zg9Var2);
                        il7Var.f44274h.put(str, hashSet);
                        oj5.m18040f().m18042a(il7.f44266l, il7.class.getSimpleName() + ": processing " + a8bVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m19913m(zg9 zg9Var, int i) {
        zg9Var.getClass();
        e8b e8bVar = (e8b) this.f57706b;
        e8bVar.f36847a.execute(new yi9((il7) this.f57705a, zg9Var, false, i));
    }

    /* JADX INFO: renamed from: n */
    public int m19914n(Context context, co3 co3Var) {
        int i;
        int iM19432c;
        lda.m16130p(context);
        lda.m16130p(co3Var);
        int iMo3404i = co3Var.mo3404i();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f57705a;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(iMo3404i, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f57705a;
        synchronized (sparseIntArray2) {
            iM19432c = 0;
            int i2 = 0;
            while (true) {
                try {
                    if (i2 >= sparseIntArray2.size()) {
                        iM19432c = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i2);
                    if (iKeyAt > iMo3404i && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i2++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (iM19432c == -1) {
                iM19432c = ((oo3) this.f57706b).m19432c(context, iMo3404i);
            }
            sparseIntArray2.put(iMo3404i, iM19432c);
        }
        return iM19432c;
    }

    /* JADX INFO: renamed from: o */
    public void m19915o(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.f57705a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.f57706b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m5284c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((wr9) entry2.getKey()).m24139c(new ApiException(status));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public AbstractC0964h m19916p(String str, int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f57705a;
        AbstractC0964h abstractC0964h = (AbstractC0964h) atomicReferenceArray.get(i);
        if (abstractC0964h != null) {
            return abstractC0964h;
        }
        d6d d6dVarM17608j = ((nr9) this.f57706b).m17608j(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, d6dVarM17608j)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC0964h abstractC0964h2 = (AbstractC0964h) atomicReferenceArray.get(i);
                abstractC0964h2.getClass();
                return abstractC0964h2;
            }
        }
        return d6dVarM17608j;
    }

    /* JADX INFO: renamed from: q */
    public void m19917q(C1005p c1005p) {
        try {
            m19904A(c1005p, (C1010u) this.f57705a);
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: r */
    public AbstractC0964h m19918r(String str, int i, long j) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f57705a;
        AbstractC0964h abstractC0964h = (AbstractC0964h) atomicReferenceArray.get(i);
        if (abstractC0964h != null) {
            return abstractC0964h;
        }
        r6d r6dVar = new r6d(str, (pl1) ((nr9) this.f57706b).f53173a, j);
        while (!atomicReferenceArray.compareAndSet(i, null, r6dVar)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC0964h abstractC0964h2 = (AbstractC0964h) atomicReferenceArray.get(i);
                abstractC0964h2.getClass();
                return abstractC0964h2;
            }
        }
        return r6dVar;
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        yva yvaVar = (yva) this.f57705a;
        zva zvaVar = (zva) this.f57706b;
        zva zvaVar2 = new zva();
        zvaVar2.f72285a = zvaVar.f72285a;
        zvaVar2.f72286b = zvaVar.f72286b;
        zvaVar2.f72287c = zvaVar.f72287c;
        zvaVar2.f72288d = zvaVar.f72288d;
        return yvaVar.mo13223g(view, f6bVar, zvaVar2);
    }

    /* JADX INFO: renamed from: t */
    public void m19919t(C1005p c1005p, int i, long j) {
        try {
            bqc bqcVar = (bqc) ((C1010u) this.f57705a).m5541l();
            bqcVar.m18948b();
            C1010u.m5634C((C1010u) bqcVar.f55715b, i);
            C1010u c1010u = (C1010u) bqcVar.m18947a();
            this.f57705a = c1010u;
            if (j != 0) {
                bqc bqcVar2 = (bqc) c1010u.m5541l();
                bqcVar2.m18948b();
                C1010u.m5636E((C1010u) bqcVar2.f55715b, j);
                c1010u = (C1010u) bqcVar2.m18947a();
            }
            m19904A(c1005p, c1010u);
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: u */
    public AbstractC0964h m19920u(String str, int i, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.f57705a;
        AbstractC0964h abstractC0964h = (AbstractC0964h) atomicReferenceArray.get(i);
        if (abstractC0964h != null) {
            return abstractC0964h;
        }
        x6d x6dVar = new x6d(str, (pl1) ((nr9) this.f57706b).f53173a, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, x6dVar)) {
            if (atomicReferenceArray.get(i) != null) {
                AbstractC0964h abstractC0964h2 = (AbstractC0964h) atomicReferenceArray.get(i);
                abstractC0964h2.getClass();
                return abstractC0964h2;
            }
        }
        return x6dVar;
    }

    /* JADX INFO: renamed from: v */
    public void m19921v(C1005p c1005p, long j, boolean z) {
        try {
            imc imcVar = (imc) c1005p.m5541l();
            prc prcVar = (prc) c1005p.m5614u().m5541l();
            prcVar.m19466c(z);
            imcVar.m18948b();
            C1005p.m5607p((C1005p) imcVar.f55715b, (C1014y) prcVar.m18947a());
            C1005p c1005p2 = (C1005p) imcVar.m18947a();
            C1010u c1010u = (C1010u) this.f57705a;
            if (j != 0) {
                bqc bqcVar = (bqc) c1010u.m5541l();
                bqcVar.m18948b();
                C1010u.m5636E((C1010u) bqcVar.f55715b, j);
                c1010u = (C1010u) bqcVar.m18947a();
            }
            m19904A(c1005p2, c1010u);
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m19922w(C1005p c1005p, int i, long j, boolean z) {
        try {
            bqc bqcVar = (bqc) ((C1010u) this.f57705a).m5541l();
            bqcVar.m18948b();
            C1010u.m5634C((C1010u) bqcVar.f55715b, i);
            this.f57705a = (C1010u) bqcVar.m18947a();
            imc imcVar = (imc) c1005p.m5541l();
            prc prcVar = (prc) c1005p.m5614u().m5541l();
            prcVar.m19466c(z);
            imcVar.m18948b();
            C1005p.m5607p((C1005p) imcVar.f55715b, (C1014y) prcVar.m18947a());
            C1005p c1005p2 = (C1005p) imcVar.m18947a();
            C1010u c1010u = (C1010u) this.f57705a;
            if (j != 0) {
                bqc bqcVar2 = (bqc) c1010u.m5541l();
                bqcVar2.m18948b();
                C1010u.m5636E((C1010u) bqcVar2.f55715b, j);
                c1010u = (C1010u) bqcVar2.m18947a();
            }
            m19904A(c1005p2, c1010u);
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m19923x(C1008s c1008s) {
        try {
            ssc sscVarM5654q = C1015z.m5654q();
            sscVarM5654q.m21734c((C1010u) this.f57705a);
            sscVarM5654q.m18948b();
            C1015z.m5657t((C1015z) sscVarM5654q.f55715b, c1008s);
            ((xe1) this.f57706b).m24475m((C1015z) sscVarM5654q.m18947a());
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m19924y(C0988b0 c0988b0) {
        try {
            xe1 xe1Var = (xe1) this.f57706b;
            ssc sscVarM5654q = C1015z.m5654q();
            sscVarM5654q.m21734c((C1010u) this.f57705a);
            sscVarM5654q.m18948b();
            C1015z.m5659v((C1015z) sscVarM5654q.f55715b, c0988b0);
            xe1Var.m24475m((C1015z) sscVarM5654q.m18947a());
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m19925z(C0990c0 c0990c0) {
        if (c0990c0 == null) {
            return;
        }
        try {
            ssc sscVarM5654q = C1015z.m5654q();
            sscVarM5654q.m21734c((C1010u) this.f57705a);
            sscVarM5654q.m18948b();
            C1015z.m5653p((C1015z) sscVarM5654q.f55715b, c0990c0);
            ((xe1) this.f57706b).m24475m((C1015z) sscVarM5654q.m18947a());
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to log.", th);
        }
    }

    public qfa(nr9 nr9Var, int i) {
        this.f57706b = nr9Var;
        this.f57705a = new AtomicReferenceArray(i);
    }

    public qfa(Context context, C1010u c1010u) {
        xe1 xe1Var = new xe1();
        try {
            nba.m17319b(context);
            xe1Var.f68117b = nba.m17318a().m17320c(al0.f793e).m12466a("PLAY_BILLING_LIBRARY", new bs2("proto"), new s46(23));
        } catch (Throwable unused) {
            xe1Var.f68116a = true;
        }
        this.f57706b = xe1Var;
        this.f57705a = c1010u;
    }

    public /* synthetic */ qfa(Object obj, Object obj2) {
        this.f57705a = obj;
        this.f57706b = obj2;
    }

    public qfa(il7 il7Var, e8b e8bVar) {
        il7Var.getClass();
        e8bVar.getClass();
        this.f57705a = il7Var;
        this.f57706b = e8bVar;
    }

    public qfa(psa psaVar) {
        this.f57705a = psaVar;
        osa osaVar = new osa();
        osaVar.f54947a = 0;
        this.f57706b = osaVar;
    }
}
