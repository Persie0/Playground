package androidx.compose.p002ui.semantics;

import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.ui.semantics.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0427g {

    /* JADX INFO: renamed from: a */
    public final String f5023a;

    /* JADX INFO: renamed from: b */
    public final zi3 f5024b;

    /* JADX INFO: renamed from: c */
    public final boolean f5025c;

    public C0427g(String str, zi3 zi3Var) {
        this.f5023a = str;
        this.f5024b = zi3Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f5023a;
    }

    public /* synthetic */ C0427g(String str) {
        this(str, SemanticsPropertyKey$1.f4940b);
    }

    public C0427g(String str, int i) {
        this(str);
        this.f5025c = true;
    }

    public C0427g(String str, boolean z, zi3 zi3Var) {
        this(str, zi3Var);
        this.f5025c = z;
    }
}
