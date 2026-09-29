package p138gk;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.p055ui.token.TokenFragment;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p204jj.C6490k;
import p225kk.C6716m;
import ph.C8393z3;

/* JADX INFO: renamed from: gk.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5816f extends AbstractC1170u<a, d> {

    /* JADX INFO: renamed from: e */
    public final c f35111e;

    /* JADX INFO: renamed from: gk.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TokenMeaning f35112a;

        /* JADX INFO: renamed from: b */
        public final boolean f35113b;

        /* JADX INFO: renamed from: c */
        public final boolean f35114c;

        public a(TokenMeaning tokenMeaning, boolean z10, boolean z11) {
            C5207g.m11111f(tokenMeaning, "meaning");
            this.f35112a = tokenMeaning;
            this.f35113b = z10;
            this.f35114c = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C5207g.m11106a(this.f35112a, aVar.f35112a) && this.f35113b == aVar.f35113b && this.f35114c == aVar.f35114c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public final int hashCode() {
            int iHashCode = this.f35112a.hashCode() * 31;
            boolean z10 = this.f35113b;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iHashCode + r10) * 31;
            boolean z11 = this.f35114c;
            return i10 + (z11 ? 1 : z11);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdapterItem(meaning=");
            sb2.append(this.f35112a);
            sb2.append(", showLocale=");
            sb2.append(this.f35113b);
            sb2.append(", showDelete=");
            return C0166e.m769p(sb2, this.f35114c, ")");
        }
    }

    /* JADX INFO: renamed from: gk.f$b */
    public static final class b extends C1162m.e<a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            return C5207g.m11106a(aVar3.f35112a, aVar4.f35112a) && aVar3.f35113b == aVar4.f35113b && aVar3.f35114c && aVar4.f35114c;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(a aVar, a aVar2) {
            return C5207g.m11106a(aVar.f35112a.f22090c, aVar2.f35112a.f22090c);
        }
    }

    /* JADX INFO: renamed from: gk.f$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo10365a(TokenMeaning tokenMeaning, String str);
    }

    /* JADX INFO: renamed from: gk.f$d */
    public static final class d extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8393z3 f35115u;

        public d(C8393z3 c8393z3) {
            super(c8393z3.f45507a);
            this.f35115u = c8393z3;
        }
    }

    public C5816f(TokenFragment.C4795i c4795i) {
        super(new b());
        this.f35111e = c4795i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        final a aVarM4528p = m4528p(i10);
        TokenMeaning tokenMeaning = aVarM4528p.f35112a;
        C5207g.m11111f(tokenMeaning, "meaning");
        final C8393z3 c8393z3 = ((d) abstractC1109b0).f35115u;
        c8393z3.f45508b.setText(tokenMeaning.f22090c);
        EditText editText = c8393z3.f45508b;
        boolean z10 = aVarM4528p.f35113b;
        String str = tokenMeaning.f22089b;
        ImageView imageView = c8393z3.f45509c;
        ImageView imageView2 = c8393z3.f45512f;
        if (z10) {
            C5207g.m11110e(imageView, "ivAdded");
            C4924a.m10422A(imageView);
            C5207g.m11110e(imageView2, "ivLocale");
            C4924a.m10457e0(imageView2);
            C5207g.m11110e(editText, "etHint");
            ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(16, imageView2.getId());
            List<Integer> list = C6716m.f37937a;
            layoutParams2.setMarginEnd((int) C6716m.m13316a(4));
            editText.setLayoutParams(layoutParams2);
            C6716m.m13326k(imageView2, str, 0.0f);
        } else {
            C5207g.m11110e(imageView, "ivAdded");
            C4924a.m10457e0(imageView);
            C5207g.m11110e(imageView2, "ivLocale");
            C4924a.m10422A(imageView2);
            C5207g.m11110e(editText, "etHint");
            ViewGroup.LayoutParams layoutParams3 = editText.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.addRule(16, imageView.getId());
            List<Integer> list2 = C6716m.f37937a;
            layoutParams4.setMarginEnd((int) C6716m.m13316a(4));
            editText.setLayoutParams(layoutParams4);
        }
        List<Integer> list3 = C6716m.f37937a;
        C6716m.m13326k(c8393z3.f45511e, str, 0.0f);
        boolean z11 = aVarM4528p.f35114c;
        ImageView imageView3 = c8393z3.f45510d;
        if (z11) {
            C5207g.m11110e(imageView3, "ivDelete");
            C4924a.m10457e0(imageView3);
        } else {
            C5207g.m11110e(imageView3, "ivDelete");
            C4924a.m10442U(imageView3);
        }
        editText.setImeOptions(6);
        editText.setRawInputType(1);
        editText.setOnEditorActionListener(new C6490k(c8393z3, 2));
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: gk.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                String string;
                C5816f c5816f = this.f35108a;
                C5207g.m11111f(c5816f, "this$0");
                C8393z3 c8393z4 = c8393z3;
                C5207g.m11111f(c8393z4, "$this_with");
                if (z12) {
                    return;
                }
                TokenMeaning tokenMeaning2 = aVarM4528p.f35112a;
                Editable text = c8393z4.f45508b.getText();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                c5816f.f35111e.mo10365a(tokenMeaning2, string);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_saved_meaning, recyclerView, false);
        int i11 = R.id.etHint;
        EditText editText = (EditText) C0062b.m298P0(viewM849h, R.id.etHint);
        if (editText != null) {
            i11 = R.id.ivAdded;
            ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivAdded);
            if (imageView != null) {
                i11 = R.id.ivDelete;
                ImageView imageView2 = (ImageView) C0062b.m298P0(viewM849h, R.id.ivDelete);
                if (imageView2 != null) {
                    i11 = R.id.ivEditLocale;
                    ImageView imageView3 = (ImageView) C0062b.m298P0(viewM849h, R.id.ivEditLocale);
                    if (imageView3 != null) {
                        i11 = R.id.ivLocale;
                        ImageView imageView4 = (ImageView) C0062b.m298P0(viewM849h, R.id.ivLocale);
                        if (imageView4 != null) {
                            i11 = R.id.viewBackground;
                            if (((LinearLayout) C0062b.m298P0(viewM849h, R.id.viewBackground)) != null) {
                                i11 = R.id.viewForeground;
                                if (((RelativeLayout) C0062b.m298P0(viewM849h, R.id.viewForeground)) != null) {
                                    return new d(new C8393z3((RelativeLayout) viewM849h, editText, imageView, imageView2, imageView3, imageView4));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
