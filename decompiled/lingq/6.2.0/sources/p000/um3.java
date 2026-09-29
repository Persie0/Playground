package p000;

import android.content.Context;
import android.widget.Toast;
import com.lingq.core.data.repository.C1306v;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.token.domain.C1907d;
import com.lingq.feature.library.p013ui.components.ReportScope;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class um3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64067a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f64068b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f64069c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f64070d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f64071e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f64072f;

    public /* synthetic */ um3(C1907d c1907d, String str, String str2, TokenType tokenType, String str3, int i) {
        this.f64067a = 0;
        this.f64068b = c1907d;
        this.f64069c = str;
        this.f64070d = str2;
        this.f64072f = tokenType;
        this.f64071e = str3;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f64067a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f64072f;
        Object obj2 = this.f64071e;
        Object obj3 = this.f64070d;
        Object obj4 = this.f64069c;
        Object obj5 = this.f64068b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                C1306v c1306v = (C1306v) ((C1907d) obj5).f23861a;
                c1306v.getClass();
                str.getClass();
                str2.getClass();
                ((TokenType) obj).getClass();
                str3.getClass();
                v3a v3aVar = c1306v.f16559a;
                String str4 = vz1.m23629f(str, vz1.m23609O(str2, str)) + "_" + str3;
                v3aVar.getClass();
                return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(v3aVar.f64796a, true, new String[]{"TokenRelatedPhrasesEntity"}, new q3a(str4, v3aVar, 1)));
            case 1:
                zi3 zi3Var = (zi3) obj4;
                Context context = (Context) obj3;
                ui3 ui3Var = (ui3) obj2;
                t66 t66Var = (t66) obj;
                ReportScope reportScope = (ReportScope) ((t66) obj5).getValue();
                if (reportScope != null) {
                    zi3Var.invoke(reportScope.getApiValue(), (String) t66Var.getValue());
                    Toast.makeText(context, R$string.report_successfully_flagged, 0).show();
                    ui3Var.mo0a();
                }
                return xfaVar;
            default:
                ((bj3) obj5).mo825e((String) ((t66) obj4).getValue(), (String) ((t66) obj3).getValue(), (String) ((t66) obj2).getValue(), (String) ((t66) obj).getValue());
                return xfaVar;
        }
    }

    public /* synthetic */ um3(Object obj, Object obj2, Object obj3, Object obj4, t66 t66Var, int i) {
        this.f64067a = i;
        this.f64068b = obj;
        this.f64069c = obj2;
        this.f64070d = obj3;
        this.f64071e = obj4;
        this.f64072f = t66Var;
    }
}
