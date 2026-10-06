package p000;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hgq implements Function {

    /* JADX INFO: renamed from: v */
    private final /* synthetic */ int f27728v;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ hgq f27727u = new hgq(20);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ hgq f27726t = new hgq(19);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ hgq f27725s = new hgq(18);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ hgq f27724r = new hgq(17);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ hgq f27723q = new hgq(16);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ hgq f27722p = new hgq(15);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ hgq f27721o = new hgq(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ hgq f27720n = new hgq(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ hgq f27719m = new hgq(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ hgq f27718l = new hgq(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ hgq f27717k = new hgq(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ hgq f27716j = new hgq(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ hgq f27715i = new hgq(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ hgq f27714h = new hgq(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ hgq f27713g = new hgq(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ hgq f27712f = new hgq(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ hgq f27711e = new hgq(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ hgq f27710d = new hgq(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hgq f27709c = new hgq(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ hgq f27708b = new hgq(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ hgq f27707a = new hgq(0);

    private /* synthetic */ hgq(int i) {
        this.f27728v = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f27728v) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.f27728v) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f27728v) {
            case 0:
                return (ResolveInfo) ((mrn) obj).f41480b;
            case 1:
                return ((hhs) obj).f27855a;
            case 2:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 3:
                return (String) ((mrn) obj).f41479a;
            case 4:
                return (String) ((mrn) obj).f41479a;
            case 5:
                return (ResolveInfo) ((mrn) obj).f41480b;
            case 6:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 7:
                nbh nbhVar = hha.f27782a;
                return hgt.m10253b(((ResolveInfo) obj).activityInfo.packageName);
            case 8:
                nbh nbhVar2 = hha.f27782a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 9:
                return hgt.m10253b((String) obj);
            case 10:
                nbh nbhVar3 = hha.f27782a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 11:
                nbh nbhVar4 = hha.f27782a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 12:
                nbh nbhVar5 = hha.f27782a;
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 13:
                hhe hheVar = (hhe) obj;
                hheVar.setVisibility(0);
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(hheVar, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, hheVar.getAlpha(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, hheVar.getScaleX(), 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, hheVar.getScaleY(), 1.0f));
                objectAnimatorOfPropertyValuesHolder.setDuration(hheVar.f27796b.toMillis());
                return objectAnimatorOfPropertyValuesHolder;
            case 14:
                hhe hheVar2 = (hhe) obj;
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(hheVar2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, hheVar2.getAlpha(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, hheVar2.getScaleX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, hheVar2.getScaleY(), 0.0f));
                objectAnimatorOfPropertyValuesHolder2.addListener(jvh.m13544B(new gyc(hheVar2, 8)));
                objectAnimatorOfPropertyValuesHolder2.setDuration(hheVar2.f27796b.toMillis());
                return objectAnimatorOfPropertyValuesHolder2;
            case 15:
                return (gzr) ((mrm) obj).mo16809c();
            case 16:
                return gzr.m10021b((jxp) obj);
            case 17:
                return (idk) ((Map.Entry) obj).getKey();
            case 18:
                return new EnumMap(ifi.class);
            case 19:
                Resources resources = (Resources) obj;
                igm igmVarM11290a = ign.m11290a();
                igmVarM11290a.m11278o(resources.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a.m11276m(255);
                igmVarM11290a.m11277n(-1);
                igmVarM11290a.m11273j(resources.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a.m11289z(resources.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a.m11263A(0);
                igmVarM11290a.m11284u(0);
                igmVarM11290a.m11267d(C0100R.drawable.ic_autotimer_idle);
                igmVarM11290a.m11272i(resources.getDrawable(C0100R.drawable.ic_autotimer_idle, null).getIntrinsicWidth() / 2);
                igmVarM11290a.m11282s(resources.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a.m11283t(resources.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a.m11275l(resources.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                return igmVarM11290a;
            default:
                Resources resources2 = (Resources) obj;
                igm igmVarM11290a2 = ign.m11290a();
                igmVarM11290a2.m11278o(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a2.m11273j(resources2.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a2.m11276m(255);
                igmVarM11290a2.m11277n(ign.f30821b);
                igmVarM11290a2.m11263A(0);
                igmVarM11290a2.m11289z(resources2.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a2.m11284u(0);
                igmVarM11290a2.m11281r(61);
                igmVarM11290a2.m11282s(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a2.m11283t(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a2.m11275l(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a2.m11270g(61);
                igmVarM11290a2.m11267d(C0100R.drawable.ic_brightness_dark_24px);
                igmVarM11290a2.m11272i(resources2.getDrawable(C0100R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return igmVarM11290a2;
        }
    }
}
