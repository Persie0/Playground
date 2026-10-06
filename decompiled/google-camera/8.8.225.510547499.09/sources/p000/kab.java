package p000;

import android.content.Context;
import android.database.Cursor;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kab implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f35442a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f35443b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f35444c;

    public kab(LottieAnimationView lottieAnimationView, String str, int i) {
        this.f35444c = i;
        this.f35442a = lottieAnimationView;
        this.f35443b = str;
    }

    public kab(kae kaeVar, jyt jytVar, int i) {
        this.f35444c = i;
        this.f35443b = kaeVar;
        this.f35442a = jytVar;
    }

    public kab(lxq lxqVar, apy apyVar, int i) {
        this.f35444c = i;
        this.f35443b = lxqVar;
        this.f35442a = apyVar;
    }

    public kab(maj majVar, apy apyVar, int i) {
        this.f35444c = i;
        this.f35443b = majVar;
        this.f35442a = apyVar;
    }

    public kab(maj majVar, lxm lxmVar, int i) {
        this.f35444c = i;
        this.f35443b = majVar;
        this.f35442a = lxmVar;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [aqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [aqv, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        nzw nzwVarM16194k = null;
        dValueOf = null;
        Double dValueOf = null;
        Long lValueOf = null;
        switch (this.f35444c) {
            case 0:
                synchronized (((kae) this.f35443b).f35459a) {
                    lku.m15613H(((kae) this.f35443b).f35462d == 1);
                    ((kae) this.f35443b).f35460b.mo5607t(new kaa(this));
                    ((kae) this.f35443b).f35460b.mo5585C();
                    Object obj = this.f35443b;
                    jyz jyzVar = ((kae) obj).f35461c;
                    if (jyzVar != null) {
                        jyzVar.mo5566b(((kae) obj).f35460b.mo5588a());
                    }
                    ((kae) this.f35443b).f35462d = 2;
                    break;
                }
                return null;
            case 1:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f35442a;
                if (!lottieAnimationView.f6457e) {
                    return bgp.m2420a(lottieAnimationView.getContext(), (String) this.f35443b, null);
                }
                Context context = lottieAnimationView.getContext();
                Object obj2 = this.f35443b;
                return bgp.m2420a(context, (String) obj2, "asset_".concat(String.valueOf(obj2)));
            case 2:
                Cursor cursorM409e = aey.m409e(((lxq) this.f35443b).f39526a, this.f35442a, false);
                try {
                    if (cursorM409e.moveToFirst()) {
                        if (!cursorM409e.isNull(0)) {
                            lValueOf = Long.valueOf(cursorM409e.getLong(0));
                        }
                        nzwVarM16194k = lyy.m16194k(lValueOf);
                        break;
                    }
                    return nzwVarM16194k;
                } finally {
                    cursorM409e.close();
                    ((apy) this.f35442a).m1850j();
                }
            case 3:
                Cursor cursorM409e2 = aey.m409e(((maj) this.f35443b).f39706a, this.f35442a, false);
                try {
                    if (cursorM409e2.moveToFirst() && !cursorM409e2.isNull(0)) {
                        dValueOf = Double.valueOf(cursorM409e2.getDouble(0));
                        break;
                    }
                    return dValueOf;
                } finally {
                    cursorM409e2.close();
                    ((apy) this.f35442a).m1850j();
                }
            default:
                ((maj) this.f35443b).f39706a.m1825m();
                try {
                    int iM1804a = ((maj) this.f35443b).f39707b.m1804a(this.f35442a);
                    ((maj) this.f35443b).f39706a.m1829q();
                    return Integer.valueOf(iM1804a);
                } finally {
                    ((maj) this.f35443b).f39706a.m1827o();
                }
        }
    }
}
