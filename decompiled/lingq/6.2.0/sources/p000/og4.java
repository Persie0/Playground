package p000;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class og4 {

    /* JADX INFO: renamed from: a */
    public static final p33 f54318a = p33.m18864S("x", "y");

    /* JADX INFO: renamed from: a */
    public static int m17977a(AbstractC0875a abstractC0875a) {
        abstractC0875a.mo5037a();
        int iMo5044r = (int) (abstractC0875a.mo5044r() * 255.0d);
        int iMo5044r2 = (int) (abstractC0875a.mo5044r() * 255.0d);
        int iMo5044r3 = (int) (abstractC0875a.mo5044r() * 255.0d);
        while (abstractC0875a.mo5042p()) {
            abstractC0875a.mo5035R();
        }
        abstractC0875a.mo5039c();
        return Color.argb(255, iMo5044r, iMo5044r2, iMo5044r3);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m17978b(AbstractC0875a abstractC0875a, float f) {
        int i = ng4.f52705a[abstractC0875a.mo5047z().ordinal()];
        if (i == 1) {
            float fMo5044r = (float) abstractC0875a.mo5044r();
            float fMo5044r2 = (float) abstractC0875a.mo5044r();
            while (abstractC0875a.mo5042p()) {
                abstractC0875a.mo5035R();
            }
            return new PointF(fMo5044r * f, fMo5044r2 * f);
        }
        if (i == 2) {
            abstractC0875a.mo5037a();
            float fMo5044r3 = (float) abstractC0875a.mo5044r();
            float fMo5044r4 = (float) abstractC0875a.mo5044r();
            while (abstractC0875a.mo5047z() != JsonReader$Token.END_ARRAY) {
                abstractC0875a.mo5035R();
            }
            abstractC0875a.mo5039c();
            return new PointF(fMo5044r3 * f, fMo5044r4 * f);
        }
        if (i != 3) {
            C3386nv.m17625k(abstractC0875a.mo5047z(), "Unknown point starts with ");
            return null;
        }
        abstractC0875a.mo5038b();
        float fM17980d = 0.0f;
        float fM17980d2 = 0.0f;
        while (abstractC0875a.mo5042p()) {
            int iMo5033J = abstractC0875a.mo5033J(f54318a);
            if (iMo5033J == 0) {
                fM17980d = m17980d(abstractC0875a);
            } else if (iMo5033J != 1) {
                abstractC0875a.mo5034N();
                abstractC0875a.mo5035R();
            } else {
                fM17980d2 = m17980d(abstractC0875a);
            }
        }
        abstractC0875a.mo5040e();
        return new PointF(fM17980d * f, fM17980d2 * f);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m17979c(AbstractC0875a abstractC0875a, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC0875a.mo5037a();
        while (abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_ARRAY) {
            abstractC0875a.mo5037a();
            arrayList.add(m17978b(abstractC0875a, f));
            abstractC0875a.mo5039c();
        }
        abstractC0875a.mo5039c();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static float m17980d(AbstractC0875a abstractC0875a) {
        JsonReader$Token jsonReader$TokenMo5047z = abstractC0875a.mo5047z();
        int i = ng4.f52705a[jsonReader$TokenMo5047z.ordinal()];
        if (i == 1) {
            return (float) abstractC0875a.mo5044r();
        }
        if (i != 2) {
            v63.m23142t(jsonReader$TokenMo5047z, "Unknown value for token of type ");
            return 0.0f;
        }
        abstractC0875a.mo5037a();
        float fMo5044r = (float) abstractC0875a.mo5044r();
        while (abstractC0875a.mo5042p()) {
            abstractC0875a.mo5035R();
        }
        abstractC0875a.mo5039c();
        return fMo5044r;
    }
}
