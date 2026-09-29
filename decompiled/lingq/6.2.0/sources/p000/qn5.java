package p000;

import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;

/* JADX INFO: loaded from: classes2.dex */
public final class qn5 {

    /* JADX INFO: renamed from: a */
    public final LynxChatModel f57987a;

    /* JADX INFO: renamed from: b */
    public final LynxReasoningEffort f57988b;

    public qn5(LynxChatModel lynxChatModel, LynxReasoningEffort lynxReasoningEffort) {
        this.f57987a = lynxChatModel;
        this.f57988b = lynxReasoningEffort;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn5)) {
            return false;
        }
        qn5 qn5Var = (qn5) obj;
        return this.f57987a == qn5Var.f57987a && this.f57988b == qn5Var.f57988b;
    }

    public final int hashCode() {
        LynxChatModel lynxChatModel = this.f57987a;
        int iHashCode = (lynxChatModel == null ? 0 : lynxChatModel.hashCode()) * 31;
        LynxReasoningEffort lynxReasoningEffort = this.f57988b;
        return iHashCode + (lynxReasoningEffort != null ? lynxReasoningEffort.hashCode() : 0);
    }

    public final String toString() {
        return "LynxModelSelectorState(selectedModel=" + this.f57987a + ", selectedEffort=" + this.f57988b + ")";
    }
}
