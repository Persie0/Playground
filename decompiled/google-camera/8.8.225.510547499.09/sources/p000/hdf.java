package p000;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.camera.autotimer.p006ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.p014ui.notificationchip.NotificationChipView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdf implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f27313a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27314b;

    public hdf(View view, int i) {
        this.f27314b = i;
        this.f27313a = view;
    }

    public /* synthetic */ hdf(AutoTimerIndicatorView autoTimerIndicatorView, int i) {
        this.f27314b = i;
        this.f27313a = autoTimerIndicatorView;
    }

    public /* synthetic */ hdf(NotificationChipView notificationChipView, int i) {
        this.f27314b = i;
        this.f27313a = notificationChipView;
    }

    public hdf(hdk hdkVar, int i) {
        this.f27314b = i;
        this.f27313a = hdkVar;
    }

    public /* synthetic */ hdf(hst hstVar, int i) {
        this.f27314b = i;
        this.f27313a = hstVar;
    }

    public /* synthetic */ hdf(hxy hxyVar, int i) {
        this.f27314b = i;
        this.f27313a = hxyVar;
    }

    public /* synthetic */ hdf(ick ickVar, int i) {
        this.f27314b = i;
        this.f27313a = ickVar;
    }

    public hdf(idu iduVar, int i) {
        this.f27314b = i;
        this.f27313a = iduVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mhc mhcVar;
        int i9 = 2;
        switch (this.f27314b) {
            case 0:
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    ((hdk) this.f27313a).m10124j();
                }
                break;
            case 1:
                ((AutoTimerIndicatorView) this.f27313a).m4040b(i, i2, i3, i4);
                break;
            case 2:
                hst hstVar = (hst) this.f27313a;
                mhc mhcVar2 = hstVar.f29440d;
                mhcVar2.getClass();
                int i10 = hstVar.f29443g;
                if (i10 == -1) {
                    i10 = mhcVar2.getContext().getResources().getConfiguration().orientation;
                }
                hstVar.f29443g = i10;
                if (i10 == 2) {
                    mhc mhcVar3 = hstVar.f29440d;
                    if (mhcVar3 != null) {
                        mhcVar3.m16369a().m4808C(3);
                    }
                } else {
                    NestedScrollView nestedScrollView = hstVar.f29445i;
                    if (nestedScrollView != null && nestedScrollView.canScrollVertically(1) && (mhcVar = hstVar.f29440d) != null) {
                        mhcVar.m16369a().m4808C(4);
                    }
                }
                hss hssVar = hstVar.f29441e;
                if (hssVar != null) {
                    hssVar.mo10363b(hstVar.f29443g);
                }
                break;
            case 3:
                Object obj = this.f27313a;
                if (i2 != i6) {
                    view.post(new huh((hxy) obj, i9));
                }
                break;
            case 4:
                hxy hxyVar = (hxy) this.f27313a;
                Layout layout = hxyVar.f29861c.getLayout();
                if (layout != null && layout.getLineCount() > 0 && layout.getEllipsisCount(0) > 0) {
                    hxyVar.m10860k();
                    break;
                }
                break;
            case 5:
                ick ickVar = (ick) this.f27313a;
                TextView textView = ickVar.f30346g;
                if (textView != null) {
                    ickVar.m11067e(textView);
                }
                break;
            case 6:
                ((NotificationChipView) this.f27313a).m4403b();
                break;
            case 7:
                ids idsVarM11135a = ((idu) this.f27313a).m11135a();
                View viewFindViewById = ((idu) this.f27313a).getContentView().findViewById(idsVarM11135a.f30502e);
                ilk ilkVar = ((idu) this.f27313a).f30513h;
                ilk ilkVar2 = ilk.LANDSCAPE;
                float fM11130h = idu.m11130h(((idu) this.f27313a).f30506a, idsVarM11135a.f30503f);
                float measuredWidth = ((idu) this.f27313a).f30506a.getMeasuredWidth();
                float fM11130h2 = idu.m11130h(viewFindViewById, idsVarM11135a.f30503f);
                float f = idsVarM11135a.f30504g;
                float f2 = ((idu) this.f27313a).f30512g;
                float translationX = idsVarM11135a.f30503f ? viewFindViewById.getTranslationX() : viewFindViewById.getTranslationY();
                int i11 = idsVarM11135a.f30503f ? ((idu) this.f27313a).f30514i : ((idu) this.f27313a).f30515j;
                float f3 = fM11130h + ((ilkVar == ilkVar2 ? -1 : 1) * (measuredWidth / 2.0f));
                float f4 = fM11130h2 + (f * (f2 / 2.0f));
                float fAbs = Math.abs((translationX + f3) - f4);
                idu iduVar = (idu) this.f27313a;
                float fMin = Math.min(fAbs, ((i11 / 2.0f) - iduVar.f30511f) - (iduVar.f30512g / 2.0f));
                int i12 = f3 < f4 - translationX ? -1 : 1;
                if (idsVarM11135a.f30503f) {
                    viewFindViewById.setTranslationX(i12 * fMin);
                    viewFindViewById.getTranslationX();
                } else {
                    viewFindViewById.setTranslationY(i12 * fMin);
                    viewFindViewById.getTranslationY();
                }
                ((idu) this.f27313a).getContentView().removeOnLayoutChangeListener(((idu) this.f27313a).f30510e);
                break;
            default:
                ((View) this.f27313a).getVisibility();
                break;
        }
    }
}
