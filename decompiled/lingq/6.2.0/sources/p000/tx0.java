package p000;

import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class tx0 {

    /* JADX INFO: renamed from: a */
    public final List f63036a;

    /* JADX INFO: renamed from: b */
    public final List f63037b;

    /* JADX INFO: renamed from: c */
    public final boolean f63038c;

    /* JADX INFO: renamed from: d */
    public final boolean f63039d;

    /* JADX INFO: renamed from: e */
    public final List f63040e;

    /* JADX INFO: renamed from: f */
    public final int f63041f;

    /* JADX INFO: renamed from: g */
    public final ChatStats f63042g;

    /* JADX INFO: renamed from: h */
    public final boolean f63043h;

    /* JADX INFO: renamed from: i */
    public final ufd f63044i;

    /* JADX INFO: renamed from: j */
    public final boolean f63045j;

    /* JADX INFO: renamed from: k */
    public final nz9 f63046k;

    /* JADX INFO: renamed from: l */
    public final boolean f63047l;

    /* JADX INFO: renamed from: m */
    public final boolean f63048m;

    /* JADX INFO: renamed from: n */
    public final boolean f63049n;

    /* JADX INFO: renamed from: o */
    public final boolean f63050o;

    /* JADX INFO: renamed from: p */
    public final boolean f63051p;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tx0(List list, ChatStats chatStats, nz9 nz9Var, int i) {
        int i2 = i & 16;
        EmptyList emptyList = EmptyList.f47638a;
        this(emptyList, emptyList, false, false, i2 != 0 ? emptyList : list, -1, (i & 64) != 0 ? new ChatStats(0.0d, 0, 63) : chatStats, false, v14.f64693a, false, (i & 1024) != 0 ? new nz9(0, 0.0d, (ArrayList) null, (ReaderFont) null, (Pair) null, (yz7) null, (vs3) null, (TextHighlightStyle) null, false, false, (ReaderPageMode) null, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33554431) : nz9Var, (i & 2048) != 0 ? 1 : 0, true, false, true, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx0)) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        return fa4.m11650l(this.f63036a, tx0Var.f63036a) && fa4.m11650l(this.f63037b, tx0Var.f63037b) && this.f63038c == tx0Var.f63038c && this.f63039d == tx0Var.f63039d && fa4.m11650l(this.f63040e, tx0Var.f63040e) && this.f63041f == tx0Var.f63041f && fa4.m11650l(this.f63042g, tx0Var.f63042g) && this.f63043h == tx0Var.f63043h && fa4.m11650l(this.f63044i, tx0Var.f63044i) && this.f63045j == tx0Var.f63045j && fa4.m11650l(this.f63046k, tx0Var.f63046k) && this.f63047l == tx0Var.f63047l && this.f63048m == tx0Var.f63048m && this.f63049n == tx0Var.f63049n && this.f63050o == tx0Var.f63050o && this.f63051p == tx0Var.f63051p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63051p) + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((this.f63046k.hashCode() + g9a.m12428e((this.f63044i.hashCode() + g9a.m12428e((this.f63042g.hashCode() + wq1.m24106b(this.f63041f, ux5.m22979b(g9a.m12428e(g9a.m12428e(ux5.m22979b(this.f63036a.hashCode() * 31, 31, this.f63037b), 31, this.f63038c), 31, this.f63039d), 31, this.f63040e), 31)) * 31, 31, this.f63043h)) * 31, 31, this.f63045j)) * 31, 31, this.f63047l), 31, this.f63048m), 31, this.f63049n), 31, this.f63050o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatScreenState(lessonList=");
        sb.append(this.f63036a);
        sb.append(", suggestions=");
        sb.append(this.f63037b);
        sb.append(", isLoadingSuggestions=");
        wq1.m24101A(sb, this.f63038c, ", areSuggestionsHidden=", this.f63039d, ", chatItems=");
        sb.append(this.f63040e);
        sb.append(", id=");
        sb.append(this.f63041f);
        sb.append(", chatStats=");
        sb.append(this.f63042g);
        sb.append(", isLoadingMessage=");
        sb.append(this.f63043h);
        sb.append(", importState=");
        sb.append(this.f63044i);
        sb.append(", userRepliedToChat=");
        sb.append(this.f63045j);
        sb.append(", themeSettings=");
        sb.append(this.f63046k);
        sb.append(", isConnected=");
        sb.append(this.f63047l);
        sb.append(", isChatInputEnabled=");
        wq1.m24101A(sb, this.f63048m, ", isOutOfCredits=", this.f63049n, ", showTts=");
        return e65.m10875g(sb, this.f63050o, ", shouldResetSelection=", this.f63051p, ")");
    }

    public tx0(List list, List list2, boolean z, boolean z2, List list3, int i, ChatStats chatStats, boolean z3, ufd ufdVar, boolean z4, nz9 nz9Var, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        chatStats.getClass();
        ufdVar.getClass();
        nz9Var.getClass();
        this.f63036a = list;
        this.f63037b = list2;
        this.f63038c = z;
        this.f63039d = z2;
        this.f63040e = list3;
        this.f63041f = i;
        this.f63042g = chatStats;
        this.f63043h = z3;
        this.f63044i = ufdVar;
        this.f63045j = z4;
        this.f63046k = nz9Var;
        this.f63047l = z5;
        this.f63048m = z6;
        this.f63049n = z7;
        this.f63050o = z8;
        this.f63051p = z9;
    }
}
