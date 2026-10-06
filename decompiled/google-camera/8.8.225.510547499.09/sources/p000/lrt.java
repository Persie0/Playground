package p000;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lrt implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f39103a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f39104b;

    public lrt(C0740jg c0740jg, int i) {
        this.f39104b = i;
        this.f39103a = c0740jg;
    }

    public /* synthetic */ lrt(lru lruVar, int i) {
        this.f39104b = i;
        this.f39103a = lruVar;
    }

    public lrt(mmk mmkVar, int i) {
        this.f39104b = i;
        this.f39103a = mmkVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        View view2;
        int i2;
        long selectedItemId;
        switch (this.f39104b) {
            case 0:
                Object obj = this.f39103a;
                lrr lrrVar = (lrr) adapterView.getItemAtPosition(i);
                LicenseMenuActivity licenseMenuActivity = ((lru) obj).f39105a;
                if (licenseMenuActivity != null) {
                    Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                    intent.putExtra("license", lrrVar);
                    licenseMenuActivity.startActivity(intent);
                }
                break;
            case 1:
                ((C0740jg) this.f39103a).f33936d.setSelection(i);
                if (((C0740jg) this.f39103a).f33936d.getOnItemClickListener() != null) {
                    C0740jg c0740jg = (C0740jg) this.f39103a;
                    c0740jg.f33936d.performItemClick(view, i, c0740jg.f33934b.getItemId(i));
                }
                ((C0794lg) this.f39103a).mo9626k();
                break;
            default:
                if (i < 0) {
                    C0794lg c0794lg = ((mmk) this.f39103a).f41045a;
                    item = !c0794lg.mo9636u() ? null : c0794lg.f38176e.getSelectedItem();
                } else {
                    item = ((mmk) this.f39103a).getAdapter().getItem(i);
                }
                ((mmk) this.f39103a).m16628a(item);
                AdapterView.OnItemClickListener onItemClickListener = ((mmk) this.f39103a).getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        C0794lg c0794lg2 = ((mmk) this.f39103a).f41045a;
                        View selectedView = !c0794lg2.mo9636u() ? null : c0794lg2.f38176e.getSelectedView();
                        int iM15303o = ((mmk) this.f39103a).f41045a.m15303o();
                        C0794lg c0794lg3 = ((mmk) this.f39103a).f41045a;
                        view2 = selectedView;
                        i2 = iM15303o;
                        selectedItemId = !c0794lg3.mo9636u() ? Long.MIN_VALUE : c0794lg3.f38176e.getSelectedItemId();
                    } else {
                        view2 = view;
                        i2 = i;
                        selectedItemId = j;
                    }
                    onItemClickListener.onItemClick(((mmk) this.f39103a).f41045a.f38176e, view2, i2, selectedItemId);
                }
                ((mmk) this.f39103a).f41045a.mo9626k();
                break;
        }
    }
}
