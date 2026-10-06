package p000;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.notificationchip.NotificationChipView;
import java.util.Date;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class idc implements idb {

    /* JADX INFO: renamed from: a */
    private final int f30407a;

    /* JADX INFO: renamed from: b */
    private final boolean f30408b;

    /* JADX INFO: renamed from: c */
    private final Context f30409c;

    /* JADX INFO: renamed from: d */
    private final boolean f30410d;

    /* JADX INFO: renamed from: e */
    private final View.OnClickListener f30411e;

    /* JADX INFO: renamed from: f */
    private final ida f30412f;

    /* JADX INFO: renamed from: g */
    private final int f30413g;

    /* JADX INFO: renamed from: h */
    private int f30414h;

    /* JADX INFO: renamed from: i */
    private Date f30415i;

    /* JADX INFO: renamed from: j */
    private NotificationChipView f30416j;

    /* JADX INFO: renamed from: k */
    private Date f30417k;

    /* JADX INFO: renamed from: l */
    private String f30418l;

    /* JADX INFO: renamed from: m */
    private hzj f30419m;

    /* JADX INFO: renamed from: n */
    private final int f30420n;

    public idc(Context context, String str, int i, int i2, boolean z, View.OnClickListener onClickListener, ida idaVar, boolean z2, int i3) {
        this.f30409c = context;
        this.f30418l = str;
        this.f30407a = i;
        this.f30420n = i2;
        this.f30408b = z;
        this.f30411e = onClickListener;
        this.f30412f = idaVar;
        this.f30410d = z2;
        this.f30413g = i3;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: a */
    public final int mo7492a() {
        return this.f30407a + 500;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: b */
    public final ely mo7493b() {
        return ely.NOTIFICATION_CHIP;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo7494c() {
        return gmz.m9541i();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Runnable mo7495d() {
        return null;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: e */
    public final Date mo7496e() {
        return this.f30417k;
    }

    public final boolean equals(Object obj) {
        Date date;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idc)) {
            return false;
        }
        idc idcVar = (idc) obj;
        return this.f30407a == idcVar.f30407a && this.f30408b == idcVar.f30408b && this.f30420n == idcVar.f30420n && Objects.equals(this.f30418l, idcVar.f30418l) && Objects.equals(this.f30411e, idcVar.f30411e) && Objects.equals(this.f30412f, idcVar.f30412f) && (date = this.f30415i) != null && idcVar.f30415i != null && date.getTime() == idcVar.f30415i.getTime();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: f */
    public final void mo7497f(Runnable runnable) {
        throw new UnsupportedOperationException("Unsupported Operation delayedHide(Runnable) in: ".concat(String.valueOf(getClass().getName())));
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: g */
    public final void mo7498g() {
        NotificationChipView notificationChipView = this.f30416j;
        ((AnimatorSet) notificationChipView.f7091h.f33815a).end();
        notificationChipView.setVisibility(8);
        if (!notificationChipView.f7086c) {
            notificationChipView.m4402a();
        }
        ida idaVar = notificationChipView.f7087d;
        if (idaVar != null) {
            idaVar.mo11107a(new Date().getTime() - notificationChipView.f7089f);
        }
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: h */
    public final void mo7499h() {
        this.f30416j.m4402a();
        NotificationChipView notificationChipView = this.f30416j;
        if (((AnimatorSet) notificationChipView.f7091h.f33816b).isRunning()) {
            ((AnimatorSet) notificationChipView.f7091h.f33816b).reverse();
        }
        this.f30416j.m4404c(this.f30407a);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f30407a), Integer.valueOf(this.f30420n), Boolean.valueOf(this.f30408b), this.f30418l, this.f30411e, this.f30412f, this.f30415i);
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: i */
    public final void mo7500i(Date date) {
        this.f30417k = date;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: j */
    public final void mo7501j() {
        int i = this.f30413g;
        if (i != -1) {
            int i2 = this.f30414h;
            if (i2 >= i) {
                return;
            } else {
                this.f30414h = i2 + 1;
            }
        }
        this.f30415i = new Date();
        NotificationChipView notificationChipView = (NotificationChipView) ((Activity) this.f30409c).findViewById(C0100R.id.notification_chip_view);
        this.f30416j = notificationChipView;
        String str = this.f30418l;
        int i3 = this.f30407a;
        boolean z = this.f30408b;
        View.OnClickListener onClickListener = this.f30411e;
        ida idaVar = this.f30412f;
        notificationChipView.f7085b = i3;
        notificationChipView.f7086c = z;
        notificationChipView.f7087d = idaVar;
        notificationChipView.setText(str);
        notificationChipView.setOnClickListener(onClickListener);
        notificationChipView.f7090g = new idd(notificationChipView, 0);
        ((ViewGroup) notificationChipView.getParent()).addOnLayoutChangeListener(new hdf(notificationChipView, 6));
        ikz ikzVarM11416b = ikz.m11416b(200, new LinearInterpolator());
        ikzVarM11416b.m11418c(notificationChipView, "alpha", 0.0f, 1.0f);
        ikzVarM11416b.f31417a = 200;
        ikzVarM11416b.m11418c(notificationChipView, "scaleX", 0.5f, 1.0f);
        ikzVarM11416b.m11418c(notificationChipView, "scaleY", 0.5f, 1.0f);
        notificationChipView.f7091h.f33815a = ikzVarM11416b.m11417a();
        ikz ikzVarM11416b2 = ikz.m11416b(500, new LinearInterpolator());
        ikzVarM11416b2.m11418c(notificationChipView, "alpha", 1.0f, 0.0f);
        notificationChipView.f7091h.f33816b = ikzVarM11416b2.m11417a();
        NotificationChipView notificationChipView2 = this.f30416j;
        notificationChipView2.f7088e = this.f30419m;
        notificationChipView2.setBackground(notificationChipView2.getLineCount() > 1 ? notificationChipView2.f7084a.getDrawable(C0100R.drawable.notification_chip_multiple_lines_background) : notificationChipView2.f7084a.getDrawable(C0100R.drawable.notification_chip_background));
        notificationChipView2.setPaddingRelative(notificationChipView2.f7084a.getResources().getDimensionPixelSize(C0100R.dimen.notification_chip_text_padding_left), notificationChipView2.f7084a.getResources().getDimensionPixelSize(C0100R.dimen.notification_chip_text_padding_top), notificationChipView2.f7084a.getResources().getDimensionPixelSize(C0100R.dimen.notification_chip_text_padding_right), notificationChipView2.f7084a.getResources().getDimensionPixelSize(C0100R.dimen.notification_chip_text_padding_bottom));
        notificationChipView2.m4403b();
        ((AnimatorSet) notificationChipView2.f7091h.f33815a).start();
        notificationChipView2.setVisibility(0);
        notificationChipView2.sendAccessibilityEvent(32768);
        if (!notificationChipView2.f7086c) {
            notificationChipView2.m4404c(notificationChipView2.f7085b);
        }
        notificationChipView2.f7089f = new Date().getTime();
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean mo7502k() {
        return false;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: l */
    public final boolean mo7503l() {
        return this.f30410d;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: m */
    public final boolean mo7504m() {
        return this.f30408b;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean mo7505n() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ boolean mo7506o() {
        return true;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: p */
    public final int mo7507p() {
        return this.f30420n;
    }

    @Override // p000.elw
    /* JADX INFO: renamed from: q */
    public final void mo7508q(int i, boolean z, boolean z2, ilk ilkVar, hzj hzjVar) {
        this.f30419m = hzjVar;
    }

    @Override // p000.idb
    /* JADX INFO: renamed from: r */
    public final Date mo11108r() {
        return this.f30415i;
    }

    @Override // p000.idb
    /* JADX INFO: renamed from: s */
    public final void mo11109s(String str) {
        this.f30418l = str;
        NotificationChipView notificationChipView = this.f30416j;
        if (notificationChipView != null) {
            notificationChipView.setText(str);
        }
    }
}
