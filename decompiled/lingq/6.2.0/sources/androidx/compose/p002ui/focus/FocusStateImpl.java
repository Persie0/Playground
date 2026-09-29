package androidx.compose.p002ui.focus;

import kotlin.enums.AbstractC3201a;
import p000.fa3;
import p000.gm5;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum FocusStateImpl {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public boolean getHasFocus() {
        int i = fa3.f38702a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        gm5.m12750e();
        return false;
    }

    public boolean isCaptured() {
        int i = fa3.f38702a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3 || i == 4) {
            return false;
        }
        gm5.m12750e();
        return false;
    }

    public boolean isFocused() {
        int i = fa3.f38702a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4) {
            return false;
        }
        gm5.m12750e();
        return false;
    }
}
