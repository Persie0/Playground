package p000;

import android.util.Log;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lpp extends lpv {
    public lpp(lpt lptVar, String str, Boolean bool, boolean z) {
        super(lptVar, str, bool, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.lpv
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15831a(Object obj) {
        if (jum.f34838c.matcher(obj).matches()) {
            return true;
        }
        if (jum.f34839d.matcher(obj).matches()) {
            return false;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.m15846f() + hsSUWRJfoeC.mkXSIfoH + ((String) obj));
        return null;
    }
}
