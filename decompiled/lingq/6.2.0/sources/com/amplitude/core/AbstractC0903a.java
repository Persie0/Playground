package com.amplitude.core;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amplitude.android.C0879a;
import com.amplitude.android.C0880b;
import com.amplitude.android.C0882d;
import com.amplitude.android.storage.C0898b;
import com.amplitude.core.diagnostics.C0905a;
import com.amplitude.core.remoteconfig.C0912a;
import com.amplitude.p007id.C0916a;
import com.amplitude.p007id.IdentityUpdateType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3192a;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.C3145jf;
import p000.C3386nv;
import p000.C3722wh;
import p000.a18;
import p000.b64;
import p000.b90;
import p000.bl2;
import p000.cs4;
import p000.fa4;
import p000.fs4;
import p000.gz3;
import p000.hu2;
import p000.iu0;
import p000.kn1;
import p000.kz3;
import p000.nn1;
import p000.pb1;
import p000.pj5;
import p000.sq5;
import p000.te1;
import p000.ui3;
import p000.un1;
import p000.vk9;
import p000.vz1;
import p000.w41;
import p000.wfb;
import p000.xfa;
import p000.y92;
import p000.yv5;
import p000.zf7;

/* JADX INFO: renamed from: com.amplitude.core.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0903a {

    /* JADX INFO: renamed from: a */
    public final C0880b f11016a;

    /* JADX INFO: renamed from: b */
    public final sq5 f11017b;

    /* JADX INFO: renamed from: c */
    public final un1 f11018c;

    /* JADX INFO: renamed from: d */
    public final nn1 f11019d;

    /* JADX INFO: renamed from: e */
    public final nn1 f11020e;

    /* JADX INFO: renamed from: f */
    public final nn1 f11021f;

    /* JADX INFO: renamed from: g */
    public final C0882d f11022g;

    /* JADX INFO: renamed from: h */
    public final cs4 f11023h;

    /* JADX INFO: renamed from: i */
    public C0898b f11024i;

    /* JADX INFO: renamed from: j */
    public bl2 f11025j;

    /* JADX INFO: renamed from: k */
    public final cs4 f11026k;

    /* JADX INFO: renamed from: l */
    public final y92 f11027l;

    /* JADX INFO: renamed from: m */
    public final b64 f11028m;

    /* JADX INFO: renamed from: n */
    public final w41 f11029n;

    /* JADX INFO: renamed from: o */
    public final cs4 f11030o;

    /* JADX INFO: renamed from: p */
    public final cs4 f11031p;

    /* JADX INFO: renamed from: q */
    public final a18 f11032q;

    public AbstractC0903a(C0880b c0880b, sq5 sq5Var, un1 un1Var, nn1 nn1Var, nn1 nn1Var2, nn1 nn1Var3) {
        this.f11016a = c0880b;
        this.f11017b = sq5Var;
        this.f11018c = un1Var;
        this.f11019d = nn1Var;
        this.f11020e = nn1Var2;
        this.f11021f = nn1Var3;
        final C0879a c0879a = (C0879a) this;
        this.f11023h = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.core.Amplitude$storage$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0879a c0879a2 = c0879a;
                return c0879a2.f11016a.f10793f.mo10416e(c0879a2);
            }
        });
        this.f11026k = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.core.Amplitude$logger$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0879a c0879a2 = c0879a;
                return c0879a2.f11016a.f10794g.m5104a(c0879a2);
            }
        });
        b64 b64Var = new b64();
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        setSynchronizedSet.getClass();
        b64Var.f8007b = setSynchronizedSet;
        this.f11028m = b64Var;
        w41 w41Var = new w41();
        w41Var.f66365a = sq5Var;
        w41Var.f66366b = new Object();
        this.f11029n = w41Var;
        this.f11030o = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.core.Amplitude$diagnosticsClient$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0879a c0879a2 = c0879a;
                C0880b c0880b2 = c0879a2.f11016a;
                return new C0905a(c0880b2.f10788a, c0880b2.f10796i, c0880b2.f10792e, c0880b2.m5061a(), c0879a2.m5113g(), c0879a2.f11018c, c0879a2.f11020e, c0879a2.f11021f, (C0912a) c0879a2.f11031p.getValue(), new bl2(c0880b2, c0879a2.m5113g()), new C3722wh(c0880b2.f10789b, 0), c0880b2.f10806s);
            }
        });
        this.f11031p = AbstractC3192a.m15356a(new ui3() { // from class: com.amplitude.core.Amplitude$remoteConfigClient$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C0879a c0879a2 = c0879a;
                C0880b c0880b2 = c0879a2.f11016a;
                return new C0912a(c0880b2.f10788a, c0880b2.f10796i, c0879a2.f11018c, c0879a2.f11020e, c0879a2.f11021f, c0879a2.m5114h(), new bl2(c0880b2, c0879a2.m5113g()), c0879a2.m5113g());
            }
        });
        this.f11032q = new a18(pb1.m19033c(0, DescriptorProtos.Edition.EDITION_2023_VALUE, BufferOverflow.DROP_OLDEST));
        if (vk9.m23391n0(c0880b.f10788a) || c0880b.f10790c <= 0 || c0880b.f10791d <= 0) {
            C3386nv.m17626m("invalid configuration");
            throw null;
        }
        C0882d c0882d = new C0882d();
        c0882d.f39591c = c0879a;
        this.f11022g = c0882d;
        y92 y92VarMo5060b = mo5060b();
        this.f11027l = y92VarMo5060b;
        y92VarMo5060b.start();
    }

    /* JADX INFO: renamed from: l */
    public static void m5107l(AbstractC0903a abstractC0903a, String str, Map map, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        abstractC0903a.getClass();
        str.getClass();
        b90 b90Var = new b90();
        b90Var.f8137L = str;
        b90Var.f8138M = map != null ? new LinkedHashMap(map) : null;
        abstractC0903a.m5115i(b90Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m5108a(zf7 zf7Var) {
        zf7Var.getClass();
        if (zf7Var instanceof C3145jf) {
            sq5 sq5Var = this.f11017b;
            C3145jf c3145jf = (C3145jf) zf7Var;
            synchronized (((ArrayList) sq5Var.f61250d)) {
                c3145jf.mo5089a(this);
                ((ArrayList) sq5Var.f61250d).add(c3145jf);
            }
            return;
        }
        C0882d c0882d = this.f11022g;
        c0882d.getClass();
        zf7Var.mo5089a(c0882d.m12113t());
        yv5 yv5Var = (yv5) ((Map) c0882d.f39590b).get(zf7Var.getType());
        if (yv5Var != null) {
            yv5Var.f70552a.add(zf7Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public y92 mo5060b() {
        CoroutineStart coroutineStart = CoroutineStart.LAZY;
        Amplitude$build$built$1 amplitude$build$built$1 = new Amplitude$build$built$1(this, this, null);
        kn1 kn1VarM21970C = te1.m21970C(this.f11018c, this.f11019d);
        y92 fs4Var = coroutineStart.isLazy() ? new fs4(kn1VarM21970C, amplitude$build$built$1) : new y92(kn1VarM21970C, true);
        coroutineStart.invoke(amplitude$build$built$1, fs4Var, fs4Var);
        return fs4Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m5109c() {
        wfb.m23926u(this.f11018c, this.f11019d, null, new Amplitude$flush$1(this, null), 2);
    }

    /* JADX INFO: renamed from: d */
    public final C0905a m5110d() {
        return (C0905a) this.f11030o.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final C0898b m5111e() {
        C0898b c0898b = this.f11024i;
        if (c0898b != null) {
            return c0898b;
        }
        fa4.m11636J("identifyInterceptStorage");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final bl2 m5112f() {
        bl2 bl2Var = this.f11025j;
        if (bl2Var != null) {
            return bl2Var;
        }
        fa4.m11636J("identityStorage");
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final pj5 m5113g() {
        return (pj5) this.f11026k.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final C0898b m5114h() {
        return (C0898b) this.f11023h.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m5115i(b90 b90Var) {
        if (b90Var.f8144c == null) {
            b90Var.f8144c = Long.valueOf(System.currentTimeMillis());
        }
        LinkedHashMap linkedHashMap = b90Var.f8138M;
        b90Var.f8138M = linkedHashMap != null ? vz1.m23651u(linkedHashMap) : null;
        LinkedHashMap linkedHashMap2 = b90Var.f8139N;
        b90Var.f8139N = linkedHashMap2 != null ? vz1.m23651u(linkedHashMap2) : null;
        LinkedHashMap linkedHashMap3 = b90Var.f8140O;
        b90Var.f8140O = linkedHashMap3 != null ? vz1.m23651u(linkedHashMap3) : null;
        LinkedHashMap linkedHashMap4 = b90Var.f8141P;
        b90Var.f8141P = linkedHashMap4 != null ? vz1.m23651u(linkedHashMap4) : null;
        m5113g().mo16256b("Logged event with type: " + b90Var.mo3490a());
        C0882d c0882d = this.f11022g;
        c0882d.getClass();
        if (b90Var.f8144c == null) {
            b90Var.f8144c = Long.valueOf(System.currentTimeMillis());
        }
        if (c0882d.f10816d.mo4677k(new hu2(b90Var)) instanceof iu0) {
            c0882d.m12113t().m5113g().mo16255a("Failed to enqueue event: " + b90Var.mo3490a() + ". Channel is closed or full.");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5116j(String str) {
        xfa xfaVar;
        str.getClass();
        w41 w41Var = this.f11029n;
        w41Var.getClass();
        synchronized (w41Var.f66366b) {
            try {
                ((sq5) w41Var.f66365a).m21553B(str);
                C0916a c0916a = (C0916a) w41Var.f66367c;
                if (c0916a != null) {
                    c0916a.m5172b(new gz3(c0916a.m5171a().f41547a, str), IdentityUpdateType.Updated);
                    xfaVar = xfa.f68157a;
                } else {
                    xfaVar = null;
                }
                if (xfaVar == null) {
                    w41Var.f66369e = new kz3(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5117k(String str) {
        xfa xfaVar;
        w41 w41Var = this.f11029n;
        synchronized (w41Var.f66366b) {
            try {
                ((sq5) w41Var.f66365a).m21554C(str);
                C0916a c0916a = (C0916a) w41Var.f66367c;
                if (c0916a != null) {
                    gz3 gz3VarM5171a = c0916a.m5171a();
                    String str2 = gz3VarM5171a.f41547a;
                    c0916a.m5172b(new gz3(str, gz3VarM5171a.f41548b), IdentityUpdateType.Updated);
                    xfaVar = xfa.f68157a;
                } else {
                    xfaVar = null;
                }
                if (xfaVar == null) {
                    w41Var.f66368d = new kz3(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
