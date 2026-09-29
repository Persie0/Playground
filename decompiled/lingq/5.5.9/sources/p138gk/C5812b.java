package p138gk;

import ae.C0062b;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import p408u6.ViewOnClickListenerC9466e;
import ph.C8324m2;

/* JADX INFO: renamed from: gk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5812b extends AbstractC1170u<a, c> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<TokenMeaning> f35098e;

    /* JADX INFO: renamed from: gk.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TokenMeaning f35099a;

        /* JADX INFO: renamed from: b */
        public final boolean f35100b;

        /* JADX INFO: renamed from: c */
        public final TokenType f35101c;

        public a(TokenMeaning tokenMeaning, boolean z10, TokenType tokenType) {
            C5207g.m11111f(tokenMeaning, "meaning");
            C5207g.m11111f(tokenType, "tokenType");
            this.f35099a = tokenMeaning;
            this.f35100b = z10;
            this.f35101c = tokenType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C5207g.m11106a(this.f35099a, aVar.f35099a) && this.f35100b == aVar.f35100b && this.f35101c == aVar.f35101c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6 */
        public final int hashCode() {
            int iHashCode = this.f35099a.hashCode() * 31;
            boolean z10 = this.f35100b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return this.f35101c.hashCode() + ((iHashCode + r10) * 31);
        }

        public final String toString() {
            return "AdapterItem(meaning=" + this.f35099a + ", showLocale=" + this.f35100b + ", tokenType=" + this.f35101c + ")";
        }
    }

    /* JADX INFO: renamed from: gk.b$b */
    public static final class b extends C1162m.e<a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            TokenMeaning tokenMeaning = aVar.f35099a;
            String str = tokenMeaning.f22089b;
            TokenMeaning tokenMeaning2 = aVar2.f35099a;
            return C5207g.m11106a(str, tokenMeaning2.f22089b) && C5207g.m11106a(tokenMeaning.f22090c, tokenMeaning2.f22090c);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            return C5207g.m11106a(aVar.f35099a.f22090c, aVar2.f35099a.f22090c);
        }
    }

    /* JADX INFO: renamed from: gk.b$c */
    public static final class c extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8324m2 f35102u;

        public c(C8324m2 c8324m2) {
            super(c8324m2.m16404a());
            this.f35102u = c8324m2;
        }
    }

    public C5812b(TokenFragment.C4796j c4796j) {
        super(new b());
        this.f35098e = c4796j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        c cVar = (c) abstractC1109b0;
        a aVarM4528p = m4528p(i10);
        TokenMeaning tokenMeaning = aVarM4528p.f35099a;
        C5207g.m11111f(tokenMeaning, "meaning");
        TokenType tokenType = aVarM4528p.f35101c;
        C5207g.m11111f(tokenType, "tokenType");
        C8324m2 c8324m2 = cVar.f35102u;
        ((TextView) c8324m2.f45030d).setText(tokenMeaning.f22090c);
        boolean z10 = aVarM4528p.f35100b;
        View view = c8324m2.f45028b;
        View view2 = c8324m2.f45029c;
        if (z10) {
            ImageButton imageButton = (ImageButton) view2;
            C5207g.m11110e(imageButton, "btnHintAdd");
            C4924a.m10422A(imageButton);
            ImageView imageView = (ImageView) view;
            C5207g.m11110e(imageView, "ivLocale");
            C4924a.m10457e0(imageView);
            List<Integer> list = C6716m.f37937a;
            C6716m.m13326k(imageView, tokenMeaning.f22089b, 0.0f);
        } else {
            ImageButton imageButton2 = (ImageButton) view2;
            C5207g.m11110e(imageButton2, "btnHintAdd");
            C4924a.m10457e0(imageButton2);
            ImageView imageView2 = (ImageView) view;
            C5207g.m11110e(imageView2, "ivLocale");
            C4924a.m10422A(imageView2);
            TokenType tokenType2 = TokenType.WordType;
            View view3 = cVar.f7054a;
            if (tokenType == tokenType2 || tokenType == TokenType.NewWordOrPhraseType) {
                Drawable drawable = imageButton2.getDrawable();
                List<Integer> list2 = C6716m.f37937a;
                Context context = view3.getContext();
                C5207g.m11110e(context, "itemView.context");
                drawable.setColorFilter(C6716m.m13333r(R.attr.blueTint, context), PorterDuff.Mode.SRC_IN);
                imageButton2.setImageDrawable(drawable);
            } else {
                Drawable drawable2 = imageButton2.getDrawable();
                List<Integer> list3 = C6716m.f37937a;
                Context context2 = view3.getContext();
                C5207g.m11110e(context2, "itemView.context");
                drawable2.setColorFilter(C6716m.m13333r(R.attr.tertiaryTextColor, context2), PorterDuff.Mode.SRC_IN);
                imageButton2.setImageDrawable(drawable2);
            }
        }
        c8324m2.m16404a().setOnClickListener(new ViewOnClickListenerC9466e(cVar, 22, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_popular_meaning, recyclerView, false);
        int i11 = R.id.btnHintAdd;
        ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h, R.id.btnHintAdd);
        if (imageButton != null) {
            i11 = R.id.ivLocale;
            ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivLocale);
            if (imageView != null) {
                i11 = R.id.tvHint;
                TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvHint);
                if (textView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) viewM849h;
                    return new c(new C8324m2(relativeLayout, imageButton, imageView, textView, relativeLayout));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
