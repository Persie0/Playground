package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jaz extends izs {

    /* JADX INFO: renamed from: a */
    protected String f33636a;

    /* JADX INFO: renamed from: c */
    protected String f33637c;

    /* JADX INFO: renamed from: d */
    protected boolean f33638d;

    /* JADX INFO: renamed from: e */
    protected int f33639e;

    /* JADX INFO: renamed from: f */
    public boolean f33640f;

    /* JADX INFO: renamed from: g */
    public boolean f33641g;

    public jaz(izv izvVar) {
        super(izvVar);
    }

    @Override // p000.izs
    /* JADX INFO: renamed from: a */
    protected final void mo11918a() {
        ApplicationInfo applicationInfo;
        int i;
        int i2;
        Context contextM11924d = m11924d();
        try {
            applicationInfo = contextM11924d.getPackageManager().getApplicationInfo(contextM11924d.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            m11940u("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            m11939t("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
            return;
        }
        izv izvVar = this.f32723b;
        jan janVarM12876u = jbx.m12876u(i, new ihk(izvVar), new izr(izvVar));
        if (janVarM12876u != null) {
            m11936q("Loading global XML config values");
            String str = janVarM12876u.f33605a;
            if (str != null) {
                this.f33637c = str;
                m11932m("XML config - app name", str);
            }
            String str2 = janVarM12876u.f33606b;
            if (str2 != null) {
                this.f33636a = str2;
                m11932m(VCYBIzY.CTMwMNZLjDYCbEv, str2);
            }
            String str3 = janVarM12876u.f33607c;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.US);
                if ("verbose".equals(lowerCase)) {
                    i2 = 0;
                } else if ("info".equals(lowerCase)) {
                    i2 = 1;
                } else if ("warning".equals(lowerCase)) {
                    i2 = 2;
                } else {
                    i2 = "error".equals(lowerCase) ? 3 : -1;
                }
                if (i2 >= 0) {
                    m11937r("XML config - log level", Integer.valueOf(i2));
                }
            }
            int i3 = janVarM12876u.f33608d;
            if (i3 >= 0) {
                this.f33639e = i3;
                this.f33638d = true;
                m11932m(PMZiHihxLGEy.DPBsYA, Integer.valueOf(i3));
            }
            int i4 = janVarM12876u.f33609e;
            if (i4 != -1) {
                boolean z = 1 == i4;
                this.f33641g = z;
                this.f33640f = true;
                m11932m("XML config - dry run", Boolean.valueOf(z));
            }
        }
    }
}
