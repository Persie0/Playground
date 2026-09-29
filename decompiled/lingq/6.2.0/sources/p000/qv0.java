package p000;

import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.domain.model.chat.ChatHistory;
import com.lingq.core.domain.model.chat.ChatSentence;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qv0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58237a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f58238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1315c f58239c;

    public /* synthetic */ qv0(int i, C1315c c1315c, int i2) {
        this.f58237a = i2;
        this.f58238b = i;
        this.f58239c = c1315c;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        ChatHistory chatHistory;
        ChatHistoryEntity chatHistoryEntity;
        int i = this.f58237a;
        C1315c c1315c = this.f58239c;
        int i2 = this.f58238b;
        switch (i) {
            case 0:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM ChatHistoryEntity WHERE id = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "id");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "title");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "image");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e0, "coins");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e0, "targetLanguage");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e0, "dictionaryLanguage");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e0, "startedAt");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e0, "updatedAt");
                    int iM14108v9 = AbstractC3122is.m14108v(ik8VarMo2873e0, "history");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        chatHistory = new ChatHistory((int) ik8VarMo2873e0.getLong(iM14108v), ik8VarMo2873e0.mo2875L(iM14108v2), ik8VarMo2873e0.mo2875L(iM14108v3), ik8VarMo2873e0.getDouble(iM14108v4), ik8VarMo2873e0.mo2875L(iM14108v5), ik8VarMo2873e0.mo2875L(iM14108v6), ik8VarMo2873e0.mo2875L(iM14108v7), ik8VarMo2873e0.mo2875L(iM14108v8), c1315c.f17003M.m20054I(ik8VarMo2873e0.mo2875L(iM14108v9)));
                    } else {
                        chatHistory = null;
                    }
                    return chatHistory;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 1:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM ChatHistoryEntity WHERE id = ?");
                try {
                    ik8VarMo2873e1.mo2878j(1, i2);
                    int iM14108v10 = AbstractC3122is.m14108v(ik8VarMo2873e1, "id");
                    int iM14108v11 = AbstractC3122is.m14108v(ik8VarMo2873e1, "title");
                    int iM14108v12 = AbstractC3122is.m14108v(ik8VarMo2873e1, "image");
                    int iM14108v13 = AbstractC3122is.m14108v(ik8VarMo2873e1, "coins");
                    int iM14108v14 = AbstractC3122is.m14108v(ik8VarMo2873e1, "targetLanguage");
                    int iM14108v15 = AbstractC3122is.m14108v(ik8VarMo2873e1, "dictionaryLanguage");
                    int iM14108v16 = AbstractC3122is.m14108v(ik8VarMo2873e1, "startedAt");
                    int iM14108v17 = AbstractC3122is.m14108v(ik8VarMo2873e1, "updatedAt");
                    int iM14108v18 = AbstractC3122is.m14108v(ik8VarMo2873e1, "history");
                    if (ik8VarMo2873e1.mo2876a0()) {
                        chatHistoryEntity = new ChatHistoryEntity((int) ik8VarMo2873e1.getLong(iM14108v10), ik8VarMo2873e1.mo2875L(iM14108v11), ik8VarMo2873e1.mo2875L(iM14108v12), ik8VarMo2873e1.getDouble(iM14108v13), ik8VarMo2873e1.mo2875L(iM14108v14), ik8VarMo2873e1.mo2875L(iM14108v15), ik8VarMo2873e1.mo2875L(iM14108v16), ik8VarMo2873e1.mo2875L(iM14108v17), c1315c.f17003M.m20054I(ik8VarMo2873e1.mo2875L(iM14108v18)));
                    } else {
                        chatHistoryEntity = null;
                    }
                    return chatHistoryEntity;
                } finally {
                    ik8VarMo2873e1.close();
                }
            default:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("SELECT `messageIndex`, `index`, `tokens`, `text`, `normalizedText`, `timestamp`, `startParagraph`, `url`, `opentag` FROM (SELECT * FROM ChatSentenceEntity WHERE chatId = ?)");
                try {
                    ik8VarMo2873e2.mo2878j(1, i2);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e2.mo2876a0()) {
                        int i3 = (int) ik8VarMo2873e2.getLong(0);
                        int i4 = (int) ik8VarMo2873e2.getLong(1);
                        List listM20063R = c1315c.f17003M.m20063R(ik8VarMo2873e2.mo2875L(2));
                        String strMo2875L = ik8VarMo2873e2.isNull(3) ? null : ik8VarMo2873e2.mo2875L(3);
                        String strMo2875L2 = ik8VarMo2873e2.isNull(4) ? null : ik8VarMo2873e2.mo2875L(4);
                        String strMo2875L3 = ik8VarMo2873e2.isNull(5) ? null : ik8VarMo2873e2.mo2875L(5);
                        arrayList.add(new ChatSentence(listM20063R, strMo2875L, strMo2875L2, i4, i3, strMo2875L3 == null ? null : c1315c.f17003M.m20055J(strMo2875L3), ((int) ik8VarMo2873e2.getLong(6)) != 0, ik8VarMo2873e2.isNull(7) ? null : ik8VarMo2873e2.mo2875L(7), ik8VarMo2873e2.isNull(8) ? null : ik8VarMo2873e2.mo2875L(8)));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e2.close();
                }
        }
    }
}
