package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dmt implements Preference.OnPreferenceClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12051a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12052b;

    public /* synthetic */ dmt(Activity activity, int i) {
        this.f12052b = i;
        this.f12051a = activity;
    }

    public /* synthetic */ dmt(dmu dmuVar, int i) {
        this.f12052b = i;
        this.f12051a = dmuVar;
    }

    public /* synthetic */ dmt(ewp ewpVar, int i) {
        this.f12052b = i;
        this.f12051a = ewpVar;
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [fcp, java.lang.Object] */
    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        switch (this.f12052b) {
            case 0:
                lhd.m15332a(((dmu) this.f12051a).f12053a);
                return true;
            case 1:
                dmu dmuVar = (dmu) this.f12051a;
                int preferenceCount = dmuVar.f12055c.getPreferenceCount();
                SharedPreferences.Editor editorEdit = dmuVar.f12054b.edit();
                Iterator it = dmuVar.f12056d.iterator();
                while (it.hasNext()) {
                    editorEdit.remove(((Preference) ((dsx) it.next()).f12522b).getKey());
                }
                for (int i = 0; i < preferenceCount; i++) {
                    editorEdit.remove(dmuVar.f12055c.getPreference(i).getKey());
                }
                editorEdit.apply();
                dmuVar.f12055c.removeAll();
                dmuVar.m6411a(dmuVar.f12055c);
                return true;
            case 2:
                Object obj = this.f12051a;
                int i2 = ewp.f20659c;
                int i3 = cel.f5449a;
                Activity activity = (Activity) obj;
                Context applicationContext = activity.getApplicationContext();
                activity.getPackageName();
                cel.m3560b(applicationContext, activity);
                return true;
            case 3:
                Object obj2 = this.f12051a;
                int i4 = ewp.f20659c;
                int i5 = cel.f5449a;
                Activity activity2 = (Activity) obj2;
                cel.m3559a(activity2.getPackageName(), activity2.getApplicationContext());
                return true;
            case 4:
                ((ewp) this.f12051a).f20661b.f26481l.mo8165aj(2);
                return false;
            default:
                ((Activity) this.f12051a).startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
                return true;
        }
    }
}
