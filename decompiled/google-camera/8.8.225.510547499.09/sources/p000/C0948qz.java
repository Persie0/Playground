package p000;

import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: qz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0948qz {

    /* JADX INFO: renamed from: a */
    public final String f47514a;

    /* JADX INFO: renamed from: b */
    public final List f47515b;

    /* JADX INFO: renamed from: c */
    public final List f47516c;

    /* JADX INFO: renamed from: e */
    public final Map f47518e;

    /* JADX INFO: renamed from: g */
    public final Map f47520g;

    /* JADX INFO: renamed from: h */
    public final List f47521h;

    /* JADX INFO: renamed from: i */
    public final Map f47522i;

    /* JADX INFO: renamed from: l */
    private final C0967rr f47525l;

    /* JADX INFO: renamed from: m */
    private final C0950ra f47526m;

    /* JADX INFO: renamed from: n */
    private final C0735jb f47527n = null;

    /* JADX INFO: renamed from: d */
    public final int f47517d = 1;

    /* JADX INFO: renamed from: j */
    public final int f47523j = 1;

    /* JADX INFO: renamed from: f */
    public final int f47519f = 1;

    /* JADX INFO: renamed from: k */
    private final String f47524k = null;

    /* JADX INFO: renamed from: o */
    private final AmbientMode.AmbientController f47528o = null;

    public C0948qz(String str, List list, List list2, Map map, Map map2, List list3, Map map3, C0967rr c0967rr, C0950ra c0950ra) {
        this.f47514a = str;
        this.f47515b = list;
        this.f47516c = list2;
        this.f47518e = map;
        this.f47520g = map2;
        this.f47521h = list3;
        this.f47522i = map3;
        this.f47525l = c0967rr;
        this.f47526m = c0950ra;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0948qz)) {
            return false;
        }
        C0948qz c0948qz = (C0948qz) obj;
        if (!ooc.m18737c(this.f47514a, c0948qz.f47514a) || !ooc.m18737c(this.f47515b, c0948qz.f47515b) || !ooc.m18737c(this.f47516c, c0948qz.f47516c)) {
            return false;
        }
        C0735jb c0735jb = c0948qz.f47527n;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        int i = c0948qz.f47517d;
        if (!ooc.m18737c(this.f47518e, c0948qz.f47518e)) {
            return false;
        }
        int i2 = c0948qz.f47523j;
        int i3 = c0948qz.f47519f;
        if (!ooc.m18737c(this.f47520g, c0948qz.f47520g) || !ooc.m18737c(this.f47521h, c0948qz.f47521h) || !ooc.m18737c(this.f47522i, c0948qz.f47522i)) {
            return false;
        }
        String str = c0948qz.f47524k;
        AmbientMode.AmbientController ambientController = c0948qz.f47528o;
        return ooc.m18737c(null, null) && ooc.m18737c(this.f47525l, c0948qz.f47525l) && ooc.m18737c(this.f47526m, c0948qz.f47526m);
    }

    public final int hashCode() {
        return ((((((((((((((this.f47514a.hashCode() * 31) + this.f47515b.hashCode()) * 31) + 1) * 961) + 1) * 961) + 1) * 31) + 1) * 961) + 1) * 923521) + this.f47525l.hashCode()) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) C0952rc.m19373b(this.f47514a)) + ", streams=" + this.f47515b + ", streamSharingGroups=" + this.f47516c + ", input=" + ((Object) null) + ", sessionTemplate=" + ((Object) "RequestTemplate(value=1)") + ", sessionParameters=" + this.f47518e + ", sessionMode=" + ((Object) "NORMAL") + ", defaultTemplate=" + ((Object) "RequestTemplate(value=1)") + ", defaultParameters=" + this.f47520g + ", defaultListeners=" + this.f47521h + JrxsYuVZZqnFC.iXwhvcYMHqtJofs + this.f47522i + ", cameraBackendId=" + ((Object) "null") + ", customCameraBackend=" + ((Object) null) + ", metadataTransform=" + this.f47525l + HRLmc.apiPOhRy + this.f47526m + ')';
    }
}
