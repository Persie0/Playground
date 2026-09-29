package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class a39 extends c39 {

    /* JADX INFO: renamed from: e */
    public final int f182e;

    public a39(int i) {
        super(ViewKeys.Flashcards, "", "", false);
        this.f182e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a39) && this.f182e == ((a39) obj).f182e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f182e);
    }

    public final String toString() {
        return ux5.m22989l("Title(idText=", this.f182e, ")");
    }
}
