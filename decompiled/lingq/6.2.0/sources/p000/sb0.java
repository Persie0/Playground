package p000;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import androidx.compose.material3.C0252k0;
import com.lingq.core.analytics.data.LqAnalyticsValues$LikeLocation;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.feature.dictionary.C2069m;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final class sb0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60608c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f60609d;

    public /* synthetic */ sb0(Object obj, Object obj2, t66 t66Var, int i) {
        this.f60606a = i;
        this.f60607b = obj;
        this.f60609d = obj2;
        this.f60608c = t66Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        lf2 lf2Var;
        String str;
        Object value2;
        lf2 lf2Var2;
        zf2 zf2Var;
        String str2;
        int i = this.f60606a;
        x71 x71Var = x71.f67865a;
        s71 s71Var = s71.f60447a;
        r71 r71Var = r71.f58821a;
        y71 y71Var = y71.f69399a;
        w71 w71Var = w71.f66461a;
        q71 q71Var = q71.f57335a;
        t71 t71Var = t71.f61927a;
        z71 z71Var = z71.f71002a;
        v71 v71Var = v71.f64958a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f60609d;
        Object obj3 = this.f60608c;
        Object obj4 = this.f60607b;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((bi4) obj).f8562a;
                t66 t66Var = (t66) obj3;
                C0252k0 c0252k0 = (C0252k0) obj4;
                if (!c0252k0.m1178b()) {
                    t66Var.setValue(Boolean.FALSE);
                } else if (chd.m4668b(keyEvent) == 2 && rh4.m20661a(dhd.m10397a(keyEvent.getKeyCode()), rh4.f59301u)) {
                    ((t66) obj2).setValue(Boolean.FALSE);
                    c0252k0.m1177a();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                a81 a81Var = (a81) obj;
                vi3 vi3Var = (vi3) obj2;
                vi3 vi3Var2 = (vi3) obj4;
                h81 h81Var = ((k71) obj3).f46806a;
                a81Var.getClass();
                if (a81Var instanceof u71) {
                    vi3Var2.invoke(new p81(h81Var, ((u71) a81Var).f63503a));
                } else if (a81Var.equals(v71Var)) {
                    vi3Var2.invoke(new r81(h81Var));
                } else if (a81Var.equals(z71Var)) {
                    vi3Var2.invoke(new q81(h81Var));
                } else if (a81Var.equals(t71Var)) {
                    vi3Var.invoke(new r51(h81Var, LqAnalyticsValues$LikeLocation.LessonDropdown));
                } else if (a81Var.equals(q71Var)) {
                    vi3Var2.invoke(new l81(h81Var));
                } else if (a81Var.equals(w71Var)) {
                    vi3Var2.invoke(new t81(h81Var));
                } else if (a81Var.equals(y71Var)) {
                    vi3Var.invoke(new t51(h81Var));
                } else if (a81Var.equals(r71Var)) {
                    vi3Var.invoke(new p51(h81Var));
                } else if (a81Var.equals(s71Var)) {
                    vi3Var.invoke(new q51(h81Var));
                } else {
                    if (!a81Var.equals(x71Var)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var.invoke(new o51(h81Var));
                }
                return xfaVar;
            case 2:
                ((DictionaryData) obj).getClass();
                DictionaryData dictionaryData = ((pf2) obj2).f56050a;
                dictionaryData.getClass();
                C3244l c3244l = ((C2069m) obj4).f25850e;
                do {
                    value = c3244l.getValue();
                    lf2Var = (lf2) value;
                    str = lf2Var.f49583b;
                } while (!c3244l.m15570h(value, lf2.m16158a(lf2Var, new zf2(str, dictionaryData.m8023b(str), dictionaryData.m8022a(), dictionaryData.f19014g), null, true, null, null, null, false, null, 250)));
                String strM8023b = dictionaryData.m8023b(((lf2) ((t66) obj3).getValue()).f49583b);
                do {
                    value2 = c3244l.getValue();
                    lf2Var2 = (lf2) value2;
                    zf2 zf2Var2 = lf2Var2.f49582a;
                    if (zf2Var2 != null) {
                        String str3 = zf2Var2.f71484a;
                        String str4 = zf2Var2.f71486c;
                        String str5 = zf2Var2.f71487d;
                        str5.getClass();
                        zf2Var = new zf2(str3, strM8023b, str4, str5);
                    } else {
                        zf2Var = null;
                    }
                } while (!c3244l.m15570h(value2, lf2.m16158a(lf2Var2, zf2Var, null, false, null, null, null, false, null, 254)));
                return xfaVar;
            case 3:
                ((om6) obj).getClass();
                om6 om6Var = (om6) obj3;
                ((vi3) obj4).invoke(new ln6(om6Var));
                ((vi3) obj2).invoke(new bo6(om6Var));
                return xfaVar;
            case 4:
                l55 l55Var = (l55) obj;
                l55Var.getClass();
                ud7 ud7Var = l55Var.f49081a;
                tb7 tb7Var = (tb7) obj4;
                boolean z = false;
                boolean z2 = (tb7Var == null || ud7Var.f63767a != tb7Var.f62101a || (str2 = ud7Var.f63780n) == null || vk9.m23391n0(str2)) ? false : true;
                vi3 vi3Var3 = (vi3) obj2;
                vd7 vd7Var = l55Var.f49082b;
                if (vd7Var != null && vd7Var.f65237b) {
                    z = true;
                }
                vi3Var3.invoke(new vc7(ud7Var, z));
                if (z2) {
                    ((t66) obj3).setValue(lbb.f49418a);
                }
                return xfaVar;
            case 5:
                a81 a81Var2 = (a81) obj;
                vi3 vi3Var4 = (vi3) obj2;
                vi3 vi3Var5 = (vi3) obj4;
                uq8 uq8Var = (uq8) obj3;
                a81Var2.getClass();
                if (a81Var2 instanceof u71) {
                    vi3Var5.invoke(new rs8(uq8Var, ((u71) a81Var2).f63503a));
                } else if (a81Var2.equals(v71Var)) {
                    vi3Var5.invoke(new ts8(uq8Var));
                } else if (a81Var2.equals(z71Var)) {
                    vi3Var5.invoke(new ss8(uq8Var));
                } else if (a81Var2.equals(t71Var)) {
                    vi3Var4.invoke(new or8(uq8Var, LqAnalyticsValues$LikeLocation.LessonDropdown));
                } else if (a81Var2.equals(q71Var)) {
                    vi3Var5.invoke(new ns8(uq8Var));
                } else if (a81Var2.equals(w71Var)) {
                    vi3Var5.invoke(new vs8(uq8Var));
                } else if (a81Var2.equals(y71Var)) {
                    vi3Var4.invoke(new pr8(uq8Var));
                } else if (a81Var2.equals(r71Var)) {
                    vi3Var4.invoke(new mr8(uq8Var));
                } else if (a81Var2.equals(s71Var)) {
                    vi3Var4.invoke(new nr8(uq8Var));
                } else {
                    if (!a81Var2.equals(x71Var)) {
                        gm5.m12750e();
                        return null;
                    }
                    vi3Var4.invoke(new lr8(uq8Var));
                }
                return xfaVar;
            default:
                t18 t18Var = (t18) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                bva bvaVar = (bva) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(bvaVar);
                } else {
                    t18Var.f61746a.getViewTreeObserver().removeOnPreDrawListener(bvaVar);
                }
                return xfaVar;
        }
    }

    public /* synthetic */ sb0(Object obj, Object obj2, Object obj3, int i) {
        this.f60606a = i;
        this.f60607b = obj;
        this.f60608c = obj2;
        this.f60609d = obj3;
    }
}
