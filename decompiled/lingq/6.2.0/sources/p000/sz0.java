package p000;

import androidx.datastore.core.DataMigration;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class sz0 implements DataMigration {
    @Override // androidx.datastore.core.DataMigration
    public final Object cleanUp(Continuation continuation) {
        return xfa.f68157a;
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object migrate(Object obj, Continuation continuation) {
        Double d;
        Integer num;
        Preferences preferences = (Preferences) obj;
        MutablePreferences mutablePreferences = preferences.toMutablePreferences();
        Preferences.Key key = rz0.f60063c;
        if (preferences.get(key) == null && (num = (Integer) preferences.get(rz0.f60061a)) != null) {
            if (num.intValue() == 21) {
                num = null;
            }
            if (num != null) {
                mutablePreferences.set(key, new Integer(num.intValue()));
            }
        }
        Preferences.Key key2 = rz0.f60064d;
        if (preferences.get(key2) == null && (d = (Double) preferences.get(rz0.f60062b)) != null) {
            Double d2 = d.doubleValue() != 1.4d ? d : null;
            if (d2 != null) {
                mutablePreferences.set(key2, new Double(d2.doubleValue()));
            }
        }
        mutablePreferences.set(rz0.f60065e, Boolean.TRUE);
        return mutablePreferences.toPreferences();
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object shouldMigrate(Object obj, Continuation continuation) {
        return Boolean.valueOf(!fa4.m11650l(((Preferences) obj).get(rz0.f60065e), Boolean.TRUE));
    }
}
