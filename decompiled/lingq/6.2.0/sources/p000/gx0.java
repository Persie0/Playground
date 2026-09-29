package p000;

import androidx.compose.material3.AbstractC0218a;
import kotlin.jvm.internal.FunctionReference;
import p000.jv0;
import p000.p84;
import p000.tj3;
import p000.ui3;
import p000.we1;
import p000.xfa;
import p000.ye1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gx0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41455a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f41456b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f41457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f41458d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f41459e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f41460f;

    public /* synthetic */ gx0(tz0 tz0Var, long j, jv0 jv0Var, ui3 ui3Var, nz9 nz9Var) {
        this.f41457c = tz0Var;
        this.f41456b = j;
        this.f41458d = jv0Var;
        this.f41459e = ui3Var;
        this.f41460f = nz9Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.f41455a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f41460f;
        Object obj4 = this.f41459e;
        Object obj5 = this.f41458d;
        Object obj6 = this.f41457c;
        final int i2 = 1;
        switch (i) {
            case 0:
                tz0 tz0Var = (tz0) obj6;
                final jv0 jv0Var = (jv0) obj5;
                final ui3 ui3Var = (ui3) obj4;
                nz9 nz9Var = (nz9) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final int i3 = 0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    if (fa4.m11650l(tz0Var.f63115c, ux0.f64483a)) {
                        tj3Var.m22111b0(-399547613);
                        tj3Var.m22139q(false);
                        j = this.f41456b;
                    } else {
                        tj3Var.m22111b0(-399546117);
                        j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p;
                        tj3Var.m22139q(false);
                    }
                    long j2 = j;
                    if (!fa4.m11650l(tz0Var.f63115c, xx0.f68916a)) {
                        tj3Var.m22111b0(500989650);
                        AbstractC0218a.m1125e(tnb.f62609b, null, ci8.m4703P(1317855730, new zi3() { // from class: com.lingq.feature.chat.d
                            @Override // p000.zi3
                            public final Object invoke(Object obj7, Object obj8) {
                                int i4 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                p84 p84Var = we1.f66679a;
                                ui3 ui3Var2 = ui3Var;
                                switch (i4) {
                                    case 0:
                                        ye1 ye1Var2 = (ye1) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        tj3 tj3Var2 = (tj3) ye1Var2;
                                        if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                            tj3Var2.m22102U();
                                        } else {
                                            jv0 jv0Var2 = jv0Var;
                                            boolean zM22124i = tj3Var2.m22124i(jv0Var2);
                                            Object objM22097O = tj3Var2.m22097O();
                                            if (zM22124i || objM22097O == p84Var) {
                                                ChatScreenKt$ChatScreen$4$3$1$1$1 chatScreenKt$ChatScreen$4$3$1$1$1 = new ChatScreenKt$ChatScreen$4$3$1$1$1(0, jv0Var2, jv0.class, "onBack", "onBack()V", 0);
                                                tj3Var2.m22131l0(chatScreenKt$ChatScreen$4$3$1$1$1);
                                                objM22097O = chatScreenKt$ChatScreen$4$3$1$1$1;
                                            }
                                            AbstractC2005i.m8901b((ui3) ((FunctionReference) objM22097O), ui3Var2, tj3Var2, 0);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var3 = (ye1) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            tj3Var3.m22102U();
                                        } else {
                                            jv0 jv0Var3 = jv0Var;
                                            boolean zM22124i2 = tj3Var3.m22124i(jv0Var3);
                                            Object objM22097O2 = tj3Var3.m22097O();
                                            if (zM22124i2 || objM22097O2 == p84Var) {
                                                ChatScreenKt$ChatScreen$4$3$2$1$1 chatScreenKt$ChatScreen$4$3$2$1$1 = new ChatScreenKt$ChatScreen$4$3$2$1$1(0, jv0Var3, jv0.class, "onBack", "onBack()V", 0);
                                                tj3Var3.m22131l0(chatScreenKt$ChatScreen$4$3$2$1$1);
                                                objM22097O2 = chatScreenKt$ChatScreen$4$3$2$1$1;
                                            }
                                            AbstractC2005i.m8901b((ui3) ((FunctionReference) objM22097O2), ui3Var2, tj3Var3, 0);
                                        }
                                        break;
                                }
                                return xfaVar2;
                            }
                        }, tj3Var), ci8.m4703P(1687901225, new C3180kd(5, tz0Var, nz9Var), tj3Var), 0.0f, null, h7a.m13120g(j2, 0L, 0L, 0L, tj3Var, 62), null, null, tj3Var, 3462, 434);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(499140376);
                        AbstractC0218a.m1121a(tnb.f62608a, null, ci8.m4703P(-1360564586, new zi3() { // from class: com.lingq.feature.chat.d
                            @Override // p000.zi3
                            public final Object invoke(Object obj7, Object obj8) {
                                int i4 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                p84 p84Var = we1.f66679a;
                                ui3 ui3Var2 = ui3Var;
                                switch (i4) {
                                    case 0:
                                        ye1 ye1Var2 = (ye1) obj7;
                                        int iIntValue2 = ((Integer) obj8).intValue();
                                        tj3 tj3Var2 = (tj3) ye1Var2;
                                        if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                            tj3Var2.m22102U();
                                        } else {
                                            jv0 jv0Var2 = jv0Var;
                                            boolean zM22124i = tj3Var2.m22124i(jv0Var2);
                                            Object objM22097O = tj3Var2.m22097O();
                                            if (zM22124i || objM22097O == p84Var) {
                                                ChatScreenKt$ChatScreen$4$3$1$1$1 chatScreenKt$ChatScreen$4$3$1$1$1 = new ChatScreenKt$ChatScreen$4$3$1$1$1(0, jv0Var2, jv0.class, "onBack", "onBack()V", 0);
                                                tj3Var2.m22131l0(chatScreenKt$ChatScreen$4$3$1$1$1);
                                                objM22097O = chatScreenKt$ChatScreen$4$3$1$1$1;
                                            }
                                            AbstractC2005i.m8901b((ui3) ((FunctionReference) objM22097O), ui3Var2, tj3Var2, 0);
                                        }
                                        break;
                                    default:
                                        ye1 ye1Var3 = (ye1) obj7;
                                        int iIntValue3 = ((Integer) obj8).intValue();
                                        tj3 tj3Var3 = (tj3) ye1Var3;
                                        if (!tj3Var3.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                                            tj3Var3.m22102U();
                                        } else {
                                            jv0 jv0Var3 = jv0Var;
                                            boolean zM22124i2 = tj3Var3.m22124i(jv0Var3);
                                            Object objM22097O2 = tj3Var3.m22097O();
                                            if (zM22124i2 || objM22097O2 == p84Var) {
                                                ChatScreenKt$ChatScreen$4$3$2$1$1 chatScreenKt$ChatScreen$4$3$2$1$1 = new ChatScreenKt$ChatScreen$4$3$2$1$1(0, jv0Var3, jv0.class, "onBack", "onBack()V", 0);
                                                tj3Var3.m22131l0(chatScreenKt$ChatScreen$4$3$2$1$1);
                                                objM22097O2 = chatScreenKt$ChatScreen$4$3$2$1$1;
                                            }
                                            AbstractC2005i.m8901b((ui3) ((FunctionReference) objM22097O2), ui3Var2, tj3Var3, 0);
                                        }
                                        break;
                                }
                                return xfaVar2;
                            }
                        }, tj3Var), null, 0.0f, null, h7a.m13120g(j2, 0L, 0L, 0L, tj3Var, 62), null, null, tj3Var, 390, 442);
                        tj3Var.m22139q(false);
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                efd.m11096a((String) obj6, this.f41456b, (vx9) obj5, (ks9) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gx0(String str, long j, vx9 vx9Var, ks9 ks9Var, vi3 vi3Var, int i) {
        this.f41457c = str;
        this.f41456b = j;
        this.f41458d = vx9Var;
        this.f41459e = ks9Var;
        this.f41460f = vi3Var;
    }
}
