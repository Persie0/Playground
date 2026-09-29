package p014aj;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.p055ui.home.notifications.NotificationsDailyLingqSelectionFragment;
import dm.C5207g;
import p199jd.ViewOnClickListenerC6464i;
import p278nh.C7785l;
import p278nh.InterfaceC7774a;
import ph.C8331n3;

/* JADX INFO: renamed from: aj.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C0096m extends AbstractC1170u<C7785l, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<String> f252e;

    /* JADX INFO: renamed from: aj.m$a */
    public static final class a extends C1162m.e<C7785l> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C7785l c7785l, C7785l c7785l2) {
            return c7785l.f42736c == c7785l2.f42736c;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C7785l c7785l, C7785l c7785l2) {
            return C5207g.m11106a(c7785l.f42734a, c7785l2.f42734a);
        }
    }

    /* JADX INFO: renamed from: aj.m$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8331n3 f253u;

        public b(C8331n3 c8331n3) {
            super((ConstraintLayout) c8331n3.f45087a);
            this.f253u = c8331n3;
        }
    }

    public C0096m(NotificationsDailyLingqSelectionFragment.C3847a c3847a) {
        super(new a());
        this.f252e = c3847a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        b bVar = (b) abstractC1109b0;
        C7785l c7785lM4528p = m4528p(i10);
        C5207g.m11110e(c7785lM4528p, "item");
        C8331n3 c8331n3 = bVar.f253u;
        ImageView imageView = (ImageView) c8331n3.f45089c;
        C5207g.m11110e(imageView, "isSelected");
        imageView.setVisibility(Boolean.valueOf(c7785lM4528p.f42736c).booleanValue() ? 0 : 4);
        Integer num = c7785lM4528p.f42734a;
        View view = c8331n3.f45090d;
        if (num != null) {
            ((TextView) view).setText(bVar.f7054a.getContext().getString(num.intValue()));
        } else {
            ((TextView) view).setText(c7785lM4528p.f42735b);
        }
        ((ConstraintLayout) c8331n3.f45088b).setOnClickListener(new ViewOnClickListenerC6464i(this, 10, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        return new b(C8331n3.m16408a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
    }
}
