package p000;

import android.animation.ObjectAnimator;
import androidx.compose.runtime.internal.C0282a;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kob {

    /* JADX INFO: renamed from: a */
    public static final C0282a f47612a = new C0282a(-1352450422, false, new jd1(18));

    /* JADX INFO: renamed from: b */
    public static final C0282a f47613b = new C0282a(-711160570, false, new jd1(19));

    /* JADX INFO: renamed from: c */
    public static final C0282a f47614c = new C0282a(-2011516503, false, new jd1(20));

    /* JADX INFO: renamed from: d */
    public static final C0282a f47615d = new C0282a(-1370226651, false, new jd1(21));

    /* JADX INFO: renamed from: e */
    public static final C0282a f47616e = new C0282a(-430610993, false, new jd1(22));

    /* JADX INFO: renamed from: f */
    public static final C0282a f47617f = new C0282a(646695243, false, new jd1(23));

    /* JADX INFO: renamed from: g */
    public static final C0282a f47618g = new C0282a(965318631, false, new jd1(24));

    /* JADX INFO: renamed from: h */
    public static final C0282a f47619h = new C0282a(1606608483, false, new jd1(25));

    /* JADX INFO: renamed from: i */
    public static final C0282a f47620i = new C0282a(-1089677074, false, new jd1(26));

    /* JADX INFO: renamed from: j */
    public static final C0282a f47621j = new C0282a(-12370838, false, new jd1(27));

    /* JADX INFO: renamed from: a */
    public static ObjectAnimator m15344a(MaterialCardView materialCardView, int i) {
        materialCardView.getClass();
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(materialCardView, "backgroundColor", ya1.m25016i(i, 50));
        objectAnimatorOfArgb.setDuration(600L);
        objectAnimatorOfArgb.addUpdateListener(new yq5(materialCardView, 1));
        return objectAnimatorOfArgb;
    }

    /* JADX INFO: renamed from: b */
    public static ObjectAnimator m15345b(MaterialCardView materialCardView, int i) {
        materialCardView.getClass();
        ObjectAnimator objectAnimatorOfArgb = ObjectAnimator.ofArgb(materialCardView, "strokeColor", i);
        objectAnimatorOfArgb.setDuration(600L);
        objectAnimatorOfArgb.addUpdateListener(new yq5(materialCardView, 0));
        return objectAnimatorOfArgb;
    }
}
