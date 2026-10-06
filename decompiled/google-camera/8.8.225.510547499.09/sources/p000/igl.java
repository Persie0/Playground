package p000;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import p021j$.util.function.Function$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class igl implements Function {

    /* JADX INFO: renamed from: v */
    private final /* synthetic */ int f30789v;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ igl f30788u = new igl(20);

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ igl f30787t = new igl(19);

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ igl f30786s = new igl(18);

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ igl f30785r = new igl(17);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ igl f30784q = new igl(16);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ igl f30783p = new igl(15);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ igl f30782o = new igl(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ igl f30781n = new igl(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ igl f30780m = new igl(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ igl f30779l = new igl(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ igl f30778k = new igl(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ igl f30777j = new igl(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ igl f30776i = new igl(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ igl f30775h = new igl(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ igl f30774g = new igl(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ igl f30773f = new igl(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ igl f30772e = new igl(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ igl f30771d = new igl(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ igl f30770c = new igl(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ igl f30769b = new igl(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ igl f30768a = new igl(0);

    private /* synthetic */ igl(int i) {
        this.f30789v = i;
    }

    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v94, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v96, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f30789v) {
            case 0:
                Resources resources = (Resources) obj;
                igm igmVarM11290a = ign.m11290a();
                igmVarM11290a.m11278o(resources.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a.m11273j(resources.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a.m11276m(255);
                igmVarM11290a.m11277n(ign.f30822c);
                igmVarM11290a.m11289z(0);
                igmVarM11290a.m11263A(resources.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a.m11284u(0);
                igmVarM11290a.m11267d(C0100R.drawable.quantum_gm_ic_done_black_24);
                igmVarM11290a.m11272i(resources.getDrawable(C0100R.drawable.quantum_gm_ic_done_black_24, null).getIntrinsicWidth() / 2);
                igmVarM11290a.m11282s(resources.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a.m11283t(resources.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a.m11275l(resources.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                return igmVarM11290a;
            case 1:
                Resources resources2 = (Resources) obj;
                igm igmVarM11290a2 = ign.m11290a();
                igmVarM11290a2.m11278o(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a2.m11273j(resources2.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a2.m11276m(255);
                igmVarM11290a2.m11277n(resources2.getColor(C0100R.color.confirm_disabled_color, null));
                igmVarM11290a2.m11289z(0);
                igmVarM11290a2.m11263A(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a2.m11284u(0);
                igmVarM11290a2.m11267d(C0100R.drawable.quantum_gm_ic_done_white_24);
                igmVarM11290a2.m11272i(resources2.getDrawable(C0100R.drawable.quantum_gm_ic_done_white_24, null).getIntrinsicWidth() / 2);
                igmVarM11290a2.m11282s(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a2.m11283t(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a2.m11275l(resources2.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                return igmVarM11290a2;
            case 2:
                Resources resources3 = (Resources) obj;
                igm igmVarM11290a3 = ign.m11290a();
                igmVarM11290a3.m11278o(resources3.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a3.m11273j(resources3.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a3.m11276m(255);
                igmVarM11290a3.m11277n(resources3.getColor(C0100R.color.camera_mode_idle_color, null));
                igmVarM11290a3.m11289z(resources3.getColor(C0100R.color.camera_mode_idle_color, null));
                igmVarM11290a3.m11263A(0);
                igmVarM11290a3.m11284u(0);
                igmVarM11290a3.m11267d(C0100R.drawable.quantum_gm_ic_done_white_24);
                igmVarM11290a3.m11272i((int) ((resources3.getDrawable(C0100R.drawable.quantum_gm_ic_done_white_24, null).getIntrinsicWidth() * 1.75f) / 2.0f));
                igmVarM11290a3.m11282s(resources3.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a3.m11283t(resources3.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a3.m11275l(resources3.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                return igmVarM11290a3;
            case 3:
                Resources resources4 = (Resources) obj;
                igm igmVarM11290a4 = ign.m11290a();
                igmVarM11290a4.m11278o(resources4.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a4.m11273j(resources4.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a4.m11276m(0);
                igmVarM11290a4.m11277n(-1);
                igmVarM11290a4.m11263A(0);
                igmVarM11290a4.m11289z(resources4.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a4.m11284u(resources4.getDimensionPixelSize(C0100R.dimen.video_button_stop_square_size) / 2);
                igmVarM11290a4.m11282s(resources4.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a4.m11283t(resources4.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a4.m11275l(resources4.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a4.m11267d(C0100R.drawable.ic_center_rec);
                igmVarM11290a4.m11272i(resources4.getDrawable(C0100R.drawable.ic_center_rec, null).getIntrinsicWidth() / 2);
                return igmVarM11290a4;
            case 4:
                Resources resources5 = (Resources) obj;
                igm igmVarM11290a5 = ign.m11290a();
                igmVarM11290a5.m11278o(resources5.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a5.m11273j(resources5.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a5.m11277n(0);
                igmVarM11290a5.m11276m(0);
                igmVarM11290a5.m11263A(0);
                igmVarM11290a5.m11289z(resources5.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a5.m11284u(0);
                igmVarM11290a5.m11282s(resources5.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a5.m11283t(resources5.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a5.m11275l(resources5.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a5.m11270g(61);
                igmVarM11290a5.m11267d(C0100R.drawable.ic_cancel_night_24px);
                igmVarM11290a5.m11272i(resources5.getDrawable(C0100R.drawable.ic_cancel_night_24px, null).getIntrinsicWidth() / 2);
                return igmVarM11290a5;
            case 5:
                Resources resources6 = (Resources) obj;
                igm igmVarM11290a6 = ign.m11290a();
                igmVarM11290a6.m11278o(resources6.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a6.m11273j(resources6.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a6.m11276m(255);
                igmVarM11290a6.m11277n(resources6.getColor(C0100R.color.camera_mode_idle_color, null));
                igmVarM11290a6.m11263A(0);
                igmVarM11290a6.m11289z(resources6.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a6.m11284u(0);
                igmVarM11290a6.m11282s(resources6.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a6.m11279p(resources6.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a6.m11280q(resources6.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a6.m11283t(resources6.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a6.m11275l(resources6.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a6.m11267d(C0100R.drawable.ic_brightness_dark_24px);
                igmVarM11290a6.m11272i(resources6.getDrawable(C0100R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return igmVarM11290a6;
            case 6:
                Resources resources7 = (Resources) obj;
                igm igmVarM11290a7 = ign.m11290a();
                igmVarM11290a7.m11278o(resources7.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a7.m11276m(0);
                igmVarM11290a7.m11273j(resources7.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a7.m11277n(resources7.getColor(C0100R.color.camera_mode_idle_color, null));
                igmVarM11290a7.m11263A(0);
                igmVarM11290a7.m11289z(resources7.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a7.m11284u(0);
                igmVarM11290a7.m11282s(resources7.getDimensionPixelSize(C0100R.dimen.portrait_button_inner_radius));
                igmVarM11290a7.m11279p(resources7.getDimensionPixelSize(C0100R.dimen.portrait_button_inner_ring_radius));
                igmVarM11290a7.m11280q(resources7.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a7.m11283t(resources7.getDimensionPixelSize(C0100R.dimen.portrait_button_outer_radius));
                igmVarM11290a7.m11275l(resources7.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a7.m11267d(C0100R.drawable.ic_brightness_dark_24px);
                igmVarM11290a7.m11272i(resources7.getDrawable(C0100R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return igmVarM11290a7;
            case 7:
                Resources resources8 = (Resources) obj;
                igm igmVarM11290a8 = ign.m11290a();
                igmVarM11290a8.m11278o(resources8.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a8.m11273j(resources8.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a8.m11276m(255);
                igmVarM11290a8.m11277n(ign.f30821b);
                igmVarM11290a8.m11263A(0);
                igmVarM11290a8.m11289z(resources8.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a8.m11284u(0);
                igmVarM11290a8.m11265b(true);
                igmVarM11290a8.m11281r(61);
                igmVarM11290a8.m11282s(resources8.getDimensionPixelSize(C0100R.dimen.photo_button_press_radius));
                igmVarM11290a8.m11283t(resources8.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a8.m11275l(resources8.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a8.m11267d(C0100R.drawable.ic_brightness_dark_24px);
                igmVarM11290a8.m11272i(resources8.getDrawable(C0100R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return igmVarM11290a8;
            case 8:
                Resources resources9 = (Resources) obj;
                igm igmVarM11290a9 = ign.m11290a();
                igmVarM11290a9.m11278o(resources9.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a9.m11273j(resources9.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a9.m11276m(255);
                igmVarM11290a9.m11277n(ign.f30821b);
                igmVarM11290a9.m11263A(0);
                igmVarM11290a9.m11289z(resources9.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a9.m11284u(0);
                igmVarM11290a9.m11281r(61);
                igmVarM11290a9.m11282s(resources9.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a9.m11283t(resources9.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a9.m11275l(resources9.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a9.m11270g(61);
                igmVarM11290a9.m11267d(C0100R.drawable.ic_brightness_dark_24px);
                igmVarM11290a9.m11272i(resources9.getDrawable(C0100R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return igmVarM11290a9;
            case 9:
                Resources resources10 = (Resources) obj;
                igm igmVarM11290a10 = ign.m11290a();
                igmVarM11290a10.m11278o(resources10.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a10.m11273j(resources10.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a10.m11276m(255);
                igmVarM11290a10.m11277n(resources10.getColor(C0100R.color.night_mode_idle_color, null));
                igmVarM11290a10.m11263A(0);
                igmVarM11290a10.m11289z(resources10.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a10.m11284u(0);
                igmVarM11290a10.m11282s(resources10.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a10.m11279p(resources10.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a10.m11280q(resources10.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a10.m11283t(resources10.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a10.m11275l(resources10.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a10.m11267d(C0100R.drawable.ic_brightness_white_24px);
                return igmVarM11290a10;
            case 10:
                Resources resources11 = (Resources) obj;
                igm igmVarM11290a11 = ign.m11290a();
                igmVarM11290a11.m11278o(resources11.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a11.m11273j(resources11.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a11.m11276m(255);
                igmVarM11290a11.m11277n(resources11.getColor(C0100R.color.night_mode_idle_color, null));
                igmVarM11290a11.m11263A(0);
                igmVarM11290a11.m11289z(resources11.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a11.m11284u(0);
                igmVarM11290a11.m11282s(resources11.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a11.m11279p(resources11.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a11.m11280q(resources11.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a11.m11283t(resources11.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a11.m11275l(resources11.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a11.m11267d(C0100R.drawable.ic_shutter_astro_white);
                return igmVarM11290a11;
            case 11:
                Resources resources12 = (Resources) obj;
                igm igmVarM11290a12 = ign.m11290a();
                igmVarM11290a12.m11278o(resources12.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a12.m11273j(resources12.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a12.m11276m(255);
                igmVarM11290a12.m11277n(ign.f30821b);
                igmVarM11290a12.m11263A(0);
                igmVarM11290a12.m11289z(resources12.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a12.m11284u(0);
                igmVarM11290a12.m11265b(true);
                igmVarM11290a12.m11281r(61);
                igmVarM11290a12.m11282s(resources12.getDimensionPixelSize(C0100R.dimen.photo_button_press_radius));
                igmVarM11290a12.m11283t(resources12.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a12.m11275l(resources12.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a12.m11267d(C0100R.drawable.ic_brightness_dark_24px);
                igmVarM11290a12.m11272i(resources12.getDrawable(C0100R.drawable.ic_brightness_dark_24px, null).getIntrinsicWidth() / 2);
                return igmVarM11290a12;
            case 12:
                Resources resources13 = (Resources) obj;
                igm igmVarM11290a13 = ign.m11290a();
                igmVarM11290a13.m11278o(resources13.getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius));
                igmVarM11290a13.m11273j(resources13.getColor(C0100R.color.camera_main_button_color, null));
                igmVarM11290a13.m11276m(255);
                igmVarM11290a13.m11277n(ign.f30821b);
                igmVarM11290a13.m11263A(0);
                igmVarM11290a13.m11289z(resources13.getColor(C0100R.color.video_mode_idle_color, null));
                igmVarM11290a13.m11284u(0);
                igmVarM11290a13.m11265b(true);
                igmVarM11290a13.m11281r(61);
                igmVarM11290a13.m11282s(resources13.getDimensionPixelSize(C0100R.dimen.photo_button_press_radius));
                igmVarM11290a13.m11283t(resources13.getDimensionPixelSize(C0100R.dimen.photo_button_radius));
                igmVarM11290a13.m11275l(resources13.getDimensionPixelSize(C0100R.dimen.photo_button_outer_ring_radius));
                igmVarM11290a13.m11267d(C0100R.drawable.ic_shutter_astro_dark);
                igmVarM11290a13.m11272i(resources13.getDrawable(C0100R.drawable.ic_shutter_astro_dark, null).getIntrinsicWidth() / 2);
                return igmVarM11290a13;
            case 13:
                return ((ipk) obj).mo3654c();
            case 14:
                return Float.valueOf(new BigDecimal(((Float) obj).floatValue()).setScale(1, RoundingMode.HALF_UP).floatValue());
            case 15:
                return ByteBuffer.wrap((byte[]) obj);
            case 16:
                lyz lyzVar = (lyz) obj;
                mwn mwnVar = new mwn(lyzVar.f39584a.size());
                Collections.sort(lyzVar.f39584a, mzi.f41840a);
                Iterator it = lyzVar.f39584a.iterator();
                myf myfVar = it instanceof myf ? (myf) it : new myf(it);
                while (myfVar.hasNext()) {
                    mzj mzjVarM17177g = (mzj) myfVar.next();
                    while (myfVar.hasNext()) {
                        if (!myfVar.f41806b) {
                            myfVar.f41807c = myfVar.f41805a.next();
                            myfVar.f41806b = true;
                        }
                        mzj mzjVar = (mzj) myfVar.f41807c;
                        if (!mzjVarM17177g.m17185n(mzjVar)) {
                        }
                        lku.m15610E(mzjVarM17177g.m17179h(mzjVar).m17186o(), "Overlapping ranges not permitted but found %s overlapping %s", mzjVarM17177g, mzjVar);
                        mzj mzjVar2 = (mzj) myfVar.next();
                        int iCompareTo = mzjVarM17177g.f41842b.compareTo(mzjVar2.f41842b);
                        int iCompareTo2 = mzjVarM17177g.f41843c.compareTo(mzjVar2.f41843c);
                        if (iCompareTo > 0 || iCompareTo2 < 0) {
                            mzjVarM17177g = (iCompareTo < 0 || iCompareTo2 > 0) ? mzj.m17177g(iCompareTo <= 0 ? mzjVarM17177g.f41842b : mzjVar2.f41842b, iCompareTo2 >= 0 ? mzjVarM17177g.f41843c : mzjVar2.f41843c) : mzjVar2;
                        }
                        break;
                    }
                    mwnVar.m17082g(mzjVarM17177g);
                }
                mws mwsVarM17081f = mwnVar.m17081f();
                if (mwsVarM17081f.isEmpty()) {
                    return mxh.f41759a;
                }
                return (((mzr) mwsVarM17081f).f41859c == 1 && ((mzj) mkv.m16517Y(mwsVarM17081f)).equals(mzj.f41841a)) ? mxh.f41760b : new mxh(mwsVarM17081f);
            case 17:
                return ((mwn) obj).m17081f();
            case 18:
                return ((mxi) obj).mo17127f();
            case 19:
                ngk ngkVar = (ngk) obj;
                ngkVar.getClass();
                return ngkVar;
            default:
                return ((Map.Entry) obj).getKey();
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        switch (this.f30789v) {
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
        switch (this.f30789v) {
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
}
