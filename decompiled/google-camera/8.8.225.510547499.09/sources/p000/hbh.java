package p000;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class hbh {

    /* JADX INFO: renamed from: a */
    public static final nbh f27138a = nbh.m17259h("com/google/android/apps/camera/settings/upgrader/SettingsUpgrader");

    /* JADX INFO: renamed from: b */
    private final String f27139b;

    /* JADX INFO: renamed from: c */
    private final int f27140c;

    public hbh(String str, int i) {
        this.f27139b = str;
        this.f27140c = i;
    }

    /* JADX INFO: renamed from: c */
    protected static final String m10085c(SharedPreferences sharedPreferences, String str) {
        String string = null;
        try {
            string = sharedPreferences.getString(str, null);
        } catch (ClassCastException e) {
            ((nbe) ((nbe) ((nbe) f27138a.m17251b()).mo17283h(e)).mo17276G((char) 3412)).mo17290o("error reading old value, removing and returning default");
        }
        sharedPreferences.edit().remove(str).apply();
        return string;
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo8605a(had hadVar, int i);

    /* JADX INFO: renamed from: b */
    protected int mo10057b(had hadVar) {
        return hadVar.mo10035b(this.f27139b, Integer.valueOf(this.f27140c));
    }

    /* JADX INFO: renamed from: d */
    public final void m10086d(had hadVar) throws Exception {
        try {
            int iMo10057b = mo10057b(hadVar);
            if (iMo10057b != this.f27140c) {
                mo8605a(hadVar, iMo10057b);
            }
            hadVar.mo10042i(this.f27139b, this.f27140c);
        } catch (Exception e) {
            ((nbe) ((nbe) ((nbe) f27138a.m17251b()).mo17283h(e)).mo17276G((char) 3413)).mo17290o("exception during upgrade");
            throw e;
        }
    }
}
