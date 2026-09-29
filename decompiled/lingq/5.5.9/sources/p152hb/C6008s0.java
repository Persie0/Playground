package p152hb;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC2543b;
import com.google.android.gms.common.api.AbstractC2544c;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.C2542a.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p071dc.C5142a;
import p071dc.C5143b;
import p071dc.InterfaceC5147f;
import p136gc.C5752h;
import p176ib.AbstractC6251a;
import p176ib.C6254b;
import p176ib.C6268g;
import p176ib.C6272i;
import p197jb.C6445d;
import p289o5.RunnableC7932l;
import p289o5.RunnableC7943w;
import p326q.C8446b;
import p326q.C8448d;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6008s0<O extends C2542a.c> implements AbstractC2544c.a, AbstractC2544c.b, InterfaceC6030z1 {

    /* JADX INFO: renamed from: b */
    @NotOnlyInitialized
    public final C2542a.e f35582b;

    /* JADX INFO: renamed from: c */
    public final C5949a<O> f35583c;

    /* JADX INFO: renamed from: d */
    public final C5998p f35584d;

    /* JADX INFO: renamed from: g */
    public final int f35587g;

    /* JADX INFO: renamed from: h */
    public final BinderC5973g1 f35588h;

    /* JADX INFO: renamed from: i */
    public boolean f35589i;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C5961d f35592l;

    /* JADX INFO: renamed from: a */
    public final LinkedList f35581a = new LinkedList();

    /* JADX INFO: renamed from: e */
    public final HashSet f35585e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final HashMap f35586f = new HashMap();

    /* JADX INFO: renamed from: j */
    public final ArrayList f35590j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public ConnectionResult f35591k = null;

    /* JADX WARN: Multi-variable type inference failed */
    public C6008s0(C5961d c5961d, AbstractC2543b<O> abstractC2543b) {
        this.f35592l = c5961d;
        Looper looper = c5961d.f35440I.getLooper();
        C6254b.a aVarM7554a = abstractC2543b.m7554a();
        Account account = aVarM7554a.f36447a;
        C8448d<Scope> c8448d = aVarM7554a.f36448b;
        String str = aVarM7554a.f36449c;
        String str2 = aVarM7554a.f36450d;
        C5142a c5142a = C5142a.f33121a;
        C6254b c6254b = new C6254b(account, c8448d, null, str, str2, c5142a);
        C2542a.a<?, O> aVar = abstractC2543b.f13889c.f13884a;
        C6272i.m12915i(aVar);
        C2542a.e eVarMo4928b = aVar.mo4928b(abstractC2543b.f13887a, looper, c6254b, abstractC2543b.f13890d, this, this);
        String str3 = abstractC2543b.f13888b;
        if (str3 != null && (eVarMo4928b instanceof AbstractC6251a)) {
            ((AbstractC6251a) eVarMo4928b).f36411S = str3;
        }
        if (str3 != null && (eVarMo4928b instanceof ServiceConnectionC5977i)) {
            ((ServiceConnectionC5977i) eVarMo4928b).getClass();
        }
        this.f35582b = eVarMo4928b;
        this.f35583c = abstractC2543b.f13891e;
        this.f35584d = new C5998p();
        this.f35587g = abstractC2543b.f13893g;
        if (!eVarMo4928b.mo7553s()) {
            this.f35588h = null;
            return;
        }
        Context context = c5961d.f35446e;
        HandlerC9517f handlerC9517f = c5961d.f35440I;
        C6254b.a aVarM7554a2 = abstractC2543b.m7554a();
        this.f35588h = new BinderC5973g1(context, handlerC9517f, new C6254b(aVarM7554a2.f36447a, aVarM7554a2.f36448b, null, aVarM7554a2.f36449c, aVarM7554a2.f36450d, c5142a));
    }

    /* JADX INFO: renamed from: a */
    public final void m12453a(ConnectionResult connectionResult) {
        HashSet hashSet = this.f35585e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        C6006r1 c6006r1 = (C6006r1) it.next();
        if (C6268g.m12905a(connectionResult, ConnectionResult.f13855e)) {
            this.f35582b.mo7544h();
        }
        c6006r1.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final void m12454b(Status status) {
        C6272i.m12909c(this.f35592l.f35440I);
        m12455c(status, null, false);
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: b1 */
    public final void mo12397b1(Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        C5961d c5961d = this.f35592l;
        if (looperMyLooper == c5961d.f35440I.getLooper()) {
            m12457e();
        } else {
            c5961d.f35440I.post(new RunnableC7943w(2, this));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m12455c(Status status, RuntimeException runtimeException, boolean z10) {
        C6272i.m12909c(this.f35592l.f35440I);
        boolean z11 = false;
        boolean z12 = status == null;
        if (runtimeException == null) {
            z11 = true;
        }
        if (z12 == z11) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f35581a.iterator();
        while (it.hasNext()) {
            AbstractC5997o1 abstractC5997o1 = (AbstractC5997o1) it.next();
            if (!z10 || abstractC5997o1.f35566a == 2) {
                if (status != null) {
                    abstractC5997o1.mo12434a(status);
                } else {
                    abstractC5997o1.mo12435b(runtimeException);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12456d() {
        LinkedList linkedList = this.f35581a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5997o1 abstractC5997o1 = (AbstractC5997o1) arrayList.get(i10);
            if (!this.f35582b.mo7537a()) {
                return;
            }
            if (m12460i(abstractC5997o1)) {
                linkedList.remove(abstractC5997o1);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m12457e() {
        C5961d c5961d = this.f35592l;
        C6272i.m12909c(c5961d.f35440I);
        this.f35591k = null;
        m12453a(ConnectionResult.f13855e);
        if (this.f35589i) {
            HandlerC9517f handlerC9517f = c5961d.f35440I;
            C5949a<O> c5949a = this.f35583c;
            handlerC9517f.removeMessages(11, c5949a);
            c5961d.f35440I.removeMessages(9, c5949a);
            this.f35589i = false;
        }
        Iterator it = this.f35586f.values().iterator();
        if (it.hasNext()) {
            ((C5967e1) it.next()).getClass();
            throw null;
        }
        m12456d();
        m12459g();
    }

    /* JADX INFO: renamed from: f */
    public final void m12458f(int i10) {
        C5961d c5961d = this.f35592l;
        C6272i.m12909c(c5961d.f35440I);
        this.f35591k = null;
        this.f35589i = true;
        String strMo7550p = this.f35582b.mo7550p();
        C5998p c5998p = this.f35584d;
        c5998p.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (strMo7550p != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(strMo7550p);
        }
        c5998p.m12449a(true, new Status(sb2.toString(), 20));
        HandlerC9517f handlerC9517f = c5961d.f35440I;
        C5949a<O> c5949a = this.f35583c;
        handlerC9517f.sendMessageDelayed(Message.obtain(handlerC9517f, 9, c5949a), 5000L);
        HandlerC9517f handlerC9517f2 = c5961d.f35440I;
        handlerC9517f2.sendMessageDelayed(Message.obtain(handlerC9517f2, 11, c5949a), 120000L);
        c5961d.f35448g.f36509a.clear();
        Iterator it = this.f35586f.values().iterator();
        if (it.hasNext()) {
            ((C5967e1) it.next()).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12459g() {
        C5961d c5961d = this.f35592l;
        HandlerC9517f handlerC9517f = c5961d.f35440I;
        C5949a<O> c5949a = this.f35583c;
        handlerC9517f.removeMessages(12, c5949a);
        HandlerC9517f handlerC9517f2 = c5961d.f35440I;
        handlerC9517f2.sendMessageDelayed(handlerC9517f2.obtainMessage(12, c5949a), c5961d.f35442a);
    }

    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: h */
    public final void mo12398h(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        C5961d c5961d = this.f35592l;
        if (looperMyLooper == c5961d.f35440I.getLooper()) {
            m12458f(i10);
        } else {
            c5961d.f35440I.post(new RunnableC5999p0(this, i10));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC6030z1
    /* JADX INFO: renamed from: h0 */
    public final void mo12439h0(ConnectionResult connectionResult, C2542a<?> c2542a, boolean z10) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final boolean m12460i(AbstractC5997o1 abstractC5997o1) {
        Feature feature;
        if (!(abstractC5997o1 instanceof AbstractC6029z0)) {
            C2542a.e eVar = this.f35582b;
            abstractC5997o1.mo12438d(this.f35584d, eVar.mo7553s());
            try {
                abstractC5997o1.mo12436c(this);
            } catch (DeadObjectException unused) {
                mo12398h(1);
                eVar.mo7542f("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        AbstractC6029z0 abstractC6029z0 = (AbstractC6029z0) abstractC5997o1;
        Feature[] featureArrMo12443g = abstractC6029z0.mo12443g(this);
        if (featureArrMo12443g == null || featureArrMo12443g.length == 0) {
            feature = null;
            break;
        }
        Feature[] featureArrMo7549n = this.f35582b.mo7549n();
        if (featureArrMo7549n == null) {
            featureArrMo7549n = new Feature[0];
        }
        C8446b c8446b = new C8446b(featureArrMo7549n.length);
        for (Feature feature2 : featureArrMo7549n) {
            c8446b.put(feature2.f13860a, Long.valueOf(feature2.m7531q()));
        }
        int length = featureArrMo12443g.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                feature = null;
                break;
            }
            feature = featureArrMo12443g[i10];
            Long l10 = (Long) c8446b.getOrDefault(feature.f13860a, null);
            if (l10 == null || l10.longValue() < feature.m7531q()) {
                break;
            }
            i10++;
        }
        if (feature == null) {
            C2542a.e eVar2 = this.f35582b;
            abstractC5997o1.mo12438d(this.f35584d, eVar2.mo7553s());
            try {
                abstractC5997o1.mo12436c(this);
            } catch (DeadObjectException unused2) {
                mo12398h(1);
                eVar2.mo7542f("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f35582b.getClass().getName();
        String str = feature.f13860a;
        long jM7531q = feature.m7531q();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        C0166e.m777x(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(jM7531q);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        if (!this.f35592l.f35441J || !abstractC6029z0.mo12442f(this)) {
            abstractC6029z0.mo12435b(new UnsupportedApiCallException(feature));
            return true;
        }
        C6011t0 c6011t0 = new C6011t0(this.f35583c, feature);
        int iIndexOf = this.f35590j.indexOf(c6011t0);
        if (iIndexOf >= 0) {
            C6011t0 c6011t1 = (C6011t0) this.f35590j.get(iIndexOf);
            this.f35592l.f35440I.removeMessages(15, c6011t1);
            HandlerC9517f handlerC9517f = this.f35592l.f35440I;
            Message messageObtain = Message.obtain(handlerC9517f, 15, c6011t1);
            this.f35592l.getClass();
            handlerC9517f.sendMessageDelayed(messageObtain, 5000L);
        } else {
            this.f35590j.add(c6011t0);
            HandlerC9517f handlerC9517f2 = this.f35592l.f35440I;
            Message messageObtain2 = Message.obtain(handlerC9517f2, 15, c6011t0);
            this.f35592l.getClass();
            handlerC9517f2.sendMessageDelayed(messageObtain2, 5000L);
            HandlerC9517f handlerC9517f3 = this.f35592l.f35440I;
            Message messageObtain3 = Message.obtain(handlerC9517f3, 16, c6011t0);
            this.f35592l.getClass();
            handlerC9517f3.sendMessageDelayed(messageObtain3, 120000L);
            ConnectionResult connectionResult = new ConnectionResult(2, null);
            if (!m12461k(connectionResult)) {
                this.f35592l.m12403c(connectionResult, this.f35587g);
            }
        }
        return false;
    }

    @Override // p152hb.InterfaceC5980j
    /* JADX INFO: renamed from: j */
    public final void mo494j(ConnectionResult connectionResult) {
        m12465o(connectionResult, null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m12461k(ConnectionResult connectionResult) {
        synchronized (C5961d.f35437M) {
            C5961d c5961d = this.f35592l;
            if (c5961d.f35452k == null || !c5961d.f35453l.contains(this.f35583c)) {
                return false;
            }
            this.f35592l.f35452k.m12470m(connectionResult, this.f35587g);
            return true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12462l(boolean z10) {
        C6272i.m12909c(this.f35592l.f35440I);
        C2542a.e eVar = this.f35582b;
        if (!eVar.mo7537a() || this.f35586f.size() != 0) {
            return false;
        }
        C5998p c5998p = this.f35584d;
        if (!((c5998p.f35567a.isEmpty() && c5998p.f35568b.isEmpty()) ? false : true)) {
            eVar.mo7542f("Timing out service connection.");
            return true;
        }
        if (z10) {
            m12459g();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.android.gms.common.api.a$e, dc.f] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public final void m12463m() {
        C5961d c5961d = this.f35592l;
        C6272i.m12909c(c5961d.f35440I);
        C2542a.e eVar = this.f35582b;
        if (!eVar.mo7537a()) {
            if (eVar.mo7543g()) {
                return;
            }
            try {
                int iM12932a = c5961d.f35448g.m12932a(c5961d.f35446e, eVar);
                if (iM12932a != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(iM12932a, null);
                    String name = eVar.getClass().getName();
                    String string = connectionResult.toString();
                    StringBuilder sb2 = new StringBuilder(name.length() + 35 + string.length());
                    sb2.append("The service for ");
                    sb2.append(name);
                    sb2.append(" is not available: ");
                    sb2.append(string);
                    Log.w("GoogleApiManager", sb2.toString());
                    m12465o(connectionResult, null);
                    return;
                }
                C6017v0 c6017v0 = new C6017v0(c5961d, eVar, this.f35583c);
                if (eVar.mo7553s()) {
                    BinderC5973g1 binderC5973g1 = this.f35588h;
                    C6272i.m12915i(binderC5973g1);
                    InterfaceC5147f interfaceC5147f = binderC5973g1.f35492f;
                    if (interfaceC5147f != null) {
                        interfaceC5147f.mo7545i();
                    }
                    Integer numValueOf = Integer.valueOf(System.identityHashCode(binderC5973g1));
                    C6254b c6254b = binderC5973g1.f35491e;
                    c6254b.f36446h = numValueOf;
                    C5143b c5143b = binderC5973g1.f35489c;
                    Context context = binderC5973g1.f35487a;
                    Handler handler = binderC5973g1.f35488b;
                    binderC5973g1.f35492f = c5143b.mo4928b(context, handler.getLooper(), c6254b, c6254b.f36445g, binderC5973g1, binderC5973g1);
                    binderC5973g1.f35493g = c6017v0;
                    Set<Scope> set = binderC5973g1.f35490d;
                    if (set == null || set.isEmpty()) {
                        handler.post(new RunnableC7932l(1, binderC5973g1));
                    } else {
                        binderC5973g1.f35492f.mo10921u();
                    }
                }
                try {
                    eVar.mo7538b(c6017v0);
                } catch (SecurityException e10) {
                    m12465o(new ConnectionResult(10), e10);
                }
            } catch (IllegalStateException e11) {
                m12465o(new ConnectionResult(10), e11);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m12464n(AbstractC5997o1 abstractC5997o1) {
        C6272i.m12909c(this.f35592l.f35440I);
        boolean zMo7537a = this.f35582b.mo7537a();
        LinkedList linkedList = this.f35581a;
        if (zMo7537a) {
            if (m12460i(abstractC5997o1)) {
                m12459g();
                return;
            } else {
                linkedList.add(abstractC5997o1);
                return;
            }
        }
        linkedList.add(abstractC5997o1);
        ConnectionResult connectionResult = this.f35591k;
        if (connectionResult == null || !connectionResult.m7530q()) {
            m12463m();
        } else {
            m12465o(this.f35591k, null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12465o(ConnectionResult connectionResult, RuntimeException runtimeException) {
        InterfaceC5147f interfaceC5147f;
        C6272i.m12909c(this.f35592l.f35440I);
        BinderC5973g1 binderC5973g1 = this.f35588h;
        if (binderC5973g1 != null && (interfaceC5147f = binderC5973g1.f35492f) != null) {
            interfaceC5147f.mo7545i();
        }
        C6272i.m12909c(this.f35592l.f35440I);
        this.f35591k = null;
        this.f35592l.f35448g.f36509a.clear();
        m12453a(connectionResult);
        if ((this.f35582b instanceof C6445d) && connectionResult.f13857b != 24) {
            C5961d c5961d = this.f35592l;
            c5961d.f35443b = true;
            HandlerC9517f handlerC9517f = c5961d.f35440I;
            handlerC9517f.sendMessageDelayed(handlerC9517f.obtainMessage(19), 300000L);
        }
        if (connectionResult.f13857b == 4) {
            m12454b(C5961d.f35436L);
            return;
        }
        if (this.f35581a.isEmpty()) {
            this.f35591k = connectionResult;
            return;
        }
        if (runtimeException != null) {
            C6272i.m12909c(this.f35592l.f35440I);
            m12455c(null, runtimeException, false);
            return;
        }
        if (!this.f35592l.f35441J) {
            m12454b(C5961d.m12399d(this.f35583c, connectionResult));
            return;
        }
        m12455c(C5961d.m12399d(this.f35583c, connectionResult), null, true);
        if (this.f35581a.isEmpty() || m12461k(connectionResult) || this.f35592l.m12403c(connectionResult, this.f35587g)) {
            return;
        }
        if (connectionResult.f13857b == 18) {
            this.f35589i = true;
        }
        if (!this.f35589i) {
            m12454b(C5961d.m12399d(this.f35583c, connectionResult));
            return;
        }
        HandlerC9517f handlerC9517f2 = this.f35592l.f35440I;
        Message messageObtain = Message.obtain(handlerC9517f2, 9, this.f35583c);
        this.f35592l.getClass();
        handlerC9517f2.sendMessageDelayed(messageObtain, 5000L);
    }

    /* JADX INFO: renamed from: p */
    public final void m12466p() {
        C6272i.m12909c(this.f35592l.f35440I);
        Status status = C5961d.f35435K;
        m12454b(status);
        C5998p c5998p = this.f35584d;
        c5998p.getClass();
        c5998p.m12449a(false, status);
        for (C5971g.a aVar : (C5971g.a[]) this.f35586f.keySet().toArray(new C5971g.a[0])) {
            m12464n(new C5994n1(aVar, new C5752h()));
        }
        m12453a(new ConnectionResult(4));
        C2542a.e eVar = this.f35582b;
        if (eVar.mo7537a()) {
            eVar.mo7551q(new C6005r0(this));
        }
    }
}
