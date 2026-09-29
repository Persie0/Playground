package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.ChatHistoryEntity;
import com.lingq.core.database.entity.ChatSentenceEntity;
import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.chat.ChatPhraseCard;
import com.lingq.core.network.api.result.ResultChatMessage;
import com.lingq.core.network.api.result.ResultChatOld;
import com.lingq.core.network.api.result.ResultChatPhrase;
import com.lingq.core.network.api.result.ResultChatPhraseCard;
import com.lingq.core.network.api.result.ResultChatSentence;
import com.lingq.core.network.api.result.ResultMeaning;
import com.lingq.core.network.api.result.ResultTextToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fqc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f39500a = new C0282a(-565286031, false, new fe1(23));

    /* JADX INFO: renamed from: b */
    public static final C0282a f39501b = new C0282a(1579645479, false, new fe1(24));

    /* JADX INFO: renamed from: a */
    public static final ChatHistoryEntity m12000a(ResultChatOld resultChatOld, String str, String str2) {
        resultChatOld.getClass();
        str.getClass();
        str2.getClass();
        int i = resultChatOld.f20738a;
        String str3 = resultChatOld.f20739b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = resultChatOld.f20740c;
        String str5 = str4 != null ? str4 : "";
        String str6 = resultChatOld.f20741d;
        return new ChatHistoryEntity(i, str3, str5, 0.0d, str, str2, str6, str6, EmptyList.f47638a);
    }

    /* JADX INFO: renamed from: b */
    public static final ChatSentenceEntity m12001b(ResultChatSentence resultChatSentence, int i, int i2, int i3, boolean z) {
        resultChatSentence.getClass();
        List list = resultChatSentence.f20752a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(huc.m13483a((ResultTextToken) it.next()));
        }
        String str = resultChatSentence.f20753b;
        String str2 = resultChatSentence.f20754c;
        List list2 = resultChatSentence.f20756e;
        return new ChatSentenceEntity(i, i2, i3, arrayList, str, str2, list2 != null ? u91.m22587E0(list2) : null, z, resultChatSentence.f20757f, resultChatSentence.f20758g);
    }

    /* JADX INFO: renamed from: c */
    public static final ChatMessage m12002c(ResultChatMessage resultChatMessage) {
        resultChatMessage.getClass();
        int i = resultChatMessage.f20724a;
        String str = resultChatMessage.f20725b;
        String str2 = resultChatMessage.f20726c;
        String str3 = resultChatMessage.f20727d;
        List list = resultChatMessage.f20728e;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m12003d((ResultChatPhrase) it.next()));
        }
        String str4 = resultChatMessage.f20729f;
        String str5 = str4 == null ? "" : str4;
        String str6 = resultChatMessage.f20730g;
        String str7 = str6 == null ? "" : str6;
        String str8 = resultChatMessage.f20731h;
        return new ChatMessage(i, 256, str, str2, str3, str5, str7, str8 == null ? "" : str8, arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static final ChatPhrase m12003d(ResultChatPhrase resultChatPhrase) {
        resultChatPhrase.getClass();
        String str = resultChatPhrase.f20743a;
        String str2 = resultChatPhrase.f20745c;
        String str3 = resultChatPhrase.f20744b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        ResultChatPhraseCard resultChatPhraseCard = resultChatPhrase.f20747e;
        ChatPhraseCard chatPhraseCard = resultChatPhraseCard != null ? new ChatPhraseCard(resultChatPhraseCard.f20748a, resultChatPhraseCard.f20749b, resultChatPhraseCard.f20750c) : null;
        List list = resultChatPhrase.f20746d;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(psc.m19473a((ResultMeaning) it.next()));
        }
        return new ChatPhrase(str, str2, 0, str4, chatPhraseCard, arrayList);
    }
}
