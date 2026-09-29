package p422uo;

import dm.C5207g;
import so.C9085c;
import so.C9101s;
import so.C9106x;

/* JADX INFO: renamed from: uo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C9600d {

    /* JADX INFO: renamed from: a */
    public final C9101s f49271a;

    /* JADX INFO: renamed from: b */
    public final C9106x f49272b;

    /* JADX INFO: renamed from: uo.d$a */
    public static final class a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static boolean m18070a(C9101s c9101s, C9106x c9106x) {
            C5207g.m11111f(c9106x, "response");
            C5207g.m11111f(c9101s, "request");
            int i10 = c9106x.f47566d;
            if (i10 != 200 && i10 != 410 && i10 != 414 && i10 != 501 && i10 != 203 && i10 != 204) {
                if (i10 != 307) {
                    if (i10 != 308 && i10 != 404 && i10 != 405) {
                        switch (i10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C9106x.m17348b(c9106x, "Expires") == null && c9106x.m17349a().f47388c == -1 && !c9106x.m17349a().f47391f && !c9106x.m17349a().f47390e) {
                    return false;
                }
            }
            if (c9106x.m17349a().f47387b) {
                return false;
            }
            C9085c c9085cM17286b = c9101s.f47547f;
            if (c9085cM17286b == null) {
                int i11 = C9085c.f47385n;
                c9085cM17286b = C9085c.b.m17286b(c9101s.f47544c);
                c9101s.f47547f = c9085cM17286b;
            }
            return !c9085cM17286b.f47387b;
        }
    }

    public C9600d(C9101s c9101s, C9106x c9106x) {
        this.f49271a = c9101s;
        this.f49272b = c9106x;
    }
}
