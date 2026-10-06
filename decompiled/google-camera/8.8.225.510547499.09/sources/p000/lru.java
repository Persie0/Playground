package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lru extends ComponentCallbacksC0077bw implements amc {

    /* JADX INFO: renamed from: a */
    public LicenseMenuActivity f39105a;

    /* JADX INFO: renamed from: b */
    private ArrayAdapter f39106b;

    @Override // p000.amc
    /* JADX INFO: renamed from: a */
    public final amk mo933a() {
        return new lrs(getActivity());
    }

    @Override // p000.amc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo934b(Object obj) {
        this.f39106b.clear();
        this.f39106b.addAll((List) obj);
        this.f39106b.notifyDataSetChanged();
    }

    @Override // p000.amc
    /* JADX INFO: renamed from: c */
    public final void mo935c() {
        this.f39106b.clear();
        this.f39106b.notifyDataSetChanged();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onAttach(Context context) {
        super.onAttach(context);
        ActivityC0080bz activity = getActivity();
        if (activity instanceof LicenseMenuActivity) {
            this.f39105a = (LicenseMenuActivity) activity;
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0100R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDestroy() {
        super.onDestroy();
        amd amdVarM936a = amd.m936a(getActivity());
        if (amdVarM936a.f681a.f693c) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (amd.m937b(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("destroyLoader in ");
            sb.append(amdVarM936a);
            sb.append(" of 54321");
        }
        ame ameVarM943a = amdVarM936a.f681a.m943a(54321);
        if (ameVarM943a != null) {
            ameVarM943a.m941j();
            C1118xg c1118xg = amdVarM936a.f681a.f692b;
            int iM19568a = C1120xi.m19568a(c1118xg.f48006b, c1118xg.f48008d, 54321);
            if (iM19568a >= 0) {
                Object[] objArr = c1118xg.f48007c;
                Object obj = objArr[iM19568a];
                Object obj2 = C1119xh.f48009a;
                if (obj != obj2) {
                    objArr[iM19568a] = obj2;
                    c1118xg.f48005a = true;
                }
            }
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDetach() {
        super.onDetach();
        this.f39105a = null;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onViewCreated(View view, Bundle bundle) {
        ActivityC0080bz activity = getActivity();
        this.f39106b = new ArrayAdapter(activity, C0100R.layout.libraries_social_licenses_license, C0100R.id.license, new ArrayList());
        amd.m936a(activity).m938c(54321, this);
        ListView listView = (ListView) view.findViewById(C0100R.id.license_list);
        listView.setAdapter((ListAdapter) this.f39106b);
        listView.setOnItemClickListener(new lrt(this, 0));
    }
}
