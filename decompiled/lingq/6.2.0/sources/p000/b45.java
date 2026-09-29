package p000;

import android.content.Context;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.reader.video.C2583a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b45 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7918a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7919b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7920c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f7921d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f7922e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f7923f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f7924g;

    public /* synthetic */ b45(zy1 zy1Var, vi3 vi3Var, t66 t66Var, t66 t66Var2, fe9 fe9Var, Context context) {
        this.f7918a = 2;
        this.f7923f = zy1Var;
        this.f7919b = context;
        this.f7922e = fe9Var;
        this.f7924g = vi3Var;
        this.f7920c = t66Var;
        this.f7921d = t66Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i;
        String str;
        String str2;
        int i2 = this.f7918a;
        int i3 = 0;
        int i4 = 4;
        int i5 = 3;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f7924g;
        Object obj3 = this.f7922e;
        Object obj4 = this.f7921d;
        Object obj5 = this.f7920c;
        Object obj6 = this.f7919b;
        Object obj7 = this.f7923f;
        switch (i2) {
            case 0:
                final sc9 sc9Var = (sc9) obj6;
                final t66 t66Var = (t66) obj5;
                final t66 t66Var2 = (t66) obj4;
                final t66 t66Var3 = (t66) obj3;
                r35 r35Var = (r35) obj;
                r35Var.getClass();
                final int i6 = 0;
                AbstractC2131b.m9048g(r35Var, (g35) obj7, new aj3() { // from class: x35
                    @Override // p000.aj3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        int i7 = i6;
                        xfa xfaVar2 = xfa.f68157a;
                        t66 t66Var4 = t66Var3;
                        t66 t66Var5 = t66Var2;
                        t66 t66Var6 = t66Var;
                        sc9 sc9Var2 = sc9Var;
                        int iIntValue = ((Integer) obj8).intValue();
                        String str3 = (String) obj9;
                        Boolean bool = (Boolean) obj10;
                        bool.getClass();
                        str3.getClass();
                        switch (i7) {
                            case 0:
                                sc9Var2.m21223i(iIntValue);
                                t66Var6.setValue(str3);
                                t66Var5.setValue(bool);
                                t66Var4.setValue(Boolean.TRUE);
                                break;
                            default:
                                sc9Var2.m21223i(iIntValue);
                                t66Var6.setValue(str3);
                                t66Var5.setValue(bool);
                                t66Var4.setValue(Boolean.TRUE);
                                break;
                        }
                        return xfaVar2;
                    }
                }, new eo4((dh9) obj2, 1));
                return xfaVar;
            case 1:
                final sc9 sc9Var2 = (sc9) obj6;
                final t66 t66Var4 = (t66) obj5;
                final t66 t66Var5 = (t66) obj4;
                final t66 t66Var6 = (t66) obj3;
                r35 r35Var2 = (r35) obj;
                r35Var2.getClass();
                final int i7 = 1;
                AbstractC2131b.m9048g(r35Var2, (a35) obj7, new aj3() { // from class: x35
                    @Override // p000.aj3
                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                        int i8 = i7;
                        xfa xfaVar2 = xfa.f68157a;
                        t66 t66Var7 = t66Var6;
                        t66 t66Var8 = t66Var5;
                        t66 t66Var9 = t66Var4;
                        sc9 sc9Var3 = sc9Var2;
                        int iIntValue = ((Integer) obj8).intValue();
                        String str3 = (String) obj9;
                        Boolean bool = (Boolean) obj10;
                        bool.getClass();
                        str3.getClass();
                        switch (i8) {
                            case 0:
                                sc9Var3.m21223i(iIntValue);
                                t66Var9.setValue(str3);
                                t66Var8.setValue(bool);
                                t66Var7.setValue(Boolean.TRUE);
                                break;
                            default:
                                sc9Var3.m21223i(iIntValue);
                                t66Var9.setValue(str3);
                                t66Var8.setValue(bool);
                                t66Var7.setValue(Boolean.TRUE);
                                break;
                        }
                        return xfaVar2;
                    }
                }, new do4(8, (t66) obj2));
                return xfaVar;
            case 2:
                zy1 zy1Var = (zy1) obj7;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                vu4.m23545g(vu4Var, null, new C0282a(-2025596902, true, new a05((Context) obj6, zy1Var, (fe9) obj3, i5)), 3);
                List list = zy1Var.f72375c;
                vu4.m23546i(vu4Var, list.size(), new bz0(7, list), new C0282a(-212049501, true, new dw0(list, zy1Var, (vi3) obj2, i4)), 4);
                vu4.m23545g(vu4Var, null, new C0282a(1410207249, true, new bt6((t66) obj5, (t66) obj4, i3)), 3);
                return xfaVar;
            case 3:
                w41 w41Var = (w41) obj7;
                Lesson lesson = (Lesson) obj6;
                ud6 ud6Var = (ud6) obj5;
                int i8 = ((C2583a) obj4).f31348G;
                Context context = (Context) obj3;
                ui3 ui3Var = (ui3) obj2;
                csa csaVar = (csa) obj;
                csaVar.getClass();
                boolean z = csaVar instanceof yra;
                LqAnalyticsValues$LessonPath.LessonComplete lessonComplete = LqAnalyticsValues$LessonPath.LessonComplete.f14308a;
                String str3 = "";
                if (z) {
                    int i9 = ((yra) csaVar).f70353a;
                    i = lesson != null ? lesson.f19149h : -1;
                    if (lesson != null && (str2 = lesson.f19150i) != null) {
                        str3 = str2;
                    }
                    w41Var.m23737z(new ja6(i9, i, str3, lessonComplete));
                } else if (csaVar instanceof xra) {
                    int i10 = ((xra) csaVar).f68589a;
                    i = lesson != null ? lesson.f19149h : -1;
                    if (lesson != null && (str = lesson.f19150i) != null) {
                        str3 = str;
                    }
                    w41Var.m23737z(new ja6(i10, i, str3, lessonComplete));
                } else if (csaVar.equals(ura.f64251a)) {
                    w41Var.m23737z(x96.f67977b);
                } else if (csaVar.equals(wra.f67209a)) {
                    if (lesson != null) {
                        int i11 = lesson.f19142a;
                        String str4 = lesson.f19143b;
                        String str5 = lesson.f19146e;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = lesson.f19145d;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = lesson.f19144c;
                        w41Var.m23737z(new da6(i11, str4, str6, str8, str9 == null ? "" : str9, LessonInfoSource.Lesson, ""));
                    }
                } else if (csaVar.equals(bsa.f8956a)) {
                    l08.Companion.getClass();
                    jfa.m14428k(ud6Var, new j08(i8), null);
                } else if (csaVar.equals(zra.f72015a)) {
                    w41Var.m23737z(fa6.f38722b);
                } else if (csaVar instanceof tra) {
                    mbd.m16753a(context, ((tra) csaVar).f62788a);
                } else if (csaVar instanceof vra) {
                    vra vraVar = (vra) csaVar;
                    w41Var.m23737z(new ca6(vraVar.f65830a, vraVar.f65831b, vraVar.f65832c));
                } else if (csaVar.equals(rra.f59744a)) {
                    ui3Var.mo0a();
                } else if (csaVar.equals(sra.f61324a)) {
                    l08.Companion.getClass();
                    jfa.m14428k(ud6Var, new i08(i8), null);
                } else {
                    if (!(csaVar instanceof asa)) {
                        gm5.m12750e();
                        return null;
                    }
                    asa asaVar = (asa) csaVar;
                    w41Var.m23737z(new ka6(false, asaVar.f7443a, asaVar.f7444b, asaVar.f7445c, asaVar.f7446d, null, null, "Reader video mode", 192));
                }
                return xfaVar;
            default:
                List list2 = (List) obj7;
                tpa tpaVar = (tpa) obj6;
                vi3 vi3Var = (vi3) obj3;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                vu4.m23545g(vu4Var2, null, new C0282a(1204776331, true, new fo8(tpaVar, i3)), 3);
                vu4.m23546i(vu4Var2, list2.size(), new bz0(9, list2), new C0282a(-1207530092, true, new gy0(list2, (wz7) obj5, (nz9) obj4, vi3Var, (e08) obj2, 2)), 4);
                vu4.m23545g(vu4Var2, null, new C0282a(117034242, true, new iz4(13, vi3Var, tpaVar)), 3);
                vu4.m23545g(vu4Var2, null, fkc.f39237a, 3);
                return xfaVar;
        }
    }

    public /* synthetic */ b45(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f7918a = i;
        this.f7923f = obj;
        this.f7919b = obj2;
        this.f7920c = obj3;
        this.f7921d = obj4;
        this.f7922e = obj5;
        this.f7924g = obj6;
    }
}
