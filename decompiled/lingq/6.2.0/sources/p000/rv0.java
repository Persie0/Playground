package p000;

import com.lingq.core.domain.model.chat.ChatMessageTranslation;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rv0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f59840b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f59841c;

    public /* synthetic */ rv0(int i, int i2, int i3) {
        this.f59839a = i3;
        this.f59840b = i;
        this.f59841c = i2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        ChatMessageTranslation chatMessageTranslation;
        int i = this.f59839a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f59841c;
        int i3 = this.f59840b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM ChatMessageTranslationEntity WHERE chatId = ? AND messageIndex = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i3);
                    ik8VarMo2873e0.mo2878j(2, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "chatId");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "messageIndex");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "translation");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        chatMessageTranslation = new ChatMessageTranslation((int) ik8VarMo2873e0.getLong(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v3), (int) ik8VarMo2873e0.getLong(iM14108v2));
                        break;
                    } else {
                        chatMessageTranslation = null;
                    }
                    return chatMessageTranslation;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("UPDATE DictionaryDataEntity set `order` = ? where id = ?");
                try {
                    ik8VarMo2873e1.mo2878j(1, i3);
                    ik8VarMo2873e1.mo2878j(2, i2);
                    ik8VarMo2873e1.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 2:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("UPDATE DictionaryDataEntity SET `order` = ? where id = ?");
                try {
                    ik8VarMo2873e2.mo2878j(1, i3);
                    ik8VarMo2873e2.mo2878j(2, i2);
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 3:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ik8 ik8VarMo2873e3 = bk8Var4.mo2873e0("DELETE FROM LessonsWithPlaylistJoin WHERE playlistId = ? AND contentId = ?");
                try {
                    ik8VarMo2873e3.mo2878j(1, i3);
                    ik8VarMo2873e3.mo2878j(2, i2);
                    ik8VarMo2873e3.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e3.close();
                }
            default:
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) obj;
                vocabularySearchQuery.getClass();
                vocabularySearchQuery.f19859a = i3;
                vocabularySearchQuery.f19860b = i2;
                return xfaVar;
        }
    }
}
