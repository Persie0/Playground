package p000;

import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.material3.C0269z;
import androidx.compose.material3.SheetValue;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.p012ui.library.LessonContextMenuItem;
import com.lingq.core.tooltips.components.AbstractC1915b;
import p000.un1;
import p000.wfb;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ua5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63639a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f63640b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63641c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f63642d;

    public /* synthetic */ ua5(y59 y59Var, boolean z, b85 b85Var) {
        this.f63641c = y59Var;
        this.f63640b = z;
        this.f63642d = b85Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f63639a;
        xfa xfaVar = xfa.f68157a;
        final int i2 = 1;
        Object obj2 = this.f63642d;
        Object obj3 = this.f63641c;
        final boolean z = this.f63640b;
        switch (i) {
            case 0:
                final y59 y59Var = (y59) obj3;
                final b85 b85Var = (b85) obj2;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23546i(vu4Var, y59Var.f69326a.size(), new kv4(y59Var, 5), new C0282a(-1840151957, true, new bj3() { // from class: sa5
                    @Override // p000.bj3
                    /* JADX INFO: renamed from: e */
                    public final Object mo825e(Object obj4, Object obj5, Object obj6, Object obj7) {
                        int i3;
                        e16 e16VarM8793f;
                        ft4 ft4Var = (ft4) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        ye1 ye1Var = (ye1) obj6;
                        int iIntValue2 = ((Integer) obj7).intValue();
                        ft4Var.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            i3 = (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) | iIntValue2;
                        } else {
                            i3 = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i3 |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
                        }
                        final int i4 = 1;
                        final int i5 = 0;
                        tj3 tj3Var = (tj3) ye1Var;
                        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
                            x59 x59Var = (x59) y59Var.f69326a.get(iIntValue);
                            boolean z2 = x59Var instanceof t59;
                            b16 b16Var = b16.f7762a;
                            final b85 b85Var2 = b85Var;
                            p84 p84Var = we1.f66679a;
                            if (z2) {
                                tj3Var.m22111b0(995866693);
                                if (iIntValue == 0 && z) {
                                    tj3Var.m22111b0(995850294);
                                    boolean zM22124i = tj3Var.m22124i(b85Var2) | tj3Var.m22120g(x59Var);
                                    Object objM22097O = tj3Var.m22097O();
                                    if (zM22124i || objM22097O == p84Var) {
                                        final t59 t59Var = (t59) x59Var;
                                        objM22097O = new vi3() { // from class: ta5
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj8) {
                                                int i6 = i5;
                                                xfa xfaVar2 = xfa.f68157a;
                                                t59 t59Var2 = t59Var;
                                                b85 b85Var3 = b85Var2;
                                                switch (i6) {
                                                    case 0:
                                                        e28 e28Var = (e28) obj8;
                                                        e28Var.getClass();
                                                        b85Var3.mo3469v(new e28(e28Var.f36620a - 20.0f, e28Var.f36621b - 20.0f, e28Var.f36622c + 20.0f, e28Var.f36623d + 20.0f), t59Var2.f61885b);
                                                        return xfaVar2;
                                                    default:
                                                        s45 s45Var = t59Var2.f61885b;
                                                        LibraryItem libraryItem = t59Var2.f61887d;
                                                        LessonContextMenuItem lessonContextMenuItem = (LessonContextMenuItem) obj8;
                                                        lessonContextMenuItem.getClass();
                                                        switch (db5.f35356a[lessonContextMenuItem.ordinal()]) {
                                                            case 1:
                                                                b85Var3.mo3455h(s45Var, new LqAnalyticsValues$LessonPath.Feed(s45Var.f60278h));
                                                                return xfaVar2;
                                                            case 2:
                                                                b85Var3.mo3443W(libraryItem, s45Var.f60277g);
                                                                return xfaVar2;
                                                            case 3:
                                                                b85Var3.mo3435O(libraryItem, s45Var.f60277g, s45Var.f60278h);
                                                                return xfaVar2;
                                                            case 4:
                                                                b85Var3.mo3456i(libraryItem.f19426a);
                                                                return xfaVar2;
                                                            case 5:
                                                                b85Var3.mo3450c(libraryItem, true);
                                                                return xfaVar2;
                                                            case 6:
                                                                b85Var3.mo3446Z(libraryItem, t59Var2.f61884a.f71090s);
                                                                return xfaVar2;
                                                            case 7:
                                                                b85Var3.mo3470w(libraryItem);
                                                                return xfaVar2;
                                                            case 8:
                                                                b85Var3.mo3425E(libraryItem);
                                                                return xfaVar2;
                                                            case 9:
                                                                String str = libraryItem.f19447s;
                                                                if (str == null) {
                                                                    str = "";
                                                                }
                                                                b85Var3.mo3422B(str);
                                                                return xfaVar2;
                                                            case 10:
                                                                Integer num = libraryItem.f19441m;
                                                                b85Var3.mo3467t(num != null ? num.intValue() : 0);
                                                                return xfaVar2;
                                                            default:
                                                                gm5.m12750e();
                                                                return null;
                                                        }
                                                }
                                            }
                                        };
                                        tj3Var.m22131l0(objM22097O);
                                    }
                                    e16VarM8793f = AbstractC1915b.m8793f(b16Var, (vi3) objM22097O);
                                    tj3Var.m22139q(false);
                                } else {
                                    tj3Var.m22111b0(996412479);
                                    tj3Var.m22139q(false);
                                    e16VarM8793f = b16Var;
                                }
                                e16 e16VarMo3161g = ft4.m12121a(ft4Var, b16Var).mo3161g(e16VarM8793f);
                                final t59 t59Var2 = (t59) x59Var;
                                z85 z85Var = t59Var2.f61884a;
                                boolean zM22124i2 = tj3Var.m22124i(b85Var2) | tj3Var.m22120g(x59Var);
                                Object objM22097O2 = tj3Var.m22097O();
                                if (zM22124i2 || objM22097O2 == p84Var) {
                                    objM22097O2 = new vi3() { // from class: ta5
                                        @Override // p000.vi3
                                        public final Object invoke(Object obj8) {
                                            int i6 = i4;
                                            xfa xfaVar2 = xfa.f68157a;
                                            t59 t59Var3 = t59Var2;
                                            b85 b85Var3 = b85Var2;
                                            switch (i6) {
                                                case 0:
                                                    e28 e28Var = (e28) obj8;
                                                    e28Var.getClass();
                                                    b85Var3.mo3469v(new e28(e28Var.f36620a - 20.0f, e28Var.f36621b - 20.0f, e28Var.f36622c + 20.0f, e28Var.f36623d + 20.0f), t59Var3.f61885b);
                                                    return xfaVar2;
                                                default:
                                                    s45 s45Var = t59Var3.f61885b;
                                                    LibraryItem libraryItem = t59Var3.f61887d;
                                                    LessonContextMenuItem lessonContextMenuItem = (LessonContextMenuItem) obj8;
                                                    lessonContextMenuItem.getClass();
                                                    switch (db5.f35356a[lessonContextMenuItem.ordinal()]) {
                                                        case 1:
                                                            b85Var3.mo3455h(s45Var, new LqAnalyticsValues$LessonPath.Feed(s45Var.f60278h));
                                                            return xfaVar2;
                                                        case 2:
                                                            b85Var3.mo3443W(libraryItem, s45Var.f60277g);
                                                            return xfaVar2;
                                                        case 3:
                                                            b85Var3.mo3435O(libraryItem, s45Var.f60277g, s45Var.f60278h);
                                                            return xfaVar2;
                                                        case 4:
                                                            b85Var3.mo3456i(libraryItem.f19426a);
                                                            return xfaVar2;
                                                        case 5:
                                                            b85Var3.mo3450c(libraryItem, true);
                                                            return xfaVar2;
                                                        case 6:
                                                            b85Var3.mo3446Z(libraryItem, t59Var3.f61884a.f71090s);
                                                            return xfaVar2;
                                                        case 7:
                                                            b85Var3.mo3470w(libraryItem);
                                                            return xfaVar2;
                                                        case 8:
                                                            b85Var3.mo3425E(libraryItem);
                                                            return xfaVar2;
                                                        case 9:
                                                            String str = libraryItem.f19447s;
                                                            if (str == null) {
                                                                str = "";
                                                            }
                                                            b85Var3.mo3422B(str);
                                                            return xfaVar2;
                                                        case 10:
                                                            Integer num = libraryItem.f19441m;
                                                            b85Var3.mo3467t(num != null ? num.intValue() : 0);
                                                            return xfaVar2;
                                                        default:
                                                            gm5.m12750e();
                                                            return null;
                                                    }
                                            }
                                        }
                                    };
                                    tj3Var.m22131l0(objM22097O2);
                                }
                                vi3 vi3Var = (vi3) objM22097O2;
                                boolean zM22124i3 = tj3Var.m22124i(b85Var2) | tj3Var.m22120g(x59Var);
                                Object objM22097O3 = tj3Var.m22097O();
                                if (zM22124i3 || objM22097O3 == p84Var) {
                                    objM22097O3 = new C3006fm(23, b85Var2, t59Var2);
                                    tj3Var.m22131l0(objM22097O3);
                                }
                                AbstractC3184kh.m15207a(e16VarMo3161g, z85Var, vi3Var, (ui3) objM22097O3, tj3Var, 0, 0);
                                tj3Var.m22139q(false);
                            } else if (x59Var instanceof q59) {
                                tj3Var.m22111b0(999602348);
                                ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                                e16 e16VarM4426s = c99.m4426s(b16Var, 227.0f);
                                q59 q59Var = (q59) x59Var;
                                boolean zM19664c = q59Var.m19664c();
                                boolean zM19663b = q59Var.m19663b();
                                boolean zM19665d = q59Var.m19665d();
                                boolean zM22124i4 = tj3Var.m22124i(b85Var2);
                                Object objM22097O4 = tj3Var.m22097O();
                                if (zM22124i4 || objM22097O4 == p84Var) {
                                    objM22097O4 = new ma5(b85Var2, 17);
                                    tj3Var.m22131l0(objM22097O4);
                                }
                                bkd.m3814a(e16VarM4426s, zM19664c, zM19665d, zM19663b, (ui3) objM22097O4, tj3Var, 0, 0);
                                tj3Var.m22139q(false);
                            } else if (x59Var instanceof r59) {
                                tj3Var.m22111b0(1000167044);
                                e16 e16VarM12121a = ft4.m12121a(ft4Var, b16Var);
                                r59 r59Var = (r59) x59Var;
                                d85 d85Var = r59Var.f58777a;
                                boolean zM22124i5 = tj3Var.m22124i(b85Var2) | tj3Var.m22120g(x59Var);
                                Object objM22097O5 = tj3Var.m22097O();
                                if (zM22124i5 || objM22097O5 == p84Var) {
                                    objM22097O5 = new C3704w(27, b85Var2, r59Var);
                                    tj3Var.m22131l0(objM22097O5);
                                }
                                vi3 vi3Var2 = (vi3) objM22097O5;
                                boolean zM22124i6 = tj3Var.m22124i(b85Var2) | tj3Var.m22120g(x59Var);
                                Object objM22097O6 = tj3Var.m22097O();
                                if (zM22124i6 || objM22097O6 == p84Var) {
                                    objM22097O6 = new C3006fm(19, b85Var2, r59Var);
                                    tj3Var.m22131l0(objM22097O6);
                                }
                                pvc.m19510f(e16VarM12121a, d85Var, vi3Var2, (ui3) objM22097O6, tj3Var, 0, 0);
                                tj3Var.m22139q(false);
                            } else if (x59Var instanceof w59) {
                                tj3Var.m22111b0(1002049891);
                                e16 e16VarM12121a2 = ft4.m12121a(ft4Var, b16Var);
                                w59 w59Var = (w59) x59Var;
                                x95 x95VarM23767c = w59Var.m23767c();
                                boolean zM22120g = tj3Var.m22120g(x59Var) | tj3Var.m22124i(b85Var2);
                                Object objM22097O7 = tj3Var.m22097O();
                                if (zM22120g || objM22097O7 == p84Var) {
                                    objM22097O7 = new C3006fm(20, b85Var2, w59Var);
                                    tj3Var.m22131l0(objM22097O7);
                                }
                                yjd.m25162a(x95VarM23767c, (ui3) objM22097O7, e16VarM12121a2, tj3Var, 0);
                                tj3Var.m22139q(false);
                            } else if (x59Var instanceof s59) {
                                tj3Var.m22111b0(1002434322);
                                s59 s59Var = (s59) x59Var;
                                String strM21125c = s59Var.m21125c();
                                boolean zM22124i7 = tj3Var.m22124i(b85Var2) | tj3Var.m22120g(x59Var);
                                Object objM22097O8 = tj3Var.m22097O();
                                if (zM22124i7 || objM22097O8 == p84Var) {
                                    objM22097O8 = new C3006fm(21, b85Var2, s59Var);
                                    tj3Var.m22131l0(objM22097O8);
                                }
                                ui3 ui3Var = (ui3) objM22097O8;
                                boolean zM22124i8 = tj3Var.m22124i(b85Var2);
                                Object objM22097O9 = tj3Var.m22097O();
                                if (zM22124i8 || objM22097O9 == p84Var) {
                                    objM22097O9 = new ma5(b85Var2, 0);
                                    tj3Var.m22131l0(objM22097O9);
                                }
                                ujd.m22760a(strM21125c, true, ui3Var, (ui3) objM22097O9, tj3Var, 48);
                                tj3Var.m22139q(false);
                            } else if (x59Var instanceof u59) {
                                tj3Var.m22111b0(1002940335);
                                u59 u59Var = (u59) x59Var;
                                String strM22482b = u59Var.m22482b();
                                boolean zM22124i9 = tj3Var.m22124i(b85Var2) | tj3Var.m22120g(x59Var);
                                Object objM22097O10 = tj3Var.m22097O();
                                if (zM22124i9 || objM22097O10 == p84Var) {
                                    objM22097O10 = new C3006fm(22, b85Var2, u59Var);
                                    tj3Var.m22131l0(objM22097O10);
                                }
                                ui3 ui3Var2 = (ui3) objM22097O10;
                                boolean zM22124i10 = tj3Var.m22124i(b85Var2);
                                Object objM22097O11 = tj3Var.m22097O();
                                if (zM22124i10 || objM22097O11 == p84Var) {
                                    objM22097O11 = new ma5(b85Var2, 16);
                                    tj3Var.m22131l0(objM22097O11);
                                }
                                ujd.m22760a(strM22482b, false, ui3Var2, (ui3) objM22097O11, tj3Var, 48);
                                tj3Var.m22139q(false);
                            } else {
                                if (!(x59Var instanceof v59)) {
                                    throw ux5.m23001x(tj3Var, 1140507284, false);
                                }
                                tj3Var.m22111b0(1003487609);
                                ge9.m12515a(tj3Var).getClass();
                                e16 e16VarM4426s2 = c99.m4426s(b16Var, 227.0f);
                                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                                int iHashCode = Long.hashCode(tj3Var.f62385T);
                                l77 l77VarM22132m = tj3Var.m22132m();
                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4426s2);
                                se1.f60731q.getClass();
                                ui3 ui3Var3 = C0352b.f4299b;
                                tj3Var.m22119f0();
                                if (tj3Var.f62384S) {
                                    tj3Var.m22130l(ui3Var3);
                                } else {
                                    tj3Var.m22137o0();
                                }
                                oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                                oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                                oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                                oha.m18000f(tj3Var, C0352b.f4305h);
                                oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                                ge9.m12515a(tj3Var).getClass();
                                e16 e16VarM19045o = pb1.m19045o(c99.m4414g(e16VarM4412e, 140.0f), p58.m18901i(tj3Var).f64858d);
                                long j = p58.m18900f(tj3Var).f55825J;
                                mv3 mv3Var = ss5.f61356d;
                                qh0.m19963a(x74.m24341H(d32.m10007D(e16VarM19045o, j, mv3Var)), tj3Var, 0);
                                qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), 28.0f), p58.m18901i(tj3Var).f64858d), p58.m18900f(tj3Var).f55825J, mv3Var)), tj3Var, 0);
                                qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38955d, tj3Var, b16Var, 1.0f), 16.0f), p58.m18901i(tj3Var).f64858d), p58.m18900f(tj3Var).f55825J, mv3Var)), tj3Var, 0);
                                thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38952a));
                                tj3Var.m22139q(true);
                                tj3Var.m22139q(false);
                            }
                        } else {
                            tj3Var.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }), 4);
                return xfaVar;
            case 1:
                final AbstractC0150d abstractC0150d = (AbstractC0150d) obj3;
                final un1 un1Var = (un1) obj2;
                tv8 tv8Var = (tv8) obj;
                if (z) {
                    final int i3 = 0;
                    ui3 ui3Var = new ui3() { // from class: androidx.compose.foundation.pager.c
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i4 = i3;
                            boolean z2 = false;
                            un1 un1Var2 = un1Var;
                            AbstractC0150d abstractC0150d2 = abstractC0150d;
                            switch (i4) {
                                case 0:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    bh4[] bh4VarArr = AbstractC0426f.f5022a;
                    tv8Var.mo3709d(AbstractC0421a.f4969y, new C3024g3(null, ui3Var));
                    tv8Var.mo3709d(AbstractC0421a.f4942A, new C3024g3(null, new ui3() { // from class: androidx.compose.foundation.pager.c
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i4 = i2;
                            boolean z2 = false;
                            un1 un1Var2 = un1Var;
                            AbstractC0150d abstractC0150d2 = abstractC0150d;
                            switch (i4) {
                                case 0:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                } else {
                    final int i4 = 2;
                    ui3 ui3Var2 = new ui3() { // from class: androidx.compose.foundation.pager.c
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i5 = i4;
                            boolean z2 = false;
                            un1 un1Var2 = un1Var;
                            AbstractC0150d abstractC0150d2 = abstractC0150d;
                            switch (i5) {
                                case 0:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    bh4[] bh4VarArr2 = AbstractC0426f.f5022a;
                    tv8Var.mo3709d(AbstractC0421a.f4970z, new C3024g3(null, ui3Var2));
                    final int i5 = 3;
                    tv8Var.mo3709d(AbstractC0421a.f4943B, new C3024g3(null, new ui3() { // from class: androidx.compose.foundation.pager.c
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i6 = i5;
                            boolean z2 = false;
                            un1 un1Var2 = un1Var;
                            AbstractC0150d abstractC0150d2 = abstractC0150d;
                            switch (i6) {
                                case 0:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (abstractC0150d2.mo974b()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (abstractC0150d2.mo975d()) {
                                        wfb.m23926u(un1Var2, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(abstractC0150d2, null), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                }
                return xfaVar;
            default:
                ui3 ui3Var3 = (ui3) obj3;
                vi3 vi3Var = (vi3) obj2;
                SheetValue sheetValue = (SheetValue) obj;
                if (z && sheetValue == SheetValue.PartiallyExpanded) {
                    sheetValue = SheetValue.Expanded;
                }
                return new C0269z(z, ui3Var3, sheetValue, vi3Var);
        }
    }

    public /* synthetic */ ua5(boolean z, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var) {
        this.f63640b = z;
        this.f63641c = ui3Var;
        this.f63642d = vi3Var;
    }

    public /* synthetic */ ua5(boolean z, AbstractC0150d abstractC0150d, un1 un1Var) {
        this.f63640b = z;
        this.f63641c = abstractC0150d;
        this.f63642d = un1Var;
    }
}
