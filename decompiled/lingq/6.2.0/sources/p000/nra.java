package p000;

import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes3.dex */
public final class nra extends qra {

    /* JADX INFO: renamed from: a */
    public final ThemeSettingsTab f53174a;

    public nra(ThemeSettingsTab themeSettingsTab) {
        themeSettingsTab.getClass();
        this.f53174a = themeSettingsTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nra) && this.f53174a == ((nra) obj).f53174a;
    }

    public final int hashCode() {
        return this.f53174a.hashCode();
    }

    public final String toString() {
        return "UpdateThemeSettingsTab(tab=" + this.f53174a + ")";
    }
}
