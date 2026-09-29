package p000;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class gua implements View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public static final HashSet f41351e = new HashSet();

    /* JADX INFO: renamed from: a */
    public final View.OnClickListener f41352a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f41353b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f41354c;

    /* JADX INFO: renamed from: d */
    public final String f41355d;

    public gua(View view, View view2, String str) {
        this.f41352a = mta.m17038f(view);
        this.f41353b = new WeakReference(view2);
        this.f41354c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        this.f41355d = cl9.m4839V(lowerCase, "activity", "");
    }

    /* JADX INFO: renamed from: a */
    public final void m12867a() {
        gua guaVar;
        Set set = lp1.f49971a;
        if (set.contains(this)) {
            return;
        }
        try {
            View view = (View) this.f41353b.get();
            View view2 = (View) this.f41354c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strM14036d = in9.m14036d(view2);
                String strM17440b = ni7.m17440b(view2, strM14036d);
                if (strM17440b != null && !to2.m22254d(strM17440b, strM14036d)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", in9.m14035b(view, view2));
                    jSONObject.put("screenname", this.f41355d);
                    if (!set.contains(this)) {
                        try {
                            guaVar = this;
                            try {
                                sy2.m21768c().execute(new oc0((Object) jSONObject, strM14036d, (Object) guaVar, strM17440b, 5));
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    lp1.m16420a(guaVar, th);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            guaVar = this;
                        }
                    }
                }
                return;
            } catch (Exception unused) {
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            guaVar = this;
        }
        lp1.m16420a(guaVar, th);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            view.getClass();
            View.OnClickListener onClickListener = this.f41352a;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            m12867a();
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
