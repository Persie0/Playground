package com.google.android.apps.camera.legacy.app.settings;

import android.os.Bundle;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.view.MenuItem;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import p000.AbstractC0118cx;
import p000.bos;
import p000.ewg;
import p000.ewh;
import p000.ewj;
import p000.fcp;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraMaterialSettingsActivity extends bos {

    /* JADX INFO: renamed from: q */
    public static final nbh f6789q = nbh.m17259h("com/google/android/apps/camera/legacy/app/settings/CameraMaterialSettingsActivity");

    /* JADX INFO: renamed from: r */
    private final Object f6790r = new Object();

    /* JADX INFO: renamed from: s */
    private ewj f6791s;

    /* JADX INFO: renamed from: t */
    private boolean f6792t;

    /* JADX INFO: renamed from: h */
    public static void m4196h(fcp fcpVar, Preference preference) {
        Object objValueOf;
        if (preference.f1590r.equals("pref_category_developer")) {
            return;
        }
        int i = 0;
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            while (i < preferenceGroup.m1532k()) {
                m4196h(fcpVar, preferenceGroup.m1534o(i));
                i++;
            }
            return;
        }
        if (preference.mo1521u() == null) {
            if (preference instanceof TwoStatePreference) {
                objValueOf = Boolean.valueOf(((TwoStatePreference) preference).f1626a);
            } else if (!(preference instanceof ListPreference)) {
                return;
            } else {
                objValueOf = ((ListPreference) preference).f1555i;
            }
            preference.mo1497O(new ewg(fcpVar, objValueOf, i));
        }
    }

    @Override // p000.bos, p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (!this.f6792t) {
            synchronized (this.f6790r) {
                if (!this.f6792t) {
                    ((CameraApp) getApplicationContext()).mo4194f();
                    this.f6792t = true;
                }
            }
        }
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("pref_screen_title");
        if (stringExtra == null) {
            setTitle(C0100R.string.pref_camera_settings_category);
        } else {
            setTitle(stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra(voNZjxiJou.LPRDTflPcgrnF);
        String stringExtra3 = getIntent().getStringExtra("pref_open_setting_page");
        boolean booleanExtra = getIntent().getBooleanExtra(xRFdVyfdeve.hZKfWNC, false);
        this.f6791s = new ewj();
        Bundle bundle2 = new Bundle(1);
        bundle2.putString(xPAWq.PpATLZChkEVeE, stringExtra2);
        bundle2.putString("pref_open_setting_page", stringExtra3);
        bundle2.putBoolean("pref_make_setting_page_root", booleanExtra);
        this.f6791s.setArguments(bundle2);
        AbstractC0118cx abstractC0118cxM5327i = m3206bA().m5327i();
        abstractC0118cxM5327i.m5702r(C0100R.id.content_frame, this.f6791s);
        abstractC0118cxM5327i.mo2021h();
        this.f47426g.m19328a(new ewh(this));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if ((getIntent().getFlags() & 33554432) != 0) {
                setResult(-1);
            }
            finish();
        }
        return true;
    }

    @Override // p000.ActivityC0080bz, p000.ActivityC0907pl, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    return;
                }
            }
            this.f6791s.m7942C();
        }
    }
}
