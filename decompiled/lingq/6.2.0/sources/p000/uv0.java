package p000;

import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.database.entity.ChatSentenceEntity;
import com.lingq.core.domain.model.chat.ChatMessage$$serializer;
import com.lingq.core.domain.model.chat.ChatPhrase;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uv0 extends ss5 {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f64389p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C1315c f64390q;

    public /* synthetic */ uv0(C1315c c1315c, int i) {
        this.f64389p = i;
        this.f64390q = c1315c;
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: m */
    public final void mo16668m(ik8 ik8Var, Object obj) {
        int i = this.f64389p;
        C1315c c1315c = this.f64390q;
        switch (i) {
            case 0:
                ChatSentenceEntity chatSentenceEntity = (ChatSentenceEntity) obj;
                ik8Var.getClass();
                chatSentenceEntity.getClass();
                ik8Var.mo2878j(1, chatSentenceEntity.m7568a());
                ik8Var.mo2878j(2, chatSentenceEntity.m7570c());
                ik8Var.mo2878j(3, chatSentenceEntity.m7569b());
                qn3 qn3Var = c1315c.f17003M;
                ik8Var.mo2874C(4, qn3Var.m20066U(chatSentenceEntity.m7576i()));
                String strM7574g = chatSentenceEntity.m7574g();
                if (strM7574g == null) {
                    ik8Var.mo2880m(5);
                } else {
                    ik8Var.mo2874C(5, strM7574g);
                }
                String strM7571d = chatSentenceEntity.m7571d();
                if (strM7571d == null) {
                    ik8Var.mo2880m(6);
                } else {
                    ik8Var.mo2874C(6, strM7571d);
                }
                List listM7575h = chatSentenceEntity.m7575h();
                String strM20072p = listM7575h == null ? null : qn3Var.m20072p(listM7575h);
                if (strM20072p == null) {
                    ik8Var.mo2880m(7);
                } else {
                    ik8Var.mo2874C(7, strM20072p);
                }
                ik8Var.mo2878j(8, chatSentenceEntity.m7573f() ? 1L : 0L);
                String strM7577j = chatSentenceEntity.m7577j();
                if (strM7577j == null) {
                    ik8Var.mo2880m(9);
                } else {
                    ik8Var.mo2874C(9, strM7577j);
                }
                String strM7572e = chatSentenceEntity.m7572e();
                if (strM7572e == null) {
                    ik8Var.mo2880m(10);
                } else {
                    ik8Var.mo2874C(10, strM7572e);
                }
                ik8Var.mo2878j(11, chatSentenceEntity.m7568a());
                ik8Var.mo2878j(12, chatSentenceEntity.m7570c());
                ik8Var.mo2878j(13, chatSentenceEntity.m7569b());
                break;
            case 1:
                ow0 ow0Var = (ow0) obj;
                ik8Var.getClass();
                ow0Var.getClass();
                ik8Var.mo2878j(1, ow0Var.m18527a());
                ik8Var.mo2878j(2, ow0Var.m18528b());
                qn3 qn3Var2 = c1315c.f17003M;
                List listM18529c = ow0Var.m18529c();
                qn3Var2.getClass();
                yf4 yf4Var = (yf4) qn3Var2.f57974a;
                yf4Var.getClass();
                ik8Var.mo2874C(3, yf4Var.m10322b(new C2978ev(ChatPhrase.Companion.serializer()), listM18529c));
                ik8Var.mo2878j(4, ow0Var.m18527a());
                ik8Var.mo2878j(5, ow0Var.m18528b());
                break;
            default:
                ChatHistoryEntity chatHistoryEntity = (ChatHistoryEntity) obj;
                ik8Var.getClass();
                chatHistoryEntity.getClass();
                ik8Var.mo2878j(1, chatHistoryEntity.m7562e());
                ik8Var.mo2874C(2, chatHistoryEntity.m7566i());
                ik8Var.mo2874C(3, chatHistoryEntity.m7563f());
                ik8Var.mo2877g(4, chatHistoryEntity.m7559b());
                ik8Var.mo2874C(5, chatHistoryEntity.m7565h());
                ik8Var.mo2874C(6, chatHistoryEntity.m7560c());
                ik8Var.mo2874C(7, chatHistoryEntity.m7564g());
                ik8Var.mo2874C(8, chatHistoryEntity.m7567j());
                qn3 qn3Var3 = c1315c.f17003M;
                List listM7561d = chatHistoryEntity.m7561d();
                qn3Var3.getClass();
                listM7561d.getClass();
                yf4 yf4Var2 = (yf4) qn3Var3.f57974a;
                yf4Var2.getClass();
                ik8Var.mo2874C(9, yf4Var2.m10322b(new C2978ev(ChatMessage$$serializer.INSTANCE), listM7561d));
                ik8Var.mo2878j(10, chatHistoryEntity.m7562e());
                break;
        }
    }

    @Override // p000.ss5
    /* JADX INFO: renamed from: s */
    public final String mo16669s() {
        switch (this.f64389p) {
            case 0:
                return "UPDATE `ChatSentenceEntity` SET `chatId` = ?,`messageIndex` = ?,`index` = ?,`tokens` = ?,`text` = ?,`normalizedText` = ?,`timestamp` = ?,`startParagraph` = ?,`url` = ?,`opentag` = ? WHERE `chatId` = ? AND `messageIndex` = ? AND `index` = ?";
            case 1:
                return "UPDATE `ChatMessagePhrasesEntity` SET `chatId` = ?,`messageIndex` = ?,`phrases` = ? WHERE `chatId` = ? AND `messageIndex` = ?";
            default:
                return "UPDATE `ChatHistoryEntity` SET `id` = ?,`title` = ?,`image` = ?,`coins` = ?,`targetLanguage` = ?,`dictionaryLanguage` = ?,`startedAt` = ?,`updatedAt` = ?,`history` = ? WHERE `id` = ?";
        }
    }
}
