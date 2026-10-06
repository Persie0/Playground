package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dmw implements anu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f12059a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12060b;

    public /* synthetic */ dmw(Activity activity, int i) {
        this.f12060b = i;
        this.f12059a = activity;
    }

    public /* synthetic */ dmw(dmy dmyVar, int i) {
        this.f12060b = i;
        this.f12059a = dmyVar;
    }

    public /* synthetic */ dmw(ewj ewjVar, int i) {
        this.f12060b = i;
        this.f12059a = ewjVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // p000.anu
    /* JADX INFO: renamed from: a */
    public final boolean mo1735a() {
        switch (this.f12060b) {
            case 0:
                lhd.m15332a((Context) ((dmy) this.f12059a).f12063a);
                return true;
            case 1:
                dmy dmyVar = (dmy) this.f12059a;
                int iM1532k = ((PreferenceGroup) dmyVar.f12065c).m1532k();
                SharedPreferences.Editor editorEdit = dmyVar.f12064b.edit();
                Iterator it = dmyVar.f12066d.iterator();
                while (it.hasNext()) {
                    editorEdit.remove(((Preference) ((dsx) it.next()).f12522b).f1590r);
                }
                for (int i = 0; i < iM1532k; i++) {
                    editorEdit.remove(((PreferenceGroup) dmyVar.f12065c).m1534o(i).f1590r);
                }
                editorEdit.apply();
                ((PreferenceGroup) dmyVar.f12065c).m1527ag();
                dmyVar.m6413a((PreferenceScreen) dmyVar.f12065c);
                return true;
            case 2:
                ((ewj) this.f12059a).f20632ae.f20646h.mo8165aj(2);
                return false;
            case 3:
                Object obj = this.f12059a;
                int i2 = cel.f5449a;
                Activity activity = (Activity) obj;
                Context applicationContext = activity.getApplicationContext();
                activity.getPackageName();
                cel.m3560b(applicationContext, activity);
                return true;
            case 4:
                Object obj2 = this.f12059a;
                int i3 = cel.f5449a;
                Activity activity2 = (Activity) obj2;
                cel.m3559a(activity2.getPackageName(), activity2.getApplicationContext());
                return true;
            default:
                ((Activity) this.f12059a).startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
                return true;
        }
    }
}
