package p000;

import com.lingq.core.domain.model.chat.ChatToolTier;

/* JADX INFO: loaded from: classes2.dex */
public final class uw0 extends yw0 {

    /* JADX INFO: renamed from: a */
    public final ChatToolTier f64456a;

    public uw0(ChatToolTier chatToolTier) {
        this.f64456a = chatToolTier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uw0) && this.f64456a == ((uw0) obj).f64456a;
    }

    public final int hashCode() {
        ChatToolTier chatToolTier = this.f64456a;
        if (chatToolTier == null) {
            return 0;
        }
        return chatToolTier.hashCode();
    }

    public final String toString() {
        return "Gated(requiredTier=" + this.f64456a + ")";
    }
}
