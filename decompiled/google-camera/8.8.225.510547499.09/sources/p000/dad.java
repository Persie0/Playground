package p000;

import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dad extends iax {

    /* JADX INFO: renamed from: a */
    public final Context f10230a;

    /* JADX INFO: renamed from: b */
    public final hqo f10231b;

    /* JADX INFO: renamed from: c */
    public final jww f10232c;

    /* JADX INFO: renamed from: d */
    public final jww f10233d;

    /* JADX INFO: renamed from: e */
    public final String f10234e;

    /* JADX INFO: renamed from: f */
    public final String f10235f;

    /* JADX INFO: renamed from: g */
    public final dhv f10236g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f10237h;

    /* JADX INFO: renamed from: i */
    public final jwf f10238i;

    public dad(Context context, hqo hqoVar, jwf jwfVar, jww jwwVar, jww jwwVar2, dhv dhvVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f10237h = linkedHashMap;
        this.f10230a = context;
        this.f10231b = hqoVar;
        this.f10238i = jwfVar;
        this.f10232c = jwwVar;
        this.f10233d = jwwVar2;
        this.f10236g = dhvVar;
        iay iayVar = new iay((Object) ikw.SLOW_MOTION, iku.m11410b(ikw.SLOW_MOTION).m11414d(context.getResources()), iku.m11410b(ikw.SLOW_MOTION).m11413c(context.getResources()), false);
        iay iayVar2 = new iay(ikw.VIDEO, context.getString(C0100R.string.video_mode_title), context.getString(C0100R.string.accessibility_video_mode_desc));
        ikw ikwVar = ikw.TIME_LAPSE;
        iay iayVar3 = new iay(ikwVar, iku.m11410b(ikwVar).m11414d(context.getResources()), iku.m11410b(ikw.TIME_LAPSE).m11413c(context.getResources()));
        if (dhvVar.mo6184l(dib.f11262aV)) {
            this.f30188j.add(iayVar);
        }
        this.f30188j.add(iayVar2);
        this.f30188j.add(iayVar3);
        linkedHashMap.put(ikw.SLOW_MOTION, iayVar);
        linkedHashMap.put(ikw.VIDEO, iayVar2);
        linkedHashMap.put(ikw.TIME_LAPSE, iayVar3);
        this.f10234e = context.getString(C0100R.string.hfr_record_speed, 1, 4);
        this.f10235f = context.getString(C0100R.string.hfr_record_speed, 1, 8);
    }

    /* JADX INFO: renamed from: a */
    public final void m5802a(ikw ikwVar) {
        if (!this.f10237h.containsKey(ikwVar)) {
            throw new IllegalArgumentException("Unsupported mode: ".concat(String.valueOf(String.valueOf(ikwVar))));
        }
    }
}
