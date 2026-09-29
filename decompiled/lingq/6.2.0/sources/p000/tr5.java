package p000;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.C1061i;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes2.dex */
public final class tr5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1061i f62769b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MaterialCalendar f62770c;

    public /* synthetic */ tr5(MaterialCalendar materialCalendar, C1061i c1061i, int i) {
        this.f62768a = i;
        this.f62770c = materialCalendar;
        this.f62769b = c1061i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f62768a;
        C1061i c1061i = this.f62769b;
        MaterialCalendar materialCalendar = this.f62770c;
        switch (i) {
            case 0:
                int iM2666T0 = ((LinearLayoutManager) materialCalendar.f12885D0.getLayoutManager()).m2666T0();
                c1061i.f12945i = 2;
                materialCalendar.m6109e0(c1061i.m6137k(iM2666T0 + 1));
                break;
            default:
                int iM2667U0 = ((LinearLayoutManager) materialCalendar.f12885D0.getLayoutManager()).m2667U0();
                c1061i.f12945i = 1;
                materialCalendar.m6109e0(c1061i.m6137k(iM2667U0 - 1));
                break;
        }
    }
}
