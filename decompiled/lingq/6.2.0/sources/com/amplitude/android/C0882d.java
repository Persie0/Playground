package com.amplitude.android;

import com.amplitude.android.storage.C0898b;
import com.amplitude.core.AbstractC0903a;
import com.amplitude.core.Storage$Constants;
import com.amplitude.core.platform.Plugin$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.b90;
import p000.cl9;
import p000.do7;
import p000.fa4;
import p000.fs6;
import p000.gu2;
import p000.hu2;
import p000.iu2;
import p000.ju2;
import p000.t50;
import p000.v50;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: com.amplitude.android.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0882d extends fs6 {

    /* JADX INFO: renamed from: d */
    public final C3211a f10816d;

    /* JADX INFO: renamed from: e */
    public final AtomicLong f10817e;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f10818f;

    /* JADX INFO: renamed from: g */
    public long f10819g;

    /* JADX INFO: renamed from: h */
    public long f10820h;

    public C0882d() {
        super(28);
        this.f10816d = do7.m10525a(Integer.MAX_VALUE, 6, null);
        this.f10817e = new AtomicLong(-1L);
        this.f10818f = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: O */
    public static final Object m5063O(C0882d c0882d, ju2 ju2Var, ContinuationImpl continuationImpl) throws Throwable {
        Timeline$processEventMessage$1 timeline$processEventMessage$1;
        c0882d.getClass();
        if (continuationImpl instanceof Timeline$processEventMessage$1) {
            timeline$processEventMessage$1 = (Timeline$processEventMessage$1) continuationImpl;
            int i = timeline$processEventMessage$1.f10770d;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeline$processEventMessage$1.f10770d = i - Integer.MIN_VALUE;
            } else {
                timeline$processEventMessage$1 = new Timeline$processEventMessage$1(c0882d, continuationImpl);
            }
        } else {
            timeline$processEventMessage$1 = new Timeline$processEventMessage$1(c0882d, continuationImpl);
        }
        Object objM5070V = timeline$processEventMessage$1.f10768b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timeline$processEventMessage$1.f10770d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM5070V);
            if (ju2Var instanceof gu2) {
                long j = ((gu2) ju2Var).f41322a;
                timeline$processEventMessage$1.f10767a = c0882d;
                timeline$processEventMessage$1.f10770d = 1;
                objM5070V = c0882d.m5070V(j, timeline$processEventMessage$1);
                if (objM5070V != coroutineSingletons) {
                }
            } else {
                if (!(ju2Var instanceof hu2)) {
                    if (ju2Var instanceof iu2) {
                        c0882d.f10818f.set(false);
                        long j2 = ((iu2) ju2Var).f44571a;
                        timeline$processEventMessage$1.f10770d = 4;
                        c0882d.m5067S(j2, timeline$processEventMessage$1);
                        if (xfaVar == coroutineSingletons) {
                        }
                    }
                    return xfaVar;
                }
                b90 b90Var = ((hu2) ju2Var).f42939a;
                timeline$processEventMessage$1.f10770d = 3;
                if (c0882d.m5066R(b90Var, timeline$processEventMessage$1) != coroutineSingletons) {
                    return xfaVar;
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM5070V);
                return xfaVar;
            }
            if (i2 == 3) {
                AbstractC3193b.m15359b(objM5070V);
                return xfaVar;
            }
            if (i2 == 4) {
                AbstractC3193b.m15359b(objM5070V);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c0882d = timeline$processEventMessage$1.f10767a;
        AbstractC3193b.m15359b(objM5070V);
        c0882d.f10818f.set(true);
        timeline$processEventMessage$1.f10767a = null;
        timeline$processEventMessage$1.f10770d = 2;
        c0882d.m5065Q((List) objM5070V, timeline$processEventMessage$1);
        if (xfaVar == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: P */
    public static final long m5064P(C0882d c0882d, C0898b c0898b, Storage$Constants storage$Constants, long j) {
        Long lM4845b0;
        c0882d.getClass();
        String strM5096a = c0898b.m5096a(storage$Constants);
        return (strM5096a == null || (lM4845b0 = cl9.m4845b0(strM5096a)) == null) ? j : lM4845b0.longValue();
    }

    /* JADX INFO: renamed from: Q */
    public final xfa m5065Q(List list, ContinuationImpl continuationImpl) {
        boolean zIsEmpty = list.isEmpty();
        xfa xfaVar = xfa.f68157a;
        if (!zIsEmpty) {
            long j = this.f10819g;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b90 b90Var = (b90) it.next();
                Long l = b90Var.f8146e;
                if (l == null) {
                    l = new Long(this.f10817e.get());
                }
                b90Var.f8146e = l;
                Long l2 = b90Var.f8145d;
                if (l2 == null) {
                    long j2 = this.f10819g + 1;
                    this.f10819g = j2;
                    l2 = new Long(j2);
                }
                b90Var.f8145d = l2;
                m12113t();
                m12107j(Plugin$Type.Destination, m12107j(Plugin$Type.Enrichment, m12107j(Plugin$Type.Before, b90Var)));
            }
            if (this.f10819g > j) {
                m12113t().m5114h().m5102g(Storage$Constants.LAST_EVENT_ID, String.valueOf(this.f10819g));
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00de A[PHI: r0 r1
      0x00de: PHI (r0v2 com.amplitude.android.d) = 
      (r0v0 com.amplitude.android.d)
      (r0v0 com.amplitude.android.d)
      (r0v1 com.amplitude.android.d)
      (r0v3 com.amplitude.android.d)
      (r0v7 com.amplitude.android.d)
     binds: [B:38:0x00b2, B:43:0x00c1, B:35:0x00a9, B:48:0x00db, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r1v2 b90) = (r1v0 b90), (r1v0 b90), (r1v1 b90), (r1v4 b90), (r1v7 b90) binds: [B:38:0x00b2, B:43:0x00c1, B:35:0x00a9, B:48:0x00db, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: R */
    public final Object m5066R(b90 b90Var, ContinuationImpl continuationImpl) throws Throwable {
        Timeline$processEvent$1 timeline$processEvent$1;
        long jLongValue;
        Long l;
        C0882d c0882d = this;
        b90 b90Var2 = b90Var;
        if (continuationImpl instanceof Timeline$processEvent$1) {
            timeline$processEvent$1 = (Timeline$processEvent$1) continuationImpl;
            int i = timeline$processEvent$1.f10766f;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeline$processEvent$1.f10766f = i - Integer.MIN_VALUE;
            } else {
                timeline$processEvent$1 = new Timeline$processEvent$1(c0882d, continuationImpl);
            }
        } else {
            timeline$processEvent$1 = new Timeline$processEvent$1(c0882d, continuationImpl);
        }
        Object objM5070V = timeline$processEvent$1.f10764d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timeline$processEvent$1.f10766f;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM5070V);
            Long l2 = b90Var2.f8144c;
            jLongValue = l2 != null ? l2.longValue() : System.currentTimeMillis();
            String strMo3490a = b90Var2.mo3490a();
            if (fa4.m11650l(strMo3490a, "session_start")) {
                Long l3 = b90Var2.f8146e;
                long jLongValue2 = l3 != null ? l3.longValue() : jLongValue;
                timeline$processEvent$1.f10761a = c0882d;
                timeline$processEvent$1.f10762b = b90Var2;
                timeline$processEvent$1.f10763c = jLongValue;
                timeline$processEvent$1.f10766f = 1;
                c0882d.m5068T(jLongValue2, timeline$processEvent$1);
                if (xfaVar != coroutineSingletons) {
                    timeline$processEvent$1.f10761a = c0882d;
                    timeline$processEvent$1.f10762b = b90Var2;
                    timeline$processEvent$1.f10766f = 2;
                    c0882d.m5067S(jLongValue, timeline$processEvent$1);
                    if (xfaVar != coroutineSingletons) {
                        List listM23604J = vz1.m23604J(b90Var2);
                        timeline$processEvent$1.f10761a = null;
                        timeline$processEvent$1.f10762b = null;
                        timeline$processEvent$1.f10766f = 5;
                        c0882d.m5065Q(listM23604J, timeline$processEvent$1);
                        if (xfaVar != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
            } else if (fa4.m11650l(strMo3490a, "session_end") || ((l = b90Var2.f8146e) != null && l.longValue() == -1)) {
                List listM23604J2 = vz1.m23604J(b90Var2);
                timeline$processEvent$1.f10761a = null;
                timeline$processEvent$1.f10762b = null;
                timeline$processEvent$1.f10766f = 5;
                c0882d.m5065Q(listM23604J2, timeline$processEvent$1);
                if (xfaVar != coroutineSingletons) {
                    return xfaVar;
                }
            } else {
                timeline$processEvent$1.f10761a = c0882d;
                timeline$processEvent$1.f10762b = b90Var2;
                timeline$processEvent$1.f10766f = 3;
                objM5070V = c0882d.m5070V(jLongValue, timeline$processEvent$1);
                if (objM5070V != coroutineSingletons) {
                    timeline$processEvent$1.f10761a = c0882d;
                    timeline$processEvent$1.f10762b = b90Var2;
                    timeline$processEvent$1.f10766f = 4;
                    c0882d.m5065Q((List) objM5070V, timeline$processEvent$1);
                    if (xfaVar != coroutineSingletons) {
                        List listM23604J3 = vz1.m23604J(b90Var2);
                        timeline$processEvent$1.f10761a = null;
                        timeline$processEvent$1.f10762b = null;
                        timeline$processEvent$1.f10766f = 5;
                        c0882d.m5065Q(listM23604J3, timeline$processEvent$1);
                        if (xfaVar != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            long j = timeline$processEvent$1.f10763c;
            b90 b90Var3 = timeline$processEvent$1.f10762b;
            C0882d c0882d2 = timeline$processEvent$1.f10761a;
            AbstractC3193b.m15359b(objM5070V);
            jLongValue = j;
            b90Var2 = b90Var3;
            c0882d = c0882d2;
            timeline$processEvent$1.f10761a = c0882d;
            timeline$processEvent$1.f10762b = b90Var2;
            timeline$processEvent$1.f10766f = 2;
            c0882d.m5067S(jLongValue, timeline$processEvent$1);
            if (xfaVar != coroutineSingletons) {
                List listM23604J4 = vz1.m23604J(b90Var2);
                timeline$processEvent$1.f10761a = null;
                timeline$processEvent$1.f10762b = null;
                timeline$processEvent$1.f10766f = 5;
                c0882d.m5065Q(listM23604J4, timeline$processEvent$1);
                if (xfaVar != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                b90 b90Var4 = timeline$processEvent$1.f10762b;
                C0882d c0882d3 = timeline$processEvent$1.f10761a;
                AbstractC3193b.m15359b(objM5070V);
                b90Var2 = b90Var4;
                c0882d = c0882d3;
                timeline$processEvent$1.f10761a = c0882d;
                timeline$processEvent$1.f10762b = b90Var2;
                timeline$processEvent$1.f10766f = 4;
                c0882d.m5065Q((List) objM5070V, timeline$processEvent$1);
                if (xfaVar != coroutineSingletons) {
                    List listM23604J5 = vz1.m23604J(b90Var2);
                    timeline$processEvent$1.f10761a = null;
                    timeline$processEvent$1.f10762b = null;
                    timeline$processEvent$1.f10766f = 5;
                    c0882d.m5065Q(listM23604J5, timeline$processEvent$1);
                    if (xfaVar != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM5070V);
            }
        }
        b90 b90Var5 = timeline$processEvent$1.f10762b;
        C0882d c0882d4 = timeline$processEvent$1.f10761a;
        AbstractC3193b.m15359b(objM5070V);
        b90Var2 = b90Var5;
        c0882d = c0882d4;
        List listM23604J6 = vz1.m23604J(b90Var2);
        timeline$processEvent$1.f10761a = null;
        timeline$processEvent$1.f10762b = null;
        timeline$processEvent$1.f10766f = 5;
        c0882d.m5065Q(listM23604J6, timeline$processEvent$1);
        if (xfaVar != coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: S */
    public final xfa m5067S(long j, ContinuationImpl continuationImpl) {
        long j2 = this.f10817e.get();
        xfa xfaVar = xfa.f68157a;
        if (j2 > -1) {
            this.f10820h = j;
            m12113t().m5114h().m5102g(Storage$Constants.LAST_EVENT_TIME, String.valueOf(this.f10820h));
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: T */
    public final xfa m5068T(long j, ContinuationImpl continuationImpl) {
        AtomicLong atomicLong = this.f10817e;
        atomicLong.set(j);
        m12113t().m5114h().m5102g(Storage$Constants.PREVIOUS_SESSION_ID, String.valueOf(atomicLong.get()));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: U */
    public final Object m5069U(long j, ContinuationImpl continuationImpl) throws Throwable {
        Timeline$startNewSession$1 timeline$startNewSession$1;
        boolean z;
        List list;
        C0882d c0882d;
        List list2;
        boolean z2;
        List list3;
        C0882d c0882d2 = this;
        long j2 = j;
        if (continuationImpl instanceof Timeline$startNewSession$1) {
            timeline$startNewSession$1 = (Timeline$startNewSession$1) continuationImpl;
            int i = timeline$startNewSession$1.f10781g;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeline$startNewSession$1.f10781g = i - Integer.MIN_VALUE;
            } else {
                timeline$startNewSession$1 = new Timeline$startNewSession$1(c0882d2, continuationImpl);
            }
        } else {
            timeline$startNewSession$1 = new Timeline$startNewSession$1(c0882d2, continuationImpl);
        }
        Object obj = timeline$startNewSession$1.f10779e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timeline$startNewSession$1.f10781g;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            AbstractC0903a abstractC0903aM12113t = c0882d2.m12113t();
            C0879a c0879a = abstractC0903aM12113t instanceof C0879a ? (C0879a) abstractC0903aM12113t : null;
            if (c0879a == null) {
                return EmptyList.f47638a;
            }
            z = ((v50) ((C3244l) ((t50) c0879a.f10785r.getValue()).f61871d.f9311a).getValue()).f64874a;
            if (z) {
                AtomicLong atomicLong = c0882d2.f10817e;
                if (atomicLong.get() > -1) {
                    b90 b90Var = new b90();
                    b90Var.f8137L = "session_end";
                    b90Var.f8144c = c0882d2.f10820h > 0 ? new Long(c0882d2.f10820h) : null;
                    b90Var.f8146e = new Long(atomicLong.get());
                    arrayList.add(b90Var);
                }
            }
            timeline$startNewSession$1.f10775a = c0882d2;
            timeline$startNewSession$1.f10776b = arrayList;
            timeline$startNewSession$1.f10777c = j2;
            timeline$startNewSession$1.f10778d = z;
            timeline$startNewSession$1.f10781g = 1;
            c0882d2.m5068T(j2, timeline$startNewSession$1);
            list = arrayList;
            if (xfaVar != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            boolean z3 = timeline$startNewSession$1.f10778d;
            j2 = timeline$startNewSession$1.f10777c;
            List list4 = timeline$startNewSession$1.f10776b;
            C0882d c0882d3 = timeline$startNewSession$1.f10775a;
            AbstractC3193b.m15359b(obj);
            list = list4;
            z = z3;
            c0882d2 = c0882d3;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = timeline$startNewSession$1.f10778d;
            j2 = timeline$startNewSession$1.f10777c;
            list3 = timeline$startNewSession$1.f10776b;
            c0882d = timeline$startNewSession$1.f10775a;
            AbstractC3193b.m15359b(obj);
        }
        if (z2) {
            list2 = list3;
            b90 b90Var2 = new b90();
            b90Var2.f8137L = "session_start";
            b90Var2.f8144c = new Long(j2);
            b90Var2.f8146e = new Long(c0882d.f10817e.get());
            list2.add(b90Var2);
        }
        list2 = list3;
        return list2;
        timeline$startNewSession$1.f10775a = c0882d2;
        timeline$startNewSession$1.f10776b = list;
        timeline$startNewSession$1.f10777c = j2;
        timeline$startNewSession$1.f10778d = z;
        timeline$startNewSession$1.f10781g = 2;
        c0882d2.m5067S(j2, timeline$startNewSession$1);
        if (xfaVar != coroutineSingletons) {
            c0882d = c0882d2;
            list2 = list;
            z2 = z;
            if (z2) {
                list2 = list3;
                b90 b90Var3 = new b90();
                b90Var3.f8137L = "session_start";
                b90Var3.f8144c = new Long(j2);
                b90Var3.f8146e = new Long(c0882d.f10817e.get());
                list2.add(b90Var3);
            }
            list2 = list3;
            return list2;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public final Object m5070V(long j, ContinuationImpl continuationImpl) throws Throwable {
        Timeline$startNewSessionIfNeeded$1 timeline$startNewSessionIfNeeded$1;
        Object objM5069U;
        if (continuationImpl instanceof Timeline$startNewSessionIfNeeded$1) {
            timeline$startNewSessionIfNeeded$1 = (Timeline$startNewSessionIfNeeded$1) continuationImpl;
            int i = timeline$startNewSessionIfNeeded$1.f10784c;
            if ((i & Integer.MIN_VALUE) != 0) {
                timeline$startNewSessionIfNeeded$1.f10784c = i - Integer.MIN_VALUE;
            } else {
                timeline$startNewSessionIfNeeded$1 = new Timeline$startNewSessionIfNeeded$1(this, continuationImpl);
            }
        } else {
            timeline$startNewSessionIfNeeded$1 = new Timeline$startNewSessionIfNeeded$1(this, continuationImpl);
        }
        Object obj = timeline$startNewSessionIfNeeded$1.f10782a;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = timeline$startNewSessionIfNeeded$1.f10784c;
        EmptyList emptyList = EmptyList.f47638a;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
                return emptyList;
            }
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        m12113t();
        if (this.f10817e.get() <= -1) {
            timeline$startNewSessionIfNeeded$1.f10784c = 2;
            objM5069U = m5069U(j, timeline$startNewSessionIfNeeded$1);
            if (objM5069U == obj2) {
                return objM5069U;
            }
        } else {
            if (!this.f10818f.get()) {
                if (j - this.f10820h >= m12113t().f11016a.f10799l) {
                    timeline$startNewSessionIfNeeded$1.f10784c = 2;
                    objM5069U = m5069U(j, timeline$startNewSessionIfNeeded$1);
                    if (objM5069U == obj2) {
                        return objM5069U;
                    }
                }
            }
            timeline$startNewSessionIfNeeded$1.f10784c = 1;
            m5067S(j, timeline$startNewSessionIfNeeded$1);
            if (xfa.f68157a != obj2) {
                return emptyList;
            }
        }
        return obj2;
    }
}
