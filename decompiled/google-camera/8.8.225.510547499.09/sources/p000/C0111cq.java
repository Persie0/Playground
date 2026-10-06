package p000;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.android.material.snackbar.VMX.rgoX;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.util.DesugarCollections;

/* JADX INFO: renamed from: cq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0111cq {

    /* JADX INFO: renamed from: B */
    private final aea f8769B;

    /* JADX INFO: renamed from: C */
    private final aea f8770C;

    /* JADX INFO: renamed from: D */
    private final aea f8771D;

    /* JADX INFO: renamed from: E */
    private final aea f8772E;

    /* JADX INFO: renamed from: F */
    private final C0085cd f8773F;

    /* JADX INFO: renamed from: G */
    private boolean f8774G;

    /* JADX INFO: renamed from: H */
    private ArrayList f8775H;

    /* JADX INFO: renamed from: I */
    private ArrayList f8776I;

    /* JADX INFO: renamed from: J */
    private ArrayList f8777J;

    /* JADX INFO: renamed from: K */
    private final Runnable f8778K;

    /* JADX INFO: renamed from: L */
    private final C0121d f8779L;

    /* JADX INFO: renamed from: M */
    private final AmbientMode.AmbientController f8780M;

    /* JADX INFO: renamed from: b */
    ArrayList f8782b;

    /* JADX INFO: renamed from: d */
    public C0913pr f8784d;

    /* JADX INFO: renamed from: g */
    public final CopyOnWriteArrayList f8787g;

    /* JADX INFO: renamed from: h */
    int f8788h;

    /* JADX INFO: renamed from: i */
    public C0086ce f8789i;

    /* JADX INFO: renamed from: j */
    public AbstractC0083cb f8790j;

    /* JADX INFO: renamed from: k */
    public ComponentCallbacksC0077bw f8791k;

    /* JADX INFO: renamed from: l */
    ComponentCallbacksC0077bw f8792l;

    /* JADX INFO: renamed from: m */
    public AbstractC0919px f8793m;

    /* JADX INFO: renamed from: n */
    public AbstractC0919px f8794n;

    /* JADX INFO: renamed from: o */
    public AbstractC0919px f8795o;

    /* JADX INFO: renamed from: p */
    ArrayDeque f8796p;

    /* JADX INFO: renamed from: q */
    public boolean f8797q;

    /* JADX INFO: renamed from: r */
    public boolean f8798r;

    /* JADX INFO: renamed from: s */
    public boolean f8799s;

    /* JADX INFO: renamed from: t */
    public boolean f8800t;

    /* JADX INFO: renamed from: u */
    public C0113cs f8801u;

    /* JADX INFO: renamed from: v */
    public final bck f8802v;

    /* JADX INFO: renamed from: x */
    private boolean f8804x;

    /* JADX INFO: renamed from: y */
    private ArrayList f8805y;

    /* JADX INFO: renamed from: w */
    private final ArrayList f8803w = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C0116cv f8781a = new C0116cv();

    /* JADX INFO: renamed from: c */
    public final LayoutInflaterFactory2C0087cf f8783c = new LayoutInflaterFactory2C0087cf(this);

    /* JADX INFO: renamed from: e */
    public final AbstractC0909pn f8785e = new C0090ci(this);

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f8786f = new AtomicInteger();

    /* JADX INFO: renamed from: z */
    private final Map f8806z = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: A */
    private final Map f8768A = DesugarCollections.synchronizedMap(new HashMap());

    public C0111cq() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.f8802v = new bck(this);
        this.f8787g = new CopyOnWriteArrayList();
        this.f8769B = new C0078bx(this, 2);
        this.f8770C = new C0078bx(this, 3);
        this.f8771D = new C0078bx(this, 4);
        this.f8772E = new C0078bx(this, 5);
        this.f8780M = new AmbientMode.AmbientController(this);
        this.f8788h = -1;
        this.f8773F = new C0091cj(this);
        this.f8779L = new C0121d();
        this.f8796p = new ArrayDeque();
        this.f8778K = new RunnableC0059be(this, 6);
    }

    /* JADX INFO: renamed from: S */
    public static boolean m5275S(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m5276X(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (componentCallbacksC0077bw.f4582J && componentCallbacksC0077bw.f4583K) {
            return true;
        }
        boolean zM5276X = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw2 : componentCallbacksC0077bw.f4573A.f8781a.m5549e()) {
            if (componentCallbacksC0077bw2 != null) {
                zM5276X = m5276X(componentCallbacksC0077bw2);
            }
            if (zM5276X) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Y */
    static final boolean m5277Y(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (componentCallbacksC0077bw == null) {
            return true;
        }
        return componentCallbacksC0077bw.f4583K && (componentCallbacksC0077bw.f4623y == null || m5277Y(componentCallbacksC0077bw.f4574B));
    }

    /* JADX INFO: renamed from: aa */
    static final void m5278aa(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(componentCallbacksC0077bw);
        }
        if (componentCallbacksC0077bw.f4578F) {
            componentCallbacksC0077bw.f4578F = false;
            componentCallbacksC0077bw.f4591S = !componentCallbacksC0077bw.f4591S;
        }
    }

    /* JADX INFO: renamed from: ag */
    private final ViewGroup m5279ag(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        ViewGroup viewGroup = componentCallbacksC0077bw.f4585M;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (componentCallbacksC0077bw.f4576D > 0 && this.f8790j.mo2639b()) {
            View viewMo2638a = this.f8790j.mo2638a(componentCallbacksC0077bw.f4576D);
            if (viewMo2638a instanceof ViewGroup) {
                return (ViewGroup) viewMo2638a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ah */
    private final Set m5280ah() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f8781a.m5548d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((ComponentCallbacksC0077bw) ((jew) it.next()).f33848c).f4585M;
            if (viewGroup != null) {
                m5321af();
                hashSet.add(C0134dm.m6387i(viewGroup));
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ai */
    private final void m5281ai() {
        if (m5313V()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: renamed from: aj */
    private final void m5282aj() {
        this.f8804x = false;
        this.f8776I.clear();
        this.f8775H.clear();
    }

    /* JADX INFO: renamed from: ak */
    private final void m5283ak() {
        if (this.f8774G) {
            this.f8774G = false;
            m5289aq();
        }
    }

    /* JADX INFO: renamed from: al */
    private final void m5284al() {
        Iterator it = m5280ah().iterator();
        while (it.hasNext()) {
            ((C0134dm) it.next()).m6392d();
        }
    }

    /* JADX INFO: renamed from: am */
    private final void m5285am(boolean z) {
        if (this.f8804x) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f8789i == null) {
            if (!this.f8800t) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f8789i.f5400d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m5281ai();
        }
        if (this.f8775H == null) {
            this.f8775H = new ArrayList();
            this.f8776I = new ArrayList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x015a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57, types: [bw] */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX INFO: renamed from: an */
    private final void m5286an(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        int i3;
        ?? r6;
        byte[] bArr;
        ArrayList arrayList3 = arrayList;
        boolean z = ((C0048au) arrayList3.get(i)).f9941s;
        ArrayList arrayList4 = this.f8777J;
        if (arrayList4 == null) {
            this.f8777J = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.f8777J.addAll(this.f8781a.m5550f());
        int i4 = i;
        boolean z2 = false;
        ?? r7 = this.f8792l;
        while (true) {
            byte[] bArr2 = null;
            if (i4 >= i2) {
                this.f8777J.clear();
                if (!z && this.f8788h > 0) {
                    for (int i5 = i; i5 < i2; i5++) {
                        ArrayList arrayList5 = ((C0048au) arrayList.get(i5)).f9926d;
                        int size = arrayList5.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ComponentCallbacksC0077bw componentCallbacksC0077bw = ((C0117cw) arrayList5.get(i6)).f9850b;
                            if (componentCallbacksC0077bw != null && componentCallbacksC0077bw.f4623y != null) {
                                this.f8781a.m5556l(m5319ad(componentCallbacksC0077bw));
                            }
                        }
                    }
                }
                for (int i7 = i; i7 < i2; i7++) {
                    C0048au c0048au = (C0048au) arrayList.get(i7);
                    if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                        c0048au.m2014a(-1);
                        for (int size2 = c0048au.f9926d.size() - 1; size2 >= 0; size2--) {
                            C0117cw c0117cw = (C0117cw) c0048au.f9926d.get(size2);
                            ComponentCallbacksC0077bw componentCallbacksC0077bw2 = c0117cw.f9850b;
                            if (componentCallbacksC0077bw2 != null) {
                                componentCallbacksC0077bw2.f4617s = false;
                                componentCallbacksC0077bw2.m3125t(true);
                                switch (c0048au.f9931i) {
                                    case 4097:
                                        i3 = 8194;
                                        break;
                                    case 4099:
                                        i3 = 4099;
                                        break;
                                    case 4100:
                                        i3 = 8197;
                                        break;
                                    case 8194:
                                        i3 = 4097;
                                        break;
                                    case 8197:
                                        i3 = 4100;
                                        break;
                                    default:
                                        i3 = 0;
                                        break;
                                }
                                componentCallbacksC0077bw2.m3124s(i3);
                                componentCallbacksC0077bw2.m3126u(c0048au.f9940r, c0048au.f9939q);
                            }
                            switch (c0117cw.f9849a) {
                                case 1:
                                    componentCallbacksC0077bw2.m3122q(c0117cw.f9852d, c0117cw.f9853e, c0117cw.f9854f, c0117cw.f9855g);
                                    c0048au.f2399a.m5303K(componentCallbacksC0077bw2, true);
                                    c0048au.f2399a.m5301I(componentCallbacksC0077bw2);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0117cw.f9849a);
                                case 3:
                                    componentCallbacksC0077bw2.m3122q(c0117cw.f9852d, c0117cw.f9853e, c0117cw.f9854f, c0117cw.f9855g);
                                    c0048au.f2399a.m5318ac(componentCallbacksC0077bw2);
                                    break;
                                case 4:
                                    componentCallbacksC0077bw2.m3122q(c0117cw.f9852d, c0117cw.f9853e, c0117cw.f9854f, c0117cw.f9855g);
                                    C0111cq c0111cq = c0048au.f2399a;
                                    m5278aa(componentCallbacksC0077bw2);
                                    break;
                                case 5:
                                    componentCallbacksC0077bw2.m3122q(c0117cw.f9852d, c0117cw.f9853e, c0117cw.f9854f, c0117cw.f9855g);
                                    c0048au.f2399a.m5303K(componentCallbacksC0077bw2, true);
                                    c0048au.f2399a.m5298F(componentCallbacksC0077bw2);
                                    break;
                                case 6:
                                    componentCallbacksC0077bw2.m3122q(c0117cw.f9852d, c0117cw.f9853e, c0117cw.f9854f, c0117cw.f9855g);
                                    c0048au.f2399a.m5330l(componentCallbacksC0077bw2);
                                    break;
                                case 7:
                                    componentCallbacksC0077bw2.m3122q(c0117cw.f9852d, c0117cw.f9853e, c0117cw.f9854f, c0117cw.f9855g);
                                    c0048au.f2399a.m5303K(componentCallbacksC0077bw2, true);
                                    c0048au.f2399a.m5331m(componentCallbacksC0077bw2);
                                    break;
                                case 8:
                                    c0048au.f2399a.m5305M(null);
                                    break;
                                case 9:
                                    c0048au.f2399a.m5305M(componentCallbacksC0077bw2);
                                    break;
                                case 10:
                                    c0048au.f2399a.m5304L(componentCallbacksC0077bw2, c0117cw.f9856h);
                                    break;
                            }
                        }
                    } else {
                        c0048au.m2014a(1);
                        int size3 = c0048au.f9926d.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            C0117cw c0117cw2 = (C0117cw) c0048au.f9926d.get(i8);
                            ComponentCallbacksC0077bw componentCallbacksC0077bw3 = c0117cw2.f9850b;
                            if (componentCallbacksC0077bw3 != null) {
                                componentCallbacksC0077bw3.f4617s = false;
                                componentCallbacksC0077bw3.m3125t(false);
                                componentCallbacksC0077bw3.m3124s(c0048au.f9931i);
                                componentCallbacksC0077bw3.m3126u(c0048au.f9939q, c0048au.f9940r);
                            }
                            switch (c0117cw2.f9849a) {
                                case 1:
                                    componentCallbacksC0077bw3.m3122q(c0117cw2.f9852d, c0117cw2.f9853e, c0117cw2.f9854f, c0117cw2.f9855g);
                                    c0048au.f2399a.m5303K(componentCallbacksC0077bw3, false);
                                    c0048au.f2399a.m5318ac(componentCallbacksC0077bw3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0117cw2.f9849a);
                                case 3:
                                    componentCallbacksC0077bw3.m3122q(c0117cw2.f9852d, c0117cw2.f9853e, c0117cw2.f9854f, c0117cw2.f9855g);
                                    c0048au.f2399a.m5301I(componentCallbacksC0077bw3);
                                    break;
                                case 4:
                                    componentCallbacksC0077bw3.m3122q(c0117cw2.f9852d, c0117cw2.f9853e, c0117cw2.f9854f, c0117cw2.f9855g);
                                    c0048au.f2399a.m5298F(componentCallbacksC0077bw3);
                                    break;
                                case 5:
                                    componentCallbacksC0077bw3.m3122q(c0117cw2.f9852d, c0117cw2.f9853e, c0117cw2.f9854f, c0117cw2.f9855g);
                                    c0048au.f2399a.m5303K(componentCallbacksC0077bw3, false);
                                    C0111cq c0111cq2 = c0048au.f2399a;
                                    m5278aa(componentCallbacksC0077bw3);
                                    break;
                                case 6:
                                    componentCallbacksC0077bw3.m3122q(c0117cw2.f9852d, c0117cw2.f9853e, c0117cw2.f9854f, c0117cw2.f9855g);
                                    c0048au.f2399a.m5331m(componentCallbacksC0077bw3);
                                    break;
                                case 7:
                                    componentCallbacksC0077bw3.m3122q(c0117cw2.f9852d, c0117cw2.f9853e, c0117cw2.f9854f, c0117cw2.f9855g);
                                    c0048au.f2399a.m5303K(componentCallbacksC0077bw3, false);
                                    c0048au.f2399a.m5330l(componentCallbacksC0077bw3);
                                    break;
                                case 8:
                                    c0048au.f2399a.m5305M(componentCallbacksC0077bw3);
                                    break;
                                case 9:
                                    c0048au.f2399a.m5305M(null);
                                    break;
                                case 10:
                                    c0048au.f2399a.m5304L(componentCallbacksC0077bw3, c0117cw2.f9857i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i9 = i; i9 < i2; i9++) {
                    C0048au c0048au2 = (C0048au) arrayList.get(i9);
                    if (zBooleanValue) {
                        for (int size4 = c0048au2.f9926d.size() - 1; size4 >= 0; size4--) {
                            ComponentCallbacksC0077bw componentCallbacksC0077bw4 = ((C0117cw) c0048au2.f9926d.get(size4)).f9850b;
                            if (componentCallbacksC0077bw4 != null) {
                                m5319ad(componentCallbacksC0077bw4).m13002e();
                            }
                        }
                    } else {
                        ArrayList arrayList6 = c0048au2.f9926d;
                        int size5 = arrayList6.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            ComponentCallbacksC0077bw componentCallbacksC0077bw5 = ((C0117cw) arrayList6.get(i10)).f9850b;
                            if (componentCallbacksC0077bw5 != null) {
                                m5319ad(componentCallbacksC0077bw5).m13002e();
                            }
                        }
                    }
                }
                m5299G(this.f8788h, true);
                HashSet<C0134dm> hashSet = new HashSet();
                for (int i11 = i; i11 < i2; i11++) {
                    ArrayList arrayList7 = ((C0048au) arrayList.get(i11)).f9926d;
                    int size6 = arrayList7.size();
                    for (int i12 = 0; i12 < size6; i12++) {
                        ComponentCallbacksC0077bw componentCallbacksC0077bw6 = ((C0117cw) arrayList7.get(i12)).f9850b;
                        if (componentCallbacksC0077bw6 != null && (viewGroup = componentCallbacksC0077bw6.f4585M) != null) {
                            hashSet.add(C0134dm.m6385b(viewGroup, this));
                        }
                    }
                }
                for (C0134dm c0134dm : hashSet) {
                    c0134dm.f12011d = zBooleanValue;
                    c0134dm.m6393e();
                    c0134dm.m6391c();
                }
                for (int i13 = i; i13 < i2; i13++) {
                    C0048au c0048au3 = (C0048au) arrayList.get(i13);
                    if (((Boolean) arrayList2.get(i13)).booleanValue() && c0048au3.f2401c >= 0) {
                        c0048au3.f2401c = -1;
                    }
                }
                return;
            }
            C0048au c0048au4 = (C0048au) arrayList3.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                ArrayList arrayList8 = this.f8777J;
                int size7 = c0048au4.f9926d.size() - 1;
                while (size7 >= 0) {
                    r6 = r7;
                    C0117cw c0117cw3 = (C0117cw) c0048au4.f9926d.get(size7);
                    switch (c0117cw3.f9849a) {
                        case 1:
                        case 7:
                            arrayList8.remove(c0117cw3.f9850b);
                            break;
                        case 3:
                        case 6:
                            arrayList8.add(c0117cw3.f9850b);
                            break;
                        case 8:
                            r6 = 0;
                            break;
                        case 9:
                            r6 = c0117cw3.f9850b;
                            break;
                        case 10:
                            c0117cw3.f9857i = c0117cw3.f9856h;
                            break;
                    }
                    size7--;
                    r6 = r6;
                }
            } else {
                ArrayList arrayList9 = this.f8777J;
                int i14 = 0;
                r6 = r7;
                while (i14 < c0048au4.f9926d.size()) {
                    C0117cw c0117cw4 = (C0117cw) c0048au4.f9926d.get(i14);
                    switch (c0117cw4.f9849a) {
                        case 1:
                        case 7:
                            arrayList9.add(c0117cw4.f9850b);
                            break;
                        case 2:
                            ComponentCallbacksC0077bw componentCallbacksC0077bw7 = c0117cw4.f9850b;
                            int i15 = componentCallbacksC0077bw7.f4576D;
                            int size8 = arrayList9.size() - 1;
                            boolean z3 = false;
                            r6 = r6;
                            while (size8 >= 0) {
                                ComponentCallbacksC0077bw componentCallbacksC0077bw8 = (ComponentCallbacksC0077bw) arrayList9.get(size8);
                                if (componentCallbacksC0077bw8.f4576D != i15) {
                                    i15 = i15;
                                } else if (componentCallbacksC0077bw8 == componentCallbacksC0077bw7) {
                                    i15 = i15;
                                    z3 = true;
                                } else {
                                    if (componentCallbacksC0077bw8 == r6) {
                                        bArr = null;
                                        c0048au4.f9926d.add(i14, new C0117cw(9, componentCallbacksC0077bw8, null));
                                        i14++;
                                        r6 = 0;
                                    } else {
                                        bArr = null;
                                        r6 = r6;
                                    }
                                    C0117cw c0117cw5 = new C0117cw(3, componentCallbacksC0077bw8, bArr);
                                    c0117cw5.f9852d = c0117cw4.f9852d;
                                    c0117cw5.f9854f = c0117cw4.f9854f;
                                    c0117cw5.f9853e = c0117cw4.f9853e;
                                    c0117cw5.f9855g = c0117cw4.f9855g;
                                    c0048au4.f9926d.add(i14, c0117cw5);
                                    arrayList9.remove(componentCallbacksC0077bw8);
                                    i14++;
                                }
                                size8--;
                                i15 = i15;
                                r6 = r6;
                            }
                            if (z3) {
                                c0048au4.f9926d.remove(i14);
                                i14--;
                            } else {
                                c0117cw4.f9849a = 1;
                                c0117cw4.f9851c = true;
                                arrayList9.add(componentCallbacksC0077bw7);
                            }
                            break;
                        case 3:
                        case 6:
                            arrayList9.remove(c0117cw4.f9850b);
                            ComponentCallbacksC0077bw componentCallbacksC0077bw9 = c0117cw4.f9850b;
                            if (componentCallbacksC0077bw9 == r6) {
                                c0048au4.f9926d.add(i14, new C0117cw(9, componentCallbacksC0077bw9));
                                i14++;
                                r6 = bArr2;
                            }
                            break;
                        case 8:
                            c0048au4.f9926d.add(i14, new C0117cw(9, r6, bArr2));
                            c0117cw4.f9851c = true;
                            i14++;
                            r6 = c0117cw4.f9850b;
                            break;
                    }
                    i14++;
                    bArr2 = null;
                    r6 = r6;
                }
            }
            if (z2) {
                r6 = r7;
                z2 = true;
            } else {
                r6 = r7;
                if (c0048au4.f9932j) {
                    r6 = r7;
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            i4++;
            arrayList3 = arrayList;
            r7 = r6;
        }
    }

    /* JADX INFO: renamed from: ao */
    private final void m5287ao(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0048au) arrayList.get(i)).f9941s) {
                if (i2 != i) {
                    m5286an(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0048au) arrayList.get(i2)).f9941s) {
                        i2++;
                    }
                }
                m5286an(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m5286an(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: ap */
    private final void m5288ap(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        ViewGroup viewGroupM5279ag = m5279ag(componentCallbacksC0077bw);
        if (viewGroupM5279ag == null || componentCallbacksC0077bw.m3110e() + componentCallbacksC0077bw.m3111f() + componentCallbacksC0077bw.m3112g() + componentCallbacksC0077bw.m3113h() <= 0) {
            return;
        }
        if (viewGroupM5279ag.getTag(C0100R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupM5279ag.setTag(C0100R.id.visible_removing_fragment_view_tag, componentCallbacksC0077bw);
        }
        ((ComponentCallbacksC0077bw) viewGroupM5279ag.getTag(C0100R.id.visible_removing_fragment_view_tag)).m3125t(componentCallbacksC0077bw.m3127v());
    }

    /* JADX INFO: renamed from: aq */
    private final void m5289aq() {
        Iterator it = this.f8781a.m5548d().iterator();
        while (it.hasNext()) {
            m5320ae((jew) it.next());
        }
    }

    /* JADX INFO: renamed from: ar */
    private final void m5290ar(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0129dh());
        C0086ce c0086ce = this.f8789i;
        if (c0086ce == null) {
            try {
                m5295C("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            ((C0079by) c0086ce).f4732a.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    /* JADX INFO: renamed from: f */
    public static ComponentCallbacksC0077bw m5291f(View view) {
        while (view != null) {
            ComponentCallbacksC0077bw componentCallbacksC0077bwM5292g = m5292g(view);
            if (componentCallbacksC0077bwM5292g != null) {
                return componentCallbacksC0077bwM5292g;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    static ComponentCallbacksC0077bw m5292g(View view) {
        Object tag = view.getTag(C0100R.id.fragment_container_view_tag);
        if (tag instanceof ComponentCallbacksC0077bw) {
            return (ComponentCallbacksC0077bw) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final void m5293A(int i) {
        try {
            this.f8804x = true;
            for (jew jewVar : this.f8781a.f9744b.values()) {
                if (jewVar != null) {
                    jewVar.f33846a = i;
                }
            }
            m5299G(i, false);
            Iterator it = m5280ah().iterator();
            while (it.hasNext()) {
                ((C0134dm) it.next()).m6392d();
            }
            this.f8804x = false;
            m5317ab(true);
        } catch (Throwable th) {
            this.f8804x = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m5294B() {
        this.f8799s = true;
        this.f8801u.f9211g = true;
        m5293A(4);
    }

    /* JADX INFO: renamed from: C */
    public final void m5295C(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        C0116cv c0116cv = this.f8781a;
        if (!c0116cv.f9744b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (jew jewVar : c0116cv.f9744b.values()) {
                printWriter.print(str);
                if (jewVar != null) {
                    String strValueOf = String.valueOf(str);
                    Object obj = jewVar.f33848c;
                    printWriter.println(obj);
                    ((ComponentCallbacksC0077bw) obj).dump(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = c0116cv.f9743a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) c0116cv.f9743a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0077bw.toString());
            }
        }
        ArrayList arrayList = this.f8805y;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println(HEePJw.isbfpMXvrSTyXTG);
            for (int i2 = 0; i2 < size2; i2++) {
                ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) this.f8805y.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0077bw2.toString());
            }
        }
        ArrayList arrayList2 = this.f8782b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                String strValueOf2 = String.valueOf(str);
                C0048au c0048au = (C0048au) this.f8782b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(pIeXJQLZLfgIN.vlDLCNAbAP);
                printWriter.println(c0048au.toString());
                c0048au.m2018e(strValueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f8786f.get());
        synchronized (this.f8803w) {
            int size4 = this.f8803w.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    InterfaceC0096co interfaceC0096co = (InterfaceC0096co) this.f8803w.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(interfaceC0096co);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f8789i);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f8790j);
        if (this.f8791k != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f8791k);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f8788h);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f8798r);
        printWriter.print(" mStopped=");
        printWriter.print(this.f8799s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f8800t);
        if (this.f8797q) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f8797q);
        }
    }

    /* JADX INFO: renamed from: D */
    final void m5296D(InterfaceC0096co interfaceC0096co, boolean z) {
        if (!z) {
            if (this.f8789i == null) {
                if (!this.f8800t) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m5281ai();
        }
        synchronized (this.f8803w) {
            if (this.f8789i == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.f8803w.add(interfaceC0096co);
            synchronized (this.f8803w) {
                if (this.f8803w.size() == 1) {
                    this.f8789i.f5400d.removeCallbacks(this.f8778K);
                    this.f8789i.f5400d.post(this.f8778K);
                    m5306N();
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    final void m5297E(InterfaceC0096co interfaceC0096co, boolean z) {
        if (z && (this.f8789i == null || this.f8800t)) {
            return;
        }
        m5285am(z);
        interfaceC0096co.mo2020g(this.f8775H, this.f8776I);
        this.f8804x = true;
        try {
            m5287ao(this.f8775H, this.f8776I);
            m5282aj();
            m5306N();
            m5283ak();
            this.f8781a.m5552h();
        } catch (Throwable th) {
            m5282aj();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    final void m5298F(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(componentCallbacksC0077bw);
        }
        if (componentCallbacksC0077bw.f4578F) {
            return;
        }
        componentCallbacksC0077bw.f4578F = true;
        componentCallbacksC0077bw.f4591S = true ^ componentCallbacksC0077bw.f4591S;
        m5288ap(componentCallbacksC0077bw);
    }

    /* JADX INFO: renamed from: G */
    final void m5299G(int i, boolean z) {
        C0086ce c0086ce;
        if (this.f8789i == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.f8788h) {
            this.f8788h = i;
            C0116cv c0116cv = this.f8781a;
            ArrayList arrayList = c0116cv.f9743a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                jew jewVar = (jew) c0116cv.f9744b.get(((ComponentCallbacksC0077bw) arrayList.get(i2)).f4609k);
                if (jewVar != null) {
                    jewVar.m13002e();
                }
            }
            for (jew jewVar2 : c0116cv.f9744b.values()) {
                if (jewVar2 != null) {
                    jewVar2.m13002e();
                    ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) jewVar2.f33848c;
                    if (componentCallbacksC0077bw.f4616r && !componentCallbacksC0077bw.m3128w()) {
                        boolean z2 = componentCallbacksC0077bw.f4617s;
                        c0116cv.m5557m(jewVar2);
                    }
                }
            }
            m5289aq();
            if (this.f8797q && (c0086ce = this.f8789i) != null && this.f8788h == 7) {
                c0086ce.mo3178e();
                this.f8797q = false;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m5300H() {
        if (this.f8789i == null) {
            return;
        }
        this.f8798r = false;
        this.f8799s = false;
        this.f8801u.f9211g = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null) {
                componentCallbacksC0077bw.f4573A.m5300H();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    final void m5301I(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(componentCallbacksC0077bw);
            sb.append(" nesting=");
            sb.append(componentCallbacksC0077bw.f4622x);
        }
        boolean z = !componentCallbacksC0077bw.m3128w();
        if (!componentCallbacksC0077bw.f4579G || z) {
            this.f8781a.m5553i(componentCallbacksC0077bw);
            if (m5276X(componentCallbacksC0077bw)) {
                this.f8797q = true;
            }
            componentCallbacksC0077bw.f4616r = true;
            m5288ap(componentCallbacksC0077bw);
        }
    }

    /* JADX INFO: renamed from: J */
    final void m5302J(Parcelable parcelable) {
        jew jewVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f8789i.f5399c.getClassLoader());
                this.f8768A.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f8789i.f5399c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        C0116cv c0116cv = this.f8781a;
        c0116cv.f9745c.clear();
        c0116cv.f9745c.putAll(map);
        C0112cr c0112cr = (C0112cr) bundle3.getParcelable("state");
        if (c0112cr == null) {
            return;
        }
        this.f8781a.f9744b.clear();
        ArrayList arrayList = c0112cr.f9058a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundleM5545a = this.f8781a.m5545a((String) arrayList.get(i), null);
            if (bundleM5545a != null) {
                ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) this.f8801u.f9206b.get(((C0115cu) bundleM5545a.getParcelable("state")).f9568b);
                if (componentCallbacksC0077bw != null) {
                    if (m5275S(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(componentCallbacksC0077bw);
                    }
                    jewVar = new jew(this.f8802v, this.f8781a, componentCallbacksC0077bw, bundleM5545a, null, null, null);
                } else {
                    jewVar = new jew(this.f8802v, this.f8781a, this.f8789i.f5399c.getClassLoader(), m5326h(), bundleM5545a, null, null, null);
                }
                Object obj = jewVar.f33848c;
                ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) obj;
                componentCallbacksC0077bw2.f4605g = bundleM5545a;
                componentCallbacksC0077bw2.f4623y = this;
                if (m5275S(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(componentCallbacksC0077bw2.f4609k);
                    sb2.append("): ");
                    sb2.append(obj);
                }
                jewVar.m13003f(this.f8789i.f5399c.getClassLoader());
                this.f8781a.m5556l(jewVar);
                jewVar.f33846a = this.f8788h;
            }
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw3 : new ArrayList(this.f8801u.f9206b.values())) {
            if (!this.f8781a.m5554j(componentCallbacksC0077bw3.f4609k)) {
                if (m5275S(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(componentCallbacksC0077bw3);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(c0112cr.f9058a);
                }
                this.f8801u.m5449e(componentCallbacksC0077bw3);
                componentCallbacksC0077bw3.f4623y = this;
                jew jewVar2 = new jew(this.f8802v, this.f8781a, componentCallbacksC0077bw3, null, null, null);
                jewVar2.f33846a = 1;
                jewVar2.m13002e();
                componentCallbacksC0077bw3.f4616r = true;
                jewVar2.m13002e();
            }
        }
        C0116cv c0116cv2 = this.f8781a;
        ArrayList<String> arrayList2 = c0112cr.f9059b;
        c0116cv2.f9743a.clear();
        if (arrayList2 != null) {
            for (String str3 : arrayList2) {
                ComponentCallbacksC0077bw componentCallbacksC0077bwM5546b = c0116cv2.m5546b(str3);
                if (componentCallbacksC0077bwM5546b == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str3 + ")");
                }
                if (m5275S(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreSaveState: added (");
                    sb4.append(str3);
                    sb4.append("): ");
                    sb4.append(componentCallbacksC0077bwM5546b);
                }
                c0116cv2.m5551g(componentCallbacksC0077bwM5546b);
            }
        }
        C0049av[] c0049avArr = c0112cr.f9060c;
        if (c0049avArr != null) {
            this.f8782b = new ArrayList(c0049avArr.length);
            int i2 = 0;
            while (true) {
                C0049av[] c0049avArr2 = c0112cr.f9060c;
                if (i2 >= c0049avArr2.length) {
                    break;
                }
                C0049av c0049av = c0049avArr2[i2];
                C0048au c0048au = new C0048au(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = c0049av.f2460a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    C0117cw c0117cw = new C0117cw();
                    int i5 = i3 + 1;
                    c0117cw.f9849a = iArr[i3];
                    if (m5275S(2)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Instantiate ");
                        sb5.append(c0048au);
                        sb5.append(" op #");
                        sb5.append(i4);
                        sb5.append(" base fragment #");
                        sb5.append(c0049av.f2460a[i5]);
                    }
                    c0117cw.f9856h = akr.values()[c0049av.f2462c[i4]];
                    c0117cw.f9857i = akr.values()[c0049av.f2463d[i4]];
                    int[] iArr2 = c0049av.f2460a;
                    int i6 = i5 + 1;
                    c0117cw.f9851c = iArr2[i5] != 0;
                    int i7 = i6 + 1;
                    int i8 = iArr2[i6];
                    c0117cw.f9852d = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr2[i7];
                    c0117cw.f9853e = i10;
                    int i11 = i9 + 1;
                    int i12 = iArr2[i9];
                    c0117cw.f9854f = i12;
                    int i13 = iArr2[i11];
                    c0117cw.f9855g = i13;
                    c0048au.f9927e = i8;
                    c0048au.f9928f = i10;
                    c0048au.f9929g = i12;
                    c0048au.f9930h = i13;
                    c0048au.m5696l(c0117cw);
                    i4++;
                    i3 = i11 + 1;
                }
                c0048au.f9931i = c0049av.f2464e;
                c0048au.f9934l = c0049av.f2465f;
                c0048au.f9932j = true;
                c0048au.f9935m = c0049av.f2467h;
                c0048au.f9936n = c0049av.f2468i;
                c0048au.f9937o = c0049av.f2469j;
                c0048au.f9938p = c0049av.f2470k;
                c0048au.f9939q = c0049av.f2471l;
                c0048au.f9940r = c0049av.f2472m;
                c0048au.f9941s = c0049av.f2473n;
                c0048au.f2401c = c0049av.f2466g;
                for (int i14 = 0; i14 < c0049av.f2461b.size(); i14++) {
                    String str4 = (String) c0049av.f2461b.get(i14);
                    if (str4 != null) {
                        ((C0117cw) c0048au.f9926d.get(i14)).f9850b = m5323c(str4);
                    }
                }
                c0048au.m2014a(1);
                if (m5275S(2)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("restoreAllState: back stack #");
                    sb6.append(i2);
                    sb6.append(" (index ");
                    sb6.append(c0048au.f2401c);
                    sb6.append("): ");
                    sb6.append(c0048au);
                    PrintWriter printWriter = new PrintWriter(new C0129dh());
                    c0048au.m2019f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f8782b.add(c0048au);
                i2++;
            }
        } else {
            this.f8782b = null;
        }
        this.f8786f.set(c0112cr.f9061d);
        String str5 = c0112cr.f9062e;
        if (str5 != null) {
            ComponentCallbacksC0077bw componentCallbacksC0077bwM5323c = m5323c(str5);
            this.f8792l = componentCallbacksC0077bwM5323c;
            m5340v(componentCallbacksC0077bwM5323c);
        }
        ArrayList arrayList3 = c0112cr.f9063f;
        if (arrayList3 != null) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                this.f8806z.put((String) arrayList3.get(i15), (C0051ax) c0112cr.f9064g.get(i15));
            }
        }
        this.f8796p = new ArrayDeque(c0112cr.f9065h);
    }

    /* JADX INFO: renamed from: K */
    final void m5303K(ComponentCallbacksC0077bw componentCallbacksC0077bw, boolean z) {
        ViewGroup viewGroupM5279ag = m5279ag(componentCallbacksC0077bw);
        if (viewGroupM5279ag == null || !(viewGroupM5279ag instanceof C0084cc)) {
            return;
        }
        ((C0084cc) viewGroupM5279ag).f5042a = !z;
    }

    /* JADX INFO: renamed from: L */
    final void m5304L(ComponentCallbacksC0077bw componentCallbacksC0077bw, akr akrVar) {
        if (componentCallbacksC0077bw.equals(m5323c(componentCallbacksC0077bw.f4609k)) && (componentCallbacksC0077bw.f4624z == null || componentCallbacksC0077bw.f4623y == this)) {
            componentCallbacksC0077bw.f4594V = akrVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0077bw + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: M */
    final void m5305M(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (componentCallbacksC0077bw == null || (componentCallbacksC0077bw.equals(m5323c(componentCallbacksC0077bw.f4609k)) && (componentCallbacksC0077bw.f4624z == null || componentCallbacksC0077bw.f4623y == this))) {
            ComponentCallbacksC0077bw componentCallbacksC0077bw2 = this.f8792l;
            this.f8792l = componentCallbacksC0077bw;
            m5340v(componentCallbacksC0077bw2);
            m5340v(this.f8792l);
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0077bw + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: N */
    public final void m5306N() {
        synchronized (this.f8803w) {
            if (this.f8803w.isEmpty()) {
                this.f8785e.m19324d(m5316a() > 0 && m5312U(this.f8791k));
            } else {
                this.f8785e.m19324d(true);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    final boolean m5307O(MenuItem menuItem) {
        if (this.f8788h <= 0) {
            return false;
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null && !componentCallbacksC0077bw.f4578F && componentCallbacksC0077bw.f4573A.m5307O(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m5308P(Menu menu, MenuInflater menuInflater) {
        if (this.f8788h <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null && m5277Y(componentCallbacksC0077bw) && !componentCallbacksC0077bw.f4578F) {
                if ((componentCallbacksC0077bw.f4582J && componentCallbacksC0077bw.f4583K) | componentCallbacksC0077bw.f4573A.m5308P(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(componentCallbacksC0077bw);
                    z = true;
                }
            }
        }
        if (this.f8805y != null) {
            for (int i = 0; i < this.f8805y.size(); i++) {
                ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) this.f8805y.get(i);
                if (arrayList != null) {
                    arrayList.contains(componentCallbacksC0077bw2);
                }
            }
        }
        this.f8805y = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m5309Q(MenuItem menuItem) {
        if (this.f8788h <= 0) {
            return false;
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null && !componentCallbacksC0077bw.f4578F && componentCallbacksC0077bw.f4573A.m5309Q(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m5310R(Menu menu) {
        if (this.f8788h <= 0) {
            return false;
        }
        boolean z = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null && m5277Y(componentCallbacksC0077bw) && !componentCallbacksC0077bw.f4578F) {
                if (componentCallbacksC0077bw.f4573A.m5310R(menu) | (componentCallbacksC0077bw.f4582J && componentCallbacksC0077bw.f4583K)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m5311T() {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f8791k;
        if (componentCallbacksC0077bw == null) {
            return true;
        }
        return componentCallbacksC0077bw.isAdded() && componentCallbacksC0077bw.getParentFragmentManager().m5311T();
    }

    /* JADX INFO: renamed from: U */
    final boolean m5312U(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (componentCallbacksC0077bw == null) {
            return true;
        }
        C0111cq c0111cq = componentCallbacksC0077bw.f4623y;
        return componentCallbacksC0077bw.equals(c0111cq.f8792l) && m5312U(c0111cq.f8791k);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m5313V() {
        return this.f8798r || this.f8799s;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m5314W() {
        m5317ab(false);
        m5285am(true);
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f8792l;
        if (componentCallbacksC0077bw != null && componentCallbacksC0077bw.getChildFragmentManager().m5314W()) {
            return true;
        }
        boolean zM5315Z = m5315Z(this.f8775H, this.f8776I, -1, 0);
        if (zM5315Z) {
            this.f8804x = true;
            try {
                m5287ao(this.f8775H, this.f8776I);
                m5282aj();
            } catch (Throwable th) {
                m5282aj();
                throw th;
            }
        }
        m5306N();
        m5283ak();
        this.f8781a.m5552h();
        return zM5315Z;
    }

    /* JADX INFO: renamed from: Z */
    final boolean m5315Z(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int size;
        ArrayList arrayList3 = this.f8782b;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            size = -1;
        } else if (i < 0) {
            size = i2 != 0 ? 0 : this.f8782b.size() - 1;
        } else {
            int size2 = this.f8782b.size() - 1;
            while (size2 >= 0 && i != ((C0048au) this.f8782b.get(size2)).f2401c) {
                size2--;
            }
            if (size2 < 0) {
                size = size2;
            } else if (i2 == 0) {
                size = size2 == this.f8782b.size() + (-1) ? -1 : size2 + 1;
            } else {
                while (size2 > 0) {
                    int i3 = size2 - 1;
                    if (i != ((C0048au) this.f8782b.get(i3)).f2401c) {
                        break;
                    }
                    size2 = i3;
                }
                size = size2;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f8782b.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0048au) this.f8782b.remove(size3));
            arrayList2.add(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final int m5316a() {
        ArrayList arrayList = this.f8782b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ab */
    public final void m5317ab(boolean z) {
        m5285am(z);
        while (true) {
            ArrayList arrayList = this.f8775H;
            ArrayList arrayList2 = this.f8776I;
            synchronized (this.f8803w) {
                if (this.f8803w.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f8803w.size();
                    boolean zMo2020g = false;
                    for (int i = 0; i < size; i++) {
                        zMo2020g |= ((InterfaceC0096co) this.f8803w.get(i)).mo2020g(arrayList, arrayList2);
                    }
                    this.f8803w.clear();
                    this.f8789i.f5400d.removeCallbacks(this.f8778K);
                    if (!zMo2020g) {
                        break;
                    }
                    this.f8804x = true;
                    try {
                        m5287ao(this.f8775H, this.f8776I);
                        m5282aj();
                    } catch (Throwable th) {
                        m5282aj();
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.f8803w.clear();
                    this.f8789i.f5400d.removeCallbacks(this.f8778K);
                    throw th2;
                }
            }
        }
        m5306N();
        m5283ak();
        this.f8781a.m5552h();
    }

    /* JADX INFO: renamed from: ac */
    final jew m5318ac(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        String str = componentCallbacksC0077bw.mPreviousWho;
        if (str != null) {
            ajr.m839a(componentCallbacksC0077bw, str);
        }
        if (m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(componentCallbacksC0077bw);
        }
        jew jewVarM5319ad = m5319ad(componentCallbacksC0077bw);
        componentCallbacksC0077bw.f4623y = this;
        this.f8781a.m5556l(jewVarM5319ad);
        if (!componentCallbacksC0077bw.f4579G) {
            this.f8781a.m5551g(componentCallbacksC0077bw);
            componentCallbacksC0077bw.f4616r = false;
            if (componentCallbacksC0077bw.f4586N == null) {
                componentCallbacksC0077bw.f4591S = false;
            }
            if (m5276X(componentCallbacksC0077bw)) {
                this.f8797q = true;
            }
        }
        return jewVarM5319ad;
    }

    /* JADX INFO: renamed from: ad */
    final jew m5319ad(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        jew jewVarM5555k = this.f8781a.m5555k(componentCallbacksC0077bw.f4609k);
        if (jewVarM5555k != null) {
            return jewVarM5555k;
        }
        jew jewVar = new jew(this.f8802v, this.f8781a, componentCallbacksC0077bw, null, null, null);
        jewVar.m13003f(this.f8789i.f5399c.getClassLoader());
        jewVar.f33846a = this.f8788h;
        return jewVar;
    }

    /* JADX INFO: renamed from: ae */
    final void m5320ae(jew jewVar) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) jewVar.f33848c;
        if (componentCallbacksC0077bw.f4587O) {
            if (this.f8804x) {
                this.f8774G = true;
            } else {
                componentCallbacksC0077bw.f4587O = false;
                jewVar.m13002e();
            }
        }
    }

    /* JADX INFO: renamed from: af */
    final C0121d m5321af() {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f8791k;
        return componentCallbacksC0077bw != null ? componentCallbacksC0077bw.f4623y.m5321af() : this.f8779L;
    }

    /* JADX INFO: renamed from: b */
    final Bundle m5322b() {
        int i;
        C0049av[] c0049avArr;
        ArrayList arrayList;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = m5280ah().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0134dm c0134dm = (C0134dm) it.next();
            if (c0134dm.f12012e) {
                c0134dm.f12012e = false;
                c0134dm.m6391c();
            }
        }
        m5284al();
        m5317ab(true);
        this.f8798r = true;
        this.f8801u.f9211g = true;
        C0116cv c0116cv = this.f8781a;
        ArrayList arrayList2 = new ArrayList(c0116cv.f9744b.size());
        for (jew jewVar : c0116cv.f9744b.values()) {
            if (jewVar != null) {
                Object obj = jewVar.f33848c;
                ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) obj;
                String str = componentCallbacksC0077bw.f4609k;
                Bundle bundle3 = new Bundle();
                ComponentCallbacksC0077bw componentCallbacksC0077bw2 = (ComponentCallbacksC0077bw) jewVar.f33848c;
                if (componentCallbacksC0077bw2.f4604f == -1 && (bundle = componentCallbacksC0077bw2.f4605g) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new C0115cu((ComponentCallbacksC0077bw) jewVar.f33848c));
                if (((ComponentCallbacksC0077bw) jewVar.f33848c).f4604f >= 0) {
                    Bundle bundle4 = new Bundle();
                    ((ComponentCallbacksC0077bw) jewVar.f33848c).onSaveInstanceState(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    ((bck) jewVar.f33847b).m2226z((ComponentCallbacksC0077bw) jewVar.f33848c, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    ((ComponentCallbacksC0077bw) jewVar.f33848c).f4602ac.m3226i(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM5322b = ((ComponentCallbacksC0077bw) jewVar.f33848c).f4573A.m5322b();
                    if (!bundleM5322b.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM5322b);
                    }
                    if (((ComponentCallbacksC0077bw) jewVar.f33848c).f4586N != null) {
                        jewVar.m13004g();
                    }
                    SparseArray<? extends Parcelable> sparseArray = ((ComponentCallbacksC0077bw) jewVar.f33848c).f4606h;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = ((ComponentCallbacksC0077bw) jewVar.f33848c).f4607i;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = ((ComponentCallbacksC0077bw) jewVar.f33848c).f4610l;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c0116cv.m5545a(str, bundle3);
                arrayList2.add(componentCallbacksC0077bw.f4609k);
                if (m5275S(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(obj);
                    sb.append(": ");
                    sb.append(componentCallbacksC0077bw.f4605g);
                }
            }
        }
        HashMap map = this.f8781a.f9745c;
        if (!map.isEmpty()) {
            C0116cv c0116cv2 = this.f8781a;
            synchronized (c0116cv2.f9743a) {
                c0049avArr = null;
                if (c0116cv2.f9743a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(c0116cv2.f9743a.size());
                    for (ComponentCallbacksC0077bw componentCallbacksC0077bw3 : c0116cv2.f9743a) {
                        arrayList.add(componentCallbacksC0077bw3.f4609k);
                        if (m5275S(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("saveAllState: adding fragment (");
                            sb2.append(componentCallbacksC0077bw3.f4609k);
                            sb2.append("): ");
                            sb2.append(componentCallbacksC0077bw3);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.f8782b;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                c0049avArr = new C0049av[size];
                for (i = 0; i < size; i++) {
                    c0049avArr[i] = new C0049av((C0048au) this.f8782b.get(i));
                    if (m5275S(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("saveAllState: adding back stack #");
                        sb3.append(i);
                        sb3.append(": ");
                        sb3.append(this.f8782b.get(i));
                    }
                }
            }
            C0112cr c0112cr = new C0112cr();
            c0112cr.f9058a = arrayList2;
            c0112cr.f9059b = arrayList;
            c0112cr.f9060c = c0049avArr;
            c0112cr.f9061d = this.f8786f.get();
            ComponentCallbacksC0077bw componentCallbacksC0077bw4 = this.f8792l;
            if (componentCallbacksC0077bw4 != null) {
                c0112cr.f9062e = componentCallbacksC0077bw4.f4609k;
            }
            c0112cr.f9063f.addAll(this.f8806z.keySet());
            c0112cr.f9064g.addAll(this.f8806z.values());
            c0112cr.f9065h = new ArrayList(this.f8796p);
            bundle2.putParcelable(PMZiHihxLGEy.VYk, c0112cr);
            for (String str2 : this.f8768A.keySet()) {
                bundle2.putBundle("result_".concat(String.valueOf(str2)), (Bundle) this.f8768A.get(str2));
            }
            for (String str3 : map.keySet()) {
                bundle2.putBundle("fragment_".concat(String.valueOf(str3)), (Bundle) map.get(str3));
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: c */
    final ComponentCallbacksC0077bw m5323c(String str) {
        return this.f8781a.m5546b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bw] */
    /* JADX INFO: renamed from: d */
    public final ComponentCallbacksC0077bw m5324d(int i) {
        ?? r2;
        C0116cv c0116cv = this.f8781a;
        for (int size = c0116cv.f9743a.size() - 1; size >= 0; size--) {
            r2 = (ComponentCallbacksC0077bw) c0116cv.f9743a.get(size);
            if (r2 != 0 && r2.f4575C == i) {
                return (ComponentCallbacksC0077bw) r2;
            }
        }
        for (jew jewVar : c0116cv.f9744b.values()) {
            if (jewVar != null) {
                r2 = jewVar.f33848c;
                if (((ComponentCallbacksC0077bw) r2).f4575C == i) {
                    return (ComponentCallbacksC0077bw) r2;
                }
            }
        }
        r2 = 0;
        return (ComponentCallbacksC0077bw) r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [bw] */
    /* JADX INFO: renamed from: e */
    public final ComponentCallbacksC0077bw m5325e(String str) {
        ?? r2;
        C0116cv c0116cv = this.f8781a;
        for (int size = c0116cv.f9743a.size() - 1; size >= 0; size--) {
            r2 = (ComponentCallbacksC0077bw) c0116cv.f9743a.get(size);
            if (r2 != 0 && str.equals(r2.f4577E)) {
                return (ComponentCallbacksC0077bw) r2;
            }
        }
        for (jew jewVar : c0116cv.f9744b.values()) {
            if (jewVar != null) {
                r2 = jewVar.f33848c;
                if (str.equals(((ComponentCallbacksC0077bw) r2).f4577E)) {
                    return (ComponentCallbacksC0077bw) r2;
                }
            }
        }
        r2 = 0;
        return (ComponentCallbacksC0077bw) r2;
    }

    /* JADX INFO: renamed from: h */
    public final C0085cd m5326h() {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f8791k;
        return componentCallbacksC0077bw != null ? componentCallbacksC0077bw.f4623y.m5326h() : this.f8773F;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0118cx m5327i() {
        return new C0048au(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m5328j(InterfaceC0114ct interfaceC0114ct) {
        this.f8787g.add(interfaceC0114ct);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [akv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r5v0, types: [alw, ce, ct] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [aqn, ce] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ce, qb] */
    /* JADX WARN: Type inference failed for: r5v9, types: [aca, ce] */
    /* JADX INFO: renamed from: k */
    public final void m5329k(C0086ce c0086ce, AbstractC0083cb abstractC0083cb, ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (this.f8789i != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f8789i = c0086ce;
        this.f8790j = abstractC0083cb;
        this.f8791k = componentCallbacksC0077bw;
        if (componentCallbacksC0077bw != null) {
            m5328j(new C0092ck());
        } else if (c0086ce instanceof InterfaceC0114ct) {
            m5328j(c0086ce);
        }
        if (this.f8791k != null) {
            m5306N();
        }
        if (c0086ce instanceof InterfaceC0914ps) {
            C0913pr c0913pr = ((C0079by) c0086ce).f4732a.f47426g;
            this.f8784d = c0913pr;
            ?? r0 = componentCallbacksC0077bw != null ? componentCallbacksC0077bw : c0086ce;
            AbstractC0909pn abstractC0909pn = this.f8785e;
            r0.getClass();
            abstractC0909pn.getClass();
            aks lifecycle = r0.getLifecycle();
            lifecycle.getClass();
            if (lifecycle.f598a != akr.DESTROYED) {
                abstractC0909pn.m19322b(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(c0913pr, lifecycle, abstractC0909pn));
                c0913pr.m19331d();
                abstractC0909pn.f47441d = c0913pr.f47448b;
            }
        }
        int i = 0;
        if (componentCallbacksC0077bw != null) {
            C0113cs c0113cs = componentCallbacksC0077bw.f4623y.f8801u;
            C0113cs c0113cs2 = (C0113cs) c0113cs.f9207c.get(componentCallbacksC0077bw.f4609k);
            if (c0113cs2 == null) {
                c0113cs2 = new C0113cs(c0113cs.f9209e);
                c0113cs.f9207c.put(componentCallbacksC0077bw.f4609k, c0113cs2);
            }
            this.f8801u = c0113cs2;
        } else if (c0086ce instanceof alw) {
            bkn viewModelStore$ar$class_merging$ar$class_merging = c0086ce.getViewModelStore$ar$class_merging$ar$class_merging();
            alt altVar = C0113cs.f9205a;
            viewModelStore$ar$class_merging$ar$class_merging.getClass();
            alx alxVar = alx.f669a;
            alxVar.getClass();
            this.f8801u = (C0113cs) ach.m190c(C0113cs.class, viewModelStore$ar$class_merging$ar$class_merging, altVar, alxVar);
        } else {
            this.f8801u = new C0113cs(false);
        }
        C0113cs c0113cs3 = this.f8801u;
        c0113cs3.f9211g = m5313V();
        this.f8781a.f9746d = c0113cs3;
        ?? r5 = this.f8789i;
        if ((r5 instanceof aqn) && componentCallbacksC0077bw == null) {
            aqm savedStateRegistry = r5.getSavedStateRegistry();
            savedStateRegistry.m1859b("android:support:fragments", new C0088cg(this, i));
            Bundle bundleM1858a = savedStateRegistry.m1858a("android:support:fragments");
            if (bundleM1858a != null) {
                m5302J(bundleM1858a);
            }
        }
        ?? r6 = this.f8789i;
        if (r6 instanceof InterfaceC0924qb) {
            C0923qa c0923qaMo3177c = r6.mo3177c();
            String strConcat = componentCallbacksC0077bw != null ? String.valueOf(componentCallbacksC0077bw.f4609k).concat(":") : "";
            C0929qg c0929qg = new C0929qg();
            C0093cl c0093cl = new C0093cl(this, 1);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.f8793m = c0923qaMo3177c.m19332a(strConcat2.concat("StartActivityForResult"), c0929qg, c0093cl);
            this.f8794n = c0923qaMo3177c.m19332a(strConcat2.concat("StartIntentSenderForResult"), new C0094cm(), new C0093cl(this, 0));
            this.f8795o = c0923qaMo3177c.m19332a(strConcat2.concat("RequestPermissions"), new C0928qf(), new C0089ch(this));
        }
        ?? r7 = this.f8789i;
        if (r7 instanceof aca) {
            r7.mo176d(this.f8769B);
        }
        C0086ce c0086ce2 = this.f8789i;
        if (c0086ce2 instanceof acb) {
            ((C0079by) c0086ce2).f4732a.f47428i.add(this.f8770C);
        }
        C0086ce c0086ce3 = this.f8789i;
        if (c0086ce3 instanceof InterfaceC0130di) {
            ((C0079by) c0086ce3).f4732a.f47430k.add(this.f8771D);
        }
        C0086ce c0086ce4 = this.f8789i;
        if (c0086ce4 instanceof InterfaceC0131dj) {
            ((C0079by) c0086ce4).f4732a.f47431l.add(this.f8772E);
        }
        C0086ce c0086ce5 = this.f8789i;
        if ((c0086ce5 instanceof aep) && componentCallbacksC0077bw == null) {
            AmbientMode.AmbientController ambientController = this.f8780M;
            C1058va c1058va = ((C0079by) c0086ce5).f4732a.f47435p;
            ((CopyOnWriteArrayList) c1058va.f47802a).add(ambientController);
            c1058va.f47803b.run();
        }
    }

    /* JADX INFO: renamed from: l */
    final void m5330l(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(componentCallbacksC0077bw);
        }
        if (componentCallbacksC0077bw.f4579G) {
            componentCallbacksC0077bw.f4579G = false;
            if (componentCallbacksC0077bw.f4615q) {
                return;
            }
            this.f8781a.m5551g(componentCallbacksC0077bw);
            if (m5275S(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(rgoX.NMqzPxY);
                sb2.append(componentCallbacksC0077bw);
            }
            if (m5276X(componentCallbacksC0077bw)) {
                this.f8797q = true;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    final void m5331m(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(componentCallbacksC0077bw);
        }
        if (componentCallbacksC0077bw.f4579G) {
            return;
        }
        componentCallbacksC0077bw.f4579G = true;
        if (componentCallbacksC0077bw.f4615q) {
            if (m5275S(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(componentCallbacksC0077bw);
            }
            this.f8781a.m5553i(componentCallbacksC0077bw);
            if (m5276X(componentCallbacksC0077bw)) {
                this.f8797q = true;
            }
            m5288ap(componentCallbacksC0077bw);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5332n() {
        this.f8798r = false;
        this.f8799s = false;
        this.f8801u.f9211g = false;
        m5293A(4);
    }

    /* JADX INFO: renamed from: o */
    final void m5333o(Configuration configuration, boolean z) {
        if (z && (this.f8789i instanceof aca)) {
            m5290ar(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null) {
                componentCallbacksC0077bw.onConfigurationChanged(configuration);
                if (z) {
                    componentCallbacksC0077bw.f4573A.m5333o(configuration, true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    final void m5334p() {
        this.f8798r = false;
        this.f8799s = false;
        this.f8801u.f9211g = false;
        m5293A(1);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aca, ce] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: q */
    public final void m5335q() {
        this.f8800t = true;
        m5317ab(true);
        m5284al();
        C0086ce c0086ce = this.f8789i;
        if (c0086ce instanceof alw ? this.f8781a.f9746d.f9210f : true ^ ((Activity) c0086ce.f5399c).isChangingConfigurations()) {
            Iterator it = this.f8806z.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C0051ax) it.next()).f2625a.iterator();
                while (it2.hasNext()) {
                    this.f8781a.f9746d.m5448c((String) it2.next());
                }
            }
        }
        m5293A(-1);
        C0086ce c0086ce2 = this.f8789i;
        if (c0086ce2 instanceof acb) {
            ((C0079by) c0086ce2).f4732a.f47428i.remove(this.f8770C);
        }
        ?? r0 = this.f8789i;
        if (r0 instanceof aca) {
            r0.mo177f(this.f8769B);
        }
        C0086ce c0086ce3 = this.f8789i;
        if (c0086ce3 instanceof InterfaceC0130di) {
            ((C0079by) c0086ce3).f4732a.f47430k.remove(this.f8771D);
        }
        C0086ce c0086ce4 = this.f8789i;
        if (c0086ce4 instanceof InterfaceC0131dj) {
            ((C0079by) c0086ce4).f4732a.f47431l.remove(this.f8772E);
        }
        C0086ce c0086ce5 = this.f8789i;
        if (c0086ce5 instanceof aep) {
            AmbientMode.AmbientController ambientController = this.f8780M;
            C1058va c1058va = ((C0079by) c0086ce5).f4732a.f47435p;
            ((CopyOnWriteArrayList) c1058va.f47802a).remove(ambientController);
            if (((abh) c1058va.f47804c.remove(ambientController)) != null) {
                throw null;
            }
            c1058va.f47803b.run();
        }
        this.f8789i = null;
        this.f8790j = null;
        this.f8791k = null;
        if (this.f8784d != null) {
            Iterator it3 = this.f8785e.f47440c.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0903ph) it3.next()).mo1401b();
            }
            this.f8784d = null;
        }
        AbstractC0919px abstractC0919px = this.f8793m;
        if (abstractC0919px != null) {
            abstractC0919px.mo2761a();
            this.f8794n.mo2761a();
            this.f8795o.mo2761a();
        }
    }

    /* JADX INFO: renamed from: r */
    final void m5336r(boolean z) {
        if (z && (this.f8789i instanceof acb)) {
            m5290ar(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null) {
                componentCallbacksC0077bw.onLowMemory();
                if (z) {
                    componentCallbacksC0077bw.f4573A.m5336r(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    final void m5337s(boolean z, boolean z2) {
        if (z2 && (this.f8789i instanceof InterfaceC0130di)) {
            m5290ar(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null && z2) {
                componentCallbacksC0077bw.f4573A.m5337s(z, true);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5338t() {
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5549e()) {
            if (componentCallbacksC0077bw != null) {
                componentCallbacksC0077bw.f4573A.m5338t();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f8791k;
        String str = wUzNh.rWnVpijTCFmb;
        if (componentCallbacksC0077bw != null) {
            sb.append(componentCallbacksC0077bw.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f8791k)));
            sb.append(str);
        } else {
            C0086ce c0086ce = this.f8789i;
            if (c0086ce != null) {
                sb.append(c0086ce.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f8789i)));
                sb.append(str);
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m5339u(Menu menu) {
        if (this.f8788h <= 0) {
            return;
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null && !componentCallbacksC0077bw.f4578F) {
                componentCallbacksC0077bw.f4573A.m5339u(menu);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5340v(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        if (componentCallbacksC0077bw == null || !componentCallbacksC0077bw.equals(m5323c(componentCallbacksC0077bw.f4609k))) {
            return;
        }
        boolean zM5312U = componentCallbacksC0077bw.f4623y.m5312U(componentCallbacksC0077bw);
        Boolean bool = componentCallbacksC0077bw.f4614p;
        if (bool == null || bool.booleanValue() != zM5312U) {
            componentCallbacksC0077bw.f4614p = Boolean.valueOf(zM5312U);
            C0111cq c0111cq = componentCallbacksC0077bw.f4573A;
            c0111cq.m5306N();
            c0111cq.m5340v(c0111cq.f8792l);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5341w() {
        m5293A(5);
    }

    /* JADX INFO: renamed from: x */
    final void m5342x(boolean z, boolean z2) {
        if (z2 && (this.f8789i instanceof InterfaceC0131dj)) {
            m5290ar(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw : this.f8781a.m5550f()) {
            if (componentCallbacksC0077bw != null && z2) {
                componentCallbacksC0077bw.f4573A.m5342x(z, true);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5343y() {
        this.f8798r = false;
        this.f8799s = false;
        this.f8801u.f9211g = false;
        m5293A(7);
    }

    /* JADX INFO: renamed from: z */
    public final void m5344z() {
        this.f8798r = false;
        this.f8799s = false;
        this.f8801u.f9211g = false;
        m5293A(5);
    }
}
