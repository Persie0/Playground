package p000;

import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.EmbeddedMessageButton;

/* JADX INFO: loaded from: classes3.dex */
public final class xa5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b85 f67994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ EmbeddedMessage f67995c;

    public /* synthetic */ xa5(b85 b85Var, EmbeddedMessage embeddedMessage, int i) {
        this.f67993a = i;
        this.f67994b = b85Var;
        this.f67995c = embeddedMessage;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f67993a;
        xfa xfaVar = xfa.f68157a;
        EmbeddedMessage embeddedMessage = this.f67995c;
        b85 b85Var = this.f67994b;
        switch (i) {
            case 0:
                EmbeddedMessageButton embeddedMessageButton = (EmbeddedMessageButton) obj;
                embeddedMessageButton.getClass();
                b85Var.mo3439S(embeddedMessage, embeddedMessageButton);
                break;
            case 1:
                EmbeddedMessageButton embeddedMessageButton2 = (EmbeddedMessageButton) obj;
                embeddedMessageButton2.getClass();
                b85Var.mo3439S(embeddedMessage, embeddedMessageButton2);
                break;
            case 2:
                EmbeddedMessageButton embeddedMessageButton3 = (EmbeddedMessageButton) obj;
                embeddedMessageButton3.getClass();
                b85Var.mo3439S(embeddedMessage, embeddedMessageButton3);
                break;
            default:
                EmbeddedMessageButton embeddedMessageButton4 = (EmbeddedMessageButton) obj;
                embeddedMessageButton4.getClass();
                b85Var.mo3439S(embeddedMessage, embeddedMessageButton4);
                break;
        }
        return xfaVar;
    }
}
