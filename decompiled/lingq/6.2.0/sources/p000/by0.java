package p000;

import com.lingq.core.domain.model.chat.ChatMessage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class by0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jv0 f9154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ChatMessage f9155c;

    public /* synthetic */ by0(jv0 jv0Var, int i, ChatMessage chatMessage, int i2) {
        this.f9153a = i2;
        this.f9154b = jv0Var;
        this.f9155c = chatMessage;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f9153a;
        xfa xfaVar = xfa.f68157a;
        ChatMessage chatMessage = this.f9155c;
        jv0 jv0Var = this.f9154b;
        switch (i) {
            case 0:
                jv0Var.mo8880g(chatMessage);
                break;
            default:
                jv0Var.mo8899z(chatMessage);
                break;
        }
        return xfaVar;
    }
}
