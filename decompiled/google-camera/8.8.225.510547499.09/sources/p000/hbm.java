package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbm extends jxd {

    /* JADX INFO: renamed from: a */
    private final mtz f27152a;

    public hbm(Resources resources, hai haiVar) {
        super(haiVar.mo10030b(gzy.f27051j));
        this.f27152a = mwh.m17063c(hbl.SHUTTER, resources.getString(C0100R.string.preference_volume_key_shutter), hbl.ZOOM, resources.getString(C0100R.string.preference_volume_key_zoom), hbl.VOLUME, resources.getString(C0100R.string.preference_volume_key_volume), hbl.OFF, resources.getString(C0100R.string.preference_volume_key_off));
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3609b(Object obj) {
        hbl hblVar = (hbl) ((mzq) this.f27152a).f41853c.get((String) obj);
        return hblVar != null ? hblVar : hbl.SHUTTER;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final /* bridge */ /* synthetic */ Object mo3610c(Object obj) {
        String str = (String) this.f27152a.get((hbl) obj);
        lku.m15662p(str);
        return str;
    }
}
