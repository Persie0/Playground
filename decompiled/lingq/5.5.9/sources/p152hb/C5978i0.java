package p152hb;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.ActivityC0979t;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.C2550e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import gb.InterfaceC5740d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p071dc.C5142a;
import p071dc.C5143b;
import p071dc.InterfaceC5147f;
import p176ib.C6254b;
import p176ib.C6272i;
import p176ib.C6300w;
import p290o6.C7967l0;
import p326q.C8446b;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5978i0 extends AbstractC2544c implements InterfaceC6026y0 {

    /* JADX INFO: renamed from: H */
    public final C2548c f35497H;

    /* JADX INFO: renamed from: I */
    public C6023x0 f35498I;

    /* JADX INFO: renamed from: J */
    public final Map<C2542a.b<?>, C2542a.e> f35499J;

    /* JADX INFO: renamed from: L */
    public final C6254b f35501L;

    /* JADX INFO: renamed from: M */
    public final Map<C2542a<?>, Boolean> f35502M;

    /* JADX INFO: renamed from: N */
    public final C2542a.a<? extends InterfaceC5147f, C5142a> f35503N;

    /* JADX INFO: renamed from: P */
    public final ArrayList<C6027y1> f35505P;

    /* JADX INFO: renamed from: Q */
    public Integer f35506Q;

    /* JADX INFO: renamed from: R */
    public final C5985k1 f35507R;

    /* JADX INFO: renamed from: b */
    public final Lock f35508b;

    /* JADX INFO: renamed from: c */
    public final C6300w f35509c;

    /* JADX INFO: renamed from: e */
    public final int f35511e;

    /* JADX INFO: renamed from: f */
    public final Context f35512f;

    /* JADX INFO: renamed from: g */
    public final Looper f35513g;

    /* JADX INFO: renamed from: i */
    public volatile boolean f35515i;

    /* JADX INFO: renamed from: l */
    public final HandlerC5972g0 f35518l;

    /* JADX INFO: renamed from: d */
    public InterfaceC5951a1 f35510d = null;

    /* JADX INFO: renamed from: h */
    public final LinkedList f35514h = new LinkedList();

    /* JADX INFO: renamed from: j */
    public final long f35516j = 120000;

    /* JADX INFO: renamed from: k */
    public final long f35517k = 5000;

    /* JADX INFO: renamed from: K */
    public Set<Scope> f35500K = new HashSet();

    /* JADX INFO: renamed from: O */
    public final C5974h f35504O = new C5974h();

    public C5978i0(Context context, ReentrantLock reentrantLock, Looper looper, C6254b c6254b, C2548c c2548c, C5143b c5143b, C8446b c8446b, ArrayList arrayList, ArrayList arrayList2, C8446b c8446b2, int i10, int i11, ArrayList arrayList3) {
        this.f35506Q = null;
        C7967l0 c7967l0 = new C7967l0(this);
        this.f35512f = context;
        this.f35508b = reentrantLock;
        this.f35509c = new C6300w(looper, c7967l0);
        this.f35513g = looper;
        this.f35518l = new HandlerC5972g0(this, looper);
        this.f35497H = c2548c;
        this.f35511e = i10;
        if (i10 >= 0) {
            this.f35506Q = Integer.valueOf(i11);
        }
        this.f35502M = c8446b;
        this.f35499J = c8446b2;
        this.f35505P = arrayList3;
        this.f35507R = new C5985k1();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC2544c.a aVar = (AbstractC2544c.a) it.next();
            C6300w c6300w = this.f35509c;
            c6300w.getClass();
            C6272i.m12915i(aVar);
            synchronized (c6300w.f36508i) {
                if (c6300w.f36501b.contains(aVar)) {
                    String strValueOf = String.valueOf(aVar);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 62);
                    sb2.append("registerConnectionCallbacks(): listener ");
                    sb2.append(strValueOf);
                    sb2.append(" is already registered");
                    Log.w("GmsClientEvents", sb2.toString());
                } else {
                    c6300w.f36501b.add(aVar);
                }
            }
            if (c6300w.f36500a.mo12929a()) {
                HandlerC9517f handlerC9517f = c6300w.f36507h;
                handlerC9517f.sendMessage(handlerC9517f.obtainMessage(1, aVar));
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.f35509c.m12930a((AbstractC2544c.b) it2.next());
        }
        this.f35501L = c6254b;
        this.f35503N = c5143b;
    }

    /* JADX INFO: renamed from: n */
    public static int m12423n(Collection collection, boolean z10) {
        Iterator it = collection.iterator();
        boolean zMo7553s = false;
        boolean zMo7539c = false;
        while (it.hasNext()) {
            C2542a.e eVar = (C2542a.e) it.next();
            zMo7553s |= eVar.mo7553s();
            zMo7539c |= eVar.mo7539c();
        }
        if (zMo7553s) {
            return (zMo7539c && z10) ? 2 : 1;
        }
        return 3;
    }

    @Override // com.google.android.gms.common.api.AbstractC2544c
    /* JADX INFO: renamed from: a */
    public final void mo7555a() {
        Lock lock = this.f35508b;
        lock.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.f35511e >= 0) {
                C6272i.m12917k("Sign-in mode should have been set explicitly by auto-manage.", this.f35506Q != null);
            } else {
                Integer num = this.f35506Q;
                if (num == null) {
                    this.f35506Q = Integer.valueOf(m12423n(this.f35499J.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            Integer num2 = this.f35506Q;
            C6272i.m12915i(num2);
            int iIntValue = num2.intValue();
            lock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Illegal sign-in mode: ");
                        sb2.append(iIntValue);
                        C6272i.m12907a(sb2.toString(), z10);
                        m12432p(iIntValue);
                        m12433q();
                        lock.unlock();
                        lock.unlock();
                        return;
                    }
                    lock.unlock();
                    throw th;
                }
                i10 = iIntValue;
                StringBuilder sb3 = new StringBuilder(33);
                sb3.append("Illegal sign-in mode: ");
                sb3.append(iIntValue);
                C6272i.m12907a(sb3.toString(), z10);
                m12432p(iIntValue);
                m12433q();
                lock.unlock();
                lock.unlock();
                return;
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
            iIntValue = i10;
            z10 = true;
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: b */
    public final void mo12424b(Bundle bundle) {
        while (!this.f35514h.isEmpty()) {
            m12427j((AbstractC2546a) this.f35514h.remove());
        }
        C6300w c6300w = this.f35509c;
        C6272i.m12910d(c6300w.f36507h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (c6300w.f36508i) {
            if (!(!c6300w.f36506g)) {
                throw new IllegalStateException();
            }
            c6300w.f36507h.removeMessages(1);
            c6300w.f36506g = true;
            if (!c6300w.f36502c.isEmpty()) {
                throw new IllegalStateException();
            }
            ArrayList<AbstractC2544c.a> arrayList = new ArrayList(c6300w.f36501b);
            int i10 = c6300w.f36505f.get();
            for (AbstractC2544c.a aVar : arrayList) {
                if (!c6300w.f36504e || !c6300w.f36500a.mo12929a() || c6300w.f36505f.get() != i10) {
                    break;
                    break;
                    break;
                } else if (!c6300w.f36502c.contains(aVar)) {
                    aVar.mo12397b1(bundle);
                }
            }
            c6300w.f36502c.clear();
            c6300w.f36506g = false;
        }
    }

    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: c */
    public final void mo12425c(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10) {
                if (!this.f35515i) {
                    this.f35515i = true;
                    if (this.f35498I == null) {
                        try {
                            C2548c c2548c = this.f35497H;
                            Context applicationContext = this.f35512f.getApplicationContext();
                            C5975h0 c5975h0 = new C5975h0(this);
                            c2548c.getClass();
                            this.f35498I = C2548c.m7583g(applicationContext, c5975h0);
                        } catch (SecurityException unused) {
                        }
                    }
                    HandlerC5972g0 handlerC5972g0 = this.f35518l;
                    handlerC5972g0.sendMessageDelayed(handlerC5972g0.obtainMessage(1), this.f35516j);
                    HandlerC5972g0 handlerC5972g1 = this.f35518l;
                    handlerC5972g1.sendMessageDelayed(handlerC5972g1.obtainMessage(2), this.f35517k);
                }
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f35507R.f35523a.toArray(new BasePendingResult[0])) {
            basePendingResult.m7565d(C5985k1.f35522c);
        }
        C6300w c6300w = this.f35509c;
        C6272i.m12910d(c6300w.f36507h, "onUnintentionalDisconnection must only be called on the Handler thread");
        c6300w.f36507h.removeMessages(1);
        synchronized (c6300w.f36508i) {
            try {
                c6300w.f36506g = true;
                ArrayList arrayList = new ArrayList(c6300w.f36501b);
                int i11 = c6300w.f36505f.get();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC2544c.a aVar = (AbstractC2544c.a) it.next();
                        if (c6300w.f36504e) {
                            if (c6300w.f36505f.get() != i11) {
                                break;
                            } else if (c6300w.f36501b.contains(aVar)) {
                                aVar.mo12398h(i10);
                            }
                        }
                    }
                    break;
                }
                c6300w.f36502c.clear();
                c6300w.f36506g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C6300w c6300w2 = this.f35509c;
        c6300w2.f36504e = false;
        c6300w2.f36505f.incrementAndGet();
        if (i10 == 2) {
            m12433q();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.common.api.AbstractC2544c
    /* JADX INFO: renamed from: d */
    public final void mo7556d() {
        boolean z10;
        Lock lock = this.f35508b;
        lock.lock();
        try {
            C5985k1 c5985k1 = this.f35507R;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) c5985k1.f35523a.toArray(new BasePendingResult[0])) {
                basePendingResult.f13906e.set(null);
                synchronized (basePendingResult.f13902a) {
                    try {
                        if (basePendingResult.f13903b.get() == null || !basePendingResult.f13912k) {
                            basePendingResult.m7563b();
                        }
                        synchronized (basePendingResult.f13902a) {
                            try {
                                z10 = basePendingResult.f13910i;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (z10) {
                    c5985k1.f35523a.remove(basePendingResult);
                }
            }
            InterfaceC5951a1 interfaceC5951a1 = this.f35510d;
            if (interfaceC5951a1 != null) {
                interfaceC5951a1.mo12391f();
            }
            Set<C5971g<?>> set = this.f35504O.f35494a;
            Iterator<C5971g<?>> it = set.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            set.clear();
            LinkedList<AbstractC2546a> linkedList = this.f35514h;
            for (AbstractC2546a abstractC2546a : linkedList) {
                abstractC2546a.f13906e.set(null);
                abstractC2546a.m7563b();
            }
            linkedList.clear();
            if (this.f35510d == null) {
                lock.unlock();
                return;
            }
            m12431o();
            C6300w c6300w = this.f35509c;
            c6300w.f36504e = false;
            c6300w.f36505f.incrementAndGet();
            lock.unlock();
        } catch (Throwable th4) {
            lock.unlock();
            throw th4;
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC2544c
    /* JADX INFO: renamed from: e */
    public final void mo7557e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f35512f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f35515i);
        printWriter.append(" mWorkQueue.size()=").print(this.f35514h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f35507R.f35523a.size());
        InterfaceC5951a1 interfaceC5951a1 = this.f35510d;
        if (interfaceC5951a1 != null) {
            interfaceC5951a1.mo12392g(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.AbstractC2544c
    /* JADX INFO: renamed from: f */
    public final boolean mo7558f(InterfaceC5983k interfaceC5983k) {
        InterfaceC5951a1 interfaceC5951a1 = this.f35510d;
        return interfaceC5951a1 != null && interfaceC5951a1.mo12387b(interfaceC5983k);
    }

    @Override // com.google.android.gms.common.api.AbstractC2544c
    /* JADX INFO: renamed from: g */
    public final void mo7559g() {
        InterfaceC5951a1 interfaceC5951a1 = this.f35510d;
        if (interfaceC5951a1 != null) {
            interfaceC5951a1.mo12390e();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.common.api.AbstractC2544c
    /* JADX INFO: renamed from: h */
    public final void mo7560h(C6000p1 c6000p1) {
        C6300w c6300w = this.f35509c;
        c6300w.getClass();
        synchronized (c6300w.f36508i) {
            if (!c6300w.f36503d.remove(c6000p1)) {
                String strValueOf = String.valueOf(c6000p1);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57);
                sb2.append("unregisterConnectionFailedListener(): listener ");
                sb2.append(strValueOf);
                sb2.append(" not found");
                Log.w("GmsClientEvents", sb2.toString());
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: i */
    public final void mo12426i(ConnectionResult connectionResult) {
        C2548c c2548c = this.f35497H;
        Context context = this.f35512f;
        int i10 = connectionResult.f13857b;
        c2548c.getClass();
        if (!C2550e.isPlayServicesPossiblyUpdating(context, i10)) {
            m12431o();
        }
        if (this.f35515i) {
            return;
        }
        C6300w c6300w = this.f35509c;
        C6272i.m12910d(c6300w.f36507h, "onConnectionFailure must only be called on the Handler thread");
        c6300w.f36507h.removeMessages(1);
        synchronized (c6300w.f36508i) {
            ArrayList arrayList = new ArrayList(c6300w.f36503d);
            int i11 = c6300w.f36505f.get();
            Iterator it = arrayList.iterator();
            loop0: while (true) {
                while (true) {
                    if (it.hasNext()) {
                        AbstractC2544c.b bVar = (AbstractC2544c.b) it.next();
                        if (!c6300w.f36504e || c6300w.f36505f.get() != i11) {
                            break loop0;
                            break loop0;
                        } else if (c6300w.f36503d.contains(bVar)) {
                            bVar.mo494j(connectionResult);
                        }
                    }
                }
            }
        }
        C6300w c6300w2 = this.f35509c;
        c6300w2.f36504e = false;
        c6300w2.f36505f.incrementAndGet();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final <A, T extends AbstractC2546a<? extends InterfaceC5740d, A>> T m12427j(T t10) {
        Lock lock;
        C2542a<?> c2542a = t10.f13915n;
        boolean zContainsKey = this.f35499J.containsKey(t10.f13914m);
        String str = c2542a != null ? c2542a.f13886c : "the API";
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
        sb2.append("GoogleApiClient is not configured to use ");
        sb2.append(str);
        sb2.append(" required for this call.");
        C6272i.m12907a(sb2.toString(), zContainsKey);
        this.f35508b.lock();
        try {
            InterfaceC5951a1 interfaceC5951a1 = this.f35510d;
            if (interfaceC5951a1 == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f35515i) {
                this.f35514h.add(t10);
                while (!this.f35514h.isEmpty()) {
                    AbstractC2546a abstractC2546a = (AbstractC2546a) this.f35514h.remove();
                    C5985k1 c5985k1 = this.f35507R;
                    c5985k1.f35523a.add(abstractC2546a);
                    abstractC2546a.f13906e.set(c5985k1.f35524b);
                    abstractC2546a.m7581l(Status.f13875h);
                }
                lock = this.f35508b;
            } else {
                t10 = (T) interfaceC5951a1.mo12389d(t10);
                lock = this.f35508b;
            }
            lock.unlock();
            return t10;
        } catch (Throwable th2) {
            this.f35508b.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final C2542a.e m12428k(C2542a.f fVar) {
        C2542a.e eVar = this.f35499J.get(fVar);
        C6272i.m12916j(eVar, "Appropriate Api was not requested.");
        return eVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m12429l(C6000p1 c6000p1) {
        this.f35509c.m12930a(c6000p1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final void m12430m(ActivityC0979t activityC0979t) {
        C5965e c5965e = new C5965e(activityC0979t);
        int i10 = this.f35511e;
        if (i10 < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        InterfaceC5968f interfaceC5968fM7571c = LifecycleCallback.m7571c(c5965e);
        C6003q1 c6003q1 = (C6003q1) interfaceC5968fM7571c.mo12395c(C6003q1.class, "AutoManageHelper");
        if (c6003q1 == null) {
            c6003q1 = new C6003q1(interfaceC5968fM7571c);
        }
        SparseArray<C6000p1> sparseArray = c6003q1.f35578f;
        C6000p1 c6000p1 = sparseArray.get(i10);
        sparseArray.remove(i10);
        if (c6000p1 != null) {
            AbstractC2544c abstractC2544c = c6000p1.f35572b;
            abstractC2544c.mo7560h(c6000p1);
            abstractC2544c.mo7556d();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12431o() {
        if (!this.f35515i) {
            return false;
        }
        this.f35515i = false;
        this.f35518l.removeMessages(2);
        this.f35518l.removeMessages(1);
        C6023x0 c6023x0 = this.f35498I;
        if (c6023x0 != null) {
            synchronized (c6023x0) {
                try {
                    Context context = c6023x0.f35622a;
                    if (context != null) {
                        context.unregisterReceiver(c6023x0);
                    }
                    c6023x0.f35622a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f35498I = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m12432p(int i10) {
        String str;
        Integer num = this.f35506Q;
        if (num == null) {
            this.f35506Q = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            String str2 = "UNKNOWN";
            if (i10 == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (i10 != 2) {
                str = i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
            } else {
                str = "SIGN_IN_MODE_OPTIONAL";
            }
            int iIntValue = this.f35506Q.intValue();
            if (iIntValue == 1) {
                str2 = "SIGN_IN_MODE_REQUIRED";
            } else if (iIntValue == 2) {
                str2 = "SIGN_IN_MODE_OPTIONAL";
            } else if (iIntValue == 3) {
                str2 = "SIGN_IN_MODE_NONE";
            }
            StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 51);
            sb2.append("Cannot use sign-in mode: ");
            sb2.append(str);
            sb2.append(". Mode was already set to ");
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f35510d != null) {
            return;
        }
        Map<C2542a.b<?>, C2542a.e> map = this.f35499J;
        boolean zMo7553s = false;
        boolean zMo7539c = false;
        for (C2542a.e eVar : map.values()) {
            zMo7553s |= eVar.mo7553s();
            zMo7539c |= eVar.mo7539c();
        }
        int iIntValue2 = this.f35506Q.intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zMo7553s) {
                Context context = this.f35512f;
                Lock lock = this.f35508b;
                Looper looper = this.f35513g;
                C2548c c2548c = this.f35497H;
                C6254b c6254b = this.f35501L;
                C2542a.a<? extends InterfaceC5147f, C5142a> aVar = this.f35503N;
                C8446b c8446b = new C8446b();
                C8446b c8446b2 = new C8446b();
                C2542a.e eVar2 = null;
                for (Map.Entry<C2542a.b<?>, C2542a.e> entry : map.entrySet()) {
                    C2542a.e value = entry.getValue();
                    if (true == value.mo7539c()) {
                        eVar2 = value;
                    }
                    if (value.mo7553s()) {
                        c8446b.put(entry.getKey(), value);
                    } else {
                        c8446b2.put(entry.getKey(), value);
                    }
                }
                C6272i.m12917k("CompositeGoogleApiClient should not be used without any APIs that require sign-in.", !c8446b.isEmpty());
                C8446b c8446b3 = new C8446b();
                C8446b c8446b4 = new C8446b();
                Map<C2542a<?>, Boolean> map2 = this.f35502M;
                for (C2542a<?> c2542a : map2.keySet()) {
                    C2542a.f<?> fVar = c2542a.f13885b;
                    if (c8446b.containsKey(fVar)) {
                        c8446b3.put(c2542a, map2.get(c2542a));
                    } else {
                        if (!c8446b2.containsKey(fVar)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        c8446b4.put(c2542a, map2.get(c2542a));
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<C6027y1> arrayList3 = this.f35505P;
                int size = arrayList3.size();
                int i11 = 0;
                while (i11 < size) {
                    ArrayList<C6027y1> arrayList4 = arrayList3;
                    C6027y1 c6027y1 = arrayList3.get(i11);
                    int i12 = size;
                    if (c8446b3.containsKey(c6027y1.f35627a)) {
                        arrayList.add(c6027y1);
                    } else {
                        if (!c8446b4.containsKey(c6027y1.f35627a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList2.add(c6027y1);
                    }
                    i11++;
                    arrayList3 = arrayList4;
                    size = i12;
                }
                this.f35510d = new C5992n(context, this, lock, looper, c2548c, c8446b, c8446b2, c6254b, aVar, eVar2, arrayList, arrayList2, c8446b3, c8446b4);
                return;
            }
        } else {
            if (!zMo7553s) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zMo7539c) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.f35510d = new C5990m0(this.f35512f, this, this.f35508b, this.f35513g, this.f35497H, this.f35499J, this.f35501L, this.f35502M, this.f35503N, this.f35505P, this);
    }

    /* JADX INFO: renamed from: q */
    public final void m12433q() {
        this.f35509c.f36504e = true;
        InterfaceC5951a1 interfaceC5951a1 = this.f35510d;
        C6272i.m12915i(interfaceC5951a1);
        interfaceC5951a1.mo12386a();
    }
}
