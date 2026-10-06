package p000;

import android.content.Context;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class daz extends hsw implements dbb {

    /* JADX INFO: renamed from: a */
    public static final Integer f10352a = 1;

    /* JADX INFO: renamed from: b */
    private final dhv f10353b;

    public daz(Context context, hst hstVar, dhv dhvVar) {
        super(context, hstVar);
        this.f10353b = dhvVar;
    }

    @Override // p000.dbb
    /* JADX INFO: renamed from: a */
    public final void mo5867a() {
        Context context = this.f29466g;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(new hsu(context.getString(C0100R.string.stabilization_edu_standard_title), context.getString(C0100R.string.stabilization_edu_standard_subtitle), mws.m17097l(ihk.m11330i("https://www.gstatic.com/aiux/gca/stabilization/Standard_EDUPanel_376x320.gif")), context.getString(C0100R.string.stabilization_edu_standard_sidebyside_video_announcement), context.getString(C0100R.string.stabilization_edu_caption_unstabilized)));
        arrayList2.add(context.getString(C0100R.string.stabilization_edu_tab_label_standard));
        if (this.f10353b.mo6184l(dhh.f11069V)) {
            arrayList.add(new hsu(context.getString(C0100R.string.stabilization_edu_locked_title), context.getString(C0100R.string.stabilization_edu_locked_subtitle), mws.m17097l(ihk.m11330i("https://www.gstatic.com/aiux/gca/stabilization/Locked_EDUPanel_376x320.gif")), context.getString(C0100R.string.stabilization_edu_locked_sidebyside_video_announcement), context.getString(C0100R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(C0100R.string.stabilization_edu_tab_label_locked));
        }
        if (this.f10353b.mo6184l(dhh.f11070W)) {
            arrayList.add(new hsu(context.getString(C0100R.string.stabilization_edu_active_title), context.getString(C0100R.string.stabilization_edu_active_subtitle), mws.m17097l(ihk.m11330i("https://www.gstatic.com/aiux/gca/stabilization/Active_EDUPanel_376x320.gif")), context.getString(C0100R.string.stabilization_edu_active_sidebyside_video_announcement), context.getString(C0100R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(C0100R.string.stabilization_edu_tab_label_active));
        }
        if (this.f10353b.mo6184l(dhh.f11071X)) {
            arrayList.add(new hsu(context.getString(C0100R.string.stabilization_edu_panning_title), context.getString(C0100R.string.stabilization_edu_panning_subtitle), mws.m17097l(ihk.m11330i("https://www.gstatic.com/aiux/gca/stabilization/Panning_EDUPanel_376x320.gif")), context.getString(C0100R.string.stabilization_edu_panning_sidebyside_video_announcement), context.getString(C0100R.string.stabilization_edu_caption_unstabilized)));
            arrayList2.add(context.getString(C0100R.string.stabilization_edu_tab_label_panning));
        }
        View viewM10720c = m10720c();
        f10352a.intValue();
        m10721d(viewM10720c, arrayList, 1, new day(), new eoy(arrayList2, 1));
        m10722e(3, viewM10720c, null);
    }
}
