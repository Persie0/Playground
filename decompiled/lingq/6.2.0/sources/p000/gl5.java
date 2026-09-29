package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gl5 {

    /* JADX INFO: renamed from: c */
    public HashMap f40959c;

    /* JADX INFO: renamed from: d */
    public HashMap f40960d;

    /* JADX INFO: renamed from: e */
    public float f40961e;

    /* JADX INFO: renamed from: f */
    public HashMap f40962f;

    /* JADX INFO: renamed from: g */
    public ArrayList f40963g;

    /* JADX INFO: renamed from: h */
    public pe9 f40964h;

    /* JADX INFO: renamed from: i */
    public tk5 f40965i;

    /* JADX INFO: renamed from: j */
    public ArrayList f40966j;

    /* JADX INFO: renamed from: k */
    public Rect f40967k;

    /* JADX INFO: renamed from: l */
    public float f40968l;

    /* JADX INFO: renamed from: m */
    public float f40969m;

    /* JADX INFO: renamed from: n */
    public float f40970n;

    /* JADX INFO: renamed from: o */
    public boolean f40971o;

    /* JADX INFO: renamed from: a */
    public final d77 f40957a = new d77();

    /* JADX INFO: renamed from: b */
    public final HashSet f40958b = new HashSet();

    /* JADX INFO: renamed from: p */
    public int f40972p = 0;

    /* JADX INFO: renamed from: a */
    public final void m12727a(String str) {
        tj5.m22151c(str);
        this.f40958b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final Rect m12728b() {
        return this.f40967k;
    }

    /* JADX INFO: renamed from: c */
    public final float m12729c() {
        return (long) (((this.f40969m - this.f40968l) / this.f40970n) * 1000.0f);
    }

    /* JADX INFO: renamed from: d */
    public final Map m12730d() {
        return this.f40962f;
    }

    /* JADX INFO: renamed from: e */
    public final float m12731e() {
        return this.f40970n;
    }

    /* JADX INFO: renamed from: f */
    public final Map m12732f() {
        float fM11957c = fna.m11957c();
        if (fM11957c != this.f40961e) {
            for (Map.Entry entry : this.f40960d.entrySet()) {
                HashMap map = this.f40960d;
                String str = (String) entry.getKey();
                wl5 wl5Var = (wl5) entry.getValue();
                float f = this.f40961e / fM11957c;
                int i = (int) (wl5Var.f67007a * f);
                int i2 = (int) (wl5Var.f67008b * f);
                wl5 wl5Var2 = new wl5(i, i2, wl5Var.f67009c, wl5Var.f67010d, wl5Var.f67011e);
                Bitmap bitmap = wl5Var.f67012f;
                if (bitmap != null) {
                    wl5Var2.f67012f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, wl5Var2);
            }
        }
        this.f40961e = fM11957c;
        return this.f40960d;
    }

    /* JADX INFO: renamed from: g */
    public final gq5 m12733g(String str) {
        int size = this.f40963g.size();
        for (int i = 0; i < size; i++) {
            gq5 gq5Var = (gq5) this.f40963g.get(i);
            String str2 = gq5Var.f41186a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return gq5Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m12734h() {
        return !this.f40960d.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f40966j.iterator();
        while (it.hasNext()) {
            sb.append(((tp4) it.next()).m22263a("\t"));
        }
        return sb.toString();
    }
}
