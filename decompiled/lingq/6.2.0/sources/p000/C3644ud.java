package p000;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.material.datepicker.C1060h;
import com.google.android.material.datepicker.C1061i;
import com.google.android.material.datepicker.DateValidatorPointForward;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* JADX INFO: renamed from: ud */
/* JADX INFO: loaded from: classes2.dex */
public final class C3644ud implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f63747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f63748c;

    public /* synthetic */ C3644ud(int i, Object obj, Object obj2) {
        this.f63746a = i;
        this.f63748c = obj;
        this.f63747b = obj2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.f63746a;
        Object obj = this.f63748c;
        Object obj2 = this.f63747b;
        switch (i2) {
            case 0:
                C3681vd c3681vd = (C3681vd) obj;
                C3792yd c3792yd = (C3792yd) obj2;
                c3681vd.f65221s.onClick(c3792yd.f69647b, i);
                if (c3681vd.f65223u) {
                    return;
                }
                c3792yd.f69647b.dismiss();
                return;
            default:
                MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) obj2;
                C1060h c1060hM6115b = materialCalendarGridView.m6115b();
                if (i < c1060hM6115b.m6129c() || i > c1060hM6115b.m6132f()) {
                    return;
                }
                if (materialCalendarGridView.m6115b().getItem(i).longValue() >= ((DateValidatorPointForward) ((C1061i) obj).f12941e.f12907a.f12895y0.f12876c).f12881a) {
                    throw null;
                }
                return;
        }
    }
}
