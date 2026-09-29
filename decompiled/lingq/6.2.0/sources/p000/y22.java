package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class y22 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Calendar f69118a;

    /* JADX INFO: renamed from: b */
    public final int f69119b;

    /* JADX INFO: renamed from: c */
    public final int f69120c;

    public y22() {
        Calendar calendarM11945c = fma.m11945c(null);
        this.f69118a = calendarM11945c;
        this.f69119b = calendarM11945c.getMaximum(7);
        this.f69120c = calendarM11945c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f69119b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f69119b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f69120c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f69120c;
        int i3 = this.f69119b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f69118a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R$string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public y22(int i) {
        Calendar calendarM11945c = fma.m11945c(null);
        this.f69118a = calendarM11945c;
        this.f69119b = calendarM11945c.getMaximum(7);
        this.f69120c = i;
    }
}
