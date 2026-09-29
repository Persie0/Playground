package p487xi;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import p225kk.C6716m;
import p278nh.AbstractC7791r;

/* JADX INFO: renamed from: xi.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C10205m implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C10201i.a f51614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C10201i f51615b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC7791r.f f51616c;

    public C10205m(C10201i.a aVar, C10201i c10201i, AbstractC7791r.f fVar) {
        this.f51614a = aVar;
        this.f51615b = c10201i;
        this.f51616c = fVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
        TextView textView = childAt instanceof TextView ? (TextView) childAt : null;
        if (textView != null) {
            textView.setGravity(8388613);
        }
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            Context context = this.f51614a.f7054a.getContext();
            C5207g.m11110e(context, "holder.itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context));
        }
        this.f51615b.f51574e.mo9909a(this.f51616c.f42832b.get(i10));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C5207g.m11111f(adapterView, "adapterView");
    }
}
