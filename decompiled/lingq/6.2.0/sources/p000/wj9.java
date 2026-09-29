package p000;

import android.content.Context;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.stats.C1529d;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.widget.R$string;
import com.lingq.feature.widget.streak.C2871b;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wj9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f66945b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1529d f66946c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2871b f66947d;

    public /* synthetic */ wj9(cma cmaVar, C1529d c1529d, C2871b c2871b, int i) {
        this.f66944a = i;
        this.f66945b = cmaVar;
        this.f66946c = c1529d;
        this.f66947d = c2871b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String strM17092K;
        boolean z;
        int i = this.f66944a;
        xfa xfaVar = xfa.f68157a;
        fk9 fk9Var = null;
        C2871b c2871b = this.f66947d;
        C1529d c1529d = this.f66946c;
        cma cmaVar = this.f66945b;
        int i2 = 1;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ci8.m4716b(null, ci8.m4703P(-1267375775, new wj9(cmaVar, c1529d, c2871b, i2), tj3Var), tj3Var, 48);
                } else {
                    tj3Var.m22102U();
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Language language = (Language) AbstractC0278f.m1252b(cmaVar.mo4572B0(), tj3Var2).getValue();
                    String str = language != null ? language.f19024a : null;
                    Context context = (Context) tj3Var2.m22128k(yf1.f69763b);
                    Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                    if (str != null) {
                        locale.getClass();
                        strM17092K = AbstractC3352my.m17092K(context, str, locale);
                    } else {
                        strM17092K = null;
                    }
                    if (str != null) {
                        tj3Var2.m22111b0(666289367);
                        t66 t66VarM1251a = AbstractC0278f.m1251a(c1529d.m8208a(), null, null, tj3Var2, 48, 2);
                        if (((fj9) t66VarM1251a.getValue()) != null) {
                            tj3Var2.m22111b0(666503236);
                            fj9 fj9Var = (fj9) t66VarM1251a.getValue();
                            if (fj9Var != null) {
                                String str2 = strM17092K == null ? str : strM17092K;
                                String string = LocalDate.now().toString();
                                string.getClass();
                                int i3 = fj9Var.f39204a;
                                int i4 = fj9Var.f39208e;
                                dx1 dx1Var = fj9Var.f39207d;
                                int i5 = dx1Var.f36355c;
                                int i6 = dx1Var.f36354b;
                                boolean z2 = dx1Var.f36357e;
                                ArrayList<mj9> arrayList = fj9Var.f39205b;
                                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                                for (mj9 mj9Var : arrayList) {
                                    int i7 = i2;
                                    String str3 = mj9Var.f51407a;
                                    String str4 = mj9Var.f51408b;
                                    arrayList2.add(new ek9(mj9Var.f51409c, mj9Var.f51410d, str3, str4, str4.equals(string), str4.compareTo(string) > 0 ? i7 : 0));
                                    i2 = i7;
                                }
                                fk9Var = new fk9(str2, i3, i4, i5, i6, z2, arrayList2);
                            }
                            if (fk9Var == null) {
                                tj3Var2.m22111b0(666503235);
                                z = false;
                                tj3Var2.m22139q(false);
                            } else {
                                z = false;
                                tj3Var2.m22111b0(666503236);
                                c2871b.m9791h(fk9Var, tj3Var2, 0);
                                tj3Var2.m22139q(false);
                            }
                            tj3Var2.m22139q(z);
                        } else {
                            tj3Var2.m22111b0(666672124);
                            x74.m24344a(R$string.streak_widget_study_reminder, null, com.lingq.core.p012ui.R$string.ui_open, R$drawable.ic_fire_red, false, r46.m20385j("open app"), r46.m20385j("open app"), tj3Var2, 24576, 2);
                            tj3Var2 = tj3Var2;
                            z = false;
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(z);
                    } else {
                        tj3Var2.m22111b0(667243361);
                        x74.m24344a(R$string.streak_widget_login_message, null, com.lingq.core.p012ui.R$string.ui_open, R$drawable.ic_fire_red, false, r46.m20385j("open app"), r46.m20385j("open app"), tj3Var2, 24576, 2);
                        tj3Var2.m22139q(false);
                    }
                } else {
                    tj3Var2.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
