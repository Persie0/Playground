package p000;

import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.C0200a;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.onboarding.HighlightType;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.settings.C1873e;
import com.lingq.core.settings.R$string;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.tooltips.components.AbstractC1914a;
import com.lingq.feature.imports.AbstractC2105b;
import com.lingq.feature.imports.C2108e;
import com.lingq.feature.imports.C2109f;
import com.lingq.feature.search.filter.components.AbstractC2771a;
import com.lingq.feature.search.search.C2779e;
import com.lingq.feature.search.search.components.AbstractC2777a;
import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import com.lingq.feature.widget.streak.C2871b;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.C3248a;
import p000.at9;
import p000.c57;
import p000.cx9;
import p000.h66;
import p000.jt9;
import p000.mt9;
import p000.sx7;
import p000.ui3;
import p000.un1;
import p000.wfb;
import p000.xc9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eq8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f37716c;

    public /* synthetic */ eq8(int i, Object obj, Object obj2) {
        this.f37714a = i;
        this.f37715b = obj;
        this.f37716c = obj2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        cx9 cx9Var;
        int i = this.f37714a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f37716c;
        Object obj4 = this.f37715b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qzc.m20224a((gq8) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2771a.m9695e((e16) obj4, (c29) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2777a.m9704a((C0127b) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 3:
                C2779e c2779e = (C2779e) obj4;
                ij7 ij7Var = (ij7) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM22124i = tj3Var.m22124i(c2779e) | tj3Var.m22120g(ij7Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new a45(22, c2779e, ij7Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O, slc.f60991a, null, null, null, false);
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 4:
                xs8 xs8Var = (xs8) obj4;
                vi3 vi3Var = (vi3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    AbstractC0218a.m1125e(ci8.m4703P(-1475017505, new ht6(xs8Var, 21), tj3Var2), null, ci8.m4703P(-1455476383, new ks3(vi3Var, 29), tj3Var2), null, 0.0f, null, null, null, null, tj3Var2, 390, 506);
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                i1d.m13630a((ArrayList) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                r1d.m20249d((e16) obj4, (a39) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                k2d.m14774a((dx8) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 8:
                String str = (String) obj4;
                t66 t66Var = (t66) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var3.m22128k(ge9.f40637a)).f38957f, true, new gm5(28)), nj0.f52791J, tj3Var3, 0);
                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m = tj3Var3.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                    lw9.m16554b(vz1.m23618Z(R$string.settings_delete_language_message, new Object[]{str}, tj3Var3), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                    String str2 = (String) t66Var.getValue();
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new dt6(14, t66Var);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    bna.m3942c(str2, (vi3) objM22097O2, c99.m4412e(b16Var, 1.0f), false, null, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, tj3Var3, 432, 12582912, 8257528);
                    tj3Var3.m22139q(true);
                } else {
                    tj3Var3.m22102U();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8608x((C1873e) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8594j((e16) obj4, (o19) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                n59.m17236a((e16) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                h4d.m13053b((e16) obj4, (tl0) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                r4d.m20402a((hj9) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(49));
                break;
            case 14:
                ((Integer) obj2).getClass();
                w4d.m23758a((e16) obj4, (qj9) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((C2871b) obj4).m9791h((fk9) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 16:
                aj3 aj3Var = (aj3) obj4;
                Object obj5 = (rq9) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    aj3Var.invoke(obj5, tj3Var4, 6);
                } else {
                    tj3Var4.m22102U();
                }
                break;
            case 17:
                aj3 aj3Var2 = (aj3) obj4;
                Object obj6 = (tq9) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    aj3Var2.invoke(obj6, tj3Var5, 6);
                } else {
                    tj3Var5.m22102U();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                ((u06) obj4).m22376c((Drawable) obj3, (ye1) obj, pk9.m19383z(49));
                break;
            case 19:
                final C0205f c0205f = (C0205f) obj4;
                final un1 un1Var = (un1) obj3;
                at9 at9Var = (at9) obj;
                final Context context = (Context) obj2;
                boolean zM1110k = c0205f.m1110k();
                C3419on c3419onM1113n = c0205f.m1113n();
                ys9 ys9Var = null;
                String str3 = c3419onM1113n != null ? c3419onM1113n.f54604b : null;
                cx9 cx9Var2 = c0205f.f3098w;
                if (cx9Var2 != null) {
                    long j = cx9Var2.f34694a;
                    mq6 mq6Var = c0205f.f3077b;
                    cx9Var = new cx9(eh0.m11127g(mq6Var.mo13411t((int) (j >> 32)), mq6Var.mo13411t((int) (j & 4294967295L))));
                } else {
                    cx9Var = null;
                }
                C0200a c0200a = c0205f.f3085j;
                vi3 vi3Var2 = new vi3() { // from class: androidx.compose.foundation.text.selection.h
                    @Override // p000.vi3
                    public final Object invoke(Object obj7) {
                        at9 at9Var2 = (at9) obj7;
                        h66 h66Var = at9Var2.f7472a;
                        h66 h66Var2 = at9Var2.f7472a;
                        mt9 mt9Var = mt9.f51831b;
                        h66Var.m13090g(mt9Var);
                        TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                        final C0205f c0205f2 = c0205f;
                        final int i2 = 0;
                        final int i3 = 1;
                        boolean z = (cx9.m9921c(c0205f2.m1114o().f65991b) || !c0205f2.m1110k() || (c0205f2.f3081f instanceof c57) || c0205f2.f3083h == null) ? false : true;
                        Object obj8 = null;
                        final C0196xdce13b49 c0196xdce13b49 = new C0196xdce13b49(c0205f2, null);
                        final un1 un1Var2 = un1Var;
                        ui3 ui3Var2 = new ui3() { // from class: androidx.compose.foundation.text.selection.g
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new C0199x4bd70adf(c0196xdce13b49, null), 1);
                                return xfa.f68157a;
                            }
                        };
                        Context context2 = context;
                        Resources resources = context2.getResources();
                        int i4 = 27;
                        sx7 sx7Var = new sx7(i4, ui3Var2, obj8);
                        if (z) {
                            h66Var2.m13090g(new jt9(textContextMenuItems.m25903getDrawableId3I4p1mQ(), sx7Var, textContextMenuItems.getKey(), resources.getString(textContextMenuItems.m25904getStringId9Hzcbyc())));
                        }
                        TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                        boolean z2 = (cx9.m9921c(c0205f2.m1114o().f65991b) || (c0205f2.f3081f instanceof c57) || c0205f2.f3083h == null) ? false : true;
                        final C0197xdce13b4a c0197xdce13b4a = new C0197xdce13b4a(c0205f2, null);
                        ui3 ui3Var3 = new ui3() { // from class: androidx.compose.foundation.text.selection.g
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new C0199x4bd70adf(c0197xdce13b4a, null), 1);
                                return xfa.f68157a;
                            }
                        };
                        Resources resources2 = context2.getResources();
                        sx7 sx7Var2 = new sx7(i4, ui3Var3, obj8);
                        if (z2) {
                            h66Var2.m13090g(new jt9(textContextMenuItems2.m25903getDrawableId3I4p1mQ(), sx7Var2, textContextMenuItems2.getKey(), resources2.getString(textContextMenuItems2.m25904getStringId9Hzcbyc())));
                        }
                        TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                        boolean z3 = c0205f2.m1110k() && ((Boolean) ((xc9) c0205f2.f3099x).getValue()).booleanValue() && c0205f2.f3083h != null;
                        final C0198xdce13b4b c0198xdce13b4b = new C0198xdce13b4b(c0205f2, null);
                        ui3 ui3Var4 = new ui3() { // from class: androidx.compose.foundation.text.selection.g
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                wfb.m23926u(un1Var2, null, CoroutineStart.UNDISPATCHED, new C0199x4bd70adf(c0198xdce13b4b, null), 1);
                                return xfa.f68157a;
                            }
                        };
                        Resources resources3 = context2.getResources();
                        sx7 sx7Var3 = new sx7(i4, ui3Var4, obj8);
                        if (z3) {
                            h66Var2.m13090g(new jt9(textContextMenuItems3.m25903getDrawableId3I4p1mQ(), sx7Var3, textContextMenuItems3.getKey(), resources3.getString(textContextMenuItems3.m25904getStringId9Hzcbyc())));
                        }
                        TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                        boolean z4 = cx9.m9922d(c0205f2.m1114o().f65991b) != c0205f2.m1114o().f65990a.f54604b.length();
                        ui3 ui3Var5 = new ui3() { // from class: sv9
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                C0205f c0205f3 = c0205f2;
                                switch (i5) {
                                    case 0:
                                        return Boolean.valueOf(!c0205f3.f3075B);
                                    case 1:
                                        vv9 vv9VarM1103e = C0205f.m1103e(c0205f3.m1114o().f65990a, eh0.m11127g(0, c0205f3.m1114o().f65990a.f54604b.length()));
                                        c0205f3.f3078c.invoke(vv9VarM1103e);
                                        long j2 = vv9VarM1103e.f65991b;
                                        c0205f3.f3098w = new cx9(j2);
                                        c0205f3.f3096u = vv9.m23560a(c0205f3.f3096u, null, j2, 5);
                                        c0205f3.m1107h(true);
                                        return xfaVar2;
                                    default:
                                        ui3 ui3Var6 = c0205f3.f3082g;
                                        if (ui3Var6 != null) {
                                            ui3Var6.mo0a();
                                        }
                                        return xfaVar2;
                                }
                            }
                        };
                        ui3 ui3Var6 = new ui3() { // from class: sv9
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i5 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                C0205f c0205f3 = c0205f2;
                                switch (i5) {
                                    case 0:
                                        return Boolean.valueOf(!c0205f3.f3075B);
                                    case 1:
                                        vv9 vv9VarM1103e = C0205f.m1103e(c0205f3.m1114o().f65990a, eh0.m11127g(0, c0205f3.m1114o().f65990a.f54604b.length()));
                                        c0205f3.f3078c.invoke(vv9VarM1103e);
                                        long j2 = vv9VarM1103e.f65991b;
                                        c0205f3.f3098w = new cx9(j2);
                                        c0205f3.f3096u = vv9.m23560a(c0205f3.f3096u, null, j2, 5);
                                        c0205f3.m1107h(true);
                                        return xfaVar2;
                                    default:
                                        ui3 ui3Var7 = c0205f3.f3082g;
                                        if (ui3Var7 != null) {
                                            ui3Var7.mo0a();
                                        }
                                        return xfaVar2;
                                }
                            }
                        };
                        Resources resources4 = context2.getResources();
                        sx7 sx7Var4 = new sx7(i4, ui3Var6, ui3Var5);
                        if (z4) {
                            h66Var2.m13090g(new jt9(textContextMenuItems4.m25903getDrawableId3I4p1mQ(), sx7Var4, textContextMenuItems4.getKey(), resources4.getString(textContextMenuItems4.m25904getStringId9Hzcbyc())));
                        }
                        TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                        if (c0205f2.m1110k() && cx9.m9921c(c0205f2.m1114o().f65991b)) {
                            i2 = 1;
                        }
                        final int i5 = 2;
                        ui3 ui3Var7 = new ui3() { // from class: sv9
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i6 = i5;
                                xfa xfaVar2 = xfa.f68157a;
                                C0205f c0205f3 = c0205f2;
                                switch (i6) {
                                    case 0:
                                        return Boolean.valueOf(!c0205f3.f3075B);
                                    case 1:
                                        vv9 vv9VarM1103e = C0205f.m1103e(c0205f3.m1114o().f65990a, eh0.m11127g(0, c0205f3.m1114o().f65990a.f54604b.length()));
                                        c0205f3.f3078c.invoke(vv9VarM1103e);
                                        long j2 = vv9VarM1103e.f65991b;
                                        c0205f3.f3098w = new cx9(j2);
                                        c0205f3.f3096u = vv9.m23560a(c0205f3.f3096u, null, j2, 5);
                                        c0205f3.m1107h(true);
                                        return xfaVar2;
                                    default:
                                        ui3 ui3Var8 = c0205f3.f3082g;
                                        if (ui3Var8 != null) {
                                            ui3Var8.mo0a();
                                        }
                                        return xfaVar2;
                                }
                            }
                        };
                        Resources resources5 = context2.getResources();
                        sx7 sx7Var5 = new sx7(i4, ui3Var7, obj8);
                        if (i2 != 0) {
                            h66Var2.m13090g(new jt9(textContextMenuItems5.m25903getDrawableId3I4p1mQ(), sx7Var5, textContextMenuItems5.getKey(), resources5.getString(textContextMenuItems5.m25904getStringId9Hzcbyc())));
                        }
                        h66Var2.m13090g(mt9Var);
                        return xfa.f68157a;
                    }
                };
                vh9 vh9Var = e97.f36884a;
                if (str3 == null || cx9Var == null || c0200a == null || !(c0200a instanceof C0200a)) {
                    vi3Var2.invoke(at9Var);
                    if (str3 != null && cx9Var != null) {
                        AbstractC3184kh.m15210d(at9Var, context, zM1110k, str3, cx9Var.f34694a);
                    }
                } else {
                    long j2 = cx9Var.f34694a;
                    Object obj7 = c0200a.f3068h;
                    C3248a c3248a = c0200a.f3065e;
                    if (c3248a.mo4386a(null)) {
                        ys9 ys9Var2 = (ys9) ((xc9) c0200a.f3067g).getValue();
                        if (ys9Var2 == null || !cx9.m9920b(j2, ys9Var2.f70428b) || !fa4.m11650l(str3, ys9Var2.f70427a)) {
                            ys9Var2 = null;
                        }
                        c3248a.mo4387b(null);
                        ys9Var = ys9Var2;
                    }
                    if (ys9Var == null) {
                        vi3Var2.invoke(at9Var);
                    } else {
                        ArrayList arrayList = ys9Var.f70430d;
                        TextClassification textClassification = ys9Var.f70429c;
                        if (!textClassification.getActions().isEmpty()) {
                            at9Var.f7472a.m13090g(new ot9(obj7, textClassification, 0, (Drawable) arrayList.get(0)));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            at9Var.f7472a.m13090g(new ot9(obj7, textClassification, -1, textClassification.getIcon()));
                        }
                        vi3Var2.invoke(at9Var);
                        List<RemoteAction> actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            actions.get(i2);
                            if (i2 > 0) {
                                at9Var.f7472a.m13090g(new ot9(obj7, textClassification, i2, (Drawable) arrayList.get(i2)));
                            }
                        }
                    }
                    AbstractC3184kh.m15210d(at9Var, context, zM1110k, str3, cx9Var.f34694a);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8671j((TextHighlightStyle) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                AbstractC1881a.m8662a((AudioUnderlineMode) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC1899b.m8696e((f5a) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                AbstractC1914a.m8787f((HighlightType) obj4, (e28) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 24:
                t66 t66Var2 = (t66) obj4;
                zi3 zi3Var = (zi3) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objM22097O3 = tj3Var6.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new dt6(26, t66Var2);
                        tj3Var6.m22131l0(objM22097O3);
                    }
                    e16 e16VarM24741N = xwc.m24741N(b16Var, (vi3) objM22097O3);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode2 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m2 = tj3Var6.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var6, e16VarM24741N);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var2);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var6, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var6, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var6, C0352b.f4305h);
                    oha.m18001g(tj3Var6, C0352b.f4301d, e16VarM1322c2);
                    zi3Var.invoke(tj3Var6, 0);
                    tj3Var6.m22139q(true);
                } else {
                    tj3Var6.m22102U();
                }
                break;
            case 25:
                ((Integer) obj2).getClass();
                AbstractC2105b.m9004b((fka) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC2105b.m9006d((C2109f) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Integer) obj2).getClass();
                AbstractC2105b.m9009g((C2108e) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                ve2.m23242a((kxa) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                VocabularyContentFilter vocabularyContentFilter = (VocabularyContentFilter) obj4;
                zza zzaVar = (zza) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    lw9.m16554b(dbd.m10275c(vocabularyContentFilter, zzaVar.f72436c, vocabularyContentFilter == zzaVar.f72434a, tj3Var7), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var7, 0, 0, 262142);
                } else {
                    tj3Var7.m22102U();
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ eq8(Object obj, int i, int i2, Object obj2) {
        this.f37714a = i2;
        this.f37715b = obj;
        this.f37716c = obj2;
    }
}
