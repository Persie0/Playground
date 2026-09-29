package p000;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class dr5 {

    /* JADX INFO: renamed from: a */
    public final Matcher f36077a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f36078b;

    /* JADX INFO: renamed from: c */
    public final cr5 f36079c;

    /* JADX INFO: renamed from: d */
    public br5 f36080d;

    public dr5(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.f36077a = matcher;
        this.f36078b = charSequence;
        this.f36079c = new cr5(this, 0);
    }

    /* JADX INFO: renamed from: a */
    public final List m10610a() {
        if (this.f36080d == null) {
            this.f36080d = new br5(this);
        }
        br5 br5Var = this.f36080d;
        br5Var.getClass();
        return br5Var;
    }

    /* JADX INFO: renamed from: b */
    public final i84 m10611b() {
        Matcher matcher = this.f36077a;
        return l70.m15922M(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: c */
    public final String m10612c() {
        String strGroup = this.f36077a.group();
        strGroup.getClass();
        return strGroup;
    }

    /* JADX INFO: renamed from: d */
    public final dr5 m10613d() {
        Matcher matcher = this.f36077a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f36078b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new dr5(matcher2, charSequence);
        }
        return null;
    }
}
