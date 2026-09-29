package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Locale;
import p000.dab;
import p000.fma;
import p000.gv5;
import p000.o38;
import p000.p28;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1062j extends p28 {

    /* JADX INFO: renamed from: d */
    public final MaterialCalendar f12946d;

    public C1062j(MaterialCalendar materialCalendar) {
        this.f12946d = materialCalendar;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: a */
    public final int mo6133a() {
        return this.f12946d.f12895y0.f12879f;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: e */
    public final void mo6135e(o38 o38Var, int i) {
        MaterialCalendar materialCalendar = this.f12946d;
        int i2 = materialCalendar.f12895y0.f12874a.f12901c + i;
        TextView textView = ((dab) o38Var).f35341u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(fma.m11944b().get(1) == i2 ? String.format(context.getString(R$string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R$string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        gv5 gv5Var = materialCalendar.f12883B0;
        if (fma.m11944b().get(1) == i2) {
            Object obj = gv5Var.f41394d;
        } else {
            Object obj2 = gv5Var.f41393c;
        }
        throw null;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: f */
    public final o38 mo6136f(ViewGroup viewGroup, int i) {
        return new dab((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_year, viewGroup, false));
    }
}
