package p000;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0355e;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.platform.C0403o;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class k40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46673a = 0;

    /* JADX INFO: renamed from: b */
    public Object f46674b;

    /* JADX INFO: renamed from: c */
    public Object f46675c;

    /* JADX INFO: renamed from: d */
    public Object f46676d;

    /* JADX INFO: renamed from: e */
    public Object f46677e;

    /* JADX INFO: renamed from: f */
    public Object f46678f;

    /* JADX INFO: renamed from: g */
    public Object f46679g;

    /* JADX INFO: renamed from: h */
    public Object f46680h;

    /* JADX INFO: renamed from: i */
    public Object f46681i;

    /* JADX INFO: renamed from: j */
    public Object f46682j;

    /* JADX INFO: renamed from: k */
    public Object f46683k;

    public k40(C0357g c0357g) {
        this.f46674b = c0357g;
        ql6 ql6Var = new ql6();
        ql6Var.f34840d = -1;
        this.f46675c = ql6Var;
        C0353c c0353c = new C0353c(c0357g);
        this.f46676d = c0353c;
        this.f46677e = c0353c;
        ir9 ir9Var = c0353c.f4307n0;
        this.f46678f = ir9Var;
        this.f46679g = ir9Var;
        this.f46682j = new x66(new e16[16]);
    }

    /* JADX INFO: renamed from: a */
    public static final void m14793a(k40 k40Var, d16 d16Var, AbstractC0362l abstractC0362l) {
        for (d16 d16Var2 = d16Var.f34841e; d16Var2 != null; d16Var2 = d16Var2.f34841e) {
            if (d16Var2 == ((ql6) k40Var.f46675c)) {
                C0357g c0357gM1610w = ((C0357g) k40Var.f46674b).m1610w();
                abstractC0362l.f4434L = c0357gM1610w != null ? (C0353c) c0357gM1610w.f4335a0.f46676d : null;
                k40Var.f46677e = abstractC0362l;
                return;
            } else {
                if ((d16Var2.f34839c & 2) != 0) {
                    return;
                }
                d16Var2.mo9978Y0(abstractC0362l);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static d16 m14794d(c16 c16Var, d16 d16Var) {
        d16 d16VarMo21h;
        if (c16Var instanceof i16) {
            d16VarMo21h = ((i16) c16Var).mo21h();
            d16VarMo21h.f34839c = tl6.m22198f(d16VarMo21h);
        } else {
            q70 q70Var = new q70();
            q70Var.f34839c = tl6.m22196d(c16Var);
            q70Var.f57334J = c16Var;
            new HashSet();
            d16VarMo21h = q70Var;
        }
        if (d16VarMo21h.f34836I) {
            i54.m13663b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        d16VarMo21h.f34845i = true;
        d16 d16Var2 = d16Var.f34842f;
        if (d16Var2 != null) {
            d16Var2.f34841e = d16VarMo21h;
            d16VarMo21h.f34842f = d16Var2;
        }
        d16Var.f34842f = d16VarMo21h;
        d16VarMo21h.f34841e = d16Var;
        return d16VarMo21h;
    }

    /* JADX INFO: renamed from: e */
    public static d16 m14795e(d16 d16Var) {
        boolean z = d16Var.f34836I;
        if (z) {
            d66 d66Var = tl6.f62483a;
            if (!z) {
                i54.m13663b("autoInvalidateRemovedNode called on unattached node");
            }
            tl6.m22193a(d16Var, -1, 2);
            d16Var.mo9976W0();
            d16Var.mo9973Q0();
        }
        d16 d16Var2 = d16Var.f34842f;
        d16 d16Var3 = d16Var.f34841e;
        if (d16Var2 != null) {
            d16Var2.f34841e = d16Var3;
            d16Var.f34842f = null;
        }
        if (d16Var3 != null) {
            d16Var3.f34842f = d16Var2;
            d16Var.f34841e = null;
        }
        d16Var3.getClass();
        return d16Var3;
    }

    /* JADX INFO: renamed from: j */
    public static void m14796j(c16 c16Var, c16 c16Var2, d16 d16Var) {
        if ((c16Var instanceof i16) && (c16Var2 instanceof i16)) {
            d16Var.getClass();
            ((i16) c16Var2).mo23o(d16Var);
            if (d16Var.f34836I) {
                tl6.m22195c(d16Var);
                return;
            } else {
                d16Var.f34846j = true;
                return;
            }
        }
        if (!(d16Var instanceof q70)) {
            i54.m13663b("Unknown Modifier.Node type");
            return;
        }
        q70 q70Var = (q70) d16Var;
        boolean z = q70Var.f34836I;
        if (z) {
            if (!z) {
                i54.m13663b("unInitializeModifier called on unattached node");
            }
            if ((q70Var.f34839c & 8) != 0) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(q70Var)).m1731G();
            }
        }
        q70Var.f57334J = c16Var2;
        q70Var.f34839c = tl6.m22196d(c16Var2);
        if (q70Var.f34836I) {
            q70Var.m19689Z0(false);
        }
        if (d16Var.f34836I) {
            tl6.m22195c(d16Var);
        } else {
            d16Var.f34846j = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14797b(String str, String str2) {
        HashMap map = (HashMap) this.f46681i;
        if (map != null) {
            map.put(str, str2);
        } else {
            C3386nv.m17633t("Property \"autoMetadata\" has not been set");
        }
    }

    /* JADX INFO: renamed from: c */
    public l40 m14798c() {
        String strConcat = ((String) this.f46674b) == null ? " transportName" : "";
        if (((vr2) this.f46678f) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.f46679g) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.f46680h) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f46681i) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new l40((String) this.f46674b, (Integer) this.f46676d, (vr2) this.f46678f, ((Long) this.f46679g).longValue(), ((Long) this.f46680h).longValue(), (HashMap) this.f46681i, (Integer) this.f46677e, (String) this.f46675c, (byte[]) this.f46682j, (byte[]) this.f46683k);
        }
        C3386nv.m17633t("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14799f(int i) {
        return (((d16) this.f46679g).f34840d & i) != 0;
    }

    /* JADX INFO: renamed from: g */
    public void m14800g() {
        for (d16 d16Var = (d16) this.f46679g; d16Var != null; d16Var = d16Var.f34842f) {
            d16Var.mo9975V0();
            if (d16Var.f34845i) {
                d66 d66Var = tl6.f62483a;
                if (!d16Var.f34836I) {
                    i54.m13663b("autoInvalidateInsertedNode called on unattached node");
                }
                tl6.m22193a(d16Var, -1, 1);
            }
            if (d16Var.f34846j) {
                tl6.m22195c(d16Var);
            }
            d16Var.f34845i = false;
            d16Var.f34846j = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0142 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: h */
    public void m14801h(int r32, p000.x66 r33, p000.x66 r34, p000.d16 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k40.m14801h(int, x66, x66, d16, boolean):void");
    }

    /* JADX INFO: renamed from: i */
    public void m14802i() {
        C0355e c0355e;
        b17 b17Var;
        C0357g c0357g = (C0357g) this.f46674b;
        AbstractC0362l abstractC0362l = (C0353c) this.f46676d;
        for (d16 d16Var = ((ir9) this.f46678f).f34841e; d16Var != null; d16Var = d16Var.f34841e) {
            InterfaceC0354d interfaceC0354dM21994h = te1.m21994h(d16Var);
            if (interfaceC0354dM21994h != null) {
                AbstractC0362l abstractC0362l2 = d16Var.f34844h;
                if (abstractC0362l2 != null) {
                    c0355e = (C0355e) abstractC0362l2;
                    InterfaceC0354d interfaceC0354d = c0355e.f4310n0;
                    c0355e.m1550I1(interfaceC0354dM21994h);
                    if (interfaceC0354d != d16Var && (b17Var = c0355e.f4455g0) != null) {
                        ((C0403o) b17Var).m1808c();
                    }
                } else {
                    c0355e = new C0355e(c0357g, interfaceC0354dM21994h);
                    d16Var.mo9978Y0(c0355e);
                }
                abstractC0362l.f4434L = c0355e;
                c0355e.f4433K = abstractC0362l;
                abstractC0362l = c0355e;
            } else {
                d16Var.mo9978Y0(abstractC0362l);
            }
        }
        C0357g c0357gM1610w = c0357g.m1610w();
        abstractC0362l.f4434L = c0357gM1610w != null ? (C0353c) c0357gM1610w.f4335a0.f46676d : null;
        this.f46677e = abstractC0362l;
    }

    public String toString() {
        switch (this.f46673a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                d16 d16Var = (d16) this.f46679g;
                ir9 ir9Var = (ir9) this.f46678f;
                if (d16Var == ir9Var) {
                    sb.append("]");
                } else {
                    while (d16Var != null && d16Var != ir9Var) {
                        sb.append(String.valueOf(d16Var));
                        if (d16Var.f34842f == ir9Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            d16Var = d16Var.f34842f;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ k40() {
    }
}
