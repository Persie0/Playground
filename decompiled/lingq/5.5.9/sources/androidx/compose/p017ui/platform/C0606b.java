package androidx.compose.p017ui.platform;

import dm.C5207g;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0606b extends AbstractC0601a {

    /* JADX INFO: renamed from: d */
    public static C0606b f4283d;

    /* JADX INFO: renamed from: c */
    public BreakIterator f4284c;

    public C0606b(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        C5207g.m11110e(characterInstance, "getCharacterInstance(locale)");
        this.f4284c = characterInstance;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: a */
    public final int[] mo2335a(int i10) {
        int length = m2327d().length();
        if (length > 0 && i10 < length) {
            if (i10 < 0) {
                i10 = 0;
            }
            do {
                BreakIterator breakIterator = this.f4284c;
                if (breakIterator == null) {
                    C5207g.m11117l("impl");
                    throw null;
                }
                if (breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f4284c;
                    if (breakIterator2 == null) {
                        C5207g.m11117l("impl");
                        throw null;
                    }
                    int iFollowing = breakIterator2.following(i10);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return m2326c(i10, iFollowing);
                }
                BreakIterator breakIterator3 = this.f4284c;
                if (breakIterator3 == null) {
                    C5207g.m11117l("impl");
                    throw null;
                }
                i10 = breakIterator3.following(i10);
            } while (i10 != -1);
            return null;
        }
        return null;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0621f
    /* JADX INFO: renamed from: b */
    public final int[] mo2336b(int i10) {
        int length = m2327d().length();
        if (length > 0 && i10 > 0) {
            if (i10 > length) {
                i10 = length;
            }
            do {
                BreakIterator breakIterator = this.f4284c;
                if (breakIterator == null) {
                    C5207g.m11117l("impl");
                    throw null;
                }
                if (breakIterator.isBoundary(i10)) {
                    BreakIterator breakIterator2 = this.f4284c;
                    if (breakIterator2 == null) {
                        C5207g.m11117l("impl");
                        throw null;
                    }
                    int iPreceding = breakIterator2.preceding(i10);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return m2326c(iPreceding, i10);
                }
                BreakIterator breakIterator3 = this.f4284c;
                if (breakIterator3 == null) {
                    C5207g.m11117l("impl");
                    throw null;
                }
                i10 = breakIterator3.preceding(i10);
            } while (i10 != -1);
            return null;
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m2337e(String str) {
        C5207g.m11111f(str, "text");
        this.f4275a = str;
        BreakIterator breakIterator = this.f4284c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            C5207g.m11117l("impl");
            throw null;
        }
    }
}
