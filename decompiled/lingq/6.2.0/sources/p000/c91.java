package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.navigation.model.LibraryShelfNavArg;
import com.lingq.core.navigation.model.LibraryTabNavArg;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.core.p012ui.R$string;
import com.lingq.feature.collections.C2034d;
import com.lingq.feature.search.fastsearch.C2768b;
import com.lingq.feature.search.search.AbstractC2776c;
import com.lingq.feature.search.search.C2779e;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c91 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9736a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w41 f9737b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f9738c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sc9 f9739d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f9740e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f9741f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f9742g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f9743h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f9744i;

    public /* synthetic */ c91(t61 t61Var, w41 w41Var, Context context, C2034d c2034d, t66 t66Var, sc9 sc9Var, t66 t66Var2, t66 t66Var3) {
        this.f9742g = t61Var;
        this.f9737b = w41Var;
        this.f9738c = context;
        this.f9743h = c2034d;
        this.f9740e = t66Var;
        this.f9739d = sc9Var;
        this.f9741f = t66Var2;
        this.f9744i = t66Var3;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f9736a;
        EmptyList emptyList = EmptyList.f47638a;
        xfa xfaVar = xfa.f68157a;
        final int iIntValue = 0;
        Object obj2 = this.f9744i;
        t66 t66Var = this.f9741f;
        t66 t66Var2 = this.f9740e;
        sc9 sc9Var = this.f9739d;
        Context context = this.f9738c;
        w41 w41Var = this.f9737b;
        Object obj3 = this.f9743h;
        Object obj4 = this.f9742g;
        switch (i) {
            case 0:
                t61 t61Var = (t61) obj4;
                C2034d c2034d = (C2034d) obj3;
                t66 t66Var3 = (t66) obj2;
                s61 s61Var = (s61) obj;
                s61Var.getClass();
                if (s61Var.equals(p61.f55630a)) {
                    Boolean bool = Boolean.TRUE;
                    t66Var2.setValue(bool);
                    sc9Var.m21223i(t61Var.f61899b);
                    t66Var.setValue(t61Var.f61900c);
                    t66Var3.setValue(bool);
                } else if (s61Var.equals(q61.f57306a)) {
                    w41Var.m23737z(new t96(t61Var.f61898a, t61Var.f61899b, t61Var.f61901d));
                } else {
                    if (!s61Var.equals(r61.f58792a)) {
                        gm5.m12750e();
                        return null;
                    }
                    new qn2(context, t61Var.f61898a, new C3598t4(13, c2034d, t61Var)).m20043h();
                }
                c2034d.m8945Z2(n51.f52357a);
                return xfaVar;
            case 1:
                ud6 ud6Var = (ud6) obj4;
                Resources resources = (Resources) obj3;
                C2768b c2768b = (C2768b) obj2;
                z03 z03Var = (z03) obj;
                z03Var.getClass();
                if (z03Var.equals(s03.f60129a)) {
                    ud6Var.m22689f();
                    return xfaVar;
                }
                boolean z = z03Var instanceof v03;
                LqAnalyticsValues$LessonPath.Search search = LqAnalyticsValues$LessonPath.Search.f14311a;
                if (z) {
                    v03 v03Var = (v03) z03Var;
                    LibraryItem libraryItem = v03Var.f64656a;
                    boolean z2 = v03Var.f64657b;
                    if (libraryItem.m8090e()) {
                        String str = libraryItem.f19447s;
                        String str2 = str == null ? "" : str;
                        String str3 = libraryItem.f19448t;
                        String str4 = str3 == null ? "" : str3;
                        int i2 = libraryItem.f19426a;
                        String str5 = libraryItem.f19412M;
                        String str6 = str5 == null ? "" : str5;
                        List list = libraryItem.f19422W;
                        List list2 = list == null ? emptyList : list;
                        boolean zM8089d = libraryItem.m8089d();
                        boolean zM8086a = libraryItem.m8086a();
                        Integer num = libraryItem.f19437i;
                        w41Var.m23737z(new ea6(str2, str4, i2, search, "", str6, list2, zM8089d, zM8086a, num != null ? num.intValue() : 0));
                        return xfaVar;
                    }
                    if (fa4.m11650l(libraryItem.f19418S, Boolean.TRUE) || z2) {
                        int i3 = libraryItem.f19426a;
                        Integer num2 = libraryItem.f19441m;
                        iIntValue = num2 != null ? num2.intValue() : 0;
                        String str7 = libraryItem.f19442n;
                        w41Var.m23737z(new ja6(i3, iIntValue, str7 != null ? str7 : "", search));
                        return xfaVar;
                    }
                    int i4 = libraryItem.f19426a;
                    String str8 = libraryItem.f19433e;
                    String str9 = str8 == null ? "" : str8;
                    String str10 = libraryItem.f19436h;
                    String str11 = str10 == null ? "" : str10;
                    String str12 = libraryItem.f19409J;
                    String str13 = (str12 == null && (str12 = libraryItem.f19402C) == null) ? "" : str12;
                    String str14 = libraryItem.f19434f;
                    w41Var.m23737z(new da6(i4, str9, str11, str13, str14 == null ? "" : str14, LessonInfoSource.Overview, ""));
                    return xfaVar;
                }
                if (z03Var instanceof x03) {
                    LibraryItem libraryItem2 = ((x03) z03Var).f67589a;
                    int i5 = libraryItem2.f19426a;
                    String str15 = libraryItem2.f19433e;
                    String str16 = str15 == null ? "" : str15;
                    String str17 = libraryItem2.f19436h;
                    String str18 = str17 == null ? "" : str17;
                    String str19 = libraryItem2.f19409J;
                    String str20 = (str19 == null && (str19 = libraryItem2.f19402C) == null) ? "" : str19;
                    String str21 = libraryItem2.f19434f;
                    w41Var.m23737z(new da6(i5, str16, str18, str20, str21 == null ? "" : str21, LessonInfoSource.Overview, ""));
                    return xfaVar;
                }
                if (z03Var instanceof w03) {
                    Integer num3 = ((w03) z03Var).f66162a.f19441m;
                    w41Var.m23737z(new s96(num3 != null ? num3.intValue() : 0, search, "", ""));
                    return xfaVar;
                }
                if (z03Var instanceof u03) {
                    w41Var.m23737z(new s96(((u03) z03Var).f63167a.f19426a, search, "", ""));
                    return xfaVar;
                }
                if (z03Var instanceof r03) {
                    LibraryItem libraryItem3 = ((r03) z03Var).f58437a;
                    sc9Var.m21223i(libraryItem3.f19426a);
                    String str22 = libraryItem3.f19430c;
                    t66Var2.setValue(str22 != null ? str22 : "");
                    t66Var.setValue(Boolean.TRUE);
                    return xfaVar;
                }
                if (z03Var instanceof y03) {
                    String str23 = ((y03) z03Var).f69047a.f19433e;
                    new qn2(context, str23 != null ? str23 : "", new rw1(10, c2768b, z03Var)).m20043h();
                    return xfaVar;
                }
                if (!(z03Var instanceof t03)) {
                    gm5.m12750e();
                    return null;
                }
                kc6 kc6Var = lc6.Companion;
                t03 t03Var = (t03) z03Var;
                LibraryShelfNavArg libraryShelfNavArgM14528a = jkd.m14528a(t03Var.f61699a);
                LibraryTabNavArg libraryTabNavArgM14529b = jkd.m14529b(t03Var.f61700b);
                String string = resources.getString(R$string.search_search);
                string.getClass();
                String str24 = t03Var.f61701c;
                kc6Var.getClass();
                jfa.m14428k(ud6Var, kc6.m15109a(libraryShelfNavArgM14528a, string, libraryTabNavArgM14529b, str24), null);
                return xfaVar;
            default:
                ud6 ud6Var2 = (ud6) obj4;
                final C2779e c2779e = (C2779e) obj3;
                t66 t66Var4 = (t66) obj2;
                ws8 ws8Var = (ws8) obj;
                ws8Var.getClass();
                if (ws8Var.equals(os8.f54944a)) {
                    ud6Var2.m22689f();
                    return xfaVar;
                }
                final int i6 = 1;
                if (ws8Var instanceof rs8) {
                    rs8 rs8Var = (rs8) ws8Var;
                    uq8 uq8Var = rs8Var.f59765a;
                    LibraryItem libraryItem4 = uq8Var.f64223a;
                    LibraryItemCounter libraryItemCounter = uq8Var.f64224b;
                    i6 = (libraryItemCounter == null || libraryItemCounter.f19460f || libraryItem4.f19423X <= 0) ? 0 : 1;
                    int i7 = libraryItem4.f19426a;
                    if (i6 != 0) {
                        c2779e.m9706W2(new ur8(libraryItem4.f19423X, i7));
                        return xfaVar;
                    }
                    boolean z3 = rs8Var.f59766b;
                    String str25 = uq8Var.f64227e;
                    if (!libraryItem4.m8090e()) {
                        if (!fa4.m11650l(libraryItem4.f19418S, Boolean.TRUE) && !z3) {
                            AbstractC2776c.m9703c(w41Var, libraryItem4, uq8Var.f64228f);
                            return xfaVar;
                        }
                        Integer num4 = libraryItem4.f19441m;
                        iIntValue = num4 != null ? num4.intValue() : 0;
                        String str26 = libraryItem4.f19442n;
                        w41Var.m23737z(new ja6(i7, iIntValue, str26 != null ? str26 : "", new LqAnalyticsValues$LessonPath.SearchShelf(str25)));
                        return xfaVar;
                    }
                    String str27 = libraryItem4.f19447s;
                    String str28 = str27 == null ? "" : str27;
                    String str29 = libraryItem4.f19448t;
                    String str30 = str29 == null ? "" : str29;
                    int i8 = libraryItem4.f19426a;
                    LqAnalyticsValues$LessonPath.SearchShelf searchShelf = new LqAnalyticsValues$LessonPath.SearchShelf(str25);
                    String str31 = uq8Var.f64228f;
                    String str32 = libraryItem4.f19412M;
                    String str33 = str32 == null ? "" : str32;
                    List list3 = libraryItem4.f19422W;
                    List list4 = list3 == null ? emptyList : list3;
                    boolean zM8089d2 = libraryItem4.m8089d();
                    boolean zM8086a2 = libraryItem4.m8086a();
                    Integer num5 = libraryItem4.f19437i;
                    w41Var.m23737z(new ea6(str28, str30, i8, searchShelf, str31, str33, list4, zM8089d2, zM8086a2, num5 != null ? num5.intValue() : 0));
                    return xfaVar;
                }
                if (ws8Var instanceof qs8) {
                    pq8 pq8Var = ((qs8) ws8Var).f58146a;
                    w41Var.m23737z(new s96(pq8Var.f56682a.f19426a, pq8Var.f56687f, new LqAnalyticsValues$LessonPath.SearchShelf(pq8Var.f56686e)));
                    return xfaVar;
                }
                if (ws8Var instanceof ts8) {
                    uq8 uq8Var2 = ((ts8) ws8Var).f62826a;
                    AbstractC2776c.m9703c(w41Var, uq8Var2.f64223a, uq8Var2.f64228f);
                    return xfaVar;
                }
                if (ws8Var instanceof ss8) {
                    uq8 uq8Var3 = ((ss8) ws8Var).f61369a;
                    Integer num6 = uq8Var3.f64223a.f19441m;
                    w41Var.m23737z(new s96(num6 != null ? num6.intValue() : 0, uq8Var3.f64228f, new LqAnalyticsValues$LessonPath.SearchShelf(uq8Var3.f64227e)));
                    return xfaVar;
                }
                if (ws8Var instanceof ns8) {
                    uq8 uq8Var4 = ((ns8) ws8Var).f53202a;
                    LibraryItem libraryItem5 = uq8Var4.f64223a;
                    LibraryItemCounter libraryItemCounter2 = uq8Var4.f64224b;
                    if (libraryItemCounter2 != null && !libraryItemCounter2.f19460f && libraryItem5.f19423X > 0) {
                        iIntValue = 1;
                    }
                    int i9 = libraryItem5.f19426a;
                    if (iIntValue != 0) {
                        c2779e.m9706W2(new ur8(libraryItem5.f19423X, i9));
                        return xfaVar;
                    }
                    sc9Var.m21223i(i9);
                    String str34 = libraryItem5.f19430c;
                    t66Var2.setValue(str34 != null ? str34 : "");
                    t66Var.setValue(Boolean.FALSE);
                    t66Var4.setValue(Boolean.TRUE);
                    return xfaVar;
                }
                if (ws8Var instanceof ms8) {
                    LibraryItem libraryItem6 = ((ms8) ws8Var).f51807a.f56682a;
                    sc9Var.m21223i(libraryItem6.f19426a);
                    String str35 = libraryItem6.f19430c;
                    t66Var2.setValue(str35 != null ? str35 : "");
                    Boolean bool2 = Boolean.TRUE;
                    t66Var.setValue(bool2);
                    t66Var4.setValue(bool2);
                    return xfaVar;
                }
                if (ws8Var instanceof vs8) {
                    final LibraryItem libraryItem7 = ((vs8) ws8Var).f65863a.f64223a;
                    String str36 = libraryItem7.f19433e;
                    new qn2(context, str36 != null ? str36 : "", new zi3() { // from class: ls8
                        @Override // p000.zi3
                        public final Object invoke(Object obj5, Object obj6) {
                            int i10 = i6;
                            xfa xfaVar2 = xfa.f68157a;
                            LibraryItem libraryItem8 = libraryItem7;
                            C2779e c2779e2 = c2779e;
                            String str37 = (String) obj5;
                            String str38 = (String) obj6;
                            switch (i10) {
                                case 0:
                                    str37.getClass();
                                    c2779e2.mo8954p(c2779e2.f33094b.mo4589b2(), libraryItem8.f19426a, str37, str38);
                                    break;
                                default:
                                    str37.getClass();
                                    c2779e2.mo8951f0(c2779e2.f33094b.mo4589b2(), libraryItem8.f19426a, str37, str38);
                                    break;
                            }
                            return xfaVar2;
                        }
                    }).m20043h();
                    return xfaVar;
                }
                if (ws8Var instanceof us8) {
                    final LibraryItem libraryItem8 = ((us8) ws8Var).f64297a.f56682a;
                    String str37 = libraryItem8.f19433e;
                    new qn2(context, str37 != null ? str37 : "", new zi3() { // from class: ls8
                        @Override // p000.zi3
                        public final Object invoke(Object obj5, Object obj6) {
                            int i10 = iIntValue;
                            xfa xfaVar2 = xfa.f68157a;
                            LibraryItem libraryItem9 = libraryItem8;
                            C2779e c2779e2 = c2779e;
                            String str38 = (String) obj5;
                            String str39 = (String) obj6;
                            switch (i10) {
                                case 0:
                                    str38.getClass();
                                    c2779e2.mo8954p(c2779e2.f33094b.mo4589b2(), libraryItem9.f19426a, str38, str39);
                                    break;
                                default:
                                    str38.getClass();
                                    c2779e2.mo8951f0(c2779e2.f33094b.mo4589b2(), libraryItem9.f19426a, str38, str39);
                                    break;
                            }
                            return xfaVar2;
                        }
                    }).m20043h();
                    return xfaVar;
                }
                if (!ws8Var.equals(ps8.f56766a)) {
                    gm5.m12750e();
                    return null;
                }
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null) {
                    return xfaVar;
                }
                mbd.m16755c(activity, "https://forum.lingq.com/t/how-to-remove-courses-or-content-sources-from-your-library-feed/87124", null, 26);
                return xfaVar;
        }
    }

    public /* synthetic */ c91(ud6 ud6Var, w41 w41Var, Context context, Resources resources, sc9 sc9Var, t66 t66Var, t66 t66Var2, C2768b c2768b) {
        this.f9742g = ud6Var;
        this.f9737b = w41Var;
        this.f9738c = context;
        this.f9743h = resources;
        this.f9739d = sc9Var;
        this.f9740e = t66Var;
        this.f9741f = t66Var2;
        this.f9744i = c2768b;
    }

    public /* synthetic */ c91(ud6 ud6Var, C2779e c2779e, w41 w41Var, Context context, sc9 sc9Var, t66 t66Var, t66 t66Var2, t66 t66Var3) {
        this.f9742g = ud6Var;
        this.f9743h = c2779e;
        this.f9737b = w41Var;
        this.f9738c = context;
        this.f9739d = sc9Var;
        this.f9740e = t66Var;
        this.f9741f = t66Var2;
        this.f9744i = t66Var3;
    }
}
