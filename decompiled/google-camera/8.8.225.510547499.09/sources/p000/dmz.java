package p000;

import android.content.Context;
import android.preference.Preference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmz extends Preference {

    /* JADX INFO: renamed from: a */
    public SearchView f12067a;

    /* JADX INFO: renamed from: b */
    public SearchView.OnQueryTextListener f12068b;

    /* JADX INFO: renamed from: c */
    public CharSequence f12069c;

    public dmz(Context context) {
        super(context);
        this.f12069c = "";
    }

    @Override // android.preference.Preference
    protected final View onCreateView(ViewGroup viewGroup) {
        super.onCreateView(viewGroup);
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.search_view_preference, viewGroup, false);
        SearchView searchView = (SearchView) viewInflate.findViewById(C0100R.id.search_view);
        this.f12067a = searchView;
        searchView.setSubmitButtonEnabled(true);
        this.f12067a.setOnQueryTextListener(new dmx(this, 3));
        this.f12067a.setQuery(this.f12069c, true);
        return viewInflate;
    }
}
