package p000;

import com.lingq.core.domain.model.lesson.Lesson;

/* JADX INFO: loaded from: classes3.dex */
public final class hx7 {

    /* JADX INFO: renamed from: a */
    public final String f43112a;

    /* JADX INFO: renamed from: b */
    public final v15 f43113b;

    /* JADX INFO: renamed from: c */
    public final Lesson f43114c;

    /* JADX INFO: renamed from: d */
    public final boolean f43115d;

    /* JADX INFO: renamed from: e */
    public final a89 f43116e;

    /* JADX INFO: renamed from: f */
    public final boolean f43117f;

    /* JADX INFO: renamed from: g */
    public final boolean f43118g;

    /* JADX INFO: renamed from: h */
    public final boolean f43119h;

    public /* synthetic */ hx7(String str, v15 v15Var, Lesson lesson, boolean z, boolean z2, boolean z3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new v15(0, false, false) : v15Var, (i & 4) != 0 ? null : lesson, (i & 8) != 0 ? false : z, q79.f57353a, false, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx7)) {
            return false;
        }
        hx7 hx7Var = (hx7) obj;
        return fa4.m11650l(this.f43112a, hx7Var.f43112a) && fa4.m11650l(this.f43113b, hx7Var.f43113b) && fa4.m11650l(this.f43114c, hx7Var.f43114c) && this.f43115d == hx7Var.f43115d && fa4.m11650l(this.f43116e, hx7Var.f43116e) && this.f43117f == hx7Var.f43117f && this.f43118g == hx7Var.f43118g && this.f43119h == hx7Var.f43119h;
    }

    public final int hashCode() {
        String str = this.f43112a;
        int iHashCode = (this.f43113b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        Lesson lesson = this.f43114c;
        return Boolean.hashCode(this.f43119h) + g9a.m12428e(g9a.m12428e((this.f43116e.hashCode() + g9a.m12428e((iHashCode + (lesson != null ? lesson.hashCode() : 0)) * 31, 31, this.f43115d)) * 31, 31, this.f43117f), 31, this.f43118g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReaderMenuState(grammarGuideUrl=");
        sb.append(this.f43112a);
        sb.append(", lessonEditState=");
        sb.append(this.f43113b);
        sb.append(", lesson=");
        sb.append(this.f43114c);
        sb.append(", isRtl=");
        sb.append(this.f43115d);
        sb.append(", simplifyAction=");
        sb.append(this.f43116e);
        sb.append(", canSimplify=");
        sb.append(this.f43117f);
        sb.append(", canSubscribeToCourse=");
        return e65.m10875g(sb, this.f43118g, ", isSubscribedToCourse=", this.f43119h, ")");
    }

    public hx7(String str, v15 v15Var, Lesson lesson, boolean z, a89 a89Var, boolean z2, boolean z3, boolean z4) {
        v15Var.getClass();
        a89Var.getClass();
        this.f43112a = str;
        this.f43113b = v15Var;
        this.f43114c = lesson;
        this.f43115d = z;
        this.f43116e = a89Var;
        this.f43117f = z2;
        this.f43118g = z3;
        this.f43119h = z4;
    }
}
