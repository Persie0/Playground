package p000;

import android.widget.SearchView;
import com.google.android.apps.camera.debug.p010ui.MaterialSearchViewPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmx implements SearchView.OnQueryTextListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f12061a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f12062b;

    public dmx(MaterialSearchViewPreference materialSearchViewPreference, int i) {
        this.f12062b = i;
        this.f12061a = materialSearchViewPreference;
    }

    public dmx(dmu dmuVar, int i) {
        this.f12062b = i;
        this.f12061a = dmuVar;
    }

    public dmx(dmy dmyVar, int i) {
        this.f12062b = i;
        this.f12061a = dmyVar;
    }

    public dmx(dmz dmzVar, int i) {
        this.f12062b = i;
        this.f12061a = dmzVar;
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String str) {
        switch (this.f12062b) {
            case 0:
                ((dmy) this.f12061a).m6414b(str);
                return false;
            case 1:
                ((dmu) this.f12061a).m6412b(str);
                return false;
            case 2:
                MaterialSearchViewPreference materialSearchViewPreference = (MaterialSearchViewPreference) this.f12061a;
                materialSearchViewPreference.f6609c = str;
                SearchView.OnQueryTextListener onQueryTextListener = materialSearchViewPreference.f6608b;
                return onQueryTextListener != null && onQueryTextListener.onQueryTextChange(str);
            default:
                dmz dmzVar = (dmz) this.f12061a;
                dmzVar.f12069c = str;
                SearchView.OnQueryTextListener onQueryTextListener2 = dmzVar.f12068b;
                return onQueryTextListener2 != null && onQueryTextListener2.onQueryTextChange(str);
        }
    }

    @Override // android.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String str) {
        boolean zOnQueryTextSubmit;
        switch (this.f12062b) {
            case 0:
                ((dmy) this.f12061a).m6414b(str);
                return true;
            case 1:
                ((dmu) this.f12061a).m6412b(str);
                return true;
            case 2:
                MaterialSearchViewPreference materialSearchViewPreference = (MaterialSearchViewPreference) this.f12061a;
                materialSearchViewPreference.f6609c = str;
                SearchView.OnQueryTextListener onQueryTextListener = materialSearchViewPreference.f6608b;
                zOnQueryTextSubmit = onQueryTextListener != null ? onQueryTextListener.onQueryTextSubmit(str) : false;
                ((MaterialSearchViewPreference) this.f12061a).f6607a.clearFocus();
                return zOnQueryTextSubmit;
            default:
                dmz dmzVar = (dmz) this.f12061a;
                dmzVar.f12069c = str;
                SearchView.OnQueryTextListener onQueryTextListener2 = dmzVar.f12068b;
                zOnQueryTextSubmit = onQueryTextListener2 != null ? onQueryTextListener2.onQueryTextSubmit(str) : false;
                ((dmz) this.f12061a).f12067a.clearFocus();
                return zOnQueryTextSubmit;
        }
    }
}
