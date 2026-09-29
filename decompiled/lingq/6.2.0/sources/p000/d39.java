package p000;

import com.lingq.core.settings.ViewKeys;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d39 {

    /* JADX INFO: renamed from: a */
    public final List f34959a;

    /* JADX INFO: renamed from: b */
    public final boolean f34960b;

    /* JADX INFO: renamed from: c */
    public final boolean f34961c;

    /* JADX INFO: renamed from: d */
    public final boolean f34962d;

    /* JADX INFO: renamed from: e */
    public final boolean f34963e;

    /* JADX INFO: renamed from: f */
    public final ViewKeys f34964f;

    /* JADX INFO: renamed from: g */
    public final String f34965g;

    /* JADX INFO: renamed from: h */
    public final String f34966h;

    /* JADX INFO: renamed from: i */
    public final Set f34967i;

    /* JADX INFO: renamed from: j */
    public final List f34968j;

    /* JADX INFO: renamed from: k */
    public final qz1 f34969k;

    public d39(List list, boolean z, boolean z2, boolean z3, boolean z4, ViewKeys viewKeys, String str, String str2, Set set, List list2, qz1 qz1Var) {
        list.getClass();
        str.getClass();
        set.getClass();
        list2.getClass();
        this.f34959a = list;
        this.f34960b = z;
        this.f34961c = z2;
        this.f34962d = z3;
        this.f34963e = z4;
        this.f34964f = viewKeys;
        this.f34965g = str;
        this.f34966h = str2;
        this.f34967i = set;
        this.f34968j = list2;
        this.f34969k = qz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d39)) {
            return false;
        }
        d39 d39Var = (d39) obj;
        return fa4.m11650l(this.f34959a, d39Var.f34959a) && this.f34960b == d39Var.f34960b && this.f34961c == d39Var.f34961c && this.f34962d == d39Var.f34962d && this.f34963e == d39Var.f34963e && this.f34964f == d39Var.f34964f && fa4.m11650l(this.f34965g, d39Var.f34965g) && this.f34966h.equals(d39Var.f34966h) && fa4.m11650l(this.f34967i, d39Var.f34967i) && fa4.m11650l(this.f34968j, d39Var.f34968j) && this.f34969k.equals(d39Var.f34969k);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(this.f34959a.hashCode() * 31, 31, this.f34960b), 31, this.f34961c), 31, this.f34962d), 31, this.f34963e);
        ViewKeys viewKeys = this.f34964f;
        return this.f34969k.hashCode() + ux5.m22979b((this.f34967i.hashCode() + ux5.m22980c(ux5.m22980c((iM12428e + (viewKeys == null ? 0 : viewKeys.hashCode())) * 31, this.f34965g, 31), this.f34966h, 31)) * 31, 31, this.f34968j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsUiState(settings=");
        sb.append(this.f34959a);
        sb.append(", showLogoutDialog=");
        sb.append(this.f34960b);
        sb.append(", showBlacklistDialog=");
        wq1.m24101A(sb, this.f34961c, ", showDeleteLanguageDialog=", this.f34962d, ", showDeleteAccountDialog=");
        sb.append(this.f34963e);
        sb.append(", activeSelectionKey=");
        sb.append(this.f34964f);
        sb.append(", selectionCurrentValue=");
        AbstractC3393o1.m17725C(sb, this.f34965g, ", activeLanguage=", this.f34966h, ", currentTopics=");
        sb.append(this.f34967i);
        sb.append(", selectionItems=");
        sb.append(this.f34968j);
        sb.append(", dailyStreakTargetSheetState=");
        sb.append(this.f34969k);
        sb.append(")");
        return sb.toString();
    }
}
