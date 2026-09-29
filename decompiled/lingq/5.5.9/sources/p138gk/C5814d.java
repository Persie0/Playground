package p138gk;

import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.linguist.R;
import dm.C5207g;
import p278nh.InterfaceC7774a;
import ph.C8367u2;

/* JADX INFO: renamed from: gk.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5814d extends AbstractC1170u<TokenRelatedPhrase, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<TokenRelatedPhrase> f35106e;

    /* JADX INFO: renamed from: gk.d$a */
    public static final class a extends C1162m.e<TokenRelatedPhrase> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(TokenRelatedPhrase tokenRelatedPhrase, TokenRelatedPhrase tokenRelatedPhrase2) {
            return C5207g.m11106a(tokenRelatedPhrase.f22110a, tokenRelatedPhrase2.f22110a);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(TokenRelatedPhrase tokenRelatedPhrase, TokenRelatedPhrase tokenRelatedPhrase2) {
            return C5207g.m11106a(tokenRelatedPhrase.f22111b, tokenRelatedPhrase2.f22111b);
        }
    }

    /* JADX INFO: renamed from: gk.d$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8367u2 f35107u;

        public b(C8367u2 c8367u2) {
            super(c8367u2.f45315a);
            this.f35107u = c8367u2;
        }
    }

    public C5814d(TokenFragment.C4789c c4789c) {
        super(new a());
        this.f35106e = c4789c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, final int i10) {
        final b bVar = (b) abstractC1109b0;
        TokenRelatedPhrase tokenRelatedPhraseM4528p = m4528p(i10);
        C5207g.m11110e(tokenRelatedPhraseM4528p, "getItem(position)");
        bVar.f35107u.f45316b.setText(tokenRelatedPhraseM4528p.f22110a);
        bVar.f7054a.setOnClickListener(new View.OnClickListener() { // from class: gk.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5814d.b bVar2 = bVar;
                C5207g.m11111f(bVar2, "$holder");
                C5814d c5814d = this;
                C5207g.m11111f(c5814d, "this$0");
                if (bVar2.m4241d() != -1) {
                    TokenRelatedPhrase tokenRelatedPhraseM4528p2 = c5814d.m4528p(i10);
                    C5207g.m11110e(tokenRelatedPhraseM4528p2, "getItem(position)");
                    c5814d.f35106e.mo9795a(tokenRelatedPhraseM4528p2);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_related_phrase_card, recyclerView, false);
        if (viewM849h == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewM849h;
        return new b(new C8367u2(textView, textView, 3));
    }
}
