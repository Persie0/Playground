package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.android.exoplayer2.AbstractC2382c0;
import com.google.android.exoplayer2.C2415l;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.drm.InterfaceC2398b;
import com.google.android.exoplayer2.source.C2478f;
import com.google.android.exoplayer2.source.C2479g;
import com.google.android.exoplayer2.source.InterfaceC2480h;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import ga.C5725h;
import ga.C5726i;
import ga.InterfaceC5732o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import p150h9.C5906c0;
import p150h9.C5922k0;
import p150h9.InterfaceC5904b0;
import p150h9.RunnableC5908d0;
import p150h9.RunnableC5912f0;
import p150h9.RunnableC5914g0;
import p150h9.RunnableC5916h0;
import p150h9.RunnableC5918i0;
import p174i9.C6215e0;
import p174i9.InterfaceC6206a;
import p213k4.RunnableC6589i;
import p213k4.RunnableC6590j;
import p274n8.RunnableC7716a;
import p286o2.RunnableC7907g;
import p454wa.InterfaceC9894s;
import p479xa.C10134c0;
import p479xa.InterfaceC10142k;

/* JADX INFO: renamed from: com.google.android.exoplayer2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2469s {

    /* JADX INFO: renamed from: a */
    public final C6215e0 f12986a;

    /* JADX INFO: renamed from: e */
    public final d f12990e;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6206a f12993h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC10142k f12994i;

    /* JADX INFO: renamed from: k */
    public boolean f12996k;

    /* JADX INFO: renamed from: l */
    public InterfaceC9894s f12997l;

    /* JADX INFO: renamed from: j */
    public InterfaceC5732o f12995j = new InterfaceC5732o.a();

    /* JADX INFO: renamed from: c */
    public final IdentityHashMap<InterfaceC2480h, c> f12988c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d */
    public final HashMap f12989d = new HashMap();

    /* JADX INFO: renamed from: b */
    public final ArrayList f12987b = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final HashMap<c, b> f12991f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    public final HashSet f12992g = new HashSet();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.s$a */
    public final class a implements InterfaceC2493j, InterfaceC2398b {

        /* JADX INFO: renamed from: a */
        public final c f12998a;

        public a(c cVar) {
            this.f12998a = cVar;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: G */
        public final void mo7237G(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC5908d0(this, pairM7241f, c5725h, c5726i, 0));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: N */
        public final void mo7238N(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC5908d0(this, pairM7241f, c5725h, c5726i, 1));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: S */
        public final void mo7239S(int i10, InterfaceC2492i.b bVar, final C5725h c5725h, final C5726i c5726i, final IOException iOException, final boolean z10) {
            final Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new Runnable() { // from class: h9.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5725h c5725h2 = c5725h;
                        C5726i c5726i2 = c5726i;
                        IOException iOException2 = iOException;
                        boolean z11 = z10;
                        InterfaceC6206a interfaceC6206a = C2469s.this.f12993h;
                        Pair pair = pairM7241f;
                        interfaceC6206a.mo7239S(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second, c5725h2, c5726i2, iOException2, z11);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: a0 */
        public final void mo6961a0(int i10, InterfaceC2492i.b bVar) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC7907g(this, 10, pairM7241f));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: d0 */
        public final void mo7240d0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC7716a(1, this, pairM7241f, c5726i));
            }
        }

        /* JADX INFO: renamed from: f */
        public final Pair<Integer, InterfaceC2492i.b> m7241f(int i10, InterfaceC2492i.b bVar) {
            InterfaceC2492i.b bVarM7324b;
            c cVar = this.f12998a;
            InterfaceC2492i.b bVar2 = null;
            if (bVar != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= cVar.f13005c.size()) {
                        bVarM7324b = null;
                        break;
                    }
                    if (((InterfaceC2492i.b) cVar.f13005c.get(i11)).f34760d == bVar.f34760d) {
                        Object obj = cVar.f13004b;
                        int i12 = AbstractC2352a.f11821e;
                        bVarM7324b = bVar.m7324b(Pair.create(obj, bVar.f34757a));
                        break;
                    }
                    i11++;
                }
                if (bVarM7324b == null) {
                    return null;
                }
                bVar2 = bVarM7324b;
            }
            return Pair.create(Integer.valueOf(i10 + cVar.f13006d), bVar2);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: g0 */
        public final void mo7242g0(int i10, InterfaceC2492i.b bVar, C5726i c5726i) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC6589i(3, this, pairM7241f, c5726i));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: k0 */
        public final void mo6962k0(int i10, InterfaceC2492i.b bVar) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC5916h0(this, pairM7241f, 1));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: o0 */
        public final void mo6963o0(int i10, InterfaceC2492i.b bVar, int i11) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC5914g0(this, pairM7241f, i11));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: p0 */
        public final void mo6964p0(int i10, InterfaceC2492i.b bVar) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC5916h0(this, pairM7241f, 0));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: r0 */
        public final void mo6965r0(int i10, InterfaceC2492i.b bVar) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC6590j(this, 9, pairM7241f));
            }
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC2493j
        /* JADX INFO: renamed from: x */
        public final void mo7243x(int i10, InterfaceC2492i.b bVar, C5725h c5725h, C5726i c5726i) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC5912f0(this, pairM7241f, c5725h, c5726i, 0));
            }
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2398b
        /* JADX INFO: renamed from: y */
        public final void mo6966y(int i10, InterfaceC2492i.b bVar, Exception exc) {
            Pair<Integer, InterfaceC2492i.b> pairM7241f = m7241f(i10, bVar);
            if (pairM7241f != null) {
                C2469s.this.f12994i.mo19079e(new RunnableC5918i0(0, this, pairM7241f, exc));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.s$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2492i f13000a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2492i.c f13001b;

        /* JADX INFO: renamed from: c */
        public final a f13002c;

        public b(C2479g c2479g, C5906c0 c5906c0, a aVar) {
            this.f13000a = c2479g;
            this.f13001b = c5906c0;
            this.f13002c = aVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.s$c */
    public static final class c implements InterfaceC5904b0 {

        /* JADX INFO: renamed from: a */
        public final C2479g f13003a;

        /* JADX INFO: renamed from: d */
        public int f13006d;

        /* JADX INFO: renamed from: e */
        public boolean f13007e;

        /* JADX INFO: renamed from: c */
        public final ArrayList f13005c = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Object f13004b = new Object();

        public c(InterfaceC2492i interfaceC2492i, boolean z10) {
            this.f13003a = new C2479g(interfaceC2492i, z10);
        }

        @Override // p150h9.InterfaceC5904b0
        /* JADX INFO: renamed from: a */
        public final Object mo7060a() {
            return this.f13004b;
        }

        @Override // p150h9.InterfaceC5904b0
        /* JADX INFO: renamed from: b */
        public final AbstractC2382c0 mo7061b() {
            return this.f13003a.f13113h;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.s$d */
    public interface d {
    }

    public C2469s(d dVar, InterfaceC6206a interfaceC6206a, InterfaceC10142k interfaceC10142k, C6215e0 c6215e0) {
        this.f12986a = c6215e0;
        this.f12990e = dVar;
        this.f12993h = interfaceC6206a;
        this.f12994i = interfaceC10142k;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2382c0 m7230a(int i10, List<c> list, InterfaceC5732o interfaceC5732o) {
        if (!list.isEmpty()) {
            this.f12995j = interfaceC5732o;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                ArrayList arrayList = this.f12987b;
                if (i11 > 0) {
                    c cVar2 = (c) arrayList.get(i11 - 1);
                    cVar.f13006d = cVar2.f13003a.f13113h.mo6909o() + cVar2.f13006d;
                    cVar.f13007e = false;
                    cVar.f13005c.clear();
                } else {
                    cVar.f13006d = 0;
                    cVar.f13007e = false;
                    cVar.f13005c.clear();
                }
                int iMo6909o = cVar.f13003a.f13113h.mo6909o();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((c) arrayList.get(i12)).f13006d += iMo6909o;
                }
                arrayList.add(i11, cVar);
                this.f12989d.put(cVar.f13004b, cVar);
                if (this.f12996k) {
                    m7234e(cVar);
                    if (this.f12988c.isEmpty()) {
                        this.f12992g.add(cVar);
                    } else {
                        b bVar = this.f12991f.get(cVar);
                        if (bVar != null) {
                            bVar.f13000a.disable(bVar.f13001b);
                        }
                    }
                }
            }
        }
        return m7231b();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2382c0 m7231b() {
        ArrayList arrayList = this.f12987b;
        if (arrayList.isEmpty()) {
            return AbstractC2382c0.f12057a;
        }
        int iMo6909o = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            cVar.f13006d = iMo6909o;
            iMo6909o += cVar.f13003a.f13113h.mo6909o();
        }
        return new C5922k0(arrayList, this.f12995j);
    }

    /* JADX INFO: renamed from: c */
    public final void m7232c() {
        Iterator it = this.f12992g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f13005c.isEmpty()) {
                b bVar = this.f12991f.get(cVar);
                if (bVar != null) {
                    bVar.f13000a.disable(bVar.f13001b);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7233d(c cVar) {
        if (cVar.f13007e && cVar.f13005c.isEmpty()) {
            b bVarRemove = this.f12991f.remove(cVar);
            bVarRemove.getClass();
            InterfaceC2492i.c cVar2 = bVarRemove.f13001b;
            InterfaceC2492i interfaceC2492i = bVarRemove.f13000a;
            interfaceC2492i.releaseSource(cVar2);
            a aVar = bVarRemove.f13002c;
            interfaceC2492i.removeEventListener(aVar);
            interfaceC2492i.removeDrmEventListener(aVar);
            this.f12992g.remove(cVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.source.i$c, h9.c0] */
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
    /* JADX INFO: renamed from: e */
    public final void m7234e(c cVar) {
        C2479g c2479g = cVar.f13003a;
        ?? r10 = new InterfaceC2492i.c() { // from class: h9.c0
            @Override // com.google.android.exoplayer2.source.InterfaceC2492i.c
            /* JADX INFO: renamed from: a */
            public final void mo7325a(InterfaceC2492i interfaceC2492i, AbstractC2382c0 abstractC2382c0) {
                ((C2415l) this.f35272a.f12990e).f12383h.mo19083i(22);
            }
        };
        a aVar = new a(cVar);
        this.f12991f.put(cVar, new b(c2479g, r10, aVar));
        int i10 = C10134c0.f51354a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        c2479g.addEventListener(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        c2479g.addDrmEventListener(new Handler(looperMyLooper2, null), aVar);
        c2479g.prepareSource(r10, this.f12997l, this.f12986a);
    }

    /* JADX INFO: renamed from: f */
    public final void m7235f(InterfaceC2480h interfaceC2480h) {
        IdentityHashMap<InterfaceC2480h, c> identityHashMap = this.f12988c;
        c cVarRemove = identityHashMap.remove(interfaceC2480h);
        cVarRemove.getClass();
        cVarRemove.f13003a.releasePeriod(interfaceC2480h);
        cVarRemove.f13005c.remove(((C2478f) interfaceC2480h).f13103a);
        if (!identityHashMap.isEmpty()) {
            m7232c();
        }
        m7233d(cVarRemove);
    }

    /* JADX INFO: renamed from: g */
    public final void m7236g(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            ArrayList arrayList = this.f12987b;
            c cVar = (c) arrayList.remove(i12);
            this.f12989d.remove(cVar.f13004b);
            int i13 = -cVar.f13003a.f13113h.mo6909o();
            for (int i14 = i12; i14 < arrayList.size(); i14++) {
                ((c) arrayList.get(i14)).f13006d += i13;
            }
            cVar.f13007e = true;
            if (this.f12996k) {
                m7233d(cVar);
            }
        }
    }
}
