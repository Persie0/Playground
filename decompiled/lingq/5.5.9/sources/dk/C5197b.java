package dk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lingq.util.C4924a;
import com.lingq.util.LanguageProgressGoal;
import dm.C5207g;
import java.util.List;
import p024b3.C1304k;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import p408u6.ViewOnClickListenerC9466e;
import ph.C8272d4;

/* JADX INFO: renamed from: dk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5197b extends AbstractC1170u<C5196a, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<C5196a> f33245e;

    /* JADX INFO: renamed from: dk.b$a */
    public static final class a extends C1162m.e<C5196a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C5196a c5196a, C5196a c5196a2) {
            return C5207g.m11106a(c5196a, c5196a2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C5196a c5196a, C5196a c5196a2) {
            return c5196a.f33241d == c5196a2.f33241d;
        }
    }

    /* JADX INFO: renamed from: dk.b$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8272d4 f33246u;

        public b(C8272d4 c8272d4) {
            super(c8272d4.f44675a);
            this.f33246u = c8272d4;
        }
    }

    public C5197b(InterfaceC7774a<C5196a> interfaceC7774a) {
        super(new a());
        this.f33245e = interfaceC7774a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        String string;
        b bVar = (b) abstractC1109b0;
        C5196a c5196aM4528p = m4528p(i10);
        C5207g.m11110e(c5196aM4528p, "item");
        boolean z10 = c5196aM4528p.f33244g;
        C8272d4 c8272d4 = bVar.f33246u;
        View view = bVar.f7054a;
        if (z10) {
            ConstraintLayout constraintLayout = c8272d4.f44675a;
            List<Integer> list = C6716m.f37937a;
            constraintLayout.setPadding(0, (int) C6716m.m13316a(10), 0, 0);
            Context context = view.getContext();
            C5207g.m11110e(context, "itemView.context");
            int i11 = C4924a.m10460g(context) ? 12 : 7;
            Context context2 = view.getContext();
            C5207g.m11110e(context2, "itemView.context");
            int i12 = C4924a.m10460g(context2) ? 8 : 4;
            float fM13331p = C6716m.m13331p(i11);
            TextView textView = c8272d4.f44680f;
            textView.setTextSize(fM13331p);
            float fM13331p2 = C6716m.m13331p(i12);
            TextView textView2 = c8272d4.f44679e;
            textView2.setTextSize(fM13331p2);
            float fM13331p3 = C6716m.m13331p(i12);
            TextView textView3 = c8272d4.f44681g;
            textView3.setTextSize(fM13331p3);
            C1304k.m4827b(textView3, 0);
            C1304k.m4827b(textView2, 0);
            C1304k.m4827b(textView, 0);
        } else {
            c8272d4.f44681g.setMaxLines(1);
            C1304k.m4827b(c8272d4.f44679e, 1);
        }
        ImageButton imageButton = c8272d4.f44676b;
        C5207g.m11110e(imageButton, "btnAddActivity");
        if (imageButton.getVisibility() != 8) {
            if (c5196aM4528p.f33243f == 0) {
                imageButton.setVisibility(8);
            }
        }
        LanguageProgressGoal languageProgressGoal = LanguageProgressGoal.HoursListening;
        int iM10433L = C4924a.m10433L(languageProgressGoal);
        double d10 = c5196aM4528p.f33239b;
        int i13 = c5196aM4528p.f33241d;
        c8272d4.f44680f.setText(C4924a.m10471l0(d10, ((i13 == iM10433L || i13 == C4924a.m10433L(LanguageProgressGoal.HoursSpeaking)) && !C4924a.m10428G(d10)) ? 2 : 1));
        double d11 = c5196aM4528p.f33240c;
        boolean z11 = d11 == 0.0d;
        TextView textView4 = c8272d4.f44678d;
        TextView textView5 = c8272d4.f44679e;
        if (z11) {
            C5207g.m11110e(textView4, "tvDivider");
            C4924a.m10442U(textView4);
            C5207g.m11110e(textView5, "tvGoal");
            C4924a.m10442U(textView5);
            string = view.getContext().getString(i13);
        } else {
            C5207g.m11110e(textView4, "tvDivider");
            C4924a.m10457e0(textView4);
            int i14 = ((i13 == C4924a.m10433L(languageProgressGoal) || i13 == C4924a.m10433L(LanguageProgressGoal.HoursSpeaking)) && !C4924a.m10428G(d11)) ? 2 : 1;
            C5207g.m11110e(textView5, "tvGoal");
            C4924a.m10457e0(textView5);
            textView5.setText(C4924a.m10471l0(d11, i14));
            string = view.getContext().getString(i13);
        }
        c8272d4.f44681g.setText(string);
        List<Integer> list2 = C6716m.f37937a;
        Context context3 = view.getContext();
        C5207g.m11110e(context3, "itemView.context");
        int[] iArr = {C6716m.m13333r(c5196aM4528p.f33242e, context3)};
        LinearProgressIndicator linearProgressIndicator = c8272d4.f44677c;
        linearProgressIndicator.setIndicatorColor(iArr);
        linearProgressIndicator.setMax((d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1)) == 0 ? (int) d10 : (int) (((double) 100) * d11));
        linearProgressIndicator.setProgress((int) (d11 == 0.0d ? d10 : d10 * ((double) 100)));
        c8272d4.f44676b.setOnClickListener(new ViewOnClickListenerC9466e(this, 18, bVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        return new b(C8272d4.m16402a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
    }
}
