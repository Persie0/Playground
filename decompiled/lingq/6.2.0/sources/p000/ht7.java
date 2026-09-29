package p000;

import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes3.dex */
public final class ht7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final ThemeSettingsTab f42931a;

    public ht7(ThemeSettingsTab themeSettingsTab) {
        themeSettingsTab.getClass();
        this.f42931a = themeSettingsTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht7) && this.f42931a == ((ht7) obj).f42931a;
    }

    public final int hashCode() {
        return this.f42931a.hashCode();
    }

    public final String toString() {
        return "UpdateThemeSettingsTab(tab=" + this.f42931a + ")";
    }
}
