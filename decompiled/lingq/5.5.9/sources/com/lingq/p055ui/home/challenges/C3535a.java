package com.lingq.p055ui.home.challenges;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p225kk.C6716m;

/* JADX INFO: renamed from: com.lingq.ui.home.challenges.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C3535a implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ChallengeDetailAdapter.AbstractC3481a f23138a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ChallengeDetailAdapter.AbstractC3482b.d f23139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List<String> f23140c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ChallengeDetailAdapter f23141d;

    public C3535a(ChallengeDetailAdapter.AbstractC3481a abstractC3481a, ChallengeDetailAdapter.AbstractC3482b.d dVar, ArrayList arrayList, ChallengeDetailAdapter challengeDetailAdapter) {
        this.f23138a = abstractC3481a;
        this.f23139b = dVar;
        this.f23140c = arrayList;
        this.f23141d = challengeDetailAdapter;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        Object obj = null;
        View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        ChallengeDetailAdapter.AbstractC3481a abstractC3481a = this.f23138a;
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            Context context = abstractC3481a.f7054a.getContext();
            C5207g.m11110e(context, "holder.itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context));
        }
        for (Object obj2 : this.f23139b.f22851b.getSorts()) {
            if (C5207g.m11106a(abstractC3481a.f7054a.getContext().getString(((LeaderboardMetric) obj2).getValue()), this.f23140c.get(i10))) {
                obj = obj2;
                break;
            }
        }
        LeaderboardMetric leaderboardMetric = (LeaderboardMetric) obj;
        if (leaderboardMetric != null) {
            this.f23141d.f22835e.mo9781a(leaderboardMetric);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C5207g.m11111f(adapterView, "adapterView");
    }
}
