package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.layout.AbstractC0343j;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class of0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f54258c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f54259d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Serializable f54260e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f54261f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f54262g;

    public /* synthetic */ of0(Object obj, Object obj2, Object obj3, Serializable serializable, Object obj4, Object obj5, int i) {
        this.f54256a = i;
        this.f54257b = obj;
        this.f54258c = obj2;
        this.f54259d = obj3;
        this.f54260e = serializable;
        this.f54261f = obj4;
        this.f54262g = obj5;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f54256a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f54262g;
        Object obj3 = this.f54261f;
        Serializable serializable = this.f54260e;
        Object obj4 = this.f54259d;
        Object obj5 = this.f54258c;
        Object obj6 = this.f54257b;
        switch (i) {
            case 0:
                mi8 mi8Var = (mi8) obj5;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj4;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                C3500qj c3500qj = (C3500qj) obj3;
                vi0 vi0Var = (vi0) obj2;
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                gj9 gj9Var = (gj9) ((w41) obj6).f66366b;
                gj9Var.getClass();
                float fFloatValue = Float.valueOf(gj9Var.f40881b).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                boolean z = 2.0f * fFloatValue > Math.min(Math.abs(mi8Var.m16846b()), Math.abs(mi8Var.m16845a()));
                if (ref$FloatRef.f47715a != fFloatValue) {
                    c3500qj.m19991h();
                    C3500qj.m19986c(c3500qj, mi8Var);
                    if (!z) {
                        C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
                        C3500qj.m19986c(c3500qjM22757a, new mi8(mi8Var.f51360a + fFloatValue, mi8Var.f51361b + fFloatValue, mi8Var.f51362c - fFloatValue, mi8Var.f51363d - fFloatValue, do7.m10518E(fFloatValue, mi8Var.f51364e), do7.m10518E(fFloatValue, mi8Var.f51365f), do7.m10518E(fFloatValue, mi8Var.f51366g), do7.m10518E(fFloatValue, mi8Var.f51367h)));
                        c3500qj.m19990g(c3500qj, c3500qjM22757a, 0);
                    }
                    ref$ObjectRef.f47718a = c3500qj;
                    ref$FloatRef.f47715a = fFloatValue;
                }
                Object obj7 = ref$ObjectRef.f47718a;
                obj7.getClass();
                InterfaceC0310a.m1413G0(interfaceC0310a, (C3500qj) obj7, vi0Var, 0.0f, null, null, 60);
                break;
            default:
                l87[] l87VarArr = (l87[]) obj6;
                List list = (List) obj5;
                jt5 jt5Var = (jt5) obj4;
                Ref$IntRef ref$IntRef = (Ref$IntRef) serializable;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj3;
                sh0 sh0Var = (sh0) obj2;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                int length = l87VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    l87 l87Var = l87VarArr[i2];
                    l87Var.getClass();
                    qh0.m19964b(abstractC0343j, l87Var, (ct5) list.get(i3), jt5Var.getLayoutDirection(), ref$IntRef.f47716a, ref$IntRef2.f47716a, sh0Var.f60856a);
                    i2++;
                    i3++;
                }
                break;
        }
        return xfaVar;
    }
}
