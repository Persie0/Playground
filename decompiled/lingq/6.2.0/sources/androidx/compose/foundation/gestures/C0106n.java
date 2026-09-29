package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.b64;
import p000.do7;
import p000.do8;
import p000.dpa;
import p000.fb2;
import p000.fg7;
import p000.fpa;
import p000.gq6;
import p000.ho8;
import p000.iu0;
import p000.kg7;
import p000.m58;
import p000.omd;
import p000.pg9;
import p000.r46;
import p000.u91;
import p000.uea;
import p000.vx8;
import p000.w36;
import p000.x36;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0106n extends AbstractC0107o {

    /* JADX INFO: renamed from: f */
    public final m58 f2293f;

    /* JADX INFO: renamed from: g */
    public final C3211a f2294g;

    /* JADX INFO: renamed from: h */
    public pg9 f2295h;

    public C0106n(C0116v c0116v, m58 m58Var, zi3 zi3Var, fb2 fb2Var) {
        super(c0116v, zi3Var, fb2Var);
        this.f2293f = m58Var;
        this.f2294g = do7.m10525a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX INFO: renamed from: c */
    public static final Object m894c(C0106n c0106n, C0116v c0116v, x36 x36Var, float f, float f2, ContinuationImpl continuationImpl) throws Throwable {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        xfa xfaVar;
        Ref$FloatRef ref$FloatRef;
        float f3;
        C0116v c0116v2;
        C0106n c0106n2 = c0106n;
        c0106n2.getClass();
        b64 b64Var = c0106n2.f2300e;
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuationImpl;
            int i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.f1987f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.f1987f = i - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(c0106n2, continuationImpl);
            }
        } else {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(c0106n2, continuationImpl);
        }
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1985d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1987f;
        xfa xfaVar2 = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f47718a = x36Var;
            long j = x36Var.f67723b;
            xfaVar = xfaVar2;
            long j2 = x36Var.f67722a;
            ((fpa) b64Var.f8006a).m11988a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((fpa) b64Var.f8007b).m11988a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            x36 x36VarM896g = m896g(c0106n2.f2294g);
            if (x36VarM896g != null) {
                long j3 = x36VarM896g.f67723b;
                long j4 = x36VarM896g.f67722a;
                ((fpa) b64Var.f8006a).m11988a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((fpa) b64Var.f8007b).m11988a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                ref$ObjectRef.f47718a = ((x36) ref$ObjectRef.f47718a).m24253a(x36VarM896g);
            }
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            float fM935g = c0116v.m935g(c0116v.m933e(((x36) ref$ObjectRef.f47718a).f67722a));
            ref$FloatRef2.f47715a = fM935g;
            if (!do7.m10529e(fM935g)) {
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.f47718a = r46.m20376a(0.0f, 0.0f, 30);
                c0106n2 = c0106n;
                MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(ref$FloatRef2, ref$ObjectRef2, ref$ObjectRef, f, c0106n2, f2, c0116v, null);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1982a = c0116v;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1983b = ref$FloatRef2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1984c = f2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1987f = 1;
                if (c0106n2.m900b(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$2) != coroutineSingletons) {
                    ref$FloatRef = ref$FloatRef2;
                    f3 = f2;
                    c0116v2 = c0116v;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar2;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1984c;
        ref$FloatRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1983b;
        c0116v2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1982a;
        AbstractC3193b.m15359b(obj);
        xfaVar = xfaVar2;
        long jM22716a = uea.m22716a(((fpa) b64Var.f8006a).m11989b(Float.MAX_VALUE), ((fpa) b64Var.f8007b).m11989b(Float.MAX_VALUE));
        if (jM22716a == 0) {
            float fM932d = c0116v2.m932d(Math.signum(ref$FloatRef.f47715a)) * Math.min(Math.abs(ref$FloatRef.f47715a) / 100.0f, f3) * 1000.0f;
            if (fM932d == 0.0f) {
                jM22716a = 0;
            } else {
                jM22716a = c0116v2.f2363d == Orientation.Horizontal ? uea.m22716a(fM932d, 0.0f) : uea.m22716a(0.0f, fM932d);
            }
        }
        zi3 zi3Var = c0106n2.f2297b;
        dpa dpaVar = new dpa(jM22716a);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1982a = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1983b = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$2.f1987f = 2;
        return zi3Var.invoke(dpaVar, mouseWheelScrollingLogic$dispatchMouseWheelScroll$2) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public static final Object m895d(C0106n c0106n, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, C0116v c0116v, Ref$ObjectRef ref$ObjectRef2, long j, ContinuationImpl continuationImpl) throws Throwable {
        C0088x7147264e c0088x7147264e;
        C0116v c0116v2;
        Ref$ObjectRef ref$ObjectRef3;
        C0106n c0106n2;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$FloatRef ref$FloatRef2;
        boolean z;
        if (continuationImpl instanceof C0088x7147264e) {
            c0088x7147264e = (C0088x7147264e) continuationImpl;
            int i = c0088x7147264e.f2006g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0088x7147264e.f2006g = i - Integer.MIN_VALUE;
            } else {
                c0088x7147264e = new C0088x7147264e(continuationImpl);
            }
        } else {
            c0088x7147264e = new C0088x7147264e(continuationImpl);
        }
        Object objM15447n = c0088x7147264e.f2005f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0088x7147264e.f2006g;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15447n);
            if (j < 0) {
                return Boolean.FALSE;
            }
            C0089x7147264f c0089x7147264f = new C0089x7147264f(c0106n, null);
            c0088x7147264e.f2000a = c0106n;
            c0088x7147264e.f2001b = ref$ObjectRef;
            c0088x7147264e.f2002c = ref$FloatRef;
            c0116v2 = c0116v;
            c0088x7147264e.f2003d = c0116v2;
            ref$ObjectRef3 = ref$ObjectRef2;
            c0088x7147264e.f2004e = ref$ObjectRef3;
            c0088x7147264e.f2006g = 1;
            objM15447n = AbstractC3208a.m15447n(j, c0089x7147264f, c0088x7147264e);
            if (objM15447n == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0106n2 = c0106n;
            ref$ObjectRef4 = ref$ObjectRef;
            ref$FloatRef2 = ref$FloatRef;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$ObjectRef ref$ObjectRef5 = c0088x7147264e.f2004e;
            C0116v c0116v3 = c0088x7147264e.f2003d;
            ref$FloatRef2 = c0088x7147264e.f2002c;
            ref$ObjectRef4 = c0088x7147264e.f2001b;
            C0106n c0106n3 = c0088x7147264e.f2000a;
            AbstractC3193b.m15359b(objM15447n);
            ref$ObjectRef3 = ref$ObjectRef5;
            c0116v2 = c0116v3;
            c0106n2 = c0106n3;
        }
        x36 x36Var = (x36) objM15447n;
        if (x36Var != null) {
            boolean z2 = ((x36) ref$ObjectRef4.f47718a).f67724c;
            long j2 = x36Var.f67722a;
            ref$ObjectRef4.f47718a = new x36(j2, x36Var.f67723b, z2);
            ref$FloatRef2.f47715a = c0116v2.m937i(c0116v2.m933e(j2));
            ref$ObjectRef3.f47718a = r46.m20376a(0.0f, 0.0f, 30);
            b64 b64Var = c0106n2.f2300e;
            long j3 = x36Var.f67723b;
            long j4 = x36Var.f67722a;
            ((fpa) b64Var.f8006a).m11988a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((fpa) b64Var.f8007b).m11988a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !do7.m10529e(ref$FloatRef2.f47715a);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g */
    public static x36 m896g(C3211a c3211a) {
        x36 x36Var = null;
        vx8 vx8VarM18129S = omd.m18129S(new NonTouchScrollingLogicKt$untilNull$1(new w36(c3211a, 0), null));
        while (vx8VarM18129S.hasNext()) {
            x36 x36VarM24253a = (x36) vx8VarM18129S.next();
            if (x36Var != null) {
                x36VarM24253a = x36Var.m24253a(x36VarM24253a);
            }
            x36Var = x36VarM24253a;
        }
        return x36Var;
    }

    /* JADX INFO: renamed from: e */
    public final float m897e(ho8 ho8Var, float f) {
        C0116v c0116v = this.f2296a;
        long jM936h = c0116v.m936h(c0116v.m932d(f));
        C0116v c0116v2 = ho8Var.f42716a;
        return c0116v.m935g(c0116v.m933e(c0116v2.m931c(c0116v2.f2370k, jM936h, 1)));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m898f(fg7 fg7Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f2293f.f50618b;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = fg7Var.f39071a;
        gq6 gq6Var = new gq6(0L);
        int size = list.size();
        boolean zMo975d = false;
        int i = 0;
        while (true) {
            j = gq6Var.f41189a;
            if (i >= size) {
                break;
            }
            gq6Var = new gq6(gq6.m12825f(j, ((kg7) list.get(i)).f47244j));
            i++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        C0116v c0116v = this.f2296a;
        float fM937i = c0116v.m937i(c0116v.m933e(jFloatToRawIntBits));
        if (fM937i != 0.0f) {
            do8 do8Var = c0116v.f2360a;
            zMo975d = fM937i > 0.0f ? do8Var.mo975d() : do8Var.mo974b();
        }
        if (zMo975d) {
            return !(this.f2294g.mo4677k(new x36(jFloatToRawIntBits, ((kg7) u91.m22589G0(fg7Var.f39071a)).f47236b, false)) instanceof iu0);
        }
        return this.f2299d;
    }
}
