package p000;

import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.domain.model.chat.ChatMessageRating;
import com.lingq.feature.chat.PhrasesState;
import com.lingq.feature.chat.TranslationState;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class jw0 extends lw0 {

    /* JADX INFO: renamed from: a */
    public final ChatMessage f46240a;

    /* JADX INFO: renamed from: b */
    public final List f46241b;

    /* JADX INFO: renamed from: c */
    public final List f46242c;

    /* JADX INFO: renamed from: d */
    public final d87 f46243d;

    /* JADX INFO: renamed from: e */
    public final Integer f46244e;

    /* JADX INFO: renamed from: f */
    public final Integer f46245f;

    /* JADX INFO: renamed from: g */
    public final TranslationState f46246g;

    /* JADX INFO: renamed from: h */
    public final PhrasesState f46247h;

    /* JADX INFO: renamed from: i */
    public final ChatMessageRating f46248i;

    /* JADX INFO: renamed from: j */
    public final boolean f46249j;

    /* JADX INFO: renamed from: k */
    public final boolean f46250k;

    /* JADX INFO: renamed from: l */
    public final boolean f46251l;

    /* JADX INFO: renamed from: m */
    public final boolean f46252m;

    /* JADX INFO: renamed from: n */
    public final String f46253n;

    public jw0(ChatMessage chatMessage, List list, List list2, d87 d87Var, Integer num, Integer num2, TranslationState translationState, PhrasesState phrasesState, ChatMessageRating chatMessageRating, boolean z, boolean z2, boolean z3, String str, int i) {
        int i2 = i & 2;
        List list3 = EmptyList.f47638a;
        List list4 = i2 != 0 ? list3 : list;
        list3 = (i & 4) == 0 ? list2 : list3;
        d87 d87Var2 = (i & 8) != 0 ? null : d87Var;
        Integer num3 = (i & 16) != 0 ? null : num;
        Integer num4 = (i & 32) != 0 ? null : num2;
        TranslationState translationState2 = (i & 64) != 0 ? TranslationState.Hidden : translationState;
        PhrasesState phrasesState2 = (i & 128) != 0 ? PhrasesState.Hidden : phrasesState;
        ChatMessageRating chatMessageRating2 = (i & 256) == 0 ? chatMessageRating : null;
        boolean z4 = (i & 512) != 0 ? false : z;
        boolean z5 = (i & 1024) != 0 ? false : z2;
        boolean z6 = (i & 2048) == 0;
        boolean z7 = (i & 4096) == 0 ? z3 : false;
        String str2 = (i & 8192) != 0 ? "en" : str;
        translationState2.getClass();
        phrasesState2.getClass();
        this.f46240a = chatMessage;
        this.f46241b = list4;
        this.f46242c = list3;
        this.f46243d = d87Var2;
        this.f46244e = num3;
        this.f46245f = num4;
        this.f46246g = translationState2;
        this.f46247h = phrasesState2;
        this.f46248i = chatMessageRating2;
        this.f46249j = z4;
        this.f46250k = z5;
        this.f46251l = z6;
        this.f46252m = z7;
        this.f46253n = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw0)) {
            return false;
        }
        jw0 jw0Var = (jw0) obj;
        return fa4.m11650l(this.f46240a, jw0Var.f46240a) && fa4.m11650l(this.f46241b, jw0Var.f46241b) && fa4.m11650l(this.f46242c, jw0Var.f46242c) && fa4.m11650l(this.f46243d, jw0Var.f46243d) && fa4.m11650l(this.f46244e, jw0Var.f46244e) && fa4.m11650l(this.f46245f, jw0Var.f46245f) && this.f46246g == jw0Var.f46246g && this.f46247h == jw0Var.f46247h && this.f46248i == jw0Var.f46248i && this.f46249j == jw0Var.f46249j && this.f46250k == jw0Var.f46250k && this.f46251l == jw0Var.f46251l && this.f46252m == jw0Var.f46252m && fa4.m11650l(this.f46253n, jw0Var.f46253n);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(ux5.m22979b(this.f46240a.hashCode() * 31, 31, this.f46241b), 31, this.f46242c);
        d87 d87Var = this.f46243d;
        int iHashCode = (iM22979b + (d87Var == null ? 0 : d87Var.hashCode())) * 31;
        Integer num = this.f46244e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f46245f;
        int iHashCode3 = (this.f46247h.hashCode() + ((this.f46246g.hashCode() + ((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31;
        ChatMessageRating chatMessageRating = this.f46248i;
        return this.f46253n.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((iHashCode3 + (chatMessageRating != null ? chatMessageRating.hashCode() : 0)) * 31, 31, this.f46249j), 31, this.f46250k), 31, this.f46251l), 31, this.f46252m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMessageItem(chatMessage=");
        sb.append(this.f46240a);
        sb.append(", highlights=");
        sb.append(this.f46241b);
        sb.append(", phraseHighlights=");
        sb.append(this.f46242c);
        sb.append(", relatedPhraseHighlight=");
        sb.append(this.f46243d);
        sb.append(", activeTappedWordIndex=");
        e65.m10883o(sb, this.f46244e, ", activeTappedPhraseIndex=", this.f46245f, ", translationState=");
        sb.append(this.f46246g);
        sb.append(", phrasesState=");
        sb.append(this.f46247h);
        sb.append(", rating=");
        sb.append(this.f46248i);
        sb.append(", isRatingUpdating=");
        sb.append(this.f46249j);
        sb.append(", shouldAnimateWriting=");
        wq1.m24101A(sb, this.f46250k, ", isStreaming=", this.f46251l, ", isTokenized=");
        sb.append(this.f46252m);
        sb.append(", language=");
        sb.append(this.f46253n);
        sb.append(")");
        return sb.toString();
    }
}
