package p000;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes2.dex */
public final class mc0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51052a;

    /* JADX INFO: renamed from: b */
    public boolean f51053b;

    /* JADX INFO: renamed from: c */
    public String f51054c;

    public mc0(boolean z, String str) {
        this.f51052a = 1;
        this.f51053b = z;
        this.f51054c = str;
    }

    /* JADX INFO: renamed from: a */
    public void m16757a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(sy2.m21766a()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f51054c);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f51053b);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: b */
    public String m16758b() {
        return this.f51054c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16759c() {
        return this.f51053b;
    }

    public String toString() {
        switch (this.f51052a) {
            case 2:
                String str = this.f51054c;
                String str2 = this.f51053b ? "Applink" : "Unclassified";
                if (str == null) {
                    return str2;
                }
                return str2 + '(' + str + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ mc0(String str, int i, boolean z) {
        this.f51052a = i;
        this.f51054c = str;
        this.f51053b = z;
    }
}
