package p000;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: loaded from: classes.dex */
public class s8a {

    /* JADX INFO: renamed from: a */
    public final int f60519a;

    /* JADX INFO: renamed from: b */
    public final int f60520b;

    /* JADX INFO: renamed from: c */
    public final int f60521c;

    /* JADX INFO: renamed from: d */
    public final int f60522d;

    /* JADX INFO: renamed from: e */
    public final int f60523e;

    /* JADX INFO: renamed from: f */
    public final int f60524f;

    /* JADX INFO: renamed from: g */
    public final boolean f60525g;

    /* JADX INFO: renamed from: h */
    public final boolean f60526h;

    /* JADX INFO: renamed from: i */
    public final ImmutableList f60527i;

    /* JADX INFO: renamed from: j */
    public final ImmutableList f60528j;

    /* JADX INFO: renamed from: k */
    public final ImmutableList f60529k;

    /* JADX INFO: renamed from: l */
    public final ImmutableList f60530l;

    /* JADX INFO: renamed from: m */
    public final ImmutableList f60531m;

    /* JADX INFO: renamed from: n */
    public final int f60532n;

    /* JADX INFO: renamed from: o */
    public final int f60533o;

    /* JADX INFO: renamed from: p */
    public final ImmutableList f60534p;

    /* JADX INFO: renamed from: q */
    public final q8a f60535q;

    /* JADX INFO: renamed from: r */
    public final ImmutableList f60536r;

    /* JADX INFO: renamed from: s */
    public final ImmutableList f60537s;

    /* JADX INFO: renamed from: t */
    public final boolean f60538t;

    /* JADX INFO: renamed from: u */
    public final ImmutableMap f60539u;

    /* JADX INFO: renamed from: v */
    public final ImmutableSet f60540v;

    static {
        new s8a(new r8a());
        uma.m22828w(1);
        uma.m22828w(2);
        uma.m22828w(3);
        uma.m22828w(4);
        AbstractC3393o1.m17746u(5, 6, 7, 8, 9);
        AbstractC3393o1.m17746u(10, 11, 12, 13, 14);
        AbstractC3393o1.m17746u(15, 16, 17, 18, 19);
        AbstractC3393o1.m17746u(20, 21, 22, 23, 24);
        AbstractC3393o1.m17746u(25, 26, 27, 28, 29);
        AbstractC3393o1.m17746u(30, 31, 32, 33, 34);
        uma.m22828w(35);
        uma.m22828w(36);
        uma.m22828w(37);
        uma.m22828w(38);
    }

    public s8a(r8a r8aVar) {
        this.f60519a = r8aVar.f58900a;
        this.f60520b = r8aVar.f58901b;
        this.f60521c = r8aVar.f58902c;
        this.f60522d = r8aVar.f58903d;
        this.f60523e = r8aVar.f58904e;
        this.f60524f = r8aVar.f58905f;
        this.f60525g = r8aVar.f58906g;
        this.f60526h = r8aVar.f58907h;
        this.f60527i = r8aVar.f58908i;
        this.f60528j = r8aVar.f58909j;
        this.f60529k = r8aVar.f58910k;
        this.f60530l = r8aVar.f58911l;
        this.f60532n = r8aVar.f58913n;
        this.f60531m = r8aVar.f58912m;
        this.f60533o = r8aVar.f58914o;
        this.f60534p = r8aVar.f58915p;
        this.f60535q = r8aVar.f58916q;
        this.f60536r = r8aVar.f58917r;
        this.f60538t = r8aVar.f58918s;
        this.f60537s = r8aVar.f58919t;
        this.f60539u = ImmutableMap.m6297c(r8aVar.f58920u);
        this.f60540v = ImmutableSet.m6308n(r8aVar.f58921v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        s8a s8aVar = (s8a) obj;
        if (this.f60519a != s8aVar.f60519a || this.f60520b != s8aVar.f60520b || this.f60521c != s8aVar.f60521c || this.f60522d != s8aVar.f60522d || this.f60526h != s8aVar.f60526h || this.f60523e != s8aVar.f60523e || this.f60524f != s8aVar.f60524f || this.f60525g != s8aVar.f60525g || !this.f60527i.equals(s8aVar.f60527i) || !this.f60528j.equals(s8aVar.f60528j) || !this.f60529k.equals(s8aVar.f60529k) || !this.f60530l.equals(s8aVar.f60530l) || this.f60532n != s8aVar.f60532n || !this.f60531m.equals(s8aVar.f60531m) || this.f60533o != s8aVar.f60533o || !this.f60534p.equals(s8aVar.f60534p) || !this.f60535q.equals(s8aVar.f60535q) || !this.f60537s.equals(s8aVar.f60537s) || !this.f60536r.equals(s8aVar.f60536r) || this.f60538t != s8aVar.f60538t) {
            return false;
        }
        ImmutableMap immutableMap = s8aVar.f60539u;
        ImmutableMap immutableMap2 = this.f60539u;
        immutableMap2.getClass();
        return xnb.m24620a(immutableMap, immutableMap2) && this.f60540v.equals(s8aVar.f60540v);
    }

    public int hashCode() {
        int iHashCode = (this.f60534p.hashCode() + ((((this.f60531m.hashCode() + ((((this.f60530l.hashCode() + ((this.f60529k.hashCode() + ((this.f60528j.hashCode() + ((this.f60527i.hashCode() + ((((((((((((((((this.f60519a + 31) * 31) + this.f60520b) * 31) + this.f60521c) * 31) + this.f60522d) * 28629151) + (this.f60526h ? 1 : 0)) * 31) + this.f60523e) * 31) + this.f60524f) * 31) + (this.f60525g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.f60532n) * 31)) * 31) + this.f60533o) * 31)) * 31;
        this.f60535q.getClass();
        return this.f60540v.hashCode() + ((this.f60539u.hashCode() + ((this.f60537s.hashCode() + ((((this.f60536r.hashCode() + ((iHashCode + 29791) * 961)) * 961) + (this.f60538t ? 1 : 0)) * 31)) * 887503681)) * 31);
    }
}
