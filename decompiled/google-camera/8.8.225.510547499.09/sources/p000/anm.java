package p000;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anm implements anw {

    /* JADX INFO: renamed from: a */
    public static anm f1839a;

    /* JADX INFO: renamed from: b */
    public static anm f1840b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f1841c;

    public anm(int i) {
        this.f1841c = i;
    }

    @Override // p000.anw
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CharSequence mo1729a(Preference preference) {
        switch (this.f1841c) {
            case 0:
                ListPreference listPreference = (ListPreference) preference;
                return TextUtils.isEmpty(listPreference.m1477l()) ? listPreference.f1582j.getString(C0100R.string.not_set) : listPreference.m1477l();
            default:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                return TextUtils.isEmpty(editTextPreference.f1550g) ? editTextPreference.f1582j.getString(C0100R.string.not_set) : editTextPreference.f1550g;
        }
    }
}
