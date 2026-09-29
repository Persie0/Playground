package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.InterfaceC0025an;
import p000.dpa;
import p000.f32;
import p000.gq6;
import p000.k7a;
import p000.l7a;
import p000.pj6;
import p000.ps2;
import p000.rv2;

/* JADX INFO: renamed from: androidx.compose.material3.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C0254m implements pj6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3556a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k7a f3557b;

    public /* synthetic */ C0254m(k7a k7aVar, int i) {
        this.f3556a = i;
        this.f3557b = k7aVar;
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: P */
    public final long mo1183P(int i, long j) {
        int i2 = this.f3556a;
        k7a k7aVar = this.f3557b;
        switch (i2) {
            case 0:
                ps2 ps2Var = (ps2) k7aVar;
                l7a l7aVar = ps2Var.f56737a;
                if (!((Boolean) ps2Var.f56740d.mo0a()).booleanValue()) {
                    return 0L;
                }
                float fM19861h = l7aVar.f49259d.m19861h();
                l7aVar.m15983f(Float.intBitsToFloat((int) (4294967295L & j)) + l7aVar.f49259d.m19861h());
                if (fM19861h == l7aVar.f49259d.m19861h()) {
                    return 0L;
                }
                return gq6.m12820a(j, 0.0f, 2);
            default:
                rv2 rv2Var = (rv2) k7aVar;
                l7a l7aVar2 = rv2Var.f59843a;
                if (!((Boolean) rv2Var.f59846d.mo0a()).booleanValue()) {
                    return 0L;
                }
                int i3 = (int) (4294967295L & j);
                if (Float.intBitsToFloat(i3) > 0.0f) {
                    return 0L;
                }
                float fM19861h2 = l7aVar2.f49259d.m19861h();
                l7aVar2.m15983f(Float.intBitsToFloat(i3) + l7aVar2.f49259d.m19861h());
                if (fM19861h2 == l7aVar2.f49259d.m19861h()) {
                    return 0L;
                }
                return gq6.m12820a(j, 0.0f, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // p000.pj6
    /* JADX INFO: renamed from: t */
    public final Object mo919t(long j, long j2, Continuation continuation) throws Throwable {
        EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$2;
        long j3;
        long j4;
        C0211x78ae0263 c0211x78ae0263;
        C0211x78ae0263 c0211x78ae0264;
        long j5;
        long j6 = j2;
        int i = this.f3556a;
        k7a k7aVar = this.f3557b;
        switch (i) {
            case 0:
                ps2 ps2Var = (ps2) k7aVar;
                l7a l7aVar = ps2Var.f56737a;
                if (continuation instanceof EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
                    enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) continuation;
                    int i2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3178d;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3178d = i2 - Integer.MIN_VALUE;
                    } else {
                        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, (ContinuationImpl) continuation);
                    }
                } else {
                    enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, (ContinuationImpl) continuation);
                }
                Object objMo919t = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3176b;
                Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3178d;
                if (i3 != 0) {
                    if (i3 == 1) {
                        j3 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3175a;
                        AbstractC3193b.m15359b(objMo919t);
                        enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
                    } else {
                        if (i3 != 2) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j4 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3175a;
                        AbstractC3193b.m15359b(objMo919t);
                    }
                    return new dpa(dpa.m10574e(j4, ((dpa) objMo919t).f36010a));
                }
                AbstractC3193b.m15359b(objMo919t);
                if (dpa.m10572c(j6) > 0.0f) {
                    l7aVar.m15982e(0.0f);
                }
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3175a = j6;
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1.f3178d = 1;
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$2 = enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1;
                objMo919t = super.mo919t(j, j6, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$2);
                if (objMo919t != obj) {
                    j3 = j2;
                }
                return obj;
                long j7 = ((dpa) objMo919t).f36010a;
                float fM10572c = dpa.m10572c(j3);
                f32 f32Var = ps2Var.f56739c;
                InterfaceC0025an interfaceC0025an = ps2Var.f56738b;
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$2.f3175a = j7;
                enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$2.f3178d = 2;
                Object objM1128h = AbstractC0218a.m1128h(l7aVar, fM10572c, f32Var, interfaceC0025an, enterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$2);
                if (objM1128h != obj) {
                    objMo919t = objM1128h;
                    j4 = j7;
                    return new dpa(dpa.m10574e(j4, ((dpa) objMo919t).f36010a));
                }
                return obj;
            default:
                rv2 rv2Var = (rv2) k7aVar;
                l7a l7aVar2 = rv2Var.f59843a;
                if (continuation instanceof C0211x78ae0263) {
                    c0211x78ae0263 = (C0211x78ae0263) continuation;
                    int i4 = c0211x78ae0263.f3182d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0211x78ae0263.f3182d = i4 - Integer.MIN_VALUE;
                    } else {
                        c0211x78ae0263 = new C0211x78ae0263(this, (ContinuationImpl) continuation);
                    }
                } else {
                    c0211x78ae0263 = new C0211x78ae0263(this, (ContinuationImpl) continuation);
                }
                Object objMo919t2 = c0211x78ae0263.f3180b;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = c0211x78ae0263.f3182d;
                if (i5 == 0) {
                    AbstractC3193b.m15359b(objMo919t2);
                    if (dpa.m10572c(j6) > 0.0f) {
                        l7aVar2.m15982e(0.0f);
                    }
                    c0211x78ae0263.f3179a = j6;
                    c0211x78ae0263.f3182d = 1;
                    c0211x78ae0264 = c0211x78ae0263;
                    objMo919t2 = super.mo919t(j, j6, c0211x78ae0264);
                    if (objMo919t2 != obj2) {
                    }
                    return obj2;
                }
                if (i5 == 1) {
                    j6 = c0211x78ae0263.f3179a;
                    AbstractC3193b.m15359b(objMo919t2);
                    c0211x78ae0264 = c0211x78ae0263;
                } else {
                    if (i5 != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j5 = c0211x78ae0263.f3179a;
                    AbstractC3193b.m15359b(objMo919t2);
                }
                return new dpa(dpa.m10574e(j5, ((dpa) objMo919t2).f36010a));
                long j8 = ((dpa) objMo919t2).f36010a;
                float fM10572c2 = dpa.m10572c(j6);
                f32 f32Var2 = rv2Var.f59845c;
                InterfaceC0025an interfaceC0025an2 = rv2Var.f59844b;
                c0211x78ae0264.f3179a = j8;
                c0211x78ae0264.f3182d = 2;
                Object objM1128h2 = AbstractC0218a.m1128h(l7aVar2, fM10572c2, f32Var2, interfaceC0025an2, c0211x78ae0264);
                if (objM1128h2 != obj2) {
                    objMo919t2 = objM1128h2;
                    j5 = j8;
                    return new dpa(dpa.m10574e(j5, ((dpa) objMo919t2).f36010a));
                }
                return obj2;
        }
    }

    @Override // p000.pj6
    /* JADX INFO: renamed from: u0 */
    public final long mo920u0(int i, long j, long j2) {
        int i2 = this.f3556a;
        k7a k7aVar = this.f3557b;
        switch (i2) {
            case 0:
                ps2 ps2Var = (ps2) k7aVar;
                if (((Boolean) ps2Var.f56740d.mo0a()).booleanValue()) {
                    l7a l7aVar = ps2Var.f56737a;
                    l7aVar.m15982e(Float.intBitsToFloat((int) (j & 4294967295L)) + l7aVar.f49257b.m19861h());
                }
                return 0L;
            default:
                rv2 rv2Var = (rv2) k7aVar;
                l7a l7aVar2 = rv2Var.f59843a;
                if (!((Boolean) rv2Var.f59846d.mo0a()).booleanValue()) {
                    return 0L;
                }
                int i3 = (int) (j & 4294967295L);
                l7aVar2.m15982e(Float.intBitsToFloat(i3) + l7aVar2.f49257b.m19861h());
                int i4 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i4) < 0.0f || Float.intBitsToFloat(i3) < 0.0f) {
                    float fM19861h = l7aVar2.f49259d.m19861h();
                    l7aVar2.m15983f(Float.intBitsToFloat(i3) + l7aVar2.f49259d.m19861h());
                    float fM19861h2 = l7aVar2.f49259d.m19861h() - fM19861h;
                    return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fM19861h2)) & 4294967295L);
                }
                if (Float.intBitsToFloat(i4) <= 0.0f) {
                    return 0L;
                }
                float fM19861h3 = l7aVar2.f49259d.m19861h();
                l7aVar2.m15983f(Float.intBitsToFloat(i4) + l7aVar2.f49259d.m19861h());
                float fM19861h4 = l7aVar2.f49259d.m19861h() - fM19861h3;
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fM19861h4)) & 4294967295L);
        }
    }
}
