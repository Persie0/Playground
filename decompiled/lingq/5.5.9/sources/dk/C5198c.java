package dk;

import android.content.Context;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.views.LineGraphView;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import p278nh.C7779f;
import ph.C8330n2;

/* JADX INFO: renamed from: dk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C5198c extends AbstractC1170u<C7779f, b> {

    /* JADX INFO: renamed from: dk.c$a */
    public static final class a extends C1162m.e<C7779f> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C7779f c7779f, C7779f c7779f2) {
            return C5207g.m11106a(c7779f, c7779f2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C7779f c7779f, C7779f c7779f2) {
            return c7779f.f42714b == c7779f2.f42714b;
        }
    }

    /* JADX INFO: renamed from: dk.c$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8330n2 f33247u;

        public b(C8330n2 c8330n2) {
            super((LineGraphView) c8330n2.f45085a);
            this.f33247u = c8330n2;
        }
    }

    public C5198c() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        b bVar = (b) abstractC1109b0;
        C7779f c7779fM4528p = m4528p(i10);
        C5207g.m11110e(c7779fM4528p, "item");
        LineGraphView lineGraphView = (LineGraphView) bVar.f33247u.f45086b;
        View view = bVar.f7054a;
        lineGraphView.setTitle(c7779fM4528p.f42716d + " " + view.getContext().getString(c7779fM4528p.f42713a));
        List<Integer> list = C6716m.f37937a;
        Context context = view.getContext();
        C5207g.m11110e(context, "itemView.context");
        lineGraphView.setLineColor(C6716m.m13333r(c7779fM4528p.f42714b, context));
        lineGraphView.setGraphCoordinates(c7779fM4528p.f42715c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_line_graph, recyclerView, false);
        if (viewM849h == null) {
            throw new NullPointerException("rootView");
        }
        LineGraphView lineGraphView = (LineGraphView) viewM849h;
        return new b(new C8330n2(lineGraphView, lineGraphView));
    }
}
