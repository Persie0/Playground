package p324pj;

import ae.C0062b;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.views.NumberStepper;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import p225kk.C6716m;
import p278nh.C7780g;
import p278nh.InterfaceC7774a;
import p487xi.C10201i;
import ph.C8382x2;

/* JADX INFO: renamed from: pj.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8398d extends AbstractC1170u<C7780g, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<Pair<String, Integer>> f45521e;

    /* JADX INFO: renamed from: pj.d$a */
    public static final class a extends C1162m.e<C7780g> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C7780g c7780g, C7780g c7780g2) {
            return C5207g.m11106a(c7780g, c7780g2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C7780g c7780g, C7780g c7780g2) {
            return c7780g.f42719c == c7780g2.f42719c;
        }
    }

    /* JADX INFO: renamed from: pj.d$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8382x2 f45522u;

        public b(C8382x2 c8382x2) {
            super(c8382x2.m16418a());
            this.f45522u = c8382x2;
        }
    }

    public C8398d(C10201i.a.i.C10688a c10688a) {
        super(new a());
        this.f45521e = c10688a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        b bVar = (b) abstractC1109b0;
        C7780g c7780gM4528p = m4528p(i10);
        C5207g.m11110e(c7780gM4528p, "item");
        C8382x2 c8382x2 = bVar.f45522u;
        NumberStepper numberStepper = (NumberStepper) c8382x2.f45466d;
        double d10 = c7780gM4528p.f42718b;
        numberStepper.setNumber((int) d10);
        TextView textView = (TextView) c8382x2.f45464b;
        String str = String.format("%.1fx", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        C5207g.m11110e(str, "format(format, *args)");
        textView.setText(str);
        List<Integer> list = C6716m.f37937a;
        View view = bVar.f7054a;
        Context context = view.getContext();
        C5207g.m11110e(context, "itemView.context");
        textView.setTextColor(C6716m.m13333r(c7780gM4528p.f42720d, context));
        TextView textView2 = (TextView) c8382x2.f45467e;
        textView2.setText(view.getContext().getString(c7780gM4528p.f42719c));
        Context context2 = view.getContext();
        C5207g.m11110e(context2, "itemView.context");
        textView2.setTextColor(C6716m.m13333r(c7780gM4528p.f42721e, context2));
        ((NumberStepper) c8382x2.f45466d).setOnNumberChangedListener(new C8399e(this, c7780gM4528p));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_numbers_view, recyclerView, false);
        int i11 = R.id.numbersView;
        NumberStepper numberStepper = (NumberStepper) C0062b.m298P0(viewM849h, R.id.numbersView);
        if (numberStepper != null) {
            i11 = R.id.tvNumber;
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvNumber);
            if (textView != null) {
                i11 = R.id.tvTitle;
                TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvTitle);
                if (textView2 != null) {
                    return new b(new C8382x2((RelativeLayout) viewM849h, numberStepper, textView, textView2, 3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
