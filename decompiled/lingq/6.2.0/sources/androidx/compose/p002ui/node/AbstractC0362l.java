package androidx.compose.p002ui.node;

import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.ViewParent;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.layout.C0341h;
import androidx.compose.p002ui.platform.C0403o;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3393o1;
import p000.AbstractC3489q9;
import p000.AbstractC3550rv;
import p000.AbstractC3608te;
import p000.AbstractC3650uj;
import p000.AbstractC3695vr;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3500qj;
import p000.a07;
import p000.aa1;
import p000.an0;
import p000.aq4;
import p000.b07;
import p000.b17;
import p000.bq1;
import p000.c07;
import p000.c17;
import p000.ct5;
import p000.cu3;
import p000.d16;
import p000.d32;
import p000.d66;
import p000.e28;
import p000.e47;
import p000.f84;
import p000.fa1;
import p000.fa2;
import p000.fa4;
import p000.fb2;
import p000.fs6;
import p000.gm5;
import p000.gq6;
import p000.h54;
import p000.h66;
import p000.ho5;
import p000.hp6;
import p000.i54;
import p000.ir9;
import p000.it5;
import p000.jc9;
import p000.k40;
import p000.k9a;
import p000.lda;
import p000.ll2;
import p000.m66;
import p000.mi8;
import p000.mt5;
import p000.ng7;
import p000.o39;
import p000.omd;
import p000.p84;
import p000.pb1;
import p000.pk9;
import p000.pq4;
import p000.pvc;
import p000.q98;
import p000.qfa;
import p000.qp3;
import p000.rl6;
import p000.sl6;
import p000.sp3;
import p000.ss5;
import p000.te1;
import p000.tl6;
import p000.ts5;
import p000.ui3;
import p000.ux5;
import p000.v63;
import p000.vi3;
import p000.x56;
import p000.x66;
import p000.x74;
import p000.x7a;
import p000.xfa;
import p000.xp4;
import p000.yd0;
import p000.yk5;
import p000.ym0;
import p000.yp4;
import p000.zi3;
import p000.zk5;

/* JADX INFO: renamed from: androidx.compose.ui.node.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0362l extends AbstractC0359i implements ct5, aq4, c17 {

    /* JADX INFO: renamed from: i0 */
    public static final q98 f4427i0 = new q98();

    /* JADX INFO: renamed from: j0 */
    public static final xp4 f4428j0 = new xp4();

    /* JADX INFO: renamed from: k0 */
    public static final float[] f4429k0 = ts5.m22286a();

    /* JADX INFO: renamed from: l0 */
    public static final rl6 f4430l0 = new rl6();

    /* JADX INFO: renamed from: m0 */
    public static final p84 f4431m0 = new p84(14);

    /* JADX INFO: renamed from: J */
    public final C0357g f4432J;

    /* JADX INFO: renamed from: K */
    public AbstractC0362l f4433K;

    /* JADX INFO: renamed from: L */
    public AbstractC0362l f4434L;

    /* JADX INFO: renamed from: M */
    public boolean f4435M;

    /* JADX INFO: renamed from: N */
    public boolean f4436N;

    /* JADX INFO: renamed from: O */
    public vi3 f4437O;

    /* JADX INFO: renamed from: P */
    public fb2 f4438P;

    /* JADX INFO: renamed from: Q */
    public LayoutDirection f4439Q;

    /* JADX INFO: renamed from: S */
    public it5 f4441S;

    /* JADX INFO: renamed from: T */
    public d66 f4442T;

    /* JADX INFO: renamed from: V */
    public float f4444V;

    /* JADX INFO: renamed from: W */
    public m66 f4445W;

    /* JADX INFO: renamed from: X */
    public xp4 f4446X;

    /* JADX INFO: renamed from: Z */
    public boolean f4448Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f4449a0;

    /* JADX INFO: renamed from: b0 */
    public C0312a f4450b0;

    /* JADX INFO: renamed from: c0 */
    public ym0 f4451c0;

    /* JADX INFO: renamed from: d0 */
    public zi3 f4452d0;

    /* JADX INFO: renamed from: f0 */
    public boolean f4454f0;

    /* JADX INFO: renamed from: g0 */
    public b17 f4455g0;

    /* JADX INFO: renamed from: h0 */
    public C0312a f4456h0;

    /* JADX INFO: renamed from: R */
    public float f4440R = 0.8f;

    /* JADX INFO: renamed from: U */
    public long f4443U = 0;

    /* JADX INFO: renamed from: Y */
    public o39 f4447Y = ss5.f61356d;

    /* JADX INFO: renamed from: e0 */
    public final ui3 f4453e0 = new NodeCoordinator$invalidateParentLayer$1(this);

    public AbstractC0362l(C0357g c0357g) {
        this.f4432J = c0357g;
        this.f4438P = c0357g.f4327T;
        this.f4439Q = c0357g.f4328U;
    }

    /* JADX INFO: renamed from: A1 */
    public static AbstractC0362l m1659A1(aq4 aq4Var) {
        AbstractC0362l abstractC0362l;
        zk5 zk5Var = aq4Var instanceof zk5 ? (zk5) aq4Var : null;
        if (zk5Var != null && (abstractC0362l = zk5Var.f71680a.f69928J) != null) {
            return abstractC0362l;
        }
        aq4Var.getClass();
        return (AbstractC0362l) aq4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // p000.l87, p000.ct5
    /* JADX INFO: renamed from: A */
    public final Object mo1509A() {
        C0357g c0357g = this.f4432J;
        if (!c0357g.f4335a0.m14799f(64)) {
            return null;
        }
        mo1543f1();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (d16 d16Var = (ir9) c0357g.f4335a0.f46678f; d16Var != null; d16Var = d16Var.f34841e) {
            if ((d16Var.f34839c & 64) != 0) {
                ?? M21992f = d16Var;
                ?? x66Var = 0;
                while (M21992f != 0) {
                    if (M21992f instanceof e47) {
                        ref$ObjectRef.f47718a = ((e47) M21992f).mo4157d(c0357g.f4327T, ref$ObjectRef.f47718a);
                    } else if ((M21992f.f34839c & 64) != 0 && (M21992f instanceof fa2)) {
                        d16 d16Var2 = ((fa2) M21992f).f38701K;
                        int i = 0;
                        M21992f = M21992f;
                        x66Var = x66Var;
                        while (d16Var2 != null) {
                            if ((d16Var2.f34839c & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    x66Var = x66Var;
                                    M21992f = d16Var2;
                                } else {
                                    if (x66Var == 0) {
                                        x66Var = new x66(new d16[16]);
                                    }
                                    if (M21992f != 0) {
                                        x66Var.m24305c(M21992f);
                                        M21992f = 0;
                                    }
                                    x66Var.m24305c(d16Var2);
                                }
                            }
                            d16Var2 = d16Var2.f34842f;
                            M21992f = M21992f;
                            x66Var = x66Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M21992f = te1.m21992f(x66Var);
                }
            }
        }
        return ref$ObjectRef.f47718a;
    }

    /* JADX INFO: renamed from: B1 */
    public final e28 m1660B1() {
        if (mo1543f1().f34836I) {
            aq4 aq4VarM4054e0 = bq1.m4054e0(this);
            m66 m66Var = this.f4445W;
            if (m66Var == null) {
                m66Var = new m66();
                this.f4445W = m66Var;
            }
            long jM1674W0 = m1674W0(m1681e1());
            int i = (int) (jM1674W0 >> 32);
            m66Var.f50662a = -Float.intBitsToFloat(i);
            int i2 = (int) (jM1674W0 & 4294967295L);
            m66Var.f50663b = -Float.intBitsToFloat(i2);
            m66Var.f50664c = Float.intBitsToFloat(i) + mo1642b0();
            m66Var.f50665d = Float.intBitsToFloat(i2) + mo1640a0();
            while (this != aq4VarM4054e0) {
                this.m1702w1(m66Var, false, true);
                if (!m66Var.m16656b()) {
                    this = this.f4434L;
                    this.getClass();
                }
            }
            return new e28(m66Var.f50662a, m66Var.f50663b, m66Var.f50664c, m66Var.f50665d);
        }
        return e28.f36619e;
    }

    /* JADX INFO: renamed from: C1 */
    public final void m1661C1(AbstractC0362l abstractC0362l, float[] fArr) {
        float[] fArrM1806a;
        if (fa4.m11650l(abstractC0362l, this)) {
            return;
        }
        AbstractC0362l abstractC0362l2 = this.f4434L;
        abstractC0362l2.getClass();
        abstractC0362l2.m1661C1(abstractC0362l, fArr);
        if (!f84.m11593b(this.f4443U, 0L)) {
            float[] fArr2 = f4429k0;
            ts5.m22289d(fArr2);
            long j = this.f4443U;
            ts5.m22293h(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            ts5.m22292g(fArr, fArr2);
        }
        b17 b17Var = this.f4455g0;
        if (b17Var == null || (fArrM1806a = ((C0403o) b17Var).m1806a()) == null) {
            return;
        }
        ts5.m22292g(fArr, fArrM1806a);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: D */
    public final aq4 mo1662D() {
        boolean z = mo1543f1().f34836I;
        C0357g c0357g = this.f4432J;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C0357g c0357gM1610w = c0357g; c0357gM1610w != null; c0357gM1610w = c0357gM1610w.m1610w()) {
                sb.append("\n|");
                sb.append(c0357gM1610w);
                sb.append(" isAttached=");
                sb.append(c0357gM1610w.m1569L());
                sb.append(" modifier=");
                sb.append(c0357gM1610w.f4345f0);
                sb.append(" tail=");
                sb.append(mo1543f1());
            }
            i54.m13663b(sb.toString());
        }
        m1693o1();
        return ((AbstractC0362l) c0357g.f4335a0.f46677e).f4434L;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m1663D1(AbstractC0362l abstractC0362l, float[] fArr) {
        while (!this.equals(abstractC0362l)) {
            b17 b17Var = this.f4455g0;
            if (b17Var != null) {
                ts5.m22292g(fArr, ((C0403o) b17Var).m1807b());
            }
            long j = this.f4443U;
            if (!f84.m11593b(j, 0L)) {
                float[] fArr2 = f4429k0;
                ts5.m22289d(fArr2);
                ts5.m22293h(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                ts5.m22292g(fArr, fArr2);
            }
            this = this.f4434L;
            this.getClass();
        }
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: E0 */
    public final AbstractC0359i mo1618E0() {
        return this.f4433K;
    }

    /* JADX INFO: renamed from: E1 */
    public final void m1664E1(vi3 vi3Var, boolean z) {
        Owner owner;
        x66 x66Var;
        Reference referencePoll;
        if (vi3Var != null && this.f4456h0 != null) {
            i54.m13662a("layerBlock can't be provided when explicitLayer is provided");
        }
        C0357g c0357g = this.f4432J;
        boolean z2 = (!z && this.f4437O == vi3Var && fa4.m11650l(this.f4438P, c0357g.f4327T) && this.f4439Q == c0357g.f4328U) ? false : true;
        this.f4438P = c0357g.f4327T;
        this.f4439Q = c0357g.f4328U;
        boolean zM1569L = c0357g.m1569L();
        ui3 ui3Var = this.f4453e0;
        if (zM1569L && vi3Var != null) {
            this.f4437O = vi3Var;
            if (this.f4455g0 != null) {
                if (z2) {
                    m1665F1(true);
                    return;
                }
                return;
            }
            Owner ownerM19457a = pq4.m19457a(c0357g);
            zi3 zi3Var = this.f4452d0;
            if (zi3Var == null) {
                NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this), this);
                this.f4452d0 = nodeCoordinator$drawBlock$1;
                zi3Var = nodeCoordinator$drawBlock$1;
            }
            b17 b17VarM1746j = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).m1746j(zi3Var, ui3Var, null);
            C0403o c0403o = (C0403o) b17VarM1746j;
            c0403o.m1810e(this.f49303c);
            c0403o.m1809d(this.f4443U);
            this.f4455g0 = b17VarM1746j;
            m1665F1(true);
            c0357g.f4343e0 = true;
            ((NodeCoordinator$invalidateParentLayer$1) ui3Var).mo0a();
            return;
        }
        this.f4437O = null;
        b17 b17Var = this.f4455g0;
        if (b17Var != null) {
            C0403o c0403o2 = (C0403o) b17Var;
            if (!AbstractC3695vr.m23514y(c0403o2.m1807b())) {
                c0357g.m1575R(this);
            }
            c0403o2.f4846d = null;
            c0403o2.f4847e = null;
            c0403o2.f4849g = true;
            c0403o2.m1811f(false);
            qp3 qp3Var = c0403o2.f4844b;
            if (qp3Var != null) {
                qp3Var.mo14485a(c0403o2.f4843a);
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = c0403o2.f4845c;
                qfa qfaVar = viewTreeObserverOnGlobalLayoutListenerC0391c.f4651I0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) qfaVar.f57706b;
                    x66Var = (x66) qfaVar.f57705a;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        x66Var.m24313k(referencePoll);
                    }
                } while (referencePoll != null);
                x66Var.m24305c(new WeakReference(c0403o2, (ReferenceQueue) qfaVar.f57706b));
                viewTreeObserverOnGlobalLayoutListenerC0391c.f4674U.m13094k(c0403o2);
            }
            this.f4455g0 = null;
            c0357g.f4343e0 = true;
            ((NodeCoordinator$invalidateParentLayer$1) ui3Var).mo0a();
            if (mo1543f1().f34836I && c0357g.m1570M() && (owner = c0357g.f4316I) != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1728D(c0357g);
            }
        }
        this.f4454f0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x032b  */
    /* JADX INFO: renamed from: F1 */
    public final void m1665F1(boolean z) {
        char c;
        long j;
        boolean z2;
        Owner owner;
        ui3 ui3Var;
        int i;
        RenderEffect renderEffectCreateOffsetEffect;
        ui3 ui3Var2;
        if (this.f4456h0 != null) {
            return;
        }
        b17 b17Var = this.f4455g0;
        final vi3 vi3Var = this.f4437O;
        if (b17Var == null) {
            if (vi3Var == null) {
                return;
            }
            i54.m13663b("null layer with a non-null layerBlock");
            return;
        }
        if (vi3Var == null) {
            throw AbstractC3393o1.m17745t("updateLayerParameters requires a non-null layerBlock");
        }
        q98 q98Var = f4427i0;
        q98Var.m19812b();
        C0357g c0357g = this.f4432J;
        q98Var.f57464O = c0357g.f4327T;
        q98Var.f57465P = c0357g.f4328U;
        q98Var.f57462M = omd.m18152h0(this.f49303c);
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getSnapshotObserver().f4460a.m11067c(this, NodeCoordinator$Companion$onCommitAffectingLayerParams$1.f4256b, new ui3() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                q98 q98Var2 = AbstractC0362l.f4427i0;
                vi3Var.invoke(q98Var2);
                AbstractC0362l abstractC0362l = this;
                boolean zM11650l = fa4.m11650l(abstractC0362l.f4447Y, q98Var2.f57459J);
                boolean z3 = abstractC0362l.f4448Z;
                boolean z4 = q98Var2.f57460K;
                boolean z5 = z3 != z4;
                if (!zM11650l || z5) {
                    abstractC0362l.f4447Y = q98Var2.f57459J;
                    abstractC0362l.f4448Z = z4;
                    if (abstractC0362l.f4449a0 && (z5 || (z4 && !zM11650l))) {
                        abstractC0362l.f4432J.m1567J();
                    }
                }
                abstractC0362l.f4449a0 = true;
                q98Var2.f57469T = q98Var2.f57459J.mo12726b(q98Var2.f57462M, q98Var2.f57465P, q98Var2.f57464O);
                return xfa.f68157a;
            }
        });
        xp4 xp4Var = this.f4446X;
        if (xp4Var == null) {
            xp4Var = new xp4();
            this.f4446X = xp4Var;
        }
        xp4 xp4Var2 = f4428j0;
        xp4Var2.getClass();
        xp4Var2.f68484a = xp4Var.f68484a;
        xp4Var2.f68485b = xp4Var.f68485b;
        xp4Var2.f68486c = xp4Var.f68486c;
        xp4Var2.f68487d = xp4Var.f68487d;
        xp4Var2.f68488e = xp4Var.f68488e;
        xp4Var2.f68489f = xp4Var.f68489f;
        xp4Var2.f68490g = xp4Var.f68490g;
        xp4Var2.f68491h = xp4Var.f68491h;
        xp4Var2.f68492i = xp4Var.f68492i;
        xp4Var.f68484a = q98Var.f57471b;
        xp4Var.f68485b = q98Var.f57472c;
        xp4Var.f68486c = q98Var.f57474e;
        xp4Var.f68487d = q98Var.f57475f;
        xp4Var.f68488e = q98Var.f57479j;
        xp4Var.f68489f = q98Var.f57480k;
        xp4Var.f68490g = q98Var.f57481l;
        xp4Var.f68491h = q98Var.f57457H;
        xp4Var.f68492i = q98Var.f57458I;
        C0403o c0403o = (C0403o) b17Var;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = c0403o.f4845c;
        int i2 = q98Var.f57470a | c0403o.f4835I;
        c0403o.f4854l = q98Var.f57465P;
        fb2 fb2Var = q98Var.f57464O;
        c0403o.f4853k = fb2Var;
        float f = 0.0f;
        if ((1048576 & i2) != 0) {
            C0312a c0312a = c0403o.f4843a;
            q98Var.f57463N.getClass();
            int iMo916w0 = fb2Var.mo916w0(0.0f);
            q98Var.f57463N.getClass();
            int iMo916w1 = fb2Var.mo916w0(0.0f);
            q98Var.f57463N.getClass();
            int iMo916w2 = fb2Var.mo916w0(0.0f);
            q98Var.f57463N.getClass();
            int iMo916w3 = fb2Var.mo916w0(0.0f);
            c0312a.f3998v = iMo916w0;
            c0312a.f3999w = iMo916w1;
            c0312a.f4000x = iMo916w2;
            c0312a.f4001y = iMo916w3;
            sp3 sp3Var = c0312a.f3977a;
            if (iMo916w0 < 0 || iMo916w1 < 0 || iMo916w2 < 0 || iMo916w3 < 0) {
                StringBuilder sbM22994q = ux5.m22994q(iMo916w0, iMo916w1, "Outsets cannot be negative! Left: ", ", Top: ", ", Right: ");
                sbM22994q.append(iMo916w2);
                sbM22994q.append(", Bottom: ");
                sbM22994q.append(iMo916w3);
                h54.m13056a(sbM22994q.toString());
            }
            int i3 = sp3Var.f61178x;
            if (iMo916w0 != i3 || iMo916w1 != sp3Var.f61179y || iMo916w2 != sp3Var.f61180z || iMo916w3 != sp3Var.f61148A) {
                boolean z3 = (iMo916w0 == i3 && iMo916w1 == sp3Var.f61179y) ? false : true;
                sp3Var.f61178x = iMo916w0;
                sp3Var.f61179y = iMo916w1;
                sp3Var.f61180z = iMo916w2;
                sp3Var.f61148A = iMo916w3;
                sp3Var.m21530e();
                if (z3) {
                    sp3Var.m21529d();
                }
            }
            c0403o.m1808c();
        } else {
            f = 0.0f;
        }
        int i4 = i2 & 4096;
        if (i4 != 0) {
            c0403o.f4836J = q98Var.f57458I;
        }
        if ((i2 & 1) != 0) {
            C0312a c0312a2 = c0403o.f4843a;
            float f2 = q98Var.f57471b;
            sp3 sp3Var2 = c0312a2.f3977a;
            if (sp3Var2.f61166l != f2) {
                sp3Var2.f61166l = f2;
                sp3Var2.f61157c.setScaleX(f2);
            }
        }
        if ((i2 & 2) != 0) {
            C0312a c0312a3 = c0403o.f4843a;
            float f3 = q98Var.f57472c;
            sp3 sp3Var3 = c0312a3.f3977a;
            if (sp3Var3.f61167m != f3) {
                sp3Var3.f61167m = f3;
                sp3Var3.f61157c.setScaleY(f3);
            }
        }
        if ((i2 & 4) != 0) {
            c0403o.f4843a.m1430g(q98Var.f57473d);
        }
        if ((i2 & 8) != 0) {
            C0312a c0312a4 = c0403o.f4843a;
            float f4 = q98Var.f57474e;
            sp3 sp3Var4 = c0312a4.f3977a;
            if (sp3Var4.f61168n != f4) {
                sp3Var4.f61168n = f4;
                sp3Var4.f61157c.setTranslationX(f4);
            }
        }
        if ((i2 & 16) != 0) {
            C0312a c0312a5 = c0403o.f4843a;
            float f5 = q98Var.f57475f;
            sp3 sp3Var5 = c0312a5.f3977a;
            if (sp3Var5.f61169o != f5) {
                sp3Var5.f61169o = f5;
                sp3Var5.f61157c.setTranslationY(f5);
            }
        }
        if ((i2 & 32) != 0) {
            C0312a c0312a6 = c0403o.f4843a;
            float f6 = q98Var.f57476g;
            sp3 sp3Var6 = c0312a6.f3977a;
            if (sp3Var6.f61170p != f6) {
                sp3Var6.f61170p = f6;
                sp3Var6.f61157c.setElevation(f6);
                c0312a6.f3983g = true;
                c0312a6.m1424a();
            }
            if (q98Var.f57476g > f && !c0403o.f4841O && (ui3Var2 = c0403o.f4847e) != null) {
                ui3Var2.mo0a();
            }
        }
        if ((i2 & 64) != 0) {
            C0312a c0312a7 = c0403o.f4843a;
            long j2 = q98Var.f57477h;
            sp3 sp3Var7 = c0312a7.f3977a;
            if (!aa1.m199c(j2, sp3Var7.f61171q)) {
                sp3Var7.f61171q = j2;
                sp3Var7.f61157c.setAmbientShadowColor(d32.m10042h0(j2));
            }
        }
        if ((i2 & 128) != 0) {
            C0312a c0312a8 = c0403o.f4843a;
            long j3 = q98Var.f57478i;
            sp3 sp3Var8 = c0312a8.f3977a;
            if (!aa1.m199c(j3, sp3Var8.f61172r)) {
                sp3Var8.f61172r = j3;
                sp3Var8.f61157c.setSpotShadowColor(d32.m10042h0(j3));
            }
        }
        if ((i2 & 1024) != 0) {
            C0312a c0312a9 = c0403o.f4843a;
            float f7 = q98Var.f57481l;
            sp3 sp3Var9 = c0312a9.f3977a;
            if (sp3Var9.f61175u != f7) {
                sp3Var9.f61175u = f7;
                sp3Var9.f61157c.setRotationZ(f7);
            }
        }
        if ((i2 & 256) != 0) {
            C0312a c0312a10 = c0403o.f4843a;
            float f8 = q98Var.f57479j;
            sp3 sp3Var10 = c0312a10.f3977a;
            if (sp3Var10.f61173s != f8) {
                sp3Var10.f61173s = f8;
                sp3Var10.f61157c.setRotationX(f8);
            }
        }
        if ((i2 & 512) != 0) {
            C0312a c0312a11 = c0403o.f4843a;
            float f9 = q98Var.f57480k;
            sp3 sp3Var11 = c0312a11.f3977a;
            if (sp3Var11.f61174t != f9) {
                sp3Var11.f61174t = f9;
                sp3Var11.f61157c.setRotationY(f9);
            }
        }
        if ((i2 & 2048) != 0) {
            C0312a c0312a12 = c0403o.f4843a;
            float f10 = q98Var.f57457H;
            sp3 sp3Var12 = c0312a12.f3977a;
            if (sp3Var12.f61176v != f10) {
                sp3Var12.f61176v = f10;
                sp3Var12.f61157c.setCameraDistance(f10);
            }
        }
        if (i4 != 0) {
            j = 4294967295L;
            boolean zM15025a = k9a.m15025a(c0403o.f4836J, k9a.f46915b);
            C0312a c0312a13 = c0403o.f4843a;
            if (zM15025a) {
                c0312a13.m1432i(9205357640488583168L);
                c = ' ';
            } else {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0403o.f4836J >> 32)) * ((int) (c0403o.f4848f >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0403o.f4836J & 4294967295L)) * ((int) (c0403o.f4848f & 4294967295L));
                long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                int iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2);
                c = ' ';
                c0312a13.m1432i((((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32));
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if ((i2 & 16384) != 0) {
            C0312a c0312a14 = c0403o.f4843a;
            boolean z4 = q98Var.f57460K;
            if (c0312a14.f3975A != z4) {
                c0312a14.f3975A = z4;
                c0312a14.f3983g = true;
                c0312a14.m1424a();
            }
        }
        if ((131072 & i2) != 0) {
            C0312a c0312a15 = c0403o.f4843a;
            yd0 yd0Var = q98Var.f57466Q;
            sp3 sp3Var13 = c0312a15.f3977a;
            if (fa4.m11650l(sp3Var13.f61153F, yd0Var)) {
                c = c;
            } else {
                sp3Var13.f61153F = yd0Var;
                if (Build.VERSION.SDK_INT >= 31) {
                    RenderNode renderNode = sp3Var13.f61157c;
                    if (yd0Var != null) {
                        renderEffectCreateOffsetEffect = yd0Var.f69672a;
                        if (renderEffectCreateOffsetEffect == null) {
                            float f11 = yd0Var.f69673b;
                            float f12 = yd0Var.f69674c;
                            renderEffectCreateOffsetEffect = (f11 == f && f12 == f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f11, f12, x74.m24343J(yd0Var.f69675d));
                            yd0Var.f69672a = renderEffectCreateOffsetEffect;
                        }
                    } else {
                        renderEffectCreateOffsetEffect = null;
                    }
                    renderNode.setRenderEffect(renderEffectCreateOffsetEffect);
                } else {
                    c = c;
                }
            }
        } else {
            c = c;
        }
        if ((262144 & i2) != 0) {
            C0312a c0312a16 = c0403o.f4843a;
            fa1 fa1Var = q98Var.f57467R;
            sp3 sp3Var14 = c0312a16.f3977a;
            if (!fa4.m11650l(sp3Var14.f61164j, fa1Var)) {
                sp3Var14.f61164j = fa1Var;
                Paint paint = sp3Var14.f61159e;
                if (paint == null) {
                    paint = new Paint();
                    sp3Var14.f61159e = paint;
                }
                paint.setColorFilter(fa1Var != null ? fa1Var.f38699a : null);
                sp3Var14.m21528c();
            }
        }
        if ((524288 & i2) != 0) {
            C0312a c0312a17 = c0403o.f4843a;
            int i5 = q98Var.f57468S;
            sp3 sp3Var15 = c0312a17.f3977a;
            if (sp3Var15.f61163i != i5) {
                sp3Var15.f61163i = i5;
                Paint paint2 = sp3Var15.f61159e;
                if (paint2 == null) {
                    paint2 = new Paint();
                    sp3Var15.f61159e = paint2;
                }
                paint2.setBlendMode(pb1.m19030R(i5));
                sp3Var15.m21528c();
            }
        }
        if ((32768 & i2) != 0) {
            C0312a c0312a18 = c0403o.f4843a;
            int i6 = q98Var.f57461L;
            if (i6 == 0) {
                i = 0;
            } else if (i6 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i6 != 2) {
                    C3386nv.m17633t("Not supported composition strategy");
                    return;
                }
            }
            c0312a18.m1431h(i);
        }
        if ((i2 & 7963) != 0) {
            c0403o.f4838L = true;
            c0403o.f4839M = true;
        }
        if (fa4.m11650l(c0403o.f4837K, q98Var.f57469T)) {
            z2 = false;
        } else {
            pk9 pk9Var = q98Var.f57469T;
            c0403o.f4837K = pk9Var;
            if (pk9Var != null) {
                C0312a c0312a19 = c0403o.f4843a;
                if (pk9Var instanceof b07) {
                    e28 e28Var = ((b07) pk9Var).f7728A;
                    float f13 = e28Var.f36620a;
                    float f14 = e28Var.f36621b;
                    c0312a19.m1434k((((long) Float.floatToRawIntBits(f13)) << c) | (((long) Float.floatToRawIntBits(f14)) & j), (((long) Float.floatToRawIntBits(e28Var.f36622c - f13)) << c) | (((long) Float.floatToRawIntBits(e28Var.f36623d - f14)) & j), 0.0f);
                } else if (pk9Var instanceof a07) {
                    C3500qj c3500qj = ((a07) pk9Var).f34A;
                    c0312a19.f3987k = null;
                    c0312a19.f3985i = 9205357640488583168L;
                    c0312a19.f3984h = 0L;
                    c0312a19.f3986j = f;
                    c0312a19.f3983g = true;
                    c0312a19.f3990n = false;
                    c0312a19.f3988l = c3500qj;
                    c0312a19.m1424a();
                } else {
                    if (!(pk9Var instanceof c07)) {
                        gm5.m12750e();
                        return;
                    }
                    c07 c07Var = (c07) pk9Var;
                    C3500qj c3500qj2 = c07Var.f9273B;
                    if (c3500qj2 != null) {
                        c0312a19.f3987k = null;
                        c0312a19.f3985i = 9205357640488583168L;
                        c0312a19.f3984h = 0L;
                        c0312a19.f3986j = 0.0f;
                        c0312a19.f3983g = true;
                        c0312a19.f3990n = false;
                        c0312a19.f3988l = c3500qj2;
                        c0312a19.m1424a();
                    } else {
                        mi8 mi8Var = c07Var.f9272A;
                        c0312a19.m1434k((((long) Float.floatToRawIntBits(mi8Var.f51360a)) << c) | (((long) Float.floatToRawIntBits(mi8Var.f51361b)) & j), (((long) Float.floatToRawIntBits(mi8Var.m16846b())) << c) | (((long) Float.floatToRawIntBits(mi8Var.m16845a())) & j), Float.intBitsToFloat((int) (mi8Var.f51367h >> c)));
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((pk9Var instanceof a07) || ((pk9Var instanceof c07) && !omd.m18128R(((c07) pk9Var).f9272A))) && (ui3Var = c0403o.f4847e) != null)) {
                    ui3Var.mo0a();
                }
            }
            z2 = true;
        }
        c0403o.f4835I = q98Var.f57470a;
        if (i2 != 0 || z2) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0391c.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0391c, viewTreeObserverOnGlobalLayoutListenerC0391c);
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC0391c.m1724p()) {
                viewTreeObserverOnGlobalLayoutListenerC0391c.m1744T(0.0f);
            }
        }
        boolean z5 = this.f4436N;
        this.f4436N = q98Var.f57460K;
        this.f4440R = q98Var.f57473d;
        boolean z6 = xp4Var2.f68484a == xp4Var.f68484a && xp4Var2.f68485b == xp4Var.f68485b && xp4Var2.f68486c == xp4Var.f68486c && xp4Var2.f68487d == xp4Var.f68487d && xp4Var2.f68488e == xp4Var.f68488e && xp4Var2.f68489f == xp4Var.f68489f && xp4Var2.f68490g == xp4Var.f68490g && xp4Var2.f68491h == xp4Var.f68491h && k9a.m15025a(xp4Var2.f68492i, xp4Var.f68492i);
        if (z && ((!z6 || z5 != this.f4436N) && (owner = c0357g.f4316I) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1728D(c0357g);
        }
        if (z6) {
            return;
        }
        c0357g.m1575R(this);
        if (c0357g.f4355k0 > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2 = (ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g);
            fs6 fs6Var = viewTreeObserverOnGlobalLayoutListenerC0391c2.f4709n0.f39621e;
            fs6Var.getClass();
            if (c0357g.f4355k0 > 0) {
                ((x66) fs6Var.f39590b).m24305c(c0357g);
                c0357g.f4353j0 = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC0391c2.m1737M(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017a  */
    /* JADX INFO: renamed from: G1 */
    public final boolean m1666G1(long j) {
        boolean z;
        boolean z2;
        boolean zM10024V;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        b17 b17Var = this.f4455g0;
        if (b17Var == null || !this.f4436N) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C0312a c0312a = ((C0403o) b17Var).f4843a;
        if (c0312a.f3975A) {
            pk9 pk9VarM1427d = c0312a.m1427d();
            if (pk9VarM1427d instanceof b07) {
                e28 e28Var = ((b07) pk9VarM1427d).f7728A;
                if (e28Var.f36620a > fIntBitsToFloat || fIntBitsToFloat >= e28Var.f36622c || e28Var.f36621b > fIntBitsToFloat2 || fIntBitsToFloat2 >= e28Var.f36623d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (pk9VarM1427d instanceof c07) {
                mi8 mi8Var = ((c07) pk9VarM1427d).f9272A;
                float f = mi8Var.f51360a;
                long j2 = mi8Var.f51365f;
                long j3 = mi8Var.f51367h;
                long j4 = mi8Var.f51366g;
                float f2 = mi8Var.f51363d;
                float f3 = mi8Var.f51361b;
                z = false;
                float f4 = mi8Var.f51362c;
                z2 = true;
                long j5 = mi8Var.f51364e;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= mi8Var.m16846b()) {
                        int i3 = (int) (j3 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= mi8Var.m16846b()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= mi8Var.m16845a()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= mi8Var.m16845a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        zM10024V = d32.m10024V(fIntBitsToFloat, fIntBitsToFloat2, mi8Var.f51364e, fIntBitsToFloat3, fIntBitsToFloat4);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        zM10024V = d32.m10024V(fIntBitsToFloat, fIntBitsToFloat2, mi8Var.f51367h, fIntBitsToFloat10, fIntBitsToFloat9);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) {
                                        zM10024V = (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : d32.m10024V(fIntBitsToFloat, fIntBitsToFloat2, mi8Var.f51366g, fIntBitsToFloat7, fIntBitsToFloat8);
                                    } else {
                                        zM10024V = d32.m10024V(fIntBitsToFloat, fIntBitsToFloat2, mi8Var.f51365f, fIntBitsToFloat5, fIntBitsToFloat6);
                                    }
                                } else {
                                    C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
                                    C3500qj.m19986c(c3500qjM22757a, mi8Var);
                                    zM10024V = d32.m10023U(fIntBitsToFloat, fIntBitsToFloat2, c3500qjM22757a);
                                }
                            } else {
                                C3500qj c3500qjM22757a2 = AbstractC3650uj.m22757a();
                                C3500qj.m19986c(c3500qjM22757a2, mi8Var);
                                zM10024V = d32.m10023U(fIntBitsToFloat, fIntBitsToFloat2, c3500qjM22757a2);
                            }
                        } else {
                            C3500qj c3500qjM22757a3 = AbstractC3650uj.m22757a();
                            C3500qj.m19986c(c3500qjM22757a3, mi8Var);
                            zM10024V = d32.m10023U(fIntBitsToFloat, fIntBitsToFloat2, c3500qjM22757a3);
                        }
                    } else {
                        C3500qj c3500qjM22757a4 = AbstractC3650uj.m22757a();
                        C3500qj.m19986c(c3500qjM22757a4, mi8Var);
                        zM10024V = d32.m10023U(fIntBitsToFloat, fIntBitsToFloat2, c3500qjM22757a4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(pk9VarM1427d instanceof a07)) {
                    gm5.m12750e();
                    return false;
                }
                zM10024V = d32.m10023U(fIntBitsToFloat, fIntBitsToFloat2, ((a07) pk9VarM1427d).f34A);
            }
            zM10024V = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM10024V ? z2 : z;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: H0 */
    public final aq4 mo1620H0() {
        return this;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: I0 */
    public final boolean mo1621I0() {
        return this.f4441S != null;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: J0 */
    public final C0357g mo1622J0() {
        return this.f4432J;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: K */
    public final long mo1667K(aq4 aq4Var, long j) {
        return mo1669P(aq4Var, j);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: L */
    public final long mo1668L(long j) {
        if (!mo1543f1().f34836I) {
            i54.m13663b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo1669P(bq1.m4054e0(this), ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this.f4432J)).m1738N(j));
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: N0 */
    public final it5 mo1624N0() {
        it5 it5Var = this.f4441S;
        if (it5Var != null) {
            return it5Var;
        }
        C3386nv.m17633t("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: O0 */
    public final AbstractC0359i mo1625O0() {
        return this.f4434L;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: P */
    public final long mo1669P(aq4 aq4Var, long j) {
        if (aq4Var instanceof zk5) {
            zk5 zk5Var = (zk5) aq4Var;
            zk5Var.f71680a.f69928J.m1693o1();
            return zk5Var.mo1669P(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC0362l abstractC0362lM1659A1 = m1659A1(aq4Var);
        abstractC0362lM1659A1.m1693o1();
        AbstractC0362l abstractC0362lM1678b1 = m1678b1(abstractC0362lM1659A1);
        while (abstractC0362lM1659A1 != abstractC0362lM1678b1) {
            b17 b17Var = abstractC0362lM1659A1.f4455g0;
            if (b17Var != null) {
                C0403o c0403o = (C0403o) b17Var;
                float[] fArrM1807b = c0403o.m1807b();
                if (!c0403o.f4840N) {
                    j = ts5.m22287b(fArrM1807b, j);
                }
            }
            j = pvc.m19493A(j, abstractC0362lM1659A1.f4443U);
            abstractC0362lM1659A1 = abstractC0362lM1659A1.f4434L;
            abstractC0362lM1659A1.getClass();
        }
        return m1673V0(abstractC0362lM1678b1, j);
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: P0 */
    public final long mo1626P0() {
        return this.f4443U;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: Q */
    public final e28 mo1670Q(aq4 aq4Var, boolean z) {
        if (!mo1543f1().f34836I) {
            i54.m13663b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!aq4Var.mo1691n()) {
            i54.m13663b("LayoutCoordinates " + aq4Var + " is not attached!");
        }
        AbstractC0362l abstractC0362lM1659A1 = m1659A1(aq4Var);
        abstractC0362lM1659A1.m1693o1();
        AbstractC0362l abstractC0362lM1678b1 = m1678b1(abstractC0362lM1659A1);
        m66 m66Var = this.f4445W;
        if (m66Var == null) {
            m66Var = new m66();
            this.f4445W = m66Var;
        }
        m66Var.f50662a = 0.0f;
        m66Var.f50663b = 0.0f;
        m66Var.f50664c = (int) (aq4Var.mo1687j() >> 32);
        m66Var.f50665d = (int) (aq4Var.mo1687j() & 4294967295L);
        while (abstractC0362lM1659A1 != abstractC0362lM1678b1) {
            abstractC0362lM1659A1.m1702w1(m66Var, z, false);
            if (m66Var.m16656b()) {
                return e28.f36619e;
            }
            abstractC0362lM1659A1 = abstractC0362lM1659A1.f4434L;
            abstractC0362lM1659A1.getClass();
        }
        m1672U0(abstractC0362lM1678b1, m66Var, z);
        return new e28(m66Var.f50662a, m66Var.f50663b, m66Var.f50664c, m66Var.f50665d);
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: R */
    public final long mo1671R(long j) {
        if (!mo1543f1().f34836I) {
            i54.m13663b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m1693o1();
        while (this != null) {
            C0357g c0357g = this.f4432J;
            if (this == ((AbstractC0362l) c0357g.f4335a0.f46677e) && !c0357g.f4338c) {
                long jM1875b = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getRectManager().m1875b(c0357g);
                if (!f84.m11593b(jM1875b, 9223372034707292159L)) {
                    return pvc.m19493A(j, jM1875b);
                }
            }
            b17 b17Var = this.f4455g0;
            if (b17Var != null) {
                C0403o c0403o = (C0403o) b17Var;
                float[] fArrM1807b = c0403o.m1807b();
                if (!c0403o.f4840N) {
                    j = ts5.m22287b(fArrM1807b, j);
                }
            }
            j = pvc.m19493A(j, this.f4443U);
            this = this.f4434L;
        }
        return j;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: T0 */
    public final void mo1629T0() {
        C0312a c0312a = this.f4456h0;
        long j = this.f4443U;
        if (c0312a != null) {
            mo1545j0(j, this.f4444V, c0312a);
        } else {
            mo1544i0(j, this.f4444V, this.f4437O);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m1672U0(AbstractC0362l abstractC0362l, m66 m66Var, boolean z) {
        if (abstractC0362l == this) {
            return;
        }
        AbstractC0362l abstractC0362l2 = this.f4434L;
        if (abstractC0362l2 != null) {
            abstractC0362l2.m1672U0(abstractC0362l, m66Var, z);
        }
        long j = this.f4443U;
        float f = (int) (j >> 32);
        m66Var.f50662a -= f;
        m66Var.f50664c -= f;
        float f2 = (int) (j & 4294967295L);
        m66Var.f50663b -= f2;
        m66Var.f50665d -= f2;
        b17 b17Var = this.f4455g0;
        if (b17Var != null) {
            C0403o c0403o = (C0403o) b17Var;
            float[] fArrM1806a = c0403o.m1806a();
            if (!c0403o.f4840N) {
                if (fArrM1806a == null) {
                    m66Var.f50662a = 0.0f;
                    m66Var.f50663b = 0.0f;
                    m66Var.f50664c = 0.0f;
                    m66Var.f50665d = 0.0f;
                } else {
                    ts5.m22288c(fArrM1806a, m66Var);
                }
            }
            if (this.f4436N && z) {
                long j2 = this.f49303c;
                m66Var.m16655a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final long m1673V0(AbstractC0362l abstractC0362l, long j) {
        if (abstractC0362l == this) {
            return j;
        }
        AbstractC0362l abstractC0362l2 = this.f4434L;
        return (abstractC0362l2 == null || fa4.m11650l(abstractC0362l, abstractC0362l2)) ? m1679c1(j) : m1679c1(abstractC0362l2.m1673V0(abstractC0362l, j));
    }

    /* JADX INFO: renamed from: W0 */
    public final long m1674W0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - mo1642b0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - mo1640a0();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    /* JADX INFO: renamed from: X0 */
    public final float m1675X0(long j, long j2) {
        if (mo1642b0() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo1640a0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM1674W0 = m1674W0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM1674W0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM1674W0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo1642b0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo1640a0()))) & 4294967295L);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return gq6.m12823d(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m1676Y0(ym0 ym0Var, C0312a c0312a) {
        b17 b17Var = this.f4455g0;
        if (b17Var == null) {
            long j = this.f4443U;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            ym0Var.mo17023o(f, f2);
            m1677Z0(ym0Var, c0312a);
            ym0Var.mo17023o(-f, -f2);
            return;
        }
        C0403o c0403o = (C0403o) b17Var;
        an0 an0Var = c0403o.f4834H;
        c0403o.m1812g();
        c0403o.f4841O = c0403o.f4843a.f3977a.f61170p > 0.0f;
        C3309ls c3309ls = an0Var.f853b;
        c3309ls.m16497Q(ym0Var);
        c3309ls.f50065c = c0312a;
        lda.m16134t(an0Var, c0403o.f4843a);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m1677Z0(ym0 ym0Var, C0312a c0312a) {
        AbstractC0362l abstractC0362l;
        ym0 ym0Var2;
        C0312a c0312a2;
        d16 d16VarM1683g1 = m1683g1(4);
        if (d16VarM1683g1 == null) {
            mo1548u1(ym0Var, c0312a);
            return;
        }
        C0357g c0357g = this.f4432J;
        c0357g.getClass();
        C0358h sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getSharedDrawScope();
        long jM18152h0 = omd.m18152h0(this.f49303c);
        sharedDrawScope.getClass();
        x66 x66Var = null;
        while (d16VarM1683g1 != null) {
            if (d16VarM1683g1 instanceof ll2) {
                abstractC0362l = this;
                ym0Var2 = ym0Var;
                c0312a2 = c0312a;
                sharedDrawScope.m1615c(ym0Var2, jM18152h0, abstractC0362l, (ll2) d16VarM1683g1, c0312a2);
            } else {
                abstractC0362l = this;
                ym0Var2 = ym0Var;
                c0312a2 = c0312a;
                if ((d16VarM1683g1.f34839c & 4) != 0 && (d16VarM1683g1 instanceof fa2)) {
                    int i = 0;
                    for (d16 d16Var = ((fa2) d16VarM1683g1).f38701K; d16Var != null; d16Var = d16Var.f34842f) {
                        if ((d16Var.f34839c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                d16VarM1683g1 = d16Var;
                            } else {
                                if (x66Var == null) {
                                    x66Var = new x66(new d16[16]);
                                }
                                if (d16VarM1683g1 != null) {
                                    x66Var.m24305c(d16VarM1683g1);
                                    d16VarM1683g1 = null;
                                }
                                x66Var.m24305c(d16Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                ym0Var = ym0Var2;
                this = abstractC0362l;
                c0312a = c0312a2;
            }
            d16VarM1683g1 = te1.m21992f(x66Var);
            ym0Var = ym0Var2;
            this = abstractC0362l;
            c0312a = c0312a2;
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f4432J.f4327T.mo594a();
    }

    /* JADX INFO: renamed from: a1 */
    public abstract void mo1541a1();

    /* JADX INFO: renamed from: b1 */
    public final AbstractC0362l m1678b1(AbstractC0362l abstractC0362l) {
        C0357g c0357gM1610w = abstractC0362l.f4432J;
        C0357g c0357g = this.f4432J;
        if (c0357gM1610w == c0357g) {
            d16 d16VarMo1543f1 = abstractC0362l.mo1543f1();
            d16 d16VarMo1543f2 = mo1543f1();
            if (!d16VarMo1543f2.f34837a.f34836I) {
                i54.m13663b("visitLocalAncestors called on an unattached node");
            }
            for (d16 d16Var = d16VarMo1543f2.f34837a.f34841e; d16Var != null; d16Var = d16Var.f34841e) {
                if ((d16Var.f34839c & 2) != 0 && d16Var == d16VarMo1543f1) {
                    return abstractC0362l;
                }
            }
            return this;
        }
        while (c0357gM1610w.f4318K > c0357g.f4318K) {
            c0357gM1610w = c0357gM1610w.m1610w();
            c0357gM1610w.getClass();
        }
        C0357g c0357gM1610w2 = c0357g;
        while (c0357gM1610w2.f4318K > c0357gM1610w.f4318K) {
            c0357gM1610w2 = c0357gM1610w2.m1610w();
            c0357gM1610w2.getClass();
        }
        while (c0357gM1610w != c0357gM1610w2) {
            c0357gM1610w = c0357gM1610w.m1610w();
            c0357gM1610w2 = c0357gM1610w2.m1610w();
            if (c0357gM1610w == null || c0357gM1610w2 == null) {
                C3386nv.m17626m("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (c0357gM1610w2 != c0357g) {
            if (c0357gM1610w != abstractC0362l.f4432J) {
                return (C0353c) c0357gM1610w.f4335a0.f46676d;
            }
            return abstractC0362l;
        }
        return this;
    }

    /* JADX INFO: renamed from: c1 */
    public final long m1679c1(long j) {
        long j2 = this.f4443U;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        b17 b17Var = this.f4455g0;
        if (b17Var != null) {
            C0403o c0403o = (C0403o) b17Var;
            float[] fArrM1806a = c0403o.m1806a();
            if (fArrM1806a == null) {
                return 9187343241974906880L;
            }
            if (!c0403o.f4840N) {
                return ts5.m22287b(fArrM1806a, jFloatToRawIntBits);
            }
        }
        return jFloatToRawIntBits;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: d */
    public final long mo1680d(long j) {
        long jMo1671R = mo1671R(j);
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this.f4432J);
        viewTreeObserverOnGlobalLayoutListenerC0391c.m1733I();
        return ts5.m22287b(viewTreeObserverOnGlobalLayoutListenerC0391c.f4713r0, jMo1671R);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f4432J.f4327T.mo597d0();
    }

    /* JADX INFO: renamed from: d1 */
    public abstract yk5 mo1542d1();

    /* JADX INFO: renamed from: e1 */
    public final long m1681e1() {
        return this.f4438P.mo902D0(this.f4432J.f4329V.mo13458d());
    }

    /* JADX INFO: renamed from: f1 */
    public abstract d16 mo1543f1();

    @Override // p000.aq4
    /* JADX INFO: renamed from: g */
    public final void mo1682g(float[] fArr) {
        Owner ownerM19457a = pq4.m19457a(this.f4432J);
        AbstractC0362l abstractC0362lM1659A1 = m1659A1(bq1.m4054e0(this));
        m1663D1(abstractC0362lM1659A1, fArr);
        if (ownerM19457a instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).m1752v(fArr);
            return;
        }
        long jMo1695q = abstractC0362lM1659A1.mo1695q(0L);
        if ((9223372034707292159L & jMo1695q) != 9205357640488583168L) {
            ts5.m22293h(fArr, Float.intBitsToFloat((int) (jMo1695q >> 32)), Float.intBitsToFloat((int) (jMo1695q & 4294967295L)));
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final d16 m1683g1(int i) {
        boolean zM22199g = tl6.m22199g(i);
        d16 d16VarMo1543f1 = mo1543f1();
        if (!zM22199g && (d16VarMo1543f1 = d16VarMo1543f1.f34841e) == null) {
            return null;
        }
        for (d16 d16VarM1684h1 = m1684h1(zM22199g); d16VarM1684h1 != null && (d16VarM1684h1.f34840d & i) != 0; d16VarM1684h1 = d16VarM1684h1.f34842f) {
            if ((d16VarM1684h1.f34839c & i) != 0) {
                return d16VarM1684h1;
            }
            if (d16VarM1684h1 == d16VarMo1543f1) {
                return null;
            }
        }
        return null;
    }

    @Override // p000.aa4
    public final LayoutDirection getLayoutDirection() {
        return this.f4432J.f4328U;
    }

    /* JADX INFO: renamed from: h1 */
    public final d16 m1684h1(boolean z) {
        d16 d16VarMo1543f1;
        k40 k40Var = this.f4432J.f4335a0;
        if (((AbstractC0362l) k40Var.f46677e) == this) {
            return (d16) k40Var.f46679g;
        }
        AbstractC0362l abstractC0362l = this.f4434L;
        if (!z) {
            if (abstractC0362l != null) {
                return abstractC0362l.mo1543f1();
            }
            return null;
        }
        if (abstractC0362l == null || (d16VarMo1543f1 = abstractC0362l.mo1543f1()) == null) {
            return null;
        }
        return d16VarMo1543f1.f34842f;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: i */
    public final void mo1685i(aq4 aq4Var, float[] fArr) {
        AbstractC0362l abstractC0362lM1659A1 = m1659A1(aq4Var);
        abstractC0362lM1659A1.m1693o1();
        AbstractC0362l abstractC0362lM1678b1 = m1678b1(abstractC0362lM1659A1);
        ts5.m22289d(fArr);
        abstractC0362lM1659A1.m1663D1(abstractC0362lM1678b1, fArr);
        m1661C1(abstractC0362lM1678b1, fArr);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m1686i1(d16 d16Var, sl6 sl6Var, long j, cu3 cu3Var, int i, boolean z) {
        if (d16Var == null) {
            mo1546l1(sl6Var, j, cu3Var, i, z);
            return;
        }
        if (!sl6Var.mo18968c(d16Var)) {
            m1686i1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z);
            return;
        }
        int i2 = cu3Var.f34539c;
        h66 h66Var = cu3Var.f34537a;
        cu3Var.m9894f(i2 + 1, h66Var.f1294b);
        cu3Var.f34539c++;
        h66Var.m13090g(d16Var);
        cu3Var.f34538b.m24287a(AbstractC3695vr.m23494d(-1.0f, z, false));
        m1686i1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z);
        cu3Var.f34539c = i2;
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: j */
    public final long mo1687j() {
        return this.f49303c;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: j0 */
    public abstract void mo1545j0(long j, float f, C0312a c0312a);

    /* JADX INFO: renamed from: j1 */
    public final void m1688j1(d16 d16Var, sl6 sl6Var, long j, cu3 cu3Var, int i, boolean z, float f) {
        if (d16Var == null) {
            mo1546l1(sl6Var, j, cu3Var, i, z);
            return;
        }
        if (!sl6Var.mo18968c(d16Var)) {
            m1688j1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z, f);
            return;
        }
        int i2 = cu3Var.f34539c;
        h66 h66Var = cu3Var.f34537a;
        cu3Var.m9894f(i2 + 1, h66Var.f1294b);
        cu3Var.f34539c++;
        h66Var.m13090g(d16Var);
        cu3Var.f34538b.m24287a(AbstractC3695vr.m23494d(f, z, false));
        m1700t1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z, f, true);
        cu3Var.f34539c = i2;
    }

    /* JADX INFO: renamed from: k1 */
    public final void m1689k1(sl6 sl6Var, long j, cu3 cu3Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        d16 d16VarM1683g1 = m1683g1(sl6Var.mo18967b());
        if (!m1666G1(j)) {
            if (i == 1) {
                float fM1675X0 = m1675X0(j, m1681e1());
                if ((Float.floatToRawIntBits(fM1675X0) & Integer.MAX_VALUE) < 2139095040) {
                    if (cu3Var.f34539c != cu3Var.f34537a.f1294b - 1) {
                        if (omd.m18162r(cu3Var.m9893d(), AbstractC3695vr.m23494d(fM1675X0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m1688j1(d16VarM1683g1, sl6Var, j, cu3Var, i, false, fM1675X0);
                    return;
                }
                return;
            }
            return;
        }
        if (d16VarM1683g1 == null) {
            mo1546l1(sl6Var, j, cu3Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo1642b0() && fIntBitsToFloat2 < mo1640a0()) {
            m1686i1(d16VarM1683g1, sl6Var, j, cu3Var, i, z);
            return;
        }
        float fM1675X1 = i == 1 ? m1675X0(j, m1681e1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM1675X1) & Integer.MAX_VALUE) < 2139095040) {
            if (cu3Var.f34539c != cu3Var.f34537a.f1294b - 1) {
                z2 = z;
                if (omd.m18162r(cu3Var.m9893d(), AbstractC3695vr.m23494d(fM1675X1, z2, false)) > 0) {
                }
                m1700t1(d16VarM1683g1, sl6Var, j, cu3Var, i, z2, fM1675X1, z3);
            }
            z2 = z;
            z3 = true;
            m1700t1(d16VarM1683g1, sl6Var, j, cu3Var, i, z2, fM1675X1, z3);
        }
        z2 = z;
        z3 = false;
        m1700t1(d16VarM1683g1, sl6Var, j, cu3Var, i, z2, fM1675X1, z3);
    }

    /* JADX INFO: renamed from: l1 */
    public void mo1546l1(sl6 sl6Var, long j, cu3 cu3Var, int i, boolean z) {
        AbstractC0362l abstractC0362l = this.f4433K;
        if (abstractC0362l != null) {
            abstractC0362l.m1689k1(sl6Var, abstractC0362l.m1679c1(j), cu3Var, i, z);
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m1690m1() {
        b17 b17Var = this.f4455g0;
        if (b17Var != null) {
            ((C0403o) b17Var).m1808c();
            return;
        }
        AbstractC0362l abstractC0362l = this.f4434L;
        if (abstractC0362l != null) {
            abstractC0362l.m1690m1();
        }
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: n */
    public final boolean mo1691n() {
        return mo1543f1().f34836I;
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m1692n1() {
        if (this.f4455g0 != null && this.f4440R <= 0.0f) {
            return true;
        }
        AbstractC0362l abstractC0362l = this.f4434L;
        if (abstractC0362l != null) {
            return abstractC0362l.m1692n1();
        }
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    public final void m1693o1() {
        this.f4432J.f4337b0.m20105b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v7, types: [d16] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: p1 */
    public final void m1694p1() {
        d16 d16VarMo1543f1;
        boolean zM22199g = tl6.m22199g(128);
        d16 d16VarM1684h1 = m1684h1(zM22199g);
        if (d16VarM1684h1 == null || (d16VarM1684h1.f34837a.f34840d & 128) == 0) {
            return;
        }
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            if (!zM22199g) {
                d16VarMo1543f1 = mo1543f1().f34841e;
                if (d16VarMo1543f1 == null) {
                }
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            }
            d16VarMo1543f1 = mo1543f1();
            for (d16 d16VarM1684h2 = m1684h1(zM22199g); d16VarM1684h2 != null && (d16VarM1684h2.f34840d & 128) != 0; d16VarM1684h2 = d16VarM1684h2.f34842f) {
                if ((d16VarM1684h2.f34839c & 128) != 0) {
                    ?? M21992f = d16VarM1684h2;
                    ?? x66Var = 0;
                    while (M21992f != 0) {
                        if (M21992f instanceof mt5) {
                            ((mt5) M21992f).mo858c(this.f49303c);
                        } else if ((M21992f.f34839c & 128) != 0 && (M21992f instanceof fa2)) {
                            d16 d16Var = ((fa2) M21992f).f38701K;
                            int i = 0;
                            M21992f = M21992f;
                            x66Var = x66Var;
                            while (d16Var != null) {
                                if ((d16Var.f34839c & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        x66Var = x66Var;
                                        M21992f = d16Var;
                                    } else {
                                        if (x66Var == 0) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (M21992f != 0) {
                                            x66Var.m24305c(M21992f);
                                            M21992f = 0;
                                        }
                                        x66Var.m24305c(d16Var);
                                    }
                                }
                                d16Var = d16Var.f34842f;
                                M21992f = M21992f;
                                x66Var = x66Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M21992f = te1.m21992f(x66Var);
                    }
                }
                if (d16VarM1684h2 == d16VarMo1543f1) {
                    break;
                }
            }
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: q */
    public final long mo1695q(long j) {
        if (!mo1543f1().f34836I) {
            i54.m13663b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this.f4432J)).m1753w(mo1671R(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [d16] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: q1 */
    public final void m1696q1() {
        boolean zM22199g = tl6.m22199g(4194304);
        d16 d16VarMo1543f1 = mo1543f1();
        if (!zM22199g && (d16VarMo1543f1 = d16VarMo1543f1.f34841e) == null) {
            return;
        }
        for (d16 d16VarM1684h1 = m1684h1(zM22199g); d16VarM1684h1 != null && (d16VarM1684h1.f34840d & 4194304) != 0; d16VarM1684h1 = d16VarM1684h1.f34842f) {
            if ((d16VarM1684h1.f34839c & 4194304) != 0) {
                ?? M21992f = d16VarM1684h1;
                ?? x66Var = 0;
                while (M21992f != 0) {
                    if (M21992f instanceof yp4) {
                        ((yp4) M21992f).mo1049q(this);
                    } else if ((M21992f.f34839c & 4194304) != 0 && (M21992f instanceof fa2)) {
                        d16 d16Var = ((fa2) M21992f).f38701K;
                        int i = 0;
                        M21992f = M21992f;
                        x66Var = x66Var;
                        while (d16Var != null) {
                            if ((d16Var.f34839c & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    x66Var = x66Var;
                                    M21992f = d16Var;
                                } else {
                                    if (x66Var == 0) {
                                        x66Var = new x66(new d16[16]);
                                    }
                                    if (M21992f != 0) {
                                        x66Var.m24305c(M21992f);
                                        M21992f = 0;
                                    }
                                    x66Var.m24305c(d16Var);
                                }
                            }
                            d16Var = d16Var.f34842f;
                            M21992f = M21992f;
                            x66Var = x66Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M21992f = te1.m21992f(x66Var);
                }
            }
            if (d16VarM1684h1 == d16VarMo1543f1) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final void m1697r1() {
        this.f4435M = true;
        ((NodeCoordinator$invalidateParentLayer$1) this.f4453e0).mo0a();
        m1703x1();
        if (f84.m11593b(this.f4443U, 0L)) {
            return;
        }
        this.f4432J.m1575R(this);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m1698s1() {
        boolean zM22199g = tl6.m22199g(1048576);
        d16 d16VarM1684h1 = m1684h1(zM22199g);
        if (d16VarM1684h1 == null || (d16VarM1684h1.f34837a.f34840d & 1048576) == 0) {
            return;
        }
        d16 d16VarMo1543f1 = mo1543f1();
        if (!zM22199g && (d16VarMo1543f1 = d16VarMo1543f1.f34841e) == null) {
            return;
        }
        for (d16 d16VarM1684h2 = m1684h1(zM22199g); d16VarM1684h2 != null && (d16VarM1684h2.f34840d & 1048576) != 0; d16VarM1684h2 = d16VarM1684h2.f34842f) {
            if ((d16VarM1684h2.f34839c & 1048576) != 0) {
                d16 d16VarM21992f = d16VarM1684h2;
                x66 x66Var = null;
                while (d16VarM21992f != null) {
                    if (d16VarM21992f instanceof C0341h) {
                        ((C0341h) d16VarM21992f).m1516a1();
                    } else if ((d16VarM21992f.f34839c & 1048576) != 0 && (d16VarM21992f instanceof fa2)) {
                        int i = 0;
                        for (d16 d16Var = ((fa2) d16VarM21992f).f38701K; d16Var != null; d16Var = d16Var.f34842f) {
                            if ((d16Var.f34839c & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    d16VarM21992f = d16Var;
                                } else {
                                    if (x66Var == null) {
                                        x66Var = new x66(new d16[16]);
                                    }
                                    if (d16VarM21992f != null) {
                                        x66Var.m24305c(d16VarM21992f);
                                        d16VarM21992f = null;
                                    }
                                    x66Var.m24305c(d16Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    d16VarM21992f = te1.m21992f(x66Var);
                }
            }
            if (d16VarM1684h2 == d16VarMo1543f1) {
                return;
            }
        }
    }

    @Override // p000.aq4
    /* JADX INFO: renamed from: t */
    public final long mo1699t(long j) {
        if (!mo1543f1().f34836I) {
            i54.m13663b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        aq4 aq4VarM4054e0 = bq1.m4054e0(this);
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(this.f4432J);
        viewTreeObserverOnGlobalLayoutListenerC0391c.m1733I();
        return mo1669P(aq4VarM4054e0, gq6.m12824e(ts5.m22287b(viewTreeObserverOnGlobalLayoutListenerC0391c.f4714s0, j), aq4VarM4054e0.mo1671R(0L)));
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01a8 A[PHI: r4
      0x01a8: PHI (r4v11 ??) = (r4v1 ??), (r4v1 ??), (r4v13 ??) binds: [B:57:0x0175, B:59:0x0179, B:73:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d16] */
    /* JADX WARN: Type inference failed for: r3v7, types: [d16] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [x66] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [x66] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX INFO: renamed from: t1 */
    public final void m1700t1(final d16 d16Var, final sl6 sl6Var, final long j, final cu3 cu3Var, int i, final boolean z, final float f, final boolean z2) {
        ?? M21992f;
        if (d16Var == null) {
            mo1546l1(sl6Var, j, cu3Var, i, z);
            return;
        }
        if (!sl6Var.mo18968c(d16Var)) {
            m1700t1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (i2 == 3 || i2 == 4) {
            ?? x66Var = 0;
            ?? r3 = d16Var;
            while (r3 != 0) {
                int i3 = 0;
                if (r3 instanceof ng7) {
                    long jMo1462s = ((ng7) r3).mo1462s();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    C0357g c0357g = this.f4432J;
                    LayoutDirection layoutDirection = c0357g.f4328U;
                    int i5 = x7a.f67906b;
                    long j2 = Long.MIN_VALUE & jMo1462s;
                    if (fIntBitsToFloat < (-((j2 == 0 || layoutDirection == LayoutDirection.Ltr) ? ho5.m13394m(0, jMo1462s) : ho5.m13394m(2, jMo1462s)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= mo1642b0() + ((j2 == 0 || c0357g.f4328U == LayoutDirection.Ltr) ? ho5.m13394m(2, jMo1462s) : ho5.m13394m(0, jMo1462s))) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
                    int i7 = x7a.f67906b;
                    if (fIntBitsToFloat2 < (-ho5.m13394m(1, jMo1462s))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= ho5.m13394m(3, jMo1462s) + mo1640a0()) {
                        break;
                    }
                    final int i8 = i2;
                    ui3 ui3Var = new ui3() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            this.f4261b.m1700t1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i8, z, f, z2);
                            return xfa.f68157a;
                        }
                    };
                    x56 x56Var = cu3Var.f34538b;
                    h66 h66Var = cu3Var.f34537a;
                    int i9 = cu3Var.f34539c;
                    int i10 = h66Var.f1294b;
                    if (i9 == i10 - 1) {
                        cu3Var.m9894f(i9 + 1, i10);
                        cu3Var.f34539c++;
                        h66Var.m13090g(d16Var);
                        x56Var.m24287a(AbstractC3695vr.m23494d(0.0f, z, true));
                        ui3Var.mo0a();
                        cu3Var.f34539c = i9;
                        return;
                    }
                    long jM9893d = cu3Var.m9893d();
                    int i11 = cu3Var.f34539c;
                    if (!omd.m18125O(jM9893d)) {
                        if (omd.m18121J(jM9893d) > 0.0f) {
                            int i12 = cu3Var.f34539c;
                            cu3Var.m9894f(i12 + 1, h66Var.f1294b);
                            cu3Var.f34539c++;
                            h66Var.m13090g(d16Var);
                            x56Var.m24287a(AbstractC3695vr.m23494d(0.0f, z, true));
                            ui3Var.mo0a();
                            cu3Var.f34539c = i12;
                            return;
                        }
                        return;
                    }
                    int i13 = h66Var.f1294b;
                    int i14 = i13 - 1;
                    cu3Var.f34539c = i14;
                    cu3Var.m9894f(i13, h66Var.f1294b);
                    cu3Var.f34539c++;
                    h66Var.m13090g(d16Var);
                    x56Var.m24287a(AbstractC3695vr.m23494d(0.0f, z, true));
                    ui3Var.mo0a();
                    cu3Var.f34539c = i14;
                    if (omd.m18121J(cu3Var.m9893d()) < 0.0f) {
                        cu3Var.m9894f(i11 + 1, cu3Var.f34539c + 1);
                    }
                    cu3Var.f34539c = i11;
                    return;
                }
                if ((r3.f34839c & 16) == 0 || !(r3 instanceof fa2)) {
                    M21992f = r3;
                    x66Var = x66Var;
                    M21992f = te1.m21992f(x66Var);
                } else {
                    d16 d16Var2 = ((fa2) r3).f38701K;
                    while (d16Var2 != null) {
                        if ((d16Var2.f34839c & 16) != 0) {
                            i3++;
                            if (i3 == 1) {
                                M21992f = r3;
                                x66Var = x66Var;
                                x66Var = x66Var;
                                M21992f = d16Var2;
                            } else {
                                if (x66Var == 0) {
                                    x66Var = new x66(new d16[16]);
                                }
                                if (M21992f != 0) {
                                    x66Var.m24305c(M21992f);
                                    M21992f = 0;
                                }
                                x66Var.m24305c(d16Var2);
                            }
                        } else {
                            M21992f = r3;
                            x66Var = x66Var;
                        }
                        d16Var2 = d16Var2.f34842f;
                        M21992f = M21992f;
                        x66Var = x66Var;
                    }
                    if (i3 == 1) {
                        M21992f = r3;
                        x66Var = x66Var;
                    } else {
                        M21992f = r3;
                        x66Var = x66Var;
                        M21992f = te1.m21992f(x66Var);
                    }
                }
                i2 = i;
                r3 = M21992f;
                x66Var = x66Var;
            }
        }
        if (z2) {
            m1688j1(d16Var, sl6Var, j, cu3Var, i, z, f);
        } else {
            m1705z1(d16Var, sl6Var, j, cu3Var, i, z, f);
        }
    }

    /* JADX INFO: renamed from: u1 */
    public abstract void mo1548u1(ym0 ym0Var, C0312a c0312a);

    /* JADX INFO: renamed from: v1 */
    public final void m1701v1(long j, float f, vi3 vi3Var, C0312a c0312a) {
        C0357g c0357g = this.f4432J;
        if (c0312a != null) {
            if (vi3Var != null) {
                i54.m13662a("both ways to create layers shouldn't be used together");
            }
            if (this.f4456h0 != c0312a) {
                this.f4456h0 = null;
                m1664E1(null, false);
                this.f4456h0 = c0312a;
            }
            if (this.f4455g0 == null) {
                Owner ownerM19457a = pq4.m19457a(c0357g);
                zi3 zi3Var = this.f4452d0;
                if (zi3Var == null) {
                    NodeCoordinator$drawBlock$1 nodeCoordinator$drawBlock$1 = new NodeCoordinator$drawBlock$1(new NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1(this), this);
                    this.f4452d0 = nodeCoordinator$drawBlock$1;
                    zi3Var = nodeCoordinator$drawBlock$1;
                }
                ui3 ui3Var = this.f4453e0;
                b17 b17VarM1746j = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) ownerM19457a).m1746j(zi3Var, ui3Var, c0312a);
                C0403o c0403o = (C0403o) b17VarM1746j;
                c0403o.m1810e(this.f49303c);
                c0403o.m1809d(j);
                this.f4455g0 = b17VarM1746j;
                c0357g.f4343e0 = true;
                ((NodeCoordinator$invalidateParentLayer$1) ui3Var).mo0a();
            }
        } else {
            if (this.f4456h0 != null) {
                this.f4456h0 = null;
                m1664E1(null, false);
            }
            m1664E1(vi3Var, false);
        }
        if (!f84.m11593b(this.f4443U, j)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).m1744T(-4.0f);
            this.f4443U = j;
            b17 b17Var = this.f4455g0;
            if (b17Var != null) {
                ((C0403o) b17Var).m1809d(j);
            } else {
                AbstractC0362l abstractC0362l = this.f4434L;
                if (abstractC0362l != null) {
                    abstractC0362l.m1690m1();
                }
            }
            c0357g.m1575R(this);
            AbstractC0359i.m1616R0(this);
            Owner owner = c0357g.f4316I;
            if (owner != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1728D(c0357g);
            }
        }
        this.f4444V = f;
        if (this == ((AbstractC0362l) c0357g.f4335a0.f46677e)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).getRectManager().m1878h(c0357g);
        }
        if (this.f4367k) {
            return;
        }
        m1617B0(mo1624N0());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX INFO: renamed from: w1 */
    public final void m1702w1(m66 m66Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        b17 b17Var = this.f4455g0;
        if (b17Var != null) {
            if (this.f4436N) {
                if (z2) {
                    long jM1681e1 = m1681e1();
                    float f = m66Var.f50662a;
                    float f2 = m66Var.f50663b;
                    if (m66Var.f50664c >= 0.0f) {
                        long j = this.f49303c;
                        if (f > ((int) (j >> 32)) || m66Var.f50665d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM1681e1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM1681e1 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (m66Var.f50664c - m66Var.f50662a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (m66Var.f50665d - m66Var.f50663b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.f49303c;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jM1681e1 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jM1681e1 & 4294967295L);
                    m66Var.m16655a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.f49303c;
                    m66Var.m16655a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (m66Var.m16656b()) {
                    return;
                }
            }
            C0403o c0403o = (C0403o) b17Var;
            float[] fArrM1807b = c0403o.m1807b();
            if (!c0403o.f4840N) {
                if (fArrM1807b == null) {
                    m66Var.f50662a = 0.0f;
                    m66Var.f50663b = 0.0f;
                    m66Var.f50664c = 0.0f;
                    m66Var.f50665d = 0.0f;
                } else {
                    ts5.m22288c(fArrM1807b, m66Var);
                }
            }
        }
        long j4 = this.f4443U;
        float f9 = (int) (j4 >> 32);
        m66Var.f50662a += f9;
        m66Var.f50664c += f9;
        float f10 = (int) (j4 & 4294967295L);
        m66Var.f50663b += f10;
        m66Var.f50665d += f10;
    }

    @Override // p000.c17
    /* JADX INFO: renamed from: x */
    public final boolean mo1611x() {
        return (this.f4455g0 == null || this.f4435M || !this.f4432J.m1569L()) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1703x1() {
        if (this.f4455g0 != null) {
            if (this.f4456h0 != null) {
                this.f4456h0 = null;
            }
            m1664E1(null, false);
            this.f4432J.m1582a0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [d16] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [d16] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [x66] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [x66] */
    /* JADX INFO: renamed from: y1 */
    public final void m1704y1(it5 it5Var) {
        AbstractC0362l abstractC0362l;
        it5 it5Var2 = this.f4441S;
        if (it5Var != it5Var2) {
            this.f4441S = it5Var;
            C0357g c0357g = this.f4432J;
            int i = 0;
            if (it5Var2 == null || it5Var.mo10626d() != it5Var2.mo10626d() || it5Var.mo10623a() != it5Var2.mo10623a()) {
                int iMo10626d = it5Var.mo10626d();
                int iMo10623a = it5Var.mo10623a();
                b17 b17Var = this.f4455g0;
                if (b17Var != null) {
                    ((C0403o) b17Var).m1810e((((long) iMo10626d) << 32) | (((long) iMo10623a) & 4294967295L));
                } else if (c0357g.m1570M() && (abstractC0362l = this.f4434L) != null) {
                    abstractC0362l.m1690m1();
                }
                m16025k0((((long) iMo10623a) & 4294967295L) | (((long) iMo10626d) << 32));
                if (this.f4437O != null) {
                    m1665F1(false);
                }
                boolean zM22199g = tl6.m22199g(4);
                d16 d16VarMo1543f1 = mo1543f1();
                if (zM22199g || (d16VarMo1543f1 = d16VarMo1543f1.f34841e) != null) {
                    for (d16 d16VarM1684h1 = m1684h1(zM22199g); d16VarM1684h1 != null && (d16VarM1684h1.f34840d & 4) != 0; d16VarM1684h1 = d16VarM1684h1.f34842f) {
                        if ((d16VarM1684h1.f34839c & 4) != 0) {
                            ?? M21992f = d16VarM1684h1;
                            ?? x66Var = 0;
                            while (M21992f != 0) {
                                if (M21992f instanceof ll2) {
                                    ((ll2) M21992f).mo1343Q();
                                } else if ((M21992f.f34839c & 4) != 0 && (M21992f instanceof fa2)) {
                                    d16 d16Var = ((fa2) M21992f).f38701K;
                                    int i2 = 0;
                                    M21992f = M21992f;
                                    x66Var = x66Var;
                                    while (d16Var != null) {
                                        if ((d16Var.f34839c & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                x66Var = x66Var;
                                                M21992f = d16Var;
                                            } else {
                                                if (x66Var == 0) {
                                                    x66Var = new x66(new d16[16]);
                                                }
                                                if (M21992f != 0) {
                                                    x66Var.m24305c(M21992f);
                                                    M21992f = 0;
                                                }
                                                x66Var.m24305c(d16Var);
                                            }
                                        }
                                        d16Var = d16Var.f34842f;
                                        M21992f = M21992f;
                                        x66Var = x66Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M21992f = te1.m21992f(x66Var);
                            }
                        }
                        if (d16VarM1684h1 == d16VarMo1543f1) {
                            break;
                        }
                    }
                }
                Owner owner = c0357g.f4316I;
                if (owner != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0391c) owner).m1728D(c0357g);
                }
                c0357g.m1575R(this);
            }
            d66 d66Var = this.f4442T;
            if ((d66Var == null || d66Var.f35038e == 0) && it5Var.mo10624b().isEmpty()) {
                return;
            }
            d66 d66Var2 = this.f4442T;
            Map mapMo10624b = it5Var.mo10624b();
            if (d66Var2 != null && d66Var2.f35038e == mapMo10624b.size()) {
                Object[] objArr = d66Var2.f35035b;
                int[] iArr = d66Var2.f35036c;
                long[] jArr = d66Var2.f35034a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapMo10624b.get((AbstractC3608te) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            c0357g.f4337b0.f58070p.f4405T.m1538g();
            d66 d66Var3 = this.f4442T;
            if (d66Var3 == null) {
                d66 d66Var4 = hp6.f42737a;
                d66Var3 = new d66();
                this.f4442T = d66Var3;
            }
            d66Var3.m10122a();
            for (Map.Entry entry : it5Var.mo10624b().entrySet()) {
                d66Var3.m10128g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final void m1705z1(final d16 d16Var, final sl6 sl6Var, final long j, final cu3 cu3Var, final int i, final boolean z, final float f) {
        int i2;
        if (d16Var == null) {
            mo1546l1(sl6Var, j, cu3Var, i, z);
            return;
        }
        if (!sl6Var.mo18968c(d16Var)) {
            m1705z1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z, f);
            return;
        }
        if (!sl6Var.mo18966a(d16Var)) {
            m1700t1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z, f, false);
            return;
        }
        ui3 ui3Var = new ui3() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                this.f4270b.m1700t1(AbstractC3489q9.m19774d(d16Var, sl6Var.mo18967b()), sl6Var, j, cu3Var, i, z, f, false);
                return xfa.f68157a;
            }
        };
        x56 x56Var = cu3Var.f34538b;
        h66 h66Var = cu3Var.f34537a;
        int i3 = cu3Var.f34539c;
        int i4 = h66Var.f1294b;
        if (i3 != i4 - 1) {
            long jM9893d = cu3Var.m9893d();
            int i5 = cu3Var.f34539c;
            int i6 = h66Var.f1294b;
            int i7 = i6 - 1;
            cu3Var.f34539c = i7;
            cu3Var.m9894f(i6, h66Var.f1294b);
            cu3Var.f34539c++;
            h66Var.m13090g(d16Var);
            x56Var.m24287a(AbstractC3695vr.m23494d(f, z, false));
            ui3Var.mo0a();
            cu3Var.f34539c = i7;
            long jM9893d2 = cu3Var.m9893d();
            if (cu3Var.f34539c + 1 >= h66Var.f1294b - 1 || omd.m18162r(jM9893d, jM9893d2) <= 0) {
                cu3Var.m9894f(cu3Var.f34539c + 1, h66Var.f1294b);
            } else {
                int i8 = i5 + 1;
                boolean zM18125O = omd.m18125O(jM9893d2);
                int i9 = cu3Var.f34539c;
                cu3Var.m9894f(i8, zM18125O ? i9 + 2 : i9 + 1);
            }
            cu3Var.f34539c = i5;
            return;
        }
        int i10 = i3 + 1;
        cu3Var.m9894f(i10, i4);
        cu3Var.f34539c++;
        h66Var.m13090g(d16Var);
        x56Var.m24287a(AbstractC3695vr.m23494d(f, z, false));
        ui3Var.mo0a();
        cu3Var.f34539c = i3;
        if (i10 == h66Var.f1294b - 1 || omd.m18125O(cu3Var.m9893d())) {
            int i11 = cu3Var.f34539c;
            int i12 = i11 + 1;
            h66Var.m13095l(i12);
            if (i12 < 0 || i12 >= (i2 = x56Var.f67781b)) {
                v63.m23143u("Index must be between 0 and size");
                return;
            }
            long[] jArr = x56Var.f67780a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                AbstractC3550rv.m20828V(jArr, jArr, i12, i11 + 2, i2);
            }
            x56Var.f67781b--;
        }
    }
}
