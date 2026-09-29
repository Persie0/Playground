package p000;

import androidx.compose.foundation.gestures.C0098f;
import androidx.compose.foundation.gestures.C0119y;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.layout.C0139h;
import androidx.compose.foundation.relocation.C0155b;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.runtime.internal.AtomicInt;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.library.C1389d;
import com.lingq.core.domain.model.language.Language;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r60 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58788a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58789b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f58790c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f58791d;

    public /* synthetic */ r60(tj3 tj3Var, tt0 tt0Var, bb9 bb9Var, z36 z36Var) {
        this.f58788a = 4;
        this.f58789b = tj3Var;
        this.f58790c = tt0Var;
        this.f58791d = bb9Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i;
        C0098f c0098f;
        e28 e28Var;
        boolean zM856b1;
        int i2 = this.f58788a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f58791d;
        Object obj2 = this.f58790c;
        Object obj3 = this.f58789b;
        switch (i2) {
            case 0:
                ((s60) obj3).mo10450a();
                AtomicInt atomicInt = (AtomicInt) ((w41) obj2).f66367c;
                int i3 = ((Ref$IntRef) obj).f47716a;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return xfaVar;
            case 1:
                C0155b c0155b = (C0155b) obj3;
                e28 e28VarM1047Z0 = C0155b.m1047Z0(c0155b, (AbstractC0362l) obj2, (ui3) obj);
                if (e28VarM1047Z0 == null) {
                    return null;
                }
                C0098f c0098f2 = c0155b.f2722J;
                if (n84.m17279a(c0098f2.f2253Q, -1L)) {
                    l54.m15816c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return e28VarM1047Z0.m10810k(c0098f2.m860d1(e28VarM1047Z0, c0098f2.m857a1(), 0L) ^ (-9223372034707292160L));
            case 2:
                vz1 vz1Var = ((xo0) obj3).f68423b;
                vz1Var.getClass();
                return vz1Var.mo19836q(((C3104i9) obj).f43720h.f38027d, ((ar3) obj2).m3000a());
            case 3:
                C0098f c0098f3 = (C0098f) obj3;
                C0119y c0119y = (C0119y) obj2;
                ni0 ni0Var = (ni0) obj;
                ii0 ii0Var = c0098f3.f2251O;
                while (true) {
                    x66 x66Var = ii0Var.f44131a;
                    int i4 = x66Var.f67832c;
                    if (i4 == 0) {
                        c0098f = c0098f3;
                    } else {
                        if (i4 == 0) {
                            uk9.m22775i("MutableVector is empty.");
                            return null;
                        }
                        e28 e28Var2 = (e28) ((vk1) x66Var.f67830a[i4 - 1]).f65528a.mo0a();
                        if (e28Var2 == null) {
                            c0098f = c0098f3;
                            zM856b1 = true;
                        } else {
                            c0098f = c0098f3;
                            zM856b1 = C0098f.m856b1(c0098f, e28Var2, 0L, 0L, 3);
                        }
                        if (zM856b1) {
                            x66 x66Var2 = ii0Var.f44131a;
                            ((vk1) x66Var2.m24314l(x66Var2.f67832c - 1)).f65529b.resumeWith(xfaVar);
                            c0098f3 = c0098f;
                        }
                    }
                }
                if (c0098f.f2252P && (e28Var = (e28) c0098f.f2250N.mo0a()) != null) {
                    C0098f c0098f4 = c0098f;
                    c0098f = c0098f4;
                    if (C0098f.m856b1(c0098f4, e28Var, 0L, 0L, 3)) {
                        c0098f.f2252P = false;
                    }
                }
                c0119y.f2381e = C0098f.m855Z0(c0098f, ni0Var, 0L);
                return xfaVar;
            case 4:
                tj3 tj3Var = (tj3) obj3;
                tt0 tt0Var = (tt0) obj2;
                bb9 bb9Var = (bb9) obj;
                ze1 ze1Var = tj3Var.f62378M;
                tt0 tt0Var2 = ze1Var.f71431b;
                try {
                    ze1Var.f71431b = tt0Var;
                    bb9 bb9Var2 = tj3Var.f62372G;
                    int[] iArr = tj3Var.f62401o;
                    t56 t56Var = tj3Var.f62408v;
                    tj3Var.f62401o = null;
                    tj3Var.f62408v = null;
                    try {
                        tj3Var.f62372G = bb9Var;
                        boolean z = ze1Var.f71434e;
                        try {
                            ze1Var.f71434e = false;
                            throw null;
                        } catch (Throwable th) {
                            ze1Var.f71434e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        tj3Var.f62372G = bb9Var2;
                        tj3Var.f62401o = iArr;
                        tj3Var.f62408v = t56Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    ze1Var.f71431b = tt0Var2;
                    throw th3;
                }
            case 5:
                return ((C1296l) ((C1389d) obj3).f18834a).m7320o(((Language) obj2).f19024a, (List) obj);
            case 6:
                return new k27((bj3) ((t66) obj3).getValue(), (vi3) ((t66) obj2).getValue(), ((Number) ((ui3) obj).mo0a()).intValue());
            case 7:
                C0127b c0127b = (C0127b) obj2;
                vu4 vu4Var = (vu4) ((gc2) obj3).getValue();
                return new wu4(c0127b, vu4Var, (ft4) obj, new C0139h((i84) c0127b.f2440e.f67249f.getValue(), vu4Var));
            default:
                oj3 oj3Var = (oj3) obj3;
                fb9 fb9Var = (fb9) obj2;
                hz6 hz6Var = (hz6) obj;
                if (oj3Var != null) {
                    fb9Var.m11727a(fb9Var.m11729c(oj3Var) - fb9Var.f38819t);
                }
                List listM16123i = lda.m16123i(fb9Var, null, fb9Var.f38819t, null);
                re1 re1Var = (re1) u91.m22598P0(listM16123i);
                Integer num = re1Var != null ? re1Var.f59154b : null;
                List listMo12104g = hz6Var.mo12104g(num);
                if (num != null && !listMo12104g.isEmpty()) {
                    listMo12104g = u91.m22603U0(u91.m22584B0(listMo12104g, 1), vz1.m23604J(new re1(((re1) u91.m22589G0(listMo12104g)).f59153a, null, num)));
                }
                return new qe1(u91.m22603U0(listMo12104g, listM16123i), hz6Var.mo12105h());
        }
    }

    public /* synthetic */ r60(Object obj, Object obj2, Object obj3, int i) {
        this.f58788a = i;
        this.f58789b = obj;
        this.f58790c = obj2;
        this.f58791d = obj3;
    }
}
