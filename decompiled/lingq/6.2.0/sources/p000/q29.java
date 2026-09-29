package p000;

import com.lingq.core.domain.model.theme.LqTheme;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q29 {

    /* JADX INFO: renamed from: a */
    public final LqTheme f57167a;

    /* JADX INFO: renamed from: b */
    public final String f57168b;

    /* JADX INFO: renamed from: c */
    public final boolean f57169c;

    /* JADX INFO: renamed from: d */
    public final Map f57170d;

    /* JADX INFO: renamed from: e */
    public final boolean f57171e;

    public q29(LqTheme lqTheme, String str, boolean z, Map map, boolean z2) {
        lqTheme.getClass();
        str.getClass();
        map.getClass();
        this.f57167a = lqTheme;
        this.f57168b = str;
        this.f57169c = z;
        this.f57170d = map;
        this.f57171e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q29)) {
            return false;
        }
        q29 q29Var = (q29) obj;
        return this.f57167a == q29Var.f57167a && fa4.m11650l(this.f57168b, q29Var.f57168b) && this.f57169c == q29Var.f57169c && fa4.m11650l(this.f57170d, q29Var.f57170d) && this.f57171e == q29Var.f57171e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f57171e) + e65.m10869a(g9a.m12428e(ux5.m22980c(this.f57167a.hashCode() * 31, this.f57168b, 31), 31, this.f57169c), 31, this.f57170d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsPreferences(theme=");
        sb.append(this.f57167a);
        sb.append(", interfaceLanguage=");
        sb.append(this.f57168b);
        sb.append(", downloadOnMobile=");
        sb.append(this.f57169c);
        sb.append(", languageFeedLevels=");
        sb.append(this.f57170d);
        sb.append(", showTimezoneAlert=");
        return AbstractC3393o1.m17740o(sb, this.f57171e, ")");
    }
}
