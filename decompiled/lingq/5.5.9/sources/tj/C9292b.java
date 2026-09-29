package tj;

import android.content.Context;
import android.support.v4.media.C0141b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.DailyGoal;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p225kk.C6716m;
import p278nh.AbstractC7790q;
import p278nh.InterfaceC7774a;

/* JADX INFO: renamed from: tj.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9292b extends AbstractC7790q<a> {

    /* JADX INFO: renamed from: e */
    public InterfaceC7774a<a> f47996e;

    /* JADX INFO: renamed from: tj.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Integer f47997a;

        /* JADX INFO: renamed from: b */
        public final Integer f47998b;

        /* JADX INFO: renamed from: c */
        public final String f47999c;

        /* JADX INFO: renamed from: d */
        public final String f48000d;

        public a(Integer num, Integer num2, String str, String str2) {
            this.f47997a = num;
            this.f47998b = num2;
            this.f47999c = str;
            this.f48000d = str2;
        }
    }

    /* JADX INFO: renamed from: tj.b$b */
    public static final class b extends AbstractC7790q.a {

        /* JADX INFO: renamed from: u */
        public final TextView f48001u;

        /* JADX INFO: renamed from: v */
        public final TextView f48002v;

        /* JADX INFO: renamed from: w */
        public final TextView f48003w;

        public b(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tv_btn);
            C5207g.m11110e(viewFindViewById, "itemView.findViewById(R.id.tv_btn)");
            this.f48001u = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tv_desc_btn);
            C5207g.m11110e(viewFindViewById2, "itemView.findViewById(R.id.tv_desc_btn)");
            this.f48002v = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tv_coin);
            C5207g.m11110e(viewFindViewById3, "itemView.findViewById(R.id.tv_coin)");
            this.f48003w = (TextView) viewFindViewById3;
        }
    }

    public C9292b(Context context) {
        this.f42818d = new ArrayList<>();
        ArrayList<AbstractC7790q.b> arrayListM15496q = m15496q();
        DailyGoal[] dailyGoalArrValues = DailyGoal.values();
        ArrayList arrayList = new ArrayList(dailyGoalArrValues.length);
        for (DailyGoal dailyGoal : dailyGoalArrValues) {
            C5207g.m11111f(dailyGoal, "<this>");
            Integer numValueOf = Integer.valueOf(dailyGoal.getCoins());
            Integer numValueOf2 = Integer.valueOf(dailyGoal.getCoins());
            List<Integer> list = C6716m.f37937a;
            String strM13319d = C6716m.m13319d(dailyGoal.getDesc(), context);
            Locale locale = Locale.getDefault();
            String string = context.getString(dailyGoal.getDescExtra());
            C5207g.m11110e(string, "context.getString(this.descExtra)");
            Object[] objArr = new Object[1];
            int mins = dailyGoal.getMins();
            int mins2 = dailyGoal.getMins();
            if (mins >= 60) {
                mins2 /= 60;
            }
            objArr[0] = Integer.valueOf(mins2);
            arrayList.add(new AbstractC7790q.b(0, new a(numValueOf, numValueOf2, strM13319d, C0141b.m613i(objArr, 1, locale, string, "format(locale, format, *args)"))));
        }
        arrayListM15496q.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return m15496q().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, final int i10) {
        AbstractC7790q.a aVar = (AbstractC7790q.a) abstractC1109b0;
        b bVar = (b) aVar;
        Object obj = m15495p(i10).f42820b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.ui.onboarding.adapters.ChooseDailyGoalAdapter.GoalItem");
        a aVar2 = (a) obj;
        bVar.f48001u.setText(aVar2.f47999c);
        bVar.f48002v.setText(aVar2.f48000d);
        Integer num = aVar2.f47997a;
        bVar.f48003w.setText(num != null ? num.toString() : null);
        aVar.f7054a.setOnClickListener(new View.OnClickListener() { // from class: tj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9292b c9292b = this.f47994a;
                C5207g.m11111f(c9292b, "this$0");
                InterfaceC7774a<C9292b.a> interfaceC7774a = c9292b.f47996e;
                if (interfaceC7774a != null) {
                    Object obj2 = c9292b.m15495p(i10).f42820b;
                    C5207g.m11109d(obj2, "null cannot be cast to non-null type com.lingq.ui.onboarding.adapters.ChooseDailyGoalAdapter.GoalItem");
                    interfaceC7774a.mo9795a((C9292b.a) obj2);
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.list_item_onboarding_daily_goal, (ViewGroup) recyclerView, false);
        C5207g.m11110e(viewInflate, "from(parent.context)\n   …aily_goal, parent, false)");
        return new b(viewInflate);
    }
}
