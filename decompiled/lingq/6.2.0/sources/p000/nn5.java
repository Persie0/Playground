package p000;

import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;

/* JADX INFO: loaded from: classes2.dex */
public final class nn5 {

    /* JADX INFO: renamed from: a */
    public final LynxChatModel f52997a;

    /* JADX INFO: renamed from: b */
    public final LynxReasoningEffort f52998b;

    public nn5(LynxChatModel lynxChatModel, LynxReasoningEffort lynxReasoningEffort) {
        this.f52997a = lynxChatModel;
        this.f52998b = lynxReasoningEffort;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn5)) {
            return false;
        }
        nn5 nn5Var = (nn5) obj;
        return this.f52997a == nn5Var.f52997a && this.f52998b == nn5Var.f52998b;
    }

    public final int hashCode() {
        LynxChatModel lynxChatModel = this.f52997a;
        int iHashCode = (lynxChatModel == null ? 0 : lynxChatModel.hashCode()) * 31;
        LynxReasoningEffort lynxReasoningEffort = this.f52998b;
        return iHashCode + (lynxReasoningEffort != null ? lynxReasoningEffort.hashCode() : 0);
    }

    public final String toString() {
        return "LynxModelConfig(model=" + this.f52997a + ", reasoningEffort=" + this.f52998b + ")";
    }
}
