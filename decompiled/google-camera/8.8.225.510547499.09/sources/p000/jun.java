package p000;

import android.content.ContentResolver;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jun extends jup {
    public jun(String str, Boolean bool) {
        super(str, bool);
    }

    @Override // p000.jup
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo13520a() {
        boolean zBooleanValue;
        ContentResolver contentResolver = jup.f34849a;
        String str = this.f34850b;
        boolean zBooleanValue2 = ((Boolean) this.f34851c).booleanValue();
        Object objM13514c = jum.m13514c(contentResolver);
        Boolean bool = (Boolean) jum.m13513b(jum.f34842g, str, Boolean.valueOf(zBooleanValue2));
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            String strM13517f = jum.m13517f(contentResolver, str);
            if (strM13517f != null && !strM13517f.equals("")) {
                if (jum.f34838c.matcher(strM13517f).matches()) {
                    zBooleanValue2 = true;
                    bool = true;
                } else if (jum.f34839d.matcher(strM13517f).matches()) {
                    zBooleanValue2 = false;
                    bool = false;
                } else {
                    Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + strM13517f + "\") as boolean");
                }
            }
            jum.m13516e(objM13514c, jum.f34842g, str, bool);
            zBooleanValue = zBooleanValue2;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
