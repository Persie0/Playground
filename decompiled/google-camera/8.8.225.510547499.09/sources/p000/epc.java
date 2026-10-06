package p000;

import android.content.Context;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import p021j$.util.Collection$EL;
import p021j$.util.stream.Collectors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epc extends hsw implements eqs {

    /* JADX INFO: renamed from: a */
    public final List f14948a;

    /* JADX INFO: renamed from: b */
    public eqz f14949b;

    /* JADX INFO: renamed from: c */
    public boolean f14950c;

    /* JADX INFO: renamed from: d */
    public eqz f14951d;

    /* JADX INFO: renamed from: e */
    public final jfs f14952e;

    /* JADX INFO: renamed from: i */
    private final dhv f14953i;

    /* JADX INFO: renamed from: j */
    private final kpb f14954j;

    /* JADX INFO: renamed from: k */
    private int f14955k;

    public epc(Context context, hst hstVar, jfs jfsVar, dhv dhvVar, kpb kpbVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(context, hstVar);
        this.f14950c = false;
        this.f14948a = new ArrayList();
        this.f14953i = dhvVar;
        this.f14952e = jfsVar;
        this.f14954j = kpbVar;
    }

    /* JADX INFO: renamed from: f */
    private static final void m7609f(bgv bgvVar, bgm bgmVar) {
        bgvVar.m2450q(bgmVar);
        bgvVar.m2448o(-1);
    }

    /* JADX INFO: renamed from: a */
    public final void m7610a() {
        if (this.f14951d != null) {
            List list = this.f14948a;
            nxl nxlVarM18137O = nkq.f43262e.m18137O();
            int i = this.f14955k;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkq nkqVar = (nkq) nxlVarM18137O.f44974b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            nkqVar.f43266c = i2;
            nkqVar.f43264a |= 2;
            eqz eqzVar = this.f14951d;
            eqzVar.getClass();
            int iOrdinal = eqzVar.ordinal();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            nkq nkqVar2 = (nkq) nxqVar;
            nkqVar2.f43264a |= 1;
            nkqVar2.f43265b = iOrdinal;
            hsv hsvVar = this.f29467h;
            int i3 = hsvVar != null ? hsvVar.f29462d : 0;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nkq nkqVar3 = (nkq) nxlVarM18137O.f44974b;
            nkqVar3.f43264a |= 4;
            nkqVar3.f43267d = i3;
            list.add((nkq) nxlVarM18137O.mo18103l());
        }
    }

    @Override // p000.eqs
    /* JADX INFO: renamed from: b */
    public final void mo7611b(eqz eqzVar, int i) {
        this.f14955k = i;
        this.f14951d = null;
        this.f14950c = false;
        this.f14948a.clear();
        Context context = this.f29466g;
        ArrayList arrayList = new ArrayList();
        bgv bgvVar = new bgv();
        Object obj = bgp.m2422c(context, true != this.f14954j.m14670j() ? C0100R.raw.action_phone_edu_animation : C0100R.raw.action_tablet_edu_animation).f3263a;
        obj.getClass();
        m7609f(bgvVar, (bgm) obj);
        bgv bgvVar2 = new bgv();
        Object obj2 = bgp.m2422c(context, true != this.f14954j.m14670j() ? C0100R.raw.long_exposure_phone_edu_animation : C0100R.raw.long_exposure_tablet_edu_animation).f3263a;
        obj2.getClass();
        m7609f(bgvVar2, (bgm) obj2);
        EnumMap enumMap = new EnumMap(eqz.class);
        enumMap.put(eqz.ACTION, epb.m7608a(eqz.ACTION, context.getString(C0100R.string.moblur_action_title), new hsu(context.getString(C0100R.string.moblur_action_title), context.getString(C0100R.string.moblur_action_edu_desc), mws.m17100o(ihk.m11331j(bgvVar), ihk.m11330i(context.getString(C0100R.string.moblur_action_url1)), ihk.m11330i(context.getString(C0100R.string.moblur_action_url2)), ihk.m11330i(context.getString(C0100R.string.moblur_action_url3))), context.getString(C0100R.string.moblur_action_edu_photo_acc), context.getString(C0100R.string.moblur_action_edu_animation_acc), context.getString(C0100R.string.moblur_regular))));
        eqz eqzVar2 = eqz.LANDSCAPE;
        enumMap.put(eqzVar2, epb.m7608a(eqzVar2, context.getString(C0100R.string.moblur_landscape_title), new hsu(context.getString(C0100R.string.moblur_landscape_title), context.getString(C0100R.string.moblur_landscape_edu_desc), mws.m17100o(ihk.m11331j(bgvVar2), ihk.m11330i(context.getString(C0100R.string.moblur_landscape_url1)), ihk.m11330i(context.getString(C0100R.string.moblur_landscape_url2)), ihk.m11330i(context.getString(C0100R.string.moblur_landscape_url3))), context.getString(C0100R.string.moblur_landscape_edu_photo_acc), context.getString(C0100R.string.moblur_landscape_edu_animation_acc), context.getString(C0100R.string.moblur_regular))));
        eqz eqzVarM7711a = eqz.m7711a(((Integer) this.f14953i.mo6173a(dik.f11606d).get()).intValue());
        if (enumMap.containsKey(eqzVarM7711a)) {
            epb epbVar = (epb) enumMap.remove(eqzVarM7711a);
            epbVar.getClass();
            arrayList.add(epbVar);
        }
        if (this.f14953i.mo6184l(dik.f11608f)) {
            arrayList.addAll(enumMap.values());
        }
        enumMap.clear();
        View viewM10720c = m10720c();
        ViewPager2 viewPager2M10721d = m10721d(viewM10720c, (List) Collection$EL.stream(arrayList).map(egh.f13939e).collect(Collectors.toList()), ((mzr) ((epb) arrayList.get(0)).f14947c.f29458d).f41859c, new eoz(this, bgvVar, bgvVar2), new eoy(arrayList, 0));
        if (Collection$EL.stream(arrayList).anyMatch(new dam(eqzVar, 8))) {
            this.f14949b = eqzVar;
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext() && !((epb) it.next()).f14945a.equals(eqzVar)) {
                i2++;
            }
            viewPager2M10721d.m1561d(i2, false);
        }
        viewM10720c.addOnAttachStateChangeListener(new epa(bgvVar2, bgvVar, viewM10720c));
        m10722e(2, viewM10720c, new AmbientMode.AmbientController(this));
    }
}
