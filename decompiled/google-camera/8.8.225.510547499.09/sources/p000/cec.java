package p000;

import android.app.Activity;
import android.util.ArrayMap;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cec {

    /* JADX INFO: renamed from: f */
    private static final mws f5408f = mws.m17100o("android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");

    /* JADX INFO: renamed from: g */
    private static final mws f5409g;

    /* JADX INFO: renamed from: a */
    public final Activity f5410a;

    /* JADX INFO: renamed from: b */
    public final hai f5411b;

    /* JADX INFO: renamed from: c */
    public final jvd f5412c;

    /* JADX INFO: renamed from: d */
    public final Map f5413d = new ArrayMap();

    /* JADX INFO: renamed from: e */
    public final mws f5414e;

    static {
        mws.m17099n("android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE");
        f5409g = mws.m17098m(WIxTIdUIdfb.KhaV, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public cec(Activity activity, hai haiVar, jvd jvdVar, dja djaVar) {
        this.f5410a = activity;
        this.f5411b = haiVar;
        this.f5412c = jvdVar;
        mwn mwnVarM17090e = mws.m17090e();
        mwnVarM17090e.m17083h(f5408f);
        mwnVarM17090e.m17083h(f5409g);
        if (djaVar != dja.RELEASE) {
            mwnVarM17090e.m17082g("android.permission.POST_NOTIFICATIONS");
        }
        this.f5414e = mwnVarM17090e.m17081f();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3543a(String str) {
        return this.f5410a.checkSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: b */
    final boolean m3544b() {
        mws mwsVar = f5408f;
        int i = ((mzr) mwsVar).f41859c;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) mwsVar.get(i2);
            if (this.f5413d.containsKey(str)) {
                Boolean bool = (Boolean) this.f5413d.get(str);
                bool.getClass();
                i2++;
                if (!bool.booleanValue()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    final boolean m3545c() {
        mws mwsVar = f5409g;
        int i = ((mzr) mwsVar).f41859c;
        int i2 = 0;
        while (i2 < i) {
            String str = (String) mwsVar.get(i2);
            if (!this.f5413d.containsKey(str)) {
                this.f5413d.put(str, Boolean.valueOf(m3543a(str)));
            }
            Boolean bool = (Boolean) this.f5413d.get(str);
            bool.getClass();
            i2++;
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
