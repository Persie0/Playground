package p000;

import android.view.ViewGroup;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aeo {
    /* JADX INFO: renamed from: a */
    static int m355a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    /* JADX INFO: renamed from: b */
    public static int m356b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: c */
    public static int m357c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* JADX INFO: renamed from: d */
    public static void m358d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    /* JADX INFO: renamed from: e */
    static void m359e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: f */
    public static void m360f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m361g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    /* JADX INFO: renamed from: h */
    static boolean m362h(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    /* JADX INFO: renamed from: i */
    public static final Object m363i(apt aptVar, oni oniVar, ols olsVar) {
        apw apwVar = new apw(aptVar, oniVar, null);
        aqb aqbVar = (aqb) olsVar.mo18639d().get(aqb.f2106c);
        olu oluVar = aqbVar != null ? aqbVar.f2107a : null;
        return oluVar != null ? ook.m18774L(oluVar, apwVar, olsVar) : m364j(aptVar, olsVar.mo18639d(), apwVar, olsVar);
    }

    /* JADX INFO: renamed from: j */
    private static final Object m364j(apt aptVar, oly olyVar, onm onmVar, ols olsVar) {
        opy opyVar = new opy(omn.m18701f(olsVar), 1);
        opyVar.m18898x();
        try {
            aptVar.m1821i().execute(new apv(olyVar, opyVar, aptVar, onmVar, 0));
        } catch (RejectedExecutionException e) {
            opyVar.mo18876k(new IllegalStateException(WIxTIdUIdfb.QgqTX, e));
        }
        Object objM18887m = opyVar.m18887m();
        oma omaVar = oma.COROUTINE_SUSPENDED;
        return objM18887m;
    }
}
