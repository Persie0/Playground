package p137gj;

import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import mo.C7661i;
import ph.C8392z2;

/* JADX INFO: renamed from: gj.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C5810f extends AbstractC1170u<String, b> {

    /* JADX INFO: renamed from: gj.f$a */
    public static final class a extends C1162m.e<String> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(String str, String str2) {
            return C5207g.m11106a(str, str2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(String str, String str2) {
            return C5207g.m11106a(str, str2);
        }
    }

    /* JADX INFO: renamed from: gj.f$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8392z2 f35092u;

        public b(C8392z2 c8392z2) {
            super(c8392z2.f45505a);
            this.f35092u = c8392z2;
        }
    }

    public C5810f() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        b bVar = (b) abstractC1109b0;
        String strM4528p = m4528p(bVar.m4241d());
        C5207g.m11110e(strM4528p, "getItem(holder.bindingAdapterPosition)");
        String str = strM4528p;
        boolean z10 = !C7661i.m15250P2(str);
        C8392z2 c8392z2 = bVar.f35092u;
        if (!z10) {
            TextView textView = c8392z2.f45506b;
            C5207g.m11110e(textView, "tvTag");
            C4924a.m10442U(textView);
        } else {
            c8392z2.f45506b.setText(str);
            TextView textView2 = c8392z2.f45506b;
            C5207g.m11110e(textView2, "tvTag");
            C4924a.m10457e0(textView2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_lesson_tag, recyclerView, false);
        if (viewM849h == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewM849h;
        return new b(new C8392z2(textView, textView, 1));
    }
}
