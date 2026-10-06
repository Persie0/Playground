package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.behavior.iWN.zuAgeeF;
import p021j$.time.ZoneId;
import p021j$.time.format.DateTimeFormatter;
import p021j$.time.format.FormatStyle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class djx implements chp {

    /* JADX INFO: renamed from: b */
    public final Context f11830b;

    /* JADX INFO: renamed from: c */
    protected final djy f11831c;

    /* JADX INFO: renamed from: d */
    public chq f11832d;

    /* JADX INFO: renamed from: e */
    protected fes f11833e;

    /* JADX INFO: renamed from: f */
    protected kbc f11834f;

    /* JADX INFO: renamed from: h */
    private final gyx f11835h;

    /* JADX INFO: renamed from: g */
    private static final nbh f11829g = nbh.m17259h("com/google/android/apps/camera/data/FilmstripItemBase");

    /* JADX INFO: renamed from: a */
    protected static final DateTimeFormatter f11828a = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(ZoneId.systemDefault());

    protected djx(Context context, djy djyVar, chq chqVar, gyx gyxVar) {
        this.f11830b = context;
        djyVar.getClass();
        this.f11831c = djyVar;
        chqVar.getClass();
        this.f11832d = chqVar;
        this.f11835h = gyxVar;
        this.f11833e = fes.f21562a;
        this.f11834f = djyVar.f11838a;
    }

    /* JADX INFO: renamed from: k */
    public static djw m6262k(View view) {
        Object tag = view.getTag(C0100R.id.mediadata_tag_target);
        if (tag instanceof djw) {
            return (djw) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    protected static final bqn m6263n(chq chqVar) {
        chqVar.mo3749i();
        return new cas(chqVar.mo3749i(), chqVar.mo3748h().getEpochSecond(), chqVar.mo3741a());
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: b */
    public final chq mo3733b() {
        return this.f11832d;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: d */
    public final fes mo3735d() {
        return this.f11833e;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: e */
    public final gyx mo3736e() {
        return this.f11835h;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: f */
    public final void mo3737f(chq chqVar) {
        this.f11832d = chqVar;
    }

    @Override // p000.chp
    /* JADX INFO: renamed from: g */
    public final void mo3738g(fes fesVar) {
        this.f11833e = fesVar;
    }

    /* JADX INFO: renamed from: j */
    final View m6264j(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f11830b).inflate(C0100R.layout.filmstrip_view, viewGroup, false);
        viewInflate.setTag(C0100R.id.mediadata_tag_target, new djw((ImageView) viewInflate.findViewById(C0100R.id.content_view), (ImageView) viewInflate.findViewById(C0100R.id.play_button), (ImageView) viewInflate.findViewById(C0100R.id.photo_sphere_center_badge)));
        return viewInflate;
    }

    /* JADX INFO: renamed from: l */
    public final void m6265l(View view) {
        djw djwVarM6262k = m6262k(view);
        if (djwVarM6262k == null) {
            ((nbe) ((nbe) f11829g.m17252c()).mo17276G((char) 931)).mo17290o("renderThumbnail was called with an invalid view!");
        } else {
            mo6266m(djwVarM6262k);
        }
    }

    /* JADX INFO: renamed from: m */
    protected abstract void mo6266m(djw djwVar);

    @Override // p000.chp
    /* JADX INFO: renamed from: h */
    public final void mo3739h(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.f11834f = new kbc(i, i2);
        } else {
            ((nbe) ((nbe) f11829g.m17252c()).mo17276G((char) 932)).mo17290o(zuAgeeF.TUySswJidmWYSxq);
        }
    }
}
