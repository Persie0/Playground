package si;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import ph.C8272d4;

/* JADX INFO: renamed from: si.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C9035s extends AbstractC1170u<C9023g, b> {

    /* JADX INFO: renamed from: si.s$a */
    public static final class a extends C1162m.e<C9023g> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C9023g c9023g, C9023g c9023g2) {
            return C5207g.m11106a(c9023g, c9023g2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C9023g c9023g, C9023g c9023g2) {
            return C5207g.m11106a(c9023g.f47255c, c9023g2.f47255c);
        }
    }

    /* JADX INFO: renamed from: si.s$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8272d4 f47274u;

        public b(C8272d4 c8272d4) {
            super(c8272d4.f44675a);
            this.f47274u = c8272d4;
        }
    }

    public C9035s() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        b bVar = (b) abstractC1109b0;
        C9023g c9023gM4528p = m4528p(i10);
        C5207g.m11110e(c9023gM4528p, "item");
        C8272d4 c8272d4 = bVar.f47274u;
        ImageButton imageButton = c8272d4.f44676b;
        C5207g.m11110e(imageButton, "btnAddActivity");
        if (imageButton.getVisibility() != 8) {
            if (c9023gM4528p.f47257e == 0) {
                imageButton.setVisibility(8);
            }
        }
        double d10 = c9023gM4528p.f47253a;
        c8272d4.f44680f.setText(C4924a.m10471l0(d10, 1));
        double d11 = c9023gM4528p.f47254b;
        boolean z10 = d11 == 0.0d;
        TextView textView = c8272d4.f44678d;
        TextView textView2 = c8272d4.f44679e;
        if (z10) {
            C5207g.m11110e(textView, "tvDivider");
            C4924a.m10442U(textView);
            C5207g.m11110e(textView2, "tvGoal");
            C4924a.m10442U(textView2);
        } else {
            C5207g.m11110e(textView, "tvDivider");
            C4924a.m10457e0(textView);
            C5207g.m11110e(textView2, "tvGoal");
            C4924a.m10457e0(textView2);
            textView2.setText(C4924a.m10471l0(d11, 1));
        }
        c8272d4.f44681g.setText(c9023gM4528p.f47255c);
        List<Integer> list = C6716m.f37937a;
        Context context = bVar.f7054a.getContext();
        C5207g.m11110e(context, "itemView.context");
        int[] iArr = {C6716m.m13333r(c9023gM4528p.f47256d, context)};
        LinearProgressIndicator linearProgressIndicator = c8272d4.f44677c;
        linearProgressIndicator.setIndicatorColor(iArr);
        linearProgressIndicator.setMax((d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1)) == 0 ? (int) d10 : (int) (((double) 100) * d11));
        if (!(d11 == 0.0d)) {
            d10 *= (double) 100;
        }
        linearProgressIndicator.setProgress((int) d10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        return new b(C8272d4.m16402a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
    }
}
