package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.platform.AbstractC0402n;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.channels.C3211a;
import p000.AbstractC3550rv;
import p000.AbstractC3695vr;
import p000.C0011a9;
import p000.C3126ix;
import p000.C3299li;
import p000.C3386nv;
import p000.a44;
import p000.afa;
import p000.aj3;
import p000.b02;
import p000.b34;
import p000.b44;
import p000.c44;
import p000.ci8;
import p000.cn5;
import p000.cu0;
import p000.d44;
import p000.do7;
import p000.e44;
import p000.f44;
import p000.fa2;
import p000.fa4;
import p000.fg7;
import p000.fl2;
import p000.fpa;
import p000.g44;
import p000.gm5;
import p000.gq6;
import p000.gw9;
import p000.h44;
import p000.h66;
import p000.hta;
import p000.jl3;
import p000.kg7;
import p000.kk2;
import p000.kl3;
import p000.lk2;
import p000.mk2;
import p000.ng7;
import p000.nk2;
import p000.ok2;
import p000.pk2;
import p000.pk9;
import p000.qba;
import p000.qk2;
import p000.rg7;
import p000.rk2;
import p000.s01;
import p000.sk2;
import p000.tf1;
import p000.thb;
import p000.u91;
import p000.uea;
import p000.uk2;
import p000.v56;
import p000.vi3;
import p000.vk2;
import p000.wfb;
import p000.wk2;
import p000.x56;
import p000.x74;
import p000.xfa;
import p000.xk2;
import p000.yk2;
import p000.z34;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0103k extends fa2 implements ng7, h44, tf1, fl2 {

    /* JADX INFO: renamed from: L */
    public Orientation f2267L;

    /* JADX INFO: renamed from: M */
    public vi3 f2268M;

    /* JADX INFO: renamed from: N */
    public boolean f2269N;

    /* JADX INFO: renamed from: O */
    public v56 f2270O;

    /* JADX INFO: renamed from: P */
    public C3211a f2271P;

    /* JADX INFO: renamed from: Q */
    public xk2 f2272Q;

    /* JADX INFO: renamed from: R */
    public boolean f2273R;

    /* JADX INFO: renamed from: S */
    public boolean f2274S;

    /* JADX INFO: renamed from: T */
    public kk2 f2275T;

    /* JADX INFO: renamed from: U */
    public long f2276U = 0;

    /* JADX INFO: renamed from: V */
    public jl3 f2277V;

    /* JADX INFO: renamed from: W */
    public jl3 f2278W;

    /* JADX INFO: renamed from: X */
    public nk2 f2279X;

    /* JADX INFO: renamed from: Y */
    public mk2 f2280Y;

    /* JADX INFO: renamed from: Z */
    public lk2 f2281Z;

    /* JADX INFO: renamed from: a0 */
    public AbstractC3695vr f2282a0;

    /* JADX INFO: renamed from: b0 */
    public gw9 f2283b0;

    /* JADX INFO: renamed from: c0 */
    public s01 f2284c0;

    /* JADX INFO: renamed from: d0 */
    public g44 f2285d0;

    public AbstractC0103k(vi3 vi3Var, boolean z, v56 v56Var, Orientation orientation) {
        this.f2267L = orientation;
        this.f2268M = vi3Var;
        this.f2269N = z;
        this.f2270O = v56Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c1 */
    public static final Object m876c1(AbstractC0103k abstractC0103k, ContinuationImpl continuationImpl) throws Throwable {
        DragGestureNode$processDragCancel$1 dragGestureNode$processDragCancel$1;
        if (continuationImpl instanceof DragGestureNode$processDragCancel$1) {
            dragGestureNode$processDragCancel$1 = (DragGestureNode$processDragCancel$1) continuationImpl;
            int i = dragGestureNode$processDragCancel$1.f1939c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragCancel$1.f1939c = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(abstractC0103k, continuationImpl);
            }
        } else {
            dragGestureNode$processDragCancel$1 = new DragGestureNode$processDragCancel$1(abstractC0103k, continuationImpl);
        }
        Object obj = dragGestureNode$processDragCancel$1.f1937a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureNode$processDragCancel$1.f1939c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            xk2 xk2Var = abstractC0103k.f2272Q;
            if (xk2Var != null) {
                v56 v56Var = abstractC0103k.f2270O;
                if (v56Var != null) {
                    wk2 wk2Var = new wk2(xk2Var);
                    dragGestureNode$processDragCancel$1.f1939c = 1;
                    if (v56Var.m23125a(wk2Var, dragGestureNode$processDragCancel$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            abstractC0103k.mo843m1(new rk2(0L, false));
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        abstractC0103k.f2272Q = null;
        abstractC0103k.mo843m1(new rk2(0L, false));
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d1 */
    public static final Object m877d1(AbstractC0103k abstractC0103k, qk2 qk2Var, ContinuationImpl continuationImpl) throws Throwable {
        DragGestureNode$processDragStart$1 dragGestureNode$processDragStart$1;
        v56 v56Var;
        xk2 xk2Var;
        qk2 qk2Var2;
        xk2 xk2Var2;
        if (continuationImpl instanceof DragGestureNode$processDragStart$1) {
            dragGestureNode$processDragStart$1 = (DragGestureNode$processDragStart$1) continuationImpl;
            int i = dragGestureNode$processDragStart$1.f1944e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStart$1.f1944e = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(abstractC0103k, continuationImpl);
            }
        } else {
            dragGestureNode$processDragStart$1 = new DragGestureNode$processDragStart$1(abstractC0103k, continuationImpl);
        }
        Object obj = dragGestureNode$processDragStart$1.f1942c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureNode$processDragStart$1.f1944e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            xk2 xk2Var3 = abstractC0103k.f2272Q;
            if (xk2Var3 != null && (v56Var = abstractC0103k.f2270O) != null) {
                wk2 wk2Var = new wk2(xk2Var3);
                dragGestureNode$processDragStart$1.f1940a = qk2Var;
                dragGestureNode$processDragStart$1.f1944e = 1;
                if (v56Var.m23125a(wk2Var, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            abstractC0103k.f2272Q = xk2Var;
            abstractC0103k.mo842l1(qk2Var.f57865a);
            return xfa.f68157a;
        }
        if (i2 == 1) {
            qk2Var = dragGestureNode$processDragStart$1.f1940a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xk2Var2 = dragGestureNode$processDragStart$1.f1941b;
            qk2Var2 = dragGestureNode$processDragStart$1.f1940a;
            AbstractC3193b.m15359b(obj);
        }
        xk2Var = xk2Var2;
        qk2Var = qk2Var2;
        abstractC0103k.f2272Q = xk2Var;
        abstractC0103k.mo842l1(qk2Var.f57865a);
        return xfa.f68157a;
        xk2Var = new xk2();
        v56 v56Var2 = abstractC0103k.f2270O;
        if (v56Var2 != null) {
            dragGestureNode$processDragStart$1.f1940a = qk2Var;
            dragGestureNode$processDragStart$1.f1941b = xk2Var;
            dragGestureNode$processDragStart$1.f1944e = 2;
            if (v56Var2.m23125a(xk2Var, dragGestureNode$processDragStart$1) != coroutineSingletons) {
                qk2Var2 = qk2Var;
                xk2Var2 = xk2Var;
                xk2Var = xk2Var2;
                qk2Var = qk2Var2;
            }
            return coroutineSingletons;
        }
        abstractC0103k.f2272Q = xk2Var;
        abstractC0103k.mo842l1(qk2Var.f57865a);
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e1 */
    public static final Object m878e1(AbstractC0103k abstractC0103k, rk2 rk2Var, ContinuationImpl continuationImpl) throws Throwable {
        DragGestureNode$processDragStop$1 dragGestureNode$processDragStop$1;
        if (continuationImpl instanceof DragGestureNode$processDragStop$1) {
            dragGestureNode$processDragStop$1 = (DragGestureNode$processDragStop$1) continuationImpl;
            int i = dragGestureNode$processDragStop$1.f1948d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dragGestureNode$processDragStop$1.f1948d = i - Integer.MIN_VALUE;
            } else {
                dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(abstractC0103k, continuationImpl);
            }
        } else {
            dragGestureNode$processDragStop$1 = new DragGestureNode$processDragStop$1(abstractC0103k, continuationImpl);
        }
        Object obj = dragGestureNode$processDragStop$1.f1946b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dragGestureNode$processDragStop$1.f1948d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            xk2 xk2Var = abstractC0103k.f2272Q;
            if (xk2Var != null) {
                v56 v56Var = abstractC0103k.f2270O;
                if (v56Var != null) {
                    yk2 yk2Var = new yk2(xk2Var);
                    dragGestureNode$processDragStop$1.f1945a = rk2Var;
                    dragGestureNode$processDragStop$1.f1948d = 1;
                    if (v56Var.m23125a(yk2Var, dragGestureNode$processDragStop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            abstractC0103k.mo843m1(rk2Var);
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        rk2Var = dragGestureNode$processDragStop$1.f1945a;
        AbstractC3193b.m15359b(obj);
        abstractC0103k.f2272Q = null;
        abstractC0103k.mo843m1(rk2Var);
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: j1 */
    public static void m879j1(AbstractC0103k abstractC0103k, kg7 kg7Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        mk2 mk2Var = abstractC0103k.f2280Y;
        if (mk2Var == null) {
            mk2Var = new mk2();
            mk2Var.f51433p = null;
            mk2Var.f51434q = Long.MAX_VALUE;
            mk2Var.f51435r = false;
            abstractC0103k.f2280Y = mk2Var;
        }
        mk2Var.f51433p = kg7Var;
        mk2Var.f51434q = j;
        s01 s01Var = abstractC0103k.f2284c0;
        Orientation orientation = abstractC0103k.f2267L;
        if (s01Var == null) {
            abstractC0103k.f2284c0 = new s01(orientation);
        } else {
            s01Var.f60111c = orientation;
            s01Var.f60110b = j2;
        }
        mk2Var.f51435r = false;
        abstractC0103k.f2282a0 = mk2Var;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x01b2  */
    @Override // p000.ng7
    /* JADX INFO: renamed from: D */
    public void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        boolean z2;
        Object obj4;
        Object obj5;
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop;
        this.f2274S = true;
        if (this.f2269N) {
            if (this.f2277V == null) {
                jl3 jl3Var = new jl3(this);
                m11624Z0(jl3Var);
                this.f2277V = jl3Var;
            }
            int i = 0;
            if (this.f2282a0 == null) {
                kk2 kk2Var = this.f2275T;
                if (kk2Var == null) {
                    DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop2 = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
                    kk2Var = new kk2();
                    kk2Var.f47450p = dragDetectionState$AwaitDown$AwaitTouchSlop2;
                    kk2Var.f47451q = false;
                    kk2Var.f47452r = false;
                    this.f2275T = kk2Var;
                }
                this.f2282a0 = kk2Var;
            }
            AbstractC3695vr abstractC3695vr = this.f2282a0;
            if (abstractC3695vr == null) {
                C3386nv.m17626m("currentDragState should not be null");
                return;
            }
            if (abstractC3695vr instanceof kk2) {
                kk2 kk2Var2 = (kk2) abstractC3695vr;
                if (!fg7Var.f39071a.isEmpty() && AbstractC0117w.m943f(fg7Var, false)) {
                    kg7 kg7Var = (kg7) u91.m22589G0(fg7Var.f39071a);
                    if (vk2.f65530a[kk2Var2.f47450p.ordinal()] == 1) {
                        dragDetectionState$AwaitDown$AwaitTouchSlop = !mo844r1() ? DragDetectionState$AwaitDown$AwaitTouchSlop.Yes : DragDetectionState$AwaitDown$AwaitTouchSlop.No;
                    } else {
                        dragDetectionState$AwaitDown$AwaitTouchSlop = kk2Var2.f47450p;
                    }
                    kk2Var2.f47450p = dragDetectionState$AwaitDown$AwaitTouchSlop;
                    if (pointerEventPass == PointerEventPass.Initial) {
                        if (dragDetectionState$AwaitDown$AwaitTouchSlop == DragDetectionState$AwaitDown$AwaitTouchSlop.No) {
                            kg7Var.m15189a();
                            kk2Var2.f47451q = true;
                        }
                        kk2Var2.f47452r = true;
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (dragDetectionState$AwaitDown$AwaitTouchSlop == DragDetectionState$AwaitDown$AwaitTouchSlop.Yes) {
                            m879j1(this, kg7Var, kg7Var.f47235a, 0L, 12);
                            return;
                        }
                        if (kk2Var2.f47451q) {
                            m888q1(kg7Var, kg7Var, 0L);
                            m887p1(0L, kg7Var);
                            long j2 = kg7Var.f47235a;
                            nk2 nk2Var = this.f2279X;
                            if (nk2Var == null) {
                                nk2Var = new nk2();
                                nk2Var.f52877p = Long.MAX_VALUE;
                                this.f2279X = nk2Var;
                            }
                            nk2Var.f52877p = j2;
                            this.f2282a0 = nk2Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(abstractC3695vr instanceof mk2)) {
                if (abstractC3695vr instanceof lk2) {
                    lk2 lk2Var = (lk2) abstractC3695vr;
                    if (pointerEventPass != PointerEventPass.Final) {
                        return;
                    }
                    List list = fg7Var.f39071a;
                    List list2 = list;
                    int size = list2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z = true;
                            break;
                        } else {
                            if (((kg7) list.get(i2)).m15191c()) {
                                z = false;
                                break;
                            }
                            i2++;
                        }
                    }
                    int size2 = list2.size();
                    while (i < size2) {
                        if (((kg7) list.get(i)).f47238d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long j3 = ((kg7) u91.m22589G0(list)).f47237c;
                                kg7 kg7Var2 = lk2Var.f49757p;
                                kg7Var2.getClass();
                                long jM12824e = gq6.m12824e(j3, kg7Var2.f47237c);
                                kg7 kg7Var3 = lk2Var.f49757p;
                                if (kg7Var3 != null) {
                                    m879j1(this, kg7Var3, lk2Var.f49758q, jM12824e, 8);
                                    return;
                                } else {
                                    C3386nv.m17626m("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                        i++;
                    }
                    m882h1();
                    return;
                }
                if (!(abstractC3695vr instanceof nk2)) {
                    gm5.m12750e();
                    return;
                }
                nk2 nk2Var2 = (nk2) abstractC3695vr;
                if (pointerEventPass != PointerEventPass.Main) {
                    return;
                }
                long j4 = nk2Var2.f52877p;
                List list3 = fg7Var.f39071a;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list3.get(i3);
                    if (pk9.m19371i(((kg7) obj).f47235a, j4)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                kg7 kg7Var4 = (kg7) obj;
                if (kg7Var4 == null) {
                    return;
                }
                boolean zM4725j = ci8.m4725j(kg7Var4);
                Object obj6 = ok2.f54491a;
                if (!zM4725j) {
                    if (kg7Var4.m15191c()) {
                        m885n1().mo4677k(obj6);
                        return;
                    } else {
                        if (gq6.m12822c(ci8.m4702O(kg7Var4, true)) == 0.0f) {
                            return;
                        }
                        m887p1(ci8.m4702O(kg7Var4, false), kg7Var4);
                        kg7Var4.m15189a();
                        return;
                    }
                }
                List list4 = fg7Var.f39071a;
                int size4 = list4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list4.get(i4);
                    if (((kg7) obj2).f47238d) {
                        break;
                    } else {
                        i4++;
                    }
                }
                kg7 kg7Var5 = (kg7) obj2;
                if (kg7Var5 != null) {
                    nk2Var2.f52877p = kg7Var5.f47235a;
                    return;
                }
                if (kg7Var4.m15191c() || !ci8.m4725j(kg7Var4)) {
                    m885n1().mo4677k(obj6);
                } else {
                    afa.m351a(m886o1(), kg7Var4);
                    float fMo13459e = ((hta) thb.m22050i(this, AbstractC0402n.f4829u)).mo13459e();
                    long jM12935d = m886o1().m12935d(uea.m22716a(fMo13459e, fMo13459e));
                    cn5 cn5Var = (cn5) m886o1().f41432b;
                    fpa fpaVar = (fpa) cn5Var.f10327b;
                    b02[] b02VarArr = fpaVar.f39437d;
                    AbstractC3550rv.m20833a0(0, b02VarArr.length, null, b02VarArr);
                    fpaVar.f39438e = 0;
                    fpa fpaVar2 = (fpa) cn5Var.f10328c;
                    b02[] b02VarArr2 = fpaVar2.f39437d;
                    AbstractC3550rv.m20833a0(0, b02VarArr2.length, null, b02VarArr2);
                    fpaVar2.f39438e = 0;
                    cn5Var.f10326a = 0L;
                    m885n1().mo4677k(new rk2(AbstractC0104l.m893c(jM12935d), false));
                    this.f2274S = false;
                }
                m882h1();
                return;
            }
            mk2 mk2Var = (mk2) abstractC3695vr;
            if (pointerEventPass == PointerEventPass.Initial) {
                return;
            }
            List list5 = fg7Var.f39071a;
            List list6 = list5;
            int size5 = list6.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    obj3 = null;
                    break;
                }
                Object obj7 = list5.get(i5);
                if (pk9.m19371i(((kg7) obj7).f47235a, mk2Var.f51434q)) {
                    obj3 = obj7;
                    break;
                }
                i5++;
            }
            kg7 kg7Var6 = (kg7) obj3;
            if (kg7Var6 == null) {
                int size6 = list6.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list5.get(i6);
                    if (((kg7) obj5).f47238d) {
                        break;
                    } else {
                        i6++;
                    }
                }
                kg7Var6 = (kg7) obj5;
                if (kg7Var6 == null) {
                    m882h1();
                    return;
                }
                mk2Var.f51434q = kg7Var6.f47235a;
            }
            if (pointerEventPass == PointerEventPass.Main) {
                if (kg7Var6.m15191c()) {
                    kg7 kg7Var7 = mk2Var.f51433p;
                    if (kg7Var7 == null) {
                        C3386nv.m17626m("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = mk2Var.f51434q;
                    s01 s01Var = this.f2284c0;
                    if (s01Var == null) {
                        C3386nv.m17626m("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    m883i1(kg7Var7, j5, s01Var);
                } else if (ci8.m4725j(kg7Var6)) {
                    int size7 = list6.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size7) {
                            obj4 = null;
                            break;
                        }
                        obj4 = list5.get(i7);
                        if (((kg7) obj4).f47238d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    kg7 kg7Var8 = (kg7) obj4;
                    if (kg7Var8 == null) {
                        m882h1();
                    } else {
                        mk2Var.f51434q = kg7Var8.f47235a;
                    }
                } else {
                    float fM874i = AbstractC0102j.m874i((hta) thb.m22050i(this, AbstractC0402n.f4829u), kg7Var6.f47243i);
                    s01 s01Var2 = this.f2284c0;
                    if (s01Var2 == null) {
                        C3386nv.m17626m("Touch slop detector not initialized.");
                        return;
                    }
                    long jM20989e = s01.m20989e(s01Var2, ci8.m4702O(kg7Var6, true), fM874i);
                    if ((9223372034707292159L & jM20989e) != 9205357640488583168L) {
                        long jM12825f = gq6.m12825f(this.f2276U, ci8.m4702O(kg7Var6, false));
                        this.f2276U = jM12825f;
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.f2276U & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM12825f >> 32))))) * 57.29578f;
                        Orientation orientation = this.f2267L;
                        if (orientation == null) {
                            z2 = true;
                        } else {
                            aj3 aj3Var = AbstractC0104l.f2286a;
                            if (orientation != Orientation.Horizontal ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        }
                        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                        uk2 uk2Var = new uk2(fAtan2, ref$BooleanRef);
                        aj3 aj3Var2 = AbstractC0104l.f2286a;
                        qba.m19852d(this, jl3.f45667K, new kl3(new C0011a9(uk2Var, 14), i));
                        if (z2 || !ref$BooleanRef.f47713a) {
                            mk2Var = mk2Var;
                            kg7Var6.m15189a();
                            kg7 kg7Var9 = mk2Var.f51433p;
                            kg7Var9.getClass();
                            m888q1(kg7Var9, kg7Var6, jM20989e);
                            m887p1(jM20989e, kg7Var6);
                            long j6 = kg7Var6.f47235a;
                            nk2 nk2Var3 = this.f2279X;
                            if (nk2Var3 == null) {
                                nk2Var3 = new nk2();
                                nk2Var3.f52877p = Long.MAX_VALUE;
                                this.f2279X = nk2Var3;
                            }
                            nk2Var3.f52877p = j6;
                            this.f2282a0 = nk2Var3;
                        } else {
                            mk2Var = mk2Var;
                            mk2Var.f51435r = true;
                        }
                    } else {
                        mk2Var.f51435r = true;
                        this.f2276U = gq6.m12825f(this.f2276U, ci8.m4702O(kg7Var6, true));
                    }
                }
            }
            if (pointerEventPass == PointerEventPass.Final && mk2Var.f51435r) {
                if (!kg7Var6.m15191c()) {
                    mk2Var.f51435r = false;
                    return;
                }
                kg7 kg7Var10 = mk2Var.f51433p;
                if (kg7Var10 == null) {
                    C3386nv.m17626m("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j7 = mk2Var.f51434q;
                s01 s01Var3 = this.f2284c0;
                if (s01Var3 != null) {
                    m883i1(kg7Var10, j7, s01Var3);
                } else {
                    C3386nv.m17626m("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        if (this.f2274S) {
            m882h1();
            if (this.f2273R) {
                m885n1().mo4677k(ok2.f54491a);
            }
            this.f2283b0 = null;
        }
        this.f2274S = false;
    }

    @Override // p000.il3
    /* JADX INFO: renamed from: S */
    public final String mo790S() {
        if (!this.f2269N) {
            return "idle";
        }
        AbstractC3695vr abstractC3695vr = this.f2282a0;
        if (abstractC3695vr instanceof kk2) {
            return ((kk2) abstractC3695vr).f47452r ? "waiting" : "idle";
        }
        if ((abstractC3695vr instanceof mk2) || (abstractC3695vr instanceof lk2)) {
            return "waiting";
        }
        return abstractC3695vr instanceof nk2 ? "recognized" : "idle";
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        this.f2273R = false;
        m881f1();
        jl3 jl3Var = this.f2278W;
        if (jl3Var != null) {
            m11625a1(jl3Var);
        }
        jl3 jl3Var2 = this.f2277V;
        if (jl3Var2 != null) {
            m11625a1(jl3Var2);
        }
        this.f2278W = null;
        this.f2277V = null;
    }

    @Override // p000.fl2
    /* JADX INFO: renamed from: b0 */
    public final Orientation mo880b0() {
        return this.f2267L;
    }

    @Override // p000.h44
    /* JADX INFO: renamed from: e0 */
    public final void mo819e0(C3299li c3299li, PointerEventPass pointerEventPass) {
        Object obj;
        Object obj2;
        float f;
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        Object obj3;
        Object obj4;
        Object obj5;
        if (this.f2269N) {
            if (this.f2285d0 == null) {
                this.f2285d0 = new g44(this);
            }
            if (this.f2278W == null) {
                g44 g44Var = this.f2285d0;
                g44Var.getClass();
                jl3 jl3Var = new jl3(g44Var);
                m11624Z0(jl3Var);
                this.f2278W = jl3Var;
            }
            g44 g44Var2 = this.f2285d0;
            if (g44Var2 != null) {
                AbstractC0103k abstractC0103k = g44Var2.f40168a;
                int i = 0;
                if (g44Var2.f40173f == null) {
                    b44 b44Var = g44Var2.f40169b;
                    if (b44Var == null) {
                        EnumC0087xecab5e0c enumC0087xecab5e0c = EnumC0087xecab5e0c.NotInitialized;
                        b44Var = new b44();
                        b44Var.f7916y = enumC0087xecab5e0c;
                        b44Var.f7917z = false;
                        b44Var.f7915A = false;
                        g44Var2.f40169b = b44Var;
                    }
                    g44Var2.f40173f = b44Var;
                }
                b34 b34Var = g44Var2.f40173f;
                if (b34Var == null) {
                    C3386nv.m17626m("currentDragState should not be null");
                    return;
                }
                boolean z = true;
                if (b34Var instanceof b44) {
                    b44 b44Var2 = (b44) b34Var;
                    if (((ArrayList) c3299li.m16226d()).isEmpty()) {
                        return;
                    }
                    List listM16226d = c3299li.m16226d();
                    int size = listM16226d.size();
                    while (i < size) {
                        if (!x74.m24352i((a44) ((ArrayList) listM16226d).get(i))) {
                            return;
                        } else {
                            i++;
                        }
                    }
                    a44 a44Var = (a44) u91.m22589G0(c3299li.m16226d());
                    EnumC0087xecab5e0c enumC0087xecab5e0c2 = f44.f38412a[b44Var2.f7916y.ordinal()] == 1 ? !abstractC0103k.mo844r1() ? EnumC0087xecab5e0c.Yes : EnumC0087xecab5e0c.No : b44Var2.f7916y;
                    b44Var2.f7916y = enumC0087xecab5e0c2;
                    if (pointerEventPass == PointerEventPass.Initial) {
                        if (enumC0087xecab5e0c2 == EnumC0087xecab5e0c.No) {
                            a44Var.m101a();
                            b44Var2.f7917z = true;
                        }
                        b44Var2.f7915A = true;
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (enumC0087xecab5e0c2 == EnumC0087xecab5e0c.Yes) {
                            g44.m12350c(g44Var2, a44Var, a44Var.m102b(), 0L, 12);
                            return;
                        }
                        if (b44Var2.f7917z) {
                            g44Var2.m12355f(a44Var, a44Var, new z34(c3299li.m16227e()), 0L);
                            g44Var2.m12354e(a44Var, new z34(c3299li.m16227e()), 0L);
                            long jM102b = a44Var.m102b();
                            e44 e44Var = g44Var2.f40170c;
                            if (e44Var == null) {
                                e44Var = new e44();
                                e44Var.f36692y = Long.MAX_VALUE;
                                g44Var2.f40170c = e44Var;
                            }
                            e44Var.f36692y = jM102b;
                            g44Var2.f40173f = e44Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (b34Var instanceof d44) {
                    d44 d44Var = (d44) b34Var;
                    if (pointerEventPass == PointerEventPass.Initial) {
                        return;
                    }
                    List listM16226d2 = c3299li.m16226d();
                    int size2 = listM16226d2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            obj3 = null;
                            break;
                        }
                        obj3 = ((ArrayList) listM16226d2).get(i2);
                        int i3 = size2;
                        if (pk9.m19371i(((a44) obj3).m102b(), d44Var.f34990z)) {
                            break;
                        }
                        i2++;
                        size2 = i3;
                    }
                    a44 a44Var2 = (a44) obj3;
                    if (a44Var2 == null) {
                        List listM16226d3 = c3299li.m16226d();
                        int size3 = listM16226d3.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                obj5 = null;
                                break;
                            }
                            obj5 = ((ArrayList) listM16226d3).get(i4);
                            if (((a44) obj5).m104d()) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        a44Var2 = (a44) obj5;
                        if (a44Var2 == null) {
                            g44Var2.m12351a();
                            return;
                        }
                        d44Var.f34990z = a44Var2.m102b();
                    }
                    if (pointerEventPass == PointerEventPass.Main) {
                        if (a44Var2.m108h()) {
                            a44 a44Var3 = d44Var.f34989y;
                            if (a44Var3 == null) {
                                C3386nv.m17626m("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j = d44Var.f34990z;
                            s01 s01Var = g44Var2.f40175h;
                            if (s01Var == null) {
                                C3386nv.m17626m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            g44Var2.m12352b(a44Var3, j, s01Var);
                        } else if (x74.m24345b(a44Var2)) {
                            List listM16226d4 = c3299li.m16226d();
                            int size4 = listM16226d4.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size4) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = ((ArrayList) listM16226d4).get(i5);
                                if (((a44) obj4).m104d()) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            a44 a44Var4 = (a44) obj4;
                            if (a44Var4 == null) {
                                g44Var2.m12351a();
                            } else {
                                d44Var.f34990z = a44Var4.m102b();
                            }
                        } else {
                            hta htaVar = (hta) thb.m22050i(abstractC0103k, AbstractC0402n.f4829u);
                            float f2 = AbstractC0102j.f2266a;
                            float fMo13460f = htaVar.mo13460f();
                            s01 s01Var2 = g44Var2.f40175h;
                            if (s01Var2 == null) {
                                C3386nv.m17626m("Touch slop detector not initialized.");
                                return;
                            }
                            long jM20989e = s01.m20989e(s01Var2, x74.m24334A(a44Var2, abstractC0103k.f2267L, new z34(c3299li.m16227e()), true), fMo13460f);
                            if ((9223372034707292159L & jM20989e) != 9205357640488583168L) {
                                a44Var2.m101a();
                                a44 a44Var5 = d44Var.f34989y;
                                a44Var5.getClass();
                                g44Var2.m12355f(a44Var5, a44Var2, new z34(c3299li.m16227e()), jM20989e);
                                g44Var2.m12354e(a44Var2, new z34(c3299li.m16227e()), jM20989e);
                                long jM102b2 = a44Var2.m102b();
                                e44 e44Var2 = g44Var2.f40170c;
                                if (e44Var2 == null) {
                                    e44Var2 = new e44();
                                    e44Var2.f36692y = Long.MAX_VALUE;
                                    g44Var2.f40170c = e44Var2;
                                }
                                e44Var2.f36692y = jM102b2;
                                g44Var2.f40173f = e44Var2;
                            } else {
                                d44Var.f34988A = true;
                            }
                        }
                    }
                    if (pointerEventPass == PointerEventPass.Final && d44Var.f34988A) {
                        if (!a44Var2.m108h()) {
                            d44Var.f34988A = false;
                            return;
                        }
                        a44 a44Var6 = d44Var.f34989y;
                        if (a44Var6 == null) {
                            C3386nv.m17626m("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j2 = d44Var.f34990z;
                        s01 s01Var3 = g44Var2.f40175h;
                        if (s01Var3 != null) {
                            g44Var2.m12352b(a44Var6, j2, s01Var3);
                            return;
                        } else {
                            C3386nv.m17626m("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (b34Var instanceof c44) {
                    c44 c44Var = (c44) b34Var;
                    if (pointerEventPass != PointerEventPass.Final) {
                        return;
                    }
                    List listM16226d5 = c3299li.m16226d();
                    int size5 = listM16226d5.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        if (((a44) ((ArrayList) listM16226d5).get(i6)).m108h()) {
                            z = false;
                            break;
                        }
                    }
                    List listM16226d6 = c3299li.m16226d();
                    int size6 = listM16226d6.size();
                    while (i < size6) {
                        if (((a44) ((ArrayList) listM16226d6).get(i)).m104d()) {
                            if (((ArrayList) c3299li.m16226d()).isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jM24336C = x74.m24336C((a44) u91.m22589G0(c3299li.m16226d()), abstractC0103k.f2267L, new z34(c3299li.m16227e()));
                                a44 a44Var7 = c44Var.f9474y;
                                a44Var7.getClass();
                                long jM12824e = gq6.m12824e(jM24336C, x74.m24336C(a44Var7, abstractC0103k.f2267L, new z34(c3299li.m16227e())));
                                a44 a44Var8 = c44Var.f9474y;
                                if (a44Var8 != null) {
                                    g44.m12350c(g44Var2, a44Var8, c44Var.f9475z, jM12824e, 8);
                                    return;
                                } else {
                                    C3386nv.m17626m("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                        i++;
                    }
                    g44Var2.m12351a();
                    return;
                }
                if (!(b34Var instanceof e44)) {
                    gm5.m12750e();
                    return;
                }
                e44 e44Var3 = (e44) b34Var;
                if (pointerEventPass != PointerEventPass.Main) {
                    return;
                }
                long j3 = e44Var3.f36692y;
                List listM16226d7 = c3299li.m16226d();
                int size7 = listM16226d7.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size7) {
                        obj = null;
                        break;
                    }
                    obj = ((ArrayList) listM16226d7).get(i7);
                    if (pk9.m19371i(((a44) obj).m102b(), j3)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                a44 a44Var9 = (a44) obj;
                if (a44Var9 == null) {
                    return;
                }
                boolean zM24345b = x74.m24345b(a44Var9);
                ok2 ok2Var = ok2.f54491a;
                if (!zM24345b) {
                    if (a44Var9.m108h()) {
                        abstractC0103k.m884k1(ok2Var);
                        return;
                    } else {
                        if (gq6.m12822c(x74.m24334A(a44Var9, abstractC0103k.f2267L, new z34(c3299li.m16227e()), true)) == 0.0f) {
                            return;
                        }
                        g44Var2.m12354e(a44Var9, new z34(c3299li.m16227e()), x74.m24334A(a44Var9, abstractC0103k.f2267L, new z34(c3299li.m16227e()), false));
                        a44Var9.m101a();
                        return;
                    }
                }
                List listM16226d8 = c3299li.m16226d();
                int size8 = listM16226d8.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size8) {
                        obj2 = null;
                        break;
                    }
                    obj2 = ((ArrayList) listM16226d8).get(i8);
                    if (((a44) obj2).m104d()) {
                        break;
                    } else {
                        i8++;
                    }
                }
                a44 a44Var10 = (a44) obj2;
                if (a44Var10 != null) {
                    e44Var3.f36692y = a44Var10.m102b();
                    return;
                }
                if (a44Var9.m108h() || !x74.m24345b(a44Var9)) {
                    abstractC0103k.m884k1(ok2Var);
                } else {
                    int iM16227e = c3299li.m16227e();
                    gw9 gw9VarM12353d = g44Var2.m12353d();
                    Orientation orientation = abstractC0103k.f2267L;
                    C3126ix c3126ix = g44Var2.f40176i;
                    h66 h66Var = (h66) c3126ix.f44721c;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (a44Var9.m103c() >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (a44Var9.m103c() & 4294967295L));
                    if (x74.m24352i(a44Var9)) {
                        c3126ix.f44720b = 0;
                        h66Var.m13093j();
                    }
                    if (x74.m24345b(a44Var9) || x74.m24352i(a44Var9)) {
                        f = 0.0f;
                    } else {
                        if (h66Var.f1294b == 3) {
                            int i9 = c3126ix.f44720b;
                            c3126ix.f44720b = i9 + 1;
                            h66Var.m13098o(i9, a44Var9);
                        } else {
                            h66Var.m13090g(a44Var9);
                        }
                        if (c3126ix.f44720b == 3) {
                            c3126ix.f44720b = 0;
                        }
                        Object[] objArr = h66Var.f1293a;
                        int i10 = h66Var.f1294b;
                        float fIntBitsToFloat4 = 0.0f;
                        for (int i11 = 0; i11 < i10; i11++) {
                            fIntBitsToFloat4 += Float.intBitsToFloat((int) (((a44) objArr[i11]).m103c() >> 32));
                        }
                        int i12 = h66Var.f1294b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i12;
                        Object[] objArr2 = h66Var.f1293a;
                        int i13 = 0;
                        float fIntBitsToFloat5 = 0.0f;
                        while (i13 < i12) {
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((a44) objArr2[i13]).m103c() & 4294967295L));
                            i13++;
                            i12 = i12;
                        }
                        f = 0.0f;
                        fIntBitsToFloat3 = fIntBitsToFloat5 / h66Var.f1294b;
                    }
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                    if (orientation != null) {
                        if (iM16227e == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
                        } else if (iM16227e == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                        }
                        if (orientation == Orientation.Horizontal) {
                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                            iFloatToRawIntBits = Float.floatToRawIntBits(f);
                        } else {
                            jFloatToRawIntBits = Float.floatToRawIntBits(f);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                        }
                        jFloatToRawIntBits2 = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                    }
                    ((cn5) gw9VarM12353d.f41432b).m4896a(a44Var9.m107g(), jFloatToRawIntBits2);
                    float fMo13459e = ((hta) thb.m22050i(abstractC0103k, AbstractC0402n.f4829u)).mo13459e();
                    long jM12935d = g44Var2.m12353d().m12935d(uea.m22716a(fMo13459e, fMo13459e));
                    cn5 cn5Var = (cn5) g44Var2.m12353d().f41432b;
                    fpa fpaVar = (fpa) cn5Var.f10327b;
                    b02[] b02VarArr = fpaVar.f39437d;
                    AbstractC3550rv.m20833a0(0, b02VarArr.length, null, b02VarArr);
                    fpaVar.f39438e = 0;
                    fpa fpaVar2 = (fpa) cn5Var.f10328c;
                    b02[] b02VarArr2 = fpaVar2.f39437d;
                    AbstractC3550rv.m20833a0(0, b02VarArr2.length, null, b02VarArr2);
                    fpaVar2.f39438e = 0;
                    cn5Var.f10326a = 0L;
                    abstractC0103k.m884k1(new rk2(AbstractC0104l.m893c(jM12935d), true));
                }
                g44Var2.m12351a();
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m881f1() {
        xk2 xk2Var = this.f2272Q;
        if (xk2Var != null) {
            v56 v56Var = this.f2270O;
            if (v56Var != null) {
                v56Var.m23126b(new wk2(xk2Var));
            }
            this.f2272Q = null;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public abstract Object mo841g1(zi3 zi3Var, Continuation continuation);

    /* JADX INFO: renamed from: h1 */
    public final void m882h1() {
        this.f2276U = 0L;
        kk2 kk2Var = this.f2275T;
        if (kk2Var == null) {
            DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
            kk2Var = new kk2();
            kk2Var.f47450p = dragDetectionState$AwaitDown$AwaitTouchSlop;
            kk2Var.f47451q = false;
            kk2Var.f47452r = false;
            this.f2275T = kk2Var;
        }
        kk2Var.f47450p = DragDetectionState$AwaitDown$AwaitTouchSlop.NotInitialized;
        kk2Var.f47451q = false;
        kk2Var.f47452r = false;
        this.f2282a0 = kk2Var;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m883i1(kg7 kg7Var, long j, s01 s01Var) {
        lk2 lk2Var = this.f2281Z;
        if (lk2Var == null) {
            lk2Var = new lk2();
            lk2Var.f49757p = null;
            lk2Var.f49758q = Long.MAX_VALUE;
            this.f2281Z = lk2Var;
        }
        lk2Var.f49757p = kg7Var;
        lk2Var.f49758q = j;
        s01Var.f60110b = 0L;
        this.f2282a0 = lk2Var;
    }

    @Override // p000.h44
    /* JADX INFO: renamed from: k0 */
    public final void mo820k0() {
        g44 g44Var = this.f2285d0;
        if (g44Var != null) {
            g44Var.m12351a();
            AbstractC0103k abstractC0103k = g44Var.f40168a;
            if (abstractC0103k.f2273R) {
                abstractC0103k.m884k1(ok2.f54491a);
            }
            g44Var.f40174g = null;
            C3126ix c3126ix = g44Var.f40177j;
            c3126ix.f44720b = 0;
            ((x56) c3126ix.f44721c).f67781b = 0;
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m884k1(sk2 sk2Var) {
        if ((sk2Var instanceof qk2) && !this.f2273R) {
            this.f2273R = true;
            m889s1();
        }
        m885n1().mo4677k(sk2Var);
    }

    /* JADX INFO: renamed from: l1 */
    public abstract void mo842l1(long j);

    /* JADX INFO: renamed from: m1 */
    public abstract void mo843m1(rk2 rk2Var);

    /* JADX INFO: renamed from: n1 */
    public final cu0 m885n1() {
        C3211a c3211a = this.f2271P;
        if (c3211a != null) {
            return c3211a;
        }
        C3386nv.m17626m("Events channel not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: o1 */
    public final gw9 m886o1() {
        gw9 gw9Var = this.f2283b0;
        if (gw9Var != null) {
            return gw9Var;
        }
        C3386nv.m17626m("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m887p1(long j, kg7 kg7Var) {
        this.f2276U = gq6.m12825f(this.f2276U, j);
        afa.m351a(m886o1(), kg7Var);
        m885n1().mo4677k(new pk2(j, false));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m888q1(kg7 kg7Var, kg7 kg7Var2, long j) {
        if (this.f2283b0 == null) {
            this.f2283b0 = new gw9(5);
        }
        afa.m351a(m886o1(), kg7Var);
        long jM12824e = gq6.m12824e(kg7Var2.f47237c, j);
        if (((Boolean) this.f2268M.invoke(new rg7(kg7Var.f47243i))).booleanValue()) {
            if (!this.f2273R) {
                if (this.f2271P == null) {
                    this.f2271P = do7.m10525a(Integer.MAX_VALUE, 6, null);
                }
                m889s1();
            }
            m885n1().mo4677k(new qk2(jM12824e));
        }
    }

    /* JADX INFO: renamed from: r1 */
    public abstract boolean mo844r1();

    /* JADX INFO: renamed from: s1 */
    public final void m889s1() {
        this.f2273R = true;
        if (this.f2271P == null) {
            this.f2271P = do7.m10525a(Integer.MAX_VALUE, 6, null);
        }
        wfb.m23926u(m9971N0(), null, null, new DragGestureNode$startListeningForEvents$1(this, null), 3);
    }

    /* JADX INFO: renamed from: t1 */
    public final void m890t1(vi3 vi3Var, boolean z, v56 v56Var, Orientation orientation, boolean z2) {
        this.f2268M = vi3Var;
        boolean z3 = true;
        if (this.f2269N != z) {
            this.f2269N = z;
            if (!z) {
                jl3 jl3Var = this.f2278W;
                if (jl3Var != null) {
                    m11625a1(jl3Var);
                }
                jl3 jl3Var2 = this.f2277V;
                if (jl3Var2 != null) {
                    m11625a1(jl3Var2);
                }
                this.f2278W = null;
                this.f2277V = null;
                m881f1();
                this.f2285d0 = null;
            }
            z2 = true;
        }
        if (!fa4.m11650l(this.f2270O, v56Var)) {
            m881f1();
            this.f2270O = v56Var;
        }
        if (this.f2267L != orientation) {
            this.f2267L = orientation;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.f2274S;
            ok2 ok2Var = ok2.f54491a;
            if (z4) {
                m882h1();
                if (this.f2273R) {
                    m885n1().mo4677k(ok2Var);
                }
                this.f2283b0 = null;
            }
            g44 g44Var = this.f2285d0;
            if (g44Var != null) {
                g44Var.m12351a();
                AbstractC0103k abstractC0103k = g44Var.f40168a;
                if (abstractC0103k.f2273R) {
                    abstractC0103k.m884k1(ok2Var);
                }
                g44Var.f40174g = null;
                C3126ix c3126ix = g44Var.f40177j;
                c3126ix.f44720b = 0;
                ((x56) c3126ix.f44721c).f67781b = 0;
            }
        }
    }
}
