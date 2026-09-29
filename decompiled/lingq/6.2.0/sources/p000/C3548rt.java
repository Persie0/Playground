package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: rt */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3548rt implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59772a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f59774c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f59775d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f59776e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59777f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f59778g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f59779h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f59780i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f59781j;

    public /* synthetic */ C3548rt(mn5 mn5Var, ui3 ui3Var, bj3 bj3Var, aj3 aj3Var, ui3 ui3Var2, ui3 ui3Var3, ui3 ui3Var4, ui3 ui3Var5, ui3 ui3Var6) {
        this.f59773b = mn5Var;
        this.f59774c = ui3Var;
        this.f59775d = bj3Var;
        this.f59776e = aj3Var;
        this.f59777f = ui3Var2;
        this.f59778g = ui3Var3;
        this.f59779h = ui3Var4;
        this.f59780i = ui3Var5;
        this.f59781j = ui3Var6;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        r17 r17Var;
        tj3 tj3Var;
        float f;
        int i = this.f59772a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f59781j;
        Object obj4 = this.f59780i;
        Object obj5 = this.f59779h;
        Object obj6 = this.f59778g;
        Object obj7 = this.f59777f;
        Object obj8 = this.f59776e;
        Object obj9 = this.f59775d;
        Object obj10 = this.f59774c;
        Object obj11 = this.f59773b;
        switch (i) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj11;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj10;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj9;
                RemoteViews remoteViews = (RemoteViews) obj4;
                j64 j64Var = (j64) obj3;
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) obj8;
                Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) obj7;
                Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) obj6;
                Ref$ObjectRef ref$ObjectRef7 = (Ref$ObjectRef) obj5;
                nn3 nn3Var = (nn3) obj2;
                if (nn3Var instanceof C0836c6) {
                    if (ref$ObjectRef.f47718a != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    ref$ObjectRef.f47718a = nn3Var;
                } else if (nn3Var instanceof m4b) {
                    ref$ObjectRef2.f47718a = nn3Var;
                } else if (nn3Var instanceof cs3) {
                    ref$ObjectRef3.f47718a = nn3Var;
                } else if (nn3Var instanceof o70) {
                    o70 o70Var = (o70) nn3Var;
                    int i2 = j64Var.f45111a;
                    if (o70Var instanceof n70) {
                        int i3 = ((n70) o70Var).f52425a.f10187a;
                        remoteViews.getClass();
                        remoteViews.setInt(i2, "setBackgroundResource", i3);
                    } else {
                        if (!(o70Var instanceof m70)) {
                            gm5.m12750e();
                            return null;
                        }
                        int i4 = ((m70) o70Var).f50693a.f64981a;
                        remoteViews.getClass();
                        if (Build.VERSION.SDK_INT >= 31) {
                            s58.m21110d(remoteViews, i2, "setBackgroundColor", i4);
                        } else {
                            remoteViews.setInt(i2, "setBackgroundResource", i4);
                        }
                    }
                } else if (nn3Var instanceof r17) {
                    r17 r17Var2 = (r17) ref$ObjectRef4.f47718a;
                    if (r17Var2 != null) {
                        r17 r17Var3 = (r17) nn3Var;
                        r17Var = new r17(r17Var2.f58487a.m17170a(r17Var3.f58487a), r17Var2.f58488b.m17170a(r17Var3.f58488b), r17Var2.f58489c.m17170a(r17Var3.f58489c), r17Var2.f58490d.m17170a(r17Var3.f58490d), r17Var2.f58491e.m17170a(r17Var3.f58491e), r17Var2.f58492f.m17170a(r17Var3.f58492f));
                    } else {
                        r17Var = (r17) nn3Var;
                    }
                    ref$ObjectRef4.f47718a = r17Var;
                } else if (nn3Var instanceof dn1) {
                    ref$ObjectRef5.f47718a = ((dn1) nn3Var).f35887a;
                } else if (!(nn3Var instanceof C3807ys) && !(nn3Var instanceof C3719we)) {
                    if (nn3Var instanceof ur2) {
                        ref$ObjectRef6.f47718a = nn3Var;
                    } else if (nn3Var instanceof lv8) {
                        ref$ObjectRef7.f47718a = nn3Var;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + nn3Var + "', nothing done.");
                    }
                }
                return xfaVar;
            default:
                mn5 mn5Var = (mn5) obj11;
                ui3 ui3Var = (ui3) obj10;
                bj3 bj3Var = (bj3) obj9;
                aj3 aj3Var = (aj3) obj8;
                ui3 ui3Var2 = (ui3) obj7;
                ui3 ui3Var3 = (ui3) obj6;
                ui3 ui3Var4 = (ui3) obj5;
                ui3 ui3Var5 = (ui3) obj4;
                ui3 ui3Var6 = (ui3) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                boolean z = mn5Var.f51563e;
                int i5 = mn5Var.f51567i;
                String str = mn5Var.f51564f;
                if (z && str.length() == 0) {
                    tj3Var2.m22111b0(-618276966);
                    AbstractC2558b.m9477j(0, tj3Var2, ui3Var);
                    tj3Var2.m22139q(false);
                    return xfaVar;
                }
                tj3Var2.m22111b0(-618168373);
                tj3Var2.m22139q(false);
                b16 b16Var = b16.f7762a;
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
                se1.f60731q.getClass();
                ui3 ui3Var7 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var7);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var2, C0352b.f4305h);
                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                AbstractC2558b.m9473f(mn5Var, tj3Var2, 0);
                if (z) {
                    tj3Var2.m22111b0(1861219922);
                    AbstractC2558b.m9468a(ci8.m4703P(-1043020753, new gn5(mn5Var), tj3Var2), tj3Var2, 6);
                    tj3Var2.m22139q(false);
                    tj3Var = tj3Var2;
                    f = 1.0f;
                } else {
                    tj3Var2.m22111b0(1861636686);
                    tj3Var = tj3Var2;
                    f = 1.0f;
                    AbstractC2558b.m9470c(mn5Var, bj3Var, aj3Var, ui3Var2, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                if (z || i5 <= -1 || str.length() <= 0) {
                    tj3Var.m22111b0(1862296149);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1861962682);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38954c));
                    AbstractC2558b.m9469b(mn5Var, ui3Var3, ui3Var4, ui3Var5, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                if (z) {
                    tj3Var.m22111b0(1862347113);
                    tj3 tj3Var3 = tj3Var;
                    ss5.m21710f(ux5.m22984g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, tj3Var, b16Var, f), null, null, false, ui3Var, ezb.f38121a, tj3Var3, 196614, 14);
                    tj3Var = tj3Var3;
                    tj3Var.m22139q(false);
                } else if (i5 > -1) {
                    tj3Var.m22111b0(1862734706);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d));
                    AbstractC2558b.m9472e(0, tj3Var, ui3Var6);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1862891349);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(true);
                return xfaVar;
        }
    }

    public /* synthetic */ C3548rt(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Context context, RemoteViews remoteViews, j64 j64Var, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, yaa yaaVar, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$ObjectRef ref$ObjectRef9) {
        this.f59773b = ref$ObjectRef;
        this.f59774c = ref$ObjectRef2;
        this.f59775d = ref$ObjectRef3;
        this.f59780i = remoteViews;
        this.f59781j = j64Var;
        this.f59776e = ref$ObjectRef4;
        this.f59777f = ref$ObjectRef6;
        this.f59778g = ref$ObjectRef8;
        this.f59779h = ref$ObjectRef9;
    }
}
