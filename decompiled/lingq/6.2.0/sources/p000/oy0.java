package p000;

import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageStatValue;
import com.lingq.feature.chat.AbstractC2008l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oy0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55161a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f55162b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f55163c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f55164d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f55165e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ e16 f55166f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f55167g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f55168h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f55169i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f55170j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f55171k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f55172l;

    public /* synthetic */ oy0(e16 e16Var, nz9 nz9Var, int i, jw0 jw0Var, String str, String str2, boolean z, boolean z2, jv0 jv0Var, int i2, int i3) {
        this.f55166f = e16Var;
        this.f55169i = nz9Var;
        this.f55165e = i;
        this.f55170j = jw0Var;
        this.f55162b = str;
        this.f55171k = str2;
        this.f55163c = z;
        this.f55164d = z2;
        this.f55172l = jv0Var;
        this.f55167g = i2;
        this.f55168h = i3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f55161a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f55167g;
        Object obj3 = this.f55172l;
        Object obj4 = this.f55171k;
        Object obj5 = this.f55170j;
        Object obj6 = this.f55169i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC2008l.m8910a(this.f55166f, (nz9) obj6, this.f55165e, (jw0) obj5, this.f55162b, (String) obj4, this.f55163c, this.f55164d, (jv0) obj3, (ye1) obj, iM19383z, this.f55168h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                cid.m4756g((LanguageProgressMetric) obj6, this.f55162b, (LanguageProgressPeriod) obj5, (LanguageStatValue) obj4, this.f55163c, this.f55164d, this.f55165e, this.f55166f, (zi3) obj3, (ye1) obj, iM19383z2, this.f55168h);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ oy0(LanguageProgressMetric languageProgressMetric, String str, LanguageProgressPeriod languageProgressPeriod, LanguageStatValue languageStatValue, boolean z, boolean z2, int i, e16 e16Var, zi3 zi3Var, int i2, int i3) {
        this.f55169i = languageProgressMetric;
        this.f55162b = str;
        this.f55170j = languageProgressPeriod;
        this.f55171k = languageStatValue;
        this.f55163c = z;
        this.f55164d = z2;
        this.f55165e = i;
        this.f55166f = e16Var;
        this.f55172l = zi3Var;
        this.f55167g = i2;
        this.f55168h = i3;
    }
}
