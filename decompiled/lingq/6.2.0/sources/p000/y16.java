package p000;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$id;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class y16 extends o38 {

    /* JADX INFO: renamed from: u */
    public final TextView f69092u;

    /* JADX INFO: renamed from: v */
    public final MaterialCalendarGridView f69093v;

    public y16(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R$id.month_title);
        this.f69092u = textView;
        WeakHashMap weakHashMap = dta.f36217a;
        new ssa(androidx.core.R$id.tag_accessibility_heading, 3).m22871e(textView, Boolean.TRUE);
        this.f69093v = (MaterialCalendarGridView) linearLayout.findViewById(R$id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
