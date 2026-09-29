package p014aj;

import ae.C0062b;
import android.content.Context;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.p055ui.home.notifications.NotificationsFragment;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import mo.C7661i;
import ni.C7793a;
import p203ji.C6479a;
import p225kk.C6716m;
import p278nh.InterfaceC7774a;
import p312p2.C8169a;
import ph.C8261c;
import si.ViewOnClickListenerC9029m;

/* JADX INFO: renamed from: aj.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0091h extends AbstractC1170u<C6479a, b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<C6479a> f245e;

    /* JADX INFO: renamed from: aj.h$a */
    public static final class a extends C1162m.e<C6479a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(C6479a c6479a, C6479a c6479a2) {
            return C5207g.m11106a(c6479a, c6479a2);
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(C6479a c6479a, C6479a c6479a2) {
            return c6479a.f37052a == c6479a2.f37052a;
        }
    }

    /* JADX INFO: renamed from: aj.h$b */
    public static final class b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final C8261c f246u;

        public b(C8261c c8261c) {
            super((ConstraintLayout) c8261c.f44630b);
            this.f246u = c8261c;
        }
    }

    public C0091h(NotificationsFragment.C3862a c3862a) {
        super(new a());
        this.f245e = c3862a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        long time;
        b bVar = (b) abstractC1109b0;
        C6479a c6479aM4528p = m4528p(i10);
        C5207g.m11109d(c6479aM4528p, "null cannot be cast to non-null type com.lingq.shared.uimodel.notification.UserNotification");
        C6479a c6479a = c6479aM4528p;
        C8261c c8261c = bVar.f246u;
        String str = c6479a.f37055d;
        if (str == null) {
            ((ImageView) c8261c.f44631c).setImageResource(R.drawable.ic_notifications_generic_icon);
        } else if (C5207g.m11106a(str, "like")) {
            ((ImageView) c8261c.f44631c).setImageResource(R.drawable.ic_notifications_heart_icon);
        } else if (C5207g.m11106a(str, "challenge")) {
            ((ImageView) c8261c.f44631c).setImageResource(R.drawable.ic_notifications_challenge_icon);
        } else if (C7661i.m15256V2(str, "http", true)) {
            ImageView imageView = (ImageView) c8261c.f44631c;
            C5207g.m11110e(imageView, "ivNotification");
            C4924a.m10436O(imageView, c6479a.f37055d, 0.0f, null, 14);
        } else {
            String str2 = c6479a.f37057f;
            if (str2 != null) {
                List<Integer> list = C6716m.f37937a;
                C6716m.m13326k((ImageView) c8261c.f44631c, str2, 0.0f);
            } else {
                ((ImageView) c8261c.f44631c).setImageResource(R.drawable.ic_notifications_generic_icon);
            }
        }
        ((TextView) c8261c.f44633e).setText(c6479a.f37053b);
        TextView textView = (TextView) c8261c.f44632d;
        textView.setText(c6479a.f37054c);
        String str3 = c6479a.f37059h;
        C5207g.m11111f(str3, "<this>");
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(str3);
            time = date != null ? date.getTime() : 0L;
        } catch (Exception unused) {
        }
        String string = DateUtils.getRelativeTimeSpanString(time, System.currentTimeMillis(), 1000L, 262144).toString();
        TextView textView2 = c8261c.f44629a;
        textView2.setText(string);
        boolean z10 = c6479a.f37058g;
        View view = bVar.f7054a;
        View view2 = c8261c.f44633e;
        if (z10) {
            List<Integer> list2 = C6716m.f37937a;
            Context context = view.getContext();
            C5207g.m11110e(context, "itemView.context");
            textView2.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context));
            Context context2 = view.getContext();
            C5207g.m11110e(context2, "itemView.context");
            ((TextView) view2).setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context2));
            Context context3 = view.getContext();
            C5207g.m11110e(context3, "itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context3));
        } else {
            List<Integer> list3 = C6716m.f37937a;
            Context context4 = view.getContext();
            C5207g.m11110e(context4, "itemView.context");
            textView2.setTextColor(C8169a.m16216h(C6716m.m13333r(R.attr.secondaryTextColor, context4), 127));
            Context context5 = view.getContext();
            C5207g.m11110e(context5, "itemView.context");
            ((TextView) view2).setTextColor(C8169a.m16216h(C6716m.m13333r(R.attr.primaryTextColor, context5), 127));
            Context context6 = view.getContext();
            C5207g.m11110e(context6, "itemView.context");
            textView.setTextColor(C8169a.m16216h(C6716m.m13333r(R.attr.primaryTextColor, context6), 127));
        }
        ((ConstraintLayout) c8261c.f44630b).setOnClickListener(new ViewOnClickListenerC9029m(this, 6, c6479a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewInflate = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_notification, (ViewGroup) recyclerView, false);
        int i11 = R.id.ivNotification;
        ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivNotification);
        if (imageView != null) {
            i11 = R.id.tvDate;
            TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvDate);
            if (textView != null) {
                i11 = R.id.tvMessage;
                TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvMessage);
                if (textView2 != null) {
                    i11 = R.id.tvTitle;
                    TextView textView3 = (TextView) C0062b.m298P0(viewInflate, R.id.tvTitle);
                    if (textView3 != null) {
                        return new b(new C8261c((ConstraintLayout) viewInflate, imageView, textView, textView2, textView3));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }
}
