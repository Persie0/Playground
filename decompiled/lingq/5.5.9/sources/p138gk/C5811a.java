package p138gk;

import ae.C0062b;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.p055ui.token.C4904e;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import p512yi.ViewOnClickListenerC10371b;
import ph.C8372v2;

/* JADX INFO: renamed from: gk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5811a extends AbstractC1170u<b, c> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<String> f35093e;

    /* JADX INFO: renamed from: gk.a$a */
    public static final class a extends C1162m.e<b> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(b bVar, b bVar2) {
            return bVar.f35095b == bVar2.f35095b;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(b bVar, b bVar2) {
            return C5207g.m11106a(bVar.f35094a, bVar2.f35094a);
        }
    }

    /* JADX INFO: renamed from: gk.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f35094a;

        /* JADX INFO: renamed from: b */
        public boolean f35095b;

        /* JADX INFO: renamed from: c */
        public final boolean f35096c;

        public b(String str, boolean z10, boolean z11) {
            C5207g.m11111f(str, "tag");
            this.f35094a = str;
            this.f35095b = z10;
            this.f35096c = z11;
        }
    }

    /* JADX INFO: renamed from: gk.a$c */
    public static final class c extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8372v2 f35097u;

        public c(C8372v2 c8372v2) {
            super(c8372v2.m16417a());
            this.f35097u = c8372v2;
            ((AppCompatCheckBox) c8372v2.f45408d).setClickable(false);
        }
    }

    public C5811a(C4904e c4904e) {
        super(new a());
        this.f35093e = c4904e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        c cVar = (c) abstractC1109b0;
        b bVarM4528p = m4528p(i10);
        C5207g.m11110e(bVarM4528p, "getItem(position)");
        b bVar = bVarM4528p;
        C8372v2 c8372v2 = cVar.f35097u;
        c8372v2.f45407c.setText(bVar.f35094a);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) c8372v2.f45408d;
        appCompatCheckBox.setVisibility(0);
        appCompatCheckBox.setChecked(bVar.f35095b);
        boolean z10 = bVar.f35096c;
        View view = cVar.f7054a;
        TextView textView = c8372v2.f45407c;
        if (z10) {
            appCompatCheckBox.setEnabled(true);
            List<Integer> list = C6716m.f37937a;
            Context context = view.getContext();
            C5207g.m11110e(context, "itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context));
        } else {
            appCompatCheckBox.setEnabled(false);
            List<Integer> list2 = C6716m.f37937a;
            Context context2 = view.getContext();
            C5207g.m11110e(context2, "itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context2));
        }
        b bVarM4528p2 = m4528p(cVar.m4241d());
        if (bVarM4528p2.f35096c) {
            view.setOnClickListener(new ViewOnClickListenerC10371b(6, bVarM4528p2, cVar, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_tag_for_language, recyclerView, false);
        int i11 = R.id.cb_add;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) C0062b.m298P0(viewM849h, R.id.cb_add);
        if (appCompatCheckBox != null) {
            i11 = R.id.tv_tag;
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tv_tag);
            if (textView != null) {
                return new c(new C8372v2((RelativeLayout) viewM849h, appCompatCheckBox, textView, 5));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
    }
}
