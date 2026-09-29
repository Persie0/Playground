package p000;

import com.lingq.core.domain.model.chat.ChatToolTier;

/* JADX INFO: loaded from: classes2.dex */
public final class kz0 extends nz0 {

    /* JADX INFO: renamed from: a */
    public final ChatToolTier f48788a;

    public kz0(ChatToolTier chatToolTier) {
        this.f48788a = chatToolTier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kz0) && this.f48788a == ((kz0) obj).f48788a;
    }

    public final int hashCode() {
        ChatToolTier chatToolTier = this.f48788a;
        if (chatToolTier == null) {
            return 0;
        }
        return chatToolTier.hashCode();
    }

    public final String toString() {
        return "Gated(requiredTier=" + this.f48788a + ")";
    }
}
