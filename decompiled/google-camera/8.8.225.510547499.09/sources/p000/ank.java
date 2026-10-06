package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ank extends Preference {

    /* JADX INFO: renamed from: a */
    private long f1837a;

    public ank(Context context, List list, long j) {
        super(context);
        this.f1559A = C0100R.layout.expand_button;
        m1494L(C0100R.drawable.ic_arrow_down_24dp);
        m1501S(C0100R.string.expand_button_title);
        m1498P(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequence = preference.f1589q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.f1562D)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                string = string == null ? charSequence : this.f1582j.getString(C0100R.string.summary_collapsed_preference_list, string, charSequence);
            }
        }
        mo1479n(string);
        this.f1837a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        aorVar.f1918u = false;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: aR */
    public final long mo1509aR() {
        return this.f1837a;
    }
}
