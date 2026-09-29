package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import java.util.Calendar;
import p000.C3386nv;
import p000.fma;
import p000.o38;
import p000.p28;
import p000.web;
import p000.y16;
import p000.z28;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1061i extends p28 {

    /* JADX INFO: renamed from: d */
    public final CalendarConstraints f12940d;

    /* JADX INFO: renamed from: e */
    public final C1055c f12941e;

    /* JADX INFO: renamed from: f */
    public final web f12942f;

    /* JADX INFO: renamed from: g */
    public final int f12943g;

    /* JADX INFO: renamed from: h */
    public Month f12944h;

    /* JADX INFO: renamed from: i */
    public int f12945i = 0;

    public C1061i(ContextThemeWrapper contextThemeWrapper, CalendarConstraints calendarConstraints, C1055c c1055c, web webVar) {
        Month month = calendarConstraints.f12874a;
        Month month2 = calendarConstraints.f12875b;
        Month month3 = calendarConstraints.f12877d;
        if (month.f12899a.compareTo(month3.f12899a) > 0) {
            C3386nv.m17626m("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.f12899a.compareTo(month2.f12899a) > 0) {
            C3386nv.m17626m("currentPage cannot be after lastPage");
            throw null;
        }
        this.f12943g = (contextThemeWrapper.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * C1060h.f12935d) + (C1058f.m6125n0(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) : 0);
        this.f12940d = calendarConstraints;
        this.f12941e = c1055c;
        this.f12942f = webVar;
        this.f12944h = month3;
        if (this.f55486a.m19617a()) {
            C3386nv.m17633t("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f55487b = true;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: a */
    public final int mo6133a() {
        return this.f12940d.f12880g;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: b */
    public final long mo6134b(int i) {
        Calendar calendarM11943a = fma.m11943a(this.f12940d.f12874a.f12899a);
        calendarM11943a.add(2, i);
        return new Month(calendarM11943a).f12899a.getTimeInMillis();
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: e */
    public final void mo6135e(o38 o38Var, int i) {
        y16 y16Var = (y16) o38Var;
        CalendarConstraints calendarConstraints = this.f12940d;
        Calendar calendarM11943a = fma.m11943a(calendarConstraints.f12874a.f12899a);
        calendarM11943a.add(2, i);
        Month month = new Month(calendarM11943a);
        y16Var.f69092u.setText(month.m6120c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) y16Var.f69093v.findViewById(R$id.month_grid);
        if (materialCalendarGridView.m6115b() == null || !month.equals(materialCalendarGridView.m6115b().f12937a)) {
            new C1060h(month, calendarConstraints);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m6115b().getClass();
        throw null;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: f */
    public final o38 mo6136f(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C1058f.m6125n0(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new y16(linearLayout, false);
        }
        linearLayout.setLayoutParams(new z28(-1, this.f12943g));
        return new y16(linearLayout, true);
    }

    /* JADX INFO: renamed from: k */
    public final Month m6137k(int i) {
        Calendar calendarM11943a = fma.m11943a(this.f12940d.f12874a.f12899a);
        calendarM11943a.add(2, i);
        return new Month(calendarM11943a);
    }

    /* JADX INFO: renamed from: l */
    public final int m6138l(Month month) {
        return this.f12940d.f12874a.m6121d(month);
    }
}
