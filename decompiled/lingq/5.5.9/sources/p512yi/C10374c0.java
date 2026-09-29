package p512yi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import ni.C7793a;
import p181ii.C6336e;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import ph.C8392z2;

/* JADX INFO: renamed from: yi.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10374c0 extends AbstractC1170u<C6336e, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC10396x f52136e;

    /* JADX INFO: renamed from: yi.c0$a */
    public static final class a extends C1162m.e<C6336e> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C6336e c6336e, C6336e c6336e2) {
            return c6336e.f36632e == c6336e2.f36632e;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C6336e c6336e, C6336e c6336e2) {
            C6336e c6336e3 = c6336e;
            C6336e c6336e4 = c6336e2;
            return C5207g.m11106a(c6336e3.f36629b.f22050c, c6336e4.f36629b.f22050c) && C5207g.m11106a(c6336e3.f36634g, c6336e4.f36634g);
        }
    }

    /* JADX INFO: renamed from: yi.c0$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8392z2 f52137u;

        public b(C8392z2 c8392z2) {
            super(c8392z2.f45505a);
            this.f52137u = c8392z2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10374c0(InterfaceC10396x interfaceC10396x) {
        super(new a());
        C5207g.m11111f(interfaceC10396x, "libraryInteraction");
        this.f52136e = interfaceC10396x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        b bVar = (b) abstractC1109b0;
        C6336e c6336eM4528p = m4528p(i10);
        C5207g.m11110e(c6336eM4528p, "getItem(position)");
        C6336e c6336e = c6336eM4528p;
        C8392z2 c8392z2 = bVar.f52137u;
        TextView textView = c8392z2.f45506b;
        C7793a.m15497a(c6336e.f36634g);
        textView.setText(c6336e.f36628a);
        TextView textView2 = c8392z2.f45506b;
        textView2.setTextAppearance(R.style.TextAppearance_Subhead);
        List<Integer> list = C6716m.f37937a;
        View view = bVar.f7054a;
        Context context = view.getContext();
        C5207g.m11110e(context, "itemView.context");
        textView2.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context));
        if (c6336e.f36632e) {
            textView2.setTextAppearance(R.style.TextAppearance_Subhead_Bold);
            Context context2 = view.getContext();
            C5207g.m11110e(context2, "itemView.context");
            textView2.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context2));
        }
        c8392z2.f45505a.setOnClickListener(new ViewOnClickListenerC6464i(this, 9, bVar));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_library_header_selectable, recyclerView, false);
        if (viewM849h == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewM849h;
        return new b(new C8392z2(textView, textView, 2));
    }
}
