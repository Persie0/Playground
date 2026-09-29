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
import p278nh.InterfaceC7792s;

/* JADX INFO: renamed from: xi.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10203k implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C10201i.a f51606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C10201i f51607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC7791r.q f51608c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f51609d;

    public C10203k(C10201i.a aVar, C10201i c10201i, AbstractC7791r.q qVar, int i10) {
        this.f51606a = aVar;
        this.f51607b = c10201i;
        this.f51608c = qVar;
        this.f51609d = i10;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        TextView textView = null;
        View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
        if (childAt instanceof TextView) {
            textView = (TextView) childAt;
        }
        if (textView != null) {
            textView.setGravity(8388613);
        }
        if (textView != null) {
            List<Integer> list = C6716m.f37937a;
            Context context = this.f51606a.f7054a.getContext();
            C5207g.m11110e(context, "holder.itemView.context");
            textView.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context));
        }
        InterfaceC7792s interfaceC7792s = this.f51607b.f51574e;
        AbstractC7791r.q qVar = this.f51608c;
        interfaceC7792s.mo9913e(qVar.f42862b.get(i10), qVar.f42863c.get(this.f51609d));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
        C5207g.m11111f(adapterView, "adapterView");
    }
}
