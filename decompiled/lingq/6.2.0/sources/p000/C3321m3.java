package p000;

import java.text.BreakIterator;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3321m3 extends AbstractC3284l3 {

    /* JADX INFO: renamed from: e */
    public static C3321m3 f50478e;

    /* JADX INFO: renamed from: f */
    public static C3321m3 f50479f;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f50480c;

    /* JADX INFO: renamed from: d */
    public BreakIterator f50481d;

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: e */
    public final int[] mo15760e(int i) {
        switch (this.f50480c) {
            case 0:
                int length = m15763h().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.f50481d;
                    if (breakIterator == null) {
                        fa4.m11636J("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f50481d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            fa4.m11636J("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m15762g(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        fa4.m11636J("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (m15763h().length() <= 0 || i >= m15763h().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m16605n(i) && (!m16605n(i) || (i != 0 && m16605n(i - 1)))) {
                    BreakIterator breakIterator3 = this.f50481d;
                    if (breakIterator3 == null) {
                        fa4.m11636J("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f50481d;
                if (breakIterator4 == null) {
                    fa4.m11636J("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m16604m(iFollowing2)) {
                    return null;
                }
                return m15762g(i, iFollowing2);
        }
    }

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: i */
    public final void mo15764i(String str) {
        switch (this.f50480c) {
            case 0:
                this.f48950a = str;
                BreakIterator breakIterator = this.f50481d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    fa4.m11636J("impl");
                    throw null;
                }
            default:
                this.f48950a = str;
                BreakIterator breakIterator2 = this.f50481d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    fa4.m11636J("impl");
                    throw null;
                }
        }
    }

    @Override // p000.AbstractC3284l3
    /* JADX INFO: renamed from: k */
    public final int[] mo15766k(int i) {
        switch (this.f50480c) {
            case 0:
                int length = m15763h().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.f50481d;
                    if (breakIterator == null) {
                        fa4.m11636J("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.f50481d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            fa4.m11636J("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m15762g(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        fa4.m11636J("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = m15763h().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m16605n(i - 1) && !m16604m(i)) {
                    BreakIterator breakIterator3 = this.f50481d;
                    if (breakIterator3 == null) {
                        fa4.m11636J("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.f50481d;
                if (breakIterator4 == null) {
                    fa4.m11636J("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m16605n(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m16605n(iPreceding2 - 1)) {
                    return m15762g(iPreceding2, i);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m16604m(int i) {
        if (i <= 0 || !m16605n(i - 1)) {
            return false;
        }
        return i == m15763h().length() || !m16605n(i);
    }

    /* JADX INFO: renamed from: n */
    public boolean m16605n(int i) {
        if (i < 0 || i >= m15763h().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m15763h().codePointAt(i));
    }
}
