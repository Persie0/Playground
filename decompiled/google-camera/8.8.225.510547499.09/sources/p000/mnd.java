package p000;

import com.google.android.gms.common.api.Status;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mnd extends jdv {
    /* JADX WARN: Illegal instructions before constructor call */
    public mnd(int i) {
        String str;
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        Map map = mne.f41099a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf) && mne.f41100b.containsKey(numValueOf)) {
            str = ((String) mne.f41099a.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#" + ((String) mne.f41100b.get(numValueOf)) + ")";
        } else {
            str = "";
        }
        objArr[1] = str;
        super(new Status(i, String.format(locale, "Install Error(%d): %s", objArr)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
