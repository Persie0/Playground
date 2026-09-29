package p000;

import com.lingq.core.database.dao.C1315c;
import com.lingq.core.domain.model.chat.ChatMessagePhrases;
import com.lingq.core.domain.model.chat.ChatPhrase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nv0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f53276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f53277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bq1 f53278d;

    public /* synthetic */ nv0(int i, int i2, bq1 bq1Var, int i3) {
        this.f53275a = i3;
        this.f53276b = i;
        this.f53277c = i2;
        this.f53278d = bq1Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        ChatMessagePhrases chatMessagePhrases;
        int i = this.f53275a;
        bq1 bq1Var = this.f53278d;
        int i2 = this.f53277c;
        int i3 = this.f53276b;
        switch (i) {
            case 0:
                C1315c c1315c = (C1315c) bq1Var;
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT * FROM ChatMessagePhrasesEntity WHERE chatId = ? AND messageIndex = ?");
                try {
                    ik8VarMo2873e0.mo2878j(1, i3);
                    ik8VarMo2873e0.mo2878j(2, i2);
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e0, "chatId");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e0, "messageIndex");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e0, "phrases");
                    if (ik8VarMo2873e0.mo2876a0()) {
                        int i4 = (int) ik8VarMo2873e0.getLong(iM14108v);
                        int i5 = (int) ik8VarMo2873e0.getLong(iM14108v2);
                        String strMo2875L = ik8VarMo2873e0.mo2875L(iM14108v3);
                        qn3 qn3Var = c1315c.f17003M;
                        qn3Var.getClass();
                        strMo2875L.getClass();
                        yf4 yf4Var = (yf4) qn3Var.f57974a;
                        yf4Var.getClass();
                        chatMessagePhrases = new ChatMessagePhrases(i4, i5, (List) yf4Var.m10321a(strMo2875L, new C2978ev(ChatPhrase.Companion.serializer())));
                        break;
                    } else {
                        chatMessagePhrases = null;
                    }
                    return chatMessagePhrases;
                } finally {
                    ik8VarMo2873e0.close();
                }
            default:
                rxa rxaVar = (rxa) bq1Var;
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT `term`, `termWithLanguage`, `id`, `status`, `extendedStatus`, `meanings`, `tags`, `gTags`, `isPhrase` FROM (SELECT * FROM CardEntity WHERE status BETWEEN ? AND ? LIMIT ?)");
                try {
                    ik8VarMo2873e1.mo2878j(1, i3);
                    ik8VarMo2873e1.mo2878j(2, i2);
                    int i6 = 3;
                    ik8VarMo2873e1.mo2878j(3, 18L);
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        String strMo2875L2 = ik8VarMo2873e1.mo2875L(0);
                        String strMo2875L3 = ik8VarMo2873e1.mo2875L(1);
                        int i7 = (int) ik8VarMo2873e1.getLong(2);
                        int i8 = (int) ik8VarMo2873e1.getLong(i6);
                        int i9 = (int) ik8VarMo2873e1.getLong(4);
                        String strMo2875L4 = ik8VarMo2873e1.mo2875L(5);
                        qn3 qn3Var2 = rxaVar.f60014L;
                        List listM20059N = qn3Var2.m20059N(strMo2875L4);
                        List listM20058M = qn3Var2.m20058M(ik8VarMo2873e1.isNull(6) ? null : ik8VarMo2873e1.mo2875L(6));
                        if (listM20058M == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        List listM20058M2 = qn3Var2.m20058M(ik8VarMo2873e1.isNull(7) ? null : ik8VarMo2873e1.mo2875L(7));
                        if (listM20058M2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.String>', but it was NULL.");
                        }
                        rxa rxaVar2 = rxaVar;
                        arrayList.add(new mxa(i7, strMo2875L2, i8, i9, ((int) ik8VarMo2873e1.getLong(8)) != 0, listM20059N, listM20058M, listM20058M2, strMo2875L3));
                        rxaVar = rxaVar2;
                        i6 = 3;
                    }
                    ik8VarMo2873e1.close();
                    return arrayList;
                } catch (Throwable th) {
                    ik8VarMo2873e1.close();
                    throw th;
                }
        }
    }
}
