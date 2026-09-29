package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class qi6 extends bh6 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f57820a;

    public qi6(ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f57820a = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qi6) && this.f57820a == ((qi6) obj).f57820a;
    }

    public final int hashCode() {
        return this.f57820a.hashCode();
    }

    public final String toString() {
        return "ReviewSettings(key=" + this.f57820a + ")";
    }
}
