package androidx.compose.p002ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p002ui.R$id;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0364n;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0428h;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import p000.AbstractC3393o1;
import p000.AbstractC3550rv;
import p000.AbstractC3584sr;
import p000.C0019ah;
import p000.C0797b4;
import p000.C0810bh;
import p000.C3024g3;
import p000.C3133j3;
import p000.C3386nv;
import p000.C3419on;
import p000.C3437ov;
import p000.C3500qj;
import p000.RunnableC0002a0;
import p000.a07;
import p000.aj3;
import p000.b07;
import p000.b84;
import p000.bq1;
import p000.c07;
import p000.cx9;
import p000.d16;
import p000.d84;
import p000.do7;
import p000.e28;
import p000.e84;
import p000.ea2;
import p000.ej0;
import p000.fa2;
import p000.fa4;
import p000.fx1;
import p000.gm5;
import p000.gq6;
import p000.gzc;
import p000.hg5;
import p000.j84;
import p000.kv8;
import p000.m84;
import p000.mi8;
import p000.mn8;
import p000.n66;
import p000.o39;
import p000.o66;
import p000.ov8;
import p000.pe9;
import p000.pk9;
import p000.pm8;
import p000.qn3;
import p000.qv8;
import p000.r56;
import p000.rv8;
import p000.rw9;
import p000.s56;
import p000.sq5;
import p000.t56;
import p000.te1;
import p000.u56;
import p000.u91;
import p000.uh8;
import p000.ui3;
import p000.v63;
import p000.vi3;
import p000.vn8;
import p000.vz1;
import p000.x66;
import p000.xfa;
import p000.xi3;
import p000.xwc;
import p000.y74;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0393e extends C3133j3 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: i0 */
    public static final s56 f4723i0;

    /* JADX INFO: renamed from: H */
    public C0797b4 f4724H;

    /* JADX INFO: renamed from: I */
    public C0797b4 f4725I;

    /* JADX INFO: renamed from: J */
    public boolean f4726J;

    /* JADX INFO: renamed from: K */
    public final t56 f4727K;

    /* JADX INFO: renamed from: L */
    public final t56 f4728L;

    /* JADX INFO: renamed from: M */
    public final pe9 f4729M;

    /* JADX INFO: renamed from: N */
    public final pe9 f4730N;

    /* JADX INFO: renamed from: O */
    public int f4731O;

    /* JADX INFO: renamed from: P */
    public Integer f4732P;

    /* JADX INFO: renamed from: Q */
    public final C3437ov f4733Q;

    /* JADX INFO: renamed from: R */
    public final C3211a f4734R;

    /* JADX INFO: renamed from: S */
    public boolean f4735S;

    /* JADX INFO: renamed from: T */
    public C0019ah f4736T;

    /* JADX INFO: renamed from: U */
    public t56 f4737U;

    /* JADX INFO: renamed from: V */
    public final u56 f4738V;

    /* JADX INFO: renamed from: W */
    public final r56 f4739W;

    /* JADX INFO: renamed from: X */
    public final r56 f4740X;

    /* JADX INFO: renamed from: Y */
    public final String f4741Y;

    /* JADX INFO: renamed from: Z */
    public final String f4742Z;

    /* JADX INFO: renamed from: a0 */
    public final sq5 f4743a0;

    /* JADX INFO: renamed from: b0 */
    public final t56 f4744b0;

    /* JADX INFO: renamed from: c0 */
    public qv8 f4745c0;

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f4746d;

    /* JADX INFO: renamed from: d0 */
    public boolean f4747d0;

    /* JADX INFO: renamed from: e0 */
    public final r56 f4749e0;

    /* JADX INFO: renamed from: f0 */
    public final RunnableC0002a0 f4751f0;

    /* JADX INFO: renamed from: g */
    public final AccessibilityManager f4752g;

    /* JADX INFO: renamed from: g0 */
    public final ArrayList f4753g0;

    /* JADX INFO: renamed from: h */
    public long f4754h;

    /* JADX INFO: renamed from: h0 */
    public final vi3 f4755h0;

    /* JADX INFO: renamed from: i */
    public List f4756i;

    /* JADX INFO: renamed from: j */
    public final C0392d f4757j;

    /* JADX INFO: renamed from: k */
    public int f4758k;

    /* JADX INFO: renamed from: l */
    public int f4759l;

    /* JADX INFO: renamed from: e */
    public int f4748e = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: f */
    public final vi3 f4750f = new C0370xa4e20b77(this);

    static {
        int[] iArr = {R$id.accessibility_custom_action_0, R$id.accessibility_custom_action_1, R$id.accessibility_custom_action_2, R$id.accessibility_custom_action_3, R$id.accessibility_custom_action_4, R$id.accessibility_custom_action_5, R$id.accessibility_custom_action_6, R$id.accessibility_custom_action_7, R$id.accessibility_custom_action_8, R$id.accessibility_custom_action_9, R$id.accessibility_custom_action_10, R$id.accessibility_custom_action_11, R$id.accessibility_custom_action_12, R$id.accessibility_custom_action_13, R$id.accessibility_custom_action_14, R$id.accessibility_custom_action_15, R$id.accessibility_custom_action_16, R$id.accessibility_custom_action_17, R$id.accessibility_custom_action_18, R$id.accessibility_custom_action_19, R$id.accessibility_custom_action_20, R$id.accessibility_custom_action_21, R$id.accessibility_custom_action_22, R$id.accessibility_custom_action_23, R$id.accessibility_custom_action_24, R$id.accessibility_custom_action_25, R$id.accessibility_custom_action_26, R$id.accessibility_custom_action_27, R$id.accessibility_custom_action_28, R$id.accessibility_custom_action_29, R$id.accessibility_custom_action_30, R$id.accessibility_custom_action_31};
        s56 s56Var = b84.f8108a;
        s56 s56Var2 = new s56(32);
        int i = s56Var2.f60382b;
        if (i < 0) {
            v63.m23143u("");
            return;
        }
        int i2 = i + 32;
        s56Var2.m21102b(i2);
        int[] iArr2 = s56Var2.f60381a;
        int i3 = s56Var2.f60382b;
        if (i != i3) {
            AbstractC3550rv.m20825S(i2, i, i3, iArr2, iArr2);
        }
        AbstractC3550rv.m20829W(i, 0, 12, iArr, iArr2);
        s56Var2.f60382b += 32;
        f4723i0 = s56Var2;
    }

    public ViewOnAttachStateChangeListenerC0393e(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        this.f4746d = viewTreeObserverOnGlobalLayoutListenerC0391c;
        Object systemService = viewTreeObserverOnGlobalLayoutListenerC0391c.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.f4752g = (AccessibilityManager) systemService;
        this.f4754h = 100L;
        new Handler(Looper.getMainLooper());
        this.f4757j = new C0392d(this);
        this.f4758k = Integer.MIN_VALUE;
        this.f4759l = Integer.MIN_VALUE;
        this.f4727K = new t56();
        this.f4728L = new t56();
        this.f4729M = new pe9(0);
        this.f4730N = new pe9(0);
        this.f4731O = -1;
        this.f4733Q = new C3437ov(0);
        this.f4734R = do7.m10525a(1, 6, null);
        this.f4735S = true;
        t56 t56Var = e84.f36837a;
        t56Var.getClass();
        this.f4737U = t56Var;
        this.f4738V = new u56();
        this.f4739W = new r56();
        this.f4740X = new r56();
        this.f4741Y = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f4742Z = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f4743a0 = new sq5(19);
        this.f4744b0 = new t56();
        this.f4745c0 = new qv8(viewTreeObserverOnGlobalLayoutListenerC0391c.getSemanticsOwner().m21750a(), t56Var);
        int i = y74.f69406a;
        this.f4749e0 = new r56();
        viewTreeObserverOnGlobalLayoutListenerC0391c.addOnAttachStateChangeListener(this);
        this.f4751f0 = new RunnableC0002a0(this, 1);
        this.f4753g0 = new ArrayList();
        this.f4755h0 = new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                vn8 vn8Var = (vn8) obj;
                if (vn8Var.mo1611x()) {
                    ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = this.f4500b;
                    C0364n snapshotObserver = viewOnAttachStateChangeListenerC0393e.f4746d.getSnapshotObserver();
                    snapshotObserver.f4460a.m11067c(vn8Var, viewOnAttachStateChangeListenerC0393e.f4755h0, new C0371xa0354dde(vn8Var, viewOnAttachStateChangeListenerC0393e));
                }
                return xfa.f68157a;
            }
        };
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m1761E(ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        viewOnAttachStateChangeListenerC0393e.m1773D(i, i2, num, null);
    }

    /* JADX INFO: renamed from: L */
    public static Rect m1762L(pk9 pk9Var, float f, float f2) {
        if (!(pk9Var instanceof b07) && !(pk9Var instanceof c07)) {
            return null;
        }
        e28 e28VarMo19o = pk9Var.mo19o();
        return new Rect((int) (e28VarMo19o.f36620a + f), (int) (e28VarMo19o.f36621b + f2), (int) (e28VarMo19o.f36622c + f), (int) (e28VarMo19o.f36623d + f2));
    }

    /* JADX INFO: renamed from: N */
    public static float[] m1763N(pk9 pk9Var) {
        if (!(pk9Var instanceof c07)) {
            return null;
        }
        mi8 mi8Var = ((c07) pk9Var).f9272A;
        long j = mi8Var.f51367h;
        long j2 = mi8Var.f51366g;
        long j3 = mi8Var.f51365f;
        long j4 = mi8Var.f51364e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    /* JADX INFO: renamed from: O */
    public static Region m1764O(pk9 pk9Var, float f, float f2) {
        if (pk9Var instanceof a07) {
            a07 a07Var = (a07) pk9Var;
            e28 e28VarM10809j = a07Var.mo19o().m10809j(f, f2);
            Region region = new Region(new Rect((int) (e28VarM10809j.f36620a + 0.0f), (int) (e28VarM10809j.f36621b + 0.0f), (int) (e28VarM10809j.f36622c + 0.0f), (int) (e28VarM10809j.f36623d + 0.0f)));
            Region region2 = new Region();
            C3500qj c3500qj = a07Var.f34A;
            if (c3500qj instanceof C3500qj) {
                Path path = c3500qj.f57839a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            C3386nv.m17636w("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    /* JADX INFO: renamed from: P */
    public static CharSequence m1765P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: t */
    public static String m1766t(C0423c c0423c) {
        C3419on c3419on;
        if (c0423c != null) {
            kv8 kv8Var = c0423c.f4974d;
            n66 n66Var = kv8Var.f48471a;
            C0427g c0427g = AbstractC0424d.f4994a;
            if (n66Var.m17251c(c0427g)) {
                return hg5.m13229a((List) kv8Var.m15706g(c0427g), ",", null, 62);
            }
            C0427g c0427g2 = AbstractC0424d.f4983G;
            if (n66Var.m17251c(c0427g2)) {
                C3419on c3419on2 = (C3419on) AbstractC0422b.m1838a(kv8Var, c0427g2);
                if (c3419on2 != null) {
                    return c3419on2.f54604b;
                }
            } else {
                List list = (List) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4979C);
                if (list != null && (c3419on = (C3419on) u91.m22591I0(list)) != null) {
                    return c3419on.f54604b;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m1767x(mn8 mn8Var, float f) {
        ui3 ui3Var = mn8Var.f51588a;
        if (f >= 0.0f || ((Number) ui3Var.mo0a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) ui3Var.mo0a()).floatValue() < ((Number) mn8Var.f51589b.mo0a()).floatValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m1768y(mn8 mn8Var) {
        ui3 ui3Var = mn8Var.f51588a;
        boolean z = mn8Var.f51590c;
        if (((Number) ui3Var.mo0a()).floatValue() <= 0.0f || z) {
            return ((Number) ui3Var.mo0a()).floatValue() < ((Number) mn8Var.f51589b.mo0a()).floatValue() && z;
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m1769z(mn8 mn8Var) {
        ui3 ui3Var = mn8Var.f51588a;
        boolean z = mn8Var.f51590c;
        if (((Number) ui3Var.mo0a()).floatValue() >= ((Number) mn8Var.f51589b.mo0a()).floatValue() || z) {
            return ((Number) ui3Var.mo0a()).floatValue() > 0.0f && z;
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final int m1770A(int i) {
        if (i == this.f4746d.getSemanticsOwner().m21750a().f4976f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b A[LOOP:1: B:15:0x004f->B:28:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008e A[EDGE_INSN: B:44:0x008e->B:29:0x008e BREAK  A[LOOP:1: B:15:0x004f->B:28:0x008b], SYNTHETIC] */
    /* JADX INFO: renamed from: B */
    public final void m1771B(C0423c c0423c, qv8 qv8Var) {
        int[] iArr = m84.f50750a;
        u56 u56Var = new u56();
        List listM1839j = C0423c.m1839j(4, c0423c);
        C0357g c0357g = c0423c.f4973c;
        int size = listM1839j.size();
        for (int i = 0; i < size; i++) {
            C0423c c0423c2 = (C0423c) listM1839j.get(i);
            d84 d84VarM1792s = m1792s();
            int i2 = c0423c2.f4976f;
            if (d84VarM1792s.m10151a(i2)) {
                if (!qv8Var.f58254b.m22476c(i2)) {
                    m1795w(c0357g);
                    return;
                }
                u56Var.m22474a(i2);
            }
        }
        u56 u56Var2 = qv8Var.f58254b;
        int[] iArr2 = u56Var2.f63437b;
        long[] jArr = u56Var2.f63436a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !u56Var.m22476c(iArr2[(i3 << 3) + i5])) {
                            m1795w(c0357g);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listM1839j2 = C0423c.m1839j(4, c0423c);
        int size2 = listM1839j2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C0423c c0423c3 = (C0423c) listM1839j2.get(i6);
            qv8 qv8Var2 = (qv8) this.f4744b0.m10152b(c0423c3.f4976f);
            if (qv8Var2 != null && m1792s().m10151a(c0423c3.f4976f)) {
                m1771B(c0423c3, qv8Var2);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m1772C(AccessibilityEvent accessibilityEvent) {
        if (!m1794v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f4726J = true;
        }
        try {
            return ((Boolean) ((C0370xa4e20b77) this.f4750f).invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f4726J = false;
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1773D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !m1794v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM1788o = m1788o(i, i2);
        if (num != null) {
            accessibilityEventM1788o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM1788o.setContentDescription(hg5.m13229a(list, ",", null, 62));
        }
        return m1772C(accessibilityEventM1788o);
    }

    /* JADX INFO: renamed from: F */
    public final void m1774F(int i, String str, int i2) {
        AccessibilityEvent accessibilityEventM1788o = m1788o(m1770A(i), 32);
        accessibilityEventM1788o.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventM1788o.getText().add(str);
        }
        m1772C(accessibilityEventM1788o);
    }

    /* JADX INFO: renamed from: G */
    public final void m1775G(int i) {
        C0019ah c0019ah = this.f4736T;
        if (c0019ah != null) {
            C0423c c0423c = c0019ah.f615a;
            if (i != c0423c.f4976f) {
                return;
            }
            if (SystemClock.uptimeMillis() - c0019ah.f620f <= 1000) {
                AccessibilityEvent accessibilityEventM1788o = m1788o(m1770A(c0423c.f4976f), 131072);
                accessibilityEventM1788o.setFromIndex(c0019ah.f618d);
                accessibilityEventM1788o.setToIndex(c0019ah.f619e);
                accessibilityEventM1788o.setAction(c0019ah.f616b);
                accessibilityEventM1788o.setMovementGranularity(c0019ah.f617c);
                accessibilityEventM1788o.getText().add(m1766t(c0423c));
                m1772C(accessibilityEventM1788o);
            }
        }
        this.f4736T = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f7 A[LOOP:4: B:110:0x02e6->B:115:0x02f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x0305  */
    /* JADX WARN: Code duplicated, block: B:123:0x0319 A[LOOP:5: B:118:0x0301->B:123:0x0319, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x033f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x0349  */
    /* JADX WARN: Code duplicated, block: B:137:0x034c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0375  */
    /* JADX WARN: Code duplicated, block: B:143:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0398  */
    /* JADX WARN: Code duplicated, block: B:146:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:147:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:149:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:157:0x043a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0443  */
    /* JADX WARN: Code duplicated, block: B:161:0x044b  */
    /* JADX WARN: Code duplicated, block: B:182:0x04fa A[PHI: r37 r42
      0x04fa: PHI (r37v10 boolean) = (r37v9 boolean), (r37v9 boolean), (r37v9 boolean), (r37v9 boolean), (r37v9 boolean), (r37v11 boolean) binds: [B:184:0x0504, B:189:0x0511, B:192:0x0520, B:199:0x052c, B:196:0x0527, B:181:0x04f8] A[DONT_GENERATE, DONT_INLINE]
      0x04fa: PHI (r42v11 int) = (r42v10 int), (r42v10 int), (r42v10 int), (r42v10 int), (r42v10 int), (r42v12 int) binds: [B:184:0x0504, B:189:0x0511, B:192:0x0520, B:199:0x052c, B:196:0x0527, B:181:0x04f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x0557  */
    /* JADX WARN: Code duplicated, block: B:230:0x0646  */
    /* JADX WARN: Code duplicated, block: B:250:0x0300 A[EDGE_INSN: B:250:0x0300->B:117:0x0300 BREAK  A[LOOP:4: B:110:0x02e6->B:115:0x02f7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x031e A[EDGE_INSN: B:253:0x031e->B:125:0x031e BREAK  A[LOOP:5: B:118:0x0301->B:123:0x0319], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0122  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x0156  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x019e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0212  */
    /* JADX WARN: Code duplicated, block: B:76:0x0217  */
    /* JADX WARN: Code duplicated, block: B:79:0x0228  */
    /* JADX WARN: Code duplicated, block: B:80:0x0230  */
    /* JADX WARN: Code duplicated, block: B:82:0x0234  */
    /* JADX WARN: Code duplicated, block: B:84:0x0239  */
    /* JADX WARN: Code duplicated, block: B:86:0x0246  */
    /* JADX WARN: Code duplicated, block: B:90:0x0277  */
    /* JADX WARN: Code duplicated, block: B:92:0x028a  */
    /* JADX WARN: Code duplicated, block: B:93:0x029f  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ba  */
    /* JADX INFO: renamed from: H */
    public final void m1776H(d84 d84Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        Integer num4;
        int i6;
        C0423c c0423c;
        boolean z;
        kv8 kv8Var;
        boolean z2;
        n66 n66Var;
        int i7;
        n66 n66Var2;
        C0357g c0357g;
        int i8;
        int i9;
        ArrayList arrayList3;
        long j;
        int i10;
        int i11;
        boolean z3;
        C0427g c0427g;
        C0427g c0427g2;
        C0427g c0427g3;
        String str;
        C0427g c0427g4;
        int i12;
        vn8 vn8VarM24781s;
        boolean z4;
        xi3 xi3Var;
        int i13;
        C3419on c3419on;
        String str2;
        kv8 kv8Var2;
        C3419on c3419on2;
        CharSequence charSequence;
        CharSequence charSequenceM1765P;
        int length;
        int length2;
        Integer num5;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean zM17251c;
        boolean z5;
        boolean z6;
        AccessibilityEvent accessibilityEventM1789p;
        uh8 uh8Var;
        C0357g c0357g2;
        AccessibilityEvent accessibilityEventM1788o;
        List list;
        String strM13229a;
        List list2;
        String strM13229a2;
        String str3;
        boolean zM17251c2;
        int i19;
        d84 d84Var2 = d84Var;
        Integer num6 = 64;
        ArrayList arrayList4 = this.f4753g0;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = d84Var2.f35144b;
        long[] jArr3 = d84Var2.f35143a;
        int i20 = 2;
        int length3 = jArr3.length - 2;
        int i21 = 0;
        Integer num7 = 0;
        if (length3 < 0) {
            return;
        }
        int i22 = 0;
        while (true) {
            long j2 = jArr3[i22];
            int i23 = i20;
            int i24 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i25 = 8;
                int i26 = 8 - ((~(i22 - i24)) >>> 31);
                long j3 = j2;
                int i27 = i21;
                while (i27 < i26) {
                    if ((j3 & 255) < 128) {
                        int i28 = iArr3[(i22 << 3) + i27];
                        qv8 qv8Var = (qv8) this.f4744b0.m10152b(i28);
                        if (qv8Var == null) {
                            i2 = i27;
                            num3 = num6;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i3 = i25;
                            i4 = i26;
                            i5 = i22;
                            num4 = num7;
                        } else {
                            kv8 kv8Var3 = qv8Var.f58253a;
                            n66 n66Var3 = kv8Var3.f48471a;
                            rv8 rv8Var = (rv8) d84Var2.m10152b(i28);
                            int i29 = i25;
                            C0423c c0423c2 = rv8Var != null ? rv8Var.f59881a : null;
                            if (c0423c2 == null) {
                                throw AbstractC3393o1.m17745t("no value for specified key");
                            }
                            C0357g c0357g3 = c0423c2.f4973c;
                            kv8 kv8Var4 = c0423c2.f4974d;
                            iArr2 = iArr3;
                            int i30 = c0423c2.f4976f;
                            jArr2 = jArr3;
                            n66 n66Var4 = kv8Var4.f48471a;
                            i5 = i22;
                            Object[] objArr = n66Var4.f52400b;
                            Object[] objArr2 = n66Var4.f52401c;
                            long[] jArr4 = n66Var4.f52399a;
                            i2 = i27;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                int i31 = i30;
                                n66 n66Var5 = n66Var4;
                                int i32 = 0;
                                z2 = false;
                                while (true) {
                                    long j4 = jArr4[i32];
                                    C0357g c0357g4 = c0357g3;
                                    i4 = i26;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i33 = 8 - ((~(i32 - length4)) >>> 31);
                                        int i34 = 0;
                                        while (i34 < i33) {
                                            if ((j4 & 255) < 128) {
                                                int i35 = (i32 << 3) + i34;
                                                Object obj = objArr[i35];
                                                i11 = length4;
                                                Object obj2 = objArr2[i35];
                                                j = j4;
                                                C0427g c0427g5 = (C0427g) obj;
                                                C0427g c0427g6 = AbstractC0424d.f5015v;
                                                if (fa4.m11650l(c0427g5, c0427g6)) {
                                                    i10 = i34;
                                                } else {
                                                    i10 = i34;
                                                    if (!fa4.m11650l(c0427g5, AbstractC0424d.f5016w)) {
                                                        z3 = false;
                                                    }
                                                    if (z3 && fa4.m11650l(obj2, AbstractC0422b.m1838a(kv8Var3, c0427g5))) {
                                                        arrayList3 = arrayList5;
                                                        i28 = i28;
                                                        n66Var3 = n66Var3;
                                                    } else {
                                                        c0427g = AbstractC0424d.f4997d;
                                                        if (fa4.m11650l(c0427g5, c0427g)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zM17251c2 = n66Var3.m17251c(c0427g);
                                                            i19 = i29;
                                                            if (zM17251c2) {
                                                                m1774F(i28, str3, i19);
                                                            }
                                                        } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4995b)) {
                                                            m1761E(this, m1770A(i28), 2048, num6, 8);
                                                            m1761E(this, m1770A(i28), 2048, num7, 8);
                                                        } else {
                                                            arrayList3 = arrayList5;
                                                            if (fa4.m11650l(c0427g5, AbstractC0424d.f4987K)) {
                                                                m1761E(this, m1770A(i28), 2048, 8192, 8);
                                                                m1761E(this, m1770A(i28), 2048, num7, 8);
                                                            } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4989M)) {
                                                                m1761E(this, m1770A(i28), 2048, 3072, 8);
                                                            } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4996c)) {
                                                                m1761E(this, m1770A(i28), 2048, num6, 8);
                                                                m1761E(this, m1770A(i28), 2048, num7, 8);
                                                            } else {
                                                                c0427g2 = AbstractC0424d.f4986J;
                                                                if (fa4.m11650l(c0427g5, c0427g2)) {
                                                                    uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5019z);
                                                                    if (uh8Var != null || uh8Var.f63934a != 4) {
                                                                        c0357g2 = c0357g4;
                                                                        m1761E(this, m1770A(i28), 2048, num6, 8);
                                                                        m1761E(this, m1770A(i28), 2048, num7, 8);
                                                                    } else if (fa4.m11650l(AbstractC0422b.m1838a(kv8Var4, c0427g2), Boolean.TRUE)) {
                                                                        accessibilityEventM1788o = m1788o(m1770A(i28), 4);
                                                                        c0357g2 = c0357g4;
                                                                        C0423c c0423c3 = new C0423c(c0423c2.f4971a, true, c0357g2, kv8Var4);
                                                                        list = (List) AbstractC0422b.m1838a(c0423c3.m1849k(), AbstractC0424d.f4994a);
                                                                        if (list != null) {
                                                                            strM13229a = hg5.m13229a(list, ",", null, 62);
                                                                        } else {
                                                                            strM13229a = null;
                                                                        }
                                                                        list2 = (List) AbstractC0422b.m1838a(c0423c3.m1849k(), AbstractC0424d.f4979C);
                                                                        if (list2 != null) {
                                                                            strM13229a2 = hg5.m13229a(list2, ",", null, 62);
                                                                        } else {
                                                                            strM13229a2 = null;
                                                                        }
                                                                        if (strM13229a != null) {
                                                                            accessibilityEventM1788o.setContentDescription(strM13229a);
                                                                        }
                                                                        if (strM13229a2 != null) {
                                                                            accessibilityEventM1788o.getText().add(strM13229a2);
                                                                        }
                                                                        m1772C(accessibilityEventM1788o);
                                                                    } else {
                                                                        c0357g2 = c0357g4;
                                                                        m1761E(this, m1770A(i28), 2048, num7, 8);
                                                                    }
                                                                    c0357g4 = c0357g2;
                                                                } else {
                                                                    c0423c2 = c0423c2;
                                                                    i32 = i32;
                                                                    c0357g4 = c0357g4;
                                                                    if (fa4.m11650l(c0427g5, AbstractC0424d.f4994a)) {
                                                                        int iM1770A = m1770A(i28);
                                                                        obj2.getClass();
                                                                        m1773D(iM1770A, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        c0427g3 = AbstractC0424d.f4983G;
                                                                        str = "";
                                                                        if (fa4.m11650l(c0427g5, c0427g3)) {
                                                                            n66Var5 = n66Var5;
                                                                            if (n66Var5.m17251c(AbstractC0421a.f4955k)) {
                                                                                c3419on2 = (C3419on) AbstractC0422b.m1838a(kv8Var3, c0427g3);
                                                                                if (c3419on2 == null) {
                                                                                    c3419on2 = "";
                                                                                }
                                                                                charSequence = (C3419on) AbstractC0422b.m1838a(kv8Var4, c0427g3);
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceM1765P = m1765P(charSequence);
                                                                                length = c3419on2.length();
                                                                                length2 = charSequence.length();
                                                                                num5 = num7;
                                                                                if (length > length2) {
                                                                                    i14 = length2;
                                                                                } else {
                                                                                    i14 = length;
                                                                                }
                                                                                kv8Var2 = kv8Var3;
                                                                                i15 = 0;
                                                                                while (true) {
                                                                                    i16 = i14;
                                                                                    if (i15 >= i14) {
                                                                                        num6 = num6;
                                                                                        break;
                                                                                    }
                                                                                    num6 = num6;
                                                                                    if (c3419on2.charAt(i15) != charSequence.charAt(i15)) {
                                                                                        break;
                                                                                    }
                                                                                    i15++;
                                                                                    i14 = i16;
                                                                                    num6 = num6;
                                                                                }
                                                                                i17 = 0;
                                                                                while (true) {
                                                                                    if (i17 >= i16 - i15) {
                                                                                        i18 = i17;
                                                                                        break;
                                                                                    }
                                                                                    i18 = i17;
                                                                                    if (c3419on2.charAt((length - 1) - i17) != charSequence.charAt((length2 - 1) - i18)) {
                                                                                        break;
                                                                                    } else {
                                                                                        i17 = i18 + 1;
                                                                                    }
                                                                                }
                                                                                int i36 = (length - i18) - i15;
                                                                                int i37 = (length2 - i18) - i15;
                                                                                C0427g c0427g7 = AbstractC0424d.f4988L;
                                                                                boolean zM17251c3 = n66Var3.m17251c(c0427g7);
                                                                                boolean zM17251c4 = n66Var5.m17251c(c0427g7);
                                                                                zM17251c = n66Var3.m17251c(AbstractC0424d.f4983G);
                                                                                if (zM17251c || zM17251c3 || !zM17251c4) {
                                                                                    z5 = false;
                                                                                } else {
                                                                                    z5 = true;
                                                                                }
                                                                                if (zM17251c || !zM17251c3 || zM17251c4) {
                                                                                    z6 = false;
                                                                                } else {
                                                                                    z6 = true;
                                                                                }
                                                                                if (!z5 || z6) {
                                                                                    int iM1770A2 = m1770A(i28);
                                                                                    Integer numValueOf = Integer.valueOf(length2);
                                                                                    i28 = i28;
                                                                                    num7 = num5;
                                                                                    accessibilityEventM1789p = m1789p(iM1770A2, num7, num5, numValueOf, charSequenceM1765P);
                                                                                } else {
                                                                                    AccessibilityEvent accessibilityEventM1788o2 = m1788o(m1770A(i28), 16);
                                                                                    accessibilityEventM1788o2.setFromIndex(i15);
                                                                                    accessibilityEventM1788o2.setRemovedCount(i36);
                                                                                    accessibilityEventM1788o2.setAddedCount(i37);
                                                                                    accessibilityEventM1788o2.setBeforeText(c3419on2);
                                                                                    accessibilityEventM1788o2.getText().add(charSequenceM1765P);
                                                                                    i28 = i28;
                                                                                    accessibilityEventM1789p = accessibilityEventM1788o2;
                                                                                    num7 = num5;
                                                                                }
                                                                                accessibilityEventM1789p.setClassName("android.widget.EditText");
                                                                                m1772C(accessibilityEventM1789p);
                                                                                if (z5 || z6) {
                                                                                    long j5 = ((cx9) kv8Var4.m15706g(AbstractC0424d.f4984H)).f34694a;
                                                                                    accessibilityEventM1789p.setFromIndex((int) (j5 >> 32));
                                                                                    accessibilityEventM1789p.setToIndex((int) (j5 & 4294967295L));
                                                                                    m1772C(accessibilityEventM1789p);
                                                                                }
                                                                            } else {
                                                                                i28 = i28;
                                                                                kv8Var2 = kv8Var3;
                                                                                num6 = num6;
                                                                                i11 = i11;
                                                                                n66Var3 = n66Var3;
                                                                                m1761E(this, m1770A(i28), 2048, Integer.valueOf(i23), 8);
                                                                            }
                                                                            i11 = i11;
                                                                            i31 = i31;
                                                                            kv8Var3 = kv8Var2;
                                                                            num7 = num7;
                                                                        } else {
                                                                            i28 = i28;
                                                                            num6 = num6;
                                                                            n66Var5 = n66Var5;
                                                                            i11 = i11;
                                                                            kv8Var3 = kv8Var3;
                                                                            n66Var3 = n66Var3;
                                                                            c0427g4 = AbstractC0424d.f4984H;
                                                                            if (fa4.m11650l(c0427g5, c0427g4)) {
                                                                                c3419on = (C3419on) AbstractC0422b.m1838a(kv8Var4, c0427g3);
                                                                                if (c3419on != null && (str2 = c3419on.f54604b) != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j6 = ((cx9) kv8Var4.m15706g(c0427g4)).f34694a;
                                                                                num7 = num7;
                                                                                m1772C(m1789p(m1770A(i28), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), m1765P(str)));
                                                                                int i38 = i31;
                                                                                m1775G(i38);
                                                                                i31 = i38;
                                                                                i11 = i11;
                                                                            } else {
                                                                                num7 = num7;
                                                                                i12 = i31;
                                                                                if (!fa4.m11650l(c0427g5, c0427g6) || fa4.m11650l(c0427g5, AbstractC0424d.f5016w)) {
                                                                                    i31 = i12;
                                                                                    m1795w(c0357g4);
                                                                                    vn8VarM24781s = xwc.m24781s(i28, arrayList4);
                                                                                    vn8VarM24781s.getClass();
                                                                                    vn8VarM24781s.m23444f((mn8) AbstractC0422b.m1838a(kv8Var4, c0427g6));
                                                                                    vn8VarM24781s.m23447i((mn8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5016w));
                                                                                    if (vn8VarM24781s.mo1611x()) {
                                                                                        this.f4746d.getSnapshotObserver().f4460a.m11067c(vn8VarM24781s, this.f4755h0, new C0371xa0354dde(vn8VarM24781s, this));
                                                                                    }
                                                                                } else if (fa4.m11650l(c0427g5, AbstractC0424d.f5005l)) {
                                                                                    obj2.getClass();
                                                                                    if (((Boolean) obj2).booleanValue()) {
                                                                                        i13 = 8;
                                                                                        m1772C(m1788o(m1770A(i12), 8));
                                                                                    } else {
                                                                                        i13 = 8;
                                                                                    }
                                                                                    m1761E(this, m1770A(i12), 2048, num7, i13);
                                                                                    i31 = i12;
                                                                                } else {
                                                                                    C0427g c0427g8 = AbstractC0421a.f4968x;
                                                                                    if (fa4.m11650l(c0427g5, c0427g8)) {
                                                                                        List list3 = (List) kv8Var4.m15706g(c0427g8);
                                                                                        List list4 = (List) AbstractC0422b.m1838a(kv8Var3, c0427g8);
                                                                                        if (list4 != null) {
                                                                                            o66 o66Var = pm8.f56484a;
                                                                                            o66 o66Var2 = new o66();
                                                                                            int size = list3.size();
                                                                                            int i39 = 0;
                                                                                            while (i39 < size) {
                                                                                                o66Var2.m17811d(((fx1) list3.get(i39)).f39843a);
                                                                                                i39++;
                                                                                                list3 = list3;
                                                                                            }
                                                                                            o66 o66Var3 = new o66();
                                                                                            int size2 = list4.size();
                                                                                            int i40 = 0;
                                                                                            while (i40 < size2) {
                                                                                                o66Var3.m17811d(((fx1) list4.get(i40)).f39843a);
                                                                                                i40++;
                                                                                                i12 = i12;
                                                                                            }
                                                                                            i31 = i12;
                                                                                            z2 = !o66Var2.equals(o66Var3);
                                                                                        } else {
                                                                                            i31 = i12;
                                                                                            z4 = true;
                                                                                            if (!list3.isEmpty()) {
                                                                                                z2 = z4;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i31 = i12;
                                                                                        z4 = true;
                                                                                        if (obj2 instanceof C3024g3) {
                                                                                            C3024g3 c3024g3 = (C3024g3) obj2;
                                                                                            Object objM1838a = AbstractC0422b.m1838a(kv8Var3, c0427g5);
                                                                                            if (c3024g3 != objM1838a) {
                                                                                                if (objM1838a instanceof C3024g3) {
                                                                                                    String str4 = c3024g3.f40090a;
                                                                                                    C3024g3 c3024g4 = (C3024g3) objM1838a;
                                                                                                    xi3 xi3Var2 = c3024g4.f40091b;
                                                                                                    if (fa4.m11650l(str4, c3024g4.f40090a) && (((xi3Var = c3024g3.f40091b) != null || xi3Var2 == null) && (xi3Var == null || xi3Var2 != null))) {
                                                                                                    }
                                                                                                }
                                                                                                z2 = z4;
                                                                                            }
                                                                                            z2 = false;
                                                                                        } else {
                                                                                            z2 = z4;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                n66Var5 = n66Var5;
                                                                n66Var3 = n66Var3;
                                                            }
                                                            i28 = i28;
                                                            n66Var3 = n66Var3;
                                                        }
                                                        arrayList3 = arrayList5;
                                                        i28 = i28;
                                                        n66Var3 = n66Var3;
                                                    }
                                                }
                                                vn8 vn8VarM24781s2 = xwc.m24781s(i28, arrayList5);
                                                if (vn8VarM24781s2 != null) {
                                                    z3 = false;
                                                } else {
                                                    vn8VarM24781s2 = new vn8(i28, arrayList4);
                                                    z3 = true;
                                                }
                                                arrayList4.add(vn8VarM24781s2);
                                                if (z3) {
                                                    c0427g = AbstractC0424d.f4997d;
                                                    if (fa4.m11650l(c0427g5, c0427g)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zM17251c2 = n66Var3.m17251c(c0427g);
                                                        i19 = i29;
                                                        if (zM17251c2) {
                                                            m1774F(i28, str3, i19);
                                                        }
                                                    } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4995b)) {
                                                        m1761E(this, m1770A(i28), 2048, num6, 8);
                                                        m1761E(this, m1770A(i28), 2048, num7, 8);
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        if (fa4.m11650l(c0427g5, AbstractC0424d.f4987K)) {
                                                            m1761E(this, m1770A(i28), 2048, 8192, 8);
                                                            m1761E(this, m1770A(i28), 2048, num7, 8);
                                                        } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4989M)) {
                                                            m1761E(this, m1770A(i28), 2048, 3072, 8);
                                                        } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4996c)) {
                                                            m1761E(this, m1770A(i28), 2048, num6, 8);
                                                            m1761E(this, m1770A(i28), 2048, num7, 8);
                                                        } else {
                                                            c0427g2 = AbstractC0424d.f4986J;
                                                            if (fa4.m11650l(c0427g5, c0427g2)) {
                                                                uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5019z);
                                                                if (uh8Var != null) {
                                                                    c0357g2 = c0357g4;
                                                                    m1761E(this, m1770A(i28), 2048, num6, 8);
                                                                    m1761E(this, m1770A(i28), 2048, num7, 8);
                                                                } else if (fa4.m11650l(AbstractC0422b.m1838a(kv8Var4, c0427g2), Boolean.TRUE)) {
                                                                    accessibilityEventM1788o = m1788o(m1770A(i28), 4);
                                                                    c0357g2 = c0357g4;
                                                                    C0423c c0423c4 = new C0423c(c0423c2.f4971a, true, c0357g2, kv8Var4);
                                                                    list = (List) AbstractC0422b.m1838a(c0423c4.m1849k(), AbstractC0424d.f4994a);
                                                                    if (list != null) {
                                                                        strM13229a = hg5.m13229a(list, ",", null, 62);
                                                                    } else {
                                                                        strM13229a = null;
                                                                    }
                                                                    list2 = (List) AbstractC0422b.m1838a(c0423c4.m1849k(), AbstractC0424d.f4979C);
                                                                    if (list2 != null) {
                                                                        strM13229a2 = hg5.m13229a(list2, ",", null, 62);
                                                                    } else {
                                                                        strM13229a2 = null;
                                                                    }
                                                                    if (strM13229a != null) {
                                                                        accessibilityEventM1788o.setContentDescription(strM13229a);
                                                                    }
                                                                    if (strM13229a2 != null) {
                                                                        accessibilityEventM1788o.getText().add(strM13229a2);
                                                                    }
                                                                    m1772C(accessibilityEventM1788o);
                                                                } else {
                                                                    c0357g2 = c0357g4;
                                                                    m1761E(this, m1770A(i28), 2048, num7, 8);
                                                                }
                                                                c0357g4 = c0357g2;
                                                            } else {
                                                                c0423c2 = c0423c2;
                                                                i32 = i32;
                                                                c0357g4 = c0357g4;
                                                                if (fa4.m11650l(c0427g5, AbstractC0424d.f4994a)) {
                                                                    int iM1770A3 = m1770A(i28);
                                                                    obj2.getClass();
                                                                    m1773D(iM1770A3, 2048, 4, (List) obj2);
                                                                } else {
                                                                    c0427g3 = AbstractC0424d.f4983G;
                                                                    str = "";
                                                                    if (fa4.m11650l(c0427g5, c0427g3)) {
                                                                        n66Var5 = n66Var5;
                                                                        if (n66Var5.m17251c(AbstractC0421a.f4955k)) {
                                                                            c3419on2 = (C3419on) AbstractC0422b.m1838a(kv8Var3, c0427g3);
                                                                            if (c3419on2 == null) {
                                                                                c3419on2 = "";
                                                                            }
                                                                            charSequence = (C3419on) AbstractC0422b.m1838a(kv8Var4, c0427g3);
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceM1765P = m1765P(charSequence);
                                                                            length = c3419on2.length();
                                                                            length2 = charSequence.length();
                                                                            num5 = num7;
                                                                            if (length > length2) {
                                                                                i14 = length2;
                                                                            } else {
                                                                                i14 = length;
                                                                            }
                                                                            kv8Var2 = kv8Var3;
                                                                            i15 = 0;
                                                                            while (true) {
                                                                                i16 = i14;
                                                                                if (i15 >= i14) {
                                                                                    num6 = num6;
                                                                                    break;
                                                                                }
                                                                                num6 = num6;
                                                                                if (c3419on2.charAt(i15) != charSequence.charAt(i15)) {
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i15++;
                                                                                    i14 = i16;
                                                                                    num6 = num6;
                                                                                }
                                                                            }
                                                                            i17 = 0;
                                                                            while (true) {
                                                                                if (i17 >= i16 - i15) {
                                                                                    i18 = i17;
                                                                                    break;
                                                                                }
                                                                                i18 = i17;
                                                                                if (c3419on2.charAt((length - 1) - i17) != charSequence.charAt((length2 - 1) - i18)) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i17 = i18 + 1;
                                                                            }
                                                                            int i310 = (length - i18) - i15;
                                                                            int i311 = (length2 - i18) - i15;
                                                                            C0427g c0427g9 = AbstractC0424d.f4988L;
                                                                            boolean zM17251c5 = n66Var3.m17251c(c0427g9);
                                                                            boolean zM17251c6 = n66Var5.m17251c(c0427g9);
                                                                            zM17251c = n66Var3.m17251c(AbstractC0424d.f4983G);
                                                                            if (zM17251c) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = false;
                                                                            }
                                                                            if (zM17251c) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = false;
                                                                            }
                                                                            if (z5) {
                                                                                int iM1770A4 = m1770A(i28);
                                                                                Integer numValueOf2 = Integer.valueOf(length2);
                                                                                i28 = i28;
                                                                                num7 = num5;
                                                                                accessibilityEventM1789p = m1789p(iM1770A4, num7, num5, numValueOf2, charSequenceM1765P);
                                                                            } else {
                                                                                int iM1770A5 = m1770A(i28);
                                                                                Integer numValueOf3 = Integer.valueOf(length2);
                                                                                i28 = i28;
                                                                                num7 = num5;
                                                                                accessibilityEventM1789p = m1789p(iM1770A5, num7, num5, numValueOf3, charSequenceM1765P);
                                                                            }
                                                                            accessibilityEventM1789p.setClassName("android.widget.EditText");
                                                                            m1772C(accessibilityEventM1789p);
                                                                            if (z5) {
                                                                                long j7 = ((cx9) kv8Var4.m15706g(AbstractC0424d.f4984H)).f34694a;
                                                                                accessibilityEventM1789p.setFromIndex((int) (j7 >> 32));
                                                                                accessibilityEventM1789p.setToIndex((int) (j7 & 4294967295L));
                                                                                m1772C(accessibilityEventM1789p);
                                                                            } else {
                                                                                long j8 = ((cx9) kv8Var4.m15706g(AbstractC0424d.f4984H)).f34694a;
                                                                                accessibilityEventM1789p.setFromIndex((int) (j8 >> 32));
                                                                                accessibilityEventM1789p.setToIndex((int) (j8 & 4294967295L));
                                                                                m1772C(accessibilityEventM1789p);
                                                                            }
                                                                        } else {
                                                                            i28 = i28;
                                                                            kv8Var2 = kv8Var3;
                                                                            num6 = num6;
                                                                            i11 = i11;
                                                                            n66Var3 = n66Var3;
                                                                            m1761E(this, m1770A(i28), 2048, Integer.valueOf(i23), 8);
                                                                        }
                                                                        i11 = i11;
                                                                        i31 = i31;
                                                                        kv8Var3 = kv8Var2;
                                                                        num7 = num7;
                                                                    } else {
                                                                        i28 = i28;
                                                                        num6 = num6;
                                                                        n66Var5 = n66Var5;
                                                                        i11 = i11;
                                                                        kv8Var3 = kv8Var3;
                                                                        n66Var3 = n66Var3;
                                                                        c0427g4 = AbstractC0424d.f4984H;
                                                                        if (fa4.m11650l(c0427g5, c0427g4)) {
                                                                            c3419on = (C3419on) AbstractC0422b.m1838a(kv8Var4, c0427g3);
                                                                            if (c3419on != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j9 = ((cx9) kv8Var4.m15706g(c0427g4)).f34694a;
                                                                            num7 = num7;
                                                                            m1772C(m1789p(m1770A(i28), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), m1765P(str)));
                                                                            int i312 = i31;
                                                                            m1775G(i312);
                                                                            i31 = i312;
                                                                            i11 = i11;
                                                                        } else {
                                                                            num7 = num7;
                                                                            i12 = i31;
                                                                            if (fa4.m11650l(c0427g5, c0427g6)) {
                                                                                i31 = i12;
                                                                                m1795w(c0357g4);
                                                                                vn8VarM24781s = xwc.m24781s(i28, arrayList4);
                                                                                vn8VarM24781s.getClass();
                                                                                vn8VarM24781s.m23444f((mn8) AbstractC0422b.m1838a(kv8Var4, c0427g6));
                                                                                vn8VarM24781s.m23447i((mn8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5016w));
                                                                                if (vn8VarM24781s.mo1611x()) {
                                                                                    this.f4746d.getSnapshotObserver().f4460a.m11067c(vn8VarM24781s, this.f4755h0, new C0371xa0354dde(vn8VarM24781s, this));
                                                                                }
                                                                            } else {
                                                                                i31 = i12;
                                                                                m1795w(c0357g4);
                                                                                vn8VarM24781s = xwc.m24781s(i28, arrayList4);
                                                                                vn8VarM24781s.getClass();
                                                                                vn8VarM24781s.m23444f((mn8) AbstractC0422b.m1838a(kv8Var4, c0427g6));
                                                                                vn8VarM24781s.m23447i((mn8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5016w));
                                                                                if (vn8VarM24781s.mo1611x()) {
                                                                                    this.f4746d.getSnapshotObserver().f4460a.m11067c(vn8VarM24781s, this.f4755h0, new C0371xa0354dde(vn8VarM24781s, this));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            n66Var5 = n66Var5;
                                                            n66Var3 = n66Var3;
                                                        }
                                                        i28 = i28;
                                                        n66Var3 = n66Var3;
                                                    }
                                                    arrayList3 = arrayList5;
                                                    i28 = i28;
                                                    n66Var3 = n66Var3;
                                                } else {
                                                    c0427g = AbstractC0424d.f4997d;
                                                    if (fa4.m11650l(c0427g5, c0427g)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zM17251c2 = n66Var3.m17251c(c0427g);
                                                        i19 = i29;
                                                        if (zM17251c2) {
                                                            m1774F(i28, str3, i19);
                                                        }
                                                    } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4995b)) {
                                                        m1761E(this, m1770A(i28), 2048, num6, 8);
                                                        m1761E(this, m1770A(i28), 2048, num7, 8);
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        if (fa4.m11650l(c0427g5, AbstractC0424d.f4987K)) {
                                                            m1761E(this, m1770A(i28), 2048, 8192, 8);
                                                            m1761E(this, m1770A(i28), 2048, num7, 8);
                                                        } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4989M)) {
                                                            m1761E(this, m1770A(i28), 2048, 3072, 8);
                                                        } else if (fa4.m11650l(c0427g5, AbstractC0424d.f4996c)) {
                                                            m1761E(this, m1770A(i28), 2048, num6, 8);
                                                            m1761E(this, m1770A(i28), 2048, num7, 8);
                                                        } else {
                                                            c0427g2 = AbstractC0424d.f4986J;
                                                            if (fa4.m11650l(c0427g5, c0427g2)) {
                                                                uh8Var = (uh8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5019z);
                                                                if (uh8Var != null) {
                                                                    c0357g2 = c0357g4;
                                                                    m1761E(this, m1770A(i28), 2048, num6, 8);
                                                                    m1761E(this, m1770A(i28), 2048, num7, 8);
                                                                } else if (fa4.m11650l(AbstractC0422b.m1838a(kv8Var4, c0427g2), Boolean.TRUE)) {
                                                                    accessibilityEventM1788o = m1788o(m1770A(i28), 4);
                                                                    c0357g2 = c0357g4;
                                                                    C0423c c0423c5 = new C0423c(c0423c2.f4971a, true, c0357g2, kv8Var4);
                                                                    list = (List) AbstractC0422b.m1838a(c0423c5.m1849k(), AbstractC0424d.f4994a);
                                                                    if (list != null) {
                                                                        strM13229a = hg5.m13229a(list, ",", null, 62);
                                                                    } else {
                                                                        strM13229a = null;
                                                                    }
                                                                    list2 = (List) AbstractC0422b.m1838a(c0423c5.m1849k(), AbstractC0424d.f4979C);
                                                                    if (list2 != null) {
                                                                        strM13229a2 = hg5.m13229a(list2, ",", null, 62);
                                                                    } else {
                                                                        strM13229a2 = null;
                                                                    }
                                                                    if (strM13229a != null) {
                                                                        accessibilityEventM1788o.setContentDescription(strM13229a);
                                                                    }
                                                                    if (strM13229a2 != null) {
                                                                        accessibilityEventM1788o.getText().add(strM13229a2);
                                                                    }
                                                                    m1772C(accessibilityEventM1788o);
                                                                } else {
                                                                    c0357g2 = c0357g4;
                                                                    m1761E(this, m1770A(i28), 2048, num7, 8);
                                                                }
                                                                c0357g4 = c0357g2;
                                                            } else {
                                                                c0423c2 = c0423c2;
                                                                i32 = i32;
                                                                c0357g4 = c0357g4;
                                                                if (fa4.m11650l(c0427g5, AbstractC0424d.f4994a)) {
                                                                    int iM1770A6 = m1770A(i28);
                                                                    obj2.getClass();
                                                                    m1773D(iM1770A6, 2048, 4, (List) obj2);
                                                                } else {
                                                                    c0427g3 = AbstractC0424d.f4983G;
                                                                    str = "";
                                                                    if (fa4.m11650l(c0427g5, c0427g3)) {
                                                                        n66Var5 = n66Var5;
                                                                        if (n66Var5.m17251c(AbstractC0421a.f4955k)) {
                                                                            c3419on2 = (C3419on) AbstractC0422b.m1838a(kv8Var3, c0427g3);
                                                                            if (c3419on2 == null) {
                                                                                c3419on2 = "";
                                                                            }
                                                                            charSequence = (C3419on) AbstractC0422b.m1838a(kv8Var4, c0427g3);
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceM1765P = m1765P(charSequence);
                                                                            length = c3419on2.length();
                                                                            length2 = charSequence.length();
                                                                            num5 = num7;
                                                                            if (length > length2) {
                                                                                i14 = length2;
                                                                            } else {
                                                                                i14 = length;
                                                                            }
                                                                            kv8Var2 = kv8Var3;
                                                                            i15 = 0;
                                                                            while (true) {
                                                                                i16 = i14;
                                                                                if (i15 >= i14) {
                                                                                    num6 = num6;
                                                                                    break;
                                                                                }
                                                                                num6 = num6;
                                                                                if (c3419on2.charAt(i15) != charSequence.charAt(i15)) {
                                                                                    break;
                                                                                    break;
                                                                                } else {
                                                                                    i15++;
                                                                                    i14 = i16;
                                                                                    num6 = num6;
                                                                                }
                                                                            }
                                                                            i17 = 0;
                                                                            while (true) {
                                                                                if (i17 >= i16 - i15) {
                                                                                    i18 = i17;
                                                                                    break;
                                                                                }
                                                                                i18 = i17;
                                                                                if (c3419on2.charAt((length - 1) - i17) != charSequence.charAt((length2 - 1) - i18)) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i17 = i18 + 1;
                                                                            }
                                                                            int i313 = (length - i18) - i15;
                                                                            int i314 = (length2 - i18) - i15;
                                                                            C0427g c0427g10 = AbstractC0424d.f4988L;
                                                                            boolean zM17251c7 = n66Var3.m17251c(c0427g10);
                                                                            boolean zM17251c8 = n66Var5.m17251c(c0427g10);
                                                                            zM17251c = n66Var3.m17251c(AbstractC0424d.f4983G);
                                                                            if (zM17251c) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = false;
                                                                            }
                                                                            if (zM17251c) {
                                                                                z6 = false;
                                                                            } else {
                                                                                z6 = false;
                                                                            }
                                                                            if (z5) {
                                                                                int iM1770A7 = m1770A(i28);
                                                                                Integer numValueOf4 = Integer.valueOf(length2);
                                                                                i28 = i28;
                                                                                num7 = num5;
                                                                                accessibilityEventM1789p = m1789p(iM1770A7, num7, num5, numValueOf4, charSequenceM1765P);
                                                                            } else {
                                                                                int iM1770A8 = m1770A(i28);
                                                                                Integer numValueOf5 = Integer.valueOf(length2);
                                                                                i28 = i28;
                                                                                num7 = num5;
                                                                                accessibilityEventM1789p = m1789p(iM1770A8, num7, num5, numValueOf5, charSequenceM1765P);
                                                                            }
                                                                            accessibilityEventM1789p.setClassName("android.widget.EditText");
                                                                            m1772C(accessibilityEventM1789p);
                                                                            if (z5) {
                                                                                long j10 = ((cx9) kv8Var4.m15706g(AbstractC0424d.f4984H)).f34694a;
                                                                                accessibilityEventM1789p.setFromIndex((int) (j10 >> 32));
                                                                                accessibilityEventM1789p.setToIndex((int) (j10 & 4294967295L));
                                                                                m1772C(accessibilityEventM1789p);
                                                                            } else {
                                                                                long j11 = ((cx9) kv8Var4.m15706g(AbstractC0424d.f4984H)).f34694a;
                                                                                accessibilityEventM1789p.setFromIndex((int) (j11 >> 32));
                                                                                accessibilityEventM1789p.setToIndex((int) (j11 & 4294967295L));
                                                                                m1772C(accessibilityEventM1789p);
                                                                            }
                                                                        } else {
                                                                            i28 = i28;
                                                                            kv8Var2 = kv8Var3;
                                                                            num6 = num6;
                                                                            i11 = i11;
                                                                            n66Var3 = n66Var3;
                                                                            m1761E(this, m1770A(i28), 2048, Integer.valueOf(i23), 8);
                                                                        }
                                                                        i11 = i11;
                                                                        i31 = i31;
                                                                        kv8Var3 = kv8Var2;
                                                                        num7 = num7;
                                                                    } else {
                                                                        i28 = i28;
                                                                        num6 = num6;
                                                                        n66Var5 = n66Var5;
                                                                        i11 = i11;
                                                                        kv8Var3 = kv8Var3;
                                                                        n66Var3 = n66Var3;
                                                                        c0427g4 = AbstractC0424d.f4984H;
                                                                        if (fa4.m11650l(c0427g5, c0427g4)) {
                                                                            c3419on = (C3419on) AbstractC0422b.m1838a(kv8Var4, c0427g3);
                                                                            if (c3419on != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j12 = ((cx9) kv8Var4.m15706g(c0427g4)).f34694a;
                                                                            num7 = num7;
                                                                            m1772C(m1789p(m1770A(i28), Integer.valueOf((int) (j12 >> 32)), Integer.valueOf((int) (j12 & 4294967295L)), Integer.valueOf(str.length()), m1765P(str)));
                                                                            int i315 = i31;
                                                                            m1775G(i315);
                                                                            i31 = i315;
                                                                            i11 = i11;
                                                                        } else {
                                                                            num7 = num7;
                                                                            i12 = i31;
                                                                            if (fa4.m11650l(c0427g5, c0427g6)) {
                                                                                i31 = i12;
                                                                                m1795w(c0357g4);
                                                                                vn8VarM24781s = xwc.m24781s(i28, arrayList4);
                                                                                vn8VarM24781s.getClass();
                                                                                vn8VarM24781s.m23444f((mn8) AbstractC0422b.m1838a(kv8Var4, c0427g6));
                                                                                vn8VarM24781s.m23447i((mn8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5016w));
                                                                                if (vn8VarM24781s.mo1611x()) {
                                                                                    this.f4746d.getSnapshotObserver().f4460a.m11067c(vn8VarM24781s, this.f4755h0, new C0371xa0354dde(vn8VarM24781s, this));
                                                                                }
                                                                            } else {
                                                                                i31 = i12;
                                                                                m1795w(c0357g4);
                                                                                vn8VarM24781s = xwc.m24781s(i28, arrayList4);
                                                                                vn8VarM24781s.getClass();
                                                                                vn8VarM24781s.m23444f((mn8) AbstractC0422b.m1838a(kv8Var4, c0427g6));
                                                                                vn8VarM24781s.m23447i((mn8) AbstractC0422b.m1838a(kv8Var4, AbstractC0424d.f5016w));
                                                                                if (vn8VarM24781s.mo1611x()) {
                                                                                    this.f4746d.getSnapshotObserver().f4460a.m11067c(vn8VarM24781s, this.f4755h0, new C0371xa0354dde(vn8VarM24781s, this));
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            n66Var5 = n66Var5;
                                                            n66Var3 = n66Var3;
                                                        }
                                                        i28 = i28;
                                                        n66Var3 = n66Var3;
                                                    }
                                                    arrayList3 = arrayList5;
                                                    i28 = i28;
                                                    n66Var3 = n66Var3;
                                                }
                                            } else {
                                                n66Var3 = n66Var3;
                                                num6 = num6;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i10 = i34;
                                                c0423c2 = c0423c2;
                                                i32 = i32;
                                                n66Var5 = n66Var5;
                                                c0357g4 = c0357g4;
                                                num7 = num7;
                                                i28 = i28;
                                                kv8Var3 = kv8Var3;
                                                i31 = i31;
                                                i11 = length4;
                                            }
                                            i29 = 8;
                                            n66Var5 = n66Var5;
                                            i31 = i31;
                                            n66Var3 = n66Var3;
                                            j4 = j >> 8;
                                            length4 = i11;
                                            i34 = i10 + 1;
                                            kv8Var3 = kv8Var3;
                                            num7 = num7;
                                            c0357g4 = c0357g4;
                                            i28 = i28;
                                            i32 = i32;
                                            arrayList5 = arrayList3;
                                            c0423c2 = c0423c2;
                                            num6 = num6;
                                        }
                                        n66Var = n66Var3;
                                        num3 = num6;
                                        arrayList2 = arrayList5;
                                        c0423c = c0423c2;
                                        i7 = i32;
                                        n66Var2 = n66Var5;
                                        c0357g = c0357g4;
                                        z = true;
                                        num4 = num7;
                                        i6 = i28;
                                        kv8Var = kv8Var3;
                                        i8 = i31;
                                        i9 = length4;
                                        if (i33 != i29) {
                                            break;
                                        }
                                    } else {
                                        n66Var = n66Var3;
                                        num3 = num6;
                                        arrayList2 = arrayList5;
                                        c0423c = c0423c2;
                                        i7 = i32;
                                        n66Var2 = n66Var5;
                                        c0357g = c0357g4;
                                        z = true;
                                        num4 = num7;
                                        i6 = i28;
                                        kv8Var = kv8Var3;
                                        i8 = i31;
                                        i9 = length4;
                                    }
                                    int i41 = i7;
                                    if (i41 == i9) {
                                        break;
                                    }
                                    int i42 = i6;
                                    i32 = i41 + 1;
                                    length4 = i9;
                                    i28 = i42;
                                    kv8Var3 = kv8Var;
                                    num7 = num4;
                                    n66Var5 = n66Var2;
                                    c0357g3 = c0357g;
                                    i26 = i4;
                                    i31 = i8;
                                    arrayList5 = arrayList2;
                                    n66Var3 = n66Var;
                                    c0423c2 = c0423c;
                                    num6 = num3;
                                    i29 = 8;
                                }
                            } else {
                                i6 = i28;
                                num3 = num6;
                                arrayList2 = arrayList5;
                                i4 = i26;
                                c0423c = c0423c2;
                                z = true;
                                num4 = num7;
                                kv8Var = kv8Var3;
                                z2 = false;
                            }
                            if (!z2) {
                                Iterator it = kv8Var.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                } while (c0423c.m1849k().f48471a.m17251c((C0427g) ((Map.Entry) it.next()).getKey()));
                                z2 = z;
                            }
                            if (z2) {
                                i3 = 8;
                                m1761E(this, m1770A(i6), 2048, num4, 8);
                            } else {
                                i3 = 8;
                            }
                        }
                    } else {
                        i2 = i27;
                        num3 = num6;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i3 = i25;
                        i4 = i26;
                        i5 = i22;
                        num4 = num7;
                    }
                    j3 >>= i3;
                    i27 = i2 + 1;
                    d84Var2 = d84Var;
                    num7 = num4;
                    i25 = i3;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i22 = i5;
                    i26 = i4;
                    arrayList5 = arrayList2;
                    num6 = num3;
                }
                num = num6;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i43 = i22;
                num2 = num7;
                if (i26 != i25) {
                    return;
                } else {
                    i = i43;
                }
            } else {
                num = num6;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num7;
                i = i22;
            }
            if (i == i24) {
                return;
            }
            i22 = i + 1;
            d84Var2 = d84Var;
            length3 = i24;
            num7 = num2;
            i20 = i23;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num6 = num;
            i21 = 0;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1777I(C0357g c0357g, u56 u56Var) {
        kv8 kv8VarM1613z;
        C0357g c0357gM21594E;
        if (c0357g.m1569L() && !this.f4746d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c0357g)) {
            if (!c0357g.f4335a0.m14799f(8)) {
                c0357g = AbstractC3584sr.m21594E(c0357g, C0374xb706b370.f4502b);
            }
            if (c0357g == null || (kv8VarM1613z = c0357g.m1613z()) == null) {
                return;
            }
            if (!kv8VarM1613z.f48473c && (c0357gM21594E = AbstractC3584sr.m21594E(c0357g, C0373x7245ac5.f4501b)) != null) {
                c0357g = c0357gM21594E;
            }
            int i = c0357g.f4336b;
            if (u56Var.m22474a(i)) {
                m1761E(this, m1770A(i), 2048, 1, 8);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m1778J(C0357g c0357g) {
        if (c0357g.m1569L() && !this.f4746d.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(c0357g)) {
            int i = c0357g.f4336b;
            mn8 mn8Var = (mn8) this.f4727K.m10152b(i);
            mn8 mn8Var2 = (mn8) this.f4728L.m10152b(i);
            if (mn8Var == null && mn8Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM1788o = m1788o(i, 4096);
            if (mn8Var != null) {
                accessibilityEventM1788o.setScrollX((int) ((Number) mn8Var.f51588a.mo0a()).floatValue());
                accessibilityEventM1788o.setMaxScrollX((int) ((Number) mn8Var.f51589b.mo0a()).floatValue());
            }
            if (mn8Var2 != null) {
                accessibilityEventM1788o.setScrollY((int) ((Number) mn8Var2.f51588a.mo0a()).floatValue());
                accessibilityEventM1788o.setMaxScrollY((int) ((Number) mn8Var2.f51589b.mo0a()).floatValue());
            }
            m1772C(accessibilityEventM1788o);
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m1779K(C0423c c0423c, int i, int i2, boolean z) {
        String strM1766t;
        kv8 kv8Var = c0423c.f4974d;
        int i3 = c0423c.f4976f;
        C0427g c0427g = AbstractC0421a.f4954j;
        if (kv8Var.f48471a.m17251c(c0427g) && AbstractC3584sr.m21637o(c0423c)) {
            aj3 aj3Var = (aj3) ((C3024g3) c0423c.f4974d.m15706g(c0427g)).f40091b;
            if (aj3Var != null) {
                return ((Boolean) aj3Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.f4731O) && (strM1766t = m1766t(c0423c)) != null) {
            if (i < 0 || i != i2 || i2 > strM1766t.length()) {
                i = -1;
            }
            this.f4731O = i;
            boolean z2 = strM1766t.length() > 0;
            m1772C(m1789p(m1770A(i3), z2 ? Integer.valueOf(this.f4731O) : null, z2 ? Integer.valueOf(this.f4731O) : null, z2 ? Integer.valueOf(strM1766t.length()) : null, strM1766t));
            m1775G(i3);
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: M */
    public final Rect m1780M(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4746d;
        long jM1753w = viewTreeObserverOnGlobalLayoutListenerC0391c.m1753w(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jM1753w2 = viewTreeObserverOnGlobalLayoutListenerC0391c.m1753w((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jM1753w >> 32);
        int i2 = (int) (jM1753w2 >> 32);
        int i3 = (int) (jM1753w & 4294967295L);
        int i4 = (int) (jM1753w2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX INFO: renamed from: Q */
    public final void m1781Q() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        u56 u56Var = new u56();
        u56 u56Var2 = this.f4738V;
        int[] iArr = u56Var2.f63437b;
        long[] jArr3 = u56Var2.f63436a;
        int length = jArr3.length - 2;
        t56 t56Var = this.f4744b0;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            rv8 rv8Var = (rv8) m1792s().m10152b(i6);
                            C0423c c0423c = rv8Var != null ? rv8Var.f59881a : null;
                            if (c0423c != null) {
                                if (!c0423c.f4974d.f48471a.m17251c(AbstractC0424d.f4997d)) {
                                    u56Var.m22474a(i6);
                                    qv8 qv8Var = (qv8) t56Var.m10152b(i6);
                                    m1774F(i6, qv8Var != null ? (String) AbstractC0422b.m1838a(qv8Var.f58253a, AbstractC0424d.f4997d) : null, 32);
                                }
                            } else {
                                u56Var.m22474a(i6);
                                qv8 qv8Var2 = (qv8) t56Var.m10152b(i6);
                                m1774F(i6, qv8Var2 != null ? (String) AbstractC0422b.m1838a(qv8Var2.f58253a, AbstractC0424d.f4997d) : null, 32);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = u56Var.f63437b;
        long[] jArr4 = u56Var.f63436a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = u56Var2.f63438c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = u56Var2.f63436a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (u56Var2.f63437b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                u56Var2.m22481h(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        t56Var.m21844c();
        d84 d84VarM1792s = m1792s();
        int[] iArr3 = d84VarM1792s.f35144b;
        Object[] objArr = d84VarM1792s.f35145c;
        long[] jArr6 = d84VarM1792s.f35143a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            C0423c c0423c2 = ((rv8) objArr[i25]).f59881a;
                            kv8 kv8Var = c0423c2.f4974d;
                            C0427g c0427g = AbstractC0424d.f4997d;
                            if (kv8Var.f48471a.m17251c(c0427g) && u56Var2.m22474a(i26)) {
                                m1774F(i26, (String) c0423c2.f4974d.m15706g(c0427g), 16);
                            }
                            t56Var.m21850i(i26, new qv8(c0423c2, m1792s()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f4745c0 = new qv8(this.f4746d.getSemanticsOwner().m21750a(), m1792s());
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: b */
    public final qn3 mo1782b(View view) {
        return this.f4757j;
    }

    /* JADX INFO: renamed from: j */
    public final void m1783j(int i, C0797b4 c0797b4, String str, Bundle bundle) {
        C0423c c0423c;
        o39 o39Var;
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4.f7900a;
        rv8 rv8Var = (rv8) m1792s().m10152b(i);
        if (rv8Var == null || (c0423c = rv8Var.f59881a) == null) {
            return;
        }
        C0357g c0357g = c0423c.f4973c;
        kv8 kv8Var = c0423c.f4974d;
        n66 n66Var = kv8Var.f48471a;
        String strM1766t = m1766t(c0423c);
        if (fa4.m11650l(str, this.f4741Y)) {
            int iM20409d = this.f4739W.m20409d(i);
            if (iM20409d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM20409d);
                return;
            }
            return;
        }
        if (fa4.m11650l(str, this.f4742Z)) {
            int iM20409d2 = this.f4740X.m20409d(i);
            if (iM20409d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM20409d2);
                return;
            }
            return;
        }
        boolean zM17251c = n66Var.m17251c(AbstractC0421a.f4945a);
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4746d;
        if (zM17251c && bundle != null && fa4.m11650l(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strM1766t != null ? strM1766t.length() : Integer.MAX_VALUE)) {
                    rw9 rw9VarM24732E = xwc.m24732E(kv8Var);
                    if (rw9VarM24732E == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        RectF rectF = null;
                        if (i5 >= rw9VarM24732E.f59975a.f58295a.f54604b.length()) {
                            arrayList.add(null);
                            i2 = i2;
                            i3 = i3;
                        } else {
                            e28 e28VarM20955b = rw9VarM24732E.m20955b(i5);
                            AbstractC0362l abstractC0362lM1843d = c0423c.m1843d();
                            long jMo1671R = 0;
                            if (abstractC0362lM1843d != null) {
                                if (!abstractC0362lM1843d.mo1543f1().f34836I) {
                                    abstractC0362lM1843d = null;
                                }
                                if (abstractC0362lM1843d != null) {
                                    jMo1671R = abstractC0362lM1843d.mo1671R(0L);
                                }
                            }
                            e28 e28VarM10810k = e28VarM20955b.m10810k(jMo1671R);
                            e28 e28VarM1846g = c0423c.m1846g();
                            e28 e28VarM10806g = e28VarM10810k.m10808i(e28VarM1846g) ? e28VarM10810k.m10806g(e28VarM1846g) : null;
                            if (e28VarM10806g != null) {
                                long jM1753w = viewTreeObserverOnGlobalLayoutListenerC0391c.m1753w((((long) Float.floatToRawIntBits(e28VarM10806g.f36621b)) & 4294967295L) | (((long) Float.floatToRawIntBits(e28VarM10806g.f36620a)) << 32));
                                long jM1753w2 = viewTreeObserverOnGlobalLayoutListenerC0391c.m1753w((((long) Float.floatToRawIntBits(e28VarM10806g.f36623d)) & 4294967295L) | (((long) Float.floatToRawIntBits(e28VarM10806g.f36622c)) << 32));
                                int i6 = (int) (jM1753w >> 32);
                                int i7 = (int) (jM1753w2 >> 32);
                                int i8 = (int) (jM1753w & 4294967295L);
                                int i9 = (int) (jM1753w2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        i2 = i2;
                        i3 = i3;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        C0427g c0427g = AbstractC0424d.f4977A;
        if (n66Var.m17251c(c0427g) && bundle != null && fa4.m11650l(str, "androidx.compose.ui.semantics.testTag")) {
            String str2 = (String) AbstractC0422b.m1838a(kv8Var, c0427g);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (fa4.m11650l(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, c0423c.f4976f);
            return;
        }
        if (fa4.m11650l(str, "androidx.compose.ui.semantics.shapeType")) {
            o39 o39Var2 = (o39) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4993Q);
            if (o39Var2 != null) {
                Rect rect = new Rect();
                c0797b4.m3275f(rect);
                e28 e28VarM1793u = m1793u(c0423c, rect, o39Var2);
                float f = e28VarM1793u.f36621b;
                float f2 = e28VarM1793u.f36620a;
                pk9 pk9VarMo12726b = o39Var2.mo12726b(e28VarM1793u.m10804e(), c0357g.f4328U, viewTreeObserverOnGlobalLayoutListenerC0391c.getDensity());
                if (pk9VarMo12726b instanceof b07) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m1762L(pk9VarMo12726b, f2, f));
                    return;
                } else if (pk9VarMo12726b instanceof c07) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", m1762L(pk9VarMo12726b, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", m1763N(pk9VarMo12726b));
                    return;
                } else if (!(pk9VarMo12726b instanceof a07)) {
                    gm5.m12750e();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", m1764O(pk9VarMo12726b, f2, f));
                    return;
                }
            }
            return;
        }
        if (fa4.m11650l(str, "androidx.compose.ui.semantics.shapeRect")) {
            o39 o39Var3 = (o39) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4993Q);
            if (o39Var3 != null) {
                Rect rect2 = new Rect();
                c0797b4.m3275f(rect2);
                e28 e28VarM1793u2 = m1793u(c0423c, rect2, o39Var3);
                Rect rectM1762L = m1762L(o39Var3.mo12726b(e28VarM1793u2.m10804e(), c0357g.f4328U, viewTreeObserverOnGlobalLayoutListenerC0391c.getDensity()), e28VarM1793u2.f36620a, e28VarM1793u2.f36621b);
                if (rectM1762L != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectM1762L);
                    return;
                }
                return;
            }
            return;
        }
        if (fa4.m11650l(str, "androidx.compose.ui.semantics.shapeCorners")) {
            o39 o39Var4 = (o39) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4993Q);
            if (o39Var4 != null) {
                Rect rect3 = new Rect();
                c0797b4.m3275f(rect3);
                float[] fArrM1763N = m1763N(o39Var4.mo12726b(m1793u(c0423c, rect3, o39Var4).m10804e(), c0357g.f4328U, viewTreeObserverOnGlobalLayoutListenerC0391c.getDensity()));
                if (fArrM1763N != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrM1763N);
                    return;
                }
                return;
            }
            return;
        }
        if (!fa4.m11650l(str, "androidx.compose.ui.semantics.shapeRegion") || (o39Var = (o39) AbstractC0422b.m1838a(kv8Var, AbstractC0424d.f4993Q)) == null) {
            return;
        }
        Rect rect4 = new Rect();
        c0797b4.m3275f(rect4);
        e28 e28VarM1793u3 = m1793u(c0423c, rect4, o39Var);
        Region regionM1764O = m1764O(o39Var.mo12726b(e28VarM1793u3.m10804e(), c0357g.f4328U, viewTreeObserverOnGlobalLayoutListenerC0391c.getDensity()), e28VarM1793u3.f36620a, e28VarM1793u3.f36621b);
        if (regionM1764O != null) {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionM1764O);
        }
    }

    /* JADX INFO: renamed from: k */
    public final Rect m1784k(rv8 rv8Var) {
        j84 j84Var = rv8Var.f59882b;
        return m1780M(j84Var.f45185a, j84Var.f45186b, j84Var.f45187c, j84Var.f45188d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: all -> 0x0032, LOOP:0: B:33:0x007b->B:34:0x007d, LOOP_END, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002c, B:24:0x0056, B:28:0x0067, B:30:0x006f, B:32:0x0078, B:34:0x007d, B:35:0x008c, B:38:0x009b, B:39:0x00a2, B:20:0x0040, B:23:0x0047), top: B:46:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00bb -> B:14:0x002f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1785l(ContinuationImpl continuationImpl) throws Throwable {
        C0368x3d3eeeed c0368x3d3eeeed;
        u56 u56Var;
        ej0 ej0Var;
        u56 u56Var2;
        ej0 ej0Var2;
        int i;
        int i2;
        Handler handler;
        Object objM11164b;
        if (continuationImpl instanceof C0368x3d3eeeed) {
            c0368x3d3eeeed = (C0368x3d3eeeed) continuationImpl;
            int i3 = c0368x3d3eeeed.f4495e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0368x3d3eeeed.f4495e = i3 - Integer.MIN_VALUE;
            } else {
                c0368x3d3eeeed = new C0368x3d3eeeed(this, continuationImpl);
            }
        } else {
            c0368x3d3eeeed = new C0368x3d3eeeed(this, continuationImpl);
        }
        Object obj = c0368x3d3eeeed.f4493c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = c0368x3d3eeeed.f4495e;
        C3437ov c3437ov = this.f4733Q;
        try {
            if (i4 == 0) {
                AbstractC3193b.m15359b(obj);
                u56Var = new u56();
                C3211a c3211a = this.f4734R;
                c3211a.getClass();
                ej0Var = new ej0(c3211a);
                c0368x3d3eeeed.f4491a = u56Var;
                c0368x3d3eeeed.f4492b = ej0Var;
                c0368x3d3eeeed.f4495e = 1;
                objM11164b = ej0Var.m11164b(c0368x3d3eeeed);
                if (objM11164b == coroutineSingletons) {
                    ej0 ej0Var3 = ej0Var;
                    u56Var2 = u56Var;
                    obj = objM11164b;
                    ej0Var2 = ej0Var3;
                    if (!((Boolean) obj).booleanValue()) {
                        c3437ov.clear();
                        return xfa.f68157a;
                    }
                    ej0Var2.m11165c();
                    if (m1794v()) {
                        i = c3437ov.f55023c;
                        for (i2 = 0; i2 < i; i2++) {
                            C0357g c0357g = (C0357g) c3437ov.f55022b[i2];
                            m1777I(c0357g, u56Var2);
                            m1778J(c0357g);
                        }
                        u56Var2.m22475b();
                        handler = this.f4746d.getHandler();
                        if (!this.f4747d0) {
                            this.f4747d0 = true;
                            handler.post(this.f4751f0);
                        }
                    }
                    c3437ov.clear();
                    this.f4727K.m21844c();
                    this.f4728L.m21844c();
                    long j = this.f4754h;
                    c0368x3d3eeeed.f4491a = u56Var2;
                    c0368x3d3eeeed.f4492b = ej0Var2;
                    c0368x3d3eeeed.f4495e = 2;
                }
                return coroutineSingletons;
            }
            if (i4 == 1) {
                ej0Var2 = c0368x3d3eeeed.f4492b;
                u56Var2 = c0368x3d3eeeed.f4491a;
                AbstractC3193b.m15359b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    c3437ov.clear();
                    return xfa.f68157a;
                }
                ej0Var2.m11165c();
                if (m1794v()) {
                    i = c3437ov.f55023c;
                    while (i2 < i) {
                        C0357g c0357g2 = (C0357g) c3437ov.f55022b[i2];
                        m1777I(c0357g2, u56Var2);
                        m1778J(c0357g2);
                    }
                    u56Var2.m22475b();
                    handler = this.f4746d.getHandler();
                    if (!this.f4747d0 && handler != null) {
                        this.f4747d0 = true;
                        handler.post(this.f4751f0);
                    }
                }
                c3437ov.clear();
                this.f4727K.m21844c();
                this.f4728L.m21844c();
                long j2 = this.f4754h;
                c0368x3d3eeeed.f4491a = u56Var2;
                c0368x3d3eeeed.f4492b = ej0Var2;
                c0368x3d3eeeed.f4495e = 2;
            } else {
                if (i4 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ej0Var2 = c0368x3d3eeeed.f4492b;
                u56Var2 = c0368x3d3eeeed.f4491a;
                AbstractC3193b.m15359b(obj);
            }
            u56Var = u56Var2;
            ej0Var = ej0Var2;
            c0368x3d3eeeed.f4491a = u56Var;
            c0368x3d3eeeed.f4492b = ej0Var;
            c0368x3d3eeeed.f4495e = 1;
            objM11164b = ej0Var.m11164b(c0368x3d3eeeed);
            if (objM11164b == coroutineSingletons) {
                ej0 ej0Var4 = ej0Var;
                u56Var2 = u56Var;
                obj = objM11164b;
                ej0Var2 = ej0Var4;
                if (!((Boolean) obj).booleanValue()) {
                    c3437ov.clear();
                    return xfa.f68157a;
                }
                ej0Var2.m11165c();
                if (m1794v()) {
                    i = c3437ov.f55023c;
                    while (i2 < i) {
                        C0357g c0357g3 = (C0357g) c3437ov.f55022b[i2];
                        m1777I(c0357g3, u56Var2);
                        m1778J(c0357g3);
                    }
                    u56Var2.m22475b();
                    handler = this.f4746d.getHandler();
                    if (!this.f4747d0) {
                        this.f4747d0 = true;
                        handler.post(this.f4751f0);
                    }
                }
                c3437ov.clear();
                this.f4727K.m21844c();
                this.f4728L.m21844c();
                long j3 = this.f4754h;
                c0368x3d3eeeed.f4491a = u56Var2;
                c0368x3d3eeeed.f4492b = ej0Var2;
                c0368x3d3eeeed.f4495e = 2;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            c3437ov.clear();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX INFO: renamed from: m */
    public final boolean m1786m(int i, long j, boolean z) {
        C0427g c0427g;
        int i2;
        mn8 mn8Var;
        if (fa4.m11650l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            d84 d84VarM1792s = m1792s();
            if (!gq6.m12821b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    c0427g = AbstractC0424d.f5016w;
                } else {
                    if (z) {
                        gm5.m12750e();
                        return false;
                    }
                    c0427g = AbstractC0424d.f5015v;
                }
                Object[] objArr = d84VarM1792s.f35145c;
                long[] jArr = d84VarM1792s.f35143a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((j2 & 255) < 128) {
                                    rv8 rv8Var = (rv8) objArr[(i3 << 3) + i6];
                                    j84 j84Var = rv8Var.f59882b;
                                    i2 = i4;
                                    float f = j84Var.f45185a;
                                    float f2 = j84Var.f45186b;
                                    float f3 = j84Var.f45187c;
                                    float f4 = j84Var.f45188d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if (((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) && (mn8Var = (mn8) AbstractC0422b.m1838a(rv8Var.f59881a.f4974d, c0427g)) != null) {
                                        boolean z3 = mn8Var.f51590c;
                                        int i7 = z3 ? -i : i;
                                        if (i == 0 && z3) {
                                            i7 = -1;
                                        }
                                        ui3 ui3Var = mn8Var.f51588a;
                                        if (i7 < 0) {
                                            if (((Number) ui3Var.mo0a()).floatValue() > 0.0f) {
                                                z2 = true;
                                            }
                                        } else if (((Number) ui3Var.mo0a()).floatValue() < ((Number) mn8Var.f51589b.mo0a()).floatValue()) {
                                            z2 = true;
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m1787n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m1794v()) {
                m1771B(this.f4746d.getSemanticsOwner().m21750a(), this.f4745c0);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m1776H(m1792s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m1781Q();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AccessibilityEvent m1788o(int i, int i2) {
        rv8 rv8Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4746d;
        accessibilityEventObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0391c.getContext().getPackageName());
        accessibilityEventObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0391c, i);
        if (m1794v() && (rv8Var = (rv8) m1792s().m10152b(i)) != null) {
            C0423c c0423c = rv8Var.f59881a;
            accessibilityEventObtain.setPassword(c0423c.f4974d.f48471a.m17251c(AbstractC0424d.f4988L));
            gzc.m12984c(accessibilityEventObtain, fa4.m11650l(AbstractC0422b.m1838a(c0423c.f4974d, AbstractC0424d.f5008o), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.f4756i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.f4756i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.f4752g;
        if (accessibilityManager.isEnabled()) {
            this.f4756i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f4746d.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f4751f0);
        AccessibilityManager accessibilityManager = this.f4752g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: renamed from: p */
    public final AccessibilityEvent m1789p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM1788o = m1788o(i, 8192);
        if (num != null) {
            accessibilityEventM1788o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM1788o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM1788o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM1788o.getText().add(charSequence);
        }
        return accessibilityEventM1788o;
    }

    /* JADX INFO: renamed from: q */
    public final int m1790q(C0423c c0423c) {
        kv8 kv8Var = c0423c.f4974d;
        if (!kv8Var.f48471a.m17251c(AbstractC0424d.f4994a)) {
            C0427g c0427g = AbstractC0424d.f4984H;
            if (kv8Var.f48471a.m17251c(c0427g)) {
                return (int) (((cx9) kv8Var.m15706g(c0427g)).f34694a & 4294967295L);
            }
        }
        return this.f4731O;
    }

    /* JADX INFO: renamed from: r */
    public final int m1791r(C0423c c0423c) {
        kv8 kv8Var = c0423c.f4974d;
        if (!kv8Var.f48471a.m17251c(AbstractC0424d.f4994a)) {
            C0427g c0427g = AbstractC0424d.f4984H;
            if (kv8Var.f48471a.m17251c(c0427g)) {
                return (int) (((cx9) kv8Var.m15706g(c0427g)).f34694a >> 32);
            }
        }
        return this.f4731O;
    }

    /* JADX INFO: renamed from: s */
    public final d84 m1792s() {
        if (this.f4735S) {
            this.f4735S = false;
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4746d;
            this.f4737U = xwc.m24784v(viewTreeObserverOnGlobalLayoutListenerC0391c.getSemanticsOwner(), C0369xd6308273.f4496b);
            if (m1794v()) {
                final t56 t56Var = this.f4737U;
                final Resources resources = viewTreeObserverOnGlobalLayoutListenerC0391c.getContext().getResources();
                r56 r56Var = this.f4739W;
                r56Var.m20406a();
                r56 r56Var2 = this.f4740X;
                r56Var2.m20406a();
                rv8 rv8Var = (rv8) t56Var.m10152b(-1);
                C0423c c0423c = rv8Var != null ? rv8Var.f59881a : null;
                c0423c.getClass();
                ArrayList arrayListM1869b = AbstractC0428h.m1869b(c0423c, new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(t56Var.m10151a(((C0423c) obj).f4976f));
                    }
                }, new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(AbstractC3584sr.m21638p((C0423c) obj, resources));
                    }
                }, vz1.m23604J(c0423c));
                int i = 1;
                int size = arrayListM1869b.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((C0423c) arrayListM1869b.get(i - 1)).f4976f;
                        int i3 = ((C0423c) arrayListM1869b.get(i)).f4976f;
                        r56Var.m20411f(i2, i3);
                        r56Var2.m20411f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.f4737U;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[LOOP:0: B:4:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0078 A[EDGE_INSN: B:47:0x0078->B:37:0x0078 BREAK  A[LOOP:0: B:4:0x0016->B:36:0x0075], SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public final e28 m1793u(C0423c c0423c, Rect rect, o39 o39Var) {
        C0810bh c0810bh = new C0810bh(o39Var);
        C0357g c0357g = c0423c.f4973c;
        d16 d16Var = (d16) c0357g.f4335a0.f46679g;
        ea2 ea2Var = null;
        if ((d16Var.f34840d & 8) != 0) {
            loop0: while (d16Var != null) {
                if ((d16Var.f34839c & 8) == 0) {
                    if ((d16Var.f34840d & 8) != 0) {
                        break;
                        break;
                    }
                    d16Var = d16Var.f34842f;
                } else {
                    d16 d16VarM21992f = d16Var;
                    x66 x66Var = null;
                    while (d16VarM21992f != null) {
                        if (d16VarM21992f instanceof ov8) {
                            ((ov8) d16VarM21992f).mo787H0(c0810bh);
                            if (c0810bh.f8528a) {
                                ea2Var = d16VarM21992f;
                                break loop0;
                            }
                        } else if ((d16VarM21992f.f34839c & 8) != 0 && (d16VarM21992f instanceof fa2)) {
                            int i = 0;
                            for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                if ((d16Var2.f34839c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        d16VarM21992f = d16Var2;
                                    } else {
                                        if (x66Var == null) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (d16VarM21992f != null) {
                                            x66Var.m24305c(d16VarM21992f);
                                            d16VarM21992f = null;
                                        }
                                        x66Var.m24305c(d16Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        d16VarM21992f = te1.m21992f(x66Var);
                    }
                    if ((d16Var.f34840d & 8) != 0) {
                        break;
                    }
                    d16Var = d16Var.f34842f;
                }
            }
        }
        ea2 ea2Var2 = (ov8) ea2Var;
        if (ea2Var2 == null || !((d16) ea2Var2).f34837a.f34836I) {
            return bq1.m4050Z((AbstractC0362l) c0357g.f4335a0.f46677e, false);
        }
        AbstractC0362l abstractC0362lM21978K = te1.m21978K(ea2Var2);
        e28 e28VarMo1670Q = bq1.m4054e0(abstractC0362lM21978K).mo1670Q(abstractC0362lM21978K, false);
        Rect rectM1780M = m1780M(e28VarMo1670Q.f36620a, e28VarMo1670Q.f36621b, e28VarMo1670Q.f36622c, e28VarMo1670Q.f36623d);
        float f = rectM1780M.left - rect.left;
        float f2 = rectM1780M.top - rect.top;
        return new e28(f, f2, rectM1780M.width() + f, rectM1780M.height() + f2);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m1794v() {
        AccessibilityManager accessibilityManager = this.f4752g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f4756i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.f4756i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    /* JADX INFO: renamed from: w */
    public final void m1795w(C0357g c0357g) {
        if (this.f4733Q.add(c0357g)) {
            this.f4734R.mo4677k(xfa.f68157a);
        }
    }
}
