package p000;

import com.lingq.core.database.dao.C1315c;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.database.entity.ChatSentenceEntity;
import com.lingq.core.domain.model.chat.ChatMessage$$serializer;
import com.lingq.core.domain.model.chat.ChatPhrase;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tv0 extends r46 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C1315c f62938A;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f62939z;

    public /* synthetic */ tv0(C1315c c1315c, int i) {
        this.f62939z = i;
        this.f62938A = c1315c;
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: l */
    public final void mo17164l(ik8 ik8Var, Object obj) {
        int i = this.f62939z;
        C1315c c1315c = this.f62938A;
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
                if (strM7572e != null) {
                    ik8Var.mo2874C(10, strM7572e);
                } else {
                    ik8Var.mo2880m(10);
                }
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
                break;
        }
    }

    @Override // p000.r46
    /* JADX INFO: renamed from: s */
    public final String mo17165s() {
        switch (this.f62939z) {
            case 0:
                return "INSERT INTO `ChatSentenceEntity` (`chatId`,`messageIndex`,`index`,`tokens`,`text`,`normalizedText`,`timestamp`,`startParagraph`,`url`,`opentag`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT INTO `ChatMessagePhrasesEntity` (`chatId`,`messageIndex`,`phrases`) VALUES (?,?,?)";
            default:
                return "INSERT INTO `ChatHistoryEntity` (`id`,`title`,`image`,`coins`,`targetLanguage`,`dictionaryLanguage`,`startedAt`,`updatedAt`,`history`) VALUES (?,?,?,?,?,?,?,?,?)";
        }
    }
}
