package p000;

import androidx.compose.foundation.gestures.C0106n;
import androidx.compose.foundation.gestures.C0116v;
import androidx.compose.foundation.text.input.internal.C0188b;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3450p7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55670a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f55671b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f55672c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f55673d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f55674e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f55675f;

    public /* synthetic */ C3450p7(ja5 ja5Var, b85 b85Var, n4b n4bVar, Set set, String str) {
        this.f55670a = 1;
        this.f55672c = ja5Var;
        this.f55673d = b85Var;
        this.f55674e = n4bVar;
        this.f55675f = set;
        this.f55671b = str;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f55670a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f55675f;
        Object obj3 = this.f55674e;
        Object obj4 = this.f55671b;
        Object obj5 = this.f55673d;
        Object obj6 = this.f55672c;
        switch (i) {
            case 0:
                C3137j7 c3137j7 = (C3137j7) obj6;
                c3137j7.f45128a = ((sc1) obj5).m21217d((String) obj4, (pk9) obj3, new C3487q7((t66) obj2, 0));
                return new C3525r7(c3137j7, 0);
            case 1:
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                List list = ((ja5) obj6).f45337b;
                vu4Var.m23547h(list.size(), new cm1(5, new tf4(15), list), new ri0(list, 2), new C0282a(802480018, true, new cb5(list, (b85) obj5, (n4b) obj3, (Set) obj2, (String) obj4)));
                return xfaVar;
            case 2:
                C0106n c0106n = (C0106n) obj6;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                C0116v c0116v = (C0116v) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                x36 x36VarM896g = C0106n.m896g(c0106n.f2294g);
                if (x36VarM896g != null) {
                    b64 b64Var = c0106n.f2300e;
                    long j = x36VarM896g.f67723b;
                    long j2 = x36VarM896g.f67722a;
                    ((fpa) b64Var.f8006a).m11988a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((fpa) b64Var.f8007b).m11988a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    x36 x36VarM24253a = ((x36) ref$ObjectRef.f47718a).m24253a(x36VarM896g);
                    ref$ObjectRef.f47718a = x36VarM24253a;
                    float fM937i = c0116v.m937i(c0116v.m933e(x36VarM24253a.f67722a));
                    ref$FloatRef.f47715a = fM937i;
                    ref$BooleanRef.f47713a = !do7.m10529e(fM937i - fFloatValue);
                }
                return Boolean.valueOf(x36VarM896g != null);
            default:
                mq6 mq6Var = (mq6) obj5;
                vv9 vv9Var = (vv9) obj4;
                yw4 yw4Var = (yw4) obj3;
                pd9 pd9Var = (pd9) obj2;
                C0358h c0358h = (C0358h) obj;
                c0358h.m1614b();
                float fM19861h = ((C0188b) obj6).f2946c.m19861h();
                if (fM19861h != 0.0f) {
                    long j3 = vv9Var.f65991b;
                    int i2 = cx9.f34693c;
                    int iMo13411t = mq6Var.mo13411t((int) (j3 >> 32));
                    sw9 sw9VarM25363d = yw4Var.m25363d();
                    e28 e28VarM20956c = sw9VarM25363d != null ? sw9VarM25363d.f61519a.m20956c(iMo13411t) : new e28(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(c0358h.mo912g0(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = e28VarM20956c.f36620a + f;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c0358h.f4358a.mo1422h() >> 32)) - f;
                    if (f2 > fIntBitsToFloat) {
                        f2 = fIntBitsToFloat;
                    }
                    if (f2 >= f) {
                        f = f2;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
                    InterfaceC0310a.m1420v0(c0358h, pd9Var, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(e28VarM20956c.f36621b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(e28VarM20956c.f36623d)) & 4294967295L), fFloor, fM19861h, 432);
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C3450p7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f55670a = i;
        this.f55672c = obj;
        this.f55673d = obj2;
        this.f55671b = obj3;
        this.f55674e = obj4;
        this.f55675f = obj5;
    }
}
