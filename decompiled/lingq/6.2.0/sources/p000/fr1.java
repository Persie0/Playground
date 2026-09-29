package p000;

import com.lingq.core.domain.model.chat.ChatToolTier;

/* JADX INFO: loaded from: classes2.dex */
public final class fr1 extends jr1 {

    /* JADX INFO: renamed from: a */
    public final ChatToolTier f39515a;

    public fr1(ChatToolTier chatToolTier) {
        this.f39515a = chatToolTier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fr1) && this.f39515a == ((fr1) obj).f39515a;
    }

    public final int hashCode() {
        ChatToolTier chatToolTier = this.f39515a;
        if (chatToolTier == null) {
            return 0;
        }
        return chatToolTier.hashCode();
    }

    public final String toString() {
        return "Gated(requiredTier=" + this.f39515a + ")";
    }
}
