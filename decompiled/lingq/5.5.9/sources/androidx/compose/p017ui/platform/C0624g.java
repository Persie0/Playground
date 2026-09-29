package androidx.compose.p017ui.platform;

import dm.C5207g;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.compose.ui.platform.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0624g extends AbstractC0601a {

    /* JADX INFO: renamed from: d */
    public static C0624g f4311d;

    /* JADX INFO: renamed from: c */
    public BreakIterator f4312c;

    public C0624g(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        C5207g.m11110e(wordInstance, "getWordInstance(locale)");
        this.f4312c = wordInstance;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: a */
    public final int[] mo2335a(int i10) {
        if (m2327d().length() > 0 && i10 < m2327d().length()) {
            if (i10 < 0) {
                i10 = 0;
            }
            while (!m2354g(i10)) {
                if (m2354g(i10) && (i10 == 0 || !m2354g(i10 + (-1)))) {
                    break;
                }
                BreakIterator breakIterator = this.f4312c;
                if (breakIterator == null) {
                    C5207g.m11117l("impl");
                    throw null;
                }
                i10 = breakIterator.following(i10);
                if (i10 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f4312c;
            if (breakIterator2 == null) {
                C5207g.m11117l("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i10);
            if (iFollowing != -1 && m2353f(iFollowing)) {
                return m2326c(i10, iFollowing);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: b */
    public final int[] mo2336b(int i10) {
        int length = m2327d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !m2354g(i10 - 1) && !m2353f(i10)) {
            BreakIterator breakIterator = this.f4312c;
            if (breakIterator == null) {
                C5207g.m11117l("impl");
                throw null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f4312c;
        if (breakIterator2 == null) {
            C5207g.m11117l("impl");
            throw null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding != -1) {
            if (m2354g(iPreceding) && (iPreceding == 0 || !m2354g(iPreceding + (-1)))) {
                return m2326c(iPreceding, i10);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m2352e(String str) {
        C5207g.m11111f(str, "text");
        this.f4275a = str;
        BreakIterator breakIterator = this.f4312c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            C5207g.m11117l("impl");
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2353f(int i10) {
        return i10 > 0 && m2354g(i10 + (-1)) && (i10 == m2327d().length() || !m2354g(i10));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2354g(int i10) {
        if (i10 < 0 || i10 >= m2327d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m2327d().codePointAt(i10));
    }
}
