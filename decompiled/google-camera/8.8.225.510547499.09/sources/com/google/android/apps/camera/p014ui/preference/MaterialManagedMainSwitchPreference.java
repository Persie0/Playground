package com.google.android.apps.camera.p014ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.android.settingslib.widget.MainSwitchPreference;
import java.util.function.Function;
import p000.ant;
import p000.emv;
import p000.gzw;
import p000.had;
import p000.hah;
import p000.iee;
import p000.ieg;
import p000.ieh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MaterialManagedMainSwitchPreference extends MainSwitchPreference implements ant, iee {

    /* JADX INFO: renamed from: c */
    public had f7134c;

    /* JADX INFO: renamed from: d */
    public hah f7135d;

    /* JADX INFO: renamed from: e */
    public ant f7136e;

    /* JADX INFO: renamed from: f */
    private Function f7137f;

    public MaterialManagedMainSwitchPreference(Context context) {
        super(context);
        this.f7136e = ieg.f30547a;
        m4421aj(context);
    }

    /* JADX INFO: renamed from: aj */
    private final void m4421aj(Context context) {
        ((ieh) ((emv) context.getApplicationContext()).mo4193e(ieh.class)).mo7829x(this);
        m1514ae();
        gzw gzwVarM10023a = gzw.m10023a(this.f1590r);
        if (gzwVarM10023a != null) {
            this.f1594v = this.f7135d.mo10031c(gzwVarM10023a);
            this.f7134c.mo10045l(this.f1590r, ((Boolean) this.f7135d.mo10031c(gzwVarM10023a)).booleanValue());
        } else {
            this.f1594v = Boolean.valueOf(this.f7134c.mo10046m(this.f1590r));
        }
        this.f1586n = this;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: O */
    public final void mo1497O(ant antVar) {
        this.f7136e = antVar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: X */
    public final boolean mo1506X(boolean z) {
        return this.f7134c.mo10046m(this.f1590r);
    }

    @Override // p000.iee
    /* JADX INFO: renamed from: ag */
    public final void mo4417ag(Function function) {
        this.f7137f = function;
    }

    @Override // p000.ant
    /* JADX INFO: renamed from: b */
    public final boolean mo1734b(Preference preference, Object obj) {
        this.f7134c.mo10045l(this.f1590r, ((Boolean) obj).booleanValue());
        return this.f7136e.mo1734b(preference, obj);
    }

    @Override // androidx.preference.TwoStatePreference, androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected final void mo1468c() {
        Function function = this.f7137f;
        if (function == null || !((Boolean) function.apply(this)).booleanValue()) {
            super.mo1468c();
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: u */
    public final ant mo1521u() {
        return this.f7136e;
    }

    public MaterialManagedMainSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7136e = ieg.f30547a;
        m4421aj(context);
    }

    public MaterialManagedMainSwitchPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7136e = ieg.f30547a;
        m4421aj(context);
    }
}
