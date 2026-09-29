package p000;

import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.C0068g;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.challenge.ChallengeRanking;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.feature.chat.ChatByTime;
import java.util.ArrayList;

/* JADX INFO: renamed from: ft */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3013ft implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39607a;

    public /* synthetic */ C3013ft(int i) {
        this.f39607a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f39607a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                bk2 bk2Var = (bk2) obj;
                return Float.valueOf(bk2.m3805a(bk2Var.f8632a) * bk2.m3806b(bk2Var.f8632a));
            case 1:
                return Float.valueOf(bk2.m3806b(((bk2) obj).f8632a));
            case 2:
                return (AbstractC3027g6) obj;
            case 3:
                vk5 vk5Var = (vk5) obj;
                vk5Var.m23363c(c47.f9483b, (int) (vk5Var.m23362b().mo1687j() >> 32));
                vk5Var.m23363c(c47.f9482a, 0.0f);
                return xfaVar;
            case 4:
                ((ia4) obj).getClass();
                return xfaVar;
            case 5:
                ChallengeRanking challengeRanking = (ChallengeRanking) obj;
                challengeRanking.getClass();
                return Integer.valueOf(challengeRanking.f18891a);
            case 6:
                rr0 rr0Var = (rr0) obj;
                rr0Var.getClass();
                return rr0Var.getKey();
            case 7:
                q7b q7bVar = (q7b) obj;
                q7bVar.getClass();
                return q7bVar.f57357a.f69008e;
            case 8:
                q7b q7bVar2 = (q7b) obj;
                q7bVar2.getClass();
                return q7bVar2.f57357a.f69008e;
            case 9:
                ((C3189km) obj).getClass();
                return new C0068g(AbstractC0070i.m772g(ss5.m21703b0(220, 0, null, 6), 0.0f, 2), AbstractC0070i.m773h(ss5.m21703b0(220, 0, null, 6), 2));
            case 10:
                ((ChatByTime) obj).getClass();
                return new ArrayList();
            case 11:
                AbstractC0426f.m1864h((tv8) obj, 0);
                return xfaVar;
            case 12:
                AbstractC0426f.m1864h((tv8) obj, 1);
                return xfaVar;
            case 13:
                if4 if4Var = (if4) obj;
                if4Var.getClass();
                if4Var.f44042c = true;
                return xfaVar;
            case 14:
                if4 if4Var2 = (if4) obj;
                if4Var2.getClass();
                if4Var2.f44042c = true;
                return xfaVar;
            case 15:
                if4 if4Var3 = (if4) obj;
                if4Var3.getClass();
                if4Var3.f44042c = true;
                return xfaVar;
            case 16:
                if4 if4Var4 = (if4) obj;
                if4Var4.getClass();
                if4Var4.f44042c = true;
                return xfaVar;
            case 17:
                if4 if4Var5 = (if4) obj;
                if4Var5.getClass();
                if4Var5.f44042c = true;
                return xfaVar;
            case 18:
                ((DictionaryData) obj).getClass();
                return xfaVar;
            case 19:
                ((DictionaryData) obj).getClass();
                return xfaVar;
            case 20:
                ((DictionaryData) obj).getClass();
                return xfaVar;
            case 21:
                ((Playlist) obj).getClass();
                return xfaVar;
            case 22:
                ((Playlist) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Playlist) obj).getClass();
                return xfaVar;
            case 24:
                ((Playlist) obj).getClass();
                return xfaVar;
            case 25:
                ((Playlist) obj).getClass();
                return xfaVar;
            case 26:
                ((Playlist) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 28:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            default:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
        }
    }
}
