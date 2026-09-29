package p000;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.text.input.internal.C0187a;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.p012ui.dragdrop.C1919b;
import com.lingq.feature.edit.R$string;
import com.lingq.feature.edit.components.AbstractC2079b;
import com.lingq.feature.review.views.speaking.AudioMatchView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: renamed from: ri */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3537ri implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f59338c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f59339d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f59340e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59341f;

    public /* synthetic */ C3537ri(et0 et0Var, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, vi3 vi3Var2) {
        this.f59336a = 1;
        this.f59338c = et0Var;
        this.f59339d = ui3Var;
        this.f59340e = ui3Var2;
        this.f59337b = vi3Var;
        this.f59341f = vi3Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        List listSubList;
        int i;
        int i2 = this.f59336a;
        int i3 = 4;
        int i4 = 9;
        int i5 = 0;
        int i6 = 3;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f59341f;
        Object obj3 = this.f59340e;
        Object obj4 = this.f59337b;
        Object obj5 = this.f59339d;
        Object obj6 = this.f59338c;
        final int i7 = 1;
        switch (i2) {
            case 0:
                zw4 zw4Var = (zw4) obj;
                tw4 tw4Var = ((C0187a) obj5).f2940a;
                zw4Var.f72304h = (vv9) obj6;
                zw4Var.f72305i = (w04) obj3;
                zw4Var.f72299c = (bb0) obj2;
                zw4Var.f72300d = (vi3) obj4;
                zw4Var.f72301e = tw4Var != null ? tw4Var.f63007K : null;
                zw4Var.f72302f = tw4Var != null ? tw4Var.f63008L : null;
                zw4Var.f72303g = tw4Var != null ? (hta) thb.m22050i(tw4Var, AbstractC0402n.f4829u) : null;
                return xfaVar;
            case 1:
                et0 et0Var = (et0) obj6;
                ui3 ui3Var = (ui3) obj5;
                ui3 ui3Var2 = (ui3) obj3;
                vi3 vi3Var = (vi3) obj4;
                vi3 vi3Var2 = (vi3) obj2;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                ws1 ws1Var = et0Var.f37791e;
                if (ws1Var != null) {
                    vu4.m23545g(vu4Var, null, new C0282a(-1237986035, true, new ik0((Object) ws1Var, (Object) ui3Var, (Object) ui3Var2, i6)), 3);
                }
                if (et0Var.f37787a) {
                    vu4.m23545g(vu4Var, null, qnb.f57995c, 3);
                } else {
                    List list = et0Var.f37792f;
                    vu4Var.m23547h(list.size(), new ue0(i6, new C3013ft(6), list), new C3520r2(4, list), new C0282a(802480018, true, new C3558s2(list, vi3Var, vi3Var2, ui3Var, 2)));
                }
                return xfaVar;
            case 2:
                ef2 ef2Var = (ef2) obj6;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                List list2 = ef2Var.f37163a;
                vu4Var2.m23547h(list2.size(), null, new C3520r2(9, list2), new C0282a(2039820996, true, new ve0(2, (vi3) obj4, list2, (C1919b) obj5)));
                vu4.m23545g(vu4Var2, null, new C0282a(-724755053, true, new C3180kd(18, ef2Var, (vi3) obj3)), 3);
                List list3 = ef2Var.f37164b;
                vu4Var2.m23547h(list3.size(), null, new C3520r2(8, list3), new C0282a(802480018, true, new df2(0, (vi3) obj2, list3)));
                return xfaVar;
            case 3:
                List list4 = (List) obj6;
                vu4 vu4Var3 = (vu4) obj;
                vu4Var3.getClass();
                vu4Var3.m23547h(list4.size(), null, new C3520r2(14, list4), new C0282a(802480018, true, new nh4(list4, (LessonTranslationSentence) obj5, (Integer) obj3, (String) obj2, (vi3) obj4, 0)));
                return xfaVar;
            case 4:
                ArrayList arrayList = (ArrayList) obj6;
                ArrayList arrayList2 = (ArrayList) obj5;
                Context context = (Context) obj3;
                String str = (String) obj2;
                vi3 vi3Var3 = (vi3) obj4;
                vu4 vu4Var4 = (vu4) obj;
                vu4Var4.getClass();
                vu4Var4.m23547h(arrayList.size(), null, new gm4(0, arrayList), new C0282a(802480018, true, new hm4(arrayList, context, str, vi3Var3, 0)));
                vu4.m23545g(vu4Var4, null, krb.f48372a, 3);
                vu4Var4.m23547h(arrayList2.size(), null, new gm4(1, arrayList2), new C0282a(802480018, true, new hm4(arrayList2, context, str, vi3Var3, 1)));
                return xfaVar;
            case 5:
                String str2 = (String) obj5;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                ArrayList arrayList3 = (ArrayList) obj4;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0((String) obj6);
                try {
                    ik8VarMo2873e0.mo2874C(1, str2);
                    ik8VarMo2873e0.mo2874C(2, str3);
                    ik8VarMo2873e0.mo2874C(3, str4);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ik8VarMo2873e0.mo2874C(i3, (String) it.next());
                        i3++;
                    }
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 6:
                ArrayList arrayList4 = (ArrayList) obj5;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                h86 h86Var = (h86) obj2;
                Bundle bundle = (Bundle) obj4;
                y76 y76Var = (y76) obj;
                y76Var.getClass();
                ((Ref$BooleanRef) obj6).f47713a = true;
                int iIndexOf = arrayList4.indexOf(y76Var);
                if (iIndexOf != -1) {
                    int i8 = iIndexOf + 1;
                    listSubList = arrayList4.subList(ref$IntRef.f47716a, i8);
                    ref$IntRef.f47716a = i8;
                } else {
                    listSubList = EmptyList.f47638a;
                }
                h86Var.m13123a(y76Var.f69409b, bundle, y76Var, listSubList);
                return xfaVar;
            case 7:
                Context context2 = (Context) obj;
                context2.getClass();
                AudioMatchView audioMatchView = new AudioMatchView(context2, null, 2, null);
                audioMatchView.setInteraction(new ca1((Context) obj6, (vi3) obj4, (hp5) obj5, (t66) obj3, (t66) obj2));
                return audioMatchView;
            case 8:
                final kx8 kx8Var = (kx8) obj6;
                final vi3 vi3Var4 = (vi3) obj4;
                final t66 t66Var = (t66) obj5;
                final Context context3 = (Context) obj3;
                final t66 t66Var2 = (t66) obj2;
                vu4 vu4Var5 = (vu4) obj;
                vu4Var5.getClass();
                vu4.m23545g(vu4Var5, "sentence_header", fmc.f39314a, 2);
                vu4.m23545g(vu4Var5, "sentence_field", new C0282a(346517893, true, new iz4(17, kx8Var, vi3Var4)), 2);
                vu4.m23545g(vu4Var5, "translations_header", new C0282a(-690598684, true, new aj3() { // from class: mw8
                    @Override // p000.aj3
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i9 = i7;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        t66 t66Var3 = t66Var;
                        kx8 kx8Var2 = kx8Var;
                        vi3 vi3Var5 = vi3Var4;
                        switch (i9) {
                            case 0:
                                ye1 ye1Var = (ye1) obj8;
                                int iIntValue = ((Integer) obj9).intValue();
                                ((ft4) obj7).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    String strM23620a0 = vz1.m23620a0(tj3Var, R$string.lesson_edit_notes);
                                    boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new nc8(vi3Var5, 23);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    ui3 ui3Var3 = (ui3) objM22097O;
                                    Object objM22097O2 = tj3Var.m22097O();
                                    if (objM22097O2 == p84Var) {
                                        objM22097O2 = new un7(18, t66Var3);
                                        tj3Var.m22131l0(objM22097O2);
                                    }
                                    e2d.m10814c(384, tj3Var, ui3Var3, (ui3) objM22097O2, strM23620a0, vz1.m23620a0(tj3Var, R$string.lesson_edit_add_note), !kx8Var2.f48554g.isEmpty());
                                }
                                break;
                            default:
                                ye1 ye1Var2 = (ye1) obj8;
                                int iIntValue2 = ((Integer) obj9).intValue();
                                ((ft4) obj7).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.lesson_edit_translations);
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                    Object objM22097O3 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O3 == p84Var) {
                                        objM22097O3 = new nc8(vi3Var5, 22);
                                        tj3Var2.m22131l0(objM22097O3);
                                    }
                                    ui3 ui3Var4 = (ui3) objM22097O3;
                                    Object objM22097O4 = tj3Var2.m22097O();
                                    if (objM22097O4 == p84Var) {
                                        objM22097O4 = new un7(17, t66Var3);
                                        tj3Var2.m22131l0(objM22097O4);
                                    }
                                    e2d.m10814c(384, tj3Var2, ui3Var4, (ui3) objM22097O4, strM23620a1, vz1.m23620a0(tj3Var2, R$string.lesson_edit_add_translation), !kx8Var2.f48557j.isEmpty());
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), 2);
                final zaa zaaVar = kx8Var.f48549b;
                List list5 = kx8Var.f48552e;
                boolean z = kx8Var.f48553f;
                List list6 = kx8Var.f48550c;
                boolean z2 = kx8Var.f48556i;
                if (zaaVar != null) {
                    vu4.m23545g(vu4Var5, "active_translation", new C0282a(567231485, true, new aj3() { // from class: nw8
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p000.aj3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i9 = i7;
                            xfa xfaVar2 = xfa.f68157a;
                            b16 b16Var = b16.f7762a;
                            p84 p84Var = we1.f66679a;
                            Context context4 = context3;
                            final vi3 vi3Var5 = vi3Var4;
                            final zaa zaaVar2 = zaaVar;
                            Object[] objArr = 0;
                            Object[] objArr2 = 0;
                            final int i10 = 1;
                            switch (i9) {
                                case 0:
                                    ye1 ye1Var = (ye1) obj8;
                                    int iIntValue = ((Integer) obj9).intValue();
                                    ((ft4) obj7).getClass();
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        String str5 = zaaVar2.f71295b;
                                        boolean zM22120g = tj3Var.m22120g(vi3Var5) | tj3Var.m22120g(zaaVar2);
                                        Object objM22097O = tj3Var.m22097O();
                                        if (zM22120g || objM22097O == p84Var) {
                                            objM22097O = new vi3() { // from class: qw8
                                                @Override // p000.vi3
                                                public final Object invoke(Object obj10) {
                                                    int i11 = i10;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar3 = zaaVar2;
                                                    vi3 vi3Var6 = vi3Var5;
                                                    String str6 = (String) obj10;
                                                    switch (i11) {
                                                        case 0:
                                                            str6.getClass();
                                                            vi3Var6.invoke(new o15(zaaVar3.f71294a, str6));
                                                            break;
                                                        default:
                                                            str6.getClass();
                                                            vi3Var6.invoke(new g15(zaaVar3.f71294a, str6));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var.m22131l0(objM22097O);
                                        }
                                        vi3 vi3Var6 = (vi3) objM22097O;
                                        String strM17093L = AbstractC3352my.m17093L(context4, zaaVar2.f71294a);
                                        boolean zM22120g2 = tj3Var.m22120g(vi3Var5) | tj3Var.m22120g(zaaVar2);
                                        Object objM22097O2 = tj3Var.m22097O();
                                        if (zM22120g2 || objM22097O2 == p84Var) {
                                            objM22097O2 = new ui3() { // from class: rw8
                                                @Override // p000.ui3
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo0a() {
                                                    int i11 = i10;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar3 = zaaVar2;
                                                    vi3 vi3Var7 = vi3Var5;
                                                    switch (i11) {
                                                        case 0:
                                                            vi3Var7.invoke(new p15(zaaVar3.f71294a));
                                                            break;
                                                        default:
                                                            vi3Var7.invoke(new h15(zaaVar3.f71294a));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var.m22131l0(objM22097O2);
                                        }
                                        AbstractC2079b.m8993a(str5, vi3Var6, null, strM17093L, (ui3) objM22097O2, tj3Var, 0, 20);
                                        thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f));
                                    }
                                    break;
                                default:
                                    ye1 ye1Var2 = (ye1) obj8;
                                    int iIntValue2 = ((Integer) obj9).intValue();
                                    ((ft4) obj7).getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        String str6 = zaaVar2.f71295b;
                                        boolean zM22120g3 = tj3Var2.m22120g(vi3Var5) | tj3Var2.m22120g(zaaVar2);
                                        Object objM22097O3 = tj3Var2.m22097O();
                                        if (zM22120g3 || objM22097O3 == p84Var) {
                                            final Object[] objArr3 = objArr == true ? 1 : 0;
                                            objM22097O3 = new vi3() { // from class: qw8
                                                @Override // p000.vi3
                                                public final Object invoke(Object obj10) {
                                                    int i11 = objArr3;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar3 = zaaVar2;
                                                    vi3 vi3Var7 = vi3Var5;
                                                    String str7 = (String) obj10;
                                                    switch (i11) {
                                                        case 0:
                                                            str7.getClass();
                                                            vi3Var7.invoke(new o15(zaaVar3.f71294a, str7));
                                                            break;
                                                        default:
                                                            str7.getClass();
                                                            vi3Var7.invoke(new g15(zaaVar3.f71294a, str7));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var2.m22131l0(objM22097O3);
                                        }
                                        vi3 vi3Var7 = (vi3) objM22097O3;
                                        String strM17093L2 = AbstractC3352my.m17093L(context4, zaaVar2.f71294a);
                                        boolean zM22120g4 = tj3Var2.m22120g(vi3Var5) | tj3Var2.m22120g(zaaVar2);
                                        Object objM22097O4 = tj3Var2.m22097O();
                                        if (zM22120g4 || objM22097O4 == p84Var) {
                                            final Object[] objArr4 = objArr2 == true ? 1 : 0;
                                            objM22097O4 = new ui3() { // from class: rw8
                                                @Override // p000.ui3
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo0a() {
                                                    int i11 = objArr4;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar3 = zaaVar2;
                                                    vi3 vi3Var8 = vi3Var5;
                                                    switch (i11) {
                                                        case 0:
                                                            vi3Var8.invoke(new p15(zaaVar3.f71294a));
                                                            break;
                                                        default:
                                                            vi3Var8.invoke(new h15(zaaVar3.f71294a));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var2.m22131l0(objM22097O4);
                                        }
                                        AbstractC2079b.m8993a(str6, vi3Var7, null, strM17093L2, (ui3) objM22097O4, tj3Var2, 0, 20);
                                        thb.m22044c(tj3Var2, c99.m4414g(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38957f));
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), 2);
                }
                if (z2) {
                    vu4Var5.m23547h(list6.size(), new ue0(21, new qv7(29), list6), new xf8(5, list6), new C0282a(802480018, true, new tp8(list6, vi3Var4, context3, i7)));
                }
                if (z2 || list6.isEmpty()) {
                    i = 2;
                } else {
                    i = 2;
                    vu4.m23545g(vu4Var5, "show_all_translations", new C0282a(-1623709174, true, new qe0(vi3Var4, 28)), 2);
                }
                final int i9 = 0;
                vu4.m23545g(vu4Var5, "notes_header", new C0282a(-1727715261, true, new aj3() { // from class: mw8
                    @Override // p000.aj3
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        int i10 = i9;
                        xfa xfaVar2 = xfa.f68157a;
                        p84 p84Var = we1.f66679a;
                        t66 t66Var3 = t66Var2;
                        kx8 kx8Var2 = kx8Var;
                        vi3 vi3Var5 = vi3Var4;
                        switch (i10) {
                            case 0:
                                ye1 ye1Var = (ye1) obj8;
                                int iIntValue = ((Integer) obj9).intValue();
                                ((ft4) obj7).getClass();
                                tj3 tj3Var = (tj3) ye1Var;
                                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    tj3Var.m22102U();
                                } else {
                                    String strM23620a0 = vz1.m23620a0(tj3Var, R$string.lesson_edit_notes);
                                    boolean zM22120g = tj3Var.m22120g(vi3Var5);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22120g || objM22097O == p84Var) {
                                        objM22097O = new nc8(vi3Var5, 23);
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    ui3 ui3Var3 = (ui3) objM22097O;
                                    Object objM22097O2 = tj3Var.m22097O();
                                    if (objM22097O2 == p84Var) {
                                        objM22097O2 = new un7(18, t66Var3);
                                        tj3Var.m22131l0(objM22097O2);
                                    }
                                    e2d.m10814c(384, tj3Var, ui3Var3, (ui3) objM22097O2, strM23620a0, vz1.m23620a0(tj3Var, R$string.lesson_edit_add_note), !kx8Var2.f48554g.isEmpty());
                                }
                                break;
                            default:
                                ye1 ye1Var2 = (ye1) obj8;
                                int iIntValue2 = ((Integer) obj9).intValue();
                                ((ft4) obj7).getClass();
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    tj3Var2.m22102U();
                                } else {
                                    String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.lesson_edit_translations);
                                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var5);
                                    Object objM22097O3 = tj3Var2.m22097O();
                                    if (zM22120g2 || objM22097O3 == p84Var) {
                                        objM22097O3 = new nc8(vi3Var5, 22);
                                        tj3Var2.m22131l0(objM22097O3);
                                    }
                                    ui3 ui3Var4 = (ui3) objM22097O3;
                                    Object objM22097O4 = tj3Var2.m22097O();
                                    if (objM22097O4 == p84Var) {
                                        objM22097O4 = new un7(17, t66Var3);
                                        tj3Var2.m22131l0(objM22097O4);
                                    }
                                    e2d.m10814c(384, tj3Var2, ui3Var4, (ui3) objM22097O4, strM23620a1, vz1.m23620a0(tj3Var2, R$string.lesson_edit_add_translation), !kx8Var2.f48557j.isEmpty());
                                }
                                break;
                        }
                        return xfaVar2;
                    }
                }), i);
                final zaa zaaVar2 = kx8Var.f48551d;
                if (zaaVar2 != null) {
                    vu4.m23545g(vu4Var5, "active_note", new C0282a(1796748838, true, new aj3() { // from class: nw8
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // p000.aj3
                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                            int i10 = i9;
                            xfa xfaVar2 = xfa.f68157a;
                            b16 b16Var = b16.f7762a;
                            p84 p84Var = we1.f66679a;
                            Context context4 = context3;
                            final vi3 vi3Var5 = vi3Var4;
                            final zaa zaaVar3 = zaaVar2;
                            Object[] objArr = 0;
                            Object[] objArr2 = 0;
                            final int i11 = 1;
                            switch (i10) {
                                case 0:
                                    ye1 ye1Var = (ye1) obj8;
                                    int iIntValue = ((Integer) obj9).intValue();
                                    ((ft4) obj7).getClass();
                                    tj3 tj3Var = (tj3) ye1Var;
                                    if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        tj3Var.m22102U();
                                    } else {
                                        String str5 = zaaVar3.f71295b;
                                        boolean zM22120g = tj3Var.m22120g(vi3Var5) | tj3Var.m22120g(zaaVar3);
                                        Object objM22097O = tj3Var.m22097O();
                                        if (zM22120g || objM22097O == p84Var) {
                                            objM22097O = new vi3() { // from class: qw8
                                                @Override // p000.vi3
                                                public final Object invoke(Object obj10) {
                                                    int i12 = i11;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar4 = zaaVar3;
                                                    vi3 vi3Var7 = vi3Var5;
                                                    String str7 = (String) obj10;
                                                    switch (i12) {
                                                        case 0:
                                                            str7.getClass();
                                                            vi3Var7.invoke(new o15(zaaVar4.f71294a, str7));
                                                            break;
                                                        default:
                                                            str7.getClass();
                                                            vi3Var7.invoke(new g15(zaaVar4.f71294a, str7));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var.m22131l0(objM22097O);
                                        }
                                        vi3 vi3Var6 = (vi3) objM22097O;
                                        String strM17093L = AbstractC3352my.m17093L(context4, zaaVar3.f71294a);
                                        boolean zM22120g2 = tj3Var.m22120g(vi3Var5) | tj3Var.m22120g(zaaVar3);
                                        Object objM22097O2 = tj3Var.m22097O();
                                        if (zM22120g2 || objM22097O2 == p84Var) {
                                            objM22097O2 = new ui3() { // from class: rw8
                                                @Override // p000.ui3
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo0a() {
                                                    int i12 = i11;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar4 = zaaVar3;
                                                    vi3 vi3Var8 = vi3Var5;
                                                    switch (i12) {
                                                        case 0:
                                                            vi3Var8.invoke(new p15(zaaVar4.f71294a));
                                                            break;
                                                        default:
                                                            vi3Var8.invoke(new h15(zaaVar4.f71294a));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var.m22131l0(objM22097O2);
                                        }
                                        AbstractC2079b.m8993a(str5, vi3Var6, null, strM17093L, (ui3) objM22097O2, tj3Var, 0, 20);
                                        thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f));
                                    }
                                    break;
                                default:
                                    ye1 ye1Var2 = (ye1) obj8;
                                    int iIntValue2 = ((Integer) obj9).intValue();
                                    ((ft4) obj7).getClass();
                                    tj3 tj3Var2 = (tj3) ye1Var2;
                                    if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        tj3Var2.m22102U();
                                    } else {
                                        String str6 = zaaVar3.f71295b;
                                        boolean zM22120g3 = tj3Var2.m22120g(vi3Var5) | tj3Var2.m22120g(zaaVar3);
                                        Object objM22097O3 = tj3Var2.m22097O();
                                        if (zM22120g3 || objM22097O3 == p84Var) {
                                            final int objArr3 = objArr == true ? 1 : 0;
                                            objM22097O3 = new vi3() { // from class: qw8
                                                @Override // p000.vi3
                                                public final Object invoke(Object obj10) {
                                                    int i12 = objArr3;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar4 = zaaVar3;
                                                    vi3 vi3Var7 = vi3Var5;
                                                    String str7 = (String) obj10;
                                                    switch (i12) {
                                                        case 0:
                                                            str7.getClass();
                                                            vi3Var7.invoke(new o15(zaaVar4.f71294a, str7));
                                                            break;
                                                        default:
                                                            str7.getClass();
                                                            vi3Var7.invoke(new g15(zaaVar4.f71294a, str7));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var2.m22131l0(objM22097O3);
                                        }
                                        vi3 vi3Var7 = (vi3) objM22097O3;
                                        String strM17093L2 = AbstractC3352my.m17093L(context4, zaaVar3.f71294a);
                                        boolean zM22120g4 = tj3Var2.m22120g(vi3Var5) | tj3Var2.m22120g(zaaVar3);
                                        Object objM22097O4 = tj3Var2.m22097O();
                                        if (zM22120g4 || objM22097O4 == p84Var) {
                                            final int objArr4 = objArr2 == true ? 1 : 0;
                                            objM22097O4 = new ui3() { // from class: rw8
                                                @Override // p000.ui3
                                                /* JADX INFO: renamed from: a */
                                                public final Object mo0a() {
                                                    int i12 = objArr4;
                                                    xfa xfaVar3 = xfa.f68157a;
                                                    zaa zaaVar4 = zaaVar3;
                                                    vi3 vi3Var8 = vi3Var5;
                                                    switch (i12) {
                                                        case 0:
                                                            vi3Var8.invoke(new p15(zaaVar4.f71294a));
                                                            break;
                                                        default:
                                                            vi3Var8.invoke(new h15(zaaVar4.f71294a));
                                                            break;
                                                    }
                                                    return xfaVar3;
                                                }
                                            };
                                            tj3Var2.m22131l0(objM22097O4);
                                        }
                                        AbstractC2079b.m8993a(str6, vi3Var7, null, strM17093L2, (ui3) objM22097O4, tj3Var2, 0, 20);
                                        thb.m22044c(tj3Var2, c99.m4414g(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38957f));
                                    }
                                    break;
                            }
                            return xfaVar2;
                        }
                    }), i);
                }
                if (z != 0) {
                    vu4Var5.m23547h(list5.size(), new ue0(22, new ow8(i9), list5), new xf8(6, list5), new C0282a(802480018, true, new tp8(list5, vi3Var4, context3, 2)));
                }
                if (!z && !list5.isEmpty()) {
                    vu4.m23545g(vu4Var5, "show_all_notes", new C0282a(597024968, true, new qe0(vi3Var4, 29)), 2);
                }
                C3849zx c3849zx = kx8Var.f48555h;
                if (c3849zx != null) {
                    vu4.m23545g(vu4Var5, "audio_header", new C0282a(451084964, true, new pw8(vi3Var4, c3849zx)), 2);
                    vu4.m23545g(vu4Var5, "audio_editor", new C0282a(-1500695781, true, new pw8(c3849zx, vi3Var4)), 2);
                }
                return xfaVar;
            case 9:
                List list7 = (List) obj6;
                vu4 vu4Var6 = (vu4) obj;
                vu4Var6.getClass();
                vu4Var6.m23547h(list7.size(), null, new xf8(9, list7), new C0282a(802480018, true, new nh4(list7, (Context) obj5, (Pair) obj3, (ReaderFont) obj2, (zi3) obj4, 2)));
                return xfaVar;
            default:
                h0b h0bVar = (h0b) obj6;
                vu4 vu4Var7 = (vu4) obj;
                vu4Var7.getClass();
                vu4.m23545g(vu4Var7, null, new C0282a(498793505, true, new mx0((C0282a) obj5, i4)), 3);
                List list8 = h0bVar.f41644a;
                vu4Var7.m23547h(list8.size(), new ue0(25, new e0b(i5), list8), new xf8(16, list8), new C0282a(802480018, true, new C3558s2(list8, (vi3) obj4, (zi3) obj3, (vi3) obj2, 6)));
                vxa vxaVar = h0bVar.f41645b;
                if (vxaVar != null) {
                    vu4.m23545g(vu4Var7, null, new C0282a(-1259256774, true, new iq8(vxaVar, 11)), 3);
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C3537ri(int i, vi3 vi3Var, t66 t66Var, Object obj, Object obj2, Object obj3) {
        this.f59336a = i;
        this.f59338c = obj;
        this.f59337b = vi3Var;
        this.f59339d = obj2;
        this.f59340e = obj3;
        this.f59341f = t66Var;
    }

    public /* synthetic */ C3537ri(Object obj, Object obj2, vi3 vi3Var, xi3 xi3Var, vi3 vi3Var2, int i) {
        this.f59336a = i;
        this.f59338c = obj;
        this.f59339d = obj2;
        this.f59337b = vi3Var;
        this.f59340e = xi3Var;
        this.f59341f = vi3Var2;
    }

    public /* synthetic */ C3537ri(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f59336a = i;
        this.f59338c = obj;
        this.f59339d = obj2;
        this.f59340e = obj3;
        this.f59341f = obj4;
        this.f59337b = obj5;
    }
}
