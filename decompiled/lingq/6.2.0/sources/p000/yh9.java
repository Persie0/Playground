package p000;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class yh9 implements zh9 {

    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod f69852a;

    /* JADX INFO: renamed from: b */
    public final bh9 f69853b;

    /* JADX INFO: renamed from: c */
    public final List f69854c;

    /* JADX INFO: renamed from: d */
    public final List f69855d;

    /* JADX INFO: renamed from: e */
    public final List f69856e;

    public yh9(LanguageProgressPeriod languageProgressPeriod, bh9 bh9Var, List list, List list2, List list3) {
        languageProgressPeriod.getClass();
        this.f69852a = languageProgressPeriod;
        this.f69853b = bh9Var;
        this.f69854c = list;
        this.f69855d = list2;
        this.f69856e = list3;
    }

    @Override // p000.zh9
    /* JADX INFO: renamed from: a */
    public final LanguageProgressPeriod mo24520a() {
        return this.f69852a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh9)) {
            return false;
        }
        yh9 yh9Var = (yh9) obj;
        return this.f69852a == yh9Var.f69852a && this.f69853b.equals(yh9Var.f69853b) && this.f69854c.equals(yh9Var.f69854c) && this.f69855d.equals(yh9Var.f69855d) && this.f69856e.equals(yh9Var.f69856e);
    }

    public final int hashCode() {
        return this.f69856e.hashCode() + ux5.m22979b(ux5.m22979b((this.f69853b.hashCode() + (this.f69852a.hashCode() * 31)) * 31, 31, this.f69854c), 31, this.f69855d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(period=");
        sb.append(this.f69852a);
        sb.append(", coinStat=");
        sb.append(this.f69853b);
        sb.append(", activityStats=");
        hn1.m13372v(sb, this.f69854c, ", lessonStats=", this.f69855d, ", translationStats=");
        return hn1.m13356f(sb, this.f69856e, ")");
    }
}
