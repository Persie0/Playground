package p000;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.stats.ActivityScore;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jo4 implements ko4 {

    /* JADX INFO: renamed from: a */
    public final cn4 f45910a;

    /* JADX INFO: renamed from: b */
    public final LanguageProgressPeriod f45911b;

    /* JADX INFO: renamed from: c */
    public final String f45912c;

    /* JADX INFO: renamed from: d */
    public final double f45913d;

    /* JADX INFO: renamed from: e */
    public final double f45914e;

    /* JADX INFO: renamed from: f */
    public final boolean f45915f;

    /* JADX INFO: renamed from: g */
    public final List f45916g;

    /* JADX INFO: renamed from: h */
    public final ActivityScore f45917h;

    public jo4(cn4 cn4Var, LanguageProgressPeriod languageProgressPeriod, String str, double d, double d2, boolean z, List list, ActivityScore activityScore) {
        cn4Var.getClass();
        languageProgressPeriod.getClass();
        str.getClass();
        list.getClass();
        activityScore.getClass();
        this.f45910a = cn4Var;
        this.f45911b = languageProgressPeriod;
        this.f45912c = str;
        this.f45913d = d;
        this.f45914e = d2;
        this.f45915f = z;
        this.f45916g = list;
        this.f45917h = activityScore;
    }

    @Override // p000.ko4
    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod mo14049a() {
        return this.f45911b;
    }

    @Override // p000.ko4
    /* JADX INFO: renamed from: b */
    public final cn4 mo14050b() {
        return this.f45910a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo4)) {
            return false;
        }
        jo4 jo4Var = (jo4) obj;
        return fa4.m11650l(this.f45910a, jo4Var.f45910a) && this.f45911b == jo4Var.f45911b && fa4.m11650l(this.f45912c, jo4Var.f45912c) && Double.compare(this.f45913d, jo4Var.f45913d) == 0 && Double.compare(this.f45914e, jo4Var.f45914e) == 0 && this.f45915f == jo4Var.f45915f && fa4.m11650l(this.f45916g, jo4Var.f45916g) && this.f45917h == jo4Var.f45917h;
    }

    public final int hashCode() {
        return this.f45917h.hashCode() + ux5.m22979b(g9a.m12428e(g9a.m12424a(this.f45914e, g9a.m12424a(this.f45913d, ux5.m22980c((this.f45911b.hashCode() + (this.f45910a.hashCode() * 31)) * 31, this.f45912c, 31), 31), 31), 31, this.f45915f), 31, this.f45916g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(stat=");
        sb.append(this.f45910a);
        sb.append(", period=");
        sb.append(this.f45911b);
        sb.append(", language=");
        sb.append(this.f45912c);
        sb.append(", progress=");
        sb.append(this.f45913d);
        hn1.m13370t(sb, ", goal=", this.f45914e, ", canAdd=");
        sb.append(this.f45915f);
        sb.append(", chart=");
        sb.append(this.f45916g);
        sb.append(", score=");
        sb.append(this.f45917h);
        sb.append(")");
        return sb.toString();
    }
}
